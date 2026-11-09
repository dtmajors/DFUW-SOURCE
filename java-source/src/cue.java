/*
 * Decompiled with CFR.
 */
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias(value="SkillRequirement")
public class cue
extends cua {
    public transient int SkillType = 0;
    @XStreamAlias(value="SkillTypeName")
    public String SkillTypeName;
    @XStreamAlias(value="SkillTypeLevel")
    public float SkillLevel = 0.0f;

    public String Bu() {
        return lea.enZ().getName(this.SkillType);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFRequirementForSkill: Skill='");
        stringBuilder.append(this.Bu());
        stringBuilder.append("' SkillLevel=");
        stringBuilder.append(this.SkillLevel);
        return stringBuilder.toString();
    }
}

