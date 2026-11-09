/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cdb
 *  lcr
 *  lcw
 */
public abstract class dbb
extends btk {
    protected final daz gbT;
    private boolean eNZ = false;
    private boolean gbU = false;

    public dbb(daz daz2) {
        this.gbT = daz2;
    }

    public abstract dbj biG();

    public final void biH() {
        this.eNZ = true;
        if (this.gbU) {
            this.MessageDelegator.hd(this.GUID);
        }
    }

    @Override
    public final void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 5636: {
                this.a((fuu)dxq2);
                break;
            }
            case 11034: {
                this.b((gre)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
                return;
            }
        }
    }

    @Override
    public final void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 4865: {
                this.a((kug)ktv2);
                break;
            }
            case 4866: {
                this.handleLineContainmentResponse((kuj)ktv2);
                break;
            }
            case 4867: {
                this.a((kuo)ktv2);
                break;
            }
            default: {
                lfn.b(5, "SFTargetHarvester", "receiveResponse() Unhandled response received: " + ktv2.getClass().getName());
                assert (false);
                return;
            }
        }
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append(": AwaitingRemoval=");
        stringBuilder.append(this.eNZ);
        stringBuilder.append(" CanBeRemoved=");
        stringBuilder.append(this.gbU);
        stringBuilder.append(" CleanedUp=");
        stringBuilder.append(this.CleanedUp);
        return stringBuilder.toString();
    }

    protected final int a(float[] fArray, ldv[] ldvArray, ldv[] ldvArray2, int[] nArray) {
        assert (fArray != null);
        assert (fArray.length > 0);
        int n2 = -1;
        float f2 = 100000.0f;
        int n3 = fArray.length;
        for (int i2 = 0; i2 < n3; ++i2) {
            if (!(fArray[i2] < f2) || this.e(ldvArray[i2], ldvArray2[i2], nArray[i2])) continue;
            n2 = i2;
            f2 = fArray[i2];
        }
        return n2;
    }

    protected void a(kug kug2) {
    }

    protected void handleLineContainmentResponse(kuj kuj2) {
    }

    protected abstract void lU(ldv var1);

    protected void a(fuu fuu2) {
    }

    protected void a(kuo kuo2) {
    }

    protected final boolean biI() {
        if (!this.gbT.biE().bgQ().Ux()) {
            return false;
        }
        return this.gbT.biE().bgQ().fi().ag(10352);
    }

    protected final void a(ddu[] dduArray) {
        if (this.eNZ) {
            this.MessageDelegator.hd(this.GUID);
            return;
        }
        this.biG().biQ().a(dduArray);
        this.gbU = true;
    }

    protected final void CA() {
        if (this.eNZ) {
            this.MessageDelegator.hd(this.GUID);
            return;
        }
        this.biG().biQ().zk(this.biG().Ec());
        this.gbU = true;
    }

    protected final void bG(ldv ldv2) {
        assert (ldv2 != null);
        assert (!ldv2.equals(this.GUID));
        fut fut2 = (fut)this.MessageDelegator.h(5635, this.GUID, ldv2);
        fut2.jM(true);
        fut2.Ib(1);
        this.MessageDelegator.F(fut2);
    }

    protected final boolean e(ldv ldv2, ldv ldv3, int n2) {
        cef cef2;
        assert (ldv2 != null);
        assert (ldv3 != null);
        if (this.eNZ) {
            return true;
        }
        if (n2 <= 0) {
            return true;
        }
        if (ldv3.equals(lcr.qAC)) {
            return false;
        }
        if (lcw.enb() && !lcw.abY((int)ldv3.ib())) {
            return true;
        }
        cdb cdb2 = this.gbT.biE().bgQ();
        if (cdb2.aAG() == null) {
            return true;
        }
        if (ldv3.equals(cdb2.aAG().getGUID())) {
            return true;
        }
        return cdb2 instanceof cev && (cef2 = ((cev)cdb2).aLX()).aKR() != null && cef2.aKR().equals(ldv3);
    }

    protected final void biJ() {
        if (this.eNZ) {
            this.CA();
            return;
        }
        ddu ddu2 = new ddu();
        ddu2.dtj = this.gbT.biE().bgQ().getGUID();
        ddu2.Ui = this.gbT.biE().bgQ().aAG().getGUID();
        ddu2.ResourceType = this.gbT.biE().bgQ().az();
        ddu2.dph = this.gbT.biE().bgQ().aAG().av();
        ddu2.dNb = 1.0f;
        ddu2.dur = cxd.f.fQX;
        ddu2.aYH = this.biG().Ec();
        dbj dbj2 = this.biG();
        this.a(new ddu[]{ddu2});
    }

    private void b(gre gre2) {
        lfn.b(5, "SFTargetHarvester", "handleMessageSendingErrorMessage() " + gre2);
        this.lU(gre2.jqf);
    }
}

