/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 *  cug
 */
public class ddy {
    public ldv aCK = null;
    public int aRX = 0;
    public int fWU = 0;
    public int geG = 0;
    public float fyb = 0.0f;
    public float geH = 0.0f;
    public float geI = 0.0f;
    public float geR = 0.0f;
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
    public cym geS = null;
    public dcq[] geT = null;
    private static les ResourceTree = lea.enW();
    private static les aqN = lea.enZ();

    public float zL(int n2) {
        if (this.bqd == null) {
            return 0.0f;
        }
        boolean bl = false;
        int n3 = this.bqd.length;
        for (int i2 = 0; i2 < n3; ++i2) {
            if (!ResourceTree.isDescendant(n2, this.bqd[i2])) continue;
            bl = true;
            break;
        }
        if (!bl) {
            return 0.0f;
        }
        float f2 = 0.0f;
        if (this.geO > 0.0f) {
            f2 += this.geO;
        }
        if (this.geP > 0.0f) {
            f2 += this.geP;
        }
        return f2;
    }

    public String bkf() {
        if (this.aRX <= 0) {
            return "NULL";
        }
        return ResourceTree.getName(this.aRX);
    }

    public float h(cxc cxc2, int n2) {
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
            case 705: {
                if (!cxc2.bfF()) {
                    assert (false);
                    return 0.0f;
                }
                if (!(cxc2.aJz().bgQ() instanceof cex)) {
                    return 0.0f;
                }
                if (cxc2.aJz().bgQ().fi() == null) {
                    return 0.0f;
                }
                return cxc2.aJz().bgQ().fi().al(this.geL);
            }
            case 706: {
                if (!cxc2.bfF()) {
                    assert (false);
                    return 0.0f;
                }
                if (!(cxc2.aJz().bgQ() instanceof cex)) {
                    return 0.0f;
                }
                if (cxc2.aJz().bgQ().fi() == null) {
                    return 0.0f;
                }
                return cxc2.aJz().bgQ().fi().al(this.geM);
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
            lfn.b(5, "SFWeaponInfo", "getWeaponType() ItemResourceType is invalid.");
            return null;
        }
        return bqm.d.getWeaponType(this.aRX);
    }

    public final boolean bkk() {
        if (this.aRX <= 0) {
            return false;
        }
        return cug.vF((int)this.aRX);
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

