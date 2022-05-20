package edu.dual;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;
/**
 * Clase para las pruebas unitarias de la libreria desarrollada
 * @author Fátima Guerrero 
 *@version 1.0
 */
public class PruebasJunit {
	//Voy ha realizar pruebas con assertTrue y asserFalse
	//asserTrue está afirmando que la expresión es verdadera,
	//si no lo es mostrará el mensaje y la aserción fallará,
	//sin embargo assertFalse está evaluando que una aserción es falsa,
	//si no lo es nos mostrará el mensaje y la aserción fallará
	
	//He utilizado para realizar esta actividad la libreria JUnit5
	
	
	
	//Creo una instancia del xml
	Xml xml =new Xml("/home/usuario/Desktop/Dual/ACTIVIDAD5DUAL/configuracion/configuracion.xml");

	/**
	 * Aserción que devuelve true si el contenido se ha añadido correctamente
	 */
	@Test
	public void testXmlBd() {
		assertTrue(xml.XmlBd(new File("/home/usuario/Desktop/Dual/TestLoggerDual/Logs.xml")),"Fallo archivo xml a la base de datos");
	}
	/**
	 * Aserción que dará error, ya que he metido un archivo que no existe para que me de error
	 */
	@Test
	public void testXmlFallo() {
		assertTrue(xml.XmlBd(new File("/home/usuario/Desktop/Dual/TestLoggerDual/Logsnuevo.xml")),"ERROR, El archivo Xml no existe");

	}
	/**
	 * Aserción que devuelve true si base de datos pasa al xml correctamente
	 */
	@Test
	public void testBdXml() {
		assertTrue(xml.BdXml(),"Fallo base de datos a archivo xml");
	}
	/**
	 * Asserción false, si el archivo no existe la aserción será correcta, si el archivo
	 * existe la aserción mostrará el mensaje y dará error
	 */
	@Test
	public void testXmlFalse() {
		assertFalse(xml.XmlBd(new File("/home/usuario/Desktop/Dual/TestLoggerDual/Logsnuevo.xml")),"El archivo Xml existe");

	}

}