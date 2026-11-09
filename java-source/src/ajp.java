/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  mcs
 */
public class ajp
extends aja {
    public ajp() {
        this.bog = ajb.b.boR;
    }

    @Override
    protected void a(aja aja2) {
        super.a(aja2);
    }

    @Override
    protected final boolean BU() {
        Object object;
        this.bok = null;
        if (this.boj.aJz().bgQ() instanceof cev && ((cev)(object = (cev)this.boj.aJz().bgQ())).aLV().bdc()) {
            this.bok = mcs.uAH.bD(new Object[0]);
            return false;
        }
        object = this.boj.aJz().bgQ().aJD().aEP();
        if (((byv)object).Uv()) {
            bqs bqs2 = this.CP();
            if (bqs2 == null) {
                return true;
            }
            bqm.d d2 = bqm.d.getWeaponType(bqs2.az());
            boolean bl = bqm.d.isAllowedWhileMounted(d2);
            if (!bl) {
                this.bok = mcs.uAG.bD(new Object[0]);
            }
            return bl;
        }
        return true;
    }

    private bqs CP() {
        return ((bre)this.boj.aJz().bgQ().aJC().asf()).avx();
    }
}

