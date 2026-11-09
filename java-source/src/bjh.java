/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Map;

public class bjh
extends btk {
    private final float bBr = 0.9f;
    private Map<String, a> doq = lcn.emw();
    private Map<ldv, String> dor = lcn.emw();
    private Map<Integer, String> dos = lcn.emw();
    private Map<ldv, String> dot = lcn.emw();
    private Map<ldv, String> dou = lcn.emw();
    private int aqs = 1;

    public a fH(String string) {
        return this.doq.get(string);
    }

    public int fI(String string) {
        a a2 = this.doq.get(string);
        if (a2 == null) {
            return 0;
        }
        return a2.dox - a2.dow;
    }

    public int fJ(String string) {
        a a2 = this.doq.get(string);
        if (a2 == null) {
            return -1;
        }
        return a2.dow;
    }

    public void a(String string, float f, int n) {
        a a2 = this.doq.get(string);
        if (a2 != null) {
            return;
        }
        a2 = new a(this);
        a2.Radius = f;
        a2.dox = n;
        this.doq.put(string, a2);
        this.dos.put(this.aqs, string);
        this.j(string, this.aqs);
        ++this.aqs;
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.apB();
    }

    public void apB() {
        for (a a2 : this.doq.values()) {
            if (a2.dov == null) continue;
            kov kov2 = (kov)this.MessageDelegator.h(535);
            kov2.hsP = false;
            kov2.iBr = false;
            kov2.Ud = a2.dov;
            kov2.ec = this.GUID;
            this.MessageDelegator.a(kov2);
        }
        this.doq.clear();
        this.dor.clear();
        this.dos.clear();
        this.dot.clear();
        this.dou.clear();
    }

    private void j(String string, int n) {
        ebf ebf2 = (ebf)this.MessageDelegator.h(17418, this.getGUID(), lcr.qEq);
        ebf2.azF = string;
        ebf2.aqs = n;
        this.MessageDelegator.F(ebf2);
    }

    private void b(ebg ebg2) {
        String string = this.dos.remove(ebg2.aqs);
        if (string == null) {
            lfn.b(5, "SFPlayerSpawnMonitorAreaSensorManager", "handleGlobalBindstoneGUIDResponseMessage() Unknown messagetag in response?");
            assert (false);
            return;
        }
        a a2 = this.doq.get(string);
        if (a2 == null) {
            lfn.b(5, "SFPlayerSpawnMonitorAreaSensorManager", "handleGlobalBindstoneGUIDResponseMessage() Can not find AreaSensorInfo!?");
            assert (false);
            return;
        }
        if (ebg2.azY == null) {
            lfn.b(5, "SFPlayerSpawnMonitorAreaSensorManager", "handleGlobalBindstoneGUIDResponseMessage() BindstoneGUID == null for " + string);
            assert (false);
            return;
        }
        if (ebg2.bYY == null) {
            lfn.b(5, "SFPlayerSpawnMonitorAreaSensorManager", "handleGlobalBindstoneGUIDResponseMessage() BindstonePosition == null!?");
            assert (false);
            return;
        }
        a2.azY = ebg2.azY;
        a2.bYY = ebg2.bYY;
        this.a(a2.bYY, a2.Radius, string);
    }

    void a(ljq ljq2, float f, String string) {
        kou kou2 = (kou)this.MessageDelegator.h(534);
        kou2.pTs = ljq2;
        kou2.pUM = f;
        kou2.pUL = 0;
        kou2.dtg = 0.9f;
        kou2.pUN = true;
        kou2.pUO = false;
        kou2.pUP = 64;
        kou2.dsK = true;
        kou2.iBr = true;
        kou2.pUK = false;
        kou2.Ud = this.GUID;
        kou2.ec = this.GUID;
        this.dot.put(kou2.GUID, string);
        this.MessageDelegator.a(kou2);
    }

    private void a(kwr kwr2) {
        if (kwr2.ew != 0) {
            lfn.b(5, "SFPlayerSpawnMonitorAreaSensorManager", "handleSensorResponse() Error creating sensor in engine!");
            assert (false);
            return;
        }
        String string = this.dot.remove(kwr2.dXg());
        if (string == null) {
            lfn.b(5, "SFPlayerSpawnMonitorAreaSensorManager", "handleSensorResponse() Could not find Name from responseguid!");
            assert (false);
            return;
        }
        a a2 = this.doq.get(string);
        if (a2 == null) {
            lfn.b(5, "SFPlayerSpawnMonitorAreaSensorManager", "handleSensorResponse() Can't find SFAreaSensorInfo!");
            assert (false);
            return;
        }
        a2.dov = kwr2.axa();
        this.dou.put(a2.dov, string);
    }

    private void a(kws kws2) {
        String string = this.dou.get(kws2.dJs);
        if (string == null) {
            lfn.b(5, "SFPlayerSpawnMonitorAreaSensorManager", "handleSphereSensorObjectResponse() Can't find bindstone name from EngineGUID!");
            assert (false);
            return;
        }
        a a2 = this.doq.get(string);
        if (a2 == null) {
            lfn.b(5, "SFPlayerSpawnMonitorAreaSensorManager", "handleSphereSensorObjectResponse() Can't find SFAreaSensorInfo from Name");
            assert (false);
            return;
        }
        int n = a2.dow;
        if (kws2.qfQ != null && kws2.qfQ.length > 0) {
            n += kws2.qfQ.length;
        }
        if (kws2.qfT != null && kws2.qfT.length > 0) {
            n -= kws2.qfT.length;
        }
        a2.dow = n;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 17419: {
                this.b((ebg)dxq2);
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
            case 512: {
                this.a((kwr)ktv2);
                break;
            }
            case 532: {
                this.a((kws)ktv2);
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }
}

