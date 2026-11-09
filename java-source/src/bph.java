/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.List;

public class bph
extends bpg {
    private ljq diS = new ljq();
    private ldv Ui = null;
    private ldv dzn = null;
    public String bb = null;
    private boolean dzo = false;
    private boolean dzp = false;

    public void G(ldv ldv2, ldv ldv3) {
        if (ldv3 == null) {
            this.bKW = true;
            return;
        }
        super.F(ldv2, ldv3);
        if (!this.dzp) {
            fut fut2 = (fut)this.MessageDelegator.h(5635, this.getGUID(), ldv2);
            fut2.jM(true);
            fut2.Ib(66);
            this.MessageDelegator.F(fut2);
        }
    }

    public void d(ldv ldv2, ldv ldv3, int[] nArray, List<int[]> list) {
        if (ldv3 == null) {
            this.bKW = true;
            return;
        }
        super.c(ldv2, ldv3, nArray, list);
        if (!this.dzp) {
            fut fut2 = (fut)this.MessageDelegator.h(5635, this.getGUID(), ldv2);
            fut2.jM(true);
            fut2.Ib(66);
            this.MessageDelegator.F(fut2);
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 5636: {
                fuu fuu2 = (fuu)dxq2;
                this.Ui = fuu2.Ui;
                this.dzn = fuu2.iXv;
                this.dzp = true;
                if (this.Ui == null) {
                    this.bKW = true;
                    return;
                }
                ftz ftz2 = (ftz)this.MessageDelegator.h(1028, this.getGUID(), this.Ui);
                ftz2.jM(true);
                this.MessageDelegator.F(ftz2);
                break;
            }
            case 1028: {
                ftz ftz3 = (ftz)dxq2;
                this.diS = ftz3.Position;
                this.bb = lcw.ea((ljq)this.diS);
                this.dzo = true;
                break;
            }
            case 11034: {
                gre gre2 = (gre)dxq2;
                this.bKW = true;
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    public void a(bpg bpg2) {
        this.dzj = bpg2.dzj;
        this.hC = bpg2.hC;
        this.YU = bpg2.YU;
        this.YV = bpg2.YV;
        this.add = bpg2.add;
        this.YY = bpg2.YY;
        this.dzh = bpg2.dzh;
        this.dzi = bpg2.dzi;
        this.dzm = bpg2.dzm;
        this.dzl = bpg2.dzl;
    }

    @Override
    public void initialize() {
        super.initialize();
    }

    @Override
    public boolean atk() {
        return super.atk();
    }

    @Override
    public boolean atl() {
        return super.atl() && this.dzo && this.dzp;
    }

    public ljq oB() {
        return this.diS;
    }

    public void aP(ljq ljq2) {
        this.diS = ljq2;
    }

    public ldv KY() {
        return this.Ui;
    }

    public ldv atr() {
        return this.dzn;
    }
}

