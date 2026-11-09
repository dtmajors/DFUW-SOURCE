/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import com.sun.org.apache.xml.internal.serialize.BaseMarkupSerializer;
import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringWriter;
import java.util.Map;
import java.util.Set;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class jud {
    private static final String oQQ = "holding_village_map";
    private static final String oRG = "holding";
    private static final String oRH = "village";
    private static final String oRI = "id";
    private static Map<String, Set<String>> oRJ = lcn.emw();

    public static Map<String, Set<String>> getMap() {
        return oRJ;
    }

    private jud() {
    }

    public static void dTp() {
        String string = "xml-files/server/gamelogicinfo/holding_to_village_map.xml";
        Document document = null;
        try {
            document = jsy.tJ(string);
        }
        catch (bo bo2) {
            lfn.b(5, jud.class.getSimpleName(), "parseMapFile() : Exception encountered while creating XML document object!!! Exception Message = " + bo2.getMessage());
            assert (false);
            throw bo2;
        }
        oRJ.clear();
        NodeList nodeList = document.getElementsByTagName(oRG);
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            Node node = nodeList.item(i2);
            if (node.getNodeType() != 1) continue;
            Element element = (Element)node;
            String string2 = element.getAttribute(oRI);
            if (string2 == null) {
                lfn.b(5, jud.class.getSimpleName(), "parseMapFile() : Failed to Retrieve ID Attribute from Holding Node!!!... Node = " + node);
                assert (false);
                throw new bq("Failed to Retrieve Name Attribute from Holding Node!!!");
            }
            Set<String> set = lcn.emx();
            oRJ.put(string2, set);
            NodeList nodeList2 = element.getElementsByTagName(oRH);
            for (int i3 = 0; i3 < nodeList2.getLength(); ++i3) {
                Node node2 = nodeList2.item(i3);
                if (node2.getNodeType() != 1) continue;
                Element element2 = (Element)node2;
                String string3 = element2.getAttribute(oRI);
                if (string3 == null) {
                    lfn.b(5, jud.class.getSimpleName(), "parseMapFile() : Failed to Retrieve ID Attribute from Village Node!!!... Node = " + node2);
                    assert (false);
                    throw new bq("Failed to Retrieve ID Attribute from Village Node!!!");
                }
                if (set.contains(string3.toLowerCase())) continue;
                set.add(string3.toLowerCase());
            }
            if (!set.isEmpty()) continue;
            oRJ.remove(string2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void M(Map<String, Set<String>> map) {
        Object object;
        Object object3;
        if (map == null) {
            return;
        }
        Document document = null;
        try {
            object3 = jtf.dSE();
            document = ((DocumentBuilder)object3).newDocument();
        }
        catch (Exception exception) {
            lfn.b(5, jud.class.getSimpleName(), "saveMapToFile() : Exception encountered while creating XML document object!!! Exception Message = " + exception.getMessage());
            assert (false);
            return;
        }
        object3 = document.createElement(oQQ);
        document.appendChild((Node)object3);
        for (Map.Entry<String, Set<String>> object22 : map.entrySet()) {
            object = document.createElement(oRG);
            object.setAttribute(oRI, object22.getKey());
            for (String string : object22.getValue()) {
                Element element = document.createElement(oRH);
                element.setAttribute(oRI, string);
                object.appendChild(element);
            }
            object3.appendChild((Node)object);
        }
        StringWriter stringWriter = new StringWriter();
        OutputFormat outputFormat = new OutputFormat();
        outputFormat.setVersion("1.0");
        outputFormat.setEncoding("UTF-8");
        outputFormat.setStandalone(false);
        outputFormat.setIndenting(true);
        outputFormat.setIndent(4);
        object = new XMLSerializer(stringWriter, outputFormat);
        Object object2 = null;
        try {
            ((BaseMarkupSerializer)object).serialize(document);
            object2 = new BufferedOutputStream(new FileOutputStream(lcw.qLb + "/" + "xml-files/server/gamelogicinfo/" + "holding_to_village_map.xml"));
            ((OutputStream)object2).write(stringWriter.toString().getBytes());
            ((OutputStream)object2).flush();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        finally {
            if (object2 != null) {
                try {
                    ((OutputStream)object2).close();
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                }
            }
        }
    }
}

