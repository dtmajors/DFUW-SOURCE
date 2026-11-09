/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdk
 *  hdm
 */
import java.util.List;

public class hgw
extends hgy {
    private final hdz kdD;

    public hgw(hdm hdm2, String string, lgg lgg2, hdz hdz2) {
        this(hdm2, string, lgg2, hdz2, hdz2.kaW.atw());
    }

    private hgw(hdm hdm2, String string, lgg lgg2, hdz hdz2, lhu lhu2) {
        super(hdm2, string, lgg2, hdk.jOh, hdz2, (hdw)hdz2.kaW, true, false, true, true);
        this.kdD = hdz2;
    }

    @Override
    protected void FF() {
        super.FF();
    }

    @Override
    protected void FG() {
        super.FG();
    }

    @Override
    protected void cbM() {
    }

    @Override
    protected boolean co(int n, int n2) {
        if (n > this.cqv().rmN || n2 > this.cqv().H || n < 0 || n2 < 0) {
            return false;
        }
        if (this.kaW == null) {
            return false;
        }
        if (this.kaW.atw() == null) {
            return false;
        }
        if (this.cqv().rmN == 0 || this.cqv().H == 0) {
            return false;
        }
        return !this.kaW.ck(n = (int)((float)n * (float)this.kaW.atw().kLY.rmN / (float)this.cqv().rmN), n2 = (int)((float)n2 * (float)this.kaW.atw().kLY.H / (float)this.cqv().H));
    }

    @Override
    protected void aV(List<hnt> list) {
        list.add(new hnt(this.cbO().kKo, this.kdD.cdY().esy()));
        super.aV(list);
    }
}

