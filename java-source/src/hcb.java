/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
public class hcb
implements hru {
    private ldv jEG = null;
    private final hdm dXw;
    private lhf jEH;
    private final ldl jEI = new ldl();
    private String jEJ = "";
    private hru.a jEK = null;
    private final lbn jEL = new lbn(this){
        final /* synthetic */ hcb jEM;
        {
            this.jEM = hcb2;
        }

        public final void W() {
            hcb.a(this.jEM);
        }
    };

    @Override
    public void a(hru.a a2) {
        this.jEK = a2;
    }

    private static int mc(String string) {
        if (string.startsWith("http://") || string.startsWith("https://")) {
            return 1;
        }
        return 0;
    }

    @Override
    public lbl<lbn> cbF() {
        return this.jEI;
    }

    public ldv cbG() {
        return this.jEG;
    }

    private void cbH() {
        if (this.jEG != null) {
            long l = loh.aE(this.jEG.eny());
            int n = (int)(l >> 32);
            int n2 = (int)(l & 0xFFFFFFFFFFFFFFFFL);
            String string = loh.aC(this.jEG.eny());
            if (!string.equals(this.jEJ)) {
                this.jEJ = string;
                if (string.length() > 0) {
                    int n3 = Integer.parseInt(string.trim());
                    if (this.jEK != null) {
                        this.jEK.LO(n3 / 120);
                    }
                }
            }
            if (this.jEH == null || n != this.jEH.rmN || n2 != this.jEH.H) {
                if (n == 0) {
                    n = 1;
                }
                if (n2 == 0) {
                    n2 = 1;
                }
                this.jEH = new lhf(n, n2);
                this.jEI.enp();
            }
        }
    }

    public hcb(hdm hdm2) {
        this.dXw = hdm2;
    }

    public void dispose() {
        this.setOpen(false);
    }

    @Override
    public lhf cbI() {
        assert (this.jEG != null);
        if (this.jEH == null) {
            this.cbH();
        }
        return this.jEH;
    }

    public final boolean isOpen() {
        return this.jEG != null;
    }

    @Override
    public int getCursorType() {
        return loh.aF(this.jEG.eny());
    }

    @Override
    public void a(jpp jpp2) {
        assert (this.jEG != null);
        loh.a(this.jEG.eny(), jpp2.nNJ, jpp2.nNK, jpp2.nNL);
    }

    @Override
    public void mZ(boolean bl) {
    }

    public void setOpen(boolean bl) {
        if (this.jEG != null != bl) {
            if (bl) {
                this.jEG = new ldv(loh.ewP());
                this.dXw.cbP().kAz.eme().a(true, this.jEL);
            } else {
                this.dXw.cbP().kAz.eme().a(false, this.jEL);
                loh.aD(this.jEG.eny());
                this.jEG = null;
            }
        }
    }

    @Override
    public void md(String string) {
        assert (this.jEG != null);
        loh.a(this.jEG.eny(), string);
    }

    @Override
    public void c(lgs lgs2) {
        assert (this.jEG != null);
        loh.a(this.jEG.eny(), lgs2.cf, lgs2.cg, lgs2.rmN, lgs2.H);
    }

    @Override
    public void c(char c2) {
        assert (this.jEG != null);
        loh.a(this.jEG.eny(), 258, c2, 0);
    }

    @Override
    public void e(lgg lgg2) {
        assert (this.jEG != null);
        int n = lgg2.cf | lgg2.cg << 16;
        loh.a(this.jEG.eny(), 513, 0, n);
    }

    @Override
    public void f(lgg lgg2) {
        assert (this.jEG != null);
        int n = lgg2.cf | lgg2.cg << 16;
        loh.a(this.jEG.eny(), 514, 0, n);
    }

    @Override
    public void a(lgg lgg2, int n) {
        assert (this.jEG != null);
        int n2 = lgg2.cf | lgg2.cg << 16;
        int n3 = n << 16;
        loh.a(this.jEG.eny(), 522, n3, n2);
    }

    @Override
    public void g(lgg lgg2) {
        assert (this.jEG != null);
        int n = lgg2.cf | lgg2.cg << 16;
        loh.a(this.jEG.eny(), 512, 0, n);
    }

    @Override
    public void a(lgg lgg2, int n, boolean bl) {
        assert (this.jEG != null);
        int n2 = n;
        int n3 = (bl ? 1 : 0) << 30;
        loh.a(this.jEG.eny(), 256, n2, n3);
    }

    @Override
    public void b(lgg lgg2, int n) {
        assert (this.jEG != null);
        int n2 = n;
        loh.a(this.jEG.eny(), 257, n2, 0);
    }

    static /* synthetic */ void a(hcb hcb2) {
        hcb2.cbH();
    }
}

