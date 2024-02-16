package com.telecom.gestionservice.gateway.data.read;

public class GatewayRead {
    private Integer iden;
    private String nombre;
    private String descripcion;
    private String idGateway;
    private String idNetworkServer;
    private Double altitude;
    private Double latitude;
    private Double longitude;
    private Integer idEmpresa;

    public GatewayRead() {
    }

    public GatewayRead(Integer iden, String nombre, String descripcion, String idGateway, String idNetworkServer, Double altitude, Double latitude, Double longitude, Integer idEmpresa) {
        this.iden = iden;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.idGateway = idGateway;
        this.idNetworkServer = idNetworkServer;
        this.altitude = altitude;
        this.latitude = latitude;
        this.longitude = longitude;
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

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
}
