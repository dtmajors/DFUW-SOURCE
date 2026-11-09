/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  lcw
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class dsr
extends dqn {
    public static final String gYq = "prop/all/elevators/elevator_wood_01_platform.xml";
    private static final boolean gYr = false;
    private String gYs = "prop/all/elevators/elevator_wood_01_platform.xml";
    private String gYt = "prop/all/elevators/elevator_wood_01_platform.xml";
    private List<ljq> gYu = lcn.emv();
    private List<ljq> gYv = lcn.emv();
    private List<dss> gWV = lcn.emv();
    private Map<ldv, dss> gYw = lcn.emw();
    private float gwS = 0.02f;
    private boolean gwF = false;
    private lcq gwT = new lcq(1.0f, 0.0f, 1.0f, 0.0f);
    private boolean gwH = true;
    private String fFC = "";
    private boolean gwI = false;
    private boolean gYx = false;
    private float gYy = 4.0f;
    private float gYz = 1.0f;
    private float gYA = 4.0f;
    private float gYB = -1.0f;
    private boolean gYC = true;
    private ldv gYD;
    private ldv gYE;
    private ldv gYF;
    private cbx gYG;
    private ljq Position;
    private lgl Rotation = new lgl();

    public float aBG() {
        return this.gYy;
    }

    public float byz() {
        return this.gYA;
    }

    public float byA() {
        return this.gYB;
    }

    public boolean byB() {
        return this.gYx;
    }

    public float getAcceleration() {
        return this.gYz;
    }

    public dsr() {
        this.ObjectDescriptionFilename = "gizmos\\gizmo_elevator_01.xml";
        this.ObjectType = 23;
    }

    @Override
    public void initialize() {
        if (this.gYs.contains("built_data")) {
            lfn.b(0, this.getClass().getSimpleName(), "initialize() : Name contains 'built_data' -> " + this.gYs);
            String string = this.gYs.substring(0, this.gYs.lastIndexOf("_"));
            string = jry.tp(string);
            string = string.substring(0, string.lastIndexOf("_"));
            string = string.replace("built_data/", "");
            this.gYt = string + ".xml";
            if (!jry.tj("xml/" + this.gYt)) {
                lfn.b(4, this.getClass().getSimpleName(), "initialize() : Elevator does not exist. Using default Elevator Mesh. Tried to find: xml/" + this.gYt);
                this.gYt = gYq;
            }
        } else {
            this.gYt = this.gYs;
        }
        super.initialize();
        if (this.gYu.isEmpty()) {
            this.t(new ljq(this.Position), new lgl(this.Rotation));
            this.byC();
        } else {
            assert (this.gYu.size() == this.gYv.size());
            for (int i = 0; i < this.gYu.size(); ++i) {
                ljq ljq2 = this.gYu.get(i);
                ljq ljq3 = this.gYv.get(i);
                this.t(ljq2, new lgl(ljq3));
            }
        }
        this.byH();
        if (!this.gYu.isEmpty() && !lcw.eng()) {
            this.byD();
        }
        if (lcw.qHe) {
            lfn.b(0, this.getClass().getSimpleName(), "initialize() : WB Mode. Creating Elevator Linemesh");
            this.createLineMesh();
        }
    }

    private void byC() {
        if (this.gYu.isEmpty()) {
            ljq ljq2 = new ljq(this.Position);
            ljq2.es(new ljq(0.0f, 4.0f, 0.0f));
            lgl lgl2 = new lgl(this.Rotation);
            this.t(ljq2, lgl2);
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 1035: {
                this.a((fui)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void BT(int n) {
        assert (this.gYE != null);
        klx klx2 = (klx)this.MessageDelegator.h(3338);
        klx2.ts(this.GUID);
        klx2.Type = n;
        klx2.doQ = this.gYz;
        klx2.dVN = this.gYy;
        klx2.gWX = this.gYA;
        klx2.gWY = this.gYB;
        klx2.eMi = this.gYx;
        klx2.Active = true;
        klx2.hC(this.gYE);
        Object[] objectArray = new ljq[this.gWV.size()];
        int n2 = 0;
        for (dss dss2 : this.gWV) {
            objectArray[n2] = dss2.av();
            ++n2;
        }
        klx2.pKK = objectArray;
        objectArray = new lgl[this.gWV.size()];
        n2 = 0;
        for (dss dss2 : this.gWV) {
            objectArray[n2] = dss2.aw();
            ++n2;
        }
        klx2.pKL = objectArray;
        this.MessageDelegator.a(klx2);
    }

    public void cy(ljq ljq2) {
        this.gYu.add(ljq2);
    }

    public void iv(float f2) {
        this.gYy = f2;
        this.BT(32);
    }

    public void iw(float f2) {
        this.gYz = f2;
        this.BT(64);
    }

    public void jv(boolean bl) {
        this.gYx = bl;
        this.BT(256);
    }

    public void ix(float f2) {
        this.gYA = f2;
        this.BT(128);
    }

    public void iy(float f2) {
        this.gYB = f2;
        this.BT(512);
    }

    public void jw(boolean bl) {
    }

    private void a(fui fui2) {
        if ((fui2.bSj() & 4) != 0) {
            this.nP(fui2.aO());
        }
        if ((fui2.bSj() & 1) != 0) {
            this.o(fui2.aO(), fui2.av());
        }
        if ((fui2.bSj() & 2) != 0) {
            this.c(fui2.aO(), fui2.aw());
        }
    }

    private void o(ldv ldv2, ljq ljq2) {
        if (lcw.qHe) {
            dss dss2 = this.gYw.get(ldv2);
            if (dss2 == null) {
                lfn.b(5, this.getClass().getSimpleName(), "modifyElevatorPointPosition() : Point " + ldv2 + " is null!");
                assert (false);
                return;
            }
            ArrayList<lgd> arrayList = lcn.emv();
            lgd lgd2 = new lgd();
            lgd2.acH(this.gWV.indexOf((Object)dss2));
            lgd2.eo(ljq2);
            arrayList.add(lgd2);
            this.a(8, null, arrayList, null);
            this.byE();
        }
    }

    private void c(ldv ldv2, lgl lgl2) {
        if (lcw.qHe) {
            dss dss2 = this.gYw.get(ldv2);
            if (dss2 == null) {
                lfn.b(5, this.getClass().getSimpleName(), "modifyElevatorPointPosition() : Point " + ldv2 + " is null!");
                assert (false);
                return;
            }
            ArrayList<lgd> arrayList = lcn.emv();
            lgd lgd2 = new lgd();
            lgd2.acH(this.gWV.indexOf((Object)dss2));
            arrayList.add(lgd2);
            this.a(8, null, arrayList, null);
            this.byE();
        }
    }

    private void nP(ldv ldv2) {
        if (this.gWV.size() <= 2) {
            dss dss2 = this.gYw.remove(ldv2);
            dss2.reset();
            dss2.setGUID(this.MessageDelegator.bzv());
            this.gYw.remove(ldv2);
            dss dss3 = new dss();
            dss3.nQ(this.getGUID());
            dss3.setGUID(this.MessageDelegator.bzv());
            dss3.setObjectDescriptionFilename(this.gYt);
            dss3.c(dss2.av());
            dss3.a(dss2.aw());
            dss3.setWorldbuilderSaveable(false);
            int n = this.gWV.indexOf((Object)dss2);
            assert (n >= 0);
            this.gWV.set(n, dss3);
            this.gYw.put(dss3.getGUID(), dss3);
            if (lcw.qHe) {
                this.MessageDelegator.a((amf)((Object)dss3));
            }
            lfn.b(4, this.getClass().getSimpleName(), "removeElevatorPoint() : Tried to remove an Elevator point when there was only 2 left!");
            return;
        }
        dss dss4 = this.gYw.remove(ldv2);
        if (dss4 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "removeElevatorPoint() : Point Not found!!");
            assert (false);
            return;
        }
        if (!this.CleanedUp) {
            this.gWV.remove((Object)dss4);
            this.a(8, null, null, null);
            this.byE();
        }
    }

    private void createLineMesh() {
        if (this.gYD != null) {
            this.bmi();
        }
        if (this.gWV.isEmpty()) {
            lfn.b(4, this.getClass().getSimpleName(), "createLineMesh() : No points! Not creating line.");
            return;
        }
        kkv kkv2 = (kkv)this.MessageDelegator.h(1031);
        kkv2.jM(false);
        kkv2.wD(false);
        kkv2.lQ(false);
        kkv2.ts(this.GUID);
        this.gYD = this.MessageDelegator.bzv();
        kkv2.hC(this.gYD);
        kkv2.setLineWidth(this.gwS + 1.0f);
        kkv2.setConstantSize(this.gwF);
        kkv2.m(this.gwT);
        kkv2.YG(1);
        kkv2.c(new ljq());
        kkv2.a(new lgl());
        kkv2.setTextureName(this.fFC);
        kkv2.setHasTexture(this.gwI);
        kkv2.setTransformPoints(this.gwH);
        assert (this.gWV != null);
        lfn.b(0, "SFSpecialEffectLineMeshAtom", "createLineMesh() This many points: " + this.gWV.size());
        ljq[] ljqArray = new ljq[this.gWV.size()];
        int n = 0;
        for (dss dss2 : this.gWV) {
            ljqArray[n] = dss2.av();
            ++n;
        }
        kkv2.l(ljqArray);
    }

    private void bmi() {
        if (this.gYD == null) {
            return;
        }
        kkv kkv2 = (kkv)this.MessageDelegator.h(1031);
        kkv2.jM(false);
        kkv2.wD(false);
        kkv2.lQ(false);
        kkv2.ts(this.GUID);
        kkv2.hC(this.gYD);
        kkv2.YG(256);
        this.gYD = null;
    }

    private void a(int n, List<ljq> list, List<lgd> list2, int[] nArray) {
        if (n == 0) {
            return;
        }
        if (this.gYD == null) {
            return;
        }
        kkv kkv2 = (kkv)this.MessageDelegator.h(1031);
        kkv2.jM(false);
        kkv2.wD(false);
        kkv2.lQ(false);
        kkv2.ts(this.GUID);
        kkv2.hC(this.gYD);
        kkv2.setLineWidth(this.gwS);
        kkv2.setConstantSize(this.gwF);
        kkv2.m(this.gwT);
        kkv2.c(this.Position);
        kkv2.a(this.Rotation);
        kkv2.setTextureName(this.fFC);
        kkv2.YG(n);
        if (list != null) {
            kkv2.l(list.toArray(new ljq[list.size()]));
        } else {
            kkv2.l(new ljq[0]);
        }
        if ((n & 8) != 0) {
            ljq[] ljqArray = new ljq[this.gWV.size()];
            int n2 = 0;
            for (dss dss2 : this.gWV) {
                ljqArray[n2] = dss2.av();
                ++n2;
            }
            kkv2.l(ljqArray);
        }
        n = 0;
        if (this.gWV.size() > 1) {
            if (this.gYE == null) {
                this.byD();
            } else {
                this.byE();
            }
        }
    }

    private void byD() {
        assert (this.gYE == null);
        klx klx2 = (klx)this.MessageDelegator.h(3338);
        klx2.ts(this.GUID);
        klx2.Type = 1;
        klx2.doQ = this.gYz;
        klx2.dVN = this.gYy;
        klx2.gWX = this.gYA;
        klx2.gWY = this.gYB;
        klx2.dsK = false;
        klx2.Active = true;
        this.gYE = this.MessageDelegator.bzv();
        klx2.hC(this.gYE);
        Object[] objectArray = new ljq[this.gWV.size()];
        int n = 0;
        for (dss dss2 : this.gWV) {
            objectArray[n] = dss2.av();
            ++n;
        }
        klx2.pKK = objectArray;
        objectArray = new lgl[this.gWV.size()];
        n = 0;
        for (dss dss2 : this.gWV) {
            objectArray[n] = dss2.aw();
            ++n;
        }
        klx2.pKL = objectArray;
        this.MessageDelegator.a(klx2);
        this.byF();
    }

    private void byE() {
        if (this.gYE == null) {
            lfn.b(0, this.getClass().getSimpleName(), "updateElevatorController() : Controller is null!");
            return;
        }
        klx klx2 = (klx)this.MessageDelegator.h(3338);
        klx2.ts(this.GUID);
        klx2.Type = 24;
        klx2.hC(this.gYE);
        Object[] objectArray = new ljq[this.gWV.size()];
        int n = 0;
        for (dss dss2 : this.gWV) {
            objectArray[n] = dss2.av();
            ++n;
        }
        klx2.pKK = objectArray;
        objectArray = new lgl[this.gWV.size()];
        n = 0;
        for (dss dss2 : this.gWV) {
            objectArray[n] = dss2.aw();
            ++n;
        }
        klx2.pKL = objectArray;
        this.MessageDelegator.a(klx2);
    }

    private void byF() {
        if (this.gYF == null || this.gYE == null) {
            lfn.b(4, this.getClass().getSimpleName(), "attachElevatorResourceToController() : ElevatorResourceGUID og ElevatorControllerGUID is null!");
            return;
        }
        kmj kmj2 = (kmj)this.MessageDelegator.h(3329);
        kmj2.ts(this.GUID);
        kmj2.Zf(8);
        kmj2.hC(this.gYG.aIh().getGUID());
        kmj2.tE(this.gYE);
        this.MessageDelegator.a(kmj2);
    }

    private void byG() {
        if (this.gYF == null || this.gYE == null) {
            lfn.b(4, this.getClass().getSimpleName(), "attachElevatorResourceToController() : ElevatorResourceGUID og ElevatorControllerGUID is null!");
            return;
        }
        kmj kmj2 = (kmj)this.MessageDelegator.h(3329);
        kmj2.ts(this.GUID);
        kmj2.Zf(16);
        if (this.gYG.aAG() == null) {
            return;
        }
        kmj2.hC(this.gYG.aAG().getGUID());
        kmj2.tE(this.gYE);
        this.MessageDelegator.a(kmj2);
    }

    public void t(ljq ljq2, lgl lgl2) {
        if (this.MessageDelegator == null) assert (false);
        dss dss2 = new dss();
        dss2.nQ(this.getGUID());
        dss2.setGUID(this.MessageDelegator.bzv());
        dss2.setObjectDescriptionFilename(this.gYt);
        dss2.c(ljq2);
        dss2.a(lgl2);
        dss2.setWorldbuilderSaveable(false);
        if (lcw.qHe) {
            this.MessageDelegator.a((amf)((Object)dss2));
        }
        this.gWV.add(dss2);
        this.gYw.put(dss2.getGUID(), dss2);
        if (this.Initialized) {
            this.byE();
            this.a(8, null, null, null);
        }
    }

    @Override
    public void receiveResourceResponse(ktf ktf2) {
        super.receiveResourceResponse(ktf2);
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        super.receiveResponse(ktv2);
    }

    private void byH() {
        assert (this.gYF == null);
        this.gYF = this.MessageDelegator.bzv();
        cuh cuh2 = new cuh(true);
        cbx cbx2 = cuh2.B(lea.enW().getType("r_Gold"), false);
        cuh2.a(cbx2, this.gYF, this.gYF);
        cbv cbv2 = cbx2.aIh();
        cbv2.setFileName(this.gYs);
        cbv2.setGUID(this.MessageDelegator.bzv());
        cbv2.c(new ljq(this.Position));
        cbv2.a(new lgl());
        cbv2.d(bve.a.dQv);
        bvm bvm2 = new bvm(bve.a.dQv);
        bvm2.setObjectType(22);
        bvm2.setFileName(this.gYs);
        bvm2.setGUID(cbv2.getGUID());
        bvm2.c(new ljq(this.Position));
        bvm2.a(new lgl());
        cbx2.d((bvd)bvm2);
        this.MessageDelegator.a((amf)cbx2);
        this.gYG = cbx2;
    }

    public dsb byI() {
        dsb dsb2 = new dsb();
        ArrayList<ljq> arrayList = lcn.emv();
        ArrayList<ljq> arrayList2 = lcn.emv();
        for (dss dss2 : this.gWV) {
            arrayList.add(dss2.av());
        }
        for (dss dss2 : this.gWV) {
            arrayList2.add(dss2.FX());
        }
        dsb2.gWV = arrayList;
        dsb2.gWW = arrayList2;
        dsb2.eMi = this.gYx;
        dsb2.doQ = this.gYz;
        dsb2.dVN = this.gYy;
        dsb2.gWX = this.gYA;
        dsb2.gWY = this.gYB;
        return dsb2;
    }

    public void a(dsb dsb2) {
        this.gYx = dsb2.eMi;
        this.gYz = dsb2.doQ;
        this.gYy = dsb2.dVN;
        this.gYA = dsb2.gWX;
        this.gYB = dsb2.gWY;
        this.gYu = dsb2.gWV;
        this.gYv = dsb2.gWW;
        assert (this.gYu != null);
        assert (!this.gYu.isEmpty());
        assert (this.gYv != null);
        assert (!this.gYv.isEmpty());
        this.Position = this.gYu.get(0);
        this.Rotation = new lgl(this.gYv.get(0));
    }

    private void byJ() {
        this.MessageDelegator.hd(this.gYF);
        this.gYF = null;
    }

    @Override
    public void cleanUp() {
        lfn.b(0, this.getClass().getSimpleName(), "cleanUp() : !");
        super.cleanUp();
        this.byG();
        this.bmi();
        this.byJ();
        this.byK();
    }

    private void byK() {
        for (dss dss2 : this.gWV) {
            this.MessageDelegator.hd(dss2.getGUID());
        }
    }

    public boolean byL() {
        return this.gYC;
    }

    public void jx(boolean bl) {
        this.gYC = bl;
    }

    public String byM() {
        return this.gYs;
    }

    public void js(String string) {
        this.gYs = string;
    }

    public ljq av() {
        return this.Position;
    }

    public void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public lgl aw() {
        return this.Rotation;
    }

    public void a(lgl lgl2) {
        this.Rotation = lgl2;
    }

    public List<dss> getPoints() {
        return this.gWV;
    }

    public void aD(List<dss> list) {
        this.gWV = list;
    }
}

