/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cxd
 */
import java.util.Map;

public class daz
extends btk {
    private final cyv fYe;
    private Map<Integer, dbj> gbv = lcn.emw();
    private static les aqN = lea.enZ();

    public daz(cyv cyv2) {
        this.fYe = cyv2;
    }

    public cyv biE() {
        return this.fYe;
    }

    public void a(dbk dbk2) {
        if (dbk2 == null) {
            lfn.b(5, "SFSkillTargetManager", "addAdditionalListener() Listener is null.");
            return;
        }
        if (dbk2.zg() <= 0) {
            lfn.b(5, "SFSkillTargetManager", "addAdditionalListener() SkillType is invalid.");
            return;
        }
        dbj dbj2 = this.gbv.get(dbk2.zg());
        if (dbj2 == null) {
            lfn.b(5, "SFSkillTargetManager", "addAdditionalListener() No targetsession found for skill '" + aqN.getName(dbk2.zg()) + "'");
            return;
        }
        dbj2.a(dbk2);
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        if (!this.gbv.isEmpty()) {
            for (dbj dbj2 : this.gbv.values()) {
                dbj2.biN().biH();
            }
        }
    }

    public void a(dbl dbl2, ddj object, ljq ljq2, lgl lgl2, boolean bl) {
        Object object2;
        Object object3;
        if (dbl2 == null) {
            lfn.b(5, "SFSkillTargetManager", "findTarget() Listener is null.");
            return;
        }
        if (object == null) {
            lfn.b(5, "SFSkillTargetManager", "findTarget() TargetInfo is null.");
            return;
        }
        if (ljq2 == null) {
            lfn.b(5, "SFSkillTargetManager", "findTarget() MeshObjectPosition is null.");
            return;
        }
        if (lgl2 == null) {
            lfn.b(5, "SFSkillTargetManager", "findTarget() MeshObjectRotation is null.");
            return;
        }
        Object object4 = this.gbv.get(dbl2.zg());
        if (object4 != null) {
            lfn.b(5, "SFSkillTargetManager", "findTarget() Skill '" + dbl2.Bu() + "' already has a targetsession running.");
            lfn.b(5, "SFSkillTargetManager", "findTarget() " + ((dbj)object4).biN());
            return;
        }
        if (object instanceof ddm) {
            object3 = (ddm)object;
            object = this.fYe.bgQ().aJD().aEP().Uv() ? ((ddm)object3).gek : ((ddm)object3).gel;
        }
        if (this.fYe.bgQ() instanceof cdv && (object2 = (ddr)((cdv)(object3 = (cdv)this.fYe.bgQ())).aKw()) != null && (aqN.isDescendant(dbl2.zg(), cxd.fIm) || aqN.isDescendant(dbl2.zg(), cxd.fIk))) {
            ((ddr)object2).dtb = false;
            object = object2;
            ljq2 = this.fYe.bgQ().aAG().av();
        }
        object3 = null;
        switch (((ddj)object).geh) {
            case fSy: {
                object2 = new dbm();
                object3 = new dbd(this, (dbm)object2);
                object4 = object2;
                break;
            }
            case fSz: {
                object2 = new dbm();
                object3 = new dbc(this, (dbm)object2);
                object4 = object2;
                break;
            }
            case fSB: {
                object2 = (ddo)object;
                if (((ddo)object2).gem) {
                    dbm dbm2 = new dbm();
                    object3 = new dbe(this, dbm2);
                    object4 = dbm2;
                    break;
                }
                dbn dbn2 = new dbn();
                object3 = new dbf(this, dbn2);
                object4 = dbn2;
                break;
            }
            case fSD: {
                object2 = new dbm();
                object3 = new dbg(this, (dbm)object2);
                object4 = object2;
                break;
            }
            case fSE: {
                object2 = new dbm();
                object3 = new dbh(this, (dbm)object2);
                object4 = object2;
                break;
            }
            case fSH: {
                object2 = new dbm();
                object3 = new dbi(this, (dbm)object2);
                object4 = object2;
                break;
            }
            default: {
                lfn.b(5, "SFSkillTargetManager", "findTarget() Invalid TargetInfoType: " + (Object)((Object)((ddj)object).geh));
                assert (false);
                return;
            }
        }
        ((dbj)object4).a((dbb)object3);
        ((dbj)object4).a((ddj)object);
        ((dbj)object4).bI(ljq2);
        ((dbj)object4).z(lgl2);
        ((dbj)object4).hB(bl);
        ((dbj)object4).gf(dbl2.Ec());
        ((dbj)object4).a(dbl2);
        ((amf)object3).setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a((amf)object3);
        this.gbv.put(dbl2.zg(), (dbj)object4);
    }

    public lgl yT(int n2) {
        if (n2 <= 0) {
            lfn.b(5, "SFSkillTargetManager", "getMeshObjectRotation() SkillType is invalid.");
            return null;
        }
        dbj dbj2 = this.gbv.get(n2);
        if (dbj2 == null) {
            lfn.b(5, "SFSkillTargetManager", "getMeshObjectRotation() No targetsession found for skill '" + aqN.getName(n2) + "' with skilltype=" + n2);
            return null;
        }
        return dbj2.biO();
    }

    public void zx(int n2) {
        if (n2 <= 0) {
            lfn.b(5, "SFSkillTargetManager", "notifySkillFinished() SkillType is invalid.");
            return;
        }
        dbj dbj2 = this.gbv.remove(n2);
        if (dbj2 == null) {
            lfn.b(5, "SFSkillTargetManager", "notifySkillFinished() No targetsession found for skill '" + aqN.getName(n2) + "' with skilltype=" + n2);
            return;
        }
        this.MessageDelegator.hd(dbj2.biN().getGUID());
    }

    public void zy(int n2) {
        if (n2 <= 0) {
            lfn.b(5, "SFSkillTargetManager", "notifySkillFoundNoValidTargetObject() SkillType is invalid.");
            return;
        }
        dbj dbj2 = this.gbv.get(n2);
        if (dbj2 == null) {
            lfn.b(5, "SFSkillTargetManager", "notifySkillFoundNoValidTargetObject() No targetsession found for skill '" + aqN.getName(n2) + "' with skilltype=" + n2);
            assert (false);
            return;
        }
        if (dbj2.biR() != null) {
            dbk[] dbkArray = dbj2.biR();
            int n3 = dbkArray.length;
            for (int i2 = 0; i2 < n3; ++i2) {
                dbkArray[i2].CA();
            }
        }
    }

    public void c(int n2, ddu ddu2) {
        if (n2 <= 0) {
            lfn.b(5, "SFSkillTargetManager", "notifySkillFoundValidTargetObject() SkillType is invalid.");
            return;
        }
        if (ddu2 == null) {
            lfn.b(5, "SFSkillTargetManager", "notifySkillFoundValidTargetObject() TargetObjectInfo is null.");
            return;
        }
        dbj dbj2 = this.gbv.get(n2);
        if (dbj2 == null) {
            lfn.b(5, "SFSkillTargetManager", "notifySkillFoundValidTargetObject() No targetsession found for skill '" + aqN.getName(n2) + "' with skilltype=" + n2);
            assert (false);
            return;
        }
        if (dbj2.biR() != null) {
            dbk[] dbkArray = dbj2.biR();
            int n3 = dbkArray.length;
            for (int i2 = 0; i2 < n3; ++i2) {
                dbkArray[i2].a(ddu2);
            }
        }
    }

    public void zz(int n2) {
        if (n2 <= 0) {
            lfn.b(5, "SFSkillTargetManager", "stopTargetSessionForSkill() SkillType is invalid.");
            return;
        }
        dbj dbj2 = this.gbv.remove(n2);
        if (dbj2 != null) {
            this.MessageDelegator.hd(dbj2.biN().getGUID());
        }
    }
}

