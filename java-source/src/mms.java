/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  lcr
 *  lcw
 */
import java.util.Map;

public class mms {
    private Map<b, a> DNz = lcn.emw();
    private aux DEC;
    private ldv gte = null;
    private ldv DNn = null;
    private eh ehx;

    public mms(aux aux2) {
        this.DEC = aux2;
        a a2 = new a(this, null);
        a2.DNB = "waw_sword001.xml";
        a2.byk = "AttachPoint_Weapon";
        a2.dbx = this.DEC.bzv();
        a2.DNA = b.DND;
        this.DNz.put(a2.DNA, a2);
        this.j(lcw.qLb + "xml/waw/" + a2.DNB, a2.dbx);
        a2 = new a(this, null);
        a2.DNB = "waw_greatclub_headcrusher_01.xml";
        a2.byk = "AttachPoint_Weapon TwoHanded";
        a2.dbx = this.DEC.bzv();
        a2.DNA = b.DNE;
        this.DNz.put(a2.DNA, a2);
        this.j(lcw.qLb + "xml/waw/" + a2.DNB, a2.dbx);
        a2 = new a(this, null);
        a2.DNB = "waw_dagger_001.xml";
        a2.byk = "AttachPoint_Weapon";
        a2.dbx = this.DEC.bzv();
        a2.DNA = b.DNF;
        this.DNz.put(a2.DNA, a2);
        this.j(lcw.qLb + "xml/waw/" + a2.DNB, a2.dbx);
        a2 = new a(this, null);
        a2.DNB = "waw_staff_human_01.xml";
        a2.byk = "AttachPoint_Weapon Halberd";
        a2.dbx = this.DEC.bzv();
        a2.DNA = b.DNG;
        this.DNz.put(a2.DNA, a2);
        this.j(lcw.qLb + "xml/waw/" + a2.DNB, a2.dbx);
        try {
            Thread.sleep(200L);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }

    private void j(String string, ldv ldv2) {
        hac hac2 = (hac)this.DEC.d(4097);
        hac2.on(lcr.qAE);
        hac2.f(lcr.qzr);
        hac2.Lb(1);
        hac2.setFileName(string);
        hac2.hC(ldv2);
        this.DEC.a((dxq)hac2);
    }

    public void eFD() {
    }

    private void eFE() {
        if (this.gte != null) {
            this.gte = null;
        }
        if (this.DNn == null) {
            return;
        }
        if (this.gte != null) {
            return;
        }
        this.gte = this.DEC.bzv();
        gzx gzx2 = (gzx)this.DEC.d(4112);
        if (this.ehx.fa() == 0) {
            gzx2.KZ(5);
        } else if (this.ehx.fa() == 1) {
            gzx2.KZ(64);
            gzx2.mu(true);
        } else assert (false);
        gzx2.on(this.DNn);
        gzx2.f(lcr.qzr);
        gzx2.qJ(this.DNn);
        gzx2.qI(this.DNn);
        gzx2.setAttachPointName("");
        gzx2.setFrameName(this.ehx.getFrameName());
        gzx2.setRotation(this.ehx.getRotation());
        gzx2.K(this.ehx.fb());
        gzx2.kX(this.gte);
        gzx2.ac(this.ehx.fa());
        this.DEC.a((dxq)gzx2);
    }

    private void eFF() {
        if (this.gte == null || this.DNn == null) {
            lfn.b(4, this.getClass().getSimpleName(), "detachItemButton_ActionPerformed() : Nothing attached! AttachPointRelationGUID = " + this.gte + ", AttachableObjectGUID = " + this.DNn);
            return;
        }
        gzx gzx2 = (gzx)this.DEC.d(4112);
        gzx2.KZ(2);
        gzx2.on(this.DNn);
        gzx2.f(lcr.qzr);
        gzx2.qJ(this.DNn);
        gzx2.qI(this.DNn);
        gzx2.setAttachPointName("");
        gzx2.setFrameName(this.ehx.getFrameName());
        gzx2.setRotation(new ljq());
        gzx2.K(new ljq());
        gzx2.kX(this.gte);
        gzx2.ac(this.ehx.fa());
        this.DEC.a((dxq)gzx2);
        this.gte = null;
    }
}

