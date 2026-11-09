/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.List;

public class hjy {
    private final lha<dxq, dxq> cdh;
    private final hec kBl;
    private ldv ec;
    private List<hem> kvT = lcn.emv();
    private final lbi<ffl> kBm = new lbi<ffl>(this){
        final /* synthetic */ hjy kBn;
        {
            this.kBn = hjy2;
        }

        public void b(ffl ffl2) {
            hjy.a(this.kBn, ffl2);
        }

        public /* synthetic */ void m(Object object) {
            this.b((ffl)object);
        }
    };

    public hjy(hec hec2, lha<dxq, dxq> lha2) {
        this.kBl = hec2;
        this.cdh = lha2;
        this.cdh.rex.a(true, ffl.class, this.kBm);
    }

    public void dispose() {
        if (!this.kvT.isEmpty()) {
            this.Nb(-1);
        }
        this.cdh.rex.a(false, ffl.class, this.kBm);
    }

    private void a(ffl ffl2) {
        if (this.kBl.cbO() == null || this.kBl.cbO().jZs.cdi() || !this.kvT.isEmpty()) {
            ffm ffm2 = (ffm)this.cdh.rng.ik(2578);
            ffm2.f(ffl2.amk());
            ffm2.on(ffl2.aO());
            ffm2.eOO = null;
            this.cdh.rnh.m(ffm2);
            return;
        }
        for (int i = 0; i < ffl2.iLb.length; ++i) {
            hem hem2 = new hem(ffl2, i);
            this.kvT.add(hem2);
        }
        this.ec = ffl2.aO();
        this.kBl.cbO().jZs.cdk();
    }

    public int coE() {
        return this.kvT.size();
    }

    public hem Na(int n) {
        return this.kvT.get(n);
    }

    public hem coF() {
        for (hem hem2 : this.kvT) {
            if (!hem2.kep) continue;
            return hem2;
        }
        assert (false);
        return null;
    }

    public void Nb(int n) {
        if (this.ec == null) {
            lfn.b(5, "SFManagerForTeleportationChamber", "citySelected(): No current request");
            return;
        }
        ffm ffm2 = (ffm)this.cdh.rng.ik(2578);
        ffm2.f(lcr.acL);
        ffm2.on(this.ec);
        ffm2.eOO = n < 0 || n >= this.coE() ? null : this.Na((int)n).Name;
        this.cdh.rnh.m(ffm2);
        this.kvT.clear();
        this.ec = null;
    }

    static /* synthetic */ void a(hjy hjy2, ffl ffl2) {
        hjy2.a(ffl2);
    }
}

