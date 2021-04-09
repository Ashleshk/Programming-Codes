package com.lti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tbl_parameter")
public class Parameter {
	@Id
	@SequenceGenerator(name="seq_parameter",initialValue=21000,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq_parameter")
	int parameterId;
	
	@Column(unique = true)
	String key;
	
	double value;

	public int getParameterId() {
		return parameterId;
	}

	public void setParameterId(int parameterId) {
		this.parameterId = parameterId;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	
}
