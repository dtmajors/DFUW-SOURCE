/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
import java.util.LinkedList;
import java.util.List;
import spenefett.util.jni.SFJNIUtils;

public class hfl
extends hmt {
    private final lbn kiR = new lbn(this){
        final /* synthetic */ hfl kjb;
        {
            this.kjb = hfl2;
        }

        public void W() {
            hfl.a(this.kjb);
        }
    };
    private lcq kiS = new lcq(lcq.BRIGHT_WHITE);
    private final int kiT = 0;
    private final int kiU = 0;
    private final hdm dXw;
    private final hcg jGq;
    private final List<hms> gqZ = lcn.emv();
    private final hcl kiV;
    private lgg kiW;
    private lgg kiX;
    private List<hpa> kiY = null;
    private String kiZ;
    private final boolean kja;

    public hfl(hdm hdm2, String string, lgg lgg2, lhf lhf2, hcl hcl2, boolean bl) {
        super((hnc)hdm2, string, lgg2, lhf2);
        this.dXw = hdm2;
        this.jGq = this.dXw.jZD.jGq;
        this.kiV = hcl2;
        this.kiV.jGz.a(true, this.kiR);
        this.kja = bl;
        this.chI();
    }

    private void chH() {
        this.chI();
    }

    private void chI() {
        if (this.kiV.aDm == null) {
            return;
        }
        int n = 0;
        int n2 = this.kiV.aDm.size();
        int n3 = 0;
        block5: for (n = 0; n < n2; ++n) {
            hcj hcj2 = this.kiV.aDm.get(n);
            hms hms2 = null;
            if (n3 < this.gqZ.size()) {
                hms2 = this.gqZ.get(n3);
            } else assert (n3 == this.gqZ.size());
            switch (hcj2.jFL) {
                case jFZ: 
                case jFW: 
                case jFX: 
                case jFY: {
                    ljp ljp2;
                    if (hcj2.dzN == null) continue block5;
                    if (hms2 != null && !(hms2 instanceof hpa)) {
                        hms2.remove();
                        this.gqZ.remove(n3);
                        hms2 = null;
                    }
                    if (hms2 == null) {
                        hms2 = new hpa((hnc)this.dXw, "icon " + n, hcj2.jFO.aI(), hcj2.jFO.cqv(), hcj2.dzN);
                        ljp2 = new ljp((float)hcj2.jFO.rmN / (float)hcj2.dzN.kLY.rmN, (float)hcj2.jFO.H / (float)hcj2.dzN.kLY.H);
                        ((hpa)hms2).n(ljp2);
                        this.gqZ.add(n3, hms2);
                        this.j(hms2);
                    } else {
                        ((hpa)hms2).a(hcj2.dzN);
                        ljp2 = new ljp((float)hcj2.jFO.rmN / (float)hcj2.dzN.kLY.rmN, (float)hcj2.jFO.H / (float)hcj2.dzN.kLY.H);
                        ((hpa)hms2).n(ljp2);
                        hms2.j(hcj2.jFO);
                    }
                    ((hoy)hms2).H(this.kiS);
                    ++n3;
                    continue block5;
                }
                case jFS: 
                case jFU: 
                case jFT: 
                case jFV: {
                    ljp ljp2;
                    if (hms2 != null && !(hms2 instanceof hpa)) {
                        hms2.remove();
                        this.gqZ.remove(n3);
                        hms2 = null;
                    }
                    if (hms2 == null) {
                        hms2 = new hpa((hnc)this.dXw, "icon " + n, hcj2.jFO.aI(), hcj2.jFO.cqv(), hcj2.dzN);
                        ljp2 = new ljp((float)hcj2.jFO.rmN / (float)hcj2.dzN.kLY.rmN, (float)hcj2.jFO.H / (float)hcj2.dzN.kLY.H);
                        ((hpa)hms2).n(ljp2);
                        this.gqZ.add(n3, hms2);
                        this.j(hms2);
                    } else {
                        hms2.j(hcj2.jFO);
                        ((hpa)hms2).a(hcj2.dzN);
                        ljp2 = new ljp((float)hcj2.jFO.rmN / (float)hcj2.dzN.kLY.rmN, (float)hcj2.jFO.H / (float)hcj2.dzN.kLY.H);
                        ((hpa)hms2).n(ljp2);
                    }
                    if (hcj2.jFL == hck.jFT || hcj2.jFL == hck.jFV) {
                        ((hpa)hms2).H(this.kiS.V(new lcq(1.0f, 0.5f, 0.5f)));
                    } else {
                        ((hoy)hms2).H(this.kiS);
                    }
                    ++n3;
                    continue block5;
                }
                case jFQ: 
                case jFR: {
                    if (hms2 != null && !(hms2 instanceof hfm)) {
                        hms2.remove();
                        this.gqZ.remove(n3);
                        hms2 = null;
                    }
                    if (hms2 == null) {
                        hms2 = new hfm(this.dXw, "text " + n, hcj2.jFO.aI(), hcj2.jFO.cqv(), (hpe.c)new hpe.e(hcj2.jFE, hcj2.dMT, hpe.a.kUO, hpe.b.kUS), hcj2.getText(), hcj2.jFL == hck.jFR);
                        this.gqZ.add(n3, hms2);
                        this.j(hms2);
                    } else {
                        hms2.j(hcj2.jFO);
                        ((hfm)hms2).mV(hcj2.getText());
                        ((hfm)hms2).a(new hpe.e(hcj2.jFE, hcj2.dMT, hpe.a.kUO, hpe.b.kUS));
                    }
                    ((hoy)hms2).H(this.kiS);
                    ++n3;
                }
            }
        }
        while (n3 < this.gqZ.size()) {
            this.gqZ.get(n3).remove();
            this.gqZ.remove(n3);
        }
    }

    public void G(lcq lcq2) {
        this.kiS = lcq2;
        int n = this.crn().size();
        for (int i = 0; i < n; ++i) {
            hms hms2 = this.crn().get(i);
            if (!(hms2 instanceof hoy)) continue;
            ((hoy)hms2).H(this.kiS);
        }
    }

    @Override
    protected void FG() {
        this.kiV.jGz.a(false, this.kiR);
        while (this.crn().size() > 0) {
            hms hms2 = this.crn().get(0);
            hms2.remove();
        }
        this.gqZ.clear();
        super.FG();
    }

    @Override
    protected void cbM() {
        super.cbM();
        if (this.kLu.csd() || !this.kja) {
            return;
        }
        this.kiW = this.cqu();
    }

    @Override
    protected void cbv() {
        super.cbv();
        if (!this.kja) {
            return;
        }
        this.kiW = null;
        this.kiX = null;
        this.chJ();
        this.cancelSelection();
    }

    private final void chJ() {
        SFJNIUtils.Instance.clipboardWrite(this.kiZ);
    }

    @Override
    protected void chK() {
        this.kiW = null;
        this.kiX = null;
        this.cancelSelection();
        super.chK();
    }

    @Override
    protected void cbu() {
        super.cbu();
        if (!this.kja) {
            return;
        }
        if (this.kiW == null) {
            return;
        }
        if (this.kiX != null && this.kiX.T(this.cqu())) {
            return;
        }
        this.kiX = this.cqu();
        lgg lgg2 = this.kiW;
        lgg lgg3 = this.cqu();
        hcj hcj2 = this.kiV.h(lgg2);
        hcj hcj3 = this.kiV.h(lgg3);
        if (hcj2 == null || hcj3 == null) {
            this.cancelSelection();
            return;
        }
        if (hcj2.als > hcj3.als) {
            hcj hcj4 = hcj2;
            hcj2 = hcj3;
            hcj3 = hcj4;
            lgg2 = lgg3;
            lgg3 = this.kiW;
        }
        this.a(hcj2, lgg2, hcj3, lgg3);
    }

    @Override
    protected void cce() {
        super.cce();
        if (this.kja) {
            this.kiW = null;
            this.cancelSelection();
        }
    }

    @Override
    protected void cfS() {
        super.cfS();
        if (this.kja) {
            this.kiW = null;
            this.cancelSelection();
        }
    }

    private final void cancelSelection() {
        if (this.kiY != null) {
            for (hpa hpa2 : this.kiY) {
                hpa2.remove();
            }
            this.kiY.clear();
        }
        this.kiZ = null;
    }

    private final void a(hcj hcj2, lgg lgg2, hcj hcj3, lgg lgg3) {
        this.cancelSelection();
        lgs lgs2 = this.a(hcj2, lgg2);
        lgs lgs3 = this.a(hcj3, lgg3);
        int n = this.kiV.a(hcj2);
        int n2 = this.kiV.a(hcj3);
        assert (n <= n2);
        if (n == n2) {
            int n3 = Math.min(lgs2.cg, lgs3.cg);
            int n4 = Math.max(lgs2.cjG(), lgs3.cjG());
            int n5 = Math.min(lgs2.cf, lgs3.cf);
            int n6 = Math.max(lgs2.erB(), lgs3.erB());
            lgs lgs4 = new lgs(n5, n3, n6 - n5, n4 - n3);
            this.d(lgs4);
            this.kiZ = this.a(hcj2, lgs4.cf - hcj2.jFP.cf, lgs4.erB() - -hcj2.jFP.cf);
            return;
        }
        lgs lgs5 = new lgs(lgs2);
        lgs5.rmN = this.kiV.aDm.get((int)n).jFP.erB() - lgs5.cf;
        this.kiZ = this.a(this.kiV.aDm.get(n), lgs5.cf, lgs5.erB());
        for (int i = n + 1; i <= n2; ++i) {
            lgs lgs6;
            int n7;
            int n8;
            if (i == n2) {
                n8 = Math.min(lgs3.cf, this.kiV.aDm.get((int)i).jFP.cf);
                n7 = lgs3.erB();
                lgs6 = new lgs(n8, lgs3.cg, n7 - n8, lgs3.H);
            } else {
                lgs6 = this.kiV.aDm.get((int)i).jFP;
            }
            this.kiZ = this.kiZ + this.a(this.kiV.aDm.get(i), lgs6.cf, lgs6.erB());
            if (lgs6.cg >= lgs5.cjG()) {
                this.d(lgs5);
                lgs5 = new lgs(lgs6);
                continue;
            }
            n8 = lgs6.erB();
            n7 = Math.min(lgs5.cg, lgs6.cg);
            int n9 = Math.max(lgs5.cjG(), lgs6.cjG());
            lgs5.rmN = n8 - lgs5.cf;
            lgs5.H = n9 - n7;
            lgs5.cg = n7;
        }
        this.d(lgs5);
    }

    private final String a(hcj hcj2, int n, int n2) {
        int n3;
        lhf lhf2;
        int n4;
        lhf lhf3;
        switch (hcj2.jFL) {
            case jFS: 
            case jFU: 
            case jFT: 
            case jFV: {
                return hcj2.cbZ();
            }
            case jFZ: 
            case jFW: 
            case jFX: 
            case jFY: {
                return "";
            }
        }
        String string = hcj2.getText();
        int n5 = 0;
        for (n4 = hcj2.jFP.cf; n4 < n && n5 < string.length(); n4 += lhf3.rmN, ++n5) {
            lhf3 = this.jGq.b(hcj2.jFE, string.charAt(n5));
        }
        for (n3 = n5; n4 < n2 && n3 < string.length(); n4 += lhf2.rmN, ++n3) {
            lhf2 = this.jGq.b(hcj2.jFE, string.charAt(n3));
        }
        return string.substring(n5, n3);
    }

    private final void d(lgs lgs2) {
        hpa hpa2 = new hpa(this.kLu, null, lgs2.aI(), lgs2.cqv(), this.dXw.kJP.kiM);
        this.j(hpa2);
        hpa2.cqG();
        if (this.kiY == null) {
            this.kiY = lcn.emv();
        }
        this.kiY.add(hpa2);
    }

    private final lgs a(hcj hcj2, lgg lgg2) {
        switch (hcj2.jFL) {
            case jFZ: 
            case jFW: 
            case jFX: 
            case jFY: 
            case jFS: 
            case jFU: 
            case jFT: 
            case jFV: {
                return new lgs(hcj2.jFO);
            }
            case jFQ: 
            case jFR: {
                break;
            }
            default: {
                assert (false);
                return null;
            }
        }
        String string = hcj2.getText();
        int n = hcj2.jFP.cf;
        for (int i = 0; i < string.length(); ++i) {
            lhf lhf2 = this.jGq.b(hcj2.jFE, string.charAt(i));
            if (n + lhf2.rmN > lgg2.cf) {
                return new lgs(n, hcj2.jFP.cg, lhf2.rmN, hcj2.jFP.H);
            }
            n += lhf2.rmN;
        }
        return new lgs(hcj2.jFP);
    }

    @Override
    protected void ccc() {
        super.ccc();
        lgg lgg2 = this.cqu();
        hcj hcj2 = this.kiV.h(lgg2);
        if (hcj2 == null) {
            return;
        }
        if (hcj2.jFL == hck.jFS || hcj2.jFL == hck.jFT) {
            LinkedList<hnt> linkedList = new LinkedList<hnt>();
            hnt hnt2 = null;
            if (hcj2.jFL == hck.jFT) {
                hnt2 = new hnt(this.dXw.kKo, "Second-hand information:");
            }
            if (hcj2.dFm != null) {
                for (String string : hcj2.dFm) {
                    hnt hnt3 = hnt.a(string, this.dXw);
                    if (hnt3 == null) continue;
                    linkedList.add(hnt3);
                }
            } else {
                this.dXw.a(null, hcj2.jFN, linkedList);
            }
            this.dXw.a(hcj2.dzN, linkedList, hnt2);
        } else if (hcj2.jFL == hck.jFU || hcj2.jFL == hck.jFV) {
            LinkedList<hnt> linkedList = new LinkedList<hnt>();
            hnt hnt4 = null;
            if (hcj2.jFL == hck.jFV) {
                hnt4 = new hnt(this.dXw.kKo, "Second-hand information:");
            }
            if (hcj2.dFm != null) {
                for (String string : hcj2.dFm) {
                    hnt hnt5 = hnt.a(string, this.dXw);
                    if (hnt5 == null) continue;
                    linkedList.add(hnt5);
                }
            } else {
                this.dXw.a(null, hcj2.jFN, linkedList);
            }
            this.dXw.a(hcj2.dzN, linkedList, hnt4);
        }
    }

    static /* synthetic */ void a(hfl hfl2) {
        hfl2.chH();
    }
}

