package kristiania.no.http;

import no.kristiania.http.HttpClient;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HttpClientTest {

    @Test
    void dummyTest() {
        assertEquals(42, 6*7);
    }

    @Test
    void shouldReturnStatusCode() {
        HttpClient client = new HttpClient("httpbin.org", 80,"/html");
        assertEquals(200, client.getStatusCode());
    }

}
