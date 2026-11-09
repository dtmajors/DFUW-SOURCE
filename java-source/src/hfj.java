/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdk
 *  hdm
 */
public class hfj
extends hpw {
    private final hdm dXw;
    private final hpe[] khL = new hpe[lea.rhD.size()];
    private final hpa[] khM = new hpa[lea.rhD.size()];
    private boolean khN = false;
    public lcq khO = null;
    public final ldl khP = new ldl();
    private final lbn jEL = new lbn(this){
        final /* synthetic */ hfj khQ;
        {
            this.khQ = hfj2;
        }

        public final void W() {
            this.khQ.chi();
        }
    };
    private final hly jHr = new hly(this){
        final /* synthetic */ hfj khQ;
        {
            this.khQ = hfj2;
        }

        public final void e(char c2) {
            this.khQ.f(c2);
        }
    };

    private lgs Mf(int n) {
        int n2 = this.getWidth() - 4;
        int n3 = this.getHeight() - 6;
        int n4 = 2;
        int n5 = 2;
        int n6 = (n2 + 2) / 8;
        int n7 = n6 - 2;
        int n8 = (n3 + 4) / 2;
        int n9 = n8 - 2;
        int n10 = n5 + n8 * (n / 8);
        int n11 = n4 + n6 * (n % 8);
        return new lgs(n11, n10, n7, n9);
    }

    public hfj(hdm hdm2, String string, lgg lgg2, lhf lhf2) {
        super((hnc)hdm2, string, lgg2, lhf2, hdm2.kID);
        this.dXw = hdm2;
        boolean bl = false;
        boolean bl2 = false;
        for (int i = 0; i < lea.rhD.size(); ++i) {
            hez hez2 = lea.rhD.get(i);
            this.khL[i] = new hpe((hnc)hdm2, "Color " + i + " '" + hez2.DisplayName + "' text", this.Mg(i), hdk.jNP, (double)hez2.dMT.g >= 0.71 ? hdm2.jXm : hdm2.jXn, "" + hez2.kgr);
            this.khM[i] = new hpa((hnc)hdm2, "Color " + i + " '" + hez2.DisplayName + "' sprite", this.Mh(i), hdk.jNN.kLY, hdk.jNN);
            this.khM[i].H(hez2.dMT);
            this.j(this.khM[i]);
            this.j(this.khL[i]);
        }
    }

    private void chg() {
        for (int i = 0; i < 16; ++i) {
            lgs lgs2 = this.Mf(i);
            this.khL[i].j(lgs2);
        }
    }

    @Override
    protected void cce() {
        super.cce();
        this.chg();
    }

    @Override
    protected void ccf() {
        this.kLu.a(this.isFocusOwner(), this.jHr);
        super.ccf();
        if (!this.isFocusOwner()) {
            this.E(null);
        }
    }

    private void chh() {
    }

    @Override
    protected void cbM() {
        hpe hpe2 = this.a(this.cqu(), hpe.class);
        if (hpe2 != null) {
            this.f(hpe2.getText().charAt(0));
            return;
        }
        super.cbM();
    }

    protected void E(lcq lcq2) {
        if (this.khN) {
            return;
        }
        this.khN = true;
        this.khO = lcq2;
        this.dXw.jWV.kAz.eme().a(true, this.jEL);
    }

    protected void chi() {
        this.dXw.jWV.kAz.eme().a(false, this.jEL);
        this.khP.enp();
        this.dXw.jYN.closeWindow();
    }

    protected lgg Mg(int n) {
        int n2 = n % 4;
        int n3 = n / 4;
        lgg lgg2 = new lgg(n2 * hdk.jNP.rmN, n3 * hdk.jNP.H);
        return lgg2;
    }

    protected lgg Mh(int n) {
        int n2 = n % 4;
        int n3 = n / 4;
        lgg lgg2 = new lgg(n2 * hdk.jNP.rmN + (hdk.jNP.rmN - hdk.jNN.kLY.rmN) / 2, n3 * hdk.jNP.H + (hdk.jNP.H - hdk.jNN.kLY.H) / 2);
        return lgg2;
    }

    protected void f(char c2) {
        c2 = Character.toLowerCase(c2);
        for (int i = 0; i < lea.rhD.size(); ++i) {
            if (c2 != lea.rhD.get((int)i).kgr.charValue()) continue;
            this.E(lea.rhD.get((int)i).dMT);
            return;
        }
    }
}

