/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  brg
 *  cug
 *  mcs
 */
public class ajq
extends aja {
    private cak.c bpW = null;

    public ajq() {
        this.bog = ajb.b.boR;
    }

    public void b(cak.c c2) {
        this.bpW = c2;
    }

    @Override
    protected void a(aja aja2) {
        super.a(aja2);
        ajq ajq2 = (ajq)aja2;
        ajq2.b(this.bpW);
    }

    @Override
    protected final boolean BU() {
        this.bok = null;
        bqs bqs2 = this.CP();
        if (bqs2 == null) {
            return true;
        }
        this.bok = lea.enW().isDescendant(bqs2.az(), cug.fkF) ? mcs.uAE.bD(new Object[0]) : mcs.uAF.bD(bqs2.az());
        return false;
    }

    private bqs CP() {
        if (this.boj.bfF()) {
            return ((brg)this.boj.aJz().bgQ().aJC().asf()).c(this.bpW);
        }
        return ((brf)this.boj.aJz().bgQ().aJC().asf()).c(this.bpW);
    }
}

