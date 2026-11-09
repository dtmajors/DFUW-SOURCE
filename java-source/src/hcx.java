/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
import java.util.Arrays;
import java.util.List;

public class hcx
extends hog {
    protected final hde jJQ;
    protected final int jJR = 20;
    protected final int jJS = 10;
    protected final int jJT = 140;
    protected final List<String> jJU = Arrays.asList("MarkersQuest", "MarkersBindstone", "MarkersGreaterstone", "MarkersChaosstone", "MarkersAnnotation", "MarkersConquest", "MarkersPartyPlayer", "MarkersPartyWaypoint", "MarkersVendor", "MarkersCity", "MarkersHousing", "MarkersControlPoints", "MarkersTradeRoute", "MarkersFortress", "MarkersPlayers", "MarkersSiegestone", "MarkersPlayerDeployedObjects", "MarkersFunFlags");
    private boolean Initialized;

    public hcx(hdm hdm2, String string, lgg lgg2, int n, hde hde2) {
        this(hdm2, string, lgg2, n, hdm2.kKl, hde2);
    }

    private hcx(hdm hdm2, String string, lgg lgg2, int n, hog.a a2, hde hde2) {
        super((hnc)hdm2, string, lgg2, new lhf(n, 1000), a2);
        this.jJQ = hde2;
        int n2 = a2.kRX.cf;
        int n3 = a2.kRX.cg;
        int n4 = this.getWidth() - (n2 * 2 + 140 + a2.kRY.cf);
        int n5 = n2;
        int n6 = n3;
        for (String string2 : this.jJU) {
            lnl<hde.b> lnl2 = hde2.mm(string2);
            hqe<hde.b> hqe2 = new hqe<hde.b>(this.kLu, null, new lgg(n5, n6), new lhf(140, 20), hdm2.kKH, hdm2.kKE, 200, lnl2);
            this.j(hqe2);
            hpe hpe2 = new hpe(this.kLu, null, new lgg(n5 += hqe2.getWidth() + a2.kRY.cf, n6), new lhf(n4, 20), hdm2.kIT, hde2.mn(string2));
            this.j(hpe2);
            n5 = n2;
            n6 += 30;
        }
        this.cC(n, (n6 -= 30) + n3);
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        this.Initialized = true;
        super.FF();
        this.mU(true);
        this.ccu();
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void ccd() {
        super.ccd();
        this.ccu();
    }

    private void ccu() {
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }
}

