package ucu.edu.ua.decorator;

public class AbstractDocumentDecorator  implements Document {
    protected Document document;

    public AbstractDocumentDecorator(Document document) {
        this.document = document;
    }

    @Override
    public String parse() {
        return document.parse();
    }

    @Override
    public String getGcsPath() {
        return document.getGcsPath();
    }
}
