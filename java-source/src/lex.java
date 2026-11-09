/*
 * Decompiled with CFR.
 */
public class lex {
    public ldv iHR = null;
    public int dTe = 0;
    public int rjR = -1;

    public boolean uf(ldv ldv2) {
        return this.iHR.equals(ldv2);
    }

    public boolean equals(Object object) {
        if (object instanceof lex) {
            lex lex2 = (lex)object;
            return this.uf(lex2.iHR);
        }
        return false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFMessageEventSink: EventListenerGUID=");
        stringBuilder.append(this.iHR);
        stringBuilder.append(" EventID=");
        stringBuilder.append(this.dTe);
        return stringBuilder.toString();
    }
}

