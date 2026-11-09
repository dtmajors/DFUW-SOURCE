/*
 * Decompiled with CFR.
 */
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class dun {
    private Map<ldv, List<ldv>> hew = lcn.emw();
    private Map<ldv, List<ldv>> hex = lcn.emw();
    private Map<ldv, dul> hey = lcn.emw();
    private duo hez = null;
    private final List<dul> heA = lcn.emv();

    public final void a(duo duo2) {
        this.hez = duo2;
    }

    public dxq M(dxq dxq2) {
        this.heA.clear();
        this.b(dxq2.amk(), this.heA);
        if (this.heA.size() > 0) {
            int n = this.heA.size();
            for (int i = 0; i < n; ++i) {
                dul dul2 = this.heA.get(i);
                dxq dxq3 = (dxq)dxq2.clone();
                if (dxq3 == null) continue;
                dxq3.oA(dxq2.amk());
                dxq3.f(this.hez.bBk());
                dxq3.on(dul2.Bq());
                this.a(dxq3);
            }
        }
        return dxq2;
    }

    public dxq N(dxq dxq2) {
        this.heA.clear();
        this.b(dxq2.aO(), this.heA);
        if (this.heA.size() > 0) {
            int n = this.heA.size();
            for (int i = 0; i < n; ++i) {
                dul dul2 = this.heA.get(i);
                dxq dxq3 = (dxq)dxq2.clone();
                if (dxq3 == null) {
                    return null;
                }
                dxq3.oA(dxq2.amk());
                dxq3.f(this.hez.bBk());
                dxq3.on(dul2.Bq());
                this.a(dxq3);
            }
        }
        return dxq2;
    }

    public boolean or(ldv ldv2) {
        assert (ldv2 != null);
        return this.hey.containsKey(ldv2);
    }

    public void aN(List<dul> list) {
        assert (list != null);
        if (this.hey.isEmpty()) {
            return;
        }
        Iterator<dul> iterator = this.hey.values().iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
    }

    public void b(ldv ldv2, List<dul> list) {
        assert (ldv2 != null);
        assert (list != null);
        List<ldv> list2 = this.hex.get(ldv2);
        if (list2 != null) {
            int n = list2.size();
            for (int i = 0; i < n; ++i) {
                dul dul2 = this.hey.get(list2.get(i));
                list.add(dul2);
            }
        }
    }

    public dul os(ldv ldv2) {
        assert (ldv2 != null);
        return this.hey.get(ldv2);
    }

    public dul aa(ldv ldv2, ldv ldv3) {
        if (this.hew.containsKey(ldv2) && this.hex.containsKey(ldv3)) {
            List<ldv> list = this.hew.get(ldv2);
            int n = list.size();
            for (int i = 0; i < n; ++i) {
                dul dul2 = this.hey.get(list.get(i));
                if (!dul2.Br().equals(ldv3)) continue;
                return dul2;
            }
        }
        return null;
    }

    public void c(ldv ldv2, List<dul> list) {
        assert (ldv2 != null);
        assert (list != null);
        List<ldv> list2 = this.hew.get(ldv2);
        if (list2 != null) {
            int n = list2.size();
            for (int i = 0; i < n; ++i) {
                dul dul2 = this.hey.get(list2.get(i));
                list.add(dul2);
            }
        }
    }

    public void ao(ldv ldv2) {
        dul dul2;
        int n;
        int n2;
        if (this.hew.containsKey(ldv2)) {
            this.heA.clear();
            this.c(ldv2, this.heA);
            n2 = this.heA.size();
            for (n = 0; n < n2; ++n) {
                dul2 = this.heA.get(n);
                this.ot(dul2.getGUID());
            }
        }
        if (this.hex.containsKey(ldv2)) {
            this.heA.clear();
            this.b(ldv2, this.heA);
            n2 = this.heA.size();
            for (n = 0; n < n2; ++n) {
                dul2 = this.heA.get(n);
                this.ot(dul2.getGUID());
            }
        }
    }

    public void b(geh geh2) {
        switch (geh2.bEz()) {
            case 769: {
                this.a((geg)geh2);
                break;
            }
            case 771: {
                this.a((gen)geh2);
                break;
            }
            case 772: {
                this.a((gej)geh2);
                break;
            }
            default: {
                return;
            }
        }
    }

    public void removeRelation(dul dul2) {
        this.ot(dul2.getGUID());
    }

    protected void addRelation(dul dul2) {
        List<Object> list;
        if (dul2 == null) {
            return;
        }
        if (this.hey.containsKey(dul2.getGUID())) {
            return;
        }
        if (this.hew.containsKey(dul2.Bq())) {
            list = this.hew.get(dul2.Bq());
            if (list.contains(dul2.getGUID())) {
                return;
            }
            list.add(dul2.getGUID());
        } else {
            list = lcn.emv();
            list.add(dul2.getGUID());
            this.hew.put(dul2.Bq(), list);
        }
        if (this.hex.containsKey(dul2.Br())) {
            list = this.hex.get(dul2.Br());
            if (list.contains(dul2.getGUID())) {
                return;
            }
            list.add(dul2.getGUID());
        } else {
            list = lcn.emv();
            list.add(dul2.getGUID());
            this.hex.put(dul2.Br(), list);
        }
        this.hey.put(dul2.getGUID(), dul2);
        this.hez.g(dul2);
    }

    private void c(int n, ldv ldv2, ldv ldv3, ldv ldv4) {
        dul dul2 = this.hez.d(n, ldv2, ldv3, ldv4);
        if (dul2 == null) {
            return;
        }
        this.addRelation(dul2);
    }

    private void a(geg geg2) {
        if (geg2.blp == null) {
            return;
        }
        if (geg2.blp.bFk().equals(this.hez.bBk())) {
            this.c(geg2.gqN, geg2.doP, geg2.blo, geg2.blp);
        } else {
            ldv ldv2 = geg2.blp.bFk();
            geg2.on(ldv2);
            this.a((dxq)geg2);
        }
    }

    private void a(gej gej2) {
        Object object;
        ldv ldv2 = gej2.blo;
        ldv ldv3 = gej2.blp;
        if (ldv2 != null && ldv3 == null) {
            this.heA.clear();
            this.c(ldv2, this.heA);
        } else if (ldv2 == null && ldv3 != null) {
            this.heA.clear();
            this.b(ldv3, this.heA);
        } else if (ldv2 != null && ldv3 != null) {
            object = this.aa(ldv2, ldv3);
            if (object != null) {
                this.heA.clear();
                this.heA.add((dul)object);
            }
        } else {
            this.heA.clear();
        }
        object = (gek)this.h(773, gej2.aO(), gej2.amk());
        if (!this.heA.isEmpty()) {
            ((gek)object).jft = this.heA.toArray(new dul[0]);
        }
        this.a((dxq)object);
    }

    private void a(gen gen2) {
        dul dul2;
        ldv ldv2 = gen2.blo;
        ldv ldv3 = gen2.blp;
        if (ldv2 != null && ldv3 == null) {
            this.heA.clear();
            this.c(ldv2, this.heA);
            for (int i = 0; i < this.heA.size(); ++i) {
                this.ot(this.heA.get(i).getGUID());
            }
        } else if (ldv2 == null && ldv3 != null) {
            this.heA.clear();
            this.b(ldv3, this.heA);
            for (int i = 0; i < this.heA.size(); ++i) {
                this.ot(this.heA.get(i).getGUID());
            }
        } else if (ldv2 != null && ldv3 != null && (dul2 = this.aa(ldv2, ldv3)) != null) {
            this.ot(dul2.getGUID());
        }
    }

    private void ot(ldv ldv2) {
        List<ldv> list;
        dul dul2 = this.hey.remove(ldv2);
        if (dul2 == null) {
            return;
        }
        if (this.hew.containsKey(dul2.Bq()) && (list = this.hew.get(dul2.Bq())).contains(dul2.getGUID())) {
            list.remove(dul2.getGUID());
        }
        if (this.hex.containsKey(dul2.Br()) && (list = this.hex.get(dul2.Br())).contains(dul2.getGUID())) {
            list.remove(dul2.getGUID());
        }
        this.hez.h(dul2);
    }

    private dxq h(int n, ldv ldv2, ldv ldv3) {
        return this.hez.h(n, ldv2, ldv3);
    }

    private void a(dxq dxq2) {
        this.hez.a(dxq2);
    }
}

