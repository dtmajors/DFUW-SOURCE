/*
 * Decompiled with CFR.
 */
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class dmm
extends btk {
    public static final boolean gIr = true;
    public static final boolean gIs = false;
    protected mhf gIt = null;
    protected Map<Integer, dml> gIu = lcn.emw();
    protected Map<Integer, dmq> gIv = lcn.emw();
    protected Map<ldv, azg> gIw = null;
    protected Map<ldv, bbh> gIx = null;
    protected Map<ldv, bcp> dih = lcn.emw();
    protected Map<ldv, bbi> dpR = null;
    protected Map<ldv, cmd> gIy = null;

    public mhf bql() {
        return this.gIt;
    }

    public int cg(ljq ljq2) {
        return this.gIt == null ? 0 : this.gIt.eR(ljq2);
    }

    public dml ch(ljq ljq2) {
        return this.AE(this.cg(ljq2));
    }

    public dml AE(int n) {
        return this.gIu.get(n);
    }

    public dmq ci(ljq ljq2) {
        return this.AF(this.cg(ljq2));
    }

    public dmq AF(int n) {
        return this.gIv.get(n);
    }

    public Set<Integer> h(ayq ayq2) {
        return this.mU(ayq2.iG());
    }

    public Set<Integer> a(bcp bcp2) {
        return this.mU(bcp2.iG());
    }

    public Set<Integer> mU(ldv ldv2) {
        Set<azg> set = this.na(ldv2);
        Set<bbh> set2 = this.nh(ldv2);
        Set<bbi> set3 = this.nm(ldv2);
        Set<Integer> set4 = lcn.emx();
        for (azg object : set) {
            set4.add(object.acY());
        }
        for (bbh bbh2 : set2) {
            set4.add(bbh2.acY());
        }
        for (bbi bbi2 : set3) {
            set4.add(bbi2.acY());
        }
        return set4;
    }

    public int i(ayq ayq2) {
        return this.mV(ayq2.iG());
    }

    public int b(bcp bcp2) {
        return this.mV(bcp2.iG());
    }

    public int mV(ldv ldv2) {
        Set<Integer> set = this.mU(ldv2);
        return set.size();
    }

    public dml a(azg azg2) {
        if (azg2 == null) {
            return null;
        }
        block4: for (dml dml2 : this.gIu.values()) {
            switch (azg2.abi()) {
                case cvj: {
                    if (dml2.bqf() == dmj.gIg) break;
                    continue block4;
                }
                case cvk: {
                    if (dml2.bqf() == dmj.gIh) break;
                    continue block4;
                }
                default: {
                    return null;
                }
            }
            if (!dml2.bqg().equals(azg2.getID())) continue;
            return dml2;
        }
        return null;
    }

    public dml a(bbh bbh2) {
        if (bbh2 == null) {
            return null;
        }
        for (dml dml2 : this.gIu.values()) {
            if (dml2.bqf() != dmj.gIi || !dml2.bqg().equals(bbh2.getID())) continue;
            return dml2;
        }
        return null;
    }

    public dml a(bbi bbi2) {
        if (bbi2 == null) {
            return null;
        }
        for (dml dml2 : this.gIu.values()) {
            if (dml2.bqf() != dmj.gIj || !dml2.bqg().equals(bbi2.ajX())) continue;
            return dml2;
        }
        return null;
    }

    public float j(ayq ayq2) {
        return this.mW(ayq2.iG());
    }

    public float c(bcp bcp2) {
        return this.mW(bcp2.iG());
    }

    public float mW(ldv ldv2) {
        float f = 0.0f;
        Set<Integer> set = this.mU(ldv2);
        for (Integer n : set) {
            dml dml2 = this.gIu.get(n);
            f += dml2.bqk();
        }
        return f;
    }

    public Set<bcp> bqm() {
        return new HashSet<bcp>(this.dih.values());
    }

    public bcp mX(ldv ldv2) {
        return this.dih.get(ldv2);
    }

    public bcp b(azg azg2) {
        return azg2 == null || azg2.iG() == null ? null : this.dih.get(azg2.iG());
    }

    public bcp b(bbh bbh2) {
        return bbh2 == null || bbh2.iG() == null ? null : this.dih.get(bbh2.iG());
    }

    public bcp b(bbi bbi2) {
        return bbi2 == null || bbi2.iG() == null ? null : this.dih.get(bbi2.iG());
    }

    public bcp AG(int n) {
        return this.mX(this.gIu.get(n).bqi());
    }

    public String mY(ldv ldv2) {
        return this.dih.containsKey(ldv2) ? this.dih.get(ldv2).iV() : null;
    }

    public bcr Y(ldv ldv2, ldv ldv3) {
        return !this.dih.containsKey(ldv2) ? bcr.cXg : this.dih.get(ldv2).gL(ldv3);
    }

    public Set<azg> bqn() {
        return new HashSet<azg>(this.gIw.values());
    }

    public azg mZ(ldv ldv2) {
        return this.gIw.get(ldv2);
    }

    public Set<azg> bqo() {
        Set<azg> set = lcn.emx();
        for (azg azg2 : this.gIw.values()) {
            if (azg2.iG() == null) continue;
            set.add(azg2);
        }
        return set;
    }

    public Set<azg> k(ayq ayq2) {
        return ayq2 == null ? new HashSet() : this.na(ayq2.iG());
    }

    public Set<azg> d(bcp bcp2) {
        return bcp2 == null ? new HashSet() : this.na(bcp2.iG());
    }

    public Set<azg> na(ldv ldv2) {
        Set<azg> set = lcn.emx();
        for (azg azg2 : this.gIw.values()) {
            if (!ldv.au(ldv2, azg2.iG())) continue;
            set.add(azg2);
        }
        return set;
    }

    public Set<azg> c(bbh bbh2) {
        return bbh2 == null ? new HashSet() : this.nb(bbh2.getGUID());
    }

    public Set<azg> b(ayk ayk2) {
        return ayk2 == null ? new HashSet() : this.nb(ayk2.getGUID());
    }

    public Set<azg> nb(ldv ldv2) {
        Set<azg> set = lcn.emx();
        if (ldv2 == null) {
            return set;
        }
        for (azg azg2 : this.gIw.values()) {
            if (!azg2.eW(ldv2)) continue;
            set.add(azg2);
        }
        if (set.isEmpty()) {
            set.addAll(this.gIw.values());
        }
        return set;
    }

    public boolean nc(ldv ldv2) {
        azg azg2 = this.gIw.get(ldv2);
        if (azg2 == null) {
            return false;
        }
        return azg2.acV() > this.MessageDelegator.arc().rgz;
    }

    public double nd(ldv ldv2) {
        azg azg2 = this.gIw.get(ldv2);
        if (azg2 == null) {
            return 0.0;
        }
        return azg2.acV() - this.MessageDelegator.arc().rgz;
    }

    public int l(ayq ayq2) {
        return this.ne(ayq2.iG());
    }

    public int e(bcp bcp2) {
        return this.ne(bcp2.iG());
    }

    public int ne(ldv ldv2) {
        return this.b(ldv2, null);
    }

    public int a(ayq ayq2, ayb ayb2) {
        return this.b(ayq2.iG(), ayb2);
    }

    public int a(bcp bcp2, ayb ayb2) {
        return this.b(bcp2.iG(), ayb2);
    }

    public int b(ldv ldv2, ayb ayb2) {
        int n = 0;
        Set<azg> set = this.na(ldv2);
        for (azg azg2 : set) {
            if (ayb2 != null && azg2.abi() != ayb2) continue;
            ++n;
        }
        return n;
    }

    public float m(ayq ayq2) {
        return this.c(ayq2.iG(), null);
    }

    public float f(bcp bcp2) {
        return this.c(bcp2.iG(), null);
    }

    public float nf(ldv ldv2) {
        return this.c(ldv2, null);
    }

    public float b(ayq ayq2, ayb ayb2) {
        return this.c(ayq2.iG(), ayb2);
    }

    public float b(bcp bcp2, ayb ayb2) {
        return this.c(bcp2.iG(), ayb2);
    }

    public float c(ldv ldv2, ayb ayb2) {
        float f = 0.0f;
        Set<Integer> set = this.mU(ldv2);
        block4: for (Integer n : set) {
            dml dml2 = this.gIu.get(n);
            if (dml2 == null || !dml2.bqf().bqb()) continue;
            if (ayb2 != null) {
                switch (ayb2) {
                    case cvj: {
                        if (dml2.bqf() == dmj.gIg) break;
                        continue block4;
                    }
                    case cvk: {
                        if (dml2.bqf() == dmj.gIh) break;
                        continue block4;
                    }
                    default: {
                        continue block4;
                    }
                }
            }
            f += dml2.bqk();
        }
        return f;
    }

    public Set<bbh> bqp() {
        return new HashSet<bbh>(this.gIx.values());
    }

    public bbh ng(ldv ldv2) {
        return this.gIx.get(ldv2);
    }

    public Set<bbh> bqq() {
        Set<bbh> set = lcn.emx();
        for (bbh bbh2 : this.gIx.values()) {
            if (bbh2.iG() == null) continue;
            set.add(bbh2);
        }
        return set;
    }

    public Set<bbh> n(ayq ayq2) {
        return ayq2 == null ? new HashSet() : this.nh(ayq2.iG());
    }

    public Set<bbh> g(bcp bcp2) {
        return bcp2 == null ? new HashSet() : this.nh(bcp2.iG());
    }

    public Set<bbh> nh(ldv ldv2) {
        Set<bbh> set = lcn.emx();
        for (bbh bbh2 : this.gIx.values()) {
            if (!ldv.au(ldv2, bbh2.iG())) continue;
            set.add(bbh2);
        }
        return set;
    }

    public Set<bbh> ni(ldv ldv2) {
        return ldv2 == null || !this.gIw.containsKey(ldv2) ? new HashSet<bbh>() : this.c(this.gIw.get(ldv2));
    }

    public Set<bbh> b(ayp ayp2) {
        return ayp2 == null || !this.gIw.containsKey(ayp2.getGUID()) ? new HashSet<bbh>() : this.c(this.gIw.get(ayp2.getGUID()));
    }

    public Set<bbh> c(azg azg2) {
        Set<bbh> set = lcn.emx();
        for (ldv ldv2 : azg2.acS()) {
            set.add(this.gIx.get(ldv2));
        }
        return set;
    }

    public int o(ayq ayq2) {
        return this.nj(ayq2.iG());
    }

    public int h(bcp bcp2) {
        return this.nj(bcp2.iG());
    }

    public int nj(ldv ldv2) {
        Set<bbh> set = this.nh(ldv2);
        return set.size();
    }

    public float p(ayq ayq2) {
        return this.nk(ayq2.iG());
    }

    public float i(bcp bcp2) {
        return this.nk(bcp2.iG());
    }

    public float nk(ldv ldv2) {
        float f = 0.0f;
        Set<Integer> set = this.mU(ldv2);
        for (Integer n : set) {
            dml dml2 = this.gIu.get(n);
            if (dml2 == null || dml2.bqf() != dmj.gIi) continue;
            f += dml2.bqk();
        }
        return f;
    }

    public Set<bbi> bqr() {
        return new HashSet<bbi>(this.dpR.values());
    }

    public bbi nl(ldv ldv2) {
        return this.dpR.get(ldv2);
    }

    public bbi AH(int n) {
        for (bbi bbi2 : this.dpR.values()) {
            if (bbi2.acY() != n) continue;
            return bbi2;
        }
        return null;
    }

    public Set<bbi> bqs() {
        Set<bbi> set = lcn.emx();
        for (bbi bbi2 : this.dpR.values()) {
            if (bbi2.iG() == null) continue;
            set.add(bbi2);
        }
        return set;
    }

    public Set<bbi> q(ayq ayq2) {
        return ayq2 == null ? new HashSet() : this.nm(ayq2.iG());
    }

    public Set<bbi> j(bcp bcp2) {
        return bcp2 == null ? new HashSet() : this.nm(bcp2.iG());
    }

    public Set<bbi> nm(ldv ldv2) {
        Set<bbi> set = lcn.emx();
        for (bbi bbi2 : this.dpR.values()) {
            if (!ldv.au(ldv2, bbi2.iG())) continue;
            set.add(bbi2);
        }
        return set;
    }

    public int r(ayq ayq2) {
        return this.nn(ayq2.iG());
    }

    public int k(bcp bcp2) {
        return this.nn(bcp2.iG());
    }

    public int nn(ldv ldv2) {
        Set<bbi> set = this.nm(ldv2);
        return set.size();
    }

    public float s(ayq ayq2) {
        return this.no(ayq2.iG());
    }

    public float l(bcp bcp2) {
        return this.no(bcp2.iG());
    }

    public float no(ldv ldv2) {
        float f = 0.0f;
        Set<Integer> set = this.mU(ldv2);
        for (Integer n : set) {
            dml dml2 = this.gIu.get(n);
            if (dml2 == null || dml2.bqf() != dmj.gIj) continue;
            f += dml2.bqk();
        }
        return f;
    }

    public Set<cmd> bqt() {
        return new HashSet<cmd>(this.gIy.values());
    }

    public cmd np(ldv ldv2) {
        return this.gIy.get(ldv2);
    }

    public Set<dml> bqu() {
        return new HashSet<dml>(this.gIu.values());
    }

    public dml AI(int n) {
        return this.gIu.get(n);
    }

    public azg AJ(int n) {
        for (azg azg2 : this.gIw.values()) {
            if (azg2.acY() != n) continue;
            return azg2;
        }
        return null;
    }

    protected dmm() {
        this.gIw = lcn.emw();
        this.gIx = lcn.emw();
        this.dpR = lcn.emw();
        this.gIy = lcn.emw();
    }

    @Override
    public void initialize() {
        super.initialize();
        this.gIt = lea.epM();
        lea.a(null);
        lea.a(this);
        Set<dml> set = jvp.dTA();
        for (dml dml2 : set) {
            this.gIu.put(dml2.acY(), dml2);
        }
    }

    @Override
    public void cleanUp() {
        for (Integer n : this.gIu.keySet()) {
            this.b(this.gIv.get(n));
        }
        this.gIu.clear();
        this.gIv.clear();
        this.dih.clear();
        this.gIw.clear();
        this.gIx.clear();
        this.dpR.clear();
        this.gIy.clear();
        if (this.gIt != null) {
            this.gIt.oG();
            this.gIt = null;
        }
        super.cleanUp();
    }

    protected abstract boolean bqv();

    protected void m(bcp bcp2) {
    }

    protected void n(bcp bcp2) {
    }

    protected void nq(ldv ldv2) {
        Iterator<bbi> iterator;
        if (ldv2 == null) {
            return;
        }
        if (!this.dih.containsKey(ldv2)) {
            return;
        }
        if (this.gIv.isEmpty()) {
            for (azg object : this.gIw.values()) {
                if (!ldv2.equals(object.iG())) continue;
                return;
            }
            for (bbh bbh2 : this.gIx.values()) {
                if (!ldv2.equals(bbh2.iG())) continue;
                return;
            }
            iterator = this.dpR.values().iterator();
            while (iterator.hasNext()) {
                bbi bbi2 = iterator.next();
                if (!ldv2.equals(bbi2.iG())) continue;
                return;
            }
        } else {
            iterator = this.gIv.values().iterator();
            while (iterator.hasNext()) {
                dmq dmq2 = (dmq)iterator.next();
                if (!ldv.au(dmq2.bqi(), ldv2)) continue;
                return;
            }
        }
        if ((iterator = this.dih.remove(ldv2)) == null) {
            return;
        }
        this.m((bcp)((Object)iterator));
    }

    public Set<dmq> bqw() {
        Set<dmq> set = lcn.emx();
        for (dmq dmq2 : this.gIv.values()) {
            if (set.contains(dmq2)) continue;
            set.add(dmq2);
        }
        return set;
    }

    protected void b(dml dml2) {
        if (dml2 == null) {
            return;
        }
        dmq dmq2 = this.gIv.get(dml2.acY());
        HashSet<dml> hashSet = new HashSet<dml>();
        if (dmq2 != null) {
            hashSet.addAll(dmq2.bqB());
            this.b(dmq2);
        }
        Set<dml> set = this.a(dml2, new HashSet<dml>());
        for (dml object : set) {
            if (!this.gIv.containsKey(object.acY())) continue;
            this.b(object);
        }
        dmq dmq3 = new dmq(dml2.bqi(), set);
        for (dml dml3 : dmq3.bqB()) {
            this.gIv.put(dml3.acY(), dmq3);
        }
        for (dml dml3 : hashSet) {
            if (dml3 == dml2 || set.contains(dml3)) continue;
            this.b(dml3);
        }
    }

    private void b(dmq dmq2) {
        if (dmq2 == null) {
            return;
        }
        for (dml dml2 : dmq2.bqB()) {
            this.gIv.remove(dml2.acY());
        }
        dmq2.cleanUp();
    }

    private Set<dml> a(dml dml2, Set<dml> set) {
        if (dml2 == null || set == null) {
            return new HashSet<dml>();
        }
        if (dml2.bqi() == null) {
            return set;
        }
        if (set.contains(dml2)) {
            return set;
        }
        set.add(dml2);
        for (Integer n : dml2.bqh()) {
            dml dml3 = this.gIu.get(n);
            if (dml3 == null || set.contains(dml3) || !ldv.au(dml2.bqi(), dml3.bqi())) continue;
            set = this.a(dml3, set);
        }
        return set;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 32283: {
                this.a((gui)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(gui gui2) {
        bcp bcp2 = this.dih.get(gui2.iG());
        if (bcp2 == null) {
            return;
        }
        bcp2.eT(gui2.iV());
        this.n(bcp2);
    }
}

