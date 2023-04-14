package com.example.prueba.service.impl;

import com.example.prueba.entity.Transaccion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransaccionDaoImpl implements TransaccionDao{

    @Autowired
    public TransaccionDaoImpl() {

    }

    @Override
    public void registrarTransaccion(Transaccion request) {

    }

    @Override
    public String modificarTransaccion(Transaccion request) {
        return "null";
    }
}
