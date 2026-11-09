/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cex
 *  cug
 *  ep
 *  ha
 */
import java.util.Collection;
import java.util.Map;

public class blw
extends bke {
    private static final float duE = 10.0f;
    private static final float duF = 25.0f;
    private static final float duG = 40.0f;

    public blw() {
        this.dsy = bkd.a.drw;
    }

    @Override
    public final void a(int n, fdo fdo2) {
        if (fdo2 == null) {
            lfn.b(5, "SFConsumeDrinkFO", "doFunction() FunctionMessage is null.");
            this.Vc();
            return;
        }
        fct fct2 = (fct)fdo2;
        if (fct2.aYH <= 0) {
            lfn.b(5, "SFConsumeDrinkFO", "doFunction() SessionID is invalid.");
            if (fdo2.bOs()) {
                this.a(fdo2, false);
            }
            this.Vc();
            return;
        }
        cbx cbx2 = (cbx)this.MessageDelegator.d(fdo2.akX);
        if (cbx2 == null) {
            lfn.b(5, "SFConsumeDrinkFO", "doFunction() Could not find targetobject " + fdo2.akX);
            if (fdo2.bOs()) {
                this.a(fdo2, false);
            }
            this.Vc();
            return;
        }
        if (!cug.vQ((int)cbx2.az())) {
            lfn.b(5, "SFConsumeDrinkFO", "doFunction() Resource '" + cbx2.pa() + "' is not stackable.");
            if (fdo2.bOs()) {
                this.a(fdo2, false);
            }
            this.Vc();
            return;
        }
        boolean bl2 = ResourceTree.isDescendant(cbx2.az(), cug.fjS);
        if (bl2 && fct2.iJs == null) {
            lfn.b(5, "SFConsumeDrinkFO", "doFunction() BaseAttributes array is null.");
            if (fdo2.bOs()) {
                this.a(fdo2, false);
            }
            this.Vc();
            return;
        }
        Map map = cbx2.jm().getAttributeMap();
        if (cug.wH((int)cbx2.az())) {
            this.a(fdo2, fct2, map);
            return;
        }
        et et2 = (et)map.get(9856);
        fct2.iJr = et2 != null ? et2.fN() : 10.0f;
        block4: for (ej ej2 : map.values()) {
            als als2;
            if (ej2.getDataType() != 2 || ej2.getType() != 1506 && !ep.aE((int)ej2.getType()) || ej2.getType() == 1104 || ej2.getType() == 9856) continue;
            switch (ej2.getType()) {
                case 352: 
                case 384: 
                case 400: {
                    als2 = this.b((et)ej2, fct2);
                    this.a(fdo2.aZG, als2);
                    continue block4;
                }
                case 1506: {
                    als2 = this.c((et)ej2, fct2);
                    this.a(fdo2.aZG, als2);
                    continue block4;
                }
            }
            if (ep.aY((int)ej2.getType())) {
                als2 = this.d((et)ej2, fct2);
                this.a(fdo2.aZG, als2);
                continue;
            }
            if (!lea.enT().contains(ej2.getType())) {
                lfn.b(5, "SFConsumeDrinkFO", "doFunction() Attribute '" + ej2.getName() + "' is not an effect.");
                assert (false);
                continue;
            }
            if (bfk.kF(ej2.getType())) {
                this.H(fdo2.aZG, ej2.getType());
                continue;
            }
            als2 = this.a((et)ej2, fct2);
            this.a(fdo2.aZG, als2);
        }
        if (fdo2.bOs()) {
            this.a(fdo2, true);
        }
        this.Vc();
    }

    private void a(fdo fdo2, fct fct2, Map<Integer, ej> map) {
        cbx cbx2 = (cbx)this.MessageDelegator.d(fdo2.aZG);
        if (!(cbx2 instanceof cex)) {
            if (fdo2.bOs()) {
                this.a(fdo2, false);
            }
            this.Vc();
            return;
        }
        cex cex2 = (cex)cbx2;
        byx byx2 = cex2.aJD();
        if (byx2 == null) {
            if (fdo2.bOs()) {
                this.a(fdo2, false);
            }
            this.Vc();
            return;
        }
        byv byv2 = byx2.aEP();
        if (byv2 == null || byv2.vM() != 2) {
            if (fdo2.bOs()) {
                this.a(fdo2, false);
            }
            this.Vc();
            return;
        }
        Collection<ej> collection = map.values();
        assert (collection != null);
        et et2 = (et)map.get(9856);
        if (et2 == null) {
            if (fdo2.bOs()) {
                this.a(fdo2, false);
            }
            this.Vc();
            return;
        }
        eq eq2 = (eq)map.get(14160);
        if (eq2 == null) {
            if (fdo2.bOs()) {
                this.a(fdo2, false);
            }
            this.Vc();
            return;
        }
        boolean bl2 = cex2.bn((double)et2.fN());
        if (!bl2) {
            if (fdo2.bOs()) {
                this.a(fdo2, false);
            }
            this.Vc();
            return;
        }
        float f2 = cbr.oG(3);
        alr alr2 = this.a(eq2, fct2, f2);
        this.a(fdo2.aZG, alr2);
        if (fdo2.bOs()) {
            this.a(fdo2, true);
        }
        this.Vc();
    }

    private alr a(eq eq2, fct fct2, double d2) {
        alr alr2 = new alr();
        alr2.setGUID(this.MessageDelegator.bzv());
        alr2.x(d2);
        alr2.ga(1);
        alr2.fC(eq2.getType());
        alr2.gc(0);
        alr2.cP(fct2.aYF);
        alr2.gd(fct2.bsG);
        alr2.ge(fct2.aYC);
        alr2.fJ(eq2.getType());
        alr2.gf(fct2.aYH);
        alr2.aX(this.GUID);
        alr2.bc(true);
        return alr2;
    }

    private als a(et et2, fct fct2) {
        assert (et2 != null);
        assert (fct2 != null);
        als als2 = new als();
        als2.setGUID(this.MessageDelegator.bzv());
        als2.x(et2.fN());
        als2.ga(2);
        als2.gb(5);
        als2.cP(fct2.aYF);
        als2.gd(fct2.bsG);
        als2.ge(fct2.aYC);
        als2.fJ(et2.getType());
        als2.gf(fct2.aYH);
        als2.aX(this.GUID);
        als2.fC(et2.getType());
        int n = (int)als2.DV() * 1;
        float f2 = 25.0f / (float)n;
        als2.gc(n);
        als2.ar(f2);
        als2.aq(0.0f);
        als2.as(25.0f);
        return als2;
    }

    private als b(et et2, fct fct2) {
        assert (et2 != null);
        assert (fct2 != null);
        int n = this.d(et2);
        if (n <= 0) {
            lfn.b(5, "SFConsumeDrinkFO", "createTimedModifier() EffectType is invalid for attribute '" + et2.getName() + "'");
            return null;
        }
        ha ha2 = this.hI(fct2.aZG);
        float f2 = ha2 != null ? ayc.a((cbx)ha2.jf(), et2.getType() == 352, false, et2.fN()) : et2.fN();
        als als2 = new als();
        als2.setGUID(this.MessageDelegator.bzv());
        als2.x(fct2.iJr);
        als2.ga(2);
        als2.gb(5);
        als2.cP(fct2.aYF);
        als2.gd(fct2.bsG);
        als2.ge(fct2.aYC);
        als2.fJ(n);
        als2.gf(fct2.aYH);
        als2.aX(this.GUID);
        als2.fC(et2.getType());
        int n2 = (int)als2.DV() * 1;
        float f3 = f2 / (float)n2;
        als2.gc(n2);
        als2.ar(f3);
        als2.aq(0.0f);
        als2.as(f2);
        return als2;
    }

    private als c(et et2, fct fct2) {
        assert (et2 != null);
        assert (fct2 != null);
        als als2 = new als();
        als2.setGUID(this.MessageDelegator.bzv());
        als2.x(fct2.iJr);
        als2.ga(4);
        als2.gb(0);
        als2.cP(fct2.aYF);
        als2.gd(fct2.bsG);
        als2.ge(fct2.aYC);
        als2.fJ(bfk.dgP);
        als2.gf(fct2.aYH);
        als2.aX(this.GUID);
        als2.fC(et2.getType());
        als2.gc(0);
        als2.ar(0.0f);
        als2.aq(et2.fN());
        als2.as(et2.fN());
        return als2;
    }

    private als d(et et2, fct fct2) {
        assert (et2 != null);
        assert (fct2 != null);
        int n = this.d(et2);
        if (n <= 0) {
            lfn.b(5, "SFConsumeDrinkFO", "createTimedModifier() EffectType is invalid for attribute '" + et2.getName() + "'");
            return null;
        }
        als als2 = new als();
        als2.setGUID(this.MessageDelegator.bzv());
        als2.x(fct2.iJr);
        als2.ga(4);
        als2.gb(0);
        als2.cP(fct2.aYF);
        als2.gd(fct2.bsG);
        als2.ge(fct2.aYC);
        als2.fJ(n);
        als2.gf(fct2.aYH);
        als2.aX(this.GUID);
        als2.fC(et2.getType());
        als2.gc(0);
        als2.ar(0.0f);
        als2.aq(et2.fN());
        als2.as(et2.fN());
        return als2;
    }

    private int d(et et2) {
        String string = et2.getName() + " Bonus";
        int n = lea.enT().getType(string);
        if (n <= 0) {
            lfn.b(5, "SFConsumeDrinkFO", "getEffectType() Could not find effect '" + string + "'");
            assert (false);
        }
        return n;
    }

    private boolean a(int n, et[] etArray) {
        assert (n > 0);
        assert (etArray != null);
        int n2 = etArray.length;
        for (int i = 0; i < n2; ++i) {
            if (etArray[i].getType() != n) continue;
            return etArray[i].fN() >= 40.0f;
        }
        lfn.b(5, "SFConsumeDrinkFO", "isPlayerAttributeToLarge() Could not find attribute '" + ep.aM((int)n) + "'");
        return false;
    }

    private void H(ldv ldv2, int n) {
        frj frj2 = (frj)this.MessageDelegator.h(5378, this.GUID, ldv2);
        frj2.aYG = n;
        this.MessageDelegator.F(frj2);
    }
}

