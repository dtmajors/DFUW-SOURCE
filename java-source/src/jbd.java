/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Map;
import java.util.Set;

public class jbd
implements hvr {
    public static final double mMI = 7.0;
    public static final int mMJ = 3;
    private static jbd mMK;
    private static final int mML = 128;
    private static final double mMM = 0.5;
    private static final double mMN = 0.2;
    private static final int mfY = 2;
    private double mMO = 0.0;
    private List<jba> mMP = lcn.emv();
    private Map<jba, jbc> mMQ = lcn.emw();
    private Set<jba> mMR = null;
    private boolean lga;
    private double mMS;
    private List<jbb> mMT = lcn.emv();
    private int mMU = 0;
    private List<jba> mMV = lcn.emv();

    @Override
    public void az(ldz ldz2) {
        this.mMO = ldz2.rgz;
    }

    @Override
    public void aA(ldz ldz2) {
    }

    @Override
    public void doTick(ldz ldz2) {
        while (this.mMU < 3 && this.mMT.size() > 0) {
            this.dwr();
        }
        while (this.mMP.size() < 3 && this.mMV.size() > 0) {
            this.dws();
        }
        this.lga = true;
        double d2 = ldz2.rgz - this.mMO;
        this.mMO = ldz2.rgz;
        for (jba jba2 : this.mMP) {
            switch (this.mMQ.get(jba2)) {
                case mMA: 
                case mMB: {
                    this.a(jba2, ldz2.rgz, d2);
                    break;
                }
                case mMC: {
                    this.b(jba2, ldz2.rgz, d2);
                    break;
                }
                case mMD: 
                case mME: {
                    this.c(jba2, ldz2.rgz, d2);
                    break;
                }
                case mMF: {
                    this.d(jba2, ldz2.rgz, d2);
                    break;
                }
                case mMG: {
                    this.e(jba2, ldz2.rgz, d2);
                }
            }
        }
        this.lga = false;
        if (this.mMR != null) {
            for (jba jba2 : this.mMR) {
                this.n(jba2);
            }
            this.mMR = null;
        }
        if (this.isEmpty()) {
            hso.cxK().cxP().czy().b(mMK);
            mMK = null;
        }
    }

    public void a(jbb jbb2) {
        this.mMT.add(jbb2);
    }

    public void l(jba jba2) {
        if (this.mMQ.get(jba2) == null) assert (false);
        if (this.lga) {
            if (this.mMR == null) {
                this.mMR = lcn.emx();
            }
            this.mMR.add(jba2);
        } else {
            this.n(jba2);
        }
    }

    public boolean isEmpty() {
        return this.mMP.isEmpty() && this.mMT.isEmpty() && this.mMU == 0 && this.mMV.isEmpty();
    }

    public static jbd dwq() {
        if (mMK == null) {
            mMK = new jbd();
            hso.cxK().cxP().czy().a(mMK);
        }
        return mMK;
    }

    void m(jba jba2) {
        --this.mMU;
        this.mMV.add(jba2);
    }

    private void n(jba jba2) {
        this.mMQ.remove(jba2);
        this.mMP.remove(jba2);
        if (jba2.getMessageDelegator() != null) {
            jba2.getMessageDelegator().hd(jba2.getGUID());
        }
    }

    private void a(jba jba2, double d2, double d3) {
        jba2.R((float)((double)jba2.cEE() + (double)jba2.dvW() * d3 / 0.5), jba2.cEF());
        if (jba2.cEE() >= 0.0f) {
            jba2.R(0.0f, jba2.cEF());
            this.a(jba2, jbc.mMC);
        }
    }

    private void b(jba jba2, double d2, double d3) {
        int n = this.mMP.indexOf(jba2);
        if (n > 1) {
            jba jba3 = this.mMP.get(n - 1);
            if (jba2.cEF() - jba3.cEF() - jba3.dvX() > jba2.dvX() / 2.0f) {
                this.a(jba2, jbc.mMD);
            }
        } else if (n == 1) {
            jba jba4 = this.mMP.get(0);
            if (jba2.cEE() + jba2.dvW() - jba4.cEE() - jba4.dvW() > jba2.dvW() / 10.0f) {
                this.a(jba2, jbc.mME);
            }
        } else {
            this.a(jba2, jbc.mME);
        }
    }

    private void c(jba jba2, double d2, double d3) {
        int n = this.mMP.indexOf(jba2);
        if (n > 1) {
            jba jba3 = this.mMP.get(n - 1);
            if (jba2.cEF() - jba3.cEF() - jba3.dvX() > 2.0f) {
                jba2.R(jba2.cEE(), (float)((double)jba2.cEF() - (double)jba2.dvX() * d3 / 0.2));
            } else {
                jba2.R(jba2.cEE(), jba3.cEF() + jba3.dvX() + 2.0f);
                this.a(jba2, jbc.mMC);
            }
        } else if (n == 1) {
            jba jba4 = this.mMP.get(n - 1);
            if (this.mMQ.get(jba4) == jbc.mMG) {
                jba2.R(jba2.cEE(), (float)((double)jba2.cEF() - (double)jba2.dvX() * d3 / 0.2));
            } else if (jba2.cEF() - jba4.cEF() - jba4.dvX() > 2.0f) {
                jba2.R(jba2.cEE(), (float)((double)jba2.cEF() - (double)jba2.dvX() * d3 / 0.2));
            } else {
                jba2.R(jba2.cEE(), jba4.cEF() + jba4.dvX() + 2.0f);
                this.a(jba2, jbc.mMC);
            }
        } else {
            jba2.R(jba2.cEE(), (float)((double)jba2.cEF() - (double)jba2.dvX() * d3 / 0.2));
        }
        if (jba2.cEF() <= 128.0f) {
            jba2.R(jba2.cEE(), 128.0f);
            this.mMS = d2;
            this.a(jba2, jbc.mMF);
        }
    }

    private void d(jba jba2, double d2, double d3) {
        if (d2 - this.mMS >= 7.0) {
            this.a(jba2, jbc.mMG);
        }
    }

    private void e(jba jba2, double d2, double d3) {
        jba2.R((float)((double)jba2.cEE() - (double)jba2.dvW() * d3 / 0.5), jba2.cEF());
        if (jba2.cEE() <= -jba2.getWidth()) {
            this.l(jba2);
        }
    }

    private void a(jba jba2, jbc jbc2) {
        this.mMQ.put(jba2, jbc2);
        if (jba2 instanceof jaz) {
            jba2.a(jbc2);
        }
    }

    private void dwr() {
        if (this.mMT.isEmpty()) {
            return;
        }
        jbb jbb2 = this.mMT.remove(0);
        jba jba2 = jbb2.cVQ();
        jba2.R(65536.0f, 65536.0f);
        ++this.mMU;
    }

    private void dws() {
        if (this.mMV.isEmpty()) {
            return;
        }
        jba jba2 = this.mMV.remove(0);
        jba jba3 = this.mMP.size() > 0 ? this.mMP.get(this.mMP.size() - 1) : null;
        this.mMP.add(jba2);
        this.a(jba2, this.mMP.size() > 1 ? jbc.mMA : jbc.mMB);
        jba2.R(-jba2.dvW() - (float)(this.mMP.size() - 1) * jba2.dvW() / 10.0f, jba3 != null ? jba3.cEF() + jba3.dvX() + 2.0f : 128.0f);
    }
}

