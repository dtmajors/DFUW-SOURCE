/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Map;

public class dpn
extends dpl {
    private Map<ldv, cpw> gMG = lcn.emw();
    private Map<ldv, cpw> gMH = lcn.emw();
    private Map<Integer, gzb> gMI = lcn.emw();
    private int bRk = 1;

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 20225: {
                this.a((gzb)dxq2);
                break;
            }
            case 20227: {
                this.a((gzi)dxq2);
                break;
            }
            case 11527: {
                this.b((fon)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(gzb gzb2) {
        String string = "xml-files/server/vendor/vendors/";
        String string2 = string + gzb2.bYq();
        if (gzb2.bFj()) assert (gzb2.bFz() != null);
        fob fob2 = (fob)this.MessageDelegator.h(11521, this.getGUID(), lcr.qzt);
        fob2.cd(string2);
        fob2.c(gzb2.av());
        fob2.setRotation(gzb2.aw().eqT());
        fob2.pM(this.getGUID());
        fob2.sk(this.bRk);
        fob2.lj(gzb2.bYr());
        if (gzb2.bFj()) {
            fob2.pL(this.MessageDelegator.lL(gzb2.bFz()));
        } else {
            fob2.pL(this.MessageDelegator.bzv());
        }
        this.MessageDelegator.F(fob2);
        this.gMI.put(new Integer(this.bRk), gzb2);
        ++this.bRk;
    }

    private void a(gzi gzi2) {
        assert (gzi2.bYs() != null);
        cpw cpw2 = null;
        cpw2 = gzi2.bYv() ? this.gMH.remove(gzi2.bYs()) : this.gMG.remove(gzi2.bYs());
        if (cpw2 == null) {
            return;
        }
        this.b(cpw2);
    }

    private void b(fon fon2) {
        gzb gzb2 = this.gMI.get(fon2.aqs);
        if (gzb2 == null) {
            return;
        }
        if (fon2.iSe == null) {
            this.a(gzb2, null);
            return;
        }
        assert (fon2.iSe instanceof cpw);
        cpw cpw2 = (cpw)fon2.iSe;
        gga gga2 = (gga)this.MessageDelegator.h(6159, this.getGUID(), lcr.qCv);
        gga2.jgt = true;
        gga2.ResourceType = cpw2.az();
        this.MessageDelegator.F(gga2);
        if (!gzb2.bFj()) {
            this.gMG.put(cpw2.getGUID(), cpw2);
        } else {
            this.gMH.put(cpw2.getGUID(), cpw2);
            this.a(gzb2, cpw2);
        }
    }

    private void a(gzb gzb2, cpw cpw2) {
        gzc gzc2 = (gzc)this.MessageDelegator.h(20226, this.getGUID(), gzb2.aO());
        this.MessageDelegator.b(gzb2, gzc2);
        if (cpw2 != null) {
            gzc2.qG(cpw2.getGUID());
            gzc2.c(cpw2);
        } else {
            gzc2.qG(null);
            gzc2.c(null);
        }
        this.MessageDelegator.F(gzc2);
    }

    private void b(cpw cpw2) {
        assert (cpw2 != null);
        if (cpw2.getGUID().ib() != this.GUID.ib()) {
            return;
        }
        gga gga2 = (gga)this.MessageDelegator.h(6159, this.getGUID(), lcr.qCv);
        gga2.jgt = false;
        gga2.ResourceType = cpw2.az();
        this.MessageDelegator.F(gga2);
        if (cpw2.getGUID().enw() == this.GUID.enw()) {
            this.MessageDelegator.hd(cpw2.getGUID());
            return;
        }
        fub fub2 = (fub)this.MessageDelegator.h(1027, this.GUID, cpw2.getGUID());
        this.MessageDelegator.F(fub2);
    }
}

