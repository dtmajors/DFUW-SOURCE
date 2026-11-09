/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cug
 */
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class bfq
extends btk {
    protected final cbx Qg;
    protected final List<bfn> dhJ = lcn.abH(2);
    private final Map<ldv, bfp> dhK = lcn.emw();
    private final Map<Integer, List<bfp>> dhL = lcn.emw();
    private Set<bgc> dhM = lcn.emx();

    public bfq(cbx cbx2) {
        assert (cbx2 != null);
        assert (cbx2.isServerObject());
        this.Qg = cbx2;
    }

    public final void doTick(ldz ldz2) {
        if (!this.dhJ.isEmpty()) {
            this.dhJ.clear();
        }
    }

    public final void aoe() {
        this.dhJ.clear();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 12545: {
                this.a((fbb)dxq2);
                break;
            }
            case 12546: {
                this.a((fba)dxq2);
                break;
            }
            case 12547: {
                this.a((fbg)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    public final bfn aof() {
        if (this.dhJ.isEmpty()) {
            return null;
        }
        return this.dhJ.get(this.dhJ.size() - 1);
    }

    public final void a(int n, bfl bfl2) {
        this.a(n, bfl2.aYF, bfl2.bsG, bfl2.aYC, bfl2.bnM, bfl2.aYG, bfl2.Magnitude, true, bfl2.aYH);
    }

    public final void a(int n, ldv ldv2, int n2, int n3, int n4, int n5, float f2, boolean bl, int n6) {
        if (n <= 0) {
            lfn.b(5, "SFEventManager", "notifyEffectEventOccured() EventType is invalid.");
            return;
        }
        if (ldv2 == null) {
            lfn.b(5, "SFEventManager", "notifyEffectEventOccured() CauseObjectGUID is null.");
            return;
        }
        if (n2 <= 0) {
            lfn.b(5, "SFEventManager", "notifyEffectEventOccured() CauseResourceType is invalid.");
        } else if (n3 <= 0) {
            lfn.b(5, "SFEventManager", "notifyEffectEventOccured() CauseSkillType is invalid.");
        } else {
            if (n4 <= 0) {
                lfn.b(5, "SFEventManager", "notifyEffectEventOccured() AttributeType is invalid.");
                return;
            }
            if (n5 <= 0) {
                lfn.b(5, "SFEventManager", "notifyEffectEventOccured() EffectType is invalid.");
                return;
            }
        }
        bfl bfl2 = new bfl();
        bfl2.Type = n;
        bfl2.dhq = this.Qg.getMessageDelegator().arc().rgz;
        bfl2.aYF = ldv2;
        bfl2.akX = this.Qg.getGUID();
        bfl2.bsG = n2;
        bfl2.dhr = this.Qg.az();
        bfl2.bnM = n4;
        bfl2.aYC = n3;
        bfl2.aYG = n5;
        bfl2.Magnitude = f2;
        bfl2.aYH = n6;
        this.a(bfl2, bl);
        if (n4 == 352 && f2 < 0.0f && n != 5 && !lea.enW().isDescendant(bfl2.bsG, cug.fgG)) {
            this.c(f2, ldv2, this.Qg.fi().ah(352).fN() + f2 <= 0.0f);
        }
    }

    protected void a(bfn bfn2, boolean bl) {
        assert (bfn2 != null);
        this.dhJ.add(bfn2);
        if (bl) {
            this.c(bfn2);
        }
    }

    protected void c(bfn bfn2) {
        assert (bfn2 != null);
        List<bfp> list = this.dhL.get(bfn2.Type);
        if (list == null) {
            return;
        }
        int n = list.size();
        for (int i = 0; i < n; ++i) {
            bfp bfp2 = list.get(i);
            this.a(bfp2.GUID, bfn2);
        }
    }

    protected abstract void a(ldv var1, bfn var2);

    private void a(bfp bfp2) {
        assert (bfp2 != null);
        int[] nArray = bfp2.dhI;
        int n = nArray.length;
        for (int i = 0; i < n; ++i) {
            this.a(bfp2, nArray[i]);
        }
        this.dhK.put(bfp2.GUID, bfp2);
    }

    private void a(fba fba2) {
        if (fba2.iHR == null) {
            lfn.b(5, "SFEventManager", "handleAddEffectEventListenerMessage() EventListenerGUID is null.");
            return;
        }
        if (fba2.dhI == null || fba2.dhI.length == 0) {
            lfn.b(5, "SFEventManager", "handleAddEffectEventListenerMessage() EventTypes array is null or empty.");
            return;
        }
        if (fba2.dhp == null || fba2.dhp.length == 0) {
            lfn.b(5, "SFEventManager", "handleAddEffectEventListenerMessage() EffectTypes array is null or empty.");
            return;
        }
        if (this.dhK.containsKey(fba2.iHR)) {
            lfn.b(5, "SFEventManager", "handleAddEffectEventListenerMessage() EventListener " + fba2.iHR + " is already added.");
            return;
        }
        bfm bfm2 = new bfm();
        bfm2.GUID = fba2.iHR;
        bfm2.dhI = fba2.dhI;
        bfm2.dhp = fba2.dhp;
        this.a(bfm2);
    }

    private void a(fbb fbb2) {
        if (fbb2.iHR == null) {
            lfn.b(5, "SFEventManager", "handleAddEventListenerMessage() EventListenerGUID is null.");
            return;
        }
        if (fbb2.dhI == null || fbb2.dhI.length == 0) {
            lfn.b(5, "SFEventManager", "handleAddEventListenerMessage() EventTypes array is null or empty.");
            return;
        }
        if (this.dhK.containsKey(fbb2.iHR)) {
            lfn.b(5, "SFEventManager", "handleAddEventListenerMessage() EventListener " + fbb2.iHR + " is already added.");
            return;
        }
        bfp bfp2 = new bfp();
        bfp2.GUID = fbb2.iHR;
        bfp2.dhI = fbb2.dhI;
        this.a(bfp2);
    }

    private void a(fbg fbg2) {
        if (fbg2.iHR == null) {
            lfn.b(5, "SFEventManager", "handleRemoveEventListenerMessage() EventListenerGUID is null.");
            return;
        }
        bfp bfp2 = this.dhK.remove(fbg2.iHR);
        if (bfp2 == null) {
            lfn.b(5, "SFEventManager", "handleRemoveEventListenerMessage() EventListener " + fbg2.iHR + " was not found.");
            return;
        }
        int[] nArray = bfp2.dhI;
        int n = nArray.length;
        for (int i = 0; i < n; ++i) {
            this.b(bfp2, nArray[i]);
        }
    }

    private void a(bfp bfp2, int n) {
        assert (bfp2 != null);
        assert (n > 0);
        List<bfp> list = this.dhL.get(n);
        if (list == null) {
            list = lcn.abH(3);
            this.dhL.put(n, list);
        }
        if (list.contains(bfp2)) {
            lfn.b(5, "SFEventManager", "registerEventListener() Listener " + bfp2.GUID + " has already been registered.");
            assert (false);
            return;
        }
        list.add(bfp2);
    }

    private void b(bfp bfp2, int n) {
        assert (bfp2 != null);
        assert (n > 0);
        List<bfp> list = this.dhL.get(n);
        if (list == null) {
            lfn.b(5, "SFEventManager", "unregisterEventListener() Unable to remove listener " + bfp2.GUID + " from event '" + bfo.eV(n) + "'");
            return;
        }
        if (!list.remove(bfp2)) {
            lfn.b(5, "SFEventManager", "unregisterEventListener() Listener " + bfp2.GUID + " was not listening to event '" + bfo.eV(n) + "'");
            assert (false);
            return;
        }
        if (list.isEmpty()) {
            this.dhL.remove(n);
        }
    }

    public void a(bgc bgc2) {
        if (bgc2 != null) {
            this.dhM.add(bgc2);
        }
    }

    public void b(bgc bgc2) {
        if (bgc2 != null) {
            this.dhM.remove(bgc2);
        }
    }

    private void c(float f2, ldv ldv2, boolean bl) {
        for (bgc bgc2 : this.dhM) {
            bgc2.b(f2, ldv2, bl);
        }
    }
}

