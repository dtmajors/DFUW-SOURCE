/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hlv
 *  lcr
 *  lcy
 */
import java.util.LinkedList;
import java.util.List;

public class hbu
extends hnv
implements hbg {
    private cz jEm;
    private Integer jEn;
    private ch jEo;
    public static final int jEp = 9;
    private hbf jBJ;
    private hnu jCe = null;
    private hpa jEq;
    private lhf jEr = new lhf(128, 128);
    private boolean Initialized;
    private final lbn jEs = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hbu jEw;
        {
            this.jEw = hbu2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hbu.a(this.jEw)) {
                throw new AssertionError();
            }
            hoz hoz2 = (hoz)hbu.b(this.jEw).csT();
            hoz.a a2 = hoz2.coZ();
            if (a2 == hbu.cbz()) {
                efx efx2 = (efx)hbu.c((hbu)this.jEw).jWV.cdh.rng.ik(14341);
                efx2.Ea(2308);
                efx2.on(lcr.qEp);
                cv<String> cv2 = new cv<String>();
                cv2.a(ct.ky);
                cv2.d(hbu.d(this.jEw).aH());
                efx2.b(new cv[]{cv2});
                hbu.c((hbu)this.jEw).jWV.cdh.rnh.m(efx2);
            }
            hbu.a(this.jEw, null);
        }

        static {
            $assertionsDisabled = !hbu.class.desiredAssertionStatus();
        }
    };
    private hpe jEt;
    private static final hoz.a jEu = new hoz.a(lcy.qQB);
    private static final hoz.a jEv = new hoz.a(lcy.qUX);

    public hbu(hbm hbm2, lgg lgg2, cz cz2, Integer n) {
        super((hnc)((Object)hbm2), "", lgg2, new lhf(hbo.jDD.kLY.rmN, hbo.jDD.kLY.H), hbu.b(cz2));
        this.jEm = cz2;
        this.jEn = n;
        if (this.jEm == null) {
            assert (false) : "No config";
            this.jEm = new cz(null, null);
        }
    }

    private static hnv.a b(cz cz2) {
        lhu lhu2 = new lhu(512, 512, cz2.MapTexture);
        return new hnv.a(lhu2, lcq.COLORSHIFT_NEUTRAL);
    }

    @Override
    protected void FF() {
        this.Initialized = true;
        super.FF();
        ch ch2 = this.jEm.Bindstones.get(this.jEn);
        if (ch2 == null) {
            ch2 = this.jEm.Bindstones.get(0);
        }
        this.jEo = ch2;
        int n = this.kLu.kND.cqv().rmN;
        int n2 = this.kLu.kND.cqv().H;
        String string = "gui/character_creator/chr_cr_start_background_tiled.dds";
        Object object = new lgg(0, 0);
        Object object2 = new lhf(n, n2);
        Object object3 = new lhu(n, n2, string);
        hpa hpa2 = new hpa(this.kLu, (String)null, (lgg)object, (lhf)object2, (lhu)object3);
        this.cbo().jCr.j(hpa2);
        int n3 = 512;
        object = "gui/character_creator/chr_cr_start_heading_background.dds";
        object2 = new lgg((n - n3) / 2, 0);
        object3 = new lhu(n3, 128, (String)object);
        hpa2 = new hpa(this.kLu, (String)null, (lgg)object2, new lhf(n3, 128), (lhu)object3);
        this.cbo().jCr.j(hpa2);
        object = new lhf(n3, 50);
        object2 = new lgg((n - n3) / 2, 10);
        object3 = new hpe(this.kLu, "", (lgg)object2, (lhf)object, ((hbm)((Object)this.kLu)).jCc, "Choose starting town");
        this.cbo().jCr.j((hms)object3);
        object = new lhf(n3, 50);
        object2 = new lgg((n - n3) / 2, 47);
        this.jEt = new hpe(this.kLu, "", (lgg)object2, (lhf)object, ((hbm)((Object)this.kLu)).jCd, "");
        this.cbo().jCr.j(this.jEt);
        if (this.jEo != null) {
            this.mb(this.jEo.aK());
        } else {
            this.mb("none selected");
        }
        String string2 = ch2.aJ();
        object = new lhu(128, 128, string2);
        object2 = this.jEm.Bindstones;
        this.jEq = new hpa(this.kLu, (String)null, ((ch)object2.get(this.jEn)).aI(), new lhf(128, 128), (lhu)object);
        this.jEo = (ch)object2.get(this.jEn);
        this.j(this.jEq);
        this.jEq.H(hbu.b((cz)this.jEm).ktY);
    }

    public void cbt() {
        this.jBJ = ((hbm)((Object)this.kLu)).I(9, true);
        this.jBJ.a(this);
        this.cbo().jCr.j(this.jBJ);
    }

    private void mb(String string) {
        this.jEt.mV(string);
    }

    private hbm caP() {
        return (hbm)((Object)this.kLu);
    }

    @Override
    protected void cbu() {
        super.cbu();
        this.cbx();
    }

    @Override
    protected void cbv() {
        this.cbw();
        super.cbv();
    }

    private void cbw() {
        List<ch> list = this.jEm.Bindstones;
        lgg lgg2 = this.cqu();
        for (ch ch2 : list) {
            lgg lgg3 = ch2.aI();
            lgs lgs2 = new lgs(lgg3, this.jEr);
            if (!lgs2.A(lgg2)) continue;
            lhu lhu2 = new lhu(128, 128, ch2.aJ());
            this.jEq.a(lhu2);
            this.jEq.z(lgg3);
            this.mb(ch2.aK());
            this.jEo = ch2;
            break;
        }
    }

    private void cbx() {
        List<ch> list = this.jEm.Bindstones;
        lgg lgg2 = this.cqu();
        for (ch ch2 : list) {
            lgg lgg3 = ch2.aI();
            lgs lgs2 = new lgs(lgg3, this.jEr);
            if (!lgs2.A(lgg2)) continue;
            LinkedList<hnt> linkedList = new LinkedList<hnt>();
            linkedList.add(new hnt(this.cby().kKo, ch2.aK()));
            this.kLu.a(null, linkedList);
            break;
        }
    }

    private hlv cby() {
        return (hlv)this.kLu;
    }

    @Override
    public void LB(int n) {
        if ((n & 0xFF) == 4) {
            this.jCe = this.kLu.a(lcx.qQY.esy(), null, new hoz.a[]{jEu, jEv}, null, jEu, jEu, this.jEs);
            return;
        }
        efx efx2 = (efx)this.caP().jWV.cdh.rng.ik(14341);
        efx2.Ea(n);
        efx2.on(lcr.qEp);
        cv<String> cv2 = new cv<String>();
        cv2.a(ct.ky);
        cv2.d(this.jEo.aH());
        efx2.b(new cv[]{cv2});
        this.caP().jWV.cdh.rnh.m(efx2);
    }

    public void a(cz cz2) {
        this.jEm = cz2;
    }

    protected final hbm cbo() {
        return (hbm)((Object)this.kLu);
    }

    static /* synthetic */ boolean a(hbu hbu2) {
        return hbu2.Initialized;
    }

    static /* synthetic */ hnu b(hbu hbu2) {
        return hbu2.jCe;
    }

    static /* synthetic */ hoz.a cbz() {
        return jEu;
    }

    static /* synthetic */ hbm c(hbu hbu2) {
        return hbu2.caP();
    }

    static /* synthetic */ ch d(hbu hbu2) {
        return hbu2.jEo;
    }

    static /* synthetic */ hnu a(hbu hbu2, hnu hnu2) {
        hbu2.jCe = hnu2;
        return hbu2.jCe;
    }
}

