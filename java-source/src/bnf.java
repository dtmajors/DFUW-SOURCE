/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  dtn
 *  lcr
 */
import java.util.List;

public class bnf
extends dtn {
    public static final int dvW = 1;
    public static final lfo ct = new lfo("GuiTest");
    private final lez dvX = new lez();
    private boolean dvY;
    private int dvZ;

    public bnf(ag ag2) {
        super(ag2);
    }

    public void initialize() {
        super.initialize();
        this.alW = new dsu();
        this.alW.SN = 1;
        this.alW.Tr = null;
        bnc bnc2 = new bnc();
        bnc2.setGUID(this.bzv());
        this.a(bnc2);
        this.alW.gYX = null;
        this.alW.aTc = null;
        this.alW.gYY = bnc2.getGUID();
        this.alW.gYZ = bnc2.getGUID();
        this.alW.gZb = bnc2.arP().getGUID();
        this.alW.gZe = bnc2.arP().arR().getGUID();
        this.alW.Tr = null;
        this.alW.eFu = 0;
        this.alW.aFG = 1;
        this.gFC.cz(new ljq(0.0f, 0.0f, 0.0f));
        this.gFC.bT(cug.fhS);
    }

    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        if (!this.dvY) {
            this.aS(new ljq(0.0f, 0.0f, 0.0f));
            this.dvY = true;
        }
        switch (this.hct) {
            case hcI: {
                break;
            }
            case hcJ: {
                break;
            }
            case hcH: {
                break;
            }
            case hcK: {
                break;
            }
            case hcL: {
                if (this.dvZ <= 0) break;
                --this.dvZ;
                if (this.dvZ != 0) break;
                this.hcv.V();
            }
        }
    }

    protected void receiveMessage(dxq dxq2) {
        block0 : switch (dxq2.bED()) {
            case 16384: {
                this.a((fpj)dxq2);
                break;
            }
            default: {
                switch (dxq2.bEz()) {
                    case 11011: {
                        this.a((gpq)dxq2);
                        break block0;
                    }
                    case 2566: {
                        ct.debug("GUI FINISHED INITIALIZING");
                        break block0;
                    }
                    case 11023: {
                        ct.debug("LOGOUT REQUEST!");
                        this.arS();
                        break block0;
                    }
                }
                super.receiveMessage(dxq2);
            }
        }
    }

    protected void a(fvr fvr2) {
        block0 : switch (fvr2.bEz()) {
            case 12289: {
                fvp fvp2 = (fvp)fvr2;
                switch (fvp2.iTm) {
                    case 1: {
                        if (fvp2.dTe <= 0) {
                            ct.error("handleObserverMessage() Unable to add observer. EventID is invalid.");
                            return;
                        }
                        if (fvp2.iTm <= 0) {
                            ct.error("handleObserverMessage() Unable to add observer. AspectID is invalid.");
                            return;
                        }
                        if (this.dvX.ug(fvp2.aO())) {
                            ct.error("handleObserverMessage() The observer already exists.");
                            return;
                        }
                        lex lex2 = new lex();
                        lex2.iHR = fvp2.aO();
                        lex2.dTe = fvp2.dTe;
                        this.dvX.a(lex2);
                        break block0;
                    }
                }
                ct.error("handleObserverMessage() Unknown AspectID provided: " + fvp2.iTm);
                return;
            }
            case 12290: {
                fvv fvv2 = (fvv)fvr2;
                switch (fvv2.iTm) {
                    case 1: {
                        if (fvv2.iTm <= 0) {
                            ct.error("handleObserverMessage() Unable to remove observer. AspectID is invalid.");
                            return;
                        }
                        if (!this.dvX.ug(fvv2.aO())) {
                            ct.error("handleObserverMessage() The observer " + fvv2.aO() + " was not found.");
                            return;
                        }
                        this.dvX.uh(fvv2.aO());
                        break block0;
                    }
                }
                ct.error("handleObserverMessage() Unknown AspectID provided: " + fvv2.iTm);
                return;
            }
            default: {
                super.a(fvr2);
            }
        }
    }

    protected void a(dst dst2) {
        assert (dst2 != null);
        this.alW.aFG = 1;
        this.lj(1);
    }

    private void aS(ljq ljq2) {
        assert (ljq2 != null);
        dld dld2 = this.aj();
        dld2.setGUID(lcr.rg);
        dld2.c(new ljq(ljq2));
        dld2.a(new lgl());
        this.a(dld2);
        dle dle2 = this.bAj();
        dle2.setGUID(lcr.qBT);
        dle2.c(new ljq(ljq2));
        dle2.a(dld2.aw());
        this.a(dle2);
    }

    private void hY(ldv ldv2) {
        gpr gpr2 = (gpr)this.h(11012, this.GUID, ldv2);
        gpr2.alW = this.alW;
        this.E(gpr2);
    }

    private void I(ldv ldv2, int n) {
        fvt fvt2 = (fvt)this.h(12291, this.GUID, ldv2);
        fvt2.dTe = n;
        this.F(fvt2);
    }

    private void a(gpq gpq2) {
        this.hY(gpq2.aO());
    }

    private void lj(int n) {
        if (n == 1) {
            List<lex> list = this.dvX.eqs();
            lex lex2 = null;
            for (int i = 0; i < list.size(); ++i) {
                lex2 = list.get(i);
                this.hY(lex2.iHR);
                lex2.rjR = this.arc().lpr;
            }
        }
    }

    private void a(fpj fpj2) {
        block0 : switch (fpj2.bEz()) {
            case 16385: {
                fpi fpi2 = (fpi)fpj2;
                switch (fpi2.iTm) {
                    case 1: {
                        if (fpi2.iTm <= 0) {
                            ct.error("handleListenerMessage() Unable to add listener. AspectID is invalid.");
                            return;
                        }
                        if (this.dvX.ug(fpi2.aO())) {
                            ct.error("handleListenerMessage() The listener already exists.");
                            return;
                        }
                        lex lex2 = new lex();
                        lex2.iHR = fpi2.aO();
                        this.dvX.a(lex2);
                        break block0;
                    }
                }
                ct.error("handleListenerMessage() Unknown AspectID provided: " + fpi2.iTm);
                return;
            }
            case 16386: {
                fpl fpl2 = (fpl)fpj2;
                switch (fpl2.iTm) {
                    case 1: {
                        if (fpl2.iTm <= 0) {
                            ct.error("handleListenerMessage() Unable to remove listener. AspectID is invalid.");
                            return;
                        }
                        if (!this.dvX.ug(fpl2.aO())) {
                            ct.error("handleListenerMessage() The listener " + fpl2.aO() + " was not found.");
                            return;
                        }
                        this.dvX.uh(fpl2.aO());
                        break block0;
                    }
                }
                ct.error("handleListenerMessage() Unknown AspectID provided: " + fpl2.iTm);
                return;
            }
            default: {
                ct.error("Unknown observermessage received: " + fpj2.getClass().getName());
                return;
            }
        }
    }

    private void arS() {
        this.alW.aFG = 4;
        this.lj(1);
        this.hct = dtn.a.hcL;
        this.dvZ = 5;
    }
}

