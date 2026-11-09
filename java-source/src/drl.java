/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.ArrayList;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public class drl
extends dqv
implements bto {
    public static final int gTB = 1;
    public static final int gTC = 2;
    public static final int gTD = 3;
    public static final int gTE = 4;
    public static final float gTF = 0.6f;
    public static final float gTG = 1.0f;
    public static final float gTH = 1.0f;
    public static final String gTI = "neutral";
    public static final float gTJ = 1.5f;
    public static final float gTK = 8.0f;
    public static final float gTL = 8.0f;
    private boolean gTM = false;
    private float gTN = 0.6f;
    private float gTO = 1.0f;
    private float gTP = 1.0f;
    private String gTQ = "neutral";
    private ArrayList<String> gTR;

    public ArrayList<String> bvO() {
        return this.gTR;
    }

    public void a(ArrayList<String> arrayList) {
        this.gTR = arrayList;
    }

    public String bvP() {
        return this.gTQ;
    }

    public void jb(String string) {
        this.gTQ = string;
        this.gPb |= 0x10;
    }

    public drl() {
        this.ObjectType = 156;
        this.gQo = bfb.dga;
        bew.d(this.gQo);
        this.bvA();
    }

    @Override
    public void a(int n, Object object) {
        switch (n) {
            case 1: {
                this.hE(((Float)object).floatValue());
                break;
            }
            case 2: {
                this.hF(((Float)object).floatValue());
                break;
            }
            case 3: {
                this.hG(((Float)object).floatValue());
                break;
            }
            case 4: {
                this.jb((String)object);
                break;
            }
            default: {
                lfn.b(4, this.getClass().getName(), "setPropertyValue() : Unknown PropertyID = " + n);
                assert (false);
                break;
            }
        }
    }

    @Override
    public Object gG(int n) {
        switch (n) {
            case 1: {
                return new Float(this.gTN);
            }
            case 2: {
                return new Float(this.gTO);
            }
            case 3: {
                return new Float(this.gTP);
            }
            case 4: {
                return this.gTQ;
            }
        }
        lfn.b(4, this.getClass().getName(), "getPropertyValue() : Unknown PropertyID = " + n);
        assert (false);
        return null;
    }

    private void bvA() {
        this.gTN = 0.6f;
        this.gTO = 1.0f;
        this.gTP = 1.0f;
        this.gTQ = gTI;
    }

    @Override
    public void initialize() {
        if (this.Initialized) {
            lfn.b(5, this.getClass().getSimpleName(), "initialize() : Already initialized.");
            assert (false);
            return;
        }
        assert (this.MessageDelegator != null) : "MessageDelegator is null.";
        super.initialize();
        this.bvV();
        if (!this.gQn) {
            return;
        }
        if (lcw.eng()) {
            this.bvQ();
            return;
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        if (!this.gTM) {
            this.bvQ();
            return;
        }
        if (this.gPb != 0) {
            this.bvR();
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 1810: {
                this.a((fas)dxq2);
                break;
            }
            case 12294: {
                this.a((fvu)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(fas fas2) {
        int n = fas2.bNV();
        if ((n & 2) != 0) {
            this.hE(fas2.bvS());
        }
        if ((n & 8) != 0) {
            this.hF(fas2.bvT());
        }
        if ((n & 0x10) != 0) {
            this.hG(fas2.bvU());
        }
        if ((n & 0x20) != 0) {
            this.jb(fas2.bvP());
        }
        this.bvR();
    }

    private void a(fvu fvu2) {
        assert (!lcw.eng());
        this.bvQ();
    }

    private void bvQ() {
        if (this.gTM) {
            lfn.b(4, this.getClass().getSimpleName(), "sendPostFXInitRequest() : Already sent Post FX Init Request. <!>");
            return;
        }
        kkc kkc2 = (kkc)this.MessageDelegator.h(1807);
        kkc2.Gg(1);
        kkc2.wD(true);
        kkc2.lQ(false);
        kkc2.tD(this.GUID);
        kkc2.ts(this.GUID);
        kkc2.hE(this.gTN);
        kkc2.hF(this.gTO);
        kkc2.hG(this.gTP);
        kkc2.jb(this.gTQ);
        this.gPb = 0;
        this.MessageDelegator.a(kkc2);
        this.gTM = true;
    }

    public void hE(float f2) {
        this.gTN = f2;
        this.gPb |= 2;
    }

    public void hF(float f2) {
        this.gTO = f2;
        this.gPb |= 4;
    }

    public void hG(float f2) {
        this.gTP = f2;
        this.gPb |= 8;
    }

    private void bvR() {
        if (!this.Initialized) {
            return;
        }
        if (!this.gQn) {
            this.gPb = 0;
            return;
        }
        if (!this.gTM) {
            this.gPb = 0;
            return;
        }
        kkc kkc2 = (kkc)this.MessageDelegator.h(1807);
        kkc2.ts(this.GUID);
        kkc2.tD(this.GUID);
        if ((this.gPb & 2) != 0) {
            kkc2.Gg(kkc2.bNV() | 2);
            kkc2.hE(this.gTN);
        }
        if ((this.gPb & 4) != 0) {
            kkc2.Gg(kkc2.bNV() | 8);
            kkc2.hF(this.gTO);
        }
        if ((this.gPb & 8) != 0) {
            kkc2.Gg(kkc2.bNV() | 0x10);
            kkc2.hG(this.gTP);
        }
        if ((this.gPb & 0x10) != 0) {
            kkc2.Gg(kkc2.bNV() | 0x20);
            kkc2.jb(this.gTQ);
        }
        this.MessageDelegator.a(kkc2);
        this.gPb = 0;
    }

    public float bvS() {
        return this.gTN;
    }

    public float bvT() {
        return this.gTO;
    }

    public float bvU() {
        return this.gTP;
    }

    private void bvV() {
        this.gTR = lcn.emv();
        String string = "texture/colorgrading/gradermanifest.xml";
        Document document = null;
        try {
            document = jsy.tJ(string);
        }
        catch (bo bo2) {
            lfn.b(5, this.getClass().getName(), "parseColorGraderManifest() : Could not parse manifest SFFile [" + string + "]. [*] Reason: \n" + bo2);
        }
        if (document == null) {
            lfn.b(5, this.getClass().getName(), "parseColorGraderManifest() : Could not Parse manifest file[" + string + "]");
            return;
        }
        if (!document.getDocumentElement().getNodeName().equals("GraderManifest")) {
            lfn.b(5, this.getClass().getName(), "parseColorGraderManifest() : Could not Parse manifest file[" + string + "]" + " root node invalid: " + document.getDocumentElement().getNodeName());
            return;
        }
        Node node = jsy.a("AvailableGraders", document.getDocumentElement());
        if (node == null) {
            lfn.b(5, this.getClass().getName(), "parseColorGraderManifest() : Could not Parse manifest file[" + string + "]" + " Could not find 'AvailableGraders' node ");
            return;
        }
        for (int i = 0; i < node.getChildNodes().getLength(); ++i) {
            Node node2 = node.getChildNodes().item(i);
            if (node2.getNodeName() != "Grader") continue;
            NamedNodeMap namedNodeMap = node2.getAttributes();
            if (namedNodeMap == null) {
                lfn.b(5, this.getClass().getName(), "parseColorGraderManifest() : Could not Parse manifest file[" + string + "]");
                return;
            }
            Node node3 = namedNodeMap.getNamedItem("Name");
            if (node3 == null) {
                lfn.b(5, this.getClass().getName(), "parseColorGraderManifest() : Could not Parse manifest file[" + string + "]");
                return;
            }
            this.gTR.add(node3.getNodeValue());
        }
    }
}

