/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public class cdz
extends cea {
    private dez dKP = new dez();
    private dfr eoi = null;
    private dkz eoj = null;
    private double oV = 0.0;
    private double aAh = 0.0;
    private double eok = 0.0;
    private double eol = 0.0;
    private boolean eom = false;
    private boolean eon = false;
    private lcq eoo = lcq.BRIGHT_WHITE;
    private lcq eop = lcq.BRIGHT_WHITE_TRANSPARENT;
    private float eoq = 0.0f;
    private float eor = 0.1f;
    private ldz eos;
    private dfb[] enY = null;
    private int enZ;

    @Override
    public cea aKA() {
        cdz cdz2 = new cdz();
        return cdz2;
    }

    @Override
    public void doTick(ldz ldz2) {
        assert (this.Initialized);
        this.eos = ldz2;
        this.Q(ldz2);
        this.R(ldz2);
    }

    @Override
    public void initialize() {
        if (!this.Initialized) {
            super.initialize();
            this.aKD();
            this.aKC();
            this.Initialized = true;
        }
    }

    @Override
    public void c(et et2, float f2) {
        if (et2.getType() == 352) {
            float f3 = et2.fN() - f2;
            float f4 = this.eot.aFh().fi().ai(et2.getType());
            this.q(f3, f4);
        }
    }

    public void q(float f2, float f3) {
        if (f2 > 0.0f) {
            return;
        }
        float f4 = -f2 / f3;
        if (f2 < 0.0f) {
            if (f4 > this.eoq) {
                this.eom = true;
            }
            if (f4 > this.eor) {
                this.eon = true;
            }
        }
    }

    private void Q(ldz ldz2) {
        if (!this.Initialized) {
            return;
        }
        if (this.eom) {
            this.eom = false;
            int n = lcw.qFT;
            int n2 = lcw.qFU;
            int n3 = 256;
            int n4 = 128;
            this.eoi.setVisible(true);
            this.oV = ldz2.rgz + 0.1;
            this.aAh = this.oV + 0.2;
            ljp ljp2 = new ljp();
            ljp2.x = (float)n / (float)n3;
            ljp2.y = (float)n2 / (float)n3;
            this.eoi.j(ljp2);
            this.playSound(0);
        }
        if (this.eoi == null) {
            return;
        }
        if (ldz2.rgz > this.aAh && this.eoi.isVisible()) {
            this.eoi.setVisible(false);
        }
        if (ldz2.rgz >= this.oV && ldz2.rgz <= this.aAh) {
            float f2 = (float)((ldz2.rgz - this.oV) / (this.aAh - this.oV));
            f2 = lew.A(f2, 0.0f, 1.0f);
            lcq lcq2 = lcq.a(this.eoo, this.eop, f2);
            this.eoi.setColor(lcq2);
        }
    }

    private void R(ldz ldz2) {
        if (!this.Initialized) {
            return;
        }
        if (this.eon) {
            this.eok = ldz2.rgz;
            this.eol = ldz2.rgz + (double)0.3f;
            this.eoj.setStartTime((float)this.eok);
            this.eoj.gO((float)this.eol);
            this.eoj.gP(0.7853982f);
            this.eon = false;
        }
        if (ldz2.rgz > (double)this.eoj.boq()) {
            return;
        }
        float f2 = this.eoj.gN((float)ldz2.rgz);
        lgl lgl2 = new lgl(f2, 0.0f, 0.0f);
        assert (this.eou != null);
        this.eou.E(lgl2);
    }

    private void playSound(int n) {
        if (this.enY != null && n < this.enY.length && this.enY[n] != null && this.enY[n].isInitialized()) {
            this.enY[n].blv();
        }
    }

    private void aKD() {
        this.eoi = (dfr)this.dKP.Af(15);
        this.eoi.setTextureName("sfx_bloodsplatter_frame_01.dds");
        this.eoi.setVisible(false);
        this.eoi.setGUID(this.MessageDelegator.bzv());
        int n = 256;
        int n2 = 256;
        int n3 = lcw.qFT;
        int n4 = lcw.qFU;
        ljp ljp2 = new ljp();
        this.eoi.hT(false);
        this.eoi.hU(false);
        this.eoi.hV(true);
        this.eoi.k(new ljp(0.0f, 0.0f));
        ljp2.x = (float)n3 / (float)n;
        ljp2.y = (float)n4 / (float)n2;
        this.eoi.j(ljp2);
        this.eoi.setColor(this.eoo);
        this.MessageDelegator.a(this.eoi);
        this.eoj = new dkz();
    }

    private void aKC() {
        this.enZ = 1;
        int n = 0;
        this.enY = new dfb[this.enZ];
        this.enY[n] = (dfb)this.dKP.Af(3);
        this.enY[n].setDefaultValues();
        this.enY[n].setXMLFileName("Audio/2headshotself.xml");
        this.enY[n].hO(false);
        this.enY[n].setLooping(false);
        this.enY[n].setPlayingOnce(false);
        this.enY[n].setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.enY[n]);
    }

    @Override
    public void cleanUp() {
        if (this.eoi != null) {
            this.MessageDelegator.hd(this.eoi.getGUID());
            this.eoi = null;
        }
        super.cleanUp();
    }
}

