/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcw
 */
import java.util.Iterator;
import java.util.Map;

public abstract class bkl
extends bke
implements bto {
    public static final float dtc = 1.0f;
    public static final float dtd = 10.0f;
    public static final double dte = 1.0;
    private Map<ldv, bkz> dtf = lcn.emw();
    protected ldv Ud = null;
    protected boolean dsH = false;
    private boolean dsK = true;
    private float dtg = 1.0f;
    protected double bBt = 0.0;
    private float Radius = 10.0f;
    private ljq dsY = null;
    private ldv dsZ = null;
    private double dth = 0.0;
    private int[] dta = null;
    public boolean dtb = false;

    public void setRadius(float f2) {
        this.Radius = f2;
    }

    public void aR(ljq ljq2) {
        this.dsY = ljq2;
    }

    public void hK(ldv ldv2) {
        this.dsZ = ldv2;
    }

    public double ark() {
        return this.dth;
    }

    public void aX(double d2) {
        this.dth = d2;
    }

    public void r(int[] nArray) {
        this.dta = nArray;
    }

    public void ds(boolean bl2) {
        this.dtb = bl2;
    }

    @Override
    public void doTick(ldz ldz2) {
        block5: {
            block4: {
                this.bBt = ldz2.rgz;
                if (!this.dsH) break block4;
                if (this.dth == -2.0) {
                    return;
                }
                if (!(ldz2.rgz > this.dth)) break block5;
                this.dsH = false;
                if (this.Ud == null) break block5;
                this.acg();
                break block5;
            }
            if (this.dtf.isEmpty()) {
                this.Vc();
            } else {
                Iterator<bkz> iterator = this.dtf.values().iterator();
                while (iterator.hasNext()) {
                    bkz bkz2 = iterator.next();
                    if (bkz2.dtD) continue;
                    this.a(bkz2, iterator);
                }
            }
        }
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 512: {
                kwr kwr2 = (kwr)ktv2;
                if (kwr2.getResult() == 0) {
                    this.Ud = kwr2.axa();
                    if (this.dsH) break;
                    this.acg();
                    break;
                }
                this.arh();
                this.dsH = false;
                break;
            }
            case 535: {
                this.a((kvw)ktv2);
                break;
            }
        }
    }

    protected final void acf() {
        assert (this.Ud == null);
        assert (this.Radius > 0.0f);
        assert (this.dsY != null);
        if (1.0 > (double)this.dtg) {
            this.dtg = 1.0f;
        }
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
        koi2.ts(this.GUID);
        koi2.pTa = true;
        if (this.dsK) {
            koi2.iBr = true;
            koi2.dsK = true;
            koi2.Ud = lcr.qAC;
        } else {
            this.Ud = this.MessageDelegator.bzv();
            koi2.iBr = false;
            koi2.dsK = false;
            koi2.Ud = this.Ud;
        }
        koi2.eRm = 0.25f;
        koi2.Radius = this.Radius;
        koi2.pFi = this.dtb ? 30 : 0;
        this.MessageDelegator.a(koi2);
    }

    protected final bkz kX(int n) {
        assert (n > 0);
        if (this.dtf.isEmpty()) {
            lfn.b(5, "SFAreaSensorFO", "getSensoredObjectInfo() SensoredObjectInfoMap is empty.");
            return null;
        }
        for (bkz bkz2 : this.dtf.values()) {
            if (bkz2.aqs != n) continue;
            return bkz2;
        }
        lfn.b(5, "SFAreaSensorFO", "getSensoredObjectInfo() Could not find matching sensoredobjectinfo with messagetag=" + n);
        return null;
    }

    protected final bkz hL(ldv ldv2) {
        assert (ldv2 != null);
        return this.dtf.get(ldv2);
    }

    protected final Map<ldv, bkz> arl() {
        return this.dtf;
    }

    protected abstract void a(bkz var1);

    protected abstract void a(bkz var1, Iterator var2);

    protected abstract void arh();

    protected final void hM(ldv ldv2) {
        assert (ldv2 != null);
        assert (this.dtf.containsKey(ldv2));
        this.dtf.remove(ldv2);
    }

    protected final void acg() {
        assert (this.Ud != null);
        kov kov2 = (kov)this.MessageDelegator.h(535);
        kov2.ts(this.GUID);
        kov2.sy(this.Ud);
        this.MessageDelegator.a(kov2);
    }

    private void a(kvw kvw2) {
        Object object;
        Object object2;
        ldv[] ldvArray;
        assert (this.Ud != null);
        if (lcw.enb() && ctg.ffj) {
            ldvArray = (dtm)this.MessageDelegator.bzx().bzt();
            object2 = (dtp)ldvArray.bAi()[0].od(lcr.qzp);
            kvw2.qfb = new ldv[]{object2.bAn().aTc};
            kvw2.qfc = new int[]{object2.bAn().Za};
            kvw2.qfd = new ljq[]{new ljq()};
        }
        if (kvw2.qfb != null && kvw2.qfb.length > 0) {
            ldvArray = lcn.abH(kvw2.qfb.length);
            object2 = kvw2.qfb;
            int[] nArray = kvw2.qfc;
            object = kvw2.qfd;
            assert (object2 != null);
            assert (nArray != null);
            assert (object != null);
            assert (((ldv[])object2).length == nArray.length);
            assert (((ldv[])object2).length == ((ljq[])object).length);
            int n = ((ldv[])object2).length;
            for (int i = 0; i < n; ++i) {
                if (this.a(object2[i], nArray[i], this.dta)) continue;
                bkz bkz2 = this.dtf.get(object2[i]);
                if (bkz2 != null) {
                    if (!bkz2.Position.equals(object[i])) {
                        bkz2.Position = object[i];
                    }
                    bkz2.asB = this.bBt;
                    continue;
                }
                bkz2 = new bkz();
                bkz2.Ui = object2[i];
                bkz2.Position = object[i];
                bkz2.ResourceType = nArray[i];
                bkz2.dtC = this.bBt;
                bkz2.asB = this.bBt;
                bkz2.dti = true;
                this.dtf.put(bkz2.Ui, bkz2);
                ldvArray.add(bkz2);
            }
            for (bkz bkz3 : ldvArray) {
                this.a(bkz3);
            }
        }
        if (kvw2.qfe != null && kvw2.qfe.length > 0) {
            ldvArray = kvw2.qfe;
            int n = ldvArray.length;
            for (int i = 0; i < n; ++i) {
                object = this.dtf.remove(ldvArray[i]);
                if (object == null) continue;
                object.dti = false;
                this.a((bkz)object, null);
            }
        }
    }
}

