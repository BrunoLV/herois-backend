package com.valhala.herois.services.HeroisService.v1;

import java.util.ResourceBundle;

public class HeroisServiceProxy implements com.valhala.herois.services.HeroisService.v1.HeroisService_PortType {
    private String _endpoint = null;
    private com.valhala.herois.services.HeroisService.v1.HeroisService_PortType heroisService_PortType = null;

    public HeroisServiceProxy() {
        _initHeroisServiceProxy();
    }

    public HeroisServiceProxy(String endpoint) {
        _endpoint = endpoint;
        _initHeroisServiceProxy();
    }

    private void _initHeroisServiceProxy() {
        try {
            heroisService_PortType = (new com.valhala.herois.services.HeroisService.v1.HeroisService_ServiceLocator()).getHeroisServiceSOAP();
            if (heroisService_PortType != null) {
                if (_endpoint != null)
                    ((javax.xml.rpc.Stub) heroisService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
                else
                    _endpoint = (String) ((javax.xml.rpc.Stub) heroisService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
            }

        } catch (javax.xml.rpc.ServiceException serviceException) {
        }
    }

    public String getEndpoint() {
        return _endpoint;
    }

    public void setEndpoint(String endpoint) {
        _endpoint = endpoint;
        if (heroisService_PortType != null)
            ((javax.xml.rpc.Stub) heroisService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);

    }

    public com.valhala.herois.services.HeroisService.v1.HeroisService_PortType getHeroisService_PortType() {
        if (heroisService_PortType == null)
            _initHeroisServiceProxy();
        return heroisService_PortType;
    }

    public com.valhala.heroi.domain.v1.Heroi[] listarHerois() throws java.rmi.RemoteException {
        if (heroisService_PortType == null)
            _initHeroisServiceProxy();
        return heroisService_PortType.listarHerois();
    }

    public void incluirHeroi(com.valhala.heroi.domain.v1.Heroi heroi) throws java.rmi.RemoteException {
        if (heroisService_PortType == null)
            _initHeroisServiceProxy();
        heroisService_PortType.incluirHeroi(heroi);
    }

    public void editarHeroi(com.valhala.heroi.domain.v1.Heroi heroi) throws java.rmi.RemoteException {
        if (heroisService_PortType == null)
            _initHeroisServiceProxy();
        heroisService_PortType.editarHeroi(heroi);
    }

    public void deletarHeroi(long codigo) throws java.rmi.RemoteException {
        if (heroisService_PortType == null)
            _initHeroisServiceProxy();
        heroisService_PortType.deletarHeroi(codigo);
    }


}