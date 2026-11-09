/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.LinkedList;

public class ql
extends qd {
    private so aNh;
    private String aMH;

    public ql(md md2) {
        super(md2, me.axT);
    }

    @Override
    public void initialize() {
        super.initialize();
        this.aNh = this.f(new so((md)this, pc.class));
    }

    @Override
    public void cleanUp() {
        this.e(this.aNh);
        this.aNh = null;
        super.cleanUp();
    }

    @Override
    protected void sO() {
        this.aNh.start();
    }

    @Override
    protected void sP() {
        this.aMH = null;
    }

    @Override
    public void c(qe qe2) {
        super.c(qe2);
        if (qe2.sS()) {
            if (this.aMH == null) {
                this.aMH = qe2.getErrorMessage();
            }
        } else {
            LinkedList<pc> linkedList = lcn.emA();
            this.aNh.d(linkedList);
            bmv bmv2 = (bmv)this.MessageDelegator.bzx().bzt().d(lcr.qBu);
            bmv2.ai(linkedList);
        }
        this.ca(this.aMH);
    }
}

