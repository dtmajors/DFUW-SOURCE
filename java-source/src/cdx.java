/*
 * Decompiled with CFR.
 */
import java.util.Map;

public class cdx
extends cea {
    private Map enT = lcn.emw();
    private dku enU = null;
    private dku enV = null;
    private ljq Qe = null;
    private dkv enW = new dkv(1, 6);
    private dkv enX = new dkv(this.enW);
    private dfb[] enY = null;
    private int enZ;
    private dez dKP = new dez();
    private float eoa = 0.0f;
    private float eob = 0.25f;
    private float eoc = 0.75f;

    public cdx() {
        this.fJ(false);
    }

    public void a(dku dku2) {
        if (dku2 == null) {
            return;
        }
        if (this.enT.containsKey(dku2.bnT())) {
            return;
        }
        this.enT.put(dku2.bnT(), dku2);
    }

    @Override
    public cea aKA() {
        assert (!this.Initialized);
        cdx cdx2 = new cdx();
        for (dku dku2 : this.enT.values()) {
            cdx2.a(dku2.bnW());
        }
        return cdx2;
    }

    @Override
    public void doTick(ldz ldz2) {
        if (!this.Initialized) {
            return;
        }
        if (this.eou == null) {
            this.dY();
        }
        if (this.eou == null) {
            return;
        }
        if (this.enU != null) {
            this.enU.gM((float)ldz2.rgz);
            assert (this.eou != null) : "Need a camera";
            this.eou.cc(this.enU.Bc());
            this.eou.E(this.enU.Bd());
            if (this.enY != null && this.enY[0] != null && this.enY[0].isInitialized()) {
                float f2 = (float)ldz2.rgz / this.enU.getDuration();
                float f3 = (float)Math.floor(f2);
                f2 -= f3;
                boolean bl = false;
                boolean bl2 = false;
                if (this.eoa < this.eob && f2 >= this.eob) {
                    bl = true;
                }
                if (this.eoa < this.eoc && f2 >= this.eoc) {
                    bl2 = true;
                }
                this.eoa = f2;
                int n = (int)(Math.random() + 0.5);
                int n2 = (int)(Math.random() + 0.5);
                n2 += 2;
                if (bl2 && bl) {
                    this.enY[n2].blv();
                } else if (bl) {
                    this.enY[n].blv();
                } else if (bl2) {
                    this.enY[n2].blv();
                }
            }
        }
    }

    @Override
    public void initialize() {
        if (!this.eov) {
            this.Initialized = true;
            return;
        }
        super.initialize();
        this.aKB();
        this.aKC();
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
    }

    @Override
    public void pk(int n) {
        dkv dkv2 = new dkv(n, this.enW.vO());
        this.enX = this.enW;
        this.enW = dkv2;
        this.a(dkv2);
    }

    @Override
    public void oV(int n) {
        dkv dkv2 = new dkv(this.enW.vN(), n);
        this.enX = this.enW;
        this.enW = dkv2;
        this.a(dkv2);
    }

    private void a(dkv dkv2) {
        dku dku2 = null;
        if (this.enT.containsKey(dkv2)) {
            dku2 = (dku)this.enT.get(dkv2);
        }
        this.enV = this.enU;
        this.enU = dku2;
        if (this.enU != null) {
            // empty if block
        }
    }

    private void aKB() {
        byv byv2 = this.eot.aEP();
        if (byv2 == null) {
            return;
        }
        this.pk(byv2.vN());
        this.oV(byv2.vO());
    }

    public ljq Up() {
        return this.Qe;
    }

    public void bi(ljq ljq2) {
        this.Qe = ljq2;
    }

    private void aKC() {
        this.enZ = 4;
        this.enY = new dfb[4];
        this.enY[0] = (dfb)this.dKP.Af(3);
        this.enY[0].setDefaultValues();
        this.enY[0].setXMLFileName("Audio/2DMudWalk0.xml");
        this.enY[0].hO(false);
        this.enY[0].setLooping(false);
        this.enY[0].setPlayingOnce(false);
        this.enY[0].setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.enY[0]);
        this.enY[1] = (dfb)this.dKP.Af(3);
        this.enY[1].setDefaultValues();
        this.enY[1].setXMLFileName("Audio/2DMudWalk1.xml");
        this.enY[1].hO(false);
        this.enY[1].setLooping(false);
        this.enY[1].setPlayingOnce(false);
        this.enY[1].setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.enY[1]);
        this.enY[2] = (dfb)this.dKP.Af(3);
        this.enY[2].setDefaultValues();
        this.enY[2].setXMLFileName("Audio/2DMudWalk2.xml");
        this.enY[2].hO(false);
        this.enY[2].setLooping(false);
        this.enY[2].setPlayingOnce(false);
        this.enY[2].setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.enY[2]);
        this.enY[3] = (dfb)this.dKP.Af(3);
        this.enY[3].setDefaultValues();
        this.enY[3].setXMLFileName("Audio/2DMudWalk3.xml");
        this.enY[3].hO(false);
        this.enY[3].setLooping(false);
        this.enY[3].setPlayingOnce(false);
        this.enY[3].setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.enY[3]);
    }
}

