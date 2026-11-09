/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ep
 *  lcr
 */
public class clp
extends clo
implements bto,
hsn {
    private static final float elT = 100.0f;
    private static final double elU = 2.0;
    private int eJc = del.gls;
    private int eJd = del.glt;
    private ldv eJe = null;
    private ldv eJf = null;
    private ldv elV = null;
    private ldv elW = null;
    private jje elX = null;
    private ljq diS = null;
    private String elY = null;
    private String bhA = null;
    private boolean elZ = false;
    private boolean ema = false;
    private int emb = 0;
    private int emc = 0;
    private ldv emd = null;
    private ldv eme = null;
    private boolean emf = false;
    private double emg = 0.0;

    public clp() {
        super(false);
    }

    public void initialize() {
        super.initialize();
        if (hso.cxK() != null && hso.cxK().bAn() != null) {
            this.elW = this.MessageDelegator.bzv();
            this.b(hso.cxK().bAn().gYY, new int[]{1488}, this.elW);
            this.elV = this.MessageDelegator.bzv();
            this.b(this.GUID, new int[]{12336, 12320, 12368, 12752, 12768, 12784, 12800}, this.elV);
        } else if (hso.cxK() != null) {
            hso.cxK().a(this);
        }
    }

    public void cleanUp() {
        ldv ldv2;
        if (this.elX != null) {
            this.elX.closeWindow();
            this.elX = null;
        }
        if (this.elW != null) {
            if (hso.cxK() != null) {
                this.h(hso.cxK().bAn().gYY, this.elW);
            }
            this.MessageDelegator.oa(this.elW);
            this.elW = null;
        }
        if (this.elV != null) {
            this.h(this.GUID, this.elV);
            this.MessageDelegator.oa(this.elV);
            this.elV = null;
        }
        this.diS = null;
        this.elY = null;
        this.bhA = null;
        this.elZ = false;
        this.ema = false;
        this.emb = 0;
        this.emc = 0;
        ldv ldv3 = ldv2 = this.eJf != null ? this.eJf : this.eJe;
        if (ldv2 != null) {
            glj glj2 = (glj)this.MessageDelegator.h(13058, this.getGUID(), lcr.qEa);
            glj2.aUa = ldv2;
            glj2.jkV = 1;
            this.MessageDelegator.F(glj2);
        }
        this.eJf = null;
        this.eJe = null;
        super.cleanUp();
    }

    private void aIZ() {
        int n;
        azg azg2;
        if (this.diS == null) {
            return;
        }
        if (this.aAG() == null) {
            return;
        }
        if (this.aAG().av() == null) {
            return;
        }
        boolean bl = true;
        dmn dmn2 = (dmn)this.MessageDelegator.bzx().bzt().d(lcr.qEz);
        if (dmn2 != null && (azg2 = dmn2.AJ(n = dmn2.cg(this.aAG().av()))) != null && !dmn2.nc(azg2.getGUID())) {
            bl = false;
        }
        if (this.elZ && !bl) {
            if (Math.abs(ljq.s(this.diS, this.aAG().azb())) < 100.0f) {
                if (this.elX == null) {
                    if (hso.cxK() != null) {
                        this.elX = hso.cxK().cxP().cyJ().a(jje.a.nkP);
                    }
                    this.updateWindow();
                }
            } else if (this.elX != null) {
                this.elX.closeWindow();
                this.elX = null;
            }
        } else if (this.elX != null && !this.emf) {
            this.elX.closeWindow();
            this.elX = null;
        }
    }

    private void uY() {
        if (this.aAG() == null) {
            return;
        }
        if (this.elZ) {
            if (this.eJe != null) {
                return;
            }
            this.eJe = this.MessageDelegator.lL(lcr.qEa);
        } else {
            if (this.eJf != null) {
                return;
            }
            this.eJf = this.MessageDelegator.lL(lcr.qEa);
        }
        glh glh2 = (glh)this.MessageDelegator.h(13057, this.getGUID(), lcr.qEa);
        glh2.SpecialEffectType = this.elZ ? this.eJc : this.eJd;
        glh2.aUa = this.elZ ? this.eJe : this.eJf;
        glh2.akX = this.aAG().getGUID();
        glh2.aZD = this.aAG().av();
        this.MessageDelegator.F(glh2);
    }

    private void uZ() {
        if (this.elZ ? this.eJf == null : this.eJe == null) {
            return;
        }
        glj glj2 = (glj)this.MessageDelegator.h(13058, this.getGUID(), lcr.qEa);
        glj2.aUa = this.elZ ? this.eJf : this.eJe;
        glj2.jkV = 1;
        this.MessageDelegator.F(glj2);
        if (this.elZ) {
            this.eJf = null;
        } else {
            this.eJe = null;
        }
    }

    private void aJa() {
        amf amf2;
        if (hso.cxK() != null) {
            boolean bl = this.ema = this.emd != null && this.emd.enw() == hso.cxK().bAn().SN;
        }
        if (lcr.mOy != null && (amf2 = this.MessageDelegator.bzx().bzt().d(lcr.mOy)) instanceof cbd) {
            this.ema |= ldv.au(((cbd)amf2).aHm(), this.eme);
        }
    }

    private void updateWindow() {
        if (this.elX == null) {
            return;
        }
        if (!this.emf) {
            this.elX.sv(this.elY);
            this.elX.cy(this.bhA);
            this.elX.setProgress(this.emb, 0, this.emc);
            this.elX.tX(this.ema);
        }
        if (this.emb == this.emc) {
            this.emf = true;
            this.emg = 2.0;
        }
    }

    private void n(ej ej2) {
        switch (ej2.getType()) {
            case 1488: {
                this.diS = ej2.getValue() != null ? ((fc)((fd)ej2).getValue()).Position : null;
                this.aIZ();
                break;
            }
            default: {
                lfn.b(5, "SFVillageControlPointClient", "handlePlayerAttribute() : Unexpected Attribute Type!!!... Attribute Name = " + ej2.getName());
                assert (false);
                return;
            }
        }
    }

    private void p(ej ej2) {
        switch (ej2.getType()) {
            case 12336: {
                this.elY = ((ff)ej2).getStringValue();
                this.updateWindow();
                break;
            }
            case 12320: {
                this.bhA = ((ff)ej2).getStringValue();
                this.updateWindow();
                break;
            }
            case 12368: {
                this.elZ = ((et)ej2).fN() == 1.0f;
                this.aIZ();
                break;
            }
            case 12752: {
                this.emb = ((ew)ej2).fQ();
                this.updateWindow();
                break;
            }
            case 12768: {
                this.emc = ((ew)ej2).fQ();
                this.updateWindow();
                break;
            }
            case 12784: {
                this.emd = ((ev)ej2).fP();
                this.aJa();
                this.updateWindow();
                break;
            }
            case 12800: {
                this.eme = ((ev)ej2).fP();
                this.aJa();
                this.updateWindow();
                break;
            }
            default: {
                lfn.b(5, "SFLevyCollectorClient", "handleLevyCollectorAttribute() : Unexpected Attribute Type!!!... Attribute Name = " + ej2.getName());
                assert (false);
                return;
            }
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        this.aJa();
        this.uZ();
        this.uY();
        if (!this.emf) {
            return;
        }
        if (this.emg <= 0.0) {
            return;
        }
        this.emg -= ldz2.qwh;
        if (this.emg <= 0.0) {
            this.emf = false;
            if (this.elX != null) {
                this.elX.closeWindow();
                this.elX = null;
            }
        }
    }

    @Override
    public void oo() {
        if (hso.cxK() != null) {
            hso.cxK().b(this);
        }
        this.elW = this.MessageDelegator.bzv();
        if (hso.cxK() != null) {
            this.b(hso.cxK().bAn().gYY, new int[]{1488}, this.elW);
        }
        this.elV = this.MessageDelegator.bzv();
        this.b(this.GUID, new int[]{12336, 12320, 12368, 12752, 12768, 12784, 12800}, this.elV);
    }

    @Override
    public boolean op() {
        return this.Initialized;
    }

    @Override
    public void a(jnz jnz2, jnz jnz3) {
    }

    @Override
    public void a(joa joa2) {
    }

    @Override
    public void b(joa joa2) {
    }

    @Override
    public void cB(int n) {
    }

    @Override
    public void X(boolean bl) {
    }

    private void b(ldv ldv2, int[] nArray, ldv ldv3) {
        dqi dqi2 = new dqi();
        dqi2.setGUID(ldv3);
        dqi2.nC(this.GUID);
        dqi2.M(nArray);
        dqi2.iv(false);
        dqi2.iw(false);
        gzo gzo2 = (gzo)this.MessageDelegator.h(8193, this.GUID, ldv2);
        gzo2.jvG = dqi2;
        this.MessageDelegator.F(gzo2);
    }

    private void h(ldv ldv2, ldv ldv3) {
        gzr gzr2 = (gzr)this.MessageDelegator.h(8194, this.GUID, ldv2);
        gzr2.bWM = ldv3;
        this.MessageDelegator.F(gzr2);
    }

    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 8196: {
                this.a((gzq)dxq2);
                break;
            }
            case 8195: {
                this.a((gzp)dxq2);
                break;
            }
            case 8197: {
                this.a((gzu)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(gzq gzq2) {
        block4: {
            block3: {
                if (gzq2.DR == null || gzq2.DR.length == 0) {
                    lfn.b(5, "SFLevyCollectorClient", "handleAttributeValueMessage() : Attributes Array is Empty or null!!!");
                    return;
                }
                if (this.elV == null || !this.elV.equals(gzq2.aO())) break block3;
                for (int i = 0; i < gzq2.DR.length; ++i) {
                    this.p(gzq2.DR[i]);
                }
                break block4;
            }
            if (this.elW == null || !this.elW.equals(gzq2.aO())) break block4;
            for (int i = 0; i < gzq2.DR.length; ++i) {
                this.n(gzq2.DR[i]);
            }
        }
    }

    private void a(gzp gzp2) {
        if (gzp2.bhp == null) {
            lfn.b(5, "SFLevyCollectorClient", "handleAttributeChangedMessage() : Attribute is null!!!");
            return;
        }
        if (this.elV != null && this.elV.equals(gzp2.aO())) {
            this.p(gzp2.bhp);
        } else if (this.elW != null && this.elW.equals(gzp2.aO())) {
            this.n(gzp2.bhp);
        }
    }

    private void a(gzu gzu2) {
        int n = gzu2.jvJ;
        switch (n) {
            case 1: {
                lfn.b(5, "SFLevyCollectorClient", "handleWiretapStatusMessage() : Unexpected Attribute Type!!!... Attribute = " + ep.aM((int)gzu2.bnM) + " not found");
                assert (false);
                break;
            }
            case 2: {
                lfn.b(5, "SFLevyCollectorClient", "handleWiretapStatusMessage() : Unexpected Attribute Type!!!... Attribute Name = " + ep.aM((int)gzu2.bnM) + " removed");
                assert (false);
                break;
            }
        }
    }
}

