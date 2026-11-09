/*
 * Decompiled with CFR.
 */
import java.util.List;

public class jgq
extends hzk
implements bto {
    protected int naD = 0;
    protected List<String> naE = lcn.emv();
    protected int naF = 0;
    protected double naG = 0.0;
    float naH = -1.0f;
    float naI = -1.0f;
    boolean naJ = false;
    float naK = 0.0f;
    boolean naL = false;
    String naM = "";

    public jgq(String string, String string2) {
        super(string, string2);
        this.a(hya.lmp, true);
        this.OQ(jnz.nGe | jnz.nGi | jnz.nGk | jnz.nGm | jnz.nGf | jnz.nGy);
        this.a(hyb.lmC);
    }

    public void UB(int n) {
        this.naD = n;
        if (this.cDj()) {
            this.a("setTextAlign", new Object[]{this.naD});
        }
    }

    public void cBa() {
        super.cBa();
        this.a("setTextAlign", new Object[]{this.naD});
        this.a("setText", new Object[]{""});
    }

    public void addText(String string) {
        string = this.sf(string);
        this.naE.add(string);
        this.naF = this.naE.size() - 1;
        this.a("setText", new Object[]{string});
        this.naG = this.MessageDelegator.arc().rgz;
    }

    private String sf(String string) {
        if (string == null) {
            return null;
        }
        string = string.replaceAll("\\^C(.*?)\\^", "");
        string = string.replaceAll("\\^L", "");
        string = string.replaceAll("\\^N", "");
        string = string.replaceAll("\\^", "");
        return string;
    }

    protected void a(int n, int n2, int n3, int n4, String string) {
        super.a(n, n2, n3, n4, string);
        if (this.naE.size() == 0) {
            return;
        }
        this.naF = n3 > 0 ? --this.naF : ++this.naF;
        if (this.naF < 0) {
            this.naF = 0;
        }
        if (this.naF >= this.naE.size()) {
            this.naF = this.naE.size() - 1;
        }
        this.a("setText", new Object[]{this.naE.get(this.naF)});
    }

    public void oc(String string) {
        this.naM = string;
        if (this.naG == 0.0) {
            this.a("setText", new Object[]{this.naM});
        }
    }

    protected void dEK() {
        if (this.naK < this.naH * this.cEJ()) {
            this.naK = this.naH * this.cEJ();
        }
        if (this.naD == 1) {
            this.R(this.cEE() - (this.naK - this.getWidth()), this.cEF());
        }
        this.N(this.naK / this.cEJ(), 1.0f);
        this.cER();
        super.kq(this.naK);
        this.naL = true;
    }

    protected void dEL() {
        if (!this.naL) {
            return;
        }
        this.N(this.naH, 1.0f);
        if (this.naD == 1) {
            this.R(this.naI, this.cEF());
        }
        this.cER();
        super.kq(this.naH * this.cEJ());
        this.naL = false;
    }

    protected void w(int n, int n2, int n3) {
        super.w(n, n2, n3);
        this.naJ = true;
        if (this.naE.size() > 0) {
            this.a("setText", new Object[]{this.naE.get(this.naF)});
        }
    }

    protected void v(int n, int n2, int n3) {
        super.v(n, n2, n3);
        this.a("setText", new Object[]{""});
        this.naJ = false;
        this.dEL();
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.naG != 0.0 && ldz2.rgz - this.naG > 3.0) {
            this.naG = 0.0;
            if (!this.naJ) {
                this.a("setText", new Object[]{this.naM});
            }
        }
    }

    @llk
    public void textWidth(double d2) {
        this.naK = (float)d2;
        this.naK += 10.0f;
        if (this.naJ) {
            this.dEK();
        }
    }

    public void kq(float f) {
        super.kq(f);
        this.naH = this.cCZ();
        this.naI = this.cEE();
    }
}

