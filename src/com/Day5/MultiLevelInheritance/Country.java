package com.Day5.MultiLevelInheritance;

public class Country {
	
	private String CountryName;
	private String Capital;
	
	
	public String getCountryName() {
		return CountryName;
	}
	public void setCountryName(String countryName) {
		CountryName = countryName;
	}
	public String getCapital() {
		return Capital;
	}
	public void setCapital(String capital) {
		Capital = capital;
	}
	
	
	@Override
	public String toString() {
		return "Country [CountryName=" + CountryName + ", Capital=" + Capital + "]";
	}
	
	
	
	

}
