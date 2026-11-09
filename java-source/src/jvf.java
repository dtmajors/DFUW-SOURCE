/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class jvf {
    public void b(String string, les les2) {
        Document document;
        block2: {
            document = null;
            try {
                document = jsy.tJ(string);
            }
            catch (bg bg2) {
                lfn.b(5, "SFSkillLayoutParserNew", "loadFile() Failed to load file " + string);
                if ($assertionsDisabled) break block2;
                throw new AssertionError();
            }
        }
        Node node = jsy.e("XML", document);
        node = jsy.e("GUISkillTree", node);
        this.a(node, les2, null, null);
    }

    public ldy a(Node node, les les2, ldy ldy2, ldy ldy3) {
        Object object;
        ldy ldy4 = new ldy();
        if (ldy2 != null) {
            int n;
            int n2;
            int n3;
            Object object2;
            Object object3;
            object = node.getAttributes().getNamedItem("Name").getNodeValue();
            ldy4.setName((String)object);
            int n4 = lea.enZ().getType((String)object);
            ldy4.setType(n4);
            if (n4 == -1) {
                lfn.b(5, "SFSkillLayoutParserNew", "parseNode() could not find skill " + (String)object);
                assert (false);
                return ldy4;
            }
            String string = node.getAttributes().getNamedItem("Type").getNodeValue().toUpperCase();
            ldy4.a(ldy.a.valueOf(string));
            String string2 = node.getAttributes().getNamedItem("Radial").getNodeValue().toLowerCase();
            ldy4.yo(string2.equals("true"));
            Node node2 = node.getAttributes().getNamedItem("Color");
            if (node2 != null && ((String[])(object3 = ((String)(object2 = node2.getNodeValue())).split(" "))).length == 3) {
                n3 = Integer.valueOf(object3[0]);
                n2 = Integer.valueOf(object3[1]);
                n = Integer.valueOf((String)object3[2]);
                ldy4.setColor(n3 << 16 | n2 << 8 | n);
            }
            if ((node2 = node.getAttributes().getNamedItem("BackColor")) != null && ((String[])(object3 = ((String)(object2 = node2.getNodeValue())).split(" "))).length == 3) {
                n3 = Integer.valueOf(object3[0]);
                n2 = Integer.valueOf((String)object3[1]);
                n = Integer.valueOf((String)object3[2]);
                ldy4.acj(n3 << 16 | n2 << 8 | n);
            }
            if ((object2 = node.getAttributes().getNamedItem("Improves")) != null) {
                object3 = object2.getNodeValue().split(";");
                for (n3 = 0; n3 < ((Object)object3).length; ++n3) {
                    ldy.b b2 = ldy.b.getByName((String)object3[n3]);
                    if (b2 == null) {
                        lfn.b(5, "SFSkillLayoutParserNew", "parseNode() invalid improves name " + (String)object3[n3]);
                        assert (false);
                        continue;
                    }
                    ldy4.enM().add(b2);
                }
            }
            if ((object3 = node.getAttributes().getNamedItem("IPS")) != null && object3.getNodeValue().equalsIgnoreCase("true")) {
                ldy4.yp(true);
            }
        } else {
            ldy4.setName("Root");
            ldy4.setType(-2);
        }
        les2.a((ler)ldy2, ldy4, (ler)ldy3);
        object = jsy.c("GUISkill", node);
        ldy ldy5 = null;
        for (int i2 = object.size() - 1; i2 >= 0; --i2) {
            ldy5 = this.a((Node)object.get(i2), les2, ldy4, ldy5);
        }
        return ldy4;
    }
}

