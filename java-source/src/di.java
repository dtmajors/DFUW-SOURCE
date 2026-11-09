/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dqk
 */
public class di
extends btk
implements bto {
    private int mb = 0;
    private double mc = 0.0;
    private double md = 0.5;
    private double me = 1.0;
    private double mf = 2.0;
    private boolean mg = false;
    private float mh = 0.0f;
    private float mi = 0.0f;
    private float mj = 0.0f;
    private float mk = 1.5708f;
    private ljq ml = new ljq(-220.0f, 50.0f, 0.0f);
    private boolean mm = false;
    private boolean mn = false;

    @Override
    public void initialize() {
        if (this.ObserverObjects != null && this.ObserverObjects.isEmpty()) {
            lfn.b(5, this.getClass().getName(), "No Observer Objects to Control!");
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.ObserverObjects != null && !this.ObserverObjects.isEmpty()) {
            switch (this.mb) {
                case 0: {
                    this.h(ldz2);
                    break;
                }
                case 1: {
                    this.i(ldz2);
                    break;
                }
                case 2: {
                    this.j(ldz2);
                    break;
                }
                case 3: {
                    this.k(ldz2);
                    break;
                }
                case 4: {
                    this.l(ldz2);
                }
            }
            for (int i2 = 0; i2 < this.ObserverObjects.size(); ++i2) {
                this.n((ldv)this.ObserverObjects.get(i2));
            }
        }
        this.mg = false;
    }

    private void h(ldz ldz2) {
        if (this.mg) {
            this.mc = ldz2.rgz;
            this.mb = 1;
        }
    }

    private void i(ldz ldz2) {
        double d2 = ldz2.rgz;
        double d3 = d2 - this.mc;
        if (d3 > this.md) {
            d3 = this.md;
        }
        double d4 = d3 / this.md;
        float f2 = (float)Math.sin(d4 * 1.5708);
        this.mh = this.mj + (this.mk - this.mj) * f2;
        if (d4 >= 1.0) {
            this.mc = ldz2.rgz;
            this.mb = 2;
        }
    }

    private void j(ldz ldz2) {
        double d2 = ldz2.rgz;
        double d3 = d2 - this.mc;
        if (d3 > this.me) {
            d3 = this.me;
        }
        double d4 = d3 / this.me;
        double d5 = (1.0 - d4) * 0.1;
        double d6 = d4 * 3.1415 * 2.0 * 4.0;
        float f2 = 1.0f + (float)d5 * (float)Math.sin(d6);
        this.mh = this.mj + (this.mk - this.mj) * f2;
        if (d4 >= 1.0) {
            this.mc = ldz2.rgz;
            this.mb = 3;
        }
    }

    private void k(ldz ldz2) {
        if (this.mg) {
            this.mc = ldz2.rgz;
            this.mb = 4;
        }
    }

    private void l(ldz ldz2) {
        double d2 = ldz2.rgz;
        double d3 = d2 - this.mc;
        if (d3 > this.mf) {
            d3 = this.mf;
        }
        double d4 = d3 / this.mf;
        float f2 = 1.0f - (float)d4;
        this.mh = this.mj + (this.mk - this.mj) * f2;
        if (d4 >= 1.0) {
            this.mc = ldz2.rgz;
            this.mb = 0;
            this.mm = false;
        }
    }

    private void n(ldv ldv2) {
        Object object;
        if (!this.mn) {
            lfn.b(0, "SFSkillFunctionInventorySensor", "handleSkillFunctionMessage() Sending PhysicsRequests.");
            object = (kmj)this.MessageDelegator.h(3329);
            ((kmj)object).Zf(1);
            ((kmn)object).hC(this.MessageDelegator.bzv());
            ((khd)object).ts(this.GUID);
            ((kmj)object).aO(false);
            this.MessageDelegator.a((khd)object);
            object = (kmj)this.MessageDelegator.h(3329);
            ((kmj)object).Zf(1);
            ((kmn)object).hC(this.MessageDelegator.bzv());
            ((khd)object).ts(this.GUID);
            ((khd)object).ts(this.GUID);
            ((kmj)object).aO(false);
            this.MessageDelegator.a((khd)object);
            this.mn = true;
        }
        object = new ljq(0.0f, 0.0f, 0.0f);
        ljq ljq2 = new ljq(0.0f, 1.5708f, 0.0f);
        object = new ljq(0.0f, 0.0f, 0.0f);
        ljq2 = new ljq(0.0f, 0.0f, this.mh - this.mi);
        kky kky2 = (kky)this.MessageDelegator.h(1025);
        kky2.pHG = ((ljq)object).x;
        kky2.pHH = ((ljq)object).y;
        kky2.pHI = ((ljq)object).rlV;
        lgl lgl2 = new lgl(ljq2);
        kky2.rb = lgl2.x;
        kky2.rc = lgl2.y;
        kky2.rd = lgl2.rlV;
        kky2.pHJ = lgl2.rlW;
        kky2.hC(ldv2);
        kky2.ts(this.GUID);
        kky2.wD(false);
        kky2.pHF = 2;
        this.MessageDelegator.a(kky2);
        if (this.mh > this.mi && (double)this.mh > 1.3 && !this.mm) {
            ldv ldv3 = this.cQ();
            this.o(ldv3);
            this.mm = true;
        }
        this.mi = this.mh;
    }

    private ldv cQ() {
        dqk dqk2 = new dqk();
        dqk2.setGUID(this.MessageDelegator.lL(this.GUID));
        dqk2.setObjectDescriptionFilename("all_bucket001.xml");
        dqk2.c(new ljq(61656.79f, 8430.707f, 45708.043f));
        dqk2.d(new ljq(0.0f, 0.0f, 0.0f));
        lfn.b(0, "SFCatapultOP", "createProjectile() Creating projectile " + dqk2.getGUID());
        this.MessageDelegator.a((amf)dqk2);
        return dqk2.getGUID();
    }

    private void o(ldv ldv2) {
        gae gae2 = (gae)this.MessageDelegator.h(6401, this.GUID, ldv2);
        gae2.Iv(4);
        gae2.cN(this.ml);
        lfn.b(0, "SFCatapultOP", "launchProjectile() Applying force " + this.ml + " on " + ldv2);
        this.MessageDelegator.E(gae2);
    }
}

