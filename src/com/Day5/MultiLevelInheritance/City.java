package com.Day5.MultiLevelInheritance;

public class City extends State {
	
	private String CityName;
	private float Area;
	
	
	public String getCityName() {
		return CityName;
	}
	public void setCityName(String cityName) {
		CityName = cityName;
	}
	public float getArea() {
		return Area;
	}
	public void setArea(float area) {
		Area = area;
	}
	@Override
	public String toString() {
		return "City [CityName=" + CityName + ", Area=" + Area + ", getStateName()=" + getStateName()
				+ ", getLanguage()=" + getLanguage() + ", getCountryName()=" + getCountryName() + ", getCapital()="
				+ getCapital() + "]";
	}
	
	
	
	

}
