/*
 * Decompiled with CFR.
 */
public class eeg
extends eea
implements dxu {
    private int aqs = -1;
    private String YU = null;
    private String YV = null;
    private String add = null;
    private ldv ade = null;
    private String YW = null;
    private String YX = null;
    private int Qw = 0;
    private int YY = 0;
    private int YZ = 0;
    private ldv cRI = null;
    private int inu = 0;
    private boolean adc = false;
    private int RB = -1;
    private ldv hC = null;
    private int ccY = hc.aaz.ordinal();
    private boolean inv = false;
    private ljq Position = null;
    private boolean Zd = false;
    private boolean inw = false;
    private int aFH = 0;
    private int aFI = 0;
    private int inx = bbs.NoRank.ordinal();
    private bcb awU = null;
    private double eOZ = -1.0;
    private float[] iny = null;

    public final boolean qj() {
        return this.inv;
    }

    public final void jY(boolean bl) {
        this.inv = bl;
    }

    public String iP() {
        return this.YU;
    }

    public void aM(String string) {
        this.YU = string;
    }

    public String iR() {
        return this.YV;
    }

    public void aN(String string) {
        this.YV = string;
    }

    public String iV() {
        return this.add;
    }

    public void cD(String string) {
        this.add = string;
    }

    public String iX() {
        return this.YW;
    }

    public void aP(String string) {
        this.YW = string;
    }

    public String iW() {
        return this.YX;
    }

    public void aO(String string) {
        this.YX = string;
    }

    public int getAlignment() {
        return this.Qw;
    }

    public void setAlignment(int n2) {
        this.Qw = n2;
    }

    public int js() {
        return this.YY;
    }

    public void jX(int n2) {
        this.YY = n2;
    }

    @Override
    public void sk(int n2) {
        this.aqs = n2;
    }

    @Override
    public int aVk() {
        return this.aqs;
    }

    public int jt() {
        return this.YZ;
    }

    public void jY(int n2) {
        this.YZ = n2;
    }

    public ldv iG() {
        return this.ade;
    }

    public void ch(ldv ldv2) {
        this.ade = ldv2;
    }

    public ldv jM() {
        return this.cRI;
    }

    public void oK(ldv ldv2) {
        this.cRI = ldv2;
    }

    public int bGa() {
        return this.inu;
    }

    public void DS(int n2) {
        this.inu = n2;
    }

    public boolean qf() {
        return this.adc;
    }

    public void ac(boolean bl) {
        this.adc = bl;
    }

    public int jr() {
        return this.RB;
    }

    public void bU(int n2) {
        this.RB = n2;
    }

    public ldv aP() {
        return this.hC;
    }

    public void g(ldv ldv2) {
        this.hC = ldv2;
    }

    public int bGb() {
        return this.ccY;
    }

    public void DT(int n2) {
        this.ccY = n2;
    }

    public ljq av() {
        return this.Position;
    }

    public void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public boolean kv() {
        return this.Zd;
    }

    public void jZ(boolean bl) {
        this.Zd = bl;
    }

    public int abF() {
        return this.aFH;
    }

    public void jZ(int n2) {
        this.aFH = n2;
    }

    public int bGc() {
        return this.aFI;
    }

    public void DU(int n2) {
        this.aFI = n2;
    }

    public bbs kE() {
        return bbs.getValueByOrdinal(this.inx);
    }

    public void c(bbs bbs2) {
        this.inx = bbs2 == null ? this.inx : bbs2.ordinal();
    }

    public bcb kD() {
        return this.awU;
    }

    public void c(bcb bcb2) {
        this.awU = bcb2;
    }

    public boolean bGd() {
        return this.inw;
    }

    public void ka(boolean bl) {
        this.inw = bl;
    }

    public float[] bGe() {
        return this.iny;
    }

    public void f(float[] fArray) {
        this.iny = fArray;
    }

    public final double bGf() {
        return this.eOZ;
    }

    public final void cd(double d2) {
        this.eOZ = d2;
    }

    eeg() {
        super(12812);
    }
}

