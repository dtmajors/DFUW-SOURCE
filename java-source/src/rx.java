/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  gg
 *  lcr
 */
import java.util.List;

public class rx
extends qd {
    private sd aPd;
    private sd aPe;
    private sr aQu;

    public rx(md md2) {
        super(md2, me.axq);
    }

    @Override
    public void initialize() {
        super.initialize();
        this.aQu = this.f(new sr(this, oj.class, false));
        this.aPd = this.f(new sd((md)this, "SaveMentoringDataBegin"));
        this.aPe = this.f(new sd((md)this, "SaveMentoringDataEnd"));
    }

    @Override
    public void cleanUp() {
        this.e(this.aQu);
        this.e(this.aPd);
        this.e(this.aPe);
        this.aQu = null;
        this.aPd = null;
        this.aPe = null;
        super.cleanUp();
    }

    @Override
    protected void sO() {
        this.aPd.start();
    }

    @Override
    protected void sP() {
    }

    @Override
    public void c(qe qe2) {
        super.c(qe2);
        if (qe2.sS()) {
            this.ca(qe2.getErrorMessage());
        } else if (qe2 == this.aPd) {
            gg gg2 = (gg)this.MessageDelegator.bzx().bzt().d(lcr.hac);
            List list = gg2.hV();
            if (list == null) {
                this.c(this.aQu);
                return;
            }
            this.aQu.e(list);
            this.aQu.start();
        } else if (qe2 == this.aQu) {
            this.aPe.start();
        } else if (qe2 == this.aPe) {
            this.ca(null);
        }
    }
}

