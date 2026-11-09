/*
 * Decompiled with CFR.
 */
import java.util.Map;

public class hsp {
    private final Map<String, hsq> lcL = lcn.emG();

    public void a(hsq hsq2) {
        this.lcL.put(hsq2.Name, hsq2);
    }

    public boolean a(String string, mhs mhs2) {
        hsq hsq2 = this.ne(string);
        if (hsq2 == null) {
            return false;
        }
        return hsq2.lcN == mhs2;
    }

    hsq ne(String string) {
        return this.lcL.get(string);
    }
}

