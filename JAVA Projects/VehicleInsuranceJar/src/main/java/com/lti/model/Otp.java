package com.lti.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_otp")
public class Otp {
	@Id
	@SequenceGenerator(name="seq_otp",initialValue=41200,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq_otp")
	int otpId;
	
	@Column(unique = true)
	int userId;
	
	LocalDateTime timeOfGeneration;
	
	String otp;

	public int getOtpId() {
		return otpId;
	}

	public void setOtpId(int otpId) {
		this.otpId = otpId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public LocalDateTime getTimeOfGeneration() {
		return timeOfGeneration;
	}

	public void setTimeOfGeneration(LocalDateTime timeOfGeneration) {
		this.timeOfGeneration = timeOfGeneration;
	}

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}
	
	
}
