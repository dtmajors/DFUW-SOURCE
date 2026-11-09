/*
 * Decompiled with CFR.
 */
public class isq
extends isp
implements isj {
    private int mxz;
    private String mxA;
    private String lob;
    private boolean mxB;
    private boolean mxC = true;
    private itb mxD;
    private boolean mxE;
    private boolean mxF;
    private boolean mxG;
    private boolean mxH;
    private boolean mxl;
    private boolean mxI;
    private boolean mxJ;
    private boolean mxK;
    private boolean mxL;
    private boolean mxM;

    public isq() {
        this(null);
    }

    public isq(String string) {
        this.mxZ = true;
        this.setText(string);
    }

    public isq(isf isf2, int n, int n2, String string) {
        this.mxZ = true;
        this.a(isf2, n);
        this.Rk(n2);
        this.setText(string);
    }

    @Override
    public void a(ioa ioa2) {
        super.a(ioa2);
        if (this.mxD != null) {
            this.mxK = true;
        }
        if (this.mxE) {
            this.mxL = true;
        }
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.mxG = false;
        this.mxH = false;
        this.mxl = false;
        this.mxI = false;
        this.mxJ = false;
        this.mxM = false;
    }

    public int dpK() {
        return this.mxz;
    }

    @Override
    public void SQ(int n) {
        if (n == this.mxz) {
            return;
        }
        this.mxz = n;
        this.dpS();
    }

    public String dpL() {
        return this.mxA;
    }

    public void ro(String string) {
        if (lhn.equal(string, this.mxA)) {
            return;
        }
        this.mxA = string;
        this.dpT();
    }

    @Override
    public String getText() {
        return this.lob;
    }

    @Override
    public void setText(String string) {
        this.lob = string;
        this.dpC();
        this.dku();
    }

    @Override
    public void K(String string, int n) {
        this.setText(string);
        this.Rk(n);
    }

    public boolean dpM() {
        return this.mxB;
    }

    public void st(boolean bl) {
        if (bl == this.mxB) {
            return;
        }
        this.mxB = bl;
        this.dpU();
    }

    public boolean dpN() {
        return this.mxC;
    }

    @Override
    public void sp(boolean bl) {
        if (bl == this.mxC) {
            return;
        }
        this.mxC = bl;
        this.dpV();
    }

    public itb dpO() {
        return this.mxD;
    }

    @Override
    public void a(itb itb2) {
        if (itb2 == this.mxD) {
            return;
        }
        this.mxD = itb2;
        this.mxK = true;
        this.dkg();
    }

    public String dpP() {
        return this.mxD instanceof ita ? ((ita)this.mxD).dpP() : null;
    }

    public void rp(String string) {
        this.b(string, 0, true);
    }

    public void b(String string, int n, boolean bl) {
        this.a(new ita(string, n, bl));
    }

    public void h(int n, int n2, boolean bl) {
        this.a(new isz(n, n2, bl));
    }

    public boolean dpQ() {
        return this.mxE;
    }

    @Override
    public void sq(boolean bl) {
        if (bl == this.mxE) {
            return;
        }
        this.mxE = bl;
        this.mxL = true;
        this.dkg();
    }

    public boolean dpR() {
        return this.mxF;
    }

    public void su(boolean bl) {
        if (bl == this.mxF) {
            return;
        }
        this.mxF = bl;
        this.mxM = true;
        this.dkg();
    }

    @Override
    public void dpv() {
        this.djE().b("ITextInput_retrieveText", new Object[]{this.getId()});
    }

    public void rq(String string) {
        this.djE().b("ITextInput_insertHtmlText", new Object[]{this.getId(), string, this.qL(this.dqk().getFontFamily()), this.bll(), this.dql()});
    }

    @Override
    public void djy() {
        if (this.dqi() != isu.mxO && this.dqj()) {
            this.dke();
            this.djE().b("MultilineTextInput_measure", new Object[]{this.getId(), this.getWidth(), this.getHeight(), this.dqi().ordinal(), this.qL(this.dqk().getFontFamily()), this.bll(), this.dqt(), this.dqn().ordinal(), this.lob != null ? this.lob : ""});
        } else {
            this.eq(this.getWidth(), this.getHeight());
        }
    }

    @Override
    public void ei(int n, int n2) {
        super.ei(n, n2);
        this.dpX();
        if (this.mxH) {
            this.mxH = false;
            this.djE().b("ITextInput_setRestrict", new Object[]{this.getId(), this.mxA});
        }
        if (this.mxl) {
            this.mxl = false;
            this.djE().b("ITextInput_setText", new Object[]{this.getId(), this.dpz()});
        }
        if (this.mxI) {
            this.mxI = false;
            this.djE().b("ITextInput_setTextChangedDynamic", new Object[]{this.getId(), this.mxB});
        }
        if (this.mxJ) {
            this.mxJ = false;
            this.djE().b("ITextInput_setTextChangedOnFocusOut", new Object[]{this.getId(), this.mxC});
        }
        this.dpW();
        this.dpY();
        if (this.mxM) {
            this.mxM = false;
            this.djE().b("MultilineTextInput_setWantsEnter", new Object[]{this.getId(), this.mxF});
        }
    }

    @Override
    public void djm() {
        super.djm();
        this.mxl = false;
        this.mxH = false;
        this.mxI = false;
        this.mxJ = false;
        if (this.mxz > 0) {
            this.mxG = true;
            this.dpX();
        }
        if (this.mxD != null) {
            this.mxK = true;
            this.dpW();
        }
        if (this.mxE) {
            this.mxL = true;
            this.dpY();
        }
        this.mxM = false;
    }

    @Override
    public void dA(int n, int n2) {
        this.djE().b("MultilineTextInput_create", new Object[]{this.getId(), n, n2, this.getX() + this.djU(), this.getY() + this.djV(), this.getWidth(), this.getHeight(), this.djL() && this.djW(), Float.valueOf(this.getAlpha() * this.djX()), this.djR() && this.djY(), this.dqi().ordinal(), this.qL(this.dqk().getFontFamily()), this.bll(), this.dql(), this.dqt(), this.dqn().ordinal(), this.dpz(), this.dpE(), this.mxB, this.mxA != null ? this.mxA : "", this.mxC, this.mxF});
    }

    @Override
    public boolean du(int n, int n2) {
        this.L();
        return true;
    }

    @Override
    public void pI(String string) {
        if (!this.mxl) {
            this.lob = string;
        }
    }

    @Override
    public void od(String string) {
        if (!this.mxl) {
            this.lob = string;
        }
    }

    @Override
    public void v(String string, boolean bl) {
    }

    @Override
    public void c(int n, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
    }

    @Override
    public void C(String string, int n) {
    }

    @Override
    public void rk(String string) {
        if (!this.mxl) {
            this.lob = string;
        }
    }

    @Override
    public void dpx() {
        this.djE().b("TextField_setHtmlTextStyle", new Object[]{this.getId(), this.qL(this.dqk().getFontFamily()), this.bll(), this.dql()});
    }

    @Override
    public void dpy() {
        this.dpx();
    }

    @Override
    public boolean oN(String string) {
        return this.dmb();
    }

    @Override
    public boolean qM(String string) {
        return this.dmb();
    }

    private void dpS() {
        if (this.mxG) {
            return;
        }
        this.mxG = true;
        this.dkg();
    }

    private void dpT() {
        if (this.mxH) {
            return;
        }
        this.mxH = true;
        this.dkg();
    }

    private void dpC() {
        if (this.mxl) {
            return;
        }
        this.mxl = true;
        this.dkg();
    }

    private void dpU() {
        if (this.mxI) {
            return;
        }
        this.mxI = true;
        this.dkg();
    }

    private void dpV() {
        if (this.mxJ) {
            return;
        }
        this.mxJ = true;
        this.dkg();
    }

    private void dpW() {
        if (this.mxK) {
            this.mxK = false;
            if (this.mxD != null) {
                this.mxD.a(this);
            } else {
                this.djE().b("ITextInput_removeValidator", new Object[]{this.getId()});
            }
        }
    }

    private void dpX() {
        if (this.mxG && this.dhV()) {
            this.mxG = false;
            this.djE().b("ITextInput_setMaxChars", new Object[]{this.getId(), this.mxz});
        }
    }

    private void dpY() {
        if (this.mxL && this.dhV()) {
            this.mxL = false;
            this.djE().b("ITextInput_setReceiveKeyboardEvents", new Object[]{this.getId(), this.mxE});
        }
    }

    private String dpz() {
        return this.lob != null && !this.lob.isEmpty() ? isg.b(this.dqk(), this.bll(), this.dql(), this.lob) : "";
    }
}

