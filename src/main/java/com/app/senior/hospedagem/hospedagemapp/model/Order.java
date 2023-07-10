package com.app.senior.hospedagem.hospedagemapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private int user_id;
	
	@Column(nullable = false)
	private String status;
	
	@Column(nullable = false)
    private String horary_check_in;
	
	@Column(nullable = false)
    private String horary_check_out;
	
	@Column(nullable = false)
    private int daily_price_monday_to_friday;
	
	@Column(nullable = false)
    private int daily_price_weekends;
	
	@Column(nullable = false)
    private int price_of_car_spaces_monday_to_friday;
	
	@Column(nullable = false)
    private int price_of_car_spaces_weekend;
	
	@Column(nullable = false)
    private int additional_fee_percentage_of_later_check_in;
	
	@Column(nullable = false)
    private String[] list_days_monday_to_friday;
	
	@Column(nullable = false)
    private String[] list_days_weekend;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getHorary_check_in() {
		return horary_check_in;
	}
	public void setHorary_check_in(String horary_check_in) {
		this.horary_check_in = horary_check_in;
	}
	public String getHorary_check_out() {
		return horary_check_out;
	}
	public void setHorary_check_out(String horary_check_out) {
		this.horary_check_out = horary_check_out;
	}
	public int getDaily_price_monday_to_friday() {
		return daily_price_monday_to_friday;
	}
	public void setDaily_price_monday_to_friday(int daily_price_monday_to_friday) {
		this.daily_price_monday_to_friday = daily_price_monday_to_friday;
	}
	public int getDaily_price_weekends() {
		return daily_price_weekends;
	}
	public void setDaily_price_weekends(int daily_price_weekends) {
		this.daily_price_weekends = daily_price_weekends;
	}
	public int getPrice_of_car_spaces_monday_to_friday() {
		return price_of_car_spaces_monday_to_friday;
	}
	public void setPrice_of_car_spaces_monday_to_friday(int price_of_car_spaces_monday_to_friday) {
		this.price_of_car_spaces_monday_to_friday = price_of_car_spaces_monday_to_friday;
	}
	public int getPrice_of_car_spaces_weekend() {
		return price_of_car_spaces_weekend;
	}
	public void setPrice_of_car_spaces_weekend(int price_of_car_spaces_weekend) {
		this.price_of_car_spaces_weekend = price_of_car_spaces_weekend;
	}
	public int getAdditional_fee_percentage_of_later_check_in() {
		return additional_fee_percentage_of_later_check_in;
	}
	public void setAdditional_fee_percentage_of_later_check_in(int additional_fee_percentage_of_later_check_in) {
		this.additional_fee_percentage_of_later_check_in = additional_fee_percentage_of_later_check_in;
	}
	public String[] getList_days_monday_to_friday() {
		return list_days_monday_to_friday;
	}
	public void setList_days_monday_to_friday(String[] list_days_monday_to_friday) {
		this.list_days_monday_to_friday = list_days_monday_to_friday;
	}
	public String[] getList_days_weekend() {
		return list_days_weekend;
	}
	public void setList_days_weekend(String[] list_days_weekend) {
		this.list_days_weekend = list_days_weekend;
	}
}
