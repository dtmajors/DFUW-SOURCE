/*
 * Decompiled with CFR.
 */
public class ipl
extends ipf {
    private boolean mrW;
    private boolean mrX;
    private boolean mrY;
    private boolean mrZ;
    private boolean msa;
    private static iqz mdv = new iqz(){

        public void e(ipf ipf2) {
            ipf2.setSize(0, 0);
        }
    };

    public ipl(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        this.a(mdv);
        this.mrW = bl;
        this.mrX = bl2;
        this.mrY = bl3;
        this.mrZ = bl4;
    }

    public ipl() {
        this(true, true, true, true);
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.msa = false;
    }

    public boolean dlM() {
        return this.mrW;
    }

    public void rO(boolean bl) {
        if (bl == this.mrW) {
            return;
        }
        this.mrW = bl;
        this.dlV();
    }

    public boolean dlN() {
        return this.mrX;
    }

    public void rP(boolean bl) {
        if (bl == this.mrX) {
            return;
        }
        this.mrX = bl;
        this.dlV();
    }

    public boolean dlO() {
        return this.mrY;
    }

    public void rQ(boolean bl) {
        if (bl == this.mrY) {
            return;
        }
        this.mrY = bl;
        this.dlV();
    }

    public boolean dlP() {
        return this.mrZ;
    }

    public void rR(boolean bl) {
        if (bl == this.mrZ) {
            return;
        }
        this.mrZ = bl;
        this.dlV();
    }

    public void c(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        if (bl == this.mrW && bl2 == this.mrX && bl3 == this.mrY && bl4 == this.mrZ) {
            return;
        }
        this.mrW = bl;
        this.mrX = bl2;
        this.mrY = bl3;
        this.mrZ = bl4;
        this.dlV();
    }

    public int dlQ() {
        return 0;
    }

    public int dlR() {
        return 0;
    }

    public int dlS() {
        return 0;
    }

    public int dlT() {
        return 0;
    }

    @Override
    public void ei(int n, int n2) {
        super.ei(n, n2);
        if (this.msa) {
            this.msa = false;
            this.dlU();
        }
    }

    @Override
    public void djm() {
        super.djm();
        this.msa = false;
    }

    public void dlU() {
    }

    private void dlV() {
        if (this.msa) {
            return;
        }
        this.msa = true;
        this.dkg();
    }
}

