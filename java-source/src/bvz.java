/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class bvz
extends bwk {
    private boolean dTx = false;
    private boolean dTE = true;
    private boolean dTF = false;
    private float dTG = 10.0f;
    private float dTH = 4.0f;
    private float dTI;
    private float dTJ;
    private float dTK;
    private boolean dTL = false;
    private boolean dTM = false;
    private boolean dTN = false;
    private Map<ldv, khd> dTw = lcn.emw();

    public bvz(bvd bvd2) {
        super(bvd2);
    }

    public void eG(boolean bl) {
        this.dTx = bl;
    }

    public void eI(boolean bl) {
        this.dTE = bl;
    }

    public void eJ(boolean bl) {
        this.dTF = bl;
    }

    public void dm(float f2) {
        this.dTI = f2;
        this.dTL = true;
    }

    public void dn(float f2) {
        this.dTJ = f2;
        this.dTM = true;
    }

    public void do(float f2) {
        this.dTK = f2;
        this.dTN = true;
    }

    public void dp(float f2) {
        this.dTG = f2;
    }

    public void dq(float f2) {
        this.dTH = f2;
    }

    @Override
    public final void aAy() {
        assert (this.Uk != null);
        assert (this.Uk.axa() != null);
        assert (this.dVj != null);
        kmj kmj2 = (kmj)this.MessageDelegator.h(3329);
        kmj2.Zf(8);
        kmj2.ts(this.GUID);
        kmj2.hC(this.Uk.axa());
        kmj2.tE(this.dVj);
        this.MessageDelegator.a(kmj2);
    }

    @Override
    public final void aAz() {
        assert (this.Uk != null);
        assert (this.Uk.axa() != null);
        assert (this.dVj == null);
        kmb kmb2 = (kmb)this.MessageDelegator.h(3341);
        kmb2.iBr = true;
        kmb2.ec = this.GUID;
        kmb2.Rs = this.Uk.axa();
        kmb2.Type = 977;
        kmb2.pKW = 50;
        if (this.dTL) {
            kmb2.Type |= 0x400;
            kmb2.dTI = this.dTI;
        }
        if (this.dTM) {
            kmb2.Type |= 0x800;
            kmb2.dTJ = this.dTJ;
        }
        if (this.dTN) {
            kmb2.Type |= 0x1000;
            kmb2.dTK = this.dTK;
        }
        kmb2.dsK = true;
        kmb2.pKU = this.dTx;
        kmb2.pLs = this.dTE;
        kmb2.pLt = this.dTF;
        kmb2.dTG = this.dTG;
        kmb2.dTH = this.dTH;
        this.MessageDelegator.a(kmb2);
        this.dTw.put(kmb2.getGUID(), kmb2);
    }

    @Override
    public final void aAA() {
        assert (this.Uk != null);
        assert (this.Uk.axa() != null);
        assert (this.dVj != null);
    }

    @Override
    public final void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 5376: {
                this.a((kvl)ktv2);
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    @Override
    public final void aAB() {
        assert (this.Uk != null);
        assert (this.dVj != null);
        kmb kmb2 = (kmb)this.MessageDelegator.h(3341);
        kmb2.ts(this.GUID);
        kmb2.Type = 2;
        kmb2.hC(this.dVj);
        this.MessageDelegator.a(kmb2);
        this.dVj = null;
    }

    @Override
    public final void d(lgj lgj2) {
        assert (this.Uk != null);
        assert (lgj2 != null);
        if (this.dVj == null) {
            return;
        }
        kma kma2 = (kma)this.MessageDelegator.h(3349);
        kma2.ts(this.GUID);
        kma2.hC(this.dVj);
        kma2.aZa = lgj2.aZa;
        kma2.pKV = lgj2.eqJ();
        kma2.Rotation = lgj2.eqK();
        kma2.pLf = lgj2.aZb;
        this.MessageDelegator.a(kma2);
    }

    @Override
    public final void e(lgj lgj2) {
        Object object;
        assert (this.Uk != null);
        assert (lgj2 != null);
        if (this.dVj == null) {
            return;
        }
        if (lcw.enb()) {
            object = lgj2.eqJ();
            ((ljw)object).x = (int)((float)((ljw)object).x + 65536.0f);
            lgj2 = new lgj(lgj2.aZa, (ljw)object, lgj2.eqK(), lgj2.aZb);
        }
        object = (kmb)this.MessageDelegator.h(3341);
        ((khd)object).ts(this.GUID);
        ((kmb)object).Type = 8;
        ((kmn)object).hC(this.dVj);
        ((kmb)object).aZa = lgj2.aZa;
        ((kmb)object).pKV = lgj2.eqJ();
        ((kmb)object).Rotation = lgj2.eqK();
        ((kmb)object).pLf = lgj2.aZb;
        this.MessageDelegator.a((khd)object);
    }

    private void a(kvl kvl2) {
        khd khd2 = this.dTw.remove(kvl2.dXg());
        if (khd2 == null) {
            lfn.b(5, "SFAnimationStreamControllerManager", "handlePhysicsResponse() Could not find request " + kvl2.dXg());
            return;
        }
        if (kvl2.getResult() != 0) {
            if (this.dVj == null) {
                lfn.b(5, "SFAnimationStreamControllerManager", "handlePhysicsResponse() StreamController could not be created: " + kvl2.getResult());
            }
            lfn.b(5, "SFAnimationStreamControllerManager", "handlePhysicsResponse() Something went wrong. ErrorCode=" + kvl2.getResult());
            return;
        }
        switch (khd2.bUV()) {
            case 3341: {
                if (this.dVj != null) {
                    lfn.b(5, "SFAnimationStreamControllerManager", "handlePhysicsResponse() StreamControllerGUID is already set.");
                    return;
                }
                this.dVj = kvl2.axa();
                this.aAy();
                break;
            }
            default: {
                lfn.b(5, "SFAnimationStreamControllerManager", "handlePhysicsResponse() Unhandled physicsresponse with RequestType=" + khd2.bUV());
                lfn.b(5, "SFAnimationStreamControllerManager", "handlePhysicsResponse() GUID=" + this.GUID + " MeshObject=" + this.Uk.getGUID());
                return;
            }
        }
    }
}

