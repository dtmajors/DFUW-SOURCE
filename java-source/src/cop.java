/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cph
 */
public abstract class cop
extends cph {
    protected bxs ePF = null;
    protected amn eMU = null;

    public cop(boolean bl) {
        super(bl);
        this.ObjectType = 84;
        this.ePF = bl ? new bxu(this) : new bxt(this);
    }

    public final bxs aVp() {
        return this.ePF;
    }

    public final byx aJD() {
        return this.ePF;
    }

    public void b(byv byv2, boolean bl) {
    }

    public void initialize() {
        super.initialize();
        this.ePF.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.ePF);
    }

    public void setScheduledForRemoval() {
        super.setScheduledForRemoval();
        this.ePF.setActive(false);
        this.MessageDelegator.hd(this.ePF.getGUID());
    }

    protected void p(cbx cbx2) {
        super.p(cbx2);
        cop cop2 = (cop)cbx2;
        if (this.ePF != null) {
            this.ePF.b(cop2.aVp());
        }
    }

    public amn aVq() {
        return this.eMU;
    }

    public void a(amn amn2) {
        this.eMU = amn2;
    }
}

