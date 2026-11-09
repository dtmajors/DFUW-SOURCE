/*
 * Decompiled with CFR.
 */
import java.util.Map;

public class arr {
    private int bQU = 0;
    private String bQV;
    private float bQW;
    private float bQX;
    private arb bQY;
    private int bQZ;
    private ljq bRa;
    private ldq bRb;
    private float bRc = 1.0f;
    private float bRd = 1.0f;
    private Map<String, Integer> bRe;

    arr() {
    }

    public arr(dlt dlt2) {
        this.bQU = dlt2.gGT;
        this.bQV = dlt2.bQV;
        this.bQW = dlt2.gGU;
        this.bQX = dlt2.gGV;
        this.bQY = arb.getValue(dlt2.gGW);
        this.bQZ = dlt2.bQZ;
        this.bRa = null;
        this.bRb = null;
        this.bRc = dlt2.gGY;
        this.bRd = dlt2.gGZ;
        this.bRe = dlt2.gGX;
    }

    public int Sg() {
        return this.bQU + (this.bQV == null ? 0 : 1);
    }

    public arc Sh() {
        return this.bQY != null ? new arc(this.bQZ, this.bQY) : null;
    }

    public final int Ro() {
        return this.bQU;
    }

    public final String Rt() {
        return this.bQV;
    }

    public final float Rv() {
        return this.bQW;
    }

    public final float Ru() {
        return this.bQX;
    }

    public final arb RE() {
        return this.bQY;
    }

    public final int Ry() {
        return this.bQZ;
    }

    public final ljq Rw() {
        return this.bRa;
    }

    public final ldq Si() {
        return this.bRb;
    }

    public final float Sj() {
        return this.bRc;
    }

    public final float Sk() {
        return this.bRd;
    }

    public final Map<String, Integer> Rp() {
        return this.bRe;
    }

    public final void bK(float f) {
        this.bQW = f;
    }

    public final void bJ(float f) {
        this.bQX = f;
    }

    public final void bL(float f) {
        this.bRc = f;
    }

    public final void bM(float f) {
        this.bRd = f;
    }

    public final void hz(int n) {
        this.bQU = n;
    }

    public final void r(Map<String, Integer> map) {
        this.bRe = map;
    }

    public final void dR(String string) {
        this.bQV = string;
    }

    public final void a(arb arb2) {
        this.bQY = arb2;
    }

    public final void ay(ljq ljq2) {
        this.bRa = ljq2;
    }

    public final void hJ(int n) {
        this.bQZ = n;
    }

    public final void a(ldq ldq2) {
        this.bRb = ldq2;
    }
}

