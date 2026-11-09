/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  axx
 *  ayd
 *  bqk
 *  bri
 *  cbj
 *  cbx
 *  cdb
 *  cex
 *  clg
 *  cph
 *  ep
 *  ha
 */
import java.util.Map;

public class ahv {
    private final ix SW;
    private final Map<ie, id> bmR;

    public ahv(ix ix2) {
        this.SW = ix2;
        this.bmR = lea.eoB();
    }

    public final ahs a(ldv ldv2, dek dek2) {
        ahs ahs2 = (ahs)this.a(ahu.c.bmI, ldv2);
        ahs2.setObjectType(73);
        ahs2.b(dek2);
        return ahs2;
    }

    public final aht a(ahu.c c2, ldv ldv2) {
        return this.a(c2, 0, ldv2);
    }

    public final aht i(amf amf2) {
        aht aht2 = null;
        if (amf2 instanceof bvd) {
            bvd bvd2 = (bvd)amf2;
            assert (bvd2.isReadyToRun());
            aht2 = bve.b(bvd2.aza()) ? this.b(bvd2) : this.a(bvd2);
        } else if (amf2 instanceof cbx) {
            aht2 = amf2 instanceof ccd ? this.a((ccd)((Object)amf2)) : this.e((cbx)amf2);
        } else if (amf2 instanceof bqk) {
            if (amf2 instanceof bri) {
                aht2 = this.a((bri)amf2);
            } else if (amf2 instanceof brl) {
                aht2 = this.a((brl)((Object)amf2));
            }
        } else if (amf2 instanceof bqv) {
            aht2 = this.a((bqv)amf2);
        } else if (amf2 instanceof cxc) {
            cxc cxc2 = (cxc)amf2;
            if (!cxc2.bft()) {
                aht2 = this.a((cxc)amf2);
            }
        } else if (amf2 instanceof dul) {
            dul dul2 = (dul)amf2;
            if (dul2.bBj() == 1024) {
                aht2 = this.b((dul)amf2);
            }
        } else if (amf2 instanceof bnx) {
            aht2 = this.a((bnx)amf2);
        } else if (amf2 instanceof bnp) {
            aht2 = this.a((bnp)amf2);
        } else if (amf2 instanceof dl) {
            aht2 = this.j(amf2);
        } else if (amf2 instanceof bws) {
            aht2 = this.a((bws)amf2);
        } else if (amf2 instanceof cbj) {
            aht2 = this.a((cbj)amf2);
        } else if (amf2 instanceof ha) {
            aht2 = this.g((ha)amf2);
        } else if (amf2 instanceof axx) {
            aht2 = this.a((axx)amf2);
        } else if (!(amf2 instanceof ayd)) {
            if (amf2 instanceof cat) {
                aht2 = this.a((cat)amf2);
            } else if (amf2 instanceof ati) {
                aht2 = this.a((ati)amf2);
            } else if (amf2 instanceof cdf) {
                aht2 = this.a((cdf)amf2);
            }
        }
        return aht2;
    }

