package com.pragma.powerup.usermicroservice.domain.Service;

import java.util.Date;

public interface ValidacionUser {
    boolean validarEdad(Date edad);
    boolean validarTelefono(String tele);
    boolean validarDni(String dNi);
}
