package com.telecom.gestionservice.gateway.data.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_Gateways")
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class Gateway implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gat_iden", nullable = false)
    private Integer iden;

    @Column(name = "gat_nomb", nullable = false, length = 150)
//    @NotBlank(message = "El nombre del gateway es requerido")
    private String nombre;

    @Column(name = "gat_desc", length = 150)
    private String descripcion;

    @Column(name = "gat_id", nullable = false, length = 70, unique = true)
    private String idGateway;

    @Column(name = "gat_network_server_id", nullable = false)
    private String idNetworkServer;

    @Column(name = "gat_altitude")
    private Double altitude;

    @Column(name = "gat_latitude")
    private Double latitude;

    @Column(name = "gat_longitude")
    private Double longitude;

    @Column(name = "gat_fecr", columnDefinition= "TIMESTAMP WITH TIME ZONE")
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column(name = "gat_feac", columnDefinition= "TIMESTAMP WITH TIME ZONE")
    private LocalDateTime updatedAt;

    @Column(name = "gat_feeli", columnDefinition= "TIMESTAMP WITH TIME ZONE")
    private LocalDateTime deletedAt;

    @Column(name = "gat_emp_id")
    private Integer idEmpresa;

    public Gateway() {
    }

    public Gateway(Integer iden, String nombre, String descripcion, String idGateway, String idNetworkServer, Double altitude, Double latitude, Double longitude, LocalDateTime createdAt, LocalDateTime updatedAt, LocalDateTime deletedAt, Integer idEmpresa) {
        this.iden = iden;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.idGateway = idGateway;
        this.idNetworkServer = idNetworkServer;
        this.altitude = altitude;
        this.latitude = latitude;
        this.longitude = longitude;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
        this.idEmpresa = idEmpresa;
    }

    public Integer getIden() {
        return iden;
    }

    public void setIden(Integer iden) {
        this.iden = iden;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIdGateway() {
        return idGateway;
    }

    public void setIdGateway(String idGateway) {
        this.idGateway = idGateway;
    }

    public String getIdNetworkServer() {
        return idNetworkServer;
    }

    public void setIdNetworkServer(String idNetworkServer) {
        this.idNetworkServer = idNetworkServer;
    }

    public Double getAltitude() {
        return altitude;
    }

    public void setAltitude(Double altitude) {
        this.altitude = altitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LocalDateTime getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(LocalDateTime deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
}
