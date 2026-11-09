/*
 * Decompiled with CFR.
 */
public class iob
extends ips {
    @Override
    public void dA(int n, int n2) {
        this.djE().b("SFMovie_init", new Object[]{this.getId(), this.getX() + this.djU(), this.getY() + this.djV(), this.getWidth(), this.getHeight(), this.djL() && this.djW(), Float.valueOf(this.getAlpha() * this.djX()), this.djR() && this.djY(), this.dlu(), this.djG(), this.djH(), this.djI(), this.cCt()});
        this.dmx();
    }

    @Override
    public void cCy() {
        this.djE().b("SFMovie_created", new Object[0]);
    }

    @Override
    public void did() {
        this.djE().b("SFMovie_cleanup", new Object[0]);
    }

    final void dif() {
        super.dki();
    }

    final void dig() {
        super.updateLayout();
    }

    final void dih() {
        this.es(0, 0);
    }

    final void dii() {
        super.dkv();
    }
}

