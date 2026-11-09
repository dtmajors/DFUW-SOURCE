/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cug
 *  ha
 *  lcr
 *  lcw
 */
import java.util.Map;

public class tk
extends btk
implements bto {
    public static final int aSR = 0;
    public static final int aSS = 1;
    public static final int aST = 2;
    public static final int aSU = 3;
    public static final int aSV = 4;
    public static final int aSW = 5;
    public static final int aSX = 6;
    private final ha hF;
    private ezc aSY = null;
    private ljq aSZ = null;
    private lgl aTa = null;
    private int aTb = -1;
    private ldv aTc = null;
    private ldv aTd = null;
    private Map<Integer, lei> aTe = lcn.emw();
    private Map<Integer, Integer> aTf = lcn.emw();
    private tj aTg;
    private static final ljq akL = new ljq(0.0f, -1.0f, 0.0f);
    private static final float akO = 0.75f;
    private static final float akM = 0.5f;
    private static final ljq aTh = new ljq(0.0f, 1.0f, 0.0f);
    private static final float aTi = 3.0f;
    private static final float aTj = 0.25f;
    private static final float aTk = 12.0f;
    private int aTl = 1;
    private boolean aTm = true;
    private double aTn = -1.0;

    public tk(ha ha2) {
        this.hF = ha2;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.aTg = new tj(this);
        this.aTg.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.aTg);
    }

    @Override
    public void doTick(ldz ldz2) {
        this.aTg.doTick(ldz2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 26372: {
                this.a((ezc)dxq2);
                break;
            }
            case 26370: {
                this.a((eyy)dxq2);
                break;
            }
            case 12812: {
                this.a((eeg)dxq2);
                break;
            }
            case 5636: {
                this.b((fuu)dxq2);
                break;
            }
            case 3076: {
                this.a((ecf)dxq2);
                break;
            }
            case 3079: {
                this.a((eci)dxq2);
                break;
            }
            case 3078: {
                this.a((ech)dxq2);
                break;
            }
            case 20005: {
                this.a((eve)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
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

    private boolean uQ() {
        if (this.hF.jf() == null) {
            return false;
        }
        if (!this.hF.iY() || this.hF.iM()) {
            return false;
        }
        if (!this.hF.jf().aLU().aEP().isAlive()) {
            return false;
        }
        if (this.hF.jf().aAG() == null) {
            return false;
        }
        if (this.hF.jf().aAG().azb() == null) {
            return false;
        }
        if (this.hF.jf().aJD() == null) {
            return false;
        }
        return this.hF.jf().aJD().aEP() != null;
    }

    private void a(ezc ezc2) {
        ljq ljq2;
        Object object;
        if (!this.uQ()) {
            return;
        }
        if (this.hF.jf().aJD().aEP().aEz()) {
            this.hF.c(mbr.ulr.bD(new Object[0]));
            return;
        }
        if (this.aSY != null) {
            this.hF.c(mbr.ull.bD(new Object[0]));
            return;
        }
        ti ti2 = lea.eol().get(ezc2.aRX);
        if (ti2 == null) {
            this.hF.c(mbr.uln.bD(new Object[0]));
            return;
        }
        if (this.aTn != -1.0 && this.MessageDelegator.arc().rgz - this.aTn < 3.0) {
            this.hF.c(mbr.ulG.bD(new Object[0]));
            return;
        }
        if (!cug.vq((int)ti2.az()) && (object = lea.eg(this.hF.jf().aAG().azb())) != null && object == lmf.rEz) {
            this.hF.c(mbr.ulm.bD(ti2.az()));
            return;
        }
        assert (ti2.uA() != null);
        if (this.hF.jT().ordinal() < ti2.uA().ordinal()) {
            this.hF.c(mbr.ulo.bD(new Object[0]));
            return;
        }
        object = this.aTe.get(ti2.az());
        if (object != null && ((lei)object).intValue() >= ti2.ux()) {
            this.hF.c(mbr.ulq.bD(ti2.ux(), ti2.az()));
            return;
        }
        if (cug.vm((int)ti2.az()) && (this.aQ().iG() == null || this.aQ().iG().equals(lcr.qAC))) {
            this.hF.c(mbr.ulK.bD(new Object[0]));
            return;
        }
        this.aSY = ezc2;
        this.aTm = true;
        ljq ljq3 = ljq2 = this.aSY.Position != null ? this.aSY.Position : this.hF.jf().aAG().av();
        if (this.aSY.Position != null) {
            ljq ljq4 = new ljq(0.0f, 0.0f, 1.0f);
            ljq ljq5 = lgl.a(this.aSY.Rotation, ljq4);
            ljq5.normalize();
            this.a(ljq2, ljq5, 12.0f, true);
        } else {
            ljq2.y += 0.5f;
            this.a(ljq2, akL, 0.75f, false);
        }
    }

    private void a(ljq ljq2, ljq ljq3, float f2, boolean bl) {
        kji kji2 = (kji)this.MessageDelegator.h(2818);
        kji2.wS(true);
        kji2.wT(bl);
        kji2.ec = this.GUID;
        kji2.pDY = 0;
        kji2.Yg(2);
        kji2.Yh(2);
        kji2.ca(ljq2);
        kji2.cq(ljq3);
        kji2.setLength(f2);
        this.MessageDelegator.a(kji2);
    }

    private void handleLineContainmentResponse(kuj kuj2) {
        if (kuj2.bqd == null) {
            this.aSY = null;
            return;
        }
        if (kuj2.bqd.length <= 0) {
            this.aSY = null;
            return;
        }
        if (!this.uQ()) {
            this.aSY = null;
            return;
        }
        if (cug.vr((int)this.aSY.aRX)) {
            this.c(kuj2);
            return;
        }
        if (this.aTm) {
            int n = -1;
            float f2 = Float.MAX_VALUE;
            for (int i = 0; i < kuj2.bqd.length; ++i) {
                if (kuj2.bqd[i] == cug.fkp || kuj2.bqd[i] == cug.fly || kuj2.bqd[i] == cug.fkr) {
                    if (!(kuj2.pJh[i] < f2)) continue;
                    f2 = kuj2.pJh[i];
                    n = i;
                    continue;
                }
                if (this.aSY.Position == null || cug.vJ((int)kuj2.bqd[i])) continue;
                n = -1;
                break;
            }
            if (n < 0) {
                this.aSY = null;
                this.hF.c(mbr.ulr.bD(new Object[0]));
                return;
            }
            ti ti2 = lea.eol().get(this.aSY.aRX);
            if (ti2 == null) {
                this.aSY = null;
                assert (false) : "Can not happen!!!";
                return;
            }
            if (cug.vm((int)ti2.az()) && (this.aQ().iG() == null || this.aQ().iG().equals(lcr.qAC))) {
                this.hF.c(mbr.ulK.bD(new Object[0]));
                return;
            }
            this.aSZ = kuj2.ilP[n];
            this.aTa = this.hF.jf().aAG().aw();
            this.aTm = false;
            if (this.aSY.Position != null) {
                ljq ljq2 = new ljq(this.aSZ);
                ljq2.y -= 0.25f;
                this.a(ljq2, aTh, 3.0f, true);
            } else {
                ljq ljq3 = new ljq(this.aSZ);
                ljq3.y += 0.25f;
                this.a(ljq3, aTh, 3.0f, false);
            }
            return;
        }
        int n = -1;
        for (int i = 0; i < kuj2.bqd.length; ++i) {
            int n2;
            int n3 = n2 = this.aSY.Position != null ? cug.fkr : cug.fgz;
            if (lea.enW().isDescendant(kuj2.bqd[i], n2)) continue;
            n = i;
            break;
        }
        if (n >= 0) {
            this.aSY = null;
            this.hF.c(mbr.ulr.bD(new Object[0]));
            return;
        }
        ti ti3 = lea.eol().get(this.aSY.aRX);
        if (ti3 == null) {
            this.aSY = null;
            assert (false) : "Can not happen!!!";
            return;
        }
        if (cug.vm((int)ti3.az())) {
            if (this.aQ().iG() == null) {
                this.hF.c(mbr.ulK.bD(new Object[0]));
                return;
            }
            evd evd2 = (evd)this.MessageDelegator.h(20004, this.getGUID(), this.aQ().iG());
            evd2.diQ = this.aQ().getGUID();
            evd2.iDG = this.aSZ;
            this.MessageDelegator.F(evd2);
            return;
        }
        this.uR();
    }

    private void a(eve eve2) {
        int n = eve2.ew;
        switch (n) {
            case 1: {
                this.aSY = null;
                this.hF.c(mbr.ulK.bD(new Object[0]));
                break;
            }
            case 2: {
                this.aSY = null;
                this.hF.c(mbr.ulL.bD(new Object[0]));
                break;
            }
            case 3: {
                this.aSY = null;
                this.hF.c(mbr.ulM.bD(new Object[0]));
                break;
            }
            case 4: {
                this.aSY = null;
                this.hF.c(mbr.ulN.bD(new Object[0]));
                break;
            }
            case 5: {
                this.uR();
                break;
            }
            default: {
                this.hF.c(mbr.ulO.bD(new Object[0]));
            }
        }
    }

    private void c(kuj kuj2) {
        int n;
        if (!cug.vr((int)this.aSY.aRX)) {
            lfn.b(5, "SFPersonalDeployableObjectManager", "handleDeployableShipStrongboxRequest() This is not a ship spawnable item : " + lea.enW().getName(this.aSY.aRX));
            assert (false);
            this.aSY = null;
            return;
        }
        int n2 = cug.vy((int)this.aSY.aRX);
        ldv ldv2 = null;
        boolean bl = false;
        float f2 = Float.MAX_VALUE;
        boolean bl2 = false;
        for (n = 0; n < kuj2.bqd.length; ++n) {
            boolean bl3 = lea.enW().isDescendant(kuj2.bqd[n], cug.fnO);
            if (!bl3) continue;
            bl2 = true;
            if (!cug.be((int)kuj2.bqd[n], (int)n2) || !(f2 > kuj2.pJh[n])) continue;
            bl = true;
            ldv2 = kuj2.qdO[n];
            f2 = kuj2.pJh[n];
        }
        if (!bl || ldv2 == null) {
            this.aSY = null;
            if (!bl2) {
                this.hF.c(mbr.ulr.bD(new Object[0]));
            } else {
                this.hF.c(mbr.ulF.bD(n2));
            }
            return;
        }
        n = lcr.abO((int)ldv2.enw());
        this.aTc = lcr.ak((ldv)ldv2, (int)n);
        fut fut2 = (fut)this.MessageDelegator.h(5635, this.GUID, this.aTc);
        fut2.Ib(1);
        fut2.iXu = true;
        this.MessageDelegator.F(fut2);
    }

    private void b(fuu fuu2) {
        this.aTd = fuu2.dtj;
        this.aTb = this.aSY.aRX;
        ece ece2 = (ece)this.MessageDelegator.h(3075, this.getGUID(), this.aTd);
        ece2.hsP = true;
        ece2.ilv = cug.vy((int)this.aSY.aRX);
        ece2.ilu = 0;
        this.MessageDelegator.F(ece2);
    }

    private void a(ecf ecf2) {
        switch (ecf2.ew) {
            case 1: {
                this.uR();
                return;
            }
            case 6: {
                this.hF.c(mbr.ulD.bD(new Object[0]));
                break;
            }
            case 3: {
                this.hF.c(mbr.ulC.bD(new Object[0]));
                break;
            }
            case 5: {
                this.hF.c(mbr.ulB.bD(new Object[0]));
                break;
            }
            case 4: {
                this.hF.c(mbr.ulE.bD(cug.vy((int)this.aSY.aRX)));
                break;
            }
            case 2: {
                this.hF.c(mbr.ulF.bD(cug.vy((int)this.aSY.aRX)));
            }
        }
        this.aSY = null;
        this.aTd = null;
        this.aTc = null;
        this.aTb = -1;
    }

    private void a(eci eci2) {
        int n = eci2.ilx;
        if (!(cug.vt((int)n) || cug.vv((int)n) || cug.vu((int)n))) {
            assert (false);
            return;
        }
        int n2 = eci2.ilE;
        ljq ljq2 = eci2.ilF;
        switch (n2) {
            case 3: {
                String string = ljq2 != null ? lcw.ea((ljq)ljq2) : "Unknown";
                this.hF.c(mcv.uCr.bD(n, string, eci2.ilI));
                break;
            }
            case 0: {
                this.hF.c(mcv.uCs.bD(n, ljq2, eci2.ilG));
                break;
            }
            case 1: {
                if (cug.vt((int)n)) {
                    if (!eci2.ilJ) {
                        this.hF.c(mbr.ult.bD(n, ljq2));
                        break;
                    }
                    this.hF.c(mbr.uls.bD(n, ljq2));
                    this.f(n, ljq2);
                    break;
                }
                this.hF.c(mbr.ulu.bD(n, ljq2));
                this.f(n, ljq2);
                break;
            }
            case 2: {
                boolean bl = eci2.ilJ;
                bfn bfn2 = eci2.ilH;
                if (bfn2 == null || bfn2.aYF == null) {
                    if (bl) {
                        this.hF.c(mbr.ulv.bD(n, ljq2));
                        this.f(n, ljq2);
                        break;
                    }
                    this.hF.c(mbr.ulw.bD(n, ljq2));
                    break;
                }
                if (lea.enW().isDescendant(bfn2.bsG, cug.fgG)) {
                    if (bl) {
                        this.hF.c(mbr.ulx.bD(n, bfn2.bsG));
                        this.f(n, ljq2);
                        break;
                    }
                    this.hF.c(mbr.uly.bD(n, bfn2.bsG));
                    break;
                }
                ldv ldv2 = lcr.tQ((ldv)bfn2.aYF);
                eef eef2 = (eef)this.MessageDelegator.h(12811, this.getGUID(), ldv2);
                eef2.sk(this.aTl);
                this.MessageDelegator.F(eef2);
                this.aTf.put(this.aTl, n);
                ++this.aTl;
                if (!bl) {
                    this.hF.c(mbr.ulw.bD(n, ljq2));
                    break;
                }
                this.f(n, ljq2);
                this.hF.c(mbr.ulv.bD(n, ljq2));
                break;
            }
            case 4: {
                this.f(n, ljq2);
            }
        }
    }

    private void a(ech ech2) {
        if (ech2.ily != 1) {
            this.dj(ech2.ilx);
        }
    }

    private void uR() {
        if (this.aSY == null) {
            lfn.b(5, "SFPersonalDeployableObjectManager", "notifyDeployPositionFound() ERROR ERROR!");
            assert (false);
            return;
        }
        ti ti2 = lea.eol().get(this.aSY.aRX);
        if (ti2 == null) {
            assert (false);
            this.hF.c(mbr.uln.bD(new Object[0]));
            if (cug.vr((int)this.aSY.aRX)) {
                this.uS();
                this.aTc = null;
                this.aTd = null;
                this.aTb = -1;
            }
            this.aSY = null;
            return;
        }
        if (ti2.uy()) {
            if (cug.vr((int)this.aSY.aRX)) {
                lfn.b(5, "SFPersonalDeployableObjectManager", "notifyDeployPositionFound() You can not send a message to global manager for a ship strong box!");
                this.uS();
                this.aTc = null;
                this.aTd = null;
                this.aTb = -1;
                assert (false);
                return;
            }
            eyx eyx2 = (eyx)this.MessageDelegator.h(26369, this.getGUID(), lcr.qEt);
            eyx2.aRX = this.aSY.aRX;
            eyx2.iFP = this.aSZ;
            this.MessageDelegator.F(eyx2);
            return;
        }
        if (!this.b(ti2)) {
            if (cug.vr((int)this.aSY.aRX)) {
                this.uS();
                this.aTc = null;
                this.aTd = null;
                this.aTb = -1;
            }
            this.aSY = null;
            return;
        }
        this.aSY = null;
        this.a(ti2);
    }

    private void a(ti ti2) {
        if (this.aSZ == null && !cug.vs((int)ti2.az())) {
            assert (false);
            return;
        }
        this.di(ti2.az());
        if (!cug.vs((int)ti2.az())) {
            if (lea.enW().fV(ti2.az(), cug.fkw)) {
                if (ti2.az() == cug.fky) {
                    this.aTa.Y(new lgl(new ljq(0.0, Math.PI, 0.0)));
                } else {
                    this.aTa.Y(new lgl(new ljq(0.0, 1.5707963267948966, 0.0)));
                }
            }
            this.aTg.a(ti2, this.aSZ, this.aTa, this.hF.getGUID());
        } else {
            this.uT();
        }
        this.aTn = this.MessageDelegator.arc().rgz;
    }

    private void di(int n) {
        if (cug.vn((int)n) || cug.vv((int)n)) {
            lfn.b(5, "SFPersonalDeployableObjectManager", "increaseDeployableResourceCounter() Lootable object :" + lea.enW().getName(n));
            assert (false);
            return;
        }
        if (cug.vs((int)n)) {
            return;
        }
        lei lei2 = this.aTe.get(n);
        if (lei2 == null) {
            lei2 = new lei(0);
            this.aTe.put(n, lei2);
        }
        lei2.setValue(lei2.intValue() + 1);
    }

    private void dj(int n) {
        if (cug.vn((int)n) || cug.vv((int)n)) {
            lfn.b(5, "SFPersonalDeployableObjectManager", "decreaseDeployableResourceCounter() Lootable object :" + lea.enW().getName(n));
            assert (false);
            return;
        }
        if (cug.vs((int)n)) {
            return;
        }
        lei lei2 = this.aTe.get(n);
        if (lei2 == null) {
            assert (false);
            return;
        }
        lei2.setValue(lei2.intValue() - 1);
        if (lei2.intValue() < 0) {
            assert (false);
            lei2.setValue(0);
        }
    }

    private void a(eyy eyy2) {
        assert (eyy2.ew != 0);
        if (this.aSY == null) {
            assert (false);
            assert (this.aTd == null);
            if (this.aTd != null) {
                this.uS();
                this.aTc = null;
                this.aTd = null;
                this.aTb = -1;
            }
            return;
        }
        ti ti2 = lea.eol().get(this.aSY.aRX);
        if (ti2 == null) {
            assert (false);
            this.aSY = null;
            return;
        }
        switch (eyy2.ew) {
            case 0: 
            case 1: {
                this.hF.c(mbr.ulp.bD(ti2.az()));
                this.aSY = null;
                return;
            }
        }
        assert (eyy2.ew == 3);
        if (!this.uQ()) {
            this.e(this.aSY.aRX, this.aSZ);
            this.aSY = null;
            return;
        }
        if (!this.b(ti2)) {
            this.e(this.aSY.aRX, this.aSZ);
            this.aSY = null;
            return;
        }
        this.aSY = null;
        this.a(ti2);
    }

    private void uS() {
        ece ece2 = (ece)this.MessageDelegator.h(3075, this.getGUID(), this.aTd);
        ece2.hsP = true;
        ece2.ilu = 1;
        this.MessageDelegator.F(ece2);
    }

    private void uT() {
        if (this.aTd == null) {
            lfn.b(5, "SFPersonalDeployableObjectManager", "sendShipStrongBoxCreateRequestMessage() BoatOwnerGUID is null.");
            assert (false);
            return;
        }
        if (this.aTb == -1) {
            lfn.b(5, "SFPersonalDeployableObjectManager", "sendShipStrongBoxCreateRequestMessage() Unknown Resource Type.");
            assert (false);
            return;
        }
        ecg ecg2 = (ecg)this.MessageDelegator.h(3077, this.getGUID(), this.aTd);
        ecg2.ilx = this.aTb;
        ecg2.ilw = this.hF.getGUID();
        this.MessageDelegator.F(ecg2);
    }

    private void a(eeg eeg2) {
        Integer n = this.aTf.remove(eeg2.aVk());
        if (n == null) {
            assert (false);
            return;
        }
        if (eeg2.iG() != null && eeg2.iV() != null && eeg2.kE() != null) {
            this.hF.c(mbr.ulA.bD((int)n, eeg2.kE().toString(), eeg2.iP() + " " + eeg2.iR(), eeg2.iV()));
        } else {
            this.hF.c(mbr.ulz.bD((int)n, eeg2.iP() + " " + eeg2.iR()));
        }
    }

    private void e(int n, ljq ljq2) {
        assert (n > 0);
        assert (ljq2 != null);
        eyz eyz2 = (eyz)this.MessageDelegator.h(26371, this.getGUID(), lcr.qEt);
        eyz2.aRX = n;
        eyz2.iFP = ljq2;
        this.MessageDelegator.F(eyz2);
    }

    private boolean b(ti ti2) {
        return this.hF.jf().aJC().asf().aup().a(ti2.uw(), 1, bqy.dHz);
    }

    public void a(cbx cbx2, bfn bfn2, boolean bl) {
        if (bfn2 == null || bfn2.aYF == null) {
            ljq ljq2;
            ljq ljq3 = ljq2 = cbx2.aAG() != null && cbx2.aAG().azb() != null ? cbx2.aAG().azb() : new ljq();
            if (bl) {
                this.hF.c(mbr.ulv.bD(cbx2.az(), ljq2));
            } else if (cug.vk((int)cbx2.az())) {
                this.hF.c(mbr.ulw.bD(cbx2.az(), ljq2));
            }
            if (!cug.vk((int)cbx2.az()) || bl) {
                this.f(cbx2.az(), cbx2.aAG().av());
            }
            return;
        }
        if (lea.enW().isDescendant(bfn2.bsG, cug.fgG)) {
            if (bl) {
                this.hF.c(mbr.ulx.bD(cbx2.az(), bfn2.bsG));
            } else if (cug.vk((int)cbx2.az())) {
                this.hF.c(mbr.uly.bD(cbx2.az(), bfn2.bsG));
            }
            if (!cug.vk((int)cbx2.az()) || bl) {
                this.f(cbx2.az(), cbx2.aAG().av());
            }
            return;
        }
        ldv ldv2 = lcr.tQ((ldv)bfn2.aYF);
        eef eef2 = (eef)this.MessageDelegator.h(12811, this.getGUID(), ldv2);
        eef2.sk(this.aTl);
        this.MessageDelegator.F(eef2);
        this.aTf.put(this.aTl, cbx2.az());
        ++this.aTl;
        if (!cug.vk((int)cbx2.az()) || bl) {
            this.f(cbx2.az(), cbx2.aAG().av());
        }
        if (cug.vk((int)cbx2.az()) && !bl) {
            this.hF.c(mbr.ulw.bD(cbx2.az(), cbx2.aAG().azb()));
        }
    }

    public void b(cbx cbx2, boolean bl) {
        if (cbx2 == null) {
            lfn.b(5, "SFPersonalDeployableObjectManager", "notifyObjectTimedOut() PO == NULL");
            assert (false);
            return;
        }
        if (bl) {
            this.f(cbx2.az(), cbx2.aAG().av());
            if (cbx2.az() == cug.fkX || cbx2.az() == cug.flt) {
                this.hF.d(mbr.ulu.bD(cbx2.az(), cbx2.aAG().av()));
            }
            if (cbx2.az() == cug.fkY || cbx2.az() == cug.flu) {
                this.hF.e(mbr.ulu.bD(cbx2.az(), cbx2.aAG().av()));
            } else {
                this.hF.c(mbr.ulu.bD(cbx2.az(), cbx2.aAG().av()));
            }
        } else {
            if (cbx2.az() == cug.fkX) {
                this.hF.d(mbr.ult.bD(cbx2.az(), cbx2.aAG().av()));
            }
            if (cbx2.az() == cug.fkY) {
                this.hF.e(mbr.ult.bD(cbx2.az(), cbx2.aAG().av()));
            } else {
                this.hF.c(mbr.ult.bD(cbx2.az(), cbx2.aAG().av()));
            }
        }
    }

    public void f(int n, ljq ljq2) {
        if (cug.vn((int)n)) {
            n = cug.vp((int)n);
        } else if (cug.vv((int)n)) {
            n = cug.vx((int)n);
        }
        ti ti2 = lea.eom().get(n);
        if (ti2 == null) {
            assert (false);
            return;
        }
        if (ti2.uy()) {
            if (cug.vt((int)ti2.uw()) || cug.vu((int)ti2.uw())) {
                assert (false);
            } else if (ljq2 != null) {
                this.e(ti2.uw(), ljq2);
            } else assert (false) : "Position is null for Item " + ti2.az();
        }
        this.dj(ti2.az());
    }

    public final ha aQ() {
        return this.hF;
    }
}

