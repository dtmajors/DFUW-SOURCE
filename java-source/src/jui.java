/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class jui {
    Map<Integer, Boolean> oRZ = lcn.emw();

    public void a(String string, les les2, les les3) {
        Document document;
        block2: {
            document = null;
            try {
                document = jsy.tJ(string);
            }
            catch (bg bg2) {
                lfn.b(5, "SFMarketLayoutParserNew", "loadFile() Failed to load file " + string);
                if ($assertionsDisabled) break block2;
                throw new AssertionError();
            }
        }
        Node node = jsy.e("XML", document);
        node = jsy.e("MarketNode", node);
        this.a(node, les2, les3, null);
    }

    protected void a(Node node, les les2, les les3, lgw lgw2) {
        lgw lgw3;
        Object object;
        Node node2 = node.getAttributes().getNamedItem("BuildType");
        if (node2 != null) {
            object = node2.getNodeValue().split(",");
            boolean bl = false;
            for (String object2 : object) {
                if (Integer.valueOf(object2) != lcw.bcB) continue;
                bl = true;
            }
            if (!bl) {
                return;
            }
        }
        if ((lgw3 = (lgw)les3.zx((String)(object = node.getAttributes().getNamedItem("Resource").getNodeValue()))) == null) {
            lfn.b(5, "SFMarketLayoutParser", "parseXMLNode There is no resource for resource type : " + (String)object);
            assert (false);
            return;
        }
        lgw lgw4 = new lgw();
        lgw4.setName(lgw3.getName());
        lgw4.setType(lgw3.getType());
        les2.a((ler)lgw2, lgw4, null);
        List<Node> list = jsy.c("MarketNode", node);
        for (Node node3 : list) {
            this.a(node3, les2, les3, lgw4);
        }
    }

    protected void a(les les2, les les3, lgw lgw2, lgw object) {
        Object object2;
        Boolean bl = this.oRZ.get(lgw2.getType());
        boolean bl2 = false;
        if (bl != null) {
            bl2 = true;
            if (bl.booleanValue()) {
                return;
            }
        }
        if (!bl2) {
            object2 = new lgw();
            ((ler)object2).setName(lgw2.getName());
            ((ler)object2).setType(lgw2.getType());
            les2.a((ler)object, (ler)object2, null);
            object = object2;
        }
        object2 = les3.a((ler)lgw2, false, true);
        Iterator iterator = object2.iterator();
        while (iterator.hasNext()) {
            ler ler2 = (ler)iterator.next();
            lgw lgw3 = (lgw)ler2;
            this.a(les2, les3, lgw3, (lgw)object);
        }
    }
}

