/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 *  cph
 *  lcr
 *  lcw
 */
public class ceh
extends ccz
implements cef {
    public static final float eoS = 1.3f;
    public static float eoT = 1.3f;
    public static int eoU = 0x320000;
    public static boolean eoV = true;
    private final ceb eoN;
    private int Us = 0;
    private ldv Ur = null;
    private ldv eoO = null;
    private int eoP = 0;
    private int eoQ = 0;
    private boolean eoW = false;
    private exa eoX = null;
    private boolean eoY = false;
    private int enF = -1;
    private lgj eoZ;
    private double epa = 0.0;
    private ljq epb = null;
    private ljq epc = null;
    private float[] epd = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    private int epe = 0;
    private float epf = 1.0f;

    public ceh(cev cev2) {
        super(cev2);
        this.eoN = new ceb(cev2);
    }

    @Override
    public final ceb aKQ() {
        return this.eoN;
    }

    @Override
    public final ldv aKS() {
        return this.Ur;
    }

    @Override
    public final ldv aKR() {
        return this.eoO;
    }

    public int kV() {
        return this.eoP;
    }

    public final int aLb() {
        return this.eoQ;
    }

    @Override
    public final cph Wm() {
        lfn.b(5, "SFControllerManagerPlayerServer", "getExternalObject() Should not be called on the server.");
        assert (false);
        return null;
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        this.eoN.doTick(ldz2);
        this.aLg();
        if (eoV && this.eoZ != null && this.aeg != null && this.aeg.aJD().aEP().aEx()) {
            this.eoZ = null;
            return;
        }
        if (!this.eoY) {
            return;
        }
        if (mfz.ex(this.MessageDelegator.arc().rgz) == this.enF) {
            return;
        }
        this.aKr();
    }

    private void aLg() {
        if (eoT == 1.0f) {
            return;
        }
        if (this.epc == null) {
            return;
        }
        if (this.aeg == null) {
            return;
        }
        if (this.aeg.aAG() == null) {
            return;
        }
        float f2 = 0.0f;
        if (this.epb != null) {
            ljq ljq2 = this.epc.esF();
            ljq2.et(this.epb);
            float f3 = ljq2.eqN() / (float)this.MessageDelegator.arc().qwh;
            if (f3 > 40.0f) {
                this.epb = this.epc;
                return;
            }
            this.epd[this.epe % this.epd.length] = f3;
            ++this.epe;
            f2 = 0.0f;
            for (int i2 = 0; i2 < this.epd.length; ++i2) {
                f2 += this.epd[i2];
            }
            f2 /= (float)this.epd.length;
        }
        this.epb = this.epc;
        float f4 = lew.o(1.0f, eoT, f2 / 5.5f);
        if (f4 == this.epf) {
            return;
        }
        this.epf = f4;
        if (this.aeg.aAG().axa() == null) {
            return;
        }
        kmj kmj2 = (kmj)this.MessageDelegator.h(3329);
        kmj2.ts(this.GUID);
        kmj2.hC(this.aeg.aAG().axa());
        kmj2.Zf(256);
        kmj2.ip(this.epf);
        this.MessageDelegator.a(kmj2);
    }

    private void aKr() {
        if (this.aeg == null) {
            return;
        }
        if (this.aeg.aAG() == null) {
            return;
        }
        lgj lgj2 = new lgj(mfz.ex(this.MessageDelegator.arc().rgz), new ljw(this.aeg.aAG().av()), this.aeg.aAG().aw(), true);
        ldv ldv2 = this.aeg.aAG().getGUID();
        this.enF = lgj2.aZa;
        this.a(ldv2, lgj2);
    }

    public void aLh() {
        if (this.MessageDelegator == null || this.MessageDelegator.arc() == null) {
            return;
        }
        if (this.aeg == null) {
            return;
        }
        if (this.aeg.aAG() == null) {
            return;
        }
        this.eoY = true;
        this.enF = mfz.ex(this.MessageDelegator.arc().rgz);
    }

    @Override
    public final void initialize() {
        super.initialize();
        if (!this.aeg.Ux()) {
            this.eoN.initialize();
        }
        eoT = lea.epS().edJ();
    }

    public final boolean aEv() {
        return this.Us != 0;
    }

    @Override
    public final boolean aKT() {
        return this.Us == 1;
    }

    @Override
    public final boolean aKU() {
        return this.Us == 3;
    }

    @Override
    public final boolean aKV() {
        return this.Us == 5;
    }

    @Override
    public final boolean aKX() {
        return this.Us == 6;
    }

    @Override
    public final boolean aKY() {
        return this.Us == 7;
    }

    @Override
    public final boolean aKW() {
        return this.Us == 4;
    }

    @Override
    public void oU(int n) {
        if (n <= 0) {
            lfn.b(5, "SFControllerManagerPlayerServer", "notifyLifeModeChanged() LifeMode is invalid.");
            return;
        }
        this.eoN.oU(n);
    }

    @Override
    public final void oV(int n) {
        if (n <= 0) {
            lfn.b(5, "SFControllerManagerPlayerServer", "notifyPostureModeChanged() PostureMode is invalid.");
            return;
        }
        this.eoN.oV(n);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 5121: {
                this.a((exa)dxq2);
                break;
            }
            case 5122: {
                this.a((exb)dxq2);
                break;
            }
            case 20482: {
                this.a((fsg)dxq2);
                break;
            }
            case 20484: {
                this.a((fsf)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 5385: {
                this.eoN.a((kvm)ktv2);
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    @Override
    protected final void a(fsj fsj2) {
        if (fsj2.dTY == null) {
            lfn.b(5, "SFControllerManagerPlayerServer", "handleMovementObjectMessage() PositionalData is null.");
            return;
        }
        if (!fsj2.dTY.eqJ().esV()) {
            lfn.b(5, "SFControllerManagerPlayerServer", "handleMovementObjectMessage() WorldPosition NOT in valid range: " + fsj2.dTY.eqJ());
            return;
        }
        if (!fsj2.dTY.eqK().eqP()) {
            lfn.b(5, "SFControllerManagerPlayerServer", "handleMovementObjectMessage() Rotation not unit: " + fsj2.dTY.eqK());
            return;
        }
        if (this.eoY) {
            return;
        }
        byv byv2 = this.aeg.aJD().aEP();
        if (this.isScheduledForRemoval()) {
            return;
        }
        if (byv2.aEv()) {
            return;
        }
        if (this.aeg.aAG() == null) {
            lfn.b(5, "SFControllerManagerPlayerServer", "handleMovementObjectMessage() MeshObject is null in playerobject.");
            return;
        }
        this.i(fsj2.dTY);
        this.epc = fsj2.dTY.eqI();
        ldv ldv2 = this.aeg.aAG().getGUID();
        this.a(ldv2, fsj2.dTY);
        ljq ljq2 = fsj2.dTY.eqI();
        lgl lgl2 = fsj2.dTY.eqK();
        this.aeg.aAG().g(ljq2, lgl2);
        ((cex)this.aeg).aMC();
    }

    private void a(exa exa2) {
        this.eoZ = null;
        if (exa2.dcr <= 0) {
            lfn.b(5, "SFControllerManagerPlayerServer", "handleControllerUnlockMessage() ControllerType is invalid.");
            return;
        }
        if (this.eoW) {
            if (this.eoX == null) {
                this.eoX = exa2;
            } else {
                assert (this.eoX.Ur.equals(exa2.Ur));
                assert (this.eoX.dcr != exa2.dcr);
                this.eoX = null;
            }
            return;
        }
        switch (exa2.dcr) {
            case 1: {
                break;
            }
            case 8: {
                assert (this.Us == 0);
                assert (this.Ur == null);
                if (exa2.Ur == null) {
                    lfn.b(5, "SFControllerManagerPlayerServer", "handleControllerChangeMessage() ExternalObjectGUID is null.");
                    return;
                }
                if (exa2.eoO == null) {
                    lfn.b(5, "SFControllerManagerPlayerServer", "handleControllerChangeMessage() ExternalMeshObjectGUID is null.");
                    return;
                }
                if (exa2.eoP <= 0) {
                    lfn.b(5, "SFControllerManagerPlayerServer", "handleControllerChangeMessage() ExternalObjectResourceType is invalid.");
                    return;
                }
                switch (exa2.Us) {
                    case 1: 
                    case 3: 
                    case 4: 
                    case 5: 
                    case 6: 
                    case 7: 
                    case 8: {
                        break;
                    }
                    default: {
                        lfn.b(5, "SFControllerManagerPlayerServer", "handleControllerChangeMessage() Invalid externalobjecttype provided: " + exa2.Us);
                        assert (false);
                        return;
                    }
                }
                this.Us = exa2.Us;
                this.Ur = exa2.Ur;
                this.eoO = exa2.eoO;
                this.eoP = exa2.eoP;
                this.eoQ = exa2.eoQ;
                this.eoW = true;
                break;
            }
            case 9: {
                assert (this.Us != 0);
                assert (this.Ur != null);
                this.Us = 0;
                this.Ur = null;
                this.eoO = null;
                this.eoP = 0;
                this.eoQ = 0;
                this.eoW = true;
                break;
            }
            default: {
                lfn.b(5, "SFControllerManagerPlayerServer", "handleControllerChangeMessage() Invalid controllertype provided: " + exa2.dcr);
                return;
            }
        }
        ldv ldv2 = this.aeg.jk().bhh();
        exa2.f(this.GUID);
        exa2.on(ldv2);
        this.MessageDelegator.E(exa2);
    }

    private void a(exb exb2) {
        if (exb2.dcr <= 0) {
            lfn.b(5, "SFControllerManagerPlayerServer", "handleControllerChangeResultMessage() ControllerType is invalid.");
            return;
        }
        assert (this.eoW);
        switch (exb2.dcr) {
            case 8: {
                this.eoW = false;
                break;
            }
            case 9: {
                this.eoW = false;
                break;
            }
            default: {
                lfn.b(5, "SFControllerManagerPlayerServer", "handleControllerChangeResultMessage() Unhandled controllertype provided: " + exb2.dcr);
                return;
            }
        }
        if (this.eoX != null) {
            exa exa2 = this.eoX;
            this.eoX = null;
            this.a(exa2);
        }
    }

    private void a(fsf fsf2) {
        if (this.Us == 0) {
            return;
        }
        byv byv2 = this.aeg.aJD().aEP();
        if (this.isScheduledForRemoval()) {
            return;
        }
        if (!byv2.aEv()) {
            return;
        }
        if (this.aeg.aAG() == null) {
            lfn.b(5, "SFControllerManagerPlayerServer", "handleMovementAttachedObjectMessage() MeshObject is null in playerobject.");
            return;
        }
        assert (this.Ur != null);
        assert (this.eoO != null);
        assert (this.eoP > 0);
        this.a(this.amN().aAG().getGUID(), fsf2.dTY);
        if (this.aeg.aIs()) {
            this.aeg.aAG().c(fsf2.dTY.eqI());
            ((cex)this.aeg).aMC();
        }
    }

    private void a(fsg fsg2) {
        if (fsg2.dTY == null) {
            lfn.b(5, "SFControllerManagerPlayerServer", "handleMovementExternalObjectMessage() PositionalData is null.");
            return;
        }
        if (!fsg2.dTY.eqJ().esV()) {
            lfn.b(5, "SFControllerManagerPlayerServer", "handleMovementExternalObjectMessage() WorldPosition NOT in valid range: " + fsg2.dTY.eqJ());
            return;
        }
        if (!fsg2.dTY.eqK().eqP()) {
            lfn.b(5, "SFControllerManagerPlayerServer", "handleMovementExternalObjectMessage() Rotation not unit: " + fsg2.dTY.eqK());
            return;
        }
        if (this.Us == 0) {
            return;
        }
        byv byv2 = this.aeg.aJD().aEP();
        if (this.isScheduledForRemoval()) {
            return;
        }
        if (!byv2.aEv()) {
            return;
        }
        if (this.aeg.aAG() == null) {
            lfn.b(5, "SFControllerManagerPlayerServer", "handleMovementExternalObjectMessage() MeshObject is null in playerobject.");
            return;
        }
        assert (this.Ur != null);
        assert (this.eoO != null);
        assert (this.eoP > 0);
        this.b(this.Ur, fsg2.dTY);
        this.a(this.eoO, fsg2.dTY);
        this.i(fsg2.dTY);
        this.a(this.amN().aAG().getGUID(), fsg2.dTY);
        if (this.aeg.aIs()) {
            this.aeg.aAG().c(fsg2.dTY.eqI());
            ((cex)this.aeg).aMC();
        }
    }

    private void b(ldv ldv2, lgj lgj2) {
        fsg fsg2 = (fsg)this.MessageDelegator.h(20482, this.GUID, ldv2);
        fsg2.dTY = lgj2;
        this.MessageDelegator.E(fsg2);
    }

    private void i(lgj lgj2) {
        if (!eoV) {
            this.eoZ = null;
            return;
        }
        if (this.aeg.mA() == null) {
            return;
        }
        if (lgj2 != null && this.eoZ != null) {
            int n = this.eoZ.aZc - lgj2.aZc;
            int n2 = this.eoZ.aZe - lgj2.aZe;
            if (n < 0) {
                n = -n;
            }
            if (n2 < 0) {
                n2 = -n2;
            }
            if (this.aeg != null && (n > eoU || n2 > eoU)) {
                lfn.b(4, "SFControllerManagerPlayerServer", "checkPositionDeltas(): [" + this.aeg.getGUID() + "] LastPS " + this.eoZ.aZa + " CurPS " + lgj2.aZa + " Previous " + new ljw(this.eoZ.aZc, this.eoZ.aZd, this.eoZ.aZe).esW() + " New " + new ljw(lgj2.aZc, lgj2.aZd, lgj2.aZe).esW());
                if (this.MessageDelegator != null && this.MessageDelegator.arc().rgz - this.epa > 5.0 && this.aeg.mA().jT().ordinal() <= hc.aaz.ordinal()) {
                    ljq ljq2 = this.eoZ.eqI();
                    ljq ljq3 = lgj2.eqI();
                    String string = ((cex)this.aeg).mA().iU();
                    lej lej2 = lcw.ec((ljq)ljq2);
                    lej lej3 = lcw.ec((ljq)ljq3);
                    String string2 = lcw.dX((ljq)ljq2);
                    String string3 = lcw.dX((ljq)ljq3);
                    String string4 = lej2.getX() < 0 ? "" + -lej2.getX() / 60 + "'" + -lej2.getX() % 60 + "W" : "" + lej2.getX() / 60 + "'" + lej2.getX() % 60 + "E";
                    string4 = lej2.getY() < 0 ? string4 + " " + -lej2.getY() / 60 + "'" + -lej2.getY() % 60 + "N" : string4 + " " + lej2.getY() / 60 + "'" + lej2.getY() % 60 + "S";
                    String string5 = lej3.getX() < 0 ? "" + -lej3.getX() / 60 + "'" + -lej3.getX() % 60 + "W" : "" + lej3.getX() / 60 + "'" + lej3.getX() % 60 + "E";
                    string5 = lej3.getY() < 0 ? string5 + " " + -lej3.getY() / 60 + "'" + -lej3.getY() % 60 + "N" : string5 + " " + lej3.getY() / 60 + "'" + lej3.getY() % 60 + "S";
                    float f2 = ljq.s(ljq2, ljq3);
                    ehq ehq2 = (ehq)this.MessageDelegator.h(2346, this.getGUID(), lcr.qAL);
                    ehq2.ipK = aud.a.caF.ordinal();
                    ehq2.ipN = "Potential " + (int)f2 + "m teleport by '" + string + "'. Previous position " + string4 + " (" + string2 + "), New position " + string5 + " (" + string3 + ")";
                    this.MessageDelegator.E(ehq2);
                    this.epa = this.MessageDelegator.arc().rgz;
                }
            }
        }
        this.eoZ = lgj2;
    }
}

