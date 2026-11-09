/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Iterator;
import java.util.Set;

public class bjc
extends btk {
    public static bjc dnK = null;
    private Set<ldv> Sg = lcn.emx();
    private Set<ldv> dnt = lcn.emx();

    public bjc() {
        assert (dnK == null);
        dnK = this;
    }

    @Override
    public void initialize() {
        super.initialize();
    }

    public void hA(ldv ldv2) {
        if (this.Sg.isEmpty()) {
            kdq kdq2 = (kdq)this.MessageDelegator.i(275, this.getGUID(), lcr.qzf);
            kdq2.gNT = 0;
            kdq2.dnE = 5000;
            kdq2.jhz = 16383;
            kdq2.iBr = true;
            this.MessageDelegator.b(kdq2);
            kdq2 = (kdq)this.MessageDelegator.i(275, this.getGUID(), lcr.qzg);
            kdq2.gNT = 0;
            kdq2.dnE = 5000;
            kdq2.jhz = 16383;
            kdq2.iBr = true;
            this.MessageDelegator.b(kdq2);
        }
        this.Sg.add(ldv2);
    }

    public void bn(ldv ldv2) {
        if (!this.Sg.remove(ldv2)) {
            // empty if block
        }
        if (this.Sg.isEmpty()) {
            for (ldv ldv3 : this.dnt) {
                kdq kdq2 = (kdq)this.MessageDelegator.i(275, this.getGUID(), ldv3);
                kdq2.Ud = ldv3;
                kdq2.gNT = 2;
                kdq2.dnE = 0;
                kdq2.jhz = 0;
                kdq2.iBr = true;
                this.MessageDelegator.b(kdq2);
            }
            this.dnt.clear();
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11059: {
                this.a((gpo)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void receiveMiddlewareMessage(kcz kcz2) {
        switch (kcz2.getMessageType()) {
            case 270: {
                this.a((kcs)kcz2);
                break;
            }
            case 276: {
                this.b((kdr)kcz2);
                break;
            }
            case 277: {
                this.b((kdp)kcz2);
                break;
            }
            default: {
                super.receiveMiddlewareMessage(kcz2);
            }
        }
    }

    private void a(gpo gpo2) {
        if (gpo2.joK != null && gpo2.joK.hE.equals("AI") && gpo2.joK.hB == 0 && !this.Sg.isEmpty()) {
            if (gpo2.joL) {
                kdq kdq2 = (kdq)this.MessageDelegator.i(275, this.getGUID(), new ldv(gpo2.joK.di, 1800, 2));
                kdq2.gNT = 0;
                kdq2.dnE = 5000;
                kdq2.jhz = 16383;
                kdq2.iBr = true;
                this.MessageDelegator.b(kdq2);
            } else {
                Iterator<ldv> iterator = this.dnt.iterator();
                while (iterator.hasNext()) {
                    ldv ldv2 = iterator.next();
                    if (ldv2.ib() != gpo2.joK.di) continue;
                    iterator.remove();
                    for (ldv ldv3 : this.Sg) {
                        kdp kdp2 = (kdp)this.MessageDelegator.i(277, this.getGUID(), ldv3);
                        kdp2.Ud = ldv2;
                        kdp2.phi = 0L;
                        kdp2.phm = 0;
                        kdp2.phl = 0;
                        kdp2.phk = 0;
                        kdp2.pho = 0;
                        kdp2.phj = 0;
                        kdp2.phn = 0;
                        kdp2.phq = 0;
                        kdp2.phs = 0;
                        kdp2.php = 0;
                        kdp2.phr = 0;
                        kdp2.pht = 0;
                        kdp2.phu = 0;
                        kdp2.phw = 0;
                        kdp2.phv = 0;
                        this.MessageDelegator.b(kdp2);
                    }
                }
            }
        }
    }

    private void a(kcs kcs2) {
        if (this.Sg.contains(kcs2.hsQ)) {
            this.bn(kcs2.hsQ);
        }
    }

    private void b(kdr kdr2) {
        if (kdr2.gNT == 0) {
            if (kdr2.phH) {
                this.dnt.add(kdr2.Ud);
                if (this.Sg.isEmpty()) {
                    kdq kdq2 = (kdq)this.MessageDelegator.i(275, this.getGUID(), kdr2.Ud);
                    kdq2.Ud = kdr2.Ud;
                    kdq2.gNT = 2;
                    kdq2.dnE = 0;
                    kdq2.jhz = 0;
                    kdq2.iBr = true;
                    this.MessageDelegator.b(kdq2);
                }
            }
        } else if (kdr2.gNT == 2 && kdr2.phH) {
            this.dnt.remove(kdr2.Ud);
        }
    }

    private void b(kdp kdp2) {
        for (ldv ldv2 : this.Sg) {
            kdp kdp3 = (kdp)this.MessageDelegator.i(277, this.getGUID(), ldv2);
            kdp3.Ud = kdp2.Ud;
            kdp3.on(ldv2);
            kdp3.phi = kdp2.phi;
            kdp3.phm = kdp2.phm;
            kdp3.phl = kdp2.phl;
            kdp3.phk = kdp2.phk;
            kdp3.pho = kdp2.pho;
            kdp3.phj = kdp2.phj;
            kdp3.phn = kdp2.phn;
            kdp3.phq = kdp2.phq;
            kdp3.phs = kdp2.phs;
            kdp3.php = kdp2.php;
            kdp3.phr = kdp2.phr;
            kdp3.pht = kdp2.pht;
            kdp3.phu = kdp2.phu;
            kdp3.phw = kdp2.phw;
            kdp3.phv = kdp2.phv;
            this.MessageDelegator.b(kdp3);
        }
    }
}

