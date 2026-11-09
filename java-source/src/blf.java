/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  brg
 *  cbx
 *  cdb
 *  cex
 *  cug
 *  cxd
 *  cxg
 *  lcr
 */
public class blf
extends bke {
    private static final boolean dtQ = false;
    private static les DX = lea.enT();
    private static les aqN = lea.enZ();
    private fcw dtR = null;
    private cbx dtS = null;
    private lhg dtT = null;
    private boolean dtU = false;
    private ldi dtV = null;
    private boolean dtW = false;

    public blf() {
        this.dsy = bkd.a.drK;
    }

    @Override
    public final void a(int n, fdo fdo2) {
        ljq ljq2;
        lmf lmf2;
        cpg cpg2;
        assert (fdo2 != null);
        assert (fdo2 instanceof fcw);
        if (fdo2.bEz() != 9227) {
            lfn.b(5, "SFPerformAdvancedEffectFO", "doFunction() FunctionMessage is not SFFunctionEffectMessage.");
            lfn.b(5, "SFPerformAdvancedEffectFO", "doFunction() FromGUID=" + fdo2.aO() + " Message is: " + fdo2.getClass().getName());
            this.Vc();
            assert (false);
            return;
        }
        if (fdo2.aYF == null) {
            lfn.b(5, "SFPerformAdvancedEffectFO", "doFunction() : CauseObject is null!!! Cannot proceed!!! Message = " + fdo2.toString());
            this.Vc();
            return;
        }
        this.dtS = (cbx)this.d(fdo2.akX);
        if (this.dtS == null) {
            lfn.b(5, "SFPerformAdvancedEffectFO", "doFunction() TargetObject " + fdo2.akX + " was not found.");
            this.Vc();
            return;
        }
        this.dtT = (lhg)aqN.acv(fdo2.aYC);
        if (this.dtT == null) {
            lfn.b(5, "SFPerformAdvancedEffectFO", "doFunction() No listitem mapped to skilltype " + fdo2.aYC + " in skilltree.");
            this.Vc();
            return;
        }
        this.dtR = (fcw)fdo2;
        this.dtV = (ldi)DX.acv(this.dtR.aYG);
        this.dtW = DX.isDescendant(this.dtV.getType(), bfk.dgl);
        if (this.dtS.Uy() && this.dtW && !cug.vI((int)this.dtR.bsG) && this.dtR.aZG != null && (cpg2 = (cpg)this.dtS).aAG() != null && (lmf2 = lea.eg(ljq2 = cpg2.aAG().azb())) != null && lmf2 == lmf.rEz && cpg2.lu(this.dtR.aZG)) {
            ldv ldv2 = cpg2.aXo();
            ezu ezu2 = (ezu)this.MessageDelegator.h(33290, this.getGUID(), ldv2);
            this.MessageDelegator.F(ezu2);
            return;
        }
        this.dtR.Magnitude = cie.a(this.dtR.iJC, this.dtR.iJD, this.dtR.Magnitude, this.dtS.az(), this.dtV, -1);
        this.aru();
    }

    private void aru() {
        boolean bl2 = this.dtR.aYF.equals(this.dtS.getGUID());
        boolean bl3 = this.dtS.km(this.dtR.aYF);
        if (!(bl3 || !this.dtR.dup || !this.dtW || bl2 || this.dtS.Ux() || this.dtS.Uz() || lea.enW().isDescendant(this.dtS.az(), cug.fqy) || cug.vq((int)this.dtS.az()) || this.dtS.Uy() && this.dtU)) {
            if (this.dtS instanceof cex) {
                this.e(this.dtR.aYF, mcl.uvU.bD(new Object[0]));
                ((cex)this.dtS).c(mcl.uvV.bD(new Object[0]));
            } else {
                this.e(this.dtR.aYF, mcl.uvT.bD(new Object[0]));
            }
            if (this.dtR.bOs()) {
                this.a((fdo)this.dtR, false, this.dtR.akX);
            }
            return;
        }
        boolean bl4 = this.dtS.aIr();
        if (bl4 && !bl3 && !this.dtW && (this.dtR.dup || this.dtS.aIq()) && !bl2) {
            this.e(this.dtR.aYF, mbs.ump.bD(new Object[0]));
            return;
        }
        if (this.dtS.aIq() && this.dtW && cug.vq((int)this.dtR.bsG)) {
            return;
        }
        if (aqN.isDescendant(this.dtR.aYC, cxd.fJq)) {
            boolean bl5 = false;
            if (this.dtR.bOt()) {
                bl5 = false;
            } else if (this.dtT.erW() == cxd.h.fRm) {
                bl5 = this.a(this.dtS, this.dtR.aYF, this.dtR.aYH);
            } else if (this.dtT.erW() == cxd.h.fRo) {
                bl5 = this.a(this.dtS, this.dtR.aYF, this.dtR.aYH);
            }
            if (bl5) {
                this.dtR.dul |= 0x10;
                this.dtR.akX = this.dtR.aZG;
                this.MessageDelegator.F(this.dtR);
                this.Vc();
                return;
            }
        }
        this.a(this.dtR, this.dtS, this.dtT);
        this.Vc();
    }

    private void a(cbx cbx2, fcw fcw2, lhg lhg2, float f2) {
        fbc fbc2;
        boolean bl2;
        assert (cbx2 != null);
        assert (fcw2 != null);
        assert (lhg2 != null);
        ldi ldi2 = (ldi)DX.acv(fcw2.aYG);
        if (ldi2 == null) {
            lfn.b(5, "SFPerformAdvancedEffectFO", "applyEffect() ListItem is null for effecttype=" + fcw2.aYG);
            return;
        }
        if (!ldi2.enn()) {
            lfn.b(5, "SFPerformAdvancedEffectFO", "applyEffect() Effect '" + ldi2.getName() + "' contains no AttributeAlterations.");
            return;
        }
        boolean bl3 = DX.isDescendant(ldi2.getType(), bfk.dgl);
        boolean bl4 = this.dtR.aYF.equals(cbx2.getGUID());
        float f3 = fcw2.duq;
        float f4 = fcw2.iJy;
        float f5 = fcw2.Magnitude;
        float f6 = 0.0f;
        float f7 = 0.0f;
        if (cbx2 instanceof cdb && bl3) {
            cdb cdb2 = (cdb)cbx2;
            f6 = cdb2.jm().al(12176);
            f3 = f6 > f3 ? f6 : f3;
            f7 = cdb2.jm().al(14128);
        }
        float f8 = cbx2.fi().aA(fcw2.aYG);
        float f9 = lew.A((150.0f - f8) / 150.0f, 0.0f, 1.0f);
        f5 *= 1.0f - 0.05f * f2;
        f5 = lew.max(f9 * f5 / 4.0f, f5 - f8);
        boolean bl5 = lgp.erA().cS(f3);
        bl5 = ayc.a(bl4, bl3, bl5, fcw2.iJA);
        boolean bl6 = bl2 = fcw2.aCD() == cxd.f.fQY;
        if (bl5 || bl2 && bl3) {
            float f10 = f5 * f4;
            f10 -= f10 * f7;
            f5 += f10;
            if (bl2 && cbx2.UB()) {
                f5 = cie.a(fcw2.iJC, fcw2.iJD, f5);
            }
            if (bl2 && cbx2.UB()) {
                f5 = cie.c((cex)cbx2, f5);
            }
            if (!(cbx2 instanceof cev) || ((cev)cbx2).jT() == hc.aaz || !cbx2.fi().ag(1344)) {
                fbc2 = (fbc)this.MessageDelegator.h(12551, this.GUID, this.dtR.aYF);
                fbc2.a(jd.ajK);
                this.MessageDelegator.F(fbc2);
            }
        }
        if (f5 > 150.0f || f5 < -150.0f) {
            lfn.b(5, "SFPerformAdvancedEffectFO", "applyEffect() Magnitude  : " + f5);
            lfn.b(5, "SFPerformAdvancedEffectFO", "applyEffect() SkillName  : " + lhg2.getName());
            lfn.b(5, "SFPerformAdvancedEffectFO", "applyEffect() EffectName : " + ldi2.getName());
            lfn.b(5, "SFPerformAdvancedEffectFO", "applyEffect() Protection : " + f8);
            if (cbx2 instanceof cex) {
                cex cex2 = (cex)cbx2;
                fbc2 = cex2.mA();
                if (fbc2 != null) {
                    lfn.b(5, "SFPerformAdvancedEffectFO applyEffect()", "Target Player Name     : " + fbc2.iU());
                    lfn.b(5, "SFPerformAdvancedEffectFO applyEffect()", "Target Player GUID     : " + fbc2.getGUID());
                    lfn.b(5, "SFPerformAdvancedEffectFO applyEffect()", "Target AccountID       : " + fbc2.aN());
                    lfn.b(5, "SFPerformAdvancedEffectFO applyEffect()", "SelectedRole           : " + (fbc2.ki() != null ? fbc2.ki().getDisplayName() : ""));
                    lfn.b(5, "SFPerformAdvancedEffectFO applyEffect()", "SelectedSpecialization : " + (fbc2.kj() != null ? fbc2.kj().getDisplayName() : ""));
                }
                if (cex2.aJB() != null) {
                    lfn.b(5, "SFPerformAdvancedEffectFO applyEffect()", "Weapon                : " + cug.uV((int)cex2.aJB().aRX));
                    lfn.b(5, "SFPerformAdvancedEffectFO applyEffect()", "MissileDamageModifier : " + cex2.aJB().geN);
                    lfn.b(5, "SFPerformAdvancedEffectFO applyEffect()", "PostfixDamageModifier : " + cex2.aJB().geO);
                    lfn.b(5, "SFPerformAdvancedEffectFO applyEffect()", "PrefixDamageModifier  : " + cex2.aJB().geP);
                    lfn.b(5, "SFPerformAdvancedEffectFO applyEffect()", "WeaponBasicDamage     : " + cex2.aJB().geI);
                    lfn.b(5, "SFPerformAdvancedEffectFO applyEffect()", "PreviousWeaponType    : " + (Object)((Object)cex2.aJB().bkj()));
                }
            }
        }
        if (cbx2 == null || !cbx2.aIm()) {
            f5 = cxd.fh((float)f5);
        }
        if (f5 == 0.0f) {
            if (fcw2.bOs()) {
                this.a((fdo)fcw2, false, fcw2.akX);
            }
            return;
        }
        lce[] lceArray = ldi2.enl();
        boolean bl7 = false;
        boolean bl8 = false;
        if (!lhg2.erY() && bl3) {
            int n = lceArray.length;
            for (int i = 0; i < n; ++i) {
                if (lceArray[i].bnM != 352) continue;
                bl8 = true;
                if (!(cbx2 instanceof cdb)) continue;
                cdb cdb3 = (cdb)cbx2;
                if (!cxd.xt((int)fcw2.aYC)) continue;
                bl7 = ctg.feC ? true : cdb3.aJz().yI(cxd.fJy);
            }
        }
        this.a(fcw2.aCD(), cbx2, bl3 && bl8);
        float f11 = 1.0f;
        if (bl7) {
            cdb cdb4 = (cdb)cbx2;
            f11 = this.a(fcw2.aCD(), cdb4, fcw2.Magnitude, fcw2.bOo(), fcw2.aYC, fcw2.aZG, fcw2.bsG, fcw2.iJB);
            if (aqN.isDescendant(fcw2.aYC, cxd.fIk)) {
                float f12 = lew.A((float)Math.sqrt(Math.abs(fcw2.Magnitude) / 150.0f), 0.2f, 1.0f);
                if ((f12 *= cxd.fPH) > 0.0f) {
                    this.g(fcw2.aZG, -f12);
                }
            }
            if (cdb4 == null) {
                lfn.b(5, "SFPerformAdvancedEffectFO", "null CO.");
                return;
            }
            if (cdb4.UB()) {
                cdb4.jk().yZ(cxd.fJy);
            }
        }
        if (cbx2 == null) {
            lfn.b(5, "SFPerformAdvancedEffectFO", "applyEffect() null target object.");
            return;
        }
        if (cbx2.Ux() && aqN.isDescendant(fcw2.aYC, cxd.fKa)) {
            f11 *= 0.5f;
        }
        if (ResourceTree.isDescendant(fcw2.bsG, cug.fgD)) {
            if (cbx2.Uy()) {
                f11 = fcw2.aCD() == cxd.f.fQY ? (f11 += f11 * 0.2f / 2.0f) : (f11 += f11 * 0.2f);
            }
            if (cbx2.aIn()) {
                f11 *= 6.0f;
            }
            if (cbx2.aIo()) {
                f11 *= 2.0f;
            }
        }
        float f13 = 0.0f;
        boolean bl9 = false;
        boolean bl10 = true;
        ldv[] ldvArray = new ldv[lceArray.length];
        float f14 = 0.0f;
        int n = lceArray.length;
        for (int i = 0; i < n; ++i) {
            float f15 = f5 * lceArray[i].qvU;
            if (f11 != 0.0f) {
                f15 *= f11;
            }
            f15 = ayc.a(cbx2, lceArray[i].bnM == 352, bl3, f15);
            als als2 = new als();
            als2.setGUID(this.MessageDelegator.bzv());
            als2.x(fcw2.gpI);
            als2.ga(fcw2.bRD);
            als2.gb(fcw2.bsE);
            als2.fC(lceArray[i].bnM);
            if (als2.DV() > 0.0 && als2.El()) {
                int n2 = (int)als2.DV() * 1;
                float f16 = f15 / (float)n2;
                als2.gc(n2);
                als2.ar(f16);
                als2.aq(0.0f);
                als2.as(f15);
            } else if (als2.gu() && als2.El()) {
                als2.gc(1);
                als2.ar(f15);
                als2.aq(0.0f);
                als2.as(0.0f);
            } else {
                als2.gc(0);
                als2.ar(0.0f);
                als2.aq(f15);
                als2.as(f15);
            }
            als2.cP(fcw2.aYF);
            als2.gd(fcw2.bsG);
            als2.ge(fcw2.aYC);
            als2.fJ(fcw2.aYG);
            als2.gf(fcw2.aYH);
            als2.aX(this.GUID);
            ldvArray[i] = als2.getGUID();
            float f17 = 0.0f;
            if (fcw2.bOq()) {
                assert (cbx2 != null);
                if (cbx2 != null) {
                    switch (fcw2.aYG) {
                        case 3136: 
                        case 3168: {
                            ej ej2 = cbx2.fi().ae(352);
                            assert (ej2 != null);
                            if (ej2 == null) break;
                            ej ej3 = cbx2.fi().ae(354);
                            assert (ej3 != null);
                            if (ej3 == null) break;
                            float f18 = ((et)ej2).fN();
                            float f19 = ((et)ej3).fN();
                            f17 = f19 - f18;
                            break;
                        }
                        case 3584: 
                        case 3648: {
                            ej ej4 = cbx2.fi().ae(384);
                            assert (ej4 != null);
                            if (ej4 == null) break;
                            ej ej3 = cbx2.fi().ae(386);
                            assert (ej3 != null);
                            if (ej3 == null) break;
                            float f18 = ((et)ej4).fN();
                            float f19 = ((et)ej3).fN();
                            f17 = f19 - f18;
                            break;
                        }
                        case 5120: 
                        case 5184: {
                            ej ej5 = cbx2.fi().ae(400);
                            assert (ej5 != null);
                            if (ej5 == null) break;
                            ej ej3 = cbx2.fi().ae(402);
                            assert (ej3 != null);
                            if (ej3 == null) break;
                            float f18 = ((et)ej5).fN();
                            float f19 = ((et)ej3).fN();
                            f17 = f19 - f18;
                            break;
                        }
                        default: {
                            bl10 = false;
                        }
                    }
                }
            }
            if (!cbx2.a(als2, fcw2.aZH, fcw2.aZG, this.dtU, null, null)) continue;
            bl9 = true;
            if (bl10) {
                f13 = f17 < fcw2.Magnitude ? f17 : f5;
            }
            if (lceArray[i].bnM != 352) continue;
            f14 = Math.abs(f15);
        }
        if (bl9 && fcw2.bOq()) {
            assert (cbx2.aAG() != null);
            fdg fdg2 = (fdg)this.MessageDelegator.h(9220, this.GUID, fcw2.aO());
            fdg2.aqs = fcw2.aqs;
            fdg2.iJT = cbx2.getGUID();
            fdg2.dsL = cbx2.KY();
            fdg2.dtB = ldvArray;
            fdg2.iJU = bl10 ? f13 : f14;
            this.MessageDelegator.F(fdg2);
        }
        if (fcw2.dun > 0.0f) {
            this.a(this.dtR.aZG, this.c(fcw2.dun * (f13 > f5 ? f13 : f5), 352, bfk.dgx), this.dtR.aZH);
        }
        if (fcw2.iJz > 0.0f) {
            this.a(this.dtR.aZG, this.c(fcw2.iJz * (f13 > f5 ? f13 : f5), 400, bfk.dgy), this.dtR.aZH);
        }
        if (fcw2.bOs()) {
            this.a((fdo)fcw2, bl9, fcw2.akX);
        }
    }

    private als c(float f2, int n, int n2) {
        als als2 = new als();
        als2.setGUID(this.MessageDelegator.bzv());
        als2.ga(1);
        als2.gb(1);
        als2.fC(352);
        als2.gc(0);
        als2.ar(0.0f);
        als2.x(-3.0);
        als2.aq(f2);
        als2.as(f2);
        als2.cP(this.dtR.aYF);
        als2.gd(this.dtR.bsG);
        als2.ge(this.dtR.aYC);
        als2.fJ(n2);
        als2.gf(this.dtR.aYH);
        als2.aX(this.GUID);
        return als2;
    }

    private boolean a(cbx cbx2, ldv ldv2, int n) {
        if (ldv2 == null) {
            lfn.b(0, "SFPerformAdvancedEffectFO", "checkIfSpellIsReflected() CauseobjectGUID is null.");
            assert (false);
            return false;
        }
        if (n <= 0) {
            lfn.b(0, "SFPerformAdvancedEffectFO", "checkIfSpellIsReflected() SessionID is invalid.");
            assert (false);
            return false;
        }
        ey ey2 = (ey)cbx2.fi().af(1376);
        if (ey2 == null) {
            return false;
        }
        if (ey2.ge() == null) {
            if (ey2.getBooleanValue()) {
                ey2.G(ldv2);
                ey2.bj(n);
                cbx2.jm().fu();
                return true;
            }
            return false;
        }
        if (!ey2.ge().equals(ldv2)) {
            return false;
        }
        return ey2.gf() == n;
    }

    private float cU(float f2) {
        f2 = 0.66f * lew.A(f2, 0.0f, 1.0f);
        return f2 + (1.0f - f2) * lgp.erA().nextFloat();
    }

    private float a(cbx cbx2, int n, boolean bl2) {
        assert (cbx2 != null);
        assert (n > 0);
        if (n < 0) {
            lfn.b(5, "SFPerformAdvancedEffectFO", "computeResistance() ResistanceSkillType is invald.");
            return 0.0f;
        }
        float f2 = 0.0f;
        if (cbx2 instanceof cdb) {
            cdb cdb2 = (cdb)cbx2;
            f2 = cdb2.aJz().yQ(n);
            if (bl2) {
                if (cug.vI((int)this.dtR.bsG)) {
                    cdb2.jk().x(n, cxd.fOG);
                } else if (cug.vM((int)this.dtR.bsG) && !cdb2.aIq()) {
                    cdb2.jk().yZ(n);
                }
            }
        }
        return f2 / 100.0f;
    }

    private void a(cxd.f f2, cbx cbx2, boolean bl2) {
    }

    private float a(cxd.f f2, cdb cdb2, float f3, float f4, int n, ldv ldv2, int n2, float f5) {
        float f6;
        assert (cdb2 != null);
        if (f2 != cxd.f.fQX) {
            return 1.0f;
        }
        float f7 = 0.0f;
        brg brg2 = (brg)cdb2.aJC().asf();
        bqs bqs2 = brg2.c(cak.c.efT);
        if (bqs2 != null) {
            et et2;
            f6 = lew.nk(f4);
            if (f6 > lew.abs(80.0f)) {
                return 1.0f;
            }
            this.c((cbx)cdb2, del.giQ);
            ej ej2 = bqs2.ae(9360);
            if (ej2 != null && ej2 instanceof et && (f7 = (et2 = (et)ej2).fN()) > 0.0f) {
                f7 /= 100.0f;
            }
            float f8 = f7 * f3;
            boolean bl2 = cug.vM((int)n2);
            if (bl2) {
                float f9 = 0.025f;
                float f10 = 0.5f;
                f8 = lew.A(0.05f + f8 / 150.0f, 0.025f, 0.5f);
            } else {
                f8 = lew.A(0.05f + f8 / 150.0f, 0.025f, 0.5f);
            }
            brg2.a(bqs2, f8, bl2);
            if (aqN.isDescendant(n, cxd.fIk) && cxd.fPK) {
                gjx gjx2 = (gjx)this.MessageDelegator.h(4640, this.getGUID(), ldv2);
                gjx2.jjw = cxd.fPI;
                gjx2.jjx = cxg.d((cxc)cdb2.aJz().ht(cxd.fJy), (int)537);
                this.MessageDelegator.F(gjx2);
            }
        } else {
            bqs bqs3 = brg2.c(cak.c.efZ);
            if (bqs3 != null) {
                float f11 = lew.nk(f4);
                if (f11 > lew.abs(60.0f)) {
                    return 1.0f;
                }
                int n3 = this.ak(this.dtR.aYC, bqs3.az());
                if (n3 > 0) {
                    this.c((cbx)cdb2, n3);
                }
                f7 = cug.uU((int)cdb2.aJB().aRX);
                if (bsi.mB(bqs3.az()) && bsi.mv(bqs3.az())) {
                    f7 = cie.e(cdb2, f7);
                }
            }
        }
        f7 = ayc.b((cbx)cdb2, f7 - f7 * f5);
        assert (0.0f < f7 && f7 < 1.0f) : f7;
        f6 = 1.0f - f7;
        return f6;
    }

    private int ak(int n, int n2) {
        if (n2 <= 0) {
            lfn.b(5, "SFPerformAdvancedEffectFO", "getSpecialEffectType() WeaponResourceType is invalid for skill '" + aqN.getName(n) + "'");
            return -1;
        }
        bqm.d d2 = bqm.d.getWeaponType(n2);
        if (d2 == null) {
            lfn.b(5, "SFPerformAdvancedEffectFO", "getSpecialEffectType() WeaponType is invalid for resource '" + ResourceTree.getName(n2) + "'");
            return -1;
        }
        switch (d2) {
            case AXE: 
            case CLUB: 
            case SITHRA: 
            case SWORD: {
                return del.giR;
            }
            case GREATAXE: 
            case GREATCLUB: 
            case GREATSWORD: 
            case SIEGE_WEAPON: {
                return del.giS;
            }
            case KNIVES: {
                return del.giT;
            }
            case POLEARM: {
                return del.giU;
            }
            case MAGIC_STAFF: {
                return del.giU;
            }
            case BOW: {
                return del.giU;
            }
        }
        lfn.b(5, "SFPerformAdvancedEffectFO", "getSpecialEffectType() Invalid weapontype provided: " + (Object)((Object)d2));
        return -1;
    }

    private void a(fcw fcw2, cbx cbx2, lhg lhg2) {
        assert (fcw2 != null);
        assert (cbx2 != null);
        assert (lhg2 != null);
        if (lhg2.erZ() == null) {
            this.a(cbx2, fcw2, lhg2, 0.0f);
            return;
        }
        float f2 = 0.0f;
        float f3 = 0.0f;
        dcg dcg2 = lhg2.acO(2);
        if (dcg2 != null) {
            if (dcg2.zg() > 0) {
                f3 = this.a(cbx2, dcg2.zg(), true);
                f2 = this.cU(f3);
            } else {
                lfn.b(5, "SFPerformAdvancedEffectFO", "performEffect(Magnitude) MagResistanceAttributeType is invalid for skill '" + aqN.getName(fcw2.aYC) + "'");
                return;
            }
        }
        if ((dcg2 = lhg2.acO(1)) != null && fcw2.gpI > 0.0) {
            if (dcg2.zg() > 0) {
                f3 = this.a(cbx2, dcg2.zg(), false);
                fcw2.gpI *= (double)(1.0f - 0.15f * this.cU(f3));
            } else {
                lfn.b(5, "SFPerformAdvancedEffectFO", "performEffect() DurResistanceAttributeType is invalid for skill '" + aqN.getName(fcw2.aYC) + "'");
                return;
            }
            if (fcw2.gpI <= 0.0) {
                if (fcw2.bOs()) {
                    this.a((fdo)fcw2, false, fcw2.akX);
                }
                return;
            }
        }
        if (aqN.isDescendant(lhg2.getType(), cxd.fJq)) {
            float f4 = cbx2.fi().al(848);
            float f5 = lhg2.erX() * (0.75f * f4 + 0.25f * f3);
            if (this.cS(f5)) {
                if (fcw2.bOs()) {
                    this.a((fdo)fcw2, false, fcw2.akX);
                }
                return;
            }
        }
        this.a(cbx2, fcw2, lhg2, f2);
    }

    private void g(ldv ldv2, float f2) {
        eam eam2 = (eam)this.MessageDelegator.h(10755, this.GUID, ldv2);
        eam2.ikF = 1;
        eam2.bnM = 400;
        eam2.ikG = f2;
        this.MessageDelegator.F(eam2);
    }

    private void c(loz loz2, ldv ldv2) {
        fgs fgs2 = (fgs)this.MessageDelegator.h(29446, this.GUID, ldv2);
        fgs2.r(loz2);
        this.MessageDelegator.F(fgs2);
    }

    private void c(cbx cbx2, int n) {
        assert (cbx2 != null);
        assert (n > 0);
        glh glh2 = (glh)this.MessageDelegator.h(13057, this.GUID, lcr.qEb);
        if (cbx2.aAG() == null) {
            lfn.b(5, "SFPerformAdvancedEffectFO", "sendSpecialEffectStartMessage() MeshObject is null for targetobject " + cbx2.getGUID());
            if (cbx2.aIh() == null) {
                lfn.b(5, "SFPerformAdvancedEffectFO", "sendSpecialEffectStartMessage() MeshObjectInfo is null for targetobject " + cbx2.getGUID());
                return;
            }
            if (cbx2.aIh().av() == null) {
                lfn.b(5, "SFPerformAdvancedEffectFO", "sendSpecialEffectStartMessage() MeshObjectInfo.Position is null for targetobject " + cbx2.getGUID());
                return;
            }
            glh2.akX = cbx2.KY();
            glh2.aZD = cbx2.aIh().av();
        } else {
            glh2.akX = cbx2.aAG().getGUID();
            glh2.aZD = cbx2.aAG().av();
        }
        glh2.SpecialEffectType = n;
        this.MessageDelegator.F(glh2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        int n = dxq2.bEz();
        switch (n) {
            case 33291: {
                this.a((ezv)dxq2);
                break;
            }
            case 11034: {
                gre gre2 = (gre)dxq2;
                int n2 = gre2.bWR();
                assert (n2 == 33290);
                this.aru();
                break;
            }
        }
    }

    private void a(ezv ezv2) {
        ldv ldv2;
        ldv ldv3;
        ldv ldv4;
        if (this.dtR == null) {
            lfn.b(5, "SFPerformAdvancedEffectFO", "handleDuelingOpponentResponseMessage() SHOULD NOT HAPPEN");
            this.Vc();
            assert (false);
            return;
        }
        if (this.dtS == null) {
            this.Vc();
            return;
        }
        if (!this.dtS.Uy()) {
            lfn.b(5, "SFPerformAdvancedEffectFO", "handleDuelingOpponentResponseMessage() Target : " + this.dtS.pa());
            this.Vc();
            assert (false);
            return;
        }
        cpg cpg2 = (cpg)this.dtS;
        ezv ezv3 = ezv2;
        ldv ldv5 = ezv3.aO();
        if (!ldv5.equals(cpg2.aXo())) {
            // empty if block
        }
        if ((ldv4 = ezv3.bNy()) != null && (ldv3 = lcr.tQ((ldv)(ldv2 = this.dtR.aZG))).equals(ldv4)) {
            this.dtU = true;
        }
        this.aru();
    }
}

