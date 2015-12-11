package XML_Configuration;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class LoadConfigXML {
	public Configuration load() {

	 try {

		File file = new File("file.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(Configuration.class);

		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		Configuration configuration = (Configuration) jaxbUnmarshaller.unmarshal(file);
		System.out.println(configuration.getUser());
		 return configuration;
	  } catch (JAXBException e) {
		e.printStackTrace();
	  }
	return null;
	}
}
