/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ha
 */
import java.util.List;
import java.util.Map;

public abstract class cka
extends btk
implements bto {
    final String TC;
    final ha hF;
    final double acj;
    final double bRq;
    List<Integer> eEQ = lcn.emv();
    cjx eFl = null;
    ckd eFm = null;
    double eFn = -1.0;
    boolean auz = false;
    private boolean eFo = false;

    public cka(ha ha2) {
        this.TC = this.getClass().getSimpleName();
        this.hF = ha2;
        this.acj = lea.epx().getDelay();
        this.bRq = lea.epx().aQG();
    }

    public void aQB() {
        if (!this.qk()) {
            this.eFo = true;
            return;
        }
        this.rw();
    }

    void rw() {
        int n = 0;
        Map<Integer, ckl> map = this.aQq();
        for (ckl ckl2 : map.values()) {
            ckk ckk2 = lea.epw().ro(ckl2.getID());
            if (ckk2 == null || !ckl2.aQV()) continue;
            int n2 = ckk2.aQS().ordinal();
            int n3 = ckk2.getIndex() + 1;
            n = ckk.m(n2, n3, n);
        }
        this.hF.jm().i(11888, n);
        this.gg(true);
        this.aQD();
        this.hF.jf().aMy().aLB();
        this.auz = true;
    }

    @Override
    public void doTick(ldz ldz2) {
        if (!this.isInitialized()) {
            return;
        }
        if (!this.eFo) {
            return;
        }
        if (!this.qk()) {
            return;
        }
        this.eFo = false;
        this.rw();
    }

    boolean aQC() {
        return this.qk();
    }

    boolean qk() {
        if (this.MessageDelegator == null || this.hF.jf() == null || this.hF.jf().getMessageDelegator() == null || this.hF.jf().aAG() == null || this.hF.jf().fi() == null || this.hF.jf().aKu() == null) {
            return false;
        }
        if (!this.hF.jf().aJD().aEP().isAlive()) {
            return false;
        }
        return this.hF.jf().aMy() != null;
    }

    public boolean kn() {
        if (this.eFn == -1.0) {
            return false;
        }
        return this.MessageDelegator.arc().rgz - this.eFn < this.bRq;
    }

    void aQk() {
        assert (false) : "Unimplemented in base class";
    }

    public void a(boolean bl, double d2) {
    }

    public void kk() {
    }

    public void kl() {
        this.eFn = -1.0;
    }

    void aQD() {
        cat cat2 = (cat)this.hF.jf().aKu();
        if (cat2 != null) {
            cat2.aGV();
        }
    }

    public nf aQm() {
        return null;
    }

    public void a(nf nf2) {
    }

    void a(ggj ggj2) {
        Object object;
        int n = ggj2.aGg;
        int[] nArray = null;
        boolean[] blArray = null;
        if (n != -1) {
            boolean[] blArray2;
            int[] nArray2;
            object = this.aQq().get(n);
            if (object != null) {
                int[] nArray3 = new int[1];
                nArray2 = nArray3;
                nArray3[0] = ((ckl)object).getID();
            } else {
                nArray2 = nArray = null;
            }
            if (object != null) {
                boolean[] blArray3 = new boolean[1];
                blArray2 = blArray3;
                blArray3[0] = ((ckl)object).aQV();
            } else {
                blArray2 = null;
            }
            blArray = blArray2;
        } else {
            nArray = new int[this.aQq().size()];
            blArray = new boolean[this.aQq().size()];
            int n2 = 0;
            for (ckl ckl2 : this.aQq().values()) {
                nArray[n2] = ckl2.getID();
                blArray[n2] = ckl2.aQV();
                ++n2;
            }
        }
        object = (ggk)this.hF.getMessageDelegator().h(30982, this.hF.getGUID(), ggj2.aO());
        ((ggk)object).jgv = nArray;
        ((ggk)object).jgH = blArray;
        this.MessageDelegator.b(ggj2, (dxq)object);
        this.MessageDelegator.F((dxq)object);
    }

    void a(int n, ldv ldv2, int n2, double d2) {
        ggq ggq2 = (ggq)this.MessageDelegator.h(30978, this.hF.getGUID(), ldv2);
        ggq2.Js(n);
        ggq2.sk(n2);
        ggq2.cI(d2);
        this.MessageDelegator.F(ggq2);
    }

    void gg(boolean bl) {
        assert (false);
    }

    public int km() {
        assert (false);
        return 0;
    }

    Map<Integer, ckl> aQq() {
        assert (false);
        return null;
    }

    public int kh() {
        assert (false);
        return -1;
    }

    public cjx ki() {
        assert (false);
        return null;
    }

    public ckd kj() {
        assert (false);
        return null;
    }

    public op[] aQr() {
        assert (false);
        return null;
    }

    public void a(op[] opArray, int n, int n2, int n3) {
        assert (false);
    }

    public void oU(int n) {
    }
}

