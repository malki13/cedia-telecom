package com.telecom.gestionservice.gateway.mapper;

import com.telecom.gestionservice.gateway.data.dto.GatewayDTO;
import com.telecom.gestionservice.gateway.data.entity.Gateway;
import com.telecom.gestionservice.gateway.data.info.GatewayInfo;
import com.telecom.gestionservice.gateway.data.read.GatewayRead;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface GatewayMapper {
    @Mappings({
            @Mapping(source = "iden", target = "iden"),
            @Mapping(source = "nombre", target = "nombre"),
            @Mapping(source = "descripcion", target = "descripcion"),
            @Mapping(source = "idGateway", target = "idGateway"),
            @Mapping(source = "idNetworkServer", target = "idNetworkServer"),
            @Mapping(source = "altitude", target = "altitude"),
            @Mapping(source = "latitude", target = "latitude"),
            @Mapping(source = "longitude", target = "longitude"),
            @Mapping(source = "idEmpresa", target = "idEmpresa"),
            //@Mapping(target = "empresa", ignore = true),
    })
    GatewayRead toGatewayRead(Gateway gateway);
    @Mappings({
            @Mapping(source = "iden", target = "iden"),
            @Mapping(source = "nombre", target = "nombre"),
            @Mapping(source = "descripcion", target = "descripcion"),
            @Mapping(source = "idGateway", target = "idGateway"),
            @Mapping(source = "idNetworkServer", target = "idNetworkServer"),
            @Mapping(source = "altitude", target = "altitude"),
            @Mapping(source = "latitude", target = "latitude"),
            @Mapping(source = "longitude", target = "longitude"),
    })
    GatewayInfo toGatewayInfo(Gateway gateway);
    @InheritInverseConfiguration
    @Mappings({
//            @Mapping(target = "empresa", ignore = true),
            @Mapping(target = "createdAt", ignore = true),
            @Mapping(target = "updatedAt", ignore = true),
            @Mapping(target = "deletedAt", ignore = true),
    })
    Gateway toGateway(GatewayDTO gatewayDTO);
}
