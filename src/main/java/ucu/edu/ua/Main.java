package ucu.edu.ua;

import ucu.edu.ua.decorator.CachedDocument;
import ucu.edu.ua.decorator.MockedDocument;
import ucu.edu.ua.decorator.TimedDocument;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        MockedDocument mockedDocument = new MockedDocument("path");

        TimedDocument timedDocument = new TimedDocument(mockedDocument);

        System.out.println(timedDocument.parse());

        CachedDocument cachedDocument = new CachedDocument(mockedDocument);
        System.out.println(cachedDocument.parse());
    }
}