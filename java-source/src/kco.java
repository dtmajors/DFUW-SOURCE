/*
 * Decompiled with CFR.
 */
public class kco
extends kcz {
    private boolean joL = true;
    private int di = 0;
    private int hB = 0;
    private int SN = 0;
    private int peb = 0;
    private int SO = 0;
    private boolean pec = false;
    private String hE = null;
    private String ped = null;
    private String SQ = null;
    public String ST = "";
    public int SU = -3;
    public String SV;
    public boolean pee = false;
    public String SP = "";

    public String toString() {
        return this.getClass().getSimpleName() + "-> Connect: " + this.joL + ", NodeID: " + this.di + ", AccountID: " + this.hB + ", CharacterID: " + this.SN + ", AccountName: " + this.hE;
    }

    kco() {
        super(258);
    }

    public boolean dVi() {
        return this.joL;
    }

    public void vf(boolean bl) {
        this.joL = bl;
    }

    public int ib() {
        return this.di;
    }

    public void bN(int n) {
        this.di = n;
    }

    public int aN() {
        return this.hB;
    }

    public void v(int n) {
        this.hB = n;
    }

    public int qe() {
        return this.SN;
    }

    public void cS(int n) {
        this.SN = n;
    }

    public String aR() {
        return this.hE;
    }

    public void G(String string) {
        this.hE = string;
    }

    public String dVj() {
        return this.ped;
    }

    public void wy(String string) {
        this.ped = string;
    }

    public int dVk() {
        return this.peb;
    }

    public void Wr(int n) {
        this.peb = n;
    }

    public boolean lo() {
        return this.pec;
    }

    public void vg(boolean bl) {
        this.pec = bl;
    }

    public int dVl() {
        return this.SO;
    }

    public void Ws(int n) {
        this.SO = n;
    }

    public final String dVm() {
        return this.SQ;
    }

    public final void wz(String string) {
        this.SQ = string;
    }
}

