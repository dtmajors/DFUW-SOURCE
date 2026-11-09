/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cxd
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class hwc
extends btk
implements bto {
    protected ldv lhw = null;
    protected Set<hwb> lhx = lcn.emx();
    protected int lhy = 0;
    List<hvz> lhz = lcn.emv();
    Set<alu> lgV = lcn.emx();

    @Override
    public void initialize() {
        super.initialize();
        if (this.lhw != null) {
            this.cAS();
        }
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.cAR();
    }

    public void Q(ldv ldv2, boolean bl) {
        if (ldv.au(ldv2, this.lhw) && !bl) {
            return;
        }
        this.cAR();
        this.lhw = ldv2;
        if (this.isInitialized()) {
            if (this.lhw == null) {
                this.lhz.clear();
                this.lgV.clear();
            } else {
                this.cAS();
            }
        }
    }

    public void cAR() {
        if (this.lhw == null) {
            return;
        }
        this.ae(this.lhw, cbx.a.ekI.ordinal());
        this.lhw = null;
    }

    public void cAS() {
        if (this.lhw == null) {
            return;
        }
        this.m(this.lhw, cbx.a.ekI.ordinal(), hvg.ldC.ordinal());
        eyu eyu2 = (eyu)this.MessageDelegator.h(23560, this.getGUID(), this.lhw);
        this.MessageDelegator.F(eyu2);
    }

    private void m(ldv ldv2, int n, int n2) {
        fvp fvp2 = (fvp)this.MessageDelegator.h(12289, this.getGUID(), ldv2);
        fvp2.iTm = n;
        fvp2.dTe = n2;
        this.MessageDelegator.F(fvp2);
    }

    private void ae(ldv ldv2, int n) {
        fvv fvv2 = (fvv)this.MessageDelegator.h(12290, this.getGUID(), ldv2);
        fvv2.iTm = n;
        this.MessageDelegator.F(fvv2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        if (dxq2.bEz() == 12291) {
            this.a((fvt)dxq2);
        } else if (dxq2.bEz() == 23561) {
            this.c((eyv)dxq2);
        } else {
            super.receiveMessage(dxq2);
        }
    }

    public void a(fvt fvt2) {
        if (this.lhw == null) {
            return;
        }
        if (fvt2.dTe == hvg.ldC.ordinal()) {
            eyu eyu2 = (eyu)this.MessageDelegator.h(23560, this.getGUID(), this.lhw);
            this.MessageDelegator.F(eyu2);
        }
    }

    public void c(eyv eyv2) {
        alu[] aluArray = eyv2.iFM;
        this.b(aluArray);
    }

    /*
     * WARNING - void declaration
     */
    public void b(alu[] aluArray) {
        void var7_10;
        int n;
        ArrayList<hvz> arrayList = lcn.emv();
        ArrayList<hvz> arrayList2 = lcn.emv();
        int n2 = -1;
        hwb arrayList3 = null;
        for (hwb object2 : this.lhx) {
            int n3 = object2.cAQ();
            if (n3 == -1) continue;
            n2 = n3;
            arrayList3 = object2;
        }
        Object object3 = null;
        ArrayList arrayList4 = lcn.emv();
        ArrayList<Integer> arrayList5 = lcn.emv();
        ArrayList<alu> arrayList6 = lcn.emv();
        if (n2 != -1) {
            ArrayList arrayList7 = lcn.emv();
            arrayList5 = lcn.emv();
        }
        boolean[][] blArrayArray = new boolean[this.lhz.size()][];
        for (int i = 0; i < blArrayArray.length; ++i) {
            hvz hwb3 = this.lhz.get(i);
            blArrayArray[i] = new boolean[hwb3.cAN()];
            for (n = 0; n < hwb3.cAN(); ++n) {
                blArrayArray[i][n] = true;
            }
        }
        for (alu alu2 : aluArray) {
            hvz hvz2 = null;
            boolean bl = false;
            for (int i = 0; i < this.lhz.size(); ++i) {
                int n4;
                hvz hvz3 = this.lhz.get(i);
                for (n4 = 0; n4 < hvz3.cAN(); ++n4) {
                    alu alu3 = hvz3.OB(n4);
                    if (!alu3.equals(alu2)) continue;
                    if (i < blArrayArray.length) {
                        blArrayArray[i][n4] = false;
                    }
                    hvz2 = hvz3;
                    break;
                }
                if (hvz2 != null) break;
                n4 = hvz.l(alu2);
                if (hvz3.zg() != n4 || (n4 == -1 || n4 == cxd.fJp) && (hvz3.cAN() <= 0 || alu2.CD() != hvz3.OB(0).CD())) continue;
                bl = true;
                hvz2 = hvz3;
                break;
            }
            if (hvz2 == null) {
                hvz2 = new hvz(this.lhy++);
                this.lhz.add(hvz2);
                hvz2.k(alu2);
                arrayList6.add(alu2);
                arrayList.add(hvz2);
                continue;
            }
            if (!bl) continue;
            hvz2.k(alu2);
            arrayList6.add(alu2);
            if (hvz2.getId() != n2) continue;
            var7_10.add(hvz2.cAN() - 1);
        }
        for (int i = 0; i < this.lhz.size(); ++i) {
            int n5;
            hvz hwb4 = this.lhz.get(i);
            if (hwb4.getId() == n2) {
                object3 = hwb4;
            }
            n = 1;
            boolean bl = false;
            if (i < blArrayArray.length) {
                for (n5 = 0; n5 < blArrayArray[i].length; ++n5) {
                    if (!blArrayArray[i][n5]) {
                        n = 0;
                        continue;
                    }
                    bl = true;
                }
                if (n != 0 && blArrayArray[i].length != hwb4.cAN()) {
                    n = 0;
                    bl = true;
                }
            } else {
                n = 0;
            }
            if (n != 0) {
                arrayList2.add(hwb4);
                for (n5 = 0; n5 < hwb4.cAN(); ++n5) {
                    for (hwb hwb2 : this.lhx) {
                        hwb2.n(hwb4.OB(n5));
                    }
                }
                continue;
            }
            if (!bl) continue;
            n5 = 0;
            for (int j = 0; j < blArrayArray[i].length; ++j) {
                if (!blArrayArray[i][j]) continue;
                if (hwb4.getId() == n2) {
                    arrayList5.add(hwb4.OC(j - n5));
                }
                for (hwb hwb3 : this.lhx) {
                    hwb3.n(hwb4.OB(j - n5));
                }
                hwb4.OD(j - n5);
                ++n5;
            }
        }
        for (hwb hwb4 : this.lhx) {
            for (alu alu4 : arrayList6) {
                hwb4.m(alu4);
            }
        }
        for (hvz hvz4 : arrayList2) {
            this.lhz.remove(hvz4);
        }
        if (arrayList.size() > 0 || arrayList2.size() > 0) {
            for (hwb hwb5 : this.lhx) {
                hwb5.a(this.lhz, arrayList, arrayList2);
            }
        }
        if (arrayList3 != null && (var7_10.size() > 0 || arrayList5.size() > 0)) {
            arrayList3.a((hvz)object3, (List<Integer>)var7_10, arrayList5);
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        ArrayList<alu> arrayList = lcn.emv();
        float[] fArray = new float[this.lhz.size()];
        int n = 0;
        int n2 = -1;
        hwb aluArray = null;
        for (hwb object : this.lhx) {
            if (object.cAQ() == -1) continue;
            n2 = object.cAQ();
            aluArray = object;
            break;
        }
        boolean bl = false;
        for (hvz hvz2 : this.lhz) {
            fArray[n] = 0.0f;
            float[] fArray2 = new float[hvz2.cAN()];
            for (int i = 0; i < hvz2.cAN(); ++i) {
                alu alu2 = hvz2.OB(i);
                float f2 = (float)((ldz2.rgz - alu2.Em()) / alu2.En());
                if (i == 0 || f2 < fArray[n]) {
                    fArray[n] = f2;
                }
                fArray2[i] = f2;
                if (f2 < 1.0f || cxd.xX((int)alu2.Eb())) {
                    arrayList.add(alu2);
                    continue;
                }
                bl = true;
            }
            if (n2 == hvz2.getId() && aluArray != null) {
                aluArray.a(hvz2, fArray2);
            }
            ++n;
        }
        for (hwb hwb2 : this.lhx) {
            hwb2.a(this.lhz, fArray);
        }
        if (bl) {
            alu[] aluArray3 = new alu[arrayList.size()];
            aluArray3 = arrayList.toArray(aluArray3);
            this.b(aluArray3);
        }
    }

    public void a(hwb hwb2) {
        this.lhx.add(hwb2);
    }

    public void b(hwb hwb2) {
        this.lhx.remove(hwb2);
    }

    public List<hvz> cAT() {
        return this.lhz;
    }
}

