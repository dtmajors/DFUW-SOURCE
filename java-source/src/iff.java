/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
public class iff
extends ifd {
    @Override
    public boolean cRY() {
        return true;
    }

    @Override
    public String cRZ() {
        float f = this.al(1232);
        float f2 = this.al(1234);
        int n = (int)(f / f2 * 100.0f);
        return lxy.tAU.bD(Float.valueOf(f), n).exA();
    }

    @Override
    public float cSa() {
        return this.al(1232) / this.al(1234);
    }

    iff(bsh bsh2) {
        super(bsh2);
    }

    @Override
    protected boolean cSe() {
        if (this.lQU == null) {
            lfn.b(5, "SFSalvageableItemEquipment", "setupItem() : Item is Null!!!");
            return false;
        }
        if (!iff.M(this.lQU)) {
            return false;
        }
        if (cug.wm((int)this.lQU.az())) {
            return false;
        }
        this.iNh = this.lQU.az();
        return super.cSe();
    }

    @Override
    public boolean a(ifd ifd2) {
        return false;
    }

    @Override
    public void K(bsh bsh2) {
        this.lQU = bsh2;
        this.lQV = bsh2.vf();
    }

    @Override
    public boolean L(bsh bsh2) {
        if (bsh2 == null) {
            return true;
        }
        return !this.equals(bsh2);
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (object instanceof iff) {
            return ldv.au(this.lQU == null ? null : this.lQU.getGUID(), ((iff)object).lQU == null ? null : ((iff)object).lQU.getGUID());
        }
        if (object instanceof bsh) {
            return ldv.au(this.lQU == null ? null : this.lQU.getGUID(), ((bsh)object).getGUID());
        }
        return false;
    }

    private float al(int n) {
        if (this.lQU == null) {
            return 0.0f;
        }
        ej[] ejArray = this.lQU.arJ();
        if (ejArray == null || ejArray.length == 0) {
            return 0.0f;
        }
        for (int i2 = 0; i2 < ejArray.length; ++i2) {
            if (ejArray[i2].getType() != n || !(ejArray[i2] instanceof et)) continue;
            return ((et)ejArray[i2]).fN();
        }
        return 0.0f;
    }
}

