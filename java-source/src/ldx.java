/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcw
 */
import java.util.Map;

public class ldx {
    private int di = -1;
    private Map<ldv, ldw> rfL = lcn.emw();
    private static int rfM = 2000;
    private static ldx rfN = null;

    private ldx() {
    }

    public static ldx enG() {
        if (rfN == null) {
            rfN = new ldx();
        }
        return rfN;
    }

    public ldw enH() {
        ldv ldv2 = this.enJ();
        return this.aci(ldv2.enw());
    }

    public ldw enI() {
        return this.aci(++rfM + lcr.emU());
    }

    final ldv enJ() {
        ldv ldv2 = new ldv(this.di, ++rfM, 0);
        while (this.rfL.containsKey(ldv2)) {
            ldv2 = new ldv(this.di, ++rfM, 0);
        }
        return ldv2;
    }

    public ldw aci(int n) {
        assert (this.di != -1) : "NodeID is -1 !";
        return this.fS(this.di, n);
    }

    public ldw fS(int n, int n2) {
        ldv ldv2 = new ldv(n, n2, 0);
        ldw ldw2 = null;
        if (this.rfL.containsKey(ldv2)) {
            return this.rfL.get(ldv2);
        }
        ldw2 = new ldw(n, n2);
        this.rfL.put(ldw2.enD(), ldw2);
        if (lcw.emZ() || lcw.ena()) {
            ldw2.initialize(1);
        } else if (lcw.enf()) {
            ldw2.initialize(2);
        } else if (lcw.enb()) {
            if (n == 1024) {
                ldw2.initialize(1);
            } else if (lcw.abY((int)n)) {
                ldw2.initialize(2);
            } else if (n == 7000) {
                ldw2.initialize(1);
            }
        } else {
            ldw2.initialize(0);
        }
        return ldw2;
    }

    boolean tZ(ldv ldv2) {
        return this.rfL.remove(ldv2) != null;
    }

    public final void bN(int n) {
        if (this.di == -1) {
            this.di = n;
        } else {
            System.out.println("# ERROR # Cannot set NodeID more than once!");
        }
    }

    public final int ib() {
        return this.di;
    }
}

