package db;

import java.sql.Struct;

public class DTO {
	String country = null;
	String code = null;
	String capital = null;
	String climate = null;
	String location = null;
	String majorcity = null;
	String religion = null;
	String ethnicgroup = null;
	String media = null;
	int area = 0;
	String areasource = null;
	String areadescript = null;
	String languages = null;
	int baseyear = 0;

	public DTO(String country, String code, String capital, String climate) {
		this.country = country;
		this.code = code;
		this.capital =  capital;
		this.climate = climate;
	}

	public DTO(String country, String code, String capital, String climate, String location, String majorcity, String religion, String ethnicgroup, String media, int area, String areasource, String areadescript, String languages, int baseyear) {
		this.country = country;
		this.code = code;
		this.capital =  capital;
		this.climate = climate;
		this.location = location;
		this.majorcity = majorcity;
		this.religion = religion;
		this.ethnicgroup = ethnicgroup;
		this.media = media;
		this.area = area;
		this.areasource = areasource;
		this.areadescript = areadescript;
		this.languages = languages;
		this.baseyear = baseyear;

	}

	public DTO(String country) {
		this.country = country;
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

	public String getLocation() { return location; }

	public void setLocation(String location) { this.location = location;}

	public String getMajorcity() {
		return majorcity;
	}

	public void setMajorcity(String majorcity) {
		this.majorcity = majorcity;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getEthnicgroup() {
		return ethnicgroup;
	}

	public void setEthnicgroup(String ethnicgroup) {
		this.ethnicgroup = ethnicgroup;
	}

	public String getMedia() {
		return media;
	}

	public void setMedia(String media) {
		this.media = media;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public String getAreasource() {
		return areasource;
	}

	public void setAreasource(String areasource) {
		this.areasource = areasource;
	}

	public String getAreadescript() {
		return areadescript;
	}

	public void setAreadescript(String areadescript) {
		this.areadescript = areadescript;
	}

	public String getLanguages() {
		return languages;
	}

	public void setLanguages(String languages) {
		this.languages = languages;
	}

	public int getBaseyear() {
		return baseyear;
	}

	public void setBaseyear(int baseyear) {
		this.baseyear = baseyear;
	}


}
