/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.LinkedList;
import java.util.Map;

public class fu
extends btk
implements bto {
    private Map<String, ft> To = lcn.emw();
    private LinkedList<String> Tp = lcn.emA();
    private bgh Tq;

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 16645: {
                this.a((ern)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(ern ern2) {
        if (ern2.YL != null) {
            ern2.YL = ern2.YL.trim();
        }
        switch (ern2.ilu) {
            case 10: {
                this.b(ern2.aO(), ern2.YL, ern2.izF);
                break;
            }
            case 11: {
                this.a(ern2.aO(), ern2.YL, ern2.izF);
                break;
            }
            case 12: {
                this.a(ern2.aO(), ern2.YL);
                break;
            }
            default: {
                this.a(ern2.aO(), lzj.tWy.bD(ern2.ilu));
            }
        }
    }

    private void a(ldv ldv2, loz loz2) {
        fgs fgs2 = (fgs)this.MessageDelegator.h(29446, this.getGUID(), ldv2);
        fgs2.r(loz2);
        this.MessageDelegator.F(fgs2);
    }

    private bgh hj() {
        if (this.Tq == null) {
            amf amf2 = this.MessageDelegator.bzx().bzt().d(lcr.qCv);
            if (amf2 == null) {
                return null;
            }
            if (!(amf2 instanceof biv)) {
                return null;
            }
            biv biv2 = (biv)amf2;
            this.Tq = biv2.hj();
        }
        return this.Tq;
    }

    private void a(ldv ldv2, String string) {
        if (string == null) {
            for (ft ft2 : this.To.values()) {
                this.a(ldv2, lzv.tYA.bD(ft2.bc, ft2.hh()));
            }
        } else {
            ft ft3 = this.To.get(string);
            if (ft3 == null) {
                this.a(ldv2, lzv.tWX.bD(string));
                return;
            }
            this.a(ldv2, lzv.tYA.bD(string, ft3.hh()));
        }
    }

    private void a(ldv ldv2, String string, String string2) {
        ft ft2 = this.To.get(string = string.toLowerCase());
        if (ft2 == null) {
            this.a(ldv2, lzv.tWX.bD(string));
            return;
        }
        int n = 0;
        if (string2 == null) {
            n = 0;
        } else {
            int n2 = ft.aB(string2);
            if (n2 == 0) {
                this.a(ldv2, lzv.tYL.bD(string2));
                return;
            }
            n = ft2.hi() & ~n2;
        }
        ft2.bw(n);
        if (ft2.hi() == 0) {
            this.a(ft2);
            this.a(ldv2, lzv.tYJ.bD(string));
        } else {
            this.a(ldv2, lzv.tYK.bD(string, ft2.hh()));
        }
    }

    private void b(ldv ldv2, String string, String string2) {
        int n = ft.aB(string2);
        if (n == 0) {
            this.a(ldv2, lzv.tYL.bD(string2));
            return;
        }
        ft ft2 = this.To.get(string = string.toLowerCase());
        if (ft2 != null) {
            ft2.bw(ft2.hi() | n);
            this.a(ldv2, lzv.tYK.bD(string, ft2.hh()));
            return;
        }
        if (this.hj() == null) {
            this.a(ldv2, lzv.tYM.bD(new Object[0]));
            return;
        }
        ldv ldv3 = this.Tq.fv(string);
        if (ldv3 == null) {
            this.a(ldv2, lzq.rXl.bD(string));
            return;
        }
        int n2 = this.Tq.hk(ldv3);
        if (n2 == 0) {
            this.a(ldv2, lzq.rXl.bD(string));
            return;
        }
        ft2 = new ft(string, ldv3, n2);
        ft2.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(ft2);
        this.To.put(string, ft2);
        ft2.bw(ft2.hi() | n);
        this.Tp.add(ft2.bc);
        this.a(ldv2, lzv.tYK.bD(string, ft2.hh()));
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.Tp.isEmpty() || this.hj() == null) {
            return;
        }
        String string = this.Tp.removeFirst();
        ft ft2 = this.To.get(string);
        if (ft2 == null) {
            return;
        }
        ldv ldv2 = this.Tq.fv(string);
        if (ldv2 == null) {
            this.a(ft2);
            return;
        }
        int n = this.Tq.hk(ldv2);
        if (n == 0) {
            this.a(ft2);
            return;
        }
        this.Tp.add(string);
        ft2.g(ldz2);
    }

    private void a(ft ft2) {
        ldv ldv2 = ft2.getGUID();
        this.To.remove(ft2.bc);
        ft2 = null;
        this.MessageDelegator.hd(ldv2);
        this.MessageDelegator.oa(ldv2);
    }
}

