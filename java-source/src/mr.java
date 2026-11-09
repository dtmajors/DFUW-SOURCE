/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  ha
 *  lcr
 *  lcw
 */
import java.util.Map;
import java.util.SortedMap;

public class mr
extends mm {
    private static final int azw = 3;
    private static final boolean azx = false;
    private static final boolean azy = false;
    private ldv azz = null;
    private ljq azA = null;
    private ljq azB = null;
    private ljq azC = null;
    private boolean azD = false;
    private int azE = -1;
    private String azF = null;
    private boolean azG = false;
    private boolean azH = false;
    private boolean azI = false;
    private static final int azJ = 1;
    private static final int azK = 2;
    private static final int azL = 3;
    private static final int azM = 4;
    private static final int azN = 1;
    private int azO = -1;
    private ldv[] azP = null;
    private int azQ = -1;
    private static final int azR = 0;
    private static final int azS = 1;
    private static final int azT = 2;
    private int azU = 0;
    private boolean azV = false;
    private boolean azW = false;
    private atf atp = null;
    private static final int atq = 1;
    private static final int atr = 2;
    private ebl azX = null;
    private ldv azY = null;

    public mr(ha ha2) {
        super(ha2);
    }

    private boolean rn() {
        return this.azE == 3;
    }

    private boolean ro() {
        return this.azE == 1;
    }

    private boolean rp() {
        return this.azE == 2;
    }

    private boolean rq() {
        return this.azE == 4;
    }

    private void rr() {
        this.azH = false;
        this.azI = false;
        if (this.hF.iY()) {
            this.azG = false;
        }
        this.azU = 0;
        this.azQ = 0;
    }

    public void rs() {
        if (this.azH) {
            return;
        }
    }

    public void j(ldv ldv2, ldv ldv3) {
        if (ldv.au(ldv2, ldv3)) {
            return;
        }
        if (this.rn()) {
            eav eav2 = (eav)this.MessageDelegator.h(17415, this.GUID, this.azz);
            this.MessageDelegator.F(eav2);
        }
    }

    private void a(eaw eaw2) {
        if (!this.rn()) {
            return;
        }
        if (eaw2.iG() == null) {
            this.rt();
            return;
        }
        if (eaw2.iG().equals(this.hF.iG())) {
            ekl ekl2 = (ekl)this.MessageDelegator.h(13917, this.GUID, eaw2.iG());
            ekl2.oU(this.hF.getGUID());
            ekl2.ch(this.hF.iG());
            ekl2.cD(this.hF.iV());
            this.MessageDelegator.F(ekl2);
            return;
        }
        ekb ekb2 = (ekb)this.MessageDelegator.h(13838, this.GUID, eaw2.iG());
        ekb2.ikI = this.hF.getGUID();
        ekb2.cCH = this.hF.iG();
        ekb2.ikJ = this.hF.getAlignment();
        this.MessageDelegator.F(ekb2);
    }

    private void a(ekc ekc2) {
        if (!this.rn()) {
            return;
        }
        if (ccf.getValueByOrdinal(ekc2.ikL) != ccf.elo) {
            this.rt();
            return;
        }
        ekl ekl2 = (ekl)this.MessageDelegator.h(13917, this.GUID, ekc2.aO());
        ekl2.oU(this.hF.getGUID());
        ekl2.ch(this.hF.iG());
        ekl2.cD(this.hF.iV());
        this.MessageDelegator.F(ekl2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 17410: {
                eau eau2 = (eau)dxq2;
                if (eau2.aVk() == 1) {
                    this.a((eau)dxq2);
                    break;
                }
                if (eau2.aVk() == 2) {
                    this.b((eau)dxq2);
                    break;
                }
                assert (false) : "Unknown tag!";
                break;
            }
            case 17419: {
                this.a((ebg)dxq2);
                break;
            }
            case 17421: {
                this.a((ebi)dxq2);
                break;
            }
            case 17422: {
                this.a((ebs)dxq2);
                break;
            }
            case 17423: {
                this.a((ecb)dxq2);
                break;
            }
            case 22788: {
                this.a((eaf)dxq2);
                break;
            }
            case 17425: {
                this.a((eay)dxq2);
                break;
            }
            case 17429: {
                this.a((eca)dxq2);
                break;
            }
            case 11034: {
                this.c((gre)dxq2);
                break;
            }
            case 17437: {
                this.a((ebl)dxq2);
                break;
            }
            case 17438: {
                this.a((ebm)dxq2);
                break;
            }
            case 9251: {
                this.a((fdu)dxq2);
                break;
            }
            case 17416: {
                this.a((eaw)dxq2);
                break;
            }
            case 13839: {
                this.a((ekc)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(ebl ebl2) {
        this.azX = ebl2;
        ebl ebl3 = (ebl)this.MessageDelegator.h(17437, this.getGUID(), lcr.qCw);
        ebl3.ikK = this.hF.js();
        ebl3.Nationality = this.hF.kY().ordinal();
        ebl3.ikY = ebl2.ikY;
        this.MessageDelegator.F(ebl3);
    }

    private void a(ebm ebm2) {
        assert (this.azX != null);
        if (this.azX == null) {
            lfn.b(5, "SFSpawnPersistenceInfo", "handleBindStoneGlobalGetStartingBindStoneResponseMessage() IncomingBindStoneGlobalGetStartingBindStoneRequestMessage == null!");
            return;
        }
        assert (ebm2.azY != null);
        assert (ebm2.azF != null);
        assert (ebm2.bYY != null);
        this.bX(ebm2.azY);
        ebm2.on(this.azX.aO());
        this.azX = null;
        this.MessageDelegator.F(ebm2);
    }

    private void c(gre gre2) {
        switch (gre2.bWS()) {
            case 1: {
                break;
            }
            case 2: {
                break;
            }
            case 3: {
                break;
            }
            case 4: {
                break;
            }
        }
        assert (false);
        this.azH = false;
        this.azU = 0;
        this.rt();
    }

    private void a(eay eay2) {
        if (ccf.getValueByOrdinal(eay2.ikL) == ccf.elo) {
            this.hF.iD();
            this.azz = eay2.aO();
            this.azD = eay2.ela;
            this.azA = eay2.bYY;
            this.azF = eay2.azF;
            this.azE = eay2.azE;
            assert (this.azV);
            this.azW = true;
        } else {
            this.azU = 0;
            this.rt();
        }
    }

    private void a(eca eca2) {
        if (ccf.getValueByOrdinal(eca2.ikL) == ccf.elo) {
            this.hF.iD();
            this.azz = eca2.aO();
            this.azD = eca2.ela;
            this.azA = eca2.bYY;
            this.azF = eca2.azF;
            this.azE = eca2.azE;
            assert (this.azV);
            if (this.azV) {
                this.azW = true;
            }
        } else {
            this.azW = true;
            this.azV = false;
            this.azH = false;
            this.rt();
        }
    }

    private void a(eau eau2) {
        if (ccf.getValueByOrdinal(eau2.ikL) == ccf.elo) {
            if (!this.rq()) {
                if (this.azz != null && !this.azz.equals(eau2.aO())) {
                    eas eas2 = (eas)this.MessageDelegator.h(17417, this.getGUID(), this.azz);
                    eas2.ade = this.hF.iG();
                    eas2.Ri = this.hF.getGUID();
                    this.MessageDelegator.F(eas2);
                }
            } else if (this.azz != null) {
                eby eby2 = (eby)this.MessageDelegator.h(17430, this.getGUID(), this.azz);
                eby2.ade = this.hF.iG();
                eby2.Ri = this.hF.getGUID();
                eby2.ilo = this.rz();
                this.MessageDelegator.F(eby2);
            }
            this.c(eau2);
            this.rr();
            return;
        }
        if (this.azI) {
            this.rt();
        } else {
            this.azH = false;
        }
        this.d(eau2);
    }

    private void b(eau eau2) {
        assert (this.azU != 0);
        if (ccf.getValueByOrdinal(eau2.ikL) == ccf.elo) {
            if (this.azz != null && !this.azz.equals(eau2.aO())) {
                eas eas2 = (eas)this.MessageDelegator.h(17417, this.getGUID(), this.azz);
                eas2.ade = this.hF.iG();
                eas2.Ri = this.hF.getGUID();
                this.MessageDelegator.F(eas2);
            }
            this.c(eau2);
            this.rr();
            return;
        }
        ++this.azQ;
        if (this.azQ < this.azP.length) {
            eat eat2 = (eat)this.MessageDelegator.h(17409, this.getGUID(), this.azP[this.azQ]);
            eat2.sk(2);
            eat2.Dt(this.hF.getAlignment());
            eat2.oB(this.hF.getGUID());
            eat2.oC(this.hF.iG());
            eat2.Du(this.hF.js());
            eat2.jM(true);
            this.MessageDelegator.F(eat2);
        } else {
            this.ru();
        }
    }

    private void a(ebs ebs2) {
        boolean bl = false;
        if (this.azz == null) {
            return;
        }
        if (!this.azz.equals(ebs2.azY)) {
            return;
        }
        if (ccf.getValueByOrdinal(ebs2.ilb) == ccf.elu) {
            if (ebs2.ilc == null) {
                this.hF.c(mab.tZU.bD(ebs2.azF));
            } else {
                this.hF.c(mab.tZT.bD(ebs2.azF, ebs2.ilc));
            }
            bl = true;
        } else {
            switch (ebs2.azE) {
                case 2: {
                    this.hF.c(mab.uad.bD(this.azA));
                    break;
                }
                case 3: {
                    this.hF.c(mab.tZS.bD(ebs2.azF));
                    break;
                }
                case 4: {
                    this.hF.c(mab.tZX.bD(this.azA));
                    break;
                }
                case 1: {
                    this.hF.c(mab.uaa.bD(this.azA));
                    break;
                }
                default: {
                    assert (false);
                    this.hF.c(mab.uad.bD(this.azA));
                }
            }
        }
        if (!bl) {
            this.rt();
        } else if (this.azU == 0) {
            this.azU = 1;
            this.rt();
            this.ru();
        } else {
            this.rt();
        }
    }

    private void rt() {
        this.azI = true;
        if (this.azH) {
            return;
        }
        this.azH = true;
        if (this.azU == 0) {
            this.azU = 2;
            ebh ebh2 = (ebh)this.MessageDelegator.h(17420, this.getGUID(), lcr.qEq);
            ebh2.azE = 1;
            ebh2.ikK = this.hF.js();
            ebh2.ikV = true;
            this.MessageDelegator.F(ebh2);
        }
    }

    private void ru() {
        assert (this.azU != 0);
        if (this.azU == 0) {
            this.azU = 1;
        }
        if (this.azU == 1) {
            this.azU = 2;
        } else assert (false) : "Can't change stage from chaosstones!";
        ebh ebh2 = (ebh)this.MessageDelegator.h(17420, this.getGUID(), lcr.qEq);
        ebh2.ikK = this.hF.js();
        switch (this.azU) {
            case 2: {
                ebh2.azE = 1;
                ebh2.ikV = true;
                break;
            }
            default: {
                assert (false) : "Can't change";
                break;
            }
        }
        this.MessageDelegator.F(ebh2);
    }

    public boolean rv() {
        return !this.azH && !this.azI;
    }

    public void aa(ljq ljq2) {
        this.azB = ljq2;
        this.azG = true;
    }

    public void bX(ldv ldv2) {
        if (this.azH) {
            return;
        }
        this.azH = true;
        eat eat2 = (eat)this.MessageDelegator.h(17409, this.getGUID(), ldv2);
        eat2.sk(1);
        eat2.Dt(this.hF.getAlignment());
        eat2.oB(this.hF.getGUID());
        eat2.oC(this.hF.iG());
        eat2.Du(this.hF.js());
        eat2.jM(true);
        this.MessageDelegator.F(eat2);
    }

    private void a(ecb ecb2) {
        if (ecb2.azY == null) {
            lfn.b(5, "SFSpawnPersistenceInfo", "handleBindStoneUserInitiatedBindRequestMessage() BINDSTONE GUID IS NULL.");
            assert (false);
            return;
        }
        if (ecb2.azY.equals(this.azz)) {
            this.hF.c(mab.tZQ.bD(new Object[0]));
            return;
        }
        this.bY(ecb2.azY);
    }

    public void bY(ldv ldv2) {
        this.azY = ldv2;
        fdt fdt2 = (fdt)this.MessageDelegator.h(9250, this.GUID, this.hF.aP());
        fdt2.kU(true);
        fdt2.cz(3.0);
        fdt2.kT(true);
        this.MessageDelegator.F(fdt2);
    }

    private void a(fdu fdu2) {
        if (this.azY == null) {
            lfn.b(5, "SFSpawnPersistenceInfo", "handleFunctionUseObjectDelayResponseMessage() There was no pending bind request message");
            return;
        }
        if (fdu2.bOA()) {
            this.bX(this.azY);
        }
        this.azY = null;
    }

    private void c(eau eau2) {
        this.hF.iD();
        this.azz = eau2.aO();
        this.azD = eau2.ela;
        this.azA = eau2.bYY;
        this.azF = eau2.azF;
        this.azE = eau2.azE;
        if (this.azV) {
            this.azW = true;
        }
        this.azV = false;
        switch (this.azE) {
            case 3: {
                this.hF.c(mab.tZR.bD(this.azF));
                break;
            }
            case 4: {
                this.hF.c(mab.tZW.bD(this.azA));
                break;
            }
            case 1: {
                this.hF.c(mab.tZZ.bD(this.azA));
                break;
            }
            case 2: {
                this.hF.c(mab.uac.bD(this.azA));
                break;
            }
            default: {
                assert (false);
                this.hF.c(mab.uac.bD(this.azA));
            }
        }
        this.oV();
    }

    private void d(eau eau2) {
        switch (eau2.azE) {
            case 3: {
                this.hF.c(mab.tZV.bD(new Object[]{eau2.azF, ccf.getValueByOrdinal(eau2.ikL)}));
                break;
            }
            case 1: {
                this.hF.c(mab.uab.bD(new Object[]{eau2.bYY, ccf.getValueByOrdinal(eau2.ikL)}));
                break;
            }
            case 2: {
                this.hF.c(mab.uae.bD(new Object[]{eau2.bYY, ccf.getValueByOrdinal(eau2.ikL)}));
                break;
            }
            case 4: {
                this.hF.c(mab.tZY.bD(new Object[]{eau2.bYY, ccf.getValueByOrdinal(eau2.ikL)}));
                break;
            }
            default: {
                assert (false);
                this.hF.c(mab.uae.bD(new Object[]{eau2.bYY, ccf.getValueByOrdinal(eau2.ikL)}));
            }
        }
    }

    private void oW() {
        if (this.atp == null) {
            return;
        }
        eae eae2 = (eae)this.MessageDelegator.h(22786, this.getGUID(), this.hF.getGUID());
        eae2.iks = this.atp.ID;
        eae2.aqs = 2;
        this.hF.receiveMessage((dxq)eae2);
        this.atp = null;
    }

    private void oV() {
        if (!this.hF.iY()) {
            return;
        }
        if (this.azA == null) {
            return;
        }
        if (this.azF == null) {
            return;
        }
        if (this.MessageDelegator == null) {
            return;
        }
        this.oW();
        assert (this.MessageDelegator != null) : "MessageDelegator is null!. GUID = " + this.GUID;
        assert (this.hF != null);
        eaa eaa2 = (eaa)this.MessageDelegator.h(22785, this.getGUID(), this.hF.getGUID());
        eaa2.Position = this.azA;
        eaa2.aFo = this.azF;
        eaa2.ResourceType = cug.fqc;
        eaa2.aFp = false;
        eaa2.aqs = 1;
        this.hF.receiveMessage((dxq)eaa2);
    }

    private void a(eaf eaf2) {
        if (eaf2.aVk() == 2) {
            if (eaf2.ex != 3) {
                return;
            }
            return;
        }
        if (eaf2.aVk() == 1) {
            this.oW();
            if (eaf2.ex != 2) {
                assert (false);
                return;
            }
            assert (eaf2.Zn != null);
            assert (eaf2.Zn.length == 1);
            this.atp = eaf2.Zn[0];
            return;
        }
        assert (false);
    }

    public void rw() {
        this.azV = true;
        if (this.rp() || this.ro()) {
            this.azz = null;
            this.rx();
        } else if (this.rn()) {
            assert (this.rn());
            eax eax2 = (eax)this.MessageDelegator.h(17424, this.getGUID(), this.azz);
            eax2.sk(3);
            eax2.Dt(this.hF.getAlignment());
            eax2.oB(this.hF.getGUID());
            eax2.oC(this.hF.iG() == null ? lcr.qAC : this.hF.iG());
            eax2.jM(true);
            this.MessageDelegator.F(eax2);
        } else if (this.rq()) {
            ebz ebz2 = (ebz)this.MessageDelegator.h(17428, this.getGUID(), this.azz);
            ebz2.sk(4);
            ebz2.Dt(this.hF.getAlignment());
            ebz2.oB(this.hF.getGUID());
            ebz2.oC(this.hF.iG() == null ? lcr.qAC : this.hF.iG());
            ebz2.bL(this.rz());
            ebz2.jM(true);
            this.MessageDelegator.F(ebz2);
        } else {
            this.azV = false;
            this.azW = true;
            lfn.b(5, "SFSpawnPersistenceInfo", "initializePlayer(): Can't figure out bindstone. GUID=" + this.azz + " PSOGUID=" + this.aQ().getGUID());
        }
    }

    private void rx() {
        assert (this.azF != null);
        this.azH = true;
        ebf ebf2 = (ebf)this.MessageDelegator.h(17418, this.getGUID(), lcr.qEq);
        ebf2.azF = this.azF;
        this.MessageDelegator.F(ebf2);
    }

    private void a(ebg ebg2) {
        if (ebg2.azY != null) {
            this.azH = true;
            eat eat2 = (eat)this.MessageDelegator.h(17409, this.getGUID(), ebg2.azY);
            eat2.sk(1);
            eat2.Dt(this.hF.getAlignment());
            eat2.oB(this.hF.getGUID());
            eat2.Du(this.hF.js());
            if (this.hF.iG() == null) {
                eat2.oC(lcr.qzh);
            } else {
                eat2.oC(this.hF.iG());
            }
            eat2.jM(true);
            this.MessageDelegator.F(eat2);
        } else {
            this.azH = false;
            this.rt();
        }
    }

    private void a(ldv[] ldvArray, ljq[] ljqArray) {
        int n;
        assert (ldvArray != null);
        assert (ljqArray != null);
        assert (ldvArray.length == ljqArray.length);
        if (this.azA == null) {
            this.azP = ldvArray;
            return;
        }
        if (ldvArray.length == 1) {
            this.azP = ldvArray;
            return;
        }
        SortedMap<Float, Object> sortedMap = lcn.emD();
        for (n = 0; n < ljqArray.length; ++n) {
            ldv ldv2 = ldvArray[n];
            ljq object = ljqArray[n];
            ljq ljq2 = new ljq(object);
            ljq2.et(this.azA);
            float f = ljq2.eqN();
            sortedMap.put(Float.valueOf(f), ldv2);
        }
        this.azP = new ldv[ldvArray.length];
        n = 0;
        for (Map.Entry entry : sortedMap.entrySet()) {
            this.azP[n] = (ldv)entry.getValue();
            ++n;
        }
    }

    private void a(ebi ebi2) {
        assert (this.azI);
        if (ebi2.ikW == null || ebi2.ikW.length < 1) {
            this.ru();
            return;
        }
        assert (ebi2.ikX != null);
        assert (ebi2.ikX.length == ebi2.ikW.length);
        this.a(ebi2.ikW, ebi2.ikX);
        this.azQ = 0;
        eat eat2 = (eat)this.MessageDelegator.h(17409, this.getGUID(), this.azP[0]);
        eat2.sk(2);
        eat2.Dt(this.hF.getAlignment());
        eat2.oB(this.hF.getGUID());
        eat2.oC(this.hF.iG());
        eat2.Du(this.hF.js());
        eat2.jM(true);
        this.MessageDelegator.F(eat2);
    }

    public int ry() {
        return this.azE;
    }

    public void cP(int n) {
        this.azE = n;
    }

    public String rz() {
        return this.azF;
    }

    public void bL(String string) {
        this.azF = string;
    }

    public boolean rA() {
        return this.azW;
    }

    public ldv rB() {
        return this.azz;
    }

    public void bZ(ldv ldv2) {
        this.azz = ldv2;
    }

    public ljq rC() {
        return this.azA;
    }

    public void ab(ljq ljq2) {
        this.azA = ljq2;
    }

    public ljq rD() {
        return this.azB;
    }

    public void ac(ljq ljq2) {
        this.azB = ljq2;
    }

    public ljq rE() {
        return this.azC;
    }

    public void ad(ljq ljq2) {
        this.azC = ljq2;
    }

    public boolean rF() {
        return this.azD;
    }

    public void ai(boolean bl) {
        this.azD = bl;
    }

    public boolean rG() {
        return this.azG;
    }

    public void aj(boolean bl) {
        if (this.azG != bl) {
            this.hF.iD();
        }
        this.azG = bl;
    }

    public ljq rH() {
        if (this.azG) {
            assert (this.azB != null);
            return this.azB;
        }
        if (this.azA == null) {
            assert (false);
            return this.azB;
        }
        return this.azA;
    }

    public void jw() {
        if (this.azG && !lcw.enb()) {
            this.aj(false);
        }
    }

    public void lx() {
        this.atp = null;
    }

    public void lw() {
        this.oV();
    }

    private final void ak(boolean bl) {
        this.azH = bl;
    }
}

