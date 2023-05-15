package com.pragma.powerup.usermicroservice.domain.Service;

import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

@Service
public class ValidacionesUser implements  ValidacionUser{

    @Override
    public boolean validarEdad(Date edad) {
        SimpleDateFormat getYearFormat = new SimpleDateFormat("yyyy");
        String currentYear = getYearFormat.format(edad);
        Date date = new Date();
        String yearCurse = getYearFormat.format(date);
        int year = Integer.parseInt(yearCurse)-Integer.parseInt(currentYear);
        if (year >= 18 ){
        return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean validarTelefono(String telefono) {
        String patron = "^\\+[0-9]{1,13}$";
        // Verificar si el número de teléfono cumple con el patrón
        boolean esValido = Pattern.matches(patron, telefono);
        return esValido;
    }

    @Override
    public boolean validarDni(String dNi) {
        String patron = "^[0-9]{10}$";
        // Verificar si la cadena cumple con el patrón
        boolean esValida = Pattern.matches(patron, dNi);
        return esValida;
    }
}


