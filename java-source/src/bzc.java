/*
 * Decompiled with CFR.
 */
public class bzc {
    public static final int edh = 0;
    public static final int edi = 1;
    public static final int edj = 2;
    public static final int edk = 3;
    private static final boolean bC = false;
    public double QM = 0.0;
    public boolean edl = false;
    public boolean edm = false;
    public boolean edn = false;
    public boolean edo = true;
    public int edp = 0;
    public int edq = 0;
    public int[] edr = null;
    public ldv[] eds = null;

    public bzc aFa() {
        bzc bzc2 = new bzc();
        bzc2.edl = this.edl;
        bzc2.edm = this.edm;
        bzc2.edn = this.edn;
        bzc2.edo = this.edo;
        bzc2.edp = this.edp;
        bzc2.edq = this.edq;
        bzc2.edr = this.edr;
        bzc2.eds = this.eds;
        return bzc2;
    }

    public boolean equals(Object object) {
        if (object instanceof bzc) {
            return this.a((bzc)object, true);
        }
        assert (false);
        return false;
    }

    public boolean a(bzc bzc2, boolean bl) {
        if (bl && this.edl != bzc2.edl) {
            return false;
        }
        if (this.edm != bzc2.edm) {
            return false;
        }
        if (this.edn != bzc2.edn) {
            return false;
        }
        if (this.edo != bzc2.edo) {
            return false;
        }
        return this.edp == bzc2.edp;
    }

    public String aFb() {
        switch (this.edp) {
            case 0: {
                return "No water contact";
            }
            case 1: {
                return "Touching water";
            }
            case 2: {
                return "On water surface";
            }
            case 3: {
                return "Submerged in water";
            }
        }
        return "Unknown";
    }

    public boolean aFc() {
        if (this.edp == 0) {
            return false;
        }
        if (this.edq <= 0) {
            return false;
        }
        return lea.eoX().containsKey(this.edq);
    }

    public boolean aEy() {
        switch (this.edp) {
            case 0: 
            case 1: {
                return false;
            }
            case 2: 
            case 3: {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFPhysicsState: ");
        stringBuilder.append(" Contact=");
        stringBuilder.append(this.edl);
        stringBuilder.append(" Rest=");
        stringBuilder.append(this.edn);
        stringBuilder.append(" Stable=");
        stringBuilder.append(this.edo);
        stringBuilder.append(" WaterContactState='");
        stringBuilder.append(this.aFb());
        stringBuilder.append("'");
        return stringBuilder.toString();
    }
}

