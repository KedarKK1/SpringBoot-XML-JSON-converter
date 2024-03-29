package com.example.demo.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

import org.json.JSONObject;
import org.json.XML;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class XML_to_Json {
	
	// function for converting xml to json
	@GetMapping("xmlToJson")
	public String xmlToJson() throws IOException {
		try {
			// Enter path of json file correctly here
			Path path = Paths.get("src/main/java/com/example/demo/inputFiles/test.XML");
			
//			String stringXml= Files.readAllLines(path).get(0);
			String stringXml= Files.readString(path);
			System.out.print(stringXml);
			
			// Convert XML to JSON with namespace awareness			
			JSONObject jsonObject = XML.toJSONObject(stringXml, true);
			
			// beautify the JSON output
	        String jsonPrettyPrintString = jsonObject.toString(4);
	        System.out.println(jsonPrettyPrintString);

	        // Create the output directory if it doesn't exist
	        Path outputDir = Paths.get("src/main/java/com/example/demo/outputFiles");
	        Files.createDirectories(outputDir);
	        
	        // Define the output file path
	        Path outputFile = outputDir.resolve("XML-to-JSON.json");

	        // Write JSON object to the file
	        Files.writeString(outputFile, jsonObject.toString());

	        return "JSON file saved successfully at: " + outputFile.toString() + "\n" + jsonObject.toString();
		} catch (Exception e) {
			// TODO: handle exception
			return ("Something went Wronge"+e.getMessage());
		}

	}
}
