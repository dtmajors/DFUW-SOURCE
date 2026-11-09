/*
 * Decompiled with CFR.
 */
public class ips
extends ipz {
    private boolean msA = true;
    private boolean msB;
    private String _name;

    public ips() {
    }

    public ips(String string) {
        this._name = string;
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.msB = false;
    }

    @Override
    public String getName() {
        return this._name;
    }

    public boolean cCt() {
        return this.msA;
    }

    public void setEnabled(boolean bl) {
        if (bl == this.msA) {
            return;
        }
        this.msA = bl;
        this.dms();
    }

    @Override
    public void ei(int n, int n2) {
        super.ei(n, n2);
        if (this.msB) {
            this.msB = false;
            this.djE().b("MovieClip_setEnabled", new Object[]{this.getId(), this.msA});
        }
    }

    @Override
    public void djm() {
        super.djm();
        this.msB = false;
    }

    @Override
    public void dA(int n, int n2) {
        this.djE().b("MovieClip_create", new Object[]{this.getId(), n, n2, this.getX() + this.djU(), this.getY() + this.djV(), this.getWidth(), this.getHeight(), this.djL() && this.djW(), Float.valueOf(this.getAlpha() * this.djX()), this.djR() && this.djY(), this.dlu(), this.djG(), this.djH(), this.djI(), this.msA, this._name != null ? this._name : ""});
        this.dmx();
    }

    private void dms() {
        if (this.msB) {
            return;
        }
        this.msB = true;
        this.dkg();
    }
}