    private aht a(ahu.c c2, int n, ldv ldv2) {
        aht aht2 = null;
        switch (c2) {
            case bmf: {
                aht2 = new afr();
                break;
            }
            case bmg: {
                aht2 = new afs();
                break;
            }
            case bmh: {
                aht2 = new afu();
                break;
            }
            case bmi: {
                aht2 = new afx();
                break;
            }
            case bmj: {
                aht2 = new agb();
                break;
            }
            case bmk: {
                aht2 = new agc();
                break;
            }
            case bml: {
                aht2 = new agd();
                break;
            }
            case bmm: {
                aht2 = new agh();
                break;
            }
            case bmn: {
                aht2 = new agi();
                break;
            }
            case bmo: {
                aht2 = new agl();
                break;
            }
            case bmp: {
                aht2 = new agm();
                break;
            }
            case bmq: {
                aht2 = new agn();
                break;
            }
            case bmr: {
                aht2 = new agq();
                break;
            }
            case bms: {
                aht2 = new agr();
                break;
            }
            case bmt: {
                aht2 = new ags();
                break;
            }
            case bmu: {
                aht2 = new agx();
                break;
            }
            case bmv: {
                aht2 = new agy();
                break;
            }
            case bmw: {
                aht2 = new aha();
                break;
            }
            case bmx: {
                aht2 = new ahb();
                break;
            }
            case bmy: {
                aht2 = new ahc();
                break;
            }
            case bmz: {
                aht2 = new ahd();
                break;
            }
            case bmA: {
                aht2 = new ahf();
                break;
            }
            case bmB: {
                aht2 = new ahh();
                break;
            }
            case bmC: {
                aht2 = new ahi();
                break;
            }
            case bmD: {
                aht2 = new ahj();
                break;
            }
            case bmP: {
                aht2 = new aie();
                break;
            }
            case bmE: {
                aht2 = new ahl();
                break;
            }
            case bmG: {
                aht2 = new ahr();
                break;
            }
            case bmF: {
                aht2 = new ahm();
                break;
            }
            case bmH: {
                aht2 = new ahp();
                break;
            }
            case bmI: {
                aht2 = new ahs();
                break;
            }
            case bmJ: {
                aht2 = new aib();
                break;
            }
            case bmK: {
                aht2 = new aic();
                break;
            }
            case bmL: {
                aht2 = new aid();
                break;
            }
            case bmM: {
                aht2 = new aif();
                break;
            }
            case bmN: {
                aht2 = new aii();
                break;
            }
            case bmO: {
                aht2 = new aik();
                break;
            }
            default: {
                lfn.b(5, "SFStateObjectFactory", "createStateObject() Invalid stateobjecttype provided: '" + c2.name() + "'");
                assert (false);
                return null;
            }
        }
        if (ldv2 == null) {
            return aht2;
        }
        aht2.setGUID(ldv2);
        ie ie2 = new ie(c2, n);
        id id2 = this.bmR.get(ie2);
        if (id2 == null) {
            lfn.b(5, "SFStateObjectFactory", "createStateObject() No stateobjectdefinition mapped to " + ie2);
            assert (false);
            return null;
        }
        if (id2 instanceof if) {
            id2 = ((if)id2).nc();
        }
        aht2.b(id2);
        if (aht2 instanceof aia) {
            aia aia2 = (aia)aht2;
            this.a(aia2);
        }
        aht2.initialize();
        return aht2;
    }

    private void a(aia aia2) {
        agw agw2;
        int n;
        int n2;
        hl[] hlArray;
        assert (aia2 != null);
        assert (aia2.By() != null);
        id id2 = aia2.By();
        ik ik2 = this.SW.nM().agp.bp(aia2.getGUID().bFk());
        if (id2.afk == null && id2.afl == null) {
            agw agw3 = new agw();
            aia2.BI().add(agw3);
            return;
        }
        if (id2.afk != null) {
            if (ik2 == null) {
                lfn.b(5, "SFStateObjectFactory", "configureStateObject() Could not find subscriber for stateobject " + aia2);
                assert (false);
                return;
            }
            hlArray = id2.afk;
            n2 = hlArray.length;
            for (n = 0; n < n2; ++n) {
                agw2 = new agw();
                if (!hlArray[n].lX()) {
                    this.a(((hm)hlArray[n]).adl, ik2, agw2.adE);
                    if (agw2.adE.hZ().length == 0) {
                        lfn.b(5, "SFStateObjectFactory", "configureStateObject() No keys were added to the keyset.");
                        assert (false);
                    }
                }
                aia2.BI().add(agw2);
            }
        }
        if (id2.afl != null) {
            assert (ik2 != null);
            hlArray = id2.afl;
            n2 = hlArray.length;
            for (n = 0; n < n2; ++n) {
                agw2 = new agw();
                if (!hlArray[n].lX()) {
                    this.a(((hn)hlArray[n]).adl, ik2, agw2.adE);
                    if (agw2.adE.hZ().length == 0) {
                        lfn.b(5, "SFStateObjectFactory", "configureStateObject() No keys were added to the keyset.");
                        assert (false);
                    }
                }
                aia2.BJ().add(agw2);
            }
        }
    }

    private void a(int[] nArray, ik ik2, gm gm2) {
        assert (nArray != null);
        assert (nArray.length > 0);
        assert (ik2 != null);
        assert (gm2 != null);
        assert (gm2.hZ().length == 0);
        gj gj2 = null;
        int n = nArray.length;
        for (int i = 0; i < n; ++i) {
            gj2 = ik2.bV(nArray[i]);
            if (gj2 == null) continue;
            gm2.a(gj2);
        }
    }

