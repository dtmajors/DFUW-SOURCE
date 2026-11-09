/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class cem
extends cea {
    @Override
    public cea aKA() {
        return new cem();
    }

    @Override
    public void a(eq eq2) {
        if (eq2.getType() != 1312) {
            return;
        }
        fgk fgk2 = (fgk)this.MessageDelegator.h(29451, this.GUID, lcr.acL);
        fgk2.a(new jd[]{jd.ajL});
        fgk2.a((je[])null);
        fgk2.a((jb[])null);
        fgk2.a((bbs[])null);
        fgk2.a(new ja[]{eq2.getBooleanValue() ? ja.aiX : ja.aiY});
        this.MessageDelegator.F(fgk2);
    }

    @Override
    public void b(ew ew2, int n) {
        if (ew2.getType() != 1296) {
            return;
        }
        int n2 = ew2.fQ();
        int n3 = n2 - n;
        if (n < 0 && n2 >= 0) {
            fgk fgk2 = (fgk)this.MessageDelegator.h(29451, this.GUID, lcr.acL);
            fgk2.a(new jd[]{jd.ajL});
            fgk2.a((je[])null);
            fgk2.a((jb[])null);
            fgk2.a((bbs[])null);
            fgk2.a(new ja[]{ja.aiV});
            this.MessageDelegator.F(fgk2);
            this.pr(n2);
            return;
        }
        if (n >= 0 && n2 < 0) {
            fgk fgk3 = (fgk)this.MessageDelegator.h(29451, this.GUID, lcr.acL);
            fgk3.a(new jd[]{jd.ajL});
            fgk3.a((je[])null);
            fgk3.a((jb[])null);
            fgk3.a((bbs[])null);
            fgk3.a(new ja[]{ja.aiW});
            this.MessageDelegator.F(fgk3);
            this.pr(n2);
            return;
        }
        if ((float)n3 < 0.0f) {
            fgk fgk4 = (fgk)this.MessageDelegator.h(29451, this.GUID, lcr.acL);
            fgk4.a(new jd[]{jd.ajL});
            fgk4.a((je[])null);
            fgk4.a((jb[])null);
            fgk4.a((bbs[])null);
            fgk4.a(new ja[]{ja.aiU});
            this.MessageDelegator.F(fgk4);
            return;
        }
        fgk fgk5 = (fgk)this.MessageDelegator.h(29451, this.GUID, lcr.acL);
        fgk5.a(new jd[]{jd.ajL});
        fgk5.a((je[])null);
        fgk5.a((jb[])null);
        fgk5.a((bbs[])null);
        fgk5.a(new ja[]{ja.aiT});
        this.MessageDelegator.F(fgk5);
    }

    private void pr(int n) {
    }
}

