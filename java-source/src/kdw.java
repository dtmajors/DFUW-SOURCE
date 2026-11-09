/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Map;

public abstract class kdw
implements keb {
    protected Map<lef, kee> phM = lcn.emw();
    public static final int phN = 101;
    public static final int phO = 103;
    public static final int phP = 102;
    protected a phQ = a.phU;
    protected kdz phR = null;
    protected kea de = null;
    protected List<kee> phS = lcn.emv();
    protected kff phT = null;

    public kdw() {
        this.de = kea.dVE();
        this.Y();
        this.dVv();
    }

    public int a(lef lef2, lef lef3) {
        return 0;
    }

    public a dVt() {
        return this.phQ;
    }

    protected int c(a a2) {
        this.phQ = a2;
        return 101;
    }

    protected boolean a(a a2) {
        return true;
    }

    public kdz dVu() {
        return this.phR;
    }

    protected abstract void Y();

    public abstract void a(List<kee> var1, int var2);

    private void dVv() {
        this.de.a(this);
    }

    private void dVw() {
        this.de.b(this);
    }

    public void a(kee kee2, int n) {
        if (kee2.dVG() == 14) {
            this.phT = (kff)kee2;
        } else if (kee2.dVG() == 2) {
            this.phS.add(kee2);
        } else {
            this.phM.put(kee2.dVH(), kee2);
        }
    }

    protected void c(kee kee2) {
        this.de.a(this.phR, kee2);
    }

    public abstract void e(ldz var1);

    public void cleanUp() {
    }

    public String toString() {
        String string = null;
        if (this.phR != null) {
            string = this.phR.getName();
        }
        return "Module: " + string;
    }

    protected void d(kee kee2) {
    }
}

