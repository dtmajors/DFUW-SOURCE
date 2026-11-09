/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  lcr
 */
import java.util.Iterator;
import java.util.List;

public class cni
extends cne {
    private List<cnk> eNY = lcn.emv();
    private bqx enm = new bqx();
    protected boolean eNZ = false;

    public cni() {
        super(true);
    }

    @Override
    public final bqv aJC() {
        return this.enm;
    }

    @Override
    public void b(bqv bqv2) {
        this.enm = (bqx)bqv2;
    }

    public void cleanUp() {
        super.cleanUp();
        if (!this.eNY.isEmpty()) {
            Iterator<cnk> iterator = this.eNY.iterator();
            while (iterator.hasNext()) {
                cnk cnk2 = iterator.next();
                this.li(cnk2.eOo);
                iterator.remove();
            }
        }
        if (this.enm != null) {
            this.MessageDelegator.hd(this.enm.getGUID());
        }
    }

    public void aUu() {
        if (!this.eNY.isEmpty()) {
            for (cnk cnk2 : this.eNY) {
                fpm fpm2 = (fpm)this.MessageDelegator.h(25864, this.getGUID(), cnk2.dzZ);
                this.MessageDelegator.E(fpm2);
            }
        }
    }

    public void sb(int n) {
        cnk cnk2;
        ldv ldv2 = this.sd(n);
        if (ldv2 != null && (cnk2 = this.lg(ldv2)) != null) {
            fpm fpm2 = (fpm)this.MessageDelegator.h(25864, this.getGUID(), cnk2.dzZ);
            this.MessageDelegator.E(fpm2);
        }
    }

    public final cnk sc(int n) {
        int n2 = this.eNY.size();
        for (int i = 0; i < n2; ++i) {
            cnk cnk2 = this.eNY.get(i);
            if (cnk2.eOo.ib() != n) continue;
            return cnk2;
        }
        return null;
    }

    public void initialize() {
        assert (this.enm != null);
        assert (this.enm.asf() != null);
        super.initialize();
        boolean bl = this.ObjectType == 116;
        this.enm.a(this);
        this.enm.setObjectType(119);
        this.enm.dW(bl);
        this.MessageDelegator.a(this.enm);
        this.g(1032, this.GUID, this.enm.getGUID());
    }

    public void receiveMessage(dxq dxq2) {
        block0 : switch (dxq2.bED()) {
            case 7936: {
                if (this.enm == null) {
                    lfn.b(5, "SFStorageObjectServer", "receiveMessage() InventoryManager is null.");
                    return;
                }
                this.enm.receiveMessage(dxq2);
                break;
            }
            default: {
                switch (dxq2.bEz()) {
                    case 9988: {
                        this.a((gnt)dxq2);
                        break block0;
                    }
                    case 4878: {
                        this.a((gbb)dxq2);
                        break block0;
                    }
                }
                super.receiveMessage(dxq2);
            }
        }
    }

    public void setScheduledForRemoval() {
        super.setScheduledForRemoval();
        if (this.enm != null) {
            this.MessageDelegator.hd(this.enm.getGUID());
        }
    }

    protected void p(cbx cbx2) {
        assert (this.enm.asf() != null);
        super.p(cbx2);
        cni cni2 = (cni)cbx2;
        cni2.aJC().b(this.enm.asf().aur());
    }

    protected final ldv sd(int n) {
        int n2 = this.eNY.size();
        for (int i = 0; i < n2; ++i) {
            cnk cnk2 = this.eNY.get(i);
            if (cnk2.dzZ.enw() != n) continue;
            return cnk2.dzZ;
        }
        return null;
    }

    protected final void aUv() {
        if (this.eNY.isEmpty()) {
            return;
        }
        int n = this.eNY.size();
        for (int i = 0; i < n; ++i) {
            cnk cnk2 = this.eNY.get(i);
            this.lh(cnk2.dzZ);
        }
    }

    private cnk lg(ldv ldv2) {
        int n = this.eNY.size();
        for (int i = 0; i < n; ++i) {
            cnk cnk2 = this.eNY.get(i);
            if (!cnk2.dzZ.equals(ldv2)) continue;
            return cnk2;
        }
        return null;
    }

    private void a(gbb gbb2) {
        cnk cnk2 = this.lg(gbb2.aO());
        if (cnk2 == null) {
            lfn.b(5, "SFStorageObjectServer", "handlePlayerSessionEndMessage() Could not find storagesession for sessionhandler " + gbb2.aO());
            return;
        }
        this.eNY.remove(cnk2);
        if (this.isScheduledForRemoval()) {
            return;
        }
        ldv ldv2 = this.i(lcr.qzp, cnk2.eOo.ib(), gbb2.aO().enw());
        switch (this.ObjectType) {
            case 108: 
            case 115: {
                ldv[] ldvArray = new ldv[]{this.GUID};
                this.b(ldv2, ldvArray, null);
                break;
            }
            case 116: {
                this.b(ldv2, new ldv[]{this.GUID}, null);
                break;
            }
            case 117: {
                this.b(ldv2, new ldv[]{this.enm.getGUID()}, this.enm.getGUID());
                break;
            }
            default: {
                lfn.b(5, "SFStorageObjectServer", "handleStorageSessionActivateMessage() Invalid objecttype found for storageobject: " + this.ObjectType);
                return;
            }
        }
    }

    private void a(gnt gnt2) {
        if (gnt2.RB <= 0) {
            lfn.b(5, "SFStorageObjectServer", "handleStorageSessionCreateRequest() ClientNodeID is invalid.");
            return;
        }
        if (gnt2.Tr == null) {
            lfn.b(5, "SFStorageObjectServer", "handleStorageSessionCreateRequest() PersistentSessionObjectGUID is null.");
            return;
        }
        if (this.eNZ) {
            this.C(gnt2.aO(), false);
            return;
        }
        cnk cnk2 = this.sc(gnt2.RB);
        if (cnk2 != null) {
            lfn.b(5, "SFStorageObjectServer", "handleStorageSessionCreateRequest() Client on node " + gnt2.RB + " already has a storagesession running with " + this.GUID);
            this.C(gnt2.aO(), false);
            return;
        }
        cnk2 = new cnk();
        cnk2.dzZ = gnt2.aO();
        cnk2.eOo = this.i(this.GUID, gnt2.RB, 0);
        this.eNY.add(cnk2);
        ldv ldv2 = this.i(lcr.qzp, gnt2.RB, gnt2.Tr.enw());
        switch (this.ObjectType) {
            case 108: 
            case 115: {
                ldv[] ldvArray = new ldv[]{this.GUID, this.enm.getGUID(), this.enm.asf().getGUID()};
                this.a(ldv2, ldvArray, null);
                break;
            }
            case 116: {
                this.a(ldv2, new ldv[]{this.GUID}, null);
                break;
            }
            case 117: {
                this.a(ldv2, new ldv[]{this.enm.getGUID()}, this.enm.getGUID());
                break;
            }
            default: {
                lfn.b(5, "SFStorageObjectServer", "handleStorageSessionCreateRequest() Invalid objecttype found for storageobject: " + this.ObjectType);
                return;
            }
        }
        this.C(gnt2.aO(), true);
    }

    private void lh(ldv ldv2) {
        assert (ldv2 != null);
        gns gns2 = (gns)this.MessageDelegator.h(9990, this.GUID, ldv2);
        this.MessageDelegator.F(gns2);
    }

    private void C(ldv ldv2, boolean bl) {
        assert (ldv2 != null);
        gnu gnu2 = (gnu)this.MessageDelegator.h(9989, this.GUID, ldv2);
        gnu2.jns = bl;
        this.MessageDelegator.F(gnu2);
    }

    private void li(ldv ldv2) {
        assert (ldv2 != null);
        gnv gnv2 = (gnv)this.MessageDelegator.h(9986, this.GUID, ldv2);
        this.MessageDelegator.F(gnv2);
    }

    private void a(ldv ldv2, ldv[] ldvArray, ldv ldv3) {
        assert (ldv2 != null);
        assert (ldvArray != null);
        goa goa2 = (goa)this.MessageDelegator.h(21762, this.GUID, lcr.qAJ);
        goa2.adA = ldv2;
        goa2.jnv = ldvArray;
        goa2.adB = ldv3;
        goa2.adG = false;
        this.MessageDelegator.F(goa2);
    }

    private void b(ldv ldv2, ldv[] ldvArray, ldv ldv3) {
        assert (ldv2 != null);
        assert (ldvArray != null);
        goh goh2 = (goh)this.MessageDelegator.h(21764, this.GUID, lcr.qAJ);
        goh2.adA = ldv2;
        goh2.jnv = ldvArray;
        goh2.jnQ = ldv3;
        goh2.adG = false;
        this.MessageDelegator.F(goh2);
    }
}

