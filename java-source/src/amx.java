/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  axx
 *  cug
 *  cxd
 *  lcr
 *  lcw
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class amx
extends btk
implements amy,
asn,
bto {
    protected static final int bBo = 1;
    protected static final int bBp = 0;
    private static boolean bBq = true;
    private static final float bBr = (float)arw.e(1.0, 2.0);
    protected boolean bBs = false;
    protected double bBt;
    protected final asb bBu;
    protected final Set<ldv> bBv = lcn.emx();
    protected final ldv Ui;
    protected final clb bBw;
    protected final ljq Position;
    protected final Map<ldv, asw> bBx = lcn.emw();
    protected boolean bBy = true;
    protected cla bBz = cla.eHm;
    protected Set<ldv> bBA = lcn.emx();
    private final Set<a> bBB = lcn.emx();
    private aso bBC;
    private boolean bBD;
    private ldv bBE = null;
    private ldv Ud = null;
    private boolean bBF;
    private boolean bBG;

    public static final void bi(boolean bl) {
        bBq = bl;
    }

    protected amx(ljq ljq2, asb asb2, clb clb2) {
        this.Position = ljq2;
        this.bBw = clb2;
        this.bBu = asb2;
        this.Ui = this.bBw.KY();
        this.ObjectType = 103;
        this.setActive(false);
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        for (asw asw2 : this.bBx.values()) {
            asw2.b(this);
        }
        this.bBB.clear();
        this.bBv.clear();
        this.bBx.clear();
        this.bBA.clear();
    }

    @Override
    public void HD() {
        this.HO();
        this.HR();
        this.selfDestruct();
    }

    @Override
    public void HE() {
        this.HR();
        this.bBA.clear();
        this.bBx.clear();
        this.bBv.clear();
        this.HO();
        this.bBF = false;
        this.setActive(false);
    }

    @Override
    public void doTick(ldz ldz2) {
        if (!bBq) {
            return;
        }
        this.bBt = ldz2.rgz;
        if (this.bBz == cla.eHn) {
            return;
        }
        if (this.bBD) {
            this.HL();
        }
        if (this.bBv.isEmpty()) {
            return;
        }
        if (this.bBC.ag(this.bBt)) {
            this.HK();
            ArrayList<asa> arrayList = lcn.abH(this.bBB.size());
            for (a list2 : this.bBB) {
                if (!list2.HT()) continue;
                arrayList.add(list2.HS());
            }
            if (arrayList.size() <= 0) {
                return;
            }
            ldv[] ldvArray = null;
            List<ldv> list = this.HP();
            if (list != null) {
                for (asw asw2 : this.bBx.values()) {
                    if (!asw2.isAlive()) {
                        list.remove(asw2.KY());
                    }
                    if (this.bBw.dv(asw2.iG()) && !this.bBw.dy(asw2.qd())) {
                        list.remove(asw2.KY());
                    }
                    if (!this.bBw.dw(asw2.qd())) continue;
                    list.remove(asw2.KY());
                }
                ldvArray = list.toArray(new ldv[list.size()]);
            } else {
                ldvArray = new ldv[]{};
            }
            if (ldvArray.length <= 0) {
                return;
            }
            int n = arw.hK(arrayList.size());
            this.a((asa)arrayList.get(n), ldvArray);
        }
    }

    @Override
    public void HF() {
        if (this.bBF) {
            return;
        }
        if (!this.bBG) {
            this.bBG = true;
            this.Position.es(this.bBw.aAG().av());
            this.HQ();
        }
        this.HN();
        this.bBF = true;
        this.setActive(true);
    }

    @Override
    public ljq av() {
        return new ljq(this.Position);
    }

    @Override
    public float getRadius() {
        return this.bBu.getRadius();
    }

    public asb.a HG() {
        return this.bBu.SP();
    }

    @Override
    public boolean HH() {
        return this.bBs;
    }

    @Override
    public boolean HI() {
        return this.bBF;
    }

    @Override
    public boolean HJ() {
        return this.bBy;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 12548: {
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
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

    @Override
    public void bj(boolean bl) {
        this.HM();
        this.bBs = bl;
    }

    @Override
    public void bk(boolean bl) {
        this.HM();
        this.bBy = bl;
    }

    @Override
    public String toString() {
        return null;
    }

    protected abstract void HK();

    protected void a(kws kws2) {
        Object object;
        ldv[] ldvArray = kws2.qfR;
        ldv[] ldvArray2 = kws2.qfT;
        int[] nArray = kws2.qfc;
        if (ldvArray2 != null && ldvArray2.length > 0) {
            for (ldv ldv2 : ldvArray2) {
                if (this.bBx.containsKey(ldv2) && this.bBx.get(ldv2) != null) {
                    object = this.bBx.remove(ldv2);
                    ((asw)object).terminate();
                }
                this.bBv.remove(ldv2);
                this.bBA.remove(ldv2);
                this.cQ(ldv2);
            }
        }
        if (ldvArray != null) {
            for (int i = 0; i < ldvArray.length; ++i) {
                int n = nArray[i];
                if (n <= 0) continue;
                ldv ldv3 = ldvArray[i];
                if (lcw.enb() && ldv3.ib() != 3 || !lea.enW().isDescendant(n, cug.fgE) || lea.enW().isDescendant(n, cug.fgH)) continue;
                int n2 = this.bBu.hP(n);
                if (this.bBx.containsKey(ldv3)) continue;
                object = lcr.tQ((ldv)ldv3);
                asw asw2 = null;
                if (n2 == cug.fgG) continue;
                asb.a a2 = this.HG();
                switch (a2) {
                    case bTi: {
                        asw2 = new ass(ldv3, (ldv)object, n2, this.hf(n2));
                        break;
                    }
                    case bTj: {
                        asw2 = new ast(ldv3, (ldv)object, n2, this.hf(n2));
                        break;
                    }
                    default: {
                        assert (false);
                        return;
                    }
                }
                asw2.a(this);
                asw2.setGUID(this.MessageDelegator.bzv());
                this.MessageDelegator.a(asw2);
                this.bBx.put(ldv3, asw2);
            }
        }
    }

    protected void HL() {
        this.bBD = false;
        if (this.bBx.isEmpty()) {
            return;
        }
        this.bBv.clear();
        this.bBA.clear();
        Map<ldv, asw> map = lcn.abI(this.bBx.size());
        map.putAll(this.bBx);
        this.bBx.clear();
        for (asw asw2 : map.values()) {
            if (asw2 == null) continue;
            if (!asw2.isAlive()) {
                this.bBx.put(asw2.KY(), asw2);
                continue;
            }
            ldv ldv2 = asw2.qd();
            int n = asw2.az();
            ldv ldv3 = asw2.KY();
            asw2.terminate();
            asw asw3 = null;
            if (n == cug.fgG) continue;
            asb.a a2 = this.HG();
            switch (a2) {
                case bTi: {
                    asw3 = new ass(ldv3, ldv2, n, this.hf(n));
                    break;
                }
                case bTj: {
                    asw3 = new ast(ldv3, ldv2, n, this.hf(n));
                    break;
                }
                default: {
                    assert (false);
                    return;
                }
            }
            asw3.a(this);
            asw3.setGUID(this.MessageDelegator.bzv());
            this.MessageDelegator.a(asw3);
            this.bBx.put(ldv3, asw3);
        }
        map.clear();
    }

    protected void cQ(ldv ldv2) {
        if (this.HG() == asb.a.bTj) {
            dll dll2 = this.bBw.aRu();
            if (dll2 == null) {
                return;
            }
            axx axx2 = dll2.XQ();
            if (axx2 == null) {
                return;
            }
            axx2.m(ldv2, this.getGUID());
        } else {
            bnb bnb2 = this.bBw.aRv();
            if (bnb2 == null) {
                return;
            }
            bnb2.m(ldv2, this.getGUID());
        }
    }

    protected void HM() {
        this.bBD = true;
    }

    private void HN() {
        if (this.Ud == null) {
            assert (this.bBu.getRadius() > 0.0f);
            assert (this.Position != null);
            kou kou2 = (kou)this.MessageDelegator.h(534);
            kou2.pTa = true;
            kou2.pUN = true;
            kou2.pUO = false;
            kou2.ec = this.GUID;
            kou2.iBr = true;
            kou2.dsK = true;
            kou2.Ud = ldv.rfe;
            kou2.pUL = 0;
            kou2.dtg = bBr;
            kou2.pUM = this.bBu.getRadius();
            kou2.pTs = this.Position;
            this.bBE = kou2.GUID;
            this.MessageDelegator.a(kou2);
        }
    }

    private void HO() {
        if (this.HG() == asb.a.bTj) {
            dll dll2 = this.bBw.aRu();
            if (dll2 == null) {
                return;
            }
            axx axx2 = dll2.XQ();
            if (axx2 == null) {
                return;
            }
            axx2.dB(this.getGUID());
        } else {
            bnb bnb2 = this.bBw.aRv();
            if (bnb2 == null) {
                return;
            }
            bnb2.dB(this.getGUID());
        }
    }

    private List<ldv> HP() {
        if (this.HG() == asb.a.bTj) {
            dll dll2 = this.bBw.aRu();
            if (dll2 == null) {
                return null;
            }
            axx axx2 = dll2.XQ();
            if (axx2 == null) {
                return null;
            }
            for (ldv ldv2 : this.bBA) {
                axx2.l(ldv2, this.getGUID());
            }
            return axx2.dC(this.getGUID());
        }
        bnb bnb2 = this.bBw.aRv();
        if (bnb2 == null) {
            return null;
        }
        for (ldv ldv3 : this.bBA) {
            if (!this.bBv.contains(ldv3)) continue;
            bnb2.l(ldv3, this.getGUID());
        }
        return bnb2.dC(this.getGUID());
    }

    private void a(kwr kwr2) {
        if (this.bBE != null && this.bBE.equals(kwr2.ev)) {
            this.Ud = kwr2.dJs;
            if (!this.bBF) {
                this.HR();
            }
        } else {
            lfn.b(5, "SFAIGuardTower", "handleSensorResponse() Unknown SensorResponse");
        }
    }

    private void HQ() {
        this.bBC = new aso(1.0 / (double)this.bBu.SM());
        for (asa asa2 : this.bBu.SL()) {
            this.bBB.add(new a(this, asa2));
        }
    }

    private boolean hf(int n) {
        if (this.bBy && n != cug.fgG) {
            return this.bBu.hf(n);
        }
        if (this.bBs) {
            return cug.fgG == n;
        }
        return false;
    }

    private float bq(float f) {
        return f;
    }

    private void HR() {
        if (this.Ud != null) {
            kov kov2 = (kov)this.MessageDelegator.h(535);
            kov2.wD(false);
            kov2.ts(this.GUID);
            kov2.sy(this.Ud);
            this.MessageDelegator.a(kov2);
            this.Ud = null;
        }
    }

    private void a(asa asa2, ldv[] ldvArray) {
        float f = 1.0f;
        if (cug.wc((int)this.bBu.SO()) && this.bBw.aRw()) {
            f = this.bBu.SS();
        }
        fdb fdb2 = (fdb)this.MessageDelegator.h(9231, this.GUID, this.MessageDelegator.getGUID());
        fdb2.aYG = asa2.SJ();
        fdb2.SpecialEffectType = asa2.xc();
        fdb2.Magnitude = this.bq(asa2.uO() * f);
        fdb2.dsD = this.Ui;
        fdb2.aZG = this.GUID;
        fdb2.akX = this.GUID;
        fdb2.aYF = this.GUID;
        fdb2.bst = bkd.dqH;
        fdb2.aZH = this.Position;
        fdb2.iJL = ldvArray;
        fdb2.bsG = this.bBw.az();
        fdb2.aYC = cxd.fJY;
        this.MessageDelegator.F(fdb2);
    }
}

