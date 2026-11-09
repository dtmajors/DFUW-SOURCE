/*
 * Decompiled with CFR.
 */
public final class jmf {
    private final String Identifier;
    private final jmb nvu;
    private final jmh nvv;
    private jlz nvw;
    private boolean nvx;
    private boolean nvy;
    private int nvz;
    private int kV;
    private int nvA;
    private int nvB;
    private int nvC;
    private short nvD;
    private short nvE;
    private short nuN;
    private int nvF;
    private short nvG;
    private String Name;
    private int nvH;
    private int nvI;
    private int Type;
    private int nvJ;
    private short nuM;
    static boolean nvK = false;
    static boolean nvL = false;
    static boolean nvM = false;

    public jmf(jmb jmb2, joe joe2, int n, int n2) {
        this.nvu = jmb2;
        this.nvz = joe2.dOD();
        this.kV = joe2.getFlags();
        this.nvA = joe2.dOH();
        this.nvB = joe2.dOG();
        this.nvC = joe2.dOF();
        this.nvD = joe2.dOB();
        this.nvE = joe2.dOC();
        this.nuN = joe2.dOA();
        this.nvF = joe2.getDimension();
        this.nvG = joe2.dOE();
        this.Name = joe2.getName();
        this.nvH = joe2.dMu();
        this.nvI = joe2.getAscii();
        this.Type = joe2.getType();
        this.nvJ = joe2.getOffset();
        this.nuM = joe2.dOz();
        switch (this.nvz) {
            case 8: {
                this.nvv = jmh.nvO;
                this.Identifier = "BUTTON_" + n2;
                break;
            }
            case 9: {
                this.nvv = jmh.nvO;
                this.Identifier = jmk.Vl(this.nvH);
                break;
            }
            case 10: {
                this.nvv = jmh.nvP;
                this.Identifier = "POV_" + n2;
                break;
            }
            case 1: {
                this.nvv = jmh.nvP;
                this.Identifier = "XAXIS_" + n2;
                this.nvx = true;
                break;
            }
            case 2: {
                this.nvv = jmh.nvP;
                this.Identifier = "YAXIS_" + n2;
                this.nvx = true;
                break;
            }
            case 3: {
                this.nvv = jmh.nvP;
                this.Identifier = "zAXIS_" + n2;
                break;
            }
            case 4: {
                this.nvv = jmh.nvP;
                this.Identifier = "RXAXIS_" + n2;
                this.nvx = true;
                break;
            }
            case 5: {
                this.nvv = jmh.nvP;
                this.Identifier = "RYAXIS_" + n2;
                this.nvx = true;
                break;
            }
            case 6: {
                this.nvv = jmh.nvP;
                this.Identifier = "RZAXIS_" + n2;
                break;
            }
            case 7: {
                this.nvv = jmh.nvP;
                this.Identifier = "SLIDER_" + n2;
                break;
            }
            default: {
                this.nvv = jmh.nvP;
                this.Identifier = "UNKNOWN_" + n2;
            }
        }
    }

    public String toString() {
        return "InputDeviceObject[" + this.dMs() + "]";
    }

    public final void reset() {
        if (this.dMo()) {
            this.um(false);
        }
        if (this.dMp()) {
            // empty if block
        }
    }

    public final jmh dMn() {
        return this.nvv;
    }

    public final boolean dMo() {
        return this.dMn() == jmh.nvO;
    }

    public final boolean dMp() {
        return this.dMn() == jmh.nvP;
    }

    public final String dMq() {
        return this.Identifier;
    }

    public final String dMr() {
        return this.nvu.getTypeName() + "." + this.Identifier;
    }

    public final String dMs() {
        return this.nvu.getTypeName() + "_" + this.nvu.dLS() + "." + this.Identifier;
    }

    public final boolean dMt() {
        assert (this.dMo());
        return this.nvy;
    }

    public final double aG(ldz ldz2) {
        assert (this.dMp());
        if (this.nvw == null) {
            return 0.0;
        }
        return this.nvw.aD(ldz2);
    }

    void K(int n, int n2, int n3) {
        boolean bl;
        if (this.dMq().contains("ALT")) {
            boolean bl2 = bl = n3 != 0;
            if (bl != nvK) {
                nvK = bl;
                hso.cxK().cxR().cMF();
            }
        }
        if (this.dMq().contains("CTRL")) {
            boolean bl3 = bl = n3 != 0;
            if (bl != nvL) {
                nvL = bl;
                hso.cxK().cxR().cMF();
            }
        }
        if (this.dMq().contains("SHIFT")) {
            boolean bl4 = bl = n3 != 0;
            if (bl != nvM) {
                nvM = bl;
                hso.cxK().cxR().cMF();
            }
        }
        if (this.dMo()) {
            if (!this.nvu.nuJ.dMb() || this.nvz != 9 || !this.nvu.nuJ.dMh() && "KEYBOARD.ESCAPE".equals(this.dMr())) {
                this.um(n3 != 0);
            } else {
                this.um(false);
            }
        } else if (this.dMp()) {
            if (this.nvw == null) {
                this.nvw = new jlz(n3, n);
                this.nvw.uj(this.nvx);
            } else {
                this.nvw.fE(n3, n);
                this.nvu.nuJ.c(this);
            }
        }
    }

    public void uj(boolean bl) {
        if (this.nvw == null) {
            return;
        }
        this.nvw.uj(bl);
    }

    public void lb(float f2) {
        if (this.nvw == null) {
            return;
        }
        this.nvw.dz(f2);
    }

    private void um(boolean bl) {
        this.nvy = bl;
        this.nvu.nuJ.c(this);
    }

    public boolean dLX() {
        return this.nvu.dLX();
    }

    public int dMu() {
        return this.nvH;
    }

    public int dMv() {
        return this.nvI;
    }
}

