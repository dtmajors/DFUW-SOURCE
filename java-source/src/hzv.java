/*
 * Decompiled with CFR.
 */
import spenefett.hid.gui.serialization.dto.SFTooltipBaseDTO;

public class hzv
extends hzk {
    private boolean ljJ = false;
    private boolean lzJ = false;
    private hyd lzK = hyd.lnj;
    protected boolean lzL = false;
    private SFTooltipBaseDTO lzM = null;
    private float lkA;
    private float lkC;
    protected float lzN;
    protected float lzO;

    public hzv(String string, String string2, int n, int n2, int n3, int n4, hyd hyd2) {
        super("TooltipGeneric", string == null ? "TooltipGenericWindow.swf" : string);
        this.OQ(-1);
        this.lkA = n;
        this.lkC = n2;
        this.lzN = 0.0f;
        this.lzO = 0.0f;
        this.lzK = hyd2;
        this.a(hya.lmt, false);
    }

    public void da(int n, int n2) {
        super.da(n, n2);
        this.lzJ = true;
        this.a(this.lzM);
    }

    protected void cBa() {
        super.cBa();
        this.a(hya.lmp, true);
        this.ljJ = true;
    }

    public boolean a(SFTooltipBaseDTO sFTooltipBaseDTO) {
        this.lzM = sFTooltipBaseDTO;
        if (!this.ljJ || !this.lzJ) {
            return false;
        }
        this.a("setDataAndOrientation", new Object[]{iah.d(sFTooltipBaseDTO), this.lzK.ordinal()});
        return true;
    }

    @llk
    public void onTooltipWindowResized(int n, int n2) {
        this.dh(n, n2);
    }

    private void dh(int n, int n2) {
        joa joa2 = hzv.cxP().cxY();
        boolean bl = false;
        switch (this.lzK) {
            case lnh: {
                bl = false;
                break;
            }
            case lni: {
                bl = true;
                break;
            }
            case lnj: {
                bl = n2 > n || this.lzL;
            }
        }
        boolean bl2 = true;
        int n3 = -1;
        int n4 = (int)this.lkA;
        int n5 = (int)this.lkC;
        if (this.lkA < joa2.W / 2.0f) {
            n4 = (int)(this.lkA + this.lzN) - (bl ? (int)((float)n / 2.0f) : 0);
        } else {
            n4 = (int)(this.lkA - this.lzN - (float)n) + (bl ? (int)((float)n / 2.0f) : 0);
            if (!bl) {
                bl2 = false;
            }
        }
        if (this.lkC < joa2.H / 2.0f) {
            n5 = (int)(this.lkC + this.lzO) - (bl ? 0 : (int)((float)n2 / 2.0f));
        } else {
            n5 = (int)(this.lkC - this.lzO - (float)n2) + (bl ? 0 : (int)((float)n2 / 2.0f));
            if (bl) {
                bl2 = false;
            }
        }
        if (!bl) {
            if (n5 < 0) {
                n5 = 0;
                n3 = (int)this.lkC;
            } else if ((float)(n5 + n2) > joa2.H) {
                n5 = (int)(joa2.H - (float)n2);
                n3 = (int)(this.lkC - (float)n5);
            }
        } else if (n4 < 0) {
            n4 = 0;
            n3 = (int)this.lkA;
        } else if ((float)(n4 + n) > joa2.W) {
            n4 = (int)(joa2.W - (float)n);
            n3 = (int)(this.lkA - (float)n4);
        }
        this.R(n4, n5);
        this.a("setTooltipArrow", new Object[]{bl2, n3});
    }
}

