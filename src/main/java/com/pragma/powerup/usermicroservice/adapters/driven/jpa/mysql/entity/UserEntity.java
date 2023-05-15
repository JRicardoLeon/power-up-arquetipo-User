package com.pragma.powerup.usermicroservice.adapters.driven.jpa.mysql.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    @Digits(integer = 10, fraction = 0, message = "El documento debe ser numerico y con una longitud de 10 numeros")
    private String dniNumber;
    @Pattern(regexp = "\\+\\d{12}", message = "El telefono debe comnzar con el signo + y 10 digitos")
    private String phone;
    private Date birthDate;
    @Email(message = "Email no valido")
    private String mail;
    private String password;
    @ManyToOne
    @JoinColumn(name = "id_role")
    private RoleEntity roleEntity;

}
