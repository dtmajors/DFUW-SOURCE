/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cdb
 *  cew
 *  cph
 *  cug
 *  cxd
 */
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public abstract class byx
extends btk {
    protected bzo ecS = null;
    protected Map<byw.c, List<bzn>> ecT = new EnumMap<byw.c, List<bzn>>(byw.c.class);
    protected boolean[] ecU = new boolean[6];
    protected int ecV = 0;
    private cts dXH = null;
    protected byu ecW = null;
    public static boolean ecX = false;
    public static float ecY = 0.87f;

    public byx() {
        this.ecS = new bzo();
        this.ecS.c(this);
    }

    public final bzo aEK() {
        return this.ecS;
    }

    public final Map<byw.c, List<bzn>> aEL() {
        return this.ecT;
    }

    public final boolean[] aEM() {
        return this.ecU;
    }

    public void d(boolean[] blArray) {
        assert (this.ecU != null);
        assert (blArray != null);
        if (this.isServerObject()) {
            // empty if block
        }
        int n = this.ecU.length;
        for (int i = 0; i < n; ++i) {
            this.ecU[i] = blArray[i];
        }
        if (this.isServerObject()) {
            // empty if block
        }
        if (this.aDc() != null) {
            this.aDc().aDh();
        }
    }

    public final int aEN() {
        return this.ecV;
    }

    public void aDZ() {
    }

    public final float aEO() {
        assert (!this.isServerObject());
        assert (this.aDd() != null);
        assert (this.dXH != null);
        float f2 = this.FZ();
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        cdb cdb2 = (cdb)this.aDd();
        if (cdb2.aJx()) {
            f2 = 1.5f;
            if (cdb2.UB()) {
                f2 = cer.b((cew)cdb2, f2);
            }
        }
        return f2;
    }

    public void b(byx byx2) {
        for (List<bzn> list : this.ecT.values()) {
            int n = list.size();
            for (int i = 0; i < n; ++i) {
                bzn bzn2 = list.get(i);
                byx2.a(bzn2.aFt());
            }
        }
        this.ecS.a(byx2.aEK());
    }

    public abstract bxh aDc();

    public final float aEg() {
        assert (!this.isServerObject());
        assert (this.ecW != null);
        return this.ecW.aEg();
    }

    public final byv aEP() {
        return this.ecS.aEP();
    }

    public abstract cbx aDd();

    public bzc aDe() {
        return null;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.ecV = 0;
        int n = this.aDd().az();
        if (lea.enW().isDescendant(n, cug.fgH)) {
            return;
        }
        if (!this.isServerObject()) {
            this.dXH = cxj.yh(n);
            if (this.dXH == null) {
                this.dXH = this.aEQ();
            }
        }
    }

    public final boolean aEc() {
        assert (!this.isServerObject());
        assert (this.ecW != null);
        return this.ecW.aEc();
    }

    public final boolean aDT() {
        assert (!this.isServerObject());
        assert (this.ecW != null);
        return this.ecW.aDT();
    }

    public boolean aEa() {
        if (this.ecW != null) {
            assert (!this.isServerObject());
            return this.ecW.aEa();
        }
        return false;
    }

    public abstract boolean isServerObject();

    public void amY() {
        if (!this.isServerObject()) {
            assert (this.ecW != null);
            this.ecW.amY();
        }
    }

    public void aEi() {
        if (!this.isServerObject()) {
            assert (this.ecW != null);
            this.ecW.aEi();
        }
    }

    public void aEj() {
        if (!this.isServerObject()) {
            assert (this.ecW != null);
            this.ecW.aEj();
        }
    }

    public abstract void a(byv var1, boolean var2);

    public final void e(byv byv2) {
        if (byv2 == null) {
            return;
        }
        this.ecS.a(byv2, this.isServerObject(), false);
    }

    public void b(bzc bzc2) {
        assert (!this.isServerObject());
    }

    public void a(bzc bzc2) {
    }

    public void zO() {
        this.ecS.aEP().setDefaultValues();
    }

    @Override
    public final String toString() {
        return this.getClass().getSimpleName() + ": ServerObject=" + this.isServerObject();
    }

    private cts aEQ() {
        cts cts2 = new cts();
        cts2.ContactVelocityClimbing = 2.0f;
        cts2.ContactVelocityCrouchWalk = 1.5f;
        cts2.ContactVelocityWalk = 1.75f;
        cts2.ContactVelocityRun = 3.5f;
        cts2.ContactVelocityRunStrafe = 2.6f;
        cts2.ContactVelocitySprint = 6.0f;
        cts2.ContactVelocitySwim = 2.0f;
        cts2.ContactVelocitySwimFast = 4.0f;
        return cts2;
    }

    private float FZ() {
        assert (!this.isServerObject());
        assert (this.dXH != null);
        byv byv2 = this.aEP();
        switch (byv2.vO()) {
            case 1: {
                float f2 = 10.0f;
                if (this.aDd() instanceof cew) {
                    f2 = cie.a((cdb)this.aDd(), f2);
                }
                return f2;
            }
            case 2: {
                return this.dXH.ContactVelocityClimbing;
            }
            case 3: {
                float f3 = this.dXH.ContactVelocityCrouchWalk;
                if (this.aDd() instanceof cew) {
                    f3 = cer.a((cew)this.aDd(), f3);
                }
                return f3;
            }
            case 4: {
                float f4 = 7.5f;
                if (this instanceof bzg) {
                    cph cph2;
                    bzg bzg2 = (bzg)this;
                    cew cew2 = (cew)bzg2.bnF;
                    ceg ceg2 = (ceg)cew2.aJN();
                    if (ceg2 != null && (cph2 = ceg2.Wm()) != null) {
                        et et2;
                        f4 = cxd.xN((int)cph2.az());
                        if (cph2.fi() != null && (et2 = cph2.fi().ah(11056)) != null) {
                            f4 = et2.fN();
                        }
                        f4 = cil.b(cew2.fi(), f4);
                        f4 = cie.f((cdb)cew2, f4);
                        return f4;
                    }
                }
                assert (false);
                return 7.5f;
            }
            case 5: {
                return 1.75f;
            }
            case 6: {
                switch (byv2.vN()) {
                    case 1: {
                        return this.dXH.ContactVelocityRun;
                    }
                    case 2: {
                        return this.dXH.ContactVelocityWalk;
                    }
                    case 3: {
                        float f5;
                        boolean bl = false;
                        float f6 = this.dXH.ContactVelocitySprint;
                        et et3 = this.aDd().fi().ah(11056);
                        if (et3 != null && (f5 = et3.fN()) != 0.0f) {
                            bl = true;
                            f6 += et3.fN();
                        }
                        f5 = 0.0f;
                        if (this.ecU[2] || this.ecU[3]) {
                            f5 = this.dXH.ContactVelocityRunStrafe;
                        } else if (this.ecU[0]) {
                            f5 = this.dXH.ContactVelocityRun;
                        }
                        float f7 = 0.0f;
                        et et4 = this.aDd().fi().ah(11104);
                        if (et4 != null) {
                            f7 = et4.fN();
                        }
                        if (this.aDd() instanceof cew) {
                            f5 = cer.b((cev)((cew)this.aDd()), f5);
                        }
                        f5 += f7;
                        if (bl && f5 > f6) {
                            f5 = f6;
                        }
                        return f5;
                    }
                    case 4: {
                        float f8 = this.dXH.ContactVelocitySprint;
                        if (ecX) {
                            f8 = 25.0f;
                        } else {
                            float f9 = 0.0f;
                            et et5 = this.aDd().fi().ah(11056);
                            if (et5 != null) {
                                f9 = et5.fN();
                            }
                            f8 += f9;
                        }
                        return f8;
                    }
                }
                lfn.b(5, "SFObjectStateManager", "getMaxContactVelocity() Unhandled movementmode found: '" + byv2.aEp() + "'");
                return 0.0f;
            }
            case 7: {
                switch (byv2.vN()) {
                    case 1: 
                    case 2: 
                    case 3: {
                        return this.dXH.ContactVelocitySwim;
                    }
                    case 4: {
                        if (ecX) {
                            return 60.0f;
                        }
                        return this.dXH.ContactVelocitySwimFast;
                    }
                }
                lfn.b(5, "SFObjectStateManager", "getMaxContactVelocity() Unhandled movementmode while swimming found: '" + byv2.aEp() + "'");
                return 0.0f;
            }
        }
        lfn.b(5, "SFObjectStateManager", "getMaxContactVelocity() Unhandled posturemode provided: '" + byv2.aEq() + "'");
        assert (false);
        return 0.0f;
    }

    public final void e(boolean[] blArray) {
        if (this.ecU == null) {
            return;
        }
        boolean bl = false;
        int n = blArray.length;
        for (int i = 0; i < n; ++i) {
            if (!blArray[i]) continue;
            bl = true;
            break;
        }
        if (!bl) {
            return;
        }
        assert (this.ecU.length == blArray.length);
        this.d(blArray);
    }

    public final void a(byw.c c2) {
        if (c2 == null) {
            return;
        }
        this.b(c2);
    }

    public void a(ljq ljq2, ljq ljq3, ljq ljq4) {
    }

    public final void a(bzn bzn2) {
        if (bzn2 == null) {
            return;
        }
        List<bzn> list = this.ecT.get((Object)bzn2.aFq());
        if (list == null) {
            list = lcn.abH(5);
            this.ecT.put(bzn2.aFq(), list);
        }
        if (list.contains(bzn2)) {
            return;
        }
        list.add(bzn2);
    }

    protected final void b(byw.c c2) {
        List<bzn> list;
        if (c2 == null) {
            lfn.b(5, "SFObjectStateManager", "handleEventOccured() EventType is null.");
            return;
        }
        if (c2 == byw.c.ecm) {
            lfn.b(5, "SFObjectStateManager", "handleEventOccured() ****** Mounted event ObjectState = " + this.aEP());
        }
        if ((list = this.ecT.get((Object)c2)) == null) {
            return;
        }
        int n = list.size();
        for (int i = 0; i < n; ++i) {
            bzn bzn2 = list.get(i);
            if (!bzn2.a(this)) continue;
            bzm[] bzmArray = bzn2.aFs();
            int n2 = bzmArray.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                this.ecS.aA(bzmArray[i2].CS(), bzmArray[i2].aEV());
            }
        }
    }

    protected void a(byw.d d2, byz byz2) {
        switch (d2) {
            default: 
        }
    }

    protected abstract void b(int var1, String var2, String var3);

    protected final String f(boolean[] blArray) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        int n = this.ecU.length;
        for (int i = 0; i < n; ++i) {
            if (i > 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(blArray[i]);
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    protected final void oe(int n) {
        ldv ldv2 = ((cdb)this.aDd()).aJX().bhb();
        gab gab2 = (gab)this.MessageDelegator.h(6403, this.GUID, ldv2);
        gab2.edq = n;
        this.MessageDelegator.F(gab2);
    }

    public void nL(int n) {
    }

    public void nM(int n) {
    }

    public void a(int n, boolean[] blArray) {
    }

    public void nF(int n) {
    }

    public void a(dbo dbo2, float f2) {
        assert (!this.isServerObject());
    }

    public void a(dbo dbo2) {
        assert (!this.isServerObject());
    }

    protected void aEb() {
    }
}

