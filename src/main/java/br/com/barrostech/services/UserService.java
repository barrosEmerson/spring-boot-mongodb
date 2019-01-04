package br.com.barrostech.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.barrostech.domain.User;
import br.com.barrostech.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public List<User>findAll(){
		return userRepository.findAll();
	}

}
