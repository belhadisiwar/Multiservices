package com.example.demo.controller;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Admin;
import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepositories;
import com.example.demo.services.UserServices;
//import com.examle.demo.config.JwtTokenUtil;

@RestController
@RequestMapping("/user")
public class UserConrtoller {
	@Autowired
	UserServices userrepositories;
	

 @RequestMapping(value = "/ajout", method = RequestMethod.POST)
public void  adduser(@RequestBody User user) {
	userrepositories.AjouterUser(user);
 }
 @RequestMapping(value="/ajoutadmin", method = RequestMethod.POST)
 public void addadmin(@RequestBody User admin) {
	 userrepositories.AjouterAdmin(admin);
 }
 }
