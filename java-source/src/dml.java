/*
 * Decompiled with CFR.
 */
import java.util.List;

public class dml {
    private dmj gIn = dmj.gIf;
    private String gIo = null;
    private int cEh = 0;
    private ldv Rs = null;
    private List<Integer> gIp = null;
    private ldv dpx = null;
    private int csd = 0;
    private int csc = 0;
    private float gIq = 0.0f;

    public dmj bqf() {
        return this.gIn;
    }

    public String bqg() {
        return this.gIo;
    }

    public int acY() {
        return this.cEh;
    }

    public ldv oq() {
        return this.Rs;
    }

    public void hC(ldv ldv2) {
        this.Rs = ldv2;
    }

    public List<Integer> bqh() {
        return this.gIp;
    }

    public ldv bqi() {
        return this.dpx;
    }

    public void mT(ldv ldv2) {
        this.dpx = ldv2;
    }

    public int XD() {
        return this.csd;
    }

    public void is(int n) {
        this.csd = n;
    }

    public int XC() {
        return this.csc;
    }

    public void ir(int n) {
        this.csc = n;
    }

    public boolean bqj() {
        return this.csc > 0;
    }

    public float bqk() {
        return this.gIq;
    }

    public dml(dmj dmj2, String string, int n, List<Integer> list, float f) {
        this.gIn = dmj2;
        this.gIo = string;
        this.cEh = n;
        this.gIp = list;
        this.gIq = f;
    }
}

