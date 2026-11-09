/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcw
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class bsu
extends btk
implements bto {
    private final boolean bC = false;
    private final Map<ldv, List<ldv>> dJF = lcn.emw();
    private final Map<ldv, List<ldv>> dJG = lcn.emw();
    private final Map<ldv, List<ldv>> dJH = lcn.emw();
    private int Qs = 1;
    private final Map<Integer, ldv> dJI = lcn.emw();
    private final Map<Integer, ldv> dJJ = lcn.emw();
    private ldv dJK = null;
    private ldv oJ;
    private final int dJL = 3;
    private boolean dJM = false;
    private int dJN = -1;
    private double dJO = 0.0;
    private int dJP = 0;
    private int dJQ = 0;
    private int dJR = 0;
    private final int dJS = 500;
    private boolean dJT = false;
    private bth dJU = null;
    private btg dJV = null;
    private boolean dJW = false;
    private boolean dJX;
    private boolean dJY;
    private int dJZ = 0;
    private final int dKa = 28;
    private static final boolean dKb = false;
    public static boolean dKc = false;
    private final List<ldv> dKd = lcn.emv();
    private final float dKe = 2.0f;

    public bsu() {
        this.setGUID(lcr.qEn);
        if (lcw.enf() || lcw.eng()) {
            this.dJT = true;
        }
        if (lcw.ena()) {
            lcw.qGO = null;
        }
    }

    @Override
    public void initialize() {
        assert (lcw.qGK) : "Dynamic loading must be set!";
        this.axi();
        this.a(amf.a.buA);
        super.initialize();
    }

    private void axi() {
        this.dJU = new bth();
        this.MessageDelegator.a(this.dJU);
    }

    @Override
    public void doTick(ldz ldz2) {
        if (dKc) {
            if (this.dJU.isEnabled()) {
                this.dJU.disable();
            } else {
                this.dJU.enable();
            }
            dKc = false;
        }
        if (!this.dJW) {
            if (lcw.emZ()) {
                if (lcw.qGu == 4 || lcw.qGu == 5 || lcw.qGu == 6) {
                    this.c(fy.ax.get(lcw.qGO));
                    this.dJW = true;
                }
            } else if (lcw.ena() || lcw.enb()) {
                this.ee(true);
                this.dJW = true;
            }
        }
        if (this.CurrentObjectState == amf.a.buD) {
            if (this.dJX) {
                if (ldz2.lpr - this.dJN < 10) {
                    return;
                }
                this.dJX = false;
            }
            if (this.dJM) {
                // empty if block
            }
        } else if (this.CurrentObjectState == amf.a.buA) {
            this.a(amf.a.buC);
        } else if (this.CurrentObjectState == amf.a.buC) {
            this.a(amf.a.buD);
        }
    }

    private void axj() {
        assert (this.dJK != null);
        fov fov2 = (fov)this.MessageDelegator.h(3843, this.GUID, this.dJK);
        fov2.ll(true);
        fov2.Hf(this.dJP);
        fov2.Hg(this.dJQ);
        this.MessageDelegator.F(fov2);
        this.dJK = null;
        lcw.qFO = true;
    }

    private final void a(amf.a a2) {
        if (a2 == null) {
            assert (false);
            return;
        }
        switch (a2) {
            case buz: {
                return;
            }
            case buA: {
                break;
            }
            case buC: {
                break;
            }
            case buD: {
                break;
            }
            case buF: {
                this.ScheduledForRemoval = true;
                break;
            }
            case buG: {
                break;
            }
            default: {
                assert (false) : "Unknown state type!";
                break;
            }
        }
        this.CurrentObjectState = a2;
    }

    private void ee(boolean bl2) {
        kpf kpf2 = (kpf)this.MessageDelegator.h(522);
        kpf2.tH(this.GUID);
        kpf2.ts(this.GUID);
        kpf2.sy(this.MessageDelegator.bzv());
        if (bl2) {
            kpf2.ZU(1);
        } else {
            kpf2.ZU(2);
        }
        this.MessageDelegator.a(kpf2);
    }

    private void c(btg btg2) {
        if (btg2 == null) {
            assert (false);
            return;
        }
        if (btg2.axz() == null) {
            return;
        }
        List<bst> list = btg2.axy();
        if (list == null) {
            assert (false);
            return;
        }
        if (lcw.ena() || lcw.enb()) {
            this.dJU.enable();
        }
        for (bst bst2 : list) {
            if (bst2 == null) continue;
            krw krw2 = (krw)this.MessageDelegator.j(16);
            krw2.wQ(bst2.axf());
            krw2.ts(this.GUID);
            krw2.xC(this.dJT);
            this.MessageDelegator.a(krw2);
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 13059: {
                this.b((glb)dxq2);
                break;
            }
            case 3842: {
                this.a((fpb)dxq2);
                break;
            }
            case 3844: {
                this.a((fpa)dxq2);
                break;
            }
            case 3845: {
                this.a((fow)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(fow fow2) {
        if (!lcw.emZ() || !lcw.qGQ) {
            assert (false) : "loadDyanmicObjectsFromMessage is only supported on AI nodes.";
            return;
        }
        btg btg2 = fy.ax.get(lcw.qGO);
        if (btg2 == null) {
            assert (false);
            return;
        }
        if (btg2.axz() == null) {
            return;
        }
        List<bst> list = btg2.axy();
        if (list == null) {
            assert (false);
            return;
        }
        for (bst bst2 : list) {
            if (bst2 == null || !lcw.emZ()) continue;
            this.l(bst2.axg());
        }
    }

    private void a(fpa fpa2) {
        Map map = (Map)((HashMap)this.dJF).clone();
        Set set = map.keySet();
        for (ldv ldv2 : set) {
            this.jA(ldv2);
        }
    }

    private void a(fpb fpb2) {
        assert (fpb2.axz() != null) : "ZoneName is null!";
        btg btg2 = fy.ax.get(fpb2.axz());
        if (btg2 == null) {
            String string = "Zone [" + fpb2.axz() + "] not found in ZoneMap. Missing config for zone [" + fpb2.axz() + "] in 'zones.xml' file probably!";
            assert (false) : string;
            return;
        }
        if (btg2.isLoaded()) {
            this.dJK = fpb2.aO();
            this.a(true, false);
            if (lcw.ena() || lcw.enb()) {
                this.dJU.enable();
            }
            return;
        }
        this.dJV = btg2;
        this.dJV.ef(true);
        this.c(this.dJV);
        this.dJK = fpb2.aO();
        this.a(true, false);
    }

    private void a(boolean bl2, boolean bl3) {
        int n = 1;
        if (this.oJ == null) {
            if (bl3) {
                return;
            }
            this.oJ = this.MessageDelegator.bzv();
        } else {
            if (!bl3) assert (false) : "Can't add when sensor isn't null!";
            n = 2;
        }
        koh koh2 = (koh)this.MessageDelegator.h(524);
        koh2.ZQ(n);
        koh2.ts(this.GUID);
        koh2.c(new ljq());
        koh2.setRadius(100.0f);
        koh2.sy(this.oJ);
        koh2.lQ(false);
        koh2.lm(bl2);
        koh2.mE(2.0f);
        this.MessageDelegator.a(koh2);
        if (n == 2) {
            this.oJ = null;
        }
    }

    private void d(btg btg2) {
        if (!btg2.isLoaded()) {
            assert (false);
            return;
        }
        List<bst> list = btg2.axy();
        for (bst bst2 : list) {
            kku kku2 = (kku)this.MessageDelegator.h(1036);
            kku2.YF(1);
            kku2.hC(ldv.rfe);
            kku2.wQ(bst2.axf());
            kku2.ts(this.GUID);
            this.MessageDelegator.a(kku2);
            ldv ldv2 = this.dJJ.get(bst2.axg());
            if (ldv2 == null) continue;
            this.jA(ldv2);
        }
        btg2.ef(false);
        btg2.eg(false);
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 521: {
                this.a((kwi)ktv2);
                break;
            }
            case 524: {
                this.a((kvv)ktv2);
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    private void a(kvv kvv2) {
        if (this.oJ == null) {
            return;
        }
        if (kvv2.bQF()) {
            if (kvv2.bQG() == 0 && kvv2.Wb() == 0) {
                return;
            }
            if (!this.dJM) {
                this.dJM = true;
                this.dJX = true;
                this.dJO = this.MessageDelegator.arc().rgz + 3.0;
                this.dJN = this.MessageDelegator.arc().lpr;
                this.dJP = kvv2.bQG();
                this.dJQ = kvv2.Wb();
                if (this.dJV != null) {
                    this.dJV.eg(true);
                    this.dJV = null;
                }
                this.axj();
                this.a(true, true);
                this.dJM = false;
                this.dJP = 0;
                this.dJR = 0;
                this.axk();
            } else {
                this.dJP = kvv2.bQG();
                this.dJQ = kvv2.Wb();
            }
        } else if (this.dJM && this.dJR != 500) {
            this.dJM = false;
            this.dJO = this.MessageDelegator.arc().rgz + 3.0;
        }
    }

    private void a(kwi kwi2) {
        ldv ldv2 = kwi2.axa();
        if (kwi2.isLoaded()) {
            this.jw(ldv2);
        } else {
            this.jA(ldv2);
        }
    }

    private void b(glb glb2) {
        ldv ldv2 = this.w(glb2);
        if (ldv2 == null) {
            assert (false);
            return;
        }
        List<ldv> list = this.dJF.get(ldv2);
        if (list == null) {
            list = lcn.emv();
            this.dJF.put(ldv2, list);
        }
        list.add(glb2.aUa);
    }

    private ldv w(dxq dxq2) {
        if (dxq2 instanceof dxu) {
            Integer n = new Integer(((dxu)((Object)dxq2)).aVk());
            ldv ldv2 = this.dJI.remove(n);
            if (ldv2 == null) {
                assert (false);
                return null;
            }
            return ldv2;
        }
        return null;
    }

    @Override
    public void receiveResourceResponse(ktf ktf2) {
        switch (ktf2.egN()) {
            case 8: {
                this.a((kta)ktf2);
                break;
            }
            case 6: {
                this.a((ksx)ktf2);
                break;
            }
            default: {
                super.receiveResourceResponse(ktf2);
            }
        }
    }

    private void a(ksx ksx2) {
        if (ksx2.getResult() != 0) {
            lfn.b(5, this.getClass().getName(), "handleResourceAudioAssembleResponse() : error assembling audio resource " + ksx2.oq());
        }
    }

    private void a(kta kta2) {
        if (kta2.getResult() != 0) assert (false);
    }

    public String gg(String string) {
        String string2;
        String string3 = string;
        int n = string3.lastIndexOf(46);
        if (n != -1) {
            string3 = string3.substring(0, n);
        }
        if ((string3 = string3.toLowerCase()).endsWith(string2 = "_empty")) {
            string3 = string3.substring(0, string3.indexOf(string2));
        }
        string3 = string3 + ".lvl";
        return string3;
    }

    private void jw(ldv ldv2) {
        btk btk2;
        Integer n = ldv2.enw();
        if (this.dJJ.containsKey(n)) {
            return;
        }
        this.jz(ldv2);
        this.l(n);
        this.f(n);
        this.g(n);
        this.h(n);
        this.j(n);
        this.k(n);
        this.e(n);
        this.jy(ldv2);
        this.jx(ldv2);
        this.i(n);
        this.dJJ.put(n, ldv2);
        ldv ldv3 = new ldv(this.getGUID().ib(), lcr.qDE.enw(), lcr.qDE.enx());
        amf amf2 = this.MessageDelegator.bzx().bzt().d(ldv3);
        if (amf2 != null && amf2 instanceof buv) {
            btk2 = (buv)amf2;
            ((buv)btk2).mZ(n);
        }
        if ((btk2 = (cfk)this.MessageDelegator.bzx().bzt().d(lcr.qEG)) != null) {
            ((cfk)btk2).mZ(n);
        }
    }

    private void e(Integer n) {
        if (!lcw.enb()) {
            return;
        }
    }

    private void f(Integer n) {
        if (!lcw.enb()) {
            return;
        }
        List<bsv> list = fy.TG.get(n);
        if (list == null || list.isEmpty()) {
            return;
        }
        int n2 = list.size();
        for (int i = 0; i < n2; ++i) {
            bsv bsv2 = list.get(i);
            this.a((bta)bsv2);
        }
    }

    private void g(Integer n) {
        if (!lcw.enb()) {
            return;
        }
        List<bsv> list = fy.TH.get(n);
        if (list == null || list.isEmpty()) {
            return;
        }
        for (bsv bsv2 : list) {
            assert (bsv2 instanceof bsw);
            bsw bsw2 = (bsw)bsv2;
            ldv ldv2 = lcr.Xv;
            ezd ezd2 = (ezd)this.MessageDelegator.h(22275, this.GUID, ldv2);
            ezd2.Filename = bsw2.pa();
            ezd2.Name = bsw2.axm();
            ezd2.Position = bsw2.av();
            ezd2.my = bsw2.getRotation();
            this.MessageDelegator.F(ezd2);
        }
    }

    private void h(Integer n) {
        if (!lcw.enb()) {
            return;
        }
        List<bsv> list = fy.TI.get(n);
        if (list == null || list.isEmpty()) {
            return;
        }
        for (bsv bsv2 : list) {
            assert (bsv2 instanceof bsy);
            bsy bsy2 = (bsy)bsv2;
            ldv ldv2 = lcr.Xv;
            ezf ezf2 = (ezf)this.MessageDelegator.h(22276, this.GUID, ldv2);
            ezf2.Filename = bsy2.pa();
            ezf2.Position = bsy2.av();
            ezf2.my = bsy2.getRotation();
            this.MessageDelegator.F(ezf2);
        }
    }

    private void i(Integer n) {
        if (!lcw.enb()) {
            return;
        }
        for (Integer n2 : fy.TN.keySet()) {
            List<bsx> list = fy.TN.get(n2).get(n);
            if (list == null) continue;
            int n3 = 0;
            while (n3 < list.size()) {
                eze eze2 = (eze)this.MessageDelegator.h(22282, this.GUID, lcr.Xv);
                eze2.Type = n2;
                eze2.iFT = n3++;
                eze2.dJE = n;
                this.MessageDelegator.F(eze2);
            }
        }
    }

    private void j(Integer n) {
        if (!lcw.enb()) {
            return;
        }
        List<bsv> list = fy.TJ.get(n);
        if (list == null || list.isEmpty()) {
            return;
        }
        for (bsv bsv2 : list) {
            assert (bsv2 instanceof btb);
            btb btb2 = (btb)bsv2;
            ldv ldv2 = lcr.Xv;
            ezh ezh2 = (ezh)this.MessageDelegator.h(22277, this.GUID, ldv2);
            ezh2.ResourceName = btb2.ResourceName;
            ezh2.Position = btb2.Position;
            ezh2.my = btb2.my;
            ezh2.dKx = btb2.dKx;
            ezh2.dKy = btb2.dKy;
            ezh2.dKz = btb2.dKz;
            ezh2.DisplayName = btb2.dKs;
            this.MessageDelegator.F(ezh2);
        }
    }

    private void k(Integer n) {
        if (!lcw.enb()) {
            return;
        }
        List<bsv> list = fy.TL.get(n);
        if (list == null || list.isEmpty()) {
            return;
        }
        for (bsv bsv2 : list) {
            assert (bsv2 instanceof btf);
            btf btf2 = (btf)bsv2;
            ldv ldv2 = lcr.Xv;
            ezi ezi2 = (ezi)this.MessageDelegator.h(22283, this.GUID, ldv2);
            ezi2.ResourceName = btf2.ResourceName;
            ezi2.Position = btf2.Position;
            ezi2.my = btf2.my;
            ezi2.DisplayName = btf2.dKs;
            this.MessageDelegator.F(ezi2);
        }
    }

    private void jx(ldv ldv2) {
        if (!(lcw.enb() || lcw.ena() || lcw.eng())) {
            return;
        }
        List<dfq> list = fy.TM.get(ldv2.enw());
        dez dez2 = new dez();
        if (list != null) {
            ArrayList<ldv> arrayList = lcn.emv();
            for (dfq dfq2 : list) {
                dfq dfq3 = (dfq)dez2.Af(28);
                dfq2.b(dfq3);
                dfq3.setGUID(this.MessageDelegator.bzv());
                this.MessageDelegator.a(dfq3);
                arrayList.add(dfq3.getGUID());
            }
            this.dJH.put(ldv2, arrayList);
        }
    }

    private void jy(ldv ldv2) {
        if (!(lcw.enb() || lcw.ena() || lcw.eng())) {
            return;
        }
        this.dKd.add(ldv2);
    }

    private void axk() {
        for (ldv ldv2 : this.dKd) {
            int n = ldv2.enw();
            List<bsv> list = fy.TK.get(n);
            if (list == null || list.isEmpty()) continue;
            List<ldv> list2 = this.dJG.get(ldv2);
            if (list2 == null) {
                list2 = lcn.emv();
                this.dJG.put(ldv2, list2);
            }
            for (bsv bsv2 : list) {
                btc btc2 = (btc)bsv2;
                ldv ldv3 = this.MessageDelegator.bzv();
                list2.add(ldv3);
                krt krt2 = new krt();
                krt2.ts(this.GUID);
                krt2.aaD(1);
                krt2.aaE(2);
                krt2.xC(true);
                krt2.hC(ldv3);
                krt2.xc(btc2.axt());
                krt2.xE(true);
                krt2.wL(true);
                krt2.setMaxDistance(btc2.getMaxRadius());
                krt2.setMinDistance(btc2.axu());
                krt2.c(btc2.av());
                krt2.setInsideConeAngle(btc2.axp());
                krt2.setOutsideConeAngle(btc2.axr());
                krt2.setConeOrientation(btc2.axq());
                krt2.setConeOutsideVolume(btc2.getConeOutsideVolume());
                krt2.bi(new ljq(0.0f, 0.0f, 0.0f));
                krt2.setMode(0);
                krt2.mU(btc2.axv());
                krt2.hN(true);
                krt2.dh(btc2.axw());
                this.MessageDelegator.a(krt2);
            }
        }
        this.dKd.clear();
    }

    private void jz(ldv ldv2) {
        if (!(lcw.enb() || lcw.ena() || lcw.eng())) {
            return;
        }
        int n = ldv2.enw();
        List<bsv> list = fy.TE.get(n);
        if (list == null || list.isEmpty()) {
            return;
        }
        int n2 = list.size();
        for (int i = 0; i < n2; ++i) {
            bsv bsv2 = list.get(i);
            this.a(ldv2, (bte)bsv2);
        }
    }

    private void l(Integer n) {
        if (lcw.enb() && !lcw.qGQ) {
            return;
        }
        if (!(lcw.enb() && lcw.qGV || lcw.emZ() && lcw.qGQ)) {
            return;
        }
        List<bsv> list = fy.TF.get(n);
        if (list == null || list.isEmpty()) {
            return;
        }
        int n2 = list.size();
        for (int i = 0; i < n2; ++i) {
            bsv bsv2 = list.get(i);
            this.a((btd)bsv2);
        }
    }

    private void jA(ldv ldv2) {
        btk btk2;
        Object object;
        List<ldv> list;
        Object object2;
        Integer n = new Integer(ldv2.enw());
        if (!this.dJJ.containsKey(n)) {
            return;
        }
        this.dJJ.remove(n);
        List<ldv> list2 = this.dJG.remove(ldv2);
        if (list2 != null) {
            object2 = list2.iterator();
            while (object2.hasNext()) {
                list = (ldv)object2.next();
                object = (kig)this.MessageDelegator.h(1287);
                ((kii)object).tB((ldv)((Object)list));
                ((kig)object).XO(1);
                ((khd)object).ts(this.GUID);
                ((khd)object).wD(false);
                this.MessageDelegator.a((khd)object);
                this.MessageDelegator.oa((ldv)((Object)list));
            }
        }
        if ((object2 = this.dJH.remove(ldv2)) != null) {
            list = object2.iterator();
            while (list.hasNext()) {
                object = (ldv)list.next();
                this.MessageDelegator.hd((ldv)object);
            }
        }
        if ((list = this.dJF.remove(ldv2)) != null) {
            int n2 = list.size();
            for (int i = 0; i < n2; ++i) {
                this.jB(list.get(i));
            }
            list.clear();
        }
        ldv ldv3 = new ldv(this.getGUID().ib(), lcr.qDE.enw(), lcr.qDE.enx());
        amf amf2 = this.MessageDelegator.bzx().bzt().d(ldv3);
        if (amf2 != null && amf2 instanceof buv) {
            btk2 = (buv)amf2;
            ((buv)btk2).na(n);
        }
        if ((btk2 = (cfk)this.MessageDelegator.bzx().bzt().d(lcr.qEG)) != null) {
            ((cfk)btk2).pL(n);
        }
    }

    private void jB(ldv ldv2) {
        if (!lcw.ena() && !lcw.enb()) {
            return;
        }
        glj glj2 = (glj)this.MessageDelegator.h(13058, this.GUID, lcr.qEa);
        glj2.aUa = ldv2;
        glj2.jkV = 1;
        this.MessageDelegator.F(glj2);
    }

    private void a(ldv ldv2, bte bte2) {
        int n = bte2.CD();
        ljq ljq2 = bte2.getSourcePosition();
        ljq ljq3 = bte2.getTargetPosition();
        if (n <= 0) {
            assert (false);
            return;
        }
        ldv ldv3 = null;
        ldv3 = lcr.qEa != null ? lcr.qEa : lcr.qEb;
        glh glh2 = (glh)this.MessageDelegator.h(13057, this.GUID, ldv3);
        glh2.setDuration(-2.0f);
        glh2.setTargetPosition(ljq3);
        int n2 = 8;
        if (ljq2 != null) {
            glh2.setSourcePosition(ljq2);
            n2 |= 2;
        }
        glh2.JQ(n2);
        glh2.setSpecialEffectType(n);
        glh2.mk(true);
        this.e(ldv2, glh2);
        this.MessageDelegator.F(glh2);
    }

    private void a(bta bta2) {
        gzb gzb2 = (gzb)this.MessageDelegator.h(20225, this.GUID, lcr.qBw);
        gzb2.ln(bta2.axo());
        gzb2.c(bta2.av());
        gzb2.a(new lgl(bta2.getRotation()));
        gzb2.ms(true);
        this.MessageDelegator.F(gzb2);
    }

    private void a(btd btd2) {
        ldv ldv2 = ldx.enG().aci(lcr.qzZ.enw()).bzv();
        if (lcw.enb()) {
            ldv2 = ldx.enG().fS(7000, lcr.qzZ.enw()).bzv();
            assert (ldv2.ib() == 7000);
            ldx.enG().fS(7000, ldv2.enw()).lK(ldv2);
        } else {
            ldx.enG().aci(ldv2.enw()).lK(ldv2);
        }
        String string = "xml-files/object/spawnpoint/";
        fob fob2 = (fob)this.MessageDelegator.h(11521, this.GUID, lcr.qzt);
        fob2.cd(string + btd2.axo());
        fob2.c(btd2.av());
        fob2.pL(ldv2);
        fob2.lh(false);
        fob2.li(false);
        fob2.setServerObject(false);
        this.MessageDelegator.F(fob2);
    }

    private void e(ldv ldv2, dxq dxq2) {
        if (dxq2 instanceof dxu) {
            ((dxu)((Object)dxq2)).sk(this.Qs);
            this.dJI.put(new Integer(this.Qs), ldv2);
            ++this.Qs;
            if (this.Qs == Integer.MAX_VALUE) {
                this.Qs = 0;
            }
        }
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
    }

    public void df(float f2) {
        for (List<ldv> list : this.dJG.values()) {
            for (ldv ldv2 : list) {
                kic kic2 = (kic)this.MessageDelegator.h(1283);
                kic2.ts(this.GUID);
                kic2.tB(ldv2);
                kic2.dh(f2);
                kic2.XH(512);
                this.MessageDelegator.a(kic2);
            }
        }
    }
}

