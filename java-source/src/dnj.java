/*
 * Decompiled with CFR.
 */
public class dnj {
    public int aYH = 0;
    public ldv gKM = null;
    public int aqs = -1;
    public dnl gKN = null;
    public don gKO = null;

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFTransactionSession: SessionID=");
        stringBuilder.append(this.aYH);
        stringBuilder.append(" RequestorClientGUID=");
        stringBuilder.append(this.gKM);
        stringBuilder.append(" TransactionType='");
        stringBuilder.append(this.gKN.brC());
        stringBuilder.append("'");
        return stringBuilder.toString();
    }
}

