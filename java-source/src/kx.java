/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  gg
 *  lcr
 *  lcw
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class kx
extends btk
implements bto {
    protected Map<ldv, Map<Integer, List<a>>> ask = lcn.emw();
    protected Map<ldv, Map<Integer, List<kw>>> asl = lcn.emw();
    protected Map<Integer, kw> asm = lcn.emw();
    protected int asn = 0;
    protected Map<ldv, Map<Integer, Set<ldv>>> aso = lcn.emw();
    private Set<nv> asp = lcn.emx();
    private double asq = 0.0;

    @Override
    public void receiveMessage(dxq dxq2) {
        if (dxq2.aO().ib() < 300 || dxq2.aO().ib() >= 400) {
            return;
        }
        if (dxq2.bEz() == 34561) {
            this.a((eyc)dxq2);
        } else if (dxq2.bEz() == 34563) {
            this.a((eye)dxq2);
        } else if (dxq2.bEz() == 34564) {
            this.a((eyk)dxq2);
        } else if (dxq2.bEz() == 34565) {
            this.a((eyh)dxq2);
        } else if (dxq2.bEz() == 34567) {
            this.a((eyd)dxq2);
        } else {
            super.receiveMessage(dxq2);
        }
    }

    private void a(eyc eyc2) {
        List<a> list;
        Map<Integer, List<a>> map = this.ask.get(eyc2.bNm());
        if (map == null) {
            map = lcn.emw();
            this.ask.put(eyc2.bNm(), map);
        }
        if ((list = map.get(eyc2.bNl())) == null) {
            list = lcn.emv();
            map.put(eyc2.bNl(), list);
        }
        eyj eyj2 = (eyj)this.MessageDelegator.h(34562, this.GUID, eyc2.aO());
        eyj2.sk(eyc2.aVk());
        if (eyc2.bNn() < 0) {
            int n = -eyc2.bNn();
            Integer n2 = eyc2.qe();
            for (int i = list.size() - 1; i >= 0; --i) {
                a a2 = list.get(i);
                if (a2.SN != n2) continue;
                if (n >= a2.asi) {
                    n -= a2.asi;
                    list.remove(i);
                    continue;
                }
                a2.asi -= n;
                n = 0;
                break;
            }
            eyj2.FL(-eyc2.bNn() - n);
        } else {
            a a3 = null;
            if (list.size() > 0 && list.get((int)(list.size() - 1)).SN == eyc2.qe()) {
                a3 = list.get(list.size() - 1);
            }
            if (a3 == null) {
                a3 = new a(this, null);
                a3.SN = eyc2.qe();
                list.add(a3);
            }
            a3.asi += eyc2.bNn();
        }
        this.MessageDelegator.E(eyj2);
        this.l(eyc2.bNm(), eyc2.bNl());
    }

    private void a(eye eye2) {
        List<a> list;
        Map<Integer, List<a>> map = this.ask.get(eye2.bNm());
        if (map == null) {
            map = lcn.emw();
            this.ask.put(eye2.bNm(), map);
        }
        if ((list = map.get(eye2.bNl())) == null) {
            list = lcn.emv();
            map.put(eye2.bNl(), list);
        }
        eyj eyj2 = (eyj)this.MessageDelegator.h(34562, this.GUID, eye2.aO());
        eyj2.sk(eye2.aVk());
        if (eye2.bNp() == -1) {
            int n = 0;
            for (n = 0; n < list.size(); ++n) {
                if (list.get((int)n).SN == eye2.qe()) continue;
                Integer n2 = list.get((int)n).SN;
                --list.get((int)n).asi;
                if (list.get((int)n).asi == 0) {
                    list.remove(n);
                }
                eyj2.DR(0);
                kw kw2 = new kw();
                kw2.SN = n2;
                kw2.ase = eye2.bNl();
                kw2.asf = eye2.qe();
                kw2.asg = eye2.bNo();
                kw2.ps = this.MessageDelegator.arc().rgz;
                kw2.asj = eye2.bNm();
                eyj2.FJ(this.asn);
                this.asm.put(this.asn++, kw2);
                this.MessageDelegator.E(eyj2);
                this.l(eye2.bNm(), eye2.bNl());
                return;
            }
        } else {
            lgw lgw2;
            List<kw> list2;
            kw kw3 = this.asm.remove(eye2.bNp());
            if (kw3 == null) {
                assert (false);
                return;
            }
            if (eye2.bNq()) {
                boolean bl = false;
                for (int i = 0; i < list.size(); ++i) {
                    if (list.get((int)i).SN != kw3.SN) continue;
                    ++list.get((int)i).asi;
                    bl = true;
                    break;
                }
                if (!bl) {
                    a a2 = new a(this, null);
                    a2.SN = kw3.SN;
                    a2.asi = 1;
                    list.add(0, a2);
                }
                this.l(eye2.bNm(), eye2.bNl());
                return;
            }
            kw3.eo = eye2.vA();
            Map<Integer, List<kw>> map2 = this.asl.get(eye2.bNm());
            if (map2 == null) {
                map2 = lcn.emw();
                this.asl.put(eye2.bNm(), map2);
            }
            if ((list2 = map2.get(eye2.bNl())) == null) {
                list2 = lcn.emv();
                map2.put(eye2.bNl(), list2);
            }
            if ((lgw2 = (lgw)lea.enW().acv(kw3.ase)).auW()) {
                boolean bl = false;
                for (kw kw4 : list2) {
                    if (kw4.SN != kw3.SN || kw4.eo != kw3.eo) continue;
                    bl = true;
                    ++kw4.asi;
                    break;
                }
                if (!bl) {
                    list2.add(kw3);
                }
            } else {
                list2.add(kw3);
            }
            this.l(eye2.bNm(), eye2.bNl());
            return;
        }
        eyj2.DR(1);
        this.MessageDelegator.E(eyj2);
    }

    public void a(eyk eyk2) {
        eyj eyj2 = (eyj)this.MessageDelegator.h(34562, this.GUID, eyk2.aO());
        eyj2.sk(eyk2.aVk());
        boolean bl = false;
        Map<Integer, List<kw>> map = this.asl.get(eyk2.bNm());
        if (map == null) {
            bl = true;
        } else {
            List<kw> list = map.get(eyk2.bNl());
            if (list == null) {
                bl = true;
            } else {
                gg gg2 = (gg)this.MessageDelegator.bzx().bzt().d(lcr.hac);
                ArrayList<kw> arrayList = lcn.emv();
                int n = 0;
                while (n < list.size()) {
                    kw kw2 = list.get(n);
                    if (kw2.SN == eyk2.qe()) {
                        kw2.ash = (String)gg2.hA().get(kw2.asf);
                        if (kw2.ash == null) {
                            kw2.ash = "";
                        }
                        arrayList.add(kw2);
                        list.remove(n);
                        continue;
                    }
                    ++n;
                }
                kw[] kwArray = new kw[arrayList.size()];
                eyj2.a(arrayList.toArray(kwArray));
                this.l(eyk2.bNm(), eyk2.bNl());
            }
        }
        eyj2.DR(bl ? 1 : 0);
        this.MessageDelegator.E(eyj2);
    }

    private void a(eyh eyh2) {
        Set<ldv> set;
        Map<Integer, Set<ldv>> map = this.aso.get(eyh2.bNm());
        if (map == null) {
            map = lcn.emw();
            this.aso.put(eyh2.bNm(), map);
        }
        if ((set = map.get(eyh2.zg())) == null) {
            set = lcn.emx();
            map.put(eyh2.zg(), set);
        }
        if (eyh2.bFm()) {
            if (!set.contains(eyh2.aO())) {
                set.add(eyh2.aO());
            } else assert (false);
        } else {
            if (set.contains(eyh2.aO())) {
                set.remove(eyh2.aO());
            } else assert (false);
            return;
        }
        ArrayList<ctu> arrayList = lcn.emv();
        Map<Integer, ctu> map2 = cwy.xj(eyh2.zg());
        ArrayList<Integer> arrayList2 = lcn.emv();
        for (ctu ctu2 : map2.values()) {
            if (ctu2.bbI().length == 0 || ctu2.bbI()[0].SkillType != eyh2.zg()) continue;
            arrayList2.add(ctu2.az());
            arrayList.add(ctu2);
        }
        Object object = new int[arrayList2.size()];
        int n = 0;
        Iterator iterator = arrayList2.iterator();
        while (iterator.hasNext()) {
            int n2 = (Integer)iterator.next();
            object[n++] = n2;
        }
        this.a(eyh2.bNm(), (int[])object, eyh2.aO());
    }

    protected void l(ldv ldv2, int n) {
        Map<Integer, Set<ldv>> map = this.aso.get(ldv2);
        if (map == null) {
            return;
        }
        ctu ctu2 = cwy.bm(1, n);
        if (ctu2 == null || ctu2.bbI() == null || ctu2.bbI().length == 0) {
            return;
        }
        Set<ldv> set = map.get(ctu2.bbI()[0].SkillType);
        if (set == null) {
            return;
        }
        for (ldv ldv3 : set) {
            this.a(ldv2, new int[]{n}, ldv3);
        }
    }

    /*
     * WARNING - void declaration
     */
    protected void a(ldv ldv2, int[] nArray, ldv ldv3) {
        void lim2;
        eyi eyi2 = (eyi)this.MessageDelegator.h(34566, this.GUID, ldv3);
        Map<Integer, List<a>> map = this.ask.get(ldv2);
        Map<Integer, List<kw>> map2 = this.asl.get(ldv2);
        ArrayList<lim<Object>> arrayList = lcn.emv();
        int[] nArray2 = nArray;
        int n = nArray2.length;
        boolean i = false;
        while (lim2 < n) {
            List<kw> list;
            List<a> list2;
            Integer n2 = nArray2[lim2];
            int n3 = 0;
            int n4 = 0;
            if (map != null && (list2 = map.get(n2)) != null) {
                for (a a2 : list2) {
                    if (a2.SN != ldv3.enw()) {
                        n4 += a2.asi;
                        continue;
                    }
                    n3 += a2.asi;
                }
            }
            int list3 = 0;
            int n5 = 0;
            if (map2 != null && (list = map2.get(n2)) != null) {
                for (kw kw2 : list) {
                    if (kw2.SN != ldv3.enw()) continue;
                    if (kw2.eo) {
                        list3 += kw2.asi;
                        continue;
                    }
                    n5 += kw2.asi;
                }
            }
            if (n4 != 0 || list3 != 0 || n5 != 0 || n3 != 0 || nArray.length == 1) {
                arrayList.add(new lim<Object>(n2, n3, n4, list3, n5));
            }
            ++lim2;
        }
        eyi2.iFy = new int[arrayList.size()];
        eyi2.iFz = new int[arrayList.size()];
        eyi2.iFA = new int[arrayList.size()];
        eyi2.iFB = new int[arrayList.size()];
        eyi2.iFC = new int[arrayList.size()];
        int n7 = 0;
        for (lim lim3 : arrayList) {
            eyi2.iFy[n7] = (Integer)lim3.getValue(0);
            eyi2.iFz[n7] = (Integer)lim3.getValue(1);
            eyi2.iFA[n7] = (Integer)lim3.getValue(2);
            eyi2.iFB[n7] = (Integer)lim3.getValue(3);
            eyi2.iFC[n7] = (Integer)lim3.getValue(4);
            ++n7;
        }
        this.MessageDelegator.E(eyi2);
    }

    public List<nv> oz() {
        nv nv2;
        String string;
        String string2;
        ArrayList<nv> arrayList = lcn.emv();
        for (Map.Entry<ldv, Map<Integer, List<a>>> entry : this.ask.entrySet()) {
            string2 = this.bE(entry.getKey());
            string = this.bF(entry.getKey());
            for (Map.Entry<Integer, List<Object>> entry2 : entry.getValue().entrySet()) {
                for (Object object : entry2.getValue()) {
                    nv2 = new nv();
                    nv2.aEY = string2;
                    nv2.TileID = string;
                    nv2.aEZ = lea.enW().getName(entry2.getKey());
                    nv2.SN = ((a)object).SN;
                    nv2.asi = ((a)object).asi;
                    nv2.asf = 0;
                    nv2.asg = 0.0f;
                    nv2.aFa = 1;
                    nv2.aFb = 0;
                    arrayList.add(nv2);
                }
            }
        }
        for (Map.Entry<ldv, Map<Integer, List<Object>>> entry : this.asl.entrySet()) {
            string2 = this.bE(entry.getKey());
            string = this.bF(entry.getKey());
            for (Map.Entry<Integer, List<Object>> entry2 : entry.getValue().entrySet()) {
                for (Object object : entry2.getValue()) {
                    nv2 = new nv();
                    nv2.aEY = string2;
                    nv2.TileID = string;
                    nv2.aEZ = lea.enW().getName(entry2.getKey());
                    nv2.SN = ((kw)object).SN;
                    nv2.asf = ((kw)object).asf;
                    nv2.asg = ((kw)object).asg;
                    nv2.aFa = 0;
                    nv2.aFb = ((kw)object).eo ? 1 : 0;
                    nv2.asi = ((kw)object).asi;
                    arrayList.add(nv2);
                }
            }
        }
        arrayList.addAll(this.asp);
        return arrayList;
    }

    public void A(List<nv> list) {
        String string = "U18,T18,V18,U19,T13,U13,U14,V13,P09,P10,P11,Q11,J15,K13,K14,L14";
        this.ask.clear();
        this.asl.clear();
        this.asm.clear();
        for (nv nv2 : list) {
            List<kw> list2;
            Map<Integer, List<Object>> map;
            ldv ldv2 = new ldv(0, lea.enW().getType(nv2.aEY), lcw.zi((String)nv2.TileID));
            int n = lea.enW().getType(nv2.aEZ);
            ctu ctu2 = cwy.bm(1, n);
            String string2 = "";
            if (ctu2 != null && ctu2.bbI() != null && ctu2.bbI().length > 0 && ctu2.bbI()[0] != null) {
                string2 = lea.enZ().getName(ctu2.bbI()[0].SkillType);
            }
            if (string.contains(nv2.TileID) && ctu2 != null && string2.toLowerCase().contains("mastery")) {
                map = lcr.abW((int)nv2.SN);
                list2 = (fmz)this.MessageDelegator.h(7955, this.GUID, (ldv)((Object)map));
                ((fmz)((Object)list2)).hsP = false;
                ((fmz)((Object)list2)).iIY = new int[ctu2.Ingredients.length];
                ((fmz)((Object)list2)).bqd = new int[ctu2.Ingredients.length];
                ((fmz)((Object)list2)).iQH = true;
                for (int i = 0; i < ctu2.Ingredients.length; ++i) {
                    ctm ctm2 = ctu2.Ingredients[i];
                    ((fmz)((Object)list2)).bqd[i] = ctm2.ResourceType;
                    ((fmz)((Object)list2)).iIY[i] = ctm2.asi * nv2.asi;
                }
                ((fmz)((Object)list2)).b(bqy.dHh);
                ((fmz)((Object)list2)).aFD = cug.fsH;
                this.MessageDelegator.E((dxq)((Object)list2));
                continue;
            }
            if (ctu2 == null) {
                this.asp.add(nv2);
                continue;
            }
            if (nv2.aFa == 1) {
                map = this.ask.get(ldv2);
                if (map == null) {
                    map = lcn.emw();
                    this.ask.put(ldv2, map);
                }
                if ((list2 = map.get(n)) == null) {
                    list2 = lcn.emv();
                    map.put(n, list2);
                }
                a a2 = new a(this, null);
                a2.SN = nv2.SN;
                a2.asi = nv2.asi;
                list2.add((kw)((Object)a2));
                continue;
            }
            map = this.asl.get(ldv2);
            if (map == null) {
                map = lcn.emw();
                this.asl.put(ldv2, map);
            }
            if ((list2 = map.get(n)) == null) {
                list2 = lcn.emv();
                map.put(n, list2);
            }
            kw kw2 = new kw();
            kw2.ase = n;
            kw2.SN = nv2.SN;
            kw2.asf = nv2.asf;
            kw2.asg = nv2.asg;
            kw2.eo = nv2.aFb == 1;
            kw2.asi = nv2.asi;
            list2.add(kw2);
        }
    }

    public String bE(ldv ldv2) {
        String string = lea.enW().getName(ldv2.enw());
        return string == null ? "" : string;
    }

    public String bF(ldv ldv2) {
        int n = ldv2.enx() - 100;
        return lcw.f((lej)new lej(n % 32, n / 32));
    }

    private void a(eyd eyd2) {
        int n;
        for (Map<Integer, List<a>> map : this.ask.values()) {
            for (List<a> list : map.values()) {
                n = 0;
                while (n < list.size()) {
                    if (list.get((int)n).SN == eyd2.qe()) {
                        list.remove(n);
                        continue;
                    }
                    ++n;
                }
            }
        }
        for (Map<Integer, List<Object>> map : this.asl.values()) {
            for (List<Object> list : map.values()) {
                n = 0;
                while (n < list.size()) {
                    if (((kw)list.get((int)n)).SN == eyd2.qe()) {
                        list.remove(n);
                        continue;
                    }
                    ++n;
                }
            }
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        if (ldz2.rgz - this.asq > 60.0) {
            this.asq = ldz2.rgz;
            ArrayList<eye> arrayList = lcn.emv();
            for (Map.Entry<Integer, kw> object : this.asm.entrySet()) {
                kw kw2 = object.getValue();
                if (!(ldz2.rgz - kw2.ps > 180.0)) continue;
                eye eye2 = (eye)this.MessageDelegator.h(34563, this.GUID, this.GUID);
                eye2.pu(kw2.asj);
                eye2.FH(kw2.ase);
                eye2.FJ(object.getKey());
                eye2.jO(false);
                eye2.kO(true);
                arrayList.add(eye2);
            }
            for (eye eye3 : arrayList) {
                this.a(eye3);
            }
        }
    }
}