    public final ahl b(int n, ldv ldv2, ldv ldv3, ldv ldv4) {
        ahl ahl2 = (ahl)this.a(ahu.c.bmE, ldv2);
        ahl2.setObjectType(37);
        ahl2.fn(n);
        ahl2.cM(ldv3);
        ahl2.cN(ldv4);
        return ahl2;
    }

    private void a(ahh ahh2, cbx cbx2) {
        assert (ahh2 != null);
        assert (cbx2 != null);
        ahh2.setObjectType(cbx2.getObjectType());
        ahh2.fn(cbx2.az());
        ahh2.l(cbx2.az());
        ahh2.do(cbx2.vf());
        if (cbx2.fi().getAttributeMap().isEmpty()) {
            return;
        }
        for (ej ej2 : cbx2.fi().getAttributeMap().values()) {
            if (!ep.aW((int)ej2.getType())) continue;
            ahh2.a(ej2.fn(), -1);
        }
    }

    private afu a(ati ati2) {
        afu afu2 = (afu)this.a(ahu.c.bmh, ati2.getGUID());
        afu2.setObjectType(ati2.getObjectType());
        return afu2;
    }

    private afx a(ccd ccd2) {
        afx afx2 = null;
        if (ccd2 instanceof ccj) {
            ccj ccj2 = (ccj)ccd2;
            agd agd2 = (agd)this.a(ahu.c.bml, ccd2.getGUID());
            agd2.cz(ccj2.Xt());
            agd2.cA(ccj2.aIQ());
            agd2.al(ccj2.Xv());
            agd2.X(ccj2.Xu());
            agd2.a(ccj2.Xz());
            afx2 = agd2;
        } else if (ccd2 instanceof ccn) {
            ccn ccn2 = (ccn)ccd2;
            ahm ahm2 = (ahm)this.a(ahu.c.bmF, ccd2.getGUID());
            afx2 = ahm2;
        } else {
            afx2 = (afx)this.a(ahu.c.bmi, ccd2.getGUID());
        }
        this.a(afx2, ccd2);
        return afx2;
    }

    private agb a(axx axx2) {
        agb agb2 = (agb)this.a(ahu.c.bmj, axx2.getGUID());
        agb2.setObjectType(axx2.getObjectType());
        agb2.setID(axx2.Xt());
        agb2.c(axx2.Xv());
        return agb2;
    }

    private agc a(ayd ayd2) {
        agc agc2 = (agc)this.a(ahu.c.bmk, ayd2.getGUID());
        agc2.setObjectType(ayd2.getObjectType());
        if if_ = (if)agc2.By();
        return agc2;
    }

    private agi j(amf amf2) {
        agi agi2 = (agi)this.a(ahu.c.bmn, amf2.getGUID());
        agi2.setObjectType(amf2.getObjectType());
        return agi2;
    }

    private agm a(bnp bnp2) {
        agm agm2 = (agm)this.a(ahu.c.bmp, bnp2.getGUID());
        agm2.setObjectType(bnp2.getObjectType());
        agm2.fn(bnp2.arW());
        return agm2;
    }

    private agn a(bnx bnx2) {
        agn agn2 = (agn)this.a(ahu.c.bmq, bnx2.getGUID());
        agn2.setObjectType(bnx2.getObjectType());
        agn2.fa(bnx2.asc());
        agn2.Y(bnx2.asd());
        agn2.fb(bnx2.getGUID().ib());
        return agn2;
    }

    private agq a(bqv bqv2) {
        agq agq2 = (agq)this.a(ahu.c.bmr, bqv2.getObjectType(), bqv2.getGUID());
        agq2.setObjectType(bqv2.getObjectType());
        return agq2;
    }

    private agr a(bri bri2) {
        agr agr2 = (agr)this.a(ahu.c.bms, bri2.getObjectType(), bri2.getGUID());
        agr2.setObjectType(bri2.getObjectType());
        agr2.a(bri2.alX());
        agr2.Z(bri2.aum());
        agr2.AO().AZ().setGUID(bri2.getGUID());
        if (bri2.aun().awa() != null) {
            agr2.a(bri2.aun().awa(), 0);
        }
        if (bri2.aun().awc() != null) {
            agr2.a(bri2.aun().awc(), 0);
        }
        return agr2;
    }

