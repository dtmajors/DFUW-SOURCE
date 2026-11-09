/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cxd
 *  ep
 *  ha
 *  lcr
 *  lcw
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class cjw
extends cka {
    private static final boolean eEu = false;
    private static final int[] eEv = new int[]{13312, 13328, 13344, 13360, 13376, 13392, 13408, 13424};
    private static final int[] eEw = new int[]{cxd.fLf, cxd.fLi, cxd.fLk, cxd.fLl, cxd.fLj};
    private static final int[][] eEx = new int[][]{{13312, 208}, {13328, 160}, {13360, 176}, {13344, 240}, {13376, 208}, {13408, 176}, {13392, 240}, {13424, 160}};
    private cko eEy = null;
    private List<Integer> eEz = lcn.abH(lea.epx().aQI());
    private ggg eEA = null;
    private boolean eEB = false;
    private boolean eEC = false;
    private boolean eED = false;
    private boolean eEE = false;
    private boolean eEF = false;

    public cjw(ha ha2) {
        super(ha2);
        this.eEy = new cko(ha2);
        this.eFl = lea.epx().qU(ckc.COMMONER.ordinal());
        this.eFm = this.eFl.qQ(cke.eGj.ordinal());
        if (lcw.enb()) {
            this.a(null, -1, ckc.SKIRMISHER.ordinal(), cke.eFR.aOK());
        }
    }

    @Override
    void rw() {
        this.eEy.aRf();
        this.hF.jf().jm().a(11552, lea.epx().qU(ckc.COMMONER.ordinal()).getName());
        super.rw();
        if (this.kn()) {
            ldv ldv2 = lcr.ak((ldv)lcr.acL, (int)this.hF.hk().ib());
            this.a(4, ldv2, this.eFn);
        }
    }

    @Override
    void gg(boolean bl) {
        if (bl) {
            this.eEQ.clear();
        }
        ArrayList<Integer> arrayList = lcn.emv();
        for (int n : cxd.bfI()) {
            ler ler2 = lea.enZ().acv(n);
            List<ler> list = lea.enZ().a(ler2, false, true);
            for (ler ler3 : list) {
                int n2 = ler3.getType();
                if (this.eEz.contains(n2)) continue;
                arrayList.add(n2);
            }
        }
        int[] nArray = cxd.bfJ();
        for (int n : nArray) {
            if (this.eEz.contains(n)) continue;
            arrayList.add(n);
        }
        Object object = lcn.emv();
        for (Integer n : this.eEQ) {
            if (arrayList.contains((int)n)) continue;
            object.add(Integer.valueOf(n));
            this.hF.jf().aJz().c(n.intValue(), n.intValue(), 3.14496E7);
        }
        this.eEQ.removeAll((Collection<?>)object);
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            int n = (Integer)iterator.next();
            if (this.eEQ.contains(n)) continue;
            this.eEQ.add(n);
            this.hF.jf().aJz().a(n, 0.0, 3.14496E7, n, false);
            fa fa2 = this.hF.jf().jm().fs();
            if (fa2 == null) continue;
            fa2.bn(n);
        }
    }

    @Override
    void aQk() {
        this.eFn = this.MessageDelegator.arc().rgz;
    }

    @Override
    public void a(boolean bl, double d2) {
        this.eEF = true;
        if (this.kn() || bl) {
            this.eFn += d2;
            ldv ldv2 = lcr.ak((ldv)lcr.acL, (int)this.hF.hk().ib());
            this.a(3, ldv2, this.eFn);
            return;
        }
        if (this.eEA != null && !this.eEE) {
            this.eEE = true;
            fdt fdt2 = (fdt)this.MessageDelegator.h(9250, this.getGUID(), this.hF.jf().getGUID());
            fdt2.kU(false);
            this.MessageDelegator.I(fdt2);
            if (this.hF.jf().aLU() != null && this.hF.jf().aLU().aDc() != null) {
                this.hF.jf().aLU().aDc().nH(65539);
            }
        }
    }

    @Override
    public void kk() {
        this.eEF = false;
    }

    private boolean aQl() {
        return this.eEF;
    }

    @Override
    public nf aQm() {
        nf nf2 = new nf();
        nf2.SN = this.hF.getGUID().enw();
        nf2.aDd = this.aQs();
        nf2.aDe = this.aQt();
        return nf2;
    }

    private void a(ggg ggg2) {
        Object object;
        Object object2;
        if (!this.auz) {
            lfn.b(5, this.TC, "handlePlayerRoleManagementRequestMessage() Player state is not valid.");
            this.a(6, ggg2.aO(), ggg2.aVk(), -1.0);
            return;
        }
        if (!this.aQC()) {
            lfn.b(5, this.TC, "handlePlayerRoleManagementRequestMessage() Player state is not valid.");
            this.a(6, ggg2.aO(), ggg2.aVk(), -1.0);
            return;
        }
        if (this.kn()) {
            lfn.b(5, this.TC, "handlePlayerRoleManagementRequestMessage() System is on cooldown.");
            this.a(0, ggg2.aO(), ggg2.aVk(), this.eFn);
            return;
        }
        if (this.aQl()) {
            lfn.b(5, this.TC, "handlePlayerRoleManagementRequestMessage() Player is in combat mode.");
            this.a(7, ggg2.aO(), ggg2.aVk(), this.eFn);
            return;
        }
        if (this.eEA != null) {
            lfn.b(5, this.TC, "handlePlayerRoleManagementRequestMessage() System already proccessing another request.");
            this.a(1, ggg2.aO(), ggg2.aVk(), -1.0);
            return;
        }
        if (this.hF.jf().mp()) {
            lfn.b(5, this.TC, "handlePlayerRoleManagementRequestMessage() Player is controlling a monster.");
            this.a(5, ggg2.aO(), ggg2.aVk(), -1.0);
            return;
        }
        if (ggg2.bUG()) {
            object2 = ggg2.bUE();
            if (!this.B((int[])object2)) {
                lfn.b(5, this.TC, "handlePlayerRoleManagementRequestMessage() Player provided an invalid skill setup.");
                this.a(2, ggg2.aO(), ggg2.aVk(), -1.0);
                return;
            }
            this.eEB = this.z((int[])object2);
        }
        if (ggg2.bUH()) {
            object2 = ggg2.bUF();
            if (!lea.epw().D((int)object2)) {
                lfn.b(5, this.TC, "handlePlayerRoleManagementRequestMessage() Player provided an invalid booster setup.");
                this.a(2, ggg2.aO(), ggg2.aVk(), -1.0);
                return;
            }
            this.eEC = this.A((int[])object2);
        }
        if (ggg2.bUK()) {
            Object object3;
            Object object4;
            Object object5;
            object2 = ggg2.bUI();
            if (this.C((int[])object2)) {
                int n = object2[cjv.HEAVY.ordinal()];
                if (this.hF.jm().ap(13312) != n) {
                    this.eED = true;
                }
                object5 = object2[cjv.MEDIUM.ordinal()];
                if (this.hF.jm().ap(13328) != object5) {
                    this.eED = true;
                }
                object4 = object2[cjv.LIGHT_M.ordinal()];
                if (this.hF.jm().ap(13360) != object4) {
                    this.eED = true;
                }
                object3 = object2[cjv.LIGHT_C.ordinal()];
                if (this.hF.jm().ap(13344) != object3) {
                    this.eED = true;
                }
            }
            if (this.C((int[])(object = ggg2.bUJ()))) {
                object5 = object[ckh.eGx.ordinal()];
                if (this.hF.jm().ap(13376) != object5) {
                    this.eED = true;
                }
                object4 = object[ckh.eGy.ordinal()];
                if (this.hF.jm().ap(13392) != object4) {
                    this.eED = true;
                }
                object3 = object[ckh.eGz.ordinal()];
                if (this.hF.jm().ap(13408) != object3) {
                    this.eED = true;
                }
                int n = object[ckh.eGA.ordinal()];
                if (this.hF.jm().ap(13424) != n) {
                    this.eED = true;
                }
            }
        }
        if (!(this.eEB || this.eEC || this.eED)) {
            this.eEB = false;
            this.eEC = false;
            this.eED = false;
            this.a(4, ggg2.aO(), ggg2.aVk(), -1.0);
            return;
        }
        this.eEA = ggg2;
        object2 = lcn.emx();
        object2.addAll(this.eEz);
        this.gh(true);
        object = this.hF.jf().aJz();
        double d2 = lea.epx().getDelay();
        for (Integer n : this.eEz) {
            if (object2.contains(n)) continue;
            object.a(n.intValue(), 0.0, d2, n.intValue(), false);
        }
    }

    private void a(fdu fdu2) {
        this.gh(fdu2.bOA());
    }

    private void gh(boolean bl) {
        if (this.eEA == null) {
            return;
        }
        if (!this.aQC()) {
            lfn.b(5, this.TC, "handleFunctionUseObjectDelayResponseMessage() Player state is not valid.");
            this.a(6, this.eEA.aO(), this.eEA.aVk(), -1.0);
            this.eEA = null;
            this.eEE = false;
            this.eEB = false;
            this.eEC = false;
            this.eED = false;
            return;
        }
        if (!bl) {
            lfn.b(5, this.TC, "handleFunctionUseObjectDelayResponseMessage() Player broke the proccess.");
            this.a(6, this.eEA.aO(), this.eEA.aVk(), -1.0);
            this.eEA = null;
            this.eEE = false;
            this.eEB = false;
            this.eEC = false;
            this.eED = false;
            return;
        }
        if (this.eEC) {
            this.eEC = this.eEy.E(this.eEA.bUF());
        }
        this.aQk();
        if (this.eEB) {
            this.eEz.clear();
            if (this.eEA.bUE() != null) {
                for (int n : this.eEA.bUE()) {
                    if (n == -1) continue;
                    this.eEz.add(n);
                }
            }
            this.gg(false);
        }
        if (this.eED) {
            int[] nArray = this.eEA.bUI();
            int[] nArray2 = this.eEA.bUJ();
            this.hF.jm().i(13312, nArray[cjv.HEAVY.ordinal()]);
            this.hF.jm().i(13328, nArray[cjv.MEDIUM.ordinal()]);
            this.hF.jm().i(13344, nArray[cjv.LIGHT_C.ordinal()]);
            this.hF.jm().i(13360, nArray[cjv.LIGHT_M.ordinal()]);
            this.hF.jm().i(13376, nArray2[ckh.eGx.ordinal()]);
            this.hF.jm().i(13392, nArray2[ckh.eGy.ordinal()]);
            this.hF.jm().i(13408, nArray2[ckh.eGz.ordinal()]);
            this.hF.jm().i(13424, nArray2[ckh.eGA.ordinal()]);
        }
        if (this.eED || this.eEC) {
            this.aQD();
        }
        this.hF.jf().aMy().aLB();
        this.a(3, this.eEA.aO(), this.eEA.aVk(), this.eFn);
        this.eEA = null;
        this.eEE = false;
        this.eEB = false;
        this.eEC = false;
        this.eED = false;
        this.aQn();
    }

    private void aQn() {
        Object object;
        Object object2;
        int n = 0;
        int[] nArray = null;
        if (!this.eEz.isEmpty()) {
            nArray = new int[this.eEz.size()];
            object2 = this.eEz.iterator();
            while (object2.hasNext()) {
                int n2;
                nArray[n] = n2 = object2.next().intValue();
                ++n;
            }
        }
        n = 0;
        object2 = null;
        List<Integer> list = this.eEy.aRh();
        if (!list.isEmpty()) {
            object2 = new int[list.size()];
            object = list.iterator();
            while (object.hasNext()) {
                int n3 = (Integer)object.next();
                object2[n] = n3;
                ++n;
            }
        }
        object = new int[4];
        int[] nArray2 = new int[4];
        block12: for (int n4 : eEv) {
            int n5 = this.hF.jm().ap(n4);
            switch (n4) {
                case 13312: {
                    nArray2[cjv.HEAVY.ordinal()] = n5;
                    continue block12;
                }
                case 13328: {
                    nArray2[cjv.MEDIUM.ordinal()] = n5;
                    continue block12;
                }
                case 13344: {
                    nArray2[cjv.LIGHT_C.ordinal()] = n5;
                    continue block12;
                }
                case 13360: {
                    nArray2[cjv.LIGHT_M.ordinal()] = n5;
                    continue block12;
                }
                case 13376: {
                    object[ckh.eGx.ordinal()] = n5;
                    continue block12;
                }
                case 13392: {
                    object[ckh.eGy.ordinal()] = n5;
                    continue block12;
                }
                case 13408: {
                    object[ckh.eGz.ordinal()] = n5;
                    continue block12;
                }
                case 13424: {
                    object[ckh.eGA.ordinal()] = n5;
                }
            }
        }
        Object object3 = (gmo)this.MessageDelegator.h(3606, this.hF.getGUID(), lcr.qEl);
        ((gmo)object3).ar(nArray);
        ((gmo)object3).as((int[])object2);
        ((gmo)object3).at(nArray2);
        ((gmo)object3).au((int[])object);
        this.MessageDelegator.F((dxq)object3);
    }

    private void a(ggl ggl2) {
        ggm ggm2 = (ggm)this.MessageDelegator.h(30980, this.getGUID(), ggl2.aO());
        this.MessageDelegator.b(ggl2, ggm2);
        if (!this.auz) {
            ggm2.DR(4);
            this.MessageDelegator.F(ggm2);
            return;
        }
        if (!this.qk()) {
            ggm2.DR(4);
            this.MessageDelegator.F(ggm2);
            return;
        }
        ts ts2 = this.hF.kz();
        if (ts2 == null) {
            ggm2.DR(4);
            this.MessageDelegator.F(ggm2);
            return;
        }
        int n = ggl2.bUL();
        int n2 = ggl2.bUM();
        ckk ckk2 = lea.epw().aW(n, n2);
        if (ckk2 == null) {
            ggm2.DR(5);
            this.MessageDelegator.F(ggm2);
            return;
        }
        boolean bl = this.eEy.ri(ckk2.getID());
        if (!bl) {
            ggm2.DR(0);
            this.MessageDelegator.F(ggm2);
            return;
        }
        boolean bl2 = this.eEy.rl(ckk2.getID());
        if (!bl2) {
            ggm2.DR(2);
            this.MessageDelegator.F(ggm2);
            return;
        }
        int n3 = this.eEy.rj(ckk2.getIndex());
        float f = lea.epw().aX(ckk2.getIndex(), n3);
        tu tu2 = ts2.a(tv.aVC, -f, ckk2.getName());
        if (tu2 == tu.aVn) {
            ggm2.DR(4);
            this.MessageDelegator.F(ggm2);
            return;
        }
        if (tu2 == tu.aVo) {
            ggm2.DR(1);
            this.MessageDelegator.F(ggm2);
            return;
        }
        boolean bl3 = this.eEy.rk(ckk2.getID());
        ggm2.DR(bl3 ? 3 : 4);
        this.MessageDelegator.F(ggm2);
        fsn fsn2 = (fsn)this.MessageDelegator.h(30221, this.getGUID(), this.hF.getGUID());
        fsn2.ObjectType = cgd.ewS.ordinal();
        fsn2.bSL = ckk2.getID();
        this.MessageDelegator.I(fsn2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        int n = dxq2.bEz();
        switch (n) {
            case 30981: {
                this.a((ggj)dxq2);
                break;
            }
            case 30979: {
                this.a((ggl)dxq2);
                break;
            }
            case 30985: {
                this.a((ggg)dxq2);
                break;
            }
            case 30986: {
                this.a((ggh)dxq2);
                break;
            }
            case 9251: {
                this.a((fdu)dxq2);
                break;
            }
            default: {
                assert (false) : "Unhandled message type : " + n;
                break;
            }
        }
    }

    private boolean z(int[] nArray) {
        int n;
        int n2;
        if (nArray == null || nArray.length == 0) {
            return !this.eEz.isEmpty();
        }
        if (this.eEz.isEmpty()) {
            return true;
        }
        if (this.eEz.size() != nArray.length) {
            return true;
        }
        for (n2 = 0; n2 < nArray.length; ++n2) {
            n = nArray[n2];
            if (n == -1 || this.eEz.contains(n)) continue;
            return true;
        }
        this.eEz.clear();
        for (n2 = 0; n2 < nArray.length; ++n2) {
            n = nArray[n2];
            if (n == -1) continue;
            this.eEz.add(n);
        }
        return false;
    }

    private boolean A(int[] nArray) {
        List<Integer> list = this.eEy.aRh();
        if (nArray == null || nArray.length == 0) {
            return !list.isEmpty();
        }
        if (list.isEmpty()) {
            return true;
        }
        for (int i = 0; i < nArray.length; ++i) {
            int n = nArray[i];
            if (list.contains(n)) continue;
            return true;
        }
        return false;
    }

    private boolean B(int[] nArray) {
        if (nArray == null) {
            return true;
        }
        if (nArray.length > lea.epx().aQI()) {
            return false;
        }
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        for (int n4 : nArray) {
            if (n4 == -1) continue;
            boolean bl = cxd.xq((int)n4);
            boolean bl2 = cxd.xr((int)n4);
            if (!bl && !bl2) {
                return false;
            }
            if (bl2) {
                ++n;
                continue;
            }
            if (!bl) continue;
            boolean bl3 = lea.epx().qT(n4);
            if (bl3) {
                ++n2;
                continue;
            }
            ++n3;
        }
        return n2 <= lea.epx().aQJ() && n3 <= lea.epx().aQK() && n3 + n <= lea.epx().aQI();
    }

    private boolean C(int[] nArray) {
        if (nArray == null || nArray.length != 4) {
            return false;
        }
        for (int n : nArray) {
            if (ep.aT((int)n)) continue;
            assert (false);
            return false;
        }
        return true;
    }

    @Override
    public int km() {
        return this.eEy.km();
    }

    private void a(ggh ggh2) {
        if (this.eEA != null) {
            return;
        }
        if (this.kn()) {
            this.kl();
            this.hF.c(mcq.uxC.bD(new Object[0]));
            ldv ldv2 = lcr.ak((ldv)lcr.acL, (int)this.hF.hk().ib());
            this.a(0, ldv2, 0.0);
        }
    }

    private void a(int n, ldv ldv2, double d2) {
        ggi ggi2 = (ggi)this.MessageDelegator.h(30987, this.getGUID(), ldv2);
        ggi2.ija = n;
        ggi2.jgG = d2;
        this.MessageDelegator.E(ggi2);
    }

    @Override
    public void oU(int n) {
        ldv ldv2 = lcr.ak((ldv)lcr.acL, (int)this.hF.hk().ib());
        this.a(n == 1 ? 2 : 1, ldv2, 0.0);
    }

    @Override
    public void a(op[] opArray, int n, int n2, int n3) {
        this.eEy.a(opArray, n);
    }

    @Override
    public void a(nf nf2) {
        String[] stringArray;
        this.eEz.clear();
        Map map = this.hF.getAttributeMap();
        if (map == null) {
            assert (false);
            return;
        }
        if (nf2 == null) {
            this.z(map);
            return;
        }
        String[] stringArray2 = nf2.aDd;
        if (stringArray2 != null && stringArray2.length > 0) {
            String[] objectArray = stringArray2;
            int n = objectArray.length;
            for (int i = 0; i < n; ++i) {
                String string = objectArray[i];
                int n2 = cxd.ip((String)string);
                if (n2 == -1) {
                    assert (false);
                    continue;
                }
                this.eEz.add(n2);
            }
            int[] nArray = new int[this.eEz.size()];
            for (n = 0; n < this.eEz.size(); ++n) {
                nArray[n] = this.eEz.get(n);
            }
            if (!this.B(nArray)) {
                this.eEz.clear();
            }
        }
        if ((stringArray = nf2.aDe) == null || stringArray.length != eEv.length) {
            this.z(map);
            return;
        }
        for (String string : stringArray) {
            String[] stringArray3 = string.split(":");
            if (stringArray3 == null || stringArray3.length != 2) {
                this.z(map);
                return;
            }
            String string2 = stringArray3[0];
            int n = ep.as((String)string2);
            if (!ep.aU((int)n)) {
                this.z(map);
                return;
            }
            String string3 = stringArray3[1];
            int n3 = ep.as((String)string3);
            if (!ep.aT((int)n3)) {
                this.z(map);
                return;
            }
            ew ew2 = (ew)map.get(n);
            if (ew2 == null) {
                assert (false) : "Attribute : " + string2 + " is missing from character.";
                continue;
            }
            ew2.bi(n3);
        }
    }

    private void z(Map<Integer, ej> map) {
        if (map == null) {
            return;
        }
        boolean bl = false;
        for (int[] nArray : eEx) {
            ew ew2 = (ew)map.get(nArray[0]);
            if (ew2 == null || !ep.aU((int)nArray[0])) {
                assert (false) : "Attribute : " + ep.aM((int)nArray[0]) + " is missing from character.";
                continue;
            }
            if (!ep.aT((int)nArray[1])) {
                assert (false) : "Attribute : " + ep.aM((int)nArray[1]) + " is not a base attribute.";
                continue;
            }
            ew2.bi(nArray[1]);
        }
    }

    public static String[] aQo() {
        String[] stringArray = new String[eEx.length];
        int n = 0;
        for (int[] nArray : eEx) {
            String string = ep.aM((int)nArray[0]);
            String string2 = ep.aM((int)nArray[1]);
            stringArray[n] = string + ":" + string2;
            ++n;
        }
        return stringArray;
    }

    public static String[] aQp() {
        String[] stringArray = new String[eEw.length];
        int n = 0;
        for (int n2 : eEw) {
            stringArray[n] = lea.enZ().getName(n2);
            ++n;
        }
        return stringArray;
    }

    public static List<ne> qP(int n) {
        ArrayList<ne> arrayList = lcn.abH(a.values().length);
        for (a a2 : a.values()) {
            ne ne2 = new ne();
            ne2.SN = n;
            ne2.aDa = "RolesWindow";
            ne2.aDb = a2.Name;
            ne2.aDc = a2.byr;
            arrayList.add(ne2);
        }
        return arrayList;
    }

    private List<Integer> aS(int n, int n2) {
        ArrayList<Integer> arrayList = lcn.abH(lea.epx().aQI());
        cjx cjx2 = lea.epx().qU(n);
        if (cjx2 == null) {
            lfn.b(5, this.TC, "getDefaultSkills() SelectedRoleOrdinal : " + n + " is invalid!");
            assert (false);
            return arrayList;
        }
        ckd ckd2 = cjx2.aQx().get(n2);
        if (ckd2 == null) {
            lfn.b(5, this.TC, "getDefaultSkills() SelectedSpecializationOrdinal : " + n2 + " is invalid. Role : " + cjx2.getDisplayName());
            assert (false);
            return arrayList;
        }
        int n3 = ckd2.aQL();
        int n4 = ckd2.aQM();
        int[] nArray = cxd.bfI();
        int n5 = nArray.length;
        for (int i = 0; i < n5; ++i) {
            int n6 = nArray[i];
            if (n3 != n6 && n4 != n6) continue;
            ler ler2 = lea.enZ().acv(n6);
            int n7 = lea.epx().qS(n4);
            List<ler> list = lea.enZ().a(ler2, false, true);
            for (ler ler3 : list) {
                if (ler3.getType() == n7) continue;
                arrayList.add(ler3.getType());
            }
        }
        for (int n8 : nArray = cxd.bfJ()) {
            if (arrayList.size() >= lea.epx().aQI()) break;
            arrayList.add(n8);
        }
        return arrayList;
    }

    @Override
    Map<Integer, ckl> aQq() {
        return this.eEy.aRa();
    }

    @Override
    public op[] aQr() {
        List<op> list = this.eEy.aQX();
        return list.toArray(new op[list.size()]);
    }

    @Override
    public int kh() {
        int n;
        int[] nArray = new int[]{lea.epw().aRe(), lea.epw().aRe(), lea.epw().aRe(), lea.epw().aRe()};
        List<Integer> list = this.eEy.aRh();
        assert (list.size() <= 4);
        if (!list.isEmpty()) {
            for (n = 0; n < list.size(); ++n) {
                int n2;
                nArray[n] = n2 = list.get(n).intValue();
            }
        }
        n = 0;
        n = n & 0xFFFFFC1F | nArray[0] << 5;
        n = n & 0xFFFF83FF | nArray[1] << 10;
        n = n & 0xFFF07FFF | nArray[2] << 15;
        n = n & 0xFE0FFFFF | nArray[3] << 20;
        return n;
    }

    @Override
    public cjx ki() {
        return this.eFl;
    }

    @Override
    public ckd kj() {
        return this.eFm;
    }

    private String[] aQs() {
        String[] stringArray = new String[this.eEz.size()];
        int n = 0;
        for (int n2 : this.eEz) {
            String string = lea.enZ().getName(n2);
            if (!cxd.xq((int)n2) && !cxd.xr((int)n2)) {
                string = "";
                assert (false) : "Invalid skill type : " + n2;
            }
            stringArray[n] = string;
            ++n;
        }
        return stringArray;
    }

    private String[] aQt() {
        Map map = this.hF.getAttributeMap();
        if (map == null) {
            return null;
        }
        int n = 0;
        String[] stringArray = new String[eEv.length];
        for (int n2 : eEv) {
            ew ew2 = (ew)map.get(n2);
            if (ew2 == null) {
                assert (false);
                stringArray[n] = "";
                ++n;
                continue;
            }
            int n3 = ew2.fQ();
            if (!ep.aT((int)n3)) {
                assert (false);
                stringArray[n] = "";
                ++n;
                continue;
            }
            String string = ep.aM((int)n3);
            stringArray[n] = ew2.getName() + ":" + string;
            ++n;
        }
        return stringArray;
    }
}

