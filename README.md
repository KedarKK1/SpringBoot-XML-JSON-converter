# TO-Do

Give your input files in 1. src/main/java/com/example/demo/inputFiles/Test.xml & 2. src/main/java/com/example/demo/inputFiles/Test.json

# Routes -

```
/xmlToJson -> converts json to xml from file Test.json & saves it in src/main/java/com/example/demo/outputFiles/XML-to-JSON.json
```

```
/jsonToXml -> converts json to xml from file Test.json & saves it in src/main/java/com/example/demo/outputFiles/JSON-to-XML.xml
```

# Note

I MISTAKENLY added postgrsql driver, remove it via removing it from pom.xml, otherwise it give any database name in XML-JSON_Converter\src\main\resources\application.properties
along with postgresql username & password
