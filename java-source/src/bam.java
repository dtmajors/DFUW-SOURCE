/*
 * Decompiled with CFR.
 */
import java.util.Map;
import java.util.Set;

public class bam {
    private ldv ade = null;
    private String add = null;
    private int cHe = 0;
    private Map<ldv, ban> cHf = null;
    private Set<bao> cHg = null;
    private boolean cMW = false;
    private azv cHh = null;

    ldv iG() {
        return this.ade;
    }

    String iV() {
        return this.add;
    }

    void cD(String string) {
        this.add = string;
    }

    int aer() {
        return this.cHe;
    }

    boolean aiI() {
        return this.cMW;
    }

    int aes() {
        return this.cHf.size();
    }

    ban gc(ldv ldv2) {
        return this.cHf.get(ldv2);
    }

    bam(ldv ldv2, String string, bao bao2) {
        this.ade = ldv2;
        this.add = string;
        this.cMW = this.ade.equals(bao2.g(bbc.cPP));
        this.cHf = lcn.emw();
        this.cHg = lcn.emx();
    }

    public boolean gd(ldv ldv2) {
        if (!this.cHg.isEmpty()) {
            for (bao bao2 : this.cHg) {
                if (!bao2.g(bbc.cPQ).equals(ldv2)) continue;
                return true;
            }
        }
        return false;
    }

    public bao ge(ldv ldv2) {
        if (!this.cHg.isEmpty()) {
            for (bao bao2 : this.cHg) {
                if (!bao2.g(bbc.cPQ).equals(ldv2)) continue;
                return bao2;
            }
        }
        return null;
    }

    boolean js(int n) {
        if (this.cHe == n) {
            return false;
        }
        this.cHe = n;
        return true;
    }

    ban a(ldv ldv2, String string, int n, ljq ljq2, float f) {
        if (this.cHf.containsKey(ldv2)) {
            return this.cHf.get(ldv2);
        }
        ban ban2 = new ban(ldv2, string, n, ljq2, f);
        this.cHf.put(ldv2, ban2);
        return ban2;
    }

    ban f(ldv ldv2, float f) {
        if (!this.cHf.containsKey(ldv2)) {
            lfn.b(5, this.getClass().getSimpleName(), "updateForSiegeStoneHealthChanged() : Siege-Stone Not Found!!!");
            assert (false);
            return null;
        }
        ban ban2 = this.cHf.get(ldv2);
        return ban2.cm(f) ? ban2 : null;
    }

    ban gf(ldv ldv2) {
        if (!this.cHf.containsKey(ldv2)) {
            lfn.b(5, this.getClass().getSimpleName(), "updateForSiegeStoneDestroyed() : Siege-Stone Not Found!!!");
            assert (false);
            return null;
        }
        return this.cHf.remove(ldv2);
    }

    boolean o(bao bao2) {
        if (this.cHg.contains(bao2)) {
            lfn.b(5, this.getClass().getSimpleName(), "updateForMercenaryJoined() : Mercenary Already Exists!!!");
            assert (false);
            return false;
        }
        if (!this.ade.equals(bao2.g(bbc.cPP))) {
            lfn.b(5, this.getClass().getSimpleName(), "updateForMerceanryJoined() : Incorrect Employer!!!");
            assert (false);
            return false;
        }
        this.cHg.add(bao2);
        return true;
    }

    boolean p(bao bao2) {
        if (!this.cHg.contains(bao2)) {
            lfn.b(5, this.getClass().getSimpleName(), "updateForMercenaryLeft() : Mercenary Not Found!!!");
            assert (false);
            return false;
        }
        return this.cHg.remove(bao2);
    }

    azv aiJ() {
        if (this.cHh == null) {
            this.cHh = new azv();
            this.cHh.setGUID(this.ade);
            this.cHh.ax(0.0);
            this.cHh.ay(0.0);
        }
        azw[] azwArray = new azw[this.cHf.size()];
        int n = 0;
        for (ban ban2 : this.cHf.values()) {
            azwArray[n++] = ban2.aew();
        }
        this.cHh.jy(this.cHe);
        this.cHh.a(azwArray);
        return this.cHh;
    }
}

