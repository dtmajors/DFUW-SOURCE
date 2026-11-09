/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcw
 */
public class bkk
extends btk {
    private bkm dsX = null;
    private float Radius = 10.0f;
    private ljq dsY = null;
    private ldv dsZ = null;
    private int[] dta = null;
    public boolean dtb = false;
    private ldv Ud = null;
    private boolean dsH = false;
    private static les ResourceTree = lea.enW();

    public bkk(bkm bkm2) {
        this.dsX = bkm2;
    }

    public void setRadius(float f2) {
        this.Radius = f2;
    }

    public void aR(ljq ljq2) {
        this.dsY = ljq2;
    }

    public void hK(ldv ldv2) {
        this.dsZ = ldv2;
    }

    public void r(int[] nArray) {
        this.dta = nArray;
    }

    public void ds(boolean bl2) {
        this.dtb = bl2;
    }

    @Override
    public void cleanUp() {
        assert (this.Ud == null);
        super.cleanUp();
        this.dsX = null;
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
            case 535: {
                this.a((kvw)ktv2);
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    public void arj() {
        if (!this.dsH) {
            lfn.b(5, "SFAreaSensor", "stopSensor() Sensor " + this.GUID + " is not active.");
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
        assert (this.Radius > 0.0f);
        assert (this.dsY != null);
        this.dsH = true;
        koi koi2 = null;
        if (this.dsZ != null) {
            kon kon2 = (kon)this.MessageDelegator.h(543);
            kon2.dsZ = this.dsZ;
            koi2 = kon2;
        } else {
            kor kor2 = (kor)this.MessageDelegator.h(544);
            kor2.pTs = this.dsY;
            koi2 = kor2;
        }
        koi2.ec = this.GUID;
        koi2.iBr = true;
        koi2.dsK = true;
        koi2.Ud = lcr.qAC;
        koi2.pTa = true;
        koi2.eRm = 0.25f;
        koi2.Radius = this.Radius;
        koi2.pFi = this.dtb ? 30 : 0;
        this.MessageDelegator.a(koi2);
    }

    private String q(int[] nArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int n = nArray.length;
        for (int i = 0; i < n; ++i) {
            stringBuilder.append("'");
            stringBuilder.append(ResourceTree.getName(nArray[i]));
            stringBuilder.append("'");
            if (i >= nArray.length - 1) continue;
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
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
            lfn.b(5, "SFAreaSensor", "handleSensorResponse() Sensor could not be created for " + this.GUID);
            if (this.dsH) {
                this.dsX.arh();
                this.dsH = false;
            }
            this.selfDestruct();
        }
    }

    private void a(kvw kvw2) {
        ldv[] ldvArray;
        if (!this.dsH) {
            lfn.b(5, "SFAreaSensor", "handleAreaOfEffectSensorResponse() Sensor " + this.GUID + " is not active. Ignoring response.");
            return;
        }
        if (kvw2.qfb != null && kvw2.qfb.length > 0) {
            ldvArray = kvw2.qfb;
            int[] nArray = kvw2.qfc;
            ljq[] ljqArray = kvw2.qfd;
            assert (ldvArray != null);
            assert (nArray != null);
            assert (ljqArray != null);
            assert (ldvArray.length == nArray.length);
            assert (ldvArray.length == ljqArray.length);
            int n = ldvArray.length;
            for (int i = 0; i < n; ++i) {
                if (this.a(ldvArray[i], nArray[i], this.dta)) continue;
                bkn bkn2 = new bkn(ldvArray[i], ljqArray[i], nArray[i]);
                this.dsX.c(bkn2);
            }
        }
        if (kvw2.qfe != null && kvw2.qfe.length > 0) {
            ldvArray = kvw2.qfe;
            assert (ldvArray != null);
            int n = ldvArray.length;
            for (int i = 0; i < n; ++i) {
                this.dsX.hJ(ldvArray[i]);
            }
        }
    }

    private boolean b(int n, int[] nArray) {
        assert (n >= 0);
        assert (nArray != null);
        int n2 = nArray.length;
        for (int i = 0; i < n2; ++i) {
            if (!ResourceTree.isDescendant(n, nArray[i])) continue;
            return true;
        }
        return false;
    }

    private void acg() {
        assert (this.Ud != null);
        kov kov2 = (kov)this.MessageDelegator.h(535);
        kov2.ec = this.GUID;
        kov2.Ud = this.Ud;
        this.MessageDelegator.a(kov2);
        this.Ud = null;
    }

    private boolean a(ldv ldv2, int n, int[] nArray) {
        assert (ldv2 != null);
        assert (nArray != null);
        if (n <= 0) {
            return true;
        }
        if (ldv2.equals(lcr.qAC)) {
            return true;
        }
        if (!this.b(n, nArray)) {
            return true;
        }
        if (lcw.enb()) {
            if (ldv2.ib() == 7000) {
                return true;
            }
            if (ldv2.ib() == 1024) {
                return true;
            }
        }
        return false;
    }
}

