/*
 * Decompiled with CFR.
 */
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;

public class jsz {
    private static final boolean bC = false;
    private static Transformer nWF = null;

    protected jsz() {
    }

    private static void dSC() {
        if (nWF == null) {
            try {
                nWF = TransformerFactory.newInstance().newTransformer();
            }
            catch (TransformerConfigurationException transformerConfigurationException) {
                transformerConfigurationException.printStackTrace();
                assert (false);
                return;
            }
        }
        nWF.setOutputProperty("indent", "yes");
        nWF.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
        nWF.setOutputProperty("encoding", "UTF-8");
        nWF.setOutputProperty("omit-xml-declaration", "no");
    }

    public static boolean a(Document document, OutputStream outputStream) {
        if (nWF == null) {
            jsz.dSC();
        }
        jsz.dSC();
        DOMSource dOMSource = new DOMSource(document);
        StreamResult streamResult = new StreamResult(outputStream);
        try {
            nWF.transform(dOMSource, streamResult);
            nWF.reset();
            outputStream.flush();
            return true;
        }
        catch (TransformerException transformerException) {
            nWF.reset();
            lfn.b(0, "SFXMLFileWriter", "writeToStream(): Transformer Exception = " + transformerException);
            return false;
        }
        catch (IOException iOException) {
            lfn.b(0, "SFXMLFileWriter", "writeToStream(): IO Exception = " + iOException);
            return false;
        }
    }

    public static void b(Document document, String string) {
        jsz.a(document, string, false);
    }

    public static void a(Document document, String string, boolean bl) {
        jsz.a(document, new jrw(string), bl);
    }

    public static String d(Document document) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (jsz.a(document, byteArrayOutputStream)) {
            return new String(byteArrayOutputStream.toByteArray(), Charset.forName("UTF-8"));
        }
        return null;
    }

    public static boolean a(Document document, jrw jrw2) {
        return jsz.a(document, jrw2, false);
    }

    public static boolean b(Document document, jrw jrw2) {
        return jsz.a(document, jrw2, false);
    }

    private static boolean a(Document document, jrw jrw2, boolean bl) {
        String string = jrw2.getParent();
        String string2 = jrw2.getName().toLowerCase();
        string2 = jsz.tM(string2);
        if (string == null) {
            lfn.b(5, "SFXMLFileWriter", "writeNodeToFile() Can't write node to tile. [" + jrw2 + "] is NULL parentdir!");
        }
        jrw2 = new jrw(string + "/" + string2);
        if (bl) {
            jsz.o(jrw2);
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(jrw2);
            boolean bl2 = jsz.a(document, fileOutputStream);
            fileOutputStream.close();
            return bl2;
        }
        catch (IOException iOException) {
            lfn.b(5, "SFXMLFileWriter", "writeNodeToFile() : IO Exception = " + iOException);
            return false;
        }
    }

    private static jrw o(jrw jrw2) {
        jrw jrw3 = null;
        if (jrw2.exists()) {
            boolean bl;
            String string = jrw2.getParent();
            String string2 = jrw2.getName();
            String string3 = string + "/" + "wb-backup/";
            jrw jrw4 = new jrw(string3);
            if (!jrw4.exists() && !(bl = jrw4.mkdir())) {
                lfn.b(5, "SFXMLFileWriter", "backupTheOldFile() : Could not make backup directory [" + jrw4 + "] !");
                string3 = string;
            }
            jrw jrw5 = new jrw(string3 + string2);
            jrw3 = jrw2;
            while (jrw3.exists()) {
                jrw3 = new jrw(jrw5.getAbsolutePath() + "." + Long.toString(System.currentTimeMillis()));
            }
            boolean bl2 = jrw2.renameTo(jrw3);
            if (!bl2) {
                lfn.b(5, "SFXMLFileWriter", "backupTheOldFile() : Could not rename SFFile: [" + jrw2 + "] to [" + jrw3 + "]");
            }
        }
        return jrw3;
    }

    private static String tM(String string) {
        int n = string.lastIndexOf(".");
        if (n != -1) {
            if (!string.substring(n).equalsIgnoreCase(".xml")) {
                string = string + ".xml";
            }
        } else {
            string = string + ".xml";
        }
        return string;
    }
}

