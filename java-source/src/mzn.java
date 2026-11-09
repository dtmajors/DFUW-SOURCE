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
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.w3c.dom.Document;

public class mzn {
    public static String[] EUS;

    public static List<String> eTv() {
        if (EUS == null) {
            try {
                mzn.eTx();
            }
            catch (bg bg2) {
                bg2.printStackTrace();
                return lcn.emv();
            }
        }
        jrw jrw2 = new jrw(lcw.qLb + "xml/shader/");
        jrw[] jrwArray = jrw2.a(new jsl("xml"));
        ArrayList<String> arrayList = lcn.emv();
        for (int i = 0; i < jrwArray.length; ++i) {
            String string = jrwArray[i].getName().toLowerCase();
            boolean bl = true;
            if (!string.startsWith("shader")) {
                bl = false;
            } else {
                for (String string2 : EUS) {
                    if (!Pattern.matches(string2, string)) continue;
                    bl = false;
                }
            }
            if (!bl) continue;
            arrayList.add(string);
        }
        return arrayList;
    }

    public static void eTw() {
        XStream xStream = new XStream(new DomDriver());
        xStream.setClassLoader(r.cr);
        String string = xStream.toXML(EUS);
        Document document = jsy.tL(string);
        String string2 = lcw.qLb + "xml-files/worldbuilder/shaderexclusion.xml";
        jsz.a(document, new jrw(string2));
    }

    private static void eTx() {
        XStream xStream = new XStream(new DomDriver());
        xStream.setClassLoader(r.cr);
        String string = lcw.qLb + "xml-files/worldbuilder/shaderexclusion.xml";
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

