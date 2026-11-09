/*
 * Decompiled with CFR.
 */
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias(value="CompositeRequirement")
public class cub
extends cua {
    @XStreamAlias(value="Requirements")
    public cua[] Requirements = null;

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFRequirementComposite: RequirementCount=");
        stringBuilder.append(this.Requirements.length);
        return stringBuilder.toString();
    }
}

