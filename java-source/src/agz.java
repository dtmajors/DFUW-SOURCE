/*
 * Decompiled with CFR.
 */
public class agz
extends agj {
    private alu biz = null;

    public agz() {
        super(ahu.b.blW);
        this.bhY = new agj.a[3];
        this.bhY[0] = new agj.a(this, 1);
        this.bhY[1] = new agj.a(this, 4);
        this.bhY[2] = new agj.a(this, 8);
    }

    public alu Bh() {
        return this.biz;
    }

    public void f(alu alu2) {
        this.biz = alu2;
    }

    public boolean equals(Object object) {
        assert (this.biz != null);
        if (object instanceof agz) {
            agz agz2 = (agz)object;
            return agz2.Bh().equals(this.biz);
        }
        return false;
    }

    @Override
    public vd eD(int n) {
        vk vk2 = new vk();
        vk2.Uo = this.AJ();
        if (this.eT(1) > n && !this.bhX) {
            vk2.aXP = 1;
            vk2.aXW = this.biz.Eo();
            return vk2;
        }
        if (this.eT(8) > n) {
            vk2.aXP |= 8;
            vk2.aXW = this.biz.Eo();
        }
        if (this.eT(4) > n && this.bhX) {
            if (this.eX(n)) {
                return null;
            }
            vk2.aXP = 4;
            vk2.aXW = this.biz.Eo();
        }
        if (vk2.aXW == null) {
            return null;
        }
        return vk2;
    }

    public String toString() {
        return "SFModifierInfoEventProperty: " + this.biz;
    }
}

