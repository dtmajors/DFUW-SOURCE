/*
 * Decompiled with CFR.
 */
import java.util.Map;

public class ilt {
    private ldv min;
    private bsh mio;

    public ilt(ldv ldv2, bsh bsh2) {
        this.min = ldv2;
        this.mio = bsh2;
    }

    public ldv getGUID() {
        return this.min;
    }

    public bsh cBu() {
        return this.mio;
    }

    public void y(bsh bsh2) {
        this.mio = bsh2;
    }

    public String toString() {
        return "Inventory Item [GUID = " + this.min.toString() + ", Resource = " + this.mio.awz() + ", Name = " + new hwo((bsh)this.mio).cBj().text + "]";
    }

    public int vf() {
        return this.mio != null ? this.mio.vf() : 1;
    }

    public boolean S(bsh bsh2) {
        return bsi.a(this.mio, bsh2);
    }

    public boolean rB(ldv ldv2) {
        return this.mio.getGUID().equals(ldv2);
    }

    public float getWeight() {
        return this.mio.awB();
    }

    public long ddp() {
        return this.mio.AQ();
    }

    public boolean auW() {
        return this.mio.awx().auW();
    }

    public boolean ddq() {
        return ilm.O(this.mio);
    }

    public ilu ddr() {
        ej[] ejArray;
        ilu ilu2 = new ilu();
        for (ej ej2 : ejArray = this.mio.arJ()) {
            if (ej2.getType() == 14096) {
                ilu2.color = ((ew)ej2).fQ();
                continue;
            }
            if (ej2.getType() != 14112) continue;
            ilu2.mip = ((ff)ej2).getStringValue();
        }
        return ilu2;
    }

    public void b(ilu ilu2) {
        dxr dxr2 = hso.cxK().cxP().cza().getMessageDelegator();
        hxd hxd2 = hso.cxK().cxP().cza().ri(this.mio.AW());
        flf flf2 = (flf)dxr2.h(8009, hso.cxK().cxP().cza().getGUID(), hxd2.cCQ());
        flf2.setType(3);
        flf2.pJ(this.mio.getGUID());
        flf2.setColor(ilu2.color);
        flf2.setText(ilu2.mip != null ? ilu2.mip : "");
        dxr2.E(flf2);
    }

    public boolean L(Map<Integer, Integer> map) {
        int n;
        Integer n2 = map.get(this.mio.az());
        if (n2 != null && (n = n2.intValue()) > 0 && n - this.vf() >= 0) {
            map.put(this.mio.az(), n - this.vf());
            hxd hxd2 = hso.cxK().cxP().cza().ri(this.mio.AW());
            hxd hxd3 = hso.cxK().cxP().cza().cCH();
            hxd2.a(this.mio.getGUID(), hxd3, false);
            return true;
        }
        return false;
    }
}

