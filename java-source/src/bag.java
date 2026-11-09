/*
 * Decompiled with CFR.
 */
import java.util.Collection;
import java.util.Map;
import java.util.Set;

final class bag {
    private int cMm = -1;
    private ldv cMn = null;
    private double cHV = 0.0;
    private ldv ade = null;
    private String add = null;
    private ldv aEr = null;
    private String aEp = null;
    private String aEq = null;
    private int aEi = 0;
    private String[] cMo = null;
    private ljq[] cMp = null;
    private int[] cMq = null;
    private Map<ldv, bah> cHf = null;
    private Map<ldv, bah> cMr = null;
    private int cGW = 0;
    private int cMs = 0;
    private int aEv = 0;
    private int aEx = 0;
    private Set<bao> cHg = null;
    private azv cHh = null;

    bag(etj etj2) {
        assert (etj2 != null);
        this.cMm = etj2.aid();
        this.cHV = etj2.bLB();
        this.ade = etj2.bKb();
        this.add = etj2.bLx();
        this.cMo = etj2.bLD();
        this.cMp = etj2.bLE();
        this.cMq = etj2.bLF();
        this.aEi = etj2.bLv();
        this.aEp = etj2.bLz();
        this.aEq = etj2.bLA();
        this.aEr = etj2.bLy();
        this.cHf = lcn.emw();
        this.cMr = lcn.emw();
    }

    bag(eth eth2) {
        assert (eth2 != null);
        this.cMm = eth2.aat();
        this.cMn = eth2.aie();
        this.cHV = eth2.aeO();
        this.ade = eth2.iG();
        this.add = eth2.iV();
        this.cMo = eth2.aii();
        this.cMp = eth2.aij();
        this.cMq = eth2.aik();
        this.aEi = eth2.adA();
        this.aEp = eth2.adC();
        this.aEq = eth2.adD();
        this.aEr = eth2.adB();
        this.aEv = eth2.aif();
        this.cMs = eth2.ail();
        this.aEx = eth2.Dl();
        this.cHf = lcn.emw();
        this.cMr = lcn.emw();
    }

    int aid() {
        return this.cMm;
    }

    double aeO() {
        return this.cHV;
    }

    ldv aie() {
        return this.cMn;
    }

    void fM(ldv ldv2) {
        this.cMn = ldv2;
    }

    ldv iG() {
        return this.ade;
    }

    String iV() {
        return this.add;
    }

    void cD(String string) {
        this.add = string;
    }

    ldv adB() {
        return this.aEr;
    }

    String adC() {
        return this.aEp;
    }

    String adD() {
        return this.aEq;
    }

    int adA() {
        return this.aEi;
    }

    void jm(int n) {
        this.aEi = n;
    }

    int aif() {
        return this.aEv;
    }

    void jK(int n) {
        this.aEv = n;
    }

    int aer() {
        return this.cGW;
    }

    void jy(int n) {
        this.cGW = n;
    }

    int Dl() {
        return this.aEx;
    }

    void jo(int n) {
        this.aEx = n;
    }

    boolean aig() {
        return this.cMo != null && this.cMo.length > 0;
    }

    int aih() {
        return this.aig() ? this.cMo.length : 0;
    }

    String[] aii() {
        return this.cMo;
    }

    ljq[] aij() {
        return this.cMp;
    }

    int[] aik() {
        return this.cMq;
    }

    boolean fg(String string) {
        if (!this.aig()) {
            return false;
        }
        for (String string2 : this.cMo) {
            if (string2 == null || string2.compareTo(string) != 0) continue;
            return true;
        }
        return false;
    }

    boolean fh(String string) {
        int n;
        if (!this.aig()) {
            return false;
        }
        int n2 = -1;
        for (n = 0; n < this.cMo.length; ++n) {
            if (this.cMo[n] == null || this.cMo[n].compareTo(string) != 0) continue;
            n2 = n;
            break;
        }
        if (n2 < 0) {
            return false;
        }
        n = this.aih() - 1;
        String[] stringArray = new String[n];
        ljq[] ljqArray = new ljq[n];
        int[] nArray = new int[n];
        int n3 = 0;
        for (int i = 0; i < this.cMo.length; ++i) {
            if (i == n2) continue;
            stringArray[n3] = this.cMo[i];
            ljqArray[n3] = this.cMp[i];
            nArray[n3++] = this.cMq[i];
        }
        this.cMo = stringArray;
        this.cMp = ljqArray;
        this.cMq = nArray;
        return true;
    }

