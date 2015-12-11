package XML_Configuration;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Configuration {
		
	String user;
	String password;
	String url;
	String ssl;
	String sslfactory;
	
	public String getUser() {
		return user;
	}
	@XmlAttribute
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	@XmlElement
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUrl() {
		return url;
	}
	@XmlElement
	public void setUrl(String url) {
		this.url = url;
	}
	public String getSsl() {
		return ssl;
	}
	@XmlElement
	public void setSsl(String ssl) {
		this.ssl = ssl;
	}
	public String getSslfactory() {
		return sslfactory;
	}
	@XmlElement
	public void setSslfactory(String sslfactory) {
		this.sslfactory = sslfactory;
	}
	
}