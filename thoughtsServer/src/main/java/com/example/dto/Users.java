package com.example.dto;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/*@Data
@Getter @Setter*/
@ApiModel(description="All details about the Users. ")
public class Users {
	
	@ApiModelProperty( value = "Users Id", required = true ,notes="UserId is max 2 digit integer." ) 
	@Digits(message="wrong id length", fraction = 2, integer = 2)
	@JsonProperty(value ="id", required = true)
	private int userId;
	@JsonProperty(value ="phone")
	private int phone;
	@ApiModelProperty(notes="userName should have atleast 7 characters")
	@NotNull(message="UserName is null")
	@Size(min=7, message="userName should have atleast 7 characters")
	@JsonProperty(value ="userName")
	private String userName;
	@JsonProperty(value ="address", required = true)
	private Address address;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	} 
}
