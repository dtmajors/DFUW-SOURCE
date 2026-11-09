/*
 * Decompiled with CFR.
 */
import java.util.List;

public class hzi
extends hzk {
    protected List<lfs<ljq, Float>> lvU = lcn.emv();

    public hzi() {
        super("StartingArea", "startingarea.swf");
        this.OQ(jnz.nGv);
        this.a(hyb.lmG);
    }

    public void initialize() {
        super.initialize();
        for (List<bsv> list : fy.TH.values()) {
            for (bsv bsv2 : list) {
                bsw bsw2 = (bsw)bsv2;
                this.x(bsw2.av(), (float)Math.random());
            }
        }
    }

    public void cBa() {
        super.cBa();
        for (lfs<ljq, Float> lfs2 : this.lvU) {
            this.a("addMarker", new Object[]{Float.valueOf(lfs2.getFirst().x), Float.valueOf(lfs2.getFirst().rlV), lfs2.eqz()});
        }
    }

    protected void x(ljq ljq2, float f) {
        this.lvU.add(new lfs<ljq, Float>(ljq2, Float.valueOf(f)));
        if (this.cDj()) {
            this.a("addMarker", new Object[]{Float.valueOf(ljq2.x), Float.valueOf(ljq2.rlV), Float.valueOf(f)});
        }
    }

    protected void I(int n, float f) {
        if (this.cDj()) {
            this.lvU.get((int)n).reY = Float.valueOf(f);
            this.a("updateMarker", new Object[]{n, Float.valueOf(f)});
        }
    }

    @llk
    public void markerClicked(int n) {
        boolean bl = false;
    }
}

