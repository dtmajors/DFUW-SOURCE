/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcw
 */
import java.util.ArrayList;

public class cal
extends btk {
    private static final boolean dtQ = false;
    private dsx ehr = null;
    private ArrayList<a> ehs;

    public final void a(ldv ldv2, boolean bl, int n, String string, boolean bl2) {
        assert (ldv2 != null);
        assert (string != null);
        dzx dzx2 = (dzx)this.MessageDelegator.h(7430, this.GUID, ldv2);
        dzx2.ijL = bl ? 1 : 1;
        dzx2.ijK = n;
        dzx2.ijM = string;
        dzx2.ijN = bl2;
        this.MessageDelegator.F(dzx2);
    }

    public void a(ldv ldv2, ldv ldv3, ldv ldv4, int n, eh eh2, double d2) {
        assert (ldv2 != null);
        assert (ldv3 != null);
        assert (ldv4 != null);
        assert (n >= 0);
        assert (eh2 != null);
        if (d2 > 0.0) {
            a a2 = new a(this, null);
            a2.eht = this.MessageDelegator.arc().rgz + d2;
            a2.ehu = true;
            a2.doP = ldv2;
            a2.ehv = ldv3;
            a2.ehw = ldv4;
            a2.bhh = n;
            a2.ehx = eh2;
            a2.Name = eh2.getName();
            this.a(a2);
            return;
        }
        if (this.ehs != null && !this.ehs.isEmpty()) {
            int n2 = 0;
            while (n2 < this.ehs.size()) {
                a a3 = this.ehs.get(n2);
                if (!a3.Name.equals(eh2.getName())) {
                    ++n2;
                    continue;
                }
                if (a3.ehu) {
                    this.ehs.remove(n2);
                    continue;
                }
                this.ehs.remove(n2);
                this.ehr.nT(a3.doP);
            }
        }
        dti dti2 = new dti();
        dti2.gqN = 1281;
        dti2.GUID = ldv2;
        dti2.hA = ldv3;
        dti2.eSR = ldv4;
        dti2.bhI = false;
        dti2.bhh = n;
        dti2.tt = eh2.getFrameName();
        dti2.bhi = eh2.fb();
        dti2.bhj = eh2.getRotation();
        dti2.bhk = false;
        this.ehr.a(dti2);
    }

    @Override
    public final void initialize() {
        super.initialize();
        if (lcw.enb()) {
            ldv ldv2 = lcr.ak((ldv)lcr.qCe, (int)this.GUID.ib());
            this.ehr = (dsx)this.MessageDelegator.bzx().bzt().d(ldv2);
        } else if (lcw.eng()) {
            this.ehr = new dsx();
            this.ehr.setGUID(this.MessageDelegator.bzv());
            this.MessageDelegator.a(this.ehr);
        } else {
            assert (lcr.qCe.ib() == this.GUID.ib()) : "NODES NOT THE SAME!";
            this.ehr = (dsx)this.MessageDelegator.bzx().bzt().d(lcr.qCe);
        }
    }

    public final void r(ldv ldv2, String string) {
        assert (ldv2 != null);
        fub fub2 = (fub)this.MessageDelegator.h(1027, this.GUID, ldv2);
        this.MessageDelegator.F(fub2);
    }

    public void a(ldv ldv2, ldv ldv3, ldv ldv4, String string, double d2) {
        if (d2 > 0.0) {
            a a2 = new a(this, null);
            a2.eht = this.MessageDelegator.arc().rgz + d2;
            a2.ehu = false;
            a2.doP = ldv2;
            a2.ehv = ldv3;
            a2.ehw = ldv4;
            a2.Name = string;
            this.a(a2);
            return;
        }
        if (this.ehs != null && !this.ehs.isEmpty()) {
            int n = 0;
            while (n < this.ehs.size()) {
                a a3 = this.ehs.get(n);
                if (!a3.Name.equals(string)) {
                    ++n;
                    continue;
                }
                if (a3.ehu) {
                    this.ehs.remove(n);
                    continue;
                }
                this.ehs.remove(n);
                this.ehr.nT(a3.doP);
            }
        }
        this.ehr.nT(ldv2);
    }

    public void aGh() {
        if (this.ehs == null || this.ehs.isEmpty()) {
            return;
        }
        double d2 = this.MessageDelegator.arc().rgz;
        while (!this.ehs.isEmpty() && this.ehs.get((int)0).eht <= d2) {
            a a2 = this.ehs.get(0);
            if (a2.ehu) {
                dti dti2 = new dti();
                dti2.gqN = 1281;
                dti2.GUID = a2.doP;
                dti2.hA = a2.ehv;
                dti2.eSR = a2.ehw;
                dti2.bhI = false;
                dti2.bhh = a2.bhh;
                dti2.tt = a2.ehx.getFrameName();
                dti2.bhi = a2.ehx.fb();
                dti2.bhj = a2.ehx.getRotation();
                dti2.bhk = false;
                this.ehr.a(dti2);
            } else {
                this.ehr.nT(a2.doP);
            }
            this.ehs.remove(0);
        }
    }

    private void a(a a2) {
        if (this.ehs == null) {
            this.ehs = lcn.emv();
        }
        for (int i2 = 0; i2 < this.ehs.size(); ++i2) {
            if (!(this.ehs.get((int)i2).eht > a2.eht)) continue;
            this.ehs.add(i2, a2);
            return;
        }
        this.ehs.add(a2);
    }

    public final void a(ldv ldv2, duq[] duqArray) {
        assert (ldv2 != null);
        assert (duqArray != null);
        gil gil2 = (gil)this.MessageDelegator.h(6918, this.GUID, ldv2);
        gil2.jiF = duqArray;
        this.MessageDelegator.F(gil2);
    }

    public final void a(ldv ldv2, int n, int n2, dus dus2) {
        assert (ldv2 != null);
        assert (dus2 != null);
        gim gim2 = (gim)this.MessageDelegator.h(6919, this.GUID, ldv2);
        gim2.bhh = n;
        gim2.eeC = n2;
        gim2.eeH = dus2;
        this.MessageDelegator.F(gim2);
    }

    public final void a(ldv ldv2, dut[] dutArray) {
        assert (ldv2 != null);
        assert (dutArray != null);
        gio gio2 = (gio)this.MessageDelegator.h(6917, this.GUID, ldv2);
        gio2.jiG = dutArray;
        this.MessageDelegator.F(gio2);
    }
}

