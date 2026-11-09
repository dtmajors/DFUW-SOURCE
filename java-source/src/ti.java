/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Map;

public class ti {
    private int aRX;
    private int ResourceType;
    private int aRY = 0;
    private int aRZ;
    private boolean aSa;
    private int aSb;
    private float aSc;
    private float aSd;
    private hc aSe;
    private String aSf = null;
    private int aSg = 0;
    private int lL = 0;
    private int aSh = -1;
    private List aSi = null;
    private int aSj = 0;
    private double aSk = 0.0;
    private double aSl = 0.0;
    private Map<Integer, Float> aSm = null;
    private double aSn = 0.0;
    private Map<Integer, Float> aSo = null;
    private float Magnitude;
    private float Radius;
    private float aSp;

    public final int uw() {
        return this.aRX;
    }

    public final void da(int n) {
        this.aRX = n;
    }

    public final int az() {
        return this.ResourceType;
    }

    public final void l(int n) {
        this.ResourceType = n;
    }

    public final int ux() {
        return this.aRZ;
    }

    public final void db(int n) {
        this.aRZ = n;
    }

    public final boolean uy() {
        return this.aSa;
    }

    public final void ap(boolean bl) {
        this.aSa = bl;
    }

    public final int uz() {
        return this.aSb;
    }

    public final void dc(int n) {
        this.aSb = n;
    }

    public final float getMinDistance() {
        return this.aSc;
    }

    public final void setMinDistance(float f) {
        this.aSc = f;
    }

    public final hc uA() {
        return this.aSe;
    }

    public final void e(hc hc2) {
        this.aSe = hc2;
    }

    public final float uB() {
        return this.aSd;
    }

    public final void M(float f) {
        this.aSd = f;
    }

    public final int uC() {
        return this.aRY;
    }

    public final void dd(int n) {
        this.aRY = n;
    }

    public final String uD() {
        return this.aSf;
    }

    public final void cf(String string) {
        this.aSf = string;
    }

    public final int uE() {
        return this.aSg;
    }

    public final void de(int n) {
        this.aSg = n;
    }

    public int uF() {
        return this.lL;
    }

    public void df(int n) {
        this.lL = n;
    }

    public int uG() {
        return this.aSj;
    }

    public void dg(int n) {
        this.aSj = n;
    }

    public int uH() {
        return this.aSh;
    }

    public void dh(int n) {
        this.aSh = n;
    }

    public List uI() {
        return this.aSi;
    }

    public void G(List list) {
        if (this.aSi == null) {
            this.aSi = lcn.emv();
        }
        this.aSi.addAll(list);
    }

    public Map<Integer, Float> uJ() {
        return this.aSm;
    }

    public void n(Map<Integer, Float> map) {
        this.aSm = map;
    }

    public Map<Integer, Float> uK() {
        return this.aSo;
    }

    public void o(Map<Integer, Float> map) {
        this.aSo = map;
    }

    public double uL() {
        return this.aSk;
    }

    public void p(double d2) {
        this.aSk = d2;
    }

    public double uM() {
        return this.aSl;
    }

    public void q(double d2) {
        this.aSl = d2;
    }

    public double uN() {
        return this.aSn;
    }

    public void r(double d2) {
        this.aSn = d2;
    }

    public float uO() {
        return this.Magnitude;
    }

    public void N(float f) {
        this.Magnitude = f;
    }

    public float getRadius() {
        return this.Radius;
    }

    public void setRadius(float f) {
        this.Radius = f;
    }

    public float uP() {
        return this.aSp;
    }

    public void O(float f) {
        this.aSp = f;
    }
}

