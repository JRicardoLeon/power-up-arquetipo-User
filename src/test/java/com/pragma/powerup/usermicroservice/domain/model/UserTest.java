package com.pragma.powerup.usermicroservice.domain.model;

import com.pragma.powerup.usermicroservice.adapters.driven.jpa.mysql.repositories.IRoleRepository;
import com.pragma.powerup.usermicroservice.adapters.driven.jpa.mysql.repositories.IUserRepository;
import com.pragma.powerup.usermicroservice.domain.api.IUserServicePort;
import com.pragma.powerup.usermicroservice.domain.usecase.UserUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class UserTest {

    @Mock
    private IUserServicePort userRepository;

    @Mock
    private IRoleRepository roleRepository;
    @InjectMocks
    private UserUseCase userService;
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }
    @Test

    void saveUser(){
        Role rol = new Role(1L,"ADMIN","ADMIN");
        User user = new User(1L,"RICK","LEON","105085607","+573228530790",new Date(1996-10-29),"rick@gmail.com","1234",rol);
        // Mockear el comportamiento de los repositorios

        //Assertions.assertNotNull(userRepository.saveUser(user));
    }


}