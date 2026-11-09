/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dqk
 *  lcw
 */
import java.util.List;
import java.util.Map;

public class dsh
extends dqk {
    private List<dss> gXm = lcn.emv();
    private Map<ldv, dss> gXn = lcn.emw();
    private String DisplayName;
    private boolean dKy;
    private String dKz;
    private List<dss> gXo = lcn.emv();

    public dsh() {
        this.ObjectType = 121;
    }

    public void initialize() {
        super.initialize();
        for (dss dss2 : this.gXm) {
            dss2.setGUID(this.MessageDelegator.bzv());
            dss2.setWorldbuilderSaveable(false);
            this.MessageDelegator.a((amf)((Object)dss2));
            this.gXn.put(dss2.getGUID(), dss2);
        }
    }

    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        if (!this.gXo.isEmpty()) {
            while (!this.gXo.isEmpty()) {
                dss dss2 = this.gXo.remove(0);
                this.MessageDelegator.a((amf)((Object)dss2));
                this.gXm.add(dss2);
                this.gXn.put(dss2.getGUID(), dss2);
            }
        }
    }

    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 1035: {
                this.a((fui)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(fui fui2) {
        if ((fui2.bSj() & 4) != 0) {
            this.cQ(fui2.aO());
        }
        if ((fui2.bSj() & 1) != 0) {
            this.m(fui2.aO(), fui2.av());
        }
        if ((fui2.bSj() & 2) != 0) {
            this.b(fui2.aO(), fui2.aw());
        }
    }

    private void m(ldv ldv2, ljq ljq2) {
        dss dss2;
        if (lcw.qHe && (dss2 = this.gXn.get(ldv2)) == null) {
            lfn.b(5, ((Object)((Object)this)).getClass().getSimpleName(), "modifyElevatorPointPosition() : Point " + ldv2 + " is null!");
            assert (false);
            return;
        }
    }

    private void b(ldv ldv2, lgl lgl2) {
        dss dss2;
        if (lcw.qHe && (dss2 = this.gXn.get(ldv2)) == null) {
            lfn.b(5, ((Object)((Object)this)).getClass().getSimpleName(), "modifyElevatorPointPosition() : Point " + ldv2 + " is null!");
            assert (false);
            return;
        }
    }

    private void cQ(ldv ldv2) {
        dss dss2 = this.gXn.remove(ldv2);
        if (dss2 == null) {
            lfn.b(5, ((Object)((Object)this)).getClass().getSimpleName(), "removeElevatorPoint() : Point Not found!!");
            assert (false);
            return;
        }
        this.gXm.remove((Object)dss2);
    }

    public void cx(ljq ljq2) {
        if (this.MessageDelegator == null) assert (false);
        dss dss2 = new dss();
        dss2.nQ(this.getGUID());
        dss2.setGUID(this.MessageDelegator.bzv());
        dss2.setObjectDescriptionFilename("gizmos\\gizmo_spawnpoint_01.xml");
        dss2.c(ljq2);
        dss2.a(new lgl());
        dss2.setWorldbuilderSaveable(false);
        if (lcw.qHe) {
            this.gXo.add(dss2);
        }
    }

    public List<dss> HP() {
        return this.gXm;
    }

    public void aJ(List<dss> list) {
        this.gXm = list;
    }

    public String getDisplayName() {
        return this.DisplayName;
    }

    public void setDisplayName(String string) {
        this.DisplayName = string;
    }

    public boolean aSS() {
        return this.dKy;
    }

    public void gn(boolean bl) {
        this.dKy = bl;
    }

    public String bxJ() {
        return this.dKz;
    }

    public void jl(String string) {
        this.dKz = string;
    }
}

