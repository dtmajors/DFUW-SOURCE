/*
 * Decompiled with CFR.
 */
import java.util.Set;

public class hpy
extends hqr {
    private final hfg jIQ;
    protected final hfk kXv;

    public hpy(hfg hfg2, lgg lgg2, lhf lhf2) {
        super((hnc)hfg2.jIm.dXw, null, lgg2, lhf2, hfg2.jIm.dXw.kKc.jGK, hmk.a.kKY, hmk.a.kKY);
        this.jIQ = hfg2;
        this.kXv = new hfk(this.jIQ.jIm.dXw, (String)null, lgg.rlI, hfg2.jIm.dXw.kKc.kXw, 2048);
        this.cwt().cqd().a(this.kXv);
    }

    public String chz() {
        return this.kXv.chj().chz();
    }

    public void nc(String string) {
        this.kXv.chj().mN(string);
    }

    public void setCaretPosition(int n) {
        this.kXv.chj().setCaretPosition(n);
    }

    @Override
    protected boolean a(int n, boolean bl, Set<jpn> set) {
        if (super.a(n, bl, set)) {
            return true;
        }
        return this.kXv.b(n, bl, set);
    }

    @Override
    protected boolean LN(int n) {
        if (super.LN(n)) {
            return true;
        }
        return this.kXv.Ni(n);
    }

    @Override
    protected boolean LM(int n) {
        this.jIQ.Me(n);
        return true;
    }
}

