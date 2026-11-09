/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class jzt {
    public Map<Integer, cab> vK(String string) {
        Map<Integer, cab> map = lcn.emw();
        Document document = null;
        document = jsy.tK(string);
        if (document == null) {
            assert (false);
            return null;
        }
        Node node = jsy.a("SFDyes", (Node)document);
        List<Node> list = jsy.c("SFDye", node);
        for (Node node2 : list) {
            cab cab2 = new cab();
            cab2.setId(Integer.valueOf(node2.getAttributes().getNamedItem("ID").getNodeValue()));
            cab2.l(lea.enW().getType(node2.getAttributes().getNamedItem("ResourceName").getNodeValue()));
            if (cab2.az() == -1) assert (false);
            cab2.setPower(Float.valueOf(node2.getAttributes().getNamedItem("SpecularPower").getNodeValue()).floatValue());
            String[] stringArray = node2.getAttributes().getNamedItem("Color").getNodeValue().split(",");
            int n = Integer.valueOf(stringArray[0]);
            int n2 = Integer.valueOf(stringArray[1]);
            int n3 = Integer.valueOf(stringArray[2]);
            float f = Float.valueOf(node2.getAttributes().getNamedItem("SpecularStrength").getNodeValue()).floatValue();
            cab2.a(new ljr(f, (float)n / 255.0f, (float)n2 / 255.0f, (float)n3 / 255.0f));
            map.put(cab2.getId(), cab2);
        }
        return map;
    }
}

