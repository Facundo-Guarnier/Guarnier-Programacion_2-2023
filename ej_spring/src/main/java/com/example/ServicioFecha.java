package com.example;


import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class ServicioFecha {
    public Date fechaHoy() {
        return new Date();
    }
}
