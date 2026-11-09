/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Map;

public class amj {
    protected int bxF = -1;
    protected float bxG = 5.0f;
    protected List<amk> bxH = lcn.emv();
    protected Map<String, String> bxI = lcn.emw();
    protected List<a> bxJ = lcn.emv();
    protected Map<Integer, b> bxK = lcn.emw();
    protected String btb = "";
    protected int btA = -1;
    protected String bte = "";
    protected int btD = -1;
    protected String btf = "";
    protected int btE = -1;
    protected String btc = "";
    protected int btB = -1;
    protected String btd = "";
    protected int btC = -1;
    protected String btt = "";
    protected String btu = "";
    protected String btv = "";
    protected String btw = "";
    protected String btx = "";
    protected String bty = "";
    protected String btz = "";
    protected float bxL;
    protected float bxM;
    protected float bxN;
    protected float bxO;
    protected float bxP;
    protected float bxQ;
    protected float bxR;
    protected float bxS;
    protected float bxT;
    protected float bxU;
    protected float bxV;
    protected float bxW;
    protected float bxX;
    protected float bts;
    protected float btr;
    protected float btq;
    protected float bxY = 0.1f;

    public int FY() {
        return this.bxF;
    }

    public void gN(int n) {
        this.bxF = n;
    }

    public float FZ() {
        return this.bxG;
    }

    public void aP(float f2) {
        this.bxG = f2;
    }

    public int ES() {
        return this.btA;
    }

    public int Fc() {
        return this.btD;
    }

    public void gC(int n) {
        this.btD = n;
    }

    public int EP() {
        return this.btE;
    }

    public void cR(String string) {
        this.btb = string;
    }

    public void db(String string) {
        this.bte = string;
    }

    public void cP(String string) {
        this.btf = string;
    }

    public String Fe() {
        return this.btt;
    }

    public void de(String string) {
        this.btt = string;
    }

    public String Fd() {
        return this.btu;
    }

    public void dd(String string) {
        this.btu = string;
    }

    public String Fg() {
        return this.btv;
    }

    public void dg(String string) {
        this.btv = string;
    }

    public String Fi() {
        return this.btw;
    }

    public void di(String string) {
        this.btw = string;
    }

    public String Fh() {
        return this.btx;
    }

    public void dh(String string) {
        this.btx = string;
    }

    public String Fj() {
        return this.bty;
    }

    public void dj(String string) {
        this.bty = string;
    }

    public String Ff() {
        return this.btz;
    }

    public void df(String string) {
        this.btz = string;
    }

    public String EK() {
        return this.btc;
    }

    public void dc(String string) {
        this.btc = string;
    }

    public int ER() {
        return this.btB;
    }

    public void gr(int n) {
        this.btB = n;
    }

    public String Ey() {
        return this.btd;
    }

    public void cQ(String string) {
        this.btd = string;
    }

    public int EQ() {
        return this.btC;
    }

    public void gq(int n) {
        this.btC = n;
    }

    public String Ez() {
        return this.btb;
    }

    public String EJ() {
        return this.bte;
    }

    public String Ex() {
        return this.btf;
    }

    public void gs(int n) {
        this.btA = n;
    }

    public void gp(int n) {
        this.btE = n;
    }

    public float Ga() {
        return this.bxL;
    }

    public void aQ(float f2) {
        this.bxL = f2;
    }

    public float Gb() {
        return this.bxM;
    }

    public void aR(float f2) {
        this.bxM = f2;
    }

    public float Gc() {
        return this.bxN;
    }

    public void aS(float f2) {
        this.bxN = f2;
    }

    public float Gd() {
        return this.bxO;
    }

    public void aT(float f2) {
        this.bxO = f2;
    }

    public float Ge() {
        return this.bxP;
    }

    public void aU(float f2) {
        this.bxP = f2;
    }

    public float Gf() {
        return this.bxQ;
    }

    public void aV(float f2) {
        this.bxQ = f2;
    }

    public float Gg() {
        return this.bxR;
    }

    public void aW(float f2) {
        this.bxR = f2;
    }

    public float Gh() {
        return this.bxS;
    }

    public void aX(float f2) {
        this.bxS = f2;
    }

    public float Gi() {
        return this.bxT;
    }

    public void aY(float f2) {
        this.bxT = f2;
    }

    public float Gj() {
        return this.bxV;
    }

    public void aZ(float f2) {
        this.bxV = f2;
    }

    public float Gk() {
        return this.bxW;
    }

    public void ba(float f2) {
        this.bxW = f2;
    }

    public float Gl() {
        return this.bxX;
    }

    public void bb(float f2) {
        this.bxX = f2;
    }

    public float Gm() {
        return this.bxU;
    }

    public void bc(float f2) {
        this.bxU = f2;
    }

    public List<amk> Gn() {
        return this.bxH;
    }

    public void P(List<amk> list) {
        this.bxH = list;
    }

    public Map<String, String> Go() {
        return this.bxI;
    }

    public void p(Map<String, String> map) {
        this.bxI = map;
    }

    public void update() {
        this.btA = this.f(this.btb, true);
        this.btD = this.f(this.bte, true);
        this.btB = this.f(this.btc, true);
        this.btC = this.f(this.btd, true);
        this.btE = this.f(this.btf, true);
        for (b b2 : this.bxK.values()) {
            b2.byf = this.f(b2.bye, true);
        }
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

    public List<a> Gp() {
        return this.bxJ;
    }

    public void Q(List<a> list) {
        this.bxJ = list;
    }

    public float Fm() {
        return this.bts;
    }

    public void av(float f2) {
        this.bts = f2;
    }

    public float Fl() {
        return this.btr;
    }

    public void au(float f2) {
        this.btr = f2;
    }

    public float Fk() {
        return this.btq;
    }

    public void at(float f2) {
        this.btq = f2;
    }

    public Map<Integer, b> Gq() {
        return this.bxK;
    }

    public float Gr() {
        return this.bxY;
    }

    public void bd(float f2) {
        this.bxY = f2;
    }
}

