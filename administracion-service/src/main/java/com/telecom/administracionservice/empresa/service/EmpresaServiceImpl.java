package com.telecom.administracionservice.empresa.service;

import com.telecom.administracionservice.empresa.data.dto.EmpresaDTO;
import com.telecom.administracionservice.empresa.data.entity.Empresa;
import com.telecom.administracionservice.empresa.data.read.EmpresaRead;
import com.telecom.administracionservice.empresa.mapper.EmpresaMapper;
import com.telecom.administracionservice.empresa.repository.EmpresaCrudRepository;
import com.telecom.administracionservice.response.error.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmpresaServiceImpl implements EmpresaService {
    @Autowired
    private EmpresaCrudRepository empresaCrudRepository;
    @Autowired
    private EmpresaMapper empresaMapper;
    @Override
    public Page<EmpresaRead> findAll(Pageable pageable) {
        return empresaCrudRepository.findAll(pageable).map(empresa -> empresaMapper.toEmpresaRead(empresa));
    }

    @Override
    public Optional<EmpresaRead> getOne(Integer empresaId) {
        Optional<Empresa> empresaDB = empresaCrudRepository.findById(empresaId);
        if (empresaId == 0) {
            throw new BadRequestException("El id de la empresa debe ser diferente 0");
        }
        if (empresaDB.isPresent()) {
            return empresaDB.map(empresa -> empresaMapper.toEmpresaRead(empresa));
        }
        throw new BadRequestException("Empresa con id " + empresaId + " no encontrada");
    }

    @Override
    public EmpresaRead save(Integer interventorId, EmpresaDTO empresaDTO) {
        Empresa empresa = empresaMapper.toEmpresa(empresaDTO);
        return empresaMapper.toEmpresaRead(empresaCrudRepository.save(empresa));
    }

    @Override
    public boolean delete(Integer empresaId) {
        try {
            Optional<Empresa> empresaDB = empresaCrudRepository.findById(empresaId);
            if (empresaDB.isPresent()) {
                empresaCrudRepository.deleteById(empresaId);
                return true;
            }
            throw new BadRequestException("Empresa con id " + empresaId + " no encontrada para eliminar");
        } catch (Exception exception){
            throw new BadRequestException("La empresa que intenta eliminar cuenta con gateways, usuarios, clientes, etc. Previo a esto, para que " +
                    "el proceso de eliminación sea exitoso la empresa no debe tener gateways, usuarios, clientes, etc. Relacionados con esta empresa.");
        }
    }
}
