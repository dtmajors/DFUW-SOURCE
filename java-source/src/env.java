/*
 * Decompiled with CFR.
 */
public class env
extends emr
implements dxu {
    private int aqs = -1;
    private ldv irM = null;
    private int ijz = hc.aaz.ordinal();
    private bdb ivS = null;
    private long ivT = -1L;
    private long ivU = -1L;
    private int ivV = 0;
    private int ivW = bdg.getDefaultSortOrder().ordinal();

    @Override
    public int aVk() {
        return this.aqs;
    }

    @Override
    public void sk(int n) {
        this.aqs = n;
    }

    public ldv bHi() {
        return this.irM;
    }

    public void oP(ldv ldv2) {
        this.irM = ldv2;
    }

    public hc bEN() {
        return hc.getAccessLevelType(this.ijz);
    }

    public void g(hc hc2) {
        this.ijz = hc2 == null ? this.ijz : hc2.ordinal();
    }

    public bdb bJK() {
        return this.ivS;
    }

    public void b(bdb bdb2) {
        this.ivS = bdb2;
    }

    public long bJL() {
        return this.ivT;
    }

    public void ad(long l2) {
        this.ivT = l2;
    }

    public long bJM() {
        return this.ivU;
    }

    public void ae(long l2) {
        this.ivU = l2;
    }

    public int bJN() {
        return this.ivV;
    }

    public void Ey(int n) {
        this.ivV = n;
    }

    public bdg bJO() {
        return bdg.getValueByOrdinal(this.ivW);
    }

    public void b(bdg bdg2) {
        this.ivW = bdg2 == null ? this.ivW : bdg2.ordinal();
    }

    env() {
        super(13919);
    }
}

