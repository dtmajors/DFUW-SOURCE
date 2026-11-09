/*
 * Decompiled with CFR.
 */
public class ikn
extends ijc {
    private iso mgs = new iso();
    private iqu mgH = null;

    public float dcv() {
        return 0.25f;
    }

    public ikn() {
        super(true, true, lyu.tKR);
        this.mgs.a(isf.mwO, ikm.f(this.daD()));
        this.mgs.Rk(ikm.dcu());
        this.mgs.a(isu.mxR);
        this.mgs.g(lwx.tli);
        this.cXE().W(this.mgs);
    }

    @Override
    public iph cXA() {
        this.mgH = new iqu(ikm.g(this.daD()), ikm.h(this.daD()));
        return ipx.h(new ipx(this.mgH));
    }

    @Override
    public ije dae() {
        return new iko(this);
    }

    @Override
    public ikd daf() {
        return ikd.mfD;
    }

    @Override
    public void cZZ() {
        if (this.mgH == null) {
            this.cXA();
        }
        this.mgH.setSize(ikm.g(this.daD()), ikm.h(this.daD()));
        this.mgs.setSize(ikm.g(this.daD()), ikm.h(this.daD()));
        this.setSize(ikm.g(this.daD()), ikm.h(this.daD()));
        this.mgs.zY(ikm.f(this.daD()));
    }

    @Override
    public void daa() {
        this.mgs.hz(this.daE());
    }
}

