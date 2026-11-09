/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dqk
 *  lcw
 */
public class dsa
extends dqk {
    protected ldv gWN = null;
    protected String fFC = "road_vele.dds";
    protected ljq gWO = new ljq(0.0f, 1.0f, 0.0f);
    protected int gWP = 0;
    protected ljp gWQ = new ljp(6.0f, 6.0f);
    protected float gWR = 0.5f;
    protected int gWS = 1;
    private boolean bEJ = false;
    private ldv gWT = null;
    private boolean gWU = false;

    public dsa() {
        this.ObjectType = 148;
    }

    public void initialize() {
        if (!lcw.qHe) {
            lfn.b(5, ((Object)((Object)this)).getClass().getName(), "initialize() : road control point objects should only be created from the worldbuilder");
            return;
        }
        this.ObjectDescriptionFilename = "gizmos\\gizmo_light01.xml";
        this.Rotation = new lgl();
        super.initialize();
    }

    public void receiveResponse(ktv ktv2) {
        if (ktv2.egT() == 1024) {
            kux kux2 = (kux)ktv2;
            this.gWT = kux2.axa();
        } else if (ktv2.egT() == 516) {
            kwp kwp2 = (kwp)ktv2;
            this.Position = kwp2.av();
            if (!this.Position.esJ()) {
                this.bxn();
            }
            kpl kpl2 = (kpl)this.MessageDelegator.h(517);
            kpl2.aag(16);
            kpl2.hK(this.dJs);
            kpl2.sy(this.getGUID());
            kpl2.ts(this.getGUID());
            kpl2.wD(false);
            kpl2.jM(true);
            this.MessageDelegator.a(kpl2);
        }
    }

    public void bxn() {
        if (this.bEJ && this.gWT == null) {
            return;
        }
        kks kks2 = (kks)this.MessageDelegator.h(1046);
        kks2.YB(this.bEJ ? 1 : 0);
        kks2.ts(this.GUID);
        kks2.hC(this.gWT == null ? this.GUID : this.gWT);
        kks2.setTextureName(this.fFC);
        kks2.dn(this.gWO);
        kks2.aG(this.av());
        kks2.nJ(this.gWN == null ? new ldv(0L) : this.gWN);
        kks2.YA(this.gWP);
        kks2.n(this.gWQ);
        kks2.io(this.gWR);
        kks2.setOffset(this.gWS);
        this.MessageDelegator.a(kks2);
        this.bEJ = true;
    }

    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        if (this.dJs != null && !this.gWU) {
            this.gWU = true;
            kpl kpl2 = (kpl)this.MessageDelegator.h(517);
            kpl2.lQ(false);
            kpl2.wC(false);
            kpl2.jM(true);
            kpl2.wD(false);
            kpl2.sy(this.getGUID());
            kpl2.ts(this.getGUID());
            kpl2.hK(this.dJs);
            kpl2.aai(1);
            kpl2.aaj(1);
            kpl2.aag(1);
            kpl2.aah(3);
            kpl2.zP(50);
            this.MessageDelegator.a(kpl2);
        }
    }

    public ljq bxo() {
        return this.gWO;
    }

    public void cw(ljq ljq2) {
        this.gWO = ljq2;
    }

    public ldv bxp() {
        return this.gWN;
    }

    public String getTextureName() {
        return this.fFC;
    }

    public void setTextureName(String string) {
        this.fFC = string;
    }

    public ljp bxq() {
        return this.gWQ;
    }

    public void l(ljp ljp2) {
        this.gWQ = ljp2;
    }

    public void nJ(ldv ldv2) {
        this.gWN = ldv2;
    }

    public void cleanUp() {
        khd khd2;
        super.cleanUp();
        if (this.gWT != null) {
            khd2 = (klb)this.MessageDelegator.h(1026);
            ((klb)khd2).HX(klb.iHB);
            khd2.ts(this.GUID);
            ((kld)khd2).hC(this.gWT);
            this.MessageDelegator.a(khd2);
        }
        if (this.gWU) {
            khd2 = (kpl)this.MessageDelegator.h(517);
            ((kpl)khd2).aag(2);
            ((kpl)khd2).hK(this.dJs);
            ((kpo)khd2).sy(this.getGUID());
            khd2.ts(this.getGUID());
            khd2.wD(false);
            khd2.jM(false);
            this.MessageDelegator.a(khd2);
        }
    }

    protected void b(dqn dqn2) {
        dsa dsa2 = (dsa)((Object)dqn2);
        dsa2.fFC = this.fFC;
        dsa2.gWQ = this.gWQ;
        dsa2.gWP = this.gWP;
        dsa2.gWN = this.gWN;
        dsa2.gWR = this.gWR;
        dsa2.gWS = this.gWS;
        dsa2.gWO = this.gWO;
        super.b(dqn2);
    }

    public int bxr() {
        return this.gWP;
    }

    public void BK(int n) {
        this.gWP = n;
    }

    public float bxs() {
        return this.gWR;
    }

    public void io(float f2) {
        this.gWR = f2;
    }

    public int bxt() {
        return this.gWS;
    }

    public void BL(int n) {
        this.gWS = n;
    }

    public ldv bxu() {
        return this.gWT;
    }

    public void nK(ldv ldv2) {
        this.gWT = ldv2;
    }
}

