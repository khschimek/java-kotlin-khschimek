package Jackson.app.src.main.java.com.example.jackson;

import Jackson.app.src.main.java.com.fasterxml.jackson.core.JsonGenerator;
import Jackson.app.src.main.java.com.fasterxml.jackson.core.JsonParser;
import Jackson.app.src.main.java.com.fasterxml.jackson.core.JsonProcessingException;
import Jackson.app.src.main.java.com.fasterxml.jackson.databind.DeserializationContext;
import Jackson.app.src.main.java.com.fasterxml.jackson.databind.JsonDeserializer;
import Jackson.app.src.main.java.com.fasterxml.jackson.databind.JsonNode;
import Jackson.app.src.main.java.com.fasterxml.jackson.databind.ObjectMapper;
import Jackson.app.src.main.java.com.fasterxml.jackson.databind.SerializerProvider;
import Jackson.app.src.main.java.com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import Jackson.app.src.main.java.com.fasterxml.jackson.databind.annotation.JsonSerialize;
import Jackson.app.src.main.java.com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

@JsonDeserialize(using = Jackson.app.src.main.java.com.example.jackson.Deserializer.class)
@JsonSerialize(using = Jackson.app.src.main.java.com.example.jackson.Serializer.class)
public class Jackson {
    public static class Deserializer extends JsonDeserializer<Jackson.app.src.main.java.com.example.jackson.Jackson> {
        @Override
        public Jackson.app.src.main.java.com.example.jackson.Jackson deserialize(JsonParser jp, DeserializationContext context) throws IOException {
            JsonNode node = jp.getCodec().readTree(jp);
            return new Jackson.app.src.main.java.com.example.jackson.Jackson(node);
        }
    }

    // https://www.baeldung.com/jackson-object-mapper-tutorial
    public static class Serializer extends StdSerializer<Jackson.app.src.main.java.com.example.jackson.Jackson> {
        public Serializer() {
            this(null);
        }

        public Serializer(Class<Jackson.app.src.main.java.com.example.jackson.Jackson> t) {
            super(t);
        }
        @Override
        public void serialize(Jackson.app.src.main.java.com.example.jackson.Jackson jackson, JsonGenerator jsonGenerator, SerializerProvider serializer) throws IOException {
            jackson.toJson(jsonGenerator);
        }
    }

    private int counter;
    public static final int DEFAULT_COUNTER = 2;
    private String name;
    public static final String DEFAULT_NAME = "Frank";

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Jackson(JsonNode node) {
        this.counter = Counter.valueOf(node.get("counter").asText());
        this.name = node.get("name").asText();
    }
    public void toJson(JsonGenerator out) throws IOException {
        out.writeStartObject();
        out.writeStringField("counter",getCounter().toString());
        out.writeStringField("name",getName());
        out.writeEndObject();
    }

    public String toJson() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public Jackson(int counter, String name) {
        this.counter = counter;
        this.name = name;
    }

    public Jackson() {
        this(DEFAULT_COUNTER, DEFAULT_NAME);
    }
}
