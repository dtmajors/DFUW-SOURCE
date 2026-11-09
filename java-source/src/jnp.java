/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  jnk
 *  lcw
 */
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class jnp
extends jnl {
    private static final int nEb = 1000;
    private Map<Long, bda> nEc = lcn.emw();
    private long nEd = -1L;
    private boolean nEe = false;
    private Queue<lil<hur, Integer, Long>> nEf = lcn.emA();
    private Queue<lil<hur, Integer, Long>> nEg = lcn.emA();
    private Map<hur, Integer> nEh = lcn.emw();
    private Set<Long> nEi = lcn.emx();
    private Map<hur, Integer> nEj = lcn.emw();

    public boolean dNR() {
        return this.nEd >= 0L;
    }

    jnp(jng jng2, jnr jnr2, dmn dmn2, jnk jnk2) {
        super(jng2, jnr2, dmn2, jnk2);
    }

    private boolean uo(boolean bl) {
        if (this.nEe == bl) {
            return false;
        }
        this.nEe = bl;
        if (!this.nEe) {
            if (!this.nEg.isEmpty()) {
                this.nEf.addAll(this.nEg);
            }
            this.nEg.clear();
        }
        return true;
    }

    private void b(lil<hur, Integer, Long> lil2) {
        if (this.nEe) {
            this.nEg.add(lil2);
        } else {
            this.nEf.add(lil2);
        }
    }

    @Override
    void dNE() {
        this.nDF = this.nDv.dNJ();
        if (this.nDF == null || !this.nDF.b(bca.cUb)) {
            this.nEc.clear();
        }
    }

    @Override
    void dNF() {
        this.nDF = this.nDv.dNJ();
    }

    @Override
    void bqx() {
        this.nDF = null;
        this.nEc.clear();
    }

    void b(hur hur2) {
        this.b(hur2, false);
    }

    void b(hur hur2, boolean bl) {
        this.b(hur2, bl, (this.nEh.containsKey(hur2) ? this.nEh.get(hur2) : -1) + 1);
    }

    void b(hur hur2, boolean bl, int n) {
        if (hur2 == null) {
            return;
        }
        if (this.nDF == null || !this.nDF.b(bca.cUb)) {
            hur2.a(bcx.cYj, null, n);
            return;
        }
        this.b(new lil<hur, Integer, Long>(hur2, Math.max(0, bl ? 0 : n), bl ? -1L : this.nEd));
        this.nEh.put(hur2, Math.max(0, bl ? 0 : n));
        if (!this.nEj.containsKey(hur2)) {
            this.nEj.put(hur2, this.nEj.size());
        }
        if (bl || !this.dNR()) {
            this.dNT();
            return;
        }
        this.dNS();
    }

    private void dNS() {
        if (this.nEf.isEmpty()) {
            return;
        }
        if (!this.dNR()) {
            lfn.b(5, this.getClass().getSimpleName(), "processNextPageRequest() : Session Not Active!!!");
            return;
        }
        if (!this.uo(true)) {
            return;
        }
        Iterator iterator = this.nEf.iterator();
        while (iterator.hasNext()) {
            bcx bcx2;
            bda[] bdaArray;
            lil lil2 = (lil)iterator.next();
            long l = (Long)lil2.reZ - (long)((Integer)lil2.reY * bcz.cZc);
            long l2 = Math.max(l - (long)bcz.cZc, 0L);
            if (l < 0L || l2 < 0L) {
                if (this.nEd == (Long)lil2.reZ) {
                    ((hur)lil2.reX).a(bcx.cYl, new bda[0], (Integer)lil2.reY);
                }
                iterator.remove();
                continue;
            }
            if (l != l2 && l2 != 0L) {
                ++l2;
            }
            if ((bdaArray = this.b(l, l2, (int)this.nEj.get(lil2.reX))) == null) continue;
            bcx bcx3 = bcx2 = bdaArray.length == 0 || bdaArray[bdaArray.length - 1].aly() > 0L ? bcx.cYn : bcx.cYo;
            if (this.nEd == (Long)lil2.reZ) {
                ((hur)lil2.reX).a(bcx2, bdaArray, (Integer)lil2.reY);
            }
            iterator.remove();
        }
        this.uo(false);
        this.alv();
    }

    private boolean b(long l, long l2) {
        for (long j = l; j >= l2; --j) {
            if (this.nEc.containsKey(j)) continue;
            return false;
        }
        return true;
    }

    private void a(long l, long l2, int n) {
        long l3;
        long l4 = l;
        long l5 = Math.min(Math.max(0L, l2), Math.max(0L, l4 - 30L + 1L));
        long l6 = -1L;
        long l7 = -1L;
        for (l3 = l4; l3 >= l5; --l3) {
            if (this.nEc.containsKey(l3) || this.nEi.contains(l3)) continue;
            l6 = l3;
            break;
        }
        l3 = l6;
        while (l3 >= l5 && !this.nEc.containsKey(l3) && !this.nEi.contains(l3)) {
            l7 = l3--;
        }
        if (l6 < 0L || l7 < 0L) {
            return;
        }
        for (l3 = l6; l3 >= l7; --l3) {
            this.nEi.add(l3);
        }
        this.a(new bdb(), 0, l6, l7, n);
    }

    private bda[] b(long l, long l2, int n) {
        if (l < 0L || l2 < 0L || l2 > l) {
            return new bda[0];
        }
        if (!this.b(l, l2)) {
            this.a(l, l2, n);
            return null;
        }
        int n2 = 0;
        bda[] bdaArray = new bda[(int)(l - l2) + 1];
        for (long j = l; j >= l2; --j) {
            bdaArray[n2] = this.nEc.get(j);
            bdaArray[n2].aP(this.MessageDelegator.arc().rgz);
            ++n2;
        }
        return bdaArray;
    }

    private void d(bda[] bdaArray) {
        if (bdaArray == null || bdaArray.length == 0) {
            return;
        }
        for (int j = 0; j < bdaArray.length; ++j) {
            this.nEc.put(bdaArray[j].aly(), bdaArray[j]);
            this.nEi.remove(bdaArray[j].aly());
            bdaArray[j].aP(this.MessageDelegator.arc().rgz);
        }
        if (this.dNR()) {
            this.dNS();
        }
    }

    private void alv() {
        while (this.nEc.size() > 1000) {
            long l = -1L;
            double d2 = Double.MAX_VALUE;
            for (Map.Entry<Long, bda> entry : this.nEc.entrySet()) {
                if (!(entry.getValue().alG() < d2)) continue;
                d2 = entry.getValue().alG();
                l = entry.getKey();
            }
            if (l < 0L) break;
            this.nEc.remove(l);
        }
    }

    private void dNT() {
        assert (this.nDF != null);
        ent ent2 = (ent)this.MessageDelegator.h(13921, this.GUID, this.nDF.iG());
        ent2.oP(this.nDF.abQ().abB());
        ent2.g(lcw.SC);
        this.MessageDelegator.F(ent2);
    }

    private void a(bdb bdb2, int n, long l, long l2, int n2) {
        assert (this.nDF != null);
        env env2 = (env)this.MessageDelegator.h(13919, this.GUID, this.nDF.iG());
        env2.sk(n2);
        env2.oP(this.nDF.abQ().abB());
        env2.g(lcw.SC);
        env2.b(bdb2);
        env2.Ey(n);
        env2.ad(l);
        env2.ae(l2);
        this.MessageDelegator.F(env2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 13922: {
                this.a((enu)dxq2);
                break;
            }
            case 13920: {
                this.a((enw)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(enu enu2) {
        this.nEd = enu2.bJJ() - 1L;
        if (this.nEf.isEmpty()) {
            return;
        }
        if (!this.uo(true)) {
            assert (false);
            return;
        }
        Iterator iterator = this.nEf.iterator();
        while (iterator.hasNext()) {
            lil lil2 = (lil)iterator.next();
            if ((Integer)lil2.reY != 0) continue;
            if (!enu2.bJI().vA()) {
                ((hur)lil2.reX).a(enu2.bJI(), null, 0);
                iterator.remove();
                continue;
            }
            iterator.remove();
            this.nEh.remove(lil2.reX);
            ((hur)lil2.reX).i(enu2.bJJ());
        }
        this.uo(false);
        this.dNS();
    }

    private void a(enw enw2) {
        if (enw2.bJP().vA()) {
            this.d(enw2.bJQ());
        } else {
            this.uo(true);
            Iterator iterator = this.nEf.iterator();
            while (iterator.hasNext()) {
                lil lil2 = (lil)iterator.next();
                if (this.nEj.get(lil2.reX).intValue() != enw2.aVk()) continue;
                ((hur)lil2.reX).a(enw2.bJP(), null, 0);
                iterator.remove();
            }
            this.uo(false);
        }
    }
}

