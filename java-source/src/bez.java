/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dqx
 *  lcr
 *  lcw
 */
import java.util.List;
import java.util.Map;
import java.util.Random;

public class bez
extends btk {
    public static final boolean bC = false;
    private ldz.a dfu;
    private Map<Integer, bfa> dfv = lcn.emw();
    private int dfw = -1;
    private dsv.a dfx;
    private bfa dfy;
    private dqw dfz;
    private dqx dfA;
    public static final String dfB = "moving some air.ogg";
    public static final String dfC = "hell choir hit 1.ogg";
    private boolean dfD = true;
    Random dfE = new Random();

    public bez() {
        jwn jwn2 = new jwn();
        this.dfv = jwn2.dUs();
    }

    @Override
    public void initialize() {
        if (lcw.qFQ) {
            dsv.dfx = dsv.a.gZu;
        }
        this.dfz = new dqw();
        this.dfz.setGUID(lcr.qDV);
        this.MessageDelegator.a(this.dfz);
        this.dfA = new dqx();
        this.dfA.setGUID(lcr.qDY);
        this.MessageDelegator.a((amf)this.dfA);
    }

    public void J(ldz ldz2) {
        ldz.a a2 = ldz2.enQ();
        if (lcw.qFQ) {
            if (this.dfx != dsv.a.gZu) {
                this.dfx = dsv.a.gZu;
                String string = dfC;
                this.dfz.iY(string);
            }
            return;
        }
        if (a2 != this.dfu || this.dfy == null) {
            this.dfu = a2;
            if (this.dfy == null) {
                this.anS();
            } else {
                this.b(this.dfu);
            }
        }
        if (this.dfx != dsv.dfx && this.dfu != null) {
            this.dfx = dsv.dfx;
            if (this.dfy == null) {
                this.anS();
            } else {
                this.b(this.dfu);
            }
        }
        if (this.dfD != lcw.qFx) {
            if (!lcw.qFx) {
                this.dfz.hs(0.2f);
                this.dfz.iR(true);
            } else {
                this.dfz.hs(3.0f);
                this.dfz.iR(false);
            }
            this.dfD = lcw.qFx;
        }
    }

    public void anS() {
        if (this.dfw == dsv.dfw) {
            return;
        }
        this.dfw = dsv.dfw;
        bfa bfa2 = this.dfv.get(this.dfw);
        if (bfa2 == null) {
            return;
        }
        if (this.dfy != bfa2 || !this.dfz.isStarted()) {
            // empty if block
        }
        this.dfy = bfa2;
        this.b(this.dfu);
    }

    private void b(ldz.a a2) {
        if (this.dfx == null) {
            return;
        }
        if (lcw.qFQ && this.dfx == dsv.a.gZu) {
            return;
        }
        switch (this.dfx) {
            case gZu: {
                String string = dfC;
                this.dfz.iY(string);
                return;
            }
            case gZt: {
                String string = dfB;
                this.dfz.iY(string);
                return;
            }
        }
        assert (this.dfy != null);
        List<dqy> list = null;
        switch (a2) {
            case rgB: {
                list = this.dfy.dfG;
                break;
            }
            case rgC: {
                list = this.dfy.dfH;
                break;
            }
            case rgD: {
                list = this.dfy.dfI;
                break;
            }
            case rgE: {
                list = this.dfy.dfJ;
                break;
            }
            default: {
                assert (false);
                break;
            }
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        String string = this.ad(list);
        this.dfz.iY(string);
    }

    private String ad(List<dqy> list) {
        int n = 0;
        for (dqy dqy2 : list) {
            if (dqy2.ddW <= 0) {
                return this.ae(list);
            }
            n += dqy2.ddW;
        }
        int n2 = this.dfE.nextInt(n);
        lfn.print("12345: ROLL DICE: " + n2 + " [0 ... " + (n - 1) + "]");
        int n3 = 0;
        for (dqy dqy3 : list) {
            lfn.print("12345: " + dqy3.FileName + " has probability " + dqy3.ddW + " , total up to now is: " + (n3 += dqy3.ddW));
            if (n2 >= n3) continue;
            lfn.print("12345: DICE is LESS THAN concatenated probability so returning: " + dqy3.FileName);
            return dqy3.FileName;
        }
        assert (false);
        return null;
    }

    private String ae(List<dqy> list) {
        return list.get((int)this.dfE.nextInt((int)list.size())).FileName;
    }
}

