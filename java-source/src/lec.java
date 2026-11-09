/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;

public class lec {
    private lfn ga = lfn.eqw();
    private boolean riE = true;
    private double riF = 3.0;
    private double riG = this.riF * 1.0;
    private ljq riH = new ljq(0.0f, 0.0f, 0.0f);
    private ljq riI = new ljq(0.0f, 0.0f, 0.0f);
    private lek daP = new lek(3, 3, 3);
    private lek ixp = new lek(0, 0, 0);
    private boolean daR = false;
    private int riJ = 0;
    private float riK = 0.0f;
    private List[][][] riL = null;

    public lec() {
        this.riL = new List[this.daP.cf][this.daP.cg][this.daP.riS];
    }

    public lec(lek lek2) {
        this.daP = lek2;
        this.riL = new List[this.daP.cf][this.daP.cg][this.daP.riS];
    }

    public void ej(ljq ljq2) {
        if (this.riE) {
            ljq2.x = (float)((int)((double)ljq2.x / this.riG)) * (float)this.riG + this.riH.x + this.riI.x;
            ljq2.y = (float)((int)((double)ljq2.y / this.riG)) * (float)this.riG + this.riH.y + this.riI.y;
            ljq2.rlV = (float)((int)((double)ljq2.rlV / this.riG)) * (float)this.riG + this.riH.rlV + this.riI.rlV;
            lfn.b(0, this.getClass().getName(), "New Position within Grid is:" + ljq2);
        }
    }

    public ljq a(lek lek2, ldv ldv2) {
        if (lek2 != null) {
            if (this.riL[lek2.cf][lek2.cg][lek2.riS] != null) {
                List list = this.riL[lek2.cf][lek2.cg][lek2.riS];
                list.add(ldv2);
            } else {
                ArrayList<ldv> arrayList = lcn.emv();
                arrayList.add(ldv2);
                this.riL[lek2.cf][lek2.cg][lek2.riS] = arrayList;
            }
            ++this.riJ;
            return this.j(lek2);
        }
        return null;
    }

    public ljq ub(ldv ldv2) {
        lek lek2 = this.epU();
        if (lek2 != null) {
            lfn.b(0, this.getClass().getName(), "Adding to GridCellPos:" + lek2);
            ArrayList<ldv> arrayList = lcn.emv();
            arrayList.add(ldv2);
            this.riL[lek2.cf][lek2.cg][lek2.riS] = arrayList;
            ++this.riJ;
            return this.j(lek2);
        }
        return null;
    }

    public void i(lek lek2) {
        if (lek2 != null) {
            lfn.b(0, this.getClass().getName(), "Removing from GridCellPos:" + lek2);
            List list = this.riL[lek2.cf][lek2.cg][lek2.riS];
            this.riJ -= list.size();
            this.riL[lek2.cf][lek2.cg][lek2.riS] = null;
        }
    }

    public void uc(ldv ldv2) {
        lek lek2 = this.ud(ldv2);
        if (lek2 != null) {
            List list = this.riL[lek2.cf][lek2.cg][lek2.riS];
            if (list.contains(ldv2)) {
                list.remove(ldv2);
                --this.riJ;
            } else {
                lfn.b(0, this.getClass().getName(), "GUIDList at [" + lek2 + "] didnt contain GUID: " + ldv2);
            }
        } else {
            lfn.b(5, this.getClass().getName(), "Could not find GUID[" + ldv2 + "] in Grid. Not Removed!");
        }
    }

