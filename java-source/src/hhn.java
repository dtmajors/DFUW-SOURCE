/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  ep
 *  hdm
 *  lcy
 */
import java.util.ArrayList;

public class hhn
extends hmt
implements hmb {
    private final boolean knl;
    private final dph dAJ;
    private final hpa kgb;
    private final hdm dXw;
    private final a ksz;
    private final hpg ksA;
    private final hdw ksB;

    public hhn(hdm hdm2, String string, lgg lgg2, lhf lhf2, dph dph2, a a2, boolean bl) {
        super((hnc)hdm2, string, lgg2, lhf2);
        this.dXw = hdm2;
        this.dAJ = dph2;
        this.ksB = hdw.LW(this.dAJ.az());
        this.ksz = a2;
        this.knl = bl;
        this.kgb = new hpa((hnc)hdm2, "Sprite", lgg.rlI, lhf.rnv, this.ksB.atw());
        this.j(this.kgb);
        if (this.ksB.auW()) {
            this.ksA = new hpg((hnc)hdm2, "Quantity", lgg.rlI, lhf.rnv, this.dXw.kIJ, "" + dph2.vf());
            this.j(this.ksA);
        } else {
            this.ksA = null;
        }
        this.clt();
    }

    @Override
    public void cce() {
        super.cce();
        this.clt();
    }

    @Override
    public void ccc() {
        Object object;
        Object object2;
        hnt.a a2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        et et2;
        super.ccc();
        ArrayList<hnt> arrayList = lcn.emv();
        this.dXw.a(null, (hdv)this.ksB, arrayList);
        if (this.dAJ.vf() != 1) {
            arrayList.add(new hnt(this.dXw.jGU, lcy.qZV.a(lcy.qRI, new ljf(this.dAJ.vf())).esy()));
        }
        if ((et2 = this.ah(1104)) != null) {
            arrayList.add(new hnt(this.dXw.jGU, lcy.qZV.a(lcy.qRK, new ljn(et2.fN())).esy()));
        }
        ej ej2 = this.ah(1232);
        Object object7 = this.ah(1234);
        if (ej2 != null && object7 != null) {
            object6 = lcy.qRR.a(new ljm(((et)ej2).fN()), new ljm(((et)object7).fN()));
            arrayList.add(new hnt(this.dXw.jGU, lcy.qZV.a(new lip[]{lcy.qRQ, object6}).esy()));
        }
        if ((ej2 = this.aq(11024)) != null) {
            object7 = new ljg(((ff)ej2).getStringValue());
            arrayList.add(new hnt(this.dXw.jGU, lcy.qZV.a(new lip[]{lcy.qSp, object7}).esy()));
        }
        if ((object7 = this.ah(9360)) != null) {
            float f2 = ((et)object7).fN();
            if (f2 > 0.0f) {
                f2 /= 100.0f;
            }
            object5 = new lje(f2);
            arrayList.add(new hnt(this.dXw.jGU, lcy.qZV.a(new lip[]{lcy.qSq, object5}).esy()));
        }
        if ((object6 = this.ah(1088)) != null) {
            arrayList.add(new hnt(this.dXw.jGU, lcy.qZV.a(lcy.qRS, new ljm(((et)object6).fN())).esy()));
        }
        if ((object6 = this.ah(640)) != null) {
            arrayList.add(new hnt(this.dXw.jGU, lcy.qZV.a(lcy.qRT, new ljm(((et)object6).fN())).esy()));
        }
        if ((object6 = this.ah(624)) != null) {
            float f3 = ((et)object6).fN();
            if (f3 > 0.0f) {
                f3 = 1.0f / f3;
            }
            arrayList.add(new hnt(this.dXw.jGU, lcy.qZV.a(lcy.qRW, new ljm(f3)).esy()));
        }
        if ((object5 = this.ah(688)) != null) {
            float f4 = ((et)object5).fN();
            arrayList.add(new hnt(this.dXw.jGU, lcy.qZV.a(lcy.qSr, new lje(f4)).esy()));
        }
        if ((object4 = this.aq(1360)) != null) {
            object3 = new ljg(((ff)object4).getStringValue());
            arrayList.add(new hnt(this.dXw.jGU, lcy.qZV.a(new lip[]{lcy.qRJ, object3}).esy()));
        }
        if ((object4 = lea.eos().get(this.dAJ.pa())) != null) {
            if (lea.enW().isDescendant(this.dAJ.az(), cug.fiL)) {
                arrayList.add(new hnt(this.dXw.jGU, lcy.qZV.a(lcy.qRU, new lja((int)((cur)object4).fyc)).esy()));
            }
            if (((cur)object4).fyd != -1 && (object3 = ep.aM((int)((cur)object4).fyd)) != null) {
                arrayList.add(new hnt(this.dXw.kKo, new ljg(" ").esy()));
                arrayList.add(new hnt(this.dXw.kKp, lcy.qRV.esy()));
                arrayList.add(new hnt(this.dXw.kKp, new ljg("-------------").esy()));
                float f5 = ((cur)object4).fye;
                a2 = this.dXw.jGU;
                object2 = lcy.raa.a(new ljg((String)object3), new lja((int)f5));
                arrayList.add(new hnt(a2, ((lip)object2).esy()));
                if (((cur)object4).fyf != -1 && (object = ep.aM((int)((cur)object4).fyf)) != null) {
                    float f6 = ((cur)object4).fyg;
                    arrayList.add(new hnt(a2, lcy.qZZ.esy()));
                    lip lip2 = lcy.raa.a(new ljg((String)object), new lja((int)f6));
                    arrayList.add(new hnt(a2, lip2.esy()));
                }
            }
        }
        if (lea.enW().isDescendant(this.dAJ.az(), cug.fpP)) {
            object4 = this.aq(9632);
            object3 = object4 == null ? "" : ((ff)object4).getStringValue();
            arrayList.add(new hnt(this.dXw.jGU, lcy.qZV.a(lcy.qRO, new ljg((String)object3)).esy()));
            ew ew2 = this.ao(1248);
            int n = ew2 == null ? 0 : ew2.fQ();
            arrayList.add(new hnt(this.dXw.jGU, lcy.qZV.a(lcy.qSo, new lja(n)).esy()));
        }
        if (this.cly()) {
            boolean bl = false;
            object3 = this.dXw.jGU;
            object6 = this.ah(1680);
            if (object6 != null && ((et)object6).fN() != 0.0f) {
                if (!bl) {
                    bl = true;
                    arrayList.add(new hnt(this.dXw.kKo, new ljg(" ").esy()));
                    arrayList.add(new hnt(this.dXw.kKp, new ljg("Protections:").esy()));
                    arrayList.add(new hnt(this.dXw.kKp, new ljg("-------------").esy()));
                }
                lip lip3 = lcy.qZV.a(lcy.qRX, new ljm(((et)object6).fN()));
                arrayList.add(new hnt((hnt.a)object3, lip3.esy()));
            }
            if ((object6 = this.ah(1744)) != null && ((et)object6).fN() != 0.0f) {
                if (!bl) {
                    bl = true;
                    arrayList.add(new hnt(this.dXw.kKo, new ljg(" ").esy()));
                    arrayList.add(new hnt(this.dXw.kKp, new ljg("Protections:").esy()));
                    arrayList.add(new hnt(this.dXw.kKp, new ljg("-------------").esy()));
                }
                lip lip4 = lcy.qZV.a(lcy.qSh, new ljm(((et)object6).fN()));
                arrayList.add(new hnt((hnt.a)object3, lip4.esy()));
            }
            if ((object6 = this.ah(6416)) != null && ((et)object6).fN() != 0.0f) {
                if (!bl) {
                    bl = true;
                    arrayList.add(new hnt(this.dXw.kKo, new ljg(" ").esy()));
                    arrayList.add(new hnt(this.dXw.kKp, new ljg("Protections:").esy()));
                    arrayList.add(new hnt(this.dXw.kKp, new ljg("-------------").esy()));
                }
                lip lip5 = lcy.qZV.a(lcy.qSi, new ljm(((et)object6).fN()));
                arrayList.add(new hnt((hnt.a)object3, lip5.esy()));
            }
            if ((object6 = this.ah(1936)) != null && ((et)object6).fN() != 0.0f) {
                if (!bl) {
                    bl = true;
                    arrayList.add(new hnt(this.dXw.kKo, new ljg(" ").esy()));
                    arrayList.add(new hnt(this.dXw.kKp, new ljg("Protections:").esy()));
                    arrayList.add(new hnt(this.dXw.kKp, new ljg("-------------").esy()));
                }
                lip lip6 = lcy.qZV.a(lcy.qRY, new ljm(((et)object6).fN()));
                arrayList.add(new hnt((hnt.a)object3, lip6.esy()));
            }
            if ((object6 = this.ah(2096)) != null && ((et)object6).fN() != 0.0f) {
                if (!bl) {
                    bl = true;
                    arrayList.add(new hnt(this.dXw.kKo, new ljg(" ").esy()));
                    arrayList.add(new hnt(this.dXw.kKp, new ljg("Protections:").esy()));
                    arrayList.add(new hnt(this.dXw.kKp, new ljg("-------------").esy()));
                }
                lip lip7 = lcy.qZV.a(lcy.qRZ, new ljm(((et)object6).fN()));
                arrayList.add(new hnt((hnt.a)object3, lip7.esy()));
            }
            if ((object6 = this.ah(2704)) != null && ((et)object6).fN() != 0.0f) {
                if (!bl) {
                    bl = true;
                    arrayList.add(new hnt(this.dXw.kKo, new ljg(" ").esy()));
                    arrayList.add(new hnt(this.dXw.kKp, new ljg("Protections:").esy()));
                    arrayList.add(new hnt(this.dXw.kKp, new ljg("-------------").esy()));
                }
                lip lip8 = lcy.qZV.a(lcy.qSa, new ljm(((et)object6).fN()));
                arrayList.add(new hnt((hnt.a)object3, lip8.esy()));
            }
            if ((object6 = this.ah(3248)) != null && ((et)object6).fN() != 0.0f) {
                if (!bl) {
                    bl = true;
                    arrayList.add(new hnt(this.dXw.kKo, new ljg(" ").esy()));
                    arrayList.add(new hnt(this.dXw.kKp, new ljg("Protections:").esy()));
                    arrayList.add(new hnt(this.dXw.kKp, new ljg("-------------").esy()));
                }
                lip lip9 = lcy.qZV.a(lcy.qSb, new ljm(((et)object6).fN()));
                arrayList.add(new hnt((hnt.a)object3, lip9.esy()));
            }
            if ((object6 = this.ah(3280)) != null && ((et)object6).fN() != 0.0f) {
                if (!bl) {
                    bl = true;
                    arrayList.add(new hnt(this.dXw.kKo, new ljg(" ").esy()));
                    arrayList.add(new hnt(this.dXw.kKp, new ljg("Protections:").esy()));
                    arrayList.add(new hnt(this.dXw.kKp, new ljg("-------------").esy()));
                }
                lip lip10 = lcy.qZV.a(lcy.qSc, new ljm(((et)object6).fN()));
                arrayList.add(new hnt((hnt.a)object3, lip10.esy()));
            }
            if ((object6 = this.ah(4464)) != null && ((et)object6).fN() != 0.0f) {
                if (!bl) {
                    bl = true;
                    arrayList.add(new hnt(this.dXw.kKo, new ljg(" ").esy()));
                    arrayList.add(new hnt(this.dXw.kKp, new ljg("Protections:").esy()));
                    arrayList.add(new hnt(this.dXw.kKp, new ljg("-------------").esy()));
                }
                lip lip11 = lcy.qZV.a(lcy.qSj, new ljm(((et)object6).fN()));
                arrayList.add(new hnt((hnt.a)object3, lip11.esy()));
            }
            if ((object6 = this.ah(3536)) != null && ((et)object6).fN() != 0.0f) {
                if (!bl) {
                    bl = true;
                    arrayList.add(new hnt(this.dXw.kKo, new ljg(" ").esy()));
                    arrayList.add(new hnt(this.dXw.kKp, new ljg("Protections:").esy()));
                    arrayList.add(new hnt(this.dXw.kKp, new ljg("-------------").esy()));
                }
                lip lip12 = lcy.qZV.a(lcy.qSd, new ljm(((et)object6).fN()));
                arrayList.add(new hnt((hnt.a)object3, lip12.esy()));
            }
            if ((object6 = this.ah(3568)) != null && ((et)object6).fN() != 0.0f) {
                if (!bl) {
                    bl = true;
                    arrayList.add(new hnt(this.dXw.kKo, new ljg(" ").esy()));
                    arrayList.add(new hnt(this.dXw.kKp, new ljg("Protections:").esy()));
                    arrayList.add(new hnt(this.dXw.kKp, new ljg("-------------").esy()));
                }
                lip lip13 = lcy.qZV.a(lcy.qSk, new ljm(((et)object6).fN()));
                arrayList.add(new hnt((hnt.a)object3, lip13.esy()));
            }
            if ((object6 = this.ah(4496)) != null && ((et)object6).fN() != 0.0f) {
                if (!bl) {
                    bl = true;
                    arrayList.add(new hnt(this.dXw.kKo, new ljg(" ").esy()));
                    arrayList.add(new hnt(this.dXw.kKp, new ljg("Protections:").esy()));
                    arrayList.add(new hnt(this.dXw.kKp, new ljg("-------------").esy()));
                }
                lip lip14 = lcy.qZV.a(lcy.qSe, new ljm(((et)object6).fN()));
                arrayList.add(new hnt((hnt.a)object3, lip14.esy()));
            }
            if ((object6 = this.ah(4912)) != null && ((et)object6).fN() != 0.0f) {
                if (!bl) {
                    bl = true;
                    arrayList.add(new hnt(this.dXw.kKo, new ljg(" ").esy()));
                    arrayList.add(new hnt(this.dXw.kKp, new ljg("Protections:").esy()));
                    arrayList.add(new hnt(this.dXw.kKp, new ljg("-------------").esy()));
                }
                lip lip15 = lcy.qZV.a(lcy.qSf, new ljm(((et)object6).fN()));
                arrayList.add(new hnt((hnt.a)object3, lip15.esy()));
            }
            if ((object6 = this.ah(5536)) != null && ((et)object6).fN() != 0.0f) {
                if (!bl) {
                    bl = true;
                    arrayList.add(new hnt(this.dXw.kKo, new ljg(" ").esy()));
                    arrayList.add(new hnt(this.dXw.kKp, new ljg("Protections:").esy()));
                    arrayList.add(new hnt(this.dXw.kKp, new ljg("-------------").esy()));
                }
                lip lip16 = lcy.qZV.a(lcy.qSg, new ljm(((et)object6).fN()));
                arrayList.add(new hnt((hnt.a)object3, lip16.esy()));
            }
            if ((object6 = this.ah(4208)) != null && ((et)object6).fN() != 0.0f) {
                if (!bl) {
                    bl = true;
                    arrayList.add(new hnt(this.dXw.kKo, new ljg(" ").esy()));
                    arrayList.add(new hnt(this.dXw.kKp, new ljg("Protections:").esy()));
                    arrayList.add(new hnt(this.dXw.kKp, new ljg("-------------").esy()));
                }
                lip lip17 = lcy.qZV.a(lcy.qSl, new ljm(((et)object6).fN()));
                arrayList.add(new hnt((hnt.a)object3, lip17.esy()));
            }
        }
        int n = 0;
        for (alc.b b2 : alc.b.ListOfValue) {
            a2 = this.dXw.jGU;
            object2 = this.LY(b2.bnM);
            if (object2 == null || ((es)object2).fH() == null) continue;
            if (n == 0) {
                arrayList.add(new hnt(this.dXw.kKo, new ljg(" ").esy()));
                arrayList.add(new hnt(this.dXw.kKp, new ljg("Enchantments:").esy()));
                arrayList.add(new hnt(this.dXw.kKp, new ljg("----------------").esy()));
            }
            ++n;
            object = new liw(((es)object2).fJ(), ((es)object2).fE());
            arrayList.add(new hnt(a2, ((lip)object).esy()));
        }
        this.dXw.a(this.kgb.atw(), arrayList);
    }

    @Override
    protected lcu cfR() {
        return this.dXw.kNl;
    }

    private ew ao(int n) {
        if (this.dAJ == null || this.dAJ.arJ() == null) {
            return null;
        }
        for (int i = 0; i < this.dAJ.arJ().length; ++i) {
            if (this.dAJ.arJ()[i].getType() != n || !(this.dAJ.arJ()[i] instanceof ew)) continue;
            return (ew)this.dAJ.arJ()[i];
        }
        return null;
    }

    private ff aq(int n) {
        if (this.dAJ == null || this.dAJ.arJ() == null) {
            return null;
        }
        for (int i = 0; i < this.dAJ.arJ().length; ++i) {
            if (this.dAJ.arJ()[i].getType() != n || !(this.dAJ.arJ()[i] instanceof ff)) continue;
            return (ff)this.dAJ.arJ()[i];
        }
        return null;
    }

    private et ah(int n) {
        if (this.dAJ == null || this.dAJ.arJ() == null) {
            return null;
        }
        for (int i = 0; i < this.dAJ.arJ().length; ++i) {
            if (this.dAJ.arJ()[i].getType() != n || !(this.dAJ.arJ()[i] instanceof et)) continue;
            return (et)this.dAJ.arJ()[i];
        }
        return null;
    }

    private es LY(int n) {
        if (this.dAJ == null || this.dAJ.arJ() == null) {
            return null;
        }
        for (int i = 0; i < this.dAJ.arJ().length; ++i) {
            if (this.dAJ.arJ()[i].getType() != n || !(this.dAJ.arJ()[i] instanceof es)) continue;
            return (es)this.dAJ.arJ()[i];
        }
        return null;
    }

    private boolean cly() {
        if (this.ah(1680) != null) {
            return true;
        }
        if (this.ah(1744) != null) {
            return true;
        }
        if (this.ah(6416) != null) {
            return true;
        }
        if (this.ah(1936) != null) {
            return true;
        }
        if (this.ah(2096) != null) {
            return true;
        }
        if (this.ah(2704) != null) {
            return true;
        }
        if (this.ah(3248) != null) {
            return true;
        }
        if (this.ah(3280) != null) {
            return true;
        }
        if (this.ah(4464) != null) {
            return true;
        }
        if (this.ah(3536) != null) {
            return true;
        }
        if (this.ah(3568) != null) {
            return true;
        }
        if (this.ah(4496) != null) {
            return true;
        }
        if (this.ah(4912) != null) {
            return true;
        }
        if (this.ah(5536) != null) {
            return true;
        }
        return this.ah(4208) != null;
    }

    private void clt() {
        int n = this.getWidth();
        int n2 = this.getHeight();
        if (n > 4 && n2 > 4) {
            int n3 = this.kgb.atw().kLY.rmN;
            int n4 = this.kgb.atw().kLY.H;
            float f2 = 1.0f;
            if (n3 > n || n3 > n2) {
                float f3 = (float)n / (float)n3;
                float f4 = (float)n2 / (float)n4;
                f2 = f3 < f4 ? f3 : f4;
                n3 = (int)((float)n3 * f2);
                n4 = (int)((float)n4 * f2);
            }
            int n5 = (n - n3) / 2;
            int n6 = (n2 - n4) / 2;
            this.kgb.h(n5, n6, n3, n4);
            this.kgb.N(f2, f2);
            if (this.ksA != null) {
                this.ksA.h(n - 48, n2 - 12, 48, 12);
            }
        }
    }

    @Override
    protected void cbM() {
        super.cbM();
        if (!this.kLu.csd()) {
            this.dXw.jZG.a(this, this.dXw.crN());
        }
    }

    @Override
    public void cbJ() {
    }

    @Override
    public void cbL() {
        this.kgb.H(lcq.COLORSHIFT_NEUTRAL);
    }

    @Override
    public boolean a(hmt hmt2, boolean bl) {
        if (!this.knl) {
            return false;
        }
        if (!(hmt2 instanceof hgm)) {
            return false;
        }
        hgm hgm2 = (hgm)hmt2;
        if (hgm2.kdT.kdF != bqm.b.dEn) {
            return false;
        }
        if (bl) {
            return true;
        }
        this.ksz.f(this.dAJ);
        return false;
    }

    @Override
    public void cbK() {
        lcq lcq2 = lcq.COLORSHIFT_NEUTRAL;
        if (this.dXw.jZG.cpS() && !this.dXw.jZG.cpM()) {
            lcq2 = lcq2.V(this.dXw.jXk.jNW);
        }
        this.kgb.H(lcq2);
    }
}

