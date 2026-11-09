/*
 * Decompiled with CFR.
 */
import java.util.List;

public class jiv {
    private static final boolean nht = true;
    private static final String TC = "SFQuestInteractionManagerHandler";
    private final jja lex;
    private List<bpj> aCS = null;
    private ldv nhu = null;

    public jiv(jja jja2) {
        this.lex = jja2;
    }

    public void rQ(ldv ldv2) {
        assert (this.nhu == null);
        this.nhu = ldv2;
        if (this.nhu == null) {
            return;
        }
        this.mU(true);
        this.tx(false);
        this.aCS = lcn.emv();
    }

    public void shutdown() {
        if (this.nhu == null) {
            return;
        }
        this.mU(false);
        this.nhu = null;
        this.aCS.clear();
        this.aCS = null;
    }

    public void n(dxq dxq2) {
        if (this.nhu == null) {
            return;
        }
        int n = dxq2.bEz();
        switch (n) {
            case 11784: {
                this.b((fkx)dxq2);
                break;
            }
            case 11786: {
                break;
            }
            case 12291: {
                this.tx(false);
                break;
            }
            case 10245: {
                gdg gdg2 = (gdg)dxq2;
                if (!gdg2.jer) break;
                this.tx(true);
                break;
            }
        }
    }

    private void b(fkx fkx2) {
        fkx fkx3 = fkx2;
        this.aCS.clear();
        if (fkx3.iOX == null || fkx3.iOX.length == 0) {
            return;
        }
        for (bpj bpj2 : fkx3.iOX) {
            this.aCS.add(bpj2);
        }
    }

    public final void tx(boolean bl) {
        fkw fkw2 = (fkw)this.lex.getMessageDelegator().h(11783, this.lex.getGUID(), this.nhu);
        fkw2.iPd = bl;
        this.lex.getMessageDelegator().F(fkw2);
    }

    public void rR(ldv ldv2) {
        bpj bpj2 = this.rT(ldv2);
        if (bpj2 == null) {
            return;
        }
        fku fku2 = (fku)this.lex.getMessageDelegator().h(11785, this.lex.getGUID(), this.nhu);
        fku2.iOY = ldv2;
        this.lex.getMessageDelegator().F(fku2);
    }

    public void rS(ldv ldv2) {
        bpj bpj2 = this.rT(ldv2);
        if (bpj2 == null) {
            return;
        }
        ldv ldv3 = hso.cxK().bAn().Tr;
        gdf gdf2 = (gdf)this.lex.getMessageDelegator().h(10244, this.lex.getGUID(), ldv3);
        gdf2.IR(3);
        gdf2.IS(ldv2.enx());
        gdf2.jM(true);
        this.lex.getMessageDelegator().F(gdf2);
    }

    @Deprecated
    public void sn(String string) {
        bpj bpj2 = this.sp(string);
        if (bpj2 == null) {
            return;
        }
        fku fku2 = (fku)this.lex.getMessageDelegator().h(11785, this.lex.getGUID(), this.nhu);
        fku2.iOY = bpj2.getGUID();
        this.lex.getMessageDelegator().F(fku2);
    }

    @Deprecated
    public void so(String string) {
        int n = lea.eoU().ju(string);
        if (n == -1) {
            lfn.b(5, TC, "cancelQuest() There is no quest with name  : " + string);
            return;
        }
        boolean bl = lea.eoU().Cj(n);
        if (bl) {
            lfn.b(5, TC, "cancelQuest() Quest with ID : " + n + " is a simple quest and can not be canceled.");
            return;
        }
        ldv ldv2 = hso.cxK().bAn().Tr;
        gdf gdf2 = (gdf)this.lex.getMessageDelegator().h(10244, this.lex.getGUID(), ldv2);
        gdf2.IR(3);
        gdf2.lJ(false);
        gdf2.IS(n);
        gdf2.IT(0);
        gdf2.jM(true);
        this.lex.getMessageDelegator().F(gdf2);
    }

    private bpj sp(String string) {
        if (this.nhu == null) {
            return null;
        }
        if (string == null || string.trim().isEmpty()) {
            lfn.b(5, TC, "getQuestByName() Invalid quest name : " + string);
            return null;
        }
        for (bpj bpj2 : this.aCS) {
            if (!bpj2.ats().toString().toLowerCase().contains(string.toLowerCase())) continue;
            return bpj2;
        }
        return null;
    }

    private bpj rT(ldv ldv2) {
        if (this.nhu == null) {
            return null;
        }
        if (ldv2 == null) {
            lfn.b(5, TC, "getQuestByGUID() Invalid quest guid.");
            return null;
        }
        for (bpj bpj2 : this.aCS) {
            if (!bpj2.getGUID().equals(ldv2)) continue;
            return bpj2;
        }
        return null;
    }

    private void mU(boolean bl) {
        if (bl) {
            this.m(this.nhu, 1, hvg.ldG.ordinal());
        } else {
            this.ae(this.nhu, hvg.ldG.ordinal());
        }
    }

    private void m(ldv ldv2, int n, int n2) {
        fvp fvp2 = (fvp)this.lex.getMessageDelegator().h(12289, this.lex.getGUID(), ldv2);
        fvp2.iTm = n;
        fvp2.dTe = n2;
        this.lex.getMessageDelegator().E(fvp2);
    }

    private void ae(ldv ldv2, int n) {
        fvv fvv2 = (fvv)this.lex.getMessageDelegator().h(12290, this.lex.getGUID(), ldv2);
        fvv2.iTm = n;
        this.lex.getMessageDelegator().E(fvv2);
    }
}