    public lek ud(ldv ldv2) {
        int n = this.riL.length;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < this.riL[i].length; ++j) {
                for (int k = 0; k < this.riL[i][j].length; ++k) {
                    List list = this.riL[i][j][k];
                    if (list == null || !list.contains(ldv2)) continue;
                    return new lek(i, j, k);
                }
            }
        }
        lfn.b(5, this.getClass().getName(), "Could not find GUID[" + ldv2 + "] in Grid. [null] Returned");
        return null;
    }

    public void epT() {
        int n = this.riL.length;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < this.riL[i].length; ++j) {
                for (int k = 0; k < this.riL[i][j].length; ++k) {
                    this.i(new lek(i, j, k));
                }
            }
        }
    }

    public ljq amt() {
        lek lek2 = this.epU();
        if (lek2 != null) {
            return this.j(lek2);
        }
        return null;
    }

    public ljq j(lek lek2) {
        ljq ljq2 = new ljq();
        ljq2.x = (float)lek2.cf * (float)this.riG + this.riH.x + this.riI.x;
        ljq2.y = (float)lek2.cg * (float)this.riG + this.riH.y + this.riI.y;
        ljq2.rlV = (float)lek2.riS * (float)this.riG + this.riH.rlV + this.riI.rlV;
        return ljq2;
    }

    public ljq ue(ldv ldv2) {
        lek lek2 = this.ud(ldv2);
        ljq ljq2 = null;
        if (lek2 != null) {
            ljq2 = new ljq();
            ljq2.x = (float)lek2.cf * (float)this.riG + this.riH.x;
            ljq2.y = (float)lek2.cg * (float)this.riG + this.riH.y;
            ljq2.rlV = (float)lek2.riS * (float)this.riG + this.riH.rlV;
        } else {
            lfn.b(5, "SFGrid", "getRelativeUnitPositionOfGUID() : Could not get Cellpos!");
            assert (false);
        }
        return ljq2;
    }

    public lek ek(ljq ljq2) {
        lek lek2 = null;
        ljq ljq3 = new ljq(ljq2);
        ljq3.et(this.riI);
        int n = -1;
        int n2 = -1;
        int n3 = -1;
        n = this.e(ljq3.x, this.daP.cf);
        n2 = this.e(ljq3.y, this.daP.cg);
        n3 = this.e(ljq3.rlV, this.daP.riS);
        if (n != -1 && n2 != -1 && n3 != -1) {
            lek2 = new lek(n, n2, n3);
        } else {
            lfn.b(5, this.getClass().getName(), "Could not compute CELL POSIITON!!!");
        }
        return lek2;
    }

    private int e(float f, int n) {
        int n2 = -1;
        float f2 = (float)((double)n * this.riG);
        if (f2 >= f && f >= 0.0f) {
            for (int i = 0; i < n; ++i) {
                float f3 = (float)(this.riG * (double)(i + 1));
                if (!(f3 > f)) continue;
                n2 = i;
                break;
            }
        } else {
            n2 = f < 0.0f ? 0 : n - 1;
        }
        return n2;
    }

    public lek epU() {
        int n = this.riL.length;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < this.riL[i].length; ++j) {
                for (int k = 0; k < this.riL[i][j].length; ++k) {
                    if (this.riL[i][j][k] == null) {
                        return new lek(i, j, k);
                    }
                    if (!this.riL[i][j][k].isEmpty()) continue;
                    return new lek(i, j, k);
                }
            }
        }
        return null;
    }

    public lek a(ldv ldv2, lek lek2) {
        lek lek3 = this.ud(ldv2);
        lek lek4 = null;
        if (lek3 != null && lek2 != null) {
            lek4 = new lek();
            lek4.cf = lek3.cf + lek2.cf;
            lek4.cg = lek3.cg + lek2.cg;
            lek4.riS = lek3.riS + lek2.riS;
            boolean bl = this.k(lek4);
            this.a(ldv2, lek3, lek4);
        }
        return lek4;
    }

    public lek a(lek lek2, lek lek3) {
        lek lek4 = null;
        if (lek2 != null && lek3 != null) {
            lek4 = new lek();
            lek4.cf = lek2.cf + lek3.cf;
            lek4.cg = lek2.cg + lek3.cg;
            lek4.riS = lek2.riS + lek3.riS;
            boolean bl = this.k(lek4);
        }
        return lek4;
    }

    public lek a(ldv ldv2, lek lek2, lek lek3) {
        if (lek2 != null && lek3 != null) {
            if (this.ud(ldv2).equals(lek2)) {
                this.k(lek3);
                this.uc(ldv2);
                this.a(lek3, ldv2);
                return lek3;
            }
            lfn.b(0, this.getClass().getName(), "NOT EQUALT: OldPos [" + lek2 + "], FoundPos: [" + this.ud(ldv2) + "]");
        } else {
            lfn.b(5, this.getClass().getName(), "Cannot Move Contents " + ldv2 + ". Not Found!");
        }
        return null;
    }

    public lek a(lek lek2, lek lek3, boolean bl) {
        if (lek2 != null && lek3 != null) {
            if (!this.k(lek2)) {
                this.k(lek3);
                List list = this.riL[lek2.cf][lek2.cg][lek2.riS];
                if (bl) {
                    this.riL[lek3.cf][lek3.cg][lek3.riS] = list;
                    this.i(lek2);
                } else {
                    List list2 = this.riL[lek3.cf][lek3.cg][lek3.riS];
                    if (list2 != null) {
                        list2.addAll(list);
                    } else {
                        this.riL[lek3.cf][lek3.cg][lek3.riS] = list;
                    }
                    this.i(lek2);
                }
                return lek3;
            }
            lfn.b(5, this.getClass().getName(), "Can not move an invalid cell!");
        } else {
            lfn.b(5, this.getClass().getName(), "Cannot Move Contents. Position is null!");
        }
        return null;
    }

    public int epV() {
        return this.riJ;
    }

    public boolean tn(ldv ldv2) {
        int n = this.riL.length;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < this.riL[i].length; ++j) {
                for (int k = 0; k < this.riL[i][j].length; ++k) {
                    List list = this.riL[i][j][k];
                    if (list == null || !list.contains(ldv2)) continue;
                    return true;
                }
            }
        }
        return false;
    }

    private boolean k(lek lek2) {
        boolean bl = false;
        if (lek2.cf >= this.daP.cf) {
            lek2.cf = this.daP.cf - 1;
            bl = true;
        }
        if (lek2.cg >= this.daP.cg) {
            lek2.cg = this.daP.cg - 1;
            bl = true;
        }
        if (lek2.riS >= this.daP.riS) {
            lek2.riS = this.daP.riS - 1;
            bl = true;
        }
        if (lek2.cf < 0) {
            lek2.cf = 0;
            bl = true;
        }
        if (lek2.cg < 0) {
            lek2.cg = 0;
            bl = true;
        }
        if (lek2.riS < 0) {
            lek2.riS = 0;
            bl = true;
        }
        return bl;
    }

    public List d(lek lek2) {
        lfn.b(0, this.getClass().getName(), "Geting Contents at Gridpos:" + lek2);
        if (!this.k(lek2)) {
            return this.riL[lek2.cf][lek2.cg][lek2.riS];
        }
        return null;
    }

    public ljq epW() {
        return this.riH;
    }

    public void el(ljq ljq2) {
        this.riH = ljq2;
    }

    public float epX() {
        return this.riK;
    }

    public void nh(float f) {
        this.riK = f;
    }

    public lek amp() {
        return new lek(this.daP);
    }

    public ljq epY() {
        ljq ljq2 = new ljq();
        ljq2.x = (float)(this.riF * (double)this.daP.cf * 1.0);
        ljq2.y = (float)(this.riF * (double)this.daP.cg * 1.0);
        ljq2.rlV = (float)(this.riF * (double)this.daP.riS * 1.0);
        return ljq2;
    }

    public boolean l(lek lek2) {
        boolean bl = false;
        if (this.daP.equals(lek2)) {
            return bl;
        }
        if (lek2.cf <= 0 || lek2.cg <= 0 || lek2.riS <= 0) {
            return bl;
        }
        int n = Math.min(this.daP.cf, lek2.cf);
        int n2 = Math.min(this.daP.cg, lek2.cg);
        int n3 = Math.min(this.daP.riS, lek2.riS);
        List[][][] listArray = new List[lek2.cf][lek2.cg][lek2.riS];
        int n4 = n;
        for (int i = 0; i < n4; ++i) {
            int n5 = n2;
            for (int j = 0; j < n5; ++j) {
                int n6 = n3;
                for (int k = 0; k < n6; ++k) {
                    listArray[i][j][k] = this.riL[i][j][k];
                }
            }
        }
        if (n < this.daP.cf || n2 < this.daP.cg || n3 < this.daP.riS) {
            bl = true;
        }
        this.daP.cf = lek2.cf;
        this.daP.cg = lek2.cg;
        this.daP.riS = lek2.riS;
        this.riL = listArray;
        lfn.b(0, this.getClass().getName(), "New GridSize:" + this.daP + " is set!");
        return bl;
    }

    public ljq epZ() {
        return new ljq(this.riI);
    }

    public void em(ljq ljq2) {
        this.riI = ljq2;
    }

    public boolean amq() {
        return this.daR;
    }

    public void setShowGrid(boolean bl) {
        this.daR = bl;
    }

    public double eqa() {
        return this.riG;
    }

    public double eqb() {
        return this.riF;
    }

    public void dZ(double d2) {
        this.riF = d2;
        this.riG = this.riF * 1.0;
    }

    public lek bKZ() {
        return new lek(this.ixp);
    }

    public void e(lek lek2) {
        this.k(lek2);
        this.ixp = lek2;
    }

    public ljq eqc() {
        return this.j(this.ixp);
    }
}

