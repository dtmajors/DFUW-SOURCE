/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  cxd
 *  lcr
 *  lcw
 */
import java.util.Map;

public class art
extends btk
implements bto {
    private final bsx bBe;
    private final ljq Position;
    private final float Radius;
    private final double bRq;
    private final double bRr;
    private final boolean bRs;
    private final double bRt;
    private final int aYG;
    private final float bRu;
    private final float bRv;
    private final int bRw;
    private final int bRx;
    private final int bRy;
    private double bRz = 0.0;
    private double bRA;
    private boolean avz;
    private a bRB;
    private final Map<ldv, lfs<ljq, Float>> bRC = lcn.emw();
    private ldv bBE;
    private ldv Ud;
    private int bRD = -1;

    public art(bsx bsx2) {
        this.bBe = bsx2;
        this.ObjectType = 152;
        this.Position = (ljq)this.bBe.getValue("Position");
        assert (this.Position != null);
        this.Radius = ((Float)this.bBe.getValue("Radius")).floatValue();
        assert (this.Radius > 0.0f);
        this.bRq = ((Float)this.bBe.getValue("CoolDown")).floatValue();
        this.bRv = ((Float)this.bBe.getValue("SpecialEffectDuration")).floatValue();
        this.bRs = (Boolean)this.bBe.getValue("AffectAI");
        this.bRt = ((Float)this.bBe.getValue("DOT")).floatValue();
        String string = (String)this.bBe.getValue("EffectType");
        this.aYG = bfk.fs(string);
        assert (this.aYG != -1);
        ldi ldi2 = (ldi)lea.enT().acv(this.aYG);
        assert (ldi2 != null);
        lce[] lceArray = ldi2.enl();
        assert (lceArray != null && lceArray.length > 0);
        lce lce2 = lceArray[0];
        int n = lce2.bnM;
        this.bRD = n == 352 || n == 400 || n == 384 ? 1 : 3;
        this.bRu = ((Float)this.bBe.getValue("EffectDelay")).floatValue();
        this.bRr = ((Float)this.bBe.getValue("Magnitude")).floatValue();
        String string2 = (String)this.bBe.getValue("ForceType");
        this.bRw = cxd.iu((String)string2);
        this.bRx = (Integer)this.bBe.getValue("Force");
        String string3 = (String)this.bBe.getValue("SpecialEffect");
        this.bRy = del.dr(string3);
        if (this.bRr == 0.0) assert (this.bRy != -1);
        if (this.bRy == -1) assert (this.bRr != 0.0);
        if (this.bRr != 0.0) assert (this.aYG != -1);
    }

    @Override
    public void doTick(ldz ldz2) {
        double d2 = ldz2.rgz;
        switch (this.bRB) {
            case bRG: {
                if (!(d2 > this.bRA)) break;
                if (!this.avz) {
                    this.So();
                }
                this.bRB = a.bRF;
                break;
            }
            case bRF: {
                if (this.bRC.isEmpty()) break;
                this.bRB = a.bRH;
                break;
            }
            case bRH: {
                if (this.bRy != -1) {
                    asp.a(this.bRy, this.Position, this.GUID, this.MessageDelegator);
                }
                for (Map.Entry<ldv, lfs<ljq, Float>> entry : this.bRC.entrySet()) {
                    lfs<ljq, Float> lfs2 = entry.getValue();
                    lfs2.reY = Float.valueOf((float)d2 + this.bRu);
                    this.d(entry.getKey(), (ljq)entry.getValue().reX);
                }
                this.bRz = d2 + (double)this.bRv;
                if (this.bRq > 0.0) {
                    this.bRA = d2 + this.bRq;
                    this.bRB = a.bRG;
                    this.Sp();
                    break;
                }
                this.bRB = a.bRI;
                break;
            }
            case bRI: {
                if (d2 > this.bRz && !this.bRC.isEmpty()) {
                    this.bRz = d2 + (double)this.bRv;
                    if (this.bRy != -1) {
                        asp.a(this.bRy, this.Position, this.GUID, this.MessageDelegator);
                    }
                }
                if (this.bRC.isEmpty()) break;
                for (Map.Entry<ldv, lfs<ljq, Float>> entry : this.bRC.entrySet()) {
                    lfs<ljq, Float> lfs3 = entry.getValue();
                    if (!(d2 > (double)((Float)lfs3.reY).floatValue())) continue;
                    lfs3.reY = Float.valueOf((float)d2 + this.bRu);
                    this.d(entry.getKey(), (ljq)entry.getValue().reX);
                    this.bRC.put(entry.getKey(), lfs3);
                }
                break;
            }
        }
    }

    private void d(ldv ldv2, ljq ljq2) {
        fcw fcw2 = (fcw)this.MessageDelegator.h(9227, this.GUID, this.MessageDelegator.getGUID());
        if (this.bRt > 0.0) {
            fcw2.gpI = this.bRt;
            fcw2.eKm = this.bRt;
            fcw2.bsE = 5;
        } else {
            fcw2.gpI = this.bRu == 0.0f ? -3.0 : (double)this.bRu;
            fcw2.eKm = this.bRu == 0.0f ? -3.0 : (double)this.bRu;
            fcw2.bsE = this.bRD == 1 ? 1 : 0;
        }
        fcw2.bst = bkd.dqy;
        fcw2.aZG = this.GUID;
        fcw2.akX = new ldv(lcr.abP((int)ldv2.enw()), ldv2.enw(), ldv2.enx());
        fcw2.aYF = this.GUID;
        fcw2.bsG = cug.fsp;
        fcw2.aYC = cxd.fJU;
        fcw2.Magnitude = (float)this.bRr;
        fcw2.aYH = 1;
        fcw2.aYG = this.aYG;
        fcw2.bRD = this.bRD;
        fcw2.aZH = ljq2;
        fcw2.a(cxd.f.fQW);
        this.MessageDelegator.F(fcw2);
        if (this.bRw != 1) {
            ljq ljq3 = new ljq(ljq2);
            ljq3.et(ljq2);
            if (this.bRw == 4) {
                ljq3.y += lew.aj(0.8f, 1.4f);
            }
            ljq3.normalize();
            if (ljq3.isZero()) {
                ljq3 = new ljq(Math.random(), Math.random(), Math.random());
                ljq3.normalize();
            }
            float f2 = this.bRx;
            if ((float)this.bRx < 0.0f) {
                ljq3.esB();
                f2 = -this.bRx;
            }
            gje gje2 = (gje)this.MessageDelegator.h(4622, this.GUID, lcr.qCt);
            gje2.Ui = ldv2;
            gje2.mx = ljq3;
            gje2.gen = this.bRx;
            this.MessageDelegator.F(gje2);
        }
    }

    private void So() {
        if (this.avz) {
            return;
        }
        this.HN();
        this.avz = true;
    }

    private void Sp() {
        if (!this.avz) {
            return;
        }
        this.HR();
        this.bRC.clear();
        this.avz = false;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.bRB = a.bRG;
        this.bRA = this.MessageDelegator.arc().rgz + this.bRq;
        this.So();
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.HR();
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        if (ktv2.getResult() != 0) {
            return;
        }
        switch (ktv2.egT()) {
            case 532: {
                this.a((kws)ktv2);
                break;
            }
            case 512: {
                this.a((kwr)ktv2);
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    private void HN() {
        if (this.Ud == null) {
            kou kou2 = (kou)this.MessageDelegator.h(534);
            kou2.pTa = true;
            kou2.pUN = true;
            kou2.pUO = false;
            kou2.ec = this.GUID;
            kou2.iBr = true;
            kou2.dsK = true;
            kou2.Ud = ldv.rfe;
            kou2.pUL = 0;
            kou2.pUM = this.Radius;
            kou2.pUP = 786624;
            kou2.pTs = this.Position;
            this.bBE = kou2.GUID;
            this.MessageDelegator.a(kou2);
        }
    }

    private void a(kwr kwr2) {
        if (this.bBE != null && this.bBE.equals(kwr2.ev)) {
            this.Ud = kwr2.dJs;
            if (!this.avz) {
                this.HR();
            }
        } else {
            lfn.b(5, this.getClass().getSimpleName(), "handleSensorResponse() Unknown SensorResponse");
        }
    }

    private void a(kws kws2) {
        ljq[] ljqArray = kws2.qfS;
        ldv[] ldvArray = kws2.qfR;
        ldv[] ldvArray2 = kws2.qfT;
        int[] nArray = kws2.qfc;
        if (ldvArray2 != null && ldvArray2.length > 0) {
            for (ldv ldv2 : ldvArray2) {
                if (lcw.enb() && ldv2.ib() != 3) continue;
                this.bRC.remove(ldv2);
            }
        }
        if (ldvArray == null || ldvArray.length == 0) {
            return;
        }
        for (int i = 0; i < ldvArray.length; ++i) {
            int n = nArray[i];
            if (n <= 0) continue;
            ldv ldv3 = ldvArray[i];
            if (lcw.enb() && ldv3.ib() != 3 || this.bRC.containsKey(ldv3) || !lea.enW().isDescendant(n, cug.fgE) || lea.enW().isDescendant(n, cug.fgG) && !this.bRs) continue;
            this.bRC.put(ldv3, new lfs<ljq, Float>(ljqArray[i], Float.valueOf((float)this.MessageDelegator.arc().rgz)));
        }
    }

    private void HR() {
        if (this.Ud != null) {
            kov kov2 = (kov)this.MessageDelegator.h(535);
            kov2.wD(false);
            kov2.ts(this.GUID);
            kov2.sy(this.Ud);
            this.MessageDelegator.a(kov2);
            this.Ud = null;
        }
    }
}

