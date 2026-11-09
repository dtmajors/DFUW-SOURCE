/*
 * Decompiled with CFR.
 */
public class fp {
    public static final String SM = "AI";
    public int di;
    public int hB;
    public int SN;
    public int SO;
    public String hE;
    public String hD;
    public String SP;
    public String SQ;
    public boolean SR;
    public final int SS;
    public String ST = "";
    public int SU = -2;
    public String SV = null;

    private fp() {
        this.SS = -1;
    }

    public fp(hc hc2) {
        this.SS = hc2.ordinal();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFClientAccountInfo: ClientNodeID=");
        stringBuilder.append(this.di);
        stringBuilder.append(" AccountID=");
        stringBuilder.append(this.hB);
        stringBuilder.append(" CharacterID=");
        stringBuilder.append(this.SN);
        stringBuilder.append(" AccountName='");
        stringBuilder.append(this.hE);
        stringBuilder.append(" CreatingChar=");
        stringBuilder.append(this.SR);
        stringBuilder.append(" AccessLevel=");
        stringBuilder.append((Object)this.hf());
        return stringBuilder.toString();
    }

    public hc hf() {
        if (this.SS < 0 || this.SS > hc.aaP.ordinal()) {
            assert (false);
            return hc.aaz;
        }
        return hc.aaW[this.SS];
    }
}

