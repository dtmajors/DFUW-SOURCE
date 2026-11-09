/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dqk
 *  lcw
 */
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class dsk
extends dqk {
    private static boolean gXJ = false;
    private static boolean gXK = false;
    private static boolean gXL = false;
    private static dsk gXM = null;
    private btc gXN = new btc();
    private dfc gXO = null;
    private boolean gXP = false;
    private ldv gXQ = null;
    private ldv gXR = null;
    private ldv gXS = null;
    private ldv gXT = null;
    int gXU = 0;
    boolean gXV = mje.DCf;
    boolean gXW = mje.DCf;
    public static boolean gXX = false;

    public dsk() {
        this.ObjectType = 144;
    }

    public void b(dqn dqn2) {
        super.b(dqn2);
        dsk dsk2 = (dsk)((Object)dqn2);
        DocumentBuilder documentBuilder = null;
        try {
            documentBuilder = jtf.dSE();
        }
        catch (Exception exception) {
            lfn.b(5, ((Object)((Object)this)).getClass().getName(), "copyValues() :" + exception);
            return;
        }
        Document document = documentBuilder.newDocument();
        Node node = this.gXN.a(document, new jta());
        dsk2.byi().b(node);
    }

    public void initialize() {
        if (!lcw.qHe) {
            lfn.b(5, ((Object)((Object)this)).getClass().getName(), "initialize() : Represantation objects should only be created from the worldbuilder");
            return;
        }
        this.ObjectDescriptionFilename = "gizmos\\gizmo_sound_emitter_01.xml";
        if (this.Rotation == null) {
            this.Rotation = new lgl();
        }
        super.initialize();
        this.ObjectDescriptionFilename = this.gXN.axt();
        this.gXR = this.MessageDelegator.bzv();
        this.gXS = this.MessageDelegator.bzv();
        this.gXQ = this.MessageDelegator.bzv();
        this.nN(this.gXR);
    }

    private void nM(ldv ldv2) {
        klb klb2 = (klb)this.MessageDelegator.h(1026);
        klb2.wD(true);
        klb2.ts(this.GUID);
        klb2.HX(klb.iWD);
        klb2.hC(ldv2);
        this.MessageDelegator.a(klb2);
    }

    public void receiveResponse(ktv ktv2) {
        super.receiveResponse(ktv2);
        if (ktv2.egT() == 1024) {
            ++this.gXU;
            if (this.gXU == 1) {
                this.nN(this.gXS);
            } else if (this.gXU == 2) {
                this.byg();
            }
        }
    }

    private void nN(ldv ldv2) {
        klh klh2 = (klh)this.MessageDelegator.h(1033);
        klh2.wD(true);
        klh2.ts(this.GUID);
        klh2.hC(ldv2);
        klh2.setWidth(0.0f);
        klh2.hq(0.0f);
        klh2.hr(0.0f);
        klh2.setRadius(1.0f);
        klh2.hp(0.0f);
        klh2.Bu(20);
        klh2.Bv(20);
        klh2.Bw(0);
        klh2.Bx(0);
        klh2.Lj(1);
        klh2.c(this.Position);
        klh2.setRotation(this.FX());
        this.MessageDelegator.a(klh2);
    }

    public String getDisplayName() {
        if (this.gXN != null) {
            return this.gXN.axt();
        }
        return super.getObjectDescriptionFilename();
    }

    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        if (gXJ != this.gXV) {
            this.byg();
            this.gXV = gXJ;
        }
        if (gXK != this.gXW) {
            this.byg();
            this.gXW = gXK;
        }
        if (gXL && gXM != this && !this.gXP) {
            this.gXP = true;
            this.byh();
        }
        if ((gXM == this || !gXL) && this.gXP) {
            this.gXP = false;
            this.byh();
        }
    }

    public void a(lgl lgl2) {
        super.a(lgl2);
        if (this.MessageDelegator == null) {
            return;
        }
        if (this.gXU > 2 && this.gXT != null) {
            kkv kkv2 = (kkv)this.MessageDelegator.h(1031);
            kkv2.hC(this.gXT);
            kkv2.ts(this.GUID);
            kkv2.wD(false);
            kkv2.lQ(false);
            kkv2.a(this.Rotation);
            kkv2.YG(128);
            this.MessageDelegator.a(kkv2);
        }
        this.byh();
    }

    public void c(ljq ljq2) {
        super.c(ljq2);
        if (this.gXU > 0) {
            this.n(this.gXR, ljq2);
            if (this.gXU > 1) {
                this.n(this.gXS, ljq2);
            }
        }
        if (this.gXU > 2 && this.gXT != null) {
            kkv kkv2 = (kkv)this.MessageDelegator.h(1031);
            kkv2.hC(this.gXT);
            kkv2.ts(this.GUID);
            kkv2.wD(false);
            kkv2.lQ(false);
            kkv2.c(ljq2);
            kkv2.YG(64);
            this.MessageDelegator.a(kkv2);
        }
        if (this.gXO != null) {
            this.gXO.bK(ljq2);
        }
    }

    private void n(ldv ldv2, ljq ljq2) {
        kky kky2 = (kky)this.MessageDelegator.h(1025);
        kky2.pHG = ljq2.x;
        kky2.pHH = ljq2.y;
        kky2.pHI = ljq2.rlV;
        kky2.rb = this.Rotation.x;
        kky2.rc = this.Rotation.y;
        kky2.rd = this.Rotation.rlV;
        kky2.pHJ = this.Rotation.rlW;
        kky2.hC(ldv2);
        kky2.ts(this.GUID);
        kky2.wD(false);
        kky2.pHF = 8;
        this.MessageDelegator.a(kky2);
    }

    private void m(ldv ldv2, float f2) {
        kla kla2 = (kla)this.MessageDelegator.h(1028);
        kla2.HW(1);
        kla2.ts(this.GUID);
        kla2.wD(false);
        kla2.hC(ldv2);
        kla2.setScale(f2);
        this.MessageDelegator.a(kla2);
    }

    public void byg() {
        if (this.gXU > 0) {
            this.m(this.gXR, gXJ ? this.gXN.axu() : 0.0f);
            if (this.gXU > 1) {
                this.m(this.gXS, gXK ? this.gXN.getMaxRadius() : 0.0f);
            }
            if (this.gXU > 1) {
                float f2;
                int n;
                kkv kkv2 = (kkv)this.MessageDelegator.h(1031);
                kkv2.wD(false);
                kkv2.lQ(false);
                kkv2.ts(this.GUID);
                if (this.gXT == null && gXX) {
                    this.gXT = this.MessageDelegator.bzv();
                    kkv2.wD(true);
                    kkv2.YG(1);
                    kkv2.m(new lcq(1.0f, 0.0f, 0.0f));
                    kkv2.c(this.av());
                    kkv2.a(this.aw());
                    kkv2.setTextureName("");
                    kkv2.setLineWidth(0.06f);
                    kkv2.setConstantSize(false);
                    kkv2.setTransformPoints(true);
                } else {
                    kkv2.YG(8);
                }
                kkv2.hC(this.gXT);
                ljq[] ljqArray = new ljq[84];
                int n2 = 0;
                float f3 = (float)Math.cos(Math.toRadians(this.gXN.axr() / 2));
                float f4 = (float)Math.sin(Math.toRadians(this.gXN.axr() / 2));
                float f5 = (float)Math.cos(Math.toRadians(this.gXN.axp() / 2));
                float f6 = (float)Math.sin(Math.toRadians(this.gXN.axp() / 2));
                f3 *= this.gXN.axu() * 2.0f;
                f4 *= this.gXN.axu() * 2.0f;
                int n3 = 0;
                for (n = 0; n <= 10; ++n) {
                    f2 = (float)Math.toRadians(n3);
                    if (n != 0) {
                        ljqArray[n2++] = new ljq((double)f4 * Math.cos(f2), (double)f3, (double)f4 * Math.sin(f2));
                    }
                    ljqArray[n2++] = new ljq((double)f4 * Math.cos(f2), (double)f3, (double)f4 * Math.sin(f2));
                    ljqArray[n2++] = new ljq(0.0f, 0.0f, 0.0f);
                    if (n != 10) {
                        ljqArray[n2++] = new ljq((double)f4 * Math.cos(f2), (double)f3, (double)f4 * Math.sin(f2));
                    }
                    n3 += 36;
                }
                f5 *= this.gXN.axu() * 2.0f;
                f6 *= this.gXN.axu() * 2.0f;
                n3 = 0;
                for (n = 0; n <= 10; ++n) {
                    f2 = (float)Math.toRadians(n3);
                    if (n != 0) {
                        ljqArray[n2++] = new ljq((double)f6 * Math.cos(f2), (double)f5, (double)f6 * Math.sin(f2));
                    }
                    ljqArray[n2++] = new ljq((double)f6 * Math.cos(f2), (double)f5, (double)f6 * Math.sin(f2));
                    ljqArray[n2++] = new ljq(0.0f, 0.0f, 0.0f);
                    if (n != 10) {
                        ljqArray[n2++] = new ljq((double)f6 * Math.cos(f2), (double)f5, (double)f6 * Math.sin(f2));
                    }
                    n3 += 36;
                }
                kkv2.l(ljqArray);
                if (kkv2.ecr() == 1 || this.gXU > 2) {
                    this.MessageDelegator.a(kkv2);
                }
            }
        }
        this.byh();
    }

    public void byh() {
        dfc dfc2 = this.gXO;
        if (dfc2 == null) {
            dez dez2 = new dez();
            dfc2 = (dfc)dez2.Af(4);
            dfc2.setGUID(this.gXQ);
            dfc2.bi(new ljq(0.0f, 0.0f, 0.0f));
        }
        dfc2.hN(true);
        this.gXN.f(this.aw());
        dfc2.setConeOrientation(this.gXN.axq());
        dfc2.setConeOutsideVolume(this.gXN.getConeOutsideVolume());
        dfc2.setInsideConeAngle(this.gXN.axp());
        dfc2.setOutsideConeAngle(this.gXN.axr());
        dfc2.bK(this.av());
        dfc2.setLooping(true);
        dfc2.setXMLFileName(this.gXN.axt());
        dfc2.setMinDistance(this.gXP ? 0.0f : this.gXN.axu());
        dfc2.setMaxDistance(this.gXN.getMaxRadius());
        dfc2.mU(this.gXN.axv());
        dfc2.dh(this.gXN.axw());
        if (this.gXO == null) {
            this.gXO = dfc2;
            this.MessageDelegator.a(this.gXO);
        }
        this.ObjectDescriptionFilename = this.gXN.axt();
    }

    public void cleanUp() {
        if (this.gXU > 0) {
            this.nM(this.gXR);
        }
        if (this.gXU > 1) {
            this.nM(this.gXS);
        }
        if (this.gXU > 2) {
            kkv kkv2 = (kkv)this.MessageDelegator.h(1031);
            kkv2.hC(this.gXT);
            kkv2.ts(this.GUID);
            kkv2.wD(false);
            kkv2.lQ(false);
            kkv2.YG(256);
            this.MessageDelegator.a(kkv2);
        }
        if (this.gXO != null) {
            this.MessageDelegator.hd(this.gXO.getGUID());
        }
        super.cleanUp();
    }

    public btc byi() {
        return this.gXN;
    }

    public void a(btc btc2) {
        this.gXN = btc2;
    }

    public boolean byj() {
        return gXK;
    }

    public void js(boolean bl) {
        gXK = bl;
    }

    public static boolean byk() {
        return gXL;
    }

    public static void jt(boolean bl) {
        gXL = bl;
    }

    public static dsk byl() {
        return gXM;
    }

    public static void a(dsk dsk2) {
        gXM = dsk2;
    }

    public static boolean bym() {
        return gXJ;
    }

    public static void ju(boolean bl) {
        gXJ = bl;
    }
}

