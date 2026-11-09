/*
 * Decompiled with CFR.
 */
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class azq {
    private ldv ade = null;
    private String add = null;
    private int cHe = 0;
    private Map<ldv, azr> cHf = null;
    private Set<bao> cHg = null;
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

    int aes() {
        return this.cHf.size();
    }

    Collection<azr> aet() {
        return this.cHf.values();
    }

    int aeu() {
        return this.cHg.size();
    }

    Set<bao> aev() {
        return this.cHg;
    }

    azq(ldv ldv2, String string) {
        this.ade = ldv2;
        this.add = string;
        this.cHf = lcn.emw();
        this.cHg = lcn.emx();
    }

    boolean js(int n) {
        if (this.cHe == n) {
            return false;
        }
        this.cHe = n;
        return true;
    }

    azr a(ldv ldv2, String string, int n, ljq ljq2) {
        if (this.cHf.containsKey(ldv2)) {
            lfn.b(5, this.getClass().getSimpleName(), "updateForPlacedSiegeStone() : Siege-Stone Already Exists!!!");
            assert (false);
            return null;
        }
        azr azr2 = new azr(ldv2, string, n, ljq2);
        this.cHf.put(azr2.getGUID(), azr2);
        return azr2;
    }

    azr ff(ldv ldv2) {
        if (!this.cHf.containsKey(ldv2)) {
            lfn.b(5, this.getClass().getSimpleName(), "updateForDestroyedSiegeStone() : Siege-Stone Does Not Exist!!!");
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

    public azv C(ldz ldz2) {
        if (this.cHh == null) {
            this.cHh = new azv();
            this.cHh.setGUID(this.ade);
        }
        azw[] azwArray = new azw[this.cHf.size()];
        int n = 0;
        for (azr azr2 : this.cHf.values()) {
            azwArray[n++] = azr2.aew();
        }
        this.cHh.jy(this.cHe);
        this.cHh.ax(0.0);
        this.cHh.ay(ldz2.rgz);
        this.cHh.a(azwArray);
        return this.cHh;
    }
}

