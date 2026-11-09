/*
 * Decompiled with CFR.
 */
public class isp
extends isw {
    private int mxt = 1;
    private int mxu = 1;
    private int mxv = 1;
    private int mxw = 0;
    private boolean mxx;
    private boolean mxy;

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.mxy = false;
    }

    public void dpD() {
        this.djE().b("MultilineTextField_retrieveVerticalScrollInfo", new Object[]{this.getId()});
    }

    public int dpE() {
        return this.mxt;
    }

    public void SS(int n) {
        if (n == this.mxt) {
            return;
        }
        this.mxt = n;
        this.dpJ();
    }

    public int dpF() {
        return this.mxv;
    }

    public int dpG() {
        return this.mxu;
    }

    public int dpH() {
        return this.mxw;
    }

    public boolean dpI() {
        return this.mxx;
    }

    public void ss(boolean bl) {
        this.mxx = bl;
    }

    @Override
    public void ei(int n, int n2) {
        super.ei(n, n2);
        if (this.mxy) {
            this.mxy = false;
            this.djE().b("MultilineTextField_setScrollV", new Object[]{this.getId(), this.mxt});
        }
    }

    @Override
    public void djm() {
        super.djm();
        this.mxy = false;
    }

    @Override
    public void djn() {
        this.djE().b("MultilineTextField_setGeometry", new Object[]{this.getId(), this.getX() + this.djU(), this.getY() + this.djV(), this.getWidth(), this.getHeight(), this.mxx});
    }

    @Override
    public void djo() {
        this.djE().b("MultilineTextField_setSize", new Object[]{this.getId(), this.getWidth(), this.getHeight(), this.mxx});
    }

    public void rn(String string) {
    }

    public void z(int n, int n2, int n3, int n4) {
        this.mxt = n;
        this.mxu = n2;
        this.mxv = n3;
        this.mxw = n4;
    }

    public void A(int n, int n2, int n3, int n4) {
        this.mxt = n;
        this.mxu = n2;
        this.mxv = n3;
        this.mxw = n4;
    }

    private void dpJ() {
        if (this.mxy) {
            return;
        }
        this.mxy = true;
        this.dkg();
    }
}

