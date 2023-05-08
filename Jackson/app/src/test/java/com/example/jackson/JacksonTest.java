package Jackson.app.src.main.java.com.example.jackson;
import static org.junit.Assert.*;

import android.database.DatabaseErrorHandler;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JacksonTest {
    Jackson jackson;
    @Before
    public void setUp() throws Exception {
        jackson = new Jackson();
    }
    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getCounter() {
        assertEquals(jackson.DEFAULT_COUNTER,jackson.getCounter());
    }

    @Test
    public void getName() {
        assertEquals(jackson.DEFAULT_NAME,jackson.getName());
    }

    @Test
    public void setCounter() {
        jackson.setCounter(3);
        assertEquals(3,jackson.getCounter());
    }

    @Test
    public void setName() {
        jackson.setName("Bob");
        assertEquals("Bob",jackson.getName());
    }

    @Test
    public void fromJSON() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\n" +
                "    \"counter\": \"2\",\n" +
                "    \"name\": \"Frank\"\n" +
                "}";
        jackson = mapper.readValue(json,Jackson.class);

        assertEquals(2,jackson.getCounter());
        assertEquals("Frank",jackson.getName());
    }

    @Test
    public void toJSON() throws Exception {
        cap = new Jackson();

        ObjectMapper mapper = new ObjectMapper();
        String json  = mapper.writeValueAsString(cap);
        String expect = "{\"counter\":\"2\",\"name\":\"Frank\"}";

        assertEquals(expect,json);
    }
}
