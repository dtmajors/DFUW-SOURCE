/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cxd
 *  ep
 *  kxw
 *  lcw
 */
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Node;

public class kyc
extends kxw {
    public kyc() {
        this.eiB();
    }

    public static void main(String[] stringArray) {
        lcw.qHF = 20;
        kyc.eir();
        qha = "SFSkillFunction";
        qgZ = "spenefett.tools.generator.SFSkillFunctionGenerator";
        qhb = lcw.qLb + "xml-files/server/gamelogicinfo/" + "SkillFunctions.xml";
        qhc = lcw.qLb + "xml-files/server/gamelogicinfo/" + "SkillFunctionsOut.java";
        kyc.O((String[])stringArray);
        lfn.b(2, "SFSkillFunctionGenerator", "main() Starting skillfunctiongenerator..");
        kyc kyc2 = new kyc();
        kyc2.e(qhb, qhc, true);
        try {
            Thread.sleep(500L);
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (qhe) {
            lfn.eqw().eqv();
        }
    }

    protected void eiB() {
        this.eiq();
        String string = "skillfunction_code_blocks.txt";
        this.xw(lcw.qLb + "xml-files/server/gamelogicinfo/" + string);
    }

    protected kxv fn(Node node) {
        Node node2 = jsy.d("SFSkillName", node);
        int n = kbi.eM(node2);
        if (n < 0) {
            throw new bj("SkillType is invalid.");
        }
        node2 = jsy.d("SFSkillFunctionName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("SkillFunctionName is invalid.");
        }
        int n2 = cxh.ix(string);
        if (n2 <= 0) {
            throw new bj("SkillFunctionName '" + string + "' is invalid.");
        }
        node2 = jsy.d("SFSkillFunctionContent", node);
        String string2 = jsy.m(node2);
        if (string2 == null || string2.trim().equals("")) {
            throw new bj("SkillFunctionContent is invalid for skillfunction '" + string + "'");
        }
        try {
            return this.B(n, n2, string2);
        }
        catch (bg bg2) {
            throw new bj("Code for skillfunction '" + string + "' could not be generated.", bg2);
        }
    }

    private kxv B(int n, int n2, String string) {
        kyb kyb2 = new kyb();
        kyb2.eI(n);
        kyb2.fZ(n2);
        this.eiu();
        this.qgY = n2;
        this.a(string, kyb2);
        return kyb2;
    }

    protected kxy M(int n, String string) {
        if (string == null) {
            lfn.b(5, "SFSkillFunctionGenerator", "createAttributeTerm() AttributeName is null.");
            return null;
        }
        int n2 = ep.as((String)string);
        if (n2 <= 0) {
            lfn.b(5, "SFSkillFunctionGenerator", "createAttributeTerm() AttributeName '" + string + "' is invalid.");
            return null;
        }
        kxy kxy2 = new kxy();
        kxy2.abh(1);
        kxy2.xA("Term" + n);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("        float ");
        stringBuilder.append(kxy2.eiw());
        stringBuilder.append(" = Skill.getSkillManager().getSkillOwner().getAttributeManager().getFloatAttributeValue(");
        stringBuilder.append(n2);
        stringBuilder.append("); // '");
        stringBuilder.append(string);
        stringBuilder.append("'\n");
        kxy2.xB(stringBuilder.toString());
        return kxy2;
    }

    protected kxy a(int n, String string, String string2, kxv kxv2) {
        if (string == null) {
            lfn.b(5, "SFFunctionGenerator", "createConditionalSkillCheckTerm() SkillName is null.");
            return null;
        }
        if (string2 == null) {
            lfn.b(5, "SFFunctionGenerator", "createConditionalSkillCheckTerm() ExpressionString is null.");
            return null;
        }
        if (kxv2 == null) {
            lfn.b(5, "SFSkillFunctionGenerator", "createConditionalSkillCheckTerm() FunctionCode is null.");
            return null;
        }
        int n2 = this.aqN.getType(string);
        if (n2 <= 0) {
            lfn.b(5, "SFSkillFunctionGenerator", "createConditionalSkillCheckTerm() SkillName '" + string + "' is invalid.");
            return null;
        }
        kxv kxv3 = null;
        try {
            kxv3 = new kxv();
            kxv3.fZ(kxv2.getFunctionType());
            this.a(string2, kxv3);
        }
        catch (bg bg2) {
            lfn.b(5, "SFSkillFunctionGenerator", "createConditionalSkillCheckTerm() ExpressionString could not be parsed.");
            lfn.log("SFFunctionGenerator", bg2);
            return null;
        }
        kxy kxy2 = new kxy();
        kxy2.abh(2);
        kxy2.xA("Term" + n);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("        float ");
        stringBuilder.append(kxy2.eiw());
        stringBuilder.append(" = performConditionalSkillCheck(Skill, ");
        stringBuilder.append(n2);
        stringBuilder.append(", ");
        stringBuilder.append(kxv3.ein());
        stringBuilder.append(", showDebug(");
        stringBuilder.append(this.qgY);
        stringBuilder.append(")); // 'Conditional skill check', '");
        stringBuilder.append(string);
        stringBuilder.append("'\n");
        kxy2.xB(stringBuilder.toString());
        kxy kxy3 = new kxy();
        kxy3.abh(2);
        kxy3.xA(kxy2.eiw());
        stringBuilder.setLength(0);
        stringBuilder.append("ConditionalSkillCheck('");
        stringBuilder.append(string);
        stringBuilder.append("', '\" + ");
        stringBuilder.append("Skill.getSkillName()");
        stringBuilder.append(" + \"', \" + ");
        stringBuilder.append(kxv3.ein());
        stringBuilder.append(" + \")");
        kxy3.xB(stringBuilder.toString());
        kxv2.b(kxy3);
        return kxy2;
    }

    protected kxy O(int n, String string) {
        cxd.l l2 = cxd.l.getRelationType(string);
        if (l2 == null) {
            lfn.b(5, "SFSkillFunctionGenerator", "createGeneralRelatedSkillExistenceTerm() RelationName '" + string + "' is invalid.");
            return null;
        }
        kxy kxy2 = new kxy();
        kxy2.abh(1);
        kxy2.xA("Term" + n);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("        float ");
        stringBuilder.append(kxy2.eiw());
        stringBuilder.append(" = checkRelatedSkillExistence(Skill, RelationTypes.");
        stringBuilder.append((Object)l2);
        stringBuilder.append(");\n");
        kxy2.xB(stringBuilder.toString());
        return kxy2;
    }

    protected kxy P(int n, String string) {
        cxd.l l2 = cxd.l.getRelationType(string);
        if (l2 == null) {
            lfn.b(5, "SFSkillFunctionGenerator", "createGeneralRelatedSkillLevelTerm() RelationName '" + string + "' is invalid.");
            return null;
        }
        kxy kxy2 = new kxy();
        kxy2.abh(1);
        kxy2.xA("Term" + n);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("        float ");
        stringBuilder.append(kxy2.eiw());
        stringBuilder.append(" = getRelatedSkillLevel(Skill, RelationTypes.");
        stringBuilder.append((Object)l2);
        stringBuilder.append(");\n");
        kxy2.xB(stringBuilder.toString());
        return kxy2;
    }

    protected kxy e(int n, String string, String string2) {
        cxd.l l2 = cxd.l.getRelationType(string);
        if (l2 == null) {
            lfn.b(5, "SFSkillFunctionGenerator", "createGeneralRelatedSkillPropertyTerm() RelationName '" + string + "' is invalid.");
            return null;
        }
        int n2 = cxd.ir((String)string2);
        if (n2 <= 0) {
            lfn.b(5, "SFSkillFunctionGenerator", "createGeneralRelatedSkillPropertyTerm() PropertyName '" + string2 + "' is invalid.");
            return null;
        }
        kxy kxy2 = new kxy();
        kxy2.abh(1);
        kxy2.xA("Term" + n);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("        float ");
        stringBuilder.append(kxy2.eiw());
        stringBuilder.append(" = getRelatedSkillProperty(Skill, ");
        stringBuilder.append((Object)l2);
        stringBuilder.append(", ");
        stringBuilder.append(n2);
        stringBuilder.append("); // '");
        stringBuilder.append(l2.name());
        stringBuilder.append("', '");
        stringBuilder.append(string2);
        stringBuilder.append("\n");
        kxy2.xB(stringBuilder.toString());
        return kxy2;
    }

    protected kxy Q(int n, String string) {
        if (string == null) {
            lfn.b(5, "SFSkillFunctionGenerator", "createGeneralSkillFunctionTerm() SkillFunctionName is null.");
            return null;
        }
        int n2 = cxh.ix(string);
        if (n2 <= 0) {
            lfn.b(5, "SFSkillFunctionGenerator", "createGeneralSkillFunctionTerm() SkillFunctionName '" + string + "' is invalid.");
            return null;
        }
        kxy kxy2 = new kxy();
        kxy2.abh(1);
        kxy2.xA("Term" + n);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("        float ");
        stringBuilder.append(kxy2.eiw());
        stringBuilder.append(" = computeGeneralSkillFunction(Skill, ");
        stringBuilder.append(n2);
        stringBuilder.append("); // '");
        stringBuilder.append(string);
        stringBuilder.append("'\n");
        kxy2.xB(stringBuilder.toString());
        return kxy2;
    }

    protected kxy aaT(int n) {
        kxy kxy2 = new kxy();
        kxy2.abh(1);
        kxy2.xA("Term" + n);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("        float ");
        stringBuilder.append(kxy2.eiw());
        stringBuilder.append(" = Skill.getEffectiveSkillLevel();\n");
        kxy2.xB(stringBuilder.toString());
        return kxy2;
    }

    protected kxy R(int n, String string) {
        if (string == null) {
            lfn.b(5, "SFSkillFunctionGenerator", "createSkillPropertyTerm() PropertyName is null.");
            return null;
        }
        int n2 = cxd.ir((String)string);
        if (n2 <= 0) {
            lfn.b(5, "SFSkillFunctionGenerator", "createGeneralSkillPropertyTerm() PropertyName '" + string + "' is invalid.");
            return null;
        }
        kxy kxy2 = new kxy();
        kxy2.abh(1);
        kxy2.xA("Term" + n);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("        float ");
        stringBuilder.append(kxy2.eiw());
        stringBuilder.append(" = Skill.getPropertyValue(");
        stringBuilder.append(n2);
        stringBuilder.append("); // '");
        stringBuilder.append(string);
        stringBuilder.append("'\n");
        kxy2.xB(stringBuilder.toString());
        return kxy2;
    }

    protected kxy aaU(int n) {
        kxy kxy2 = new kxy();
        kxy2.abh(1);
        kxy2.xA("Term" + n);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("        float ");
        stringBuilder.append(kxy2.eiw());
        stringBuilder.append(" = SFSkillPowerConstants.getPowerGroup(Skill.getEffectiveSkillLevel());\n");
        kxy2.xB(stringBuilder.toString());
        return kxy2;
    }

    protected kxy aaV(int n) {
        kxy kxy2 = new kxy();
        kxy2.abh(1);
        kxy2.xA("Term" + n);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("        float ");
        stringBuilder.append(kxy2.eiw());
        stringBuilder.append(" = getPowerGroupValue(Skill.getEffectiveSkillLevel());\n");
        kxy2.xB(stringBuilder.toString());
        return kxy2;
    }

    protected kxy T(int n, String string) {
        if (string == null) {
            lfn.b(5, "SFSkillFunctionGenerator", "createSkillExistenceTerm() SkillName is null.");
            return null;
        }
        int n2 = this.aqN.getType(string);
        if (n2 <= 0) {
            lfn.b(5, "SFSkillFunctionGenerator", "createSkillExistenceTerm() SkillName '" + string + "' is invalid.");
            return null;
        }
        kxy kxy2 = new kxy();
        kxy2.abh(1);
        kxy2.xA("Term" + n);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("        float ");
        stringBuilder.append(kxy2.eiw());
        stringBuilder.append(" = checkSkillExistence(Skill, ");
        stringBuilder.append(n2);
        stringBuilder.append("); // '");
        stringBuilder.append(string);
        stringBuilder.append("'\n");
        kxy2.xB(stringBuilder.toString());
        return kxy2;
    }

    protected kxy aaW(int n) {
        kxy kxy2 = new kxy();
        kxy2.abh(1);
        kxy2.xA("Term" + n);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("        float ");
        stringBuilder.append(kxy2.eiw());
        stringBuilder.append(" = checkSkillInPrimaryGroup(Skill);\n");
        kxy2.xB(stringBuilder.toString());
        return kxy2;
    }

    protected kxy aaX(int n) {
        kxy kxy2 = new kxy();
        kxy2.abh(1);
        kxy2.xA("Term" + n);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("        float ");
        stringBuilder.append(kxy2.eiw());
        stringBuilder.append(" = getSkillPerformingMultiplier(Skill);\n");
        kxy2.xB(stringBuilder.toString());
        return kxy2;
    }

    protected kxy aaY(int n) {
        kxy kxy2 = new kxy();
        kxy2.abh(1);
        kxy2.xA("Term" + n);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("        float ");
        stringBuilder.append(kxy2.eiw());
        stringBuilder.append(" = getSkillCooldownMultiplier(Skill);\n");
        kxy2.xB(stringBuilder.toString());
        return kxy2;
    }

    protected kxy aaZ(int n) {
        kxy kxy2 = new kxy();
        kxy2.abh(1);
        kxy2.xA("Term" + n);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("        float ");
        stringBuilder.append(kxy2.eiw());
        stringBuilder.append(" = getPremiumItemRecallSkillPerfomingTimerMultiplier(Skill);\n");
        kxy2.xB(stringBuilder.toString());
        return kxy2;
    }

    protected kxy aba(int n) {
        kxy kxy2 = new kxy();
        kxy2.abh(1);
        kxy2.xA("Term" + n);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("        float ");
        stringBuilder.append(kxy2.eiw());
        stringBuilder.append(" = getCraftingTimePoolReduction(Skill);\n");
        kxy2.xB(stringBuilder.toString());
        return kxy2;
    }

    protected kxy abb(int n) {
        kxy kxy2 = new kxy();
        kxy2.abh(1);
        kxy2.xA("Term" + n);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("        float ");
        stringBuilder.append(kxy2.eiw());
        stringBuilder.append(" = getCraftingSpeedModifier(Skill);\n");
        kxy2.xB(stringBuilder.toString());
        return kxy2;
    }

    protected kxy abc(int n) {
        kxy kxy2 = new kxy();
        kxy2.abh(1);
        kxy2.xA("Term" + n);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("        float ");
        stringBuilder.append(kxy2.eiw());
        stringBuilder.append(" = getMountBaseStrength(Skill);\n");
        kxy2.xB(stringBuilder.toString());
        return kxy2;
    }

    protected kxy abd(int n) {
        kxy kxy2 = new kxy();
        kxy2.abh(1);
        kxy2.xA("Term" + n);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("        float ");
        stringBuilder.append(kxy2.eiw());
        stringBuilder.append(" = getCraftingTimePremiumItemMultiplier(Skill);\n");
        kxy2.xB(stringBuilder.toString());
        return kxy2;
    }

    protected kxy abe(int n) {
        kxy kxy2 = new kxy();
        kxy2.abh(1);
        kxy2.xA("Term" + n);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("        float ");
        stringBuilder.append(kxy2.eiw());
        stringBuilder.append(" = getHarvestingTimePremiumItemMultiplier(Skill);\n");
        kxy2.xB(stringBuilder.toString());
        return kxy2;
    }

    protected kxy abf(int n) {
        kxy kxy2 = new kxy();
        kxy2.abh(1);
        kxy2.xA("Term" + n);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("        float ");
        stringBuilder.append(kxy2.eiw());
        stringBuilder.append(" = getSprintStaminaCostMultiplier(Skill);\n");
        kxy2.xB(stringBuilder.toString());
        return kxy2;
    }

    protected kxy f(int n, String string, String string2) {
        if (string == null) {
            lfn.b(5, "SFSkillFunctionGenerator", "createSkillFunctionTerm() SkillName is null.");
            return null;
        }
        if (string2 == null) {
            lfn.b(5, "SFSkillFunctionGenerator", "createSkillFunctionTerm() SkillFunctionName is null.");
            return null;
        }
        int n2 = this.aqN.getType(string);
        if (n2 < 0) {
            lfn.b(5, "SFSkillFunctionGenerator", "createSkillFunctionTerm() SkillName '" + string + "' is invalid.");
            return null;
        }
        int n3 = cxh.ix(string2);
        if (n3 <= 0) {
            lfn.b(5, "SFSkillFunctionGenerator", "createSkillFunctionTerm() SkillFunctionName '" + string2 + "' is invalid.");
            return null;
        }
        kxy kxy2 = new kxy();
        kxy2.abh(1);
        kxy2.xA("Term" + n);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("        float ");
        stringBuilder.append(kxy2.eiw());
        if (n2 > 0) {
            stringBuilder.append(" = computeSkillFunction(Skill.getSkillManager().getSkill(");
            stringBuilder.append(n2);
            stringBuilder.append("), ");
            stringBuilder.append(n3);
            stringBuilder.append("); // '");
            stringBuilder.append(string);
            stringBuilder.append("', '");
            stringBuilder.append(string2);
            stringBuilder.append("'\n");
        } else {
            stringBuilder.append(" = computeGeneralSkillFunction(Skill, ");
            stringBuilder.append(n3);
            stringBuilder.append("); // '");
            stringBuilder.append(string2);
            stringBuilder.append("'\n");
        }
        kxy2.xB(stringBuilder.toString());
        return kxy2;
    }

    protected kxy U(int n, String string) {
        if (string == null) {
            lfn.b(5, "SFSkillFunctionGenerator", "createSkillLevelTerm() SkillName is null.");
            return null;
        }
        int n2 = this.aqN.getType(string);
        if (n2 <= 0) {
            lfn.b(5, "SFSkillFunctionGenerator", "createSkillLevelTerm() SkillName '" + string + "' is invalid.");
            return null;
        }
        kxy kxy2 = new kxy();
        kxy2.abh(1);
        kxy2.xA("Term" + n);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("        float ");
        stringBuilder.append(kxy2.eiw());
        stringBuilder.append(" = Skill.getSkillManager().getEffectiveSkillLevel(");
        stringBuilder.append(n2);
        stringBuilder.append("); // '");
        stringBuilder.append(string);
        stringBuilder.append("'\n");
        kxy2.xB(stringBuilder.toString());
        return kxy2;
    }

    protected kxy g(int n, String string, String string2) {
        if (string == null) {
            lfn.b(5, "SFSkillFunctionGenerator", "createSkillPropertyTerm() SkillName is null.");
            return null;
        }
        if (string2 == null) {
            lfn.b(5, "SFSkillFunctionGenerator", "createSkillPropertyTerm() PropertyName is null.");
            return null;
        }
        int n2 = this.aqN.getType(string);
        if (n2 <= 0) {
            lfn.b(5, "SFSkillFunctionGenerator", "createSkillPropertyTerm() SkillName '" + string + "' is invalid.");
            return null;
        }
        int n3 = cxd.ir((String)string2);
        if (n3 <= 0) {
            lfn.b(5, "SFSkillFunctionGenerator", "createSkillPropertyTerm() PropertyName '" + string2 + "' is invalid.");
            return null;
        }
        kxy kxy2 = new kxy();
        kxy2.abh(1);
        kxy2.xA("Term" + n);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("        float ");
        stringBuilder.append(kxy2.eiw());
        stringBuilder.append(" = Skill.getSkillManager().getSkillProperty(");
        stringBuilder.append(n2);
        stringBuilder.append(", ");
        stringBuilder.append(n3);
        stringBuilder.append("); // '");
        stringBuilder.append(string);
        stringBuilder.append("', '");
        stringBuilder.append(string2);
        stringBuilder.append("'\n");
        kxy2.xB(stringBuilder.toString());
        return kxy2;
    }

    protected kxy V(int n, String string) {
        cxh.b b2 = cxh.b.getSpecialCheckType(string);
        if (b2 == null) {
            lfn.b(5, "SFSkillFunctionGenerator", "createSpecialCheckTerm() SpecialCheckName '" + string + "' is invalid.");
            return null;
        }
        kxy kxy2 = new kxy();
        kxy2.abh(1);
        kxy2.xA("Term" + n);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("        float ");
        stringBuilder.append(kxy2.eiw());
        stringBuilder.append(" = ");
        stringBuilder.append("getSpecialCheckValue(Skill, SpecialCheckTypes.");
        stringBuilder.append(b2.name());
        stringBuilder.append(");\n");
        kxy2.xB(stringBuilder.toString());
        return kxy2;
    }

    protected kxy X(int n, String string) {
        if (string == null) {
            lfn.b(5, "SFSkillFunctionGenerator", "createWeaponInfoCacheTerm() PropertyName is null.");
            return null;
        }
        int n2 = ep.as((String)string);
        if (n2 <= 0) {
            lfn.b(5, "SFSkillFunctionGenerator", "createWeaponInfoCacheTerm() PropertyName '" + string + "' is invalid.");
            return null;
        }
        kxy kxy2 = new kxy();
        kxy2.abh(1);
        kxy2.xA("Term" + n);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("        float ");
        stringBuilder.append(kxy2.eiw());
        stringBuilder.append(" = ");
        stringBuilder.append("getWeaponInfoCachePropertyValue(Skill, ");
        stringBuilder.append(n2);
        stringBuilder.append("); // '");
        stringBuilder.append(string);
        stringBuilder.append("'\n");
        kxy2.xB(stringBuilder.toString());
        return kxy2;
    }

    protected kxy W(int n, String string) {
        if (string == null) {
            lfn.b(5, "SFSkillFunctionGenerator", "createWeaponInfoTerm() PropertyName is null.");
            return null;
        }
        int n2 = ep.as((String)string);
        if (n2 <= 0) {
            lfn.b(5, "SFSkillFunctionGenerator", "createWeaponInfoTerm() PropertyName '" + string + "' is invalid.");
            return null;
        }
        kxy kxy2 = new kxy();
        kxy2.abh(1);
        kxy2.xA("Term" + n);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("        float ");
        stringBuilder.append(kxy2.eiw());
        stringBuilder.append(" = ");
        stringBuilder.append("getWeaponInfoPropertyValue(Skill, ");
        stringBuilder.append(n2);
        stringBuilder.append("); // '");
        stringBuilder.append(string);
        stringBuilder.append("'\n");
        kxy2.xB(stringBuilder.toString());
        return kxy2;
    }

    protected void a(List<kxv> list, PrintWriter printWriter) {
        int n;
        printWriter.print(this.xy("Class_Start"));
        printWriter.print(this.xy("Class_Compute_SF"));
        int n2 = list.size();
        kyb kyb2 = null;
        int n3 = -1;
        boolean bl = true;
        int n4 = list.size();
        for (n = 0; n < n4; ++n) {
            kyb2 = (kyb)list.get(n);
            if (kyb2.zg() == 0) continue;
            if (n3 != kyb2.zg()) {
                if (n3 != -1) {
                    printWriter.print(this.xy("Skill_Case_End"));
                }
                printWriter.println(this.a("Skill_Case_Start", new int[]{0}, new int[]{kyb2.zg()}));
                printWriter.println(this.a("Function_Case_SF", new int[]{0, 2}, new int[]{kyb2.getFunctionType(), n}));
                n3 = kyb2.zg();
            } else {
                printWriter.println(this.a("Function_Case_SF", new int[]{0, 2}, new int[]{kyb2.getFunctionType(), n}));
            }
            if (n == n4 - 1) {
                printWriter.print(this.xy("Skill_Case_End"));
                printWriter.print(this.xy("Class_Compute_GSF"));
            }
            bl = false;
        }
        if (bl) {
            printWriter.print(this.xy("Class_Compute_GSF"));
        }
        bl = true;
        n = 0;
        n4 = list.size();
        while (n < n4 && (kyb2 = (kyb)list.get(n)).zg() <= 0) {
            printWriter.println(this.a("Function_Case_GSF", new int[]{0, 2}, new int[]{kyb2.getFunctionType(), n++}));
            bl = false;
        }
        printWriter.print(this.xy("Class_Compute_CSF"));
        ArrayList<kyb> arrayList = lcn.emv();
        for (n4 = 0; n4 < list.size(); ++n4) {
            kyb2 = (kyb)list.get(n4);
            if (!cxh.yc(kyb2.getFunctionType())) continue;
            arrayList.add(kyb2);
        }
        bl = true;
        int n5 = arrayList.size();
        for (n4 = 0; n4 < n5 && (kyb2 = (kyb)arrayList.get(n4)).zg() <= 0; ++n4) {
            printWriter.println(this.a("Function_Case_ACSF", new int[]{0, 2}, new int[]{kyb2.getFunctionType(), n2 + n4}));
            bl = false;
        }
        printWriter.print(this.xy("Class_Contains_SF"));
        n3 = -1;
        n5 = list.size();
        for (n4 = 0; n4 < n5; ++n4) {
            kyb2 = (kyb)list.get(n4);
            if (n3 != kyb2.zg()) {
                if (n3 != -1) {
                    printWriter.print(this.xy("Skill_Case_End"));
                }
                printWriter.println(this.a("Skill_Case_Start", new int[]{0}, new int[]{kyb2.zg()}));
                printWriter.println(this.a("Function_Case_Contains", new int[]{0}, new int[]{kyb2.getFunctionType()}));
                n3 = kyb2.zg();
            } else {
                printWriter.println(this.a("Function_Case_Contains", new int[]{0}, new int[]{kyb2.getFunctionType()}));
            }
            if (n4 != n5 - 1) continue;
            printWriter.print(this.xy("Skill_Case_End"));
            printWriter.print(this.xy("Class_Contains_ASF"));
        }
        n3 = -1;
        n5 = arrayList.size();
        for (n4 = 0; n4 < n5; ++n4) {
            kyb2 = (kyb)arrayList.get(n4);
            if (n3 != kyb2.zg()) {
                if (n3 != -1) {
                    printWriter.print(this.xy("Skill_Case_End"));
                }
                printWriter.println(this.a("Skill_Case_Start", new int[]{0}, new int[]{kyb2.zg()}));
                printWriter.println(this.a("Function_Case_Contains", new int[]{0}, new int[]{kyb2.getFunctionType()}));
                n3 = kyb2.zg();
            } else {
                printWriter.println(this.a("Function_Case_Contains", new int[]{0}, new int[]{kyb2.getFunctionType()}));
            }
            if (n4 != n5 - 1) continue;
            printWriter.print(this.xy("Skill_Case_End"));
            printWriter.print(this.xy("Class_Contains_ASF_End"));
        }
        if (arrayList.isEmpty()) {
            printWriter.print(this.xy("Class_Contains_ASF_End"));
        }
        n5 = list.size();
        for (n4 = 0; n4 < n5; ++n4) {
            kyb2 = (kyb)list.get(n4);
            if (kyb2.zg() == 0) {
                printWriter.println(this.b(kyb2, n4));
                continue;
            }
            printWriter.println(this.c(kyb2, n4));
        }
        for (n4 = 0; n4 < arrayList.size(); ++n4) {
            kyb2 = (kyb)arrayList.get(n4);
            for (kxy object : kyb2.eio()) {
                String string = object.eiw();
                if (!object.eix().contains("getCraftingTimePoolReduction")) continue;
                object.xB(object.eix().replace("getCraftingTimePoolReduction(Skill)", "0"));
            }
            printWriter.println(this.a(kyb2, n2 + n4));
        }
        printWriter.print(this.xy("Function_Validate"));
        n5 = list.size();
        for (n4 = 0; n4 < n5; ++n4) {
            kyb2 = (kyb)list.get(n4);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("        validateSkillFunction(\"");
            stringBuilder.append(kyb2.getFunctionName());
            stringBuilder.append("\", ");
            stringBuilder.append(kyb2.bst);
            stringBuilder.append(");");
            printWriter.println(stringBuilder.toString());
        }
        printWriter.println("    }");
        printWriter.print(this.xy("Class_End"));
    }

    private String a(kyb kyb2, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n    /**\n     * Computes alternative crafting skillfunction '");
        stringBuilder.append(kyb2.getFunctionName());
        stringBuilder.append("'.\n     */\n    private static float computeAlternativeCraftingSkillFunction");
        stringBuilder.append(n);
        stringBuilder.append("(SFSkillBase Skill, SFRecipeCrafting Recipe)\n    {\n");
        if (kyb2.bst == 1538) {
            stringBuilder.append("        // FIXME FOR TESTING\n");
            stringBuilder.append("        if (SFGamelogicConstants.OVERRIDE_CRAFTING_TIMERS)\n");
            stringBuilder.append("            return (float) SFGamelogicConstants.SHORT_CRAFTING_TIMER;\n\n");
        }
        List<kxy> list = kyb2.eio();
        kxy kxy2 = null;
        int n2 = list.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            kxy2 = list.get(i2);
            if (kxy2.eiz() != null) {
                stringBuilder.append(kxy2.eiz().eix());
                continue;
            }
            stringBuilder.append(kxy2.eix());
        }
        stringBuilder.append("        float Result = ");
        stringBuilder.append(kyb2.ein());
        stringBuilder.append(";\n");
        stringBuilder.append("        if (SFSpeneConfig.DEBUG && showDebug(");
        stringBuilder.append(kyb2.getFunctionType());
        stringBuilder.append("))\n        {\n");
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("SFOut.print(SFOut.DEBUG, \"SFSkillFunction\", \"computeAlternativeCraftingSkillFunction");
        stringBuilder2.append(n);
        stringBuilder2.append("(");
        stringBuilder2.append(kyb2.getFunctionName());
        stringBuilder2.append(") ");
        String string = stringBuilder2.toString();
        stringBuilder.append("            ");
        stringBuilder.append(string);
        stringBuilder.append(kyb2.bWM());
        stringBuilder.append("\");\n");
        stringBuilder.append("            ");
        stringBuilder.append(string);
        stringBuilder.append("Result = \" + Result);\n");
        stringBuilder.append("        }\n");
        stringBuilder.append("        return Result;\n    }");
        return stringBuilder.toString();
    }

    private String b(kyb kyb2, int n) {
        kxy kxy2;
        int n2;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n    /**\n     * Computes general skillfunction '");
        stringBuilder.append(kyb2.getFunctionName());
        stringBuilder.append("'.\n     */\n    private static float computeGeneralSkillFunction");
        stringBuilder.append(n);
        stringBuilder.append("(SFSkillBase Skill)\n    {\n");
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("            SFOut.print(SFOut.DEBUG, \"SFSkillFunction\", \"computeGeneralSkillFunction");
        stringBuilder2.append(n);
        stringBuilder2.append("(");
        String string = stringBuilder2.toString();
        if (kyb2.bst == 1538) {
            stringBuilder.append("        // FIXME FOR TESTING\n");
            stringBuilder.append("        if (SFGamelogicConstants.OVERRIDE_CRAFTING_TIMERS)\n");
            stringBuilder.append("            return (float) SFGamelogicConstants.SHORT_CRAFTING_TIMER;\n\n");
        } else if (kyb2.bst == 2054) {
            stringBuilder.append("        // FIXME FOR TESTING\n");
            stringBuilder.append("        if (Skill.getSkillType() == SFSkillConstants.ST_ENCHANTMENT && SFGamelogicConstants.OVERRIDE_ENCHANTMENT_TIMER)\n");
            stringBuilder.append("            return (float) SFGamelogicConstants.SHORT_ENCHANTMENT_TIMER;\n\n");
        } else if (kyb2.bst == 1292) {
            stringBuilder.append("        // FIXME FOR TESTING\n");
            stringBuilder.append("        if (Skill.getSkillManager().getSkillOwner().isMonster())\n");
            stringBuilder.append("        {\n");
            stringBuilder.append("            float MonsterTimerCharging = Skill.getSkillManager().getSkillOwner().getAttributeManager().getFloatAttributeValue(SFAttributeTypes.MONSTER_TIMER_CHARGING);\n");
            stringBuilder.append("            if (MonsterTimerCharging > 0.0f)\n");
            stringBuilder.append("            {\n");
            stringBuilder.append("                if (SFSpeneConfig.DEBUG && showDebug(");
            stringBuilder.append(kyb2.getFunctionType());
            stringBuilder.append("))\n");
            stringBuilder.append("        ");
            stringBuilder.append(string);
            stringBuilder.append(kyb2.getFunctionName());
            stringBuilder.append(") MonsterTimerCharging=\" + ");
            stringBuilder.append("MonsterTimerCharging");
            stringBuilder.append(");\n");
            stringBuilder.append("                return MonsterTimerCharging;\n");
            stringBuilder.append("            }\n");
            stringBuilder.append("        }\n\n");
        } else if (kyb2.bst == 1286) {
            stringBuilder.append("        // FIXME FOR TESTING\n");
            stringBuilder.append("        if (Skill.getSkillManager().getSkillOwner().isMonster())\n");
            stringBuilder.append("        {\n");
            stringBuilder.append("            float MonsterTimerCooldown = Skill.getSkillManager().getSkillOwner().getAttributeManager().getFloatAttributeValue(SFAttributeTypes.MONSTER_TIMER_COOLDOWN);\n");
            stringBuilder.append("            if (MonsterTimerCooldown > 0.0f)\n");
            stringBuilder.append("            {\n");
            stringBuilder.append("                if (SFSpeneConfig.DEBUG && showDebug(");
            stringBuilder.append(kyb2.getFunctionType());
            stringBuilder.append("))\n");
            stringBuilder.append("        ");
            stringBuilder.append(string);
            stringBuilder.append(kyb2.getFunctionName());
            stringBuilder.append(") MonsterTimerCooldown=\" + ");
            stringBuilder.append("MonsterTimerCooldown");
            stringBuilder.append(");\n");
            stringBuilder.append("                return MonsterTimerCooldown;\n");
            stringBuilder.append("            }\n");
            stringBuilder.append("        }\n\n");
        } else if (kyb2.bst == 2063) {
            stringBuilder.append("        // FIXME FOR TESTING\n");
            stringBuilder.append("        if (Skill.getSkillType() == SFSkillConstants.ST_TELEPORT_ANCHOR && SFGamelogicConstants.OVERRIDE_TELEPORT_TIMERS)\n");
            stringBuilder.append("            return (float) SFGamelogicConstants.SHORT_TELEPORT_TIMER;\n\n");
        } else if (kyb2.bst == 2064) {
            stringBuilder.append("        // FIXME FOR TESTING\n");
            stringBuilder.append("        if (Skill.getSkillType() == SFSkillConstants.ST_TELEPORT && SFGamelogicConstants.OVERRIDE_TELEPORT_TIMERS)\n");
            stringBuilder.append("            return (float) SFGamelogicConstants.SHORT_TELEPORT_TIMER;\n\n");
        } else if (kyb2.bst == 2049) {
            stringBuilder.append("        // FIXME FOR TESTING\n");
            stringBuilder.append("        if (Skill.getSkillType() == SFSkillConstants.ST_BINDSTONE_RECALL && SFGamelogicConstants.OVERRIDE_RECALL_TIMERS)\n");
            stringBuilder.append("            return (float) SFGamelogicConstants.SHORT_RECALL_TIMER;\n\n");
        } else if (kyb2.bst == 2055) {
            stringBuilder.append("        // FIXME FOR TESTING\n");
            stringBuilder.append("        if (Skill.getSkillType() == SFSkillConstants.ST_HOUSE_RECALL && SFGamelogicConstants.OVERRIDE_RECALL_TIMERS)\n");
            stringBuilder.append("            return (float) SFGamelogicConstants.SHORT_RECALL_TIMER;\n\n");
        }
        List<kxy> list = kyb2.eio();
        int n3 = list.size();
        for (n2 = 0; n2 < n3; ++n2) {
            kxy2 = list.get(n2);
            stringBuilder.append(kxy2.eix());
        }
        stringBuilder.append("        float Result = ");
        stringBuilder.append(kyb2.ein());
        stringBuilder.append(";\n");
        stringBuilder.append("        if (SFSpeneConfig.DEBUG && showDebug(");
        stringBuilder.append(kyb2.getFunctionType());
        stringBuilder.append("))\n        {\n");
        if (kyb2.eip() != null) {
            n3 = kyb2.eip().size();
            for (n2 = 0; n2 < n3; ++n2) {
                kxy2 = (kxy)kyb2.eip().get(n2);
                if (kxy2.eiv() != 2) continue;
                stringBuilder.append(string);
                stringBuilder.append(kxy2.eiw());
                stringBuilder.append(") ");
                stringBuilder.append(kxy2.eix());
                stringBuilder.append("\");\n");
            }
        }
        stringBuilder.append(string);
        stringBuilder.append(kyb2.getFunctionName());
        stringBuilder.append(") ");
        stringBuilder.append(kyb2.bWM());
        stringBuilder.append("\");\n");
        stringBuilder.append(string);
        stringBuilder.append(kyb2.getFunctionName());
        stringBuilder.append(") ");
        stringBuilder.append("Result = \" + Result);\n");
        stringBuilder.append("        }\n");
        switch (kyb2.bst) {
            case 514: 
            case 527: 
            case 534: 
            case 772: 
            case 1028: 
            case 1036: 
            case 1040: 
            case 1283: 
            case 1300: 
            case 1302: 
            case 1542: 
            case 2305: {
                stringBuilder.append("        if (SFSpeneConfig.ERROR_DEBUG && (Result > SFSkillConstants.ABSOLUTE_MAXIMUM_EFFECT_MAGNITUDE || Result < -SFSkillConstants.ABSOLUTE_MAXIMUM_EFFECT_MAGNITUDE))\n");
                stringBuilder.append("        \tprintDebug(Skill,\"" + kyb2.getFunctionName() + "\"," + "Result" + ",\"" + kyb2.bWM() + "\"" + ");\n\n");
            }
        }
        stringBuilder.append("        return Result;\n    }");
        return stringBuilder.toString();
    }

    private String c(kyb kyb2, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n    /**\n     * Computes skillfunction '");
        stringBuilder.append(kyb2.getFunctionName());
        stringBuilder.append("' in skill '");
        stringBuilder.append(kyb2.Bu());
        stringBuilder.append("'.\n     */\n    private static float computeSkillFunction");
        stringBuilder.append(n);
        stringBuilder.append("(SFSkillBase Skill)\n    {\n");
        List<kxy> list = kyb2.eio();
        kxy kxy2 = null;
        int n2 = list.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            kxy2 = list.get(i2);
            stringBuilder.append(kxy2.eix());
        }
        stringBuilder.append("        float Result = ");
        stringBuilder.append(kyb2.ein());
        stringBuilder.append(";\n");
        stringBuilder.append("        if (SFSpeneConfig.DEBUG && showDebug(");
        stringBuilder.append(kyb2.zg());
        stringBuilder.append(", ");
        stringBuilder.append(kyb2.getFunctionType());
        stringBuilder.append("))\n        {\n");
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("            SFOut.print(SFOut.DEBUG, \"SFSkillFunction\", \"computeSkillFunction");
        stringBuilder2.append(n);
        stringBuilder2.append("(");
        String string = stringBuilder2.toString();
        if (kyb2.eip() != null) {
            int n3 = kyb2.eip().size();
            for (int i3 = 0; i3 < n3; ++i3) {
                kxy2 = (kxy)kyb2.eip().get(i3);
                if (kxy2.eiv() != 2) continue;
                stringBuilder.append(string);
                stringBuilder.append(kxy2.eiw());
                stringBuilder.append(") ");
                stringBuilder.append(kxy2.eix());
                stringBuilder.append("\");\n");
            }
        }
        stringBuilder.append(string);
        stringBuilder.append(kyb2.getFunctionName());
        stringBuilder.append(") ");
        stringBuilder.append(kyb2.bWM());
        stringBuilder.append("\");\n");
        stringBuilder.append(string);
        stringBuilder.append(kyb2.getFunctionName());
        stringBuilder.append(") ");
        stringBuilder.append("Result = \" + Result);\n");
        stringBuilder.append("        }\n");
        stringBuilder.append("        return Result;\n    }");
        return stringBuilder.toString();
    }
}

