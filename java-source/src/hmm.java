/*
 * Decompiled with CFR.
 */
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class hmm {
    protected final hbe jzX = hbe.jAM;
    private final hpf kla;
    private final double kLl;
    private final double kLm;
    private final double kLn;
    private final int kLo;
    private final hme kLp = new hme(this){
        final /* synthetic */ hmm kLs;
        {
            this.kLs = hmm2;
        }

        public final lbl<lbn> cpY() {
            return hmm.a((hmm)this.kLs).kiG.chy();
        }

        public final double cpZ() {
            return hmm.b(this.kLs);
        }

        public final double cqa() {
            return hmm.c(this.kLs);
        }

        public final double cqb() {
            return hmm.d(this.kLs);
        }

        public final boolean cP(double d2) {
            if (d2 < hmm.c(this.kLs)) {
                d2 = hmm.c(this.kLs);
            }
            if (d2 > hmm.d(this.kLs)) {
                d2 = hmm.d(this.kLs);
            }
            if (d2 == hmm.b(this.kLs)) {
                return false;
            }
            hmm.a(this.kLs, d2);
            hmm.e(this.kLs);
            return true;
        }

        public boolean chD() {
            return hmm.a((hmm)this.kLs).kiG.chD();
        }
    };
    public final hpf.a kLq = new hpf.a(this){
        final /* synthetic */ hmm kLs;
        {
            this.kLs = hmm2;
        }

        public String mQ(String string) {
            return string;
        }

        public void chF() {
            double d2;
            String string = hmm.a((hmm)this.kLs).kiG.chz();
            if (string.length() == 0) {
                hmm.a((hmm)this.kLs).kiG.ns(true);
                return;
            }
            try {
                string = string.replaceAll(",", ".");
                d2 = hmm.f(this.kLs) > 0 ? Double.parseDouble(string) : (double)Integer.parseInt(string);
            }
            catch (Exception exception) {
                hmm.a((hmm)this.kLs).kiG.ns(true);
                return;
            }
            if (d2 < hmm.c(this.kLs) || d2 > hmm.d(this.kLs)) {
                hmm.a((hmm)this.kLs).kiG.ns(true);
                return;
            }
            hmm.a(this.kLs, d2);
            hmm.a((hmm)this.kLs).kiG.ns(false);
        }

        public void chG() {
        }
    };
    private double kLr;

    public hmm(hpf hpf2, double d2, double d3, double d4, int n) {
        assert (d2 <= d4);
        assert (d4 <= d3);
        this.kla = hpf2;
        this.kLl = d2;
        this.kLm = d3;
        this.kLn = d4;
        this.kLr = d4;
        this.kLo = n;
        this.ccu();
    }

    public final hpf.a cqf() {
        return this.kLq;
    }

    public final hme cqg() {
        return this.kLp;
    }

    public final void cqh() {
        assert (this.kla.kiG.chD());
        this.kLp.cP(this.kLn);
    }

    private final void ccu() {
        Object object;
        String string = "#";
        if (this.kLo > 0) {
            object = new char[this.kLo];
            for (int i = 0; i < this.kLo; ++i) {
                object[i] = 35;
            }
            string = "#." + new String((char[])object);
        }
        object = new DecimalFormat(string);
        String string2 = ((NumberFormat)object).format(this.kLp.cpZ());
        this.kla.kiG.mN(string2);
        this.kla.kiG.ns(false);
    }

    static /* synthetic */ hpf a(hmm hmm2) {
        return hmm2.kla;
    }

    static /* synthetic */ double b(hmm hmm2) {
        return hmm2.kLr;
    }

    static /* synthetic */ double c(hmm hmm2) {
        return hmm2.kLl;
    }

    static /* synthetic */ double d(hmm hmm2) {
        return hmm2.kLm;
    }

    static /* synthetic */ double a(hmm hmm2, double d2) {
        hmm2.kLr = d2;
        return hmm2.kLr;
    }

    static /* synthetic */ void e(hmm hmm2) {
        hmm2.ccu();
    }

    static /* synthetic */ int f(hmm hmm2) {
        return hmm2.kLo;
    }
}

