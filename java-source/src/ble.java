/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cug
 *  cxd
 *  ep
 */
public class ble
extends bke {
    private static les DX = lea.enT();

    public ble() {
        this.dsy = bkd.a.dro;
    }

    @Override
    public void a(int n, fdo fdo2) {
        assert (fdo2 != null);
        if (fdo2.bEz() != 9227) {
            lfn.b(5, "SFApplyBooleanModifierFO", "doFunction() FunctionMessage is not SFFunctionEffectMessage.");
            lfn.b(5, "SFApplyBooleanModifierFO", "doFunction() FromGUID=" + fdo2.aO() + " Message is: " + fdo2.getClass().getName());
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
        Object object;
        lce[] lceArray;
        assert (cbx2 != null);
        ldi ldi2 = (ldi)DX.acv(fcw2.aYG);
        if (ldi2 == null) {
            lfn.b(5, "SFApplyBooleanModifierFO", "performEffect() Invalid effecttype provided: " + fcw2.aYG);
            return;
        }
        boolean bl2 = cug.vM((int)fcw2.bsG);
        boolean bl3 = cug.vM((int)cbx2.az());
        boolean bl4 = fcw2.aYF.equals(cbx2.getGUID());
        if (bl2 && bl3 && !bl4 && (fcw2.dup || cbx2.aIq())) {
            boolean bl5 = DX.isDescendant(ldi2.getType(), bfk.dgl);
            boolean bl6 = cbx2.km(fcw2.aYF);
            boolean bl7 = cbx2.aIr();
            if (bl5 && !bl6) {
                if (fcw2.dup) {
                    this.e(fcw2.aYF, mcl.uvU.bD(new Object[0]));
                    this.e(cbx2.getGUID(), mcl.uvV.bD(new Object[0]));
                } else {
                    this.e(fcw2.aYF, mcl.uvS.bD(new Object[0]));
                    this.e(fcw2.aYF, mcl.uvV.bD(new Object[0]));
                }
                return;
            }
            if (!bl5 && !bl6 && bl7) {
                this.e(fcw2.aYF, mbs.ump.bD(new Object[0]));
                return;
            }
        }
        if ((lceArray = ldi2.enl()) == null) {
            lfn.b(5, "SFApplyBooleanModifierFO", "performEffect() Effect '" + ldi2.getName() + "' has no attribute alterations.");
            return;
        }
        assert (lceArray.length == 1) : lceArray.length;
        eo eo2 = ep.bc((int)lceArray[0].bnM);
        assert (eo2.kM == 0) : eo2;
        if (eo2.Type == 10448 && cbx2.UB()) {
            cev cev2 = (cev)cbx2;
            object = cev2.aJz();
            if (cxd.xz((int)fcw2.aYC) && object != null && !object.yI(cxd.fJy)) {
                return;
            }
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
        switch (alr2.BV()) {
            case 1376: {
                alr2.bc(true);
                break;
            }
            case 10448: {
                alr2.bc(false);
                break;
            }
            default: {
                lfn.b(5, "SFApplyBooleanModifierFO", "performEffect() Unknown attributetype provided: '" + eo2.Name + "'");
                alr2.bc(true);
            }
        }
        object = (frg)this.MessageDelegator.h(5377, this.GUID, fcw2.akX);
        object.iUQ = true;
        object.iUR = new alt[]{alr2};
        this.MessageDelegator.F((dxq)object);
    }
}

