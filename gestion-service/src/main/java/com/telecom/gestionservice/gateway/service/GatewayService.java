package com.telecom.gestionservice.gateway.service;

import com.telecom.gestionservice.gateway.data.dto.GatewayDTO;
import com.telecom.gestionservice.gateway.data.info.GatewayInfo;
import com.telecom.gestionservice.gateway.data.read.GatewayRead;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface GatewayService {
    Page<GatewayInfo> findAll(Pageable pageable);

    Optional<GatewayRead> getOne(Integer id);

    GatewayRead save(Integer empresaId, GatewayDTO gatewayDTO);

    boolean delete(Integer id);

    GatewayRead update(Integer empresaId, GatewayDTO gatewayDTO, Integer id);
}
