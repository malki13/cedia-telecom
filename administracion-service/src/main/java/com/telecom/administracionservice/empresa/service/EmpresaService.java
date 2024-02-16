package com.telecom.administracionservice.empresa.service;

import com.telecom.administracionservice.empresa.data.dto.EmpresaDTO;
import com.telecom.administracionservice.empresa.data.entity.Empresa;
import com.telecom.administracionservice.empresa.data.read.EmpresaRead;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface EmpresaService {
    Page<EmpresaRead> findAll(Pageable pageable);

    Optional<EmpresaRead> getOne(Integer empresaId);

    EmpresaRead save(Integer interventorId, EmpresaDTO empresaDTO);

    boolean delete(Integer empresaId);

}
