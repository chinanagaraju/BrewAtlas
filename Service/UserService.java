package org.brewery.Service;

import org.brewery.DTO.LoginDTO;
import org.brewery.DTO.LoginResponce;
import org.brewery.DTO.UserDTO;
public interface UserService {

	String NewUser(UserDTO userDTO);

	LoginResponce Authenticates(LoginDTO loginDTO);

}
