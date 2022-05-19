package edu.pe.bean;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "countries")
public class Countries {
	
	private List<Country> country ;

	public Countries ()
	{
		country = new ArrayList<Country>();
	}
	
	public List<Country> getCountry() {
		return country;
	}

	@XmlElement(name = "country")
	public void setCountry(List<Country> country) {
		this.country = country;
	}

}
