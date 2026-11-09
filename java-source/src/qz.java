/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  atv
 *  dly
 *  lcr
 */
import java.util.LinkedList;
import java.util.Set;

public class qz
extends qd
implements bto {
    private LinkedList<ldv> aOH;
    private Set<ldv> aOI;
    private LinkedList<rf> aOJ = lcn.emA();
    private String aMH;

    public qz(md md2) {
        super(md2, me.axR);
    }

    @Override
    public void initialize() {
        super.initialize();
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
    }

    @Override
    protected void sO() {
        this.aOH = lcn.emA();
        this.aOI = lcn.emx();
        bxd bxd2 = (bxd)this.MessageDelegator.bzx().bzt().d(lcr.qBn);
        this.aOH.addAll(bxd2.aDb());
        dly dly2 = (dly)this.MessageDelegator.bzx().bzt().d(lcr.qBi);
        this.aOH.addAll(dly2.bpU());
        atv atv2 = (atv)this.MessageDelegator.bzx().bzt().d(lcr.qBe);
        this.aOH.addAll(atv2.VE());
        cww cww2 = (cww)this.MessageDelegator.bzx().bzt().d(lcr.qBl);
        this.aOH.addAll(cww2.bee());
        atb atb2 = (atb)this.MessageDelegator.bzx().bzt().d(lcr.qBj);
        this.aOH.addAll(atb2.Vb());
    }

    @Override
    protected void sP() {
        this.aOH = null;
        this.aOI = null;
        this.aMH = null;
    }

    private void tB() {
        if (this.aOH.isEmpty()) {
            if (this.aOI.isEmpty() && this.sR()) {
                this.ca(this.aMH);
            }
            return;
        }
        if (this.aOI.size() >= 10) {
            return;
        }
        ldv ldv2 = this.aOH.pollFirst();
        rf rf2 = this.aOJ.pollFirst();
        if (rf2 == null) {
            rf2 = this.f(new rf(this));
        }
        rf2.ck(ldv2);
        rf2.start();
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.sR()) {
            this.tB();
        }
    }

    @Override
    public void c(qe qe2) {
        super.c(qe2);
        if (qe2.aMr == me.axZ) {
            if (qe2.sS() && this.aMH == null) {
                this.aMH = qe2.getErrorMessage();
            }
        } else {
            lfn.b(5, "SFPersistenceWorkerSaveAllSpawnablesOnServer", "notifyChildCompleted: Unhandled worker " + qe2);
            assert (false);
            this.aMH = "Unhandled Worker " + qe2;
        }
    }
}

