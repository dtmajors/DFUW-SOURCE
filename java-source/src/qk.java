/*
 * Decompiled with CFR.
 */
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class qk
extends qd
implements bto {
    private sh aNd;
    private List<ldv> aNe;
    private Set<ldv> aNf;
    private String aMH;
    private LinkedList<qp> aNg = lcn.emA();

    public qk(md md2) {
        super(md2, me.axH);
    }

    @Override
    public void doTick(ldz ldz2) {
        if (!this.sR()) {
            return;
        }
        if (this.aNe != null && !this.aNe.isEmpty()) {
            this.tb();
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
        for (qp qp2 : this.aNg) {
            this.e(qp2);
        }
        this.aNg.clear();
        super.cleanUp();
    }

    @Override
    protected void sO() {
        this.aNf = lcn.emx();
        this.aNd.l("clan", "ClanGUID");
        this.aNd.cV(this.getGUID().ib());
        this.aNd.start();
    }

    @Override
    protected void sP() {
        this.aNe = null;
        this.aNf = null;
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
            this.aNe = this.aNd.tR();
            this.tb();
        } else if (qe2.aMr == me.axK) {
            qp qp2 = (qp)qe2;
            this.aNg.add(qp2);
            this.aNf.remove(qp2.iG());
            this.tb();
        }
        if (this.su() == 0) {
            this.ca(this.aMH);
        }
    }

    private void tb() {
        if (this.aNe.isEmpty()) {
            return;
        }
        if (this.aMH != null) {
            return;
        }
        if (this.aNf.size() < 10) {
            qp qp2 = this.aNg.pollFirst();
            if (qp2 == null) {
                qp2 = this.f(new qp(this));
            }
            ldv ldv2 = this.aNe.get(0);
            this.aNe.remove(0);
            this.aNf.add(ldv2);
            qp2.ch(ldv2);
            qp2.start();
        }
    }
}

