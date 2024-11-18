package ucu.edu.ua.decorator;

public class EncryptedDocument extends AbstractDocumentDecorator {

    public EncryptedDocument(Document document) {
        super(document);
    }

    @Override
    public String parse() {
        String parsedContent = document.parse();
        
        String encryptedContent = encrypt(parsedContent);
        
        return encryptedContent;
    }

    @Override
    public String getGcsPath() {
        return document.getGcsPath();
    }

    private String encrypt(String content) {
        StringBuilder encrypted = new StringBuilder(content);
        return encrypted.reverse().toString();  
    }
}
