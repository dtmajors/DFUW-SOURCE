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

public class mze {
    public static void a(dy dy2) {
        XStream xStream = new XStream(new DomDriver());
        mze.b(xStream);
        String string = xStream.toXML(dy2);
        Document document = jsy.tL(string);
        String string2 = lcw.qLb + "xml-files/worldbuilder/minimap_config.xml";
        jsz.a(document, new jrw(string2));
    }

    public static dy eTt() {
        Object object;
        XStream xStream = new XStream(new DomDriver());
        mze.b(xStream);
        String string = "";
        try {
            object = lcw.qLb + "xml-files/worldbuilder/minimap_config.xml";
            string = jry.tk((String)object);
        }
        catch (FileNotFoundException fileNotFoundException) {
            throw new bg(fileNotFoundException);
        }
        catch (IOException iOException) {
            throw new bg(iOException);
        }
        object = xStream.fromXML(string);
        assert (object instanceof dy);
        return (dy)object;
    }

    private static void b(XStream xStream) {
        xStream.setMode(1001);
        xStream.setClassLoader(r.cr);
        Annotations.configureAliases(xStream, dy.class);
    }
}

