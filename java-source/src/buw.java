/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public class buw
extends btk
implements bto {
    private dez dKP = new dez();
    private dew dPx = null;
    private float dPy = 5.0f;
    private float dPf = 0.5f;
    private final lcq dPb = new lcq(1.0f, 1.0f, 1.0f, 1.0f);
    private final lcq dPc = new lcq(1.0f, 1.0f, 1.0f, 0.6f);
    private final lcq dPd = this.dPb;
    private final lcq dPe = new lcq(1.0f, 0.2f, 0.2f, 1.0f);
    private lcq dPz = this.dPb;
    private lcq dPA = this.dPc;
    private static final int dOW = 600;
    private static final int dOX = 12;
    private static final int dOY = 1;
    private static final boolean dOZ = false;
    private static final String dPa = "Aerial";
    private StringBuffer aAc = new StringBuffer();
    private int azZ = -2147483647;
    private int aAa = -2147483647;
    private int aAb = -2147483647;
    private String aGb;
    private ldz dPB;
    private double aAh;
    private boolean ayC;

    public buw(int n, double d2, int[] nArray) {
        assert (n != -1);
        assert (d2 != -1.0);
        assert (nArray != null && nArray.length == 3);
        dty dty2 = lea.eoU().Cf(n);
        if (dty2 == null) {
            assert (false);
            return;
        }
        this.aGb = dty2.Name;
        this.ayC = dty2.HighScoreRecording;
        this.aAh = d2 + (double)nArray[0] * 3600.0 + (double)nArray[1] * 60.0 + (double)nArray[2];
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.dPB == null) {
            this.dPB = ldz2;
            return;
        }
        if (ldz2.rgz - this.dPB.rgz >= 1.0) {
            this.dPB = ldz2;
            this.ayH();
        }
    }

    private boolean ayM() {
        this.aAc.setLength(0);
        this.aAc.append(this.aGb + "\n");
        double d2 = this.aAh - this.MessageDelegator.arc().rgz;
        int n = ldz.dV(d2);
        int n2 = ldz.dW(d2 -= (double)n * 3600.0);
        int n3 = (int)(d2 -= (double)n2 * 60.0);
        if (n == this.azZ && n2 == this.aAa && n3 == this.aAb) {
            return false;
        }
        if (n <= 0 && n2 <= 0 && n3 <= 0) {
            return false;
        }
        this.azZ = n;
        this.aAa = n2;
        this.aAb = n3;
        if (this.azZ > 0) {
            if (this.azZ < 10) {
                this.aAc.append("0" + this.azZ);
            } else {
                this.aAc.append(this.azZ);
            }
        }
        if (this.aAa > 0 || this.azZ > 0) {
            if (this.aAa < 10) {
                if (this.azZ > 0) {
                    this.aAc.append(":0" + this.aAa);
                } else {
                    this.aAc.append("0" + this.aAa);
                }
            } else if (this.azZ > 0) {
                this.aAc.append(":" + this.aAa);
            } else {
                this.aAc.append(this.aAa);
            }
        }
        if (this.aAb < 10) {
            if (this.azZ > 0 || this.aAa > 0) {
                this.aAc.append(":0" + this.aAb);
            } else {
                this.aAc.append("0" + this.aAb);
            }
        } else if (this.azZ > 0 || this.aAa > 0) {
            this.aAc.append(":" + this.aAb);
        } else {
            this.aAc.append(this.aAb);
        }
        this.aAc.append(this.ayC ? " before you can deliver the quest." : " before your quest fails.");
        return true;
    }

    private void ayN() {
        this.dPx = (dew)this.dKP.Af(27);
        this.dPx.setGUID(this.MessageDelegator.bzv());
        this.dPx.zZ(600);
        this.dPx.zY(12);
        this.dPx.Aa(1);
        this.dPx.iK(dPa);
        this.dPx.hL(false);
        this.ayM();
        this.dPx.setText(this.aAc.toString());
        this.dPx.gk(2.0f);
        this.dPx.setColor(lcq.BRIGHT_WHITE);
        this.dPx.xf(4);
        this.dPx.g(new ljp(25.0f, (float)(lcw.qFU / 2) - 36.0f));
        this.dPx.h(new ljp(lcw.qFT, lcw.qFU));
        this.dPx.hM(false);
        this.MessageDelegator.a(this.dPx);
    }

    private void ayH() {
        if (this.ayM()) {
            this.dPx.setText(this.aAc.toString());
        }
        this.dPx.setColor(this.ayO() ? this.ayP() : lcq.BRIGHT_WHITE);
    }

    private boolean ayO() {
        return true;
    }

    private lcq ayP() {
        boolean bl2 = false;
        if (this.azZ == 0 && this.aAa == 0 && this.aAb <= 10) {
            bl2 = true;
        } else if (this.azZ == 0 && this.aAb == 0) {
            switch (this.aAa) {
                case 1: 
                case 5: 
                case 10: 
                case 15: 
                case 30: {
                    bl2 = true;
                    break;
                }
                default: {
                    bl2 = false;
                }
            }
        }
        double d2 = this.MessageDelegator.arc().rgz;
        if (!bl2) {
            d2 /= (double)this.dPy * 2.0;
            this.dPz = this.dPb;
            this.dPA = this.dPc;
        } else {
            d2 /= (double)this.dPf * 2.0;
            this.dPz = this.dPd;
            this.dPA = this.dPe;
        }
        d2 = Math.abs(Math.sin(d2));
        d2 = lew.c(d2, 0.0, 1.0);
        return lcq.a(this.dPz, this.dPA, (float)d2);
    }

    private void ayE() {
        if (this.dPx != null) {
            this.MessageDelegator.hd(this.dPx.getGUID());
            this.dPx = null;
        }
    }

    @Override
    public void initialize() {
        super.initialize();
        this.ayN();
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.ayE();
    }
}

