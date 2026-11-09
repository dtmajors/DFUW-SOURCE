/*
 * Decompiled with CFR.
 */
public class imf
extends ilq {
    @Override
    public boolean b(ilx ilx2) {
        return ilx2 != null && ilx2 instanceof img;
    }

    @Override
    public boolean c(ilx ilx2) {
        if (!this.b(ilx2)) {
            assert (false);
            return false;
        }
        return super.c(ilx2);
    }

    @Override
    public void print(int n, int n2) {
        lfn.b(n, "Inventory Node", lhn.acR(n2 * 4) + "Root");
        this.ec(n, n2);
    }

    public iln dea() {
        for (ilx ilx2 : this.getChildren()) {
            if (!(ilx2 instanceof iln)) continue;
            return (iln)ilx2;
        }
        return null;
    }

    @Override
    public loz ddF() {
        return lxb.tmg.bD(new Object[0]);
    }
}

