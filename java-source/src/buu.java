/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public class buu
extends btk
implements bto {
    private dez dKP = new dez();
    private dew dOU = null;
    private dew dOV = null;
    private static final int dOW = 800;
    private static final int dOX = 20;
    private static final int dOY = 1;
    private static final boolean dOZ = false;
    private static final String dPa = "Times New Roman";
    private final lcq dPb = new lcq(1.0f, 1.0f, 1.0f, 1.0f);
    private final lcq dPc = new lcq(1.0f, 1.0f, 1.0f, 0.6f);
    private final lcq dPd = this.dPb;
    private final lcq dPe = new lcq(1.0f, 0.2f, 0.2f, 1.0f);
    private float dPf = 0.5f;
    private boolean dPg;
    private double dPh;
    private double dPi;

    @Override
    public void initialize() {
        super.initialize();
    }

    @Override
    public void doTick(ldz ldz2) {
        if (!lcw.qFy) {
            if (this.dOU != null) {
                this.dOU.setText("");
            }
            if (this.dOV != null) {
                this.dOV.setText("");
            }
            return;
        }
        this.ayA();
        this.ayB();
    }

    private void ayA() {
        if (this.dOU == null) {
            return;
        }
        if (this.dPg) {
            return;
        }
        this.dPh -= this.MessageDelegator.arc().qwh;
        if (this.dPh < 0.0) {
            this.dPh = 0.0;
        }
        String string = ldz.dY(this.dPh);
        this.dOU.setText(string);
        if (this.dPh > 0.0 && this.dPh < 120.0) {
            double d2 = this.MessageDelegator.arc().rgz;
            double d3 = Math.abs(Math.sin(d2 * (double)this.dPf));
            lcq lcq2 = lcq.a(this.dPd, this.dPe, (float)d3);
        }
    }

    private void ayB() {
        if (this.dOV == null) {
            return;
        }
        this.dPi -= this.MessageDelegator.arc().qwh;
        if (this.dPi < 0.0) {
            this.dPi = 0.0;
        }
        String string = ldz.dY(this.dPi);
        this.dOV.setText(string);
        this.ayI();
    }

    public void ayC() {
        if (this.dOV != null) {
            return;
        }
        this.dOV = (dew)this.dKP.Af(27);
        this.dOV.setGUID(this.MessageDelegator.bzv());
        this.dOV.zZ(800);
        this.dOV.zY(20);
        this.dOV.Aa(1);
        this.dOV.iK(dPa);
        this.dOV.hL(false);
        String string = ldz.dY(this.dPi);
        this.dOV.setText(string);
        this.dOV.gk(2.0f);
        this.dOV.setColor(lcq.BRIGHT_WHITE);
        this.dOV.xf(32);
        this.dOV.g(new ljp(0.0f, (float)lcw.qFU / 2.0f - 1.0f));
        this.dOV.h(new ljp(lcw.qFT, lcw.qFU));
        this.dOV.hM(false);
        this.MessageDelegator.a(this.dOV);
    }

    public void ayD() {
        if (this.dOU != null) {
            return;
        }
        this.dOU = (dew)this.dKP.Af(27);
        this.dOU.setGUID(this.MessageDelegator.bzv());
        this.dOU.zZ(800);
        this.dOU.zY(20);
        this.dOU.Aa(1);
        this.dOU.iK(dPa);
        this.dOU.hL(false);
        String string = ldz.dY(this.dPh);
        this.dOU.setText(string);
        this.dOU.gk(2.0f);
        this.dOU.setColor(lcq.BRIGHT_WHITE);
        this.dOU.xf(8);
        this.dOU.g(new ljp(0.0f, 0.0f));
        this.dOU.h(new ljp(lcw.qFT, 40.0f));
        this.dOU.hM(false);
        this.MessageDelegator.a(this.dOU);
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.ayE();
    }

    public void ayE() {
        this.ayF();
        this.ayG();
    }

    public void ayF() {
        if (this.dOU != null) {
            this.MessageDelegator.hd(this.dOU.getGUID());
            this.dOU = null;
        }
    }

    public void ayG() {
        if (this.dOV != null) {
            this.MessageDelegator.hd(this.dOV.getGUID());
            this.dOV = null;
        }
    }

    private void ayH() {
    }

    private void ayI() {
        if (this.dOV == null) {
            return;
        }
        double d2 = this.MessageDelegator.arc().rgz;
        double d3 = Math.abs(Math.sin(d2 * (double)this.dPf));
        lcq lcq2 = lcq.a(this.dPd, this.dPe, (float)d3);
        this.dOV.setColor(lcq2);
    }

    public final double ayJ() {
        return this.dPh;
    }

    public final void ba(double d2) {
        this.dPh = d2;
    }

    public final double ayK() {
        return this.dPi;
    }

    public final void bb(double d2) {
        this.dPi = d2;
    }

    public final void eo(boolean bl2) {
        this.dPg = bl2;
    }
}

