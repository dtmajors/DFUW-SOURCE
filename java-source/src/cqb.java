/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lcr
 */
import java.util.List;

public class cqb
extends btk {
    private static final float dtc = 1.0f;
    private static final float dtd = 10.0f;
    private final cqa aeT;
    private List<ldv> eUA = lcn.abH(5);
    private float dtg = 1.0f;
    private float Radius = 10.0f;
    private ldv Ud = null;
    private boolean dsH = false;
    private static les ResourceTree = lea.enW();

    public cqb(cqa cqa2) {
        this.aeT = cqa2;
    }

    public void eK(float f2) {
        this.dtg = f2;
    }

    public void setRadius(float f2) {
        this.Radius = f2;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.acf();
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

    public void arj() {
        if (!this.dsH) {
            lfn.b(5, "SFWildlifeProximitySensor", "stopSensor() Sensor " + this.GUID + " is not active.");
            return;
        }
        this.dsH = false;
        if (this.Ud != null) {
            this.acg();
            this.selfDestruct();
        }
    }

    private void acf() {
        assert (this.Ud == null);
        assert (this.aeT.aAG() != null);
        this.dsH = true;
        koq koq2 = (koq)this.MessageDelegator.h(533);
        koq2.ec = this.GUID;
        koq2.iBr = true;
        koq2.dsK = true;
        koq2.Ud = lcr.qAC;
        koq2.pTa = true;
        koq2.pUL = 0;
        koq2.dtg = this.dtg;
        koq2.pUM = this.Radius;
        koq2.pUN = true;
        koq2.pUO = false;
        koq2.dsZ = this.aeT.aAG().axa();
        this.MessageDelegator.a(koq2);
    }

    private void a(kwr kwr2) {
        assert (this.Ud == null);
        if (kwr2.getResult() == 0) {
            this.Ud = kwr2.axa();
            if (!this.dsH) {
                this.acg();
                this.selfDestruct();
            }
        } else {
            lfn.b(5, "SFWildlifeProximitySensor", "handleSensorResponse() Sensor could not be created for " + this.GUID);
            if (this.dsH) {
                this.dsH = false;
            }
            this.selfDestruct();
        }
    }

    private void a(kws kws2) {
        ldv[] ldvArray;
        if (!this.dsH) {
            lfn.b(5, "SFWildlifeProximitySensor", "handleSphereSensorObjectResponse() Sensor " + this.GUID + " is not active. Ignoring response.");
            return;
        }
        if (kws2.qfQ != null && kws2.qfQ.length > 0) {
            ldvArray = kws2.qfQ;
            ldv[] ldvArray2 = kws2.qfR;
            int[] nArray = kws2.qfc;
            ljq[] object = kws2.qfS;
            assert (ldvArray != null);
            assert (ldvArray2 != null);
            assert (nArray != null);
            assert (object != null);
            assert (ldvArray.length == ldvArray2.length);
            assert (ldvArray.length == nArray.length);
            assert (ldvArray.length == object.length);
            int n = ldvArray.length;
            for (int i = 0; i < n; ++i) {
                ldv ldv2 = ldvArray2[i];
                if (this.W(ldv2, nArray[i])) continue;
                assert (!this.eUA.contains(ldv2));
                this.eUA.add(ldv2);
                this.aeT.k(ldv2, object[i]);
            }
        }
        if (kws2.qfT != null && kws2.qfT.length > 0) {
            ldvArray = kws2.qfT;
            assert (ldvArray != null);
            for (ldv ldv3 : ldvArray) {
                if (!this.eUA.contains(ldv3)) continue;
                this.eUA.remove(ldv3);
                this.aeT.lJ(ldv3);
            }
        }
    }

    private void acg() {
        assert (this.Ud != null);
        kov kov2 = (kov)this.MessageDelegator.h(535);
        kov2.ec = this.GUID;
        kov2.Ud = this.Ud;
        this.MessageDelegator.a(kov2);
        this.Ud = null;
    }

    private boolean W(ldv ldv2, int n) {
        assert (ldv2 != null);
        if (n <= 0) {
            return true;
        }
        if (ldv2.equals(lcr.qAC)) {
            return true;
        }
        return !cug.vM((int)n);
    }
}

