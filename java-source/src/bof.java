/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.ArrayList;

public class bof
extends bny {
    public static final int dxx = 1;
    private ldv SA = null;
    private bpj[] dxy = null;
    private lex dxz = null;

    public bof() {
        super(false);
    }

    @Override
    public boolean arY() {
        return super.arY();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11783: {
                this.a((fkw)dxq2);
                break;
            }
            case 11785: {
                this.a((fku)dxq2);
                break;
            }
            case 11788: {
                this.a((fkt)dxq2);
                break;
            }
            case 12289: {
                this.a((fvp)dxq2);
                break;
            }
            case 12290: {
                this.a((fvv)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(fkw fkw2) {
        if (fkw2.iPd) {
            int n = ((boj)this.dwJ).aso();
            ldv ldv2 = lcr.ak((ldv)this.GUID, (int)n);
            fks fks2 = (fks)this.MessageDelegator.h(11787, this.GUID, ldv2);
            fks2.SA = this.SA;
            fks2.iOS = 1;
            fks2.adA = lcr.ak((ldv)lcr.qzp, (int)this.GUID.ib());
            this.MessageDelegator.F(fks2);
            return;
        }
        fkx fkx2 = (fkx)this.MessageDelegator.h(11784, this.GUID, fkw2.aO());
        fkx2.iOX = this.dxy;
        this.MessageDelegator.F(fkx2);
    }

    private void a(fku fku2) {
        assert (this.SA != null);
        if (fku2.iOY == null) {
            return;
        }
        int n = ((boj)this.dwJ).aso();
        assert (n > 0);
        fku2.f(this.GUID);
        fku2.on(lcr.ak((ldv)this.GUID, (int)n));
        fku2.SA = this.SA;
        fku2.adA = lcr.ak((ldv)lcr.qzp, (int)this.GUID.ib());
        this.MessageDelegator.F(fku2);
    }

    private void a(fkt fkt2) {
        if (fkt2.iOX == null) {
            return;
        }
        if (this.SA == null) {
            if (fkt2.SA == null) {
                return;
            }
            this.SA = fkt2.SA;
        }
        assert (this.SA != null);
        bpj[] bpjArray = fkt2.iOX;
        for (int i = 0; i < bpjArray.length; ++i) {
            Object object;
            bpj bpj2 = bpjArray[i];
            int n = bpj2.atx();
            if (n > 0) {
                object = (lgw)lea.enW().acv(n);
                bpj2.a(((lgw)object).atw());
            } else {
                bpj2.a(lhu.rnR);
            }
            object = bpj2.aty();
            int[] nArray = bpj2.atz();
            ArrayList<bpl> arrayList = lcn.emv();
            for (int j = 0; j < ((Object)object).length; ++j) {
                arrayList.add(new bpl((int)object[j], nArray[j]));
            }
            bpj2.ak(arrayList);
        }
        this.dxy = fkt2.iOX;
        this.ln(1);
    }

    private void a(fvr fvr2) {
        switch (fvr2.bEz()) {
            case 12289: {
                fvp fvp2 = (fvp)fvr2;
                if (fvp2.dTe <= 0) {
                    return;
                }
                if (fvp2.iTm <= 0) {
                    return;
                }
                if (fvp2.iTm != 1) break;
                if (this.dxz != null) {
                    return;
                }
                this.dxz = new lex();
                this.dxz.iHR = fvp2.aO();
                this.dxz.dTe = fvp2.dTe;
                break;
            }
            case 12290: {
                fvv fvv2 = (fvv)fvr2;
                if (fvv2.iTm <= 0) {
                    return;
                }
                if (fvv2.iTm != 1) break;
                if (this.dxz == null) {
                    return;
                }
                this.dxz = null;
                break;
            }
        }
    }

    private void ln(int n) {
        switch (n) {
            case 1: {
                if (this.dxz == null || this.dxz.rjR >= this.MessageDelegator.arc().lpr) break;
                this.I(this.dxz.iHR, this.dxz.dTe);
                this.dxz.rjR = this.MessageDelegator.arc().lpr;
                break;
            }
        }
    }

    private void I(ldv ldv2, int n) {
        fvt fvt2 = (fvt)this.MessageDelegator.h(12291, this.GUID, ldv2);
        fvt2.dTe = n;
        this.MessageDelegator.F(fvt2);
    }
}

