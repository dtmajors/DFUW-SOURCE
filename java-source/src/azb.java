/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  azc
 *  cug
 *  cxd
 *  lcr
 */
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class azb {
    private azc cCV = null;
    private ldv aDk = null;
    private ldv azY = null;
    private ldv aDp = null;
    private String ID = null;
    private ayb bhH = ayb.cvj;
    private ljq bhF = null;
    private float bhG = 0.0f;
    private int bhB = 0;
    private int cCW = 0;
    private Set<ayz> cCX = lcn.emx();
    private float cCY = 0.0f;
    private float cCZ = 0.0f;
    private boolean czb = false;
    private aze[] cDa = null;
    private ayy cDb = null;
    private Map<Integer, lfs<mhk, Integer>> csh = lcn.emw();
    private Map<Integer, ldv> cDc = lcn.emw();
    private Map<Integer, lfs<mhk, Integer>> csg = lcn.emw();
    private Map<Integer, ldv> cDd = lcn.emw();

    public ldv acm() {
        return this.aDk;
    }

    public void ci(ldv ldv2) {
        this.aDk = ldv2;
    }

    public ldv acn() {
        return this.azY;
    }

    public void eM(ldv ldv2) {
        this.azY = ldv2;
    }

    public ldv YS() {
        return this.aDp;
    }

    public void ds(ldv ldv2) {
        this.aDp = ldv2;
    }

    public String Xt() {
        return this.ID;
    }

    public void cz(String string) {
        this.ID = string;
    }

    public ayb Xz() {
        return this.bhH;
    }

    public void a(ayb ayb2) {
        this.bhH = ayb2;
    }

    public ljq Xv() {
        return this.bhF;
    }

    public void al(ljq ljq2) {
        this.bhF = ljq2;
    }

    public float Xu() {
        return this.bhG;
    }

    public void X(float f) {
        this.bhG = f;
    }

    public int aco() {
        return this.bhB;
    }

    public void eM(int n) {
        this.bhB = n;
    }

    public int acp() {
        return this.cCW;
    }

    public void jd(int n) {
        this.cCW = n;
    }

    public boolean es(ldv ldv2) {
        for (ayz ayz2 : this.cCX) {
            if (!ayz2.ach().equals(ldv2)) continue;
            return true;
        }
        return false;
    }

    public ayz eN(ldv ldv2) {
        for (ayz ayz2 : this.cCX) {
            if (!ayz2.ach().equals(ldv2)) continue;
            return ayz2;
        }
        return null;
    }

    public ayz[] abp() {
        return this.cCX.toArray(new ayz[this.cCX.size()]);
    }

    public void c(ayz ayz2) {
        this.cCX.add(ayz2);
    }

    public float acq() {
        return this.cCY;
    }

    public void ch(float f) {
        this.cCY = f;
    }

    public float acr() {
        return this.cCZ;
    }

    public void ci(float f) {
        this.cCZ = f;
    }

    public boolean aaW() {
        return this.czb;
    }

    public void cr(boolean bl) {
        this.czb = bl;
    }

    public aze[] acs() {
        return this.cDa;
    }

    public aze je(int n) {
        for (int i = 0; i < this.cDa.length; ++i) {
            if (this.cDa[i].getID() != n) continue;
            return this.cDa[i];
        }
        return null;
    }

    public void a(aze[] azeArray) {
        this.cDa = azeArray;
    }

    public azb(azc azc2) {
        assert (azc2 != null);
        this.cCV = azc2;
        this.cDb = new ayy(this.cCV.acx());
    }

    public void initialize() {
        this.cDb.setGUID(this.cCV.getMessageDelegator().bzv());
        this.cDb.a(this);
        this.cCV.getMessageDelegator().a(this.cDb);
    }

    public void cleanUp() {
        if (this.cDb.getGUID() != null) {
            this.cCV.getMessageDelegator().hd(this.cDb.getGUID());
        }
        for (ldv ldv2 : this.cDd.values()) {
            this.cCV.getMessageDelegator().oa(ldv2);
        }
        for (ldv ldv2 : this.cDc.values()) {
            this.cCV.getMessageDelegator().oa(ldv2);
        }
    }

    public void act() {
        for (ldv object : this.cDb.ace()) {
            ldv ldv2 = lcr.tQ((ldv)object);
            this.n(ldv2, false);
        }
        for (bbr bbr2 : this.cCV.acx().ZU().values()) {
            if (!bbr2.qf()) continue;
            this.n(bbr2.abB(), true);
        }
    }

    public void eO(ldv ldv2) {
        if (!this.acu()) {
            return;
        }
        ldv ldv3 = lcr.tQ((ldv)ldv2);
        this.m(ldv3, false);
    }

    public void eP(ldv ldv2) {
        if (!this.acu()) {
            return;
        }
        ldv ldv3 = lcr.tQ((ldv)ldv2);
        this.n(ldv3, false);
    }

    public void eI(ldv ldv2) {
        this.n(ldv2, false);
        this.cDb.eI(ldv2);
    }

    public void eQ(ldv ldv2) {
        this.m(ldv2, true);
    }

    public void eR(ldv ldv2) {
        this.n(ldv2, true);
    }

    public void eH(ldv ldv2) {
        this.m(ldv2, true);
        this.cDb.eH(ldv2);
    }

    public void b(aze aze2) {
        for (int i = 0; i < this.cDa.length; ++i) {
            if (aze2.getID() != this.cDa[i].getID()) continue;
            this.cDa[i] = aze2;
            return;
        }
    }

    public void a(int[] nArray, mhk[] mhkArray, int[] nArray2) {
        if (nArray == null || mhkArray == null) {
            return;
        }
        assert (nArray.length == mhkArray.length);
        for (int i = 0; i < nArray.length; ++i) {
            this.csh.put(nArray[i], new lfs<mhk, Integer>(mhkArray[i], nArray2[i]));
        }
    }

    public void b(int[] nArray, mhk[] mhkArray, int[] nArray2) {
        this.a(this.csh, nArray, mhkArray, true, nArray2);
    }

    public void c(int[] nArray, mhk[] mhkArray, int[] nArray2) {
        if (nArray == null || mhkArray == null) {
            return;
        }
        assert (nArray.length == mhkArray.length);
        for (int i = 0; i < nArray.length; ++i) {
            this.csg.put(nArray[i], new lfs<mhk, Integer>(mhkArray[i], nArray2[i]));
            this.a(nArray[i], mhkArray[i], false, nArray2[i]);
        }
    }

    public void d(int[] nArray, mhk[] mhkArray, int[] nArray2) {
        this.a(this.csg, nArray, mhkArray, false, nArray2);
    }

    private boolean a(Map<Integer, lfs<mhk, Integer>> map, int[] nArray, mhk[] mhkArray, boolean bl, int[] nArray2) {
        int n;
        boolean bl2 = false;
        assert (nArray != null);
        assert (mhkArray != null);
        assert (nArray.length == mhkArray.length);
        for (int i = 0; i < nArray.length; ++i) {
            int n2 = nArray[i];
            mhk mhk2 = mhkArray[i];
            n = nArray2[i];
            lfs<mhk, Integer> lfs2 = map.get(n2);
            if (lfs2 != null && ((mhk)lfs2.reX).eyY() == mhs.FLOAT) {
                float f = ((mhn)lfs2.reX).Pz;
                float f2 = ((mhn)mhk2).Pz;
                if (f == f2) continue;
                bl2 = true;
                this.a(n2, mhk2, bl);
                map.remove(n2);
                map.put(n2, new lfs<mhk, Integer>(mhk2, n));
                continue;
            }
            bl2 = true;
            map.put(n2, new lfs<mhk, Integer>(mhk2, n));
            this.a(n2, mhk2, bl, n);
        }
        if (map.size() != nArray.length) {
            Iterator<Integer> iterator = map.keySet().iterator();
            while (iterator.hasNext()) {
                Integer n3 = iterator.next();
                boolean bl3 = false;
                for (n = 0; n < nArray.length; ++n) {
                    if (n3 != nArray[n]) continue;
                    bl3 = true;
                    break;
                }
                if (bl3) continue;
                bl2 = true;
                this.m(n3, bl);
                iterator.remove();
            }
        }
        return bl2;
    }

    private void m(ldv ldv2, boolean bl) {
        if (bl && this.csh.isEmpty()) {
            return;
        }
        if (!bl && this.csg.isEmpty()) {
            return;
        }
        int n = 0;
        Map<Integer, lfs<mhk, Integer>> map = null;
        if (bl) {
            map = this.csh;
            n = this.csh.size();
        } else {
            map = this.csg;
            n = this.csg.size();
        }
        alt[] altArray = new alt[n];
        int n2 = 0;
        for (Map.Entry<Integer, lfs<mhk, Integer>> entry : map.entrySet()) {
            ldi ldi2 = (ldi)lea.enT().acv(entry.getKey());
            assert (ldi2 != null);
            assert (ldi2.enl() != null);
            assert (ldi2.enl().length == 1);
            ldv ldv3 = null;
            ldv3 = bl ? this.jg(entry.getKey()) : this.jf(entry.getKey());
            mhk mhk2 = (mhk)entry.getValue().reX;
            alq alq2 = null;
            switch (mhk2.eyY()) {
                case FLOAT: {
                    alq2 = this.b(((mhn)mhk2).Pz, bl);
                    break;
                }
                case BOOLEAN: {
                    alq2 = this.f(((mhl)mhk2).Pp, bl);
                    break;
                }
                default: {
                    assert (false) : "Unsupported type : " + (Object)((Object)mhk2.eyY());
                    return;
                }
            }
            alq2.setGUID(ldv3);
            alq2.x(-2.0);
            alq2.ga(2);
            alq2.cP(this.cCV.acx().getGUID());
            alq2.gd(cug.fpm);
            alq2.gf(entry.getKey());
            alq2.gb(2);
            alq2.fC(ldi2.enl()[0].bnM);
            alq2.fJ(ldi2.getType());
            int n3 = cxd.xZ((int)((Integer)entry.getValue().reY));
            if (n3 == -1) {
                n3 = bl ? cxd.fLq : cxd.fLr;
            }
            alq2.ge(n3);
            altArray[n2] = alq2;
            ++n2;
        }
        frg frg2 = (frg)this.cCV.getMessageDelegator().h(5377, this.cCV.getGUID(), ldv2);
        frg2.iUQ = true;
        frg2.iUR = altArray;
        this.cCV.getMessageDelegator().F(frg2);
    }

    private void n(ldv ldv2, boolean bl) {
        if (!bl && this.csg.isEmpty()) {
            return;
        }
        if (bl && this.csh.isEmpty()) {
            return;
        }
        int n = 0;
        Map<Integer, lfs<mhk, Integer>> map = null;
        if (bl) {
            map = this.csh;
            n = this.csh.size();
        } else {
            map = this.csg;
            n = this.csg.size();
        }
        ldv[] ldvArray = new ldv[n];
        int n2 = 0;
        for (Integer n3 : map.keySet()) {
            ldvArray[n2] = bl ? this.jg(n3) : this.jf(n3);
            ++n2;
        }
        frk frk2 = (frk)this.cCV.getMessageDelegator().h(5379, this.cCV.getGUID(), ldv2);
        frk2.dtB = ldvArray;
        frk2.iUQ = true;
        frk2.gcS = null;
        this.cCV.getMessageDelegator().F(frk2);
    }

    private void a(int n, mhk mhk2, boolean bl, int n2) {
        ldi ldi2 = (ldi)lea.enT().acv(n);
        assert (ldi2 != null);
        assert (ldi2.enl() != null);
        assert (ldi2.enl().length == 1);
        ldv ldv2 = null;
        ldv2 = bl ? this.jg(n) : this.jf(n);
        alq alq2 = null;
        switch (mhk2.eyY()) {
            case FLOAT: {
                alq2 = this.b(((mhn)mhk2).Pz, bl);
                break;
            }
            case BOOLEAN: {
                alq2 = this.f(((mhl)mhk2).Pp, bl);
                break;
            }
            default: {
                assert (false) : "Unsupported type : " + (Object)((Object)mhk2.eyY());
                return;
            }
        }
        alq2.setGUID(ldv2);
        alq2.x(-2.0);
        alq2.ga(2);
        alq2.cP(this.cCV.acx().getGUID());
        alq2.gd(cug.fpm);
        alq2.gf(n);
        alq2.gb(2);
        alq2.fC(ldi2.enl()[0].bnM);
        alq2.fJ(ldi2.getType());
        int n3 = cxd.xZ((int)n2);
        if (n3 == -1) {
            n3 = bl ? cxd.fLq : cxd.fLr;
        }
        alq2.ge(n3);
        if (bl) {
            for (bbr bbr2 : this.cCV.acx().ZU().values()) {
                if (!bbr2.qf()) continue;
                this.a(alq2, bbr2.abB());
            }
        } else {
            for (ldv ldv3 : this.cDb.ace()) {
                this.a(alq2, lcr.tQ((ldv)ldv3));
            }
        }
    }

    private als b(float f, boolean bl) {
        als als2 = new als();
        als2.aq(f);
        als2.as(f);
        return als2;
    }

    private alr f(boolean bl, boolean bl2) {
        alr alr2 = new alr();
        alr2.bc(bl);
        return alr2;
    }

    private void a(alt alt2, ldv ldv2) {
        frg frg2 = (frg)this.cCV.getMessageDelegator().h(5377, this.cCV.getGUID(), ldv2);
        frg2.iUQ = true;
        frg2.iUR = new alt[]{alt2};
        this.cCV.getMessageDelegator().F(frg2);
    }

    private void m(int n, boolean bl) {
        ldv[] ldvArray = new ldv[]{bl ? this.jg(n) : this.jf(n)};
        if (bl) {
            for (bbr bbr2 : this.cCV.acx().ZU().values()) {
                if (!bbr2.qf()) continue;
                frk frk2 = (frk)this.cCV.getMessageDelegator().h(5379, this.cCV.getGUID(), bbr2.abB());
                frk2.dtB = ldvArray;
                frk2.iUQ = true;
                frk2.gcS = null;
                this.cCV.getMessageDelegator().F(frk2);
            }
            return;
        }
        for (ldv ldv2 : this.cDb.ace()) {
            ldv ldv3 = lcr.tQ((ldv)ldv2);
            frk frk3 = (frk)this.cCV.getMessageDelegator().h(5379, this.cCV.getGUID(), ldv3);
            frk3.dtB = ldvArray;
            frk3.iUQ = true;
            frk3.gcS = null;
            this.cCV.getMessageDelegator().F(frk3);
        }
    }

    private void a(int n, mhk mhk2, boolean bl) {
        ldv ldv2 = null;
        ldv2 = bl ? this.jg(n) : this.jf(n);
        for (ldv ldv3 : this.cDb.ace()) {
            ldv ldv4 = lcr.tQ((ldv)ldv3);
            frl frl2 = (frl)this.cCV.getMessageDelegator().h(5380, this.cCV.getGUID(), ldv4);
            frl2.Pu = ldv2;
            frl2.iUS = mhk2;
            this.cCV.getMessageDelegator().F(frl2);
        }
    }

    private ldv jf(int n) {
        if (this.cDd.containsKey(n)) {
            return this.cDd.get(n);
        }
        ldv ldv2 = this.cCV.getMessageDelegator().bzv();
        this.cDd.put(n, ldv2);
        return ldv2;
    }

    private ldv jg(int n) {
        if (this.cDc.containsKey(n)) {
            return this.cDc.get(n);
        }
        ldv ldv2 = this.cCV.getMessageDelegator().bzv();
        this.cDc.put(n, ldv2);
        return ldv2;
    }

    private boolean acu() {
        return !this.csg.isEmpty();
    }

    public ayz[] f(ldv[] ldvArray) {
        if (ldvArray == null) {
            return this.cCX.toArray(new ayz[this.cCX.size()]);
        }
        Set<ayz> set = lcn.emx();
        for (ayz ayz2 : this.cCX) {
            boolean bl = false;
            for (int i = 0; i < ldvArray.length; ++i) {
                if (!ayz2.ach().equals(ldvArray[i])) continue;
                bl = true;
                break;
            }
            if (bl) continue;
            set.add(ayz2);
        }
        this.cCX.removeAll(set);
        return set.toArray(new ayz[set.size()]);
    }

    public void a(eil eil2) {
        this.cDb.a(eil2);
    }
}

