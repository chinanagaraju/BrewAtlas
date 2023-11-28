package org.brewery.UserController;

import org.brewery.DTO.LoginDTO;
import org.brewery.DTO.LoginResponce;
import org.brewery.DTO.UserDTO;
import org.brewery.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/brewery")
public class UserController {
	@Autowired
	private UserService userService; 
//	@RequestMapping( method = RequestMethod.POST,value = "brewery/{save}")
	
	@PostMapping(path = "/save")
	public String AddUser(@RequestBody UserDTO userDTO) {
		String id=userService.NewUser(userDTO);
		return id;
	}
	@PostMapping(path = "/login")
	public ResponseEntity<?> login(@RequestBody LoginDTO loginDTO ) {
		 LoginResponce loginResponce=userService.Authenticates(loginDTO);
		return  ResponseEntity.ok(loginResponce);
	}

	

}
