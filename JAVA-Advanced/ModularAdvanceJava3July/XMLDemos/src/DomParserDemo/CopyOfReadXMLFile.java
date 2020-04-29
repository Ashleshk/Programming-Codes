package DomParserDemo;


import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

public class CopyOfReadXMLFile {

  public static void main(String argv[]) {

    try {

	File fXmlFile = new File("Superhero.xml");
	
	//Defines a factory API that enables applications 
	//to obtain a parser that produces DOM object trees from XML documents.
	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	
	//Defines the API to obtain DOM Document instances from an XML document.
	//Using this class, an application programmer can obtain a Document from XML.
	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	
	Document doc = dBuilder.parse(fXmlFile);

	
	doc.getDocumentElement().normalize();
	
	System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

	NodeList nList = doc.getElementsByTagName("superhero");

	System.out.println("----------------------------");

	for (int temp = 0; temp < nList.getLength(); temp++) {

		Node nNode = nList.item(temp);

		System.out.println("\nCurrent Element :" + nNode.getNodeName());

		if (nNode.getNodeType() == Node.ELEMENT_NODE) {

			Element eElement = (Element) nNode;

			System.out.println("Super hero id : " + eElement.getAttribute("sid"));
			System.out.println("Speciality : " + eElement.getAttribute("speciality"));

			System.out.println("First Name : " + 
			eElement.getElementsByTagName("name").item(0).getTextContent());
			System.out.println("Special Power : "
			+ eElement.getElementsByTagName("specialPower").item(0).getTextContent());
			
		}
	}
    } catch (Exception e) {
	e.printStackTrace();
    }
  }

}
