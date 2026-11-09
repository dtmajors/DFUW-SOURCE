/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class igw
extends ipx {
    private ign liv;
    private ipf lMX;
    private Map<ign, igu> lUi;
    private Map<ign, igt> lUj;
    private ist lUk;
    private ist lUl;
    private ism lUm;
    private ipx lUn;

    public igw(ign ign2) {
        ipf ipf2;
        ipf ipf3;
        ipf ipf4;
        this.liv = ign2;
        this.a(irl.dnr());
        this.lMX = new iqa("FeatDetailsBackgroundBitmap", 8, 8, 8, 8, iqb.mtp);
        this.W(this.lMX);
        ipx ipx2 = ipx.c(8, 8, 8, 8, new ipf[0]);
        this.W(ipx2);
        ipx ipx3 = ipx.j(new ipf[0]);
        ipx2.W(ipx3);
        ipx3.W(this.cUJ());
        ipf ipf5 = this.cUK();
        if (ipf5 != null) {
            ipx3.W(ipx.a(1, 4, new ipf[0]));
            ipx3.W(new iwx(0x313131));
            ipx3.W(ipx.a(1, 4, new ipf[0]));
            ipx3.W(ipf5);
        }
        if ((ipf4 = this.cUP()) != null) {
            ipx3.W(ipx.a(1, 4, new ipf[0]));
            ipx3.W(new iwx(0x313131));
            ipx3.W(ipx.a(1, 4, new ipf[0]));
            ipx3.W(ipf4);
        }
        if ((ipf3 = this.cUU()) != null) {
            ipx3.W(ipx.a(1, 4, new ipf[0]));
            ipx3.W(new iwx(0x313131));
            ipx3.W(ipx.a(1, 4, new ipf[0]));
            ipx3.W(ipf3);
        }
        if ((ipf2 = this.cUV()) != null) {
            ipx3.W(ipx.a(1, 4, new ipf[0]));
            ipx3.W(new iwx(0x313131));
            ipx3.W(ipx.a(1, 4, new ipf[0]));
            ipx3.W(ipf2);
        }
    }

    @Override
    public void kh(float f) {
        if (this.lMX != null) {
            this.lMX.hz(f);
        }
    }

    public void m(ign ign2) {
        ipx ipx2;
        if (this.lUi != null) {
            this.cUW();
            ipx2 = this.lUi.get(ign2);
            if (ipx2 != null) {
                ((igu)ipx2).aTg();
                return;
            }
        }
        if (this.lUj != null) {
            this.cUX();
            ipx2 = this.lUj.get(ign2);
            if (ipx2 != null) {
                ((igt)ipx2).aTg();
                return;
            }
        }
        assert (false);
    }

    public void n(ign ign2) {
    }

    void cUI() {
        if (this.lUm != null) {
            this.lUm.setVisible(true);
        }
        if (this.lUn != null) {
            this.lUn.setVisible(false);
        }
    }

    private ipf cUJ() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(52, 31, new iwv("feat_ea_description", lww.tjS.bD(new Object[0]))));
        ipx2.W(new iwx(0x313131));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        iso iso2 = new iso();
        iso2.a(isf.mwN, 14);
        iso2.Rk(0xABABAB);
        iso2.a(isu.mxP);
        iso2.setWidth(450);
        iso2.setText(this.liv.getDescription());
        ipx2.W(ipx.d(iso2));
        ipx2.W(ipx.c(new ipf[0]));
        return ipx2;
    }

    private ipf cUK() {
        HashSet<ign> hashSet = this.liv.cTz();
        for (ign object3 : hashSet) {
            if (object3.cTM()) continue;
            if (this.lUi == null) {
                this.lUi = lcn.emw();
            }
            this.lUi.put(object3, new igu(object3, 14));
        }
        Object object = null;
        if (this.lUi != null) {
            Object object2;
            object = ipx.l(new ipf[0]);
            ((iph)object).W(ipx.a(44, 31, ipx.d(this.cUL())));
            ((iph)object).W(ipx.a(8, 1, new ipf[0]));
            ((iph)object).W(new iwx(0x313131));
            ipx ipx2 = ipx.l(new ipf[0]);
            ((iph)object).W(ipx.c(new ipf[]{ipx2}));
            Iterator iterator = hashSet.iterator();
            ipx2.W(ipx.c(new ipf[0]));
            ipx ipx3 = ipx.j(new ipf[0]);
            ipx2.W(ipx3);
            int ign2 = hashSet.size() / 2 + hashSet.size() % 2;
            for (int ipx32 = 0; iterator.hasNext() && ipx32 < ign2; ++ipx32) {
                object2 = (ign)iterator.next();
                igu igu2 = this.lUi.get(object2);
                ipx3.W(igu2);
            }
            ipx2.W(ipx.c(new ipf[0]));
            ipx ipx4 = ipx.j(new ipf[0]);
            ipx2.W(ipx4);
            while (iterator.hasNext()) {
                ign ign3 = (ign)iterator.next();
                object2 = this.lUi.get(ign3);
                ipx4.W((ipf)object2);
            }
            ipx2.W(ipx.c(new ipf[0]));
        }
        return object;
    }

    private ipf cUL() {
        ipx ipx2 = ipx.j(new ipf[0]);
        ipx2.W(ipx.c(new ipf[0]));
        ipx2.W(new iwv("feat_ea_goals", lww.tjT.bD(new Object[0])));
        ipx2.W(this.cUM());
        ipx2.W(ipx.c(new ipf[0]));
        return ipx2;
    }

    private ipf cUM() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.c(new ipf[0]));
        ipx2.W(this.cUN());
        ipx2.W(this.cUO());
        ipx2.W(ipx.c(new ipf[0]));
        return ipx2;
    }

    private ipf cUN() {
        this.lUk = new ist();
        this.lUk.a(isf.mwN, 13);
        this.cUW();
        return this.lUk;
    }

    private ipf cUO() {
        ist ist2 = new ist();
        ist2.a(isf.mwN, 13);
        ist2.Rk(12357465);
        ist2.setText("/" + this.liv.cTt());
        return ist2;
    }

    private ipf cUP() {
        Object object;
        HashSet<ign> hashSet = this.liv.cTz();
        Object object2 = hashSet.iterator();
        while (object2.hasNext()) {
            Object object3 = object = (ign)object2.next();
            if (!((ign)object).cTM()) continue;
            if (this.lUj == null) {
                this.lUj = lcn.emw();
            }
            this.lUj.put((ign)object, new igt(this, (ign)object, (ign)object3){
                final /* synthetic */ ign lUo;
                final /* synthetic */ igw lUp;
                {
                    this.lUp = igw2;
                    this.lUo = ign3;
                    super(ign2);
                }

                public void cUG() {
                    this.lUp.n(this.lUo);
                }
            });
        }
        object2 = null;
        if (this.lUj != null) {
            object2 = ipx.l(new ipf[0]);
            ((iph)object2).W(ipx.a(44, 31, ipx.d(this.cUQ())));
            ((iph)object2).W(ipx.a(8, 1, new ipf[0]));
            ((iph)object2).W(new iwx(0x313131));
            ((iph)object2).W(ipx.a(22, 1, new ipf[0]));
            object = ipx.j(new ipf[0]);
            ((iph)object2).W((ipf)object);
            for (ign ign2 : hashSet) {
                if (!ign2.cTM()) continue;
                igt igt2 = this.lUj.get(ign2);
                ((iph)object).W(igt2);
            }
        }
        return object2;
    }

    private ipf cUQ() {
        ipx ipx2 = ipx.j(new ipf[0]);
        ipx2.W(ipx.c(new ipf[0]));
        ipx2.W(new iwv("feat_ea_subfeats", lww.tjU.bD(new Object[0])));
        ipx2.W(this.cUR());
        ipx2.W(ipx.c(new ipf[0]));
        return ipx2;
    }

    private ipf cUR() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.c(new ipf[0]));
        ipx2.W(this.cUS());
        ipx2.W(this.cUT());
        ipx2.W(ipx.c(new ipf[0]));
        return ipx2;
    }

    private ipf cUS() {
        this.lUl = new ist();
        this.lUl.a(isf.mwN, 13);
        this.cUX();
        return this.lUl;
    }

    private ipf cUT() {
        ist ist2 = new ist();
        ist2.a(isf.mwN, 13);
        ist2.Rk(12357465);
        ist2.setText("/" + this.lUj.size());
        return ist2;
    }

    private ipf cUU() {
        HashSet<ign> hashSet = this.liv.cTB();
        if (hashSet == null || hashSet.isEmpty()) {
            return null;
        }
        ign ign2 = (ign)hashSet.iterator().next();
        if (ign2 == null) {
            return null;
        }
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(52, 31, new iwv("feat_ea_unlocked_by", lww.tjV.bD(new Object[0]))));
        ipx2.W(new iwx(0x313131));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ism ism2 = new ism(this, ign2){
            final /* synthetic */ ign lUq;
            final /* synthetic */ igw lUp;
            {
                this.lUp = igw2;
                this.lUq = ign2;
            }

            public boolean du(int n, int n2) {
                this.lUp.n(this.lUq);
                return true;
            }
        };
        ism2.a(isf.mwN, 14);
        ism2.Rk(0xABABAB);
        ism2.setText(ign2.getTitle());
        ipx2.W(ipx.d(ism2));
        ipx2.W(ipx.c(new ipf[0]));
        return ipx2;
    }

    private ipf cUV() {
        Set<ign> set = this.liv.cTD();
        if (set == null || set.isEmpty()) {
            return null;
        }
        ArrayList<ign> arrayList = lcn.emv();
        arrayList.addAll(set);
        Collections.sort(arrayList, new Comparator<ign>(this){
            final /* synthetic */ igw lUp;
            {
                this.lUp = igw2;
            }

            public int a(ign ign2, ign ign3) {
                return ign2.getTitle().compareToIgnoreCase(ign3.getTitle());
            }

            public /* synthetic */ int compare(Object object, Object object2) {
                return this.a((ign)object, (ign)object2);
            }
        });
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(52, 31, new iwv("feat_ea_unlocks", lww.tjW.bD(new Object[0]))));
        ipx2.W(new iwx(0x313131));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx ipx3 = ipx.j(new ipf[0]);
        ipx2.W(ipx.d(ipx3));
        Iterator iterator = arrayList.iterator();
        ign ign2 = (ign)iterator.next();
        ipx3.W(this.o(ign2));
        ipx3.W(ipx.a(4, 1, new ipf[0]));
        ipx2.W(ipx.c(new ipf[0]));
        if (arrayList.size() > 1) {
            this.lUm = new ism(this, lww.tkj.bD(arrayList.size() - 1).exA()){
                final /* synthetic */ igw lUp;
                {
                    this.lUp = igw2;
                    super(string);
                }

                public boolean du(int n, int n2) {
                    igw.a(this.lUp).setVisible(true);
                    this.setVisible(false);
                    return true;
                }
            };
            this.lUm.a(isf.mwN, 13);
            this.lUm.Rk(0xABABAB);
            ipx2.W(ipx.d(this.lUm));
            this.lUn = ipx.j(new ipf[0]);
            this.lUn.setVisible(false);
            ipx3.W(this.lUn);
            while (iterator.hasNext()) {
                this.lUn.W(this.o((ign)iterator.next()));
            }
        }
        return ipx2;
    }

    private ipf o(ign ign2) {
        ism ism2 = new ism(this, ign2){
            final /* synthetic */ ign lUr;
            final /* synthetic */ igw lUp;
            {
                this.lUp = igw2;
                this.lUr = ign2;
            }

            public boolean du(int n, int n2) {
                this.lUp.n(this.lUr);
                return true;
            }
        };
        ism2.a(isf.mwN, 13);
        ism2.Rk(0xABABAB);
        ism2.setText(ign2.getTitle());
        return ism2;
    }

    private void cUW() {
        int n = 0;
        for (ign ign2 : this.lUi.keySet()) {
            if (!ign2.isCompleted()) continue;
            ++n;
        }
        this.lUk.setText("" + n);
        this.lUk.Rk(n == this.lUi.size() ? 12357465 : 0xABABAB);
    }

    private void cUX() {
        int n = 0;
        for (ign ign2 : this.lUj.keySet()) {
            if (!ign2.isCompleted()) continue;
            ++n;
        }
        this.lUl.setText("" + n);
        this.lUl.Rk(n == this.lUj.size() ? 12357465 : 0xABABAB);
    }

    static /* synthetic */ ipx a(igw igw2) {
        return igw2.lUn;
    }
}

