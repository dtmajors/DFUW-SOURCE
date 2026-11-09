/*
 * Decompiled with CFR.
 */
public class aij
extends agj {
    private cba bnn = null;

    public aij() {
        super(ahu.b.bmd);
        this.bhY = new agj.a[6];
        this.bhY[0] = new agj.a(this, 1);
        this.bhY[1] = new agj.a(this, 2);
        this.bhY[2] = new agj.a(this, 4);
        this.bhY[3] = new agj.a(this, 32);
        this.bhY[4] = new agj.a(this, 2048);
        this.bhY[5] = new agj.a(this, 4096);
    }

    public cba BO() {
        return this.bnn;
    }

    public void a(cba cba2) {
        this.bnn = cba2;
    }

    @Override
    public vd eD(int n) {
        assert (this.bnn.vI() == null);
        vv vv2 = new vv();
        vv2.Uo = this.AJ();
        if (this.eT(1) > n && !this.bhX) {
            vv2.aXP = 1;
            vv2.aYk = this.bnn.aHk();
            return vv2;
        }
        if (this.eT(2) > n && !this.bhX) {
            vv2.aXP |= 2;
            vv2.aYk = this.bnn;
        }
        if (this.eT(32) > n) {
            vv2.aXP |= 0x28;
            vv2.aYk = this.bnn;
        }
        if (this.eT(2048) > n) {
            assert (this.bnn.aXT);
            vv2.aXP |= 0x808;
            vv2.aYk = this.bnn;
        }
        if (this.eT(4096) > n) {
            assert (!this.bnn.aXT);
            vv2.aXP |= 0x1008;
            vv2.aYk = this.bnn;
        }
        if (this.eT(4) > n && this.bhX) {
            if (this.eX(n)) {
                return null;
            }
            vv2.aXP = 4;
            vv2.aYk = this.bnn;
        }
        if (vv2.aYk == null) {
            return null;
        }
        vv2.aYk = vv2.aYk.aHk();
        return vv2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFWeaponItemEventProperty: ItemGUID=");
        stringBuilder.append(this.bnn.GUID);
        stringBuilder.append(" ResourceType='");
        stringBuilder.append(this.bnn.pa());
        stringBuilder.append("'");
        return stringBuilder.toString();
    }
}

