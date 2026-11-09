/*
 * Decompiled with CFR.
 */
public class dfj
extends dey {
    public static final int god = 2;
    public static final int goe = 4;
    public static final int gof = 8;
    public static final int gog = 16;
    public static final int goh = 32;
    public static final int goi = 64;
    public static final int goj = 128;
    private int gok = 0;
    private float gol = 10.0f;
    private float gom = 150.0f;
    private ljq gon;
    private ljq goo;
    private ljq bis;
    private ljq gop;
    private lco goq = new lco();
    private lco gor = new lco();
    private lco gos = new lco();
    private lco got = new lco();
    private lco gou = new lco();
    private lco gov = new lco();
    private ldv gow;
    private dru gox = null;

    dfj() {
        this.gnv = 8;
    }

    public int blV() {
        return this.gok;
    }

    public void Ag(int n2) {
        this.gok = n2;
    }

    public float blW() {
        return this.gol;
    }

    public void gp(float f2) {
        this.gol = f2;
    }

    public float blX() {
        return this.gom;
    }

    public void gq(float f2) {
        this.gom = f2;
    }

    public ljq blY() {
        return this.gon;
    }

    public void bN(ljq ljq2) {
        this.gon = ljq2;
    }

    public ljq blZ() {
        return this.goo;
    }

    public void bO(ljq ljq2) {
        this.goo = ljq2;
    }

    public ljq getStartDirection() {
        return this.bis;
    }

    public void setStartDirection(ljq ljq2) {
        this.bis = ljq2;
    }

    public ljq bma() {
        return this.gop;
    }

    public void bP(ljq ljq2) {
        this.gop = ljq2;
    }

    public lco bmb() {
        return this.goq;
    }

    public void a(lco lco2) {
        this.goq = lco2;
    }

    public lco bmc() {
        return this.gos;
    }

    public void b(lco lco2) {
        this.gos = lco2;
    }

    public lco bmd() {
        return this.gou;
    }

    public void c(lco lco2) {
        this.gou = lco2;
    }

    public lco bme() {
        return this.gor;
    }

    public void d(lco lco2) {
        this.gor = lco2;
    }

    public lco bmf() {
        return this.got;
    }

    public void e(lco lco2) {
        this.got = lco2;
    }

    public lco bmg() {
        return this.gov;
    }

    public void f(lco lco2) {
        this.gov = lco2;
    }

    @Override
    public void doTick(ldz ldz2) {
        this.blG();
    }

    @Override
    public void initialize() {
        if (!this.Initialized) {
            this.bmh();
            this.Initialized = true;
        }
    }

    @Override
    public void cleanUp() {
        if (this.gox != null) {
            this.MessageDelegator.hd(this.gox.getGUID());
            this.gox = null;
        }
    }

    protected void a(dey dey2) {
        super.copyValues(dey2);
        dfj dfj2 = (dfj)dey2;
        dfj2.Ag(this.gok);
        dfj2.gp(this.gol);
        dfj2.gq(this.gom);
        dfj2.bN(new ljq(this.gon));
        dfj2.bO(new ljq(this.goo));
        dfj2.setStartDirection(this.bis);
        dfj2.bP(this.gop);
        dfj2.a(new lco(this.goq));
        dfj2.d(new lco(this.gor));
        dfj2.b(new lco(this.gos));
        dfj2.e(new lco(this.got));
        dfj2.c(new lco(this.gou));
        dfj2.f(new lco(this.gov));
    }

    private void bmh() {
        this.gox = new dru();
        this.gox.setGUID(this.MessageDelegator.bzv());
        this.gox.setRange(this.gol);
        this.gox.c((ljq)null);
        this.gox.i(this.goq);
        this.gox.j(this.gos);
        this.gox.k(this.gou);
        this.MessageDelegator.a(this.gox);
    }

    private void blG() {
        if (this.gox == null) {
            return;
        }
        float f2 = (float)((this.MessageDelegator.arc().rgz - this.oV) / this.eKm);
        assert ((double)f2 <= 1.0) : "Lerp is bigger than 1.0";
        fpg fpg2 = (fpg)this.MessageDelegator.h(1537, this.GUID, this.gox.getGUID());
        fpg2.pN(this.gox.getGUID());
        int n2 = 4;
        if ((this.gok & 4) > 0) {
            n2 |= 0x100;
            float f3 = this.o(f2, this.gol, this.gom);
            fpg2.setRange(f3);
        }
        if ((this.gok & 0x10) > 0) {
            // empty if block
        }
        if ((this.gok & 0x20) > 0) {
            n2 |= 8;
            lco lco2 = this.a(f2, this.goq, this.gor);
            fpg2.i(lco2);
        }
        if ((this.gok & 0x40) > 0) {
            n2 |= 0x10;
            lco lco3 = this.a(f2, this.gos, this.got);
            fpg2.j(lco3);
        }
        if ((this.gok & 0x80) > 0) {
            n2 |= 0x20;
            lco lco4 = this.a(f2, this.gou, this.gov);
            fpg2.k(lco4);
        }
        if ((this.gok & 8) > 0) {
            n2 |= 0x80;
            ljq ljq2 = ljq.e(this.gon, this.goo, f2);
            fpg2.c(ljq2);
        }
        if (n2 != 0) {
            fpg2.Hl(n2);
            this.MessageDelegator.F(fpg2);
        }
    }
}

