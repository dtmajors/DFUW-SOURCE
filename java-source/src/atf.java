/*
 * Decompiled with CFR.
 */
public class atf {
    public int ID;
    public String aFo;
    public String aXn;
    public int ResourceType;
    public ljq Position;
    public boolean aFp;

    public atf Vd() {
        atf atf2 = new atf();
        atf2.ID = this.ID;
        atf2.aFo = this.aFo;
        atf2.aXn = this.aXn;
        atf2.ResourceType = this.ResourceType;
        atf2.Position = this.Position.esF();
        atf2.aFp = this.aFp;
        return atf2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ID=");
        stringBuilder.append(this.ID);
        stringBuilder.append(" ResourceType=");
        stringBuilder.append(this.ResourceType);
        stringBuilder.append(" Position=");
        if (this.Position == null) {
            stringBuilder.append("null");
        } else {
            stringBuilder.append(this.Position);
        }
        if (this.aFp) {
            stringBuilder.append(" UserAnnotation=true");
        } else {
            stringBuilder.append(" UserAnnotation=false");
        }
        stringBuilder.append(" Text=");
        if (this.aFo == null) {
            stringBuilder.append("null");
        } else {
            stringBuilder.append("'" + this.aFo + "'");
        }
        stringBuilder.append(" IconName=");
        if (this.aXn == null) {
            stringBuilder.append("null");
        } else {
            stringBuilder.append("'" + this.aXn + "'");
        }
        return stringBuilder.toString();
    }
}

