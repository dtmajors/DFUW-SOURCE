/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;

public class dnf {
    private String gKd;
    private String aUD;
    private int gKe;
    private float aUy;
    private float aUz;
    private float aUA;
    private float aUB;
    private int gKf;
    private int gKg;
    private int gKh;
    private double gKi;
    private double gKj;
    private double gKk;
    private double gKl;
    private double gKm;
    private double gKn;
    private double gKo;
    private int gKp;
    private int[] gKq;
    private int[] gKr;
    private float[] gKs;

    public void brh() {
        if (this.gKk > this.gKj) {
            double d2 = this.gKk;
            this.gKk = this.gKj;
            this.gKj = d2;
        }
    }

    public List<lfs<Integer, Integer>> f(int n, double d2) {
        ArrayList<lfs<Integer, Integer>> arrayList = lcn.emv();
        lfs lfs2 = new lfs();
        lfs2.reX = this.gKp;
        lfs2.reY = (int)((float)n * this.bQ(d2));
        arrayList.add(lfs2);
        if (this.gKq != null) {
            assert (this.gKq != null && this.gKr != null && this.gKs != null);
            assert (this.gKq.length == this.gKr.length);
            assert (this.gKq.length == this.gKs.length);
            for (int i = 0; i < this.gKq.length; ++i) {
                float f2 = (float)Math.random();
                if (!(f2 < this.gKs[i])) continue;
                lfs lfs3 = new lfs();
                lfs3.reX = this.gKq[i];
                lfs3.reY = this.gKr[i];
                arrayList.add(lfs3);
            }
        }
        return arrayList;
    }

    private float bQ(double d2) {
        if (d2 >= this.gKo) {
            return this.aUy;
        }
        if (d2 < 0.0) {
            d2 = 0.0;
        }
        if (d2 <= this.gKn) {
            return this.aUz;
        }
        float f2 = (float)((d2 - this.gKn) / (this.gKo - this.gKn));
        assert (f2 >= 0.0f);
        assert (f2 <= 1.0f);
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        f2 = 1.0f - f2;
        return ldq.o(this.aUy, this.aUz, f2);
    }

    public boolean bR(double d2) {
        return !(d2 >= this.gKo);
    }

    public final String bri() {
        return this.gKd;
    }

    public lip brj() {
        return new ljk(this.bri());
    }

    public final void iR(String string) {
        this.gKd = string;
    }

    public final int brk() {
        return this.gKe;
    }

    public final void AQ(int n) {
        this.gKe = n;
    }

    public final float vi() {
        return this.aUy;
    }

    public final void P(float f2) {
        this.aUy = f2;
    }

    public final float vn() {
        return this.aUA;
    }

    public final void Q(float f2) {
        this.aUA = f2;
    }

    public final int brl() {
        return this.gKf;
    }

    public final void AR(int n) {
        this.gKf = n;
    }

    public final int brm() {
        return this.gKg;
    }

    public final void AS(int n) {
        this.gKg = n;
    }

    public final int FL() {
        return this.gKp;
    }

    public final void AT(int n) {
        this.gKp = n;
    }

    public final int[] brn() {
        return this.gKq;
    }

    public final void K(int[] nArray) {
        this.gKq = nArray;
    }

    public final int[] bro() {
        return this.gKr;
    }

    public final void L(int[] nArray) {
        this.gKr = nArray;
    }

    public final float[] brp() {
        return this.gKs;
    }

    public final void e(float[] fArray) {
        this.gKs = fArray;
    }

    public final String vk() {
        return this.aUD;
    }

    public final void ch(String string) {
        this.aUD = string;
    }

    public final int brq() {
        return this.gKh;
    }

    public final void AU(int n) {
        this.gKh = n;
    }

    public final double brr() {
        return this.gKi;
    }

    public final void bS(double d2) {
        this.gKi = d2;
    }

    public final double brs() {
        return this.gKj;
    }

    public final void bT(double d2) {
        this.gKj = d2;
    }

    public final double brt() {
        return this.gKk;
    }

    public final void bU(double d2) {
        this.gKk = d2;
    }

    public final double bru() {
        return this.gKl;
    }

    public final void bV(double d2) {
        this.gKl = d2;
    }

    public final double brv() {
        return this.gKm;
    }

    public final void bW(double d2) {
        this.gKm = d2;
    }

    public final double brw() {
        return this.gKn;
    }

    public final void bX(double d2) {
        this.gKn = d2;
    }

    public final double brx() {
        return this.gKo;
    }

    public final void bY(double d2) {
        this.gKo = d2;
    }

    public final float vp() {
        return this.aUz;
    }

    public final void R(float f2) {
        this.aUz = f2;
    }

    public final float vq() {
        return this.aUB;
    }

    public final void S(float f2) {
        this.aUB = f2;
    }
}

