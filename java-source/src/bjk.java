/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cew
 *  lcr
 */
public class bjk
extends btk {
    private boolean avz = true;
    private boolean doK = true;
    private boolean doL = true;
    private boolean doM = true;
    private int doN = 1;

    @Override
    public void initialize() {
        super.initialize();
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        if (dxq2.bEz() == 29453) {
            this.a((fgi)dxq2);
        } else {
            super.receiveMessage(dxq2);
        }
    }

    private void a(fgi fgi2) {
        Object object;
        if (!this.avz) {
            return;
        }
        if (fgi2.getType() == bjm.dpd.ordinal() && !this.doM) {
            return;
        }
        ldv ldv2 = new ldv(this.GUID.ib(), fgi2.getTargetObjectGUID().enw(), fgi2.getTargetObjectGUID().enx());
        amf amf2 = this.MessageDelegator.bzx().bzt().d(ldv2);
        if (amf2 == null || !(amf2 instanceof cbx)) {
            return;
        }
        cbx cbx2 = (cbx)amf2;
        if (cbx2.aAG() == null || cbx2.aAG().axa() == null) {
            return;
        }
        lfn.b(0, "SFFloatingDamageManager", "handleHIDCombatLogFloatingDamageMessage() Type = " + fgi2.getType() + " GUID=" + fgi2.getTargetObjectGUID().toString() + " Magnitude=" + fgi2.uO());
        boolean bl2 = false;
        if (cbx2 instanceof cew) {
            object = (cew)cbx2;
            bl2 = object.aJI();
        }
        if (bl2 && !this.doL) {
            return;
        }
        if (!bl2 && !this.doK) {
            return;
        }
        object = new bjl();
        ((amf)object).setGUID(this.MessageDelegator.bzv());
        ((bjl)object).setTargetObjectGUID(cbx2.aAG().axa());
        ((bjl)object).N(fgi2.uO());
        ((bjl)object).setType(fgi2.getType());
        ((bjl)object).dn(bl2);
        ((bjl)object).kP(this.doN);
        this.MessageDelegator.a((amf)object);
    }

    public boolean isEnabled() {
        return this.avz;
    }

    public void setEnabled(boolean bl2) {
        this.avz = bl2;
    }

    public boolean apE() {
        return this.doK;
    }

    public void dk(boolean bl2) {
        this.doK = bl2;
    }

    public boolean apF() {
        return this.doL;
    }

    public void dl(boolean bl2) {
        this.doL = bl2;
    }

    public boolean apG() {
        return this.doM;
    }

    public void dm(boolean bl2) {
        this.doM = bl2;
    }

    public int apH() {
        return this.doN;
    }

    public void kP(int n) {
        this.doN = n;
    }

    public static bjk apI() {
        return (bjk)hso.cxK().cxP().cyJ().getMessageDelegator().bzx().bzt().d(lcr.qCl);
    }
}

