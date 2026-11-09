/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcw
 */
import java.util.AbstractCollection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

public class job {
    public static final boolean nGF = lcw.enb();
    private static final String[] nGG = new String[]{"Craig", "Mac", "Thanos", "Chris", "Elias-Clan", "George", "Paris", "Tassos", "Tasos", "Geo", "Demos", "Michael", "Erini", "Nicko", "Vele", "Adam", "Vangelis", "Tork", "Al", "Spiros", "Panos", "Vicky", "Anastasia", "Kjetil", "Erik", "Claus", "Henning", "Roman", "Mirco", "Nantia"};
    private static job nGH = null;
    private static lgp nGI = null;
    private int nGJ = 0;
    private String[] nGK = null;
    private int[] nGL = null;
    private int[] nGM = null;
    private ayq[] nGN = null;
    private ays[] nGO = null;
    private bbo[] nGP = null;
    private bcm[] nGQ = null;
    private bcm[] nGR = null;
    private bcm[] nGS = null;
    private bcm[] nGT = null;
    private Map<ldv, aym> nGU = null;

    public static job dOm() {
        if (nGH == null && nGF) {
            nGH = new job();
            nGI = lgp.erA();
        }
        return nGH;
    }

    public boolean dOn() {
        return nGI.cS(nGI.nextFloat());
    }

    public String dOo() {
        int n;
        int n2 = n = (int)(nGI.nextFloat() * (float)(this.nGK.length - 1));
        int n3 = this.nGL[n2];
        this.nGL[n2] = n3 + 1;
        return this.nGK[n] + " " + Integer.toString(n3);
    }

    public String dOp() {
        int n = (int)(nGI.nextFloat() * (float)(nGG.length - 1));
        return nGG[n] + " Aventurine";
    }

    public int dOq() {
        int n = (int)(nGI.nextFloat() * (float)(this.nGM.length - 1));
        return this.nGM[n];
    }

    public int dOr() {
        return (int)(lgp.erA().nextFloat() * 999.0f) + 1;
    }

    public int[] dOs() {
        int[] nArray = new int[7];
        nArray[0] = this.dOr();
        int n = nArray[0];
        block0: while (n > 0) {
            for (int j = 1; j < nArray.length; ++j) {
                if (!this.dOn()) continue;
                int n2 = j;
                nArray[n2] = nArray[n2] + 1;
                if (--n == 0) continue block0;
            }
        }
        return nArray;
    }

    public int[] dOt() {
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        int n = 0;
        boolean bl6 = this.dOn();
        if (bl6) {
            ++n;
        }
        if (bl5 = this.dOn()) {
            ++n;
        }
        if (bl4 = this.dOn()) {
            ++n;
        }
        if (bl3 = this.dOn()) {
            ++n;
        }
        if (bl2 = this.dOn()) {
            ++n;
        }
        if (bl = this.dOn()) {
            ++n;
        }
        int[] nArray = new int[n];
        n = 0;
        if (bl6) {
            nArray[n++] = 1;
        }
        if (bl5) {
            nArray[n++] = 2;
        }
        if (bl4) {
            nArray[n++] = 3;
        }
        if (bl3) {
            nArray[n++] = 4;
        }
        if (bl2) {
            nArray[n++] = 5;
        }
        if (bl) {
            nArray[n++] = 6;
        }
        return nArray;
    }

    public ayq[] dOu() {
        return this.nGN;
    }

    public ays[] dOv() {
        return this.nGO;
    }

    public bbo[] abR() {
        return this.nGP;
    }

    public bcm[] dNM() {
        return this.nGR;
    }

    public bcm[] dOw() {
        return this.nGT;
    }

    public bcm[] dNN() {
        return this.nGS;
    }

    private job() {
    }

    public ldv dOx() {
        return new ldv(lcr.qAC.ib(), lcr.qAC.enw(), ++this.nGJ);
    }

    public void dOy() {
        Set<ayw> set;
        int n;
        this.nGK = new String[nGG.length];
        for (n = 0; n < this.nGK.length; ++n) {
            this.nGK[n] = nGG[n] + "-Clan";
        }
        this.nGL = new int[this.nGK.length];
        this.nGM = new int[10];
        for (n = 0; n < this.nGM.length; ++n) {
            set = EnumSet.noneOf(ayw.class);
            for (ayw ayw2 : ayw.values()) {
                if (!this.dOn()) continue;
                ((AbstractCollection)((Object)set)).add(ayw2);
            }
            this.nGM[n] = ayw.getTags(set);
        }
        this.nGN = new ayq[100];
        this.nGO = ays.abN();
        for (n = 0; n < this.nGN.length; ++n) {
            this.nGN[n] = new ayq(job.dOm());
        }
        this.nGP = new bbo[100];
        for (n = 0; n < this.nGP.length; ++n) {
            this.nGP[n] = new bbo(lcr.qAC, "Test Clan Applicant " + n, (int)(nGI.nextFloat() * 6.0f) + 1, (int)(nGI.nextFloat() * 2.0f) + 1, (int)(nGI.nextFloat() * 10000.0f));
        }
        this.nGQ = new bcm[this.nGO.length];
        Set<bcm> set2 = lcn.emx();
        set = lcn.emx();
        Set set3 = lcn.emx();
        for (int j = 0; j < this.nGO.length; ++j) {
            this.nGQ[j] = new bcm(new ldv(0, 1, j), this.nGO[j].getName(), j % 6 + 1, j % 2 + 1);
            if (this.dOn()) {
                set2.add(this.nGQ[j]);
            }
            if (this.dOn()) {
                set.add((ayw)((Object)this.nGQ[j]));
            }
            if (!this.dOn()) continue;
            set3.add(this.nGQ[j]);
        }
        this.nGR = set2.toArray(new bcm[set2.size()]);
        this.nGS = set.toArray(new bcm[set.size()]);
        this.nGT = set3.toArray(new bcm[set3.size()]);
    }

    public aym w(ayq ayq2) {
        aym aym2;
        aym aym3 = aym2 = this.nGU == null ? null : this.nGU.get(ayq2.iG());
        if (aym2 == null) {
            aym2 = new aym(ayq2);
            if (this.nGU == null) {
                this.nGU = lcn.emw();
            }
            for (aym aym4 : this.nGU.values()) {
                bcr bcr2 = bcr.getValueByOrdinal((int)(nGI.nextFloat() * (float)(bcr.values().length - 1)));
                bcr bcr3 = bcr.getValueByOrdinal((int)(nGI.nextFloat() * (float)(bcr.values().length - 1)));
                aym2.a(aym4, bcr2, bcr3);
            }
            this.nGU.put(ayq2.iG(), aym2);
        }
        return aym2;
    }

    public aym y(bcp bcp2) {
        aym aym2;
        aym aym3 = aym2 = this.nGU == null ? null : this.nGU.get(bcp2.iG());
        if (aym2 == null) assert (false);
        return aym2;
    }
}

