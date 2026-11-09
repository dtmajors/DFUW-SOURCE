/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
public class amn {
    private int byN = -1;
    private String btb = "";
    private int btA = 0;
    private String btf = "";
    private int btE = 0;
    private String bte = "";
    private int byO = 0;
    private String btd = "";
    private int btC = 0;
    private String btc = "";
    private int btB = 0;
    private String byP = "";
    private int byQ = 0;
    private String byR = "";
    private int byS = 0;
    private float byT = -1.0f;
    private String byU = "";
    private String byV = "";
    private String byW = "";
    private String byX = "";
    private String byY = "";
    private String btt = null;
    private String btu = null;
    private String btv = null;
    private String btw = null;
    private String btx = null;
    private String bty = null;
    private String btz = null;
    private float btq;
    private float btr;
    private float bts;
    private float byZ = 0.1f;
    private float bza = 0.1f;
    private float bzb = 0.1f;
    private float bzc = 0.1f;
    private float bzd = 0.1f;
    private float bze = 0.1f;
    private float bzf = 0.1f;
    private float bzg = 0.0f;
    private float bzh = 0.0f;
    private float bzi = 0.0f;
    private float bzj = 0.0f;
    private int bzk = -1;
    private int bzl = -1;
    private float bzm = 1.0f;

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

    public String EJ() {
        return this.bte;
    }

    public void db(String string) {
        this.bte = string;
    }

    public int GQ() {
        return this.byN;
    }

    public void hc(int n) {
        this.byN = n;
    }

    public String GR() {
        return lea.enW().getName(this.byN);
    }

    public String GS() {
        return this.byP;
    }

    public void dt(String string) {
        this.byP = string;
    }

    public void EM() {
        this.EO();
        this.EN();
    }

    private int g(String string, boolean bl) {
        int n;
        if (string == null || string.equals("")) {
            if (!bl) {
                return -1;
            }
            lfn.b(5, "SFWaterVesselInfo", "getResourceType() Unknown ResourceName: " + string);
            assert (false);
        }
        if ((n = lea.enW().getType(string)) <= 0 && bl) {
            lfn.b(5, "SFWaterVesselInfo", "getResourceType() Unknown ResourceName: " + string);
            assert (false);
        }
        return n;
    }

    private void EO() {
        this.bzk = this.g(this.byU, false);
        this.bzl = this.g(this.byV, false);
    }

    private void EN() {
        this.btA = del.dr(this.btb);
        if (this.btA <= 0) {
            lfn.b(5, "SFWaterVesselInfo", "checkEffectValues() Unknown Effect: " + this.btb);
            assert (false);
        }
        this.byO = del.dr(this.bte);
        if (this.byO <= 0) {
            lfn.b(5, "SFWaterVesselInfo", "checkEffectValues() Unknown Effect: " + this.bte);
            assert (false);
        }
        this.btB = del.dr(this.btc);
        if (this.btB <= 0) {
            lfn.b(5, "SFWaterVesselInfo", "checkEffectValues() Unknown Effect: " + this.btc);
            assert (false);
        }
        this.btC = del.dr(this.btd);
        if (this.btC <= 0) {
            lfn.b(5, "SFWaterVesselInfo", "checkEffectValues() Unknown Effect: " + this.btd);
            assert (false);
        }
        this.byQ = del.dr(this.byP);
        if (this.byQ <= 0) {
            lfn.b(5, "SFWaterVesselInfo", "checkEffectValues() Unknown Effect: " + this.byP);
            assert (false);
        }
        this.btE = del.dr(this.btf);
        if (this.btE <= 0) {
            lfn.b(5, "SFWaterVesselInfo", "checkEffectValues() Unknown Effect: " + this.btf);
            assert (false);
        }
        this.byS = del.dr(this.byR);
        if (this.btE <= 0) {
            lfn.b(5, "SFWaterVesselInfo", "checkEffectValues() Unknown Effect: " + this.byR);
            assert (false);
        }
    }

    public int EQ() {
        return this.btC;
    }

    public int GT() {
        return this.byQ;
    }

    public int ES() {
        return this.btA;
    }

    public int GU() {
        return this.byO;
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

    public String GV() {
        return this.byY;
    }

    public void du(String string) {
        this.byY = string;
    }

    public String GW() {
        return this.byX;
    }

    public void dv(String string) {
        this.byX = string;
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

    public float GX() {
        return this.byZ;
    }

    public void be(float f2) {
        this.byZ = f2;
    }

    public float GY() {
        return this.bza;
    }

    public void bf(float f2) {
        this.bza = f2;
    }

    public float getMaxVelocity() {
        return this.bzb;
    }

    public void setMaxVelocity(float f2) {
        this.bzb = f2;
    }

    public float GZ() {
        return this.bzd;
    }

    public void bg(float f2) {
        this.bzd = f2;
    }

    public float Ha() {
        return this.bze;
    }

    public void bh(float f2) {
        this.bze = f2;
    }

    public float Hb() {
        return this.bzf;
    }

    public void bi(float f2) {
        this.bzf = f2;
    }

    public String Hc() {
        return this.byU;
    }

    public void dw(String string) {
        this.byU = string;
    }

    public String Hd() {
        return this.byV;
    }

    public void dx(String string) {
        this.byV = string;
    }

    public int He() {
        return this.bzk;
    }

    public void hd(int n) {
        this.bzk = n;
    }

    public int Hf() {
        return this.bzl;
    }

    public void he(int n) {
        this.bzl = n;
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

    public float Hg() {
        return this.bzg;
    }

    public void bj(float f2) {
        this.bzg = f2;
    }

    public float Hh() {
        return this.bzh;
    }

    public void bk(float f2) {
        this.bzh = f2;
    }

    public float Hi() {
        return this.bzi;
    }

    public void bl(float f2) {
        this.bzi = f2;
    }

    public float Hj() {
        return this.bzj;
    }

    public void bm(float f2) {
        this.bzj = f2;
    }

    public int EP() {
        return this.btE;
    }

    public float Hk() {
        return this.bzc;
    }

    public void bn(float f2) {
        this.bzc = f2;
    }

    public final int Hl() {
        return this.byS;
    }

    public final String Hm() {
        return this.byR;
    }

    public final void dy(String string) {
        this.byR = string;
    }

    public final String Hn() {
        return this.byW;
    }

    public final int Ho() {
        return this.byW != null ? cug.ih((String)this.byW) : -1;
    }

    public final void dz(String string) {
        this.byW = string;
    }

    public float Hp() {
        return this.bzm;
    }

    public void bo(float f2) {
        this.bzm = f2;
    }

    public float Hq() {
        return this.byT;
    }

    public void bp(float f2) {
        this.byT = f2;
    }
}

