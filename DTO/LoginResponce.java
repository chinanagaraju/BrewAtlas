package org.brewery.DTO;

public class LoginResponce {
	private String Message;
	private boolean StatusOk;
	public LoginResponce() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginResponce(String message, boolean statusOk) {
		super();
		Message = message;
		StatusOk = statusOk;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public boolean isStatusOk() {
		return StatusOk;
	}
	public void setStatusOk(boolean statusOk) {
		StatusOk = statusOk;
	}
	@Override
	public String toString() {
		return "LoginResponce [Message=" + Message + ", StatusOk=" + StatusOk + "]";
	}
	

}
