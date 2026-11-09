/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class btc
extends bsv {
    private String dKB = "audio/cannons/emote_test.xml";
    private ljq Position = new ljq(0.0f, 0.0f, 0.0f);
    private float dKC = 10.0f;
    private float dKD = 100.0f;
    private int dKE = 360;
    private int dKF = 360;
    private lgl dKG = new lgl(0.0f, 0.0f, 0.0f, 1.0f);
    private long dKH = 0L;
    private int dKI = 0;
    private float dKJ = 1.0f;

    public btc() {
        this.dKf = bsv.a.dKn;
    }

    public int axp() {
        return this.dKE;
    }

    public Node a(Document document, jta jta2) {
        btc btc2 = this;
        Element element = document.createElement("SFLevelObjectSoundEmitter");
        Element element2 = jta2.a(document, btc2.axt(), "SoundFile");
        element.appendChild(element2);
        element2 = jta2.a(document, btc2.av(), "Position");
        element.appendChild(element2);
        element2 = jta2.a(document, btc2.axu(), "MinRadius");
        element.appendChild(element2);
        element2 = jta2.a(document, btc2.getMaxRadius(), "MaxRadius");
        element.appendChild(element2);
        element2 = jta2.a(document, btc2.axs(), "ConeAxis");
        element.appendChild(element2);
        element2 = jta2.a(document, btc2.axp(), "ConeInnerAngle");
        element.appendChild(element2);
        element2 = jta2.a(document, btc2.axr(), "ConeOuterAngle");
        element.appendChild(element2);
        element2 = jta2.a(document, btc2.getConeOutsideVolume(), "ConeOutsideVolume");
        element.appendChild(element2);
        element2 = jta2.a(document, btc2.axv(), "RollOffType");
        element.appendChild(element2);
        element2 = jta2.a(document, btc2.axw(), "Volume");
        element.appendChild(element2);
        return element;
    }

    public void b(Node node) {
        NodeList nodeList = node.getChildNodes();
        for (int i = 0; i < nodeList.getLength(); ++i) {
            Node node2 = nodeList.item(i);
            if (node2.getNodeName().equals("SoundFile")) {
                this.dKB = jsy.m(node2);
                continue;
            }
            if (node2.getNodeName().equals("Position")) {
                this.Position = jsy.w(node2);
                continue;
            }
            if (node2.getNodeName().equals("MinRadius")) {
                this.dKC = jsy.o(node2);
                continue;
            }
            if (node2.getNodeName().equals("MaxRadius")) {
                this.dKD = jsy.o(node2);
                continue;
            }
            if (node2.getNodeName().equals("ConeAxis")) {
                this.dKG = jsy.E(node2);
                continue;
            }
            if (node2.getNodeName().equals("ConeInnerAngle")) {
                this.dKE = jsy.r(node2);
                continue;
            }
            if (node2.getNodeName().equals("ConeOuterAngle")) {
                this.dKF = jsy.r(node2);
                continue;
            }
            if (node2.getNodeName().equals("ConeOutsideVolume")) {
                this.dKH = jsy.s(node2);
                continue;
            }
            if (node2.getNodeName().equals("RollOffType")) {
                this.dKI = jsy.r(node2);
                continue;
            }
            if (!node2.getNodeName().equals("Volume")) continue;
            this.dKJ = jsy.o(node2);
        }
    }

    public ljq axq() {
        return this.dKG.eq(new ljq(0.0f, 1.0f, 0.0f));
    }

    public void mS(int n) {
        this.dKE = n;
    }

    public int axr() {
        return this.dKF;
    }

    public void mT(int n) {
        this.dKF = n;
    }

    public lgl axs() {
        return this.dKG;
    }

    public void f(lgl lgl2) {
        this.dKG = lgl2;
    }

    public String axt() {
        return this.dKB;
    }

    public void gj(String string) {
        this.dKB = string;
    }

    public ljq av() {
        return this.Position;
    }

    public void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public float axu() {
        return this.dKC;
    }

    public void dg(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        this.dKC = f2;
    }

    public float getMaxRadius() {
        return this.dKD;
    }

    public void setMaxRadius(float f2) {
        this.dKD = f2;
    }

    public long getConeOutsideVolume() {
        return this.dKH;
    }

    public void setConeOutsideVolume(long l2) {
        this.dKH = l2;
    }

    public int axv() {
        return this.dKI;
    }

    public void mU(int n) {
        this.dKI = n;
    }

    public float axw() {
        return this.dKJ;
    }

    public void dh(float f2) {
        this.dKJ = f2;
    }
}

