/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Queue;
import java.util.Set;

public class qj
extends qd {
    private px aMY = null;
    private Queue<ldv> aMZ = null;
    private Set<ldv> aNa = null;
    private String aNb = null;
    private Queue<sx> aNc = lcn.emA();

    public void a(px px2) {
        this.aMY = px2;
    }

    public qj(md md2) {
        super(md2, me.axJ);
    }

    @Override
    public void initialize() {
        super.initialize();
        int n = 0;
        while (this.aNc.size() <= 10) {
            this.aNc.add(this.f(new sx(this)));
            ++n;
        }
    }

    @Override
    public void cleanUp() {
        for (sx sx2 : this.aNc) {
            this.e(sx2);
        }
        this.aNc.clear();
        super.cleanUp();
    }

    @Override
    protected void sO() {
        if (this.aMY == null) {
            this.ca("Current Operation is null!!!");
            return;
        }
        switch (this.aMY) {
            case aJT: 
            case aJU: 
            case aJV: {
                break;
            }
            default: {
                this.ca("Invalid Clan Conquest Load Operation : " + (Object)((Object)this.aMY));
                return;
            }
        }
        ayr ayr2 = (ayr)this.MessageDelegator.bzx().bzt().d(lcr.qEd);
        if (ayr2 == null) {
            this.ca("Clan Manager is null!!!");
            return;
        }
        this.aMZ = lcn.emA();
        this.aMZ.addAll(ayr2.abA());
        if (this.aMZ.isEmpty()) {
            this.ca(null);
            return;
        }
        this.aNa = lcn.emx();
        while (!this.aMZ.isEmpty() && !this.aNc.isEmpty()) {
            this.ta();
        }
    }

    @Override
    protected void sP() {
        this.aMZ = null;
        this.aNa = null;
        this.aNb = null;
    }

    @Override
    public void c(qe qe2) {
        super.c(qe2);
        if (qe2.aMr != me.ayu) {
            assert (false) : "WTF!!!";
            return;
        }
        sx sx2 = (sx)qe2;
        this.aNa.remove(sx2.iG());
        this.aNc.add(sx2);
        if (qe2.sS() && this.aNb == null) {
            this.aNb = qe2.getErrorMessage();
        }
        this.ta();
        if (this.su() == 0) {
            this.ca(this.aNb);
        }
    }

    private void ta() {
        if (this.aNb != null) {
            return;
        }
        if (this.aMZ.isEmpty()) {
            return;
        }
        if (this.aNc.isEmpty()) {
            return;
        }
        ldv ldv2 = this.aMZ.poll();
        sx sx2 = this.aNc.poll();
        this.aNa.add(ldv2);
        sx2.ch(ldv2);
        sx2.a(this.aMY);
        sx2.start();
    }
}

