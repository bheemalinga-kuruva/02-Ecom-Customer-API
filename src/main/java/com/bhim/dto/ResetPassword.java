package com.bhim.dto;

import lombok.Data;

public class ResetPassword {
	private String email;
	private String newPwd;
	private String confirmNewPwd;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNewPwd() {
		return newPwd;
	}

	public void setNewPwd(String newPwd) {
		this.newPwd = newPwd;
	}

	public String getConfirmNewPwd() {
		return confirmNewPwd;
	}

	public void setConfirmNewPwd(String confirmNewPwd) {
		this.confirmNewPwd = confirmNewPwd;
	}

}
