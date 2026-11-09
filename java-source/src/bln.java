/*
 * Decompiled with CFR.
 */
public class bln
extends bke {
    public bln() {
        this.dsy = bkd.a.drO;
    }

    @Override
    public final void a(int n, fdo fdo2) {
        if (fdo2.bEz() != 9227) {
            lfn.b(5, "SFPerformReflectEffectFO", "doFunction() FunctionMessage is not SFFunctionEffectMessage.");
            lfn.b(5, "SFPerformReflectEffectFO", "doFunction() FromGUID=" + fdo2.aO() + " Message is: " + fdo2.getClass().getName());
            this.Vc();
            return;
        }
        this.a((fcw)fdo2);
        this.Vc();
    }

    private void a(fcw fcw2) {
        alr alr2 = new alr();
        alr2.setGUID(this.MessageDelegator.bzv());
        alr2.x(fcw2.gpI);
        alr2.ga(1);
        alr2.fC(1376);
        alr2.gc(0);
        alr2.cP(fcw2.aYF);
        alr2.gd(fcw2.bsG);
        alr2.ge(fcw2.aYC);
        alr2.fJ(10032);
        alr2.gf(fcw2.aYH);
        alr2.aX(this.GUID);
        alr2.bc(true);
        frg frg2 = (frg)this.MessageDelegator.h(5377, this.GUID, fcw2.akX);
        frg2.iUQ = true;
        frg2.iUR = new alt[]{alr2};
        this.MessageDelegator.F(frg2);
    }
}

