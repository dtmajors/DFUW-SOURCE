/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 *  lcr
 */
import java.util.ArrayList;
import java.util.Map;

public abstract class cif {
    public static final int eBh = 1;
    public static final int eBi = 2;
    public static final int eBj = 3;
    public static final int eBk = 4;
    private static final String TC = "SFPlayerPerksManager";
    protected final cid eBl;
    protected final cev bnF;
    protected final Map<Integer, chz> eBm;
    protected final Map<Integer, chz> eBn;
    protected final Map<Integer, chz> eBo;
    private lex eBp = null;

    public cif(cev cev2) {
        this.bnF = cev2;
        this.eBm = lcn.emw();
        this.eBn = lcn.emw();
        this.eBo = lcn.emw();
        this.eBl = lea.epN();
    }

    public boolean qk(int n) {
        cib cib2 = cib.getValueByOrdinal(n);
        if (cib2 == null) {
            lfn.b(5, TC, "addPerk() perk type : " + n + " is invalid");
            assert (false);
            return false;
        }
        cia cia2 = this.eBl.qe(n);
        if (cia2 == null) {
            lfn.b(5, TC, "addPerk()  there is no related info object for player perk type : " + (Object)((Object)cib2));
            assert (false);
            return false;
        }
        chz chz2 = this.eBm.get(n);
        if (chz2 != null) {
            return false;
        }
        boolean bl = cia2.aON();
        chz2 = new chz();
        chz2.qc(0);
        chz2.fl(cib2.ordinal());
        chz2.setActive(false);
        this.eBm.put(n, chz2);
        if (bl) {
            chz2.setActive(true);
            this.eBo.put(n, chz2);
            if (this.isServerObject() && cib2 == cib.eAJ) {
                cer.h((cex)this.bnF);
            }
            if (this.isServerObject()) {
                // empty if block
            }
        }
        if (this.isServerObject()) {
            this.a(3, chz2);
        } else {
            this.a(cbx.a.ekN);
        }
        return true;
    }

    private void d(chz chz2, int n) {
        frg frg2 = (frg)this.bnF.getMessageDelegator().h(5377, this.bnF.getGUID(), this.bnF.getGUID());
        frg2.iUQ = true;
        frg2.iUR = this.e(chz2, n);
        this.bnF.getMessageDelegator().F(frg2);
    }

    private alt[] e(chz chz2, int n) {
        ArrayList arrayList = lcn.emv();
        if (chz2.Bm() == cib.eAz.ordinal()) {
            // empty if block
        }
        if (chz2.Bm() == cib.eAA.ordinal()) {
            // empty if block
        }
        if (chz2.Bm() == cib.eAB.ordinal()) {
            // empty if block
        }
        if (chz2.Bm() == cib.eAC.ordinal()) {
            // empty if block
        }
        if (chz2.Bm() == cib.eAD.ordinal()) {
            // empty if block
        }
        if (chz2.Bm() == cib.eAE.ordinal()) {
            // empty if block
        }
        if (chz2.Bm() == cib.eAF.ordinal()) {
            // empty if block
        }
        return arrayList.toArray(new alt[arrayList.size()]);
    }

    public boolean ql(int n) {
        cib cib2 = cib.getValueByOrdinal(n);
        if (cib2 == null) {
            lfn.b(5, TC, "removePerk() perk type : " + n + " is invalid");
            assert (false);
            return false;
        }
        cia cia2 = this.eBl.qe(n);
        if (cia2 == null) {
            lfn.b(5, TC, "removePerk()  there is no related info object for player perk type : " + (Object)((Object)cib2));
            assert (false);
            return false;
        }
        chz chz2 = this.eBm.remove(n);
        if (chz2 == null) {
            return false;
        }
        if (cia2.aON()) {
            chz chz3 = this.eBo.remove(n);
            assert (chz3 != null);
            if (this.isServerObject() && cib2 == cib.eAJ) {
                cer.h((cex)this.bnF);
            }
        }
        if (this.isServerObject()) {
            this.a(5, chz2);
        } else {
            this.a(cbx.a.ekN);
        }
        return true;
    }

    private void a(een een2) {
        eek eek2 = (eek)this.bnF.getMessageDelegator().h(12849, this.bnF.getGUID(), een2.aO());
        eek2.b(een2.bGk() ? this.eBn.values().toArray(new chz[this.eBn.size()]) : this.eBm.values().toArray(new chz[this.eBm.size()]));
        this.bnF.getMessageDelegator().F(eek2);
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
            case ekN: {
                if (this.eBp != null) {
                    lfn.b(5, TC, "handleAddObserverMessage() An observer has already been added for the perks aspect.");
                    return;
                }
                this.eBp = new lex();
                this.eBp.iHR = fvp2.aO();
                this.eBp.dTe = fvp2.dTe;
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
            case ekN: {
                if (this.eBp == null) {
                    lfn.b(5, TC, "handleRemoveObserverMessage() Unable to remove the PerksMapEventSink observer. Eventsink is null.");
                    return;
                }
                this.eBp = null;
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
            case ekN: {
                if (this.eBp == null || this.eBp.rjR >= ldz2.lpr) break;
                this.a(this.eBp.iHR, this.eBp.dTe, a2);
                this.eBp.rjR = ldz2.lpr;
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

    protected void a(int n, chz chz2) {
        if (this.bnF == null || !this.bnF.isInitialized()) {
            return;
        }
        gyg gyg2 = (gyg)this.bnF.getMessageDelegator().h(12038, this.bnF.getGUID(), lcr.qAI);
        gyg2.ija = 32;
        gyg2.aXP = n;
        gyg2.jum = chz2;
        this.bnF.getMessageDelegator().F(gyg2);
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
            case 12848: {
                this.a((een)dxq2);
                break;
            }
            default: {
                assert (false) : "Unhandled Message : " + dxq2;
                break;
            }
        }
    }

    public lfs<int[], int[]> aOT() {
        if (this.eBn.isEmpty() && (this.eBo == null || this.eBo.isEmpty())) {
            return null;
        }
        int[] nArray = new int[this.eBn.size() + this.eBo.size()];
        int[] nArray2 = new int[this.eBn.size() + this.eBo.size()];
        int n = 0;
        for (Map.Entry<Integer, chz> entry : this.eBn.entrySet()) {
            nArray[n] = entry.getKey();
            nArray2[n] = entry.getValue().aOH();
            ++n;
        }
        for (Map.Entry<Integer, chz> entry : this.eBo.entrySet()) {
            nArray[n] = entry.getKey();
            nArray2[n] = entry.getValue().aOH();
            ++n;
        }
        return new lfs<int[], int[]>(nArray, nArray2);
    }

    public chz qm(int n) {
        if (this.eBn.isEmpty() && this.eBo.isEmpty()) {
            return null;
        }
        chz chz2 = this.eBn.get(n);
        if (chz2 == null) {
            chz2 = this.eBo.get(n);
        }
        return chz2;
    }

    public boolean qn(int n) {
        if (this.eBn.isEmpty()) {
            return false;
        }
        return this.eBn.containsKey(n);
    }

    public abstract boolean isServerObject();
}

