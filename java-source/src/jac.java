/*
 * Decompiled with CFR.
 */
public abstract class jac
extends ipz {
    protected static final int mEn = 1;
    protected static final int mEo = 2;
    protected static final int mEp = 0x313131;
    protected static final int mEq = 1;
    protected static final int mEr = 4;
    protected static final int mEs = 8;
    protected static final int mEt = 16;
    protected static final int mEu = 18;
    protected static final isf mEv = isf.mwN;
    protected static final int mEw = 12;
    protected static final int mEx = 20;
    protected static final int mEy = 136;
    protected static final String mEz = "/dfdata/texture/gui/j2f/common/textfields/text_field_03.png";
    protected static final int mEA = 4;
    protected static final isf mEB = isf.mwN;
    protected static final int mEC = 13;
    protected static final int mED = 0x8B8B8B;
    protected static final int mEE = 50;
    protected static final int mEF = 0x181818;
    protected static final isf mEG = isf.mwO;
    protected static final int mEH = 16;
    protected static final int mEI = 12357465;
    protected static final isf mEJ = isf.mwO;
    protected static final int mEK = 13;
    protected static final int mEL = 12357465;
    protected static final int mEM = 0x313131;
    protected static final int mEN = 20;
    protected static final isf mEO = isf.mwO;
    protected static final int mEP = 14;
    protected static final int mEQ = 12357465;
    protected static final int mER = 0xABABAB;
    protected static final int mES = 14;
    protected static final int mET = 4;
    protected static final int mEU = 0x313131;
    protected static final int mEV = 18;
    protected static final int mEW = 10;
    protected static final int mEX = 400;
    protected static final int mEY = 260;
    protected static final String mEZ = "/dfdata/texture/gui/j2f/leaderboards/leaderboards_gold_line.png";
    protected static final isf mFa = isf.mwO;
    protected static final int mFb = 12;
    protected static final int mFc = 12357465;
    protected static final isf mFd = isf.mwO;
    protected static final int mFe = 12;
    protected static final int mFf = 12357465;
    protected static final int mFg = 0xFF0000;
    protected static final int mFh = 0xABABAB;
    protected static final int mFi = 20;
    protected static final int mFj = 22;
    private boolean mFk = false;
    protected jab mFl = null;
    private d mFm = null;
    protected f mFn = null;
    protected b mFo = null;
    protected e mFp = null;

    public ipf duj() {
        if (this.mFm == null) {
            this.mFm = new d(this);
        }
        return this.mFm;
    }

    public abstract loz aNA();

    protected abstract String duk();

    protected jac(jab jab2) {
        this.mFl = jab2;
    }

    public void dul() {
        if (!this.mFk) {
            this.dum();
            this.mFk = true;
            this.dun();
        }
    }

    protected abstract void dum();

    protected abstract void dun();

    protected void duo() {
    }

    protected void dup() {
        if (this.mFn != null) {
            this.mFn.rF(true);
        }
        if (this.mFp != null) {
            this.mFp.dqb().rF(true);
        }
    }

    protected ipx duq() {
        this.mFo = new b(this);
        ipx ipx2 = ipx.j(new ipf[0]);
        ipx2.W(new ipb(mEZ));
        ipx2.W(ipx.a(400, 260, this.mFo));
        ipx2.W(new ipb(mEZ));
        ipx2.W(ipx.a(1, 8, new ipf[0]));
        return ipx2;
    }

    protected void dur() {
        if (this.mFp != null) {
            return;
        }
        this.mFp = new e(this);
        this.mFp.dqb().a(mEv, 12);
        ((iqa)this.mFp.dip()).b(mEz, 4, 4, 4, 4);
        ((iqa)this.mFp.dip()).hz(this.mFl.cXQ());
        this.mFp.dqb().sq(true);
        ist ist2 = new ist();
        ist2.a(mEB, 13);
        ist2.ST(0x8B8B8B);
        ist2.o(lxh.tqj.bD(new Object[0]));
        ipx ipx2 = ipx.d(ipx.j(ist2, ipx.a(1, 1, new ipf[0])));
        this.mFp.al(ipx.l(ipx.a(4, 1, new ipf[0]), ipx2, ipx.a(50, 1, new ipf[0])));
    }

    protected a dus() {
        a a2 = new a(this);
        a2.kh(this.mFl.cXQ());
        return a2;
    }

    public boolean l(dxq dxq2) {
        return false;
    }

    public void receiveMessage(dxq dxq2) {
    }
}

