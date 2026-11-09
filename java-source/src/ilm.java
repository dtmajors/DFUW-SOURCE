/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  cxd
 *  hvj
 *  hvy
 *  hyn
 *  hzo
 *  ifc
 *  lcr
 *  lcw
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ilm {
    private static ifj lPa = null;
    private static iev lPb;
    private static joa mih;

    public static hvj cxP() {
        return hso.cxK().cxP();
    }

    public static hzo cyJ() {
        return hso.cxK().cxP().cyJ();
    }

    public static dxr getMessageDelegator() {
        return ilm.cyJ().getMessageDelegator();
    }

    public static void n(joa joa2) {
        mih = joa2;
    }

    public static boolean a(ilx ilx2, imr imr2) {
        if (ilx2.ddR()) {
            return ilm.b(ilx2, imr2);
        }
        if (ilx2.ddQ()) {
            return ilm.c(ilx2, imr2);
        }
        return false;
    }

    public static hyn bi(List<ims> list) {
        Object object;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Map<ies, List<ims>> map = lcn.emw();
        for (ims object22 : list) {
            object = ilm.c(object22, list);
            if (object == null) continue;
            for (ies ies2 : object) {
                List<ims> list2 = map.get((Object)ies2);
                if (list2 == null) {
                    list2 = lcn.emv();
                    map.put(ies2, list2);
                }
                list2.add(object22);
            }
        }
        Iterator<Object> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            if (((List)entry.getValue()).size() >= list.size()) continue;
            iterator.remove();
        }
        if (map.isEmpty()) {
            return null;
        }
        ArrayList<hyj> arrayList = lcn.emv();
        ilm.a(map, arrayList);
        object = new hym(ilm.cxP().bpb(), ilm.cxP().bpc(), arrayList, new jlf<hyk>(){

            public boolean d(hyk hyk2) {
                ilm.c(hyk2);
                return true;
            }

            public /* synthetic */ boolean T(Object object) {
                return this.d((hyk)object);
            }
        });
        return object;
    }

    public static boolean a(int n, bqm.b b2) {
        boolean bl = cug.wr((int)n);
        if (!cug.vL((int)n) && !bl) {
            if (b2 == bqm.b.dEp) {
                if (ilm.cxP() != null && ilm.cxP().czb() != null && ilm.cxP().czb().i(bca.cUa)) {
                    return true;
                }
            } else if (b2 == bqm.b.dER) {
                if (ilm.cxP() != null && ilm.cxP().czb() != null && ilm.cxP().czb().i(bca.cUf)) {
                    return true;
                }
            } else if (b2 == bqm.b.dES) {
                if (ilm.cxP() != null && ilm.cxP().czb() != null && ilm.cxP().czb().i(bca.cUi)) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return bl && lea.enW().isDescendant(n, cug.fkk);
    }

    public static boolean O(bsh bsh2) {
        bqm.b b2 = ilm.cxP().cza().ri(bsh2.avU()).alX();
        return ilm.a(bsh2.az(), b2);
    }

    public static boolean a(ims ims2) {
        bsh bsh2 = ims2.dey().cBu();
        return bsh2 != null ? ilm.O(bsh2) : false;
    }

    public static void bj(List<ims> list) {
        inv.a(list.size() > 1 ? lxb.tmp.bD(new Object[0]) : lxb.tmq.bD(new Object[0]), new hyr(list){
            final /* synthetic */ List mii;
            {
                this.mii = list;
            }

            public void oH(boolean bl) {
                if (bl) {
                    ilm.bq(this.mii);
                }
            }
        });
    }

    public static void bk(List<ims> list) {
        ArrayList<Object> arrayList;
        Object object;
        Map<Integer, Object> map = lcn.emw();
        for (ims object2 : list) {
            object = object2.dey();
            if (!((ilx)object).auW()) continue;
            arrayList = (ArrayList<Object>)map.get(((ilx)object).uw());
            if (arrayList == null) {
                arrayList = lcn.emv();
                map.put(((ilx)object).uw(), arrayList);
            }
            arrayList.add(object);
        }
        for (Map.Entry entry : map.entrySet()) {
            object = (List)entry.getValue();
            if (object.size() <= 1) continue;
            arrayList = (ilx)object.get(0);
            for (int i = 1; i < object.size(); ++i) {
                ilx ilx2 = (ilx)object.get(i);
                ((ilx)((Object)arrayList)).e(ilx2);
            }
        }
    }

    public static void e(List<ims> list, int n) {
        int n2;
        int n3;
        if (n <= 0) {
            lfn.b(5, ilm.class.getSimpleName(), "divideItems: invalid quantity: " + n);
            assert (false);
            return;
        }
        Map map = lcn.emw();
        for (ims object : list) {
            int n4;
            int n5;
            if (!object.dey().auW() || (n5 = (n4 = object.dey().vf()) / n) <= 0) continue;
            ArrayList<Integer> arrayList = lcn.emv();
            map.put(object.dey(), arrayList);
            for (n3 = 0; n3 < n; ++n3) {
                arrayList.add(n5);
            }
            n3 = n4 % n;
            while (n3 > 0) {
                n2 = 0;
                while (n2 < n && n3 > 0) {
                    arrayList.set(n2, (Integer)arrayList.get(n2) + 1);
                    --n3;
                    ++n;
                }
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            ilx ilx2 = (ilx)entry.getKey();
            List list2 = (List)entry.getValue();
            int n6 = ilx2.vf();
            for (n3 = 1; n3 < list2.size(); ++n3) {
                n2 = (Integer)list2.get(n3);
                ilx2.ed(n6 -= n2, n2);
            }
        }
    }

    public static void a(ims ims2, List<hyj> list) {
        ArrayList<ims> arrayList = lcn.emv();
        arrayList.add(ims2);
        List<ies> list2 = ilm.c(ims2, arrayList);
        if (list2 != null) {
            Map<ies, List<ims>> map = lcn.emw();
            ArrayList<ims> arrayList2 = lcn.emv();
            arrayList2.add(ims2);
            for (ies ies2 : list2) {
                map.put(ies2, arrayList2);
            }
            ilm.a(map, list);
        }
    }

    public static boolean Rq(int n) {
        switch (n) {
            case 160: 
            case 176: 
            case 208: 
            case 240: 
            case 13312: 
            case 13328: 
            case 13344: 
            case 13360: 
            case 13376: 
            case 13392: 
            case 13408: 
            case 13424: {
                return true;
            }
        }
        return false;
    }

    public static boolean p(alu alu2) {
        lce[] lceArray;
        int n;
        int n2;
        ldi ldi2;
        lce[] lceArray2;
        int n3 = alu2.CD();
        ler ler2 = lea.enT().acv(n3);
        if (ler2 instanceof ldi && (lceArray2 = (ldi2 = (ldi)ler2).enl()) != null && lceArray2.length > 0 && (n2 = 0) < (n = (lceArray = lceArray2).length)) {
            lce lce2 = lceArray[n2];
            return ilm.Rq(lce2.bnM);
        }
        return false;
    }

    private static boolean b(ilx ilx2, imr imr2) {
        imr2.a((ilq)ilx2);
        return true;
    }

    private static boolean c(ilx ilx2, imr imr2) {
        imc imc2 = (imc)ilx2;
        ilq ilq2 = ilx2.ddA();
        if (ilq2 == null) {
            return false;
        }
        bsh bsh2 = imc2.ddS().cBu();
        if (ilm.cyJ().cIt().cEU()) {
            return ilm.P(bsh2);
        }
        if (cug.wC((int)bsh2.az())) {
            return ilm.Q(bsh2);
        }
        if (ilm.cxP().cyI().dIa()) {
            return ilm.a(bsh2, ilq2);
        }
        if (ilq2.ddh()) {
            return ilm.b(bsh2, ilq2);
        }
        if (ilm.d(ilx2, imr2)) {
            return true;
        }
        if (ilm.c(bsh2, ilq2)) {
            return true;
        }
        return ilm.d(bsh2, ilq2);
    }

    private static boolean P(bsh bsh2) {
        if (!cug.wt((int)bsh2.az())) {
            if (ilm.cyJ().cIt().dvm()) {
                ilm.cyJ().cIt().k(new hwo(bsh2));
                return true;
            }
            if (ilm.cyJ().cIt().dvn()) {
                ilm.cyJ().cIt().l(new hwo(bsh2));
                return true;
            }
        }
        return false;
    }

    private static boolean Q(bsh bsh2) {
        if (lPa == null || lPa.isCleanedUp()) {
            lPa = new ifj();
            lPa.setGUID(ilm.getMessageDelegator().bzv());
            ilm.getMessageDelegator().a((amf)((Object)lPa));
        }
        lPa.Z(ilm.cxP().bpb() - 144, ilm.cxP().bpc() - 150);
        lPa.setVisible(true);
        lPa.cqF();
        return true;
    }

    private static iev ddg() {
        if (lPb == null) {
            lPb = new iev(ilm.cxP(), ilm.cyJ(), ilm.getMessageDelegator());
        }
        return lPb;
    }

    private static boolean a(bsh bsh2, ilq ilq2) {
        if (cug.us((int)bsh2.az())) {
            if (!ilm.cyJ().cHD().isVisible()) {
                ilm.cyJ().cHD().activate();
            }
            ilm.cyJ().cHD().c(ilq2.cBs(), bsh2);
            return true;
        }
        return false;
    }

    private static boolean b(bsh bsh2, ilq ilq2) {
        ilq2.cBs().a(bsh2.getGUID(), ilm.cyJ().cHO().cBs(), false);
        return true;
    }

    private static boolean c(bsh bsh2, ilq ilq2) {
        if (lcw.emX()) {
            return ilm.ddg().Qp(bsh2.az());
        }
        return false;
    }

    private static boolean d(bsh bsh2, ilq ilq2) {
        boolean bl;
        boolean bl2 = ilm.cxP().cyJ().cHQ() != null && ilm.cxP().cyJ().cHQ().cRB();
        boolean bl3 = bl = ilm.cxP().cyJ().cIr() != null && ilm.cxP().cyJ().cIr().cRQ();
        if ((bl2 || bl) && bsh2.auO() == cak.c.efT) {
            return false;
        }
        ilq2.cBs().rp(bsh2.getGUID());
        return true;
    }

    private static boolean d(ilx ilx2, imr imr2) {
        if (ilx2 instanceof ilq) {
            imr2.a((ilq)ilx2);
            return true;
        }
        return false;
    }

    private static boolean b(ims ims2, List<ims> list) {
        for (ims ims3 : list) {
            if (ims3 == ims2 || !ims3.dey().auW() || ims3.dey().uw() != ims2.dey().uw()) continue;
            return true;
        }
        return false;
    }

    private static int c(bsh bsh2, int n) {
        int n2 = 0;
        if (cug.wB((int)bsh2.az())) {
            int n3 = 0;
            for (ej ej2 : bsh2.arJ()) {
                if (ej2.getType() != 13216) continue;
                n3 = ((ew)ej2).fQ();
            }
            int n4 = n3 & 0xFFFF;
            int n5 = n3 >> 16;
            int n6 = n & 0xFFFF;
            int n7 = n >> 16;
            if (n6 != 65535 && n6 != n4) {
                n2 |= 1;
            }
            if (n7 != 65535 && n7 != n5) {
                n2 |= 2;
            }
        }
        return n2;
    }

    private static hyj a(ies ies2, List<ims> list) {
        switch (ies2) {
            case lOx: {
                return new a(ies2, list){
                    final /* synthetic */ List mii;
                    {
                        this.mii = list;
                        super(ies2);
                    }

                    public void cDS() {
                        ilm.bj(this.mii);
                    }
                };
            }
            case lOy: {
                return new a(ies2, list){
                    final /* synthetic */ List mii;
                    {
                        this.mii = list;
                        super(ies2);
                    }

                    public void cDS() {
                        ilm.g((ims)this.mii.get(0));
                    }
                };
            }
            case lOz: {
                return new a(ies2, list){
                    final /* synthetic */ List mii;
                    {
                        this.mii = list;
                        super(ies2);
                    }

                    public void cDS() {
                        ilm.bk(this.mii);
                    }
                };
            }
            case lOC: {
                return new a(ies2, list){
                    final /* synthetic */ List mii;
                    {
                        this.mii = list;
                        super(ies2);
                    }

                    public void cDS() {
                        ilm.br(this.mii);
                    }
                };
            }
            case lOD: {
                return new a(ies2, list){
                    final /* synthetic */ List mii;
                    {
                        this.mii = list;
                        super(ies2);
                    }

                    public void cDS() {
                        ilm.bs(this.mii);
                    }
                };
            }
            case lOE: {
                return new a(ies2, list){
                    final /* synthetic */ List mii;
                    {
                        this.mii = list;
                        super(ies2);
                    }

                    public void cDS() {
                        ilm.h((ims)this.mii.get(0));
                    }
                };
            }
            case lOF: {
                return new a(ies2, list){
                    final /* synthetic */ List mii;
                    {
                        this.mii = list;
                        super(ies2);
                    }

                    public void cDS() {
                        ilm.i((ims)this.mii.get(0));
                    }
                };
            }
            case lOG: {
                return new a(ies2, list){
                    final /* synthetic */ List mii;
                    {
                        this.mii = list;
                        super(ies2);
                    }

                    public void cDS() {
                        ilm.j((ims)this.mii.get(0));
                    }
                };
            }
            case lOH: {
                return new a(ies2, list){
                    final /* synthetic */ List mii;
                    {
                        this.mii = list;
                        super(ies2);
                    }

                    public void cDS() {
                        ilm.bt(this.mii);
                    }
                };
            }
        }
        return null;
    }

    private static void bl(List<ims> list) {
        for (ims ims2 : list) {
            ims2.dey().delete();
        }
    }

    private static void b(ims ims2) {
        ims2.dez();
    }

    private static void c(ims ims2) {
        ilx ilx2 = ims2.dey();
        if (!ilx2.ddQ() || !ilx2.auW()) {
            return;
        }
        joa joa2 = ims2.deA();
        ind ind2 = new ind(ims2.djE(), joa2, ilx2.cBu(), ilx2){
            final /* synthetic */ ilx mij;
            {
                this.mij = ilx2;
                super(ioa2, joa2, bsh2);
            }

            public void Qd(int n) {
                this.mij.ed(this.mij.vf() - n, n);
            }
        };
        ind2.setGUID(ilm.cyJ().getMessageDelegator().bzv());
        ilm.cyJ().getMessageDelegator().a((amf)((Object)ind2));
    }

    private static void d(ims ims2) {
        ilx ilx2 = ims2.dey();
        if (!ilx2.ddQ()) {
            return;
        }
        ilm.cxP().czi();
        if (hso.cxK() != null && hso.cxK().cxP() != null && hso.cxK().cxP().cyJ() != null) {
            ifc ifc2 = hso.cxK().cxP().cyJ().cIr();
            if (ifc2 == null) {
                return;
            }
            ifc2.I(ilx2.cBu());
            ifc2.setVisible(true);
            hso.cxK().cxP().cyJ().updateLayout();
        }
    }

    private static void e(ims ims2) {
        ilm.d(ims2);
    }

    private static void bm(List<ims> list) {
        for (ims ims2 : list) {
            ilm.f(ims2);
        }
    }

    private static void f(ims ims2) {
        int n;
        Object object;
        ilx ilx2 = ims2.dey();
        if (!ilx2.ddQ()) {
            return;
        }
        bsh bsh2 = ilx2.cBu();
        hvy hvy2 = hso.cxK().cxP().cyZ();
        int n2 = hvy2.cAs();
        cab cab2 = lea.epO().get(n2 & 0xFFFF);
        cab cab3 = lea.epO().get(n2 >> 16);
        if (cab2 == null && cab3 == null) {
            return;
        }
        int n3 = 0;
        int n4 = 0;
        ArrayList<bsh> arrayList = lcn.emv();
        if (cug.mM((int)bsh2.az())) {
            object = ilm.cxP().cza().ri(bsh2.getGUID());
            if (object != null) {
                for (bsh bsh3 : object.cCO().values()) {
                    n = ilm.c(bsh3, n2);
                    if (n == 0) continue;
                    if ((n & 1) == 1) {
                        ++n3;
                    }
                    if ((n & 2) == 2) {
                        ++n4;
                    }
                    arrayList.add(bsh3);
                }
            }
        } else {
            int n5 = ilm.c(bsh2, n2);
            if (n5 != 0) {
                if ((n5 & 1) == 1) {
                    ++n3;
                }
                if ((n5 & 2) == 2) {
                    ++n4;
                }
                arrayList.add(bsh2);
            }
        }
        if (arrayList.size() == 0) {
            return;
        }
        object = (bql)((Object)ilm.cyJ().getMessageDelegator().bzx().bzt().d(hso.cxK().bAn().gZb));
        if (object == null) {
            return;
        }
        int n6 = Integer.MAX_VALUE;
        if (cab2 != null) {
            n6 = object.aup().mp(cab2.az());
        }
        int n7 = Integer.MAX_VALUE;
        if (cab3 != null) {
            n7 = object.aup().mp(cab3.az());
        }
        n = Math.min(n6, n7);
        if (cab2 != null && n3 > n6 || cab3 != null && n4 > n7 || cab2 == cab3 && cab2 != null && n3 + n4 > n6) {
            hzs hzs2 = ilm.cyJ().cHy();
            hzs2.a(new hzq(arrayList, hvy2, n){
                final /* synthetic */ List lPo;
                final /* synthetic */ hvy lPp;
                final /* synthetic */ int lPq;
                {
                    this.lPo = list;
                    this.lPp = hvy2;
                    this.lPq = n;
                }

                public void O(float f, float f2) {
                }

                public void oH(boolean bl) {
                    if (ilm.cyJ() != null) {
                        ilm.cyJ().cHy().setVisible(false);
                    }
                    if (bl) {
                        ilm.e(this.lPo, this.lPp.cAs(), this.lPq);
                    }
                }
            });
            hzs2.a(lxg.tpC.bD(new Object[0]).exA(), ilm.cxP().bpb(), ilm.cxP().bpc(), 0, 0);
        } else {
            ilm.d(arrayList, n2, n);
        }
    }

    private static void d(List<bsh> list, int n, int n2) {
        int n3 = 0;
        for (bsh bsh2 : list) {
            flg flg2 = (flg)ilm.cyJ().getMessageDelegator().h(8008, ilm.cyJ().getGUID(), hso.cxK().bAn().gYX);
            flg2.GT(n);
            flg2.pJ(lcr.O((int)-1, (ldv)bsh2.getGUID()));
            ilm.cyJ().getMessageDelegator().E(flg2);
            if (++n3 < n2) continue;
            break;
        }
    }

    private static void b(hyk hyk2) {
        hyl hyl2 = (hyl)hyk2;
        ArrayList<hyj> arrayList = hyl2.cDV();
        for (int i = 0; i < arrayList.size(); ++i) {
            hyj hyj2 = arrayList.get(i);
            a a2 = (a)hyj2;
            if (a2.mik != ies.lOH) continue;
            int n = ilm.cxP().cyZ().cAs();
            cab cab2 = lea.epO().get(n & 0xFFFF);
            cab cab3 = lea.epO().get(n >> 16);
            hyl2.cDW().a(i, ies.lOH.getName(), cab2 != null ? cab2.aFK() : -16777216, cab3 != null ? cab3.aFK() : -16777216);
            return;
        }
    }

    private static void bn(List<ims> list) {
        joa joa2 = mih != null ? mih : new joa(hso.cxK().cxP().bpb(), hso.cxK().cxP().bpc(), 0.0f, 0.0f);
        int n = ilm.bp(list);
        imy imy2 = new imy(list.get(0).djE(), joa2, 1, 2, n, list){
            final /* synthetic */ List mii;
            {
                this.mii = list;
                super(ioa2, joa2, n, n2, n3);
            }

            public void Qd(int n) {
                ilm.e(this.mii, n);
            }
        };
        imy2.setGUID(ilm.cyJ().getMessageDelegator().bzv());
        ilm.cyJ().getMessageDelegator().a((amf)((Object)imy2));
    }

    private static void bo(List<ims> list) {
        joa joa2 = new joa(hso.cxK().cxP().bpb(), hso.cxK().cxP().bpc(), 0.0f, 0.0f);
        imx imx2 = new imx(list.get(0).djE(), joa2, list, list){
            final /* synthetic */ List mii;
            {
                this.mii = list2;
                super(ioa2, joa2, list);
            }

            protected void a(ilu ilu2) {
                ilm.b(this.mii, ilu2);
            }
        };
        imx2.setGUID(ilm.cyJ().getMessageDelegator().bzv());
        ilm.cyJ().getMessageDelegator().a((amf)((Object)imx2));
    }

    private static void a(List<ims> list, ilu ilu2) {
        for (ims ims2 : list) {
            ims2.dey().b(ilu2);
        }
    }

    private static int bp(List<ims> list) {
        int n = Integer.MAX_VALUE;
        for (ims ims2 : list) {
            if (!ims2.dey().auW()) continue;
            n = Math.min(n, ims2.dey().vf());
        }
        return n;
    }

    private static List<ies> c(ims ims2, List<ims> list) {
        cxc cxc2;
        if (ims2.dey().ddh()) {
            return null;
        }
        bsh bsh2 = ims2.dey().cBu();
        if (bsh2 == null) {
            return null;
        }
        boolean bl = lea.enW().isDescendant(bsh2.az(), cug.fjP);
        lgw lgw2 = (lgw)lea.enW().acv(bsh2.az());
        ArrayList<ies> arrayList = lcn.emv();
        bqm.b b2 = ilm.cxP().cza().ri(bsh2.avU()).alX();
        boolean bl2 = ilm.a(bsh2.az(), b2);
        if (bl2) {
            arrayList.add(ies.lOD);
        }
        if (bl2) {
            arrayList.add(ies.lOx);
        }
        if (bsh2.awx().auW()) {
            if (ilm.b(ims2, list)) {
                arrayList.add(ies.lOz);
            }
            if (ims2.dey().vf() > 1) {
                arrayList.add(ies.lOC);
            }
        }
        if (bl && !cug.vL((int)bsh2.az()) && !cug.wr((int)bsh2.az())) {
            if (b2 == bqm.b.dEp) {
                if (ilm.cxP() != null && ilm.cxP().czb() != null && ilm.cxP().czb().i(bca.cUa) && list.size() == 1) {
                    arrayList.add(ies.lOE);
                }
            } else if (b2 == bqm.b.dER) {
                if (ilm.cxP() != null && ilm.cxP().czb() != null && ilm.cxP().czb().i(bca.cUf) && list.size() == 1) {
                    arrayList.add(ies.lOE);
                }
            } else if (b2 == bqm.b.dES) {
                if (ilm.cxP() != null && ilm.cxP().czb() != null && ilm.cxP().czb().i(bca.cUi) && list.size() == 1) {
                    arrayList.add(ies.lOE);
                }
            } else if (list.size() == 1) {
                arrayList.add(ies.lOE);
            }
            if (b2 == bqm.b.dEn && ilm.cxP() != null && ilm.cxP().cza() != null && ifd.a(ilm.cxP().cza(), ilm.cxP().cza().ri(bsh2.getGUID())) && list.size() == 1) {
                arrayList.add(ies.lOG);
            }
        }
        if (lgw2.auW() && bsh2.vf() > 1) {
            if (b2 == bqm.b.dEp) {
                if (ilm.cxP() != null && ilm.cxP().czb() != null && ilm.cxP().czb().i(bca.cUa) && list.size() == 1 && list.get(0).dey().auW()) {
                    arrayList.add(ies.lOy);
                }
            } else if (b2 == bqm.b.dER) {
                if (ilm.cxP() != null && ilm.cxP().czb() != null && ilm.cxP().czb().i(bca.cUf) && list.size() == 1 && list.get(0).dey().auW()) {
                    arrayList.add(ies.lOy);
                }
            } else if (b2 == bqm.b.dES) {
                if (ilm.cxP() != null && ilm.cxP().czb() != null && ilm.cxP().czb().i(bca.cUi) && list.size() == 1 && list.get(0).dey().auW()) {
                    arrayList.add(ies.lOy);
                }
            } else if (list.size() == 1 && list.get(0).dey().auW()) {
                arrayList.add(ies.lOy);
            }
        }
        if (cug.wk((int)lgw2.getType()) && b2 == bqm.b.dEn && ilm.cxP() != null && ilm.cxP().cyZ() != null && (cxc2 = ilm.cxP().cyZ().ht(cxd.fLs)) != null && list.size() == 1) {
            arrayList.add(ies.lOF);
        }
        boolean bl3 = lPa != null && !lPa.isCleanedUp() && (lPa.cSl().az() != -1 || lPa.cSm().az() != -1);
        int n = ilm.cxP().cyZ().cAs();
        if (cug.wB((int)lgw2.getType()) && bl3 && ilm.c(bsh2, n) != 0) {
            arrayList.add(ies.lOH);
        }
        if (cug.mM((int)lgw2.getType()) && bl3) {
            arrayList.add(ies.lOH);
        }
        return arrayList;
    }

    private static void a(Map<ies, List<ims>> map, List<hyj> list) {
        for (Map.Entry<ies, List<ims>> entry : map.entrySet()) {
            hyj hyj2 = ilm.a(entry.getKey(), entry.getValue());
            list.add(hyj2);
        }
        Collections.sort(list);
    }

    static /* synthetic */ void c(hyk hyk2) {
        ilm.b(hyk2);
    }

    static /* synthetic */ void bq(List list) {
        ilm.bl(list);
    }

    static /* synthetic */ void g(ims ims2) {
        ilm.c(ims2);
    }

    static /* synthetic */ void br(List list) {
        ilm.bn(list);
    }

    static /* synthetic */ void bs(List list) {
        ilm.bo(list);
    }

    static /* synthetic */ void h(ims ims2) {
        ilm.b(ims2);
    }

    static /* synthetic */ void i(ims ims2) {
        ilm.d(ims2);
    }

    static /* synthetic */ void j(ims ims2) {
        ilm.e(ims2);
    }

    static /* synthetic */ void bt(List list) {
        ilm.bm(list);
    }

    static /* synthetic */ void e(List list, int n, int n2) {
        ilm.d(list, n, n2);
    }

    static /* synthetic */ void b(List list, ilu ilu2) {
        ilm.a(list, ilu2);
    }
}

