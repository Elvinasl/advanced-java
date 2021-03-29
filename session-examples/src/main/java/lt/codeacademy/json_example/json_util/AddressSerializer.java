package lt.codeacademy.json_example.json_util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import lt.codeacademy.json_example.model.Address;

import java.io.IOException;

public class AddressSerializer extends StdSerializer<Address> {

    public AddressSerializer() {
        this(null);
    }

    protected AddressSerializer(Class<Address> t) {
        super(t);
    }

    @Override
    public void serialize(Address address, JsonGenerator jsonGenerator, SerializerProvider provider) throws IOException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeStringField("country", address.getCountry().toString());
        jsonGenerator.writeStringField("city", address.getCity());
        jsonGenerator.writeStringField("houseNo", address.getHouseNo());
        jsonGenerator.writeEndObject();
    }
}
