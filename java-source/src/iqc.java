/*
 * Decompiled with CFR.
 */
public class iqc
extends ipx {
    private iqa lUU;
    private ipf moX;
    private int mtr = 0;
    private static iqz mdv = new iqz(){

        public void e(ipf ipf2) {
            iqc iqc2 = (iqc)ipf2;
            iqc2.setSize(iqc.a(iqc2).getWidth() + iqc.b(iqc2).dmC(), iqc.b(iqc2).getHeight());
        }

        public void i(ipf ipf2) {
            iqc iqc2 = (iqc)ipf2;
            iqc.b(iqc2).r(0, 0, iqc2.getWidth(), iqc2.getHeight());
            iqc.a(iqc2).r(0, iqc.c(iqc2), iqc2.getWidth(), iqc2.getHeight() - iqc.c(iqc2));
        }
    };

    public iqc() {
        this.a(mdv);
    }

    public iqa dmF() {
        return this.lUU;
    }

    public void b(iqa iqa2) {
        if (iqa2 == this.lUU) {
            return;
        }
        if (this.lUU != null) {
            this.lUU.removeFromParent();
        }
        this.lUU = iqa2;
        if (this.lUU != null) {
            this.c(this.lUU, 0);
        }
    }

    public ipf diq() {
        return this.moX;
    }

    public void s(ipf ipf2) {
        if (ipf2 == this.moX) {
            return;
        }
        if (this.moX != null) {
            this.moX.removeFromParent();
        }
        this.moX = ipf2;
        if (this.moX != null) {
            this.c(this.moX, itp.t(this.lUU));
        }
    }

    public int dmG() {
        return this.mtr;
    }

    public void Sd(int n) {
        if (n == this.mtr) {
            return;
        }
        this.mtr = n;
        this.pack();
    }

    static /* synthetic */ ipf a(iqc iqc2) {
        return iqc2.moX;
    }

    static /* synthetic */ iqa b(iqc iqc2) {
        return iqc2.lUU;
    }

    static /* synthetic */ int c(iqc iqc2) {
        return iqc2.mtr;
    }
}

