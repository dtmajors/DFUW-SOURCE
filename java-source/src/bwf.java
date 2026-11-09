/*
 * Decompiled with CFR.
 */
import java.util.Map;

public class bwf
extends btk {
    protected final bwj dUG;
    protected ldv dUH = null;
    private boolean dUI = false;
    private boolean dUJ = false;
    private ldv dUK = null;
    private int dUL = 25;
    protected Map<ldv, khd> dTw = lcn.emw();

    public bwf(bwj bwj2) {
        this.dUG = bwj2;
        this.dUH = ((bvd)((Object)this.dUG)).axa();
    }

    public final void eQ(boolean bl) {
        this.dUI = bl;
    }

    public final void eR(boolean bl) {
        this.dUJ = bl;
    }

    public void aAV() {
        assert (this.dUG != null);
        assert (this.dUH != null);
        if (this.dUI) {
            if (this.dUJ && this.dUK != null) {
                return;
            }
            this.aBd();
        }
    }

    @Override
    public void cleanUp() {
        if (this.dUK != null) {
            this.aBe();
        }
        super.cleanUp();
    }

    public void aAW() {
        assert (this.dUG != null);
        assert (this.dUH != null);
        if (this.dUI) {
            if (this.dUJ) {
                return;
            }
            this.aBe();
        }
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 512: {
                this.a((kwr)ktv2);
                break;
            }
            case 516: {
                this.a((kwp)ktv2);
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    protected void a(kwr kwr2) {
        khd khd2 = this.dTw.get(kwr2.dXg());
        if (khd2 == null) {
            lfn.b(5, "SFMeshObjectSensorManager", "handleSensorResponse() Could not find request " + kwr2.dXg());
            assert (false);
            return;
        }
        int n = khd2.pse;
        if (kwr2.getResult() != 0) {
            lfn.b(5, "SFMeshObjectSensorManager", "handleSensorResponse() A sensor could not be created: " + kwr2.getResult());
            lfn.b(5, "SFMeshObjectSensorManager", "handleSensorResponse() RequestType=" + n);
            assert (false);
            return;
        }
        switch (n) {
            case 517: {
                this.dTw.remove(kwr2.dXg());
                if (this.dUK != null) {
                    lfn.b(5, "SFMeshObjectSensorManager", "handleSensorResponse() ReportSensorGUID is already set.");
                    lfn.b(5, "SFMeshObjectSensorManager", "handleSensorResponse() ReportSensorGUID=" + this.dUK + " EngineGUID=" + kwr2.axa());
                    return;
                }
                this.dUK = kwr2.axa();
                break;
            }
            default: {
                lfn.b(5, "SFMeshObjectSensorManager", "handleSensorResponse() Unhandled sensorresponse received with RequestType=" + n);
                lfn.b(5, "SFMeshObjectSensorManager", "handleSensorResponse() GUID=" + this.GUID + " MeshObjectEngineGUID=" + this.dUH);
                return;
            }
        }
    }

    private void aBd() {
        assert (this.dUG != null);
        assert (this.dUH != null);
        assert (this.dUK == null);
        kpl kpl2 = (kpl)this.MessageDelegator.h(517);
        kpl2.ts(this.GUID);
        kpl2.aag(1);
        kpl2.aah(3);
        kpl2.aai(1);
        kpl2.aaj(1);
        kpl2.lQ(true);
        kpl2.sy(this.dUH);
        kpl2.wD(true);
        kpl2.hK(this.dUH);
        kpl2.hl(0.0f);
        kpl2.hm(0.0f);
        kpl2.mK(0.0f);
        kpl2.zP(this.dUL);
        this.MessageDelegator.a(kpl2);
        this.dTw.put(kpl2.GUID, kpl2);
    }

    private void a(kwp kwp2) {
        if (this.dUK == null) {
            lfn.b(5, "SFMeshObjectSensorManager", "handlePositionalReportResponse() Received sensorresponse from unknown reportsensor.");
            return;
        }
        assert (this.dUH != null);
        this.dUL = kwp2.bkF();
        --this.dUL;
        kpl kpl2 = (kpl)this.MessageDelegator.h(517);
        kpl2.aag(4);
        kpl2.aai(1);
        kpl2.ts(this.GUID);
        kpl2.sy(this.dUK);
        kpl2.hK(this.dUH);
        this.MessageDelegator.a(kpl2);
        ljq ljq2 = kwp2.av();
        lgl lgl2 = kwp2.aw();
        this.dUG.h(ljq2, lgl2);
    }

    private void aBe() {
        assert (this.dUG != null);
        assert (this.dUH != null);
        assert (this.dUK != null);
        kpl kpl2 = (kpl)this.MessageDelegator.h(517);
        kpl2.ts(this.GUID);
        kpl2.aag(2);
        kpl2.aai(1);
        kpl2.sy(this.dUK);
        kpl2.hK(this.dUH);
        this.MessageDelegator.a(kpl2);
        this.dUK = null;
        this.dUL = 5;
    }
}

