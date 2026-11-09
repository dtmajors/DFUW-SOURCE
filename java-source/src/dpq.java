/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  clg
 *  lcr
 */
import java.util.List;
import java.util.Map;

public class dpq
extends dpz {
    private static final int gMU = 1;
    private static final int gMV = 2;
    private static final int gMW = 3;
    private static clm eHZ = null;
    private Map<ldv, clg> gMX = lcn.emw();
    private Map<ldv, clg> gMY = lcn.emw();
    private Map<ldv, dpp> gMZ = lcn.emw();
    private Map<ldv, lfs<fhe, clg>> gNa = lcn.emw();
    private Map<ldv, clg> gNb = lcn.emw();
    private Map<ldv, lfs<ph, List<nb>>> gNc = lcn.emw();

    int bsj() {
        return this.gMX.size() + this.gMY.size();
    }

    int bsk() {
        return this.gMY.size();
    }

    boolean nx(ldv ldv2) {
        if (this.gMY.isEmpty()) {
            return false;
        }
        for (clg clg2 : this.gMY.values()) {
            if (!clg2.kQ(ldv2)) continue;
            return true;
        }
        return false;
    }

    dpq(dpx dpx2) {
        super(dpx2);
    }

    @Override
    public void initialize() {
        super.initialize();
        for (dpp dpp2 : this.emh.bsG()) {
            if (!dpp2.aYr()) {
                lfn.b(5, this.getClass().getSimpleName(), "initialise() : Element info is not a house!!!");
                assert (false);
                continue;
            }
            ldv ldv2 = this.MessageDelegator.bzv();
            this.a(1, ldv2, dpp2.bsi(), dpp2.av(), dpp2.aw());
            this.gMZ.put(ldv2, dpp2);
            this.gNH = false;
        }
    }

    @Override
    public void cleanUp() {
        if (!this.gMX.isEmpty()) {
            for (clg clg2 : this.gMX.values()) {
                this.ny(clg2.getGUID());
                this.MessageDelegator.hd(clg2.getGUID());
            }
            this.gMX.clear();
        }
        if (!this.gMY.isEmpty()) {
            for (clg clg2 : this.gMY.values()) {
                this.ny(clg2.getGUID());
                this.MessageDelegator.hd(clg2.getGUID());
            }
            this.gMY.clear();
        }
        this.gMZ.clear();
        this.gNa.clear();
        this.gNb.clear();
        this.gNc.clear();
        super.cleanUp();
    }

    @Override
    void b(pf pf2) {
        pf2.aGJ = lcn.abH(this.gMY.size());
        pf2.aGK = lcn.emw();
        for (clg clg2 : this.gMY.values()) {
            clg2.a(pf2, this.emh.getGUID());
        }
    }

    @Override
    void a(pf pf2) {
        if (pf2.aGJ == null || pf2.aGJ.isEmpty()) {
            return;
        }
        for (ph ph2 : pf2.aGJ) {
            for (clg clg2 : this.gMX.values()) {
                if (!clg2.YD().equals(ph2.aGS)) continue;
                this.a(3, ph2.aGQ, clg2.Yo(), clg2.aAG().azb(), clg2.aAG().azc());
                this.gNc.put(ph2.aGQ, new lfs<ph, List<nb>>(ph2, pf2.aGK.get(ph2.aGQ)));
                this.gNb.put(ph2.aGQ, clg2);
                this.gNI = false;
            }
        }
    }

    public void a(fhe fhe2, clg clg2) {
        if (fhe2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "replaceBaseWithHouse() : Claim request is null!!!");
            assert (false);
            return;
        }
        if (clg2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "replaceBaseWithHouse() : House base is null!!!");
            assert (false);
            return;
        }
        ldv ldv2 = this.MessageDelegator.bzw();
        this.a(2, ldv2, clg2.Yo(), clg2.aAG().azb(), clg2.aAG().azc());
        this.gNa.put(ldv2, new lfs<fhe, clg>(fhe2, clg2));
    }

    private void a(int n, ldv ldv2, int n2, ljq ljq2, lgl lgl2) {
        fgx fgx2 = (fgx)this.MessageDelegator.h(23809, this.GUID, lcr.qBC);
        fgx2.sk(n);
        fgx2.aGQ = ldv2;
        fgx2.ResourceType = n2;
        fgx2.Position = ljq2;
        fgx2.Rotation = lgl2;
        fgx2.ikP = true;
        this.MessageDelegator.F(fgx2);
    }

    private void ny(ldv ldv2) {
        fhq fhq2 = (fhq)this.MessageDelegator.h(23811, this.GUID, lcr.qBC);
        fhq2.ilY = true;
        fhq2.aGQ = ldv2;
        this.MessageDelegator.F(fhq2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 23810: {
                this.a((fgy)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(fgy fgy2) {
        Object object;
        if (fgy2.aGQ == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleHouseCreateResponseMessage() : HouseGUID is null!!!");
            assert (false);
            return;
        }
        if (fgy2.iMh == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleHouseCreateResponseMessage() : House is null!!!");
            assert (false);
            return;
        }
        if (eHZ == null && (eHZ = ((jwv)(object = new jwv())).uU("houseupgradedefinitions.xml")) == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleHouseCreateResponseMessage() : House upgrade definition info failed to parse!!!");
            assert (false);
            return;
        }
        object = fgy2.bPz();
        object.a(this);
        switch (fgy2.aVk()) {
            case 1: {
                dpp dpp2 = this.gMZ.remove(fgy2.bPy());
                if (dpp2 == null) {
                    lfn.b(5, this.getClass().getSimpleName(), "handleHouseCreateResponseMessage() : Failed to find element info for created house base!!!");
                    assert (false);
                    return;
                }
                object.dr(dpp2.getGUID());
                object.iy(dpp2.az());
                object.gk(true);
                object.a(eHZ);
                object.Hy();
                this.MessageDelegator.a((amf)object);
                this.gMX.put(object.getGUID(), (clg)object);
                this.gNH = this.gMZ.isEmpty();
                if (!this.gNH) break;
                this.emh.bsI();
                break;
            }
            case 2: {
                lfs<fhe, clg> lfs2 = this.gNa.remove(object.getGUID());
                if (lfs2 == null) {
                    lfn.b(5, this.getClass().getSimpleName(), "handleHouseCreateResponseMessage() : Claim request and base not found for created house!!!");
                    assert (false);
                    return;
                }
                this.ny(((clg)lfs2.reY).getGUID());
                this.gMX.remove(((clg)lfs2.reY).getGUID());
                this.MessageDelegator.hd(((clg)lfs2.reY).getGUID());
                object.dr(((clg)lfs2.reY).YD());
                object.iy(((clg)lfs2.reY).Yo());
                object.gk(false);
                object.a(eHZ);
                object.Hy();
                this.MessageDelegator.a((amf)object);
                this.gMY.put(object.getGUID(), (clg)object);
                object.b((fhe)lfs2.reX);
                this.emh.bsP();
                break;
            }
            case 3: {
                clg clg2 = this.gNb.remove(object.getGUID());
                if (clg2 == null) {
                    lfn.b(5, this.getClass().getSimpleName(), "handleHouseCreateResponseMessage() : House base not found for restored house!!!");
                    assert (false);
                    return;
                }
                this.ny(clg2.getGUID());
                this.gMX.remove(clg2.getGUID());
                this.MessageDelegator.hd(clg2.getGUID());
                lfs<ph, List<nb>> lfs3 = this.gNc.remove(object.getGUID());
                if (lfs3 == null) {
                    lfn.b(5, this.getClass().getSimpleName(), "handleHouseCreateResponseMessage() : Persistence data not found for restored house!!!");
                    assert (false);
                    return;
                }
                object.dr(clg2.YD());
                object.iy(clg2.Yo());
                object.gk(false);
                object.a(eHZ);
                object.Hy();
                this.MessageDelegator.a((amf)object);
                this.gMY.put(object.getGUID(), (clg)object);
                object.b((ph)lfs3.reX, (List)lfs3.reY);
                this.gNI = this.gNb.isEmpty();
                if (!this.gNI) break;
                this.emh.bsM();
                break;
            }
        }
    }
}

