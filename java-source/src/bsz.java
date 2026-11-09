/*
 * Decompiled with CFR.
 */
public class bsz
extends bsv {
    public ljq Position = new ljq();
    public Integer dKu = new Integer(0);
    public Long dKv = new Long(0L);

    public bsz() {
        this.dKf = bsv.a.dKq;
    }

    public bsz(ljq ljq2, int n, Long l2) {
        this.dKf = bsv.a.dKq;
        this.Position = ljq2;
        this.dKu = n;
        this.dKv = l2;
    }

    public void a(lhd lhd2) {
        lhd2.acN(0);
        this.Position = lhd2.c(this.Position, 0);
        this.dKu = lhd2.c(this.dKu, 0);
        this.dKv = lhd2.c(this.dKv, 0);
    }
}

