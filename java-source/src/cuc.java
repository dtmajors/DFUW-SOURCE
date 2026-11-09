/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ep
 */
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias(value="AttribRequirement")
public class cuc
extends cua {
    public transient int bnM = 0;
    @XStreamAlias(value="AttributeTypeName")
    public String AttributeTypeName;
    @XStreamAlias(value="AttributeValue")
    public float AttributeValue = 0.0f;

    public String getAttributeName() {
        return ep.aM((int)this.bnM);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFRequirementForAttribute: Attribute='");
        stringBuilder.append(this.getAttributeName());
        stringBuilder.append("' AttributeValue=");
        stringBuilder.append(this.AttributeValue);
        return stringBuilder.toString();
    }
}

