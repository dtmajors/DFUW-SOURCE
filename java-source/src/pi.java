/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  mt
 */
import java.util.Map;
import java.util.TreeMap;

public class pi {
    private final mt aGX;
    private long aGY = 1L;
    private TreeMap<Long, pj> aGZ = lcn.emG();
    private Map<ldv, Long> aHa = lcn.emw();

    public pi(mt mt2) {
        this.aGX = mt2;
    }

    public pj cb(ldv ldv2) {
        Long l = this.aHa.get(ldv2);
        if (l == null) {
            return null;
        }
        pj pj2 = this.aGZ.get(l);
        if (pj2 == null) {
            lfn.b(5, "SFCharacterOperationQueueNew", "getEntry: Internal inconsistency. Entry with GUID " + ldv2 + " Position " + l + " not found in Entry map");
            assert (false);
            return null;
        }
        return pj2;
    }

    public boolean cc(ldv ldv2) {
        return this.aHa.containsKey(ldv2);
    }

    public pj sw() {
        if (this.aGZ.isEmpty()) {
            return null;
        }
        for (pj pj2 : this.aGZ.values()) {
            if (this.aGX.ca(pj2.Ri) || !this.aGX.b(pj2.Ri, pj2.aHb)) continue;
            return pj2;
        }
        return null;
    }

    public void b(pj pj2) {
        pj pj3 = this.cb(pj2.Ri);
        if (pj3 != null) {
            lfn.b(5, "SFCharacterOperationQueueNew", "addEntry: Entry with GUID " + pj2.Ri + " already exists");
            assert (false);
            return;
        }
        long l = 0L;
        l = this.aGZ.isEmpty() ? this.aGY : this.aGZ.firstKey();
        this.aGZ.put(--l, pj2);
        this.aHa.put(pj2.Ri, l);
    }

    public void c(pj pj2) {
        pj pj3 = this.cb(pj2.Ri);
        if (pj3 != null) {
            lfn.b(5, "SFCharacterOperationQueueNew", "addEntry: Entry with GUID " + pj2.Ri + " already exists");
            assert (false);
            return;
        }
        this.aGZ.put(this.aGY, pj2);
        this.aHa.put(pj2.Ri, this.aGY);
        ++this.aGY;
    }

    public void cd(ldv ldv2) {
        Long l = this.aHa.get(ldv2);
        if (l == null) {
            lfn.b(5, "SFCharacterOperationQueueNew", "removeEntry: Entry with GUID " + ldv2 + " not found");
            assert (false);
            return;
        }
        pj pj2 = this.aGZ.get(l);
        if (pj2 == null) {
            lfn.b(5, "SFCharacterOperationQueueNew", "removeEntry: Internal inconsistency. Entry with GUID " + ldv2 + " Position " + l + " not found in Entry map");
            assert (false);
            return;
        }
        this.aGZ.remove(l);
        this.aHa.remove(pj2.Ri);
    }

    public void ce(ldv ldv2) {
        Long l = this.aHa.get(ldv2);
        if (l == null) {
            lfn.b(5, "SFCharacterOperationQueueNew", "moveEntryToFront: Entry with GUID " + ldv2 + " not found");
            assert (false);
            return;
        }
        if (l.equals(this.aGZ.firstKey())) {
            return;
        }
        pj pj2 = this.aGZ.get(l);
        if (pj2 == null) {
            lfn.b(5, "SFCharacterOperationQueueNew", "moveEntryToFront: Internal inconsistency. Entry with GUID " + ldv2 + " Position " + l + " not found in Entry map");
            assert (false);
            return;
        }
        this.aGZ.remove(l);
        this.aHa.remove(pj2.Ri);
        long l2 = this.aGZ.firstKey();
        this.aGZ.put(--l2, pj2);
        this.aHa.put(pj2.Ri, l2);
    }
}

