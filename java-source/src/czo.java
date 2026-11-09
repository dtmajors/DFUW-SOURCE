/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bri
 *  cex
 *  cxd
 *  mcs
 */
import java.util.ArrayList;

public class czo
extends czc {
    private boolean gau = false;

    @Override
    protected void a(czc.a a2) {
        if (a2 != czc.a.fZG && a2 != czc.a.fZH && a2 == czc.a.fZI) {
            int n2;
            ajl ajl2 = this.bib();
            bqg bqg2 = ajl2.CF();
            bqh[] bqhArray = ajl2.CG();
            assert (bqg2 != null);
            assert (bqhArray != null);
            alj[] aljArray = new alj[bqhArray.length];
            boolean bl = false;
            int n3 = bqhArray.length;
            for (n2 = 0; n2 < n3; ++n2) {
                bqh bqh2 = bqhArray[n2];
                if (bqh2 == null) continue;
                aljArray[n2] = n2 == 0 ? this.b(bqg2, bqhArray[n2]) : this.a(bqg2, bqhArray[n2]);
                if (aljArray[n2] == null) continue;
                bl = true;
            }
            ajl2.CH();
            if (bl && (n2 = (int)(this.a(bqg2.dBI, aljArray, bqhArray) ? 1 : 0)) != 0) {
                lfn.b(5, "SFEnchantingSkill", "doPerform() Duplicate enchantment found and removed.");
                this.a(mcs.uzh.bD(new Object[0]));
                n3 = 0;
                int n4 = aljArray.length;
                for (int i2 = 0; i2 < n4; ++i2) {
                    if (aljArray[i2] == null) continue;
                    n3 = 1;
                }
                if (n3 == 0) {
                    bl = false;
                }
            }
            if (bl) {
                ldv ldv2 = this.emI.bgQ().aJC().asf().getGUID();
                ldv ldv3 = this.emI.bgQ().aJC().asf().aun().awa().getGUID();
                if (aljArray[0] != null) {
                    cur cur2 = lea.eos().get(bqg2.dBI.pa());
                    if (cur2 == null) {
                        lfn.b(5, "SFEnchantingSkill", "doPerform() Could not find weaponpropertyinfo for '" + bqg2.dBI.pa() + "'");
                        assert (false);
                        return;
                    }
                    float f2 = aljArray[0].brP;
                    float f3 = this.I(f2, cur2.fyc);
                    brr brr2 = bqg2.dBJ;
                    bqg2.dBJ = null;
                    this.a(ldv2, ldv3, brr2.aCK, brr2.dIW, aljArray, f3);
                } else {
                    this.a(ldv2, ldv3, bqg2.dBJ.aCK, null, aljArray, 0.0f);
                }
                this.bhq();
                this.bhr();
            } else {
                cex cex2;
                this.ber();
                if (this.emI.bgQ() instanceof cex && (cex2 = (cex)this.emI.bgQ()).aMz().b(cwf.b.fEB) == null) {
                    this.gau = true;
                }
            }
        }
    }

    @Override
    protected void bex() {
        super.bex();
        if (this.gau) {
            this.gau = false;
            bri bri2 = (bri)this.emI.bgQ().aJC().asf();
            bri2.avO();
        }
    }

    private alj a(bqg bqg2, bqh bqh2) {
        float f2;
        assert (bqg2 != null);
        assert (bqh2 != null);
        int n2 = bqh2.aui();
        if (bqg2.dBI.ad(n2)) {
            this.a(bqh2, false);
            return null;
        }
        ctw ctw2 = bqh2.lT(bqg2.dBI.az());
        if (ctw2 == null) {
            this.a(bqh2, false);
            return null;
        }
        ald ald2 = lea.eog().get(ctw2.Ps);
        if (ald2 == null) {
            lfn.b(5, "SFEnchantingSkill", "checkEnchantmentSlotGroup() EnchantmentInfo with Type=" + ctw2.Ps + " was not found.");
            return null;
        }
        float f3 = bqh2.auj();
        float f4 = this.H(f3, f2 = ald2.DD());
        if (f4 > 100.0f) {
            lfn.b(5, "SFEnchantingSkill", "checkEnchantmentSlotGroup() EnchantmentStrength is too large.");
            return null;
        }
        if (f4 <= 0.0f) {
            lfn.b(5, "SFEnchantingSkill", "checkEnchantmentSlotGroup() EnchantmentStrength is too small.");
            return null;
        }
        alj alj2 = new alj();
        alj2.brO = ctw2.Type;
        alj2.Pt = f4;
        alj2.brP = f3;
        return alj2;
    }

    private boolean a(bqs bqs2, alj[] aljArray, bqh[] bqhArray) {
        assert (bqs2 != null);
        assert (aljArray != null);
        assert (bqhArray != null);
        alj alj2 = aljArray[1];
        alj alj3 = aljArray[2];
        if (alj2 != null && alj3 != null) {
            ctw ctw2 = lea.eoe().get(alj2.brO);
            ctw ctw3 = lea.eoe().get(alj3.brO);
            if (ctw2.Ps != ctw3.Ps) {
                this.a(bqhArray[1], true);
                this.a(bqhArray[2], true);
                return false;
            }
            aljArray[2] = null;
            this.a(bqhArray[1], true);
            this.a(bqhArray[2], false);
            return true;
        }
        if (alj2 != null) {
            es es2 = (es)bqs2.ae(1584);
            if (es2 == null) {
                this.a(bqhArray[1], true);
                return false;
            }
            ctw ctw4 = lea.eoe().get(alj2.brO);
            if (es2.fH().Type != ctw4.Ps) {
                this.a(bqhArray[1], true);
                return false;
            }
            aljArray[1] = null;
            this.a(bqhArray[1], false);
            return true;
        }
        if (alj3 != null) {
            es es3 = (es)bqs2.ae(1600);
            if (es3 == null) {
                this.a(bqhArray[2], true);
                return false;
            }
            ctw ctw5 = lea.eoe().get(alj3.brO);
            if (es3.fH().Type != ctw5.Ps) {
                this.a(bqhArray[2], true);
                return false;
            }
            aljArray[2] = null;
            this.a(bqhArray[2], false);
            return true;
        }
        return false;
    }

    private alj b(bqg bqg2, bqh bqh2) {
        assert (bqg2 != null);
        assert (bqh2 != null);
        cty cty2 = bqh2.lU(bqg2.dBI.az());
        if (cty2 == null) {
            this.a(bqh2, false);
            return null;
        }
        int n2 = ResourceTree.uW(bqg2.dBI.az());
        if (!ResourceTree.isDescendant(cty2.dhr, n2)) {
            this.a(bqh2, false);
            return null;
        }
        float f2 = bqh2.auj();
        this.a(bqh2, true);
        alj alj2 = new alj();
        alj2.brO = cty2.Type;
        alj2.Pt = 0.0f;
        alj2.brP = f2;
        return alj2;
    }

    private float H(float f2, float f3) {
        float f4 = this.emI.bgQ().fi().al(240);
        float f5 = this.emI.bgQ().fi().aj(240);
        float f6 = lgp.erA().nextFloat();
        float f7 = (1.2f * f2 + 10.0f * f6 * f4 / f5) / 100.0f;
        float f8 = lew.A(f7, 0.0f, 1.0f) * f3;
        return f8;
    }

    private float I(float f2, float f3) {
        float f4 = this.emI.bgQ().fi().al(240);
        float f5 = cxd.xK((int)1);
        float f6 = 80.0f;
        float f7 = 42.0f * (f2 - 15.0f) / 60.0f + 10.0f * (f4 - f5) / (100.0f - f5) + 48.0f * f3 / f6;
        return f7;
    }

    private void a(bqh bqh2, boolean bl) {
        assert (bqh2 != null);
        float f2 = this.bfw();
        bri bri2 = (bri)this.emI.bgQ().aJC().asf();
        bqg[] bqgArray = bqh2.dBK;
        int n2 = bqgArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            float f3;
            float f4;
            if (!bl && !this.cS(f4 = 0.8f - (f3 = bqgArray[i2].aug()) / 10.0f - 0.2f * f2 / 100.0f)) continue;
            int n3 = bqgArray[i2].dBG.brR;
            bri2.a(bqgArray[i2].dBI.getGUID(), bqgArray[i2].dBJ.dIW, n3, bqy.dHx);
        }
    }

    private ajl bib() {
        assert (this.fGe != null);
        int n2 = this.fGe.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!(this.fGe[i2] instanceof ajl)) continue;
            return (ajl)this.fGe[i2];
        }
        lfn.b(5, "SFEnchantingSkill", "getEnchantingIngredientConstraint() Could not find a constraint for skill '" + this.getName() + "'");
        return null;
    }

    private void a(ldv ldv2, ldv ldv3, ldv ldv4, lef lef2, alj[] aljArray, float f2) {
        assert (ldv2 != null);
        assert (ldv3 != null);
        assert (ldv4 != null);
        assert (aljArray != null);
        assert (f2 >= 0.0f);
        ArrayList<alj> arrayList = lcn.abH(3);
        int n2 = aljArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (aljArray[i2] == null) continue;
            aljArray[i2].adk = i2;
            arrayList.add(aljArray[i2]);
        }
        String string = ((cex)this.emI.bgQ()).mA().iU();
        fcx fcx2 = (fcx)this.MessageDelegator.h(9228, this.GUID, this.MessageDelegator.getGUID());
        fcx2.bst = this.getFunctionType();
        fcx2.aZG = this.emI.bgQ().getGUID();
        fcx2.akX = ldv4;
        fcx2.aYF = fcx2.aZG;
        fcx2.bsG = this.emI.bgQ().az();
        fcx2.aYC = this.SkillType;
        fcx2.YL = string;
        fcx2.dXG = this.emI.bgQ().az();
        fcx2.diS = this.emI.bgQ().aAG().av();
        fcx2.dAu = ldv2;
        fcx2.iJE = ldv3;
        fcx2.aCK = ldv4;
        fcx2.dIW = lef2;
        fcx2.dtI = arrayList.toArray(new alj[arrayList.size()]);
        fcx2.iJF = f2;
        this.MessageDelegator.F(fcx2);
    }
}

