/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  cxd
 */
public class ddx {
    public ldv aCK = null;
    public int aRX = 0;
    public int fWU = 0;
    public int geG = 0;
    public float fyb = 0.0f;
    public float geH = 0.0f;
    public float geI = 0.0f;
    public float fyc = 0.0f;
    public float bFz = 0.0f;
    public float geJ = 0.0f;
    public float geK = 0.0f;
    public int geL;
    public int geM;
    public float geN = 0.0f;
    public int[] bqd = null;
    public float geO = 0.0f;
    public float geP = 0.0f;
    private static les ResourceTree = lea.enW();
    private static les aqN = lea.enZ();
    private int geQ = 0;

    public boolean bkd() {
        assert (this.aCK != null);
        assert (this.aRX > 0);
        assert (this.fWU > 0);
        if (this.geK < 0.0f) {
            return false;
        }
        return !(this.bkm() ? this.geH < 0.0f : aqN.isDescendant(this.fWU, cxd.fIr) && !ResourceTree.isDescendant(this.aRX, cug.fiz) && this.geI < 0.0f);
    }

    public ddy bke() {
        ddy ddy2 = new ddy();
        ddy2.aCK = this.aCK;
        ddy2.aRX = this.aRX;
        ddy2.fWU = this.fWU;
        ddy2.geG = this.geG;
        ddy2.fyb = this.fyb;
        ddy2.geH = this.geH;
        ddy2.geI = this.geI;
        ddy2.fyc = this.fyc;
        ddy2.bFz = this.bFz;
        ddy2.geJ = this.geJ;
        ddy2.geK = this.geK;
        ddy2.geN = this.geN;
        ddy2.bqd = this.bqd;
        ddy2.geO = this.geO;
        ddy2.geP = this.geP;
        ddy2.geL = this.geL;
        ddy2.geM = this.geM;
        return ddy2;
    }

    public String bkf() {
        if (this.aRX <= 0) {
            return "NULL";
        }
        return ResourceTree.getName(this.aRX);
    }

    public int uw() {
        return this.aRX;
    }

    public int bkg() {
        return this.geQ;
    }

    public float xo(int n2) {
        switch (n2) {
            case 624: {
                return this.geH;
            }
            case 640: {
                return this.geI;
            }
            case 704: {
                return this.fyc;
            }
            case 672: {
                return this.bFz;
            }
            case 688: {
                return this.geJ;
            }
            case 1104: {
                return this.geK;
            }
            case 5824: {
                return this.geN;
            }
        }
        lfn.b(5, "SFWeaponInfo", "getPropertyValue() PropertyType is invalid: " + n2);
        assert (false);
        return 0.0f;
    }

    public String bkh() {
        bqm.d d2 = this.bki();
        if (d2 == null) {
            lfn.b(5, "SFWeaponInfo", "getWeaponName() WeaponType is invalid.");
            return null;
        }
        return d2.name();
    }

    public String bfV() {
        if (this.fWU <= 0) {
            return "NULL";
        }
        return aqN.getName(this.fWU);
    }

    public bqm.d bki() {
        if (this.aRX <= 0) {
            return null;
        }
        return bqm.d.getWeaponType(this.aRX);
    }

    public bqm.d bkj() {
        if (this.geQ <= 0) {
            lfn.b(5, "SFWeaponInfo", "getPreviousWeaponType() PreviousItemResourceType is invalid.");
            return null;
        }
        return bqm.d.getWeaponType(this.geQ);
    }

    public final boolean bkk() {
        if (this.aRX <= 0) {
            return false;
        }
        return cug.vF((int)this.aRX);
    }

    public final boolean bkl() {
        if (this.aRX <= 0) {
            return false;
        }
        return ResourceTree.isDescendant(this.aRX, cug.fiB);
    }

    public final boolean bkm() {
        if (this.fWU <= 0) {
            return false;
        }
        return lea.enZ().isDescendant(this.fWU, cxd.fIk) || lea.enZ().isDescendant(this.fWU, cxd.fIm);
    }

    public final boolean bkn() {
        if (this.aRX <= 0) {
            return false;
        }
        return ResourceTree.isDescendant(this.aRX, cug.fiC);
    }

    public final boolean bko() {
        bqm.d d2 = this.bki();
        if (d2 == null) {
            lfn.b(5, "SFWeaponInfo", "isNaturalWeapon() WeaponType is null.");
            return false;
        }
        return bqm.d.isNaturalWeapon(d2);
    }

    public final boolean bkp() {
        if (this.aRX <= 0) {
            return false;
        }
        return ResourceTree.isDescendant(this.aRX, cug.fmO);
    }

    public boolean bkq() {
        return this.fWU > 0;
    }

    public void reset() {
        this.aCK = null;
        this.geQ = this.aRX;
        this.aRX = 0;
        this.fWU = 0;
        this.geG = 0;
        this.fyb = 0.0f;
        this.geH = 0.0f;
        this.geI = 0.0f;
        this.fyc = 0.0f;
        this.bFz = 0.0f;
        this.geJ = 0.0f;
        this.geK = 0.0f;
        this.geN = 0.0f;
        this.bqd = null;
        this.geP = 0.0f;
        this.geO = 0.0f;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFWeaponInfo: ItemGUID=");
        stringBuilder.append(this.aCK);
        stringBuilder.append(" ResourceType='");
        stringBuilder.append(this.bkf());
        stringBuilder.append("'");
        return stringBuilder.toString();
    }
}

