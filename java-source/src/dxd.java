/*
 * Decompiled with CFR.
 */
import java.sql.Timestamp;

public class dxd
extends btk {
    private dvh hfD = null;

    public dxd(dvh dvh2) {
        this.hfD = dvh2;
    }

    public boolean r(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 3592: 
            case 3593: 
            case 3594: 
            case 3595: {
                return true;
            }
        }
        return false;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 3592: {
                this.a((gmn)dxq2);
                break;
            }
            case 3593: {
                this.a((gmp)dxq2);
                break;
            }
            case 3594: {
                this.a((gnn)dxq2);
                break;
            }
            case 3595: {
                this.a((gno)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
                return;
            }
        }
    }

    private void a(gmn gmn2) {
        if (gmn2.jlW == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleStatsCraftingMessage() : Received message contained no item information!!!.. Message = " + gmn2);
            assert (false);
            return;
        }
        String string = dxe.a(new Timestamp(this.MessageDelegator.bzy().getTimeInMillis()), gmn2.Ri.enw(), gmn2.diS, gmn2.jlW.pa(), gmn2.jlW.asi, lea.enZ().getName(gmn2.jlX), dvg.cb(gmn2.jlW.ResourceType, gmn2.jlX));
        if (string == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleStatsCraftingMessage() : Failed to generate an SQL statement to update the crafting overview tables!!!... Message = " + gmn2);
            assert (false);
            return;
        }
        this.hfD.a(new dvz(string));
    }

    private void a(gmp gmp2) {
        if (gmp2.jmb == null || gmp2.jmb.fI() == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleStatsEnchantingMessage() : Enchanting attributes and/or ingredients are null!!!... Message = " + gmp2);
            assert (false);
            return;
        }
        String string = dxe.a(new Timestamp(this.MessageDelegator.bzy().getTimeInMillis()), gmp2.Ri.enw(), gmp2.diS, gmp2.jlY, gmp2.jlZ ? gmp2.jmb.fJ() : "Transmutation", gmp2.jma, gmp2.jmb.fD(), gmp2.jmb.fE(), dvg.a(gmp2.jmb.fI(), gmp2.brP));
        if (string == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleStatsEnchantingMessage() : Failed to generate an SQL statement to update the enchanting tables!!!... Message = " + gmp2);
            assert (false);
            return;
        }
        this.hfD.a(new dvz(string));
    }

    private void a(gnn gnn2) {
        String string = dxe.a(new Timestamp(this.MessageDelegator.bzy().getTimeInMillis()), gnn2.Ri.enw(), gnn2.diS, lea.enW().getName(gnn2.duR), true);
        if (string == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleStatsSpawningMessage() : Failed to generate an SQL statement to insert a spawning object entry into the resource summoning log!!!... Message = " + gnn2);
            assert (false);
            return;
        }
        this.hfD.a(new dvz(string));
    }

    private void a(gno gno2) {
        String string = dxe.a(new Timestamp(this.MessageDelegator.bzy().getTimeInMillis()), gno2.Ri.enw(), gno2.diS, lea.enW().getName(gno2.ResourceType), false);
        if (string == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleStatsUnspawningMessage() : Failed to generate an SQL statement to insert an unspawning object entry into the resource summoning log!!!... Message = " + gno2);
            assert (false);
            return;
        }
        this.hfD.a(new dvz(string));
    }
}

