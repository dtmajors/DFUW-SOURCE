/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ha
 *  lcr
 */
import java.util.List;
import java.util.Map;

public class fi {
    public static final int Qj = 1;
    private static double Qk = 10.0;
    private static double Ql = 360.0;
    private static double Qm = 120.0;
    private static double Qn = 7.0;
    private static double Qo = 5.0;
    private static double Qp = 20.0;
    private static float Qq = -0.001f;
    private static boolean Qr = true;
    private int Qs = 0;
    private final ha hF;
    private double Qt = 0.0;
    private double Qu = 0.0;
    private double Qv = 0.0;
    private int Qw = 0;
    private boolean Qx = false;
    private boolean Qy = false;
    private boolean Qz = false;
    private long QA = 0L;
    private int QB = 0;
    private ldv QC = null;
    private final List<a> QD;
    private boolean QE = true;
    private boolean QF = false;
    private final b QG;
    private final b QH;
    private final Map<String, dzo> QI;
    private final Map<Integer, dzo> QJ;
    private final Map<String, dzp> QK;
    private final Map<Integer, dzp> QL;

    public void a(long l) {
        this.QA = l;
    }

    public long gz() {
        return this.QA;
    }

    public void e(double d2) {
        this.QA = (long)((double)this.QA - d2);
    }

    public fi(ha ha2) {
        this.hF = ha2;
        this.QG = new b(this, null);
        this.QH = new b(this, null);
        this.QD = lcn.emA();
        this.QI = lcn.emw();
        this.QJ = lcn.emw();
        this.QK = lcn.emw();
        this.QL = lcn.emw();
    }

    public int getAlignment() {
        return this.Qw;
    }

    private boolean gA() {
        return this.Qw < 0;
    }

    private boolean gB() {
        return !this.gA();
    }

    public boolean gC() {
        return this.Qx;
    }

    public boolean gD() {
        return this.Qy;
    }

    public void a(double d2, float f2, int n, ldv ldv2) {
    }

    public void gE() {
    }

    public void gF() {
    }

    public void gG() {
    }

    public void gH() {
        this.QE = false;
        this.QH.QQ = true;
        if (this.Qv <= 0.0) {
            this.Qv = Qo;
        }
    }

    public void gI() {
        this.QG.a(this.QH);
        this.QF = true;
    }

    public void gJ() {
    }

    public void doTick(ldz ldz2) {
    }

    private boolean gK() {
        return true;
    }

    public void bo(int n) {
        if (n > 10) {
            lfn.b(5, this.getClass().getSimpleName(), "setInitialAlignment() : Alignment for '" + this.hF.iU() + "' " + this.hF.getGUID() + " is too high!... Alignment = " + n);
            n = 10;
        } else if (n < -10) {
            lfn.b(5, this.getClass().getSimpleName(), "setInitialAlignment() : Alignment for '" + this.hF.iU() + "' " + this.hF.getGUID() + " is too low!... Alignment = " + n);
            n = -10;
        }
        this.Qw = n;
    }

    private void bp(int n) {
        if (n >= 0 && !this.Qz) {
            lfn.b(5, this.getClass().getSimpleName(), "modifyAlignment() : Positive alignment modification message received for '" + this.hF.iU() + "' " + this.hF.getGUID() + ", but it is not from a temple!");
            assert (false);
            return;
        }
        if (n == 0) {
            return;
        }
        int n2 = this.Qw + n;
        if (n2 > 10) {
            n2 = 10;
        } else if (n2 < -10) {
            n2 = -10;
        }
        this.setAlignment(n2);
    }

    private void setAlignment(int n) {
        if (this.Qw == n) {
            return;
        }
        boolean bl = this.gB();
        boolean bl2 = n < this.Qw;
        this.Qw = n;
        if (bl && this.gA()) {
            this.QD.clear();
            this.A(false);
            this.z(false);
            this.QH.QQ = true;
            this.gN();
        } else if (!bl && this.gB()) {
            this.QD.clear();
            this.QH.QQ = true;
            this.gN();
        } else if (this.gB() && bl2) {
            this.QD.clear();
            this.z(true);
        }
        if (this.hF.jf() != null) {
            this.hF.jf().fi().i(1296, this.Qw);
        }
        this.hF.jz().rs();
    }

    private void gL() {
    }

    private void z(boolean bl) {
    }

    private void A(boolean bl) {
    }

    public void gM() {
    }

