/*
 * Decompiled with CFR.
 */
import java.util.Collection;
import java.util.Map;

public abstract class jld {
    public final jll<jld> ntV = new jll();
    protected int hf = -1;
    protected int mqR;
    protected int mqS;
    protected int lSN;
    protected boolean mxb = true;
    protected boolean ntW = false;
    private jku ntX;
    private static Map<Integer, jld> ntY = lcn.emw();

    public void a(jku jku2) {
        this.ntX = jku2;
        ntY.put(this.hf, this);
    }

    public void cleanUp() {
        ntY.remove(this.hf);
        this.ntX = null;
        this.hf = -1;
    }

    public int getId() {
        return this.hf;
    }

    public jku dLC() {
        return this.ntX;
    }

    public int getX() {
        return this.mqR;
    }

    public int getY() {
        return this.mqS;
    }

    public void ek(int n, int n2) {
        if (n == this.mqR && n2 == this.mqS) {
            return;
        }
        this.mqR = n;
        this.mqS = n2;
        this.a("setVectorObjectPosition", this.getId(), this.mqR, this.mqS);
    }

    public int Hr() {
        return this.lSN;
    }

    public void setColor(int n) {
        if (n == this.lSN) {
            return;
        }
        this.lSN = n;
        this.a("setVectorObjectColor", this.getId(), this.lSN);
    }

    public boolean djL() {
        return this.mxb;
    }

    public void setVisible(boolean bl) {
        if (bl == this.mxb) {
            return;
        }
        this.mxb = bl;
        this.a("setVectorObjectVisible", this.getId(), this.mxb);
    }

    public boolean dLD() {
        return this.ntW;
    }

    public void uh(boolean bl) {
        if (bl == this.ntW) {
            return;
        }
        this.ntW = bl;
        this.a("setVectorObjectInteractive", this.getId(), this.ntW);
    }

    public static jld Vg(int n) {
        return ntY.get(n);
    }

    public static Collection<jld> dLE() {
        return ntY.values();
    }

    public static void ui(boolean bl) {
        if (bl) {
            for (jld jld2 : ntY.values()) {
                jld2.cleanUp();
            }
        }
        ntY.clear();
    }

    public abstract String dLx();

    public boolean a(String string, Object ... objectArray) {
        return this.ntX != null ? this.ntX.a(string, objectArray) : false;
    }

    public abstract void create();
}

