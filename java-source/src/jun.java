/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cxd
 *  ep
 */
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class jun {
    public static final String TC = "SFPlayerFunctionConstantsParser";

    public void eL(String string) {
        try {
            float f;
            Node node29;
            int n;
            Object object;
            Node node2;
            float f2;
            Node node3;
            boolean bl;
            int n2;
            boolean bl2;
            float f3;
            float f4;
            int n3;
            boolean bl3;
            boolean bl4;
            float f5;
            Document document = jsy.tJ(string);
            if (document == null) {
                lfn.b(5, TC, "parseFile() Invalid Document: [" + string + "]");
                assert (false);
                return;
            }
            Node node4 = jsy.a("GamelogicConstants", (Node)document);
            if (node4 == null) {
                throw new bn("GamelogicConstants");
            }
            List<Node> list = jsy.c("Regeneration", node4);
            if (list == null || list.isEmpty()) {
                throw new bn("Regeneration");
            }
            for (Node object22 : list) {
                String string2 = jsy.i(object22, "AttributeName");
                float f6 = Float.parseFloat(jsy.i(object22, "MinValue"));
                f5 = Float.parseFloat(jsy.i(object22, "MaxValue"));
                int n4 = ep.as((String)string2);
                switch (n4) {
                    case 352: {
                        cer.dQ(f6);
                        cer.dR(f5);
                        break;
                    }
                    case 384: {
                        cer.dU(f6);
                        cer.dV(f5);
                        break;
                    }
                    case 400: {
                        cer.dS(f6);
                        cer.dT(f5);
                    }
                }
            }
            List<Node> list2 = jsy.c("StatGain", node4);
            if (list2 == null || list2.isEmpty()) {
                throw new bn("StatGain");
            }
            for (Node node5 : list2) {
                String string3 = jsy.i(node5, "AttributeName");
                f5 = Float.parseFloat(jsy.i(node5, "MinValue"));
                float f7 = Float.parseFloat(jsy.i(node5, "MaxValue"));
                int n5 = ep.as((String)string3);
                switch (n5) {
                    case 352: {
                        cer.dX(f5);
                        cer.dW(f7);
                        break;
                    }
                    case 384: {
                        cer.dY(f5);
                        cer.dZ(f7);
                        break;
                    }
                    case 400: {
                        cer.ea(f5);
                        cer.eb(f7);
                    }
                }
            }
            Node node6 = jsy.a("IntelligenceRegenerationMultiplier", node4);
            float f8 = Float.parseFloat(jsy.i(node6, "Value"));
            cer.ec(f8);
            Node node7 = jsy.a("HealthBase", node4);
            f5 = Float.parseFloat(jsy.i(node7, "Value"));
            cer.ed(f5);
            Node node8 = jsy.a("ManaBase", node4);
            float f9 = Float.parseFloat(jsy.i(node8, "Value"));
            cer.ee(f9);
            Node node9 = jsy.a("StaminaBase", node4);
            float f10 = Float.parseFloat(jsy.i(node9, "Value"));
            cer.ef(f10);
            Node node10 = jsy.a("HealthAttributePart", node4);
            float f11 = Float.parseFloat(jsy.i(node10, "Value"));
            cer.eg(f11);
            Node node11 = jsy.a("ManaAttributePart", node4);
            float f12 = Float.parseFloat(jsy.i(node11, "Value"));
            cer.eh(f12);
            Node node12 = jsy.a("StaminaAttributePart", node4);
            float f13 = Float.parseFloat(jsy.i(node12, "Value"));
            cer.ei(f13);
            Node node13 = jsy.a("StrengthBoosterPart", node4);
            float f14 = Float.parseFloat(jsy.i(node13, "Value"));
            cer.ej(f14);
            Node node14 = jsy.a("WisdomBoosterPart", node4);
            float f15 = Float.parseFloat(jsy.i(node14, "Value"));
            cer.ek(f15);
            Node node15 = jsy.a("DexterityBoosterPart", node4);
            float f16 = Float.parseFloat(jsy.i(node15, "Value"));
            cer.el(f16);
            Node node16 = jsy.a("IntelligenceBaseMultiplier", node4);
            float f17 = Float.parseFloat(jsy.i(node16, "Value"));
            cer.en(f17);
            Node node17 = jsy.a("IntelligenceBoosterMultiplier", node4);
            float f18 = Float.parseFloat(jsy.i(node17, "Value"));
            cer.em(f18);
            Node node18 = jsy.a("SpiritBond", node4);
            Node node19 = jsy.a("HealOverTime", node18);
            cet.erl = bl4 = Boolean.parseBoolean(jsy.i(node19, "Value"));
            Node node20 = jsy.a("PermitConnectionOnConnectedPlayers", node18);
            cet.erm = bl3 = Boolean.parseBoolean(jsy.i(node20, "Value"));
            Node node21 = jsy.a("HealthCheckDelay", node18);
            int n6 = Integer.parseInt(jsy.i(node21, "Value"));
            cet.ero = n6;
            Node node22 = jsy.a("MaxLinks", node18);
            cet.ern = n3 = Integer.parseInt(jsy.i(node22, "Value"));
            Node node23 = jsy.a("SoulFlay", node4);
            Node node24 = jsy.a("HealthPercentageReturn", node23);
            cfa.etL = f4 = Float.parseFloat(jsy.i(node24, "Value"));
            Node node25 = jsy.a("HealthFlatReturn", node23);
            cfa.etM = f3 = Float.parseFloat(jsy.i(node25, "Value"));
            Node node26 = jsy.a("ReturnFlatGain", node23);
            cfa.etN = bl2 = Boolean.parseBoolean(jsy.i(node26, "Value"));
            Node node27 = jsy.a("MaxLinks", node23);
            cfa.ern = n2 = Integer.parseInt(jsy.i(node27, "Value"));
            Node node28 = jsy.a("Skills", node4);
            cxd.fPK = bl = Boolean.parseBoolean(jsy.i(node28, "Active"));
            if (cxd.fPK) {
                float f19;
                node3 = jsy.a("Time", node28);
                cxd.fPJ = f2 = Float.parseFloat(jsy.i(node3, "Value"));
                node2 = jsy.a("Stamina", node28);
                cxd.fPH = f19 = Float.parseFloat(jsy.i(node2, "Value"));
                List<Node> list3 = jsy.c("Skill", node28);
                object = new int[list3.size()];
                n = 0;
                for (Node node29 : list3) {
                    String string4 = jsy.i(node29, "Value");
                    int n7 = lea.enZ().getType(string4);
                    assert (n7 != -1);
                    object[n] = n7;
                    ++n;
                }
                cxd.fPI = object;
            }
            node3 = jsy.a("Cooldown", node4);
            cxd.fPL = f2 = Float.parseFloat(jsy.i(node3, "Value"));
            node2 = jsy.a("RegenerationEnabled", node4);
            boolean bl5 = Boolean.parseBoolean(jsy.i(node2, "Value"));
            float f20 = Float.parseFloat(jsy.i(node2, "Multiplier"));
            cxd.fPM = bl5;
            cxd.fPR = f20;
            object = jsy.a("BlockJumpOnImpact", node4);
            n = Boolean.parseBoolean(jsy.i((Node)object, "Value"));
            float f21 = Float.parseFloat(jsy.i((Node)object, "BlockingTime"));
            cxd.fPN = n;
            cxd.fPO = f21;
            object = jsy.a("BlockSprintOnImpact", node4);
            n = Boolean.parseBoolean(jsy.i((Node)object, "Value")) ? 1 : 0;
            f21 = Float.parseFloat(jsy.i((Node)object, "BlockingTime"));
            cxd.fPP = n;
            cxd.fPQ = f21;
            object = jsy.a("HorizontalFallingDamageEnabled", node4);
            cxd.fPS = Boolean.parseBoolean(jsy.i((Node)object, "Value"));
            cxd.fPT = Float.parseFloat(jsy.i((Node)object, "HorizontalMultiplier"));
            cxd.fPV = Float.parseFloat(jsy.i((Node)object, "HorizontalThreshold"));
            cxd.fPU = Float.parseFloat(jsy.i((Node)object, "VerticalMultiplier"));
            cxd.fPW = Float.parseFloat(jsy.i((Node)object, "VerticalThreshold"));
            Node node30 = jsy.a("MinTimeBetweenJumpsInWater", node4);
            f21 = Float.parseFloat(jsy.i(node30, "Value"));
            node29 = jsy.a("MinTimeOnSurfaceBeforeJump", node4);
            float f22 = Float.parseFloat(jsy.i(node29, "Value"));
            cxd.fPX = f21;
            cxd.fPY = f22;
            Node node31 = jsy.a("HeartOfStoneImpactDamageReduction", node4);
            cxd.fPZ = f = Float.parseFloat(jsy.i(node31, "Value"));
        }
        catch (bg bg2) {
            throw new bg("Parsing of file '" + string + "' failed.", bg2);
        }
    }
}

