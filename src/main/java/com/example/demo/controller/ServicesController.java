package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entities.Services;
import com.example.demo.repositories.ServicesRepositories;

public class ServicesController {
@Autowired
ServicesRepositories servicesrepositories;
//@RequestMapping(value = "/ajout", method = RequestMethod.POST)
//public void addservices(@RequestBody services services) {
	//servicesrepositories.save(services);

}
