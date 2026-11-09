/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dqk
 *  lcw
 */
public class dsg
extends dqk {
    private dfq gBM = null;
    private dfw gXk = null;
    private dsf gXl = null;

    public dsg() {
        this.ObjectType = 147;
        dez dez2 = new dez();
        this.gBM = (dfq)dez2.Af(28);
        this.gXk = (dfw)dez2.Af(21);
        this.gXl = new dsf(this);
    }

    public void initialize() {
        if (!lcw.qHe) {
            lfn.b(5, ((Object)((Object)this)).getClass().getName(), "initialize() : Light representation Objects should only be created from the worldbuilder");
            return;
        }
        this.ObjectDescriptionFilename = "gizmos\\gizmo_light01.xml";
        this.Rotation = new lgl();
        super.initialize();
        this.gBM.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.gBM);
        this.gXk.c(this.Position.esF());
        this.gXk.setOuterRadius(this.gBM.getRange());
        this.gXk.setOuterOn(true);
        this.gXk.setOuterColorNumber(4);
        this.gXk.setInnerRadius(10.0f);
        this.gXk.setInnerOn(true);
        this.gXk.setInnerColor(new lcq(1.0f, 1.0f, 1.0f, 1.0f));
        this.gXk.setTextureName("");
        this.gXk.hX(false);
        this.gXk.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.gXk);
        if (!this.gXl.bxC()) {
            this.gXl.c(this.av());
            this.gXl.a(new lgl());
        }
        this.gXl.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a((amf)((Object)this.gXl));
        this.bxG();
    }

    protected void a(kuv kuv2) {
        super.a(kuv2);
        this.updateLight();
    }

    protected void a(kwp kwp2) {
        super.a(kwp2);
        this.updateLight();
    }

    protected void updateLight() {
        this.gBM.c(this.Position.esF());
        this.gXk.c(this.Position.esF());
    }

    public void b(dqn dqn2) {
        super.b(dqn2);
        dsg dsg2 = (dsg)((Object)dqn2);
        dfq dfq2 = dsg2.bxE();
        dfq dfq3 = this.bxE();
        dfq2.setRange(dfq3.getRange());
        dfq2.e(dfq3.bmN().esM());
        dfq2.g(new lco(dfq3.bmL()));
        dfq2.h(new lco(dfq3.bmM()));
        dfq2.setColorMultiplier(dfq3.getColorMultiplier());
        dfq2.setFlickerColorMultiplier(dfq3.getFlickerColorMultiplier());
        dfq2.c(dfq3.bmJ().esM());
        dfq2.d(dfq3.bmK().esM());
    }

    public void cleanUp() {
        if (!this.gBM.isCleanedUp()) {
            this.MessageDelegator.hd(this.gBM.getGUID());
        }
        if (!this.gXk.isCleanedUp()) {
            this.MessageDelegator.hd(this.gXk.getGUID());
        }
        if (!this.gXl.isCleanedUp()) {
            this.MessageDelegator.hd(this.gXl.getGUID());
        }
        super.cleanUp();
    }

    public void setRange(float f2) {
        this.gBM.setRange(f2);
        this.gXk.setOuterRadius(f2);
    }

    public void gt(float f2) {
        this.gBM.gt(f2);
    }

    public dfq bxE() {
        return this.gBM;
    }

    public dfw bxF() {
        return this.gXk;
    }

    public void bxG() {
        if (this.gXl.bxC()) {
            ljq ljq2 = this.gXl.av();
            lgl lgl2 = this.gXl.aw();
            ljq ljq3 = lgl2.eq(new ljq(0.0f, 0.0f, 1.0f));
            ljq3.normalize();
            ljr ljr2 = new ljr(0.0f, ljq3.x, ljq3.y, ljq3.rlV);
            ljr2.nl(-(ljr2.x * ljq2.x + ljr2.y * ljq2.y + ljr2.rlV * ljq2.rlV) + 0.01f);
            this.gBM.e(ljr2);
        } else {
            this.gBM.e(new ljr(0.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public void jm(boolean bl) {
        this.gXl.jl(bl);
        this.gXl.setVisible(bl);
        this.bxG();
    }

    public boolean bxH() {
        return this.gXl.bxC();
    }

    public dsf bxI() {
        return this.gXl;
    }
}

