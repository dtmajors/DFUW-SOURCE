/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 *  cwx
 *  ha
 *  lcr
 *  lcw
 */
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class bxa
extends btk
implements bto,
bvr.a,
cyt.a {
    public static final double dXQ = 1.0;
    public static final float dXR = 10.0f;
    private double dXS = 0.0;
    private int dXT = 0;
    private int dXU = 0;
    private LinkedList<bwv> dXV = lcn.emA();
    private LinkedList<bxb> dXW = lcn.emA();
    private kji dXX = null;
    private kji dXY = null;
    private int dXu = -1;
    private int dXt = -1;
    private List<dxq> baY = null;
    public final ha dXZ;
    private final Map<ldv, a> dYa = lcn.emw();

    public bxa(ha ha2) {
        this.dXZ = ha2;
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.dXS + 1.0 > ldz2.rgz) {
            return;
        }
        this.dXS += 1.0;
        if (this.dXS + 1.0 < ldz2.rgz) {
            this.dXS = ldz2.rgz;
        }
        this.aCX();
    }

    @Override
    public void initialize() {
        super.initialize();
        this.aCV();
        this.dXS = this.MessageDelegator.arc().rgz - 1.0;
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
    }

    @Override
    public void receiveMiddlewareMessage(kcz kcz2) {
        switch (kcz2.getMessageType()) {
            case 270: {
                this.b((kcs)kcz2);
                break;
            }
            default: {
                super.receiveMiddlewareMessage(kcz2);
            }
        }
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 4866: {
                this.handleLineContainmentResponse((kuj)ktv2);
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        if (!this.Initialized) {
            if (this.baY == null) {
                this.baY = lcn.emA();
            }
            this.baY.add(dxq2);
            return;
        }
        switch (dxq2.bEz()) {
            case 26625: {
                this.a((frm)dxq2);
                break;
            }
            case 26627: {
                this.a((fro)dxq2);
                break;
            }
            case 26629: {
                this.a((fru)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private final void aCV() {
        if (!this.Initialized) {
            assert (false);
            return;
        }
        if (this.baY != null) {
            for (dxq dxq2 : this.baY) {
                this.receiveMessage(dxq2);
            }
            this.baY = null;
        }
    }

    private final void a(frm frm2) {
        frn frn2 = (frn)this.MessageDelegator.h(26626, this.getGUID(), frm2.dYb);
        frn2.iUT = frm2.dXf;
        frn2.aqs = frm2.aqs;
        frn2.YL = frm2.YL;
        if (this.dYa.containsKey(frm2.dYb)) {
            frn2.iOz = 1;
            this.MessageDelegator.E(frn2);
            return;
        }
        int n = this.N(frm2.dYb, frm2.dXf);
        if (n == 0) {
            frn2.iOz = 3;
            this.MessageDelegator.E(frn2);
            return;
        }
        a a2 = new a(this, frm2.dYb, frm2.aO());
        a2.dYc = n;
        this.dYa.put(a2.dYb, a2);
        frn2.hE = this.dXZ.getUserName();
        frn2.iUU = n;
        frn2.YL = this.dXZ.iU();
        frn2.cCG = this.dXZ.jt();
        frn2.cCF = this.dXZ.js();
        frn2.dXG = this.dXZ.jf() != null ? this.dXZ.jf().az() : this.dXZ.jp();
        this.aCW();
        this.MessageDelegator.E(frn2);
        if (this.dYa.size() == 1) {
            this.dXU = 0;
        }
    }

    private final void a(fro fro2) {
        frp frp2 = (frp)this.MessageDelegator.h(26628, this.getGUID(), fro2.aO());
        frp2.aqs = fro2.aqs;
        a a2 = this.dYa.remove(fro2.aO());
        if (a2 == null) {
            frp2.iOz = 2;
        } else {
            this.aCW();
        }
        this.MessageDelegator.E(frp2);
    }

    private final void b(kcs kcs2) {
        a a2 = this.dYa.remove(kcs2.hsQ);
        if (a2 == null) {
            return;
        }
        this.aCW();
    }

    private final void a(fru fru2) {
        frv frv2 = (frv)this.MessageDelegator.h(26630, this.getGUID(), fru2.aO());
        frv2.iUT = fru2.dXf;
        a a2 = this.dYa.get(fru2.aO());
        if (a2 == null) {
            frv2.iOz = 2;
            this.MessageDelegator.E(frv2);
            return;
        }
        int n = this.N(a2.Wx, fru2.dXf);
        if (n == 0) {
            frv2.iOz = 3;
            this.MessageDelegator.E(frv2);
            return;
        }
        frv2.dYc = n;
        a2.dYc = n;
        this.MessageDelegator.E(frv2);
        this.aCW();
    }

    private final int N(ldv ldv2, int n) {
        return n & 0x1F;
    }

    private final void aCW() {
        int n;
        int n2 = 0;
        for (a a2 : this.dYa.values()) {
            n2 |= a2.dYc;
        }
        if (n2 == this.dXT) {
            return;
        }
        for (int i = 0; i < 32 && ((n = 1 << i) & 0x1F) != 0; ++i) {
            boolean bl;
            boolean bl2 = (this.dXT & n) != 0;
            boolean bl3 = bl = (n2 & n) != 0;
            if (bl2 == bl) continue;
            this.dXT = bl ? (this.dXT |= n) : (this.dXT &= ~n);
            this.r(n, bl);
        }
        assert (n2 == this.dXT);
    }

    private final void r(int n, boolean bl) {
        switch (n) {
            case 4: {
                cex cex2 = this.dXZ.jf();
                if (cex2 != null && cex2.aAG() != null && cex2.aAG() instanceof bvr) {
                    ((bvr)cex2.aAG()).a(bl ? this : null);
                }
                this.dXV.clear();
                break;
            }
            case 8: {
                cex cex3 = this.dXZ.jf();
                if (cex3 != null && cex3.aJz() != null) {
                    cex3.aJz().a((cyt.a)this);
                }
                this.dXW.clear();
                break;
            }
        }
    }

    private final float a(el el2, int n) {
        ej ej2 = el2.ae(n);
        if (ej2 instanceof et) {
            return ((et)ej2).fN();
        }
        return 0.0f;
    }

    /*
     * WARNING - void declaration
     */
    private final void aCX() {
        void var5_18;
        void var5_13;
        Object object;
        Object object3;
        ++this.dXU;
        if (this.dYa.isEmpty()) {
            return;
        }
        cex cex2 = this.dXZ.jf();
        frz frz2 = (frz)this.MessageDelegator.h(26631, this.getGUID(), this.getGUID());
        frz2.dXe = this.MessageDelegator.arc().rgz;
        if ((this.dXT & 1) != 0 && cex2 != null && cex2.aAG() != null && cex2.aAG().azb() != null) {
            frz2.iVl |= 1;
            frz2.Position = cex2.aAG().av();
        }
        if ((this.dXT & 2) != 0 && cex2 != null && cex2.aJD() != null && cex2.aJD().aEP() != null && cex2.aJz() != null && cex2.jm() != null) {
            object3 = cex2.aJD().aEP();
            frz2.iVl |= 2;
            frz2.dXi = ((byv)object3).vK();
            frz2.dXj = ((byv)object3).vL();
            frz2.bno = ((byv)object3).vM();
            frz2.dXk = ((byv)object3).vN();
            frz2.dRh = ((byv)object3).vO();
            frz2.dXl = ((byv)object3).vP();
            frz2.dXm = ((byv)object3).vQ();
            frz2.dXn = cex2.aJx();
            frz2.ccX = this.dXZ.kE().ordinal();
            frz2.add = this.dXZ.iV();
            frz2.aGr = this.a((el)cex2.jm(), 352);
            frz2.bWk = this.a((el)cex2.jm(), 354);
            frz2.bWF = this.a((el)cex2.jm(), 400);
            frz2.bWG = this.a((el)cex2.jm(), 402);
            frz2.bWs = this.a((el)cex2.jm(), 384);
            frz2.bWt = this.a((el)cex2.jm(), 386);
            boolean bl = frz2.dXp = this.dXZ.kc() > 1.0;
            if (frz2.dXp) {
                frz2.dXq = this.MessageDelegator.arc().rgz - this.dXZ.kc();
            }
        }
        if ((this.dXT & 4) != 0 && cex2 != null && cex2.aAG() != null && cex2.aAG() instanceof bvr) {
            frz2.iVl |= 4;
            ((bvr)cex2.aAG()).a(this);
            frz2.iVm = this.dXV.toArray(new bwv[this.dXV.size()]);
            this.dXV.clear();
        }
        if ((this.dXT & 8) != 0 && cex2 != null && cex2.aJz() != null) {
            frz2.iVl |= 8;
            cex2.aJz().a((cyt.a)this);
            frz2.iVn = this.dXW.toArray(new bxb[this.dXW.size()]);
            this.dXW.clear();
        }
        if ((this.dXT & 0x10) != 0) {
            if (cex2 != null && cex2.aAG() != null) {
                this.aCY();
            } else {
                this.dXu = -1;
                this.dXt = -1;
            }
            if (this.dXu >= 0) {
                frz2.iVl |= 0x10;
                frz2.dXu = this.dXu;
                frz2.dXt = this.dXt;
            }
        }
        object3 = lcn.emH();
        for (ldv object22 : this.dYa.keySet()) {
            frz frz3 = frz2.bRB();
            frz3.on(object22);
            this.MessageDelegator.E(frz3);
            object3.add(this.dYa.get((Object)object22).Wx.enw());
        }
        if (lcw.enb()) {
            return;
        }
        TreeMap treeMap = lcn.emG();
        treeMap.put("TS", "NOW()");
        treeMap.put("Sequence", "" + this.dXU);
        treeMap.put("GameID", "" + lcw.qGe);
        treeMap.put("WorldID", "" + lcw.qGf);
        treeMap.put("CharacterID", "" + this.dXZ.getGUID().enw());
        treeMap.put("GameTime", "" + frz2.dXe);
        treeMap.put("Elements", "" + frz2.iVl);
        treeMap.put("PositionX", frz2.Position == null ? "null" : "" + frz2.Position.x);
        treeMap.put("PositionY", frz2.Position == null ? "null" : "" + frz2.Position.y);
        treeMap.put("PositionZ", frz2.Position == null ? "null" : "" + frz2.Position.rlV);
        treeMap.put("FlyingMode", "" + frz2.dXi);
        treeMap.put("LeaningMode", "" + frz2.dXj);
        treeMap.put("LifeMode", "" + frz2.bno);
        treeMap.put("MovementMode", "" + frz2.dXk);
        treeMap.put("PostureMode", "" + frz2.dRh);
        treeMap.put("WaterContactMode", "" + frz2.dXl);
        treeMap.put("WeaponMode", "" + frz2.dXm);
        treeMap.put("Encumbered", frz2.dXn ? "1" : "0");
        treeMap.put("RunSpeedFactor", "" + frz2.dXo);
        treeMap.put("ClanAccessLevel", "" + frz2.ccX);
        treeMap.put("Health", "" + frz2.aGr);
        treeMap.put("HealthMax", "" + frz2.bWk);
        treeMap.put("Stamina", "" + frz2.bWF);
        treeMap.put("StaminaMax", "" + frz2.bWG);
        treeMap.put("Mana", "" + frz2.bWs);
        treeMap.put("ManaMax", "" + frz2.bWt);
        treeMap.put("LoggedIn", frz2.dXp ? "1" : "0");
        treeMap.put("OnlineTime", "" + frz2.dXq);
        treeMap.put("ResourceTypeAbove", "" + frz2.dXu);
        treeMap.put("ResourceTypeBelow", "" + frz2.dXt);
        if (frz2.add == null) {
            treeMap.put("ClanName", "null");
        } else {
            treeMap.put("ClanName", "\"" + dvf.aT(frz2.add) + "\"");
        }
        if (frz2.iVm == null || frz2.iVm.length == 0) {
            treeMap.put("AnimationStates", "\"\"");
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < frz2.iVm.length; ++i) {
                object = frz2.iVm[i];
                if (i != 0) {
                    stringBuilder.append(",");
                }
                stringBuilder.append(((bwv)object).dXe);
                stringBuilder.append(":");
                stringBuilder.append(((bwv)object).aWe);
            }
            treeMap.put("AnimationStates", "\"" + stringBuilder.toString() + "\"");
        }
        if (frz2.iVn == null || frz2.iVn.length == 0) {
            treeMap.put("SkillHistory", "\"\"");
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < frz2.iVn.length; ++i) {
                object = frz2.iVn[i];
                if (i != 0) {
                    stringBuilder.append(",");
                }
                stringBuilder.append(((bxb)object).dXe);
                stringBuilder.append(":");
                stringBuilder.append(((bxb)object).SkillType);
                stringBuilder.append(":");
                stringBuilder.append(((bxb)object).SkillLevel);
                stringBuilder.append(":");
                stringBuilder.append(((bxb)object).dYe ? 1 : 0);
            }
            treeMap.put("SkillHistory", "\"" + stringBuilder.toString() + "\"");
        }
        if (object3.isEmpty()) {
            treeMap.put("ConnectedGMs", "");
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            int n = 0;
            object = object3.iterator();
            while (object.hasNext()) {
                Object object2 = (Integer)object.next();
                if (n != 0) {
                    stringBuilder.append(",");
                }
                stringBuilder.append((Integer)object2);
                ++n;
            }
            treeMap.put("ConnectedGMs", "\"" + stringBuilder.toString() + "\"");
        }
        String string = "INSERT INTO monitor(";
        int n = 0;
        for (Object object2 : treeMap.keySet()) {
            if (n > 0) {
                String string2 = (String)var5_13 + "," + (String)object2;
            } else {
                String string3 = (String)var5_13 + (String)object2;
            }
            ++n;
        }
        String string4 = (String)var5_13 + ") VALUES (";
        n = 0;
        for (Object object2 : treeMap.values()) {
            if (n > 0) {
                String string5 = (String)var5_18 + "," + (String)object2;
            } else {
                String string6 = (String)var5_18 + (String)object2;
            }
            ++n;
        }
        String string7 = (String)var5_18 + ")";
        object = (kdj)this.MessageDelegator.i(259, ldv.rfd, lcr.qyX);
        ((kdj)object).wA("Darkfall");
        ((kdj)object).setContext(0);
        ((kdj)object).wB(string7);
        this.MessageDelegator.b((kcz)object);
    }

    private final void aCY() {
        ljq ljq2;
        bvd bvd2;
        if (this.dXX == null) {
            this.dXX = (kji)this.MessageDelegator.h(2818);
            this.dXX.GUID = this.MessageDelegator.bzv();
            this.dXX.wS(true);
            this.dXX.wT(true);
            this.dXX.ec = this.GUID;
            this.dXX.pDY = 0;
            this.dXX.Yg(2);
            this.dXX.Yh(2);
            bvd2 = this.dXZ.jf().aAG();
            ljq2 = bvd2.av();
            ljq2.y += 1.0f;
            this.dXX.ca(ljq2);
            this.dXX.cq(new ljq(0.0f, 1.0f, 0.0f));
            this.dXX.setLength(10.0f);
            this.MessageDelegator.a(this.dXX);
        }
        if (this.dXY == null) {
            this.dXY = (kji)this.MessageDelegator.h(2818);
            this.dXY.GUID = this.MessageDelegator.bzv();
            this.dXY.wS(true);
            this.dXY.wT(true);
            this.dXY.ec = this.GUID;
            this.dXY.pDY = 0;
            this.dXY.Yg(2);
            this.dXY.Yh(2);
            bvd2 = this.dXZ.jf().aAG();
            ljq2 = bvd2.av();
            ljq2.y += 1.0f;
            this.dXY.ca(ljq2);
            this.dXY.cq(new ljq(0.0f, -1.0f, 0.0f));
            this.dXY.setLength(10.0f);
            this.MessageDelegator.a(this.dXY);
        }
    }

    private final void handleLineContainmentResponse(kuj kuj2) {
        int n;
        ljq ljq2;
        float f2;
        if (this.dXX == null && this.dXY == null) {
            return;
        }
        if (this.dXZ.jf() == null || this.dXZ.jf().aAG() == null) {
            if (this.dXX != null && kuj2.ev.equals(this.dXX.GUID)) {
                this.MessageDelegator.oa(this.dXX.GUID);
                this.dXX = null;
            }
            if (this.dXY != null && kuj2.ev.equals(this.dXY.GUID)) {
                this.MessageDelegator.oa(this.dXY.GUID);
                this.dXY = null;
            }
            return;
        }
        bvd bvd2 = this.dXZ.jf().aAG();
        if (this.dXX != null && kuj2.ev.equals(this.dXX.GUID)) {
            this.dXu = 0;
            f2 = 30.0f;
            ljq2 = this.dXX.boZ();
            if (kuj2.ilP != null) {
                for (n = 0; n < kuj2.ilP.length; ++n) {
                    if (kuj2.jnv[n].equals(bvd2.axa()) || lcw.enb() && kuj2.jnv[n].ib() >= 1024 || this.dXu > 0 && !(Math.abs(kuj2.pJh[n]) < f2)) continue;
                    this.dXu = kuj2.bqd[n];
                    f2 = Math.abs(kuj2.pJh[n]);
                }
            }
            this.MessageDelegator.oa(this.dXX.GUID);
            this.dXX = null;
        }
        if (this.dXY != null && kuj2.ev.equals(this.dXY.GUID)) {
            this.dXt = 0;
            f2 = 30.0f;
            ljq2 = this.dXY.boZ();
            if (kuj2.ilP != null) {
                for (n = 0; n < kuj2.ilP.length; ++n) {
                    if (kuj2.jnv[n].equals(bvd2.axa()) || lcw.enb() && kuj2.jnv[n].ib() >= 1024 || this.dXt > 0 && !(Math.abs(kuj2.pJh[n]) < f2)) continue;
                    this.dXt = kuj2.bqd[n];
                    f2 = Math.abs(kuj2.pJh[n]);
                }
            }
            this.MessageDelegator.oa(this.dXY.GUID);
            this.dXY = null;
        }
    }

    @Override
    public void nm(int n) {
        if ((this.dXT & 4) != 0) {
            this.dXV.add(new bwv(n, this.MessageDelegator.arc().rgz));
        } else if (!this.dXV.isEmpty()) {
            this.dXV.clear();
        }
    }

    @Override
    public void e(cwx cwx2) {
        if ((this.dXT & 8) != 0) {
            this.dXW.add(new bxb(true, cwx2, null, this.MessageDelegator.arc().rgz));
        } else if (!this.dXW.isEmpty()) {
            this.dXW.clear();
        }
    }

    @Override
    public void f(cwx cwx2) {
        if ((this.dXT & 8) != 0) {
            this.dXW.add(new bxb(false, cwx2, null, this.MessageDelegator.arc().rgz));
        } else if (!this.dXW.isEmpty()) {
            this.dXW.clear();
        }
    }
}

