package com.facturador.danmar.service.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class MenuStock {

		public static void main(String[] args) {
		    try
		    {
		    	  Properties props = new java.util.Properties();

//		    	  props.put("separator", "|");              // separator is a bar
//		    	  props.put("suppressHeaders", "true");     // first line contains data
		    	  props.put("suppressHeaders", "true"); 		    	  
		    	  props.put("fileExtension", ".dbf");       // file extension is .txt
//		    	  props.put("timeZoneName", "America/Los_Angeles"); // timestamps are Los Angeles time
		    	
		      // Load the driver.
		      Class.forName("org.relique.jdbc.csv.CsvDriver");

		      // Create a connection. The first command line parameter is
		      // the directory containing the .csv files.
		      // A single connection is thread-safe for use by several threads.
		      Connection conn = DriverManager.getConnection("jdbc:relique:csv:" + "C:\\wsPruebas\\apuntesdejava-dbf2\\",props);

		      // Create a Statement object to execute the query with.
		      // A Statement is not thread-safe.
		      //Statement stmt = conn.createStatement();
		      
		      
		      
//		      Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, 	        ResultSet.CONCUR_READ_ONLY);
  		      Statement stmt = conn.createStatement();

		  		      
		      
		      // Select the ID and NAME columns from sample.csv
		      ResultSet results = stmt.executeQuery("SELECT * FROM stock where articulo LIKE '%207%' ");

		      
		      
		      System.out.println("ALEEEEE");
		      
		      results.next();
		      
//		      [CODIGO, SUBCODIGO, CC1, CC2, CC3, CC4, CC5, RECAMBIO, ARTICULO, DESC_ADIC, DESCAMPLIA, TIPO_ART, LINEA, PRECIO_LP, COSTO, PRECIO, PRECIO_MAY, MANODEOBRA, TIEMPO, EXISTENTES, RESERVADOS, CANMAXIMA, CANMINIMA, DESCUENTOS, GANANCIA, GANANCIAMY, LISPRE_AUX, ORIGEN, FECCOMPRA, FACCOMPRA, PROVEEDOR, DTO_PROV_1, DTO_PROV_2, COD_PROV, MONEDA_COS, FECCAMPREC, VARIACION, VARMIN, VARMAY, FVARMIN, FVARMAY, VISIBLE]
		      
		      	int c=0;
		        while(results.next())
		        {
		        	System.out.println("COntador: " + c++);
		            System.out.println("HOLAA");
		            System.out.println("TIPO_CLIENTE: " + results.getString(5));
		            System.out.println("TIPO_CLIENTE: " + results.getString(8));
		            System.out.println("TIPO_CLIENTE: " + results.getString(9));
		            
		            
		        }
		      

		      // Clean up
		      conn.close();
		    }
		    catch(Exception e)
		    {
		      e.printStackTrace();
		    }
		}
}
