/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class hyi
extends hzk {
    private static final int lnK = 24;
    private static final int lnL = 24;
    private final int lnM;
    private final int lnN;
    private hyk lnO = null;
    private String[] lnP = null;
    private int lnQ = -1;
    private int lnR = -1;
    private int lnS = -1;
    private boolean lnT = false;
    private boolean ljJ = false;
    private int lnU = -1;
    private a lnV = a.lnX;

    public hyi(int n, int n2, hyk hyk2) {
        super("ContextMenu", "ContextMenuDropdown.swf");
        this.a(hya.lmt, false);
        this.a(hya.lmp, true);
        this.lnM = n;
        this.lnN = n2;
        if (hyk2 != null) {
            this.a(hyk2);
        }
    }

    protected hyi(int n, int n2) {
        this(n, n2, null);
    }

    protected hyk cDN() {
        return this.lnO;
    }

    protected void a(hyk hyk2) {
        this.lnO = hyk2;
        this.lnP = this.lnO.cDR();
        assert (this.lnP != null);
        this.lnQ = 24 * this.lnP.length;
    }

    public void a(a a2) {
        this.lnV = a2;
    }

    protected void cDO() {
    }

    protected void cBa() {
        super.cBa();
        this.ljJ = true;
        this.cDP();
    }

    public void cZ(int n, int n2) {
        super.cZ(n, n2);
        this.lnR = n;
        this.lnS = n2;
        this.lnT = true;
        this.cDP();
        if (this.lnO != null) {
            this.lnO.cDU();
        }
    }

    private void cDP() {
        if (!this.lnT) {
            return;
        }
        if (!this.ljJ) {
            return;
        }
        this.OO(24);
        boolean bl = false;
        switch (this.lnV) {
            case lnX: {
                String[] stringArray = hso.cxK().cxY();
                if ((float)this.lnN > stringArray.H / 2.0f) {
                    bl = false;
                    break;
                }
                bl = true;
                break;
            }
            case lnY: {
                bl = true;
                break;
            }
            case lnZ: {
                bl = false;
            }
        }
        this.cDQ();
        for (String string : this.lnP) {
            this.nW(string);
        }
        this.R(65536.0f, 65536.0f);
        this.a("resizeMenu", new Object[]{bl});
        if (this.lnO != null) {
            this.cDO();
        }
    }

    @llk
    private void menuResized(double d2, double d3) {
        float f2 = (float)((double)this.lnM - d2 / 2.0);
        float f3 = this.lnN;
        float f4 = 0.0f;
        joa joa2 = hso.cxK().cxY();
        if (f2 < 0.0f) {
            f4 = -f2;
            f2 = 0.0f;
        } else if ((double)f2 + d2 > (double)joa2.W) {
            f4 = (float)((double)(joa2.W - f2) - d2);
            f2 = (float)((double)joa2.W - d2);
        }
        switch (this.lnV) {
            case lnX: {
                if ((float)this.lnN > joa2.H / 2.0f) {
                    f3 = (float)((double)this.lnN - d3);
                    break;
                }
                f3 = this.lnN;
                break;
            }
            case lnY: {
                f3 = this.lnN;
                break;
            }
            case lnZ: {
                f3 = (float)((double)this.lnN - d3);
            }
        }
        this.R(f2, f3);
        this.N(this.cCZ(), (float)d3 / this.getHeight());
        this.a("setArrowOffset", new Object[]{Float.valueOf(-f4)});
    }

    private void cDQ() {
        this.a("clearMenuItems", new Object[0]);
    }

    private void nW(String string) {
        this.a("addMenuItem", new Object[]{string});
    }

    public void a(int n, String string, int n2, int n3) {
        this.a("replaceMenuItemDye", new Object[]{n, string, n2, n3});
    }

    private void OO(int n) {
        this.a("setPaddingInPixels", new Object[]{n});
    }

    @llk
    public void onMenuItemSelected(int n) {
        if (this.lnO == null) {
            return;
        }
        assert (n >= 0 && n < this.lnP.length);
        this.lnU = n;
    }

    public void e(int n, int n2, String string) {
        if (this.lnU >= 0) {
            float f2 = 24.0f + this.cEE();
            float f3 = 24.0f + this.cEF() + (float)(24 * this.lnU);
            this.lnO.a(this.lnU, this.lnP[this.lnU], (int)(f2 + 0.5f), (int)(f3 + 0.5f), (int)(this.getWidth() * this.cCZ() - 48.0f + 0.5f), 24);
        }
    }

    public hyn f(int n, int n2, String string) {
        return null;
    }

    public String[] cDR() {
        return this.lnP;
    }
}

