/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ha
 *  lcr
 */
import java.util.List;

public class ati
extends atg {
    private List<eaa> aar = lcn.emv();

    @Override
    public void initialize() {
        super.initialize();
        if (this.aar == null || this.aar.isEmpty()) {
            return;
        }
        for (eaa eaa2 : this.aar) {
            this.receiveMessage(eaa2);
        }
        this.aar.clear();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 22785: {
                this.a((eaa)dxq2);
                break;
            }
            case 22786: {
                this.a((eae)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(eae eae2) {
        if (this.MessageDelegator == null) {
            lfn.b(5, "SFAnnotationManagerServer", "handleAnnotationRemoveMessage() MessageDelegator == null");
            return;
        }
        eaf eaf2 = (eaf)this.MessageDelegator.h(22788, eae2.amk(), eae2.aO());
        eaf2.aqs = eae2.aqs;
        eaf2.Zn = new atf[1];
        eaf2.Zn[0] = this.hZ(eae2.iks);
        if (eaf2.Zn[0] != null) {
            eaf2.ex = 3;
        } else {
            eaf2.Zn = null;
            eaf2.ex = 5;
        }
        this.MessageDelegator.F(eaf2);
    }

    private void a(eaa eaa2) {
        boolean bl = true;
        if (eaa2.aFo == null) {
            bl = false;
        } else if (eaa2.ResourceType <= 0) {
            bl = false;
        } else if (eaa2.Position == null) {
            bl = false;
        } else if (eaa2.aFp && this.Vf() >= 60) {
            bl = false;
        }
        if (this.MessageDelegator == null) {
            this.aar.add(eaa2);
            return;
        }
        eaf eaf2 = (eaf)this.MessageDelegator.h(22788, eaa2.amk(), eaa2.aO());
        eaf2.aqs = eaa2.aqs;
        if (bl) {
            int n = this.a(0, eaa2.aFo, eaa2.ResourceType, eaa2.Position, eaa2.aFp, eaa2.aXn);
            if (n != 0) {
                eaf2.ex = 2;
                atf atf2 = (atf)this.bYj.get(n);
                eaf2.Zn = new atf[]{atf2};
                ha ha2 = (ha)this.MessageDelegator.d(new ldv(this.getGUID().ib(), this.getGUID().enw(), 50));
                if (ha2 == null) {
                    assert (false);
                } else {
                    ha2.a(this.Ve());
                }
            } else {
                eaf2.ex = 4;
            }
        } else {
            eaf2.ex = 4;
        }
        this.MessageDelegator.F(eaf2);
    }

    public void b(atf[] atfArray) {
        if (atfArray == null) {
            return;
        }
        int n = atfArray.length;
        for (int i = 0; i < n; ++i) {
            this.a(atfArray[i].ID, atfArray[i].aFo, atfArray[i].ResourceType, atfArray[i].Position, atfArray[i].aFp, null);
        }
    }

    private void e(atf atf2) {
        gya gya2 = (gya)this.MessageDelegator.h(12052, this.GUID, lcr.qAI);
        gya2.aXP = 1;
        gya2.iks = atf2.ID;
        gya2.Position = atf2.Position;
        gya2.ResourceType = atf2.ResourceType;
        gya2.aFo = atf2.aFo;
        gya2.aXn = atf2.aXn;
        gya2.aFp = atf2.aFp;
        this.MessageDelegator.F(gya2);
    }

    private void ia(int n) {
        gya gya2 = (gya)this.MessageDelegator.h(12052, this.GUID, lcr.qAI);
        gya2.aXP = 4;
        gya2.iks = n;
        gya2.Position = new ljq(0.0f, 0.0f, 0.0f);
        gya2.aFo = "";
        this.MessageDelegator.F(gya2);
    }

    @Override
    protected void c(atf atf2) {
        this.e(atf2);
    }

    @Override
    protected void d(atf atf2) {
        this.ia(atf2.ID);
    }
}

