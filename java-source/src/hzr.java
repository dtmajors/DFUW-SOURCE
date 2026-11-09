/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class hzr
extends hzk
implements jml {
    protected hzq lzb = null;
    protected String ipN = null;
    protected String lzc = null;
    protected String lzd = null;
    protected String lze = null;
    protected String lzf = null;
    protected String lzg = null;
    protected String lzh = null;
    protected boolean lzi = true;
    protected String lzj = "SFYesNoDialogQuit";
    protected int asi = 1;

    public hzr() {
        super("YesNoModalWindow", "yesnomodal.swf");
        this.a(hya.lmp, true);
        this.OQ(jnz.nGi);
        this.a(hyb.lmC);
    }

    public void cBa() {
        super.cBa();
        this.a("createDialog", new Object[]{this.lzj});
        float f = hso.cxK().cxY().dOj();
        float f2 = hso.cxK().cxY().TG();
        this.N(f / this.cEJ(), f2 / this.cDc());
        this.kq(f);
        this.kr(f2);
        hso.cxK().cxP().i((hyn)this);
        hso.cxK().cxR().ul(true);
        if (this.ipN != null) {
            this.a("setMessageText1", new Object[]{this.ipN});
        }
        if (this.lzc != null) {
            this.a("setMessageText2", new Object[]{this.lzc});
        }
        if (this.lzd != null) {
            this.a("setMessageText3", new Object[]{this.lzd});
        }
        if (this.lze != null) {
            this.a("setMessageText4", new Object[]{this.lze});
        }
        if (this.lzf != null) {
            this.a("setMessageText5", new Object[]{this.lzf});
        }
        if (this.lzg != null) {
            this.a("setMessageText6", new Object[]{this.lzg});
        }
        if (this.lzh != null) {
            this.a("setIconFileName", new Object[]{this.lzh});
        }
        if (this.asi > 1) {
            this.a("setQuantity", new Object[]{this.asi});
        }
        this.cFc();
    }

    public void initialize() {
        super.initialize();
        if (this.lzi) {
            hso.cxK().cxR().dMa().a(jmq.nBd, this);
        }
    }

    public void cleanUp() {
        super.cleanUp();
        if (this.lzi) {
            hso.cxK().cxR().dMa().j(jmq.nBd);
        }
    }

    public void G(String string, String string2) {
        this.ipN = string;
        this.lzc = string2;
    }

    public void ok(String string) {
        this.ipN = string;
    }

    public void ol(String string) {
        this.lzc = string;
    }

    public void om(String string) {
        this.lzd = string;
    }

    public void on(String string) {
        this.lze = string;
    }

    public void oo(String string) {
        this.lzf = string;
    }

    public void op(String string) {
        this.lzh = string;
    }

    @llk
    public void choice(int n) {
        this.lzb.oH(n == 0);
        this.hide();
    }

    public void a(hzq hzq2) {
        this.lzb = hzq2;
    }

    protected void hide() {
        hso.cxK().cxR().ul(false);
        this.MessageDelegator.hd(this.GUID);
    }

    @Override
    public void a(jmq jmq2) {
        if (jmq2 == jmq.nBd) {
            this.hide();
        }
    }

    @Override
    public void a(jmq jmq2, int n) {
    }

    @Override
    public void a(jmq jmq2, double d2) {
    }

    protected void g(int n, int n2, String string) {
        if (string != null && (string.equals("overlay") || string.startsWith("instance"))) {
            this.lzb.oH(false);
            this.hide();
        }
    }

    public void pu(boolean bl) {
        this.lzi = bl;
    }

    public void oq(String string) {
        this.lzj = string;
    }

    public String cJy() {
        return this.lzg;
    }

    public void or(String string) {
        this.lzg = string;
    }

    public void do(int n) {
        this.asi = n;
    }

    public boolean a(jmf jmf2) {
        if (jmf2.dLX()) {
            String string = jmf2.dMq();
            if (string.equals("Y")) {
                this.choice(0);
                return true;
            }
            if (string.equals("N") || string.equals("ESCAPE")) {
                this.choice(1);
                return true;
            }
        }
        return false;
    }
}

