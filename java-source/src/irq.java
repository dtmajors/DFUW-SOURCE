/*
 * Decompiled with CFR.
 */
import java.util.List;

public class irq
extends ipx {
    private static final String muR = "StarButtonHalfOnDisabled";
    private static final String muS = "StarButtonHalfOnHover";
    private static final String muT = "StarButtonHalfOnNormal";
    private static final String muU = "StarButtonHalfOnPushing";
    private static final String muV = "StarButtonOffDisabled";
    private static final String muW = "StarButtonOffHover";
    private static final String muX = "StarButtonOffNormal";
    private static final String muY = "StarButtonOffPushing";
    private static final String muZ = "StarButtonOnDisabled";
    private static final String mva = "StarButtonOnHover";
    private static final String mvb = "StarButtonOnNormal";
    private static final String mvc = "StarButtonOnPushing";
    private List<ion> mvd = lcn.emv();
    private int ksh = -1;
    private ipx mve = null;
    private ipx lLK = null;

    public irq(iqz iqz2, int n, boolean bl) {
        super(irl.dnr());
        this.mve = ipx.a(iqz2, new ipf[0]);
        for (int i = 0; i < n; ++i) {
            ion ion2 = new ion(this, muV, muX, muW, muY, bl ? muZ : mvb, mvb, mva, mvc){
                final /* synthetic */ irq mvf;
                {
                    this.mvf = irq2;
                    super(string, string2, string3, string4, string5, string6, string7, string8);
                }

                public void pn(boolean bl) {
                    super.pn(bl);
                    irq.a(this.mvf, this, bl);
                }

                public boolean dK(int n, int n2) {
                    super.dK(n, n2);
                    irq.a(this.mvf, this);
                    return true;
                }

                public boolean dL(int n, int n2) {
                    super.dL(n, n2);
                    irq.b(this.mvf, this);
                    return true;
                }
            };
            ion2.rF(bl);
            this.mvd.add(ion2);
            this.mve.W(ion2);
            this.mve.W(ipx.a(4, 1, new ipf[0]));
        }
        this.W(ipx.d(this.mve));
    }

    private void a(ion ion2) {
        this.ksh = this.mvd.indexOf(ion2);
    }

    private void a(ion ion2, boolean bl) {
        ion ion3;
        int n;
        this.ksh = this.mvd.indexOf(ion2);
        for (n = this.ksh + 1; n < this.mvd.size(); ++n) {
            ion3 = this.mvd.get(n);
            ion3.a(ioy.mpW);
        }
        for (n = this.ksh - 1; n >= 0; --n) {
            ion3 = this.mvd.get(n);
            ion3.a(ioy.mpX);
        }
    }

    private void b(ion ion2) {
        this.ksh = this.mvd.indexOf(ion2);
    }

    public int bRq() {
        return this.ksh + 1;
    }

    public void jf(float f) {
        int n;
        if (f > (float)this.mvd.size()) {
            assert (false) : "Rating : " + f;
            return;
        }
        for (n = 0; n < this.mvd.size(); ++n) {
            ion ion2 = this.mvd.get(n);
            ion2.K(ipb.qO(mvb));
            ion2.a(ioy.mpW);
        }
        n = (int)Math.floor(f);
        for (int i = 0; i < n; ++i) {
            ion ion3 = this.mvd.get(i);
            ion3.a(ioy.mpX);
        }
        if (f - (float)n >= 0.5f) {
            ion ion4 = this.mvd.get(n);
            ion4.J(ipb.qO(muT));
            ion4.a(ioy.mpX);
        }
    }

    public void sc(boolean bl) {
        if (!bl && this.lLK == null) {
            this.lLK = ipx.d(new ipb("RatingDisabled"));
            this.W(this.lLK);
        }
        if (this.lLK != null) {
            this.lLK.setVisible(!bl);
        }
    }

    static /* synthetic */ void a(irq irq2, ion ion2, boolean bl) {
        irq2.a(ion2, bl);
    }

    static /* synthetic */ void a(irq irq2, ion ion2) {
        irq2.a(ion2);
    }

    static /* synthetic */ void b(irq irq2, ion ion2) {
        irq2.b(ion2);
    }
}

