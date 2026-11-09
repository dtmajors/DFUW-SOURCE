/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Iterator;
import java.util.List;

public class cpz
extends cpy {
    private ldv eUt = null;
    private boolean eni = false;
    private int dj = 0;
    private ldv eUu = null;
    private List<cpx> emR = null;

    public cpz() {
        super(false);
    }

    public void lH(ldv ldv2) {
        this.eUt = ldv2;
    }

    public void fI(boolean bl) {
        this.eni = bl;
    }

    public void fb(int n) {
        assert (this.eUu == null);
        this.dj = n;
        this.eUu = lcr.al((ldv)this.GUID, (int)this.dj);
    }

    @Override
    protected void a(dya dya2) {
        assert (this.eni);
        if (this.bno != 1) {
            return;
        }
        if (dya2.iiz) {
            this.nG(dya2.aWe);
        } else {
            this.aDk();
        }
        dya2.f(this.GUID);
        dya2.on(this.eUu);
        this.MessageDelegator.F(dya2);
    }

    @Override
    protected void b(dyk dyk2) {
        if (this.eni && dyk2.bEz() != 13334) {
            dyk2.f(this.GUID);
            dyk2.on(this.eUt);
            this.MessageDelegator.F(dyk2);
        } else {
            dyk2.f(this.GUID);
            dyk2.on(this.eUu);
            this.MessageDelegator.F(dyk2);
        }
    }

    protected void a(uk uk2) {
        switch (uk2.Uo) {
            case 3: {
                this.sC(((uh)uk2).PC);
                if (this.eUt != null) {
                    this.lI(this.eUt);
                }
                if (this.eni) break;
                this.aYn();
                break;
            }
            default: {
                super.a(uk2);
            }
        }
    }

    private final void lI(ldv ldv2) {
        byv byv2 = new byv();
        byv2.dz(this.bno);
        eej eej2 = (eej)this.MessageDelegator.h(12805, this.GUID, ldv2);
        eej2.edV = byv2;
        this.MessageDelegator.F(eej2);
    }

    public void f(lgj lgj2) {
        fsj fsj2 = (fsj)this.MessageDelegator.h(20483, this.GUID, this.eUu);
        fsj2.dTY = lgj2;
        this.MessageDelegator.E(fsj2);
        ej ej2 = this.fi().ae(1488);
        if (ej2 != null) {
            this.fi().a(2, ej2);
        }
    }

    private void b(eyn eyn2) {
        if (this.emR == null) {
            this.emR = lcn.abH(1);
        }
        cpx cpx2 = new cpx(this, eyn2.aO());
        this.emR.add(cpx2);
    }

    private void b(eyo eyo2) {
        if (this.emR == null) {
            lfn.b(5, "SFWildlifeObjectClient", "handleLifeModeListenerUnregisterMessage() No lifemode listener is registered.");
            lfn.b(5, "SFWildlifeObjectClient", "handleLifeModeListenerUnregisterMessage() NotifyObjectGUID=" + eyo2.aO());
            return;
        }
        Iterator<cpx> iterator = this.emR.iterator();
        while (iterator.hasNext()) {
            cpx cpx2 = iterator.next();
            if (!cpx2.Xe.equals(eyo2.aO())) continue;
            iterator.remove();
        }
        if (this.emR.isEmpty()) {
            this.emR = null;
        }
    }

    private void aYn() {
        if (this.emR == null) {
            return;
        }
        int n = this.emR.size();
        for (int i = 0; i < n; ++i) {
            this.emR.get(i).oU(this.bno);
        }
    }
}

