/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cdb
 */
import java.util.List;

public abstract class bfr
extends bfq {
    private List<ajm> dhN = lcn.abH(2);

    public bfr(cdb cdb2) {
        super((cbx)cdb2);
    }

    public final void c(int n, ldv ldv2, int n2) {
        this.a(n, ldv2, n2, true);
    }

    public final void a(int n, ldv ldv2, int n2, boolean bl) {
        if (n <= 0) {
            lfn.b(5, "SFEventManagerCreature", "notifyEventOccured() EventType is invalid.");
            return;
        }
        if (ldv2 == null) {
            lfn.b(5, "SFEventManagerCreature", "notifyEventOccured() CauseObjectGUID is null.");
            return;
        }
        if (n2 <= 0) {
            lfn.b(5, "SFEventManagerCreature", "notifyEventOccured() CauseResourceType is invalid.");
            return;
        }
        bfn bfn2 = new bfn();
        bfn2.Type = n;
        bfn2.dhq = this.MessageDelegator.arc().rgz;
        bfn2.aYF = ldv2;
        bfn2.akX = this.Qg.getGUID();
        bfn2.bsG = n2;
        bfn2.dhr = this.Qg.az();
        this.a(bfn2, bl);
    }

    public final void a(ajm ajm2) {
        assert (ajm2 != null);
        assert (ajm2.getEventType() > 0);
        if (this.dhN.contains(ajm2)) {
            lfn.b(5, "SFEventManagerCreature", "registerEventConstraint() Constraint for skill '" + ajm2.Co().getName() + "' has already been registered: " + ajm2);
            return;
        }
        this.dhN.add(ajm2);
    }

    public final void b(ajm ajm2) {
        assert (ajm2 != null);
        assert (ajm2.getEventType() > 0);
        if (!this.dhN.contains(ajm2)) {
            lfn.b(5, "SFEventManagerCreature", "unregisterEventConstraint() Constraint for skill '" + ajm2.Co().getName() + "' was not found: " + ajm2);
            return;
        }
        this.dhN.remove(ajm2);
    }

    protected final void d(bfn bfn2) {
        assert (bfn2 != null);
        if (this.dhN.isEmpty()) {
            return;
        }
        int n = this.dhN.size();
        for (int i = 0; i < n; ++i) {
            ajm ajm2 = this.dhN.get(i);
            if (ajm2.getEventType() != bfn2.Type) continue;
            ajm2.a(bfn2);
        }
    }
}

