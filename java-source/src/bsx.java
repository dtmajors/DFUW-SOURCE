/*
 * Decompiled with CFR.
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class bsx
extends bsv {
    private final Map<String, Object> dKt = lcn.emw();

    public bsx() {
        this.dKf = bsv.a.dKp;
    }

    public Object getValue(String string) {
        return this.dKt.get(string);
    }

    public void setValue(String string, Object object) {
        this.dKt.put(string, object);
    }

    public void a(Document document, Node node) {
        jta jta2 = new jta();
        for (Map.Entry<String, Object> entry : this.dKt.entrySet()) {
            Object object = entry.getValue();
            Element element = null;
            if (object instanceof Float) {
                element = jta2.a(document, ((Float)object).floatValue());
            }
            if (object instanceof Integer) {
                element = jta2.a(document, (Integer)object);
            } else if (object instanceof String) {
                element = jta2.c(document, (String)object);
            } else if (object instanceof ljq) {
                element = jta2.a(document, (ljq)object);
            } else if (object instanceof Boolean) {
                element = jta2.a(document, (Boolean)object);
            }
            if (element == null) continue;
            Element element2 = document.createElement("SFVariable");
            Attr attr = document.createAttribute("Name");
            attr.setNodeValue(entry.getKey());
            element2.getAttributes().setNamedItem(attr);
            element2.appendChild(element);
            node.appendChild(element2);
        }
    }

    public void b(Node node) {
        List<Node> list = jsy.c("SFVariable", node);
        for (Node node2 : list) {
            String string = node2.getAttributes().getNamedItem("Name").getNodeValue();
            Object object = null;
            if (jsy.a("SFVector3", node2) != null) {
                object = jsy.w(node2);
            } else if (jsy.a("SFFloat", node2) != null) {
                object = Float.valueOf(jsy.o(node2));
            } else if (jsy.a("SFInteger", node2) != null) {
                object = jsy.r(node2);
            } else if (jsy.a("SFString", node2) != null) {
                object = jsy.m(node2);
            } else if (jsy.a("SFBool", node2) != null) {
                object = jsy.t(node2);
            }
            if (object == null) continue;
            this.dKt.put(string, object);
        }
    }

    public void a(lhd lhd2) {
        lhd2.acN(0);
        int n = this.dKt.size();
        n = lhd2.c(n, 0);
        if (lhd2.eqA()) {
            for (int i = 0; i < n; ++i) {
                String string = "";
                string = lhd2.c(string, 0);
                int n2 = -1;
                n2 = lhd2.c(n2, 0);
                Object object = this.getObject(n2);
                object = lhd2.c(object, 0);
                this.dKt.put(string, object);
            }
        } else {
            for (Map.Entry<String, Object> entry : this.dKt.entrySet()) {
                lhd2.c(entry.getKey(), 0);
                lhd2.c(this.t(entry.getValue()), 0);
                lhd2.c(entry.getValue(), 0);
            }
        }
    }

    public int t(Object object) {
        if (object instanceof Float) {
            return 0;
        }
        if (object instanceof ljq) {
            return 1;
        }
        if (object instanceof String) {
            return 2;
        }
        if (object instanceof Integer) {
            return 3;
        }
        if (object instanceof Boolean) {
            return 4;
        }
        assert (false);
        return -1;
    }

    public Object getObject(int n) {
        if (n == 0) {
            return Float.valueOf(0.0f);
        }
        if (n == 1) {
            return new ljq();
        }
        if (n == 2) {
            return "";
        }
        if (n == 3) {
            return 0;
        }
        if (n == 4) {
            return Boolean.FALSE;
        }
        assert (false);
        return null;
    }

    public void a(bsx bsx2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        lhd lhd2 = new lhd(new DataOutputStream(byteArrayOutputStream));
        this.a(lhd2);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        lhd lhd3 = new lhd(new DataInputStream(byteArrayInputStream));
        bsx2.a(lhd3);
    }

    public Map<String, Object> axn() {
        return this.dKt;
    }
}

