import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class DocSearchTest{
    @Test
    public void testHandler() throws IOException, URISyntaxException {
        Handler example = new Handler("technical/");
        URI url = new URI("https://ucsd-cse15l-f22.github.io/week/week3/");
        System.out.println(example.handleRequest(url));
    }
}