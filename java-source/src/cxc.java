/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cxd
 *  cxg
 *  cyt
 *  lcr
 */
public class cxc
extends btk
implements bsj,
Comparable<cxc> {
    public static final float fGW = 100.0f;
    public static final float fGX = 1.0f;
    public static final float fGY = 99.6f;
    protected cyt emI = null;
    protected int SkillType = 0;
    protected boolean fGZ = false;
    private float SkillLevel = 0.0f;
    protected float AdvancementRate = 0.0f;
    private dea[] fHa = null;
    private String fHb = null;
    protected static les dqt = lea.enU();
    protected static les ResourceTree = lea.enW();
    protected static les aqN = lea.enZ();

    public cxc() {
        this.ObjectType = 56;
    }

    public final cyt aJz() {
        return this.emI;
    }

    public void a(cyt cyt2, boolean bl) {
        this.emI = cyt2;
    }

    public final int zg() {
        return this.SkillType;
    }

    public final void eI(int n2) {
        if (n2 <= 0) {
            lfn.b(5, "SFSkillBase", "setSkillType() SkillType is invalid.");
            assert (false);
            return;
        }
        this.SkillType = n2;
    }

    public final String Bu() {
        if (this.SkillType <= 0) {
            lfn.b(5, "SFSkillBase", "getSkillName() SkillType has not been set.");
            assert (false);
            return "Undefined Skill";
        }
        return lea.enZ().getName(this.SkillType);
    }

    public final boolean bft() {
        return this.fGZ;
    }

    public final void hl(boolean bl) {
        this.fGZ = bl;
    }

    @Override
    public final float Bt() {
        return this.SkillLevel;
    }

    public final void ag(float f2) {
        assert (f2 <= 100.0f);
        if (this.Initialized) assert (f2 >= 1.0f);
        this.SkillLevel = f2;
    }

    @Override
    public final float pe() {
        return this.AdvancementRate;
    }

    public final void J(float f2) {
        this.AdvancementRate = f2;
    }

    public final dea[] bfu() {
        return this.fHa;
    }

    public final void a(dea[] deaArray) {
        this.fHa = deaArray;
    }

    public final int f(cxc cxc2) {
        if (this.GUID.eny() > cxc2.getGUID().eny()) {
            return 1;
        }
        if (this.GUID.eny() < cxc2.getGUID().eny()) {
            return -1;
        }
        return 0;
    }

    public final float xn(int n2) {
        if (n2 <= 0) {
            lfn.b(5, "SFSkillBase", "computeGeneralSkillFunction(1) SkillFunctionType is invalid.");
            return 0.0f;
        }
        return cxg.d((cxc)this, (int)n2);
    }

    public final float bn(int n2, int n3) {
        if (n2 <= 0) {
            lfn.b(5, "SFSkillBase", "computeGeneralSkillFunction(2) SkillType is invalid.");
            return 0.0f;
        }
        if (n3 <= 0) {
            lfn.b(5, "SFSkillBase", "computeGeneralSkillFunction(2) SkillFunctionType is invalid.");
            return 0.0f;
        }
        cxc cxc2 = this.emI.ht(n2);
        if (cxc2 == null) {
            lfn.b(5, "SFSkillBase", "computeGeneralSkillFunction(2) Skill '" + aqN.getName(n2) + "' was not found.");
            return 0.0f;
        }
        return cxg.d((cxc)cxc2, (int)n3);
    }

    public final float fG(int n2) {
        if (n2 <= 0) {
            lfn.b(5, "SFSkillBase", "computeSkillFunction() SkillFunctionType is invalid.");
            return 0.0f;
        }
        return cxg.c((cxc)this, (int)n2);
    }

    public boolean mb(ldv ldv2) {
        return this.GUID.equals(ldv2);
    }

    public final cxc bfv() {
        cxc cxc2;
        block2: {
            cxc2 = null;
            try {
                Class<?> clazz = this.getClass();
                cxc2 = (cxc)clazz.newInstance();
                this.e(cxc2);
            }
            catch (Exception exception) {
                lfn.b(5, "SFSkillBase", "createCopy() Unable to create copy of skill.");
                lfn.log("SFSkillBase", exception);
                if ($assertionsDisabled) break block2;
                throw new AssertionError();
            }
        }
        return cxc2;
    }

    @Override
    public final boolean equals(Object object) {
        if (object instanceof cxc) {
            cxc cxc2 = (cxc)object;
            return this.GUID.equals(cxc2.getGUID());
        }
        return false;
    }

    public final float bfw() {
        cxc cxc2;
        if (this.zg() == cxd.fJC && (cxc2 = this.aJz().ht(cxd.fJB)) != null) {
            return cxc2.bfw();
        }
        if (this.zg() == cxd.fJE && (cxc2 = this.aJz().ht(cxd.fJD)) != null) {
            return cxc2.bfw();
        }
        return this.SkillLevel;
    }

    public final float bfx() {
        return 100.0f;
    }

    public final float getPower() {
        return this.SkillLevel / 100.0f;
    }

    public final String getName() {
        return this.Bu();
    }

    public final float bfy() {
        return this.SkillLevel * 0.01f;
    }

    public final String bfz() {
        if (this.SkillType <= 0) {
            lfn.b(5, "SFSkillBase", "getPrettySkillName() SkillType has not been set.");
            assert (false);
            return "Undefined Skill";
        }
        if (this.fHb != null) {
            return this.fHb;
        }
        String string = this.Bu();
        if (!string.toLowerCase().startsWith("s_")) {
            lfn.b(5, "SFSkillBase", "getPrettySkillName() Skill does NOT start with s_ : " + string);
            this.fHb = string;
            return this.fHb;
        }
        this.fHb = string.substring(2);
        return this.fHb;
    }

    public float xo(int n2) {
        return 0.0f;
    }

    public final cxd.g bfA() {
        lhg lhg2 = (lhg)this.awK();
        return lhg2.erV();
    }

    public String bfB() {
        lfn.b(5, "SFSkillBase", "getSkillClassName() SkillClass '" + this.getClass().getName() + "' needs to override this method.");
        return null;
    }

    public final dcs bfC() {
        return new dcs(this.SkillType, this.SkillLevel);
    }

    public final cxd.h bfD() {
        lhg lhg2 = (lhg)this.awK();
        return lhg2.erW();
    }

    public final boolean bfE() {
        float f2;
        float f3 = this.bfw();
        if (f3 > (f2 = this.bfx())) {
            lfn.b(5, "SFSkillBase", "hasMaximumSkillLevel() EffectiveSkillLevel > MaximumSkillLevel for skill '" + this.getName() + "'");
            assert (false);
            return true;
        }
        return f3 == f2;
    }

    public boolean isEnabled() {
        return false;
    }

    public final boolean bfF() {
        if (this.emI == null || this.emI.bgQ() == null) {
            return true;
        }
        return this.emI.bgQ().isServerObject();
    }

    @Override
    public final String toString() {
        return this.getClass().getSimpleName() + ": Type=" + Integer.toHexString(this.SkillType) + " Name='" + this.getName() + "' SkillLevel=" + this.SkillLevel + " GUID=" + this.GUID;
    }

    public String art() {
        if (this.bfF()) {
            return "ServerSkill: Name='" + this.getName() + "' GUID=" + this.GUID;
        }
        return "ClientSkill: Name='" + this.getName() + "' GUID=" + this.GUID;
    }

    protected void e(cxc cxc2) {
        cxc2.eI(this.SkillType);
        cxc2.ag(this.SkillLevel);
        cxc2.J(this.AdvancementRate);
        if (this.fHa != null) {
            dea[] deaArray = new dea[this.fHa.length];
            for (int i2 = 0; i2 < this.fHa.length; ++i2) {
                deaArray[i2] = this.fHa[i2].bks();
            }
            cxc2.a(deaArray);
        }
    }

    protected final boolean cS(float f2) {
        return lgp.erA().cS(f2);
    }

    public void a(loz loz2) {
        Object object;
        if (this.emI.bgQ().Ux()) {
            return;
        }
        ldv ldv2 = null;
        if (this.aJz() instanceof cyv) {
            object = (cyv)this.aJz();
            ldv2 = new ldv(((cyv)((Object)object)).jr(), lcr.acL.enw(), lcr.acL.enx());
        } else {
            ldv2 = lcr.acL;
        }
        object = (fgs)this.MessageDelegator.h(29446, this.GUID, ldv2);
        ((fgn)object).r(loz2);
        this.MessageDelegator.F((dxq)object);
    }

    @Override
    public bsf awy() {
        return this.bfv();
    }

    @Override
    public float Bb() {
        return 0.0f;
    }

    @Override
    public String awz() {
        return this.awK().getName();
    }

    @Override
    public final lip awA() {
        return this.awK().awO();
    }

    public float awB() {
        return 0.0f;
    }

    public final bsn awK() {
        assert (this.SkillType != -1) : "SkillType has not been set!";
        bsn bsn2 = lea.acm(this.SkillType);
        assert (bsn2 != null);
        return bsn2;
    }

    @Override
    public bsg awE() {
        return this.awK();
    }

    @Override
    public boolean awD() {
        return this.isEnabled();
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.f((cxc)object);
    }
}

