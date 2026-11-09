/*
 * Decompiled with CFR.
 */
import java.util.StringTokenizer;

public class oq {
    public ldv GUID;
    public int aGh;
    public long aGi;
    public boolean aGj;
    public boolean aGk;

    private oq() {
    }

    public oq(ldv ldv2, int n2, long l, boolean bl, boolean bl2) {
        this.GUID = ldv2;
        this.aGh = n2;
        this.aGi = l;
        this.aGj = bl;
        this.aGk = bl2;
    }

    public String fk() {
        return this.GUID.fk() + ":" + Integer.toString(this.aGh) + ":" + Long.toString(this.aGi) + ":" + Boolean.toString(this.aGj) + ":" + Boolean.toString(this.aGk);
    }

    public static oq bR(String string) {
        StringTokenizer stringTokenizer = new StringTokenizer(string, ":");
        if (stringTokenizer.countTokens() == 4) {
            try {
                oq oq2 = new oq();
                oq2.GUID = ldv.zp(stringTokenizer.nextToken());
                oq2.aGh = Integer.parseInt(stringTokenizer.nextToken());
                oq2.aGi = Long.parseLong(stringTokenizer.nextToken());
                oq2.aGj = Boolean.parseBoolean(stringTokenizer.nextToken());
                oq2.aGk = false;
                return oq2.GUID == null ? null : oq2;
            }
            catch (NumberFormatException numberFormatException) {
                return null;
            }
        }
        if (stringTokenizer.countTokens() == 5) {
            try {
                oq oq3 = new oq();
                oq3.GUID = ldv.zp(stringTokenizer.nextToken());
                oq3.aGh = Integer.parseInt(stringTokenizer.nextToken());
                oq3.aGi = Long.parseLong(stringTokenizer.nextToken());
                oq3.aGj = Boolean.parseBoolean(stringTokenizer.nextToken());
                oq3.aGk = Boolean.parseBoolean(stringTokenizer.nextToken());
                return oq3.GUID == null ? null : oq3;
            }
            catch (NumberFormatException numberFormatException) {
                return null;
            }
        }
        return null;
    }
}

