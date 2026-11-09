/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ayd
 */
import java.util.ArrayList;

public class ayt
extends aym {
    protected ays[] cAE = null;
    protected int cAF = -1;
    protected bbo[] cAG = null;
    protected bcm[] cAH = null;
    protected bcm[] cAI = null;
    protected bcm[] cAJ = null;
    protected bao[] cAK = null;
    protected bao[] cAL = null;
    protected int aDQ = 0;
    protected azx[] cAM = null;
    protected int cAN = -1;
    protected int cAO = -1;
    protected double cAP = 0.0;
    protected bbx[] cAQ = null;

    public ays[] abO() {
        return this.cAE;
    }

    public bcb qq() {
        return this.cAE[this.cAF].abG().akW();
    }

    public boolean b(bca bca2) {
        return this.cAE[this.cAF].b(bca2);
    }

    public bbs abP() {
        return this.cAE[this.cAF].abC();
    }

    public boolean ex(ldv ldv2) {
        return this.cAE[this.cAF].abB().equals(ldv2);
    }

    public ays abQ() {
        return this.cAE[this.cAF];
    }

    public bbo[] abR() {
        return this.cAG;
    }

    public bcm[] aag() {
        return this.cAH;
    }

    public bcm[] aak() {
        return this.cAI;
    }

    public bcm[] abS() {
        return this.cAJ;
    }

    public boolean dQ(ldv ldv2) {
        if (ldv2 == null) {
            return false;
        }
        for (ays ays2 : this.cAE) {
            if (!ays2.abB().equals(ldv2)) continue;
            return true;
        }
        return false;
    }

    public ays abT() {
        for (int i = 0; i < this.cAE.length; ++i) {
            if (!this.cAE[i].abJ()) continue;
            return this.cAE[i];
        }
        assert (false);
        return null;
    }

    public ays abU() {
        for (int i = 0; i < this.cAE.length; ++i) {
            if (this.cAE[i].getName().compareTo(this.cAe) != 0) continue;
            return this.cAE[i];
        }
        return null;
    }

    public bao[] abV() {
        return this.cAK;
    }

    public bao[] abW() {
        return this.cAL;
    }

    public int aaq() {
        return this.aDQ;
    }

    public azx[] abX() {
        return this.cAM;
    }

    public int aaE() {
        return this.cAN;
    }

    public int aaF() {
        return this.cAO;
    }

    public double aaG() {
        return this.cAP;
    }

    public bbx[] abY() {
        return this.cAQ;
    }

    @Deprecated
    public ayt() {
    }

    public ayt(ayd ayd2, bbr bbr2, dxr dxr2) {
        super(ayd2);
        this.aDQ = ayd2.aaq();
        this.cAE = new ays[ayd2.ZT()];
        int n = 0;
        for (bbr bbr3 : ayd2.ZU().values()) {
            if (bbr3 == bbr2) {
                this.cAF = n;
            }
            this.cAE[n++] = new ays(bbr3, ayd2.ZW().compareToIgnoreCase(bbr3.akp()) == 0, dxr2);
        }
        this.cAG = ayd2.aab();
        this.cAH = ayd2.aag();
        this.cAI = ayd2.aak();
        this.cAJ = ayd2.aai();
        this.cAK = ayd2.aau();
        this.cAL = ayd2.aav();
        this.cAM = ayd2.aaw();
        this.cAQ = ayd2.aax();
        this.cAN = ayd2.aaE();
        this.cAO = ayd2.aaF();
        this.cAP = ayd2.aaG();
    }

    @Override
    public void eT(String string) {
        this.add = string;
    }

    public void eV(String string) {
        this.aDF = string;
    }

    public void eW(String string) {
        this.aDG = string;
    }

    public void ja(int n) {
        this.cAi = n;
    }

    public void ey(ldv ldv2) {
        for (int i = 0; i < this.cAE.length; ++i) {
            if (this.cAE[i].abJ()) {
                this.cAE[i].cp(false);
            }
            if (!this.cAE[i].abB().equals(ldv2)) continue;
            this.cAE[i].cp(true);
        }
    }

    public void eX(String string) {
        this.cAe = string;
    }

    public void m(int[] nArray) {
        this.cAg = nArray;
    }

    public void cq(boolean bl) {
        this.cAh = bl;
    }

    public void X(int n, int n2) {
        this.aDP = n;
        this.aDQ = n2;
    }

    public void ez(ldv ldv2) {
        int n;
        if (ldv2 == null) {
            return;
        }
        int n2 = 0;
        ArrayList<ays> arrayList = lcn.emv();
        for (n = 0; n < this.cAE.length; ++n) {
            if (this.cAE[n].abB().equals(ldv2)) {
                n2 = this.cAE[n].abK();
                continue;
            }
            arrayList.add(this.cAE[n]);
        }
        this.cAE = arrayList.toArray(new ays[arrayList.size()]);
        if (n2 != 0) {
            this.cAj[0] = this.cAj[0] - 1;
            int n3 = n2;
            this.cAj[n3] = this.cAj[n3] - 1;
        }
        for (n = 0; n < this.cAE.length; ++n) {
            if (!this.cAE[n].abB().equals(hso.cxK().bAn().Tr)) continue;
            this.cAF = n;
        }
    }

    public void b(ays ays2) {
        int n;
        if (ays2 == null) {
            return;
        }
        if (this.dQ(ays2.abB())) {
            return;
        }
        ArrayList<ays> arrayList = lcn.emv();
        for (n = 0; n < this.cAE.length; ++n) {
            arrayList.add(this.cAE[n]);
        }
        arrayList.add(ays2);
        this.cAE = arrayList.toArray(new ays[arrayList.size()]);
        this.cAj[0] = this.cAj[0] + 1;
        int n2 = ays2.abK();
        this.cAj[n2] = this.cAj[n2] + 1;
        for (n = 0; n < this.cAE.length; ++n) {
            if (!this.ex(this.cAE[n].abB())) continue;
            this.cAF = n;
        }
    }

    public void a(bbo bbo2) {
        if (bbo2 == null) {
            return;
        }
        ArrayList<bbo> arrayList = lcn.emv();
        for (int i = 0; i < this.cAG.length; ++i) {
            arrayList.add(this.cAG[i]);
        }
        arrayList.add(bbo2);
        this.cAG = arrayList.toArray(new bbo[arrayList.size()]);
    }

    public void eA(ldv ldv2) {
        if (ldv2 == null) {
            return;
        }
        ArrayList<bbo> arrayList = lcn.emv();
        for (int i = 0; i < this.cAG.length; ++i) {
            if (this.cAG[i].ach().equals(ldv2)) continue;
            arrayList.add(this.cAG[i]);
        }
        this.cAG = arrayList.toArray(new bbo[arrayList.size()]);
    }

    public void a(ayp ayp2) {
        if (ayp2 == null) {
            return;
        }
        ArrayList<ayp> arrayList = lcn.emv();
        for (int i = 0; i < this.czC.length; ++i) {
            arrayList.add(this.czC[i]);
        }
        arrayList.add(ayp2);
        this.czC = arrayList.toArray(new ayp[arrayList.size()]);
    }

    public void eB(ldv ldv2) {
        if (ldv2 == null) {
            return;
        }
        ArrayList<ayp> arrayList = lcn.emv();
        for (int i = 0; i < this.czC.length; ++i) {
            if (this.czC[i].getGUID().equals(ldv2)) continue;
            arrayList.add(this.czC[i]);
        }
        this.czC = arrayList.toArray(new ayp[arrayList.size()]);
    }

    public void a(bcq bcq2) {
        if (bcq2 == null) {
            return;
        }
        ArrayList<bcq> arrayList = lcn.emv();
        for (int i = 0; i < this.czD.length; ++i) {
            arrayList.add(this.czD[i]);
        }
        arrayList.add(bcq2);
        this.czD = arrayList.toArray(new bcq[arrayList.size()]);
    }

    public void eC(ldv ldv2) {
        if (ldv2 == null) {
            return;
        }
        ArrayList<bcq> arrayList = lcn.emv();
        for (int i = 0; i < this.czD.length; ++i) {
            if (this.czD[i].iG().equals(ldv2)) continue;
            arrayList.add(this.czD[i]);
        }
        this.czD = arrayList.toArray(new bcq[arrayList.size()]);
    }

    public void k(ldv ldv2, String string) {
        for (int i = 0; i < this.czD.length; ++i) {
            if (!ldv.au(this.czD[i].iG(), ldv2)) continue;
            this.czD[i].cD(string);
        }
    }

    public void a(ldv ldv2, bcr bcr2, bcr bcr3) {
        for (int i = 0; i < this.czD.length; ++i) {
            if (!this.czD[i].iG().equals(ldv2)) continue;
            this.czD[i].a(bcr2);
            this.czD[i].b(bcr3);
            break;
        }
    }

    public void a(bcm bcm2) {
        if (bcm2 == null) {
            return;
        }
        ArrayList<ldv> arrayList = lcn.emv();
        ArrayList<bcm> arrayList2 = lcn.emv();
        for (int i = 0; i < this.cAH.length; ++i) {
            arrayList.add(this.cAk[i]);
            arrayList2.add(this.cAH[i]);
        }
        arrayList.add(bcm2.qd());
        arrayList2.add(bcm2);
        this.cAk = arrayList.toArray(new ldv[arrayList.size()]);
        this.cAH = arrayList2.toArray(new bcm[arrayList2.size()]);
    }

    public void eD(ldv ldv2) {
        if (ldv2 == null) {
            return;
        }
        ArrayList<ldv> arrayList = lcn.emv();
        ArrayList<bcm> arrayList2 = lcn.emv();
        for (int i = 0; i < this.cAH.length; ++i) {
            if (this.cAH[i].qd().equals(ldv2)) continue;
            arrayList.add(this.cAk[i]);
            arrayList2.add(this.cAH[i]);
        }
        this.cAk = arrayList.toArray(new ldv[arrayList.size()]);
        this.cAH = arrayList2.toArray(new bcm[arrayList2.size()]);
    }

    public void b(bcm bcm2) {
        if (bcm2 == null) {
            return;
        }
        ArrayList<ldv> arrayList = lcn.emv();
        ArrayList<bcm> arrayList2 = lcn.emv();
        for (int i = 0; i < this.cAI.length; ++i) {
            arrayList.add(this.cAm[i]);
            arrayList2.add(this.cAI[i]);
        }
        arrayList.add(bcm2.qd());
        arrayList2.add(bcm2);
        this.cAm = arrayList.toArray(new ldv[arrayList.size()]);
        this.cAI = arrayList2.toArray(new bcm[arrayList2.size()]);
    }

    public void eE(ldv ldv2) {
        if (ldv2 == null) {
            return;
        }
        ArrayList<ldv> arrayList = lcn.emv();
        ArrayList<bcm> arrayList2 = lcn.emv();
        for (int i = 0; i < this.cAI.length; ++i) {
            if (this.cAI[i].qd().equals(ldv2)) continue;
            arrayList.add(this.cAm[i]);
            arrayList2.add(this.cAI[i]);
        }
        this.cAm = arrayList.toArray(new ldv[arrayList.size()]);
        this.cAI = arrayList2.toArray(new bcm[arrayList2.size()]);
    }

    public void c(bcm bcm2) {
        if (bcm2 == null) {
            return;
        }
        ArrayList<ldv> arrayList = lcn.emv();
        ArrayList<bcm> arrayList2 = lcn.emv();
        for (int i = 0; i < this.cAJ.length; ++i) {
            arrayList.add(this.cAl[i]);
            arrayList2.add(this.cAJ[i]);
        }
        arrayList.add(bcm2.qd());
        arrayList2.add(bcm2);
        this.cAl = arrayList.toArray(new ldv[arrayList.size()]);
        this.cAJ = arrayList2.toArray(new bcm[arrayList2.size()]);
    }

    public void eF(ldv ldv2) {
        if (ldv2 == null) {
            return;
        }
        ArrayList<ldv> arrayList = lcn.emv();
        ArrayList<bcm> arrayList2 = lcn.emv();
        for (int i = 0; i < this.cAJ.length; ++i) {
            if (this.cAJ[i].qd().equals(ldv2)) continue;
            arrayList.add(this.cAl[i]);
            arrayList2.add(this.cAJ[i]);
        }
        this.cAl = arrayList.toArray(new ldv[arrayList.size()]);
        this.cAJ = arrayList2.toArray(new bcm[arrayList2.size()]);
    }

    public void a(ayk ayk2) {
        if (ayk2 == null) {
            return;
        }
        ArrayList<ayk> arrayList = lcn.emv();
        for (int i = 0; i < this.czE.length; ++i) {
            if (this.czE[i].getGUID().equals(ayk2.getGUID())) {
                this.czE[i] = ayk2;
                return;
            }
            arrayList.add(this.czE[i]);
        }
        arrayList.add(ayk2);
        this.czE = arrayList.toArray(new ayk[arrayList.size()]);
    }

    public void eG(ldv ldv2) {
        if (ldv2 == null) {
            return;
        }
        ArrayList<ayk> arrayList = lcn.emv();
        for (int i = 0; i < this.czE.length; ++i) {
            if (this.czE[i].getGUID().equals(ldv2)) continue;
            arrayList.add(this.czE[i]);
        }
        this.czE = arrayList.toArray(new ayk[arrayList.size()]);
    }

    public void a(bao bao2) {
        if (bao2 == null) {
            return;
        }
        ArrayList<bao> arrayList = lcn.emv();
        for (int i = 0; i < this.cAK.length; ++i) {
            if (this.cAK[i].z(bao2)) {
                return;
            }
            arrayList.add(this.cAK[i]);
        }
        arrayList.add(bao2);
        this.cAK = arrayList.toArray(new bao[arrayList.size()]);
    }

    public void b(bao bao2) {
        if (bao2 == null) {
            return;
        }
        ArrayList<bao> arrayList = lcn.emv();
        for (int i = 0; i < this.cAL.length; ++i) {
            if (this.cAL[i].z(bao2)) {
                return;
            }
            arrayList.add(this.cAL[i]);
        }
        arrayList.add(bao2);
        this.cAL = arrayList.toArray(new bao[arrayList.size()]);
    }

    public void o(ldv ldv2, ldv ldv3) {
        int n;
        if (ldv2 == null || ldv3 == null) {
            return;
        }
        ArrayList<bao> arrayList = lcn.emv();
        ArrayList<bao> arrayList2 = lcn.emv();
        for (n = 0; n < this.cAK.length; ++n) {
            if (this.cAK[n].g(this.cAK[n].gk(this.ade).ajz()).equals(ldv2) && this.cAK[n].aiK().equals(ldv3)) continue;
            arrayList.add(this.cAK[n]);
        }
        for (n = 0; n < this.cAL.length; ++n) {
            if (this.cAL[n].g(this.cAL[n].gk(this.ade).ajz()).equals(ldv2) && this.cAL[n].aiK().equals(ldv3)) continue;
            arrayList2.add(this.cAL[n]);
        }
        this.cAK = arrayList.toArray(new bao[arrayList.size()]);
        this.cAL = arrayList2.toArray(new bao[arrayList2.size()]);
    }

    public void l(ldv ldv2, String string) {
        bbc bbc2;
        int n;
        for (n = 0; n < this.cAK.length; ++n) {
            bbc2 = this.cAK[n].gk(ldv2);
            if (bbc2 == bbc.cPO) continue;
            this.cAK[n].a(bbc2, string);
        }
        for (n = 0; n < this.cAL.length; ++n) {
            bbc2 = this.cAL[n].gk(ldv2);
            if (bbc2 == bbc.cPO) continue;
            this.cAL[n].a(bbc2, string);
        }
    }

    public void c(ays ays2) {
        if (ays2.getName().compareToIgnoreCase(this.cAe) == 0) {
            this.cAo = ays2.qf();
        } else if (ays2.getName().compareToIgnoreCase(this.cAf) == 0) {
            this.cAn = ays2.qf();
        }
    }

    public void jb(int n) {
        this.cAN = n;
    }

    public void jc(int n) {
        this.cAO = n;
    }

    public void an(double d2) {
        this.cAP = d2;
    }

    public void a(ays[] aysArray) {
        int n;
        ays[] aysArray2 = new ays[this.cAE.length + aysArray.length];
        for (n = 0; n < this.cAE.length; ++n) {
            aysArray2[n] = this.cAE[n];
        }
        for (n = 0; n < aysArray.length; ++n) {
            aysArray2[this.cAE.length + n] = aysArray[n];
        }
        this.cAE = aysArray2;
    }

    public void a(bbo[] bboArray) {
        int n;
        bbo[] bboArray2 = new bbo[(this.cAG == null ? 0 : this.cAG.length) + bboArray.length];
        if (this.cAG != null) {
            for (n = 0; n < this.cAG.length; ++n) {
                bboArray2[n] = this.cAG[n];
            }
        }
        for (n = 0; n < bboArray.length; ++n) {
            bboArray2[(this.cAG == null ? 0 : this.cAG.length) + n] = bboArray[n];
        }
        this.cAG = bboArray2;
    }

    public void a(bcm[] bcmArray, bcm[] bcmArray2, bcm[] bcmArray3) {
        this.cAH = bcmArray;
        this.cAI = bcmArray2;
        this.cAJ = bcmArray3;
    }
}

