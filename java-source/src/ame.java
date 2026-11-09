/*
 * Decompiled with CFR.
 */
import java.util.List;

public class ame {
    private int bup;
    private List<Integer> buq = lcn.emv();
    private float bur;
    private float bus;
    private float but;
    private float buu;
    private List<Integer> buv = lcn.emv();
    private float buw;
    private float bux;
    private int buy;

    public int FL() {
        if (this.buq.isEmpty()) {
            return 0;
        }
        int n = lew.fW(0, this.buq.size());
        assert (n < this.buq.size());
        if (n >= this.buq.size()) {
            n = this.buq.size() - 1;
        }
        return this.buq.get(n);
    }

    public int FM() {
        return !this.buq.isEmpty() ? this.buq.get(0) : 0;
    }

    public float FN() {
        return this.buu;
    }

    public void aJ(float f2) {
        this.buu = f2;
    }

    public float FO() {
        return this.but;
    }

    public void aK(float f2) {
        this.but = f2;
    }

    public float FP() {
        return this.bur;
    }

    public void aL(float f2) {
        this.bur = f2;
    }

    public float FQ() {
        return this.bux;
    }

    public void aM(float f2) {
        this.bux = f2;
    }

    public List<Integer> FR() {
        return this.buv;
    }

    public void N(List<Integer> list) {
        this.buv = list;
    }

    public float FS() {
        return this.buw;
    }

    public void aN(float f2) {
        this.buw = f2;
    }

    public float FT() {
        return this.bus;
    }

    public void aO(float f2) {
        this.bus = f2;
    }

    public int FU() {
        return this.bup;
    }

    public void gI(int n) {
        this.bup = n;
    }

    public List<Integer> FV() {
        return this.buq;
    }

    public void O(List<Integer> list) {
        this.buq = list;
    }

    public int FW() {
        return this.buy;
    }

    public void gJ(int n) {
        this.buy = n;
    }
}

