import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


import ucu.edu.ua.decorator.Document;
import ucu.edu.ua.decorator.AbstractDocumentDecorator;

class AbstractDocumentDecoratorTest {

    @Test
    void testParseDelegation() {
        Document mockDocument = mock(Document.class);
        when(mockDocument.parse()).thenReturn("Original Content");

        AbstractDocumentDecorator decorator = new AbstractDocumentDecorator(mockDocument);

        // Verify that the parse method is correctly delegated
        assertEquals("Original Content", decorator.parse());
    }

    @Test
    void testGetGcsPathDelegation() {
        Document mockDocument = mock(Document.class);
        when(mockDocument.getGcsPath()).thenReturn("path/to/document");

        AbstractDocumentDecorator decorator = new AbstractDocumentDecorator(mockDocument);

        // Verify that the getGcsPath method is correctly delegated
        assertEquals("path/to/document", decorator.getGcsPath());
    }
}
