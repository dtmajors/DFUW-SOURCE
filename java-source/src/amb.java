/*
 * Decompiled with CFR.
 */
import java.util.List;

public class amb {
    private int bta;
    private String btb;
    private String btc;
    private String btd;
    private String bte;
    private String btf;
    private String btg;
    private String bth;
    private String bti;
    private String btj;
    private String btk;
    private String btl;
    private String btm;
    private String btn;
    private String bto;
    private String btp;
    private float btq;
    private float btr;
    private float bts;
    private String btt = null;
    private String btu = null;
    private String btv = null;
    private String btw = null;
    private String btx = null;
    private String bty = null;
    private String btz = null;
    private int btA;
    private int btB;
    private int btC;
    private int btD;
    private int btE;
    private int btF;
    private int btG;
    private int btH;
    private int btI;
    private int btJ;
    private int btK;
    private int btL;
    private int btM;
    private int btN;
    private float btO;
    private int btP;
    private float btQ;
    private float btR;
    private float btS;
    private float btT;
    private float btU;
    private float btV;
    private float btW;
    private float btX;
    private float btY;
    private float btZ;
    private float bua;
    private float bub;
    private List<Integer> buc = lcn.abH(20);

    public void cO(String string) {
        int n = this.f(string, true);
        this.buc.add(new Integer(n));
    }

    public String Ew() {
        return lea.enW().getName(this.bta);
    }

    public String Ex() {
        return this.btf;
    }

    public void cP(String string) {
        this.btf = string;
    }

    public String Ey() {
        return this.btd;
    }

    public void cQ(String string) {
        this.btd = string;
    }

    public String Ez() {
        return this.btb;
    }

    public void cR(String string) {
        this.btb = string;
    }

    public String EA() {
        return this.bth;
    }

    public void cS(String string) {
        this.bth = string;
    }

    public String EB() {
        return this.bti;
    }

    public void cT(String string) {
        this.bti = string;
    }

    public String EC() {
        return this.btj;
    }

    public void cU(String string) {
        this.btj = string;
    }

    public String ED() {
        return this.btk;
    }

    public void cV(String string) {
        this.btk = string;
    }

    public String EE() {
        return this.btl;
    }

    public void cW(String string) {
        this.btl = string;
    }

    public String EF() {
        return this.btm;
    }

    public void cX(String string) {
        this.btm = string;
    }

    public String EG() {
        return this.btn;
    }

    public void cY(String string) {
        this.btn = string;
    }

    public String EH() {
        return this.bto;
    }

    public void cZ(String string) {
        this.bto = string;
    }

    public String EI() {
        return this.btg;
    }

    public void da(String string) {
        this.btg = string;
    }

    public String EJ() {
        return this.bte;
    }

    public void db(String string) {
        this.bte = string;
    }

    public String EK() {
        return this.btc;
    }

    public void dc(String string) {
        this.btc = string;
    }

    public int EL() {
        return this.bta;
    }

    public void go(int n) {
        this.bta = n;
    }

    public void EM() {
        this.EO();
        this.EN();
    }

    private void EN() {
        this.btA = this.f(this.btb, true);
        this.btB = this.f(this.btc, true);
        this.btC = this.f(this.btd, true);
        this.btD = this.f(this.bte, true);
        this.btE = this.f(this.btf, true);
    }

    private void EO() {
        this.btF = this.g(this.btg, false);
        this.btG = this.g(this.bth, false);
        this.btH = this.g(this.bti, false);
        this.btI = this.g(this.btj, false);
        this.btJ = this.g(this.btk, false);
        this.btK = this.g(this.btl, false);
        this.btL = this.g(this.btm, false);
        this.btM = this.g(this.btn, false);
        this.btN = this.g(this.bto, false);
        this.btP = this.g(this.btp, false);
    }

    private int f(String string, boolean bl) {
        int n;
        if (string == null || string.equals("")) {
            if (!bl) {
                return -1;
            }
            assert (false);
        }
        if ((n = del.dr(string)) <= 0 && bl) assert (false);
        return n;
    }

    private int g(String string, boolean bl) {
        int n;
        if (string == null || string.equals("")) {
            if (!bl) {
                return -1;
            }
            assert (false);
        }
        if ((n = lea.enW().getType(string)) <= 0 && bl) assert (false);
        return n;
    }

