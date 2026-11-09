/*
 * Decompiled with CFR.
 */
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class lu
extends lw {
    private boolean acV;
    private boolean acW;
    private float awq;
    private int acX;
    private long awr;
    private long aws;
    private final Map<ldv, lt> acZ = lcn.emw();
    private final Map<ldv, lv> awt = lcn.emw();

    public lu(ldv ldv2, boolean bl, boolean bl2, float f, int n, Timestamp timestamp, Timestamp timestamp2) {
        this.Ri = ldv2;
        this.acV = bl;
        this.acW = bl2;
        this.awq = f;
        this.acX = n;
        this.awr = timestamp != null ? timestamp.getTime() : -1L;
        long l = this.aws = timestamp2 != null ? timestamp2.getTime() : -1L;
        if (this.aws < 0L) {
            this.aws = 0L;
        }
    }

    public lu(ldv ldv2, boolean bl, boolean bl2, float f, int n, String string, String string2, boolean bl3, long l) {
        this.Ri = ldv2;
        this.acV = bl;
        this.acW = bl2;
        this.awq = f;
        this.acX = n;
        this.FirstName = string;
        this.LastName = string2;
        this.adc = bl3;
        this.awr = l;
    }

    public void a(String string, String string2, boolean bl, float f) {
        this.FirstName = string;
        this.LastName = string2;
        this.adc = bl;
    }

    public void a(float f, ls.a a2, long l) {
        switch (a2) {
            case avR: 
            case avS: 
            case avT: 
            case avU: 
            case avP: 
            case avQ: {
                this.awq += f;
                ++this.acX;
            }
        }
        if (this.acX >= ls.pB()) {
            boolean bl = this.acW;
            boolean bl2 = this.acW = this.awq / (float)this.acX < ls.pD();
            if (this.acW) {
                this.acV = false;
            }
            if (this.acZ.isEmpty() && this.acW) {
                this.aws = l;
            }
        }
    }

    public void a(ldv ldv2, lt lt2) {
        this.acZ.put(ldv2, lt2);
    }

    public lt bN(ldv ldv2) {
        return this.acZ.remove(ldv2);
    }

    public lt bM(ldv ldv2) {
        return this.acZ.get(ldv2);
    }

    public oe[] pO() {
        if (this.acZ.isEmpty()) {
            return null;
        }
        oe[] oeArray = new oe[this.acZ.size()];
        int n = 0;
        for (lt lt2 : this.acZ.values()) {
            oeArray[n] = new oe(lt2.qe(), lt2.pM());
            ++n;
        }
        return oeArray;
    }

    public lil<String[], int[], float[]> pP() {
        if (this.acZ.isEmpty()) {
            return null;
        }
        String[] stringArray = new String[this.acZ.size()];
        int[] nArray = new int[this.acZ.size()];
        float[] fArray = new float[this.acZ.size()];
        int n = 0;
        for (lt lt2 : this.acZ.values()) {
            stringArray[n] = lt2.cz() + " " + lt2.cA();
            nArray[n] = lt2.qe();
            fArray[n] = lt2.pN();
            ++n;
        }
        return new lil<String[], int[], float[]>(stringArray, nArray, fArray);
    }

    public final Collection<lt> pQ() {
        return this.acZ.values();
    }

    public final Set<ldv> pR() {
        return this.acZ.keySet();
    }

    public final int pS() {
        return this.acZ.size();
    }

    public final void ab(boolean bl) {
        this.acV = bl;
    }

    public final boolean isRegistered() {
        return this.acV;
    }

    public final boolean pT() {
        return this.acW;
    }

    public final int pU() {
        return this.acX;
    }

    public final float pV() {
        return this.awq;
    }

    public final long pW() {
        return this.awr;
    }

    public final long pX() {
        return this.aws;
    }

    public void a(ldv ldv2, lv lv2) {
        this.awt.put(ldv2, lv2);
    }

    public of[] pY() {
        if (this.awt.isEmpty()) {
            return null;
        }
        of[] ofArray = new of[this.awt.size()];
        int n = 0;
        for (lv lv2 : this.awt.values()) {
            ofArray[n] = new of(lv2.qe(), lv2.pM(), lv2.qc());
            ++n;
        }
        return ofArray;
    }

    public lv bO(ldv ldv2) {
        return this.awt.get(ldv2);
    }

    public lv bP(ldv ldv2) {
        return this.awt.remove(ldv2);
    }

    public final Collection<lv> pZ() {
        return this.awt.values();
    }

    public final Set<ldv> qa() {
        return this.awt.keySet();
    }

    public final int qb() {
        return this.awt.size();
    }

    public String toString() {
        return this.Ri + " " + this.FirstName + " " + this.LastName + " Apprentices : " + this.pS();
    }
}

