package edu.pe.jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import edu.pe.bean.Countries;
import edu.pe.bean.Country;

public class JAXBSearch {

	public JAXBSearch() 
	{
	}

	public static void main(String[] args) throws Exception 
	{

		File file = new File ("countries.xml");

		JAXBContext jaxbCtx = JAXBContext.newInstance(Countries.class);

		Unmarshaller jaxbums = jaxbCtx.createUnmarshaller();
		
		Countries countries = (Countries) jaxbums.unmarshal(file);
		
		Country bean = new Country();
		
		for (Country country : countries.getCountry()){
			if(country.getIso() == 604) {
				bean = country;
			}
		}
	
		System.out.println("Country: "+  bean.getName() + "\n"
				         + "Code: " + bean.getCode() + "\n"
				         + "Iso: " + bean.getIso());	
	}

}
