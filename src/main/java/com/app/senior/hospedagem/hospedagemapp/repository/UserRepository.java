package com.app.senior.hospedagem.hospedagemapp.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.senior.hospedagem.hospedagemapp.model.Order;
import com.app.senior.hospedagem.hospedagemapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

	
	@Query(value = "select * from users where cpf = :cpf", nativeQuery = true)
	List<User> findByCPF(@Param("cpf") String cpf);
	
	@Query(value = "select * from users where name = :name", nativeQuery = true)
	List<User> findByName(@Param("name") String name);

	@Query(value = "select * from users where phone = :phone", nativeQuery = true)
	List<User> findByPhone(@Param("phone") String phone);
	
}