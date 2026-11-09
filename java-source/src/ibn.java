/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 *  ibp
 */
import java.util.List;
import java.util.Map;

public class ibn
extends iye {
    public final ibp cMy() {
        return (ibp)super.djE();
    }

    public ibo PI(int n) {
        return (ibo)this.SF(n);
    }

    public idb PJ(int n) {
        iyi iyi2 = this.Tg(n);
        boolean bl = iyi2.dsO();
        boolean bl2 = iyi2.dsP();
        if (bl && bl2) {
            return idb.lIB;
        }
        if (bl) {
            return idb.lIA;
        }
        if (bl2) {
            return idb.lIz;
        }
        throw new Error("internal error");
    }

    public void a(idb idb2, int n) {
        boolean bl = idb2 == idb.lIA || idb2 == idb.lIB;
        boolean bl2 = idb2 == idb.lIz || idb2 == idb.lIB;
        this.a(bl, bl2, n);
        this.cMI();
    }

    public icw PK(int n) {
        iyi iyi2 = this.Tg(n);
        ibo ibo2 = (ibo)this.SF(n);
        icw icw2 = new icw();
        icw2.name = iyi2.dsJ().getText();
        icw2.lIi = icu.getIconFromResource(iyi2.dpl());
        icw2.lIj = iyi2.dsO() && iyi2.dsP() ? idb.lIB : (iyi2.dsO() ? idb.lIA : idb.lIz);
        icw2.lIk = ibo2.cMO();
        icw2.lIl = ibo2.cMP();
        icw2.lIm = ibo2.cMM();
        icw2.lIn = ibo2.cMN();
        icw2.lGf = ibo2.cML();
        return icw2;
    }

    public void a(int n, icw icw2) {
        this.a(n, icw2, false, false);
    }

    @Override
    public void kh(float f) {
        super.kh(f);
        for (int j = 0; j < this.doH(); ++j) {
            this.PI(j).kh(f);
        }
    }

    public void cMI() {
        itt itt2 = new itt("ChatTabView");
        for (int j = 0; j < this.doH(); ++j) {
            itt itt3 = new itt("ChatTab");
            itt2.a(itt3);
            itt3.a(new itx("IconResource", icu.convertResourceNameToResourceId(this.SJ(j))));
            itt3.a(new itx("TabName", this.SI(j)));
            itt3.a(new itx("InactiveTabHeaderType", this.PJ(j).name()));
            this.PI(j).a(itt3);
        }
        this.cMy().B("ChatTabView", itw.dri().c(itt2));
    }

    public boolean cMJ() {
        String string = this.djE().nj("ChatTabView");
        itt itt2 = (itt)itw.dri().rC(string);
        if (itt2 == null) {
            return false;
        }
        List<its> list = itt2.getChildren();
        for (int j = 0; j < list.size(); ++j) {
            itt itt3 = (itt)list.get(j);
            String string2 = icu.convertResourceIdToResourceName(itt3.T("IconResource", null));
            if (string2 == null) {
                string2 = icu.getDefaultChatIcon().cOb();
            }
            String string3 = itt3.T("TabName", lvw.tbC.bD(new Object[0]).exA());
            String string4 = itt3.T("InactiveTabHeaderType", idb.values()[0].name());
            ibo ibo2 = this.cMy().cMY();
            ibo2.b(itt3);
            this.a((ipf)ibo2, string2, string3);
            this.a(idb.valueOf(string4), j);
        }
        return true;
    }

    @Override
    public isb cMK() {
        return new iyi(this){
            final /* synthetic */ ibn lFq;
            {
                this.lFq = ibn2;
            }

            public ifg dy(int n, int n2) {
                return this.lFq.a(this, n, n2);
            }

            public void cGR() {
                this.lFq.a(this);
            }

            public void cbU() {
                this.lFq.b(this);
            }

            public hyn dz(int n, int n2) {
                1 var3_3 = this;
                this.djE();
                int n3 = ioa.cxP().bpb();
                this.djE();
                return new ibl(this, n3, ioa.cxP().bpc(), var3_3){
                    final /* synthetic */ iyi lFr;
                    final /* synthetic */ 1 lFs;
                    {
                        this.lFs = var1_1;
                        this.lFr = iyi2;
                        super(n, n2);
                    }

                    public void cbU() {
                        this.lFr.cbU();
                    }

                    public void cGR() {
                        this.lFr.cGR();
                    }
                };
            }
        };
    }

    @Override
    public boolean dx(int n, int n2) {
        this.djE();
        if (ioa.cyJ().cIF() == 1 && this.doH() == 1) {
            return false;
        }
        return super.dx(n, n2);
    }

    @Override
    public ifg a(isb isb2, int n, int n2) {
        return ioa.a(n, n2, new ibm((ibp)this.djE(), this, isb2, n, n2));
    }

    @Override
    public boolean m(ifg ifg2) {
        return ioa.a(ifg2, ibm.class);
    }

    @Override
    public void a(ifg ifg2, int n) {
        boolean bl;
        ibm ibm2 = (ibm)ioa.o(ifg2);
        boolean bl2 = bl = !ibm2.cMG();
        if (bl && ibm2.cMy() == this.djE()) {
            int n2 = this.c(ibm2.cMA());
            if (n > n2) {
                --n;
            }
            if (n == n2) {
                return;
            }
        }
        icw icw2 = ibm2.cMy().cMU().PK(ibm2.cMC());
        if (bl) {
            ibm2.cMy().PQ(ibm2.cMC());
        }
        this.cMy().c(n, icw2);
    }

    @Override
    public void a(isb isb2) {
        this.djE();
        ioa.cyJ().a(lvw.tca.bD(isb2.dan().getText()), new hyr(this, isb2){
            final /* synthetic */ isb lFt;
            final /* synthetic */ ibn lFq;
            {
                this.lFq = ibn2;
                this.lFt = isb2;
            }

            public void oH(boolean bl) {
                if (bl) {
                    ((ibp)this.lFq.djE()).PR(this.lFq.c(this.lFt));
                }
            }
        });
    }

    @Override
    public void b(isb isb2) {
        iyi iyi2 = (iyi)isb2;
        int n = this.c(iyi2);
        icw icw2 = this.PK(n);
        ioc ioc2 = iyi2.eo(0, 0);
        icx icx2 = new icx(this, (ibp)this.djE(), new joa(ioc2.cf, ioc2.cg, iyi2.getWidth(), iyi2.getHeight()), icw2, n){
            final /* synthetic */ int lFu;
            final /* synthetic */ ibn lFq;
            {
                this.lFq = ibn2;
                this.lFu = n;
                super(ibp2, joa2, icw2);
            }

            protected void a(icw icw2, boolean bl, boolean bl2) {
                ibn.a(this.lFq, this.lFu, icw2, bl, bl2);
            }
        };
        icx2.setGUID(this.djE().getMessageDelegator().bzv());
        this.djE().getMessageDelegator().a((amf)((Object)icx2));
    }

    @Override
    public void d(joa joa2) {
        Map<ibs, icr> map = lcn.emw();
        for (ibs ibs2 : ibz.cNn()) {
            ibs2.b(map, false);
        }
        this.cMy().a(icu.getDefaultChatIcon().cOb(), lvw.tbC.bD(new Object[0]).exA(), map);
        this.Tg(this.doH() - 1).cfZ();
    }

    @Override
    public void PL(int n) {
        iyi iyi2 = this.Tg(n);
        ((isb)iyi2).kh(this.cMy().cXQ());
        this.cMI();
    }

    @Override
    public void PM(int n) {
        this.cMI();
    }

    private void a(int n, icw icw2, boolean bl, boolean bl2) {
        ibo ibo2 = this.PI(n);
        this.H(icw2.name, n);
        this.I(icw2.lIi != null ? icw2.lIi.cOb() : null, n);
        ibo2.pF(icw2.lIm);
        ibo2.J(icw2.lGf);
        if (bl2) {
            this.djE();
            for (ibp ibp2 : ioa.cyJ().cIE()) {
                ibn ibn2 = ibp2.cMU();
                for (int j = 0; j < ibn2.doH(); ++j) {
                    ibn2.b(j, icw2);
                }
                ibn2.cMI();
                ibp2.cMT();
            }
        } else if (bl) {
            for (int j = 0; j < this.doH(); ++j) {
                this.b(j, icw2);
            }
            this.cMI();
            this.cMy().cMT();
        } else {
            this.b(n, icw2);
            this.cMI();
            this.cMy().PO(n);
        }
    }

    private void b(int n, icw icw2) {
        ibo ibo2 = this.PI(n);
        this.a(icw2.lIj, n);
        ibo2.pG(icw2.lIk);
        ibo2.pH(icw2.lIl);
        ibo2.PN(icw2.lIn);
        ibo2.K(icw2.lGf);
    }

    static /* synthetic */ void a(ibn ibn2, int n, icw icw2, boolean bl, boolean bl2) {
        ibn2.a(n, icw2, bl, bl2);
    }
}

