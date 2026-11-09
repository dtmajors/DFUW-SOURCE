/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cex
 *  cug
 *  cxd
 *  cyt
 *  ep
 */
public class blg
extends bke {
    private static les DX = lea.enT();

    public blg() {
        this.dsy = bkd.a.dso;
    }

    @Override
    public void a(int n, fdo fdo2) {
        assert (fdo2 != null);
        if (fdo2.bEz() != 9227) {
            lfn.b(5, "SFPerformBooleanModifier", "doFunction() FunctionMessage is not SFFunctionEffectMessage.");
            lfn.b(5, "SFPerformBooleanModifier", "doFunction() FromGUID=" + fdo2.aO() + " Message is: " + fdo2.getClass().getName());
            this.Vc();
            return;
        }
        cbx cbx2 = (cbx)this.d(fdo2.akX);
        if (cbx2 == null) {
            lfn.b(5, "SFApplyBooleanModifierFO", "performEffect() TargetObject " + fdo2.akX + " was not found.");
            this.Vc();
            return;
        }
        this.a(cbx2, (fcw)fdo2);
        this.Vc();
    }

    private void a(cbx cbx2, fcw fcw2) {
        cex cex2;
        cyt cyt2;
        assert (cbx2 != null);
        ldi ldi2 = (ldi)lea.enT().acv(fcw2.aYG);
        if (ldi2 == null) {
            lfn.b(5, "SFApplyBooleanModifierFO", "performEffect() Invalid effecttype provided: " + fcw2.aYG);
            return;
        }
        lce[] lceArray = ldi2.enl();
        if (lceArray == null) {
            lfn.b(5, "SFApplyBooleanModifierFO", "performEffect() Effect '" + ldi2.getName() + "' has no attribute alterations.");
            return;
        }
        assert (lceArray.length == 1) : lceArray.length;
        eo eo2 = ep.bc((int)lceArray[0].bnM);
        assert (eo2.kM == 0) : eo2;
        if (eo2.Type == 10448 && cbx2.UB() && (cyt2 = (cex2 = (cex)cbx2).aJz()) != null && !cyt2.yI(cxd.fJy)) {
            return;
        }
        boolean bl2 = DX.isDescendant(fcw2.aYG, bfk.dgl);
        boolean bl3 = fcw2.aYF.equals(cbx2.getGUID());
        boolean bl4 = cbx2.km(fcw2.aYF);
        boolean bl5 = fcw2.dup || cbx2.aIq();
        boolean bl6 = cbx2.aIr();
        if (!bl4 && bl5 && bl2 && !bl3 && !cbx2.Ux() && !cbx2.Uz() && !lea.enW().isDescendant(cbx2.az(), cug.fqy) && cbx2.UB()) {
            cex cex3 = (cex)cbx2;
            cex3.c(mcl.uvY.bD(DX.getName(fcw2.aYG)));
            return;
        }
        if (bl6 && !bl4 && !bl2 && (fcw2.dup || cbx2.aIq()) && !bl3) {
            this.e(fcw2.aYF, mbs.ump.bD(new Object[0]));
            return;
        }
        alr alr2 = new alr();
        alr2.setGUID(this.MessageDelegator.bzv());
        alr2.x(fcw2.gpI);
        alr2.ga(1);
        alr2.fC(eo2.Type);
        alr2.gc(0);
        alr2.cP(fcw2.aYF);
        alr2.gd(fcw2.bsG);
        alr2.ge(fcw2.aYC);
        alr2.fJ(fcw2.aYG);
        alr2.gf(fcw2.aYH);
        alr2.aX(this.GUID);
        alr2.bc(true);
        frg frg2 = (frg)this.MessageDelegator.h(5377, this.GUID, fcw2.akX);
        frg2.iUQ = true;
        frg2.iUR = new alt[]{alr2};
        this.MessageDelegator.F(frg2);
    }
}

