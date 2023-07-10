package com.app.senior.hospedagem.hospedagemapp.service;

import java.util.List;

import com.app.senior.hospedagem.hospedagemapp.model.Order;

public interface OrderService {

	Order save(Order user);
	
	List<Order> findAll();
	
	Order findById(Long value);
	
	List<Order> getOrderByUserId(int user_id);
	
	List<Order> getUserByOderGuest();
	
	List<Order> getUserByOderGuestNotCheckIn();
	
	List<Order> getUserByOderGuestHaveAlreadyCheckIn();
	
	Order checkOut(Long user_id);
	
	Order checkIn(Long user_id);
}
