/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  atv
 *  cug
 *  dly
 *  lcr
 */
public class qs
extends qd {
    private ldv aGw;
    private sn aNG;
    private so aNH;
    private sj aNI;
    private String aMH;

    public qs(md md2) {
        super(md2, me.axP);
    }

    public final void ck(ldv ldv2) {
        if (this.sR()) {
            lfn.b(5, "SFPersistenceWorkerLoadOneSpawnable", "setSpawnableGUID: Can't modify while working");
            assert (false);
            return;
        }
        this.aGw = ldv2;
    }

    public final ldv tg() {
        return this.aGw;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.aNG = this.f(new sn((md)this, pd.class));
        this.aNH = this.f(new so((md)this, nb.class));
        this.aNI = this.f(new sj(this));
    }

    @Override
    public void cleanUp() {
        this.e(this.aNG);
        this.e(this.aNH);
        this.e(this.aNI);
        this.aNG = null;
        this.aNH = null;
        this.aNI = null;
        super.cleanUp();
    }

    @Override
    protected void sO() {
        this.aNG.h(this.aGw.fk());
        this.aNG.start();
        this.aNH.h(this.aGw.fk());
        this.aNH.start();
    }

    @Override
    protected void sP() {
        this.aMH = null;
    }

    @Override
    public void c(qe qe2) {
        super.c(qe2);
        if (qe2.sS() && this.aMH == null) {
            this.aMH = qe2.getErrorMessage();
        }
        if (this.su() > 0) {
            return;
        }
        if (this.aMH != null) {
            this.ca(this.aMH);
            return;
        }
        if (qe2.equals(this.aNI)) {
            if (this.aNI.getItemCount() == 0) {
                this.th();
            } else {
                lfn.b(5, "SFPersistenceWorkerLoadOneSpawnable", "notifyChildCompleted() spawnable object with item id " + this.aNI.si() + " will not be spawned because it was found in the inventory.");
                this.ca(null);
            }
        } else {
            this.aNI.r(((pd)this.aNG.ub()).aCF);
            this.aNI.start();
        }
    }

    private void th() {
        pa pa2 = new pa();
        pa2.aGw = this.aGw;
        pa2.aGx = (pd)this.aNG.ub();
        if (this.aNH.ud() != null) {
            pa2.aCN = lcn.abH(this.aNH.ud().size());
            this.aNH.d(pa2.aCN);
        }
        int n = lea.enW().getType(pa2.aGx.ResourceName);
        if (lea.enW().fV(n, cug.fgH)) {
            bxd bxd2 = (bxd)this.MessageDelegator.bzx().bzt().d(lcr.qBn);
            bxd2.a(pa2);
            this.ca(null);
        } else if (lea.enW().fV(n, cug.fnD) || lea.enW().fV(n, cug.fnE)) {
            dly dly2 = (dly)this.MessageDelegator.bzx().bzt().d(lcr.qBi);
            dly2.a(pa2);
            this.ca(null);
        } else if (lea.enW().fV(n, cug.fnO)) {
            atv atv2 = (atv)this.MessageDelegator.bzx().bzt().d(lcr.qBe);
            atv2.a(pa2);
            this.ca(null);
        } else if (lea.enW().fV(n, cug.fnQ)) {
            cww cww2 = (cww)this.MessageDelegator.bzx().bzt().d(lcr.qBl);
            cww2.a(pa2);
            this.ca(null);
        } else if (lea.enW().fV(n, cug.fnP)) {
            atb atb2 = (atb)this.MessageDelegator.bzx().bzt().d(lcr.qBj);
            atb2.a(pa2);
            this.ca(null);
        } else {
            lfn.b(5, "SFPersistenceWorkerLoadOneSpawnable", "createSpawnable: Don't know how to handle " + pa2.aGx.ResourceName);
            assert (false);
            this.ca("Unhandled resource " + pa2.aGx.ResourceName);
        }
    }
}

