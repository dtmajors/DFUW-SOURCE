/*
 * Decompiled with CFR.
 */
public class jew {
    jex mVs;
    private static final int mWl = 1;
    private static final int mWm = 2;
    private static final int mWn = 4;
    private String _name = "Primary";
    private jey mWo = jey.mWP;
    private jeq[] mWp = new jeq[jep.values().length];
    private boolean mWq = false;
    private boolean mWr = false;
    private jet[] mWs = new jet[jep.values().length];
    private jev[] mWt;
    private int[] mWu;
    private boolean[] mWv;
    private boolean[] mWw;
    private boolean[] mWx;
    private int[][] mWy;
    private long[][] mWz;

    public jew() {
        this.mWs[jep.mVz.ordinal()] = jej.mUp;
        this.mWs[jep.mVA.ordinal()] = jej.mUq;
        this.mWs[jep.mVB.ordinal()] = jej.mUr;
        this.mWs[jep.mVC.ordinal()] = jej.mUs;
        this.mWt = new jev[jep.values().length];
        this.mWt[jep.mVz.ordinal()] = jej.mUt;
        this.mWt[jep.mVA.ordinal()] = jej.mUu;
        this.mWt[jep.mVB.ordinal()] = jej.mUv;
        this.mWt[jep.mVC.ordinal()] = jej.mUw;
        this.mWu = new int[lea.epx().aQI()];
        this.mWv = new boolean[lea.epx().aQI()];
        this.mWw = new boolean[lea.epx().aQI()];
        this.mWx = new boolean[lea.epx().aQI()];
        this.mWy = new int[lea.epx().aQI()][];
        this.mWz = new long[lea.epx().aQI()][];
        for (int i = 0; i < lea.epx().aQI(); ++i) {
            this.mWu[i] = -1;
            this.mWv[i] = false;
            this.mWw[i] = false;
            this.mWx[i] = false;
            this.mWy[i] = new int[2];
            this.mWz[i] = new long[2];
            for (int j = 0; j < 2; ++j) {
                this.mWy[i][j] = -1;
                this.mWz[i][j] = -1L;
            }
        }
        this.dAh();
    }

    public jew(String string) {
        this.mWs[jep.mVz.ordinal()] = jej.mUp;
        this.mWs[jep.mVA.ordinal()] = jej.mUq;
        this.mWs[jep.mVB.ordinal()] = jej.mUr;
        this.mWs[jep.mVC.ordinal()] = jej.mUs;
        this.mWt = new jev[jep.values().length];
        this.mWt[jep.mVz.ordinal()] = jej.mUt;
        this.mWt[jep.mVA.ordinal()] = jej.mUu;
        this.mWt[jep.mVB.ordinal()] = jej.mUv;
        this.mWt[jep.mVC.ordinal()] = jej.mUw;
        this.mWu = new int[lea.epx().aQI()];
        this.mWv = new boolean[lea.epx().aQI()];
        this.mWw = new boolean[lea.epx().aQI()];
        this.mWx = new boolean[lea.epx().aQI()];
        this.mWy = new int[lea.epx().aQI()][];
        this.mWz = new long[lea.epx().aQI()][];
        for (int i = 0; i < lea.epx().aQI(); ++i) {
            this.mWu[i] = -1;
            this.mWv[i] = false;
            this.mWw[i] = false;
            this.mWx[i] = false;
            this.mWy[i] = new int[2];
            this.mWz[i] = new long[2];
            for (int j = 0; j < 2; ++j) {
                this.mWy[i][j] = -1;
                this.mWz[i][j] = -1L;
            }
        }
        this.sa(string);
    }

