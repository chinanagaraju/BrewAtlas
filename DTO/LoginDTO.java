package org.brewery.DTO;

public class LoginDTO {


private String Email;
private String Password;
public LoginDTO() {
	super();
	// TODO Auto-generated constructor stub
}

public LoginDTO(String email, String password) {
	super();
	Email = email;
	Password = password;
}

public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
@Override
public String toString() {
	return "Login [Email=" + Email + ", Password=" + Password + "]";
}


}
