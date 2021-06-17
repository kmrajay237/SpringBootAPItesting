package com.example.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {
	
//	@GetMapping
//	public String getAllUser() {
//		return "http GET Request for getAllUsers was sent";
//		
//	}
	
	@PostMapping
	public String createAllUser() {
		return "http POST Request for getAllUsers was sent";
		
	}
	
	@PutMapping
	public String updateAllUser() {
		return "http PUT Request for getAllUsers was sent";
		
	}
	
	@DeleteMapping
	public String deleteAllUser() {
		return "http DELETE Request for getAllUsers was sent";
		
	}
	
	@GetMapping(path="/{userID}")
	public String getAllUsersWithPathParameters(@PathVariable String userID) {
		return "http GET Request for getAllUsersWithPathParameters was sent for userID: "+userID;
		
	}
	
	@GetMapping
	public String gettingAllUsersWithQueryParameter(@RequestParam(value="page") int pageNumber,@RequestParam(value="limit") int limitNumber) {
		return "http GET Request for getAllUsersWithQueryParameters was sent for Page Number: "+pageNumber+" and Limit Number: "+limitNumber;
		
	}
	

}
