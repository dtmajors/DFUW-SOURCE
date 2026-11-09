/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lcr
 */
import java.util.ArrayList;

public class dbc
extends dbb {
    private dbm gbV = null;
    private int gbW = 0;
    private int gbX = 0;

    public dbc(daz daz2, dbm dbm2) {
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

    private void biK() {
        Object object;
        ddk ddk2 = (ddk)this.gbV.bhM();
        float f2 = ddk2.gei;
        ljq ljq2 = this.gbV.biP() ? dba.gbx : dba.gby;
        ArrayList<ljq> arrayList = lcn.emv();
        arrayList.add(ljq2);
        ljq ljq3 = ljq.h(ljq2, new ljq(0.0f, 1.0f, 0.0f), f2);
        for (int i2 = 0; i2 < 8; ++i2) {
            float f3 = 0.7853982f * (float)i2;
            ljq ljq4 = ljq.h(ljq3, ljq2, f3);
            arrayList.add(ljq4);
        }
        f2 = ddk2.gei / 2.0f;
        ljq ljq5 = ljq.h(ljq2, new ljq(0.0f, 1.0f, 0.0f), f2);
        for (int i3 = 0; i3 < 4; ++i3) {
            float f4 = 1.5707964f * (float)i3;
            object = ljq.h(ljq5, ljq2, f4);
            arrayList.add((ljq)object);
        }
        for (ljq ljq6 : arrayList) {
            object = (kji)this.MessageDelegator.h(2818);
            ((kji)object).wS(true);
            ((kji)object).wT(false);
            ((kji)object).ec = this.GUID;
            ((kji)object).pDY = 0;
            ((kji)object).Yg(2);
            ((kji)object).Yh(4);
            ((kji)object).ca(this.gbV.aGr());
            ((kji)object).cq(ljq6);
            ((kji)object).pEL = false;
            ((kji)object).a(this.gbV.biO());
            ((kji)object).setLength(ddk2.gbu);
            ((kji)object).pEN = true;
            this.MessageDelegator.a((khd)object);
            ++this.gbW;
        }
    }

    @Override
    protected void handleLineContainmentResponse(kuj kuj2) {
        --this.gbW;
        assert (this.gbV != null);
        if (ctg.ffj) {
            this.biJ();
            return;
        }
        if (kuj2.dXg() == null) {
            lfn.b(5, "SFTargetHarvesterCone", "handleDiscContainmentResponse() RequestGUID is null.");
            if (this.gbW != 0) {
                return;
            }
            this.biL();
        } else if (kuj2.jnv == null) {
            lfn.b(5, "SFTargetHarvesterCone", "handleDiscContainmentResponse() ObjectGUIDs array is null.");
            if (this.gbW != 0) {
                return;
            }
            this.biL();
        } else if (kuj2.qdO == null) {
            lfn.b(5, "SFTargetHarvesterCone", "handleDiscContainmentResponse() OwnerObjectGUIDs array is null.");
            if (this.gbW != 0) {
                return;
            }
            this.biL();
        } else if (kuj2.ilP == null) {
            lfn.b(5, "SFTargetHarvesterCone", "handleDiscContainmentResponse() Positions array is null.");
            if (this.gbW != 0) {
                return;
            }
            this.biL();
        } else if (kuj2.bqd == null) {
            lfn.b(5, "SFTargetHarvesterCone", "handleDiscContainmentResponse() ResourceTypes array is null.");
            if (this.gbW != 0) {
                return;
            }
            this.biL();
        } else if (kuj2.qdP == null) {
            lfn.b(5, "SFTargetHarvesterCone", "handleDiscContainmentResponse() HitLocations array is null.");
            if (this.gbW != 0) {
                return;
            }
            this.biL();
        }
        ldv[] ldvArray = kuj2.jnv;
        ldv[] ldvArray2 = kuj2.qdO;
        ljq[] ljqArray = kuj2.ilP;
        int[] nArray = kuj2.bqd;
        int[] nArray2 = kuj2.qdP;
        float[] fArray = kuj2.qdQ;
        assert (ldvArray.length == ldvArray2.length);
        assert (ljqArray.length == ldvArray2.length);
        assert (nArray.length == ldvArray2.length);
        assert (nArray2.length == ldvArray2.length);
        assert (fArray.length == ldvArray2.length);
        int n2 = ldvArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (this.e(ldvArray[i2], ldvArray2[i2], nArray[i2])) {
                ++this.gbX;
                continue;
            }
            if (!lea.enW().isDescendant(nArray[i2], cug.fgz) && !lea.enW().isDescendant(nArray[i2], cug.fkw)) {
                ++this.gbX;
                break;
            }
            ddu ddu2 = new ddu();
            ddu2.Ui = ldvArray2[i2];
            ddu2.ResourceType = nArray[i2];
            ddu2.dph = ljqArray[i2];
            ddu2.dur = cxd.f.getHitLocationTypeForHitLocation(nArray2[i2]);
            ddu2.dus = fArray[i2];
            ddu2.aYH = this.gbV.Ec();
            ddu2.gev = false;
            if (!this.gbV.d(ddu2)) continue;
            if (ldvArray2[i2].equals(lcr.qAC)) {
                ddu2.Ui = ldvArray[i2];
                ddu2.dtj = lcr.qEk;
                this.gbV.mu(ddu2.Ui);
                continue;
            }
            this.bG(ddu2.Ui);
        }
        if (this.gbW != 0) {
            return;
        }
        this.biL();
    }

    private void biL() {
        if (this.gbV.biT() == null) {
            this.CA();
        } else if (this.gbV.biS()) {
            this.a(this.gbV.biT());
        }
    }

    @Override
    protected void a(fuu fuu2) {
        ddu ddu2 = this.gbV.mt(fuu2.aO());
        if (ddu2 == null) {
            lfn.b(5, "SFTargetHarvesterCone", "handleObjectInfoGUIDResponse() TargetObjectInfo is null for meshobjectGUID " + fuu2.aO());
            return;
        }
        if (!ddu2.Ui.equals(fuu2.aO())) {
            lfn.b(5, "SFTargetHarvesterCone", "handleObjectInfoGUIDResponse() TOI.MeshObjectGUID=" + ddu2.Ui + " FromGUID=" + fuu2.aO());
            return;
        }
        ddu2.dtj = fuu2.dtj;
        this.gbV.mu(ddu2.Ui);
        if (ddu2.dtj == null) {
            ddu2.dtj = lcr.qEk;
        }
        if (this.gbV.biS() && this.gbW == 0) {
            this.a(this.gbV.biT());
        }
    }

    @Override
    protected void lU(ldv ldv2) {
        ddu ddu2 = this.gbV.mt(ldv2);
        if (ddu2 == null) {
            lfn.b(5, "SFTargetHarvesterCone", "handleMeshObjectNotFound() TargetObjectInfo is null for MeshObjectGUID " + ldv2);
            return;
        }
        if (!ddu2.Ui.equals(ldv2)) {
            lfn.b(5, "SFTargetHarvesterCone", "handleMeshObjectNotFound() TOI.MeshObjectGUID=" + ddu2.Ui + " MeshObjectGUID=" + ldv2);
            return;
        }
        this.gbV.mv(ldv2);
        if (this.gbV.biT() == null) {
            this.CA();
        } else if (this.gbV.biS()) {
            this.a(this.gbV.biT());
        }
    }
}

