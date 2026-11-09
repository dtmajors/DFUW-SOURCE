/*
 * Decompiled with CFR.
 */
import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;
import spenefett.util.jni.SFJNIUtils;

public class mie {
    public static Document BW(String string) {
        File file = new File(SFJNIUtils.getBasePath() + string);
        DocumentBuilder documentBuilder = null;
        try {
            documentBuilder = jtf.dSE();
        }
        catch (ParserConfigurationException parserConfigurationException) {
            parserConfigurationException.printStackTrace();
            return null;
        }
        Document document = null;
        try {
            document = documentBuilder.parse(file);
        }
        catch (SAXException sAXException) {
            sAXException.printStackTrace();
            return null;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return null;
        }
        document.getDocumentElement().normalize();
        return document;
    }

    public static mif BX(String string) {
        return new mif().BX(string);
    }

    public static float a(Element element, String string, float f, float f2, float f3) {
        String string2 = element.getAttribute(string);
        if (string2.isEmpty()) {
            return f2;
        }
        if (string2.equalsIgnoreCase("min")) {
            return f;
        }
        if (string2.equalsIgnoreCase("max")) {
            return f3;
        }
        try {
            return Float.valueOf(string2).floatValue();
        }
        catch (NumberFormatException numberFormatException) {
            return f2;
        }
    }
}

