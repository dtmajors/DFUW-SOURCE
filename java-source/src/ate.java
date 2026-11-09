/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public class ate
extends btk {
    private ldv aYF;
    private ldv bYe;
    private dzh bYf = null;
    private dzh bYg = null;
    private eeg bYh = null;
    private eeg bYi = null;

    private void b(dzl dzl2) {
        if (dzl2.ijy == null) {
            this.Vc();
            return;
        }
        if (dzl2.ijx == null) {
            this.Vc();
            return;
        }
        this.aYF = dzl2.ijy;
        this.bYe = dzl2.ijx;
        if (!lcw.enb() && this.aYF.equals(this.bYe)) {
            this.Vc();
            return;
        }
        dzg dzg2 = (dzg)this.MessageDelegator.h(23299, this.getGUID(), this.aYF);
        this.MessageDelegator.F(dzg2);
        dzg dzg3 = (dzg)this.MessageDelegator.h(23299, this.getGUID(), this.bYe);
        this.MessageDelegator.F(dzg3);
    }

    private void a(dzh dzh2) {
        if (!dzh2.aO().equals(this.aYF) && !dzh2.aO().equals(this.bYe)) {
            assert (false);
            return;
        }
        if (dzh2.aO().equals(this.aYF)) {
            this.bYf = dzh2;
        }
        if (dzh2.aO().equals(this.bYe)) {
            this.bYg = dzh2;
        }
        if (this.bYf == null || this.bYg == null) {
            return;
        }
        if (this.bYf.Qw < 0 || this.bYg.iju || this.bYg.Qw < 0) {
            this.Vc();
            return;
        }
        eef eef2 = (eef)this.MessageDelegator.h(12811, this.getGUID(), this.aYF);
        this.MessageDelegator.F(eef2);
        eef eef3 = (eef)this.MessageDelegator.h(12811, this.getGUID(), this.bYe);
        this.MessageDelegator.F(eef3);
    }

    private void b(eeg eeg2) {
        if (!eeg2.aO().equals(this.aYF) && !eeg2.aO().equals(this.bYe)) {
            assert (false);
            return;
        }
        if (eeg2.aO().equals(this.aYF)) {
            this.bYh = eeg2;
        }
        if (eeg2.aO().equals(this.bYe)) {
            this.bYi = eeg2;
        }
        if (this.bYh == null || this.bYi == null) {
            return;
        }
        lmf lmf2 = lea.eg(this.bYh.av());
        if (lmf2 == null || lmf2 != lmf.rEz) {
            this.Vc();
            return;
        }
        dzf dzf2 = (dzf)this.MessageDelegator.h(23303, this.getGUID(), this.aYF);
        dzf2.Magnitude = -10.0f;
        dzf2.akX = this.bYe;
        this.MessageDelegator.F(dzf2);
        this.Vc();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 23304: {
                this.b((dzl)dxq2);
                break;
            }
            case 23300: {
                this.a((dzh)dxq2);
                break;
            }
            case 12812: {
                this.b((eeg)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void Vc() {
        this.MessageDelegator.hd(this.GUID);
        this.MessageDelegator.oa(this.GUID);
    }
}