    private ags a(brl brl2) {
        ags ags2 = (ags)this.a(ahu.c.bmt, brl2.getGUID());
        ags2.setObjectType(brl2.getObjectType());
        ags2.a(brl2.alX());
        ags2.AO().AZ().setGUID(brl2.getGUID());
        return ags2;
    }

    private agx a(bvd bvd2) {
        agx agx2 = null;
        if (bvd2 instanceof bvc) {
            bvc bvc2 = (bvc)bvd2;
            afs afs2 = (afs)this.a(ahu.c.bmg, bvd2.getGUID());
            afs2.cx(bvc2.ayY());
            agx2 = afs2;
        } else {
            agx2 = (agx)this.a(ahu.c.bmu, bvd2.getGUID());
        }
        agx2.setObjectType(bvd2.getObjectType());
        agx2.fn(bvd2.aza().ordinal());
        agx2.setFileName(bvd2.getFileName());
        agx2.c(bvd2.av());
        agx2.a(bvd2.aw());
        agx2.l(bvd2.az());
        return agx2;
    }

    private agy a(bws bws2) {
        agy agy2 = (agy)this.a(ahu.c.bmv, bws2.getGUID());
        agy2.setObjectType(bws2.getObjectType());
        agy2.fe(bws2.Be());
        agy2.ff(bws2.aCv());
        agy2.c(bws2.av());
        agy2.a(bws2.aw());
        agy2.v(bws2.aCw());
        agy2.setStartDirection(bws2.getStartDirection());
        agy2.ab(bws2.aCn());
        agy2.setPower(bws2.getPower());
        agy2.ac(bws2.aCo());
        agy2.c(bws2.aCx());
        agy2.ad(bws2.Bf());
        agy2.ae(bws2.Bg());
        return agy2;
    }

    private ahd a(cat cat2) {
        ahd ahd2 = (ahd)this.a(ahu.c.bmz, cat2.getGUID());
        ahd2.setObjectType(cat2.getObjectType());
        ahd2.l(cat2.aGn().az());
        ahd2.b(new lcq(cat2.aGp()));
        ahd2.a(new lcq(cat2.aGq()));
        return ahd2;
    }

    private ahf a(cbj cbj2) {
        assert (cbj2.aHt() != null);
        ahf ahf2 = (ahf)this.a(ahu.c.bmA, cbj2.getGUID());
        ahf2.setObjectType(cbj2.getObjectType());
        if if_ = (if)ahf2.By();
        if_.afn = cbj2.aHt();
        return ahf2;
    }

