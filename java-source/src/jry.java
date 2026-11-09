/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class jry {
    public static boolean nUR = true;
    private static final String bP = "[a-zA-Z][a-fA-F]{0,1}[0-9]{2}";
    private static final String nUS = "terrain_";
    private static String nUT = null;

    private jry() {
    }

    public static boolean dRX() {
        return nUR && (lcw.ena() || lcw.enb());
    }

    public static byte[] tg(String string) {
        string = jry.tp(string);
        if (jry.dRX()) {
            return loi.exd().readFile(string);
        }
        return jry.th(lcw.qLa + "/" + string);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static byte[] th(String string) {
        assert (!jry.dRX());
        string = string.toLowerCase();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(string));
            byte[] byArray = new byte[2048];
            int n = 0;
            while ((n = fileInputStream.read(byArray)) != -1) {
                byteArrayOutputStream.write(byArray, 0, n);
            }
            fileInputStream.close();
            byte[] byArray2 = byteArrayOutputStream.toByteArray();
            return byArray2;
        }
        catch (IOException iOException) {
            lfn.b(5, "SFFileUtility", "loadFileDataAbsolute(): '" + string + "' " + iOException);
            iOException.printStackTrace();
            byte[] byArray = null;
            return byArray;
        }
    }

    public static String ti(String string) {
        string = jry.tp(string);
        if (jry.dRX()) {
            byte[] byArray = loi.exd().readFile(string);
            if (byArray == null) {
                throw new FileNotFoundException(string);
            }
            return new String(byArray);
        }
        return jry.tk(lcw.qLa + "/" + string);
    }

    public static boolean tj(String string) {
        string = jry.tp(string);
        if (jry.dRX()) {
            return loi.exd().AQ(string);
        }
        return new File(lcw.qLa + "/" + string).exists();
    }

    public static String tk(String string) {
        string = string.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder(2048);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(string);
            bufferedReader = new BufferedReader(fileReader);
            char[] cArray = new char[2048];
            int n = 0;
            while ((n = bufferedReader.read(cArray)) != -1) {
                stringBuilder.append(cArray, 0, n);
            }
            bufferedReader.close();
        }
        catch (IOException iOException) {
            throw iOException;
        }
        finally {
            if (fileReader != null) {
                fileReader.close();
            }
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        }
        return stringBuilder.toString();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(jrw jrw2, String string) {
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(new FileWriter(jrw2));
            printWriter.write(string);
        }
        catch (IOException iOException) {
            System.out.println("Error saving to SFFile: " + jrw2.getName() + " , Exception: " + iOException);
        }
        finally {
            if (printWriter != null) {
                printWriter.close();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(jrw jrw2, jrw jrw3) {
        boolean bl;
        AbstractInterruptibleChannel abstractInterruptibleChannel = null;
        AbstractInterruptibleChannel abstractInterruptibleChannel2 = null;
        jrw jrw4 = jrw2.dRU();
        if (jrw4.exists() || !(bl = jry.g(jrw4))) {
            // empty if block
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(jrw3);
            abstractInterruptibleChannel = fileInputStream.getChannel();
            FileOutputStream fileOutputStream = new FileOutputStream(jrw2);
            abstractInterruptibleChannel2 = fileOutputStream.getChannel();
            long l = ((FileChannel)abstractInterruptibleChannel2).transferFrom((ReadableByteChannel)((Object)abstractInterruptibleChannel), 0L, ((FileChannel)abstractInterruptibleChannel).size());
            if (l != ((FileChannel)abstractInterruptibleChannel).size()) {
                // empty if block
            }
            fileInputStream.close();
            abstractInterruptibleChannel.close();
            fileOutputStream.close();
            abstractInterruptibleChannel2.close();
        }
        catch (IOException iOException) {
        }
        finally {
            try {
                if (abstractInterruptibleChannel != null) {
                    abstractInterruptibleChannel.close();
                }
                if (abstractInterruptibleChannel2 != null) {
                    abstractInterruptibleChannel2.close();
                }
            }
            catch (IOException iOException) {}
        }
        jrw2.setLastModified(jrw3.lastModified());
    }

    public static boolean g(jrw jrw2) {
        boolean bl = true;
        if (!jrw2.dRU().exists()) {
            bl = jry.g(jrw2.dRU());
        }
        if (!jrw2.exists()) {
            bl = jrw2.mkdir();
            if (!bl) {
                // empty if block
            }
            return bl;
        }
        return true;
    }

    public static String tl(String string) {
        return jry.ae(string, ".xml");
    }

    public static String ae(String string, String string2) {
        int n = string.lastIndexOf(".");
        if (n != -1) {
            if (!string.substring(n).equalsIgnoreCase(string2)) {
                string = string + string2;
            }
        } else {
            string = string + string2;
        }
        return string;
    }

    public static String tm(String string) {
        if (string.endsWith(".xml")) {
            return string.substring(0, string.indexOf("."));
        }
        return string;
    }

    public static String tn(String string) {
        String string2 = string.toLowerCase().replace('\\', '/');
        int n = string2.lastIndexOf(47);
        if (n >= 0) {
            string2 = string2.substring(n + 1);
        }
        return string2;
    }

    public static void a(jrw jrw2, FileFilter fileFilter, List<jrw> list, boolean bl) {
        if (jrw2.isDirectory()) {
            jrw[] jrwArray = null;
            if (fileFilter == null) {
                jrwArray = jrw2.dRT();
            } else {
                if (fileFilter.accept(jrw2)) {
                    list.add(jrw2);
                }
                jrwArray = jrw2.a(fileFilter);
            }
            if (bl) {
                for (int i = 0; i < jrwArray.length; ++i) {
                    jry.a(jrwArray[i], fileFilter, list, bl);
                }
            } else {
                for (int i = 0; i < jrwArray.length; ++i) {
                    list.add(jrwArray[i]);
                }
            }
        } else {
            list.add(jrw2);
        }
    }

    public static void a(jrw jrw2, FileFilter fileFilter, Map<String, jrw> map, boolean bl) {
        String string;
        if (jrw2.isDirectory()) {
            jrw[] jrwArray;
            jrw[] jrwArray2 = jrwArray = fileFilter == null ? jrw2.dRT() : jrw2.a(fileFilter);
            if (bl) {
                for (int i = 0; i < jrwArray.length; ++i) {
                    jry.a(jrwArray[i], fileFilter, map, bl);
                }
            } else {
                for (int i = 0; i < jrwArray.length; ++i) {
                    String string2 = jry.h(jrwArray[i]);
                    if (string2 == null) continue;
                    map.put(string2, jrwArray[i]);
                }
            }
        } else if (fileFilter.accept(jrw2) && (string = jry.h(jrw2)) != null) {
            map.put(string, jrw2);
        }
    }

    private static String h(jrw jrw2) {
        String string = jrw2.getParent();
        String string2 = string.substring(string.lastIndexOf("\\") + 1, string.length());
        return string2;
    }

    public static jrw a(jrw jrw2, String string, boolean bl) {
        Object var3_3 = null;
        string = string.toLowerCase();
        if (!jrw2.isDirectory()) {
            return null;
        }
        ArrayList<jrw> arrayList = lcn.emv();
        jry.a(jrw2, null, arrayList, bl);
        for (jrw jrw3 : arrayList) {
            if (!jrw3.getName().equalsIgnoreCase(string)) continue;
            return jrw3;
        }
        return null;
    }

    public static jrw[] a(jrw jrw2, FilenameFilter filenameFilter) {
        jrw[] jrwArray = jrw2.a(filenameFilter);
        System.out.println("NrOfMathing Files: " + jrwArray.length);
        for (int i = 0; i < jrwArray.length; ++i) {
            if (jrwArray[i].isDirectory()) continue;
            System.out.println("FileName = " + jrwArray[i].getName());
        }
        return jrwArray;
    }

    public static void a(jrw jrw2, boolean bl) {
        if (jrw2.exists()) {
            if (bl) {
                jry.b(jrw2, null);
            } else {
                jrw2.delete();
            }
        }
    }

    public static boolean i(jrw jrw2) {
        return jry.b(jrw2, null);
    }

    public static void j(jrw jrw2) {
        assert (jrw2.isDirectory());
        jrw[] jrwArray = jrw2.dRT();
        for (int i = 0; i < jrwArray.length; ++i) {
            if (jrwArray[i].isDirectory()) {
                jry.c(jrwArray[i]);
                continue;
            }
            if (!jrwArray[i].getName().toLowerCase().endsWith(".xml")) continue;
            jrwArray[i].delete();
        }
    }

    private static void c(File file) {
        if (file.getName().equals(".svn")) {
            return;
        }
        if (file.exists()) {
            File[] fileArray = file.listFiles();
            for (int i = 0; i < fileArray.length; ++i) {
                if (fileArray[i].isDirectory()) {
                    jry.c(fileArray[i]);
                    continue;
                }
                if (!fileArray[i].getName().toLowerCase().endsWith(".xml")) continue;
                fileArray[i].delete();
            }
            file.delete();
        }
    }

    private static boolean b(jrw jrw2, String string) {
        boolean bl = true;
        if (jrw2.isDirectory()) {
            jrw[] jrwArray = jrw2.dRT();
            for (int i = 0; i < jrwArray.length; ++i) {
                if (string != null && jrwArray[i].isDirectory() && jrwArray[i].getName().equalsIgnoreCase(string)) {
                    return bl;
                }
                bl = jry.b(jrwArray[i], string);
                if (bl) continue;
                return bl;
            }
        }
        if (jrw2.delete()) {
            System.out.println("Removed: " + jrw2.getAbsolutePath());
            return true;
        }
        return false;
    }

    public static jrw to(String string) {
        string = jry.tp(string);
        return new jrw(string);
    }

    public static final String tp(String string) {
        if (nUT == null && !(nUT = lcw.qLa.toLowerCase().replace('\\', '/')).endsWith("/")) {
            nUT = nUT + "/";
        }
        String string2 = string.toLowerCase().replace('\\', '/');
        if (jry.dRX() && string2.startsWith(nUT)) {
            string2 = string2.substring(nUT.length());
        }
        if (!jry.dRX() || !string2.equals(string)) {
            // empty if block
        }
        string2 = string2.toLowerCase().replace("//", "/");
        return string2;
    }

    public static final boolean tq(String string) {
        if (nUT == null && !(nUT = lcw.qLa.toLowerCase().replace('\\', '/')).endsWith("/")) {
            nUT = nUT + "/";
        }
        if ((string = string.toLowerCase().replace('\\', '/').replace("./", "")).startsWith(nUT)) {
            return false;
        }
        return !string.startsWith("/") && !string.startsWith(".") && !string.startsWith("dfdata");
    }

    public static final String tr(String string) {
        if (nUT == null && !(nUT = lcw.qLa.toLowerCase().replace('\\', '/')).endsWith("/")) {
            nUT = nUT + "/";
        }
        if (!(string = string.toLowerCase().replace('\\', '/').replace("./", "")).startsWith(nUT)) {
            return null;
        }
        string = string.substring(nUT.length());
        return string;
    }

    public static final String ts(String string) {
        string = nUT + string;
        return string;
    }

    public static final boolean af(String string, String string2) {
        String string3 = string;
        string3 = string3.replace("/", "//");
        string3 = string3.replace("\\", "//");
        return string3.equalsIgnoreCase(string2);
    }

    public static boolean tt(String string) {
        if (jry.tq(string)) {
            return jry.to(lcw.qLb + string).exists();
        }
        return jry.to(string).exists();
    }

    public static String tu(String string) {
        int n = string.lastIndexOf("/");
        if (n != -1) {
            string = string.substring(n + 1);
        }
        if ((n = string.lastIndexOf(46)) != -1) {
            string = string.substring(0, n);
        }
        if (string.contains("/")) {
            n = string.lastIndexOf("/");
            if (n != -1) {
                string = string.substring(n + 1);
            }
            if ((n = string.lastIndexOf(46)) != -1) {
                string = string.substring(0, n);
            }
        }
        return string;
    }

    public static void k(jrw jrw2) {
        jry.b(jrw2, "wb-backup/".substring(0, "wb-backup/".lastIndexOf("/")));
    }

    public static Node g(Node node) {
        if (node != null) {
            NodeList nodeList = node.getChildNodes();
            Node node2 = null;
            for (int i = 0; i < nodeList.getLength(); ++i) {
                node2 = nodeList.item(i);
                if (!node2.getNodeName().equals("SFString")) continue;
                NamedNodeMap namedNodeMap = node2.getAttributes();
                node = namedNodeMap.getNamedItem("Value");
                return node;
            }
        }
        return null;
    }

    public static Node h(Node node) {
        if (node != null) {
            NodeList nodeList = node.getChildNodes();
            Node node2 = null;
            for (int i = 0; i < nodeList.getLength(); ++i) {
                node2 = nodeList.item(i);
                if (!node2.getNodeName().equals("SFBool")) continue;
                NamedNodeMap namedNodeMap = node2.getAttributes();
                node = namedNodeMap.getNamedItem("Value");
                return node;
            }
        }
        return null;
    }

    public static Node i(Node node) {
        if (node != null) {
            NodeList nodeList = node.getChildNodes();
            Node node2 = null;
            for (int i = 0; i < nodeList.getLength(); ++i) {
                node2 = nodeList.item(i);
                if (!node2.getNodeName().equals("SFInteger")) continue;
                NamedNodeMap namedNodeMap = node2.getAttributes();
                node = namedNodeMap.getNamedItem("Value");
                return node;
            }
        }
        return null;
    }

    public static Node j(Node node) {
        if (node != null) {
            NodeList nodeList = node.getChildNodes();
            Node node2 = null;
            for (int i = 0; i < nodeList.getLength(); ++i) {
                node2 = nodeList.item(i);
                if (!node2.getNodeName().equals("SFFloat")) continue;
                NamedNodeMap namedNodeMap = node2.getAttributes();
                node = namedNodeMap.getNamedItem("Value");
                return node;
            }
        }
        return null;
    }

    public static Node k(Node node) {
        if (node != null) {
            NodeList nodeList = node.getChildNodes();
            Node node2 = null;
            for (int i = 0; i < nodeList.getLength(); ++i) {
                node2 = nodeList.item(i);
                if (!node2.getNodeName().equals("SFDouble")) continue;
                NamedNodeMap namedNodeMap = node2.getAttributes();
                node = namedNodeMap.getNamedItem("Value");
                return node;
            }
        }
        return null;
    }

    public static Node l(Node node) {
        if (node != null) {
            NodeList nodeList = node.getChildNodes();
            Node node2 = null;
            for (int i = 0; i < nodeList.getLength(); ++i) {
                node2 = nodeList.item(i);
                if (!node2.getNodeName().equals("SFVector3")) continue;
                return node2;
            }
        }
        return null;
    }

    public static boolean tv(String string) {
        String string2 = jry.tu(string);
        if (!(string2 = string2.toLowerCase()).startsWith(nUS)) {
            return false;
        }
        return Pattern.matches(bP, string2 = string2.substring(nUS.length()));
    }

    public static boolean a(jrw jrw2, int n) {
        Object var2_2 = null;
        if (jrw2.exists()) {
            Document document = null;
            try {
                document = jsy.n(jrw2);
            }
            catch (bo bo2) {
                return false;
            }
            Node node = jsy.a("SFObjectSpace", (Node)document);
            if (node != null) {
                List<Node> list = jsy.c("SFWorldMeshObject", node);
                for (Node node2 : list) {
                    node = jsy.a("DescriptionFilename", node2);
                    String string = jsy.m(node);
                    if (!string.toLowerCase().startsWith("terrain/terrain_") || node == null) continue;
                    node = jsy.a("ResourceType", node2);
                    if (node == null) {
                        jta jta2 = new jta();
                        Element element = jta2.a(document, n, "ResourceType");
                        node2.appendChild(element);
                    } else {
                        if ((node = jry.i(node)) == null) {
                            return false;
                        }
                        node.setNodeValue(Integer.toString(n));
                    }
                    jsz.a(document, jrw2);
                }
            }
        }
        return true;
    }
}

