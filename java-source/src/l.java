/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public class l {
    private jrw cm;
    private Document cn;

    public boolean v() {
        return this.b(lcw.qLb + "xml-files/config/" + "configuration_standalone_dflauncher.xml");
    }

    public boolean b(String string) {
        this.cm = new jrw(string);
        this.cn = null;
        try {
            this.cn = jsy.n(this.cm);
        }
        catch (bo bo2) {
            bo2.printStackTrace();
        }
        if (this.cn == null) {
            lfn.b(5, "SFConfigParser", "parseConfigurationFile() Invalid Document: [" + string + "]");
            return false;
        }
        return true;
    }

    public void e(String string) {
        if (this.cn == null || this.cm == null) assert (false) : "Document not parsed, or ConfigFile == null !";
        Node node = jsy.a("SFConfiguration", (Node)this.cn);
        if (node == null) assert (false);
        Node node2 = jsy.a("ActiveZone", node);
        if (node2 != null) {
            if ((node2 = jry.g(node2)) == null) {
                assert (false);
                return;
            }
            node2.setNodeValue(string);
        }
    }

    public void f(String string) {
        if (this.cn == null) assert (false) : "Document not parsed!";
        Node node = jsy.a("SFConfiguration", (Node)this.cn);
        if (node == null) assert (false);
        Node node2 = jsy.a("UserName", node);
        if (node2 != null) {
            if ((node2 = jry.g(node2)) == null) {
                assert (false);
                return;
            }
            node2.setNodeValue(string);
        }
    }

    public void a(boolean bl) {
        if (this.cn == null) assert (false) : "Document not parsed!";
        Node node = jsy.a("SFConfiguration", (Node)this.cn);
        if (node == null) assert (false);
        Node node2 = jsy.a("ChangeSkillDirectories", node);
        if (node2 != null) {
            if ((node2 = jry.h(node2)) == null) {
                assert (false);
                return;
            }
            node2.setNodeValue(Boolean.toString(bl));
        }
    }

    public void g(String string) {
        if (this.cn == null) assert (false) : "Document not parsed!";
        Node node = jsy.a("SFConfiguration", (Node)this.cn);
        if (node == null) assert (false);
        Node node2 = jsy.a("WorldDataFile", node);
        if (node2 != null) {
            if ((node2 = jry.g(node2)) == null) {
                assert (false);
                return;
            }
            node2.setNodeValue(string);
        }
    }

    public void b(boolean bl) {
        if (this.cn == null || this.cm == null) assert (false) : "Document not parsed, or ConfigFile == null !";
        Node node = jsy.a("SFConfiguration", (Node)this.cn);
        if (node == null) {
            assert (false);
            return;
        }
        Node node2 = jsy.a("EnableCharacterCreator", node);
        if (node2 != null) {
            if ((node2 = jry.h(node2)) == null) {
                assert (false);
                return;
            }
            node2.setNodeValue(Boolean.toString(bl));
        } else {
            lfn.b(0, this.getClass().getName(), "setStartCharacterCreator : Creating new Node");
            jta jta2 = new jta();
            node2 = jta2.a(this.cn, bl, "EnableCharacterCreator");
            node.appendChild(node2);
        }
    }

    public void c(boolean bl) {
        if (this.cn == null || this.cm == null) assert (false) : "Document not parsed, or ConfigFile == null !";
        Node node = jsy.a("SFConfiguration", (Node)this.cn);
        if (node == null) {
            assert (false);
            return;
        }
        Node node2 = jsy.a("UseEnvironmentSystem", node);
        if (node2 != null) {
            if ((node2 = jry.h(node2)) == null) {
                assert (false);
                return;
            }
            node2.setNodeValue(Boolean.toString(bl));
        } else {
            lfn.b(0, this.getClass().getName(), "setStartCharacterCreator : Creating new Node");
            jta jta2 = new jta();
            node2 = jta2.a(this.cn, bl, "UseEnvironmentSystem");
            node.appendChild(node2);
        }
    }

    public void b(int n) {
        if (this.cn == null || this.cm == null) assert (false) : "Document not parsed, or ConfigFile == null !";
        Node node = jsy.a("SFConfiguration", (Node)this.cn);
        if (node == null) {
            assert (false);
            return;
        }
        Node node2 = jsy.a("EnvironmentRealsSecondsInGametimeSeconds", node);
        if (node2 != null) {
            if ((node2 = jry.i(node2)) == null) {
                assert (false);
                return;
            }
            node2.setNodeValue(Integer.toString(n));
        } else {
            lfn.b(0, this.getClass().getName(), "setStartCharacterCreator : Creating new Node");
            jta jta2 = new jta();
            node2 = jta2.a(this.cn, n, "EnvironmentRealsSecondsInGametimeSeconds");
            node.appendChild(node2);
        }
    }

    public void h(String string) {
        if (this.cn == null) assert (false) : "Document not parsed!";
        Node node = jsy.a("SFConfiguration", (Node)this.cn);
        if (node == null) {
            assert (false);
            return;
        }
        Node node2 = jsy.a("EnvironmentDefaultConfig", node);
        if (node2 != null) {
            if ((node2 = jry.g(node2)) == null) {
                assert (false);
                return;
            }
            node2.setNodeValue(string);
            return;
        }
        jta jta2 = new jta();
        node2 = jta2.a(this.cn, string, "EnvironmentDefaultConfig");
        node.appendChild(node2);
    }

    public void x() {
        if (this.cn == null || this.cm == null) {
            assert (false) : "Document not parsed, or config is null!";
            return;
        }
        jsz.a(this.cn, this.cm);
    }

    public boolean i(String string) {
        String string2 = lcw.qLb + "xml-files/zones/" + "zones_distributor_config.xml";
        jrw jrw2 = new jrw(string2);
        Document document = null;
        try {
            document = jsy.n(jrw2);
        }
        catch (bo bo2) {
            bo2.printStackTrace();
        }
        if (document == null) {
            lfn.b(5, "SFConfigParser", "setActiveZoneInZonesDistributorConfig() Invalid Document: [" + string2 + "]");
            return false;
        }
        try {
            String string3 = "SFZoneConfig";
            Node node = jsy.a(string3, (Node)document);
            if (node == null) {
                lfn.b(5, "SFDarkfallConfigManipulator", "setActiveZoneInZonesDistributorConfig() Could not find node: " + string3);
                return false;
            }
            string3 = "ActiveZones";
            Node node2 = jsy.a(string3, node);
            if (node2 == null) {
                lfn.b(5, "SFDarkfallConfigManipulator", "setActiveZoneInZonesDistributorConfig() Could not find node: " + string3);
            }
            if ((node2 = jsy.a(string3 = "Zone", node2)) == null) {
                lfn.b(5, "SFDarkfallConfigManipulator", "setActiveZoneInZonesDistributorConfig() Could not find node: " + string3);
                return false;
            }
            string3 = "Name";
            NamedNodeMap namedNodeMap = node2.getAttributes();
            if ((node2 = namedNodeMap.getNamedItem(string3)) == null) {
                lfn.b(5, "SFDarkfallConfigManipulator", "setActiveZoneInZonesDistributorConfig() Could not find node: " + string3);
                return false;
            }
            node2.setNodeValue(string);
            jsz.a(document, jrw2);
        }
        catch (Exception exception) {
            lfn.log("", exception);
            return false;
        }
        return true;
    }
}

