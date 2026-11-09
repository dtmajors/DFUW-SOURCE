/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.Annotations;
import org.w3c.dom.Document;

public class jsx {
    public static void a(jsw jsw2) {
        XStream xStream = new XStream(new jsn());
        xStream.setMode(1001);
        xStream.setClassLoader(r.cr);
        Annotations.configureAliases(xStream, jsw.class);
        String string = xStream.toXML(jsw2);
        Document document = jsy.tL(string);
        String string2 = lcw.qLb + "xml/audio/monsterstatesoundsindex.xml";
        jsz.a(document, new jrw(string2));
    }

    public static jsw dSz() {
        XStream xStream = new XStream(new jsn());
        xStream.setMode(1001);
        xStream.setClassLoader(r.cr);
        Annotations.configureAliases(xStream, jsw.class);
        String string = jry.ti("xml/audio/monsterstatesoundsindex.xml");
        jsw jsw2 = (jsw)xStream.fromXML(string);
        return jsw2;
    }
}

