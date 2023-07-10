package com.app.senior.hospedagem.hospedagemapp.service;
import lombok.AllArgsConstructor;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.app.senior.hospedagem.hospedagemapp.service.UserService;
import com.app.senior.hospedagem.hospedagemapp.model.Order;
import com.app.senior.hospedagem.hospedagemapp.model.User;
import com.app.senior.hospedagem.hospedagemapp.repository.UserRepository;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
    @Override
    public User save(User user) {
        return this.userRepository.save(user);
    }

	@Override
	public List<User> findAll() {
		 return this.userRepository.findAll();
	}

	@Override
	public User findById(Long id) {
		Optional<User> user = this.userRepository.findById(id);
		return user.get();
	}

	@Override
	public List<User> findByCPF(String value) {
		List<User> user = this.userRepository.findByCPF(value);
		return user;
	}

	@Override
	public List<User> findByName(String value) {
		List<User> user = this.userRepository.findByName(value);
		return user;
	}

	@Override
	public List<User> findByPhone(String value) {
		List<User> user = this.userRepository.findByPhone(value);
		return user;
	}

}
