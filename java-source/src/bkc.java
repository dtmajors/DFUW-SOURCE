/*
 * Decompiled with CFR.
 */
public class bkc {
    public int ObjectType = 0;
    public int bst = 0;
    public bkd.a dqv = null;
    public int dqw = 0;

    public boolean aj(int n, int n2) {
        return this.ObjectType == n && this.bst == n2;
    }

    public String getObjectName() {
        return amh.gL(this.ObjectType);
    }

    public String getFunctionName() {
        return lea.enU().getName(this.bst);
    }

    public String ard() {
        return this.dqv.name();
    }

    public String are() {
        return lea.enU().getName(this.dqw);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFObjectFunctionMapping: Object='");
        stringBuilder.append(this.getObjectName());
        stringBuilder.append("' Function='");
        stringBuilder.append(this.getFunctionName());
        stringBuilder.append("' FunctionObject='");
        stringBuilder.append(this.ard());
        stringBuilder.append("' ReactionFunction='");
        stringBuilder.append(this.are());
        stringBuilder.append("'");
        return stringBuilder.toString();
    }

    public String arf() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFObjectFunctionMapping: ObjectType=");
        stringBuilder.append(this.ObjectType);
        stringBuilder.append(" FunctionType=");
        stringBuilder.append(this.bst);
        stringBuilder.append(" FunctionObjectType=");
        stringBuilder.append((Object)this.dqv);
        stringBuilder.append(" ReactionFunctionType=");
        stringBuilder.append(this.dqw);
        return stringBuilder.toString();
    }
}