    public jew(jem jem2) {
        this.mWs[jep.mVz.ordinal()] = jej.mUp;
        this.mWs[jep.mVA.ordinal()] = jej.mUq;
        this.mWs[jep.mVB.ordinal()] = jej.mUr;
        this.mWs[jep.mVC.ordinal()] = jej.mUs;
        this.mWt = new jev[jep.values().length];
        this.mWt[jep.mVz.ordinal()] = jej.mUt;
        this.mWt[jep.mVA.ordinal()] = jej.mUu;
        this.mWt[jep.mVB.ordinal()] = jej.mUv;
        this.mWt[jep.mVC.ordinal()] = jej.mUw;
        this.mWu = new int[lea.epx().aQI()];
        this.mWv = new boolean[lea.epx().aQI()];
        this.mWw = new boolean[lea.epx().aQI()];
        this.mWx = new boolean[lea.epx().aQI()];
        this.mWy = new int[lea.epx().aQI()][];
        this.mWz = new long[lea.epx().aQI()][];
        for (int i = 0; i < lea.epx().aQI(); ++i) {
            this.mWu[i] = -1;
            this.mWv[i] = false;
            this.mWw[i] = false;
            this.mWx[i] = false;
            this.mWy[i] = new int[2];
            this.mWz[i] = new long[2];
            for (int j = 0; j < 2; ++j) {
                this.mWy[i][j] = -1;
                this.mWz[i][j] = -1L;
            }
        }
        this.dAh();
        this.b(jem2);
    }

