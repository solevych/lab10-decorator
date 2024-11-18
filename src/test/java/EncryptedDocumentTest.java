import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


import ucu.edu.ua.decorator.Document;
import ucu.edu.ua.decorator.EncryptedDocument;


class EncryptedDocumentTest {

    @Test
    void testParseEncryptsContent() {
        Document mockDocument = mock(Document.class);
        when(mockDocument.parse()).thenReturn("Original Content");

        EncryptedDocument encryptedDocument = new EncryptedDocument(mockDocument);

        assertEquals("tnetnoC lanigirO", encryptedDocument.parse());
    }

    @Test
    void testGetGcsPathDelegation() {
        Document mockDocument = mock(Document.class);
        when(mockDocument.getGcsPath()).thenReturn("path/to/document");

        EncryptedDocument encryptedDocument = new EncryptedDocument(mockDocument);

        assertEquals("path/to/document", encryptedDocument.getGcsPath());
    }
}
