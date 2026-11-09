/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcw
 */
public class dbd
extends dbb {
    private dbm gbV = null;

    public dbd(daz daz2, dbm dbm2) {
        super(daz2);
        this.gbV = dbm2;
    }

    @Override
    public dbj biG() {
        return this.gbV;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.biK();
    }

    @Override
    protected void a(kug kug2) {
        if (kug2.dXg() == null) {
            lfn.b(5, "SFTargetHarvesterDisc", "handleDiscContainmentResponse() RequestGUID is null.");
            return;
        }
        if (kug2.jnv == null) {
            lfn.b(5, "SFTargetHarvesterDisc", "handleDiscContainmentResponse() ObjectGUIDs array is null.");
            return;
        }
        if (kug2.qdO == null) {
            lfn.b(5, "SFTargetHarvesterDisc", "handleDiscContainmentResponse() OwnerObjectGUIDs array is null.");
            return;
        }
        if (kug2.ilP == null) {
            lfn.b(5, "SFTargetHarvesterDisc", "handleDiscContainmentResponse() Positions array is null.");
            return;
        }
        if (kug2.bqd == null) {
            lfn.b(5, "SFTargetHarvesterDisc", "handleDiscContainmentResponse() ResourceTypes array is null.");
            return;
        }
        if (kug2.qdP == null) {
            lfn.b(5, "SFTargetHarvesterDisc", "handleDiscContainmentResponse() HitLocations array is null.");
            return;
        }
        assert (this.gbV != null);
        if (ctg.ffj) {
            this.biJ();
            return;
        }
        ldv[] ldvArray = kug2.jnv;
        ldv[] ldvArray2 = kug2.qdO;
        ljq[] ljqArray = kug2.ilP;
        int[] nArray = kug2.bqd;
        int[] nArray2 = kug2.qdP;
        float[] fArray = kug2.qdQ;
        assert (ldvArray.length == ldvArray2.length);
        assert (ljqArray.length == ldvArray2.length);
        assert (nArray.length == ldvArray2.length);
        assert (nArray2.length == ldvArray2.length);
        assert (fArray.length == ldvArray2.length);
        int n2 = 0;
        if (ldvArray.length > 0) {
            int n3 = ldvArray.length;
            for (int i2 = 0; i2 < n3; ++i2) {
                if (this.e(ldvArray[i2], ldvArray2[i2], nArray[i2])) {
                    ++n2;
                    continue;
                }
                ddu ddu2 = new ddu();
                ddu2.Ui = ldvArray2[i2];
                ddu2.ResourceType = nArray[i2];
                ddu2.dph = ljqArray[i2];
                ddu2.dur = cxd.f.getHitLocationTypeForHitLocation(nArray2[i2]);
                ddu2.dus = fArray[i2];
                ddu2.aYH = this.gbV.Ec();
                ddu2.gev = false;
                this.gbV.d(ddu2);
                if (ldvArray2[i2].equals(lcr.qAC)) {
                    ddu2.Ui = ldvArray[i2];
                    ddu2.dtj = lcr.qEk;
                    this.gbV.mu(ddu2.Ui);
                    continue;
                }
                this.bG(ddu2.Ui);
            }
            if (this.gbV.biT() == null) {
                assert (n2 == ldvArray.length);
                this.CA();
            } else if (this.gbV.biS()) {
                this.a(this.gbV.biT());
            }
        } else {
            this.CA();
        }
    }

    @Override
    protected void a(fuu fuu2) {
        ddu ddu2 = this.gbV.mt(fuu2.aO());
        if (ddu2 == null) {
            lfn.b(5, "SFTargetHarvesterDisc", "handleObjectInfoGUIDResponse() TargetObjectInfo is null for meshobjectGUID " + fuu2.aO());
            return;
        }
        if (!ddu2.Ui.equals(fuu2.aO())) {
            lfn.b(5, "SFTargetHarvesterDisc", "handleObjectInfoGUIDResponse() TOI.MeshObjectGUID=" + ddu2.Ui + " FromGUID=" + fuu2.aO());
            return;
        }
        ddu2.dtj = fuu2.dtj;
        this.gbV.mu(ddu2.Ui);
        if (ddu2.dtj == null) {
            ddu2.dtj = lcr.qEk;
        }
        if (this.gbV.biS()) {
            this.a(this.gbV.biT());
        }
    }

    @Override
    protected void lU(ldv ldv2) {
        ddu ddu2 = this.gbV.mt(ldv2);
        if (ddu2 == null) {
            lfn.b(5, "SFTargetHarvesterDisc", "handleMeshObjectNotFound() TargetObjectInfo is null for MeshObjectGUID " + ldv2);
            return;
        }
        if (!ddu2.Ui.equals(ldv2)) {
            lfn.b(5, "SFTargetHarvesterDisc", "handleMeshObjectNotFound() TOI.MeshObjectGUID=" + ddu2.Ui + " MeshObjectGUID=" + ldv2);
            return;
        }
        this.gbV.mv(ldv2);
        if (this.gbV.biT() == null) {
            this.CA();
        } else if (this.gbV.biS()) {
            this.a(this.gbV.biT());
        }
    }

    private void biK() {
        lgl lgl2;
        bvd bvd2 = this.gbT.biE().bgQ().aAG();
        ddl ddl2 = (ddl)this.gbV.bhM();
        float f2 = 2.0f;
        float f3 = 60.0f;
        ddx ddx2 = this.gbT.biE().bgQ().aJB();
        if (ddl2.gbu > 0.0f) {
            f2 = ddl2.gbu;
        } else if (ddx2 != null && ddx2.bFz > 0.0f) {
            f2 = ddx2.bFz;
        }
        if (ddl2.gei > 0.0f) {
            f3 = ddl2.gei;
        } else if (ddx2 != null && ddx2.fyb > 0.0f) {
            f3 = ddx2.fyb;
        }
        float f4 = dba.A(this.gbT.biE().bgQ().az(), f2);
        f2 += f4;
        if (this.gbT.biE().bgQ() instanceof cev) {
            float f5 = -((float)Math.asin(this.gbT.biE().bgX() / f2));
            lgl2 = new lgl(new ljq(f5, 0.0f, 0.0f));
            lgl2.Y(this.gbV.biO());
        } else {
            lgl2 = new lgl(this.gbV.biO());
        }
        ljq ljq2 = lgl2.eq(new ljq(0.0f, 1.0f, 0.0f));
        ljq ljq3 = lgl2.eq(new ljq(0.0f, 0.0f, 1.0f));
        if (this.gbT.biE().bgQ().aJv()) {
            ljq2 = lgl2.eq(new ljq(1.0f, 0.0f, 0.0f));
        }
        kje kje2 = (kje)this.MessageDelegator.h(2821);
        kje2.ec = this.GUID;
        kje2.pDY = 0;
        kje2.pEn = this.gbV.aGr();
        kje2.pEo = ljq2;
        kje2.pEp = ljq3;
        kje2.gbu = f2;
        kje2.gei = lew.nj(f3);
        if (this.biI()) {
            kje2.pEr = -38849;
        }
        if (lcw.enb()) {
            ldv ldv2 = lcr.p((ldv)bvd2.getGUID(), (int)this.gbT.biE().bgQ().jk().jr(), (int)this.GUID.enw());
            kje2.pEs = new ldv[]{bvd2.axa(), ldv2};
        } else {
            kje2.pEs = new ldv[]{bvd2.axa()};
        }
        this.MessageDelegator.a(kje2);
    }
}

