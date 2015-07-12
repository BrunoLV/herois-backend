/**
 * HeroisService_PortType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.valhala.herois.services.HeroisService.v1;

public interface HeroisService_PortType extends java.rmi.Remote {
    public com.valhala.heroi.domain.v1.Heroi[] listarHerois() throws java.rmi.RemoteException;

    public void incluirHeroi(com.valhala.heroi.domain.v1.Heroi heroi) throws java.rmi.RemoteException;

    public void editarHeroi(com.valhala.heroi.domain.v1.Heroi heroi) throws java.rmi.RemoteException;

    public void deletarHeroi(long codigo) throws java.rmi.RemoteException;
}
