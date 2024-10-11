package com.bhim.service;

import org.springframework.stereotype.Service;

@Service
public class ForgotPwdServiceImp implements ForgotPwdService {

	private EmailService emailService;

	public ForgotPwdServiceImp(EmailService emailService) {
		this.emailService = emailService;
	}

	public Boolean sendMail(String email) {

		String subject = "Forgot password Mail from E-Commerce App";
		String body = "Link to reset the password is http://localhost:4200/resetpwd";

		emailService.sendEmail(email, subject, body);

		return true;
	}
}
