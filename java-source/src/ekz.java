/*
 * Decompiled with CFR.
 */
import java.util.EnumSet;

public class ekz
extends emr {
    public ldv itH = null;
    public String add = null;
    public String aDF = null;
    public String aDG = null;
    public int[] cAg = null;
    public boolean itA = false;
    public int cAi = 0;
    public int YY;
    public int cWz;
    public String YU;
    public String YV;
    public int aFI;
    public int aFH;

    public ldv bIx() {
        return this.itH;
    }

    public void oW(ldv ldv2) {
        this.itH = ldv2;
    }

    public String iV() {
        return this.add;
    }

    public void cD(String string) {
        this.add = string;
    }

    public String ZK() {
        return this.aDF;
    }

    public void eN(String string) {
        this.aDF = string;
    }

    public String ZL() {
        return this.aDG;
    }

    public void eO(String string) {
        this.aDG = string;
    }

    public int[] bIo() {
        return this.cAg;
    }

    public void l(int[] nArray) {
        this.cAg = nArray;
    }

    public boolean bIy() {
        return this.itA;
    }

    public void cn(boolean bl) {
        this.itA = bl;
    }

    public EnumSet<ayw> ZO() {
        return ayw.getEnumSet(this.cAi);
    }

    public void a(EnumSet<ayw> enumSet) {
        this.cAi = ayw.getTags(enumSet);
    }

    ekz() {
        super(13886);
    }
}

