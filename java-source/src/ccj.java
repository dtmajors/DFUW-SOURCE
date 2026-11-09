/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ccj
extends ccd {
    private String bhD = null;
    private String bhE = null;
    private ldv aDn = null;
    private ljq bhF = null;
    private float bhG = 0.0f;
    private ldv aDk = null;
    private ayb bhH = ayb.cvi;
    int elI = 0;

    public String Xt() {
        return this.bhD;
    }

    public void cz(String string) {
        if (this.bhD == null) {
            this.bhD = string;
        } else {
            if (this.bhD.equals(string)) {
                return;
            }
            this.elI |= 1;
        }
        this.fi().b(12640, this.bhD);
    }

    public String aIQ() {
        return this.bhE;
    }

    public void cA(String string) {
        if (this.bhE == null) {
            if (string == null) {
                return;
            }
            this.bhE = string;
            this.elI |= 2;
        } else {
            if (this.bhE.equals(string)) {
                return;
            }
            this.bhE = string;
            this.elI |= 2;
        }
        this.fi().b(12320, this.bhE);
    }

    public ayb Xz() {
        return this.bhH;
    }

    public void a(ayb ayb2) {
        if (this.bhH == ayb2) {
            return;
        }
        this.bhH = ayb2;
        this.elI |= 4;
    }

    public final ldv abj() {
        return this.aDn;
    }

    public final void ks(ldv ldv2) {
        this.aDn = ldv2;
        this.fi().b(12304, this.aDn);
    }

    public ljq Xv() {
        return this.bhF;
    }

    public void al(ljq ljq2) {
        assert (ljq2 != null);
        this.bhF = ljq2;
    }

    public float Xu() {
        return this.bhG;
    }

    public void X(float f2) {
        this.bhG = f2;
    }

    public ldv acm() {
        return this.aDk;
    }

    public void ci(ldv ldv2) {
        this.aDk = ldv2;
    }

    @Override
    public int ry() {
        return 3;
    }

    public List<ldv> kt(ldv ldv2) {
        Map<ldv, ldv> map = this.aIN();
        if (map.isEmpty()) {
            return null;
        }
        ArrayList<ldv> arrayList = lcn.emv();
        for (Map.Entry<ldv, ldv> entry : map.entrySet()) {
            ldv ldv3 = entry.getKey();
            ldv ldv4 = entry.getValue();
            if (ldv4 == null || !ldv4.equals(ldv2)) continue;
            arrayList.add(ldv3);
        }
        return arrayList;
    }

    public ccj() {
        super(true);
        this.oO(0);
        this.ObjectType = 100;
    }

    @Override
    protected void aII() {
        if (this.aDn == null) {
            return;
        }
        this.aIS();
    }

    @Override
    protected void aIJ() {
        if (this.aDn == null) {
            return;
        }
        this.aIS();
    }

    private void aIS() {
        assert (this.aDn != null);
        ldv[] ldvArray = new ldv[this.ekW.size()];
        ldv[] ldvArray2 = new ldv[this.ekW.size()];
        int n = 0;
        for (Map.Entry entry : this.ekW.entrySet()) {
            ldvArray[n] = (ldv)entry.getKey();
            ldvArray2[n] = (ldv)entry.getValue();
            ++n;
        }
        eif eif2 = (eif)this.MessageDelegator.h(18731, this.GUID, this.aDn);
        eif2.ci(this.aDk);
        eif2.l(ldvArray);
        eif2.m(ldvArray2);
        this.MessageDelegator.F(eif2);
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        if (this.elI != 0) {
            gyd gyd2 = (gyd)this.MessageDelegator.h(12036, this.GUID, lcr.qAI);
            gyd2.bhE = this.bhE;
            gyd2.bhD = this.bhD;
            gyd2.ctp = this.bhH.ordinal();
            gyd2.ija = this.elI;
            this.MessageDelegator.F(gyd2);
            this.elI = 0;
        }
    }

    @Override
    public void oO(int n) {
        if (this.aID() > n) {
            int n2 = this.aID() - n;
            Iterator iterator = this.ekW.keySet().iterator();
            for (int i2 = 0; iterator.hasNext() && i2 < n2; ++i2) {
                ldv ldv2 = (ldv)iterator.next();
                ebs ebs2 = (ebs)this.MessageDelegator.h(17422, this.getGUID(), ldv2);
                ebs2.ilb = ccf.elp.ordinal();
                ebs2.azF = this.bhD;
                ebs2.aDo = this.bhE;
                ebs2.ilc = null;
                ebs2.azY = this.aDk;
                ebs2.azE = this.ry();
                this.MessageDelegator.F(ebs2);
                iterator.remove();
            }
        }
        super.oO(n);
    }

    @Override
    public void a(ccf ccf2) {
        for (ldv ldv2 : this.ekW.keySet()) {
            ebs ebs2 = (ebs)this.MessageDelegator.h(17422, this.getGUID(), ldv2);
            ebs2.ilb = ccf2.ordinal();
            ebs2.azF = this.bhD;
            ebs2.aDo = this.bhE;
            ebs2.ilc = null;
            ebs2.azY = this.aDk;
            ebs2.azE = this.ry();
            this.MessageDelegator.F(ebs2);
        }
        this.ekW.clear();
    }

    @Override
    public ccf b(ldv ldv2, ccf ccf2) {
        ccf ccf3 = this.kr(ldv2);
        if (ccf3 == ccf.elu) {
            ebs ebs2 = (ebs)this.MessageDelegator.h(17422, this.getGUID(), ldv2);
            ebs2.ilb = ccf2.ordinal();
            ebs2.azF = this.bhD;
            ebs2.aDo = this.bhE;
            ebs2.ilc = null;
            ebs2.azY = this.aDk;
            ebs2.azE = this.ry();
            this.MessageDelegator.F(ebs2);
        }
        return ccf3;
    }
}

