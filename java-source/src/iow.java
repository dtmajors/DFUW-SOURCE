/*
 * Decompiled with CFR.
 */
public class iow
extends ios {
    private ist mpC;
    private ist mpD;
    private ist mpE;
    private ist mpF;

    public iow(ipf ipf2, ist ist2, ipf ipf3, ist ist3, ipf ipf4, ist ist4, ipf ipf5, ist ist5) {
        this.mpD = ist3;
        this.mpC = ist2;
        this.mpE = ist4;
        this.mpF = ist5;
        this.t(new iop(ipf2, ist2));
        this.u(new iop(ipf3, ist3));
        this.v(new iop(ipf4, ist4));
        this.w(new iop(ipf5, ist5));
        this.setActive(true);
    }

    public void setText(String string) {
        this.mpC.setText(string);
        this.mpD.setText(string);
        this.mpE.setText(string);
        this.mpF.setText(string);
    }

    @Override
    public void kh(float f) {
        ((iop)this.dis()).dip().hz(f);
        ((iop)this.dit()).dip().hz(f);
        ((iop)this.diu()).dip().hz(f);
        ((iop)this.div()).dip().hz(f);
    }
}

