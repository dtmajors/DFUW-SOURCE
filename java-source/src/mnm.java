/*
 * Decompiled with CFR.
 */
import java.awt.Color;

public class mnm {
    private mnp DPG = mnp.DQp;
    private boolean daR = true;
    private Color DPH = Color.decode("0x5F00A1");
    private Color DPI = Color.WHITE;
    private boolean DPJ = false;
    private float DPK = 0.5f;
    private boolean DPL = false;
    private boolean DPM = false;
    private boolean DPN = false;
    private boolean DPO = false;
    private boolean DPP = false;
    private boolean DPQ = false;
    private boolean DPR = false;
    private boolean DPS = false;
    private boolean DPT = false;
    private boolean DPU = false;
    private boolean DPV = false;
    private boolean DPW = false;
    private boolean DPX = false;
    private boolean DPY = false;
    private boolean DPZ = false;
    private boolean DQa = false;
    private boolean DQb = false;
    private boolean DQc = false;
    private long DQd = 0L;
    private long DQe = 1000L;

    public mnp eGs() {
        return this.DPG;
    }

    public void a(mnp mnp2) {
        this.DPG = mnp2 == null ? mnp.DQp : mnp2;
    }

    public boolean eGt() {
        return this.daR;
    }

    public void setShowGrid(boolean bl) {
        this.daR = bl;
    }

    public Color eGu() {
        return this.DPH;
    }

    public void b(Color color) {
        this.DPH = color == null ? Color.GRAY : color;
    }

    public Color eGv() {
        return this.DPI;
    }

    public void c(Color color) {
        this.DPI = color == null ? Color.WHITE : color;
    }

    public boolean eGw() {
        return this.DPJ;
    }

    public void zx(boolean bl) {
        this.DPJ = bl;
    }

    public float eGx() {
        return this.DPK;
    }

    public void oy(float f2) {
        this.DPK = f2 >= 0.0f && f2 <= 1.0f ? f2 : this.DPK;
    }

    public boolean eGy() {
        return this.DPL;
    }

    public void zy(boolean bl) {
        this.DPL = bl;
    }

    public boolean eGz() {
        return this.DPM;
    }

    public void zz(boolean bl) {
        this.DPM = bl;
    }

    public boolean eGA() {
        return this.DPN;
    }

    public boolean eGB() {
        return this.DPO;
    }

    public void w(boolean bl, boolean bl2) {
        this.DPN = bl;
        this.DPO = bl2;
    }

    public boolean eGC() {
        return this.DPP;
    }

    public boolean eGD() {
        return this.DPQ;
    }

    public void x(boolean bl, boolean bl2) {
        this.DPP = bl;
        this.DPQ = bl2;
    }

    public boolean eGE() {
        return this.DPR;
    }

    public boolean eGF() {
        return this.DPS;
    }

    public void y(boolean bl, boolean bl2) {
        this.DPR = bl;
        this.DPS = bl2;
    }

    public boolean eGG() {
        return this.DPT;
    }

    public boolean eGH() {
        return this.DPU;
    }

    public boolean eGI() {
        return this.DPV;
    }

    public boolean eGJ() {
        return this.DPW;
    }

    public void z(boolean bl, boolean bl2) {
        this.DPT = bl;
        this.DPU = bl2;
    }

    public void A(boolean bl, boolean bl2) {
        this.DPV = bl;
        this.DPW = bl2;
    }

    public boolean eGK() {
        return this.DPX;
    }

    public boolean eGL() {
        return this.DPY;
    }

    public void B(boolean bl, boolean bl2) {
        this.DPX = bl;
        this.DPY = bl2;
    }

    public boolean eGM() {
        return this.DPZ;
    }

    public boolean eGN() {
        return this.DQa;
    }

    public void C(boolean bl, boolean bl2) {
        this.DPZ = bl;
        this.DQa = bl2;
    }

    public boolean a(mnx mnx2) {
        if (mnx2 == null) {
            return false;
        }
        switch (mnx2) {
            case DRn: {
                return this.DPS;
            }
            case DRi: {
                return this.DPQ;
            }
            case DRh: {
                return this.DPO;
            }
            case DRm: {
                return this.DQa;
            }
            case DRk: {
                return this.DPU;
            }
            case DRl: {
                return this.DPW;
            }
            case DRj: {
                return this.DPY;
            }
        }
        return false;
    }

    public boolean eGO() {
        return this.DQb;
    }

    public void zw(boolean bl) {
        this.DQb = bl;
    }

    public boolean eGP() {
        return this.DQc;
    }

    public void zA(boolean bl) {
        this.DQc = bl;
    }

    public long eGQ() {
        return this.DQd;
    }

    public long eGR() {
        return this.DQe;
    }

    public void c(long l, long l2) {
        this.DQd = l >= 0L ? l : 0L;
        this.DQe = l2 >= 1000L ? l2 : 1000L;
    }
}

