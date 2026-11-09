/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Map;

public class bjx
extends bjn {
    private bjr dpV;
    private bjv dpW;
    private bjq dpX;
    private bjt dpY;
    private bjo dpZ;
    private bjs dqa;
    private String cQG;
    private ckx dpj;
    private ljq dqb;
    private static final int dqc = 666;
    private static final int dqd = 777;
    public static final double dqe = 14400.0;
    private String aDo;
    private ldv aDn;
    private int aRz = 1;
    private double dqf = 0.0;
    private double aFf = 0.0;

    public void aqi() {
        this.dqa.aqi();
    }

    public void aqK() {
        this.dpY.aqt();
        fgo fgo2 = (fgo)this.MessageDelegator.h(29447, this.GUID, lcr.qAL);
        fgo2.r(maw.ufK.bD(this.cQG, (int)(this.dpY.aqk() / 60.0)));
        this.MessageDelegator.E(fgo2);
    }

    public void aqL() {
        if (this.aDn != null && this.MessageDelegator.arc().rgz - this.dqf > 60.0) {
            this.dqf = this.MessageDelegator.arc().rgz;
            fgs fgs2 = (fgs)this.MessageDelegator.h(29446, this.GUID, this.aDn);
            fgs2.r(maw.ufI.bD(this.cQG));
            this.MessageDelegator.E(fgs2);
        }
    }

    public void aqM() {
        if (this.aDn != null) {
            fgs fgs2 = (fgs)this.MessageDelegator.h(29446, this.GUID, this.aDn);
            fgs2.r(maw.ufJ.bD(this.cQG));
            this.MessageDelegator.E(fgs2);
        }
    }

    public void aqN() {
        fgo fgo2 = (fgo)this.MessageDelegator.h(29447, this.GUID, lcr.qAL);
        fgo2.r(maw.ufH.bD(this.cQG));
        this.MessageDelegator.E(fgo2);
    }

    public void c(String string, ldv ldv2) {
        this.aDo = string;
        this.aDn = ldv2;
        this.dpX.b(string, ldv2);
        this.dpZ.b(string, ldv2);
        this.dpY.b(string, ldv2);
        this.dpj.hC(this.aDo);
        if (this.aDn != null) {
            bjz bjz2 = lea.epc().get(this.akc().toLowerCase());
            assert (bjz2 != null);
            if (bjz2 == null) {
                return;
            }
            double d2 = bjz2.ara();
            float f = (float)this.aFf / (float)d2;
            Map<ldv, Float> map = lcn.emw();
            map.put(this.aDn, Float.valueOf(0.85f));
            this.dqa.u(map);
            for (Map.Entry<ldv, Float> entry : map.entrySet()) {
                float f2 = f * entry.getValue().floatValue();
                int n = (int)f2;
                float f3 = f2 - (float)n;
                ArrayList<lfs<Integer, Integer>> arrayList = lcn.emv();
                for (int i = 0; i < n; ++i) {
                    arrayList.addAll(bjz2.cR(1.0f));
                }
                arrayList.addAll(bjz2.cR(f3));
                if (arrayList.isEmpty()) continue;
                int[] nArray = new int[arrayList.size()];
                int[] nArray2 = new int[arrayList.size()];
                int n2 = 0;
                for (lfs lfs2 : arrayList) {
                    nArray[n2] = (Integer)lfs2.reX;
                    nArray2[n2] = (Integer)lfs2.reY;
                    ++n2;
                }
                fcc fcc2 = (fcc)this.MessageDelegator.h(24847, this.getGUID(), entry.getKey());
                fcc2.aFc = this.getGUID();
                fcc2.bqd = nArray;
                fcc2.iIY = nArray2;
                this.MessageDelegator.F(fcc2);
                jts.a(bqy.dGh, nArray, nArray2, this.aqO(), this.MessageDelegator, this.GUID);
            }
            this.aFf = 0.0;
        }
    }

    public final ljq aqO() {
        return this.dpV.apZ().apU();
    }

    public final lgl aqP() {
        return this.dpV.apZ().apV();
    }

    public final void a(nw nw2, String string) {
        this.aDn = nw2.aFd.aDn;
        this.aDo = nw2.aFd.aDo;
        this.aFf = nw2.aFd.aFf;
        this.dpY.fN(string);
        this.dpY.aU(this.MessageDelegator.arc().rgz - nw2.aFd.aFe);
    }

    public double a(double d2, String string, boolean bl2) {
        if (string == null) {
            return 0.0;
        }
        bjz bjz2 = lea.epc().get(string.toLowerCase());
        if (bjz2 != null && bjz2.aqX() != null) {
            try {
                int n = -1;
                int n2 = -1;
                int n3 = -1;
                String[] stringArray = bjz2.aqX().split(":");
                if (stringArray != null && stringArray.length > 0) {
                    n = Integer.parseInt(stringArray[0]);
                    if (stringArray.length > 1) {
                        n2 = Integer.parseInt(stringArray[1]);
                    }
                    if (stringArray.length > 2) {
                        n3 = Integer.parseInt(stringArray[2]);
                    }
                    Calendar calendar = Calendar.getInstance();
                    calendar.add(13, (int)d2);
                    if (bl2 && calendar.get(9) == 0) {
                        calendar.add(5, -1);
                    }
                    Calendar calendar2 = (Calendar)calendar.clone();
                    calendar2.set(11, n);
                    if (calendar2.get(12) != n2) {
                        calendar2.set(12, n2);
                    }
                    if (calendar2.get(13) != n3) {
                        calendar2.set(13, n3);
                    }
                    return (double)(calendar2.getTimeInMillis() - calendar.getTimeInMillis()) / 1000.0;
                }
            }
            catch (NumberFormatException numberFormatException) {
                // empty catch block
            }
        }
        return 0.0;
    }

    public final void a(bjr bjr2) {
        this.dpV = bjr2;
        this.cQG = bjr2.aqd();
        bjz bjz2 = lea.epc().get(this.akc().toLowerCase());
        assert (bjz2 != null);
        this.dpY.aT(bjz2.arb());
        this.dpY.fN(this.cQG);
        assert (bjr2.apY());
        bjp bjp2 = bjr2.apZ();
        assert (bjp2 != null);
        fem fem2 = (fem)this.MessageDelegator.h(25345, this.getGUID(), lcr.qBI);
        fem2.l(bjp2.az());
        fem2.c(bjp2.apU());
        fem2.a(bjp2.apV());
        fem2.jS(true);
        fem2.oF(this.getGUID());
        fem2.sk(666);
        this.MessageDelegator.F(fem2);
        if (this.aDn != null) {
            fca fca2 = (fca)this.MessageDelegator.h(24837, this.getGUID(), this.aDn);
            fca2.iFc = null;
            fca2.cQE = this.getGUID();
            fca2.cQG = this.akc();
            fca2.cQF = bjp2.apU();
            fca2.gKV = 3;
            this.MessageDelegator.F(fca2);
        }
        this.dqa.a(bjr2, this.dpY.aqC());
    }

    public final nw aqQ() {
        nw nw2 = new nw();
        nw2.aFc = this.getGUID();
        nw2.aFd = new nx();
        nw2.aFd.aFc = this.getGUID();
        nw2.aFd.Filename = this.dpV.aqe();
        nw2.aFd.aDn = this.aDn;
        nw2.aFd.aDo = this.aDo;
        nw2.aFd.aFe = this.MessageDelegator.arc().rgz - this.dpY.aqE();
        nw2.aFd.aFf = this.aFf;
        return nw2;
    }

    private void a(fen fen2) {
        assert (fen2.aVk() == 666);
        assert (fen2.bOM() != null);
        this.dpj = fen2.bOM();
        this.MessageDelegator.a((amf)((Object)this.dpj));
        this.aqR();
        this.dpY.a(this.dpj);
        this.dpY.aqm();
        this.dpX.a(this.dpj);
        this.dpX.apX();
        this.dpZ.apP();
        if (this.aDn != null) {
            this.dpX.b(this.aDo, this.aDn);
            this.dpZ.b(this.aDo, this.aDn);
            this.dpj.hC(this.aDo);
        }
    }

    private void aqR() {
        Map<String, eh> map = ei.ao(this.dpj.aAG().getFileName());
        if (map == null) {
            assert (false);
            return;
        }
        eh eh2 = map.get("AttachPoint_Structure Kill 01");
        if (eh2 == null) {
            assert (false);
            return;
        }
        this.dqb = new ljq();
        lgl lgl2 = new lgl();
        eh2.a(this.dpj.aAG().azb(), this.dpj.aAG().azc(), this.dqb, lgl2);
    }

    @Override
    public void initialize() {
        this.dpX = new bjq(this);
        this.dpX.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.dpX);
        this.dpY = new bjt(this);
        this.dpY.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.dpY);
        this.dpZ = new bjo(this);
        this.dpZ.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.dpZ);
        this.dqa = new bjs(this);
        this.dqa.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.dqa);
        super.initialize();
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        this.aFf += ldz2.qwh;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 25346: {
                this.a((fen)dxq2);
                break;
            }
            case 24845: {
                this.a((fcj)dxq2);
                break;
            }
            case 24848: {
                this.a((fbw)dxq2);
                break;
            }
            case 24852: {
                this.a((fbu)dxq2);
                break;
            }
            case 24854: {
                this.a((fbz)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(fcj fcj2) {
        fck fck2 = (fck)this.MessageDelegator.h(24846, this.getGUID(), fcj2.aO());
        this.MessageDelegator.b(fcj2, fck2);
        fck2.aDn = this.aDn;
        fck2.aDo = this.aDo;
        fck2.cQG = this.cQG;
        fck2.iJk = this.dpY.aqA();
        this.MessageDelegator.F(fck2);
    }

    public final bjr aqS() {
        return this.dpV;
    }

    public final void b(bjr bjr2) {
        this.dpV = bjr2;
    }

    public final bjv aqT() {
        return this.dpW;
    }

    public final void a(bjv bjv2) {
        this.dpW = bjv2;
    }

    public final String akc() {
        return this.cQG;
    }

    public final void fl(String string) {
        this.cQG = string;
    }

    public final String abk() {
        return this.aDo;
    }

    public final ldv abj() {
        return this.aDn;
    }

    public final ljq aqU() {
        return this.dqb;
    }

    private void a(fbw fbw2) {
        if (this.aDn == null) {
            return;
        }
        if (!this.aDn.equals(fbw2.ade)) {
            return;
        }
        this.c("", null);
    }

    private void a(fbu fbu2) {
        if (this.dpY.aaW()) {
            fbv fbv2 = (fbv)this.MessageDelegator.h(24853, this.GUID, fbu2.aO());
            this.MessageDelegator.b(fbu2, fbv2);
            if (this.dpY.aqB()) {
                fbv2.DR(2);
            } else {
                fbv2.DR(1);
            }
        } else {
            this.dpY.c(fbu2.bOm(), fbu2.isAbsolute());
            fbv fbv3 = (fbv)this.MessageDelegator.h(24853, this.GUID, fbu2.aO());
            this.MessageDelegator.b(fbu2, fbv3);
            fbv3.DR(2);
            fbv3.cy(this.dpY.aqA());
            this.MessageDelegator.F(fbv3);
        }
    }

    private void a(fbz fbz2) {
        if (this.aDn == null || !ldv.au(this.aDn, fbz2.iG())) {
            return;
        }
        this.aDo = fbz2.iV();
        this.dpX.apO();
        this.dpZ.apO();
        this.dpY.apO();
        this.dpj.hC(this.aDo);
    }

    public double aqV() {
        return this.aFf;
    }

    public void aV(double d2) {
        this.aFf = d2;
    }

    public float aqW() {
        return this.dqa.hE(this.abj());
    }
}

