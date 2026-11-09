/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 *  lcy
 */
import java.util.List;

public class hcp
extends hog {
    private static final int jGP = 22;
    private static final int jHA = 8;
    private static final int jHB = 30;
    private static final int jHC = 100;
    private final hdm dXw;
    private final hog.a jHD;
    private atk jHE = null;
    private final List<a> jHF = lcn.emv();

    public hcp(hdm hdm2, String string, lgg lgg2, int n, atk atk2) {
        this(hdm2, string, lgg2, new lhf(n, 1000), hdm2.kKl, atk2);
    }

    @Override
    protected void FG() {
        for (a a2 : this.jHF) {
            a2.unregister();
        }
        this.jHF.clear();
        super.FG();
    }

    public hcp(hdm hdm2, String string, lgg lgg2, lhf lhf2, hog.a a2, atk atk2) {
        super((hnc)hdm2, string, lgg2, lhf2, a2);
        this.jHE = atk2;
        this.dXw = hdm2;
        this.jHD = a2;
        int n = a2.kRX.cg;
        this.a("MEMBER_MAX_NUM_3D_SOUNDS", n, atk2.Vi(), lcy.qXo);
        this.a("MEMBER_AMBIENCE_VOLUME", n += 30, atk2.Vj(), lcy.qXp);
        this.a("MEMBER_HITSOUND_ENABLED", n += 30, atk2.Vk(), lcy.qXq);
        this.a("MEMBER_PRIVATE_MESSAGE_SOUND_ENABLED", n += 30, atk2.Vl(), lcy.qXr);
        this.a("MEMBER_SOUND_VOLUME", n += 30, atk2.Vm(), lcy.qXs);
        n += 30;
    }

    private int cch() {
        return this.getWidth() - (this.jHD.kRX.cf * 2 + 100 + this.jHD.kRY.cf);
    }

    private hql a(String string, int n, lnt lnt2, lfb lfb2) {
        hql hql2 = new hql(this.kLu, null, new lgg(this.jHD.kRX.cf, n), new lhf(100, 22), this.dXw.kKx, lnt2, false);
        this.j(hql2);
        int n2 = this.jHD.kRX.cf + 100 + this.jHD.kRY.cf;
        hpe hpe2 = new hpe(this.kLu, null, new lgg(n2, n), new lhf(this.cch(), 22), this.dXw.kIT, "");
        this.j(hpe2);
        a a2 = new a(this, lnt2, hpe2, lfb2);
        a2.W();
        this.jHF.add(a2);
        return hql2;
    }

    private hqu a(String string, int n, lnd lnd2, lip lip2) {
        hqu hqu2 = new hqu((hnc)this.dXw, null, new lgg(this.jHD.kRX.cf + 100 - this.dXw.kJI.kpT.kLY.rmN, n), new lhf(this.dXw.kJI.kpT.kLY.rmN + this.dXw.kJI.kZx + this.cch(), 22), this.dXw.kJI, lnd2, lip2.esy());
        this.j(hqu2);
        return hqu2;
    }
}

