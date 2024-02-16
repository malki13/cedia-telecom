package com.telecom.gestionservice.feign.data.model;

public class Empresa {
    private Integer iden;
    private Integer numGateways;
    private Integer numDevices;

    public Empresa() {
    }

    public Empresa(Integer iden, Integer numGateways, Integer numDevices) {
        this.iden = iden;
        this.numGateways = numGateways;
        this.numDevices = numDevices;
    }

    public Integer getIden() {
        return iden;
    }

    public void setIden(Integer iden) {
        this.iden = iden;
    }

    public Integer getNumGateways() {
        return numGateways;
    }

    public void setNumGateways(Integer numGateways) {
        this.numGateways = numGateways;
    }

    public Integer getNumDevices() {
        return numDevices;
    }

    public void setNumDevices(Integer numDevices) {
        this.numDevices = numDevices;
    }
}
