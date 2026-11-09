/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dta
 */
import java.util.ArrayList;
import java.util.Iterator;

public class dth {
    private static final boolean dtQ = false;
    private final dta hcm;
    private ArrayList<dtf> hcn = lcn.abH(5);

    public dth(dta dta2) {
        this.hcm = dta2;
    }

    public void doTick(ldz ldz2) {
        if (this.hcn.isEmpty()) {
            return;
        }
        this.bAf();
    }

    public void a(fvq fvq2) {
        if (fvq2.hcg <= 0) {
            return;
        }
        if (fvq2.hch == null) {
            return;
        }
        dtf dtf2 = new dtf();
        dtf2.aqs = fvq2.aVk();
        dtf2.ec = fvq2.aO();
        dtf2.hcg = fvq2.hcg;
        dtf2.hch = fvq2.hch;
        dtf2.hci = false;
        if (this.hcn.contains(dtf2)) {
            assert (false);
            return;
        }
        this.a(dtf2);
        if (dtf2.hci) {
            this.b(dtf2);
        } else {
            this.hcn.add(dtf2);
        }
    }

    public void a(fvw fvw2) {
        if (fvw2.hch == null) {
            return;
        }
        Iterator<dtf> iterator = this.hcn.iterator();
        while (iterator.hasNext()) {
            dtf dtf2 = iterator.next();
            if (!dtf2.ec.equals(fvw2.aO()) || !dtf2.hch.equals(fvw2.hch)) continue;
            iterator.remove();
            return;
        }
    }

    private void a(dtf dtf2) {
        assert (dtf2 != null);
        assert (!dtf2.hci);
        amf amf2 = this.hcm.bzt().d(dtf2.hch);
        switch (dtf2.hcg) {
            case 1: {
                if (amf2 == null) {
                    return;
                }
                dtf2.hci = true;
                break;
            }
            case 2: {
                if (amf2 == null) {
                    return;
                }
                if (!(amf2 instanceof bvd)) {
                    assert (false);
                    return;
                }
                bvd bvd2 = (bvd)amf2;
                if (!bvd2.isReadyToRun()) break;
                dtf2.hci = true;
                break;
            }
            case 3: {
                if (amf2 != null) {
                    return;
                }
                dtf2.hci = true;
                break;
            }
            default: {
                assert (false);
                return;
            }
        }
    }

    private void bAf() {
        Iterator<dtf> iterator = this.hcn.iterator();
        while (iterator.hasNext()) {
            dtf dtf2 = iterator.next();
            this.a(dtf2);
            if (!dtf2.hci) continue;
            this.b(dtf2);
            iterator.remove();
        }
    }

    private void b(dtf dtf2) {
        assert (dtf2 != null);
        assert (dtf2.ec != null);
        assert (dtf2.hcg > 0);
        assert (dtf2.hch != null);
        assert (dtf2.hci);
        fvu fvu2 = (fvu)this.hcm.h(12294, this.hcm.getGUID(), dtf2.ec);
        fvu2.aqs = dtf2.aqs;
        fvu2.hcg = dtf2.hcg;
        fvu2.iXT = dtf2.hch;
        this.hcm.F((dxq)fvu2);
    }
}

