/*
 * Decompiled with CFR.
 */
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class jtv {
    public static boolean e(String string, Map<String, bso> map) {
        Document document = null;
        document = jsy.tK(string);
        if (document == null) {
            lfn.b(5, "SFDynamicObjectsExtraParser", "loadDynamicObjectExtrasXml() :failed to parse " + string);
            return false;
        }
        Node node = jsy.a("SFDynamicObjects", document);
        List<Node> list = jsy.c("SFDynamicObject", node);
        dez dez2 = new dez();
        for (Node node2 : list) {
            Object object;
            bso bso2 = new bso();
            String string2 = node2.getAttributes().getNamedItem("XmlName").getNodeValue();
            string2 = string2.replaceAll("\\\\", "/").toLowerCase();
            string2 = string2.replaceAll("//", "/");
            List<Node> list2 = jsy.c("SFLevelObjectSoundEmitter", node2);
            for (Node node3 : list2) {
                object = new btc();
                ((btc)object).b(node3);
                bso2.awY().add((btc)object);
            }
            List<Node> list3 = jsy.c("SFLightRepresentation", node2);
            Iterator object22 = list3.iterator();
            while (object22.hasNext()) {
                object = (Node)object22.next();
                dfq dfq2 = (dfq)dez2.Af(28);
                dfq2.b((Node)object);
                bso2.awZ().add(dfq2);
            }
            map.put(string2, bso2);
        }
        return true;
    }
}

