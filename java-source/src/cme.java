/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lcr
 *  lcw
 */
import java.util.Map;

public class cme
extends cmb
implements bto {
    private static final String TC = "SFProwessMonolithServer";
    private static final double auT = 1.0;
    private static final boolean eqx = true;
    private static final boolean eKq = true;
    private static final boolean eKr = false;
    private static final int HOUR = 21;
    private static final int MINUTE = 0;
    private static final int eyj = 0;
    private bsx bBe = null;
    private float Radius = 0.0f;
    private ljq Position = null;
    private String bb = "Outside of the world";
    private int eKs = -1;
    private int eKt = -1;
    private int eKu = -1;
    private int eKv = -1;
    private int cwj = -1;
    private int cwk = -1;
    private int eKw = -1;
    private int ayO = -1;
    private int dnE = -1;
    private int eKx = -1;
    private int eKy = 1;
    private boolean eKz = true;
    private ldv bBE;
    private ldv Ud;
    private ldv eKA = null;
    private ldv eKB = null;
    private boolean eKC = false;
    private boolean avz = false;
    private double eKD = -1.0;
    private double eKE = -1.0;
    private double eKF = -1.0;
    private double abo = 0.0;
    private ldv eKG;
    private ldv ejT;
    private final Map<ldv, ldv> eKH = lcn.emw();
    private final Map<ldv, lfs<ldv, Integer>> eKI = lcn.emw();
    private int eKJ = -1;
    private int eKK = -1;
    private int eKL = -1;
    private boolean eKp = false;
    private int eKn = 0;

    public cme() {
        super(true);
    }

    public void b(bsx bsx2) {
        this.aIw();
        this.bBe = bsx2;
        this.Radius = ((Float)this.bBe.getValue("Radius")).floatValue();
        this.Position = (ljq)this.bBe.getValue("Position");
        this.bb = lcw.ea((ljq)this.Position);
        this.eKs = ((Float)this.bBe.getValue("RewardTimer")).intValue() * 1;
        this.eKt = ((Float)this.bBe.getValue("BlastTimer")).intValue() * 1;
        this.eKu = del.dr(this.bBe.getValue("RewardSpecialEffect").toString());
        this.eKv = del.dr(this.bBe.getValue("BlastSpecialEffect").toString());
        this.cwj = del.dr(this.bBe.getValue("ActiveSpecialEffect").toString());
        this.cwk = del.dr(this.bBe.getValue("InactiveSpecialEffect").toString());
        this.eKx = ((Float)this.bBe.getValue("OpenTimer")).intValue() * 60;
        this.eKw = ((Float)this.bBe.getValue("ProwessPoints")).intValue();
        this.ayO = Integer.parseInt(this.bBe.getValue("Limit").toString());
        Object object = this.bBe.getValue("MonsterName");
        this.eKJ = object != null ? lea.enW().getType(object.toString()) : -1;
        this.eKK = this.bBe.getValue("MonsterNumber") != null ? (int)Float.parseFloat(this.bBe.getValue("MonsterNumber").toString()) : 0;
        this.eKL = this.bBe.getValue("PreparationTimer") != null ? ((Float)this.bBe.getValue("PreparationTimer")).intValue() * 60 : 0;
        this.eKC = true;
        this.aTc();
        this.gq(true);
        this.aSY();
    }

    private void aSY() {
        if (this.jm() == null) {
            assert (false);
            return;
        }
        this.jm().i(12752, this.eKn);
        this.jm().i(12768, this.eKK);
        this.jm().b(9664, lea.enW().getName(this.eKJ));
    }

    private void aSZ() {
        this.avz = true;
        this.eKp = false;
        double d2 = this.MessageDelegator.arc().rgz;
        this.eKD = d2 + (double)this.eKx;
        this.eKE = this.MessageDelegator.arc().rgz + (double)this.eKs;
        this.eKF = this.MessageDelegator.arc().rgz + (double)this.eKt;
        this.gp(false);
        this.uZ();
        this.uY();
        this.aTb();
    }

    private void aTa() {
        this.avz = false;
        assert (!this.eKp);
        this.eKn = 0;
        this.jm().i(12752, this.eKn);
        for (Map.Entry<ldv, ldv> entry : this.eKH.entrySet()) {
            ldv ldv2 = entry.getValue();
            gcg gcg2 = (gcg)this.MessageDelegator.h(32771, this.getGUID(), ldv2);
            this.MessageDelegator.F(gcg2);
        }
        this.eKH.clear();
        this.eKI.clear();
        this.acg();
        this.gp(false);
        this.uZ();
        this.uY();
        this.eKE = -1.0;
        this.eKF = -1.0;
    }

    private void uY() {
        if (this.avz) {
            if (this.cwj == -1) {
                return;
            }
            if (this.eKG != null) {
                assert (false);
                return;
            }
            this.eKG = this.MessageDelegator.lL(lcr.qEb);
        } else {
            if (this.cwk == -1) {
                return;
            }
            if (this.ejT != null) {
                assert (false);
                return;
            }
            this.ejT = this.MessageDelegator.lL(lcr.qEb);
        }
        glh glh2 = (glh)this.MessageDelegator.h(13057, this.getGUID(), lcr.qEb);
        glh2.SpecialEffectType = this.avz ? this.cwj : this.cwk;
        glh2.aUa = this.avz ? this.eKG : this.ejT;
        glh2.akX = this.KY();
        glh2.aZD = this.Position;
        this.MessageDelegator.F(glh2);
    }

    private void uZ() {
        if (this.avz ? this.ejT == null : this.eKG == null) {
            return;
        }
        glj glj2 = (glj)this.MessageDelegator.h(13058, this.getGUID(), lcr.qEb);
        glj2.aUa = this.avz ? this.ejT : this.eKG;
        glj2.jkV = 1;
        this.MessageDelegator.F(glj2);
        if (this.avz) {
            this.ejT = null;
        } else {
            this.eKG = null;
        }
    }

    private void a(kwr kwr2) {
        if (kwr2.getResult() != 0) {
            lfn.b(5, TC, "handleSensorResponse() A Static Position Sphere Sensor could not be created: " + kwr2.getResult());
            this.aTa();
            assert (false);
            return;
        }
        if (this.bBE != null && this.bBE.equals(kwr2.ev)) {
            this.bBE = null;
            this.Ud = kwr2.dJs;
            return;
        }
    }

    private void a(kws kws2) {
        if (!this.avz) {
            return;
        }
        ljq[] ljqArray = kws2.qfS;
        ldv[] ldvArray = kws2.qfR;
        ldv[] ldvArray2 = kws2.qfQ;
        ldv[] ldvArray3 = kws2.qfT;
        int[] nArray = kws2.qfc;
        if (ldvArray3 != null && ldvArray3.length > 0) {
            for (ldv cloneable2 : ldvArray3) {
                if (lcw.enb() && cloneable2.ib() != 3) continue;
                this.b(cloneable2);
            }
        }
        if (ldvArray == null || ldvArray.length == 0 || ldvArray2 == null || ldvArray2.length != ldvArray.length) {
            return;
        }
        Map map = lcn.emw();
        for (int i = 0; i < ldvArray.length; ++i) {
            boolean bl;
            boolean bl2;
            int n = nArray[i];
            if (n <= 0) continue;
            ldv ldv2 = ldvArray[i];
            if (lcw.enb() && ldv2.ib() != 3) continue;
            boolean bl3 = bl2 = lea.enW().isDescendant(n, cug.fgJ) || lea.enW().isDescendant(n, cug.fgB);
            if (bl2) {
                ldv ldv3 = lcr.tQ((ldv)ldv2);
                map.put(ldv2, ldv3);
                continue;
            }
            boolean bl4 = bl = lea.enW().isDescendant(n, cug.fgH) || lea.enW().isDescendant(n, cug.fkV);
            if (!bl || this.eKI.containsKey(ldv2)) continue;
            this.eKI.put(ldv2, new lfs<Object, Integer>(null, n));
            fut fut2 = (fut)this.MessageDelegator.h(5635, this.GUID, ldv2);
            fut2.iXt = 1;
            this.MessageDelegator.F(fut2);
        }
        for (ldv ldv3 : map.values()) {
            gck gck2 = (gck)this.MessageDelegator.h(32769, this.getGUID(), ldv3);
            gck2.cH(this.eKF);
            gck2.c(this.Position);
            gck2.II(this.ayO);
            gck2.IJ(this.eKw);
            gck2.setRadius(this.Radius);
            gck2.IH(this.eKH.size() + map.size());
            gck2.cG(this.eKE);
            this.MessageDelegator.F(gck2);
        }
        if (!map.isEmpty()) {
            for (ldv ldv4 : this.eKH.values()) {
                gco gco2 = (gco)this.MessageDelegator.h(32775, this.getGUID(), ldv4);
                gco2.IH(this.eKH.size() + map.size());
                this.MessageDelegator.F(gco2);
            }
            this.eKH.putAll(map);
            map.clear();
        }
    }

    private void b(ldv ldv2) {
        ldv ldv3 = this.eKH.remove(ldv2);
        if (ldv3 != null) {
            gcm gcm2 = (gcm)this.MessageDelegator.h(32770, this.getGUID(), ldv3);
            this.MessageDelegator.F(gcm2);
            for (ldv ldv4 : this.eKH.values()) {
                gco gco2 = (gco)this.MessageDelegator.h(32775, this.getGUID(), ldv4);
                gco2.IH(this.eKH.size());
                this.MessageDelegator.F(gco2);
            }
            return;
        }
        lfs<ldv, Integer> lfs2 = this.eKI.remove(ldv2);
    }

    private void b(fuu fuu2) {
        lfs<ldv, Integer> lfs2 = this.eKI.get(fuu2.aO());
        if (lfs2 == null) {
            lfn.b(5, TC, "handleObjectInfoGUIDResponseMessage() There is no associated entry with mesh object guid : " + fuu2.aO());
            return;
        }
        if (fuu2.dtj == null) {
            lfn.b(5, TC, "handleObjectInfoGUIDResponseMessage() PhysicalObjectGUID is null for object with mesh object guid : " + fuu2.aO());
            return;
        }
        lfs2.reX = fuu2.dtj;
    }

    private void aTb() {
        if (this.Ud != null) {
            lfn.b(5, TC, "addSphereSensor() There is already another area sensor active : " + this.Ud);
            assert (false);
            return;
        }
        kou kou2 = (kou)this.MessageDelegator.h(534);
        kou2.pTa = true;
        kou2.pUN = true;
        kou2.pUO = false;
        kou2.ec = this.GUID;
        kou2.iBr = true;
        kou2.dsK = true;
        kou2.Ud = ldv.rfe;
        kou2.pUL = 0;
        kou2.pUM = this.Radius;
        kou2.pUP = 4800;
        kou2.pTs = this.Position;
        this.bBE = kou2.GUID;
        this.MessageDelegator.a(kou2);
    }

    private void acg() {
        if (this.Ud == null) {
            lfn.b(5, TC, "addSphereSensor() There is no sensor to remove");
            assert (false);
            return;
        }
        kov kov2 = (kov)this.MessageDelegator.h(535);
        kov2.wD(false);
        kov2.ts(this.GUID);
        kov2.sy(this.Ud);
        this.MessageDelegator.a(kov2);
        this.Ud = null;
    }

    @Override
    public void doTick(ldz ldz2) {
        boolean bl;
        if (!this.eKC) {
            return;
        }
        this.abo -= ldz2.qwh;
        if (this.abo > 0.0) {
            return;
        }
        this.abo = 1.0;
        double d2 = ldz2.rgz;
        if (this.eKn < this.eKK) {
            return;
        }
        double d3 = ldz2.rgz;
        if (d3 > this.eKD) {
            if (this.eKp) {
                this.aSZ();
            } else if (this.avz) {
                this.aTa();
            } else {
                this.eKp = true;
                this.eKD = d3 + (double)this.eKL;
                this.gp(false);
            }
            return;
        }
        if (!this.avz) {
            return;
        }
        boolean bl2 = d2 >= this.eKE;
        boolean bl3 = bl = d2 >= this.eKF;
        if (bl) {
            this.pz(this.eKv);
        }
        if (bl2) {
            this.pz(this.eKu);
        }
        if (bl2) {
            this.eKE = d2 + (double)this.eKs;
        }
        if (bl) {
            this.eKF = d2 + (double)this.eKt;
        }
        for (Map.Entry<ldv, ldv> object : this.eKH.entrySet()) {
            ldv ldv2 = object.getKey();
            ldv ldv3 = object.getValue();
            if (bl2) {
                this.la(ldv3);
            }
            if (!bl) continue;
            this.lb(ldv2);
        }
        if (!this.eKI.isEmpty()) {
            for (Map.Entry<ldv, lfs<ldv, Integer>> entry : this.eKI.entrySet()) {
                ldv ldv4 = entry.getKey();
                lfs<ldv, Integer> lfs2 = entry.getValue();
                if (lfs2.reX == null) continue;
                int n = (Integer)lfs2.reY;
                this.T((ldv)lfs2.reX, n);
            }
        }
    }

    private void la(ldv ldv2) {
        gcl gcl2 = (gcl)this.MessageDelegator.h(32772, this.getGUID(), ldv2);
        this.MessageDelegator.F(gcl2);
        gcp gcp2 = (gcp)this.MessageDelegator.h(32773, this.getGUID(), ldv2);
        gcp2.cG(this.eKE);
        this.MessageDelegator.F(gcp2);
    }

    private void lb(ldv ldv2) {
        ldv ldv3 = lcr.tQ((ldv)ldv2);
        gcn gcn2 = (gcn)this.MessageDelegator.h(32774, this.getGUID(), ldv3);
        gcn2.cH(this.eKF);
        this.MessageDelegator.F(gcn2);
    }

    private void T(ldv ldv2, int n) {
        this.b(ldv2, -1.0f, 3);
    }

    private void b(ldv ldv2, float f, int n) {
        eam eam2 = (eam)this.MessageDelegator.h(10755, this.GUID, ldv2);
        eam2.ikF = n;
        eam2.bnM = 352;
        eam2.ikG = f;
        this.MessageDelegator.F(eam2);
    }

    private void pz(int n) {
        glh glh2 = (glh)this.MessageDelegator.h(13057, this.getGUID(), lcr.qEb);
        glh2.SpecialEffectType = n;
        glh2.aZG = null;
        glh2.akX = this.KY();
        glh2.aZD = this.Position;
        this.MessageDelegator.F(glh2);
    }

    private void aTc() {
        cmd cmd2 = new cmd();
        cmd2.setGUID(this.getGUID());
        cmd2.c(this.Position);
        cmd2.fm(cmf.getTier(this.ayO));
        cmd2.rH(this.eKn);
        cmd2.rI(this.eKK);
        cmd2.go(this.eKp);
        cmd2.rJ(this.eKJ);
        cmd2.setDuration(this.eKD);
        if (this.avz) {
            cmd2.aJ(this.eKD - (double)this.eKx);
            cmd2.setDuration(this.MessageDelegator.arc().rgz + (double)this.eKx);
        } else if (this.eKp) {
            cmd2.aJ(this.eKD - (double)this.eKL);
            cmd2.setDuration(this.MessageDelegator.arc().rgz + (double)this.eKL);
        }
        cmd2.setActive(this.avz);
        guz guz2 = (guz)this.MessageDelegator.h(32273, this.getGUID(), lcr.qEx);
        guz2.b(cmd2);
        this.MessageDelegator.F(guz2);
    }

    private void gp(boolean bl) {
        gva gva2 = (gva)this.MessageDelegator.h(32274, this.getGUID(), lcr.qEx);
        gva2.qE(this.getGUID());
        gva2.rH(this.eKn);
        gva2.go(this.eKp);
        if (!bl) {
            if (this.avz) {
                gva2.aJ(this.eKD - (double)this.eKx);
                gva2.setDuration(this.MessageDelegator.arc().rgz + (double)this.eKx);
            } else if (this.eKp) {
                gva2.aJ(this.eKD - (double)this.eKL);
                gva2.setDuration(this.MessageDelegator.arc().rgz + (double)this.eKL);
            }
        }
        gva2.setActive(this.avz);
        this.MessageDelegator.F(gva2);
    }

    public void receiveResponse(ktv ktv2) {
        if (ktv2.getResult() != 0) {
            return;
        }
        switch (ktv2.egT()) {
            case 532: {
                this.a((kws)ktv2);
                break;
            }
            case 512: {
                this.a((kwr)ktv2);
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 5636: {
                this.b((fuu)dxq2);
                break;
            }
            case 12548: {
                this.a((fbf)dxq2);
            }
        }
    }

    private void gq(boolean bl) {
        if (bl) {
            fbb fbb2 = (fbb)this.MessageDelegator.h(12545, this.GUID, lcr.qEl);
            fbb2.iHR = this.GUID;
            fbb2.dhI = new int[]{5};
            fbb2.bqd = new int[]{this.eKJ};
            this.MessageDelegator.F(fbb2);
            return;
        }
        fbg fbg2 = (fbg)this.MessageDelegator.h(12547, this.GUID, lcr.qEl);
        this.MessageDelegator.F(fbg2);
    }

    private void a(fbf fbf2) {
        int n = fbf2.iIb.dhr;
        int n2 = fbf2.iIb.Type;
        if (!lea.enW().isDescendant(n, this.eKJ)) {
            return;
        }
        if (n2 != 5) {
            return;
        }
        if (this.avz || this.eKp) {
            assert (this.eKn >= this.eKK);
            return;
        }
        ++this.eKn;
        this.jm().i(12752, this.eKn);
        this.gp(true);
    }

    public final pc aTd() {
        pc pc2 = new pc();
        pc2.ayN = this.eKn;
        pc2.bb = this.bb;
        pc2.aGy = fy.a.TU.name();
        return pc2;
    }

    public final void a(pc pc2) {
        if (pc2 == null) {
            return;
        }
        assert (pc2.bb != null);
        if (!pc2.bb.equals(this.bb)) {
            return;
        }
        this.eKn = pc2.ayN;
        this.gp(true);
        if (this.jm() != null) {
            this.jm().i(12752, this.eKn);
        }
    }
}

