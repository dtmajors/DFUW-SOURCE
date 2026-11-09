/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.Annotations;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.w3c.dom.Document;

public class jtp {
    public static void dSL() {
        XStream xStream = new XStream(new DomDriver());
        xStream.setMode(1001);
        Annotations.configureAliases(xStream, aue.class);
        xStream.useAttributeFor(auf.class, "Value");
        String string = xStream.toXML(lea.eoH());
        Document document = jsy.tL(string);
        String string2 = lcw.qLa + "xml-files/client/chat/" + "chatlogconfig.xml";
        jsz.a(document, new jrw(string2));
    }

    public static void dSM() {
        Object object;
        XStream xStream = new XStream(new DomDriver());
        xStream.setClassLoader(r.cr);
        xStream.setMode(1001);
        Annotations.configureAliases(xStream, aue.class);
        Annotations.configureAliases(xStream, auf.class);
        String string = "";
        try {
            object = "xml-files/client/chat/chatlogconfig.xml";
            string = jry.ti((String)object);
        }
        catch (FileNotFoundException fileNotFoundException) {
            throw new bg(fileNotFoundException);
        }
        catch (IOException iOException) {
            throw new bg(iOException);
        }
        object = xStream.fromXML(string);
        assert (object instanceof aue);
        lea.eoH().a((aue)object);
    }
}

