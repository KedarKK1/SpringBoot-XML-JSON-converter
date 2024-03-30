# Routes -

```
/xmlToJson -> converts json to xml from input given in the body(Body should be in XML format in postman)

```

<img src="./Screenshots/ss1.png" alt="xmlToJson postman" >

```
/jsonToXml -> converts json to xml from input given in the body(Body should be in either text or JSON format in postman)
```

<img src="./Screenshots/ss2.png" alt="jsonToXml postman" >

# Note -

You can also use the postman collection given above for getting the urls and their input types.

# Note

I MISTAKENLY added postgrsql driver, remove it via removing it from pom.xml, otherwise it give any database name in XML-JSON_Converter\src\main\resources\application.properties
along with postgresql username & password
