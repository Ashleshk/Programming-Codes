package SAXParserDemo;

import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ReadXMLFile {
public static void main(String[] args) throws ParserConfigurationException, SAXException {
	
	//obtain and configure a SAX based parser
	SAXParserFactory fact = SAXParserFactory.newInstance();
	
	//obtain obj for sax parser
	SAXParser pars = fact.newSAXParser();
	
	DefaultHandler handle = new DefaultHandler(){
		boolean bname = false;
		boolean bpower = false;
		
		public void startElement(String uri, String local, String qname,
				Attributes attributes)throws SAXException{
			if(qname.equalsIgnoreCase("name")){
				bname=true;
			}
			if(qname.equalsIgnoreCase("specialPower")){
				bpower=true;
			}
				
		}
		
		public void endElement(String uri, String local, String qname) throws SAXException{
			
		}
		
		public void characters(char ch[], int st, int len)throws SAXException{
			if(bname){
				System.out.println("name is " + new String(ch, st, len));
				bname=false;
			}
			if(bpower){
				System.out.println("power is " + new String(ch, st, len));
				bpower=false;
			}
		}
	};
	
	try {
		pars.parse("Superhero.xml", handle);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
