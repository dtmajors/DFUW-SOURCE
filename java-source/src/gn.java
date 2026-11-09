/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dta
 *  dtc
 *  ha
 *  is
 *  lcr
 *  lcw
 */
import java.util.Collection;
import java.util.Map;

public class gn
extends btk {
    private static final boolean bC = false;
    private static final String WY = "clientobject.xml";
    private Map<Integer, fp> WZ = lcn.emw();
    private Map<ldv, fv> Xa = lcn.emw();
    private is Xb = null;
    private ht Xc = null;
    private boolean Xd = false;

    public gn() {
        if (lcw.enb()) {
            this.Xd = true;
        }
    }

    @Override
    public boolean isReadyToRun() {
        return this.Xd;
    }

    public void a(is is2) {
        this.Xb = is2;
    }

    public void a(ht ht2) {
        this.Xc = ht2;
    }

    public fv ar(ldv ldv2) {
        return this.Xa.get(ldv2);
    }

    public void as(ldv ldv2) {
        this.WZ.remove(ldv2.ib());
        this.Xb.agp.bn(ldv2);
        fv fv2 = this.Xa.remove(ldv2);
        gra gra2 = (gra)this.MessageDelegator.h(11024, this.GUID, ldv2);
        gra2.ml(true);
        this.MessageDelegator.E(gra2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11021: {
                assert (false);
                break;
            }
            case 11023: {
                this.a((gqz)dxq2);
                break;
            }
            case 11059: {
                this.a((gpo)dxq2);
                break;
            }
            case 11523: {
                this.a((fnx)dxq2);
                break;
            }
            case 11530: {
                this.a((foa)dxq2);
                break;
            }
            case 11083: {
                this.a((gqo)dxq2);
                break;
            }
            case 11090: {
                this.ia();
                break;
            }
            default: {
                super.receiveMessage(dxq2);
                return;
            }
        }
    }

    private void ia() {
        this.Xd = true;
        gh.hX().a(gh.a.WD);
    }

    private void a(gqo gqo2) {
        dtc dtc2 = ((dta)this.MessageDelegator).bzt();
        int n = 0;
        assert (dtc2 != null);
        Map map = dtc2.am();
        for (dta dta2 : map.values()) {
            gqp gqp2 = (gqp)this.MessageDelegator.h(11084, this.GUID, gqo2.aO());
            gqp2.GUID = dta2.getGUID().toString();
            gqp2.ejK = dta2.getClass().getSimpleName();
            gqp2.ejL = "---- OS ----";
            this.MessageDelegator.E(gqp2);
            Collection collection = dta2.bzr();
            for (amf amf2 : collection) {
                gqp2 = (gqp)this.MessageDelegator.h(11084, this.GUID, gqo2.aO());
                gqp2.GUID = amf2.getGUID().toString();
                gqp2.ejK = amf2.getClass().getSimpleName();
                gqp2.ejL = amf2.toString();
                this.MessageDelegator.E(gqp2);
                ++n;
            }
        }
        gqp gqp3 = (gqp)this.MessageDelegator.h(11084, this.GUID, gqo2.aO());
        gqp3.GUID = "--- END OF LIST";
        gqp3.ejK = "ObjectCount = " + n;
        gqp3.ejL = "-----------------------------";
        gqp3.jpt = true;
        this.MessageDelegator.E(gqp3);
    }

    @Override
    public void receiveMiddlewareMessage(kcz kcz2) {
        switch (kcz2.getMessageType()) {
            case 258: {
                assert (false);
                break;
            }
            case 270: {
                break;
            }
            default: {
                super.receiveMiddlewareMessage(kcz2);
            }
        }
    }

    public fp bM(int n) {
        fp fp2 = this.WZ.get(n);
        if (fp2 == null) {
            // empty if block
        }
        return fp2;
    }

    private void a(gqz gqz2) {
        if (gqz2.bWP() == null) {
            return;
        }
        this.e(gqz2.bWP(), false);
    }

    private void a(gpo gpo2) {
        fp fp2 = gpo2.joK;
        if (fp2.di <= 0) {
            if (gpo2.joL) {
                this.aH("Invalid NodeID");
            }
            return;
        }
        if (fp2.hB < 0) {
            if (gpo2.joL) {
                this.aH("Invalid AccountID");
            }
            return;
        }
        if (fp2.SN < 0) {
            if (gpo2.joL) {
                this.aH("Invalid CharacterID");
            }
            return;
        }
        if (fp2.hE == null || fp2.hE.trim().equals("")) {
            if (gpo2.joL) {
                this.aH("Invalid AccountName");
            }
            return;
        }
        if (fp2.SS == -1) {
            if (gpo2.joL) {
                this.aH("Invalid AccessLevel");
            }
            return;
        }
        if (fp2.hB == 0 && fp2.SN == 0 && fp2.hE.equals("AI")) {
            this.b(fp2, gpo2.joL);
            return;
        }
        int n = fp2.di;
        if (gpo2.joL) {
            this.d(fp2);
            return;
        }
        for (ldv ldv2 : this.Xa.keySet()) {
            if (ldv2.ib() != n) continue;
            this.e(ldv2, gpo2.joM);
            return;
        }
        lfn.b(5, this.getClass().getSimpleName(), "handleSystemClientConnectMessage() : Disconnect from an unknown NodeID [" + n + "]. Not good at all.");
    }

    private void aH(String string) {
        gpp gpp2 = (gpp)this.MessageDelegator.h(11071, this.GUID, lcr.hac);
        gpp2.joN = false;
        gpp2.aMH = string;
        this.MessageDelegator.E(gpp2);
    }

    private void b(fp fp2, boolean bl) {
        assert (fp2.di > 0);
        assert (fp2.hB == 0);
        assert (fp2.SN == 0);
        int n = fp2.di;
        ldv ldv2 = lcr.p((ldv)lcr.qzp, (int)n, (int)lcr.qzp.enw());
        if (bl) {
            gql gql2 = (gql)this.MessageDelegator.h(11018, ldv2, lcr.qAS);
            gql2.adA = ldv2;
            gql2.adD = true;
            this.MessageDelegator.E(gql2);
        } else {
            this.Xc.ch(n);
            this.Xb.agp.bn(ldv2);
        }
    }

    private void d(fp fp2) {
        assert (fp2 != null) : "AccountInfo == null";
        assert (fp2.di > 0);
        assert (fp2.hB > 0);
        assert (fp2.SN > 0);
        int n = fp2.di;
        ldv ldv2 = lcr.p((ldv)lcr.qzp, (int)n, (int)fp2.SN);
        ldv ldv3 = lcr.fO((int)this.GUID.ib(), (int)fp2.SN);
        Integer n2 = new Integer(ldv2.ib());
        if (this.Xa.containsKey(ldv2)) {
            fv fv2 = this.Xa.get(ldv2);
            lfn.b(4, "SFLoginManager", "loginClient() SystemOSGUID already in Map. Already Logged in with SystemOSGUID=" + fv2.hk() + " and AccountID = " + fv2.aN() + ". New SystemOSGUID = " + ldv2 + ", and AccountID = " + fp2.hB);
            this.d(ldv2.ib(), "Already logged in. Reason: #1");
            return;
        }
        if (lcw.enb()) {
            this.WZ.put(n2, fp2);
            this.a(ldv2, lcw.hC.enw(), fp2.hE, WY);
            return;
        }
        fv fv3 = this.a(ldv3, ldv2, fp2);
        if (fv3 == null) {
            ha ha2 = (ha)this.MessageDelegator.bzx().bzt().d(ldv3);
            if (ha2 == null) {
                lfn.b(4, this.getClass().getSimpleName(), "loginClient() : ClientObject == null. PSO does not exist. PSO GUID =" + ldv3 + ", SystemOSGUID = " + ldv2);
                this.d(ldv2.ib(), "Character does not exist");
            } else if (ha2.jb() == fk.a.Rx) {
                lfn.b(4, this.getClass().getSimpleName(), "loginClient() : ClientObject == null. Still saving character. PSO GUID =" + ldv3 + ", SystemOSGUID = " + ldv2);
                this.d(ldv2.ib(), "Still saving character");
            } else {
                lfn.b(4, this.getClass().getSimpleName(), "loginClient() : ClientObject == null. Already logged in. PSO GUID =" + ldv3 + ", SystemOSGUID = " + ldv2);
                this.d(ldv2.ib(), "Already logged in. Reason #2");
            }
            return;
        }
        this.WZ.put(n2, fp2);
        fv3.v(fp2.hB);
        fv3.a(fp2.hf());
        this.Xa.put(ldv2, fv3);
    }

    public fv a(ldv ldv2, ldv ldv3, fp fp2) {
        ha ha2 = (ha)this.MessageDelegator.bzx().bzt().d(ldv2);
        if (ha2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "setupPSOAndGetClientObject() PSO does not exist, for PSOGUID = " + ldv2);
            return null;
        }
        if (!ha2.ja()) {
            lfn.b(2, this.getClass().getSimpleName(), "setupPSOAndGetClientObject() PSO: " + ldv2 + " exists, but character is not logged out. PSO CharConnectionState = " + (Object)((Object)ha2.jb()));
            return null;
        }
        if (ha2.jq() != fn.RF) {
            lfn.b(2, "SFLoginManager", "setupPSOAndGetClientObject: Character state is not ACTIVE");
            return null;
        }
        ha2.iL();
        ha2.c(fp2.hf());
        ha2.aR(fp2.SP);
        ha2.a(fp2.hE, fp2.hB);
        ha2.bU(fp2.di);
        ha2.ae(ldv3);
        ha2.ke();
        ha2.e(fp2);
        fv fv2 = new fv(ha2, ldv3);
        return fv2;
    }

    private void e(ldv ldv2, boolean bl) {
        assert (ldv2 != null);
        fv fv2 = this.Xa.get(ldv2);
        if (fv2 == null) {
            lfn.b(5, "SFLoginManager", "logoutClient() Could not find ClientObject for SystemOSGUID " + ldv2);
            return;
        }
        fp fp2 = this.bM(ldv2.ib());
        if (fp2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "logoutClient() : Could not find ClientAccountInfo for SystemOSGUID = " + ldv2);
            return;
        }
        gps gps2 = (gps)this.MessageDelegator.h(11082, this.GUID, fv2.gO());
        gps2.joM = bl;
        this.MessageDelegator.F(gps2);
    }

    private void d(int n, String string) {
        ldv ldv2 = new ldv(n, 1800, 1);
        kcn kcn2 = (kcn)this.MessageDelegator.i(265, this.getGUID(), ldv2);
        kcn2.aMH = string;
        this.MessageDelegator.b(kcn2);
    }

    private void a(ldv ldv2, int n, String string, String string2) {
        fnx fnx2 = (fnx)this.MessageDelegator.h(11523, this.GUID, lcr.qzt);
        fnx2.cd(string2);
        fnx2.ae(ldv2);
        fnx2.Ha(n);
        fnx2.setDirectoryName(string);
        this.MessageDelegator.F(fnx2);
    }

    private void a(fnx fnx2) {
        assert (lcw.enb());
        fv fv2 = fnx2.bQj();
        assert (fv2 != null) : "Returned ClientObject is null!";
        this.Xa.put(fv2.hk(), fv2);
        fp fp2 = this.bM(fv2.hk().ib());
        if (fp2 == null) {
            this.d(fv2.hk().ib(), "Client already logged in. Reason: #3");
            return;
        }
        this.Xc.aT(fv2.hk());
    }

    private void a(foa foa2) {
        this.d(foa2.bQo().ib(), "IO Failure from server. Reason: #4");
    }
}

