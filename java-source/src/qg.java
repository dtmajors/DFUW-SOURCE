/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ayd
 *  ha
 *  lcr
 */
import java.util.ArrayList;
import java.util.List;

public class qg
extends qd
implements bto {
    private ArrayList<nb> aMC;
    private ldv aCE;
    private bqy aMD;
    private boolean aME;
    private sr aMF;

    public qg(md md2) {
        super(md2, me.aym);
    }

    public void a(ldv ldv2, nb[] nbArray, bqy bqy2) {
        if (this.sR()) {
            lfn.b(5, "SFPersistenceWorkerCreateItems", "setupWorker: Can't modify while working");
            assert (false);
            return;
        }
        this.aCE = ldv2;
        this.aMC = lcn.emv();
        for (nb nb2 : nbArray) {
            this.aMC.add(nb2);
        }
        this.aMD = bqy2;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.aMF = this.f(new sr(this, nb.class, true));
    }

    @Override
    public void cleanUp() {
        this.e(this.aMF);
        super.cleanUp();
    }

    @Override
    protected void sO() {
        this.doTick(null);
    }

    @Override
    protected void sP() {
        this.aME = false;
    }

    public final List<nb> sU() {
        return this.aMC;
    }

    public final ldv sV() {
        return this.aCE;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        if (this.aME) {
            switch (dxq2.bEz()) {
                default: 
            }
            super.receiveMessage(dxq2);
        } else {
            super.receiveMessage(dxq2);
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.aME) {
            return;
        }
        if (!this.sR()) {
            return;
        }
        this.sW();
    }

    private void sW() {
        amf amf2 = this.MessageDelegator.bzx().bzt().d(this.aCE);
        if (amf2 == null) {
            lfn.b(5, "SFPersistenceWorkerCreateItems", "startWork: No object with GUID " + this.aCE + " found");
            this.ca("No object with GUID " + this.aCE + " found");
            assert (false);
            return;
        }
        if (amf2 instanceof ha) {
            ha ha2 = (ha)amf2;
            if (ha2.iY()) {
                fmz fmz2 = (fmz)this.MessageDelegator.h(7955, this.getGUID(), ha2.getGUID());
                fmz2.iQH = true;
                fmz2.iJE = null;
                fmz2.bqd = new int[this.aMC.size()];
                fmz2.iQG = new ek[this.aMC.size()];
                fmz2.iIY = new int[this.aMC.size()];
                fmz2.b(this.aMD);
                for (int i = 0; i < this.aMC.size(); ++i) {
                    ler ler2 = lea.enW().zx(this.aMC.get((int)i).aCI);
                    if (ler2 == null) {
                        this.ca("Could not find resource ID for type " + this.aMC.get((int)i).aCI);
                        return;
                    }
                    fmz2.bqd[i] = ler2.getType();
                    fmz2.iIY[i] = this.aMC.get((int)i).asi;
                    fmz2.iQG[i] = new ek(this.aMC.get((int)i).DR);
                }
                this.MessageDelegator.E(fmz2);
                this.ca(null);
            } else if (ha2.ja()) {
                for (nb nb2 : this.aMC) {
                    nb2.aCE = this.aCE;
                    nb2.aCF = mx.si();
                    kdt kdt2 = (kdt)this.MessageDelegator.i(290, this.getGUID(), lcr.qza);
                    kdt2.e(this.aMD);
                    kdt2.to(this.aCE);
                    kdt2.a(bqm.b.values()[nb2.aCH]);
                    kdt2.r(nb2.aCF);
                    kdt2.do(nb2.asi);
                    this.MessageDelegator.b(kdt2);
                }
                this.aMF.e(this.aMC);
                this.aMF.ao(true);
                this.aMF.start();
                this.aME = true;
            }
        } else {
            if (amf2 instanceof ayd) {
                lfn.b(5, "SFPersistenceWorkerCreateItems", "startWork: SFClan support not yet implemented");
                this.ca("SFClan support not yet implemented");
                assert (false);
                return;
            }
            this.ca("Unhandled class " + amf2.getClass().getName() + " for GUID " + this.aCE);
            assert (false);
            return;
        }
    }

    private void a(fna fna2) {
        if (!this.aME) {
            return;
        }
        if (fna2.iQK) {
            this.ca(null);
        } else {
            this.ca("Failed to create resources for " + this.aCE);
        }
    }

    @Override
    public void c(qe qe2) {
        super.c(qe2);
        this.ca(qe2.getErrorMessage());
    }
}

