/*
 * Decompiled with CFR.
 */
import java.util.Collection;

public class jhh
extends jhf {
    private boolean nez;
    private ipb neA;

    public jhh(ign ign2, boolean bl) {
        super(ign2);
        this.nez = bl;
    }

    @Override
    public boolean dFM() {
        return !this.nez;
    }

    @Override
    public jhi dFQ() {
        return new jhh(this.cUF(), false);
    }

    @Override
    public boolean dFR() {
        return !this.nez;
    }

    @Override
    public void tv(boolean bl) {
        super.tv(bl);
        if (!this.cUF().cTT()) {
            return;
        }
        this.dFB().setVisible(true);
        if (this.neA != null) {
            this.neA.removeFromParent();
            this.neA = null;
        }
        this.dFV().Rk(0xD0D0D0);
        if (this.dFW() != null) {
            this.dFW().Rk(0xD0D0D0);
        }
        if (this.dFY() != null) {
            this.dFY().Rk(12357465);
        }
        if (this.dFK() != null) {
            Collection<igu> collection = this.dFK().values();
            for (igu igu2 : collection) {
                igu2.aTg();
            }
        }
    }

    public void dFS() {
        this.dFB().setVisible(false);
        if (this.neA == null) {
            this.neA = new ipb("icon_repeatables_02");
            this.dFJ().W(this.neA);
        }
        this.dFV().Rk(0x5D5D5D);
        this.dFW().Rk(0x5D5D5D);
        this.dFX().Rk(0x5D5D5D);
        this.dFY().Rk(0x5D5D5D);
        if (this.dFK() != null) {
            Collection<igu> collection = this.dFK().values();
            for (igu igu2 : collection) {
                igu2.cUH().Rk(0x5D5D5D);
            }
        }
    }

    @Override
    public void cGR() {
        this.cUF().qf(false);
    }

    @Override
    public void dFT() {
        this.dFV().Rk(this.dkb() ? 12357465 : (this.cUF().cTT() && this.cUF().isCompleted() ? 0x5D5D5D : 0xD0D0D0));
    }

    @Override
    protected void dFU() {
        super.dFU();
        if (this.cUF().isCompleted() && this.cUF().cTT()) {
            this.dFS();
        }
    }

    @Override
    public /* synthetic */ Object clone() {
        return this.dFQ();
    }
}

