/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class mzz {
    private lfn ga = lfn.eqw();
    private jrw EVp;
    private Document cn;

    public boolean ay(jrw jrw2) {
        this.EVp = jrw2;
        try {
            this.cn = jsy.n(jrw2);
        }
        catch (bo bo2) {
            lfn.b(5, "SFXMLFileShaderUpdater", "parseFile() : Exception: " + bo2);
            return false;
        }
        return true;
    }

    public void aX(String string, String string2) {
        if (this.cn != null) {
            Node node = jsy.a("Shaders", this.cn);
            if (node != null) {
                if ((node = jsy.a(string, node)) != null) {
                    if ((node = jsy.a("GlobalShader", node)) != null) {
                        String string3 = jsy.m(node);
                        Node node2 = this.fw(node);
                        node2.setNodeValue(string2);
                        lfn.b(0, this.getClass().getName(), "Found Global Shader [" + string3 + "] for Version [" + string + "]");
                    } else {
                        lfn.b(5, this.getClass().getName(), "No GlobalShader found");
                    }
                } else {
                    lfn.b(5, this.getClass().getName(), "No shader with version [" + string + "] found");
                }
            } else {
                lfn.b(5, this.getClass().getName(), "No Shaders node found");
            }
        } else {
            lfn.b(5, this.getClass().getName(), "Could not update shader. Doc for SFFile [" + this.EVp + "] is null!");
        }
    }

    public Node fw(Node node) {
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
            lfn.b(5, this.getClass().getName(), "Did not find SFString Node for: " + node.getNodeName() + " !");
        }
        return null;
    }

    public void eTC() {
        if (this.EVp != null && this.EVp.exists() && this.cn != null) {
            jsz.a(this.cn, this.EVp);
        }
    }
}

