/*
 * Decompiled with CFR.
 */
public class azv {
    private ldv GUID = null;
    private double aEn = 0.0;
    private double cIi = 0.0;
    private int cHe = 0;
    private azw[] cIj = null;

    public ldv getGUID() {
        return this.GUID;
    }

    void setGUID(ldv ldv2) {
        this.GUID = ldv2;
    }

    public double aff() {
        return this.aEn;
    }

    void ax(double d2) {
        this.aEn = d2;
    }

    public double afg() {
        return this.cIi;
    }

    void ay(double d2) {
        this.cIi = d2;
    }

    public int aer() {
        return this.cHe;
    }

    void jy(int n) {
        this.cHe = n;
    }

    public azw[] afh() {
        return this.cIj;
    }

    void a(azw[] azwArray) {
        this.cIj = azwArray;
    }

    azv() {
    }

    public double D(ldz ldz2) {
        double d2 = this.aEn - (ldz2.rgz - this.cIi);
        return d2 < 0.0 ? 0.0 : d2;
    }

    public azw fu(ldv ldv2) {
        for (azw azw2 : this.cIj) {
            if (!azw2.getGUID().equals(ldv2)) continue;
            return azw2;
        }
        return null;
    }

    public boolean jz(int n) {
        if (this.cHe == n) {
            return false;
        }
        this.cHe = n;
        return true;
    }

    public boolean g(double d2, double d3) {
        if (this.aEn == d2 && this.cIi == d3) {
            return false;
        }
        this.aEn = d2;
        this.cIi = d3;
        return true;
    }

    public boolean a(azw azw2) {
        if (azw2 == null) {
            lfn.b(5, "SFClanConquestChallengeClientAttackerValues", "updateForSiegeStonePlaced() : SiegeStone is Null!!!");
            assert (false);
            return false;
        }
        boolean bl = false;
        for (int i = 0; i < this.cIj.length; ++i) {
            if (!this.cIj[i].getGUID().equals(azw2.getGUID())) continue;
            bl = true;
            break;
        }
        if (bl) {
            lfn.b(5, "SFClanConquestChallengeClientAttackerValues", "updateForSiegeStonePlaced() : SiegeStone Already Exists!!!");
            return false;
        }
        azw[] azwArray = new azw[this.cIj.length + 1];
        for (int i = 0; i < this.cIj.length; ++i) {
            azwArray[i] = this.cIj[i];
        }
        azwArray[azwArray.length - 1] = azw2;
        this.cIj = azwArray;
        return true;
    }

    public boolean e(ldv ldv2, float f) {
        if (ldv2 == null) {
            lfn.b(5, "SFClanConquestChallengeClientAttackerValues", "updateForSiegeStoneHealthChanged() : SiegeStoneGUID is Null!!!");
            assert (false);
            return false;
        }
        boolean bl = false;
        boolean bl2 = false;
        for (int i = 0; i < this.cIj.length; ++i) {
            if (!this.cIj[i].getGUID().equals(ldv2)) continue;
            bl = true;
            bl2 = this.cIj[i].cm(f);
            break;
        }
        if (!bl) {
            lfn.b(5, "SFClanConquestChallengeClientAttackerValues", "updateForSiegeStoneHealthChanged() : SiegeStone Does Not Exist!!!");
            assert (false);
            return false;
        }
        return bl2;
    }

    public boolean fv(ldv ldv2) {
        if (ldv2 == null) {
            lfn.b(5, "SFClanConquestChallengeClientAttackerValues", "updateForSiegeStoneDestroyed() : SiegeStoneGUID is Null!!!");
            assert (false);
            return false;
        }
        azw azw2 = null;
        for (int i = 0; i < this.cIj.length; ++i) {
            if (!this.cIj[i].getGUID().equals(ldv2)) continue;
            azw2 = this.cIj[i];
            break;
        }
        if (azw2 == null) {
            lfn.b(5, "SFClanConquestChallengeClientAttackerValues", "updateForSiegeStoneDestroyed() : SiegeStone Does Not Exist!!!");
            assert (false);
            return false;
        }
        azw[] azwArray = new azw[this.cIj.length - 1];
        int n = 0;
        for (int i = 0; i < this.cIj.length; ++i) {
            if (this.cIj[i] == azw2) continue;
            azwArray[n++] = this.cIj[i];
        }
        this.cIj = azwArray;
        return true;
    }
}

