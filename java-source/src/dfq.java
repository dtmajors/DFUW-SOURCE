/*
 * Decompiled with CFR.
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class dfq
extends dey {
    private kki goW = null;
    int goX = 0;
    private lco goY = new lco(1.0f, 1.0f, 1.0f);
    private float goZ = 1.0f;
    private lco gpa = new lco(0.0f, 0.0f, 0.0f);
    private float gpb = 1.0f;
    a gpc = null;

    dfq() {
        this.gnv = 28;
        khc khc2 = new khc();
        this.goW = (kki)khc2.ii(1538);
        this.setColorMultiplier(1.0f);
        this.setFlickerColorMultiplier(1.0f);
        this.gnx = false;
        this.gny = false;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.goW.ts(this.GUID);
        kke kke2 = (kke)this.MessageDelegator.h(1537);
        kke2.wD(true);
        kke2.ts(this.GUID);
        kke2.Yw(kke.pFW);
        kke2.pN(this.GUID);
        kke2.lQ(false);
        kke2.c(this.av());
        kke2.e(this.bmN());
        kke2.setRange(this.getRange());
        kke2.gt(this.bmI());
        kke2.cr(this.goW.bwt());
        kke2.cs(this.goW.bwu());
        kke2.c(this.bmJ());
        kke2.d(this.bmK());
        this.MessageDelegator.a(kke2);
        this.goW.pN(this.GUID);
        this.goX = 0;
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        if (ktv2.egT() == 1536) {
            this.gnx = true;
            this.gny = true;
            if (this.gpc != null) {
                this.gpc.a(this);
            }
        } else {
            super.receiveResponse(ktv2);
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        if (this.goX != 0 && this.goW.bmO() != null) {
            this.goW.Yx(this.goX | 4);
            this.MessageDelegator.a(this.goW);
            this.goX = 0;
        }
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        if (this.goW.bmO() != null) {
            kkf kkf2 = (kkf)this.MessageDelegator.h(1543);
            kkf2.jM(false);
            kkf2.wD(false);
            kkf2.ts(this.GUID);
            kkf2.pN(this.GUID);
            this.MessageDelegator.a(kkf2);
        }
    }

    public float getRange() {
        return this.goW.getRange();
    }

    public float bmI() {
        return this.goW.bmI();
    }

    public void setRange(float f2) {
        this.goW.setRange(f2);
        this.goX |= 0x100;
    }

    public void gt(float f2) {
        this.goW.gt(f2);
        this.goX |= 0x80000;
    }

    public ljq av() {
        return this.goW.av();
    }

    public void c(ljq ljq2) {
        this.goW.c(ljq2);
        this.goX |= 0x80;
    }

    public ljr bmJ() {
        return this.goW.bmJ();
    }

    public void c(ljr ljr2) {
        this.goW.c(ljr2.esM());
        this.goX |= 0x8000;
    }

    public void d(float f2, float f3, float f4, float f5) {
        this.goW.c(new ljr(f5, f2, f3, f4));
        this.goX |= 0x8000;
    }

    public void d(ljr ljr2) {
        if (ljr2.x < 0.0f) {
            ljr2.x = 0.0f;
        }
        if (ljr2.x > 1.0f) {
            ljr2.x = 1.0f;
        }
        this.goW.d(ljr2.esM());
        this.goX |= 0x20000;
    }

    public void e(float f2, float f3, float f4, float f5) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        this.goW.d(new ljr(f5, f2, f3, f4));
        this.goX |= 0x20000;
    }

    public ljr bmK() {
        return this.goW.bmK();
    }

    public lco bmL() {
        return this.goY;
    }

    public void g(lco lco2) {
        this.goY = lco2;
        this.goW.cr(new ljq(lco2.qwk * this.goZ, lco2.qwl * this.goZ, lco2.qwm * this.goZ));
        this.goX |= 0x40000;
    }

    public float getColorMultiplier() {
        return this.goZ;
    }

    public void setColorMultiplier(float f2) {
        this.goZ = f2;
        this.goW.cr(new ljq(this.goY.qwk * this.goZ, this.goY.qwl * this.goZ, this.goY.qwm * this.goZ));
        this.goX |= 0x40000;
    }

    public lco bmM() {
        return this.gpa;
    }

    public void h(lco lco2) {
        this.gpa = lco2;
        this.goW.cs(new ljq(this.gpa.qwk * this.gpb, this.gpa.qwl * this.gpb, this.gpa.qwm * this.gpb));
        this.goX |= 0x10000;
    }

    public float getFlickerColorMultiplier() {
        return this.gpb;
    }

    public void setFlickerColorMultiplier(float f2) {
        this.gpb = f2;
        this.goW.cs(new ljq(this.gpa.qwk * this.gpb, this.gpa.qwl * this.gpb, this.gpa.qwm * this.gpb));
        this.goX |= 0x10000;
    }

    public void e(ljr ljr2) {
        this.goW.e(ljr2);
        this.goX |= 0x4000;
    }

    public ljr bmN() {
        return this.goW.bmN();
    }

    public void a(Document document, Node node, jta jta2) {
        node.appendChild(jta2.a(document, this.av(), "Position"));
        node.appendChild(jta2.a(document, this.getRange(), "Range"));
        node.appendChild(jta2.a(document, this.bmI(), "FadeProtection"));
        node.appendChild(jta2.a(document, this.bmN(), "Plane"));
        node.appendChild(jta2.a(document, this.bmL(), "Diffuse"));
        node.appendChild(jta2.a(document, this.getColorMultiplier(), "DiffuseMultiplier"));
        node.appendChild(jta2.a(document, this.bmM(), "FlickerColor"));
        node.appendChild(jta2.a(document, this.getFlickerColorMultiplier(), "FlickerColorMultiplier"));
        node.appendChild(jta2.a(document, this.bmJ(), "ColorFlickerParams"));
        node.appendChild(jta2.a(document, this.bmK(), "RangeFlickerParams"));
    }

    public void b(Node node) {
        NodeList nodeList = node.getChildNodes();
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            ljr ljr2;
            Node node2 = nodeList.item(i2);
            if (node2.getNodeName().equals("Position")) {
                this.c(jsy.w(node2));
                continue;
            }
            if (node2.getNodeName().equals("Range")) {
                this.setRange(jsy.o(node2));
                continue;
            }
            if (node2.getNodeName().equals("FadeProtection")) {
                this.gt(jsy.o(node2));
                continue;
            }
            if (node2.getNodeName().equals("Plane")) {
                this.e(jsy.v(node2));
                continue;
            }
            if (node2.getNodeName().equals("Diffuse")) {
                this.g(jsy.z(node2));
                continue;
            }
            if (node2.getNodeName().equals("DiffuseMultiplier")) {
                this.setColorMultiplier(jsy.o(node2));
                continue;
            }
            if (node2.getNodeName().equals("FlickerColor")) {
                this.h(jsy.z(node2));
                continue;
            }
            if (node2.getNodeName().equals("FlickerColorMultiplier")) {
                this.setFlickerColorMultiplier(jsy.o(node2));
                continue;
            }
            if (node2.getNodeName().equals("ColorFlickerParams")) {
                ljr2 = jsy.v(node2);
                this.d(ljr2.x, ljr2.y, ljr2.rlV, ljr2.rlW);
                continue;
            }
            if (!node2.getNodeName().equals("RangeFlickerParams")) continue;
            ljr2 = jsy.v(node2);
            this.e(ljr2.x, ljr2.y, ljr2.rlV, ljr2.rlW);
        }
    }

    public void a(lhd lhd2) {
        lhd2.acN(0);
        this.setRange(lhd2.c(Float.valueOf(this.getRange()), 0).floatValue());
        this.gt(lhd2.c(Float.valueOf(this.bmI()), 0).floatValue());
        this.c(lhd2.c(this.av(), 0));
        this.e(lhd2.c(this.bmN(), 0));
        this.g(lhd2.c(this.bmL(), 0));
        this.setColorMultiplier(lhd2.c(Float.valueOf(this.getColorMultiplier()), 0).floatValue());
        this.h(lhd2.c(this.bmM(), 0));
        this.setFlickerColorMultiplier(lhd2.c(Float.valueOf(this.getFlickerColorMultiplier()), 0).floatValue());
        this.c(lhd2.c(this.bmJ(), 0));
        this.d(lhd2.c(this.bmK(), 0));
    }

    public void b(dfq dfq2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.a(new lhd(new DataOutputStream(byteArrayOutputStream)));
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        dfq2.a(new lhd(new DataInputStream(byteArrayInputStream)));
    }

    public ldv bmO() {
        if (this.goW != null) {
            return this.goW.bmO();
        }
        return null;
    }

    public void a(a a2) {
        this.gpc = a2;
    }
}

