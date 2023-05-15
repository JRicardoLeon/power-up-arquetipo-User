package com.pragma.powerup.usermicroservice.domain.usecase;

import com.pragma.powerup.usermicroservice.adapters.driven.jpa.mysql.exceptions.UserInvaliDni;
import com.pragma.powerup.usermicroservice.adapters.driven.jpa.mysql.exceptions.UserInvaliPhone;
import com.pragma.powerup.usermicroservice.adapters.driven.jpa.mysql.exceptions.UserInvalidAge;
import com.pragma.powerup.usermicroservice.domain.Service.ValidacionUser;
import com.pragma.powerup.usermicroservice.domain.Service.ValidacionesUser;
import com.pragma.powerup.usermicroservice.domain.api.IUserServicePort;
import com.pragma.powerup.usermicroservice.domain.model.User;
import com.pragma.powerup.usermicroservice.domain.spi.IUserPersistencePort;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserUseCase implements IUserServicePort {
    private final IUserPersistencePort userPersistencePort;

  
    public UserUseCase(IUserPersistencePort userPersistencePort) {
        this.userPersistencePort = userPersistencePort;


    }

    @Override
    public void saveUser(User user) {
       
        userPersistencePort.saveUser(user);

    }

    @Override
    public void deleteUser(User user) {
        userPersistencePort.deleteUser(user);
    }

    @Override
    public List<User> getAllProviders(int page) {
        return userPersistencePort.getAllProviders(page);
    }

}
