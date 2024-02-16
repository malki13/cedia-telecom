package com.telecom.administracionservice.empresa.mapper;

import com.telecom.administracionservice.empresa.data.dto.EmpresaDTO;
import com.telecom.administracionservice.empresa.data.entity.Empresa;
import com.telecom.administracionservice.empresa.data.read.EmpresaRead;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface EmpresaMapper {
    @Mappings({
            @Mapping(source = "iden", target = "iden"),
            @Mapping(source = "numGateways", target = "numGateways"),
            @Mapping(source = "numDevices", target = "numDevices")
    })
    EmpresaRead toEmpresaRead(Empresa empresa);
    @InheritInverseConfiguration
    @Mappings({
//            @Mapping(target = "interventor", ignore = true),
            @Mapping(target = "createdAt", ignore = true),
            @Mapping(target = "updatedAt", ignore = true),
            @Mapping(target = "deletedAt", ignore = true),
    })
    Empresa toEmpresa(EmpresaDTO empresaDTO);
}
