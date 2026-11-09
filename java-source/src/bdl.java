/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dqk
 *  lcr
 *  lcw
 */
import java.util.List;
import java.util.Map;

public class bdl
extends dqk {
    public static final int dar = 1;
    public static final int das = 2;
    public static final int dat = 3;
    public static final int dau = 1;
    public static final int dav = 2;
    protected int daw = 0;
    protected int dax = 1;
    protected List<amf> day = lcn.emv();
    protected List<dul> daz = lcn.emv();
    protected List<a> daA = lcn.emv();
    protected Map<ldv, amf> daB = lcn.emw();
    protected String daC = null;
    protected boolean daD = true;
    protected boolean daE = true;
    protected boolean daF = false;
    protected dqs daG = null;
    protected boolean bC = false;
    private boolean daH = false;

    public bdl() {
        this.ObjectType = 29;
    }

    public void cR(boolean bl) {
        this.daH = bl;
    }

    public List<a> alY() {
        return this.daA;
    }

    public boolean alZ() {
        return this.daH;
    }

    public void initialize() {
        if (!this.Initialized) {
            if (!this.ObjectDescriptionFilename.equals("n/a")) assert (false);
            if (this.MessageDelegator != null && this.daD) {
                int n = this.day.size();
                for (int i = 0; i < n; ++i) {
                    amf amf2 = this.day.get(i);
                    if (this.Rotation == null || !(amf2 instanceof btk) || this.daF || amf2 instanceof ami) {
                        // empty if block
                    }
                    if (amf2 instanceof amf) {
                        btk btk2 = (btk)amf2;
                        this.MessageDelegator.a(btk2);
                        continue;
                    }
                    if (!(amf2 instanceof lhj)) continue;
                    assert (false) : "SFSpecialEffectNodeObject no longer supported!";
                    this.a((lhj)amf2);
                }
            }
            if (lcw.qHe) {
                this.ObjectDescriptionFilename = "gizmos\\gizmo_collection_01.xml";
                this.btH();
            } else {
                this.eqa = true;
            }
            this.daF = false;
            this.Initialized = true;
        }
    }

    private void a(lhj lhj2) {
        glh glh2 = (glh)this.MessageDelegator.h(13057, this.GUID, lcr.qEa);
        glh2.setDuration(-2.0f);
        glh2.setTargetPosition(lhj2.getTargetPosition());
        int n = 8;
        if (lhj2.getSourcePosition() != null) {
            glh2.setSourcePosition(lhj2.getSourcePosition());
            n |= 2;
        }
        glh2.JQ(n);
        glh2.setSpecialEffectType(del.dr(lhj2.getSpecialEffectName()));
        this.MessageDelegator.F(glh2);
    }

    public boolean ama() {
        return this.daD;
    }

    public void cS(boolean bl) {
        this.daD = bl;
    }

    public boolean hc(ldv ldv2) {
        return this.daB.containsKey(ldv2);
    }

    public void amb() {
        this.amj();
        int n = this.day.size();
        this.daB.clear();
        for (int i = 0; i < n; ++i) {
            amf amf2 = this.day.get(0);
            if (amf2 instanceof btk) {
                btk btk2 = (btk)amf2;
                btk2.removeObserverObject(this.getGUID());
            }
            this.day.remove(0);
        }
    }

    public void receiveMessage(dxq dxq2) {
        if (!this.Initialized) {
            // empty if block
        }
        int n = dxq2.bEz();
        switch (n) {
            case 9475: {
                this.a((erb)dxq2);
                return;
            }
            case 9476: {
                this.a((eqz)dxq2);
                return;
            }
            case 1025: {
                this.a((ftv)dxq2);
                return;
            }
            case 1027: {
                this.handleObjectRemoveMessage((fub)dxq2);
                return;
            }
            case 3330: {
                this.a((ewy)dxq2);
                break;
            }
            case 6913: {
                this.a((gif)dxq2);
                break;
            }
            default: {
                amf amf2 = null;
                boolean bl = false;
                int n2 = this.day.size();
                for (int i = 0; i < n2; ++i) {
                    amf2 = this.day.get(i);
                    if (!(amf2 instanceof btk)) continue;
                    ((btk)amf2).receiveMessage(dxq2);
                    bl = true;
                }
                if (bl) break;
                super.receiveMessage(dxq2);
            }
        }
    }

    protected void a(gif gif2) {
        btk btk2 = null;
        int n = this.day.size();
        for (int i = 0; i < n; ++i) {
            btk2 = (btk)this.day.get(i);
            if (!btk2.isInitialized()) continue;
            gif gif3 = (gif)this.MessageDelegator.h(6913, gif2.aO(), btk2.getGUID());
            gif3.JD(gif2.bVj());
            gif3.Cv(gif2.bBq());
            gif3.gW(gif2.aHa());
            gif3.oo(gif2.aFO());
            gif3.hC(gif2.oq());
            gif3.oA(gif2.bEB());
            btk2.receiveMessage(gif3);
        }
    }

    protected void a(ewy ewy2) {
        for (amf amf2 : this.day) {
            if (amf2.getGUID().equals(this.GUID) || !(amf2 instanceof ami)) continue;
            kjn kjn2 = (kjn)this.MessageDelegator.h(2820);
            kjn2.FA(kjn.iEH);
            kjn2.k(new ljq[]{new ljq(((ami)((Object)amf2)).av())});
            kjn2.hC(ewy2.oq());
            kjn2.ts(amf2.getGUID());
            this.MessageDelegator.a(kjn2);
        }
    }

    protected void a(eqz eqz2) {
        if (eqz2.bKT() == 1) {
            if (!eqz2.bKU()) {
                eqz2.kH(true);
                this.amj();
                this.MessageDelegator.F(eqz2);
            } else {
                int n = this.day.size();
                for (int i = 0; i < n; ++i) {
                    this.b(this.day.get(0), false);
                }
                this.MessageDelegator.hd(this.GUID);
            }
        } else if (eqz2.bKT() == 3) {
            this.ObjectDescriptionFilename = null;
        }
    }

    protected void a(erb erb2) {
        amf amf2 = erb2.bLa();
        if (amf2 != null) {
            this.a(amf2);
        } else if (erb2.bLb() != null && (amf2 = this.MessageDelegator.d(erb2.bLb())) != null) {
            this.a(amf2);
        }
    }

    protected final void handleObjectRemoveMessage(fub fub2) {
        if (fub2.oq() != null) {
            if (fub2.oq().equals(this.GUID)) {
                this.MessageDelegator.hd(this.GUID);
            } else {
                this.v(fub2.oq(), true);
            }
        }
    }

    public void receiveResponse(ktv ktv2) {
        if (ktv2.egT() == 4868) {
            ljq ljq2 = new ljq();
            kun kun2 = (kun)ktv2;
            for (int i = 0; i < kun2.egZ().length; ++i) {
                if (!kun2.egZ()[i]) continue;
                ljq ljq3 = kun2.eha()[i];
                ljq2.y = ljq3.y - this.Position.y;
                ftv ftv2 = (ftv)this.MessageDelegator.h(1025, this.GUID, this.GUID);
                ftv2.HT(2);
                ftv2.c(ljq2);
                ftv2.a(new lgl(0.0f, 0.0f, 0.0f, 1.0f));
                this.MessageDelegator.F(ftv2);
            }
        } else {
            super.receiveResponse(ktv2);
        }
    }

    public void receiveResourceResponse(ktf ktf2) {
        if (ktf2.egN() == 1) {
            if (((ksv)ktf2).getResult() == 0) {
                this.ami();
                if (this.daN != 1.0f) assert (false);
                if (this.gOF != null) {
                    int n = this.gOF.size();
                    for (int i = 0; i < n; ++i) {
                        this.receiveMessage((dxq)this.gOF.get(i));
                    }
                    this.gOF.clear();
                    this.gOF = null;
                }
                super.receiveResourceResponse(ktf2);
            } else {
                this.MessageDelegator.hd(this.GUID);
            }
        }
    }

    public void a(amf amf2) {
        this.a(amf2, true);
    }

    public void a(amf amf2, boolean bl) {
        btk btk2;
        if (amf2 instanceof btk) {
            btk2 = (btk)amf2;
            btk2.addObserverObject(this.GUID);
        }
        if (this.bC) {
            // empty if block
        }
        if (this.daB.containsKey(amf2.getGUID())) {
            return;
        }
        this.day.add(amf2);
        this.daB.put(amf2.getGUID(), amf2);
        if (this.Initialized && this.MessageDelegator != null && !this.daH && this.MessageDelegator.d(amf2.getGUID()) == null) {
            this.MessageDelegator.a(amf2);
        }
        if (amf2 instanceof btk) {
            btk2 = (btk)amf2;
            if (amf2 instanceof ami && !this.Initialized && (this.Rotation.x != 0.0f || this.Rotation.y != 0.0f || this.Rotation.rlV != 0.0f && !this.daF)) {
                this.a(btk2, this.aw(), this.Position);
            }
            if (amf2 instanceof ami && this.Initialized) {
                ami ami2 = (ami)((Object)amf2);
                ljq ljq2 = new ljq(ami2.av());
                ljq2.et(this.Position);
                ljq ljq3 = new ljq(ami2.FX());
                ldv ldv2 = amf2.getGUID();
                if (bl) {
                    this.a(ldv2, ljq2, ljq3);
                }
            }
        } else {
            return;
        }
    }

    protected void a(btk btk2, lgl lgl2, ljq ljq2) {
        if (this.MessageDelegator != null && lgl2 != null && btk2 != null) {
            fuh fuh2 = null;
            fuh2 = (fuh)this.MessageDelegator.h(1030, this.GUID, btk2.getGUID());
            fuh2.HY(32);
            fuh2.setRotation(lgl2.eqT());
            fuh2.M(lgl2);
            fuh2.cL(ljq2);
            if (this.daD) {
                this.MessageDelegator.F(fuh2);
            } else {
                btk2.receiveMessage(fuh2);
            }
        }
    }

    public int hd(ldv ldv2) {
        return this.v(ldv2, true);
    }

    private int v(ldv ldv2, boolean bl) {
        amf amf2 = this.daB.get(ldv2);
        if (amf2 != null) {
            return this.b(amf2, bl);
        }
        return -1;
    }

    private int b(amf amf2, boolean bl) {
        if (this.day.contains(amf2)) {
            this.day.remove(amf2);
        }
        this.daB.remove(amf2.getGUID());
        if (bl) {
            this.MessageDelegator.hd(amf2.getGUID());
        }
        if (amf2 instanceof btk) {
            ((btk)amf2).removeObserverObject(this.getGUID());
        }
        return 0;
    }

    public ljq av() {
        return new ljq(this.Position);
    }

    public void c(ljq ljq2) {
        if (!this.Initialized) {
            int n;
            int n2;
            if (this.bC) {
                // empty if block
            }
            amf amf2 = null;
            ami ami2 = null;
            ljq ljq3 = null;
            if (this.Position != null && (this.Position.x != 0.0f || this.Position.y != 0.0f || this.Position.rlV != 0.0f)) {
                n2 = this.day.size();
                for (n = 0; n < n2; ++n) {
                    amf2 = this.day.get(n);
                    if (!(amf2 instanceof ami)) continue;
                    ami2 = (ami)((Object)amf2);
                    ljq3 = ami2.av();
                    ljq3.et(this.Position);
                    ami2.c(ljq3);
                }
            }
            this.Position = ljq2;
            if (this.bC) {
                // empty if block
            }
            n2 = this.day.size();
            for (n = 0; n < n2; ++n) {
                amf2 = this.day.get(n);
                if (!(amf2 instanceof ami)) continue;
                ami2 = (ami)((Object)amf2);
                ljq3 = ami2.av();
                ljq3.es(this.Position);
                ami2.c(ljq3);
            }
        } else {
            super.c(ljq2);
        }
    }

    public void setScheduledForRemoval() {
        super.setScheduledForRemoval();
        int n = this.day.size();
        for (int i = 0; i < n; ++i) {
            this.b(this.day.get(0), true);
        }
        if (lcw.qHe) {
            klb klb2 = (klb)this.MessageDelegator.h(1026);
            klb2.ts(this.GUID);
            klb2.HX(klb.iHB);
            klb2.hC(this.GUID);
            this.MessageDelegator.a(klb2);
        }
    }

    public void cleanUp() {
        for (dul dul2 : this.daz) {
            knj knj2 = (knj)this.MessageDelegator.h(778);
            knj2.pPN = 1;
            knj2.kX(dul2.getGUID());
            knj2.ts(this.GUID);
            knj2.qj(new ldv(0L));
            knj2.qk(new ldv(0L));
            this.MessageDelegator.a(knj2);
        }
        this.daz.clear();
    }

    public int amc() {
        return this.daw;
    }

    public void kl(int n) {
        this.daw = n;
    }

    public float getScale() {
        return this.daN;
    }

    public String amd() {
        return this.daC;
    }

    public void fq(String string) {
        this.daC = string;
    }

    public List<amf> ame() {
        return this.day;
    }

    public Map<ldv, amf> amf() {
        return this.daB;
    }

    public boolean amg() {
        return this.daE;
    }

    public void cT(boolean bl) {
        this.daE = bl;
    }

    protected void setDefaultState() {
        this.daF = true;
    }

    public int amh() {
        return this.dax;
    }

    public void km(int n) {
        if (n == 2 || n == 1) {
            this.dax = n;
            if (n == 2) {
                this.m(this.Position, new ljq());
                this.amj();
                this.cU(true);
            } else if (n == 1) {
                this.ami();
                this.cU(false);
            }
        } else assert (false);
        this.dax = n;
    }

    public void ami() {
        ldv ldv2 = null;
        Object var2_2 = null;
        dqk dqk2 = null;
        Object var4_4 = null;
        ljq ljq2 = null;
        ljq ljq3 = null;
        int n = this.day.size();
        for (int i = 0; i < n; ++i) {
            if (!(this.day.get(i) instanceof dqk)) continue;
            dqk2 = (dqk)this.day.get(i);
            ljq2 = new ljq(dqk2.av());
            ljq2.et(this.Position);
            ljq3 = new ljq(dqk2.FX());
            ldv2 = dqk2.getGUID();
            this.a(ldv2, ljq2, ljq3);
        }
    }

    public void a(ldv ldv2, ljq ljq2, ljq ljq3) {
        ldv ldv3 = this.MessageDelegator.bzv();
        if (this.bC) {
            // empty if block
        }
        kni kni2 = (kni)this.MessageDelegator.h(782);
        kni2.ehv = this.GUID;
        kni2.ehw = ldv2;
        kni2.biE = ljq2;
        kni2.biF = new lgl(ljq3);
        kni2.doP = ldv3;
        kni2.pPN = 64;
        kni2.ec = this.GUID;
        this.MessageDelegator.a(kni2);
        dul dul2 = new dul(this.GUID, ldv2, 768);
        dul2.setGUID(ldv3);
        this.daz.add(dul2);
        this.daA.add(new a(this, ldv2, ljq2, ljq3));
    }

    public static void a(ljq ljq2, lgl lgl2, ljq ljq3, lgl lgl3, ljq ljq4, lgl lgl4) {
        ljq ljq5 = new ljq(ljq2);
        ljq5.et(ljq3);
        ljq ljq6 = lgl.a(lgl3, ljq5);
        ljq6.es(ljq3);
        lgl lgl5 = lgl.c(lgl2, lgl3);
        ljq4.ex(ljq6);
        lgl4.X(lgl5);
    }

    public static void b(ljq ljq2, lgl lgl2, ljq ljq3, lgl lgl3, ljq ljq4, lgl lgl4) {
        ljq4.ex(ljq2);
        lgl4.X(lgl2);
        ljq ljq5 = lgl4.eq(ljq3);
        ljq4.es(ljq5);
        lgl lgl5 = lgl.c(lgl2, lgl3);
        lgl4.X(lgl5);
    }

    public void amj() {
        dul dul2 = null;
        int n = this.daz.size();
        for (int i = 0; i < n; ++i) {
            dul2 = this.daz.get(i);
            knj knj2 = (knj)this.MessageDelegator.h(778);
            knj2.ehv = dul2.Bq();
            knj2.ehw = dul2.Br();
            knj2.biE = new ljq();
            knj2.biF = new lgl();
            knj2.doP = dul2.getGUID();
            knj2.pPN = 1;
            knj2.ec = this.GUID;
            this.MessageDelegator.a(knj2);
        }
        this.daz.clear();
        this.daA.clear();
    }

    protected void cU(boolean bl) {
    }

    public void reset() {
        super.reset();
        this.ObjectDescriptionFilename = "n/a";
    }
}