    private void gN() {
    }

    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 23298: {
                this.a((dzk)dxq2);
                break;
            }
            case 23299: {
                this.a((dzg)dxq2);
                break;
            }
            case 23301: {
                this.a((dzo)dxq2);
                break;
            }
            case 23302: {
                this.a((dzp)dxq2);
                break;
            }
            case 23303: {
                this.a((dzf)dxq2);
                break;
            }
            case 23305: {
                this.a((dzq)dxq2);
                break;
            }
            case 23306: {
                this.a((dzr)dxq2);
                break;
            }
            case 23307: {
                this.a((dzm)dxq2);
                break;
            }
            case 23308: {
                this.a((dzn)dxq2);
                break;
            }
            case 26885: {
                this.a((fvd)dxq2);
                break;
            }
            default: {
                lfn.b(5, this.getClass().getSimpleName(), "receiveMessage() : Unhandled message received!... Message = " + dxq2);
                return;
            }
        }
    }

    private void a(dzk dzk2) {
        this.bp(dzk2.ijw);
    }

    private void a(dzg dzg2) {
        dzh dzh2 = (dzh)this.hF.getMessageDelegator().h(23300, this.hF.getGUID(), dzg2.aO());
        this.hF.getMessageDelegator().b(dzg2, dzh2);
        dzh2.iju = this.Qx;
        dzh2.RB = this.hF.hk().ib();
        dzh2.Qw = this.getAlignment();
        this.hF.getMessageDelegator().F(dzh2);
    }

    private void a(dzf dzf2) {
    }

    private void a(dzo dzo2) {
        if (!this.hF.jT().b(dzo2)) {
            lfn.b(4, this.getClass().getSimpleName(), "handleAlignmentPropertySetMessage() : Alignment print request received from an unauthorised player! Message = " + dzo2);
            return;
        }
        if (dzo2.YL != null) {
            if (this.QI.containsKey(dzo2.YL.toLowerCase())) {
                return;
            }
            this.QI.put(dzo2.YL.toLowerCase(), dzo2);
            this.aw(dzo2.YL);
            return;
        }
        this.g(dzo2.dVm, false);
    }

    private void a(dzp dzp2) {
        if (!this.hF.jT().b(dzp2)) {
            lfn.b(4, this.getClass().getSimpleName(), "handleAlignmentPropertySetMessage() : Alignment set request received from an unauthorised player! Message = " + dzp2);
            return;
        }
        if (dzp2.YL != null) {
            if (this.QK.containsKey(dzp2.YL.toLowerCase())) {
                return;
            }
            this.QK.put(dzp2.YL.toLowerCase(), dzp2);
            this.aw(dzp2.YL);
            return;
        }
        switch (dzp2.dVm) {
            case 1: {
                if (dzp2.ijB > 10) {
                    return;
                }
                if (dzp2.ijB < -10) {
                    return;
                }
                if (this.Qw == dzp2.ijB) {
                    return;
                }
                this.setAlignment(dzp2.ijB);
                break;
            }
            default: {
                return;
            }
        }
        this.g(dzp2.dVm, true);
    }

    private void a(fvd fvd2) {
        String string;
        dzo dzo2 = this.QI.remove(fvd2.Yb.awJ.toLowerCase());
        dzp dzp2 = this.QK.remove(fvd2.Yb.awJ.toLowerCase());
        if (dzo2 == null && dzp2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleObjectInfoManagerLookupPlayerResponseMessage() : Player look-up response received, but no request could be found! Response Key = " + fvd2.Yb);
            assert (false);
            return;
        }
        String string2 = string = dzp2 == null ? dzo2.YL : dzp2.YL;
        if (fvd2.iXC == null || fvd2.iXC.length == 0) {
            return;
        }
        if (fvd2.iXC.length > 1) {
            return;
        }
        if (dzo2 != null) {
            this.a(fvd2.iXC[0].Ri, dzo2);
        }
        if (dzp2 != null) {
            this.a(fvd2.iXC[0].Ri, dzp2);
        }
    }

    private void a(dzm dzm2) {
        if (!dzm2.bEN().b((dzo)null)) {
            lfn.b(4, this.getClass().getSimpleName(), "handleAlignmentPrintRequestMessage() : Alignment print request received from an unauthorised player! Message = " + dzm2);
            this.a(dzm2, false);
            return;
        }
        this.a(dzm2, true);
    }

    private void a(dzn dzn2) {
        dzo dzo2 = this.QJ.remove(dzn2.aVk());
        if (dzo2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleAlignmentPrintResponseMessage() : Alignment print response received, but no matching request could be found!... Received Response = " + dzn2);
            assert (false);
            return;
        }
        this.a(dzo2, dzn2);
    }

    private void a(dzq dzq2) {
        if (!dzq2.bEN().b((dzp)null)) {
            lfn.b(4, this.getClass().getSimpleName(), "handleAlignmentSetRequestMessage() : Alignment set request received from an unauthorised player! Message = " + dzq2);
            this.a(dzq2, false);
            return;
        }
        switch (dzq2.bEO()) {
            case 1: {
                if (dzq2.getAlignment() < -10 || dzq2.getAlignment() > 10) {
                    this.a(dzq2, false);
                    return;
                }
                this.setAlignment(dzq2.getAlignment());
                break;
            }
            default: {
                this.a(dzq2, false);
                return;
            }
        }
        this.a(dzq2, true);
    }

    private void a(dzr dzr2) {
        dzp dzp2 = this.QL.remove(dzr2.aVk());
        if (dzp2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleAlignmentSetResponseMessage() : Alignment set response received, but no matching request could be found! Response Message = " + dzr2);
            assert (false);
            return;
        }
        this.a(dzp2, dzr2.bEP());
    }

    private void aw(String string) {
        ma ma2 = new ma();
        ma2.afj = 3;
        ma2.awJ = string;
        fvc fvc2 = (fvc)this.hF.getMessageDelegator().h(26884, this.hF.getGUID(), lcr.qAN);
        fvc2.sk(0x7FFFFFFE);
        fvc2.Yb = ma2;
        this.hF.getMessageDelegator().F(fvc2);
    }

    private void a(ldv ldv2, dzo dzo2) {
        dzm dzm2 = (dzm)this.hF.getMessageDelegator().h(23307, this.hF.getGUID(), ldv2);
        dzm2.sk(this.Qs++);
        dzm2.f(this.hF.jT());
        dzm2.Dh(dzo2.dVm);
        this.hF.getMessageDelegator().F(dzm2);
        this.QJ.put(dzm2.aVk(), dzo2);
    }

    private void a(dzm dzm2, boolean bl) {
        dzn dzn2 = (dzn)this.hF.getMessageDelegator().h(23308, this.hF.getGUID(), dzm2.aO());
        this.hF.getMessageDelegator().b(dzm2, dzn2);
        dzn2.jO(bl);
        if (bl) {
            switch (dzm2.bEO()) {
                case 1: {
                    dzn2.setAlignment(this.Qw);
                    break;
                }
                default: {
                    dzn2.jO(false);
                }
            }
        }
        this.hF.getMessageDelegator().F(dzn2);
    }

    private void a(ldv ldv2, dzp dzp2) {
        dzq dzq2 = (dzq)this.hF.getMessageDelegator().h(23305, this.hF.getGUID(), ldv2);
        dzq2.sk(this.Qs++);
        dzq2.f(this.hF.jT());
        dzq2.Dh(dzp2.dVm);
        dzq2.setAlignment(dzp2.ijB);
        dzq2.jP(dzp2.ijC);
        dzq2.by(dzp2.ijD);
        this.hF.getMessageDelegator().F(dzq2);
        this.QL.put(dzq2.aVk(), dzp2);
    }

    private void a(dzq dzq2, boolean bl) {
        dzr dzr2 = (dzr)this.hF.getMessageDelegator().h(23306, this.hF.getGUID(), dzq2.aO());
        this.hF.getMessageDelegator().b(dzq2, dzr2);
        dzr2.jO(bl);
        this.hF.getMessageDelegator().F(dzr2);
    }

    private void g(int n, boolean bl) {
        switch (n) {
            case 1: {
                fgs fgs2 = (fgs)this.hF.getMessageDelegator().h(29446, this.hF.getGUID(), this.hF.getGUID());
                fgs2.r(bl ? mbv.uoh.bD(this.Qw) : mbv.uoi.bD(this.Qw));
                this.hF.receiveMessage((dxq)fgs2);
                break;
            }
            default: {
                return;
            }
        }
    }

    private void a(dzo dzo2, dzn dzn2) {
        if (!dzn2.bEP()) {
            return;
        }
        switch (dzo2.dVm) {
            case 1: {
                fgs fgs2 = (fgs)this.hF.getMessageDelegator().h(29446, this.hF.getGUID(), this.hF.getGUID());
                fgs2.r(mbv.uoi.bD(this.Qw));
                this.hF.receiveMessage((dxq)fgs2);
                break;
            }
            default: {
                return;
            }
        }
    }

    private void a(dzp dzp2, boolean bl) {
        if (!bl) {
            return;
        }
        switch (dzp2.dVm) {
            case 1: {
                fgs fgs2 = (fgs)this.hF.getMessageDelegator().h(29446, this.hF.getGUID(), this.hF.getGUID());
                fgs2.r(mbv.uoh.bD(this.Qw));
                this.hF.receiveMessage((dxq)fgs2);
                break;
            }
            default: {
                return;
            }
        }
    }

    static /* synthetic */ b a(fi fi2) {
        return fi2.QG;
    }
}

