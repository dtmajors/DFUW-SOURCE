/*
 * Decompiled with CFR.
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Map;
import java.util.Set;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class hsw {
    public final String Identifier;
    private final hsr ldm;
    private final hsp ldn;
    private final Set<hst> ldo = lcn.emx();
    private Map<String, hsv> TD = lcn.emG();

    hsw(hsp hsp2, String string) {
        this.ldm = hso.cxK().cxQ();
        this.ldn = hsp2;
        this.Identifier = string;
    }

    void c(hst hst2) {
        this.ldo.add(hst2);
    }

    void d(hst hst2) {
        this.ldo.remove(hst2);
    }

    void bCJ() {
        this.cym();
        this.cyn();
        this.cyo();
    }

    void cyl() {
        try {
            Object object;
            Document document = jtf.dSE().newDocument();
            Element element = document.createElement("SFConfig");
            document.appendChild(element);
            for (hsv object22 : this.TD.values()) {
                if (object22.ldl.lcM != hsu.ldg) continue;
                object = document.createElement(object22.Name);
                object.setAttribute("Type", object22.ldl.lcN.toString());
                object.setAttribute("Value", object22.Gt().eyZ());
                element.appendChild((Node)object);
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            object = new PrintStream(byteArrayOutputStream);
            if (!jsz.a(document, (OutputStream)object)) {
                return;
            }
            ((PrintStream)object).flush();
            byteArrayOutputStream.flush();
            Object object3 = byteArrayOutputStream.toByteArray();
            loi.exd().a(this.Identifier + ".cfg", false, (byte[])object3);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void cym() {
        Element element;
        Node node;
        int n;
        byte[] byArray = loi.exd().AR(this.Identifier + ".cfg");
        if (byArray == null || byArray.length == 0) {
            lfn.b(3, "SFConfigValueSet", "loadLocalConfig: Could not read " + this.Identifier + ".cfg");
            return;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
        InputSource inputSource = new InputSource(byteArrayInputStream);
        Document document = null;
        try {
            document = jsy.a(inputSource);
        }
        catch (bo bo2) {
            bo2.printStackTrace();
            lfn.b(5, "SFConfigValueSet", "loadLocalConfig: Error parsing " + this.Identifier + ".cfg - " + bo2.getMessage());
            return;
        }
        NodeList nodeList = document.getChildNodes();
        Node node2 = null;
        for (n = 0; n < nodeList.getLength(); ++n) {
            node = nodeList.item(0);
            if (!(node instanceof Element) || !(element = (Element)node).getNodeName().equals("SFConfig")) continue;
            node2 = element;
            break;
        }
        if (node2 == null) {
            lfn.b(5, "SFConfigValueSet", "loadLocalConfig: No SFConfig root element in " + this.Identifier + ".cfg");
            return;
        }
        nodeList = node2.getChildNodes();
        for (n = 0; n < nodeList.getLength(); ++n) {
            node = nodeList.item(n);
            if (!(node instanceof Element)) continue;
            element = (Element)node;
            hsq hsq2 = this.ldn.ne(element.getNodeName());
            if (hsq2 == null) {
                lfn.b(4, "SFConfigValueSet", "loadLocalConfig: No Definition of value '" + element.getNodeName() + "' in " + this.Identifier + ".cfg, skipping");
                continue;
            }
            if (hsq2.lcM != hsu.ldg) {
                lfn.b(4, "SFConfigValueSet", "loadLocalConfig: Value '" + element.getNodeName() + "' in " + this.Identifier + ".cfg isn't defined as local, skipping");
                continue;
            }
            String string = element.getAttribute("Type");
            if (string == null) {
                lfn.b(4, "SFConfigValueSet", "loadLocalConfig: Value '" + element.getNodeName() + "' in " + this.Identifier + ".cfg doesn't have a Type attribute, skipping");
                continue;
            }
            mhs mhs2 = mhs.valueOf(string);
            if (mhs2 == null) {
                lfn.b(4, "SFConfigValueSet", "loadLocalConfig: Value '" + element.getNodeName() + "' in " + this.Identifier + ".cfg has an invalid Type attribute, skipping");
                continue;
            }
            if (mhs2 != hsq2.lcN) {
                lfn.b(5, "SFConfigValueSet", "loadLocalConfig: Value '" + element.getNodeName() + "' in " + this.Identifier + ".cfg has an incorrect Type attribute, skipping");
                continue;
            }
            String string2 = element.getAttribute("Value");
            if (string2 == null) {
                lfn.b(5, "SFConfigValueSet", "loadLocalConfig: Value '" + element.getNodeName() + "' in " + this.Identifier + ".cfg doesn't have a Value attribute, skipping");
                continue;
            }
            mhk mhk2 = mhk.a(mhs2, string2);
            if (mhk2 == null) {
                lfn.b(5, "SFConfigValueSet", "loadLocalConfig: Value '" + element.getNodeName() + "' in " + this.Identifier + ".cfg contains invalid data in Value attribute, skipping");
                continue;
            }
            hsv hsv2 = new hsv(this, hsq2, mhk2);
            this.TD.put(hsq2.Name, hsv2);
        }
    }

    private void cyn() {
    }

    private void cyo() {
    }

    public Integer getInteger(String string) {
        mhk mhk2 = this.c(string, mhs.INTEGER);
        if (mhk2 == null) {
            return null;
        }
        return ((mho)mhk2).PC;
    }

    public Float getFloat(String string) {
        mhk mhk2 = this.c(string, mhs.FLOAT);
        if (mhk2 == null) {
            return null;
        }
        return Float.valueOf(((mhn)mhk2).Pz);
    }

    public String getString(String string) {
        mhk mhk2 = this.c(string, mhs.STRING);
        if (mhk2 == null) {
            return null;
        }
        return ((mhr)mhk2).Value;
    }

    public Boolean getBoolean(String string) {
        mhk mhk2 = this.c(string, mhs.BOOLEAN);
        if (mhk2 == null) {
            return null;
        }
        return ((mhl)mhk2).Pp;
    }

    private mhk c(String string, mhs mhs2) {
        hsq hsq2 = this.ldn.ne(string);
        if (hsq2 == null) {
            lfn.b(5, "SFConfigValueSet", "getValue: No definition for '" + string + "' type " + (Object)((Object)mhs2));
            assert (false);
            return null;
        }
        if (hsq2.lcN != mhs2) {
            lfn.b(5, "SFConfigValueSet", "getValue: Value '" + string + "' is of type " + (Object)((Object)hsq2.lcN) + " not " + (Object)((Object)mhs2));
            assert (false);
            return null;
        }
        hsv hsv2 = this.TD.get(string);
        if (hsv2 == null) {
            return hsq2.lcO;
        }
        return hsv2.Gt();
    }

    public void a(String string, int n, hsu hsu2) {
        this.a(string, n, mhs.INTEGER, hsu2);
    }

    public void a(String string, float f2, hsu hsu2) {
        this.a(string, Float.valueOf(f2), mhs.FLOAT, hsu2);
    }

    public void a(String string, boolean bl, hsu hsu2) {
        this.a(string, bl, mhs.BOOLEAN, hsu2);
    }

    public void a(String string, String string2, hsu hsu2) {
        this.a(string, string2, mhs.STRING, hsu2);
    }

    public hsu nm(String string) {
        hsq hsq2 = this.ldn.ne(string);
        return hsq2 != null ? hsq2.lcM : null;
    }

    private void a(String string, Object object, mhs mhs2, hsu hsu2) {
        hsq hsq2 = this.ldn.ne(string);
        if (hsq2 == null) {
            lfn.b(5, "SFConfigValueSet", "setValue: No definition for '" + string + "' type " + (Object)((Object)mhs2));
            return;
        }
        if (hsq2.lcN != mhs2) {
            lfn.b(5, "SFConfigValueSet", "setValue: Value '" + string + "' is of type " + (Object)((Object)hsq2.lcN) + " not " + (Object)((Object)mhs2));
            return;
        }
        if (hsq2.lcM != hsu2) {
            lfn.b(5, "SFConfigValueSet", "setValue: Value '" + string + "' is of storage type " + (Object)((Object)hsq2.lcM) + " not " + (Object)((Object)hsu2));
            return;
        }
        hsv hsv2 = this.TD.get(string);
        if (hsv2 == null) {
            hsv2 = new hsv(this, hsq2);
            this.TD.put(string, hsv2);
        }
        hsv2.setValue(object);
    }

    public void nn(String string) {
        hsq hsq2 = this.ldn.ne(string);
        if (hsq2 == null) {
            lfn.b(5, "SFConfigValueSet", "setDefault: No definition for '" + string + "'");
            assert (false);
            return;
        }
        hsv hsv2 = this.TD.get(string);
        if (hsv2 == null) {
            hsv2 = new hsv(this, hsq2);
            this.TD.put(string, hsv2);
        }
        hsv2.cyk();
    }

    void a(hsv hsv2) {
        switch (hsv2.ldl.lcM) {
            case ldf: {
                this.ldm.a(this, hsv2);
                break;
            }
            case ldg: {
                this.ldm.a(this);
                break;
            }
            case ldh: {
                this.ldm.b(this, hsv2);
                break;
            }
            default: {
                assert (false);
                break;
            }
        }
        for (hst hst2 : this.ldo) {
            hst2.ng(hsv2.Name);
        }
    }

    public void oI(boolean bl) {
        for (hst hst2 : this.ldo) {
            hst2.oI(bl);
        }
    }

    public void cyi() {
        for (hst hst2 : this.ldo) {
            hst2.cyi();
        }
    }

    public void cyj() {
        for (hst hst2 : this.ldo) {
            hst2.cyj();
        }
    }
}

