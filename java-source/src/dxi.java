/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class dxi
extends btk {
    private HashMap<ldv, dxg> hmZ = (HashMap)lcn.emw();
    private lid<dxg> PV = new lid();
    private ldw gZO = null;

    public void doTick(ldz ldz2) {
        if (this.PV.isEmpty()) {
            return;
        }
        List<dxg> list = this.PV.eh(ldz2.rgz);
        if (list == null) {
            return;
        }
        for (dxg dxg2 : list) {
            dxg2.CT(dxg2.bEc() + 1);
            if (dxg2.bEb()) {
                this.a(dxg2);
                continue;
            }
            if (dxg2.bjy() == 0) {
                this.hmZ.remove(dxg2.getGUID());
                this.i(dxg2.oq(), dxg2.getGUID(), dxg2.bEc());
                continue;
            }
            this.a(dxg2);
        }
    }

    @Override
    public void initialize() {
        super.initialize();
        this.gZO = ldx.enG().fS(this.MessageDelegator.getGUID().ib(), 15);
        this.gZO.yn(false);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 4353: {
                this.a((gvm)dxq2);
                break;
            }
            case 4359: {
                this.a((gvu)dxq2);
                break;
            }
            case 4355: {
                this.a((gvr)dxq2);
                break;
            }
            case 4356: {
                this.a((gvs)dxq2);
                break;
            }
            case 11034: {
                this.b((gre)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private ldv bzv() {
        return this.gZO.bzv();
    }

    private void b(gre gre2) {
        if (this.hmZ.isEmpty()) {
            return;
        }
        ldv ldv2 = gre2.jqf;
        ArrayList<dxg> arrayList = lcn.abH(2);
        for (dxg dxg2 : this.hmZ.values()) {
            if (!dxg2.oq().equals(ldv2)) continue;
            arrayList.add(dxg2);
        }
        if (!arrayList.isEmpty()) {
            int n2 = arrayList.size();
            for (int i2 = 0; i2 < n2; ++i2) {
                dxg dxg3 = (dxg)arrayList.get(i2);
                this.O(dxg3.getGUID(), false);
            }
        }
    }

    private void a(gvm gvm2) {
        boolean bl = false;
        if (gvm2.Rs == null) {
            bl = true;
        } else if (gvm2.oV < 0.0) {
            bl = true;
        } else if (gvm2.eNV <= 0.0) {
            bl = true;
        } else if (gvm2.gdC < 0) {
            bl = true;
        }
        if (bl) {
            this.ab(gvm2.Rs, null);
            return;
        }
        ldv ldv2 = null;
        switch (gvm2.gdA) {
            case 1: {
                ldv2 = this.a(gvm2.gdA, gvm2.Rs, gvm2.oV, gvm2.eNV, 0, false);
                break;
            }
            case 2: {
                ldv2 = this.a(gvm2.gdA, gvm2.Rs, gvm2.oV, gvm2.eNV, 0, true);
                break;
            }
            case 3: {
                ldv2 = this.a(gvm2.gdA, gvm2.Rs, gvm2.oV, gvm2.eNV, 1, true);
                break;
            }
            case 4: {
                ldv2 = this.a(gvm2.gdA, gvm2.Rs, gvm2.oV, gvm2.eNV, gvm2.gdC, false);
                break;
            }
            default: {
                return;
            }
        }
        if (ldv2 == null) {
            // empty if block
        }
        this.ab(gvm2.Rs, ldv2);
    }

    private void a(gvr gvr2) {
        if (gvr2.gdA <= 0) {
            return;
        }
        if (gvr2.atv == null) {
            return;
        }
        this.O(gvr2.atv, gvr2.jsw);
    }

    private void a(gvs gvs2) {
        boolean bl = false;
        if (gvs2.atv == null) {
            bl = true;
        } else if (gvs2.Rs == null) {
            bl = true;
        } else if (gvs2.oV < 0.0) {
            bl = true;
        } else if (gvs2.eNV <= 0.0) {
            bl = true;
        } else if (gvs2.gdC < 0) {
            bl = true;
        }
        if (bl) {
            this.ab(gvs2.Rs, null);
            return;
        }
        dxg dxg2 = this.hmZ.get(gvs2.atv);
        if (dxg2 == null) {
            this.ab(gvs2.Rs, null);
            return;
        }
        ldv ldv2 = null;
        switch (dxg2.getType()) {
            case 1: {
                ldv2 = this.a(dxg2, gvs2.Rs, gvs2.oV, gvs2.eNV, 0);
                break;
            }
            case 2: {
                break;
            }
            case 3: {
                ldv2 = this.a(dxg2, gvs2.Rs, gvs2.oV, gvs2.eNV, gvs2.gdC);
                break;
            }
            case 4: {
                ldv2 = this.a(dxg2, gvs2.Rs, gvs2.oV, gvs2.eNV, gvs2.gdC);
                break;
            }
            default: {
                return;
            }
        }
        if (ldv2 == null) {
            // empty if block
        }
        this.ab(gvs2.Rs, ldv2);
    }

    private void a(gvu gvu2) {
        if (!(lcw.emW() && lcw.emX() || gvu2.jsz)) {
            assert (false) : "System should be disabled";
            return;
        }
        boolean bl = false;
        if (gvu2.atv == null) {
            bl = true;
        }
        if (gvu2.jsy <= 0.0) {
            bl = true;
        }
        if (bl) {
            this.a(gvu2.atv, false, gvu2.aO());
            return;
        }
        dxg dxg2 = this.hmZ.get(gvu2.atv);
        if (dxg2 == null) {
            this.a(gvu2.atv, false, gvu2.aO());
            return;
        }
        this.PV.b(dxg2.bEd(), dxg2);
        dxg2.by(dxg2.bjB() * gvu2.jsy);
        dxg2.ca(dxg2.aAw() + dxg2.bjB());
        this.PV.a(dxg2.bEd(), dxg2);
        this.a(gvu2.atv, true, gvu2.aO());
    }

    private void a(ldv ldv2, boolean bl, ldv ldv3) {
        gvv gvv2 = (gvv)this.MessageDelegator.h(4360, this.getGUID(), ldv3);
        gvv2.jsA = bl;
        gvv2.atv = ldv2;
        this.MessageDelegator.H(gvv2);
    }

    private ldv a(int n2, ldv ldv2, double d2, double d3, int n3, boolean bl) {
        assert (n2 > 0);
        assert (ldv2 != null);
        assert (d2 >= 0.0);
        assert (d3 > 0.0);
        assert (n3 >= 0);
        dxg dxg2 = new dxg();
        dxg2.setType(n2);
        dxg2.setGUID(this.bzv());
        dxg2.hC(ldv2);
        dxg2.o(this.MessageDelegator.arc().rgz + d2);
        dxg2.by(d3);
        dxg2.ca(dxg2.aAw() + dxg2.bjB());
        dxg2.zG(n3);
        dxg2.jL(bl);
        if (dxg2.bEb() && dxg2.bjy() == 0) {
            this.hmZ.put(dxg2.getGUID(), dxg2);
        } else {
            this.hmZ.put(dxg2.getGUID(), dxg2);
            this.PV.a(dxg2.bEd(), dxg2);
        }
        return dxg2.getGUID();
    }

    private void O(ldv ldv2, boolean bl) {
        dxg dxg2;
        assert (ldv2 != null);
        dxg dxg3 = this.hmZ.remove(ldv2);
        if (dxg3 == null) {
            return;
        }
        if (dxg3.getType() == 2 || (dxg2 = this.PV.b(dxg3.bEd(), dxg3)) == null) {
            // empty if block
        }
        if (bl) {
            double d2 = this.MessageDelegator.arc().rgz - dxg3.aAw();
            this.a(dxg3.oq(), dxg3.getGUID(), d2);
        }
    }

    private ldv a(dxg dxg2, ldv ldv2, double d2, double d3, int n2) {
        assert (dxg2 != null);
        assert (ldv2 != null);
        assert (d2 >= 0.0);
        assert (d3 > 0.0);
        assert (n2 >= 0);
        this.PV.b(dxg2.bEd(), dxg2);
        dxg2.hC(ldv2);
        dxg2.o(this.MessageDelegator.arc().rgz + d2);
        dxg2.by(d3);
        dxg2.ca(dxg2.aAw() + dxg2.bjB());
        dxg2.zG(n2);
        this.PV.a(dxg2.bEd(), dxg2);
        return dxg2.getGUID();
    }

    private void a(dxg dxg2) {
        assert (dxg2 != null);
        if (dxg2.bEb()) {
            dxg2.ca(this.MessageDelegator.arc().rgz + dxg2.bjB());
        } else {
            dxg2.ca(this.MessageDelegator.arc().rgz + dxg2.bjB());
            dxg2.zG(dxg2.bjy() - 1);
        }
        this.PV.a(dxg2.bEd(), dxg2);
        if (dxg2.bjy() > 0) {
            this.i(dxg2.oq(), dxg2.getGUID(), dxg2.bEc());
        }
    }

    private void a(ldv ldv2, ldv ldv3, double d2) {
        assert (ldv2 != null);
        assert (ldv3 != null);
        assert (d2 >= 0.0);
        gvo gvo2 = (gvo)this.MessageDelegator.h(4358, this.GUID, ldv2);
        gvo2.atv = ldv3;
        gvo2.jsv = d2;
        this.MessageDelegator.H(gvo2);
    }

    private void ab(ldv ldv2, ldv ldv3) {
        assert (ldv2 != null);
        gvn gvn2 = (gvn)this.MessageDelegator.h(4354, this.GUID, ldv2);
        gvn2.jM(true);
        gvn2.atv = ldv3;
        this.MessageDelegator.H(gvn2);
    }

    private void i(ldv ldv2, ldv ldv3, int n2) {
        assert (ldv2 != null);
        assert (ldv3 != null);
        gvt gvt2 = (gvt)this.MessageDelegator.h(4357, this.GUID, ldv2);
        gvt2.jM(true);
        gvt2.atv = ldv3;
        gvt2.hmX = n2;
        this.MessageDelegator.H(gvt2);
    }
}

