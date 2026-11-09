/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public class atc
extends btk {
    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 23297: {
                this.a((dze)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFAlignmentDataHarvester: GUID=");
        stringBuilder.append(this.GUID);
        return stringBuilder.toString();
    }

    private void a(dze dze2) {
        if (dze2.ijj.equals(dze2.ijo)) {
            this.Vc();
            return;
        }
        if (dze2.ijq < 0) {
            this.Vc();
            return;
        }
        if (dze2.ijr) {
            this.Vc();
            return;
        }
        if (dze2.iji == 2) {
            if (dze2.ijl > 0) {
                this.Vc();
                return;
            }
            this.Vc();
            return;
        }
        if (lcw.emW() && dze2.ijn != dze2.ijt) {
            this.Vc();
            return;
        }
        this.v(dze2.ijj, -1);
        this.Vc();
    }

    private void v(ldv ldv2, int n) {
        dzk dzk2 = (dzk)this.MessageDelegator.h(23298, this.GUID, ldv2);
        dzk2.ijw = n;
        this.MessageDelegator.F(dzk2);
    }

    private void Vc() {
        this.MessageDelegator.hd(this.GUID);
        this.MessageDelegator.oa(this.GUID);
    }
}

