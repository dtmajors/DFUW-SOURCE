/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lcr
 */
import java.util.Map;

public class dmb
extends dlz {
    private Map<ldv, cnt> gHm = lcn.emw();
    private Map<ldv, cnt> gHn = lcn.emw();
    private Map<Integer, gtu> gHo = lcn.emw();
    private int bRk = 0;

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 28161: {
                this.a((gtu)dxq2);
                break;
            }
            case 6146: {
                this.a((gfn)dxq2);
                break;
            }
            case 28163: {
                this.a((gty)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(gtu gtu2) {
        this.gHo.put(this.bRk, gtu2);
        gfm gfm2 = (gfm)this.MessageDelegator.h(6145, this.getGUID(), lcr.qCq);
        gfm2.sk(this.bRk);
        gfm2.Yc = gtu2.bFz() != null ? gtu2.bFz() : this.GUID;
        gfm2.ResourceType = cug.fnV;
        gfm2.iSi = 1;
        this.MessageDelegator.F(gfm2);
        ++this.bRk;
    }

    private void a(gty gty2) {
        assert (gty2.bXH() != null);
        cnt cnt2 = null;
        if (gty2.bXI()) {
            cnt2 = this.gHn.remove(gty2.bXH());
            if (cnt2 == null) {
                lfn.b(5, "SFTeleportChamberManagerServer", "handleTeleportChamberRemoveMessage() Could not find EXTERNAL portal: " + gty2.bXH());
                return;
            }
            gga gga2 = (gga)this.MessageDelegator.h(6159, this.getGUID(), lcr.qCv);
            gga2.jgt = false;
            gga2.ResourceType = cnt2.az();
            this.MessageDelegator.F(gga2);
        } else {
            cnt2 = this.gHm.remove(gty2.bXH());
            if (cnt2 == null) {
                lfn.b(5, "SFTeleportChamberManagerServer", "handleTeleportChamberRemoveMessage() Could not find Teleport Chamber: " + gty2.bXH());
                return;
            }
            gga gga3 = (gga)this.MessageDelegator.h(6159, this.getGUID(), lcr.qCv);
            gga3.jgt = false;
            gga3.ResourceType = cnt2.az();
            this.MessageDelegator.F(gga3);
            this.MessageDelegator.hd(cnt2.getGUID());
        }
    }

    private void a(gfn gfn2) {
        gtu gtu2 = this.gHo.remove(gfn2.aVk());
        assert (gtu2 != null);
        if (gfn2.dtF == null) {
            this.a(gtu2, null, null);
            return;
        }
        assert (gfn2.dtF instanceof cnt);
        cnt cnt2 = (cnt)gfn2.dtF;
        this.a(cnt2, gtu2);
        if (gtu2.bFz() != null) {
            this.gHn.put(cnt2.getGUID(), cnt2);
        } else {
            this.MessageDelegator.a((amf)((Object)cnt2));
            this.gHm.put(cnt2.getGUID(), cnt2);
        }
        this.a(gtu2, cnt2, cnt2.getGUID());
        gga gga2 = (gga)this.MessageDelegator.h(6159, this.getGUID(), lcr.qCv);
        gga2.jgt = true;
        gga2.ResourceType = cnt2.az();
        this.MessageDelegator.F(gga2);
    }

    private void a(cnt cnt2, gtu gtu2) {
        bvd bvd2 = cnt2.aIl();
        cnt2.d(bvd2);
        bvd2.c(gtu2.bXD());
        bvd2.a(gtu2.bXE());
        cnt2.cC(gtu2.bXF());
    }

    private void a(gtu gtu2, cnt cnt2, ldv ldv2) {
        gtv gtv2 = (gtv)this.MessageDelegator.h(28162, this.getGUID(), gtu2.aO());
        gtv2.a(cnt2);
        gtv2.qA(ldv2);
        this.MessageDelegator.b(gtu2, gtv2);
        this.MessageDelegator.F(gtv2);
    }
}

