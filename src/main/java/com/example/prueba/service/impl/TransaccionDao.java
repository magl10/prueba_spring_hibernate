package com.example.prueba.service.impl;

import com.example.prueba.entity.Transaccion;

public interface TransaccionDao {

    void registrarTransaccion(Transaccion request);

    String modificarTransaccion(Transaccion request);

}
