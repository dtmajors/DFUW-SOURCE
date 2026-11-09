/*
 * Decompiled with CFR.
 */
public class fgk
extends fgp {
    private int[] iLM = null;
    private int[] iLN = null;
    private int[] iLO = null;
    private int[] iLP = null;
    private int[] iLQ = null;
    private int[] duz = null;
    private int[] dhp = null;
    private float[] iLR = null;
    private String[] iLS = null;
    private int[] iLT = null;
    private int[] iLU = null;
    private ljq[] iLV = null;
    private int[] iLW = null;
    private String[] iLX = null;
    private int[] iLY = null;

    public jd[] bPd() {
        jd[] jdArray = new jd[this.iLM.length];
        for (int j = 0; j < this.iLM.length; ++j) {
            jdArray[j] = jd.getValueByOrdinal(this.iLM[j]);
        }
        return jdArray;
    }

    public void a(jd[] jdArray) {
        if (jdArray == null) {
            this.iLM = new int[0];
            return;
        }
        this.iLM = new int[jdArray.length];
        for (int j = 0; j < jdArray.length; ++j) {
            this.iLM[j] = jdArray[j] == null ? jd.ajB.ordinal() : jdArray[j].ordinal();
        }
    }

    public je[] bPe() {
        je[] jeArray = new je[this.iLN.length];
        for (int j = 0; j < this.iLN.length; ++j) {
            jeArray[j] = je.getValueByOrdinal(this.iLN[j]);
        }
        return jeArray;
    }

    public void a(je[] jeArray) {
        if (jeArray == null) {
            this.iLN = new int[0];
            return;
        }
        this.iLN = new int[jeArray.length];
        for (int j = 0; j < jeArray.length; ++j) {
            this.iLN[j] = jeArray[j] == null ? je.ajN.ordinal() : jeArray[j].ordinal();
        }
    }

    public jb[] bPf() {
        jb[] jbArray = new jb[this.iLO.length];
        for (int j = 0; j < this.iLO.length; ++j) {
            jbArray[j] = jb.getValueByOrdinal(this.iLO[j]);
        }
        return jbArray;
    }

    public void a(jb[] jbArray) {
        if (jbArray == null) {
            this.iLO = new int[0];
            return;
        }
        this.iLO = new int[jbArray.length];
        for (int j = 0; j < jbArray.length; ++j) {
            this.iLO[j] = jbArray[j] == null ? jb.aja.ordinal() : jbArray[j].ordinal();
        }
    }

    public bbs[] bPg() {
        bbs[] bbsArray = new bbs[this.iLP.length];
        for (int j = 0; j < this.iLP.length; ++j) {
            bbsArray[j] = bbs.getValueByOrdinal(this.iLP[j]);
        }
        return bbsArray;
    }

    public void a(bbs[] bbsArray) {
        if (bbsArray == null) {
            this.iLP = new int[0];
            return;
        }
        this.iLP = new int[bbsArray.length];
        for (int j = 0; j < bbsArray.length; ++j) {
            this.iLP[j] = bbsArray[j] == null ? bbs.NoRank.ordinal() : bbsArray[j].ordinal();
        }
    }

    public ja[] bPh() {
        ja[] jaArray = new ja[this.iLQ.length];
        for (int j = 0; j < this.iLQ.length; ++j) {
            jaArray[j] = ja.getValueByOrdinal(this.iLQ[j]);
        }
        return jaArray;
    }

    public void a(ja[] jaArray) {
        if (jaArray == null) {
            this.iLQ = new int[0];
            return;
        }
        this.iLQ = new int[jaArray.length];
        for (int j = 0; j < jaArray.length; ++j) {
            this.iLQ[j] = jaArray[j] == null ? ja.aiS.ordinal() : jaArray[j].ordinal();
        }
    }

    public int[] btg() {
        return this.duz;
    }

    public void M(int[] nArray) {
        this.duz = nArray;
    }

    public int[] bPi() {
        return this.dhp;
    }

    public void ae(int[] nArray) {
        this.dhp = nArray;
    }

    public float[] bPj() {
        return this.iLR;
    }

    public void i(float[] fArray) {
        this.iLR = fArray;
    }

    public String[] bPk() {
        return this.iLS;
    }

    public void u(String[] stringArray) {
        this.iLS = stringArray;
    }

    public int[] bPl() {
        return this.iLT;
    }

    public void af(int[] nArray) {
        this.iLT = nArray;
    }

    public int[] bPm() {
        return this.iLU;
    }

    public void ag(int[] nArray) {
        this.iLU = nArray;
    }

    public ljq[] bPn() {
        return this.iLV;
    }

    public void h(ljq[] ljqArray) {
        this.iLV = ljqArray;
    }

    public int[] bPo() {
        return this.iLW;
    }

    public void ah(int[] nArray) {
        this.iLW = nArray;
    }

    public String[] bPp() {
        return this.iLX;
    }

    public void v(String[] stringArray) {
        this.iLX = stringArray;
    }

    public int[] bPq() {
        return this.iLY;
    }

    public void ai(int[] nArray) {
        this.iLY = nArray;
    }

    fgk() {
        super(29451);
    }

    public String GE(int n) {
        if (this.iLT == null || n < 0 || n >= this.iLT.length) {
            return null;
        }
        if (this.iLS == null || this.iLT[n] < 0 || this.iLT[n] >= this.iLS.length) {
            return null;
        }
        return this.iLS[this.iLT[n]];
    }

    public ljq GF(int n) {
        if (this.iLW == null || n < 0 || n >= this.iLW.length) {
            return null;
        }
        if (this.iLV == null || this.iLW[n] < 0 || this.iLW[n] >= this.iLV.length) {
            return null;
        }
        return this.iLV[this.iLW[n]];
    }

    public String GG(int n) {
        if (this.iLY == null || n < 0 || n >= this.iLY.length) {
            return null;
        }
        if (this.iLX == null || this.iLY[n] < 0 || this.iLY[n] >= this.iLX.length) {
            return null;
        }
        return this.iLX[this.iLY[n]];
    }
}

