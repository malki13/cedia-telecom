package com.telecom.administracionservice.empresa.data.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
@Entity
@Table(name = "tb_Empresas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Empresa implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_iden")
    private Integer iden;

    @Column(name = "emp_num_gateways", nullable = false)
    private Integer numGateways;

    @Column(name = "emp_num_devices", nullable = false)
    private Integer numDevices;

    @Column(name = "emp_fecr", nullable = false, columnDefinition= "TIMESTAMP WITH TIME ZONE")
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column(name = "emp_feac", columnDefinition= "TIMESTAMP WITH TIME ZONE")
    private LocalDateTime updatedAt;

    @Column(name = "emp_feeli", columnDefinition= "TIMESTAMP WITH TIME ZONE")
    private LocalDateTime deletedAt;


}
