package lt.codeacademy.json_example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import lt.codeacademy.json_example.json_util.AddressSerializer;
import lt.codeacademy.json_example.model.Address;
import lt.codeacademy.json_example.model.Country;
import lt.codeacademy.lecture11.null_example.Adresas;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonStarter {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT); // nicer indentation
        // global config whether  we will fail if class property will be unknown.
        // This is a global configuration, USE IT WITH CARE! You can use @JsonIgnoreProperties(ignoreUnknown = true) instead
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        // we can register custom serializers / deserializers as modules
        SimpleModule simpleModule = new SimpleModule();
        simpleModule.addSerializer(Address.class, new AddressSerializer());

        // ======================= Object -> File & File -> Object mapping ===================================
        Address address = new Address(Country.LIETUVA, "Vilnius", "33");
        File addressJsonFile = new File("addressJsonFile.json"); // file where we will write our json content
        mapper.writeValue(addressJsonFile, address); // map object to file content

        // read from file to object
        Address addressFromCustomFile = mapper.readValue(new File("addressJsonFile_custom.json"), Address.class);


        // ======================= Object -> JSON String & JSON String -> Object ===================================
        String addressString = mapper.writeValueAsString(address);

        String jsonAddressString = "{\"country\":\"LIETUVA\",\"city\":\"Vilnius Is String\",\"houseNo\":\"33\"}";
        Address addressFromJsonString = mapper.readValue(jsonAddressString, Address.class);

        // ======================= List<Object> -> JSON & JSON -> List<Object> ===================================
        List<Address> addresses = List.of(address, new Address(Country.SVEDIJA, "Stockholm", "18"));
        // mapping list<address> to json file
        mapper.writeValue(new File("addresses.json"), addresses);

        // get list of address object from file

        List<Address> addressListFromFile = mapper.readValue(new File("addresses.json"), new TypeReference<>() {});

        System.out.println("Pirmas elementas is json failu list'o: " + addressListFromFile.get(0).getCity());
    }
}
