/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 *  cxd
 *  lcr
 *  mcs
 */
import java.util.ArrayList;

public class bmk
extends bke {
    private static final int dvc = 10;
    private fdl dvr = null;
    private dct[] dvs = null;
    private cex abN = null;
    private int dvt = 0;

    public bmk() {
        this.dsy = bkd.a.dsc;
    }

    @Override
    public final void a(int n, fdo fdo2) {
        int n2;
        if (fdo2 == null) {
            lfn.b(5, "SFSkillCreatorFO", "doFunction() FunctionMessage is null.");
            this.Vc();
            return;
        }
        if (fdo2.bEz() != 9235) {
            lfn.b(5, "SFSkillCreatorFO", "doFunction() Invalid message received: " + fdo2.getClass().getName());
            this.Vc();
            return;
        }
        this.dvr = (fdl)fdo2;
        this.dvs = this.dvr.dvs;
        if (this.dvs == null || this.dvs.length == 0) {
            lfn.b(5, "SFSkillCreatorFO", "doFunction() SkillItems array is null or empty.");
            this.Vc();
            return;
        }
        this.abN = (cex)this.MessageDelegator.d(this.dvr.akX);
        if (this.abN == null) {
            lfn.b(5, "SFSkillCreatorFO", "doFunction() TargetObject " + this.dvr.akX + " was not found.");
            this.Vc();
            return;
        }
        ArrayList<dct> arrayList = lcn.emv();
        int n3 = this.dvs.length;
        for (n2 = 0; n2 < n3; ++n2) {
            if (this.dvs[n2].SkillType <= 0) {
                lfn.b(5, "SFSkillCreatorFO", "doFunction() SkillType " + n2 + " is invalid.");
                ++this.dvt;
                continue;
            }
            if (this.abN.aJz().pa(this.dvs[n2].SkillType)) {
                ++this.dvt;
                continue;
            }
            arrayList.add(this.dvs[n2]);
            if (!this.dvr.iJX || !cxd.xT((int)this.dvs[n2].SkillType)) continue;
            int n4 = cxj.b(this.dvs[n2].SkillType, cxd.l.fRP);
            if (n4 <= 0) {
                lfn.b(5, "SFSkillCreatorFO", "doFunction() MagicSchoolSkillType is invalid for skill '" + this.dvs[n2].Bu() + "'");
                continue;
            }
            if (this.abN.aJz().pa(n4)) continue;
            dct dct2 = new dct();
            dct2.SkillType = n4;
            dct2.SkillLevel = 1.0f;
            arrayList.add(dct2);
        }
        if (arrayList.isEmpty()) {
            this.Vc();
            return;
        }
        n3 = arrayList.size();
        for (n2 = 0; n2 < n3; ++n2) {
            this.dvs = arrayList.toArray(new dct[arrayList.size()]);
            this.a(10 + n2, this.dvs[n2].SkillType, this.dvr.aZG, this.dvs[n2].SkillLevel);
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 4610: {
                this.a((gja)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(gja gja2) {
        if (gja2.aVk() == -1) {
            lfn.b(5, "SFSkillCreatorFO", "handleSkillCreateResponse() MessageTag is invalid.");
            return;
        }
        cxc cxc2 = gja2.gcr;
        if (cxc2 == null) {
            lfn.b(5, "SFSkillCreatorFO", "handleSkillCreateResponse() Skill received from resourcemanager is null.");
            int n = gja2.aVk() - 10;
            lfn.b(5, "SFSkillCreatorFO", "handleSkillCreateResponse() Skill '" + this.dvs[n].Bu() + "' could not be created.");
        } else if (this.abN.aJz().pa(cxc2.zg())) {
            lfn.b(5, "SFSkillCreatorFO", "handleSkillCreateResponse() TargetObject " + this.abN.getGUID() + " already contains skill '" + cxc2.getName() + "'");
        } else {
            this.MessageDelegator.a(cxc2);
            this.abN.aJz().a(cxc2, false);
            this.abN.aJA().R(cxc2.getGUID(), cxc2.zg());
            ldv ldv2 = lcr.ak((ldv)lcr.acL, (int)this.abN.jk().jr());
            this.f(ldv2, mcs.uys.bD(cxc2.zg()));
        }
        ++this.dvt;
        if (this.dvt == this.dvs.length) {
            this.Vc();
        }
    }

    private final void f(ldv ldv2, loz loz2) {
        fgs fgs2 = (fgs)this.MessageDelegator.h(29446, this.GUID, ldv2);
        fgs2.r(loz2);
        this.MessageDelegator.F(fgs2);
    }

    private void a(int n, int n2, ldv ldv2, float f2) {
        assert (n2 > 0);
        assert (ldv2 != null);
        giz giz2 = (giz)this.MessageDelegator.h(4609, this.GUID, lcr.qCq);
        giz2.aqs = n;
        giz2.SkillType = n2;
        giz2.iSi = 1;
        giz2.Yc = ldv2;
        giz2.SkillLevel = f2;
        this.MessageDelegator.F(giz2);
    }
}

