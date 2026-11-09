/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cdb
 *  cph
 *  dtc
 *  lcr
 *  lcw
 */
import java.util.Map;

public class dsx
extends btk
implements bto {
    private Map<ldv, dsw> gZD = lcn.emw();
    private Map<ldv, dsw> gZE = lcn.emw();
    private Map<ldv, dsw> gZF = lcn.emw();
    private dtc fy = null;

    public void a(dsw dsw2) {
        assert (dsw2 != null);
        assert (dsw2.gqN > 0);
        assert (dsw2.GUID != null);
        assert (dsw2.hA != null);
        assert (dsw2.eSR != null);
        switch (dsw2.gqN) {
            case 1281: {
                dti dti2 = (dti)dsw2;
                assert (dti2.bhh >= 0);
                assert (dti2.tt != null);
                assert (dti2.bhi != null);
                assert (dti2.bhj != null);
                if (this.c(dsw2)) {
                    lfn.b(5, "SFEngineRelationManager", "createEngineRelation() Relation already exists.");
                    return;
                }
                this.gZD.put(dsw2.GUID, dsw2);
                break;
            }
            case 1282: {
                dtj dtj2 = (dtj)dsw2;
                assert (dtj2.biB > 0);
                assert (dtj2.biE != null);
                assert (dtj2.biF != null);
                if (this.c(dsw2)) {
                    lfn.b(5, "SFEngineRelationManager", "createEngineRelation() Relation already exists.");
                    return;
                }
                this.gZD.put(dsw2.GUID, dsw2);
                break;
            }
            default: {
                lfn.b(5, "SFEngineRelationManager", "createEngineRelation() Unhandled RelationType: " + dsw2.gqN);
                assert (false);
                return;
            }
        }
    }

    public void a(int n, ldv ldv2, ldv ldv3, ldv ldv4, uk[] ukArray) {
        assert (n > 0);
        assert (ldv2 != null);
        assert (ldv3 != null);
        assert (ldv4 != null);
        assert (ukArray != null);
        switch (n) {
            case 1281: {
                dti dti2 = new dti();
                dti2.gqN = n;
                dti2.GUID = this.nU(ldv2);
                dti2.hA = this.nU(ldv3);
                dti2.eSR = this.nU(ldv4);
                int n2 = ukArray.length;
                block20: for (int i = 0; i < n2; ++i) {
                    switch (ukArray[i].Uo) {
                        case 3: {
                            dti2.bhI = ((tz)ukArray[i]).Pp;
                            continue block20;
                        }
                        case 4: {
                            dti2.bhh = ((uh)ukArray[i]).PC;
                            continue block20;
                        }
                        case 5: {
                            dti2.tt = ((uo)ukArray[i]).Value;
                            continue block20;
                        }
                        case 6: {
                            dti2.bhi = ((uq)ukArray[i]).Qi;
                            continue block20;
                        }
                        case 7: {
                            dti2.bhj = ((uq)ukArray[i]).Qi;
                            continue block20;
                        }
                        case 8: {
                            dti2.bhk = ((tz)ukArray[i]).Pp;
                        }
                    }
                }
                assert (dti2.bhh >= 0);
                assert (dti2.tt != null);
                assert (dti2.bhi != null);
                assert (dti2.bhj != null);
                if (this.c(dti2)) {
                    lfn.b(5, "SFEngineRelationManager", "createEngineRelation() Relation already exists.");
                    return;
                }
                this.gZD.put(dti2.GUID, dti2);
                break;
            }
            case 1282: {
                dtj dtj2 = new dtj();
                dtj2.gqN = n;
                dtj2.GUID = this.nU(ldv2);
                dtj2.hA = this.nU(ldv3);
                dtj2.eSR = this.nU(ldv4);
                int n3 = ukArray.length;
                block21: for (int i = 0; i < n3; ++i) {
                    switch (ukArray[i].Uo) {
                        case 3: {
                            dtj2.bhI = ((tz)ukArray[i]).Pp;
                            continue block21;
                        }
                        case 4: {
                            dtj2.biB = ((uh)ukArray[i]).PC;
                            continue block21;
                        }
                        case 5: {
                            dtj2.biC = ((uh)ukArray[i]).PC;
                            continue block21;
                        }
                        case 6: {
                            dtj2.biD = ((tz)ukArray[i]).Pp;
                            continue block21;
                        }
                        case 7: {
                            dtj2.biE = ((uq)ukArray[i]).Qi;
                            continue block21;
                        }
                        case 8: {
                            dtj2.biF = ((um)ukArray[i]).aXj;
                        }
                    }
                }
                assert (dtj2.biB > 0);
                assert (dtj2.biE != null);
                assert (dtj2.biF != null);
                if (this.c(dtj2)) {
                    lfn.b(5, "SFEngineRelationManager", "createEngineRelation() Relation already exists.");
                    return;
                }
                this.gZD.put(dtj2.GUID, dtj2);
                break;
            }
            default: {
                lfn.b(5, "SFEngineRelationManager", "createEngineRelation() Unhandled RelationType: " + n);
                assert (false);
                return;
            }
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        this.bzb();
    }

    @Override
    public void initialize() {
        super.initialize();
        this.fy = this.MessageDelegator.bzx().bzt();
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 768: {
                this.b((ktu)ktv2);
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    public void nT(ldv ldv2) {
        block15: {
            block14: {
                assert (ldv2 != null);
                dsw dsw2 = this.gZD.get(ldv2);
                if (dsw2 != null) {
                    switch (dsw2.gZw) {
                        case gZx: {
                            this.gZD.remove(ldv2);
                            break;
                        }
                        case gZy: {
                            dsw2.gZw = dsw.a.gZB;
                            break;
                        }
                        case gZA: {
                            dsw2.gZw = dsw.a.gZB;
                            this.gZD.remove(ldv2);
                            break;
                        }
                        default: {
                            lfn.b(5, "SFEngineRelationManager", "removeEngineRelation() Invalid state in delayed relation: " + (Object)((Object)dsw2.gZw));
                            lfn.b(5, "SFEngineRelationManager", "removeEngineRelation() " + dsw2);
                            assert (false);
                            break;
                        }
                    }
                    return;
                }
                dsw2 = this.gZE.get(ldv2);
                if (dsw2 == null) break block14;
                switch (dsw2.gZw) {
                    case gZz: {
                        this.e(dsw2);
                        dsw2.gZw = dsw.a.gZB;
                        this.gZE.remove(ldv2);
                        break block15;
                    }
                    case gZB: {
                        lfn.b(5, "SFEngineRelationManager", "removeEngineRelation() Relation " + dsw2.GUID + " is already removed.");
                        assert (false);
                        break block15;
                    }
                    default: {
                        lfn.b(5, "SFEngineRelationManager", "removeEngineRelation() Invalid state in delayed relation: " + (Object)((Object)dsw2.gZw));
                        lfn.b(5, "SFEngineRelationManager", "removeEngineRelation() " + dsw2);
                        assert (false);
                        break block15;
                    }
                }
            }
            lfn.b(5, "SFEngineRelationManager", "removeEngineRelation() Could not find relation " + ldv2);
        }
    }

    public void a(int n, ldv ldv2, uk[] ukArray) {
        dsw dsw2 = this.gZE.get(ldv2 = this.nU(ldv2));
        if (dsw2 == null && (dsw2 = this.gZD.get(ldv2)) == null) {
            lfn.b(5, "SFEngineRelationManager", "updateEngineRelation() Could not find relation " + ldv2);
            return;
        }
        switch (n) {
            case 1282: {
                dtj dtj2 = (dtj)dsw2;
                int n2 = ukArray.length;
                block13: for (int i = 0; i < n2; ++i) {
                    switch (ukArray[i].Uo) {
                        case 5: {
                            dtj2.biC = ((uh)ukArray[i]).PC;
                            continue block13;
                        }
                        case 7: {
                            dtj2.biE = ((uq)ukArray[i]).Qi;
                            continue block13;
                        }
                        case 8: {
                            dtj2.biF = ((um)ukArray[i]).aXj;
                        }
                    }
                }
                assert (dtj2.biE != null);
                assert (dtj2.biF != null);
                break;
            }
            default: {
                lfn.b(5, "SFEngineRelationManager", "updateEngineRelation() Unhandled RelationType: " + n);
                assert (false);
                return;
            }
        }
        switch (dsw2.gZw) {
            case gZx: 
            case gZy: {
                break;
            }
            case gZz: {
                this.f(dsw2);
                break;
            }
            case gZB: {
                lfn.b(5, "SFEngineRelationManager", "updateEngineRelation() Skip updating removed relation.");
                lfn.b(5, "SFEngineRelationManager", "updateEngineRelation() " + dsw2);
                break;
            }
            default: {
                lfn.b(5, "SFEngineRelationManager", "updateEngineRelation() Invalid state in relation: " + (Object)((Object)dsw2.gZw));
                lfn.b(5, "SFEngineRelationManager", "updateEngineRelation() " + dsw2);
                assert (false);
                break;
            }
        }
    }

    private boolean b(dsw dsw2) {
        assert (dsw2 != null);
        assert (dsw2.gZw == dsw.a.gZx);
        switch (dsw2.gqN) {
            case 1281: {
                bvd bvd2 = (bvd)this.fy.d(dsw2.hA);
                if (bvd2 == null || !bvd2.isReadyToRun()) {
                    return false;
                }
                bvd bvd3 = (bvd)this.fy.d(dsw2.eSR);
                if (bvd3 == null || !bvd3.isReadyToRun()) {
                    return false;
                }
                if (dsw2.bhI) {
                    dti dti2 = (dti)dsw2;
                    cph cph2 = null;
                    cdb cdb2 = null;
                    if (bvd2.aze() != null && bvd2.aze() instanceof cph) {
                        cph2 = (cph)bvd2.aze();
                    }
                    if (bvd3.aze() != null && bvd3.aze() instanceof cdb) {
                        cdb2 = (cdb)bvd3.aze();
                    }
                    if (cph2 != null && cdb2 != null) {
                        if (!cdb2.aJI()) {
                            dti2.bhk = true;
                        }
                        cph2.a(cdb2, dti2.bhi, dti2.bhj);
                    }
                }
                return true;
            }
            case 1282: {
                bvd bvd4 = (bvd)this.fy.d(dsw2.hA);
                if (bvd4 == null || !bvd4.isReadyToRun()) {
                    return false;
                }
                bvd bvd5 = (bvd)this.fy.d(dsw2.eSR);
                if (bvd5 == null || !bvd5.isReadyToRun()) {
                    return false;
                }
                if (dsw2.bhI) {
                    dtj dtj2 = (dtj)dsw2;
                    cph cph3 = null;
                    cph cph4 = null;
                    cdb cdb3 = null;
                    if (bvd4.aze() != null && bvd4.aze() instanceof cph) {
                        cph3 = (cph)bvd4.aze();
                        cph3.a(dsw2.GUID, dsw2.hA, dsw2.eSR, new ljq(dtj2.biE), new lgl(dtj2.biF), bvd5);
                    }
                    if (bvd5.aze() != null && bvd5.aze() instanceof cph) {
                        cph4 = (cph)bvd5.aze();
                        cph4.a(dsw2.GUID, dsw2.hA, dsw2.eSR, new ljq(dtj2.biE), new lgl(dtj2.biF), bvd4);
                    } else if (bvd5.aze() != null && bvd5.aze() instanceof cdb) {
                        cdb3 = (cdb)bvd5.aze();
                    }
                    if (cph4 != null && cph3 != null) {
                        cph3.a(cph4, dtj2.biE, dtj2.biF);
                        cph4.i(cph3);
                    }
                    if (cph3 != null && cdb3 != null) {
                        cph3.a(cdb3, dtj2.biE, dtj2.biF);
                    }
                }
                return true;
            }
        }
        lfn.b(5, "SFEngineRelationManager", "canRelationBeCreated() Unhandled RelationType: " + dsw2.gqN);
        assert (false);
        return false;
    }

    private void bzb() {
        if (this.gZD.isEmpty()) {
            return;
        }
        block4: for (dsw dsw2 : this.gZD.values()) {
            switch (dsw2.gZw) {
                case gZx: {
                    if (!this.b(dsw2)) continue block4;
                    this.d(dsw2);
                    dsw2.gZw = dsw.a.gZy;
                    continue block4;
                }
                case gZy: 
                case gZA: 
                case gZz: 
                case gZB: {
                    return;
                }
            }
            lfn.b(5, "SFEngineRelationManager", "checkDelayedEngineRelations() Invalid state in relation: " + (Object)((Object)dsw2.gZw));
            lfn.b(5, "SFEngineRelationManager", "checkDelayedEngineRelations() " + dsw2);
            assert (false);
            return;
        }
    }

    private boolean c(dsw dsw2) {
        assert (dsw2 != null);
        dsw dsw3 = this.gZD.get(dsw2.GUID);
        if (dsw3 != null) {
            lfn.b(5, "SFEngineRelationManager", "containsRelation() Relation: " + dsw2);
            lfn.b(5, "SFEngineRelationManager", "containsRelation() DelayedRelation: " + dsw3);
            return true;
        }
        dsw dsw4 = this.gZE.get(dsw2.GUID);
        if (dsw4 != null) {
            lfn.b(5, "SFEngineRelationManager", "containsRelation() Relation: " + dsw2);
            lfn.b(5, "SFEngineRelationManager", "containsRelation() CreatedRelation: " + dsw4);
            return true;
        }
        return false;
    }

    private ldv nU(ldv ldv2) {
        if (ldv2.ib() == this.GUID.ib()) {
            return ldv2;
        }
        if (lcw.emZ()) {
            return lcr.p((ldv)ldv2, (int)this.GUID.ib(), (int)ldv2.enw());
        }
        return lcr.ak((ldv)ldv2, (int)this.GUID.ib());
    }

    private void d(dsw dsw2) {
        assert (dsw2 != null);
        assert (dsw2.gZw == dsw.a.gZx);
        switch (dsw2.gqN) {
            case 1281: {
                dti dti2 = (dti)dsw2;
                knd knd2 = (knd)this.MessageDelegator.h(775);
                knd2.ec = this.GUID;
                knd2.dsK = false;
                knd2.iBr = true;
                knd2.doP = dsw2.GUID;
                knd2.ehv = dsw2.hA;
                knd2.ehw = dsw2.eSR;
                knd2.jfk = 1;
                knd2.bhh = dti2.bhh;
                knd2.bhk = dti2.bhk;
                knd2.tt = dti2.tt;
                knd2.bhi = dti2.bhi;
                knd2.bhj = dti2.bhj;
                knd2.gSf = new ljq(1.0f, 1.0f, 1.0f);
                this.MessageDelegator.a(knd2);
                this.gZF.put(knd2.getGUID(), dsw2);
                break;
            }
            case 1282: {
                dtj dtj2 = (dtj)dsw2;
                kni kni2 = (kni)this.MessageDelegator.h(782);
                kni2.ec = this.GUID;
                kni2.dsK = false;
                kni2.iBr = true;
                kni2.doP = dsw2.GUID;
                kni2.ehv = dsw2.hA;
                kni2.ehw = dsw2.eSR;
                kni2.pPN = dtj2.biB;
                kni2.biD = dtj2.biD;
                kni2.biE = dtj2.biE;
                kni2.biF = dtj2.biF;
                this.MessageDelegator.a(kni2);
                this.gZF.put(kni2.getGUID(), dsw2);
                break;
            }
            default: {
                lfn.b(5, "SFEngineRelationManager", "createRelationInEngine() Unhandled RelationType: " + dsw2.gqN);
                assert (false);
                return;
            }
        }
        dsw2.gZw = dsw.a.gZy;
    }

    private void b(ktu ktu2) {
        block17: {
            dsw dsw2;
            block16: {
                dsw2 = this.gZF.remove(ktu2.dXg());
                if (dsw2 == null) {
                    lfn.b(5, "SFEngineRelationManager", "handleRelationRespose() No relation mapped to " + ktu2.dXg());
                    assert (false);
                    return;
                }
                assert (this.gZD.containsKey(dsw2.GUID));
                assert (!this.gZE.containsKey(dsw2.GUID));
                dsw dsw3 = this.gZD.remove(dsw2.GUID);
                if (dsw3 == null) {
                    lfn.b(5, "SFEngineRelationManager", "handleRelationRespose() Relation not found in DelayedEngineRelationMap.");
                    lfn.b(5, "SFEngineRelationManager", "handleRelationRespose() " + dsw2);
                    assert (false);
                    return;
                }
                if (ktu2.getResult() != 0) break block16;
                switch (dsw2.gZw) {
                    case gZy: {
                        this.gZE.put(dsw2.GUID, dsw2);
                        dsw2.gZw = dsw.a.gZz;
                        break block17;
                    }
                    case gZB: {
                        this.gZE.put(dsw2.GUID, dsw2);
                        dsw2.gZw = dsw.a.gZz;
                        this.nT(dsw2.GUID);
                        break block17;
                    }
                    default: {
                        lfn.b(5, "SFEngineRelationManager", "handleRelationRespose() Invalid state in relation: " + (Object)((Object)dsw2.gZw));
                        lfn.b(5, "SFEngineRelationManager", "handleRelationRespose() " + dsw2);
                        assert (false);
                        return;
                    }
                }
            }
            lfn.b(5, "SFEngineRelationManager", "handleRelationRespose() Relation " + dsw2.GUID + " failed to be created.");
            lfn.b(5, "SFEngineRelationManager", "handleRelationRespose() " + dsw2);
            switch (dsw2.gZw) {
                case gZy: {
                    dsw2.gZw = dsw.a.gZA;
                    break;
                }
                case gZB: {
                    break;
                }
                default: {
                    lfn.b(5, "SFEngineRelationManager", "handleRelationRespose() Invalid state in relation: " + (Object)((Object)dsw2.gZw));
                    lfn.b(5, "SFEngineRelationManager", "handleRelationRespose() " + dsw2);
                    assert (false);
                    return;
                }
            }
        }
    }

    private void e(dsw dsw2) {
        assert (dsw2 != null);
        assert (dsw2.gZw == dsw.a.gZz);
        switch (dsw2.gqN) {
            case 1281: {
                knd knd2;
                dti dti2 = (dti)dsw2;
                bvd bvd2 = (bvd)this.fy.d(dsw2.hA);
                bvd bvd3 = (bvd)this.fy.d(dsw2.eSR);
                if (dsw2.bhI && bvd2 != null && bvd3 != null) {
                    knd2 = null;
                    cdb cdb2 = null;
                    if (bvd2.aze() != null && bvd2.aze() instanceof cph) {
                        knd2 = (cph)bvd2.aze();
                    }
                    if (bvd3.aze() != null && bvd3.aze() instanceof cdb) {
                        cdb2 = (cdb)bvd3.aze();
                    }
                    if (knd2 != null && cdb2 != null) {
                        knd2.g(cdb2);
                    }
                }
                knd2 = (knd)this.MessageDelegator.h(775);
                knd2.ec = this.GUID;
                knd2.hsP = true;
                knd2.iBr = false;
                knd2.dsK = false;
                knd2.jfk = 2;
                knd2.doP = dsw2.GUID;
                knd2.ehv = dsw2.hA;
                knd2.ehw = dsw2.eSR;
                knd2.tt = dti2.tt;
                this.MessageDelegator.a(knd2);
                break;
            }
            case 1282: {
                knj knj2;
                dtj dtj2 = (dtj)dsw2;
                bvd bvd4 = (bvd)this.fy.d(dsw2.hA);
                bvd bvd5 = (bvd)this.fy.d(dsw2.eSR);
                if (dsw2.bhI && bvd4 != null && bvd5 != null) {
                    knj2 = null;
                    cph cph2 = null;
                    cdb cdb3 = null;
                    if (bvd4.aze() != null && bvd4.aze() instanceof cph) {
                        knj2 = (cph)bvd4.aze();
                    }
                    if (bvd5.aze() != null && bvd5.aze() instanceof cph) {
                        cph2 = (cph)bvd5.aze();
                    }
                    if (bvd5.aze() != null && bvd5.aze() instanceof cdb) {
                        cdb3 = (cdb)bvd5.aze();
                    }
                    if (knj2 != null && cph2 != null) {
                        knj2.h(cph2);
                        cph2.j((cph)knj2);
                    }
                    if (knj2 != null && cdb3 != null) {
                        knj2.g(cdb3);
                    }
                }
                knj2 = (knj)this.MessageDelegator.h(778);
                knj2.ec = this.GUID;
                knj2.hsP = true;
                knj2.iBr = false;
                knj2.dsK = false;
                knj2.pPN = 1;
                knj2.doP = dsw2.GUID;
                knj2.ehv = dsw2.hA;
                knj2.ehw = dsw2.eSR;
                this.MessageDelegator.a(knj2);
                break;
            }
            default: {
                lfn.b(5, "SFEngineRelationManager", "removeRelationInEngine() Unhandled RelationType found: " + dsw2.gqN);
                assert (false);
                return;
            }
        }
    }

    public void f(dsw dsw2) {
        assert (dsw2 != null);
        assert (dsw2.gZw == dsw.a.gZz);
        switch (dsw2.gqN) {
            case 1282: {
                dtj dtj2 = (dtj)dsw2;
                knj knj2 = (knj)this.MessageDelegator.h(778);
                knj2.ec = this.GUID;
                knj2.dsK = false;
                knj2.iBr = false;
                knj2.doP = dsw2.GUID;
                knj2.ehv = dsw2.hA;
                knj2.ehw = dsw2.eSR;
                knj2.pPN = dtj2.biC;
                knj2.biE = dtj2.biE;
                knj2.biF = dtj2.biF;
                this.MessageDelegator.a(knj2);
                break;
            }
            default: {
                lfn.b(5, "SFEngineRelationManager", "updateRelationInEngine() Unhandled RelationType: " + dsw2.gqN);
                assert (false);
                return;
            }
        }
    }
}

