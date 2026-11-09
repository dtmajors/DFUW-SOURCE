/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class jve {
    public static final lju oRy = new lju(0, 1, 0);
    private Map oRO = lcn.emw();
    private les lPy = lea.eoa();
    private les aqN = lea.enZ();

    public void us(String string) {
        if (string == null) {
            throw new bi("FilePath is null.");
        }
        try {
            Document document = jsy.tJ(string);
            jsy.a(document, oRy);
            Node node = jsy.d("XML", document);
            node = jsy.d("Skill", node);
            lhg lhg2 = (lhg)this.aqN.eqq();
            this.lPy.a(null, lhg2, null);
            this.a(node, lhg2);
            this.oRO.clear();
        }
        catch (bg bg2) {
            throw new bg("Parsing of file '" + string + "' failed.", bg2);
        }
    }

    private void a(Node node, lhg lhg2) {
        int n;
        assert (node != null);
        assert (lhg2 != null);
        List<Node> list = jsy.c("Skill", node);
        if (list.isEmpty()) {
            return;
        }
        ArrayList<lhg> arrayList = lcn.abH(list.size());
        Node node2 = null;
        lhg lhg3 = null;
        for (int i2 = 0; i2 < list.size(); ++i2) {
            try {
                node2 = list.get(i2);
                lhg3 = this.ao(node2);
            }
            catch (bg bg2) {
                throw new bg("Parsing of node " + i2 + " failed.", bg2);
            }
            arrayList.add(lhg3);
            this.oRO.put(lhg3, node2);
        }
        Collections.sort(arrayList);
        lhg lhg4 = null;
        for (n = arrayList.size() - 1; n >= 0; --n) {
            lhg3 = (lhg)arrayList.get(n);
            lhg4 = n == arrayList.size() - 1 ? null : (lhg)arrayList.get(n + 1);
            this.lPy.a((ler)lhg2, lhg3, (ler)lhg4);
        }
        for (n = 0; n < arrayList.size(); ++n) {
            lhg3 = (lhg)arrayList.get(n);
            node2 = (Node)this.oRO.get(lhg3);
            assert (node2 != null);
            this.a(node2, lhg3);
        }
    }

    private lhg ao(Node node) {
        String string = jsy.i(node, "Name");
        if (string == null || string.trim().equals("")) {
            throw new bj("Attribute 'Name' has invalid value.");
        }
        int n = this.aqN.getType(string);
        if (n < 0) {
            throw new bg("SkillName '" + string + "' is invalid.");
        }
        return (lhg)this.aqN.acv(n);
    }
}

