/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cex
 *  cug
 *  cxd
 *  ha
 */
public class blr
extends bke {
    private static les DX = lea.enT();
    private fcw dtR = null;
    private ldv[] dtB = null;

    public blr() {
        this.dsy = bkd.a.drQ;
    }

    @Override
    public final void a(int n, fdo fdo2) {
        assert (fdo2 != null);
        if (fdo2.bEz() != 9227) {
            lfn.b(5, "SFPerformSimpleEffectFO", "doFunction() FunctionMessage is not SFFunctionEffectMessage.");
            lfn.b(5, "SFPerformSimpleEffectFO", "doFunction() FromGUID=" + fdo2.aO() + " Message is: " + fdo2.getClass().getName());
            this.Vc();
            return;
        }
        this.dtR = (fcw)fdo2;
        if (this.dtR.Magnitude == 0.0f) {
            lfn.b(5, "SFPerformSimpleEffectFO", "doFunction() Magnitude is 0.");
            this.Vc();
            return;
        }
        cbx cbx2 = (cbx)this.d(fdo2.akX);
        if (cbx2 == null) {
            lfn.b(5, "SFPerformSimpleEffectFO", "doFunction() TargetObject " + fdo2.akX + " was not found.");
            return;
        }
        this.a(this.dtR, cbx2);
        if (this.dtR.bOr()) {
            return;
        }
        this.Vc();
    }

    @Override
    protected void a(fdp fdp2) {
        assert (this.dtB != null);
        this.c(this.dtR.akX, this.dtB);
        this.Vc();
    }

    private void a(fcw fcw2, cbx cbx2) {
        ha ha2;
        assert (fcw2 != null);
        assert (cbx2 != null);
        ldi ldi2 = (ldi)lea.enT().acv(fcw2.aYG);
        if (ldi2 == null) {
            lfn.b(5, "SFPerformSimpleEffectFO", "performEffect() ListItem is null for effecttype=" + fcw2.aYG);
            return;
        }
        if (!ldi2.enn()) {
            lfn.b(5, "SFPerformSimpleEffectFO", "performEffect() Effect '" + ldi2.getName() + "' contains no AttributeAlterations.");
            return;
        }
        if (fcw2.Magnitude > 150.0f || fcw2.Magnitude < -150.0f) {
            lfn.b(5, "SFPerformSimpleEffectFO", "performEffect() Magnitude  : " + fcw2.Magnitude);
            lfn.b(5, "SFPerformSimpleEffectFO", "performEffect() SkillName  : " + cxd.xu((int)fcw2.aYC));
            lfn.b(5, "SFPerformSimpleEffectFO", "performEffect() EffectName : " + ldi2.getName());
            if (cbx2 instanceof cex) {
                cex cex2 = (cex)cbx2;
                ha2 = cex2.mA();
                if (ha2 != null) {
                    lfn.b(5, "SFPerformSimpleEffectFO performEffect()", "Target Player Name     : " + ha2.iU());
                    lfn.b(5, "SFPerformSimpleEffectFO performEffect()", "Target Player GUID     : " + ha2.getGUID());
                    lfn.b(5, "SFPerformSimpleEffectFO performEffect()", "Target AccountID       : " + ha2.aN());
                    lfn.b(5, "SFPerformSimpleEffectFO performEffect()", "SelectedRole           : " + (ha2.ki() != null ? ha2.ki().getDisplayName() : ""));
                    lfn.b(5, "SFPerformSimpleEffectFO performEffect()", "SelectedSpecialization : " + (ha2.kj() != null ? ha2.kj().getDisplayName() : ""));
                }
                if (cex2.aJB() != null) {
                    lfn.b(5, "SFPerformSimpleEffectFO performEffect()", "Weapon                : " + cug.uV((int)cex2.aJB().aRX));
                    lfn.b(5, "SFPerformSimpleEffectFO performEffect()", "MissileDamageModifier : " + cex2.aJB().geN);
                    lfn.b(5, "SFPerformSimpleEffectFO performEffect()", "PostfixDamageModifier : " + cex2.aJB().geO);
                    lfn.b(5, "SFPerformSimpleEffectFO performEffect()", "PrefixDamageModifier  : " + cex2.aJB().geP);
                    lfn.b(5, "SFPerformSimpleEffectFO performEffect()", "WeaponBasicDamage     : " + cex2.aJB().geI);
                    lfn.b(5, "SFPerformSimpleEffectFO performEffect()", "PreviousWeaponType    : " + (Object)((Object)cex2.aJB().bkj()));
                }
            }
        }
        fcw2.Magnitude = cxd.fh((float)fcw2.Magnitude);
        boolean bl2 = false;
        ha2 = ldi2.enl();
        this.dtB = new ldv[((lce[])ha2).length];
        int n = ((lce[])ha2).length;
        for (int i = 0; i < n; ++i) {
            float f2 = fcw2.Magnitude;
            if (this.dtR.aYC == cxd.fKT) {
                f2 *= ha2[i].qvU;
            } else if (ha2[i].qvU < 0.0f) {
                f2 *= -1.0f;
            }
            boolean bl3 = DX.isDescendant(ldi2.getType(), bfk.dgl);
            f2 = ayc.a(cbx2, ha2[i].bnM == 352, bl3, f2);
            als als2 = new als();
            als2.setGUID(this.MessageDelegator.bzv());
            als2.x(fcw2.gpI);
            als2.ga(fcw2.bRD);
            als2.gb(fcw2.bsE);
            als2.fC(ha2[i].bnM);
            if (als2.DV() > 0.0 && als2.El()) {
                int n2 = (int)als2.DV() * 1;
                float f3 = f2 / (float)n2;
                als2.gc(n2);
                als2.ar(f3);
                als2.aq(0.0f);
                als2.as(f2);
            } else if (als2.gu() && als2.El()) {
                als2.gc(1);
                als2.ar(f2);
                als2.aq(0.0f);
                als2.as(0.0f);
            } else {
                als2.gc(0);
                als2.ar(0.0f);
                als2.aq(f2);
                als2.as(f2);
            }
            als2.cP(fcw2.aYF);
            als2.gd(fcw2.bsG);
            als2.ge(fcw2.aYC);
            als2.fJ(fcw2.aYG);
            als2.gf(fcw2.aYH);
            als2.aX(this.GUID);
            this.dtB[i] = als2.getGUID();
            if (!cbx2.a(als2, fcw2.aZH, null, null)) continue;
            bl2 = true;
        }
        if (bl2 && fcw2.bOq()) {
            assert (cbx2.aAG() != null);
            fdg fdg2 = (fdg)this.MessageDelegator.h(9220, this.GUID, fcw2.aO());
            fdg2.aqs = fcw2.aqs;
            fdg2.iJT = cbx2.getGUID();
            fdg2.dsL = cbx2.aAG().getGUID();
            fdg2.dtB = this.dtB;
            fdg2.iJU = fcw2.Magnitude;
            this.MessageDelegator.F(fdg2);
        }
        if (fcw2.bOs()) {
            this.a(fcw2, bl2, fcw2.akX);
        }
    }

    private void c(ldv ldv2, ldv[] ldvArray) {
        assert (ldv2 != null);
        assert (ldvArray != null);
        assert (ldvArray.length > 0);
        frk frk2 = (frk)this.MessageDelegator.h(5379, this.GUID, ldv2);
        frk2.jM(false);
        frk2.iUQ = true;
        frk2.dtB = ldvArray;
        this.MessageDelegator.F(frk2);
    }
}

