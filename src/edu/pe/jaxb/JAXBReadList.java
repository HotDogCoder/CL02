package edu.pe.jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import edu.pe.bean.Countries;
import edu.pe.bean.Country;

public class JAXBReadList {

	public JAXBReadList() 
	{
	}

	public static void main(String[] args) throws Exception 
	{

		File file = new File ("countries.xml");

		JAXBContext jaxbCtx = JAXBContext.newInstance(Countries.class);

		Unmarshaller jaxbums = jaxbCtx.createUnmarshaller();
		
		Countries countries = (Countries) jaxbums.unmarshal(file);
		
		for (Country country : countries.getCountry()){
			System.out.println("Country: "+  country.getName() + "\n"
			         + "Code: " + country.getCode() + "\n"
			         + "Iso: " + country.getIso());
		}
	
	}

}
