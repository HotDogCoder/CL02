package edu.pe.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"name"})
public class Country {

	@XmlValue
	private String name;
	
	@XmlAttribute(name = "code")
	private String code;
	
	@XmlAttribute(name = "iso")
	private Short iso;

	public Country()
	{}
	
	public Country(String name, String code, Short iso) {
		super();
		this.name = name;
		this.code = code;
		this.iso = iso;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Short getIso() {
		return iso;
	}

	public void setIso(Short iso) {
		this.iso = iso;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
