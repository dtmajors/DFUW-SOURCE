/*
 * Decompiled with CFR.
 */
public class ipk
extends ipf {
    private int lSN;
    private boolean mrT = false;
    private static iqz mdv = new iqz(){

        public void e(ipf ipf2) {
            ipf2.setSize(0, 0);
        }
    };

    public ipk() {
        this(0);
    }

    public ipk(int n) {
        this.a(mdv);
        this.lSN = n;
    }

    public ipk(int n, int n2, int n3) {
        this.a(new iqu(n2, n3));
        this.lSN = n;
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.mrT = false;
    }

    public int Hr() {
        return this.lSN;
    }

    public void setColor(int n) {
        if (n == this.lSN) {
            return;
        }
        this.lSN = n;
        if (this.mrT) {
            return;
        }
        this.mrT = true;
        this.dkg();
    }

    @Override
    public void ei(int n, int n2) {
        super.ei(n, n2);
        if (this.mrT) {
            this.mrT = false;
            this.djE().b("FilledRect_setColor", new Object[]{this.getId(), this.getWidth(), this.getHeight(), this.lSN});
        }
    }

    @Override
    public void djm() {
        super.djm();
        this.mrT = false;
    }

    @Override
    public void dA(int n, int n2) {
        this.djE().b("FilledRect_create", new Object[]{this.getId(), n, n2, this.getX() + this.djU(), this.getY() + this.djV(), this.getWidth(), this.getHeight(), this.djL() && this.djW(), Float.valueOf(this.getAlpha() * this.djX()), this.lSN});
    }
}

