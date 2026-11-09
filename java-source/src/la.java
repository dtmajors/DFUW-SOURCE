/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ha
 *  lcr
 */
import java.util.ArrayList;
import java.util.List;

public class la
extends ky {
    private ha aer = null;

    public la(ha ha2) {
        this.aer = ha2;
    }

    public void c(nd nd2) {
        nd2.aCV = this.asz.eyR();
    }

    public void d(nd nd2) {
        if (nd2.aCV == null) {
            return;
        }
        this.asz.BO(nd2.aCV);
        List<lgs> list = this.asz.oA();
        if (!this.asx.isEmpty()) {
            for (lg lg2 : this.asx) {
                lg2.C(list);
            }
        }
    }

    public void lw() {
        if (!this.asz.hasData() && this.oB().y > -1000.0f) {
            this.asz.b(this.oB(), 500.0f);
            List<lgs> list = this.asz.oA();
            if (!this.asx.isEmpty()) {
                for (lg lg2 : this.asx) {
                    lg2.C(list);
                }
            }
        }
        this.oE();
    }

    public void oD() {
        if (this.oB().y <= -1000.0f) {
            return;
        }
        if (!this.asz.hasData()) {
            this.asz.b(this.oB(), 500.0f);
            List<lgs> list = this.asz.oA();
            if (!this.asx.isEmpty()) {
                for (lg lg2 : this.asx) {
                    lg2.C(list);
                }
            }
            this.oE();
        }
    }

    public void lx() {
        this.asz.oG();
    }

    private void oE() {
        ldv ldv2 = null;
        if (this.aer != null && this.aer.iY()) {
            ldv2 = lcr.p((ldv)lcr.acL, (int)this.aer.jr(), (int)this.aer.getGUID().enw());
        }
        if (ldv2 == null) {
            return;
        }
        fgl fgl2 = (fgl)this.MessageDelegator.h(29443, this.GUID, ldv2);
        fgl2.b(this.asz.eyQ());
        this.MessageDelegator.F(fgl2);
    }

    @Override
    protected ljq oB() {
        if (this.aer == null) {
            return null;
        }
        if (!this.aer.iY()) {
            return null;
        }
        if (this.aer.jf() == null) {
            return null;
        }
        if (this.aer.jf().aAG() == null) {
            return null;
        }
        return this.aer.jf().aAG().azb();
    }

    @Override
    protected void V(ljq ljq2) {
        ArrayList<lgs> arrayList = lcn.emv();
        this.asz.b(ljq2, 150.0f, arrayList);
        this.a(ljq2, 150.0f, arrayList);
        if (arrayList.isEmpty()) {
            return;
        }
        if (!this.asx.isEmpty()) {
            for (lg lg2 : this.asx) {
                lg2.C(arrayList);
            }
        }
    }
}

