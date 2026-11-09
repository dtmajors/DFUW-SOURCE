/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ayd
 *  cug
 */
import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class bcy
extends btk
implements bdf {
    private static final double cYs = 3600.0;
    private static final int cYt = 10000;
    private ayd cCy = null;
    private bde cYu = null;
    private bdc cYv = null;
    private long cYw = 0L;
    private int cYx = 0;
    private Map<Long, bda> cYy = null;
    private Set<Long> cYz = null;
    private List<lil<env, bcx, long[]>> cYA = null;
    private Map<ldv, Double> cYB = null;

    long alt() {
        return this.cYw;
    }

    void C(long l) {
        this.cYw = l;
    }

    public bcy(ayd ayd2, bde bde2) {
        this.cCy = ayd2;
        this.cYu = bde2;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.cYy = lcn.emw();
        this.cYz = lcn.emx();
        this.cYA = lcn.emA();
        this.cYB = lcn.emw();
        this.cYv = new bdc(this.cCy, this.cYu, this);
        this.cYv.alQ();
        this.cYx = 1000000;
    }

    @Override
    public void cleanUp() {
        this.cYy.clear();
        this.cYz.clear();
        this.cYA.clear();
        this.cYB.clear();
        if (this.cYv != null) {
            this.cYv.cleanUp();
            this.cYv = null;
        }
        super.cleanUp();
    }

    void a(bda bda2) {
        if (this.cYy == null) {
            this.cYy = lcn.emw();
        }
        bda2.E(this.cYw++);
        this.cYy.put(bda2.aly(), bda2);
        bda2.aP(this.MessageDelegator.arc().rgz);
        this.alv();
    }

    boolean D(long l) {
        return this.cYy.containsKey(l);
    }

    @Override
    public void a(int n, lmn lmn2) {
        this.b(lmn2, n);
    }

    @Override
    public void ad(int n, int n2) {
        lfn.b(5, this.getClass().getSimpleName(), "handleSQLQueryError() : SQL Query Failed!!!... ErrorCode = " + n2 + ", Context = " + n);
        assert (false);
        if (!this.cYA.isEmpty()) {
            for (lil<env, bcx, long[]> lil2 : this.cYA) {
                this.a((env)lil2.reX, bcx.cYh, null);
            }
            this.cYA.clear();
        }
    }

    private String b(long[] lArray) {
        if (lArray == null || lArray.length == 0) {
            return null;
        }
        String string = "SELECT TransactionID, TransactionType, ResourceName, Quantity, Timestamp, CharacterID, CharacterName, SourceID, SourceResource, OtherClanGUID, OtherClanName";
        string = string + bcz.alw();
        string = string + " WHERE TransactionID = " + lArray[0];
        for (int i = 1; i < lArray.length; ++i) {
            string = string + " OR TransactionID = " + lArray[i];
        }
        return string + ";";
    }

    private void b(lmn lmn2, int n) {
        Object object;
        Object object2;
        if (lmn2.euT().length > 0) {
            object2 = lmn2.euS();
            for (int i = 0; i < lmn2.euT().length; ++i) {
                object = lmn2.euT()[i];
                long l = dvx.g(this.a((lmo)object, (lmg[])object2, "TransactionID"));
                bdh bdh2 = bdh.getValueByOrdinal(dvx.d(this.a((lmo)object, (lmg[])object2, "TransactionType")));
                int n2 = cug.ih((String)dvx.c(this.a((lmo)object, (lmg[])object2, "ResourceName")));
                int n3 = dvx.d(this.a((lmo)object, (lmg[])object2, "Quantity"));
                int n4 = dvx.d(this.a((lmo)object, (lmg[])object2, "CharacterID"));
                String string = dvx.c(this.a((lmo)object, (lmg[])object2, "CharacterName"));
                String string2 = dvx.c(this.a((lmo)object, (lmg[])object2, "SourceID"));
                int n5 = cug.ih((String)dvx.c(this.a((lmo)object, (lmg[])object2, "SourceResource")));
                ldv ldv2 = dvx.h(this.a((lmo)object, (lmg[])object2, "OtherClanGUID"));
                String string3 = dvx.c(this.a((lmo)object, (lmg[])object2, "OtherClanName"));
                Timestamp timestamp = dvx.i(this.a((lmo)object, (lmg[])object2, "Timestamp"));
                long l2 = timestamp.getTime();
                bda bda2 = new bda(bdh2, n2, n3, l2, n4, string, string2, n5, ldv2, string3);
                this.cYv.a(bda2, l);
                this.cYz.remove(l);
                this.cYy.put(bda2.aly(), bda2);
                bda2.aP(this.MessageDelegator.arc().rgz);
            }
        }
        if (!this.cYA.isEmpty()) {
            object2 = this.cYA.iterator();
            while (object2.hasNext()) {
                bda[] bdaArray;
                lil lil2 = (lil)object2.next();
                object = this.cYu.d((env)lil2.reX);
                if (object != bcx.cYi) {
                    this.a((env)lil2.reX, (bcx)((Object)object), null);
                    object2.remove();
                }
                if ((bdaArray = this.c((long[])lil2.reZ)) == null) continue;
                this.a((env)lil2.reX, (bcx)((Object)lil2.reY), bdaArray);
                object2.remove();
            }
        }
        this.alv();
    }

    private lmi a(lmo lmo2, lmg[] lmgArray, String string) {
        if (lmo2 == null || lmo2.euV() == null || lmgArray == null || lmgArray.length == 0 || string == null) {
            return null;
        }
        int n = this.a(lmgArray, string);
        if (n < 0 || n >= lmo2.euV().length) {
            return null;
        }
        return lmo2.euV()[n];
    }

    private int a(lmg[] lmgArray, String string) {
        if (lmgArray == null || string == null) {
            return -1;
        }
        for (int i = 0; i < lmgArray.length; ++i) {
            if (!lmgArray[i].getName().equals(string)) continue;
            return i;
        }
        return -1;
    }

    void a(env env2, long[] lArray, bcx bcx2) {
        if (lArray == null || !bcx2.vA()) {
            this.a(env2, bcx2, null);
            return;
        }
        bcx bcx3 = this.cYu.d(env2);
        if (bcx3 != bcx.cYi) {
            this.a(env2, bcx3, null);
            return;
        }
        bda[] bdaArray = this.c(lArray);
        if (bdaArray != null) {
            this.a(env2, bcx2, bdaArray);
        } else {
            long[] lArray2 = this.d(lArray);
            if (lArray2 != null && lArray2.length > 0) {
                this.cYu.a(this.b(lArray2), this.cYx++, this);
            }
            this.cYA.add(new lil<env, bcx, long[]>(env2, bcx2, lArray));
        }
    }

    private bda[] c(long[] lArray) {
        if (lArray == null || lArray.length == 0) {
            return new bda[0];
        }
        for (int i = 0; i < lArray.length; ++i) {
            if (this.cYy.containsKey(lArray[i])) continue;
            return null;
        }
        bda[] bdaArray = new bda[lArray.length];
        for (int i = 0; i < bdaArray.length; ++i) {
            bdaArray[i] = this.cYy.get(lArray[i]);
            bdaArray[i].aP(this.MessageDelegator.arc().rgz);
        }
        return bdaArray;
    }

    private long[] d(long[] lArray) {
        int n;
        if (lArray == null || lArray.length == 0) {
            return null;
        }
        int n2 = 0;
        for (int i = 0; i < lArray.length; ++i) {
            if (this.cYy.containsKey(lArray[i]) || this.cYz.contains(lArray[i])) continue;
            ++n2;
        }
        if (n2 == 0) {
            return null;
        }
        long[] lArray2 = new long[n2];
        int n3 = 0;
        for (n = 0; n < lArray.length; ++n) {
            if (this.cYy.containsKey(lArray[n]) || this.cYz.contains(lArray[n])) continue;
            lArray2[n3++] = this.cYv.I(lArray[n]);
        }
        for (n = 0; n < lArray2.length; ++n) {
            this.cYz.add(lArray2[n]);
        }
        return lArray2;
    }

    void alu() {
        Iterator<Map.Entry<Long, bda>> iterator = this.cYy.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Long, bda> entry = iterator.next();
            if (!(this.MessageDelegator.arc().rgz - entry.getValue().alG() >= 3600.0)) continue;
            iterator.remove();
        }
        this.alv();
    }

    private void alv() {
        while (this.cYy.size() > 10000) {
            long l = -1L;
            double d2 = Double.MAX_VALUE;
            for (Map.Entry<Long, bda> entry : this.cYy.entrySet()) {
                if (!(entry.getValue().alG() < d2)) continue;
                d2 = entry.getValue().alG();
                l = entry.getKey();
            }
            if (l < 0L) break;
            this.cYy.remove(l);
        }
    }

    private void a(ent ent2, bcx bcx2) {
        enu enu2 = (enu)this.MessageDelegator.h(13922, this.cCy.getGUID(), ent2.aO());
        this.MessageDelegator.b(ent2, enu2);
        enu2.a(bcx2);
        enu2.ac(bcx2.vA() ? this.cYw : 0L);
        this.MessageDelegator.F(enu2);
    }

    private void a(env env2, bcx bcx2, bda[] bdaArray) {
        assert (env2 != null);
        assert (bcx2 != null);
        enw enw2 = (enw)this.MessageDelegator.h(13920, this.cCy.getGUID(), env2.aO());
        this.MessageDelegator.b(env2, enw2);
        enw2.b(bcx2);
        enw2.c(bdaArray);
        enw2.af(bcx2.vA() ? 0L : this.cYw - 1L);
        this.MessageDelegator.F(enw2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 13921: {
                this.a((ent)dxq2);
                break;
            }
            case 13919: {
                this.a((env)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(ent ent2) {
        bbr bbr2 = this.cCy.dR(ent2.bHi());
        if (bbr2 == null && !ent2.bEN().lo()) {
            this.a(ent2, bcx.cYj);
            return;
        }
        if (bbr2 != null && !bbr2.b(bca.cUb)) {
            this.a(ent2, bcx.cYj);
            return;
        }
        this.a(ent2, bcx.cYi);
    }

    private void a(env env2) {
        double d2;
        bcx bcx2 = this.cYu.d(env2);
        if (bcx2 != bcx.cYi) {
            this.a(env2, bcx2, null);
            return;
        }
        double d3 = d2 = this.cYB.containsKey(env2.bJK()) ? this.cYB.remove(env2.aO()) : 0.0;
        if (this.MessageDelegator.arc().rgz - d2 < 5.0) {
            // empty if block
        }
        this.cYB.put(env2.aO(), this.MessageDelegator.arc().rgz);
        this.cYv.b(env2);
    }
}

