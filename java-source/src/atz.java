/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dta
 *  lcr
 *  lcw
 */
import java.util.ArrayList;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class atz
extends btk
implements bto,
hsx,
lpc {
    private static final double bZA = 4.0;
    private static final int bZB = 100;
    private boolean bZC = false;
    private Map<ldv, a> bZD = lcn.emw();
    private boolean bZE = false;

    public atz() {
        lpd.rHs.a(this);
    }

    @Override
    public final void initialize() {
        super.initialize();
        if (lcw.qOS) {
            jnf jnf2 = (jnf)this.MessageDelegator.bzx().bzt().d(lcr.qDy);
            if (jnf2 != null) {
                jnf2.a(this);
            }
        } else {
            this.VI();
        }
    }

    @Override
    public void VG() {
        this.VH();
    }

    private void VH() {
        kga kga2 = (kga)this.MessageDelegator.BV(19);
        kga2.ts(this.GUID);
        kga2.setType(4);
        kga2.tr(this.GUID);
        this.MessageDelegator.b(kga2);
    }

    @Override
    public final void cleanUp() {
        super.cleanUp();
        if (lcw.qOS) {
            jnf jnf2 = (jnf)this.MessageDelegator.bzx().bzt().d(lcr.qDy);
            if (jnf2 != null) {
                jnf2.b(this);
            }
        } else {
            this.VJ();
        }
        this.VL();
    }

    private void VI() {
        fvp fvp2 = (fvp)this.MessageDelegator.h(12289, this.getGUID(), lcr.qCM);
        fvp2.iTm = 1;
        fvp2.dTe = 0;
        this.MessageDelegator.E(fvp2);
    }

    private void VJ() {
        fvv fvv2 = (fvv)this.MessageDelegator.h(12290, this.getGUID(), lcr.qCM);
        fvv2.iTm = 1;
        this.MessageDelegator.E(fvv2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 2328: {
                this.a((egi)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private boolean a(jnc jnc2) {
        if (!this.VM()) {
            return false;
        }
        if (jnc2 == null) {
            return false;
        }
        if (jnc2.dMZ() == null) {
            return false;
        }
        if (jnc2.dMZ() != aud.a.car && jnc2.dMZ() != aud.a.cap && jnc2.dMZ() != aud.a.caK && jnc2.dMZ() != aud.a.caG && jnc2.dMZ() != aud.a.caL && jnc2.dMZ() != aud.a.cat && jnc2.dMZ() != aud.a.cav) {
            return false;
        }
        if (jnc2.dNa() == null) {
            return false;
        }
        return !jnc2.dNa().toUpperCase().contains("EMOTE_MESSAGE");
    }

    private ldv dk(ldv ldv2) {
        if (ldv2 == null) {
            return null;
        }
        ldv ldv3 = new ldv(this.GUID.ib(), ldv2.enw(), 0);
        dta dta2 = this.MessageDelegator.bzx().bzt().od(ldv3);
        if (dta2 == null) {
            return null;
        }
        for (amf amf2 : dta2.bzr()) {
            if (!(amf2 instanceof bvj)) continue;
            return ((bvd)amf2).axa();
        }
        return null;
    }

    @Override
    public void VK() {
    }

    @Override
    public void a(jmz jmz2) {
        if (jmz2.dMQ() == jnd.nDk) {
            return;
        }
        jnc jnc2 = (jnc)jmz2;
        if (!this.a(jnc2)) {
            return;
        }
        ldv ldv2 = this.dk(jnc2.dMY());
        if (ldv2 == null) {
            return;
        }
        a a2 = this.bZD.get(ldv2);
        if (a2 == null) {
            if (this.bZD.size() >= 100) {
                return;
            }
            a2 = new a(this, ldv2);
            a2.bZG = jnc2;
            a2.bZH = false;
            a2.bZM = 4.0;
            this.bZD.put(ldv2, a2);
            a2.create();
        } else {
            a2.bZG = jnc2;
            a2.bZH = false;
            if (a2.active) {
                a2.VN();
            }
        }
    }

    @Override
    public void bY(boolean bl) {
        this.bZ(bl);
    }

    private void a(egi egi2) {
        if (!lcw.emV()) {
            return;
        }
        if (!this.VM()) {
            return;
        }
        if (egi2.crz.ccW != aud.a.car) {
            return;
        }
        ldv ldv2 = this.dk(egi2.crz.Ri);
        if (ldv2 == null) {
            return;
        }
        a a2 = this.bZD.get(ldv2);
        if (this.bZD.size() >= 100 && a2 == null) {
            return;
        }
        if (a2 != null) {
            if (a2.active) {
                a2.bZF = egi2.crz;
                a2.bZH = false;
                a2.VN();
            } else {
                a2.bZF = egi2.crz;
                a2.bZH = false;
            }
        } else {
            a2 = new a(this, ldv2);
            a2.bZF = egi2.crz;
            a2.bZH = false;
            a2.bZM = 4.0;
            this.bZD.put(ldv2, a2);
            a2.create();
        }
    }

    @Override
    public void receiveRenderResponse(kgz kgz2) {
        super.receiveRenderResponse(kgz2);
        if (kgz2.X() == 9) {
            kgu kgu2 = (kgu)kgz2;
            this.a(kgu2);
        }
    }

    private void a(kgu kgu2) {
        ldv ldv2 = kgu2.dZc();
        a a2 = this.bZD.get(ldv2);
        if (a2 == null) {
            this.dm(kgu2.dZa());
        } else {
            a2.a(kgu2);
        }
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        if (ktv2.egT() == 1024) {
            this.a((kux)ktv2);
        }
        if (ktv2.egT() == 768) {
            this.a((ktu)ktv2);
        }
    }

    private void a(kux kux2) {
        ldv ldv2 = kux2.dXg();
        a a2 = this.bZD.get(ldv2);
        if (a2 == null) {
            this.do(kux2.dJs);
        } else {
            a2.bZI = kux2.dJs;
            a2.activate();
        }
    }

    private void a(ktu ktu2) {
        ldv ldv2 = ktu2.dXg();
        a a2 = this.bZD.get(ldv2);
        if (a2 == null) {
            this.dn(ktu2.dJs);
        } else {
            a2.bZK = ktu2.dJs;
        }
    }

    private void dl(ldv ldv2) {
        a a2 = this.bZD.get(ldv2);
        a2.cleanup();
        this.bZD.remove(ldv2);
    }

    @Override
    public void doTick(ldz ldz2) {
        if (!this.bZE) {
            this.VH();
            this.bZE = true;
        }
        ArrayList<ldv> arrayList = lcn.emv();
        for (ldv ldv2 : this.bZD.keySet()) {
            a a2 = this.bZD.get(ldv2);
            if (!a2.visible) continue;
            a2.bZM -= ldz2.qwh;
            if (!(a2.bZM <= 0.0)) continue;
            a2.bZM = 0.0;
            arrayList.add(ldv2);
        }
        for (ldv ldv2 : arrayList) {
            this.dl(ldv2);
        }
    }

    private void dm(ldv ldv2) {
        kga kga2 = (kga)this.MessageDelegator.BV(19);
        kga2.ts(this.GUID);
        kga2.setType(2);
        kga2.setGUID(ldv2);
        this.MessageDelegator.b(kga2);
    }

    private void dn(ldv ldv2) {
        knj knj2 = (knj)this.MessageDelegator.h(778);
        knj2.ec = this.getGUID();
        knj2.ehv = ldv.rfe;
        knj2.ehw = ldv.rfe;
        knj2.dsK = false;
        knj2.iBr = false;
        knj2.doP = ldv2;
        knj2.pPN = 1;
        this.MessageDelegator.a(knj2);
    }

    public void do(ldv ldv2) {
        klb klb2 = (klb)this.MessageDelegator.h(1026);
        klb2.hC(ldv2);
        klb2.ts(this.getGUID());
        klb2.HX(klb.iHB);
        this.MessageDelegator.a(klb2);
    }

    private void VL() {
        for (a a2 : this.bZD.values()) {
            a2.cleanup();
        }
        this.bZD.clear();
    }

    public final boolean VM() {
        return this.bZC;
    }

    public final void bZ(boolean bl) {
        this.bZC = bl;
    }

    static /* synthetic */ dxr a(atz atz2) {
        return atz2.MessageDelegator;
    }

    static /* synthetic */ ldv b(atz atz2) {
        return atz2.GUID;
    }

    static /* synthetic */ dxr c(atz atz2) {
        return atz2.MessageDelegator;
    }

    static /* synthetic */ dxr d(atz atz2) {
        return atz2.MessageDelegator;
    }

    static /* synthetic */ dxr e(atz atz2) {
        return atz2.MessageDelegator;
    }

    static /* synthetic */ dxr f(atz atz2) {
        return atz2.MessageDelegator;
    }

    static /* synthetic */ ldv g(atz atz2) {
        return atz2.GUID;
    }

    static /* synthetic */ dxr h(atz atz2) {
        return atz2.MessageDelegator;
    }

    static /* synthetic */ dxr i(atz atz2) {
        return atz2.MessageDelegator;
    }

    static /* synthetic */ ldv j(atz atz2) {
        return atz2.GUID;
    }

    static /* synthetic */ dxr k(atz atz2) {
        return atz2.MessageDelegator;
    }

    static /* synthetic */ void a(atz atz2, ldv ldv2) {
        atz2.dm(ldv2);
    }

    static /* synthetic */ void b(atz atz2, ldv ldv2) {
        atz2.dn(ldv2);
    }
}

