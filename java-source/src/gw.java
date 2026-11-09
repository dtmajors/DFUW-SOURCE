/*
 * Decompiled with CFR.
 */
import java.util.HashMap;
import java.util.IdentityHashMap;

public class gw {
    private final HashMap<ldv, ia> Yj = (HashMap)lcn.emw();
    private final HashMap<ldv, IdentityHashMap<ik, il>> Yk = (HashMap)lcn.emw();

    public final ia ax(ldv ldv2) {
        assert (ldv2.enx() == 0);
        return this.Yj.get(ldv2);
    }

    public final ia ay(ldv ldv2) {
        ia ia2 = this.ax(ldv2);
        if (ia2 != null) {
            return ia2;
        }
        ia2 = new ia(this, ldv2);
        this.Yj.put(ldv2, ia2);
        return ia2;
    }

    public final il a(ik ik2, ldv ldv2) {
        return ik2.afS.get(ldv2);
    }

    public final il a(ik ik2, ldv ldv2, a a2) {
        il il2 = this.a(ik2, ldv2);
        if (il2 != null) {
            assert (il2.afT == a2);
            return il2;
        }
        ia ia2 = this.ay(ldv2);
        il2 = new il(ia2, ik2, a2);
        ik2.afS.put(ldv2, il2);
        IdentityHashMap<ik, il> identityHashMap = this.Yk.get(ldv2);
        if (identityHashMap == null) {
            identityHashMap = new IdentityHashMap();
            this.Yk.put(ldv2, identityHashMap);
        }
        identityHashMap.put(ik2, il2);
        return il2;
    }

    public final IdentityHashMap<ik, il> az(ldv ldv2) {
        return this.Yk.get(ldv2);
    }

    final void bQ(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; ++i) {
            stringBuilder.append("  ");
        }
        String string = stringBuilder.toString();
        lfn.b(3, "SUBS", string + "BEGIN SharedOSIByOSGUID");
        for (ldv ldv2 : this.Yj.keySet()) {
            lfn.b(3, "SUBS", string + "  " + ldv2 + ": " + this.Yj.get(ldv2));
        }
        lfn.b(3, "SUBS", string + "BEGIN SubscriberOSIByOSGUID");
        for (ldv ldv2 : this.Yk.keySet()) {
            IdentityHashMap<ik, il> identityHashMap = this.Yk.get(ldv2);
            lfn.b(3, "SUBS", string + "  BEGIN SubscriberOSIByOSGUID " + ldv2);
            for (ik ik2 : identityHashMap.keySet()) {
                lfn.b(3, "SUBS", string + "    " + ik2 + " -> " + identityHashMap.get(ik2));
            }
        }
    }

    void a(il il2) {
        ia ia2;
        IdentityHashMap<ik, il> identityHashMap;
        ldv ldv2 = il2.afU.Yc;
        il il3 = il2.Rc.afS.remove(ldv2);
        if (il3 != il2) {
            lfn.b(5, "SFObjectSpaceInfoManager", "notifySubscriberOSIRefCountZero(): (SubscriberInfoByOSGUID) OSI " + il2 + " != " + (il3 == null ? "null" : il3) + " for " + il2.Rc);
        }
        if ((identityHashMap = this.Yk.get(ldv2)) == null) {
            lfn.b(5, "SFObjectSpaceInfoManager", "notifySubscriberOSIRefCountZero(): OSI " + il2 + ": Not found in SubscriberOSIByOSGUID");
        } else {
            il3 = identityHashMap.remove(il2.Rc);
            if (il3 != il2) {
                lfn.b(5, "SFObjectSpaceInfoManager", "notifySubscriberOSIRefCountZero(): (SubscriberOSIByOSGUID) OSI " + il2 + " != " + (il3 == null ? "null" : il3) + " for " + il2.Rc);
            }
            if (identityHashMap.isEmpty()) {
                this.Yk.remove(ldv2);
            }
        }
        if (il2.afU.Rl == 0 && (ia2 = this.Yj.remove(ldv2)) != il2.afU) {
            lfn.b(5, "SFObjectSpaceInfoManager", "notifySubscriberOSIRefCountZero(): SharedOSI " + il2.afU + " != " + ia2 + " when removing " + il2);
        }
    }
}

