/*
 * Decompiled with CFR.
 */
import java.util.Set;

public class ldw {
    private final boolean bC = false;
    public static final int rfq = 0;
    public static final int rfr = 1;
    public static final int rfs = 2;
    private static final int rft = 1000000;
    private static final int rfu = 1048575;
    public static final int rfv = 800;
    public static final int rfw = 10000;
    private static final int rfx = 10000;
    private static final int rfy = 1000000;
    private static final int rfz = 10000;
    private static final int rfA = 1048575;
    public static final int rfB = 2000;
    private int rfC = Integer.MAX_VALUE;
    private int rfD = Integer.MIN_VALUE;
    public static final int rfE = 0;
    private int rfF = -1;
    private final ldv rfG;
    protected int di = -1;
    private final int ejO;
    private int rfH = 10000;
    private int rfI = 800;
    private final Set<ldv> rfJ = lcn.emx();
    private boolean rfK = true;
    private ldx haB = ldx.enG();
    private boolean Initialized = false;

    ldw(int n, int n2) {
        this.di = n;
        this.ejO = n2;
        this.rfG = new ldv(this.di, this.ejO, 0);
    }

    void initialize(int n) {
        assert (!this.Initialized);
        this.rfF = n;
        if (this.rfF == 0) {
            this.rfC = 10000;
            this.rfD = 1048575;
            this.rfH = this.rfC;
        } else if (this.rfF == 1) {
            this.rfC = 1000000;
            this.rfD = 1048575;
            this.rfH = this.rfC;
        } else if (this.rfF == 2) {
            this.rfC = 10000;
            this.rfD = 1000000;
            this.rfH = this.rfC;
        } else {
            String string = "GUIDServer Type [" + this.rfF + "] not supported!";
            lfn.b(5, this.getClass().getName(), "initialize() : " + string);
            assert (false) : string;
        }
        this.Initialized = true;
    }

    public ldv lL(ldv ldv2) {
        assert (this.di != -1) : "NodeID is -1 !";
        assert (this.rfF != -1) : "GUIDServerType is -1 !";
        if (ldv2 == null) {
            return null;
        }
        ldv ldv3 = null;
        ldv3 = ldv2.enw() != this.ejO ? this.haB.fS(ldv2.ib(), ldv2.enw()).bzv() : this.N(this.rfC, this.rfD, ldv2.enw());
        return ldv3;
    }

    public ldv Wk(int n) {
        assert (this.di != -1) : "NodeID is -1 !";
        assert (this.rfF != -1) : "GUIDServerType is -1 !";
        ldv ldv2 = null;
        ldv2 = new ldv(this.di, this.ejO, n);
        return ldv2;
    }

    public ldv bzv() {
        assert (this.di != -1) : "NodeID is -1 !";
        assert (this.rfF != -1) : "GUIDServerType is -1 !";
        ldv ldv2 = this.N(this.rfC, this.rfD, this.ejO);
        return ldv2;
    }

    public void nZ(ldv ldv2) {
        if (this.rfJ.contains(ldv2)) {
            lfn.b(5, "SFGUIDServer", "registerPersistentGUID: GUID " + ldv2 + " already in use");
            assert (false);
            loi.exd().aF("Could not register persistent guid " + ldv2 + " - already in use");
        }
        this.rfJ.add(ldv2);
        if (ldv2.enx() >= this.rfI) {
            this.rfI = ldv2.enx();
        }
    }

    public ldv bzw() {
        assert (this.di != -1) : "NodeID is -1 !";
        assert (this.rfF != -1) : "GUIDServerType is -1 !";
        int n = 800;
        int n2 = 10000;
        int n3 = this.rfI;
        ldv ldv2 = new ldv(this.di, this.ejO, this.rfI);
        while (this.rfJ.contains(ldv2)) {
            ++this.rfI;
            if (this.rfI >= n2) {
                this.rfI = n;
            }
            if (this.rfI == n3) {
                lfn.b(5, "SFGUIDServer", "createPersistentGUID: Unable to create persistent guid, entire range is used");
                assert (false);
                loi.exd().aF("Could not create persistent GUID, entire range is used");
                return null;
            }
            ldv2 = new ldv(this.di, this.ejO, this.rfI);
        }
        this.lK(ldv2);
        this.rfI = ldv2.enx() + 1;
        return ldv2;
    }

    private ldv N(int n, int n2, int n3) {
        Object object;
        if (this.rfH < n || this.rfH >= n2) {
            object = "ObjectGUIDIndex [" + this.rfH + "]is outside the Range Min = " + n + ", Max = " + n2;
            lfn.b(5, this.getClass().getName(), "createRangedGUID() : " + (String)object);
            assert (false) : object;
        }
        object = null;
        ++this.rfH;
        if (this.rfH >= n2) {
            this.rfH = n;
            lfn.b(3, this.getClass().getSimpleName(), "createRangedGUID() : RESETING GUID TO -> " + n + " for NewObjectSpaceID = " + n3 + ". GUID Rollover done. UsedGUIDs.size() = " + this.rfJ.size());
        }
        int n4 = 0;
        object = new ldv(this.di, n3, this.rfH);
        while (this.tn((ldv)object)) {
            ++this.rfH;
            if (this.rfH >= n2) {
                this.rfH = n;
            }
            object = new ldv(this.di, n3, this.rfH);
            if (++n4 <= n2 - n) continue;
            String string = "Been thorugh the whole Range [" + n + " - " + n2 + "]. SanityCounter = " + n4 + ". NO FREE GUIDS in Range for NewObjectSpaceID = " + n3 + ". UsedGUIDs.size() = " + this.rfJ.size();
            lfn.b(0, this.getClass().getSimpleName(), "createRangedGUID() : " + string);
            lfn.acB(0);
            assert (false) : string;
            return null;
        }
        this.lK((ldv)object);
        return object;
    }

    public ldv enA() {
        assert (this.di != -1) : "NodeID is -1 !";
        assert (this.ejO != 0) : "ObjectSpaceID is 0 !";
        ldv ldv2 = new ldv(this.di, this.ejO, 0);
        return ldv2;
    }

    public void lK(ldv ldv2) {
        if (this.rfK) {
            if (ldv2 == null) {
                lfn.b(5, "SFGUIDServer", "addUsedGUID() UsedGUID is null.");
                return;
            }
            if (!this.rfJ.add(ldv2)) {
                return;
            }
        }
    }

    public void enB() {
    }

    public boolean tn(ldv ldv2) {
        return this.rfJ.contains(ldv2);
    }

    public boolean tY(ldv ldv2) {
        if (ldv2 == null) {
            lfn.b(5, "SFGUIDServer", "releaseGUID() UsedGUID is null.");
            return false;
        }
        boolean bl = this.rfJ.remove(ldv2);
        return bl;
    }

    public final boolean enC() {
        return this.rfK;
    }

    public final void yn(boolean bl) {
        this.rfK = bl;
    }

    public final void a(ldx ldx2) {
        if (this.haB == null) {
            this.haB = ldx2;
        } else {
            lfn.b(5, this.getClass().getName(), "setGUIDServerManager() : GUIDManager is already set! Cannot set again.");
        }
    }

    public final ldv enD() {
        return this.rfG;
    }

    public boolean enE() {
        this.rfJ.clear();
        return this.haB.tZ(this.rfG);
    }

    public int enF() {
        return this.rfJ.size();
    }
}

