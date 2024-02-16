package com.telecom.gestionservice.gateway.repository;

import com.telecom.gestionservice.gateway.data.entity.Gateway;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GatewayCrudRepository extends JpaRepository<Gateway,Integer> {
    Optional<Gateway> findByIdGateway(String idGateway);
    Integer countByIdEmpresa(Integer idEmpresa);
}
