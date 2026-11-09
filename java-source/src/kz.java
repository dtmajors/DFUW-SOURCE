/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class kz
extends ky
implements hsn {
    private dqi asE = null;
    private ljq asF = null;

    @Override
    public void initialize() {
        Collection collection;
        super.initialize();
        if (hso.cxK() != null) {
            hso.cxK().a(this);
        }
        if ((collection = hso.cxK().cxP().d(this.getClass())) != null && !collection.isEmpty()) {
            for (dxq dxq2 : collection) {
                this.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void cleanUp() {
        if (hso.cxK() != null) {
            hso.cxK().b(this);
        }
        if (this.asE != null && hso.cxK() != null && hso.cxK().bAn() != null && hso.cxK().bAn().gYY != null) {
            this.h(this.asE.getGUID(), hso.cxK().bAn().gYY);
            this.asE = null;
        }
        super.cleanUp();
    }

    @Override
    protected ljq oB() {
        return this.asF;
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

    @Override
    public void oo() {
        ldv ldv2;
        ldv ldv3 = ldv2 = hso.cxK() != null && hso.cxK().bAn() != null ? hso.cxK().bAn().gYY : null;
        if (ldv2 == null) {
            return;
        }
        this.asE = new dqi();
        this.asE.setGUID(this.MessageDelegator.bzv());
        this.asE.nC(this.GUID);
        this.asE.M(new int[]{1488});
        this.asE.setMessageDelegator(this.MessageDelegator);
        this.a(this.asE, ldv2);
    }

    @Override
    public boolean op() {
        return true;
    }

    @Override
    public void a(jnz jnz2, jnz jnz3) {
    }

    @Override
    public void a(joa joa2) {
    }

    @Override
    public void b(joa joa2) {
    }

    @Override
    public void cB(int n) {
    }

    @Override
    public void X(boolean bl) {
    }

    private void a(dqi dqi2, ldv ldv2) {
        gzo gzo2 = (gzo)this.MessageDelegator.h(8193, this.GUID, ldv2);
        gzo2.jvG = dqi2;
        this.MessageDelegator.F(gzo2);
    }

    private void h(ldv ldv2, ldv ldv3) {
        gzr gzr2 = (gzr)this.MessageDelegator.h(8194, this.GUID, ldv3);
        gzr2.bWM = ldv2;
        this.MessageDelegator.F(gzr2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 8196: {
                this.a((gzq)dxq2);
                break;
            }
            case 8195: {
                this.a((gzp)dxq2);
                break;
            }
            case 29443: {
                this.a((fgl)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(gzq gzq2) {
        block3: for (ej ej2 : gzq2.DR) {
            switch (ej2.getType()) {
                case 1488: {
                    fc fc2 = (fc)ej2.getValue();
                    this.asF = fc2.Position;
                    continue block3;
                }
                default: {
                    assert (false) : "Recieved wiretap attribute value message for unknown attribute!!!";
                    return;
                }
            }
        }
    }

    private void a(gzp gzp2) {
        switch (gzp2.bhp.getType()) {
            case 1488: {
                fc fc2 = (fc)gzp2.bhp.getValue();
                this.asF = fc2.Position;
                break;
            }
            default: {
                assert (false) : "Recieved wiretap attribute changed message for unknown attribute!!!";
                return;
            }
        }
    }

    private void a(fgl fgl2) {
        this.asz.g(fgl2.bPr());
        this.oC();
        List<lgs> list = this.asz.oA();
        if (!this.asx.isEmpty()) {
            for (lg lg2 : this.asx) {
                lg2.C(list);
            }
        }
    }
}

