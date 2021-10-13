package db;

public class DTO {
	String country = null;
	String code = null;
	String capital = null;
	String climate = null;

	public DTO(String country, String code, String capital, String climate) {
		this.country = country;
		this.code = code;
		this.capital =  capital;
		this.climate = climate;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getClimate() {
		return climate;
	}

	public void setClimate(String climate) {
		this.climate = climate;
	}
}
