package com.jpa.test;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
//		User user = new User();
//		user.setName("Harshita");
//		user.setCity("Bangalore");
//		user.setStatus("java Developer");
//		User daoUser = userRepository.save(user);
//		System.out.println(daoUser);
		
//		User user1 = new User();
//		user1.setName("Akshat");
//		user1.setCity("Noida");
//		user1.setStatus("Golang Developer");
//		
//		
//		User user2 = new User();
//		user2.setName("Shruti");
//		user2.setCity("Delhi");
//		user2.setStatus("DevOps");
//		
//		List<User> users = List.of(user1,user2);
//		Iterable<User> iUsers = userRepository.saveAll(users);
//		
//		iUsers.forEach(user -> System.out.println(user));
		
		//Update - User data
//		Optional<User> optional = userRepository.findById(1);
//		User user = optional.get();
//		user.setStatus("Backend Developer");
//		User result= userRepository.save(user);
//		
//		System.out.println(result);
		
		
		//Get Data
//		Iterable<User> iUsers = userRepository.findAll();
//		
//		iUsers.forEach(user -> System.out.println(user));
		
		
		//Deleting
		userRepository.deleteById(3);
		System.out.println("Deleted");
		
		
		
	}

}
