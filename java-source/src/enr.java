/*
 * Decompiled with CFR.
 */
public class enr
extends emr
implements dxu {
    private int aqs = -1;
    private ldv ade = null;
    private String add = null;
    private bcq ivL = null;
    private bay[] ivM = null;

    @Override
    public int aVk() {
        return this.aqs;
    }

    @Override
    public void sk(int n) {
        this.aqs = n;
    }

    public ldv iG() {
        return this.ade;
    }

    public void ch(ldv ldv2) {
        this.ade = ldv2;
    }

    public ldv bJD() {
        return this.ivL.iG();
    }

    public String iV() {
        return this.add;
    }

    public void cD(String string) {
        this.add = string;
    }

    public String bJE() {
        return this.ivL.iV();
    }

    public bcq bJF() {
        return this.ivL;
    }

    public void i(bcq bcq2) {
        this.ivL = bcq2;
    }

    public boolean bJG() {
        return this.ivM != null && this.ivM.length > 0;
    }

    public boolean pb(ldv ldv2) {
        if (!this.bJG()) {
            return false;
        }
        for (int i = 0; i < this.ivM.length; ++i) {
            if (!this.ivM[i].afl().equals(ldv2)) continue;
            return this.ivM[i].ajm().afQ();
        }
        return false;
    }

    public bay pc(ldv ldv2) {
        if (ldv2 == null) {
            lfn.b(0, "SFClanPoliticsTowardsClanResponseMessage", "getClanToClanConquestStateForHolding() HoldingGUID IS NULL");
            return null;
        }
        if (!this.bJG()) {
            return null;
        }
        for (int i = 0; i < this.ivM.length; ++i) {
            if (!this.ivM[i].afl().equals(ldv2)) continue;
            return this.ivM[i];
        }
        return null;
    }

    public void a(bay[] bayArray) {
        this.ivM = bayArray;
    }

    public boolean bJH() {
        if (!this.bJG()) {
            return false;
        }
        for (int i = 0; i < this.ivM.length; ++i) {
            if (this.ivM[i].ajm() != bab.cIP) continue;
            return true;
        }
        return false;
    }

    enr() {
        super(13900);
    }
}

