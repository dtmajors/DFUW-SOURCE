/*
 * Decompiled with CFR.
 */
public abstract class ald {
    public int Type = 0;
    public String Name;
    public String PrefixName;
    public String PostfixName;

    public abstract float DD();

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append(": Name='");
        stringBuilder.append(this.Name);
        stringBuilder.append("'");
        return stringBuilder.toString();
    }

    public void validate() {
        if (this.Type <= 0) {
            throw new bg("Type is invalid.");
        }
        if (this.Name == null || this.Name.trim().equals("")) {
            throw new bg("Name is invalid.");
        }
        if (this.DE()) {
            if (this.PrefixName == null) {
                throw new bg("PrefixName is invalid.");
            }
            if (this.PostfixName == null) {
                throw new bg("PostfixName is invalid.");
            }
            if (this.PrefixName.trim().equals("")) {
                this.PrefixName = null;
            }
            if (this.PostfixName.trim().equals("")) {
                this.PostfixName = null;
            }
        }
    }

    protected boolean DE() {
        return true;
    }
}

