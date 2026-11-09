/*
 * Decompiled with CFR.
 */
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class pl {
    private final int aHj = pn.aHE.length;
    private final long[] aHk = new long[this.aHj];
    private final long[] aHl = new long[this.aHj];
    private TreeMap<Long, pk> aHm = lcn.emG();
    private Map<Integer, Long> aHn = lcn.emw();
    private Set<Integer> aHo = lcn.emx();

    public pl() {
        long l = Long.MAX_VALUE / (long)this.aHj;
        long l2 = 0L;
        for (int i = 0; i < this.aHj; ++i) {
            this.aHk[i] = l2;
            this.aHl[i] = l2;
            l2 += l;
        }
    }

    public final boolean cR(int n) {
        return this.aHo.contains(n);
    }

    public final boolean isEmpty() {
        return this.aHm.isEmpty();
    }

    public final int sC() {
        return this.aHo.size();
    }

    public final pk a(int n, pn pn2, mz mz2) {
        if (this.aHo.contains(n)) {
            lfn.b(5, "SFCharacterOperationQueue", "queueOperation: Character " + n + " is being processed");
            assert (false);
            return null;
        }
        Long l = this.aHn.get(n);
        if (l == null) {
            pk pk2 = new pk(n);
            switch (pn2) {
                case aHA: {
                    pk2.aHh = true;
                    break;
                }
                case aHC: {
                    pk2.aHg = true;
                    break;
                }
                case aHB: {
                    pk2.aHe = true;
                    break;
                }
                case aHD: {
                    pk2.aHf = true;
                }
            }
            pk2.aHi = mz2;
            long l2 = this.a(pn2);
            this.aHn.put(n, l2);
            this.aHm.put(l2, pk2);
            lfn.b(0, "SFCharacterOperationQueue", "queueOperation: Queued new " + (Object)((Object)pn2) + " entry " + pk2 + " at position " + this.a(pn2, l2));
            return pk2;
        }
        pk pk3 = this.aHm.get(l);
        lfn.b(0, "SFCharacterOperationQueue", "queueOperation: Processing " + (Object)((Object)pn2) + " request for existing entry " + pk3);
        switch (pn2) {
            case aHA: {
                lfn.b(5, "SFCharacterOperationQueue", "queueOperation: Can't queue CREATE_NEW_CHARACTER for existing entry " + pk3);
                assert (false);
                return null;
            }
            case aHC: {
                if (pk3.aHg) {
                    lfn.b(5, "SFCharacterOperationQueue", "queueOperation: LOGIN_LOAD_CHARACTER already qeueud: " + pk3);
                }
                if (pk3.aHh) {
                    lfn.b(5, "SFCharacterOperationQueue", "queueOperation: Can't queue LOGIN_LOAD_CHARACTER for existing entry " + pk3);
                    assert (false);
                    return null;
                }
                lfn.b(0, "SFCharacterOperationQueue", "queueOperation: Requeuing existing entry " + pk3 + " for LOGIN_LOAD_CHARACTER");
                pk3.aHg = true;
                this.aHm.remove(l);
                this.aHn.remove(pk3.SN);
                long l3 = this.a(pn2);
                this.aHm.put(l3, pk3);
                this.aHn.put(pk3.SN, l3);
                lfn.b(0, "SFCharacterOperationQueue", "queueOperation: Requeud entry " + pk3 + " for LOGIN_LOAD_CHARACTER at position " + this.a(pn2, l3));
                return pk3;
            }
            case aHB: {
                if (pk3.aHg || pk3.aHh || pk3.aHe) {
                    lfn.b(5, "SFCharacterOperationQueue", "queueOperation: Can't queue LOGOUT_SAVE_CHARACTER for existing entry " + pk3);
                    assert (false);
                    return null;
                }
                this.aHm.remove(l);
                this.aHn.remove(pk3.SN);
                long l4 = this.a(pn2);
                this.aHm.put(l4, pk3);
                this.aHn.put(pk3.SN, l4);
                pk3.aHf = false;
                pk3.aHe = true;
                pk3.aHi = mz2;
                lfn.b(0, "SFCharacterOperationQueue", "queueOperation: Requeud entry " + pk3 + " for LOGOUT_SAVE_CHARACTER at position " + this.a(pn2, l4));
                return pk3;
            }
            case aHD: {
                if (pk3.aHf || pk3.aHh) {
                    lfn.b(5, "SFCharacterOperationQueue", "queueOperation: Can't queue SAVEALL_SAVE_CHARACTER for existing entry " + pk3);
                    assert (false);
                    return null;
                }
                if (pk3.aHe) {
                    pk3.aHi = mz2;
                }
                lfn.b(0, "SFCharacterOperationQueue", "queueOperation: Kept queue postion for entry " + pk3 + " operation SAVEALL_SAVE_CHARACTER");
                return pk3;
            }
        }
        assert (false);
        return null;
    }

    public final pk sD() {
        if (this.aHm.isEmpty()) {
            return null;
        }
        Map.Entry<Long, pk> entry = this.aHm.pollFirstEntry();
        pk pk2 = entry.getValue();
        this.aHn.remove(pk2.SN);
        this.aHo.add(pk2.SN);
        return pk2;
    }

    public final void a(pk pk2) {
        if (!this.aHo.remove(pk2.SN)) {
            lfn.b(5, "SFCharacterOperationQueue", "operationCompleted: Attempted to remove " + pk2.SN + " but character isn't active");
            assert (false);
        }
        lfn.b(0, "SFCharacterOperationQueue", "operationCompleted: Removed " + pk2 + " from active list");
    }

    private final String a(pn pn2, long l) {
        if (pn2 == null) {
            pn2 = this.p(l);
        }
        return pn2.ordinal() + "." + (l - this.aHk[pn2.ordinal()]);
    }

    private final pn p(long l) {
        int n = pn.aHE.length;
        while (n > 0) {
            if (l < this.aHk[--n]) continue;
            return pn.aHE[n];
        }
        return null;
    }

    private final long a(pn pn2) {
        long l = this.aHl[pn2.ordinal()];
        int n = pn2.ordinal();
        this.aHl[n] = this.aHl[n] + 1L;
        return l;
    }
}

