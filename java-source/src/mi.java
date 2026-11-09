/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  mo
 */
import java.sql.Timestamp;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class mi
extends mj {
    final mo ZF;
    protected ldv ayy;
    protected ldv ayz;
    protected ldv ayA;
    protected String ayB;
    protected boolean ayC;
    protected boolean ayD;
    protected boolean RestartIfFailed;
    protected boolean ayE;
    protected dud ayF;
    protected Map<Integer, mk> ayG;
    private boolean ayH;
    private List<dub> ayI;

    public mi(int n, ldv ldv2, ldv ldv3, String string, int n2, int n3, mo mo2, Timestamp timestamp) {
        super(n, n2, n3, mq.azr, timestamp);
        this.ZF = mo2;
        this.ayy = ldv2;
        this.ayz = ldv3;
        this.ayB = string;
        dty dty2 = lea.eoU().Cf(n2);
        if (dty2 == null) {
            assert (false);
            return;
        }
        this.ayC = dty2.qU();
        this.ayE = dty2.RestartIfCancelled;
        this.RestartIfFailed = dty2.RestartIfFailed;
        due due2 = dty2.Ce(n3);
        if (due2 == null) {
            assert (false);
            return;
        }
        this.a(due2);
    }

    public void cG(int n) {
        assert (n > this.ayL);
        this.ayL = n;
        dty dty2 = lea.eoU().Cf(this.ayK);
        if (dty2 == null) {
            assert (false);
            return;
        }
        due due2 = dty2.Ce(this.ayL);
        if (due2 == null) {
            assert (false);
            return;
        }
        this.a(due2);
    }

    private void a(due due2) {
        if (this.ayG != null) {
            this.ayG.clear();
            this.ayG = null;
        }
        if (this.ayI != null) {
            this.ayI.clear();
            this.ayI = null;
        }
        this.ayF = due2.Type;
        this.ayD = due2.SurvivalMode;
        if (this.ayF == dud.hdQ) {
            this.ayH = due2.LinkedSpawnpoints;
            this.ayI = due2.bAX();
        }
    }

    public boolean c(int n, int n2, int n3) {
        Integer n4;
        if (this.ayG == null) {
            this.ayG = lcn.emw();
        }
        if (this.ayG.containsKey(n4 = Integer.valueOf(n))) {
            return false;
        }
        this.ayG.put(n4, new mk(n2, n, 0, n3));
        return true;
    }

    public boolean cH(int n) {
        if (this.ayG == null || this.ayG.isEmpty()) {
            return false;
        }
        return this.ayG.remove(n) != null;
    }

    public boolean cI(int n) {
        if (this.ayG == null || this.ayG.isEmpty()) {
            return false;
        }
        for (int n2 : this.ayG.keySet()) {
            if (!lea.enW().isDescendant(n, n2)) continue;
            return true;
        }
        return false;
    }

    public Collection<mk> qF() {
        return this.ayG.values();
    }

    public boolean a(int n, int n2, int n3, boolean bl, ljq ljq2) {
        boolean bl2;
        if (this.ayG == null || this.ayG.isEmpty()) {
            return false;
        }
        boolean bl3 = bl2 = !this.ayH || this.ayI == null;
        if (this.ayH && this.ayI != null) {
            for (dub dub2 : this.ayI) {
                if (!ljq.b(ljq2, dub2.Radius, dub2.Position)) continue;
                bl2 = true;
                break;
            }
        }
        if (!bl2) {
            return false;
        }
        boolean bl4 = false;
        boolean bl5 = this.ayC || this.ayF == dud.hdP;
        for (mk mk2 : this.ayG.values()) {
            bl4 = bl4 || mk2.a(n, n2, n3, bl, bl5);
        }
        return bl4;
    }

    public void bU(ldv ldv2) {
        this.ayA = ldv2;
    }

    public ldv qG() {
        return this.ayA;
    }

    public final ldv qH() {
        return this.ayy;
    }

    public final ldv qI() {
        return this.ayz;
    }

    @Override
    public String toString() {
        return super.toString() + " Vendor : " + this.ayB;
    }

    @Override
    public om qJ() {
        on[] onArray = null;
        if (this.ayG != null && !this.ayG.isEmpty()) {
            onArray = new on[this.ayG.size()];
            int n = 0;
            for (mk mk2 : this.ayG.values()) {
                onArray[n] = new on(mk2.pa(), mk2.ayN);
                ++n;
            }
        }
        om om2 = new om();
        om2.SN = this.ZF.hF.getGUID().enw();
        om2.aGe = this.qN();
        om2.aGa = this.ayJ.name();
        om2.ayK = this.ayK;
        om2.aGb = this.qM();
        om2.aGc = this.ayL;
        om2.ayB = this.ayB;
        om2.aGd = onArray;
        om2.azi = 0L;
        return om2;
    }
}

