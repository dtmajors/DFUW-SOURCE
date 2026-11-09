/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class hs
extends btk {
    private static final boolean bC = false;

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 8710: {
                assert (false);
                break;
            }
            case 22274: {
                this.a((ezg)dxq2);
                break;
            }
            case 22273: {
                this.a((ezk)dxq2);
                break;
            }
            case 22275: {
                this.a((ezd)dxq2);
                break;
            }
            case 22276: {
                this.a((ezf)dxq2);
                break;
            }
            case 22277: {
                this.a((ezh)dxq2);
                break;
            }
            case 22283: {
                this.a((ezi)dxq2);
                break;
            }
            case 22281: {
                this.a((ezj)dxq2);
                break;
            }
            case 22282: {
                this.a((eze)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(ezj ezj2) {
        gwp gwp2 = (gwp)this.MessageDelegator.h(25601, this.getGUID(), lcr.qBK);
        gwp2.gJx = ezj2.gJx;
        this.MessageDelegator.F(gwp2);
    }

    private void a(eze eze2) {
        fdz fdz2 = (fdz)this.MessageDelegator.h(27905, this.GUID, lcr.qBu);
        fdz2.Gs(eze2.iFT);
        fdz2.Gt(eze2.dJE);
        fdz2.setType(eze2.Type);
        this.MessageDelegator.F(fdz2);
    }

    private void a(ezf ezf2) {
        fes fes2 = (fes)this.MessageDelegator.h(19201, this.GUID, lcr.qBs);
        fes2.c(ezf2.Position);
        fes2.a(new lgl(ezf2.my));
        int n = lea.enW().getType(ezf2.Filename);
        assert (n != -1);
        fes2.l(n);
        this.MessageDelegator.F(fes2);
    }

    private void a(ezh ezh2) {
        gbx gbx2 = (gbx)this.MessageDelegator.h(23041, this.GUID, lcr.qBy);
        gbx2.jcY = ezh2.Position;
        gbx2.jcZ = new lgl(ezh2.my);
        gbx2.jdb = ezh2.DisplayName;
        gbx2.jdc = ezh2.dKz;
        gbx2.dKy = ezh2.dKy;
        gbx2.jda = ezh2.dKx;
        int n = lea.enW().getType(ezh2.ResourceName);
        assert (n != -1);
        gbx2.jdd = n;
        this.MessageDelegator.F(gbx2);
    }

    private void a(ezi ezi2) {
        gtu gtu2 = (gtu)this.MessageDelegator.h(28161, this.GUID, lcr.qBA);
        gtu2.jrG = ezi2.Position;
        gtu2.jrH = new lgl(ezi2.my);
        gtu2.jrI = ezi2.DisplayName;
        this.MessageDelegator.F(gtu2);
    }

    private void a(ezd ezd2) {
        int n = lea.enW().getType(ezd2.Filename);
        assert (n > 0);
        eaz eaz2 = (eaz)this.MessageDelegator.h(17411, this.GUID, lcr.qBo);
        eaz2.azF = ezd2.Name;
        eaz2.ResourceType = n;
        eaz2.Position = ezd2.Position;
        eaz2.Rotation = new lgl(ezd2.my);
        this.MessageDelegator.F(eaz2);
    }

    private void a(ezk ezk2) {
        gzb gzb2 = (gzb)this.MessageDelegator.h(20225, this.GUID, lcr.qBw);
        gzb2.ln(ezk2.Filename);
        gzb2.c(ezk2.Position);
        gzb2.a(new lgl(ezk2.my));
        gzb2.ms(true);
        this.MessageDelegator.F(gzb2);
    }

    private void a(ezg ezg2) {
    }
}

