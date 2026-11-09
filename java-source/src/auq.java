/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dqx
 *  lcr
 *  lcy
 */
public class auq
extends aul {
    private static final int ceu = 0;
    private static final int cdu = 0;
    private static final egg[] cev = new egg[]{new egg("TULLBALL!", egg.a.ipq, false, lcy.qRr)};
    private static final int cew = 0;
    private static final int cex = 1;
    private static final int cey = 2;
    private static final int cez = 3;
    private static final int ceA = 4;
    private static final int ceB = 5;
    private static final int ceC = 6;
    private static final int ceD = 7;
    private static final int ceE = 8;
    private static final int ceF = 9;
    private static final int cdY = 10;
    private static final cqi[] bui = new cqi[]{new cqn(hc.aaP, 0, "audio_dopplerfactor", false, new ldq(0.0f), 0.0f, 1000.0f, lcy.qRr), new cqn(hc.aaP, 1, "audio_rollofffactor", false, new ldq(1.0f), 0.0f, 1000.0f, lcy.qRr), new cqn(hc.aaP, 2, "audio_distancefactor", false, new ldq(1.0f), 0.0f, 1000.0f, lcy.qRr), new cqo(hc.aaP, 3, "audio_max_number_of_sounds", false, new lei(256), 0, 9999999, lcy.qRr), new cqn(hc.aaP, 4, "audio_listen_radius", false, new ldq(350.0f), 1.0f, 2000.0f, lcy.qRr), new cqn(hc.aaP, 5, "audio_min_deltapos_change", false, new ldq(1.0f), 0.0f, 2000.0f, lcy.qRr), new cqj(hc.aaP, 6, "audio_use_audio_cache", false, new lch(true), lcy.qRr), new cqn(hc.aaP, 7, "audio_env_volume", false, new ldq(0.5f), 0.0f, 1.0f, lcy.qRr), new cqn(hc.aaP, 8, "audio_env_fader", false, new ldq(0.7f), 0.0f, 2.0f, lcy.qRr), new cqn(hc.aaP, 9, "audio_emitter_fader", false, new ldq(1.0f), 0.0f, 1.0f, lcy.qRr)};
    private boolean Initialized;
    public static final amd ceG = new amd(avh.class, aul.cdc, "ChatProxyAudio", bui, null);

    public auq() {
        super(ceG);
    }

    @Override
    protected final void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
    }

    @Override
    protected final void FG() {
        assert (this.Initialized);
        this.We();
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected final void b(int n, Object[] objectArray, String string) {
        switch (n) {
            default: 
        }
        super.b(n, objectArray, string);
    }

    @Override
    protected void b(int n, Object object) {
        switch (n) {
            case 0: {
                kil kil2 = this.Vv();
                kil2.XS(1);
                float f2 = ((ldq)this.gG(0)).floatValue();
                kil2.hg(f2);
                this.MessageDelegator.a(kil2);
                return;
            }
            case 1: {
                kil kil3 = this.Vv();
                kil3.XS(2);
                float f3 = ((ldq)this.gG(1)).floatValue();
                kil3.hh(f3);
                this.MessageDelegator.a(kil3);
                return;
            }
            case 2: {
                kil kil4 = this.Vv();
                kil4.XS(4);
                float f4 = ((ldq)this.gG(2)).floatValue();
                kil4.hi(f4);
                this.MessageDelegator.a(kil4);
                return;
            }
            case 3: {
                kil kil5 = this.Vv();
                kil5.XS(128);
                int n2 = ((lei)this.gG(3)).intValue();
                kil5.XR(n2);
                this.MessageDelegator.a(kil5);
                return;
            }
            case 4: {
                kil kil6 = this.Vv();
                kil6.XS(512);
                float f5 = ((ldq)this.gG(4)).floatValue();
                kil6.mb(f5);
                this.MessageDelegator.a(kil6);
                return;
            }
            case 5: {
                kil kil7 = this.Vv();
                kil7.XS(256);
                float f6 = ((ldq)this.gG(5)).floatValue();
                kil7.mc(f6);
                this.MessageDelegator.a(kil7);
                return;
            }
            case 6: {
                ksj ksj2 = (ksj)this.MessageDelegator.j(12);
                ksj2.ts(this.getGUID());
                ksj2.Lu(65536);
                boolean bl = ((lch)this.gG(6)).booleanValue();
                ksj2.my(bl);
                this.MessageDelegator.a(ksj2);
                return;
            }
            case 7: {
                kil kil8 = this.Vv();
                kil8.ts(this.GUID);
                kil8.XS(4096);
                float f7 = ((ldq)this.gG(7)).floatValue();
                kil8.me(f7);
                this.MessageDelegator.a(kil8);
                return;
            }
            case 8: {
                dqx dqx2 = (dqx)this.MessageDelegator.bzx().bzt().d(lcr.qDY);
                if (dqx2 != null) {
                    float f8 = ((ldq)this.gG(8)).floatValue();
                    dqx.ht((float)f8);
                }
                return;
            }
            case 9: {
                bsu bsu2 = (bsu)this.MessageDelegator.bzx().bzt().d(lcr.qEn);
                if (bsu2 != null) {
                    float f9 = ((ldq)this.gG(9)).floatValue();
                    bsu2.df(f9);
                }
                return;
            }
        }
        super.b(n, object);
    }

    private kil Vv() {
        kil kil2 = (kil)this.MessageDelegator.h(1284);
        kil2.ts(this.GUID);
        kil2.wD(false);
        kil2.jM(false);
        kil2.tB(lcr.qBT);
        return kil2;
    }
}

