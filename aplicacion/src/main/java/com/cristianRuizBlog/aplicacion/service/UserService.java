package com.cristianRuizBlog.aplicacion.service;


import com.cristianRuizBlog.aplicacion.entity.User;

public interface UserService {
	
	public Iterable<User> getAllUsers();

	public User createUser( User user) throws Exception;

}
