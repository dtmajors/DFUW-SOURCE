/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  hdm
 *  lcy
 */
public class hii
extends hog {
    private final hpx kvj;
    private final hpx kvk;
    private final ldl kvl = new ldl();
    private final lbn kvm = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hii kvp;
        {
            this.kvp = hii2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hii.a(this.kvp)) {
                throw new AssertionError();
            }
            hii.a(this.kvp, a.kvq);
        }

        static {
            $assertionsDisabled = !hii.class.desiredAssertionStatus();
        }
    };
    private final lbn kvn = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hii kvp;
        {
            this.kvp = hii2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hii.a(this.kvp)) {
                throw new AssertionError();
            }
            hii.a(this.kvp, a.kvr);
        }

        static {
            $assertionsDisabled = !hii.class.desiredAssertionStatus();
        }
    };
    private final lbp kkZ = new lbp(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hii kvp;
        {
            this.kvp = hii2;
        }

        public final boolean caU() {
            if (!$assertionsDisabled && !hii.a(this.kvp)) {
                throw new AssertionError();
            }
            hii.a(this.kvp, a.kvq);
            return true;
        }

        static {
            $assertionsDisabled = !hii.class.desiredAssertionStatus();
        }
    };
    private final lbp khJ = new lbp(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hii kvp;
        {
            this.kvp = hii2;
        }

        public final boolean caU() {
            if (!$assertionsDisabled && !hii.a(this.kvp)) {
                throw new AssertionError();
            }
            hii.a(this.kvp, a.kvr);
            return true;
        }

        static {
            $assertionsDisabled = !hii.class.desiredAssertionStatus();
        }
    };
    private boolean Initialized;
    private a kvo;

    public hii(hdm hdm2, String string, lgg lgg2, bpj bpj2) {
        super((hnc)hdm2, string, lgg2, lhf.rnv, hdm2.krh);
        hqy.a a2 = hdm2.kJK;
        lhf lhf2 = new lhf(81, 38);
        int n = 8;
        int n2 = 8;
        Object object = new lhf(588, 401);
        Object object2 = new lhu(((lhf)object).rmN, ((lhf)object).H, "gui/quest_factions/qf_background.dds");
        hms hms2 = new hpa((hnc)hdm2, (String)null, new lgg(0, 0), (lhf)object, (lhu)object2);
        this.j(hms2);
        ((hoy)hms2).H(lcq.COLORSHIFT_NEUTRAL);
        object = hdm2.kIS;
        object2 = bpj2.ats().esy();
        hms2 = new hpe((hnc)hdm2, null, new lgg(28, 15), new lhf(350, 24), (hpe.c)object, (String)object2);
        this.j(hms2);
        object = new lhf(199, 283);
        object2 = bpj2.atw();
        hms2 = new hpa((hnc)hdm2, (String)null, new lgg(385, 36), (lhf)object, (lhu)object2);
        this.j(hms2);
        ((hoy)hms2).H(lcq.COLORSHIFT_NEUTRAL);
        object = new lhf(359, 256);
        object2 = new lgg(18, 39);
        hms2 = new hqr((hnc)hdm2, null, (lgg)object2, (lhf)object, hdm2.kJZ, hmk.a.kKY, hmk.a.kLa);
        this.j(hms2);
        hih hih2 = new hih(hdm2, (String)null, ((lhf)object).rmN - 38, bpj2);
        ((hqr)hms2).cwt().cqd().a(hih2);
        object = new lgg(400, 346);
        this.kvj = new hqy((hnc)hdm2, null, (lgg)object, lhf2, hpx.a.kXm, a2, lcy.qUV.esy());
        this.kvj.cvC().a(true, this.kvm);
        this.j(this.kvj);
        object = new lgg(400 + lhf2.rmN + n2, 346);
        this.kvk = new hqy((hnc)hdm2, null, (lgg)object, lhf2, hpx.a.kXm, a2, lcy.qUW.esy());
        this.kvk.cvC().a(true, this.kvn);
        this.j(this.kvk);
        this.a(hdm2, bpj2);
        this.d(new lhf(588, 401));
    }

    private void a(hdm hdm2, bpj bpj2) {
        int n = 320;
        int n2 = 17;
        int n3 = 10;
        int n4 = 64;
        int n5 = 64;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        int n10 = 8;
        int n11 = 18;
        int n12 = n + n5 - n11;
        int n13 = 40;
        les les2 = lea.enW();
        for (bpl bpl2 : bpj2.Al()) {
            Comparable comparable = les2.acv(bpl2.ResourceType);
            hdw hdw2 = hdw.LW(((ler)comparable).getType());
            comparable = hdw2.cdY();
            if (bpl2.asi > 0) {
                comparable = new ljf(bpl2.asi);
            }
            String string = ((lip)comparable).esy();
            lhf lhf2 = ((hdv)hdw2).atw().kLY;
            if (lhf2.H > 60 || lhf2.rmN > 60) {
                lhf2 = new lhf(60, 60);
            }
            if (n8 > 4) {
                lfn.b(5, this.getClass().getSimpleName(), "makeRewards() : Text = " + string + ".No more slots for rewards.");
                assert (false);
                return;
            }
            n7 = n + (n5 / 2 - lhf2.H / 2);
            n6 = n8 == 0 ? n2 + (n4 / 2 - lhf2.rmN / 2) : n2 + n8 * (n4 + n3) + n4 / 2 - lhf2.rmN / 2;
            lgg lgg2 = new lgg(n6, n7);
            hgq hgq2 = new hgq(hdm2, null, lgg2, lhf2, null, hdw2, false, false, true);
            this.j(hgq2);
            if (bpl2.ResourceType != cug.fkt) {
                n9 = String.valueOf(bpl2.asi).length();
                lgg lgg3 = null;
                n13 = n9 > 3 ? (n13 -= n10 * (n9 - 3)) : 40;
                lgg3 = n8 == 0 ? new lgg(n2 + n13, n12) : new lgg(n2 + n8 * (n4 + n3) + n13, n12);
                hpg hpg2 = new hpg(this.kLu, null, lgg3, new lhf(n9 * n10, n11), hdm2.kII, string);
                this.j(hpg2);
            }
            ++n8;
        }
    }

    public final a cmj() {
        return this.kvo;
    }

    public final lbl<lbn> cmk() {
        return this.kvl;
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.mU(true);
        this.Initialized = true;
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        this.Initialized = false;
        super.FG();
    }

    private void a(a a2) {
        assert (this.Initialized);
        assert (this.kvo == null);
        this.kvo = a2;
        this.kvl.enp();
    }

    private void mU(boolean bl) {
        this.a(bl, this.kkZ, 13, jpn.nLm);
        this.a(bl, this.khJ, 27, jpn.nLm);
    }

    static /* synthetic */ boolean a(hii hii2) {
        return hii2.Initialized;
    }

    static /* synthetic */ void a(hii hii2, a a2) {
        hii2.a(a2);
    }
}

