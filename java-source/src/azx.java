/*
 * Decompiled with CFR.
 */
public class azx {
    private ldv cIl = null;
    private ldv aEF = null;
    private float cIm = 0.0f;
    private float cIn = 0.0f;
    private int cIo = 0;
    private azv[] cIp = null;

    public ldv afk() {
        return this.cIl;
    }

    void fw(ldv ldv2) {
        this.cIl = ldv2;
    }

    public ldv afl() {
        return this.aEF;
    }

    void fx(ldv ldv2) {
        this.aEF = ldv2;
    }

    public float afm() {
        return this.cIm;
    }

    void cn(float f) {
        this.cIm = f;
    }

    public float afn() {
        return this.cIn;
    }

    void co(float f) {
        this.cIn = f;
    }

    public int afo() {
        return this.cIo < 0 ? 0 : this.cIo;
    }

    void jA(int n) {
        this.cIo = n;
    }

    public azv[] afp() {
        return this.cIp;
    }

    void a(azv[] azvArray) {
        this.cIp = azvArray;
    }

    public int afq() {
        int n = 0;
        for (azv azv2 : this.cIp) {
            if (azv2.aer() <= n) continue;
            n = azv2.aer();
        }
        return n;
    }

    public boolean fy(ldv ldv2) {
        for (int i = 0; i < this.cIp.length; ++i) {
            if (!this.cIp[i].getGUID().equals(ldv2)) continue;
            return true;
        }
        return false;
    }

    public azv fz(ldv ldv2) {
        for (int i = 0; i < this.cIp.length; ++i) {
            if (!this.cIp[i].getGUID().equals(ldv2)) continue;
            return this.cIp[i];
        }
        return null;
    }

    azx() {
    }

    public boolean jB(int n) {
        if (n < 0) {
            lfn.b(5, "SFClanConquestChallengeClientValues", "updateWallDestructionTarget() : New Target Value is Negative!!!");
            assert (false);
            return false;
        }
        if (this.cIo == n) {
            return false;
        }
        this.cIo = n;
        return true;
    }

    public boolean n(float f, float f2) {
        if (this.cIn == f && this.cIm == f2) {
            return false;
        }
        this.cIn = f;
        this.cIm = f2;
        return true;
    }

    public boolean a(azv azv2) {
        if (azv2 == null) {
            lfn.b(5, "SFClanConquestChallengeClientValues", "updateForAttackerJoined() : Attacker is Null!!!");
            assert (false);
            return false;
        }
        boolean bl = false;
        for (int i = 0; i < this.cIp.length; ++i) {
            if (!this.cIp[i].getGUID().equals(azv2.getGUID())) continue;
            bl = true;
            break;
        }
        if (bl) {
            lfn.b(5, "SFClanConquestChallengeClientValues", "updateForAttackerJoined() : Attacker Already Exists in the Challenge!!!");
            assert (false);
            return false;
        }
        azv[] azvArray = new azv[this.cIp.length + 1];
        for (int i = 0; i < this.cIp.length; ++i) {
            azvArray[i] = this.cIp[i];
        }
        azvArray[azvArray.length - 1] = azv2;
        this.cIp = azvArray;
        return true;
    }

    public boolean fA(ldv ldv2) {
        if (ldv2 == null) {
            lfn.b(5, "SFClanConquestChallengeClientValues", "updateForAttackerRemoved() : RemovedAttackerGUID is Null!!!");
            assert (false);
            return false;
        }
        azv azv2 = null;
        for (int i = 0; i < this.cIp.length; ++i) {
            if (!this.cIp[i].getGUID().equals(ldv2)) continue;
            azv2 = this.cIp[i];
            break;
        }
        if (azv2 == null) {
            lfn.b(5, "SFClanConquestChallengeClientValues", "updateForAttackerRemoved() : Attacker Does Not Exist in the Challenge!!!");
            assert (false);
            return false;
        }
        azv[] azvArray = new azv[this.cIp.length - 1];
        int n = 0;
        for (int i = 0; i < this.cIp.length; ++i) {
            if (this.cIp[i] == azv2) continue;
            azvArray[n++] = this.cIp[i];
        }
        this.cIp = azvArray;
        return true;
    }

