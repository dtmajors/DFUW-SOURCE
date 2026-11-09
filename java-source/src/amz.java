/*
 * Decompiled with CFR.
 */
class amz
extends amx {
    protected amz(ljq ljq2, asb asb2, clb clb2) {
        super(ljq2, asb2, clb2);
    }

    @Override
    public void a(cla cla2) {
    }

    @Override
    public void a(asm asm2) {
        if (asm2 instanceof arx) {
            arx arx2 = (arx)asm2;
            if (arx2.SC()) {
                this.bBv.remove(arx2.Sq());
                this.cQ(arx2.Sq());
            } else {
                this.bBv.add(arx2.Sq());
            }
            return;
        }
        if (asm2 instanceof aru) {
            aru aru2 = (aru)asm2;
            ldv ldv2 = aru2.Sq();
            asw asw2 = (asw)this.bBx.get(ldv2);
            if (aru2.Sr() && !aru2.Ss() || aru2.lh()) {
                if (this.bBv.contains(ldv2)) {
                    this.bBv.remove(ldv2);
                    this.cQ(ldv2);
                    if (asw2 != null) {
                        asw2.UV();
                    }
                }
                return;
            }
            if (!this.bBv.contains(ldv2)) {
                if (aru2.isAlive()) {
                    this.bBv.add(ldv2);
                }
                if (asw2 != null) {
                    asw2.UU();
                }
            }
        }
    }

    @Override
    protected void HK() {
        this.bBA = this.bBv;
    }

    @Override
    public void HU() {
    }

    @Override
    public void HV() {
    }
}

