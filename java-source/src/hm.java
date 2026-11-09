/*
 * Decompiled with CFR.
 */
public class hm
extends hl {
    public ahu.b Ul = null;

    public String getEventPropertyName() {
        return this.Ul.name();
    }

    @Override
    public String toString() {
        assert (this.Ul != null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFPropertyDefinitionGeneral: ");
        stringBuilder.append(super.toString());
        stringBuilder.append(" EventPropertyType='");
        stringBuilder.append(this.getEventPropertyName());
        stringBuilder.append("'");
        return stringBuilder.toString();
    }
}

