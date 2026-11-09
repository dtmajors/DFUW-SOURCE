/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  hdk
 */
public class hdw
extends hdv {
    public static final hdv.a<hdw> kbg = new hdv.a();
    public static final hdw kbh = hdw.LW(cug.fkb);
    public static final hdw kbi = hdw.LW(cug.fpN);
    public static final hdw kbj = hdw.LW(cug.fgJ);
    public static final hdw kbk = hdw.LW(cug.fgB);
    public static final hdw kbl = hdw.LW(cug.fiL);
    public static final hdw kbm = hdw.LW(cug.flH);
    public static final hdw kbn = hdw.LW(cug.fmh);
    public static final hdw kbo = hdw.LW(cug.fmi);
    public static final hdw kbp = hdw.LW(cug.fmj);
    public static final hdw kbq = hdw.LW(cug.flC);
    public static final hdw kbr = hdw.LW(cug.flE);
    public static final hdw kbs = hdw.LW(cug.flF);
    public static final hdw kbt = hdw.LW(cug.flG);
    public static final hdw kbu = hdw.LW(cug.flY);
    public static final hdw kbv = hdw.LW(cug.flI);
    public static final hdw kbw = hdw.LW(cug.flJ);
    public static final hdw kbx = hdw.LW(cug.flK);
    public static final hdw kby = hdw.LW(cug.flL);
    public static final hdw kbz = hdw.LW(cug.flM);
    public static final hdw kbA = hdw.LW(cug.flN);
    public static final hdw kbB = hdw.LW(cug.flO);
    public static final hdw kbC = hdw.LW(cug.flP);
    public static final hdw kbD = hdw.LW(cug.flQ);
    public static final hdw kbE = hdw.LW(cug.flR);

    public static hdw LW(int n) {
        hdv hdv2 = hdw.b(n, hdv.b.kbe);
        return hdv2 != null ? (hdw)hdw.b(n, hdv.b.kbe) : null;
    }

    protected hdw(int n) {
        super(n);
    }

    protected hdw(int n, boolean bl) {
        super(n, bl);
    }

    @Override
    public hdv.b cef() {
        return hdv.b.kbe;
    }

    public final ctu mO(int n) {
        return this.cet().mO(n);
    }

    public final cak.c auO() {
        return this.cet().auO();
    }

    public final boolean awU() {
        return this.cet().awU();
    }

    public final boolean auW() {
        return this.cet().auW();
    }

    public final boolean auU() {
        lgw lgw2 = this.cet();
        if (lgw2 == null) {
            return false;
        }
        return lgw2.auU();
    }

    public final boolean bkn() {
        return this.cet().erP();
    }

    public final boolean ceq() {
        return this.cet().ceq();
    }

    public final lhu awW() {
        return this.cet().awW();
    }

    public final ej[] cer() {
        return lio.acV(this.Type);
    }

    public final boolean a(hee hee2, hee hee3, boolean bl) {
        assert (hee2 != null);
        return bqm.a(hee2.kdC.kdF, hee2.kdF, hee3 == null ? bqm.b.dEm : hee3.kdC.kdF, hee3 == null ? bqm.b.dEm : hee3.kdF, bl, this.Type);
    }

    public final float aRb() {
        return this.cet().erL();
    }

    public final hdw ces() {
        return (hdw)this.ceg();
    }

    @Override
    public lhu atw() {
        return this.cet().atw();
    }

    @Override
    public lhu cej() {
        return hdk.jMa;
    }

    @Override
    public boolean awQ() {
        return this.cet().awQ();
    }

    @Override
    public lcf awS() {
        return this.cet().awS();
    }

    @Override
    public lgs awT() {
        return this.cet().awT();
    }

    @Override
    public lgs cel() {
        return this.cet().cel();
    }

    @Override
    public boolean ck(int n, int n2) {
        lgs lgs2 = this.awT();
        lhu lhu2 = this.atw();
        if ((n += lgs2.cf) < 0 || (n2 += lgs2.cg) < 0 || n >= lhu2.kLY.rmN || n2 >= lhu2.kLY.H) {
            return true;
        }
        return this.awS().fN(n, n2);
    }

    @Override
    public hdu a(hel hel2, ldv ldv2) {
        return new hdz(hel2, ldv2, this);
    }

    @Override
    public hdv LV(int n) {
        return new hdw(n);
    }

    @Override
    protected les ceo() {
        return lea.enW();
    }

    private lgw cet() {
        return (lgw)lea.enW().acv(this.Type);
    }
}