    private ahh e(cbx cbx2) {
        ahh ahh2 = null;
        if (cbx2 instanceof cex) {
            cex cex2 = (cex)cbx2;
            ahi ahi2 = (ahi)this.a(ahu.c.bmC, cbx2.getObjectType(), cbx2.getGUID());
            ahi2.aL(cex2.aJv());
            ceb ceb2 = cex2.aLX().aKQ();
            if (ceb2.aKK() != null) {
                ahi2.eZ(ceb2.aKK().bbn().bid);
            }
            ahi2.af(0.5f);
            ahh2 = ahi2;
        } else if (cbx2 instanceof cdv) {
            cdv cdv2 = (cdv)cbx2;
            agl agl2 = (agl)this.a(ahu.c.bmo, cbx2.getObjectType(), cbx2.getGUID());
            cdj cdj2 = cdv2.aKv().aKp();
            if (cdj2.aKn() != null) {
                agl2.eZ(cdj2.aKn().bbq().bid);
            }
            ahh2 = agl2;
        } else if (cbx2 instanceof cdb) {
            cdb cdb2 = (cdb)cbx2;
            agh agh2 = (agh)this.a(ahu.c.bmm, cbx2.getObjectType(), cbx2.getGUID());
            agh2.aL(cdb2.aJv());
            agh2.aM(cdb2.aJw());
            ahh2 = agh2;
        } else if (cbx2 instanceof cpg) {
            cpg cpg2 = (cpg)cbx2;
            aha aha2 = (aha)this.a(ahu.c.bmw, cbx2.getObjectType(), cbx2.getGUID());
            ahh2 = aha2;
        } else if (cbx2 instanceof cph) {
            ahc ahc2;
            ahh2 = ahc2 = (ahc)this.a(ahu.c.bmy, cbx2.getGUID());
        } else if (cbx2 instanceof cni) {
            aib aib2 = (aib)this.a(ahu.c.bmJ, cbx2.getObjectType(), cbx2.getGUID());
            aib2.fb(cbx2.getGUID().ib());
            ahh2 = aib2;
        } else if (cbx2 instanceof cpw) {
            cpw cpw2 = (cpw)cbx2;
            aii aii2 = (aii)this.a(ahu.c.bmN, cbx2.getGUID());
            aii2.fx(cpw2.atS());
            ahh2 = aii2;
        } else if (cbx2 instanceof cpy) {
            cpy cpy2 = (cpy)cbx2;
            aik aik2 = (aik)this.a(ahu.c.bmO, cbx2.getObjectType(), cbx2.getGUID());
            ahh2 = aik2;
        } else if (cbx2 instanceof ccs) {
            ahh ahh3 = (ahh)this.a(ahu.c.bmB, cbx2.getObjectType(), cbx2.getGUID());
            ahh2 = ahh3;
        } else if (cbx2 instanceof clb) {
            ahh ahh4 = (ahh)this.a(ahu.c.bmB, cbx2.getObjectType(), cbx2.getGUID());
            ahh2 = ahh4;
        } else if (cbx2 instanceof cok) {
            ahh ahh5 = (ahh)this.a(ahu.c.bmB, cbx2.getObjectType(), cbx2.getGUID());
            ahh2 = ahh5;
        } else if (cbx2 instanceof cku) {
            ahh ahh6 = (ahh)this.a(ahu.c.bmB, cbx2.getObjectType(), cbx2.getGUID());
            ahh2 = ahh6;
        } else if (cbx2 instanceof cmo) {
            ahh ahh7 = (ahh)this.a(ahu.c.bmB, cbx2.getObjectType(), cbx2.getGUID());
            ahh2 = ahh7;
        } else if (cbx2 instanceof cme) {
            ahh ahh8 = (ahh)this.a(ahu.c.bmB, cbx2.getObjectType(), cbx2.getGUID());
            ahh2 = ahh8;
        } else if (cbx2 instanceof clg) {
            ahh ahh9 = (ahh)this.a(ahu.c.bmB, cbx2.getObjectType(), cbx2.getGUID());
            ahh2 = ahh9;
        } else if (cbx2 instanceof ccv) {
            ahh ahh10 = (ahh)this.a(ahu.c.bmB, cbx2.getObjectType(), cbx2.getGUID());
            ahh2 = ahh10;
        } else if (cbx2 instanceof cls) {
            ahh ahh11 = (ahh)this.a(ahu.c.bmB, cbx2.getObjectType(), cbx2.getGUID());
            ahh2 = ahh11;
        } else if (cbx2 instanceof cma) {
            cma cma2 = (cma)cbx2;
            ahj ahj2 = (ahj)this.a(ahu.c.bmD, cbx2.getObjectType(), cbx2.getGUID());
            ahj2.cB(cma2.aSR());
            ahh2 = ahj2;
        } else if (cbx2 instanceof cnt) {
            cnt cnt2 = (cnt)cbx2;
            aie aie2 = (aie)this.a(ahu.c.bmP, cbx2.getObjectType(), cbx2.getGUID());
            aie2.cC(cnt2.aUK());
            ahh2 = aie2;
        } else if (cbx2 instanceof cnz) {
            ahh ahh12 = (ahh)this.a(ahu.c.bmB, cbx2.getObjectType(), cbx2.getGUID());
            ahh2 = ahh12;
        } else if (cbx2 instanceof cnc) {
            ahh ahh13 = (ahh)this.a(ahu.c.bmB, cbx2.getObjectType(), cbx2.getGUID());
            ahh2 = ahh13;
        } else if (cbx2 instanceof ckx) {
            ahh ahh14 = (ahh)this.a(ahu.c.bmB, cbx2.getObjectType(), cbx2.getGUID());
            ahh2 = ahh14;
        } else if (cbx2 instanceof coh) {
            ahh ahh15 = (ahh)this.a(ahu.c.bmB, cbx2.getObjectType(), cbx2.getGUID());
            ahh2 = ahh15;
        } else if (cbx2 instanceof clv) {
            ahh ahh16 = (ahh)this.a(ahu.c.bmB, cbx2.getObjectType(), cbx2.getGUID());
            ahh2 = ahh16;
        } else if (cbx2 instanceof cmz) {
            ahh ahh17 = (ahh)this.a(ahu.c.bmB, cbx2.getObjectType(), cbx2.getGUID());
            ahh2 = ahh17;
        } else if (cbx2 instanceof cod) {
            ahh ahh18 = (ahh)this.a(ahu.c.bmB, cbx2.getObjectType(), cbx2.getGUID());
            ahh2 = ahh18;
        } else if (cbx2 instanceof cmj) {
            ahh ahh19 = (ahh)this.a(ahu.c.bmB, cbx2.getObjectType(), cbx2.getGUID());
            ahh2 = ahh19;
        } else {
            bve.a a2 = null;
            if (cbx2.aAG() != null) {
                a2 = cbx2.aAG().aza();
            } else if (cbx2.aIh() != null) {
                a2 = cbx2.aIh().aza();
            } else {
                lfn.b(5, "SFStateObjectFactory", "createPhysicalObjectStateObject() Object has no meshobject or meshobjectinfo.");
                lfn.b(5, "SFStateObjectFactory", "createPhysicalObjectStateObject() " + cbx2);
                return null;
            }
            if (a2 == bve.a.dQD) {
                ahh2 = (ahh)this.a(ahu.c.bmB, cbx2.getObjectType(), cbx2.getGUID());
            } else {
                lfn.b(5, "SFStateObjectFactory", "createPhysicalObjectStateObject() Unhandled object provided: " + cbx2.getClass().getName());
                lfn.b(5, "SFStateObjectFactory", "createPhysicalObjectStateObject() " + cbx2);
                assert (false);
                return null;
            }
        }
        this.a(ahh2, cbx2);
        return ahh2;
    }

