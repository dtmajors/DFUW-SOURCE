/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class jjp
extends hyn {
    private int mnj;
    private int mnk;
    private boolean npx;
    private int nlW;
    private String lRG;
    private int npy = 0;

    public jjp(int n, int n2, int n3, String string) {
        super("WorldMapPersonalMarkerTagEditorWindow", "WorldMapPersonalMarkerTagEditorWindow.swf");
        this.OQ(-1);
        this.a(hya.lmp, true);
        joa joa2 = jjp.cxP().cxY();
        this.mnj = n;
        this.mnk = n2;
        this.npx = (float)n2 > joa2.H / 2.0f;
        this.nlW = n3;
        this.lRG = string;
    }

    public void initialize() {
        super.initialize();
        joa joa2 = jjp.cxP().cxY();
        int n = 164;
        int n2 = n / 2;
        if (this.mnj - n2 < 0) {
            this.npy = this.mnj - n2;
            this.mnj = n2;
        } else if ((float)(this.mnj + n) >= joa2.W) {
            this.npy = -((int)(joa2.W - (float)this.mnj - (float)n2));
            this.mnj = (int)(joa2.W - (float)n2);
        }
        this.R(this.mnj - n / 2, this.npx ? (float)(this.mnk - 102) : (float)this.mnk);
    }

    protected void cBa() {
        super.cBa();
        this.a("setup", new Object[]{lzc.tPo.bD(new Object[0]).exA(), this.lRG, !this.npx, this.npy});
        jjp.cxP().g((hyn)this);
    }

    protected void g(int n, int n2, String string) {
        if (this.l(n, n2, string)) {
            return;
        }
        this.cKo();
    }

    protected void j(int n, int n2, String string) {
        this.g(n, n2, string);
    }

    protected boolean cFD() {
        return true;
    }

    @llk
    private void _accept(String string) {
        hso.cxK().cxT().I(this.nlW, string);
        this.cKo();
    }

    @llk
    private void _reject() {
        this.cKo();
    }

    private void cKo() {
        this.a("cleanup", new Object[0]);
    }

    @llk
    private void _cleanedUp() {
        jjp.cxP().h((hyn)this);
        this.MessageDelegator.hd(this.getGUID());
    }
}

