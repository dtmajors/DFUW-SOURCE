/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  ep
 */
import java.util.Map;

public class blx
extends bke {
    public blx() {
        this.dsy = bkd.a.drx;
    }

    @Override
    public final void a(int n, fdo fdo2) {
        if (fdo2 == null) {
            this.Vc();
            return;
        }
        fct fct2 = (fct)fdo2;
        boolean bl2 = true;
        if (fct2.aYH <= 0) {
            bl2 = false;
        } else if (fct2.iJr <= 0.0f) {
            bl2 = false;
        }
        if (!bl2) {
            if (fdo2.bOs()) {
                this.a(fdo2, false);
            }
            this.Vc();
            return;
        }
        cbx cbx2 = (cbx)this.MessageDelegator.d(fdo2.akX);
        if (cbx2 == null) {
            if (fdo2.bOs()) {
                this.a(fdo2, false);
            }
            this.Vc();
            return;
        }
        ldi ldi2 = (ldi)lea.enT().acv(bfk.dgH);
        if (ldi2 == null) {
            if (fdo2.bOs()) {
                this.a(fdo2, false);
            }
            this.Vc();
            return;
        }
        lce[] lceArray = ldi2.enl();
        int n2 = lceArray.length;
        for (int i = 0; i < n2; ++i) {
            Object object = this.a(lceArray[i].bnM, fct2, lceArray[i].qvU);
            this.a(fct2.aZG, (als)object, null);
        }
        Map map = cbx2.jm().getAttributeMap();
        for (Object object : map.values()) {
            if (((ej)object).getDataType() != 2 || !ep.aE((int)((ej)object).getType()) || ((ej)object).getType() == 1104 || ((ej)object).getType() == 9856) continue;
            switch (((ej)object).getType()) {
                case 160: 
                case 176: 
                case 208: 
                case 240: {
                    als als2 = this.e((et)object, fct2);
                    this.a(fdo2.aZG, als2);
                    break;
                }
                case 3488: {
                    int n3 = lea.enT().getType(((ej)object).getName());
                    if (n3 <= 0) {
                        lfn.b(5, "SFConsumeFoodFO", "doFunction() Could not find lighten effect");
                        assert (false);
                    }
                    als als3 = new als();
                    als3.setGUID(this.MessageDelegator.bzv());
                    als3.x(fct2.iJr);
                    als3.ga(2);
                    als3.gb(0);
                    als3.cP(fdo2.aYF);
                    als3.gd(fdo2.bsG);
                    als3.ge(fdo2.aYC);
                    als3.fJ(n3);
                    als3.gf(fct2.aYH);
                    als3.aX(this.GUID);
                    als3.fC(((ej)object).getType());
                    als3.gc(0);
                    als3.ar(0.0f);
                    als3.aq(((et)object).fN());
                    als3.as(((et)object).fN());
                    this.a(fdo2.aZG, als3);
                    break;
                }
            }
        }
        if (fdo2.bOs()) {
            this.a(fdo2, true);
        }
        this.Vc();
    }

    private als a(int n, fct fct2, float f2) {
        assert (n > 0);
        assert (fct2 != null);
        als als2 = new als();
        als2.setGUID(this.MessageDelegator.bzv());
        als2.x(fct2.iJr);
        als2.ga(4);
        als2.gb(0);
        als2.cP(fct2.aYF);
        als2.gd(fct2.bsG);
        als2.ge(fct2.aYC);
        als2.fJ(bfk.dgH);
        als2.gf(fct2.aYH);
        als2.aX(this.GUID);
        als2.fC(n);
        als2.gc(0);
        als2.ar(0.0f);
        als2.aq(f2);
        als2.as(f2);
        return als2;
    }

    private als e(et et2, fct fct2) {
        assert (et2 != null);
        assert (fct2 != null);
        int n = this.d(et2);
        if (n <= 0) {
            lfn.b(5, "SFConsumeFoodFO", "createTimedModifier() EffectType is invalid for attribute '" + et2.getName() + "'");
            return null;
        }
        als als2 = new als();
        als2.setGUID(this.MessageDelegator.bzv());
        als2.x(fct2.iJr);
        als2.ga(2);
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
            lfn.b(5, "SFConsumeFoodFO", "getEffectType() Could not find effect '" + string + "'");
            assert (false);
        }
        return n;
    }
}

