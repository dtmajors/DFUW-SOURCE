/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.regex.Pattern;
import org.w3c.dom.Document;

public class myz {
    public static String[] EUS;

    public static boolean an(jrw jrw2) {
        if (EUS == null) {
            try {
                myz.eTr();
            }
            catch (bg bg2) {
                bg2.printStackTrace();
                return false;
            }
        }
        jrw jrw3 = new jrw(lcw.qLb + "xml/shader/");
        jrw[] jrwArray = jrw3.a(new jsl("xml"));
        String string = jrw2.getName().toLowerCase();
        for (String string2 : EUS) {
            if (!Pattern.matches(string2, string)) continue;
            return true;
        }
        return false;
    }

    public static void eTq() {
        XStream xStream = new XStream(new DomDriver());
        xStream.setClassLoader(r.cr);
        String string = xStream.toXML(EUS);
        Document document = jsy.tL(string);
        String string2 = lcw.qLb + "xml-files/worldbuilder/object_blacklist.xml";
        jsz.a(document, new jrw(string2));
    }

    public static void eTr() {
        XStream xStream = new XStream(new DomDriver());
        xStream.setClassLoader(r.cr);
        String string = lcw.qLb + "xml-files/worldbuilder/object_blacklist.xml";
        string = string.toLowerCase();
        String string2 = "";
        try {
            string2 = jry.tk(string);
        }
        catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return;
        }
        assert (string2.length() > 0);
        Object object = xStream.fromXML(string2);
        assert (object instanceof String[]);
        EUS = (String[])object;
    }
}

