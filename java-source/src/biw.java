/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Set;

public class biw
extends btk {
    public static biw dns = null;
    private Set<ldv> Sg = lcn.emx();
    private Set<ldv> dnt = lcn.emx();

    biw() {
        assert (dns == null);
        dns = this;
    }

    public void hA(ldv ldv2) {
        if (this.Sg.isEmpty()) {
            ldv ldv3 = new ldv(65534, lcr.qAJ.enw(), lcr.qAJ.enx());
            gok gok2 = (gok)this.MessageDelegator.h(21771, this.getGUID(), ldv3);
            gok2.gNT = 1;
            gok2.ahy = Integer.MAX_VALUE;
            gok2.iBr = true;
            gok2.ahx = 5.0f;
            this.MessageDelegator.E(gok2);
        }
        this.Sg.add(ldv2);
    }

    public void bn(ldv ldv2) {
        if (!this.Sg.remove(ldv2)) {
            // empty if block
        }
        if (this.Sg.isEmpty()) {
            for (ldv ldv3 : this.dnt) {
                gok gok2 = (gok)this.MessageDelegator.h(21771, this.getGUID(), new ldv(ldv3.ib(), lcr.qAJ.enw(), lcr.qAJ.enx()));
                gok2.gNT = 2;
                gok2.Ud = ldv3;
                gok2.iBr = false;
                this.MessageDelegator.E(gok2);
            }
            this.dnt.clear();
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 21772: {
                this.a((gol)dxq2);
                break;
            }
            case 21773: {
                this.a((goj)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private final void a(gol gol2) {
        if (gol2.gNT == 1) {
            this.dnt.add(gol2.Ud);
        }
    }

    private final void a(goj goj2) {
        for (ldv ldv2 : this.Sg) {
            goj goj3 = (goj)this.MessageDelegator.h(21773, goj2.aO(), ldv2);
            goj2.b(goj3);
            this.MessageDelegator.I(goj3);
        }
    }

    @Override
    public void receiveMiddlewareMessage(kcz kcz2) {
        switch (kcz2.getMessageType()) {
            case 270: {
                this.a((kcs)kcz2);
                break;
            }
            default: {
                super.receiveMiddlewareMessage(kcz2);
            }
        }
    }

    private void a(kcs kcs2) {
        if (this.Sg.contains(kcs2.hsQ)) {
            this.bn(kcs2.hsQ);
        }
    }
}