    public int EP() {
        return this.btE;
    }

    public void gp(int n) {
        this.btE = n;
    }

    public int EQ() {
        return this.btC;
    }

    public void gq(int n) {
        this.btC = n;
    }

    public int ER() {
        return this.btB;
    }

    public void gr(int n) {
        this.btB = n;
    }

    public int ES() {
        return this.btA;
    }

    public void gs(int n) {
        this.btA = n;
    }

    public int ET() {
        return this.btG;
    }

    public void gt(int n) {
        this.btG = n;
    }

    public int EU() {
        return this.btH;
    }

    public void gu(int n) {
        this.btH = n;
    }

    public int EV() {
        return this.btI;
    }

    public void gv(int n) {
        this.btI = n;
    }

    public int EW() {
        return this.btJ;
    }

    public void gw(int n) {
        this.btJ = n;
    }

    public int EX() {
        return this.btK;
    }

    public void gx(int n) {
        this.btK = n;
    }

    public int EY() {
        return this.btL;
    }

    public void gy(int n) {
        this.btL = n;
    }

    public int EZ() {
        return this.btM;
    }

    public void gz(int n) {
        this.btM = n;
    }

    public int Fa() {
        return this.btN;
    }

    public void gA(int n) {
        this.btN = n;
    }

    public int Fb() {
        return this.btF;
    }

    public void gB(int n) {
        this.btF = n;
    }

    public int Fc() {
        return this.btD;
    }

    public void gC(int n) {
        this.btD = n;
    }

    public String Fd() {
        return this.btu;
    }

    public void dd(String string) {
        this.btu = string;
    }

    public String Fe() {
        return this.btt;
    }

    public void de(String string) {
        this.btt = string;
    }

    public String Ff() {
        return this.btz;
    }

    public void df(String string) {
        this.btz = string;
    }

    public String Fg() {
        return this.btv;
    }

    public void dg(String string) {
        this.btv = string;
    }

    public String Fh() {
        return this.btx;
    }

    public void dh(String string) {
        this.btx = string;
    }

    public String Fi() {
        return this.btw;
    }

    public void di(String string) {
        this.btw = string;
    }

    public String Fj() {
        return this.bty;
    }

    public void dj(String string) {
        this.bty = string;
    }

    public float Fk() {
        return this.btq;
    }

    public void at(float f2) {
        this.btq = f2;
    }

    public float Fl() {
        return this.btr;
    }

    public void au(float f2) {
        this.btr = f2;
    }

    public float Fm() {
        return this.bts;
    }

    public void av(float f2) {
        this.bts = f2;
    }

    public String Fn() {
        return this.btp;
    }

    public void dk(String string) {
        this.btp = string;
    }

    public int Fo() {
        return this.btP;
    }

    public void gD(int n) {
        this.btP = n;
    }

    public float Fp() {
        return this.btO;
    }

    public void aw(float f2) {
        this.btO = f2;
    }

    public void ax(float f2) {
        this.btQ = f2;
    }

    public float Fq() {
        return this.btQ;
    }

    public void ay(float f2) {
        this.btR = f2;
    }

    public float Fr() {
        return this.btR;
    }

    public void az(float f2) {
        this.btS = f2;
    }

    public float Fs() {
        return this.btS;
    }

    public void aA(float f2) {
        this.btT = f2;
    }

    public float Ft() {
        return this.btT;
    }

    public void aB(float f2) {
        this.btU = f2;
    }

    public float Fu() {
        return this.btU;
    }

    public void aC(float f2) {
        this.btV = f2;
    }

    public float Fv() {
        return this.btV;
    }

    public void aD(float f2) {
        this.btW = f2;
    }

    public float Fw() {
        return this.btW;
    }

    public void aE(float f2) {
        this.btX = f2;
    }

    public float Fx() {
        return this.btX;
    }

    public void aF(float f2) {
        this.btY = f2;
    }

    public float Fy() {
        return this.btY;
    }

    public void aG(float f2) {
        this.btZ = f2;
    }

    public float Fz() {
        return this.btZ;
    }

    public void aH(float f2) {
        this.bua = f2;
    }

    public float FA() {
        return this.bua;
    }

    public void aI(float f2) {
        this.bub = f2;
    }

    public float FB() {
        return this.bub;
    }
}

