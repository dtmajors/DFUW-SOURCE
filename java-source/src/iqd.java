/*
 * Decompiled with CFR.
 */
public class iqd
extends ipl {
    private String mts;
    private String mtt;
    private String mtu;
    private String mtv;
    private boolean mql;

    public iqd(String string, String string2, String string3, String string4) {
        this.mts = string;
        this.mtt = string2;
        this.mtu = string3;
        this.mtv = string4;
    }

    public iqd() {
        this(null, null, null, null);
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.mql = false;
    }

    public String dmH() {
        return this.mts;
    }

    public void qW(String string) {
        if (lhn.equal(string, this.mts)) {
            return;
        }
        this.mts = string;
        this.dmL();
    }

    public String dmI() {
        return this.mtt;
    }

    public void qX(String string) {
        if (lhn.equal(string, this.mtt)) {
            return;
        }
        this.mtt = string;
        this.dmL();
    }

    public String dmJ() {
        return this.mtu;
    }

    public void qY(String string) {
        if (lhn.equal(string, this.mtu)) {
            return;
        }
        this.mtu = string;
        this.dmL();
    }

    public String dmK() {
        return this.mtv;
    }

    public void qZ(String string) {
        if (lhn.equal(string, this.mtv)) {
            return;
        }
        this.mtv = string;
        this.dmL();
    }

    public void c(String string, String string2, String string3, String string4) {
        if (lhn.equal(string, this.mts) && lhn.equal(string2, this.mtt) && lhn.equal(string3, this.mtu) && lhn.equal(string4, this.mtv)) {
            return;
        }
        this.mts = string;
        this.mtt = string2;
        this.mtu = string3;
        this.mtv = string4;
        this.dmL();
    }

    @Override
    public void ei(int n, int n2) {
        super.ei(n, n2);
        if (this.mql) {
            this.mql = false;
            this.djE().b("TiledBitmapFrame_setBitmapData", new Object[]{this.getId(), this.qL(this.mts), this.qL(this.mtt), this.qL(this.mtu), this.qL(this.mtv)});
        }
    }

    @Override
    public void djm() {
        super.djm();
        this.mql = false;
    }

    @Override
    public void dA(int n, int n2) {
        this.djE().b("TiledBitmapFrame_create", new Object[]{this.getId(), n, n2, this.getX() + this.djU(), this.getY() + this.djV(), this.getWidth(), this.getHeight(), this.djL() && this.djW(), Float.valueOf(this.getAlpha() * this.djX()), this.qL(this.mts), this.qL(this.mtt), this.qL(this.mtu), this.qL(this.mtv), this.dlM(), this.dlN(), this.dlO(), this.dlP()});
    }

    @Override
    public void dlU() {
        this.djE().b("TiledBitmapFrame_setVisibleFrame", new Object[]{this.getId(), this.dlM(), this.dlN(), this.dlO(), this.dlP()});
    }

    private void dmL() {
        if (this.mql) {
            return;
        }
        this.mql = true;
        this.dkg();
    }
}