    public String fk() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this._name);
        stringBuffer.append(';');
        stringBuffer.append(this.mWo.ordinal());
        for (jep jep2 : jep.values()) {
            stringBuffer.append(';');
            stringBuffer.append(this.mWp[jep2.ordinal()] != null ? this.mWp[jep2.ordinal()].ordinal() : -1);
        }
        for (jep jep2 : jep.values()) {
            stringBuffer.append(';');
            stringBuffer.append(this.mWs[jep2.ordinal()].ordinal());
        }
        for (jep jep2 : jep.values()) {
            stringBuffer.append(';');
            stringBuffer.append(this.mWt[jep2.ordinal()].ordinal());
        }
        for (int i = 0; i < lea.epx().aQI(); ++i) {
            stringBuffer.append(';');
            stringBuffer.append(this.mWu[i]);
            int n = 0;
            if (this.mWx[i]) {
                n |= 4;
            }
            if (this.mWv[i]) {
                n |= 1;
            }
            if (this.mWw[i]) {
                n |= 2;
            }
            stringBuffer.append(';');
            stringBuffer.append(n);
            for (int j = 0; j < 2; ++j) {
                stringBuffer.append(';');
                stringBuffer.append(this.mWy[i][j]);
                stringBuffer.append(';');
                stringBuffer.append(this.mWz[i][j]);
            }
        }
        return stringBuffer.toString();
    }

    public void sa(String string) {
        int n;
        if (string == null || string.length() == 0) {
            return;
        }
        String[] stringArray = string.split(";");
        int n2 = 0;
        this._name = stringArray[n2++];
        this.mWo = jey.values()[Integer.valueOf(stringArray[n2++])];
        for (jep jep2 : jep.values()) {
            n = Integer.valueOf(stringArray[n2++]);
            this.mWp[jep2.ordinal()] = n >= 0 ? jeq.values()[n] : null;
        }
        for (jep jep2 : jep.values()) {
            n = Integer.valueOf(stringArray[n2++]);
            this.mWs[jep2.ordinal()] = jet.values()[n];
        }
        for (jep jep2 : jep.values()) {
            n = Integer.valueOf(stringArray[n2++]);
            this.mWt[jep2.ordinal()] = jev.values()[n];
        }
        for (int i = 0; i < lea.epx().aQI(); ++i) {
            try {
                String string2 = stringArray[n2++];
                this.mWu[i] = Integer.valueOf(string2);
                int n3 = Integer.valueOf(stringArray[n2++]);
                this.mWv[i] = (n3 & 1) == 1;
                this.mWw[i] = (n3 & 2) == 2;
                this.mWx[i] = (n3 & 4) == 4;
                for (int j = 0; j < 2; ++j) {
                    n = -1;
                    long l2 = -1L;
                    try {
                        n = Integer.valueOf(stringArray[n2++]);
                        l2 = Long.valueOf(stringArray[n2++]);
                    }
                    catch (Throwable throwable) {
                        lfn.b(5, this.getClass().getSimpleName(), "retrieving type and persistent id of weapon; exception = " + throwable.getMessage());
                    }
                    this.mWy[i][j] = n;
                    this.mWz[i][j] = l2;
                }
                continue;
            }
            catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                lfn.b(5, this.getClass().getSimpleName(), " ArrayIndexOutOfBoundsException  index = " + n2 + " RC = " + string + " Configuration name = " + this._name);
            }
        }
        this.dAi();
    }

    public void sb(String string) {
        int n;
        if (string == null || string.length() == 0) {
            return;
        }
        int n2 = 2;
        String[] stringArray = string.split(";");
        if (n2 >= stringArray.length) {
            return;
        }
        for (jep jep2 : jep.values()) {
            n = Integer.valueOf(stringArray[n2++]);
            this.mWp[jep2.ordinal()] = n >= 0 ? jeq.values()[n] : null;
        }
        for (jep jep2 : jep.values()) {
            n = Integer.valueOf(stringArray[n2++]);
            this.mWs[jep2.ordinal()] = jet.values()[n];
        }
        for (jep jep2 : jep.values()) {
            n = Integer.valueOf(stringArray[n2++]);
            this.mWt[jep2.ordinal()] = jev.values()[n];
        }
        this.dAi();
    }

    public void sc(String string) {
        if (string == null || string.length() == 0) {
            return;
        }
        int n = 14;
        String[] stringArray = string.split(";");
        if (n >= stringArray.length) {
            return;
        }
        try {
            for (int i = 0; i < lea.epx().aQI(); ++i) {
                int n2;
                this.mWu[i] = Integer.valueOf(stringArray[n++]);
                this.mWv[i] = ((n2 = Integer.valueOf(stringArray[n++]).intValue()) & 1) == 1;
                this.mWw[i] = (n2 & 2) == 2;
                this.mWx[i] = (n2 & 4) == 4;
                for (int j = 0; j < 2; ++j) {
                    this.mWy[i][j] = Integer.valueOf(stringArray[n++]);
                    this.mWz[i][j] = Long.valueOf(stringArray[n++]);
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            lfn.b(5, this.getClass().getSimpleName(), " ArrayIndexOutOfBoundsException  index = " + n + " RC = " + string + " Configuration name = " + this._name);
        }
        this.dAi();
    }

    public void b(jem jem2) {
        Object object;
        if (this.mWq) {
            return;
        }
        for (jep jep2 : jep.values()) {
            object = jem2.dzC().f(jep2);
            this.mWp[jep2.ordinal()] = object != null ? ((jeo)object).dzP() : null;
            this.mWs[jep2.ordinal()] = jem2.dzD().j(jep2);
            this.mWt[jep2.ordinal()] = jem2.dzD().l(jep2);
        }
        for (int i = 0; i < lea.epx().aQI(); ++i) {
            jfd jfd2 = jem2.dzE().Ur(i);
            jfc jfc2 = jfd2.dAu();
            this.mWu[i] = jfc2 != null ? jfc2.cCs().awE().getType() : -1;
            this.mWv[i] = jfd2.dAw();
            this.mWx[i] = jfd2.dAx();
            this.mWw[i] = jfd2.dAy();
            for (int j = 0; j < 2; ++j) {
                object = jfd2.dAv();
                hwo hwo2 = object != null ? ((jfa)object).Ql(j) : null;
                int n = jfa.q(hwo2);
                long l2 = jfa.r(hwo2);
                this.mWy[i][j] = n;
                this.mWz[i][j] = l2;
            }
        }
        this.dAi();
    }

    public void c(jem jem2) {
        this.mWq = true;
        for (jep jep2 : jep.values()) {
            jem2.dzC().d(jep2, this.mWp[jep2.ordinal()]);
            jem2.dzD().a(jep2, this.mWs[jep2.ordinal()]);
            jem2.dzD().a(jep2, this.mWt[jep2.ordinal()]);
        }
        for (int i = 0; i < lea.epx().aQI(); ++i) {
            jfd jfd2 = jem2.dzE().Ur(i);
            jfd2.b(this.mWu[i] != -1 ? jfd.d(jfd.Un(this.mWu[i])) : null);
            jfd2.tf(this.mWw[i]);
            jfd2.td(this.mWv[i]);
            jfd2.te(this.mWx[i]);
            jfa jfa2 = new jfa();
            for (int j = 0; j < 2; ++j) {
                long l2 = this.mWz[i][j];
                int n = this.mWy[i][j];
                bsh bsh2 = jfd.b(l2, n);
                if (bsh2 != null) {
                    jfa2.b(j, new hwo(bsh2));
                    continue;
                }
                lgw lgw2 = (lgw)lea.enW().acv(n);
                if (lgw2 != null) {
                    jfa2.b(j, new hwo(lgw2, l2));
                    continue;
                }
                jfa2.b(j, null);
            }
            jfd2.a(jfa2);
        }
        this.mWq = false;
    }

    public String getName() {
        return this._name;
    }

    public jey dzY() {
        return this.mWo;
    }

    public jeq n(jep jep2) {
        return this.mWp[jep2.ordinal()];
    }

    public jet o(jep jep2) {
        return this.mWs[jep2.ordinal()];
    }

    public jev p(jep jep2) {
        return this.mWt[jep2.ordinal()];
    }

    public int Uf(int n) {
        return this.mWu[n];
    }

    public boolean Ug(int n) {
        return this.mWv[n];
    }

    public boolean Uh(int n) {
        return this.mWw[n];
    }

    public boolean Ui(int n) {
        return this.mWx[n];
    }

    public int fq(int n, int n2) {
        return this.mWy[n][n2];
    }

    public long fr(int n, int n2) {
        return this.mWz[n][n2];
    }

    public int dzZ() {
        return this.mVs.g(this);
    }

    public jex dzN() {
        return this.mVs;
    }

    public void a(String string, jey jey2) {
        boolean bl = !string.equalsIgnoreCase(this._name);
        boolean bl2 = this.mWo != jey2;
        this._name = string;
        this.mWo = jey2;
        boolean bl3 = this.mWr = bl || bl2 || this.mWr;
        if (bl) {
            jen.dzL().mVh.k(this, this.dzZ());
        }
        if (bl2) {
            jen.dzL().mVi.k(this, this.dzZ());
        }
        jen.dzL().mVk.k(this, this.dzZ());
    }

    public void dAa() {
        this.mVs.h(this);
    }

    public void save() {
        this.mWr = false;
        jen.dzL().mVk.k(this, this.dzZ());
        this.mVs.dzB().mVf.k(this, this.dzZ());
    }

    public boolean dAb() {
        return this.mVs.dAj() > 1 && this != this.mVs.dAl();
    }

    public boolean isActive() {
        return this.mVs.dAk() == this;
    }

    public void dAc() {
        this.sa(hso.cxK().cxP().cyJ().cIO().nj("RC" + this.dzZ()));
        this.c(jen.dzL().dzM());
    }

    public void dAd() {
        this.sb(hso.cxK().cxP().cyJ().cIO().nj("RC" + this.dzZ()));
        this.c(jen.dzL().dzM());
    }

    public void dAe() {
        this.sc(hso.cxK().cxP().cyJ().cIO().nj("RC" + this.dzZ()));
        this.c(jen.dzL().dzM());
    }

    public boolean dzG() {
        return this.mWr;
    }

    public boolean dAf() {
        return this.mVs.dAl() == this;
    }

    public void dAg() {
        for (jep jep2 : jep.values()) {
            this.mWp[jep2.ordinal()] = null;
        }
        this.save();
    }

    private void dAh() {
        int n = jen.dzL().dzN().dAj();
        this._name = n == 0 ? "Primary" : "Blueprint " + (n + 1);
    }

    private void dAi() {
        String string;
        boolean bl;
        if (this.mVs == null) {
            return;
        }
        String string2 = hso.cxK().cxP().cyJ().cIO().nj("RC" + this.dzZ());
        boolean bl2 = bl = !string2.equals(string = this.fk());
        if (bl != this.mWr) {
            this.mWr = bl;
            jen.dzL().mVk.k(this, this.dzZ());
        }
    }
}

