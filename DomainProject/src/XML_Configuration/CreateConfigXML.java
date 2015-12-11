package XML_Configuration;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class CreateConfigXML {
	public void create() {

	  Configuration configuration = new Configuration();
	  configuration.setUser("r0582534");
	  configuration.setPassword("Keyblade66");
	  configuration.setUrl("jdbc:postgresql://gegevensbanken.khleuven.be:51516/2TX34");
	  configuration.setSsl("true");
	  configuration.setSslfactory("org.postgresql.ssl.NonValidatingFactory");
	  try {

		File file = new File("file.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(Configuration.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

		// output pretty printed
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		jaxbMarshaller.marshal(configuration, file);
		jaxbMarshaller.marshal(configuration, System.out);

	      } catch (JAXBException e) {
		e.printStackTrace();
	      }

	}
}