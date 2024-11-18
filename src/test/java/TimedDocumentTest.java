import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


import ucu.edu.ua.decorator.Document;
import ucu.edu.ua.decorator.TimedDocument;

public class TimedDocumentTest {

    private Document document;
    private TimedDocument timedDocument;

    @BeforeEach
    public void setUp() {
        document = mock(Document.class);
        when(document.parse()).thenReturn("Parsed content from mock document");

        timedDocument = new TimedDocument(document);
    }

    @Test
    public void testParse() {
        String result = timedDocument.parse();
        
        assertEquals("Parsed content from mock document", result, "The parse method should return the content from the wrapped document.");
        
        verify(document).parse();
    }

    @Test
    public void testParseWithTimeLogging() {
       
        String result = timedDocument.parse();
        
        assertEquals("Parsed content from mock document", result);
    }
}

