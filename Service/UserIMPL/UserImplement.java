package org.brewery.Service.UserIMPL;
 
import java.util.Optional;

import org.brewery.Brewery.Users;
import org.brewery.DTO.LoginDTO;
import org.brewery.DTO.LoginResponce;
import org.brewery.DTO.UserDTO;
import org.brewery.Repo.UserRepo;
 import org.springframework.security.crypto.password.PasswordEncoder;
import org.brewery.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserImplement implements UserService {

	@Autowired
	private  PasswordEncoder PasswordEncoder;
	@Autowired
	 private UserRepo userRepo;
	
	
	@Override
	public String NewUser(UserDTO userDTO) {
	Users users=new Users(
			userDTO.getId(),userDTO.getName(),userDTO.getEmail(),
			this. PasswordEncoder.encode(userDTO.getPassword()));
	userRepo.save(users);
		return "added";
	}
     @Override
	public LoginResponce Authenticates(LoginDTO loginDTO) {
		// TODO Auto-generated method stub
		
	
		Users user=userRepo.findByEmail(loginDTO.getEmail());
		if(user!=null) {
		
		String pass=user.getPassword();
		String existed=loginDTO.getPassword();
		boolean ispwd=PasswordEncoder.matches(existed ,pass);
			if(ispwd) {
		Optional<Users> user1=userRepo.findByEmailAndPassword(loginDTO.getEmail(),pass);
				if(user1.isPresent()) {
				 return new LoginResponce("succesfully login", true);	
				}else {
					 return new LoginResponce("login failed", false);	
				}
			}
	       else {
	    	   return new LoginResponce("Password Doesn't match",false);	
				}
			}
			else {
				 return new LoginResponce("Email doesn't  matched", false);	
			}
		
	
	}
     

}
