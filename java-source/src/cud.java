/*
 * Decompiled with CFR.
 */
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias(value="ResourceRequirement")
public class cud
extends cua {
    @XStreamAlias(value="ResourceType")
    public int ResourceType = 0;
    @XStreamAlias(value="ResourceTypeName")
    public String ResourceTypeName;

    public String pa() {
        return lea.enW().getName(this.ResourceType);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFRequirementForResource: Resource='");
        stringBuilder.append(this.pa());
        return stringBuilder.toString();
    }
}

