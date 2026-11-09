/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  cxd
 */
import java.util.ArrayList;

public class jva {
    private boolean oTE;
    private boolean oTF;
    private int SkillType;
    private ArrayList<Integer> oTG;
    private cgc oTH;
    private cgc oTI;
    private cgc oTJ;
    private cgc oTK;
    private boolean oTL;
    private boolean oTM;

    public jva(int n, ArrayList<Integer> arrayList, cgc cgc2, cgc cgc3, cgc cgc4, cgc cgc5, boolean bl, boolean bl2) {
        this.SkillType = n;
        this.oTG = arrayList;
        this.oTH = cgc2;
        this.oTI = cgc3;
        this.oTJ = cgc4;
        this.oTK = cgc5;
        this.oTL = bl;
        this.oTM = bl2;
        int[] nArray = cxd.bfG();
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            if (!lea.enZ().isDescendant(n, nArray[i2])) continue;
            this.oTF = true;
            break;
        }
        int[] nArray2 = cxd.bfH();
        for (int i3 = 0; i3 < nArray2.length; ++i3) {
            if (!lea.enZ().isDescendant(n, nArray2[i3])) continue;
            this.oTE = true;
            break;
        }
    }

    public boolean a(int n, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, boolean bl7, boolean bl8) {
        boolean bl9 = this.SkillType == cxd.fIY && lea.enW().isDescendant(n, cug.fiK);
        boolean bl10 = false;
        if (this.oTG != null) {
            for (int n2 : this.oTG) {
                if (!lea.enW().isDescendant(n, n2)) continue;
                bl10 = true;
                break;
            }
        } else {
            bl10 = true;
        }
        if (!bl10) {
            return false;
        }
        if (bl9 && !bl8) {
            return false;
        }
        if (!this.oTH.bZR && this.oTH.Pp != bl) {
            return false;
        }
        if (!this.oTI.bZR && this.oTI.Pp != bl2) {
            return false;
        }
        if (!this.oTJ.bZR && this.oTJ.Pp != bl3) {
            return false;
        }
        if (!this.oTK.bZR && this.oTK.Pp != bl4) {
            return false;
        }
        boolean bl11 = bl5 || bl6 && this.oTF || bl7 && this.oTE;
        return !this.oTM || !bl11;
    }

    public boolean Wf(int n) {
        boolean bl = false;
        if (this.oTG != null) {
            for (int n2 : this.oTG) {
                if (!lea.enW().isDescendant(n, n2)) continue;
                bl = true;
                break;
            }
        } else {
            bl = true;
        }
        return bl;
    }

    public final boolean dTw() {
        return this.oTL;
    }

    public ArrayList<Integer> dTx() {
        return this.oTG;
    }
}

