/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cwx
 *  cxd
 *  ep
 *  lkv
 */
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class kbs {
    private jta oQa = new jta();
    private kal oRX = new kal();
    private kbp pdG = null;
    private kao pdH = null;
    private kar pdI = null;
    private String aee = null;
    private les DX = lea.enT();
    private les dqt = lea.enU();
    private les aqN = lea.enZ();

    public kbs(kar kar2) {
        this.pdI = kar2;
        this.pdG = new kbp(this);
        this.pdH = new kao(this);
    }

    public void a(cxc cxc2, String string, String string2) {
        this.aee = string;
        String string3 = string + string2;
        Document document = this.oQa.dSD();
        Element element = this.oQa.a(document, "SFSkill", new lju(0, 2, 0));
        document.appendChild(element);
        String string4 = cxc2.bfB();
        if (string4 == null) {
            assert (false);
            return;
        }
        element.appendChild(this.oQa.a(document, string4, "SFSkillClassName"));
        if (string4.equals("SFContainerSkill")) {
            this.a(document, (czj)((Object)cxc2), element);
        } else if (string4.equals("SFContainerMeleeSkill")) {
            this.a(document, (czf)((Object)cxc2), element);
        } else if (string4.equals("SFContainerMissileSkill")) {
            this.a(document, (czg)((Object)cxc2), element);
        } else if (string4.equals("SFContainerSpell")) {
            this.a(document, (czk)((Object)cxc2), element);
        } else if (string4.equals("SFContainerMissileSpell")) {
            this.a(document, (czh)((Object)cxc2), element);
        } else if (string4.equals("SFJumpSkill")) {
            this.a(document, (dax)((Object)cxc2), element);
        } else if (string4.equals("SFModificationSkill")) {
            this.a(document, (daq)((Object)cxc2), element);
        } else if (string4.equals("SFDelayModificationSkill")) {
            this.a(document, (daj)((Object)cxc2), element);
        } else if (string4.equals("SFMovementDurationSkill")) {
            this.a(document, (daf)((Object)cxc2), element);
        } else if (string4.equals("SFPassiveSkill")) {
            this.a(document, (cxb)cxc2, element);
        } else if (string4.equals("SFPerformFunctionSkill")) {
            this.a(document, (cwx)cxc2, element);
        } else if (string4.equals("SFPerformFunctionOnTargetSkill")) {
            this.a(document, (cwx)cxc2, element);
        } else assert (false);
        jsz.a(document, new jrw(string3));
    }

    private void a(Document document, cxc cxc2, Element element) {
        element.appendChild(this.oQa.c(document, cxc2.getGUID()));
        element.appendChild(this.f(document, cxc2.zg()));
        element.appendChild(this.oQa.a(document, cxc2.pe(), "SFAdvancementRate"));
        element.appendChild(this.oQa.a(document, cxc2.Bt(), "SFSkillLevel"));
        dea[] deaArray = cxc2.bfu();
        if (deaArray != null) {
            for (int i2 = 0; i2 < deaArray.length; ++i2) {
                element.appendChild(this.a(document, deaArray[i2]));
            }
        }
    }

    private void a(Document document, cwx cwx2, Element element) {
        ddb[] ddbArray;
        dcx[] dcxArray;
        dbo[] dboArray;
        this.a(document, (cxc)cwx2, element);
        element.appendChild(this.i(document, cwx2.getFunctionType()));
        aja[] ajaArray = cwx2.bek();
        if (ajaArray != null) {
            for (int i2 = 0; i2 < ajaArray.length; ++i2) {
                element.appendChild(this.pdG.a(document, ajaArray[i2]));
            }
        }
        if ((dboArray = cwx2.bej()) != null) {
            for (int i3 = 0; i3 < dboArray.length; ++i3) {
                element.appendChild(this.a(document, dboArray[i3]));
            }
        }
        if ((dcxArray = cwx2.bem()) != null) {
            for (int i4 = 0; i4 < dcxArray.length; ++i4) {
                element.appendChild(this.a(document, dcxArray[i4]));
            }
        }
        if ((ddbArray = cwx2.ben()) != null) {
            for (int i5 = 0; i5 < ddbArray.length; ++i5) {
                element.appendChild(this.a(document, ddbArray[i5]));
            }
        }
    }

    private void a(Document document, cxb cxb2, Element element) {
        this.a(document, (cxc)cxb2, element);
    }

    private void a(Document document, czb czb2, Element element) {
        this.a(document, (cwx)czb2, element);
    }

    private void a(Document document, daf daf2, Element element) {
        this.a(document, (czc)daf2, element);
        ljq[] ljqArray = daf2.bgv();
        if (ljqArray != null) {
            for (int i2 = 0; i2 < ljqArray.length; ++i2) {
                if (ljqArray[i2] == null) continue;
                element.appendChild(this.a(document, i2, ljqArray[i2]));
            }
        }
        element.appendChild(this.oQa.a(document, daf2.bgw(), "SFEnableBoost"));
        element.appendChild(this.oQa.a(document, this.aqN.getName(daf2.bgx()), "SFBoostSkillName"));
        element.appendChild(this.oQa.a(document, daf2.bgy(), "SFMinimumStaminaValue"));
        element.appendChild(this.oQa.a(document, daf2.bgz(), "SFRechargingStaminaValue"));
    }

    private void a(Document document, dax dax2, Element element) {
        this.a(document, (cwx)dax2, element);
        element.appendChild(this.oQa.a(document, dax2.bgF(), "SFDirectionVector"));
    }

    private void a(Document document, czc czc2, Element element) {
        this.a(document, (cwx)czc2, element);
    }

    private void a(Document document, daq daq2, Element element) {
        this.a(document, (czb)daq2, element);
        element.appendChild(this.l(document, daq2.CD()));
        element.appendChild(this.pdH.d(document, daq2.DX()));
        element.appendChild(this.pdH.c(document, daq2.aUT()));
    }

    private void a(Document document, daj daj2, Element element) {
        this.a(document, (daq)daj2, element);
        element.appendChild(this.j(document, daj2.biq()));
        element.appendChild(this.k(document, daj2.bir()));
    }

    private void a(Document document, czj czj2, Element element) {
        assert (this.aee != null) : "DirectoryName is null!";
        this.a(document, (czc)czj2, element);
        if (czj2.bhM() != null) {
            element.appendChild(this.a(document, czj2.bhM()));
        }
        czb[] czbArray = czj2.bhL();
        String string = null;
        for (int i2 = 0; i2 < czbArray.length; ++i2) {
            string = this.aqN.getName(czbArray[i2].zg());
            element.appendChild(this.oQa.a(document, string, "SFSubSkillName"));
        }
    }

    private void a(Document document, czf czf2, Element element) {
        this.a(document, (czj)czf2, element);
        element.appendChild(this.b(document, czf2.bhA(), "SFBaseAttributeName"));
        element.appendChild(this.b(document, czf2.bhB(), "SFAltBaseAttributeName"));
        element.appendChild(this.oQa.a(document, czf2.bhC(), "SFCriticalModifier"));
        element.appendChild(this.oQa.a(document, czf2.bhE(), "SFMagnitudeModifier"));
        element.appendChild(this.oQa.a(document, czf2.bhF(), "SFMagnitudeMultiplier"));
        element.appendChild(this.oQa.a(document, czf2.bhG(), "SFMagnitudeSkillModifier"));
        element.appendChild(this.oQa.a(document, czf2.bgt(), "SFSkillCheckBase"));
        element.appendChild(this.oQa.a(document, czf2.bgd(), "SFStaminaMultiplier"));
        element.appendChild(this.oQa.a(document, czf2.bhH(), "SFThreatModifier"));
    }

    private void a(Document document, czg czg2, Element element) {
        this.a(document, (czf)czg2, element);
    }

    private void a(Document document, czk czk2, Element element) {
        this.a(document, (czj)czk2, element);
        element.appendChild(this.b(document, czk2.bhA(), "SFBaseAttributeName"));
        element.appendChild(this.oQa.a(document, czk2.bgc(), "SFBlockingTimerBase"));
        element.appendChild(this.oQa.a(document, czk2.bgf(), "SFDelayTimerBase"));
        element.appendChild(this.oQa.a(document, czk2.bhU(), "SFDurationBase"));
        element.appendChild(this.oQa.a(document, czk2.bgq(), "SFDurationSkillModifier"));
        element.appendChild(this.oQa.a(document, czk2.bhV(), "SFFailureModifier"));
        element.appendChild(this.oQa.a(document, czk2.bhW(), "SFMagnitudeBase"));
        element.appendChild(this.oQa.a(document, czk2.bhE(), "SFMagnitudeModifier"));
        element.appendChild(this.oQa.a(document, czk2.bgg(), "SFManaCostMultiplier"));
        element.appendChild(this.oQa.a(document, czk2.bgh(), "SFStaminaMultiplier"));
        element.appendChild(this.oQa.a(document, czk2.bhX(), "SFProficiencyBase"));
    }

    private void a(Document document, czh czh2, Element element) {
        this.a(document, (czk)czh2, element);
    }

    public Element f(Document document, int n) {
        return this.oQa.a(document, this.aqN.getName(n), "SFSkillName");
    }

    public Element d(Document document, int n, String string) {
        return this.oQa.a(document, this.aqN.getName(n), string);
    }

    private Element i(Document document, int n) {
        return this.oQa.a(document, this.dqt.getName(n), "SFFunctionName");
    }

    private Element j(Document document, int n) {
        return this.oQa.a(document, this.dqt.getName(n), "SFDelayFunctionName");
    }

    private Element k(Document document, int n) {
        return this.oQa.a(document, byw.nT(n), "SFLifeModeName");
    }

    private Element b(Document document, int n) {
        return this.oQa.a(document, ep.aM((int)n), "SFAttributeName");
    }

    private Element b(Document document, int n, String string) {
        if (n > 0) {
            return this.oQa.a(document, ep.aM((int)n), string);
        }
        return this.oQa.a(document, "NULL", string);
    }

    private Element a(Document document, int n, float f2) {
        Element element = document.createElement("SFSkillLevel");
        element.setAttribute("Name", dcu.gdv[n]);
        element.setAttribute("Value", new Float(f2).toString());
        return element;
    }

    private Element a(Document document, dcx dcx2) {
        Element element = document.createElement("SFSkillTimer");
        element.appendChild(this.oQa.a(document, dcx2.biV().name(), "SFSkillPartName"));
        element.appendChild(this.e(document, dcx2.bjw(), "SFTimerName"));
        element.appendChild(this.oQa.a(document, cxh.fH(dcx2.bjx()), "SFTimerLengthSkillFunctionName"));
        return element;
    }

    private Element a(Document document, dea dea2) {
        Element element = document.createElement("SFXPHeir");
        if (dea2 instanceof deb) {
            deb deb2 = (deb)dea2;
            element.appendChild(this.oQa.a(document, "XPHeirAttribute", "SFXPHeirName"));
            element.appendChild(this.oQa.a(document, deb2.bkr(), "SFInheritancePortion"));
            element.appendChild(this.b(document, deb2.BV(), "SFAttributeName"));
            element.appendChild(this.b(document, deb2.bkt(), "SFAdvancementRateAttributeName"));
        } else if (dea2 instanceof dec) {
            dec dec2 = (dec)dea2;
            element.appendChild(this.oQa.a(document, "XPHeirSkill", "SFXPHeirName"));
            element.appendChild(this.oQa.a(document, dec2.bkr(), "SFInheritancePortion"));
            element.appendChild(this.f(document, dec2.zg()));
        } else assert (false);
        return element;
    }

    private Element e(Document document, int n, String string) {
        if (n > 0) {
            return this.oQa.a(document, dxj.CU(n), string);
        }
        return this.oQa.a(document, "", string);
    }

    private Element a(Document document, int n, ljq ljq2) {
        String string = cxd.nO((int)n);
        Element element = document.createElement("SFMovementDirection");
        element.appendChild(this.oQa.a(document, string, "SFDirectionName"));
        element.appendChild(this.oQa.a(document, ljq2, "SFDirectionVector"));
        return element;
    }

    private Element a(Document document, ddj ddj2) {
        Element element = document.createElement("SFTargetInfo");
        element.appendChild(this.oQa.a(document, ddj2.geh.name(), "SFTargetInfoName"));
        switch (ddj2.geh) {
            case fSy: {
                ddl ddl2 = (ddl)ddj2;
                element.appendChild(this.oQa.a(document, ddl2.gbu, "SFRadius"));
                break;
            }
            case fSB: {
                ddo ddo2 = (ddo)ddj2;
                element.appendChild(this.oQa.a(document, ddo2.gem, "SFFindMultipleTargets"));
                element.appendChild(this.oQa.a(document, ddo2.dum, "SFLength"));
                break;
            }
            case fSC: {
                ddp ddp2 = (ddp)ddj2;
                element.appendChild(this.oQa.a(document, ddp2.bis, "SFStartDirection"));
                break;
            }
            case fSE: {
                ddr ddr2 = (ddr)ddj2;
                element.appendChild(this.oQa.a(document, ddr2.Radius, "SFRadius"));
                break;
            }
            default: {
                assert (false);
                break;
            }
        }
        return element;
    }

    private Element l(Document document, int n) {
        return this.oQa.a(document, this.DX.getName(n), "SFEffectName");
    }

    private Element a(Document document, dbo dbo2) {
        Element element = document.createElement("SFAnimationInfo");
        element.appendChild(this.oQa.a(document, dbo2.bja(), "SFSkillPartName"));
        element.appendChild(this.oQa.a(document, dbo2.bjb(), "SFTargetObjectName"));
        element.appendChild(this.oQa.a(document, lkv.adr((int)dbo2.aDI()), "SFAnimationStateName"));
        return element;
    }

    private Element a(Document document, ddb ddb2) {
        Element element = document.createElement("SFSpecialEffectInfo");
        element.appendChild(this.oQa.a(document, ddb2.bja(), "SFSkillPartName"));
        element.appendChild(this.oQa.a(document, ddb2.bjb(), "SFTargetObjectName"));
        element.appendChild(this.oQa.a(document, ddb2.getSpecialEffectName(), "SFEffectName"));
        element.appendChild(this.oQa.a(document, ddb2.bjH(), "SFRelativeStartTime"));
        element.appendChild(this.oQa.a(document, ddb2.bjJ().name(), "SFVisibilityName"));
        element.appendChild(this.oQa.a(document, ddb2.bjK(), "SFProvideSourceObjectGUID"));
        element.appendChild(this.oQa.a(document, ddb2.bjL(), "SFProvideSourcePosition"));
        element.appendChild(this.oQa.a(document, ddb2.bjM(), "SFProvideSourceRotation"));
        element.appendChild(this.oQa.a(document, ddb2.bjN(), "SFProvideDuration"));
        element.appendChild(this.oQa.a(document, ddb2.bjO(), "SFProvidePower"));
        return element;
    }
}

