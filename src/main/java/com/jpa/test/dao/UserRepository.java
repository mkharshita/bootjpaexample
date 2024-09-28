package com.jpa.test.dao;

import com.jpa.test.entities.User;

import java.util.Collection;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {
	public List<User> findByName(String name);
	
	public List<User> findByNameAndCity(String name, String city);
	
	public List<User> findByStatusContaining(String words);
	
	public List<User> findByStatusStartingWith(String prefix);
	
	public List<User> findByStatusEndingWith(String suffix);
	
	public List<User> findByStatusLike(String likePattern);
	
//	public List<User> findByAgeLessThan(String age);
//	
//	public List<User> findByAgeGreaterThanEqual(String age);
//	
//	public List<User> findByAgeIn(Collection<Integer> ages);
//	
//	public List<User> findByNameOrderByName(String name);

}