    public boolean A(ldv ldv2, int n) {
        if (ldv2 == null) {
            lfn.b(5, "SFClanConquestChallengeClientValues", "updateForAttackerScoreChanged() : AttackerGUID is Null!!!");
            assert (false);
            return false;
        }
        boolean bl = false;
        boolean bl2 = false;
        for (int i = 0; i < this.cIp.length; ++i) {
            if (!this.cIp[i].getGUID().equals(ldv2)) continue;
            bl = true;
            bl2 = this.cIp[i].jz(n);
            break;
        }
        if (!bl) {
            lfn.b(5, "SFClanConquestChallengeClientValues", "updateForAttackerScoreChanged() : Attacker Does Not Exist in the Challenge!!!");
            assert (false);
            return false;
        }
        return bl2;
    }

    public boolean a(ldv ldv2, azw azw2) {
        if (ldv2 == null) {
            lfn.b(5, "SFClanConquestChallengeClientValues", "updateForAttackerSiegeStonePlaced() : AttackerGUID is Null!!!");
            assert (false);
            return false;
        }
        if (azw2 == null) {
            lfn.b(5, "SFClanConquestChallengeClientValues", "updateForAttackerSiegeStonePlaced() : SiegeStone is Null!!!");
            assert (false);
            return false;
        }
        boolean bl = false;
        boolean bl2 = false;
        for (int i = 0; i < this.cIp.length; ++i) {
            if (!this.cIp[i].getGUID().equals(ldv2)) continue;
            bl = true;
            bl2 = this.cIp[i].a(azw2);
            break;
        }
        if (!bl) {
            lfn.b(5, "SFClanConquestChallengeClientValues", "updateForAttackerSiegeStonePlaced() : Attacker Does Not Exist in the Challenge!!!");
            assert (false);
            return false;
        }
        return bl2;
    }

    public boolean q(ldv ldv2, ldv ldv3) {
        if (ldv2 == null) {
            lfn.b(5, "SFClanConquestChallengeClientValues", "updateForAttackerSiegeStoneDestroyed() : AttackerGUID is Null!!!");
            assert (false);
            return false;
        }
        if (ldv3 == null) {
            lfn.b(5, "SFClanConquestChallengeClientValues", "updateForAttackerSiegeStoneDestroyed() : SiegeStoneGUID is Null!!!");
            assert (false);
            return false;
        }
        boolean bl = false;
        boolean bl2 = false;
        for (int i = 0; i < this.cIp.length; ++i) {
            if (!this.cIp[i].getGUID().equals(ldv2)) continue;
            bl = true;
            bl2 = this.cIp[i].fv(ldv3);
            break;
        }
        if (!bl) {
            lfn.b(5, "SFClanConquestChallengeClientValues", "updateForAttackerSiegeStoneDestroyed() : Attacker Does Not Exist in the Challenge!!!");
            assert (false);
            return false;
        }
        return bl2;
    }

    public boolean a(ldv ldv2, ldv ldv3, float f) {
        if (ldv2 == null) {
            lfn.b(5, "SFClanConquestChallengeClientValues", "updateForAttackerSiegeStoneHealthChanged() : AttackerGUID is Null!!!");
            assert (false);
            return false;
        }
        if (ldv3 == null) {
            lfn.b(5, "SFClanConquestChallengeClientValues", "updateForAttackerSiegeStoneHealthChanged() : SiegeStoneGUID is Null!!!");
            assert (false);
            return false;
        }
        boolean bl = false;
        boolean bl2 = false;
        for (int i = 0; i < this.cIp.length; ++i) {
            if (!this.cIp[i].getGUID().equals(ldv2)) continue;
            bl = true;
            bl2 = this.cIp[i].e(ldv3, f);
            break;
        }
        if (!bl) {
            lfn.b(5, "SFClanConquestChallengeClientValues", "updateForAttackerSiegeStoneHealthChanged() : Attacker Does Not Exist in the Challenge!!!");
            assert (false);
            return false;
        }
        return bl2;
    }

    public boolean a(ldv ldv2, double d2, double d3) {
        if (ldv2 == null) {
            lfn.b(5, "SFClanConquestChallengeClientValues", "updateForAttackerSiegeStonePlacementTimerChanged() : AttackerGUID is Null!!!");
            assert (false);
            return false;
        }
        boolean bl = false;
        boolean bl2 = false;
        for (int i = 0; i < this.cIp.length; ++i) {
            if (!this.cIp[i].getGUID().equals(ldv2)) continue;
            bl = true;
            bl2 = this.cIp[i].g(d2, d3);
            break;
        }
        if (!bl) {
            lfn.b(5, "SFClanConquestChallengeClientValues", "updateForAttackerSiegeStonePlacementTimerChanged() : Attacker Does Not Exist in the Challenge!!!");
            assert (false);
            return false;
        }
        return bl2;
    }
}

