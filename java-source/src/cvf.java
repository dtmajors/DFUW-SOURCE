/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Map;

public class cvf
extends btk
implements bto {
    private final csx fyA;
    private boolean fzl = false;
    private Map<ldv, cvb> fzm = lcn.emw();
    private Map<ldv, cvb> fzn = lcn.emw();

    public cvf(csx csx2) {
        this.fyA = csx2;
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.fzl) {
            return;
        }
        if (this.MessageDelegator.bzx().bzt().dVA() == kdw.a.phY && !this.fyA.bbk().isEmpty()) {
            this.bct();
            this.fzl = true;
        }
    }

    public boolean lP(ldv ldv2) {
        cvb cvb2 = this.fzn.get(ldv2);
        if (cvb2 == null) {
            return false;
        }
        return cvb2.bck();
    }

    private void bct() {
        cve cve2 = new cve();
        List<cvd> list = cve2.bcs();
        if (list.isEmpty()) {
            return;
        }
        for (cvd cvd2 : list) {
            for (int i = 0; i < cvd2.bco(); ++i) {
                cvb cvb2 = new cvb(this, cvd2);
                cvb2.setGUID(this.MessageDelegator.bzv());
                this.MessageDelegator.a(cvb2);
                this.fzm.put(cvb2.getGUID(), cvb2);
            }
        }
    }

    protected int bbl() {
        return this.fyA.bbl();
    }

    protected void a(ldv ldv2, cvb cvb2) {
        this.fzn.put(ldv2, cvb2);
    }

    protected void b(ldv ldv2, cvb cvb2) {
        assert (this.fzn.containsKey(ldv2));
        this.fzn.remove(ldv2);
    }
}

