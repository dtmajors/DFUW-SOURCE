/*
 * Decompiled with CFR.
 */
import java.util.Collection;

public class hef
extends heg {
    private boolean kdV;
    private float kdW;

    public hef(String string, lha<dxq, dxq> lha2, hjr hjr2, hdz hdz2, hdz hdz3, bqm.b b2, lip lip2, String string2) {
        super(string, lha2, hjr2, hdz2, hdz3, b2, lip2, string2);
    }

    public final float cfq() {
        assert (this.isConstructed());
        if (!this.kdV) {
            this.cfr();
        }
        return this.kdW;
    }

    @Override
    protected void cfk() {
        super.cfk();
        this.kdV = false;
    }

    private final void cfr() {
        assert (!this.kdV);
        Collection<hdu> collection = this.cfh();
        int n = 0;
        for (hdu hdu2 : collection) {
            if (!hdu2.kaW.b(hdw.kbh)) continue;
            hdz hdz2 = (hdz)hdu2;
            n += hdz2.vf();
        }
        this.kdW = n;
        this.kdV = true;
    }
}

