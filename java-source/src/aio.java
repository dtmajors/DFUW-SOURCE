/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.ArrayList;
import java.util.Map;

public abstract class aio {
    private static final String TC = "SFUnlockablesManagerPlayer";
    protected final cev bnF;
    private lex bnG = null;
    private Map<Integer, aim> bnH = lcn.emw();

    public aio(cev cev2) {
        this.bnF = cev2;
    }

    public void a(aim aim2) {
        this.bnH.put(aim2.az(), aim2);
        if (this.isServerObject()) {
            this.a(5, aim2);
            return;
        }
        this.a(cbx.a.ekQ);
    }

    public boolean fy(int n) {
        for (aim aim2 : this.bnH.values()) {
            if (aim2.BP() != ain.bnq) continue;
            cix cix2 = (cix)lea.epC().get(aim2.az());
            if (cix2 == null) {
                assert (false);
                continue;
            }
            if (cix2.aPL() != n || !aim2.isSelected() && !cix2.aPM()) continue;
            return true;
        }
        return false;
    }

    public aim fz(int n) {
        return this.bnH.get(n);
    }

    private final void a(fvp fvp2) {
        if (fvp2.dTe <= 0) {
            lfn.b(5, TC, "handleAddObserverMessage() Unable to add observer. EventID is invalid.");
            return;
        }
        if (fvp2.iTm <= 0) {
            lfn.b(5, TC, "handleAddObserverMessage() Unable to add observer. AspectID is invalid.");
            return;
        }
        cbx.a a2 = cbx.a.getAspect(fvp2.iTm);
        if (a2 == null) {
            lfn.b(5, TC, "handleAddObserverMessage() AspectID is invalid.");
            return;
        }
        switch (a2) {
            case ekQ: {
                if (this.bnG != null) {
                    lfn.b(5, TC, "handleAddObserverMessage() An observer has already been added for the unlockables aspect.");
                    return;
                }
                this.bnG = new lex();
                this.bnG.iHR = fvp2.aO();
                this.bnG.dTe = fvp2.dTe;
                this.a(cbx.a.ekQ);
                break;
            }
            default: {
                lfn.b(5, TC, "handleAddObserverMessage() AspectID=" + fvp2.iTm + " is invalid.");
                return;
            }
        }
    }

    private final void a(fvv fvv2) {
        if (fvv2.iTm <= 0) {
            lfn.b(5, TC, "handleRemoveObserverMessage() Unable to remove observer. AspectID is invalid.");
            return;
        }
        cbx.a a2 = cbx.a.getAspect(fvv2.iTm);
        if (a2 == null) {
            lfn.b(5, TC, "handleRemoveObserverMessage() AspectID is invalid.");
            return;
        }
        switch (a2) {
            case ekQ: {
                if (this.bnG == null) {
                    lfn.b(5, TC, "handleRemoveObserverMessage() Unable to remove the UnlockablesMapEventSink observer. Eventsink is null.");
                    return;
                }
                this.bnG = null;
                break;
            }
            default: {
                lfn.b(5, TC, "handleRemoveObserverMessage() AspectID=" + fvv2.iTm + " is invalid.");
                return;
            }
        }
    }

    public final void a(cbx.a a2) {
        if (this.bnF == null || this.bnF.isServerObject() || !this.bnF.isInitialized()) {
            return;
        }
        ldz ldz2 = this.bnF.getMessageDelegator().arc();
        switch (a2) {
            case ekQ: {
                if (this.bnG == null || this.bnG.rjR >= ldz2.lpr) break;
                this.a(this.bnG.iHR, this.bnG.dTe, a2);
                this.bnG.rjR = ldz2.lpr;
                break;
            }
            default: {
                lfn.b(5, TC, "notifyObservers() AspectChanged is invalid: " + (Object)((Object)a2));
                return;
            }
        }
    }

    private void a(ldv ldv2, int n, cbx.a a2) {
        fvt fvt2 = (fvt)this.bnF.getMessageDelegator().h(12291, this.bnF.getGUID(), ldv2);
        fvt2.dTe = n;
        this.bnF.getMessageDelegator().F(fvt2);
    }

    protected void a(int n, aim aim2) {
        if (this.bnF == null || !this.bnF.isInitialized()) {
            return;
        }
        gyg gyg2 = (gyg)this.bnF.getMessageDelegator().h(12038, this.bnF.getGUID(), lcr.qAI);
        gyg2.ija = 128;
        gyg2.aXP = n;
        gyg2.jun = aim2;
        this.bnF.getMessageDelegator().F(gyg2);
    }

    private void a(efk efk2) {
        ArrayList<aim> arrayList = lcn.emv();
        for (aim aim2 : this.bnH.values()) {
            arrayList.add(aim2);
        }
        efl efl2 = (efl)this.bnF.getMessageDelegator().h(12858, this.bnF.getGUID(), efk2.aO());
        efl2.a(arrayList != null ? arrayList.toArray(new aim[arrayList.size()]) : null);
        this.bnF.getMessageDelegator().F(efl2);
    }

    public void n(dxq dxq2) {
        int n = dxq2.bEz();
        switch (n) {
            case 12289: {
                assert (!this.isServerObject());
                this.a((fvp)dxq2);
                break;
            }
            case 12290: {
                assert (!this.isServerObject());
                this.a((fvv)dxq2);
                break;
            }
            case 12857: {
                assert (!this.isServerObject());
                this.a((efk)dxq2);
                break;
            }
            default: {
                assert (false) : "Unhandled Message : " + dxq2;
                break;
            }
        }
    }

    public abstract boolean isServerObject();

    public Map<Integer, aim> BQ() {
        return this.bnH;
    }

    public int a(ain ain2) {
        for (aim aim2 : this.bnH.values()) {
            ciw ciw2;
            if (!aim2.BP().equals((Object)ain2) || !aim2.isSelected() || (ciw2 = (ciw)lea.epC().get(aim2.az())) == null || !(ciw2 instanceof ciy)) continue;
            ciy ciy2 = (ciy)ciw2;
            return ciy2.aPN();
        }
        return -1;
    }
}

