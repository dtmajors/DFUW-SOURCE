/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;

public class axs
extends bsv {
    private String ctn = null;
    private String aDq = null;
    private String ID = null;
    private ljq bhF = null;
    private float bhG = 0.0f;
    private int crZ = -1;
    private axq[] cto = null;
    private int ctp = ayb.cvi.ordinal();
    private clq ctq = null;

    public axs() {
        this.dKf = bsv.a.dKm;
    }

    public List<axq> YG() {
        ArrayList<axq> arrayList = lcn.abH(this.cto.length);
        for (axq axq2 : this.cto) {
            arrayList.add(axq2);
        }
        return arrayList;
    }

    public void V(List<axq> list) {
        this.cto = new axq[list.size()];
        list.toArray(this.cto);
    }

    public String YH() {
        return this.ctn;
    }

    public void eK(String string) {
        this.ctn = string;
    }

    public ljq Xv() {
        return this.bhF;
    }

    public void al(ljq ljq2) {
        this.bhF = ljq2;
    }

    public boolean YI() {
        if (this.cto == null) {
            return false;
        }
        for (axq axq2 : this.cto) {
            if (!axq2.Ym()) continue;
            return true;
        }
        return false;
    }

    public float Xu() {
        return this.bhG;
    }

    public void X(float f) {
        this.bhG = f;
    }

    public int Xx() {
        return this.crZ;
    }

    public void iq(int n) {
        this.crZ = n;
    }

    public void a(axq[] axqArray) {
        this.cto = axqArray;
    }

    @Override
    public String toString() {
        return this.ID + "(" + this.ctn + ")";
    }

    public int YJ() {
        return this.ctp;
    }

    public void iD(int n) {
        this.ctp = n;
    }

    public String YK() {
        return this.aDq;
    }

    public void cc(String string) {
        this.aDq = string;
    }

    public String getID() {
        return this.ID;
    }

    public void setID(String string) {
        this.ID = string;
    }

    public final clq YL() {
        return this.ctq;
    }

    public final void a(clq clq2) {
        this.ctq = clq2;
    }
}

