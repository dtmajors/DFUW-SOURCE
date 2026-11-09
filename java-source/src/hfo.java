/*
 * Decompiled with CFR.
 */
public final class hfo
extends hmt {
    public final hfg jIQ;
    public final hfp kjB;
    public final hpy kjC;
    private final int kjD;
    private lgs kjE;
    private lgs kjF;
    private int kjG = -1;
    private String kjH = null;
    private String[] ipz = null;
    private final lbp kjI = new lbp(this){
        final /* synthetic */ hfo kjR;
        {
            this.kjR = hfo2;
        }

        public final boolean caU() {
            return hfo.a(this.kjR);
        }
    };
    private final lbp kjJ = new lbp(this){
        final /* synthetic */ hfo kjR;
        {
            this.kjR = hfo2;
        }

        public final boolean caU() {
            return hfo.b(this.kjR);
        }
    };
    private final lbp kjK = new lbp(this){
        final /* synthetic */ hfo kjR;
        {
            this.kjR = hfo2;
        }

        public final boolean caU() {
            return hfo.c(this.kjR);
        }
    };
    private final lbp kjL = new lbp(this){
        final /* synthetic */ hfo kjR;
        {
            this.kjR = hfo2;
        }

        public final boolean caU() {
            return hfo.d(this.kjR);
        }
    };
    private final lbp kjM = new lbp(this){
        final /* synthetic */ hfo kjR;
        {
            this.kjR = hfo2;
        }

        public final boolean caU() {
            return hfo.e(this.kjR);
        }
    };
    private final lbp kjN = new lbp(this){
        final /* synthetic */ hfo kjR;
        {
            this.kjR = hfo2;
        }

        public final boolean caU() {
            return hfo.f(this.kjR);
        }
    };
    private final lbp kjO = new lbp(this){
        final /* synthetic */ hfo kjR;
        {
            this.kjR = hfo2;
        }

        public final boolean caU() {
            return hfo.g(this.kjR);
        }
    };
    private final lbp kjP = new lbp(this){
        final /* synthetic */ hfo kjR;
        {
            this.kjR = hfo2;
        }

        public final boolean caU() {
            return hfo.h(this.kjR);
        }
    };
    private final lbp kjQ = new lbp(this){
        final /* synthetic */ hfo kjR;
        {
            this.kjR = hfo2;
        }

        public final boolean caU() {
            hfo.i(this.kjR);
            return true;
        }
    };

    public hfo(hfg hfg2, lgg lgg2, lhf lhf2) {
        super((hnc)hfg2.jIm.dXw, null, lgg2, lhf2);
        this.ipz = hfg2.jIm.dXw.cbP().ceQ();
        this.jIQ = hfg2;
        int n = hcl.jGo.H;
        this.kjD = n + this.jIQ.jIm.dXw.kKc.jGK.kJY.kPT.cto() + this.jIQ.jIm.dXw.kKc.jGK.kJY.kPT.ctq();
        lgs lgs2 = this.cia();
        this.kjB = new hfp(this.jIQ, lgs2.aI(), lgs2.cqv());
        lgs2 = this.chZ();
        this.kjC = new hpy(this.jIQ, lgs2.aI(), lgs2.cqv());
        this.j(this.kjB);
        this.j(this.kjC);
        this.np(true);
    }

    private void np(boolean bl) {
        this.kjC.a(bl, this.kjJ, 27, jpn.nLm);
        this.kjC.a(bl, this.kjI, 13, jpn.nLm);
        this.kjC.a(bl, this.kjO, 40, jpn.nLm);
        this.kjC.a(bl, this.kjP, 38, jpn.nLm);
        this.kjC.a(bl, this.kjK, 9, jpn.nLm);
        this.kjC.a(bl, this.kjL, 9, jpn.nLH);
        this.kjC.a(bl, this.kjN, 9, jpn.nLI);
        this.kjC.a(bl, this.kjM, 9, jpn.nLL);
        this.kjC.a(bl, this.kjQ, 87, jpn.nLI);
        this.kjC.a(bl, this.kjQ, 115, jpn.nLI);
    }

    private lgs chZ() {
        if (this.kjE == null) {
            this.kjE = new lgs();
            this.kjE.cf = 0;
            this.kjE.H = this.kjD;
        }
        this.kjE.rmN = this.getWidth();
        this.kjE.cg = this.getHeight() - this.kjD;
        return this.kjE;
    }

    private lgs cia() {
        if (this.kjF == null) {
            this.kjF = new lgs();
            this.kjF.cf = 0;
            this.kjF.cg = 0;
        }
        this.kjF.rmN = this.getWidth();
        this.kjF.H = this.getHeight() - this.kjD;
        return this.kjF;
    }

    public void cib() {
        this.kjB.cib();
    }

    public void d(hff hff2) {
        this.kjB.d(hff2);
    }

    @Override
    protected void cce() {
        super.cce();
        this.kjB.d(this.cia().cqv());
        this.kjC.j(this.chZ());
    }

    @Override
    protected void cbM() {
        super.cbM();
        if (!this.kLu.csd() && !this.kjC.isFocusOwner()) {
            this.no(true);
        }
    }

    public void no(boolean bl) {
        if (bl) {
            this.kjC.cqV();
        } else {
            this.kjB.cqV();
        }
    }

    @Override
    protected void ccf() {
        super.ccf();
        if (this.isFocusOwner()) {
            this.jIQ.cgT();
        }
    }

    @Override
    protected void FF() {
        super.FF();
        this.cib();
    }

    @Override
    protected void FG() {
        this.np(false);
        super.FG();
    }

    private void cic() {
        this.jIQ.Md(this.jIQ.cgS()).cgL();
    }

    private boolean cid() {
        String string = this.kjC.chz();
        if (!string.isEmpty()) {
            this.jIQ.khw.me(string);
            this.jIQ.khw.cbW();
        }
        this.kjC.nc("");
        this.jIQ.mJ(string);
        if (this.jIQ.jIm.dXw.cdw()) {
            this.no(!this.jIQ.jIm.kgI.cgn());
        } else {
            this.no(!this.jIQ.jIm.kgI.cgm());
        }
        return true;
    }

    private boolean cie() {
        this.no(false);
        return true;
    }

    private void Mo(int n) {
        int n2;
        String string = this.kjC.chz();
        if (string.isEmpty()) {
            string = "/";
        } else if (!string.startsWith("/")) {
            return;
        }
        string = string.substring(1);
        if (string.length() > 1 && string.charAt(string.length() - 1) == ' ') {
            string = string.substring(0, string.length() - 1);
        }
        if (this.kjG >= 0 && !string.equals(this.ipz[this.kjG])) {
            this.kjG = -1;
            this.kjH = null;
        }
        if (this.kjH == null) {
            this.kjH = string;
            n2 = n < 0 ? this.ipz.length - 1 : 0;
            this.kjG = n2;
        } else {
            n2 = this.kjG;
            this.kjG += n < 0 ? -1 : 1;
        }
        if (this.kjG >= this.ipz.length) {
            this.kjG = 0;
        } else if (this.kjG < 0) {
            this.kjG = this.ipz.length - 1;
        }
        while (!this.ipz[this.kjG].startsWith(this.kjH)) {
            this.kjG += n < 0 ? -1 : 1;
            if (this.kjG >= this.ipz.length) {
                this.kjG = 0;
            } else if (this.kjG < 0) {
                this.kjG = this.ipz.length - 1;
            }
            if (this.kjG != n2) continue;
            return;
        }
        this.kjC.nc("/" + this.ipz[this.kjG] + " ");
        this.kjC.setCaretPosition(this.kjC.chz().length());
    }

    private boolean cif() {
        this.Mo(1);
        return true;
    }

    private boolean cig() {
        this.Mo(-1);
        return true;
    }

    private boolean cih() {
        this.kjB.cim();
        return true;
    }

    private boolean cii() {
        this.kjB.cil();
        return true;
    }

    private boolean cij() {
        String string = this.kjC.chz();
        this.jIQ.khw.me(string);
        this.kjC.nc(this.jIQ.khw.LJ(1));
        this.kjC.setCaretPosition(this.kjC.chz().length());
        return true;
    }

    private boolean cik() {
        String string = this.kjC.chz();
        this.jIQ.khw.me(string);
        this.kjC.nc(this.jIQ.khw.LJ(-1));
        this.kjC.setCaretPosition(this.kjC.chz().length());
        return true;
    }

    static /* synthetic */ boolean a(hfo hfo2) {
        return hfo2.cid();
    }

    static /* synthetic */ boolean b(hfo hfo2) {
        return hfo2.cie();
    }

    static /* synthetic */ boolean c(hfo hfo2) {
        return hfo2.cif();
    }

    static /* synthetic */ boolean d(hfo hfo2) {
        return hfo2.cig();
    }

    static /* synthetic */ boolean e(hfo hfo2) {
        return hfo2.cih();
    }

    static /* synthetic */ boolean f(hfo hfo2) {
        return hfo2.cii();
    }

    static /* synthetic */ boolean g(hfo hfo2) {
        return hfo2.cij();
    }

    static /* synthetic */ boolean h(hfo hfo2) {
        return hfo2.cik();
    }

    static /* synthetic */ void i(hfo hfo2) {
        hfo2.cic();
    }
}

