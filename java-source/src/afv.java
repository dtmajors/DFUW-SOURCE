/*
 * Decompiled with CFR.
 */
public class afv
extends agj {
    private bzs bho = null;

    public afv() {
        super(ahu.b.blO);
        this.bhY = new agj.a[4];
        this.bhY[0] = new agj.a(this, 1);
        this.bhY[1] = new agj.a(this, 2);
        this.bhY[2] = new agj.a(this, 4);
        this.bhY[3] = new agj.a(this, 32);
    }

    public bzs Am() {
        return this.bho;
    }

    public void c(bzs bzs2) {
        this.bho = bzs2;
    }

    @Override
    public vd eD(int n) {
        assert (this.bho.vI() == null);
        ut ut2 = new ut();
        ut2.Uo = this.AJ();
        if (this.eT(1) > n && !this.bhX) {
            ut2.aXP = 1;
            ut2.aXo = this.bho.aFw();
            return ut2;
        }
        if (this.eT(2) > n && !this.bhX) {
            ut2.aXP |= 2;
            ut2.aXo = this.bho;
        }
        if (this.eT(32) > n) {
            ut2.aXP |= 0x28;
            ut2.aXo = this.bho;
        }
        if (this.eT(4) > n && this.bhX) {
            if (this.eX(n)) {
                return null;
            }
            ut2.aXP = 4;
            ut2.aXo = this.bho;
        }
        if (ut2.aXo == null) {
            return null;
        }
        ut2.aXo = ut2.aXo.aFw();
        return ut2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFApparelItemEventProperty: GUID=");
        stringBuilder.append(this.bho.GUID);
        stringBuilder.append(" ResourceType='");
        stringBuilder.append(this.bho.pa());
        stringBuilder.append("'");
        return stringBuilder.toString();
    }
}

