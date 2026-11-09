/*
 * Decompiled with CFR.
 */
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class qm
extends qd
implements bto {
    private sh aNd;
    private List<ldv> aNi;
    private Set<ldv> aNj;
    private String aMH;
    private LinkedList<qs> aNk = lcn.emA();

    public qm(md md2) {
        super(md2, me.axI);
    }

    @Override
    public void doTick(ldz ldz2) {
        if (!this.sR()) {
            return;
        }
        if (this.aNi != null && !this.aNi.isEmpty()) {
            this.tc();
        }
    }

    @Override
    public void initialize() {
        super.initialize();
        this.aNd = this.f(new sh(this));
    }

    @Override
    public void cleanUp() {
        this.e(this.aNd);
        this.aNd = null;
        for (qs qs2 : this.aNk) {
            this.e(qs2);
        }
        this.aNk.clear();
        super.cleanUp();
    }

    @Override
    protected void sO() {
        this.aNj = lcn.emx();
        this.aNd.l("spawnable", "SpawnableGUID");
        this.aNd.cV(this.getGUID().ib());
        this.aNd.start();
    }

    @Override
    protected void sP() {
        this.aNi = null;
        this.aNj = null;
        this.aMH = null;
    }

    @Override
    public void c(qe qe2) {
        super.c(qe2);
        if (qe2.sS()) {
            if (this.aMH == null) {
                this.aMH = qe2.getErrorMessage();
            }
        } else if (qe2 == this.aNd) {
            this.aNi = this.aNd.tR();
            this.tc();
        } else if (qe2.aMr == me.axP) {
            qs qs2 = (qs)qe2;
            this.aNk.add(qs2);
            this.aNj.remove(qs2.tg());
            this.tc();
        } else {
            lfn.b(5, "SFPersistenceWorkerLoadAllSpawnablesOnServer", "notifyChildCompleted: Unhandled worker " + qe2);
        }
        if (this.su() == 0) {
            this.ca(this.aMH);
        }
    }

    private void tc() {
        if (this.aNi.isEmpty()) {
            return;
        }
        if (this.aMH != null) {
            return;
        }
        if (this.aNj.size() < 10) {
            qs qs2 = this.aNk.pollFirst();
            if (qs2 == null) {
                qs2 = this.f(new qs(this));
            }
            ldv ldv2 = this.aNi.get(0);
            this.aNi.remove(0);
            this.aNj.add(ldv2);
            qs2.ck(ldv2);
            qs2.start();
        }
    }
}

