/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lkv
 */
public class ldj {
    public final int ipx;
    public final boolean bdP;
    public final String ipt;
    public final int aWe;

    public ldj(int n, String string, int n2, boolean bl) {
        this.ipx = n;
        this.ipt = string;
        this.aWe = n2;
        this.bdP = bl;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFEmoteCommand: CommandID=");
        stringBuilder.append(this.ipx);
        stringBuilder.append(" CommandName='");
        stringBuilder.append(this.ipt);
        stringBuilder.append("' AnimationState='");
        stringBuilder.append(lkv.adr((int)this.aWe));
        stringBuilder.append("' Locked='");
        stringBuilder.append(this.bdP);
        stringBuilder.append("'");
        return stringBuilder.toString();
    }
}

