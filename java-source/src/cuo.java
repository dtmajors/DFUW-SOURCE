/*
 * Decompiled with CFR.
 */
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias(value="TrainingRule")
public class cuo
implements Comparable {
    public static final String TYPE_ATTRIBUTE = "Attribute";
    public static final String TYPE_COMPOSITE = "Composite";
    public static final String TYPE_RESOURCE = "Resource";
    public static final String TYPE_SKILL = "Skill";
    public static final String[] Types = new String[]{"Attribute", "Composite", "Resource", "Skill"};
    public transient int SkillType = 0;
    @XStreamAlias(value="SkillTypeName")
    public String SkillTypeName;
    @XStreamAlias(value="TrainingCost")
    public float TrainingCost = 0.0f;
    @XStreamAlias(value="Requirements")
    public cua[] Requirements = null;

    public String Bu() {
        return lea.enZ().getName(this.SkillType);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFTrainingRule: Skill='");
        stringBuilder.append(this.Bu());
        stringBuilder.append("' TrainingCost=");
        stringBuilder.append(this.TrainingCost);
        return stringBuilder.toString();
    }

    public int compareTo(Object object) {
        assert (object instanceof cuo);
        cuo cuo2 = (cuo)object;
        return this.Bu().compareTo(cuo2.Bu());
    }
}

