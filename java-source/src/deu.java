/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
import java.util.Iterator;
import java.util.List;

public class deu
extends btk
implements bto {
    private List<dfx> gne = null;
    private List<dfx> gnf = lcn.emI();
    private List<dfx> gng = null;
    private double gnh = 0.2f;
    private double gni = 30.0;
    private double gnj = 2.0;
    private float doW = 0.0f;
    private float gnk = 2.0f;
    private float gnl = 4.0f;
    private int gnm = 200;
    private double gnn = 0.0;
    private double gno = 0.0;
    private List<Float> gnp = null;
    private List<String> gnq = null;

    public deu() {
        this.gne = lcn.emI();
        this.gng = lcn.emI();
        this.gnp = lcn.emI();
        this.gnq = lcn.emI();
        this.blg();
    }

    @Override
    public void doTick(ldz ldz2) {
    }

    @Override
    public void initialize() {
        super.initialize();
    }

    public void bJ(ljq ljq2) {
        if (this.MessageDelegator == null) {
            return;
        }
        if (this.MessageDelegator.arc().rgz - this.gno < this.gnn) {
            return;
        }
        this.gno = this.MessageDelegator.arc().rgz;
        dfx dfx2 = (dfx)dgj.getAtomFactory().Af(22);
        dfx2.setActive(true);
        dfx2.setGUID(this.MessageDelegator.bzv());
        dfx2.hX(true);
        dfx2.Ai(0);
        dfx2.a(this.blb());
        float f2 = this.blc();
        ljq ljq3 = this.a(this.MessageDelegator.arc().rgz, this.MessageDelegator.arc().rgz, this.gnh, f2, true);
        dfx2.bM(ljq3);
        float f3 = ljq3.esC();
        dfx2.setRadius(f2);
        dfx2.setMaxRadius(f2);
        dfx2.c(ljq2);
        dfx2.setMeshName(this.blh());
        this.MessageDelegator.a(dfx2);
        dfx2.o(this.MessageDelegator.arc().rgz);
        dfx2.setDuration(this.gnh);
        this.gne.add(dfx2);
    }

    public void w(ljq ljq2, float f2) {
        if (this.MessageDelegator == null) {
            return;
        }
        this.gno = this.MessageDelegator.arc().rgz;
        dfx dfx2 = (dfx)dgj.getAtomFactory().Af(22);
        dfx2.setActive(true);
        dfx2.setGUID(this.MessageDelegator.bzv());
        dfx2.hX(true);
        dfx2.Ai(0);
        dfx2.a(this.blb());
        dfx2.setRadius(f2);
        dfx2.setMaxRadius(f2);
        dfx2.c(ljq2);
        dfx2.setMeshName(this.blh());
        dfx2.bM(new ljq(f2, f2, f2));
        dfx2.o(this.MessageDelegator.arc().rgz);
        dfx2.setDuration(this.gni);
        this.MessageDelegator.a(dfx2);
        this.gnf.add(dfx2);
    }

    private lgl blb() {
        return new lgl((float)(Math.random() * Math.PI), (float)(Math.random() * Math.PI), (float)(Math.random() * Math.PI));
    }

    private float blc() {
        float f2 = (float)Math.random();
        f2 = this.gnk + (this.gnl - this.gnk) * f2;
        return f2;
    }

    private ljq bld() {
        float f2 = this.blc();
        return new ljq(f2, f2, f2);
    }

    private ljq gj(float f2) {
        return new ljq(f2, this.doW, f2);
    }

    private ljq a(double d2, double d3, double d4, float f2, boolean bl) {
        float f3 = (float)((d3 - d2) / d4);
        if (!bl) {
            f3 = 1.0f - f3;
        }
        float f4 = this.doW + (f2 - this.doW) * f3;
        if (bl) {
            return new ljq(f2, f4, f2);
        }
        return new ljq(f4, f4, f4);
    }

    private double ble() {
        return this.gni;
    }

    private void blf() {
        ljq ljq2;
        dfx dfx2;
        Iterator<dfx> iterator;
        if (!this.gne.isEmpty()) {
            iterator = this.gne.iterator();
            while (iterator.hasNext()) {
                dfx2 = iterator.next();
                if (dfx2.aAw() + dfx2.Bw() < this.MessageDelegator.arc().rgz) {
                    dfx2.bM(new ljq(dfx2.getMaxRadius(), dfx2.getMaxRadius(), dfx2.getMaxRadius()));
                    dfx2.o(this.MessageDelegator.arc().rgz);
                    dfx2.setDuration(this.gni);
                    iterator.remove();
                    this.gnf.add(dfx2);
                    continue;
                }
                ljq2 = this.a(dfx2.aAw(), this.MessageDelegator.arc().rgz, dfx2.Bw(), dfx2.getMaxRadius(), true);
                dfx2.bM(ljq2);
            }
        }
        if (this.gnf.size() > this.gnm) {
            iterator = this.gnf.iterator();
            while (iterator.hasNext() && this.gnf.size() > this.gnm) {
                dfx2 = iterator.next();
                dfx2.o(this.MessageDelegator.arc().rgz);
                dfx2.setDuration(this.gnj);
                iterator.remove();
                this.gng.add(dfx2);
            }
        }
        if (!this.gnf.isEmpty()) {
            iterator = this.gnf.iterator();
            while (iterator.hasNext()) {
                dfx2 = iterator.next();
                if (!(dfx2.aAw() + dfx2.Bw() < this.MessageDelegator.arc().rgz)) continue;
                dfx2.o(this.MessageDelegator.arc().rgz);
                dfx2.setDuration(this.gnj);
                iterator.remove();
                this.gng.add(dfx2);
            }
        }
        if (!this.gng.isEmpty()) {
            iterator = this.gng.iterator();
            while (iterator.hasNext()) {
                dfx2 = iterator.next();
                if (dfx2.aAw() + dfx2.Bw() < this.MessageDelegator.arc().rgz) {
                    iterator.remove();
                    dey.bls().b(dfx2);
                    continue;
                }
                ljq2 = this.a(dfx2.aAw(), this.MessageDelegator.arc().rgz, dfx2.Bw(), dfx2.getMaxRadius(), false);
                dfx2.bM(ljq2);
            }
        }
    }

    private void blg() {
        this.gnp.add(new Float(0.7));
        this.gnp.add(new Float(1.0));
        this.gnq.add("squirt_ball_05.x");
        this.gnq.add("squirt_ball_04.x");
        assert (this.gnp.size() == this.gnq.size());
    }

    private String blh() {
        float f2 = (float)Math.random();
        for (int i2 = 0; i2 < this.gnp.size(); ++i2) {
            if (!(f2 <= this.gnp.get(i2).floatValue())) continue;
            return this.gnq.get(i2);
        }
        return this.gnq.get(0);
    }
}

