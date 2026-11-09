/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 *  cug
 */
import java.util.Map;

public class cgb
extends btk {
    protected cex baW = null;
    protected int aqs = 0;
    protected Map<Integer, flg> ewR = lcn.emw();

    public cgb(cex cex2) {
        this.baW = cex2;
    }

    public void a(flg flg2) {
        bqs bqs2;
        int n;
        ++this.aqs;
        this.ewR.put(this.aqs, flg2);
        int n2 = flg2.bQe() & 0xFFFF;
        int n3 = flg2.bQe() >> 16;
        cab cab2 = lea.epO().get(n2);
        cab cab3 = lea.epO().get(n3);
        if (cab2 == null && cab3 == null) {
            this.b(this.aqs, null);
            assert (false);
            return;
        }
        brm brm2 = this.baW.aJC().asf().iF(flg2.awM());
        if (brm2 == null) {
            this.b(this.aqs, mce.usY.bD(new Object[0]));
            return;
        }
        if (!(brm2 instanceof bqs)) {
            this.b(this.aqs, mce.usX.bD(new Object[0]));
            assert (false);
            return;
        }
        bqs bqs3 = (bqs)brm2;
        if (!cug.wB((int)bqs3.az())) {
            this.b(this.aqs, mce.usX.bD(new Object[0]));
            return;
        }
        ew ew2 = (ew)bqs3.ae(13216);
        int n4 = n = ew2 == null ? 0 : ew2.fQ();
        if ((n & 0xFFFF) == n2) {
            cab2 = null;
        }
        if (n >> 16 == n3) {
            cab3 = null;
        }
        ldv ldv2 = bqs3.getGUID();
        if (cab2 != null && (bqs2 = this.baW.aJC().asf().aup().mn(cab2.az())) == null) {
            this.b(this.aqs, null);
            return;
        }
        if (cab3 != null && (bqs2 = this.baW.aJC().asf().aup().mn(cab3.az())) == null) {
            this.b(this.aqs, null);
            return;
        }
        if (cab2 != null && cab3 != null && cab2 == cab3 && this.baW.aJC().asf().aup().mp(cab2.az()) < 2) {
            this.b(this.aqs, null);
            return;
        }
        if (cab2 != null) {
            if (!this.baW.aJC().asf().aup().a(cab2.az(), 1, bqy.dHw)) {
                this.b(this.aqs, null);
                assert (false);
                return;
            }
            n &= 0xFFFF0000;
            n |= cab2.getId();
        }
        if (cab3 != null) {
            if (!this.baW.aJC().asf().aup().a(cab3.az(), 1, bqy.dHw)) {
                this.b(this.aqs, null);
                assert (false);
                return;
            }
            n &= 0xFFFF;
            n |= cab3.getId() << 16;
        }
        this.S(ldv2, n);
        this.b(this.aqs, null);
    }

    protected void S(ldv ldv2, int n) {
        eap eap2 = (eap)this.MessageDelegator.h(10757, this.getGUID(), ldv2);
        eap2.bhp = new ew();
        eap2.bhp.setType(13216);
        eap2.bhp.setValue(n);
        this.MessageDelegator.E(eap2);
    }

    protected void b(int n, loz loz2) {
        flg flg2 = this.ewR.remove(n);
        assert (flg2 != null);
        if (loz2 != null) {
            this.baW.c(loz2);
        }
    }
}

