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
import java.util.List;
import org.w3c.dom.Node;

public class kya
extends kxw {
    public kya() {
        this.eiB();
    }

    public static void main(String[] stringArray) {
        lcw.qHF = 20;
        kya.eir();
        qha = "SFGamelogicFunction";
        qgZ = "spenefett.tools.generator.SFGamelogicFunctionGenerator";
        qhb = lcw.qLb + "xml-files/server/gamelogicinfo/" + "GamelogicFunctions.xml";
        qhc = lcw.qLb + "xml-files/server/gamelogicinfo/" + "GamelogicFunctionsOut.java";
        kya.O((String[])stringArray);
        lfn.b(2, "SFGamelogicFunctionGenerator", "main() Starting gamelogicfunctiongenerator..");
        kya kya2 = new kya();
        kya2.e(qhb, qhc, qhd);
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
        String string = "gamelogicfunction_code_blocks.txt";
        this.xw(lcw.qLb + "xml-files/server/gamelogicinfo/" + string);
    }

    protected kxv fn(Node node) {
        Node node2 = jsy.d("SFFunctionName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("FunctionName is invalid.");
        }
        int n = cbs.gX(string);
        if (n <= 0) {
            throw new bj("FunctionName '" + string + "' is invalid.");
        }
        node2 = jsy.d("SFFunctionContent", node);
        String string2 = jsy.m(node2);
        if (string2 == null || string2.trim().equals("")) {
            throw new bj("FunctionContent is invalid.");
        }
        node2 = jsy.d("SFSimpleFunction", node);
        boolean bl = jsy.t(node2);
        try {
            return this.e(n, string2, bl);
        }
        catch (bg bg2) {
            throw new bj("Code for gamelogicfunction '" + string + "' could not be generated.", bg2);
        }
    }

    protected kxv e(int n, String string, boolean bl) {
        kxz kxz2 = new kxz();
        kxz2.fZ(n);
        kxz2.xQ(bl);
        this.eiu();
        this.qgY = n;
        this.a(string, kxz2);
        return kxz2;
    }

    protected kxy M(int n, String string) {
        if (string == null) {
            lfn.b(5, "SFGamelogicFunctionGenerator", "createAttributeTerm() AttributeName is null.");
            return null;
        }
        int n2 = ep.as((String)string);
        if (n2 <= 0) {
            lfn.b(5, "SFGamelogicFunctionGenerator", "createAttributeTerm() AttributeName '" + string + "' is invalid.");
            return null;
        }
        kxy kxy2 = new kxy();
        kxy2.abh(1);
        kxy2.xA("Term" + n);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("        float ");
        stringBuilder.append(kxy2.eiw());
        stringBuilder.append(" = CreatureObject.getAttributeManager().getFloatAttributeValue(");
        stringBuilder.append(n2);
        stringBuilder.append("); // '");
        stringBuilder.append(string);
        stringBuilder.append("'\n");
        kxy2.xB(stringBuilder.toString());
        return kxy2;
    }

    protected kxy f(int n, String string, String string2) {
        if (string == null) {
            lfn.b(5, "SFGamelogicFunctionGenerator", "createSkillFunctionTerm() SkillName is null.");
            return null;
        }
        if (string2 == null) {
            lfn.b(5, "SFGamelogicFunctionGenerator", "createSkillFunctionTerm() SkillFunctionName is null.");
            return null;
        }
        int n2 = this.aqN.getType(string);
        if (n2 <= 0) {
            lfn.b(5, "SFGamelogicFunctionGenerator", "createSkillFunctionTerm() SkillName '" + string + "' is invalid.");
            return null;
        }
        int n3 = cbs.gX(string2);
        if (n3 <= 0) {
            lfn.b(5, "SFGamelogicFunctionGenerator", "createSkillFunctionTerm() SkillFunctionName '" + string2 + "' is invalid.");
            return null;
        }
        kxy kxy2 = new kxy();
        kxy2.abh(1);
        kxy2.xA("Term" + n);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("        float ");
        stringBuilder.append(kxy2.eiw());
        stringBuilder.append(" = computeFunction(CreatureObject.getSkillManager().getSkill(");
        stringBuilder.append(n2);
        stringBuilder.append("), ");
        stringBuilder.append(n3);
        stringBuilder.append("); // '");
        stringBuilder.append(string);
        stringBuilder.append("', '");
        stringBuilder.append(string2);
        stringBuilder.append("'\n");
        kxy2.xB(stringBuilder.toString());
        return kxy2;
    }

    protected kxy U(int n, String string) {
        if (string == null) {
            lfn.b(5, "SFGamelogicFunctionGenerator", "createSkillLevelTerm() SkillName is null.");
            return null;
        }
        int n2 = this.aqN.getType(string);
        if (n2 <= 0) {
            lfn.b(5, "SFGamelogicFunctionGenerator", "createSkillLevelTerm() SkillName '" + string + "' is invalid.");
            return null;
        }
        kxy kxy2 = new kxy();
        kxy2.abh(1);
        kxy2.xA("Term" + n);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("        float ");
        stringBuilder.append(kxy2.eiw());
        stringBuilder.append(" = CreatureObject.getSkillManager().getEffectiveSkillLevel(");
        stringBuilder.append(n2);
        stringBuilder.append("); // '");
        stringBuilder.append(string);
        stringBuilder.append("'\n");
        kxy2.xB(stringBuilder.toString());
        return kxy2;
    }

    protected kxy g(int n, String string, String string2) {
        if (string == null) {
            lfn.b(5, "SFGamelogicFunctionGenerator", "createSkillPropertyTerm() SkillName is null.");
            return null;
        }
        if (string2 == null) {
            lfn.b(5, "SFGamelogicFunctionGenerator", "createSkillPropertyTerm() PropertyName is null.");
            return null;
        }
        int n2 = this.aqN.getType(string);
        if (n2 <= 0) {
            lfn.b(5, "SFGamelogicFunctionGenerator", "createSkillPropertyTerm() SkillName '" + string + "' is invalid.");
            return null;
        }
        int n3 = cxd.ir((String)string2);
        if (n3 <= 0) {
            lfn.b(5, "SFGamelogicFunctionGenerator", "createSkillPropertyTerm() PropertyName '" + string2 + "' is invalid.");
            return null;
        }
        kxy kxy2 = new kxy();
        kxy2.abh(1);
        kxy2.xA("Term" + n);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("        float ");
        stringBuilder.append(kxy2.eiw());
        stringBuilder.append(" = CreatureObject.getSkillManager().getSkillProperty(");
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

    protected kxy abg(int n) {
        kxy kxy2 = new kxy();
        kxy2.abh(1);
        kxy2.xA("Term" + n);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("        float ");
        stringBuilder.append(kxy2.eiw());
        stringBuilder.append(" = getSkillTreeProperty(SkillType);\n");
        kxy2.xB(stringBuilder.toString());
        return kxy2;
    }

    protected kxy V(int n, String string) {
        cxh.b b2 = cxh.b.getSpecialCheckType(string);
        if (b2 == null) {
            lfn.b(5, "SFGamelogicFunctionGenerator", "createSpecialCheckTerm() SpecialCheckName '" + string + "' is invalid.");
            return null;
        }
        kxy kxy2 = new kxy();
        kxy2.abh(1);
        kxy2.xA("Term" + n);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("        float ");
        stringBuilder.append(kxy2.eiw());
        stringBuilder.append(" = ");
        stringBuilder.append("getSpecialCheckValue(CreatureObject, SpecialCheckTypes.");
        stringBuilder.append(b2.name());
        stringBuilder.append(");\n");
        kxy2.xB(stringBuilder.toString());
        return kxy2;
    }

    protected kxy W(int n, String string) {
        if (string == null) {
            lfn.b(5, "SFGamelogicFunctionGenerator", "createWeaponInfoTerm() PropertyName is null.");
            return null;
        }
        int n2 = ep.as((String)string);
        if (n2 <= 0) {
            lfn.b(5, "SFGamelogicFunctionGenerator", "createWeaponInfoTerm() PropertyName '" + string + "' is invalid.");
            return null;
        }
        kxy kxy2 = new kxy();
        kxy2.abh(1);
        kxy2.xA("Term" + n);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("        float ");
        stringBuilder.append(kxy2.eiw());
        stringBuilder.append(" = ");
        stringBuilder.append("getWeaponInfoPropertyValue(CreatureObject, ");
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
        printWriter.print(this.xy("Class_Compute_1"));
        kxz kxz2 = null;
        int n2 = list.size();
        for (n = 0; n < n2; ++n) {
            kxz2 = (kxz)list.get(n);
            if (!kxz2.eiA()) continue;
            printWriter.println(this.a("Function_Case_Compute_1", new int[]{0, 2}, new int[]{kxz2.getFunctionType(), n}));
        }
        printWriter.print(this.xy("Class_Compute_2"));
        n2 = list.size();
        for (n = 0; n < n2; ++n) {
            kxz2 = (kxz)list.get(n);
            if (kxz2.eiA()) continue;
            printWriter.println(this.a("Function_Case_Compute_2", new int[]{0, 2}, new int[]{kxz2.getFunctionType(), n}));
        }
        printWriter.print(this.xy("Class_Compute_2_End"));
        n2 = list.size();
        for (n = 0; n < n2; ++n) {
            kxz2 = (kxz)list.get(n);
            printWriter.println(this.a(kxz2, n));
        }
        printWriter.print(this.xy("Class_End"));
    }

    protected String a(kxz kxz2, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n    /**\n     * Computes function '");
        stringBuilder.append(kxz2.getFunctionName());
        stringBuilder.append("'.\n     */\n    private static float computeFunction");
        stringBuilder.append(n);
        if (kxz2.eiA()) {
            stringBuilder.append("()\n    {\n");
        } else {
            stringBuilder.append("(SFCreatureObject CreatureObject, int SkillType)\n    {\n");
        }
        kxy kxy2 = null;
        int n2 = kxz2.eio().size();
        for (int i = 0; i < n2; ++i) {
            kxy2 = kxz2.eio().get(i);
            stringBuilder.append(kxy2.eix());
        }
        stringBuilder.append("        float Result = ");
        stringBuilder.append(kxz2.ein());
        stringBuilder.append(";\n");
        stringBuilder.append("        if (SFSpeneConfig.DEBUG && showDebug(");
        stringBuilder.append(kxz2.getFunctionType());
        stringBuilder.append("))\n        {\n");
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("            SFOut.print(SFOut.DEBUG, \"SFGamelogicFunction\", \"computeFunction");
        stringBuilder2.append(n);
        stringBuilder2.append("(");
        String string = stringBuilder2.toString();
        if (kxz2.eip() != null) {
            int n3 = kxz2.eip().size();
            for (int i = 0; i < n3; ++i) {
                kxy2 = (kxy)kxz2.eip().get(i);
                if (kxy2.eiv() != 2) continue;
                stringBuilder.append(string);
                stringBuilder.append(kxy2.eiw());
                stringBuilder.append(") ");
                stringBuilder.append(kxy2.eix());
                stringBuilder.append("\");\n");
            }
        }
        stringBuilder.append(string);
        stringBuilder.append(kxz2.getFunctionName());
        stringBuilder.append(") ");
        stringBuilder.append(kxz2.bWM());
        stringBuilder.append("\");\n");
        stringBuilder.append(string);
        stringBuilder.append(kxz2.getFunctionName());
        stringBuilder.append(") ");
        stringBuilder.append("Result = \" + Result);\n");
        stringBuilder.append("        }\n");
        stringBuilder.append("        return Result;\n    }");
        return stringBuilder.toString();
    }
}

