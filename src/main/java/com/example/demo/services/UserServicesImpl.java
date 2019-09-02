package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Admin;
import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepositories;

@Service("userServices")
public class UserServicesImpl implements UserServices{
@Autowired
UserRepositories userrepository;


@Override
	public void AjouterUser(User user) {
		userrepository.save(user);
		}


@Override
public void AjouterClient(User client) {
	// TODO Auto-generated method stub
	userrepository.save(client);

}


@Override
public void AjouteroUVRIER(User ouvrier) {
	// TODO Auto-generated method stub
	userrepository.save(ouvrier);

}
@Override
public void AjouterAdmin(User admin) {
	// TODO Auto-generated method stub
	userrepository.save(admin);

}

}
