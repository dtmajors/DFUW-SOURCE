/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class jxk {
    private Node oYC;
    private Document cn = null;

    public List<String> vh(String string) {
        ArrayList<String> arrayList = lcn.emv();
        jrw jrw2 = new jrw(string);
        try {
            this.cn = jsy.n(jrw2);
            this.oYC = jsy.a("SFInteractionInventory", (Node)this.cn);
            if (this.oYC != null) {
                List<Node> list = jsy.c("SFItemRepresentation", this.oYC);
                for (int i2 = 0; i2 < list.size(); ++i2) {
                    Node node = jsy.a("SFResourceName", list.get(i2));
                    String string2 = jsy.m(node);
                    arrayList.add(string2);
                }
            }
        }
        catch (bo bo2) {
            // empty catch block
        }
        return arrayList;
    }

    public boolean H(jrw jrw2) {
        try {
            this.cn = jsy.n(jrw2);
            this.oYC = jsy.a("SFResource", (Node)this.cn);
            if (this.oYC != null) {
                return true;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return false;
    }
}