    private ahl b(dul dul2) {
        return this.b(dul2.getRelationType(), dul2.getGUID(), dul2.Bq(), dul2.Br());
    }

    private ahp a(cdf cdf2) {
        ahp ahp2 = (ahp)this.a(ahu.c.bmH, cdf2.getGUID());
        ahp2.setObjectType(cdf2.getObjectType());
        Map<ldv, cde> map = cdf2.aKg();
        if (!map.isEmpty()) {
            for (cde cde2 : map.values()) {
                ahp2.a(cde2.aKf(), -1);
            }
        }
        return ahp2;
    }

    private ahr a(cxc cxc2) {
        ahr ahr2 = (ahr)this.a(ahu.c.bmG, cxc2.getGUID());
        ahr2.setObjectType(cxc2.getObjectType());
        ahr2.fn(cxc2.zg());
        ahr2.ag(cxc2.bfw());
        return ahr2;
    }

    private aid b(bvd bvd2) {
        aid aid2 = null;
        if (bvd2 instanceof bvc) {
            bvc bvc2 = (bvc)bvd2;
            aic aic2 = (aic)this.a(ahu.c.bmK, bvd2.getGUID());
            aic2.cx(bvc2.ayY());
            aid2 = aic2;
        } else {
            aid2 = (aid)this.a(ahu.c.bmL, bvd2.getGUID());
        }
        aid2.setObjectType(bvd2.getObjectType());
        aid2.fn(bvd2.aza().ordinal());
        aid2.setFileName(bvd2.getFileName());
        aid2.c(bvd2.av());
        aid2.a(bvd2.aw());
        aid2.l(bvd2.az());
        return aid2;
    }

    private aif g(ha ha2) {
        if (ha2.jE() == null) {
            ha2.aG(ha2.getMessageDelegator().bzv());
        }
        aif aif2 = (aif)this.a(ahu.c.bmM, ha2.jE());
        aif2.setObjectType(98);
        aif2.P(ha2.iP());
        aif2.Q(ha2.iR());
        aif2.cD(ha2.iV());
        return aif2;
    }
}

