/*
 * Decompiled with CFR.
 */
import java.util.List;

public class img
extends ima {
    private bqm.b mja;

    public img(bqm.b b2) {
        this.mja = b2;
        this.ddZ();
    }

    @Override
    public boolean ddh() {
        return bqm.b.isLootableType(this.mja);
    }

    public bqm.b alX() {
        return this.mja;
    }

    @Override
    public hxd cBs() {
        return hso.cxK().cxP().cza().d(this.mja);
    }

    @Override
    public final int ddK() {
        int n = 0;
        List<ilx> list = this.getChildren();
        for (ilx ilx2 : list) {
            n += ilx2.getItemCount();
        }
        return n;
    }

    @Override
    public final int ddL() {
        return 2000;
    }

    @Override
    public float aum() {
        hxd hxd2 = hso.cxK().cxP().cza().d(this.mja);
        return hxd2 != null ? hxd2.cCR() : 0.0f;
    }

    @Override
    public boolean ddT() {
        return true;
    }

    @Override
    public void ddn() {
        while (this.bfn() > 0) {
            this.d(this.Rr(this.bfn() - 1));
        }
        this.ddZ();
    }

    @Override
    public int ddj() {
        return 0x1C1C1C;
    }

    @Override
    public loz ddF() {
        return bqm.b.getInventoryTitleStringID(this.mja).bD(new Object[0]);
    }

    @Override
    public int ddV() {
        return 1;
    }

    @Override
    final void ddt() {
        ilw.ddy().miF.V(this);
    }

    @Override
    final void ddu() {
        ilw.ddy().miG.V(this);
    }

    private void ddZ() {
        this.e(hso.cxK().cxP().cza().d(this.mja));
    }
}