    int aes() {
        return this.cHf.isEmpty() ? 0 : this.cHf.size();
    }

    int ail() {
        return this.cMs;
    }

    bah a(ldv ldv2, int n, ljq ljq2, String string, float f) {
        if (this.cHf.containsKey(ldv2)) {
            lfn.b(5, this.getClass().getSimpleName(), "placeSiegeStone() : Siege-Stone Already Exists!!!");
            assert (false);
            return null;
        }
        bah bah2 = new bah(ldv2, n, ljq2, string, f);
        this.cHf.put(ldv2, bah2);
        if (this.cMs < this.cHf.size()) {
            this.cMs = this.cHf.size();
        }
        return bah2;
    }

    bah fN(ldv ldv2) {
        if (!this.cHf.containsKey(ldv2)) {
            lfn.b(5, this.getClass().getSimpleName(), "destroySiegeStone() : Placed Siege-Stone Does Not Exist!!!... Already Destroyed = " + this.cMr.containsKey(ldv2));
            assert (false);
            return null;
        }
        bah bah2 = this.cHf.remove(ldv2);
        this.cMr.put(ldv2, bah2);
        return bah2;
    }

    bah fO(ldv ldv2) {
        if (this.cHf.containsKey(ldv2)) {
            return this.cHf.get(ldv2);
        }
        if (this.cMr.containsKey(ldv2)) {
            return this.cMr.get(ldv2);
        }
        return null;
    }

    Collection<bah> aet() {
        return this.cHf.values();
    }

    int aeu() {
        return this.cHg == null ? 0 : this.cHg.size();
    }

    Set<bao> aev() {
        return this.cHg;
    }

    void s(bao bao2) {
        if (bao2 == null) {
            return;
        }
        if (this.cHg == null) {
            this.cHg = lcn.emx();
        }
        this.cHg.add(bao2);
    }

    void v(bao bao2) {
        if (bao2 == null) {
            return;
        }
        if (this.cHg == null) {
            return;
        }
        this.cHg.remove(bao2);
    }

    public azy k(ayb ayb2) {
        azy azy2 = new azy();
        azy2.fB(this.ade);
        azy2.fa(this.add);
        azy2.jC(bad.j(ayb2));
        azy2.jD(this.cHf.size());
        baa[] baaArray = new baa[this.aeu()];
        int n = 0;
        if (this.cHg != null) {
            for (bao bao2 : this.cHg) {
                baaArray[n] = bao2.aiO();
                ++n;
            }
        }
        azy2.a(baaArray);
        return azy2;
    }

    public azv C(ldz ldz2) {
        if (this.cHh == null) {
            this.cHh = new azv();
            this.cHh.setGUID(this.ade);
        }
        azw[] azwArray = new azw[this.cHf.size()];
        int n = 0;
        for (bah bah2 : this.cHf.values()) {
            azwArray[n++] = bah2.aew();
        }
        this.cHh.jy(this.cGW);
        this.cHh.ax(0.0);
        this.cHh.ay(ldz2.rgz);
        this.cHh.a(azwArray);
        return this.cHh;
    }

    public String toString() {
        String string = "Attacker Challenge GUID = " + this.cMn + ", ID = " + this.cMm;
        String string2 = "Clan = " + this.add + " " + this.ade;
        String string3 = "Cities = " + (this.cMo == null ? "0" : Integer.valueOf(this.cMo.length));
        String string4 = "Siege-Stones Placed = " + this.cHf.size();
        String string5 = "Wager = " + this.aEi;
        return this.getClass().getSimpleName() + " :: " + string + " : " + string2 + " : " + string3 + " : " + string4 + " : " + string5;
    }
}

