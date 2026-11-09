/*
 * Decompiled with CFR.
 */
public class iyd
extends ist {
    private boolean mwJ;
    private static iqz mdv = new iqz(){

        public void e(ipf ipf2) {
            iyd iyd2;
            iyd2.setHeight((iyd2 = (iyd)ipf2).djZ() ? 29 : 24);
        }
    };

    public iyd(String string) {
        super(string);
        this.a(mdv);
        this.cPw();
    }

    public boolean dpn() {
        return this.mwJ;
    }

    public void sn(boolean bl) {
        if (bl == this.mwJ) {
            return;
        }
        this.mwJ = bl;
        this.updateState();
    }

    @Override
    public void cPw() {
        this.updateState();
        this.pack();
    }

    @Override
    public void cND() {
        this.updateState();
    }

    public void updateState() {
        if (this.djZ()) {
            if (this.mwJ) {
                this.b(ixx.mBy, 17, 0xC0C0C0);
            } else if (this.dkb()) {
                this.b(ixx.mBy, 17, 0xC0C0C0);
            } else {
                this.b(ixx.mBy, 17, 12357465);
            }
        } else if (this.mwJ) {
            this.b(ixx.mBn, 15, 0xC0C0C0);
        } else if (this.dkb()) {
            this.b(ixx.mBn, 16, 0xC0C0C0);
        } else {
            this.b(ixx.mBn, 16, 0xABABAB);
        }
    }

    private void b(isf isf2, int n, int n2) {
        this.a(isf2, n);
        this.Rk(n2);
    }
}

