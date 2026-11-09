/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
public class anu
extends ans {
    public anu(anf anf2) {
        super(anf2);
    }

    @Override
    protected aqu.b Mf() {
        switch (this.bFP.KH()) {
            case bEg: {
                return this.Mo();
            }
        }
        return this.Mq();
    }

    private aqu.b Mo() {
        aqu.b b2 = null;
        if (b2 == null) {
            b2 = this.Mp();
        }
        if (b2 == null) {
            b2 = aqu.b.bNs;
        }
        return b2;
    }

    private aqu.b Mp() {
        if (!this.bFP.JU()) {
            arw.ct.debug("shadowdragon is not shadow dragon -- returning null");
            return null;
        }
        if (arw.Sx() > 0.8f) {
            arw.ct.debug("shadowdragon roll fail -- returning null");
            return null;
        }
        if (!this.bFP.Ip()) {
            arw.ct.debug("shadowdragon has no available magic -- returning null");
            return null;
        }
        if (!this.bFP.Iw()) {
            arw.ct.debug("shadowdragon has no available offensive long range magic -- returning null");
            return null;
        }
        if (this.bFP.IZ().Ly() == null) {
            arw.ct.debug("shadowdragon null current target -- returning null");
            return null;
        }
        if ((double)this.bFP.IZ().Ly().Uc() < 0.3) {
            arw.ct.debug("shadowdragon current target health below 30% -- returning null");
            return null;
        }
        if (this.bFP.IZ().LA() > 200.0f) {
            arw.ct.debug("shadowdragon target out of range -- returning null");
            return null;
        }
        if (this.bHp != null && this.bHp.PI() == aqu.b.bNr) {
            arw.ct.debug("shadowdragon alread attackin -- returning null");
            return null;
        }
        arw.ct.debug("shadowdragon returning attack");
        return aqu.b.bNr;
    }

    private aqu.b Mq() {
        aqu.b b2 = null;
        if (b2 == null) {
            b2 = this.Ms();
        }
        if (b2 == null) {
            b2 = this.Mr();
        }
        if (b2 == null) {
            b2 = this.Mu();
        }
        if (b2 == null) {
            b2 = this.Mt();
        }
        if (b2 == null) {
            b2 = this.Mw();
        }
        if (b2 == null) {
            b2 = this.Mv();
        }
        return b2;
    }

    private aqu.b Mr() {
        if (!this.bFP.Jv()) {
            return null;
        }
        if (!(this.bHp instanceof apg)) {
            return null;
        }
        if (this.bFP.IZ().Ly() == null) {
            return null;
        }
        if (this.bFP.IZ().LB()) {
            return null;
        }
        return aqu.b.bMv;
    }

    private aqu.b Ms() {
        if (!this.bFP.Jv()) {
            return null;
        }
        if (!(this.bHp instanceof apd)) {
            return null;
        }
        if (this.bFP.Jl().Uc() < 0.1f) {
            return null;
        }
        if (this.bFP.IZ().Ly() == null) {
            return null;
        }
        if (this.bFP.IZ().LB()) {
            return null;
        }
        if (this.bFP.IZ().LA() > 200.0f) {
            return null;
        }
        if (this.bFP.IZ().bt(85.0f)) {
            return null;
        }
        double d2 = 0.2;
        if (this.bFP.IZ().bt(150.0f)) {
            d2 = 0.4;
        }
        if (arw.Sw() > d2) {
            return null;
        }
        return aqu.b.bMz;
    }

    private aqu.b Mt() {
        if (this.bFP.IZ().Ly() == null) {
            return null;
        }
        if (this.bHp instanceof api) {
            return null;
        }
        if (this.bHp instanceof ape) {
            return null;
        }
        if (this.bHp instanceof apg) {
            return null;
        }
        if (!this.bFP.Ip()) {
            return null;
        }
        if (!this.bFP.Iw()) {
            return null;
        }
        if (this.bHp instanceof apd && arw.Sw() < 0.4) {
            return null;
        }
        if (this.bHp == null) {
            return null;
        }
        if (arw.Sw() < 0.1) {
            return null;
        }
        return aqu.b.bMw;
    }

    private aqu.b Mu() {
        if (this.bFP.Jv()) {
            return null;
        }
        if (this.bFP.IZ().Ly() == null) {
            return null;
        }
        if (!this.bFP.Ip()) {
            return null;
        }
        if (!this.bFP.Iy()) {
            return null;
        }
        if (!(this.bHp instanceof apd)) {
            return null;
        }
        if (this.bFP.IZ().LB()) {
            return null;
        }
        if (this.bFP.IZ().Ly().Uq()) {
            return null;
        }
        if (this.bFP.IZ().LA() > 200.0f) {
            return null;
        }
        if (arw.Sw() < 0.7) {
            return null;
        }
        return aqu.b.bMA;
    }

    private aqu.b Mv() {
        return aqu.b.bMx;
    }

    private aqu.b Mw() {
        if (this.bHp instanceof apg) {
            return aqu.b.bMy;
        }
        if (this.bHp instanceof ape) {
            return aqu.b.bMy;
        }
        if (this.bHp instanceof aph) {
            return null;
        }
        if (this.bHp instanceof api) {
            return aqu.b.bMy;
        }
        if (this.bHp instanceof ape) {
            return aqu.b.bMy;
        }
        if (this.bHp == null) {
            return aqu.b.bMy;
        }
        if (arw.Sw() > 0.6) {
            return aqu.b.bMy;
        }
        return null;
    }
}

