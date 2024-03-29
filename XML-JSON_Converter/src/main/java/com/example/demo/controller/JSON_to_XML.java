package com.example.demo.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.json.JSONObject;
import org.json.XML;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JSON_to_XML {
	
	// for converting json to xml
	@GetMapping("jsonToXml")
	public String jsonToXml() throws IOException {
		try {
			String root = "root";
			
			// Enter path of json file correctly here
			Path path = Paths.get("src/main/java/com/example/demo/inputFiles/test.json");
			
			String stringJson = Files.readAllLines(path).get(0);
			
			// Convert XML to JSON with namespace awareness		
			JSONObject json = new JSONObject(stringJson);
			//	System.out.print(XML.toString(json));
			
			// adding metadata before starting the main xml file
			String xml = "<?xml version=\"1.0\" encoding=\"ISO-8859-15\"?>\n<"+root+">" + XML.toString(json) + "</"+root+">";
			System.out.print(xml);
			
			// Create the output directory if it doesn't exist
	        Path outputDir = Paths.get("src/main/java/com/example/demo/outputFiles");
	        Files.createDirectories(outputDir);
	        
	        // Define the output file path
	        Path outputFile = outputDir.resolve("JSON-to-XML.xml");

	        // Write JSON object to the file
	        Files.writeString(outputFile, xml);

			return XML.toString(json);			
		} catch (Exception e) {
			// TODO: handle exception
			return "Something went Wronge"+e.getMessage();
		}

	}
	
}
