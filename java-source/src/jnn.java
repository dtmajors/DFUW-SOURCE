/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  jnk
 */
import java.util.Set;

public class jnn
extends jnl {
    jnn(jng jng2, jnr jnr2, dmn dmn2, jnk jnk2) {
        super(jng2, jnr2, dmn2, jnk2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        if (dxq2.bED() == 32000) {
            this.a((eqr)dxq2);
            return;
        }
        super.receiveMessage(dxq2);
    }

    private void a(eqr eqr2) {
        switch (eqr2.bHc()) {
            case 2305: {
                eqf eqf2 = (eqf)eqr2;
                int n = eqf2.akD();
                double d2 = eqf2.DV();
                this.g(n, d2);
                break;
            }
            case 2306: {
                eqf eqf3 = (eqf)eqr2;
                int n = eqf3.akD();
                double d3 = eqf3.DV();
                this.h(n, d3);
                break;
            }
            case 2307: {
                eqf eqf4 = (eqf)eqr2;
                int n = eqf4.akD();
                double d4 = eqf4.DV();
                this.Vo(n);
                break;
            }
        }
    }

    private void g(int n, double d2) {
        Set<hug> set = this.nDC.c(hug.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            for (hug hug2 : set) {
                hug2.a(n, d2);
            }
            this.nDC.ir(false);
        }
    }

    private void h(int n, double d2) {
        Set<hug> set = this.nDC.c(hug.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            for (hug hug2 : set) {
                hug2.b(n, d2);
            }
            this.nDC.ir(false);
        }
    }

    private void Vo(int n) {
        Set<hug> set = this.nDC.c(hug.class);
        if (!set.isEmpty()) {
            this.nDC.ir(true);
            for (hug hug2 : set) {
                hug2.Oo(n);
            }
            this.nDC.ir(false);
        }
    }

    @Override
    void dND() {
        Set<hug> set;
        super.dND();
        if (this.nDF != null && !(set = this.nDC.c(hug.class)).isEmpty()) {
            this.nDC.ir(true);
            for (hug hug2 : set) {
                hug2.a(this.nDF.abY());
            }
            this.nDC.ir(false);
        }
    }

    @Override
    void dNF() {
    }

    @Override
    void bqx() {
    }

    @Override
    void dNE() {
    }
}

