/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  is
 *  lcr
 */
import java.util.ArrayList;
import java.util.Map;

public class ic
extends btk
implements bto {
    private static final double aeZ = 1.0;
    private final is Xb;
    private Map<Integer, Integer> afa = null;
    private double afb = 0.0;
    private static final double afc = 60.0;
    private Map<ldv, a> afd = lcn.emw();
    private led afe = new led(in.agb);

    public ic(is is2) {
        this.Xb = is2;
    }

    public void aZ(ldv ldv2) {
        if (ldv2 == null) {
            return;
        }
        if (this.afd.containsKey(ldv2)) {
            return;
        }
        a a2 = new a(this, ldv2);
        this.afd.put(a2.adA, a2);
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.afd.isEmpty()) {
            return;
        }
        for (a a2 : this.afd.values()) {
            if (a2.aff == null || a2.afg + 1.0 >= ldz2.rgz) continue;
            this.afe.b(a2.adA, a2.aff.av());
            a2.afg = ldz2.rgz + 1.0;
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11056: {
                this.a((gsx)dxq2);
                break;
            }
            case 13060: {
                this.a((glf)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    public void ba(ldv ldv2) {
        if (ldv2 == null) {
            return;
        }
        a a2 = this.afd.remove(ldv2);
        if (a2 == null) {
            return;
        }
        if (a2.aff != null) {
            this.afe.remove(a2.adA);
        }
    }

    private void a(glf glf2) {
        if (glf2.aUa == null) {
            return;
        }
        if (glf2.jkO == null) {
            return;
        }
        ldv ldv2 = glf2.jkO.gfs;
        ljq ljq2 = glf2.jkO.aZD;
        ArrayList arrayList = lcn.emv();
        this.afe.a(ljq2, arrayList);
        if (arrayList == null) {
            return;
        }
        int n = arrayList.size();
        for (int j = 0; j < n; ++j) {
            ldv ldv3 = (ldv)arrayList.get(j);
            a a2 = this.afd.get(ldv3);
            if (a2.aff == null) {
                assert (false);
                continue;
            }
            if (ldv2 != null && ldv2.equals(a2.adA)) continue;
            ldv ldv4 = lcr.p((ldv)lcr.qEa, (int)a2.adA.ib(), (int)a2.aff.getGUID().enw());
            this.a(ldv4, glf2.aUa, glf2.jkO);
        }
    }

    private void a(gsx gsx2) {
        ik ik2 = this.Xb.agp.bp(gsx2.aO().bFk());
        if (ik2 == null) {
            return;
        }
        if (!(ik2 instanceof ii)) {
            return;
        }
        a a2 = this.afd.get(ik2.GUID);
        if (a2 == null) {
            return;
        }
        if (gsx2.gYM) {
            assert (a2.aff == null);
            a2.aff = (bvr)this.MessageDelegator.bzx().bzt().d(gsx2.aO());
            this.afe.a(a2.adA, a2.aff.av());
        } else {
            assert (a2.aff != null);
            a2.aff = null;
            this.afe.remove(a2.adA);
        }
    }

    private void a(ldv ldv2, ldv ldv3, dek dek2) {
        assert (ldv2 != null);
        assert (ldv3 != null);
        assert (dek2 != null);
        gli gli2 = (gli)this.MessageDelegator.h(13062, this.GUID, ldv2);
        gli2.aUa = ldv3;
        gli2.jkO = dek2;
        this.MessageDelegator.F(gli2);
    }
}

