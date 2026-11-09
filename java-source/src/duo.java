/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bqk
 *  cbx
 *  cdb
 *  dta
 *  lcr
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class duo
implements dsy {
    private dta hcm = null;
    private final dum heB = new dum();
    private final dun heC = new dun();
    private final dun heD = new dun();
    private final dun heE = new dun();
    private List<dul> heF = lcn.emv();
    private List<dul> heG = lcn.emv();

    public duo() {
        this.heC.a(this);
        this.heD.a(this);
        this.heE.a(this);
    }

    @Override
    public void b(dta dta2) {
        this.hcm = dta2;
    }

    public ldv bzv() {
        return this.hcm.bzv();
    }

    public void doTick(ldz ldz2) {
        if (this.heF.isEmpty()) {
            return;
        }
        List<dul> list = this.heF;
        this.heF = this.heG;
        this.heG = list;
        int n = this.heG.size();
        for (int i = 0; i < n; ++i) {
            dul dul2 = this.heG.get(i);
            this.d((amf)dul2);
        }
        this.heG.clear();
    }

    public List<dul> bzq() {
        ArrayList<dul> arrayList = lcn.emv();
        this.heC.aN(arrayList);
        this.heD.aN(arrayList);
        this.heE.aN(arrayList);
        return arrayList;
    }

    public dxq h(int n, ldv ldv2, ldv ldv3) {
        return this.hcm.h(n, ldv2, ldv3);
    }

    public void a(dxq dxq2) {
        this.hcm.F(dxq2);
    }

    @Override
    public boolean c(amf amf2) {
        return true;
    }

    @Override
    public void d(amf amf2) {
        if (amf2 instanceof dul) {
            dul dul2 = (dul)amf2;
            int n = dul2.getRelationType();
            switch (n) {
                case 1025: 
                case 1026: 
                case 1027: 
                case 1028: 
                case 1029: 
                case 1030: 
                case 1031: 
                case 1032: 
                case 1033: 
                case 1034: 
                case 1035: 
                case 1036: {
                    this.d(dul2);
                    break;
                }
            }
        }
    }

    @Override
    public void e(amf amf2) {
        if (amf2 instanceof dul) {
            dul dul2 = (dul)amf2;
            int n = dul2.getRelationType();
            switch (n) {
                case 1025: 
                case 1026: 
                case 1027: 
                case 1028: 
                case 1029: 
                case 1030: 
                case 1031: 
                case 1032: 
                case 1033: 
                case 1034: 
                case 1035: 
                case 1036: {
                    this.f(dul2);
                    break;
                }
            }
        } else {
            ldv ldv2 = amf2.getGUID();
            this.heC.ao(ldv2);
            this.heD.ao(ldv2);
            this.heE.ao(ldv2);
        }
    }

    @Override
    public boolean f(amf amf2) {
        return true;
    }

    @Override
    public dxq g(dxq dxq2) {
        Object var2_2 = null;
        int n = dxq2.bEz();
        if ((n & 0xFFF00) == 1024 && n == 1025) {
            return this.heC.M(dxq2);
        }
        return dxq2;
    }

    @Override
    public dxq h(dxq dxq2) {
        Object var2_2 = null;
        int n = dxq2.bEz();
        if ((n & 0xFFF00) == 1024 && n == 1025) {
            return this.heD.N(dxq2);
        }
        return dxq2;
    }

    private boolean d(dul dul2) {
        if (!dul2.Bq().tV(dul2.Br())) {
            return false;
        }
        amf amf2 = this.hcm.d(dul2.Bq());
        amf amf3 = this.hcm.d(dul2.Br());
        if (amf2 != null && amf3 != null) {
            if (amf2 instanceof btk) {
                if (!this.a(dul2.getRelationType(), amf2, amf3)) {
                    return false;
                }
                ((btk)amf2).addRelation(dul2);
                this.heE.addRelation(dul2);
                return true;
            }
            return false;
        }
        this.heF.add(dul2);
        if (amf2 == null) {
            return false;
        }
        if (amf3 == null) {
            return false;
        }
        return false;
    }

    private void e(dul dul2) {
        assert (dul2 != null);
        if (!dul2.Bq().tV(dul2.Br())) {
            return;
        }
        switch (dul2.getRelationType()) {
            case 1027: 
            case 1031: 
            case 1032: 
            case 1034: 
            case 1035: 
            case 1036: {
                break;
            }
            default: {
                return;
            }
        }
        amf amf2 = this.hcm.d(dul2.Bq());
        if (amf2 == null) {
            return;
        }
        amf amf3 = this.hcm.d(dul2.Br());
        if (amf3 == null) {
            return;
        }
        if (amf2 instanceof btk) {
            if (!this.a(dul2.getRelationType(), amf2, amf3)) {
                return;
            }
        } else {
            return;
        }
        this.heE.addRelation(dul2);
    }

    private boolean f(dul dul2) {
        if (!dul2.Bq().tV(dul2.Br())) {
            return false;
        }
        amf amf2 = this.hcm.d(dul2.Bq());
        if (amf2 == null) {
            return false;
        }
        if (amf2 instanceof btk) {
            ((btk)amf2).removeRelation(dul2);
            return true;
        }
        return false;
    }

    public dxq c(geh geh2) {
        if (geh2.bEz() == 773) {
            return geh2;
        }
        int n = geh2.bBj();
        switch (n) {
            case 768: {
                this.e(geh2);
                break;
            }
            case 1024: {
                this.d(geh2);
                break;
            }
            case 1280: {
                geh2.on(lcr.qAI);
                this.hcm.E((dxq)geh2);
                break;
            }
            default: {
                return null;
            }
        }
        return null;
    }

    private void d(geh geh2) {
        switch (geh2.bEz()) {
            case 769: {
                geg geg2 = (geg)geh2;
                if (geg2.blp.tV(this.bBk())) {
                    dul dul2 = this.d(geh2.gqN, geg2.doP, geg2.blo, geg2.blp);
                    this.d((amf)dul2);
                    break;
                }
                geh2.on(geg2.blp.bFk());
                this.a(geh2);
                break;
            }
            case 770: {
                gem gem2 = (gem)geh2;
                dul dul3 = this.heE.os(gem2.doP);
                if (dul3 == null && !this.heF.isEmpty()) {
                    Iterator<dul> iterator = this.heF.iterator();
                    while (iterator.hasNext()) {
                        dul3 = iterator.next();
                        if (!dul3.getGUID().equals(gem2.doP)) continue;
                        iterator.remove();
                        return;
                    }
                    return;
                }
                if (dul3 == null) {
                    return;
                }
                this.heE.removeRelation(dul3);
                break;
            }
            case 771: {
                gen gen2 = (gen)geh2;
                amf amf2 = this.hcm.d(gen2.blo);
                if (amf2 != null && amf2 instanceof btk) {
                    ((btk)amf2).removeObserverObject(gen2.blp);
                }
                this.heE.b(geh2);
                break;
            }
            case 776: {
                gel gel2 = (gel)geh2;
                if (gel2.blo == null) {
                    return;
                }
                if (gel2.blp == null) {
                    return;
                }
                if (gel2.blp.tV(this.bBk())) {
                    dul dul4 = this.d(gel2.gqN, null, gel2.blo, gel2.blp);
                    if (dul4 == null) {
                        return;
                    }
                    this.e(dul4);
                    break;
                }
                geh2.on(gel2.blp.bFk());
                this.a(geh2);
                break;
            }
            default: {
                return;
            }
        }
    }

    private void e(geh geh2) {
        this.heC.b(geh2);
        this.heD.b(geh2);
    }

    ldv bBk() {
        if (this.hcm != null) {
            return this.hcm.getGUID();
        }
        return null;
    }

    void g(dul dul2) {
        ix ix2 = this.hcm.bzo();
        if (ix2 != null) {
            ix2.d(dul2);
        }
    }

    void h(dul dul2) {
        this.e((amf)dul2);
        ix ix2 = this.hcm.bzo();
        if (ix2 != null) {
            ix2.e(dul2);
        }
    }

    protected final dul d(int n, ldv ldv2, ldv ldv3, ldv ldv4) {
        dul dul2 = this.heB.j(n, ldv3, ldv4);
        if (dul2 == null) {
            return null;
        }
        if (ldv2 != null) {
            dul2.setGUID(ldv2);
        } else {
            dul2.setGUID(this.bzv());
        }
        dul2.initialize();
        return dul2;
    }

    private boolean a(int n, amf amf2, amf amf3) {
        assert (n > 0);
        assert (amf2 != null);
        assert (amf3 != null);
        boolean bl = false;
        switch (n) {
            case 1025: {
                return true;
            }
            case 1026: {
                if (!(amf2 instanceof btk) || !(amf3 instanceof bvd)) break;
                return true;
            }
            case 1027: {
                if (!(amf2 instanceof cbx) || !(amf3 instanceof bvd)) break;
                return true;
            }
            case 1028: {
                if (!(amf2 instanceof cbx) || amf3.getObjectType() != 56) break;
                return true;
            }
            case 1029: {
                if (amf2.getObjectType() != 65 || !(amf3 instanceof bnp)) break;
                return true;
            }
            case 1030: {
                if (amf2.getObjectType() != 65 || !(amf3 instanceof bqk)) break;
                return true;
            }
            case 1031: {
                if (!(amf2 instanceof bqv) || !(amf3 instanceof bqk)) break;
                return true;
            }
            case 1032: {
                if (!(amf2 instanceof brb) || !(amf3 instanceof bqv)) break;
                return true;
            }
            case 1033: {
                if (!(amf2 instanceof cpu) || amf3.getObjectType() != 65) break;
                return true;
            }
            case 1034: {
                if (amf2 instanceof cdt && amf3 instanceof caq) {
                    return true;
                }
                if (!(amf2 instanceof cev) || !(amf3 instanceof caq)) break;
                return true;
            }
            case 1035: {
                if (!(amf2 instanceof cev) || !(amf3 instanceof atg)) break;
                return true;
            }
            case 1036: {
                if (!(amf2 instanceof cdb) || !(amf3 instanceof cdf)) break;
                return true;
            }
            default: {
                lfn.b(5, "SFRelationManagerContainer", "validateObserverRelation() Invalid ObserverRelationType provided: " + n);
                return false;
            }
        }
        lfn.b(5, "SFRelationManagerContainer", "validateObserverRelation() ObjectType of StartPoint and EndPoint do not match ObserverRelationType: " + n);
        lfn.b(5, "SFRelationManagerContainer", "validateObserverRelation() StartPoint=" + amf2.getObjectType() + " EndPoint=" + amf3.getObjectType());
        return false;
    }
}

