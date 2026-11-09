/*
 * Decompiled with CFR.
 */
public class dlr {
    private dlo gGN = null;
    private float gGO = 0.0f;
    private static final float gGP = 100.0f;

    public dlr(dlo dlo2) {
        assert (dlo2 != null);
        this.gGN = dlo2;
        this.gGO = (float)Math.random() * 100.0f;
        if (this.gGO >= 100.0f) {
            this.gGO = 99.0f;
        }
    }

    public void a(eoc eoc2) {
        if (eoc2.iwc > 0) {
            this.AC(eoc2.iwc);
        } else assert (false);
    }

    private void AB(int n) {
        if (this.gGN.XQ().Xw() == null || this.gGN.getMessageDelegator() == null || this.gGN.aze() == null) {
            return;
        }
        this.gGO += cwy.C(n, true);
        if (this.gGO >= 100.0f) {
            eiw eiw2 = (eiw)this.gGN.getMessageDelegator().h(18717, this.gGN.XQ().getGUID(), this.gGN.XQ().Xw());
            eiw2.aDk = this.gGN.XQ().getGUID();
            eiw2.asi = (int)this.gGO;
            eiw2.fyj = this.gGN.aze().az();
            this.gGN.getMessageDelegator().F(eiw2);
            this.gGO = 0.0f;
        }
    }

    private void AC(int n) {
        ldv ldv2 = this.gGN.XQ().Xw();
        if (ldv2 == null) {
            return;
        }
        if (this.gGN.getMessageDelegator() == null || this.gGN.aze() == null) {
            return;
        }
        ldv ldv3 = this.gGN.XQ().getGUID();
        if (ldv3 == null) {
            return;
        }
        float f = cwy.C(n, true);
        if (f < 1.0f) {
            return;
        }
        eiw eiw2 = (eiw)this.gGN.getMessageDelegator().h(18717, ldv3, ldv2);
        eiw2.aDk = ldv3;
        eiw2.asi = (int)f;
        eiw2.fyj = this.gGN.aze().az();
        this.gGN.getMessageDelegator().F(eiw2);
    }
}

