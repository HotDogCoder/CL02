package edu.pe.jaxb;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import edu.pe.bean.Countries;
import edu.pe.bean.Country;

public class JAXBSave {

	public JAXBSave() {
	}

	
	public static void main (String [] arg) throws Exception
	{
		Country bean = new Country();
		Boolean existe = false;
		
		bean.setName("Tangancícuaro");
		bean.setCode("TG");
		bean.setIso(Short.parseShort("998"));
		
		File file = new File ("countries.xml");
		
		//preparar el contexto 
		JAXBContext jaxbCtx = JAXBContext.newInstance(Countries.class);
	
		//definimos la persistencia
		Marshaller jaxbMs = jaxbCtx.createMarshaller();
		
		//establecer el formato de salida
		jaxbMs.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
        Unmarshaller jaxbums = jaxbCtx.createUnmarshaller();
		
		Countries countries = (Countries) jaxbums.unmarshal(file);
		
		Countries newcountries = new Countries();
		List<Country> list = new ArrayList<Country>();
		
		for (Country country : countries.getCountry()){
			list.add(country);
		}
		
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getIso() == 998) {
				existe = true;
			}
			else
			{
				existe = false;
			}
		}
		
		if(existe == false) {
			list.add(bean);		
			newcountries.setCountry(list);
				
			//Guardamos
			jaxbMs.marshal(newcountries, file);
			jaxbMs.marshal(newcountries, System.out);	
		}
		else {
			System.out.println("Ya existe");
		}
		
	}
}
