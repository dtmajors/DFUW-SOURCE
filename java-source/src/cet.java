/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 *  cwx
 *  cxd
 *  mcs
 */
import java.util.Map;
import java.util.Set;

public class cet
extends btk
implements bto {
    public static boolean erl = true;
    public static boolean erm = false;
    public static int ern = 100;
    public static double ero = 1.0;
    private final cex baW;
    private final Map<ldv, ldv> erp = lcn.abI(ern);
    private double abo = 0.0;

    public cet(cex cex2) {
        this.baW = cex2;
    }

    @Override
    public void doTick(ldz ldz2) {
        if (!erl) {
            return;
        }
        if (this.baW.jm() == null) {
            lfn.b(5, "SFPlayerLinkingManagerServer", "handleCharacterLinkCreateRequestMessage() For Player with guid : " + this.baW.getGUID() + " attribute manager is not ready.");
            return;
        }
        this.abo -= ldz2.qwh;
        if (this.abo > 0.0) {
            return;
        }
        this.abo = ero;
        float f2 = this.baW.jm().al(352);
        float f3 = this.baW.jm().ai(352);
        float f4 = f3 - f2;
        if (f4 >= 1.0f) {
            this.ep(f4);
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        int n = dxq2.bEz();
        switch (n) {
            case 12840: {
                this.a((edu)dxq2);
                break;
            }
            case 12843: {
                this.a((edx)dxq2);
            }
        }
    }

    private void a(edu edu2) {
        cwx cwx2;
        cxc cxc2;
        ldv ldv2 = edu2.ing;
        if (this.erp.containsKey(ldv2)) {
            this.r(3, edu2.gbp);
            lfn.b(5, "SFPlayerLinkingManagerServer", "handleCharacterLinkCreateRequestMessage() Player with guid : " + ldv2 + " is already linked with player : " + this.baW.getGUID());
            return;
        }
        if (this.erp.size() == ern) {
            this.r(1, edu2.gbp);
            lfn.b(5, "SFPlayerLinkingManagerServer", "handleCharacterLinkCreateRequestMessage() Player with guid : " + ldv2 + " has already linked with the max allowed players");
            return;
        }
        if (!this.baW.aIs()) {
            this.r(2, edu2.gbp);
            lfn.b(5, "SFPlayerLinkingManagerServer", "handleCharacterLinkCreateRequestMessage() Player with guid : " + ldv2 + " is not alive anymore.");
            return;
        }
        if (!erm && (cxc2 = this.baW.jk().ht(cxd.fKZ)) != null && (cwx2 = (cwx)cxc2).bev()) {
            this.r(4, edu2.gbp);
            lfn.b(5, "SFPlayerLinkingManagerServer", "handleCharacterLinkCreateRequestMessage() Player with guid : " + ldv2 + " is linked to another player.");
            return;
        }
        this.erp.put(ldv2, edu2.gbp);
        this.r(0, edu2.gbp);
        this.baW.c(mcs.uzU.bD(new Object[0]));
        lfn.b(5, "SFPlayerLinkingManagerServer", "handleCharacterLinkCreateRequestMessage() Player with guid : " + ldv2 + " linked with player : " + this.baW.getGUID());
    }

    private void a(edx edx2) {
        ldv ldv2 = edx2.inm;
        ldv ldv3 = this.erp.remove(ldv2);
        if (ldv3 == null) {
            lfn.b(5, "SFPlayerLinkingManagerServer", "handleCharacterLinkRemoveRequestMessage() Player with guid : " + ldv2 + " has no link with player : " + this.baW.getGUID());
            assert (false);
            return;
        }
        lfn.b(5, "SFPlayerLinkingManagerServer", "handleCharacterLinkRemoveRequestMessage() Player with guid : " + ldv2 + " broke the link with player : " + this.baW.getGUID());
        this.baW.c(mcs.uzV.bD(new Object[0]));
    }

    public void eo(float f2) {
        if (erl) {
            lfn.b(5, "SFPlayerLinkingManagerServer", "notifyDamageReceived() Player received damage but system heals over time.");
            return;
        }
        float f3 = Math.abs(f2 / (float)this.erp.size());
        this.ep(f3);
    }

    private void r(int n, ldv ldv2) {
        edv edv2 = (edv)this.MessageDelegator.h(12841, this.baW.KY(), ldv2);
        edv2.ew = n;
        this.MessageDelegator.I(edv2);
    }

    private void ep(float f2) {
        if (this.erp.isEmpty()) {
            return;
        }
        for (ldv ldv2 : this.erp.values()) {
            edw edw2 = (edw)this.MessageDelegator.h(12842, this.baW.getGUID(), ldv2);
            edw2.aYG = bfk.dgx;
            edw2.Magnitude = f2;
            this.MessageDelegator.I(edw2);
        }
    }

    public Set<ldv> aLP() {
        return this.erp.isEmpty() ? null : this.erp.keySet();
    }
}

