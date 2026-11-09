/*
 * Decompiled with CFR.
 */
import java.util.Map;
import java.util.Queue;

public class dmp
extends dmm {
    private Map<ldv, Queue<gux>> gJe = lcn.emw();

    @Override
    protected boolean bqv() {
        return true;
    }

    @Override
    public void cleanUp() {
        for (Queue<gux> queue : this.gJe.values()) {
            queue.clear();
        }
        this.gJe.clear();
        super.cleanUp();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 32275: {
                this.a((gvh)dxq2);
                break;
            }
            case 32277: {
                this.a((gvf)dxq2);
                break;
            }
            case 32278: {
                this.a((gve)dxq2);
                break;
            }
            case 32276: {
                this.a((gvi)dxq2);
                break;
            }
            case 32282: {
                this.a((gvg)dxq2);
                break;
            }
            case 32257: {
                this.a((guu)dxq2);
                break;
            }
            case 32267: {
                this.a((gup)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(guu guu2) {
        azg azg2 = guu2.bXY();
        this.gIw.put(azg2.getGUID(), azg2);
    }

    private void a(gvh gvh2) {
        dml dml2 = (dml)this.gIu.get(gvh2.acY());
        if (dml2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleTerritoryServerInitialiseTerritoryMessage() : Initialise Message Received for Unknown Territory!!!... TerritoryID = " + gvh2.acY());
            assert (false);
            return;
        }
        if (gvh2.bqi() != null && !this.dih.containsKey(gvh2.bqi())) {
            Queue<gux> queue = this.gJe.get(gvh2.bqi());
            if (queue == null) {
                queue = lcn.emA();
                this.gJe.put(gvh2.bqi(), queue);
            }
            queue.add(gvh2);
            return;
        }
        ldv ldv2 = dml2.bqi();
        dml2.hC(gvh2.bXU());
        dml2.mT(gvh2.bqi());
        this.b(dml2);
        if (ldv2 != null) {
            this.nq(ldv2);
        }
    }

    private void a(gvf gvf2) {
        this.dih.put(gvf2.bXS().iG(), gvf2.bXS());
        Queue<gux> queue = this.gJe.remove(gvf2.bXS().iG());
        if (queue != null) {
            while (!queue.isEmpty()) {
                this.receiveMessage(queue.poll());
            }
        }
    }

    private void a(gve gve2) {
        bcp bcp2 = (bcp)this.dih.get(gve2.iG());
        if (bcp2 == null) {
            Queue<gux> queue = this.gJe.get(gve2.iG());
            if (queue == null) {
                queue = lcn.emA();
                this.gJe.put(gve2.iG(), queue);
            }
            queue.add(gve2);
            return;
        }
        bcp2.a(gve2.alD(), gve2.bYf());
    }

    private void a(gvi gvi2) {
        dml dml2 = (dml)this.gIu.get(gvi2.acY());
        if (dml2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleTerritoryServerOwnerChangedMessage() : Owner Changed Message Received for Unknown Territory!!!... TerritoryID = " + gvi2.acY());
            assert (false);
            return;
        }
        if (gvi2.bqi() != null && !this.dih.containsKey(gvi2.bqi())) {
            Queue<gux> queue = this.gJe.get(gvi2.bqi());
            if (queue == null) {
                queue = lcn.emA();
                this.gJe.put(gvi2.bqi(), queue);
            }
            queue.add(gvi2);
            return;
        }
        ldv ldv2 = dml2.bqi();
        dml2.mT(gvi2.bqi());
        this.b(dml2);
        if (ldv2 != null) {
            this.nq(ldv2);
        }
    }

    private void a(gvg gvg2) {
        dml dml2 = (dml)this.gIu.get(gvg2.acY());
        if (dml2 == null) {
            return;
        }
        dml2.is(gvg2.XD());
        dml2.ir(gvg2.XC());
    }

    private void a(gup gup2) {
        azg azg2 = (azg)this.gIw.get(gup2.bXU());
        if (azg2 != null) {
            azg2.cv(gup2.acT());
            azg2.ao(gup2.acU());
            azg2.ap(gup2.acV());
            azg2.aq(gup2.bXW());
            azg2.ar(gup2.acX());
            return;
        }
        lfn.b(5, this.getClass().getSimpleName(), "handleTerritoryClientStateUpdateMessage() : Stance Update Received for Unregistered Territorial Object!!!");
        assert (false);
    }
}

