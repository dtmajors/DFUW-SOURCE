/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dqk
 *  lcw
 */
public class dsi
extends dqk {
    private dsj gXp = null;
    private float gXq = 1.0f;
    private boolean gWU = false;

    public dsi(dsj dsj2) {
        this.gXp = dsj2;
        this.ObjectType = 142;
    }

    public void initialize() {
        if (!lcw.qHe) {
            lfn.b(5, ((Object)((Object)this)).getClass().getName(), "initialize() : road control point objects should only be created from the worldbuilder");
            return;
        }
        this.ObjectDescriptionFilename = "gizmos\\gizmo_road_marker_01.xml";
        this.Rotation = new lgl();
        super.initialize();
    }

    public void receiveResponse(ktv ktv2) {
        if (ktv2.egT() == 516) {
            kwp kwp2 = (kwp)ktv2;
            this.Position = kwp2.av();
            if (!this.Position.esJ()) {
                this.gXp.bxN();
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

    public float bxK() {
        return this.gXq;
    }

    public void iq(float f2) {
        this.gXq = f2;
    }

    public dsj bxL() {
        return this.gXp;
    }

    public void cleanUp() {
        super.cleanUp();
        if (this.gWU) {
            kpl kpl2 = (kpl)this.MessageDelegator.h(517);
            kpl2.aag(2);
            kpl2.hK(this.dJs);
            kpl2.sy(this.getGUID());
            kpl2.ts(this.getGUID());
            kpl2.wD(false);
            kpl2.jM(true);
            this.MessageDelegator.a(kpl2);
        }
    }
}

