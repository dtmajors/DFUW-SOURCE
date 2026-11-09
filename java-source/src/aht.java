/*
 * Decompiled with CFR.
 */
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.List;

public abstract class aht {
    protected ahu.c bls = null;
    protected id blt = null;
    protected ldv GUID = null;
    private int ObjectType = -1;
    private int blu = -1;
    protected ix SW = null;
    private boolean blv = false;
    private List<Integer> blw = null;
    private final int[] blx;
    public gp[] bly = null;
    public it blz = null;
    protected int blA = -1;
    private IdentityHashMap<ik, Object> blB = new IdentityHashMap();
    private List<uk> blC = lcn.emv();
    private static long blD = 0L;
    private static long blE = 0L;
    private static long blF = 0L;
    private int blG = -1;
    private int blH = -1;
    private int blI = -1;

    public aht(int n) {
        assert (n <= 159);
        assert (n >= 0);
        assert (n < 63);
        this.blx = new int[n];
    }

    public final ahu.c Bx() {
        return this.bls;
    }

    public final id By() {
        return this.blt;
    }

    public final void b(id id2) {
        this.blt = id2;
    }

    public final ldv getGUID() {
        return this.GUID;
    }

    public final void setGUID(ldv ldv2) {
        this.GUID = ldv2;
    }

    public final int getObjectType() {
        return this.ObjectType;
    }

    public final void setObjectType(int n) {
        this.ObjectType = n;
    }

    public final int Bz() {
        return this.blu;
    }

    public final void fn(int n) {
        this.blu = n;
    }

    public final void a(ix ix2) {
        this.SW = ix2;
    }

    public final boolean BA() {
        return this.blv;
    }

    public final void aU(boolean bl) {
        this.blv = bl;
    }

    public final List<Integer> BB() {
        return this.blw;
    }

    public final int[] BC() {
        return this.blx;
    }

    public final boolean fo(int n) {
        assert (this.blx != null);
        if (n <= 0) {
            return false;
        }
        return this.blx.length > n;
    }

    public void gt() {
        assert (this.blx != null);
        lfn.b(1, "", "StateObject " + this.GUID + " of type " + this.nb());
        int n = this.blx.length;
        for (int i = 1; i < n; ++i) {
            uk uk2 = this.G(i, -1);
            lfn.b(0, "", "(" + i + ") " + this.eB(i) + " = " + uk2.vC());
        }
    }

    public final int nN() {
        if (this.SW == null) {
            return 1;
        }
        return this.SW.nN();
    }

    public String eB(int n) {
        switch (n) {
            default: 
        }
        return null;
    }

    public final void c(int n, List list) {
        if (this.blI > 0 && this.blI <= n) {
            return;
        }
        assert (this.blx != null);
        if (n == this.blG && n != -1) {
            ++blD;
            ++blF;
            list.addAll(this.blC);
            return;
        }
        if (ahu.c.containsNoFixedProperties(this.bls)) {
            return;
        }
        if (this.blx.length == 0) {
            return;
        }
        boolean bl = this.ft(n);
        uk uk2 = null;
        int n2 = this.blx.length;
        for (int i = 1; i < n2; ++i) {
            if (!bl && this.fr(i) || this.blx[i] <= n || i == this.blA || (uk2 = this.G(i, n)) == null) continue;
            list.add(uk2);
        }
        ++blE;
        ++blF;
        this.blG = n;
        this.blC.clear();
        this.blC.addAll(list);
    }

    public abstract void a(int var1, int var2, List<uk> var3);

    public abstract void b(int var1, int var2, List<uk> var3);

    public final String nb() {
        return this.bls.name();
    }

    public void a(gym gym2, int n) {
    }

    public void initialize() {
    }

    public final boolean BD() {
        switch (this.bls) {
            case bmf: 
            case bmx: 
            case bmE: 
            case bmM: {
                return true;
            }
        }
        return false;
    }

    public void eE(int n) {
        lfn.b(5, "SFStateObject", "notifyEventPropertyTimerTimedOut() PropertyID " + n + " in stateobject " + this.GUID + " can be removed.");
    }

