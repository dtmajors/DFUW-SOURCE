/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  is
 *  lcr
 *  lcw
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Set;

public class ij
extends btk {
    private final is Xb;
    private HashMap<ldv, ik> afw = (HashMap)lcn.emw();
    private ik[] afx = new ik[65500];
    private a[] afy = new a[65500];
    private ArrayList<gql> afz = lcn.emv();
    private HashMap<Integer, ik> afA = (HashMap)lcn.emw();
    private HashMap<ldv, dxq> afB = (HashMap)lcn.emw();
    private IdentityHashMap<ik, Object>[] afC = new IdentityHashMap[10];
    private int Qs = 1;
    private int afD = 0;

    ij(is is2) {
        this.Xb = is2;
    }

    public final void bQ(int n) {
        int n2;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; ++i) {
            stringBuilder.append("  ");
        }
        String string = stringBuilder.toString();
        lfn.b(3, "SUBS", string + "BEGIN ObjectSpaceMappings");
        for (ldv ldv2 : this.afw.keySet()) {
            lfn.b(3, "SUBS", string + "  ObjectSpaceGUID " + ldv2 + " mapped to " + this.afw.get(ldv2));
        }
        lfn.b(3, "SUBS", string + "BEGIN SubscriberArray (" + this.afD + " subscribers)");
        for (n2 = 0; n2 < 65500; ++n2) {
            if (this.afx[n2] == null) continue;
            lfn.b(3, "SUBS", string + "  Subscriber " + n2 + ": " + this.afx[n2]);
            this.afx[n2].bQ(n + 2);
        }
        lfn.b(3, "SUBS", string + "BEGIN SubscriberInfoArray");
        for (n2 = 0; n2 < 65500; ++n2) {
            if (this.afy[n2] == null) continue;
            lfn.b(3, "SUBS", string + "  Subscriber " + n2 + ": " + this.afy[n2]);
        }
    }

    public im c(ldv ldv2, ldv ldv3) {
        im im2 = new im(this.Xb, ldv2, ldv2.ib() < 1024);
        this.afx[ldv2.ib()] = im2;
        im2.af(ldv3);
        ++this.afD;
        return im2;
    }

    public Set<ldv> ng() {
        Set<ldv> set = lcn.emx();
        int n = 0;
        for (int i = 0; i < this.afx.length && n != this.afD; ++i) {
            if (this.afx[i] == null) continue;
            set.add(this.afx[i].GUID);
            ++n;
        }
        return set;
    }

    public ik bl(ldv ldv2) {
        return this.afx[ldv2.ib()];
    }

    public a bm(ldv ldv2) {
        return this.afy[ldv2.ib()];
    }

    public void bn(ldv ldv2) {
        a a2 = this.bm(ldv2);
        if (a2 == null) {
            lfn.b(5, "SFSubscriberManagerNew", "removeSubscriber(): Could not find subscriberinfo for " + ldv2);
        } else {
            this.afy[ldv2.ib()] = null;
        }
        ik ik2 = this.bl(ldv2);
        if (ik2 == null) {
            return;
        }
        ik2.cleanUp();
        this.afx[ldv2.ib()] = null;
        --this.afD;
        if (!ik2.afI) {
            ldv ldv3 = lcr.ak((ldv)lcr.qAS, (int)65534);
            gsi gsi2 = (gsi)this.MessageDelegator.h(11067, this.GUID, ldv3);
            gsi2.adA = ldv2;
            this.MessageDelegator.F(gsi2);
            if (!ik2.afH) {
                this.Xb.agD.ba(ik2.GUID);
            }
        }
    }

    public void nh() {
        if (!this.afz.isEmpty()) {
            int n = this.afz.size();
            for (int i = 0; i < n; ++i) {
                gql gql2 = this.afz.get(i);
                this.a(gql2);
            }
            this.afz.clear();
        }
    }

    private void a(gql gql2) {
        if (gql2.adA == null) {
            lfn.b(5, "SFSubscriberManager", "handleCreateSubscriberRequest() SubscriberGUID is null.");
            return;
        }
        if (this.bl(gql2.adA) != null) {
            lfn.b(5, "SFSubscriberManager", "handleCreateSubscriberRequest() Subscriber " + gql2.adA + " already exists.");
            return;
        }
        if (gql2.adD) {
            if (this.bm(gql2.adA) != null) {
                lfn.b(5, "SFSubscriberManager", "handleCreateSubscriberRequest() SubscriberInfo for subscriber " + gql2.adA + " already exists.");
                return;
            }
            this.afy[gql2.adA.ib()] = new a(this, gql2.adA, null, null);
            a a2 = this.bm(gql2.adA);
            this.bo(a2.adA);
            ih ih2 = new ih(this.Xb, a2.adA);
            this.afx[a2.adA.ib()] = ih2;
            ++this.afD;
            int n = this.Qs++;
            this.afA.put(n, ih2);
            this.n(n, 4);
            if (lcw.enb() && lcw.qGX) {
                this.Xb.aeX.a(ih2, new ldv(1024, 5000, 0), gw.a.Yl).bx(null);
            }
        } else {
            ii ii2 = new ii(this.Xb, gql2.adA, null);
            this.afx[gql2.adA.ib()] = ii2;
            this.Xb.agD.aZ(ii2.GUID);
            gsk gsk2 = (gsk)this.afB.remove(ii2.GUID);
            if (gsk2 == null) {
                return;
            }
            gj[] gjArray = gsk2.jqN;
            assert (gjArray != null);
            int n = gjArray.length;
            for (int i = 0; i < n; ++i) {
                ii2.d(gjArray[i]);
            }
            ii2.nj();
            ldv ldv2 = gsk2.aO().bFk();
            ii2.bu(ldv2);
        }
    }

    private void n(int n, int n2) {
        assert (n > 0);
        assert (n2 > 0);
        foq foq2 = (foq)this.MessageDelegator.h(18945, this.GUID, lcr.qAZ);
        foq2.aqs = n;
        foq2.afj = n2;
        this.MessageDelegator.F(foq2);
    }

    private void bo(ldv ldv2) {
        assert (ldv2 != null);
        ldv ldv3 = lcr.ak((ldv)lcr.qAS, (int)65534);
        gsh gsh2 = (gsh)this.MessageDelegator.h(11066, this.GUID, ldv3);
        gsh2.adA = ldv2;
        gsh2.adD = true;
        this.MessageDelegator.F(gsh2);
    }

    private void a(gsh gsh2) {
        if (this.bl(gsh2.adA) != null) {
            lfn.b(5, "SFSubscriberManagerNew", "handleSystemSubscriberInfoCreateMessage(): SubscriberInfo already exists. SI=" + this.afy[gsh2.adA.ib()]);
            assert (false);
            return;
        }
        this.afy[gsh2.adA.ib()] = new a(this, gsh2.adA, gsh2.Tr, gsh2.WX);
    }

    private void a(gsi gsi2) {
        if (this.bm(gsi2.adA) == null) {
            lfn.b(5, "SFSubscriberManagerNew", "handleSystemSubscriberInfoRemoveMessage(): SubscriberInfo doesn't exist for " + gsi2.adA);
            return;
        }
        this.bn(gsi2.adA);
    }

    private void a(gsj gsj2) {
        ik ik2;
        if (gsj2.adA == null) {
            lfn.b(5, "SFSubscriberManager", "handleSubscriberInfoUpdateMessage() SubscriberGUID is null.");
            return;
        }
        if (gsj2.afF == null) {
            lfn.b(5, "SFSubscriberManager", "handleSubscriberInfoUpdateMessage() PlayerObjectGUID is null.");
            return;
        }
        a a2 = this.bm(gsj2.adA);
        if (a2 == null) {
            lfn.b(5, "SFSubscriberManager", "handleSubscriberInfoUpdateMessage() Could not find subscriberinfo for subscriber " + gsj2.adA);
            return;
        }
        assert (a2.afF == null);
        a2.afF = gsj2.afF;
        if (a2.Tr == null) {
            a2.Tr = gsj2.aO();
        }
        if ((ik2 = this.bl(gsj2.adA)) != null) {
            ik2.bt(gsj2.afF);
            ik2.af(gsj2.aO());
        }
    }

    private void a(fkt fkt2) {
        if (fkt2.adA == null) {
            lfn.b(5, "SFSubscriberManagerNew", "handlePersonalizedQuestListResponse(): SubscriberGUID is null.");
            return;
        }
        ik ik2 = this.bl(fkt2.adA);
        if (ik2 == null) {
            lfn.b(5, "SFSubscriberManagerNew", "handlePersonalizedQuestListResponse(): Subscriber " + fkt2.adA + " was not found.");
            return;
        }
        if (fkt2.iOX == null) {
            return;
        }
        assert (ik2.me() != null);
        it it2 = ik2.br(fkt2.aO());
        if (it2 == null) {
            lfn.b(5, "SFSubscriberManagerNew", "handlePersonalizedQuestListResponse(): Subscriber " + ik2 + " doesn't subscribe to InteractionQuestLogic " + fkt2.aO());
            return;
        }
        fkt2.f(this.GUID);
        fkt2.adA = ik2.GUID;
        fkt2.SA = ik2.me();
        ldv ldv2 = lcr.ak((ldv)it2.ahf.getGUID(), (int)ik2.GUID.ib());
        fkt2.on(ldv2);
        this.MessageDelegator.F(fkt2);
    }

    private void a(gqk gqk2) {
        if (gqk2.adA == null) {
            lfn.b(5, "SFSubscriberManagerNew", "handleSystemCreateSubscriberHintMessage() SubscriberGUID is null.");
            return;
        }
        ik ik2 = this.bl(gqk2.adA);
        if (ik2 != null) {
            return;
        }
        a a2 = this.bm(gqk2.adA);
        if (a2 == null) {
            return;
        }
        ik2 = this.c(a2.adA, a2.Tr);
        if (a2.afF != null) {
            ik2.bt(a2.afF);
        }
    }

    private void a(gsk gsk2) {
        Object object;
        if (gsk2.adA == null) {
            return;
        }
        if (gsk2.ija != 4 && (object = this.bm(gsk2.adA)) == null) {
            if (lcw.enb() && gsk2.adA.ib() == 7000) {
                this.afy[gsk2.adA.ib()] = object = new a(this, gsk2.adA, null, new gj[0]);
            } else {
                lfn.b(5, "SFSubscriberManager", "handleSubscriberUpdateMessage() Could not find subscriberinfo for subscriber " + gsk2.adA);
                return;
            }
        }
        switch (gsk2.ija) {
            case 1: {
                if (gsk2.afn == null) {
                    lfn.b(5, "SFSubscriberManager", "handleSubscriberUpdateMessage(ADD_KEY) Key is null.");
                    return;
                }
                object = this.bl(gsk2.adA);
                if (object == null) {
                    return;
                }
                if (((ik)object).b(gsk2.afn)) {
                    lfn.b(5, "SFSubscriberManager", "handleSubscriberUpdateMessage(ADD_KEY) Subscriber " + object + " already contains key " + gsk2.afn);
                    return;
                }
                if (!((ik)object).d(gsk2.afn)) break;
                ((ik)object).nj();
                this.Xb.agE.a((ik)object, gsk2.afn);
                break;
            }
            case 2: {
                object = this.bl(gsk2.adA);
                if (object == null) {
                    return;
                }
                if (gsk2.afn == null) {
                    return;
                }
                if (!((ik)object).b(gsk2.afn)) {
                    return;
                }
                if (!((ik)object).e(gsk2.afn)) break;
                ((ik)object).nj();
                this.Xb.agE.b((ik)object, gsk2.afn);
                break;
            }
            case 3: {
                if (gsk2.jqN == null || gsk2.jqN.length == 0) {
                    return;
                }
                object = this.bl(gsk2.adA);
                if (object != null) {
                    return;
                }
                this.afB.put(gsk2.adA, gsk2);
                break;
            }
            case 4: {
                if (gsk2.Rr == null) {
                    return;
                }
                object = this.bl(gsk2.adA);
                if (object == null) {
                    return;
                }
                ((ik)object).bu(gsk2.Rr);
                break;
            }
            case 5: {
                if (gsk2.Rr == null) {
                    return;
                }
                object = this.bl(gsk2.adA);
                if (object == null) {
                    return;
                }
                ((ik)object).bv(gsk2.Rr);
                break;
            }
            default: {
                return;
            }
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11018: {
                this.afz.add((gql)dxq2);
                break;
            }
            case 11049: {
                this.a((gsk)dxq2);
                break;
            }
            case 11066: {
                this.a((gsh)dxq2);
                break;
            }
            case 11067: {
                this.a((gsi)dxq2);
                break;
            }
            case 11068: {
                this.a((gsj)dxq2);
                break;
            }
            case 11069: {
                this.a((gqk)dxq2);
                break;
            }
            case 11788: {
                this.a((fkt)dxq2);
                break;
            }
            case 13322: {
                break;
            }
            case 13326: {
                break;
            }
            case 13313: {
                this.a((dyz)dxq2);
                break;
            }
            case 13336: {
                this.ni();
                break;
            }
            case 13337: {
                this.a((dyh)dxq2);
                break;
            }
            case 18946: {
                this.a((for)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(dyz dyz2) {
        for (ik ik2 : this.afx) {
            if (ik2 == null || !(ik2 instanceof ih)) continue;
            dyz dyz3 = (dyz)this.MessageDelegator.h(13313, this.GUID, ik2.GUID);
            dyz3.jT(dyz2.bEM());
            this.MessageDelegator.E(dyz3);
        }
    }

    private void ni() {
        for (ik ik2 : this.afx) {
            if (ik2 == null || !(ik2 instanceof ih)) continue;
            dza dza2 = (dza)this.MessageDelegator.h(13336, this.GUID, ik2.GUID);
            this.MessageDelegator.E(dza2);
        }
    }

    private void a(dyh dyh2) {
        for (ik ik2 : this.afx) {
            if (ik2 == null || !(ik2 instanceof ih)) continue;
            dyh dyh3 = (dyh)this.MessageDelegator.h(13337, this.GUID, ik2.GUID);
            dyh3.Db(dyh2.bEL());
            this.MessageDelegator.E(dyh3);
        }
    }

    IdentityHashMap<ik, Object> cn(int n) {
        if (n <= 0) {
            return null;
        }
        return this.afC[n % 10];
    }

    void a(ik ik2, int n) {
        if (n <= 0) {
            return;
        }
        IdentityHashMap<ik, Object> identityHashMap = this.afC[n % 10];
        if (identityHashMap == null) {
            this.afC[n % 10] = identityHashMap = new IdentityHashMap();
        }
        identityHashMap.put(ik2, null);
    }

    private void h(ldv ldv2, boolean bl) {
        gqm gqm2 = (gqm)this.MessageDelegator.h(11019, this.GUID, ldv2);
        gqm2.jpp = bl;
        this.MessageDelegator.E(gqm2);
    }

    private void a(for for_) {
        if (for_.aVk() == -1) {
            return;
        }
        if (for_.afn == null) {
            return;
        }
        ik ik2 = this.afA.remove(for_.aVk());
        if (ik2 == null) {
            return;
        }
        if (ik2.d(for_.afn)) {
            ik2.nj();
            this.Xb.agE.a(ik2, for_.afn);
        }
        this.h(ik2.GUID, true);
    }

    void a(ldv ldv2, ik ik2) {
        this.afw.put(ldv2, ik2);
    }

    void b(ldv ldv2, ik ik2) {
        this.afw.remove(ldv2);
    }

    public ik bp(ldv ldv2) {
        assert (ldv2.enx() == 0);
        return this.afw.get(ldv2);
    }

    void a(iu iu2, goj goj2) {
        goj2.jnV = fs.SZ.ij();
        goj2.jnS = in.agb;
        goj2.jnT = (int)fs.SZ.ij() * 3;
        goj2.jnU = (int)(this.MessageDelegator.arc().rgz * 10.0);
        double d2 = 0.0;
        double d3 = in.agb;
        double d4 = 0.0;
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        long l = 0L;
        int n4 = 10000;
        int n5 = 0;
        for (int i = 1024; i < 65500; ++i) {
            if (this.afx[i] == null) continue;
            ++n;
            if (this.afx[i] instanceof im) {
                ++n3;
                continue;
            }
            ii ii2 = (ii)this.afx[i];
            ++n2;
            int n6 = ii2.afv.gS();
            if (n6 > n5) {
                n5 = n6;
            }
            if (n6 < n4) {
                n4 = n6;
            }
            l += (long)n6;
            float f = ii2.afv.gP();
            if (f < 1.0f) {
                f = fs.SZ.ij();
            }
            if ((double)f < d3) {
                d3 = f;
            }
            if ((double)f > d4) {
                d4 = f;
            }
            d2 += (double)f;
        }
        if (n2 == 0) {
            goj2.jnX = in.agb;
            goj2.jnY = in.agb;
            goj2.jnW = in.agb;
            goj2.ahs = 0;
            goj2.aht = 0;
            goj2.ahr = 0;
        } else {
            goj2.jnX = (float)(d2 / (double)n2);
            goj2.jnW = (float)d3;
            goj2.jnY = (float)d4;
            goj2.ahs = (int)(l / (long)n2);
            goj2.ahr = n4;
            goj2.aht = n5;
        }
        goj2.ahu = n2;
        goj2.ahv = n3;
        goj2.afD = n;
    }
}

