/*
 * Decompiled with CFR.
 */
public class ixv
extends ipx {
    private ipk msD;
    private static iqz mdv = new iqq(){

        public void e(ipf ipf2) {
            ixv ixv2;
            ixv2.setSize(0, (ixv2 = (ixv)ipf2).djZ() ? 29 : 24);
        }
    };

    public ixv() {
        this.a(mdv);
        this.msD = new ipk();
        this.W(this.msD);
        this.cPw();
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
            if (this.dkb()) {
                this.msD.setColor(0x202020);
            } else {
                this.msD.setColor(0x151515);
            }
        } else if (this.dkb()) {
            this.msD.setColor(0x202020);
        } else {
            this.msD.setColor(0x151515);
        }
    }
}

