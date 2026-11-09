/*
 * Decompiled with CFR.
 */
public class cqu
extends lmx {
    public boolean bYr = false;
    public static final String eUX = "MEMBER_ENABLE_DYNAMIC_LIGHTING";
    public static final String eUY = "MEMBER_ENABLE_DEFERRED";
    public static final String eUZ = "MEMBER_REFLECTION_QUALITY";
    public static final String eVa = "MEMBER_ENABLE_VOXEL_LIGHTING";
    public static final String eVb = "MEMBER_MAXNUMDYNAMICLIGHTS";
    public static final String eVc = "MEMBER_MAXNUMBLOODSTAINS";
    public static final String eVd = "MEMBER_MAXNUMPARTICLES";
    public static final String eVe = "MEMBER_OBJECT_CLIPPING";
    public static final String eVf = "MEMBER_OBJECT_CLIPPING_MAX_SIZE_TO_CLIP";
    public static final String eVg = "MEMBER_OBJECT_CLIPPING_MAX_FUNCTION_VALUE";
    public static final String eVh = "MEMBER_OBJECT_MIN_DISTANCE_TO_CLIP";
    public static final String eVi = "MEMBER_ENABLE_DISTANCE_ANIMATION_REDUCTION";
    public static final String eVj = "MEMBER_ANIMATION_DISTANCE_REDUCTION_START";
    public static final String eVk = "MEMBER_ANIMATION_REDUCTION_PER_METER";
    public static final String eVl = "MEMBER_VEGETATION_AREA_SIZE";
    public static final String eVm = "MEMBER_VEGETATION_DENSITY";
    public static final String eVn = "MEMBER_ENABLE_TRIPLE_BUFFERING";
    public static final String eVo = "MEMBER_WAIT_FOR_VSYNC";
    public static final String eVp = "MEMBER_ENABLE_ANTIALIASING";
    public static final String eVq = "MEMBER_ANTIALIASING_QUALITY";
    public static final String eVr = "MEMBER_GAMMA_CORRECTION";
    public static final String eVs = "MEMBER_ENABLE_SHADOWS";
    public static final String eVt = "MEMBER_ENABLE_SCENERY_SHADOWS";
    public static final String eVu = "MEMBER_ENABLE_CHARACTER_SHADOWS";
    public static final String eVv = "MEMBER_SHADOW_QUALITY";
    public static final String eVw = "MEMBER_SHADOW_SMOOTHING";
    public static final String eVx = "MEMBER_SHADER_VERSION";
    public static final String eVy = "MEMBER_TEXTURE_QUALITY";
    public static final String eVz = "MEMBER_TEXTURE_FILTERING";
    public static final String eVA = "MEMBER_TEXTURE_ANISOTROPY_LEVEL";
    public static final String eVB = "MEMBER_VIDEO_RESOLUTION";
    public static final String eVC = "MEMBER_VIDEO_RESOLUTION_DISPLAY_LIST";
    public static final String eVD = "MEMBER_VIDEO_FULLSCREEN";
    public static final String eVE = "MEMBER_ENABLE_POST_PROCESS_EFFECT";
    public static final String eVF = "MEMBER_AUTO_OPTIMIZE";
    public static final String eVG = "MEMBER_AUTO_OPTIMIZE_TARGET_FPS";

    public cqu() {
        super(a.eWa);
    }

    @Override
    protected boolean a(lob lob2) {
        this.bYr = ((cqu)lob2).bYr;
        return super.a(lob2);
    }

    @Override
    public boolean a(lfu lfu2) {
        this.bYr = true;
        boolean bl = super.a(lfu2);
        this.bYr = false;
        return bl;
    }

    public lnt aYQ() {
        return (lnt)this.AM(eVb);
    }

    public lnt aYR() {
        return (lnt)this.AM(eVc);
    }

    public lnt aYS() {
        return (lnt)this.AM(eVd);
    }

    public lnd aYT() {
        return (lnd)this.AM(eVe);
    }

    public lnp aYU() {
        return (lnp)this.AM(eVf);
    }

    public lnp aYV() {
        return (lnp)this.AM(eVg);
    }

    public lnp aYW() {
        return (lnp)this.AM(eVh);
    }

    public lnd aYX() {
        return (lnd)this.AM(eVi);
    }

    public lnp aYY() {
        return (lnp)this.AM(eVj);
    }

    public lnp aYZ() {
        return (lnp)this.AM(eVk);
    }

    public lnt aZa() {
        return (lnt)this.AM(eVl);
    }

    public lnt aZb() {
        return (lnt)this.AM(eVm);
    }

    public lnd aZc() {
        return (lnd)this.AM(eVn);
    }

    public lnd aZd() {
        return (lnd)this.AM(eVo);
    }

    public lnd aZe() {
        return (lnd)this.AM(eVp);
    }

    public lnd aZf() {
        return (lnd)this.AM(eVa);
    }

    public lnd aZg() {
        return (lnd)this.AM(eUX);
    }

    public lnd aZh() {
        return (lnd)this.AM(eUY);
    }

    public lnd aZi() {
        return (lnd)this.AM(eUZ);
    }

    public lnt aZj() {
        return (lnt)this.AM(eVq);
    }

    public lnp aZk() {
        return (lnp)this.AM(eVr);
    }

    public lnd aZl() {
        return (lnd)this.AM(eVs);
    }

    public lnd aZm() {
        return (lnd)this.AM(eVt);
    }

    public lnd aZn() {
        return (lnd)this.AM(eVu);
    }

    public lnl<css.a> aZo() {
        return (lnl)this.AM(eVv);
    }

    public lnl<css.b> aZp() {
        return (lnl)this.AM(eVw);
    }

    public lnl<csr.a> aZq() {
        return (lnl)this.AM(eVx);
    }

    public lnl<cst.c> aZr() {
        return (lnl)this.AM(eVy);
    }

    public lnl<cst.b> aZs() {
        return (lnl)this.AM(eVz);
    }

    public lnl<cst.a> aZt() {
        return (lnl)this.AM(eVA);
    }

    public loc aZu() {
        return (loc)this.AM(eVB);
    }

    public loc aZv() {
        return (loc)this.AM(eVC);
    }

    public lnd aZw() {
        return (lnd)this.AM(eVD);
    }

    public lnd aZx() {
        return (lnd)this.AM(eVE);
    }

    public lnt aZy() {
        return (lnt)this.AM(eVG);
    }

    public lnd aZz() {
        return (lnd)this.AM(eVF);
    }
}

