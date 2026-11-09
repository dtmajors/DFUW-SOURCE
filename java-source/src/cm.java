/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class cm {
    public String a(Document document) {
        Element element = document.getDocumentElement();
        return element.getNodeName();
    }
}

