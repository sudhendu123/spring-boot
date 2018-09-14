package com.example.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Address {

	@JsonProperty(value = "pin")
	private int pin;
	@JsonProperty(value = "loc")
	private String location;

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}
