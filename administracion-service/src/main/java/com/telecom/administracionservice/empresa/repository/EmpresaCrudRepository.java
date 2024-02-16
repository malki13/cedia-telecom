package com.telecom.administracionservice.empresa.repository;

import com.telecom.administracionservice.empresa.data.entity.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaCrudRepository extends JpaRepository<Empresa,Integer> {
}
