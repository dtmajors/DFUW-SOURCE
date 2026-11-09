/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cug
 */
import java.util.ArrayList;

public abstract class cpo {
    protected static boolean Initialized = false;
    protected static ArrayList<Integer> eUb = lcn.abH(5);
    protected static ArrayList<Integer> eUc = lcn.abH(5);
    protected static ArrayList<Integer> eUd = lcn.abH(5);
    protected static ArrayList<Integer> eUe = lcn.abH(5);
    protected static ArrayList<Integer> eUf = lcn.abH(5);
    protected static final boolean bC = false;
    protected final cbx Qg;

    public cpo(cbx cbx2) {
        this.Qg = cbx2;
    }

    public final void b(float f2, float f3, int n) {
        if (n == cug.fqm) {
            this.x(f2, f3);
            return;
        }
        if (n == cug.fqo) {
            this.y(f2, f3);
            return;
        }
        if (n == cug.fqp) {
            this.z(f2, f3);
            return;
        }
        if (n == cug.fqr) {
            this.w(f2, f3);
            return;
        }
        this.w(f2, f3);
    }

    public final void a(float f2, float f3, int[] nArray) {
        int n = eUf.get(this.A(f2, f3));
        if (n < 0) {
            return;
        }
        this.pf(n);
    }

    private void w(float f2, float f3) {
        int n = eUb.get(this.A(f2, f3));
        if (n < 0) {
            return;
        }
        this.pf(n);
    }

    private void x(float f2, float f3) {
        int n = eUc.get(this.A(f2, f3));
        if (n < 0) {
            return;
        }
        this.pf(n);
    }

    private void y(float f2, float f3) {
        int n = eUe.get(this.A(f2, f3));
        if (n < 0) {
            return;
        }
        this.pf(n);
    }

    private void z(float f2, float f3) {
        int n = eUd.get(this.A(f2, f3));
        if (n < 0) {
            return;
        }
        this.pf(n);
    }

    protected int A(float f2, float f3) {
        float f4 = Math.abs(f2);
        float f5 = Math.abs(f3);
        if (f2 < 1.0f) {
            return 0;
        }
        if (f5 < 3.0f) {
            return 0;
        }
        if (f5 < 8.0f) {
            return 1;
        }
        if (f5 < 13.0f) {
            return 2;
        }
        if (f5 < 20.0f) {
            return 3;
        }
        return 4;
    }

    protected abstract float a(float var1, float var2, int[] var3, float var4, float var5);

    protected abstract void pf(int var1);
}

