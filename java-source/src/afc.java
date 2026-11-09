/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Map;

public class afc
extends btk {
    private final aex bgh;
    private final aew Wg;
    private Map<Integer, aff> bgi;
    private aff bgj;
    private int aFy;

    public afc(aex aex2, aew aew2) {
        this.bgh = aex2;
        this.Wg = aew2;
        this.bgi = lcn.abI(aex2.zn().size());
        aff aff2 = null;
        for (aez aez2 : aex2.zn()) {
            switch (aez2.zz()) {
                case bgP: {
                    aff2 = new afe(this, (afb)aez2);
                    break;
                }
                case bgQ: {
                    aff2 = new afd(this, (afa)aez2);
                    break;
                }
            }
            this.bgi.put(aez2.getIndex(), aff2);
        }
    }

    public void start() {
        if (this.bgj == null) {
            this.bgj = this.et(0);
        }
        this.eu(0);
        this.zM();
        this.bgj.start();
    }

    private void zM() {
        assert (!this.bgj.isInitialized());
        assert (this.bgj != null);
        this.bgj.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.bgj);
    }

    public void zN() {
        assert (this.bgj != null);
        this.bgj = this.zP();
        if (this.bgj == null) {
            ++this.aFy;
            this.zO();
            this.eu(4);
            this.Wg.ct(this.bgh.getName());
            return;
        }
        this.zM();
        this.bgj.start();
    }

    private void zO() {
        this.bgj = null;
    }

    public aff et(int n) {
        if (n >= this.bgi.size()) {
            return null;
        }
        return this.bgi.get(n);
    }

    public aff zP() {
        if (this.bgj.Ab() >= this.bgi.size()) {
            return null;
        }
        return this.bgi.get(this.bgj.Ab() + 1);
    }

    public void o(ldv ldv2, int n) {
        if (this.bgj == null) {
            return;
        }
        this.bgj.o(ldv2, n);
    }

    public void cB(ldv ldv2) {
        if (this.bgj == null) {
            return;
        }
        this.bgj.cB(ldv2);
    }

    public aff zQ() {
        return this.bgj;
    }

    private void eu(int n) {
        Map<Integer, Integer> map = this.zj();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            ldv ldv2 = lcr.abW((int)entry.getKey());
            ldv ldv3 = lcr.ak((ldv)lcr.acL, (int)entry.getValue());
            glk glk2 = (glk)this.MessageDelegator.h(35330, this.getGUID(), ldv3);
            glk2.Eh(n);
            glk2.kZ(this.zS());
            glk2.JS(this.bgj != null ? this.bgj.Ab() : 0);
            glk2.JR(this.bgj != null ? this.bgj.ze() : 0);
            this.MessageDelegator.E(glk2);
        }
    }

    public aex zR() {
        return this.bgh;
    }

    public Map<Integer, Integer> zj() {
        return this.Wg.zj();
    }

    public void g(loz loz2) {
        this.Wg.g(loz2);
    }

    public final String zS() {
        return this.bgh.getName();
    }

    public final boolean isEnabled() {
        return this.bgh.isEnabled();
    }

    public void a(pe pe2) {
        this.aFy = pe2.aFy;
        this.bgj = this.et(pe2.aGE);
        if (this.bgj != null) {
            this.bgj.g(pe2.aGF, pe2.aGG);
        }
    }

    public pe zT() {
        pe pe2 = new pe();
        pe2.Name = this.bgh.getName();
        pe2.aGE = this.bgj != null ? this.bgj.Ab() : -1;
        pe2.aGF = this.bgj != null ? this.bgj.ze() : -1;
        pe2.aGG = this.bgj != null ? this.bgj.zV() : "";
        pe2.aFy = this.aFy;
        return pe2;
    }
}