    public final void fp(int n) {
        int n2 = this.blx.length;
        for (int i = 1; i < n2; ++i) {
            this.blx[i] = n;
        }
        this.fu(n);
    }

    public final void fq(int n) {
        if (n <= 0) {
            return;
        }
        if (this.fr(n)) {
            return;
        }
        if (this.blw == null) {
            this.blw = lcn.abH(1);
        }
        this.blw.add(n);
    }

    public final boolean fr(int n) {
        if (this.blw == null) {
            return false;
        }
        int n2 = this.blw.size();
        for (int i = 0; i < n2; ++i) {
            Integer n3 = this.blw.get(i);
            if (n3 != n) continue;
            return true;
        }
        return false;
    }

    public final void fs(int n) {
        if (n <= 0) {
            return;
        }
        if (!this.fr(n)) {
            return;
        }
        this.blw.remove(new Integer(n));
        if (this.blw.isEmpty()) {
            this.blw = null;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append(": GUID=");
        stringBuilder.append(this.GUID);
        stringBuilder.append(" Type='");
        stringBuilder.append(this.nb());
        if (this.blx.length > 0) {
            stringBuilder.append("' FixedPropertyCount=");
            stringBuilder.append(this.blx.length - 1);
        }
        return stringBuilder.toString();
    }

    protected uk G(int n, int n2) {
        lfn.b(5, this.getClass().getSimpleName(), "getFixedPropertyUpdate() Invalid propertyID provided: " + n);
        assert (false);
        return null;
    }

    protected final boolean ft(int n) {
        return n == -1;
    }

    protected final void BE() {
        if (this.SW == null || this.blv) {
            return;
        }
        if (this.blH >= 0 && this.blH == this.SW.nN()) {
            return;
        }
        this.SW.h(this);
        this.blH = this.SW.nN();
    }

    protected abstract void fu(int var1);

    protected final void L(int n, int n2) {
        assert (n > 0);
        assert (n <= this.blx.length);
        this.blx[n] = n2;
        this.blI = n2;
    }

    private void BF() {
        lfn.b(0, "SFStateObject", "writePropertyUpdateTimeSlices() " + this);
        int n = this.blx.length;
        for (int i = 0; i < n; ++i) {
            lfn.b(0, "SFStateObject", "writePropertyUpdateTimeSlices() PropertyUpdateTimeSlices[" + i + "]=" + this.blx[i]);
        }
    }

    public final void b(ik ik2) {
        assert (!this.blB.containsKey(ik2));
        this.blB.put(ik2, ik2);
    }

    public final IdentityHashMap<ik, Object> BG() {
        return this.blB;
    }

    public final void c(ik ik2) {
        assert (this.blB.containsKey(ik2));
        this.blB.remove(ik2);
    }

    public final void w(long l) {
        if (this.bly != null) {
            for (int i = 0; i < this.bly.length; ++i) {
                if (this.bly[i].Xg != l) continue;
                if (i < this.bly.length - 1) {
                    this.bly[i] = this.bly[this.bly.length - 1];
                }
                this.bly = Arrays.copyOf(this.bly, this.bly.length - 1);
                return;
            }
        }
        lfn.b(5, "SFStateObject", this + " removeMulticastGroup(): Couldn't find multicast group with propertyindexmask " + l);
    }

    public final gp a(ldv ldv2, long l) {
        assert (this.x(l) == null);
        gp gp2 = new gp(ldv2, l);
        if (this.bly == null) {
            this.bly = new gp[]{gp2};
            return gp2;
        }
        this.bly = Arrays.copyOf(this.bly, this.bly.length + 1);
        this.bly[this.bly.length - 1] = gp2;
        return gp2;
    }

    public final gp x(long l) {
        if (this.bly != null) {
            for (int i = 0; i < this.bly.length; ++i) {
                if (this.bly[i].Xg != l) continue;
                return this.bly[i];
            }
        }
        return null;
    }
}

