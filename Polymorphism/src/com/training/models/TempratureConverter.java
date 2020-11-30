package com.training.models;

import com.training.ifaces.Converter;

public class TempratureConverter implements Converter {

	private double celsius;
	
	public TempratureConverter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TempratureConverter(double celsius) {
		super();
		this.celsius = celsius;
	}

	public double getCelsius() {
		return celsius;
	}

	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}

	@Override
	public double convert() {
		return celsius * 1.8 + 32;
	}

}
