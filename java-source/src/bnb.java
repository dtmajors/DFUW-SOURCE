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

public class bnb
extends bna {
    private Map<ldv, clb> dvN = lcn.emw();
    private Map<ldv, clb> dvO = lcn.emw();
    private Map<Integer, fes> dvP = lcn.emw();
    private Map<ldv, ldv> ctY = lcn.emw();
    private int bRk = 1;

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 19201: {
                this.a((fes)dxq2);
                break;
            }
            case 6146: {
                this.a((gfn)dxq2);
                break;
            }
            case 19203: {
                this.a((few)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(fes fes2) {
        assert (fes2.az() > 0);
        if (fes2.bFz() != null) assert (fes2.bFj());
        this.dvP.put(new Integer(this.bRk), fes2);
        gfm gfm2 = (gfm)this.MessageDelegator.h(6145, this.getGUID(), lcr.qCq);
        gfm2.sk(this.bRk);
        gfm2.Yc = fes2.bFz() == null ? this.GUID : fes2.bFz();
        gfm2.ResourceType = fes2.az();
        gfm2.iSi = 1;
        this.MessageDelegator.F(gfm2);
        ++this.bRk;
    }

    private void a(gfn gfn2) {
        fes fes2 = this.dvP.remove(gfn2.aVk());
        assert (fes2 != null);
        if (gfn2.dtF == null) {
            lfn.b(5, "SFGuardTowerManagerServer", "handleResourceCreateResponse() Couldn't create guardtower.");
            if (fes2.bFj()) {
                this.a(fes2, null);
            }
            return;
        }
        assert (gfn2.dtF instanceof clb);
        clb clb2 = (clb)gfn2.dtF;
        this.a(clb2, fes2);
        if (fes2.bFj()) {
            this.a(fes2, clb2);
        }
        gga gga2 = (gga)this.MessageDelegator.h(6159, this.getGUID(), lcr.qCv);
        gga2.jgt = true;
        gga2.ResourceType = clb2.az();
        this.MessageDelegator.F(gga2);
    }

    private void a(fes fes2, clb clb2) {
        fet fet2 = (fet)this.MessageDelegator.h(19202, this.getGUID(), fes2.aO());
        this.MessageDelegator.b(fes2, fet2);
        if (clb2 == null) {
            fet2.pD(null);
            fet2.a(null);
        } else {
            fet2.a(clb2);
            fet2.pD(clb2.getGUID());
        }
        this.MessageDelegator.F(fet2);
    }

    private void a(clb clb2, fes fes2) {
        bvd bvd2 = clb2.aIl();
        clb2.d(bvd2);
        bvd2.c(fes2.av());
        bvd2.a(fes2.aw());
        clb2.aAG().c(fes2.av());
        clb2.aAG().a(fes2.aw());
        if (fes2.bFz() == null) {
            this.MessageDelegator.a((amf)((Object)clb2));
            this.dvN.put(clb2.getGUID(), clb2);
            clb2.Hy();
            clb2.a(this);
        } else {
            this.dvO.put(clb2.getGUID(), clb2);
        }
    }

    private void a(few few2) {
        assert (few2.bOO() != null);
        clb clb2 = null;
        if (few2.bOQ()) {
            clb2 = this.dvO.get(few2.bOO());
            if (clb2 == null) {
                lfn.b(5, "SFGuardTowerManagerServer", "handleGuardTowerRemoveMessage() Could NOT remove EXTERNAL guardtower: " + few2.bOO());
                return;
            }
        } else {
            clb2 = this.dvN.get(few2.bOO());
            if (clb2 == null) {
                lfn.b(5, "SFGuardTowerManagerServer", "handleGuardTowerRemoveMessage() Could NOT remove guardtower: " + few2.bOO());
                return;
            }
            this.MessageDelegator.hd(clb2.getGUID());
        }
        gga gga2 = (gga)this.MessageDelegator.h(6159, this.getGUID(), lcr.qCv);
        gga2.jgt = false;
        gga2.ResourceType = clb2.az();
        this.MessageDelegator.F(gga2);
    }

    public ldv dA(ldv ldv2) {
        return this.ctY.get(ldv2);
    }

    public boolean m(ldv ldv2, ldv ldv3) {
        if (ldv2 == null) {
            assert (false);
            return false;
        }
        if (ldv3 == null) {
            assert (false);
            return false;
        }
        ldv ldv4 = this.ctY.get(ldv2);
        if (ldv4 == null) {
            return false;
        }
        if (ldv3.equals(ldv4)) {
            this.ctY.remove(ldv2);
            return true;
        }
        return false;
    }

    public void dB(ldv ldv2) {
        if (ldv2 == null) {
            assert (false);
            return;
        }
        if (this.ctY.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<ldv, ldv>> iterator = this.ctY.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<ldv, ldv> entry = iterator.next();
            ldv ldv3 = entry.getValue();
            if (!ldv2.equals(ldv3)) continue;
            iterator.remove();
        }
    }

    public List<ldv> dC(ldv ldv2) {
        if (ldv2 == null) {
            assert (false);
            return null;
        }
        if (this.ctY.isEmpty()) {
            return null;
        }
        ArrayList<ldv> arrayList = lcn.emv();
        for (Map.Entry<ldv, ldv> entry : this.ctY.entrySet()) {
            ldv ldv3 = entry.getValue();
            if (!ldv2.equals(ldv3)) continue;
            ldv ldv4 = entry.getKey();
            arrayList.add(ldv4);
        }
        return arrayList;
    }

    public boolean l(ldv ldv2, ldv ldv3) {
        if (ldv2 == null) {
            assert (false);
            return false;
        }
        if (ldv3 == null) {
            assert (false);
            return false;
        }
        if (this.ctY.containsKey(ldv2)) {
            return false;
        }
        this.ctY.put(ldv2, ldv3);
        return true;
    }
}

