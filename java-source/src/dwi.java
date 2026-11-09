/*
 * Decompiled with CFR.
 */
import java.util.Map;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public abstract class dwi {
    private dwg hjQ = dwg.hiS;
    private int hjR = 2000;
    private float hjS = 25.0f;
    private float hjT = 1.15f;
    private boolean hjU = false;
    private Map<Integer, Float> hjV = null;
    private Map<lmf, Float> hjW = null;
    private Map<Integer, Float> hjX = null;

    public dwg bCG() {
        return this.hjQ;
    }

    public int bCK() {
        return this.hjR;
    }

    protected void CE(int n2) {
        this.hjR = n2;
    }

    public float bCL() {
        return this.hjS;
    }

    protected void iC(float f2) {
        this.hjS = f2;
    }

    public float bCM() {
        return this.hjT;
    }

    protected void iD(float f2) {
        this.hjT = f2;
    }

    public boolean bCN() {
        return this.hjU;
    }

    protected void jK(boolean bl) {
        this.hjU = bl;
    }

    protected dwi(dwg dwg2) {
        this.hjQ = dwg2;
        this.hjV = lcn.emw();
        this.hjW = lcn.emw();
        this.hjX = lcn.emw();
        dwi.a(this);
    }

    public abstract void a(dwn var1, dwn var2, ljq var3);

    protected float a(dwn dwn2, dwn dwn3) {
        if (dwn2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "getRankDifferenceMultiplier() : Killer is Null!");
            assert (false);
            return 1.0f;
        }
        if (dwn3 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "getRankDifferenceMultiplier() : Victim is Null!");
            assert (false);
            return 1.0f;
        }
        int n2 = dwn3.bDc() - dwn2.bDc();
        return this.hjX.containsKey(n2) ? this.hjX.get(n2).floatValue() : 1.0f;
    }

    protected float cC(ljq ljq2) {
        if (ljq2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "getDangerLevelMultiplier() : Kill Position is Null!");
            assert (false);
            return 1.0f;
        }
        lmf lmf2 = lea.eg(ljq2);
        float f2 = this.hjW.containsKey((Object)lmf2) ? this.hjW.get((Object)lmf2).floatValue() : 1.0f;
        return f2;
    }

    protected float b(dwn dwn2, dwn dwn3) {
        int n2;
        if (dwn2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "getDiminishingReturnsMultiplier() : Killer is Null!");
            assert (false);
            return 1.0f;
        }
        if (dwn3 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "getDiminishingReturnsMultiplier() : Victim is Null!");
            assert (false);
            return 1.0f;
        }
        for (n2 = dwn2.CF(dwn3.qe()) + 1; !this.hjV.containsKey(n2) && n2 > 0; --n2) {
        }
        float f2 = this.hjV.containsKey(n2) ? this.hjV.get(n2).floatValue() : 1.0f;
        return f2;
    }

    abstract void n(Element var1);

    protected void o(Element element) {
        if (element == null) {
            lfn.b(5, this.getClass().getSimpleName(), "parseCommonBasicValues() : Values Element is Null!!!");
            assert (false);
            throw new bg("Values Element is Null!!!");
        }
        if (!element.getNodeName().equals("basic_values")) {
            lfn.b(5, this.getClass().getSimpleName(), "parseCommonBasicValues() : Unexpected node encountered!!!... Node Name: " + element.getNodeName());
            assert (false);
            throw new bg("Unexpected node encountered!!!... Node Name: " + element.getNodeName());
        }
        String string = element.getAttribute("starting_points");
        String string2 = element.getAttribute("base_points");
        String string3 = element.getAttribute("loss_multiplier");
        String string4 = element.getAttribute("allow_negative_points");
        try {
            this.hjR = Integer.parseInt(string);
            this.hjS = Float.parseFloat(string2);
            this.hjT = Float.parseFloat(string3);
            this.hjU = Boolean.parseBoolean(string4);
        }
        catch (NumberFormatException numberFormatException) {
            throw new bg("Failed to Parse Basic Calculation Values", numberFormatException);
        }
    }

    protected void a(NodeList nodeList) {
        if (nodeList == null || nodeList.getLength() == 0) {
            lfn.b(5, this.getClass().getSimpleName(), "parseDiminishingReturnsMultipliers() : No Diminishing Returns Nodes Found!!!");
            assert (false);
            throw new bg("No Diminishing Returns Nodes Found!!!");
        }
        this.hjV.clear();
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            Node node = nodeList.item(i2);
            if (!node.getNodeName().equals("diminishing_returns")) {
                lfn.b(5, this.getClass().getSimpleName(), "parseDiminishingReturnsMultipliers() : Unexpected node encountered!!!... Node Name: " + node.getNodeName());
                assert (false);
                throw new bg("Unexpected node encountered!!!... Node Name: " + node.getNodeName());
            }
            Element element = (Element)node;
            String string = element.getAttribute("kill_count");
            String string2 = element.getAttribute("multiplier");
            try {
                int n2 = Integer.parseInt(string);
                float f2 = Float.parseFloat(string2);
                if (this.hjV.containsKey(n2)) {
                    lfn.b(5, this.getClass().getSimpleName(), "parseDiminishingReturnsMultipliers() : Duplicate Kill Count Encountered!!!");
                    assert (false);
                    throw new bg("Duplicate Kill Count Encountered!!!");
                }
                this.hjV.put(n2, Float.valueOf(f2));
                continue;
            }
            catch (NumberFormatException numberFormatException) {
                throw new bg("Failed to Parse Diminishing Returns Values", numberFormatException);
            }
        }
        if (this.hjV.isEmpty()) {
            lfn.b(5, this.getClass().getSimpleName(), "parseDiminishingReturnsMultipliers() : No Diminishing Returns Nodes Parsed!!!");
            assert (false);
            throw new bg("No Diminishing Returns Nodes Parsed!!!");
        }
    }

    protected void b(NodeList nodeList) {
        if (nodeList == null || nodeList.getLength() == 0) {
            lfn.b(5, this.getClass().getSimpleName(), "parseDangerLevelMultipliers() : No Danger-Level Nodes Found!!!");
            assert (false);
            throw new bg("No Danger-Level Nodes Found!!!");
        }
        this.hjW.clear();
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            Node node = nodeList.item(i2);
            if (!node.getNodeName().equals("danger_levels")) {
                lfn.b(5, this.getClass().getSimpleName(), "parseDangerLevelMultipliers() : Unexpected node encountered!!!... Node Name: " + node.getNodeName());
                assert (false);
                throw new bg("Unexpected node encountered!!!... Node Name: " + node.getNodeName());
            }
            Element element = (Element)node;
            String string = element.getAttribute("danger_level");
            String string2 = element.getAttribute("multiplier");
            try {
                lmf lmf2 = lmf.getValueByName(string);
                float f2 = Float.parseFloat(string2);
                if (lmf2 == lmf.rEz || lmf2 == lmf.rEt) {
                    lfn.b(5, this.getClass().getSimpleName(), "parseDangerLevelMultipliers() : Invalid Danger-Level Encountered!!!... Danger-Level = " + (Object)((Object)lmf2));
                    assert (false);
                    throw new bg("Invalid Danger-Level Encountered!!!... Danger-Level = " + (Object)((Object)lmf2));
                }
                if (this.hjW.containsKey((Object)lmf2)) {
                    lfn.b(5, this.getClass().getSimpleName(), "parseDangerLevelMultipliers() : Duplicate Danger-Level Encountered!!!");
                    assert (false);
                    throw new bg("Duplicate Danger-Level Encountered!!!");
                }
                this.hjW.put(lmf2, Float.valueOf(f2));
                continue;
            }
            catch (NumberFormatException numberFormatException) {
                throw new bg("Failed to Parse Danger-Level Multiplier", numberFormatException);
            }
        }
        if (this.hjW.isEmpty()) {
            lfn.b(5, this.getClass().getSimpleName(), "parseDangerLevelMultipliers() : No Danger-Level Nodes Parsed!!!");
            assert (false);
            throw new bg("No Danger-Level Nodes Parsed!!!");
        }
        if (this.hjW.size() != lmf.getKnownDangerLevels().length - 1) {
            lfn.b(5, this.getClass().getSimpleName(), "parseDangerLevelMultipliers() : Not Enough Danger-Level Nodes Parsed!!!");
            assert (false);
            throw new bg("Not Enough Danger-Level Nodes Parsed!!!");
        }
    }

    protected void c(NodeList nodeList) {
        int n2;
        if (nodeList == null || nodeList.getLength() == 0) {
            lfn.b(5, this.getClass().getSimpleName(), "parseRankDifferenceMultipliers() : No Rank Difference Nodes Found!!!");
            assert (false);
            throw new bg("No Rank Difference Nodes Found!!!");
        }
        this.hjX.clear();
        int n3 = Integer.MAX_VALUE;
        int n4 = Integer.MIN_VALUE;
        for (n2 = 0; n2 < nodeList.getLength(); ++n2) {
            Node node = nodeList.item(n2);
            if (!node.getNodeName().equals("rank_differences")) {
                lfn.b(5, this.getClass().getSimpleName(), "parseRankDifferenceMultipliers() : Unexpected node encountered!!!... Node Name: " + node.getNodeName());
                assert (false);
                throw new bg("Unexpected node encountered!!!... Node Name: " + node.getNodeName());
            }
            Element element = (Element)node;
            String string = element.getAttribute("difference");
            String string2 = element.getAttribute("multiplier");
            try {
                int n5 = Integer.parseInt(string);
                float f2 = Float.parseFloat(string2);
                if (n3 > n5) {
                    n3 = n5;
                }
                if (n4 < n5) {
                    n4 = n5;
                }
                if (this.hjX.containsKey(n5)) {
                    lfn.b(5, this.getClass().getSimpleName(), "parseRankDifferenceMultipliers() : Duplicate Rank Difference Encountered!!!");
                    assert (false);
                    throw new bg("Duplicate Rank Difference Encountered!!!");
                }
                this.hjX.put(n5, Float.valueOf(f2));
                continue;
            }
            catch (NumberFormatException numberFormatException) {
                throw new bg("Failed to Parse Diminishing Returns Values", numberFormatException);
            }
        }
        if (this.hjX.isEmpty()) {
            lfn.b(5, this.getClass().getSimpleName(), "parseRankDifferenceMultipliers() : No Rank Difference Nodes Parsed!!!");
            assert (false);
            throw new bg("No Rank Difference Nodes Parsed!!!");
        }
        for (n2 = n3; n2 <= n4; ++n2) {
            if (this.hjX.containsKey(n2)) continue;
            lfn.b(5, this.getClass().getSimpleName(), "parseRankDifferenceMultipliers() : Defined Rank Differences Are Not Continuously Defined!!!");
            assert (false);
            throw new bg("Duplicate Rank Differences Are Not Continuously Defined!!!");
        }
    }

    static dwi a(dwg dwg2) {
        switch (dwg2) {
            case hiT: {
                return new dwj();
            }
            case hiU: {
                return new dwk();
            }
        }
        return null;
    }

    private static void a(dwi dwi2) {
        dwi2.hjV.put(1, Float.valueOf(1.0f));
        dwi2.hjV.put(2, Float.valueOf(0.8f));
        dwi2.hjV.put(3, Float.valueOf(0.6f));
        dwi2.hjV.put(4, Float.valueOf(0.4f));
        dwi2.hjV.put(5, Float.valueOf(0.2f));
        dwi2.hjV.put(6, Float.valueOf(0.0f));
        dwi2.hjW.put(lmf.rEu, Float.valueOf(0.75f));
        dwi2.hjW.put(lmf.rEv, Float.valueOf(0.9375f));
        dwi2.hjW.put(lmf.rEw, Float.valueOf(1.125f));
        dwi2.hjW.put(lmf.rEx, Float.valueOf(1.3125f));
        dwi2.hjW.put(lmf.rEy, Float.valueOf(1.5f));
        dwi2.hjX.put(-9, Float.valueOf(0.25f));
        dwi2.hjX.put(-8, Float.valueOf(0.3226f));
        dwi2.hjX.put(-7, Float.valueOf(0.4615f));
        dwi2.hjX.put(-6, Float.valueOf(0.5999f));
        dwi2.hjX.put(-5, Float.valueOf(0.7059f));
        dwi2.hjX.put(-4, Float.valueOf(0.7894f));
        dwi2.hjX.put(-3, Float.valueOf(0.8571f));
        dwi2.hjX.put(-2, Float.valueOf(0.9131f));
        dwi2.hjX.put(-1, Float.valueOf(0.96f));
        dwi2.hjX.put(0, Float.valueOf(1.0f));
        dwi2.hjX.put(1, Float.valueOf(1.0417f));
        dwi2.hjX.put(2, Float.valueOf(1.0952f));
        dwi2.hjX.put(3, Float.valueOf(1.1667f));
        dwi2.hjX.put(4, Float.valueOf(1.2667f));
        dwi2.hjX.put(5, Float.valueOf(1.4167f));
        dwi2.hjX.put(6, Float.valueOf(1.6667f));
        dwi2.hjX.put(7, Float.valueOf(2.1667f));
        dwi2.hjX.put(8, Float.valueOf(3.1f));
        dwi2.hjX.put(9, Float.valueOf(4.0f));
    }
}

