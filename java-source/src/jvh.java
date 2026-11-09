/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ep
 */
import java.util.List;
import org.w3c.dom.Node;

public class jvh {
    private final lju oRy = new lju(0, 1, 0);
    private les aqN = lea.enZ();

    private cub ar(Node node) {
        List<Node> list = jsy.c("Requirement", node);
        if (list.isEmpty()) {
            throw new bg("No 'Requirement' found for composite requirement.");
        }
        cua[] cuaArray = new cua[list.size()];
        int n = cuaArray.length;
        for (int i2 = 0; i2 < n; ++i2) {
            try {
                cuaArray[i2] = this.au(list.get(i2));
                continue;
            }
            catch (bg bg2) {
                throw new bg("Parsing of requirement " + i2 + " failed.", bg2);
            }
        }
        cub cub2 = new cub();
        cub2.Requirements = cuaArray;
        return cub2;
    }

    private cuc as(Node node) {
        String string = jsy.c(node, "Name");
        if (string == null || string.trim().equals("")) {
            throw new bj("Attribute 'Name' has invalid value.");
        }
        int n = ep.as((String)string);
        if (n <= 0) {
            throw new bj("AttributeName '" + string + "' is invalid.");
        }
        float f = jsy.e(node, "AttributeValue");
        if (f <= 0.0f) {
            throw new bj("Attribute 'AttributeValue' has invalid value.");
        }
        cuc cuc2 = new cuc();
        cuc2.bnM = n;
        cuc2.AttributeValue = f;
        return cuc2;
    }

    private cue at(Node node) {
        String string = jsy.c(node, "Name");
        if (string == null || string.trim().equals("")) {
            throw new bj("Attribute 'Name' has invalid value.");
        }
        int n = this.aqN.getType(string);
        if (n <= 0) {
            throw new bj("SkillName '" + string + "' is invalid.");
        }
        float f = jsy.e(node, "SkillLevel");
        if (f <= 0.0f) {
            throw new bj("Attribute 'SkillLevel' has invalid value.");
        }
        cue cue2 = new cue();
        cue2.SkillType = n;
        cue2.SkillLevel = f;
        return cue2;
    }

    private cua au(Node node) {
        String string = jsy.c(node, "Type");
        if (string == null || string.trim().equals("")) {
            throw new bj("Attribute 'Type' has invalid value.");
        }
        if (string.equalsIgnoreCase("Attribute")) {
            return this.as(node);
        }
        if (string.equalsIgnoreCase("Composite")) {
            return this.ar(node);
        }
        if (string.equalsIgnoreCase("Skill")) {
            return this.at(node);
        }
        throw new bj("Node 'Type' has invalid value.");
    }

    private cuo av(Node node) {
        String string = jsy.c(node, "SkillName");
        if (string == null || string.trim().equals("")) {
            throw new bj("Attribute 'SkillName' has invalid value.");
        }
        int n = this.aqN.getType(string);
        if (n <= 0) {
            throw new bj("SkillName '" + string + "' is invalid.");
        }
        float f = jsy.e(node, "TrainingCost");
        if (f <= 0.0f) {
            throw new bj("Attribute 'TrainingCost' has invalid value.");
        }
        List<Node> list = jsy.c("Requirement", node);
        cua[] cuaArray = null;
        if (!list.isEmpty()) {
            cuaArray = new cua[list.size()];
            int n2 = cuaArray.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                try {
                    cuaArray[i2] = this.au(list.get(i2));
                    continue;
                }
                catch (bg bg2) {
                    throw new bg("Parsing of requirement " + i2 + " failed for skill '" + string + "'", bg2);
                }
            }
        }
        cuo cuo2 = new cuo();
        cuo2.SkillType = n;
        cuo2.TrainingCost = f;
        cuo2.Requirements = cuaArray;
        return cuo2;
    }
}

