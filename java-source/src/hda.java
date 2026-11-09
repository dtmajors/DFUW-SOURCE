/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 *  lcy
 */
import java.util.List;

public class hda
extends hog {
    private static final int jGP = 22;
    private static final int jHA = 8;
    private static final int jHB = 30;
    private static final int jHC = 100;
    private final hdm dXw;
    private final hog.a jHD;
    private cqu jJW = null;
    private hqc jJX = null;
    private final lbn jJY = new lbn(this){
        final /* synthetic */ hda jKb;
        {
            this.jKb = hda2;
        }

        public void W() {
            hda.b(this.jKb);
        }
    };
    private final List<c> jHF = lcn.emv();
    private final List<a> jJZ = lcn.emv();
    private final List<b> jKa = lcn.emv();

    public hda(hdm hdm2, String string, lgg lgg2, int n, cqu cqu2) {
        this(hdm2, string, lgg2, new lhf(n, 1200), hdm2.kKl, cqu2);
    }

    @Override
    protected void FG() {
        this.jJW.aZv().cec().a(false, this.jJY);
        for (c lbn2 : this.jHF) {
            lbn2.unregister();
        }
        this.jHF.clear();
        for (a a2 : this.jJZ) {
            a2.unregister();
        }
        this.jJZ.clear();
        for (b b2 : this.jKa) {
            b2.unregister();
        }
        this.jKa.clear();
        super.FG();
    }

    public hda(hdm hdm2, String string, lgg lgg2, lhf lhf2, hog.a a2, cqu cqu2) {
        super((hnc)hdm2, string, lgg2, lhf2, a2);
        this.jJW = cqu2;
        this.dXw = hdm2;
        this.jHD = a2;
        int n = a2.kRX.cg;
        cqu2.aZv().cec().a(true, this.jJY);
        this.a("MEMBER_REFLECTION_QUALITY", n, cqu2.aZi(), lcy.qWG);
        this.a("MEMBER_ENABLE_DEFERRED", n += 30, cqu2.aZh(), lcy.qWF);
        this.a("MEMBER_ENABLE_DYNAMIC_LIGHTING", n += 30, cqu2.aZg(), lcy.qWE);
        this.a("MEMBER_ENABLE_VOXEL_LIGHTING", n += 30, cqu2.aZf(), lcy.qWH);
        this.a("MEMBER_MAXNUMDYNAMICLIGHTS", n += 30, cqu2.aYQ(), lcy.qWI);
        this.a("MEMBER_MAXNUMBLOODSTAINS", n += 30, cqu2.aYR(), lcy.qWJ);
        this.a("MEMBER_MAXNUMPARTICLES", n += 30, cqu2.aYS(), lcy.qWK);
        this.a("MEMBER_AUTO_OPTIMIZE", n += 30, cqu2.aZz(), lcy.qWL);
        this.a("MEMBER_AUTO_OPTIMIZE_TARGET_FPS", n += 30, cqu2.aZy(), lcy.qWM);
        this.a("MEMBER_OBJECT_CLIPPING", n += 30, cqu2.aYT(), lcy.qWN);
        this.a("MEMBER_OBJECT_CLIPPING_MAX_SIZE_TO_CLIP", n += 30, cqu2.aYU(), 1, 0.5f, lcy.qWO);
        this.a("MEMBER_OBJECT_CLIPPING_MAX_FUNCTION_VALUE", n += 30, cqu2.aYV(), 1, 0.5f, lcy.qWP);
        this.a("MEMBER_OBJECT_MIN_DISTANCE_TO_CLIP", n += 30, cqu2.aYW(), 1, 0.5f, lcy.qWQ);
        this.a("MEMBER_ENABLE_DISTANCE_ANIMATION_REDUCTION", n += 30, cqu2.aYX(), lcy.qWR);
        this.a("MEMBER_ANIMATION_DISTANCE_REDUCTION_START", n += 30, cqu2.aYY(), 1, 1.0f, lcy.qWS);
        this.a("MEMBER_ANIMATION_REDUCTION_PER_METER", n += 30, cqu2.aYZ(), 2, 0.01f, lcy.qWT);
        this.a("MEMBER_VEGETATION_AREA_SIZE", n += 30, cqu2.aZa(), lcy.qWU);
        this.a("MEMBER_VEGETATION_DENSITY", n += 30, cqu2.aZb(), lcy.qWV);
        this.a("MEMBER_ENABLE_TRIPLE_BUFFERING", n += 30, cqu2.aZc(), lcy.qWW);
        this.a("MEMBER_WAIT_FOR_VSYNC", n += 30, cqu2.aZd(), lcy.qWX);
        this.a("MEMBER_ENABLE_ANTIALIASING", n += 30, cqu2.aZe(), lcy.qWY);
        this.a("MEMBER_ANTIALIASING_QUALITY", n += 30, cqu2.aZj(), lcy.qWZ);
        this.a("MEMBER_GAMMA_CORRECTION", n += 30, cqu2.aZk(), 2, 0.05f, lcy.qXa);
        this.a("MEMBER_ENABLE_SHADOWS", n += 30, cqu2.aZl(), lcy.qXb);
        this.a("MEMBER_ENABLE_SCENERY_SHADOWS", n += 30, cqu2.aZm(), lcy.qXc);
        this.a("MEMBER_ENABLE_CHARACTER_SHADOWS", n += 30, cqu2.aZn(), lcy.qXd);
        this.a("MEMBER_SHADOW_QUALITY", n += 30, cqu2.aZo(), lcy.qXe);
        this.a("MEMBER_SHADOW_SMOOTHING", n += 30, cqu2.aZp(), lcy.qXf);
        this.a("MEMBER_SHADER_VERSION", n += 30, cqu2.aZq(), lcy.qXh);
        this.a("MEMBER_TEXTURE_QUALITY", n += 30, cqu2.aZr(), lcy.qXi);
        this.a("MEMBER_TEXTURE_FILTERING", n += 30, cqu2.aZs(), lcy.qXj);
        this.a("MEMBER_TEXTURE_ANISOTROPY_LEVEL", n += 30, cqu2.aZt(), lcy.qXk);
        this.a("MEMBER_ENABLE_POST_PROCESS_EFFECT", n += 30, cqu2.aZx(), lcy.qXl);
        this.a("MEMBER_VIDEO_FULLSCREEN", n += 30, cqu2.aZw(), lcy.qXm);
        this.jJX = this.a("MEMBER_VIDEO_RESOLUTION", n += 30, cqu2.aZu(), cqu2.aZv(), lcy.qXn);
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
        c c2 = new c(this, lnt2, hpe2, lfb2);
        c2.W();
        this.jHF.add(c2);
        return hql2;
    }

    private hqj a(String string, int n, lnh lnh2, int n2, double d2, lfb lfb2) {
        hqj hqj2 = new hqj(this.kLu, null, new lgg(this.jHD.kRX.cf, n), new lhf(100, 22), this.dXw.kKx, lnh2, false, n2, d2);
        this.j(hqj2);
        int n3 = this.jHD.kRX.cf + 100 + this.jHD.kRY.cf;
        hpe hpe2 = new hpe(this.kLu, null, new lgg(n3, n), new lhf(this.cch(), 22), this.dXw.kIT, "");
        this.j(hpe2);
        a a2 = new a(this, lnh2, hpe2, lfb2);
        a2.W();
        this.jJZ.add(a2);
        return hqj2;
    }

    private hqk a(String string, int n, lnp lnp2, int n2, float f2, lfb lfb2) {
        hqk hqk2 = new hqk(this.kLu, null, new lgg(this.jHD.kRX.cf, n), new lhf(100, 22), this.dXw.kKx, lnp2, false, n2, f2);
        this.j(hqk2);
        int n3 = this.jHD.kRX.cf + 100 + this.jHD.kRY.cf;
        hpe hpe2 = new hpe(this.kLu, null, new lgg(n3, n), new lhf(this.cch(), 22), this.dXw.kIT, "");
        this.j(hpe2);
        b b2 = new b(this, lnp2, hpe2, lfb2);
        b2.W();
        this.jKa.add(b2);
        return hqk2;
    }

    private hql a(String string, int n, lnt lnt2, lip lip2) {
        hql hql2 = new hql(this.kLu, null, new lgg(this.jHD.kRX.cf, n), new lhf(100, 22), this.dXw.kKx, lnt2, false);
        this.j(hql2);
        int n2 = this.jHD.kRX.cf + 100 + this.jHD.kRY.cf;
        hpe hpe2 = new hpe(this.kLu, null, new lgg(n2, n), new lhf(this.cch(), 22), this.dXw.kIT, "");
        this.j(hpe2);
        return hql2;
    }

    private hqp b(String string, int n, lnt lnt2, lfb lfb2) {
        hqp hqp2 = new hqp(this.kLu, null, new lgg(this.jHD.kRX.cf, n), new lhf(100, 22), this.dXw.kKw, lnt2);
        this.j(hqp2);
        int n2 = this.jHD.kRX.cf + 100 + this.jHD.kRY.cf;
        hpe hpe2 = new hpe(this.kLu, null, new lgg(n2, n), new lhf(this.cch(), 22), this.dXw.kIT, "");
        this.j(hpe2);
        c c2 = new c(this, lnt2, hpe2, lfb2);
        c2.W();
        this.jHF.add(c2);
        return hqp2;
    }

    private hqn a(String string, int n, lnh lnh2, int n2, double d2, lip lip2) {
        hqn hqn2 = new hqn(this.kLu, null, new lgg(this.jHD.kRX.cf, n), new lhf(100, 22), this.dXw.kKw, lnh2, n2, d2);
        this.j(hqn2);
        int n3 = this.jHD.kRX.cf + 100 + this.jHD.kRY.cf;
        hpe hpe2 = new hpe(this.kLu, null, new lgg(n3, n), new lhf(this.cch(), 22), this.dXw.kIT, lip2.esy());
        this.j(hpe2);
        return hqn2;
    }

    private hqo a(String string, int n, lnp lnp2, int n2, float f2, lip lip2) {
        hqo hqo2 = new hqo(this.kLu, null, new lgg(this.jHD.kRX.cf, n), new lhf(100, 22), this.dXw.kKw, lnp2, n2, f2);
        this.j(hqo2);
        int n3 = this.jHD.kRX.cf + 100 + this.jHD.kRY.cf;
        hpe hpe2 = new hpe(this.kLu, null, new lgg(n3, n), new lhf(this.cch(), 22), this.dXw.kIT, lip2.esy());
        this.j(hpe2);
        return hqo2;
    }

    private hqu a(String string, int n, lnd lnd2, lip lip2) {
        hqu hqu2 = new hqu((hnc)this.dXw, null, new lgg(this.jHD.kRX.cf + 100 - this.dXw.kJI.kpT.kLY.rmN, n), new lhf(this.dXw.kJI.kpT.kLY.rmN + this.dXw.kJI.kZx + this.cch(), 22), this.dXw.kJI, lnd2, lip2.esy());
        this.j(hqu2);
        return hqu2;
    }

    private hqe a(String string, int n, lnl lnl2, lip lip2) {
        hqe hqe2 = new hqe((hnc)this.dXw, null, new lgg(this.jHD.kRX.cf, n), new lhf(100, 22), this.dXw.kKH, this.dXw.kKE, 100, lnl2);
        this.j(hqe2);
        int n2 = this.jHD.kRX.cf + 100 + this.jHD.kRY.cf;
        hpe hpe2 = new hpe(this.kLu, null, new lgg(n2, n), new lhf(this.cch(), 22), this.dXw.kIT, lip2.esy());
        this.j(hpe2);
        return hqe2;
    }

    private void ccv() {
        assert (this.jJX != null);
        assert (this.jJW != null);
        this.jJX.kTn.clear();
        List<String> list = csq.hT(this.jJW.aZv().getValue());
        int n = csq.a(list, this.jJW.aZu().getValue(), false);
        assert (!list.isEmpty());
        for (String string : list) {
            this.jJX.kTn.nd(string);
        }
        assert (n >= 0);
        if (n < 0) {
            n = 0;
        }
        this.jJX.jHT.Nw(n);
    }

    private hqc a(String string, int n, loc loc2, loc loc3, lip lip2) {
        hqc hqc2 = new hqc((hnc)this.dXw, null, new lgg(this.jHD.kRX.cf, n), new lhf(100, 22), this.dXw.kKH, this.dXw.kKE, 100, new d(this, loc2));
        List<String> list = csq.hT(loc3.getValue());
        int n2 = csq.a(list, loc2.getValue(), false);
        if (n2 < 0) {
            n2 = 0;
        }
        assert (!list.isEmpty());
        for (String object2 : list) {
            hqc2.kTn.nd(object2);
        }
        hqc2.jHT.Nw(n2);
        this.j(hqc2);
        int n3 = this.jHD.kRX.cf + 100 + this.jHD.kRY.cf;
        hpe hpe2 = new hpe(this.kLu, null, new lgg(n3, n), new lhf(this.cch(), 22), this.dXw.kIT, lip2.esy());
        this.j(hpe2);
        return hqc2;
    }

    static /* synthetic */ hqc a(hda hda2) {
        return hda2.jJX;
    }

    static /* synthetic */ void b(hda hda2) {
        hda2.ccv();
    }
}

