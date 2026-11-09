/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cxd
 */
import java.util.Random;

public class czi
extends czh {
    private static final String TC = "SFContainerMissileSpellRandom";
    private Random dem = new Random();
    private int gaa = -1;

    @Override
    protected void bhJ() {
        this.gaa = this.dem.nextInt(this.gac.length);
        super.bhJ();
    }

    @Override
    protected void d(ddc ddc2) {
        assert (this.gac != null);
        if (this.gaa < 0 || this.gaa >= this.gac.length) {
            return;
        }
        if (ddc2 == null) {
            lfn.b(5, TC, "startSubSkills() SubSkillParameters is null.");
            return;
        }
        czb czb2 = this.gac[this.gaa];
        if (czb2 instanceof daq) {
            daq daq2 = (daq)czb2;
            float f2 = this.xn(daq2.bhY());
            if (f2 <= 0.0f && f2 != -2.0f && f2 != -3.0f) {
                lfn.b(5, TC, "startSubSkills() Computed duration is invalid for subskill '" + czb2.getName() + "'");
                return;
            }
            ddc2.doT = f2;
        } else {
            ddc2.doT = 0.0f;
        }
        if (ddc2.akX != null) {
            if (ddc2.dur == null) {
                ddc2.dur = cxd.f.fQX;
                lfn.b(5, TC, "startSubSkills() HitLocationType is null for skill '" + this.getName() + "'");
                assert (false) : "Notify Chris about this assert!";
            }
            if (this.beY()) {
                czb2.a(ddc2);
            } else {
                czb2.b(ddc2);
            }
        } else {
            lfn.b(5, TC, "startSubSkills() No targetobject provided in skill '" + this.getName() + "'");
            return;
        }
        if (this.beY()) {
            this.gag = true;
        }
        this.gaa = -1;
    }

    @Override
    public int aCv() {
        if (this.gaa != -1) {
            bwo bwo2 = lea.eoi().get(new bwp(this.gac[this.gaa].zg(), 0));
            if (bwo2 == null) {
                lfn.b(5, TC, "getMissileInfoType() There is no missile for skill : " + cxd.xu((int)this.gac[this.gaa].zg()) + " although the missile info in skill is set as dynamic");
                assert (false);
                return super.aCv();
            }
            return bwo2.getType();
        }
        return super.aCv();
    }
}

