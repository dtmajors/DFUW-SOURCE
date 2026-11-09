/*
 * Decompiled with CFR.
 */
import java.util.StringTokenizer;

public class ft
extends btk {
    public final String bc;
    public final ldv Ri;
    public final int RB;
    private int Te = 0;
    private double Tf = 0.0;
    private int Tg = 0;
    private static final double Th = 600.0;
    public static final ldv Ti = new ldv(65533, 1800, 1);

    public ft(String string, ldv ldv2, int n) {
        this.bc = string;
        this.Ri = ldv2;
        this.RB = n;
    }

    public static int aB(String string) {
        StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
        int n = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String string2 = stringTokenizer.nextToken().toLowerCase();
            if (string2.equalsIgnoreCase("all")) {
                for (a a2 : a.Tm) {
                    int n2 = 1 << a2.ordinal();
                    n |= n2;
                }
                continue;
            }
            a a3 = a.fromString(string2);
            if (a3 == null) {
                return 0;
            }
            n |= 1 << a3.ordinal();
        }
        return n;
    }

    public String hh() {
        String string = "";
        for (a a2 : a.Tm) {
            int n = 1 << a2.ordinal();
            if ((n & this.Te) == 0) continue;
            string = !string.isEmpty() ? string + "," + a2.toString() : a2.toString();
        }
        return string;
    }

    public int hi() {
        return this.Te;
    }

    public boolean a(a a2) {
        if (a2 == null) {
            return false;
        }
        int n = 1 << a2.ordinal();
        return (n & this.Te) != 0;
    }

    public void bw(int n) {
        for (a a2 : a.Tm) {
            int n2 = 1 << a2.ordinal();
            if ((n2 & n) != 0) {
                this.a(a2, true);
                continue;
            }
            this.a(a2, false);
        }
    }

    void g(ldz ldz2) {
        if (this.a(a.Tk) && this.Tf + 600.0 < ldz2.rgz) {
            this.Tf = ldz2.rgz;
            switch (this.Tg) {
                case 0: {
                    this.aC("plist");
                    break;
                }
                case 1: {
                    this.aC("mlist");
                    break;
                }
                case 2: {
                    this.aC("wlist");
                }
            }
            ++this.Tg;
            if (this.Tg > 2) {
                this.Tg = 0;
            }
        }
    }

    @Override
    public void initialize() {
    }

    @Override
    public void cleanUp() {
        this.bw(0);
    }

    private void a(a a2, boolean bl) {
        int n = 1 << a2.ordinal();
        if (bl) {
            if ((this.Te & n) != 0) {
                return;
            }
            this.Te |= n;
        } else {
            if ((this.Te & n) == 0) {
                return;
            }
            this.Te &= ~n;
        }
        switch (a2) {
            case Tk: {
                this.C(bl);
                break;
            }
            case Tl: {
                this.D(bl);
                break;
            }
            default: {
                return;
            }
        }
    }

    private void aC(String string) {
        kcc kcc2 = (kcc)this.MessageDelegator.i(273, this.getGUID(), Ti);
        kcc2.ID = "runclientfunc";
        kcc2.akV = "runclientfunc";
        kcc2.pdY = string + ":" + this.RB;
        kcc2.iBr = false;
        this.MessageDelegator.b(kcc2);
    }

    private void C(boolean bl) {
    }

    private void D(boolean bl) {
    }

    @Override
    public String toString() {
        return this.bc + " [" + this.Ri + "] on " + this.RB + " monitoring " + this.hh();
    }
}

