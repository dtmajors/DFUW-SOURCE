/*
 * Decompiled with CFR.
 */
public class dg
extends btk
implements bto {
    private boolean fE = true;
    private dqj[] lT = new dqj[7];
    private dqj[] lU = new dqj[2];
    private double lV;
    private double lW;
    private boolean lX;
    private String lY = "audio/track1.mp3";
    private ldv lZ;

    @Override
    public void initialize() {
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.fE) {
            this.cN();
            this.fE = false;
        }
    }

    private void cM() {
        int n2;
        System.out.println("\n---------------\nSF-Debug: Inserting 2daudio!\n-----------------\n");
        String string = null;
        dqj dqj2 = null;
        for (n2 = 0; n2 < 7; ++n2) {
            string = "2DAudioA" + n2 + ".xml";
            dqj2 = new dqj();
            dqj2.setActive(true);
            dqj2.setGUID(this.MessageDelegator.lL(this.GUID));
            dqj2.iW(string);
            this.lT[n2] = dqj2;
            this.MessageDelegator.a((amf)((Object)dqj2));
            ksk ksk2 = (ksk)this.MessageDelegator.j(8);
            ksk2.hC(this.lT[n2].getGUID());
            ksk2.xc(string);
            this.MessageDelegator.a(ksk2);
            lfn.print(" <><> Created AudioResource for Audio GUID[" + (Object)((Object)this.lT[n2]) + ", ResourceFile=" + string);
        }
        for (n2 = 1; n2 < 3; ++n2) {
            string = "2DAudioB" + n2 + ".xml";
            dqj2 = new dqj();
            dqj2.setActive(true);
            dqj2.setGUID(this.MessageDelegator.lL(this.GUID));
            dqj2.iW(string);
            this.lU[n2 - 1] = dqj2;
            this.MessageDelegator.a((amf)((Object)dqj2));
        }
    }

    private void R(int n2) {
        lfn.b(0, this.getClass().getName(), "playAudio() : Play ambien audio");
        kih kih2 = (kih)this.MessageDelegator.h(1281);
        kih2.XP(1);
        kih2.wL(false);
        kih2.tB(this.lT[n2].getGUID());
        this.MessageDelegator.a(kih2);
        this.lT[n2].play();
    }

    private void m(ldv ldv2) {
        lfn.b(0, this.getClass().getName(), "playAudio() : Play ambien audio");
        kih kih2 = (kih)this.MessageDelegator.h(1281);
        kih2.ts(this.GUID);
        kih2.XP(1);
        kih2.wL(false);
        kih2.tB(ldv2);
        this.MessageDelegator.a(kih2);
    }

    private void S(int n2) {
        this.lU[n2].play();
    }

    private void cN() {
        this.lZ = this.MessageDelegator.bzv();
        lfn.b(0, this.getClass().getName(), "playMP3() : playing: " + this.lY);
        kim kim2 = (kim)this.MessageDelegator.h(1282);
        kim2.ts(this.GUID);
        kim2.tB(this.lZ);
        kim2.pBh = 1;
        kim2.ResourceName = this.lY;
        this.MessageDelegator.a(kim2);
    }
}

