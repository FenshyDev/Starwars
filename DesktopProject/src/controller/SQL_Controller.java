package controller;

import java.util.Properties;

import model.SQLIO;

public class SQL_Controller {
	
	SQLIO sql;
	Dictionary dict;
	
	public SQL_Controller(){
		dict = new Dictionary();
		sql = new SQLIO(dict.getProperties());
	}
	
}
