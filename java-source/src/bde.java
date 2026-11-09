/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ayd
 *  lcr
 */
import java.util.Map;
import java.util.Queue;

public class bde
extends btk {
    private static final double cZE = 1800.0;
    private ayd cCy = null;
    private bcy cZt = null;
    private int cZF = 0;
    private double cZG = 0.0;
    private Queue<lil<String, Integer, bdf>> cZH = null;
    private Map<Integer, bdf> cZI = null;
    private double cZJ = 0.0;

    public bde(ayd ayd2) {
        this.cCy = ayd2;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.cZH = lcn.emA();
        this.cZI = lcn.emw();
        this.cZt = new bcy(this.cCy, this);
        this.cZt.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.cZt);
    }

    @Override
    public void cleanUp() {
        if (this.cZt != null) {
            this.cZt.cleanUp();
            this.MessageDelegator.hd(this.cZt.getGUID());
            this.cZt = null;
        }
        super.cleanUp();
    }

    public void doTick(ldz ldz2) {
        if (ldz2.rgz - this.cZJ >= 1800.0) {
            this.cZt.alu();
            this.cZJ = ldz2.rgz;
        }
        if (this.cZF == 1) {
            return;
        }
        if (ldz2.rgz - this.cZG < 0.25) {
            return;
        }
        if (this.cZH != null && !this.cZH.isEmpty()) {
            lil<String, Integer, bdf> lil2 = this.cZH.poll();
            if (lil2 != null && lil2.reX != null && lil2.reY != null && lil2.reZ != null) {
                this.h((String)lil2.reX, (Integer)lil2.reY);
                this.cZI.put((Integer)lil2.reY, (bdf)lil2.reZ);
            }
            return;
        }
    }

    public void c(bda bda2) {
        if (bda2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "logTransactions() : LogEntry is null!");
            return;
        }
        this.cZt.a(bda2);
        this.b(new bda[]{bda2});
    }

    public void a(bda[] bdaArray) {
        if (bdaArray == null || bdaArray.length == 0) {
            lfn.b(5, this.getClass().getSimpleName(), "logTransactions() : LogEntry is null!");
            return;
        }
        for (int i = 0; i < bdaArray.length; ++i) {
            this.cZt.a(bdaArray[i]);
        }
        this.b(bdaArray);
    }

    boolean a(String string, int n, bdf bdf2) {
        if (string == null || string.isEmpty() || bdf2 == null) {
            return false;
        }
        this.cZH.add(new lil<String, Integer, bdf>(string, n, bdf2));
        return true;
    }

    bcx d(env env2) {
        bbr bbr2 = this.cCy.dR(env2.bHi());
        if (bbr2 == null && !env2.bEN().lo()) {
            return bcx.cYj;
        }
        if (bbr2 != null && !bbr2.b(bca.cUb)) {
            return bcx.cYj;
        }
        if (!env2.bJK().alP()) {
            return bcx.cYk;
        }
        return bcx.cYi;
    }

    private void b(bda[] bdaArray) {
        assert (bdaArray != null);
        assert (bdaArray.length > 0);
        gmm gmm2 = (gmm)this.MessageDelegator.h(3603, this.cCy.getGUID(), lcr.qEl);
        gmm2.ch(this.cCy.getGUID());
        gmm2.c(bdaArray);
        this.MessageDelegator.F(gmm2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 3585: {
                this.a((gmb)dxq2);
                break;
            }
            case 13919: 
            case 13921: {
                this.cZt.receiveMessage(dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(gmb gmb2) {
        bbr bbr2 = this.cCy.dR(gmb2.aO());
        if (bbr2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleStatsClanBankLogMessage() : Cause Member Not Found!!!... Assigning Logs To Leader!?!");
            assert (false);
            bbr2 = this.cCy.dR(this.cCy.ZV());
        }
        this.a(bda.a(gmb2, bbr2, this.MessageDelegator));
    }

    private void h(String string, int n) {
        kdj kdj2 = (kdj)this.MessageDelegator.i(259, this.GUID, lcr.qyX);
        kdj2.wA("Darkfall_Read");
        kdj2.setContext(n);
        kdj2.wB(string);
        this.MessageDelegator.b(kdj2);
        ++this.cZF;
        this.cZG = this.MessageDelegator.arc().rgz;
    }

    @Override
    public void receiveMiddlewareMessage(kcz kcz2) {
        switch (kcz2.getMessageType()) {
            case 260: {
                this.d((kdk)kcz2);
                break;
            }
            default: {
                super.receiveMiddlewareMessage(kcz2);
            }
        }
    }

    private void d(kdk kdk2) {
        --this.cZF;
        bdf bdf2 = this.cZI.remove(kdk2.getContext());
        if (bdf2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleMiddlewareSQLResultMessage() : No Query Handler Found for Received Result!!!... Context = " + kdk2.getContext());
            assert (false);
            return;
        }
        if (kdk2.dVr().getErrorCode() != 0) {
            lfn.b(5, this.getClass().getSimpleName(), "handleMiddlewareSQLResultMessage() : Result Indicates an Error Occurred!!!... Context = " + kdk2.getContext() + ", ErrorCode = " + kdk2.dVr().getErrorCode());
            assert (false);
            bdf2.ad(kdk2.getContext(), kdk2.dVr().getErrorCode());
        } else {
            bdf2.a(kdk2.getContext(), kdk2.dVr());
        }
    }
}

