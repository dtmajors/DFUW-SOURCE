/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dqk
 *  eg
 *  lcr
 */
import java.util.Set;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class dsc
extends dqk {
    private int gWZ = -1;
    private dqs gXa = null;
    private bsx eHj = null;
    private bsx gXb = null;
    private String gXc = "";
    private Set<String> gXd = lcn.emx();
    private boolean gXe = false;

    public dsc() {
        this.ObjectType = 151;
    }

    public dsc(int n, bsx bsx2, bsx bsx3, String string) {
        this.gXc = string;
        this.gWZ = n;
        this.eHj = bsx2;
        this.gXb = bsx3;
        this.ObjectType = 151;
    }

    public void initialize() {
        Object object;
        Object object2;
        Object object3 = this.getValue("MeshName");
        this.ObjectDescriptionFilename = object3 != null ? (String)object3 : "gizmos/gizmo_sound_emitter_01.xml";
        Object object4 = this.getValue("Position");
        if (object4 != null) {
            this.c((ljq)object4);
        }
        if ((object2 = this.getValue("Rotation")) != null) {
            this.a(new lgl((ljq)object2));
        }
        if ((object = this.getValue("Radius")) != null && object instanceof Float) {
            this.gXa = new dqs();
            this.gXa.setGUID(this.MessageDelegator.bzv());
            this.gXa.By(1);
            this.gXa.setScale(1.0f);
            this.gXa.setWidth(0.0f);
            this.gXa.hq(0.0f);
            this.gXa.hr(0.0f);
            this.gXa.setRadius(1.0f);
            this.gXa.hp(0.0f);
            this.gXa.Bx(0);
            this.gXa.Bw(0);
            this.gXa.Bu(20);
            this.gXa.Bv(20);
            this.gXa.c(new ljq(this.Position));
            this.gXa.a(new lgl(this.Rotation));
            this.MessageDelegator.a((amf)((Object)this.gXa));
            this.gXa.setScale(((Float)object).floatValue());
            this.ip(((Float)object).floatValue());
        }
        super.initialize();
    }

    protected void ip(float f2) {
        kla kla2 = (kla)this.MessageDelegator.h(1028);
        kla2.hC(this.gXa.axa());
        kla2.ts(this.GUID);
        kla2.HW(1);
        kla2.setScale(f2);
        this.MessageDelegator.a(kla2);
    }

    public int bxv() {
        return this.gWZ;
    }

    protected void a(kwp kwp2) {
        super.a(kwp2);
        this.eHj.setValue("Position", this.av().esF());
        this.eHj.setValue("Rotation", this.aw().eqT());
        if (this.gXa != null) {
            this.gXa.c(this.av());
            this.gXa.a(this.aw());
            this.gXa.iN(true);
        }
    }

    public void BM(int n) {
        this.gWZ = n;
    }

    public void setValue(String string, Object object) {
        this.eHj.setValue(string, object);
        if (string.equals("MeshName")) {
            this.clearSelection();
            this.cleanUp();
            this.gXe = true;
        }
        if (string.equals("Radius") && object instanceof Float) {
            this.ip(((Float)object).floatValue());
        }
    }

    public void clearSelection() {
        eg eg2 = (eg)this.MessageDelegator.bzx().bzt().d(lcr.qAE);
        eg2.w(null);
    }

    public Object getValue(String string) {
        Object object = this.eHj.getValue(string);
        if (object == null) {
            object = this.gXb.getValue(string);
        }
        return object;
    }

    public boolean je(String string) {
        return this.eHj.getValue(string) != null;
    }

    public void jf(String string) {
        this.eHj.axn().remove(string);
        this.setValue(string, this.getValue(string));
        this.eHj.axn().remove(string);
    }

    public void receiveResponse(ktv ktv2) {
        if (ktv2.egT() == 1024 && this.gXe) {
            this.gXe = false;
            this.Initialized = false;
            this.CleanedUp = false;
            this.gOY = true;
            this.initialize();
        }
        super.receiveResponse(ktv2);
    }

    public void a(Document document, Node node) {
        this.eHj.a(document, node);
    }

    public void cleanUp() {
        if (this.gXa != null) {
            this.MessageDelegator.hd(this.gXa.getGUID());
            this.MessageDelegator.oa(this.gXa.getGUID());
            this.gXa = null;
        }
        super.cleanUp();
    }

    public void b(dqn dqn2) {
        dsc dsc2 = (dsc)((Object)dqn2);
        dsc2.gXc = this.gXc;
        dsc2.gWZ = this.gWZ;
        dsc2.gXb = new bsx();
        this.gXb.a(dsc2.gXb);
        dsc2.eHj = new bsx();
        this.eHj.a(dsc2.eHj);
    }

    public bsx bxw() {
        return this.gXb;
    }

    public bsx aRs() {
        return this.eHj;
    }

    public bsx bxx() {
        bsx bsx2 = new bsx();
        this.gXb.a(bsx2);
        for (String string : bsx2.axn().keySet()) {
            bsx2.setValue(string, this.getValue(string));
        }
        return bsx2;
    }

    public void jg(String string) {
        Document document = jsy.dSB().newDocument();
        bsx bsx2 = this.bxx();
        Element element = document.createElement("SFGenericObjectTemplate");
        Attr attr = document.createAttribute("GenericObjectType");
        attr.setNodeValue(String.valueOf(this.gWZ));
        element.getAttributes().setNamedItem(attr);
        bsx2.a(document, element);
        document.appendChild(element);
        jsz.a(document, new jrw(string));
    }

    public static dsc jh(String string) {
        Document document = jsy.tK(string);
        Node node = jsy.a("SFGenericObjectTemplate", (Node)document);
        int n = Integer.parseInt(node.getAttributes().getNamedItem("GenericObjectType").getNodeValue());
        mjc mjc2 = mje.DCk.get(n);
        bsx bsx2 = new bsx();
        mjc2.d(bsx2);
        bsx2.b(node);
        dsc dsc2 = new dsc(n, new bsx(), bsx2, string);
        return dsc2;
    }

    public String bxy() {
        return this.gXc;
    }

    public void ji(String string) {
        this.gXc = string;
    }
}

