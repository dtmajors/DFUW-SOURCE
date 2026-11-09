/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lcr
 */
import java.util.Random;

public class mhw
extends btk {
    private ldv dJs = null;
    private ljq Position = null;
    private boolean Dxf = false;
    private float eUj = 100.0f;
    private ldv Ud = null;
    private Random DwZ = new Random();
    private int jpH = 0;

    public mhw(ljq ljq2, boolean bl, float f) {
        assert (ljq2 != null);
        this.Position = ljq2;
        this.Dxf = bl;
        this.eUj = f;
    }

    public void shutdown() {
        if (this.Ud != null) {
            this.hu();
        }
        if (this.dJs != null) {
            this.apM();
        }
    }

    public void eS(ljq ljq2) {
        this.Position = ljq2;
        if (this.dJs != null) {
            this.eU(ljq2);
        }
    }

    public boolean ezc() {
        if (this.Dxf) {
            return this.dJs != null && this.Ud != null;
        }
        return this.dJs != null;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.eT(this.Position);
    }

    @Override
    public void receiveResourceResponse(ktf ktf2) {
        switch (ktf2.egN()) {
            case 1: {
                ksv ksv2 = (ksv)ktf2;
                this.dJs = ksv2.oq();
                if (!this.Dxf) break;
                this.cDn();
                break;
            }
            default: {
                super.receiveResourceResponse(ktf2);
            }
        }
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 512: {
                kwr kwr2 = (kwr)ktv2;
                this.Ud = kwr2.dJs;
                break;
            }
            case 530: {
                break;
            }
            case 531: {
                break;
            }
            case 4865: {
                break;
            }
            case 6144: {
                kxe kxe2 = (kxe)ktv2;
                this.MessageDelegator.oa(kxe2.ev);
                break;
            }
            case 6145: {
                kxf kxf2 = (kxf)ktv2;
                this.b(kxf2);
                break;
            }
        }
    }

    public void ezd() {
        lgl lgl2 = new lgl(new ljq(this.DwZ.nextFloat(), this.DwZ.nextFloat(), this.DwZ.nextFloat()));
        kje kje2 = (kje)this.MessageDelegator.h(2821);
        kje2.ts(this.GUID);
        kje2.Ye(0);
        kje2.pEn = this.Position;
        kje2.pEo = lgl2.eq(new ljq(0.0f, 1.0f, 0.0f));
        kje2.pEp = lgl2.eq(new ljq(0.0f, 0.0f, 1.0f));
        kje2.gbu = 2.0f;
        kje2.gei = lew.nj(60.0f);
        kje2.pEs = new ldv[]{this.dJs};
        this.MessageDelegator.a(kje2);
    }

    public void aeo(int n) {
        while (this.jpH < n) {
            this.eze();
        }
    }

    private void eze() {
        ldv ldv2;
        ++this.jpH;
        lgl lgl2 = new lgl(new ljq(this.DwZ.nextFloat(), this.DwZ.nextFloat(), this.DwZ.nextFloat()));
        krj krj2 = (krj)this.MessageDelegator.h(2308);
        krj2.ec = this.GUID;
        krj2.hsP = false;
        krj2.iBr = false;
        krj2.atv = lcr.qAC;
        krj2.pYp = false;
        krj2.dsK = true;
        krj2.aCE = ldv2 = this.MessageDelegator.bzv();
        krj2.GUID = ldv2;
        krj2.Rs = this.GUID;
        krj2.Position = this.Position;
        krj2.Rotation = lgl2;
        krj2.bis = lgl2.eq(new ljq(0.0f, 1.0f, 0.0f));
        krj2.bit = 200.0f;
        krj2.akO = 10.0f;
        krj2.pXT = 50.0f;
        krj2.gEV = (float)this.MessageDelegator.arc().rgz;
        krj2.pXN = true;
        krj2.pXO = false;
        krj2.pXP = false;
        krj2.biw = new ldv[]{this.dJs};
        krj2.pXQ = true;
        krj2.pXR = true;
        this.MessageDelegator.a(krj2);
    }

    private void b(kxf kxf2) {
        krk krk2 = (krk)this.MessageDelegator.h(2310);
        krk2.ec = this.GUID;
        krk2.hsP = false;
        krk2.iBr = false;
        krk2.GUID = kxf2.ev;
        krk2.atv = kxf2.dJs;
        krk2.pYp = false;
        krk2.dsK = false;
        this.MessageDelegator.a(krk2);
        --this.jpH;
    }

    private void eT(ljq ljq2) {
        assert (this.GUID != null);
        krr krr2 = (krr)this.MessageDelegator.j(1);
        krr2.aaz(1);
        krr2.aaA(8);
        krr2.ts(this.GUID);
        krr2.xc("prop/all/all_bed001.xml");
        krr2.xC(true);
        krr2.xe("");
        krr2.xd("");
        krr2.c(ljq2);
        krr2.a(new lgl(0.0f, 0.0f, 0.0f, 1.0f));
        krr2.setObjectType(cug.fhK);
        this.MessageDelegator.a(krr2);
    }

    private void apM() {
        klb klb2 = (klb)this.MessageDelegator.h(1026);
        klb2.ts(this.GUID);
        klb2.wD(false);
        klb2.jM(false);
        klb2.iWE = klb.iHB;
        klb2.Rs = this.dJs;
        this.MessageDelegator.a(klb2);
    }

    private void eU(ljq ljq2) {
        kky kky2 = (kky)this.MessageDelegator.h(1025);
        kky2.ts(this.GUID);
        kky2.wD(false);
        kky2.jM(false);
        kky2.pHF = 8;
        kky2.pHG = ljq2.x;
        kky2.pHH = ljq2.y;
        kky2.pHI = ljq2.rlV;
        kky2.rb = 0.0f;
        kky2.rc = 0.0f;
        kky2.rd = 0.0f;
        kky2.pHJ = 1.0f;
        kky2.hC(this.dJs);
        this.MessageDelegator.a(kky2);
    }

    private void cDn() {
        assert (this.dJs != null);
        koo koo2 = (koo)this.MessageDelegator.h(531);
        koo2.ts(this.GUID);
        koo2.wD(true);
        koo2.jM(false);
        koo2.pTa = true;
        koo2.dsK = true;
        koo2.pUK = false;
        koo2.Ud = lcr.qzb;
        koo2.Ue = this.eUj;
        koo2.dsZ = this.dJs;
        this.MessageDelegator.a(koo2);
    }

    private void hu() {
        assert (this.Ud != null);
        kov kov2 = (kov)this.MessageDelegator.h(535);
        kov2.ts(this.GUID);
        kov2.wD(false);
        kov2.jM(false);
        kov2.sy(this.Ud);
        this.MessageDelegator.a(kov2);
    }
}

