/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.List;
import java.util.Map;

public class hyu
extends ihs {
    private static final String TC = "SFDuelTeamWindow";
    public static final double lps = 2.0;
    public static final int lpt = 1;
    public static final int lpu = 3;
    public static final int lpv = 29;
    public static final int lpw = 0x1B1B1B;
    public static final String lpx = "ProgressBarBackground";
    public static final String lpy = "ProgressBarForeground";
    public static final String lpz = "ProgressBarSeparatorGlow";
    private static final int lpA = 15;
    private static final int lpB = 18;
    private static final int lpC = 0xABABAB;
    private static final int lpD = 0xABABAB;
    private static final int lpE = 12357465;
    public static final String lpF = "DuelBarBackgroundLeft";
    public static final String lpG = "DuelBarBackgroundRight";
    public static int lpH = 500;
    private final hyq lpI;
    private ipb lpJ;
    private ipx lpK;
    private ipx lpL;
    Map<ldv, b> lpM = lcn.emw();
    Map<ldv, b> lpN = lcn.emw();
    int[] lpO = new int[]{352, 354, 11536, 11552, 1328};
    private boolean lpP = false;
    private List<dxq> lpQ = lcn.emv();
    private int lpR;
    private Map<Integer, b> lpS = lcn.emw();

    public hyu(hyq hyq2) {
        super("DuelTeamWindow", "DuelTeamWindow.swf");
        this.a(hya.lmp, true);
        this.OQ(-1);
        this.U(100.0f, 80.0f);
        this.qW(true);
        this.qX(true);
        this.lpI = hyq2;
    }

    public void closeWindow() {
        this.close();
        if (this.lpI != null) {
            this.lpI.s(this);
        }
    }

    @Override
    protected void cCu() {
        super.cCu();
        this.a(new ipb("/dfdata/texture/gui/j2f/duels/title_icon_duels.png"), 10, 0, 24, lwu.tib.bD(new Object[0]));
        this.lpJ = new ipb("WindowMiddle");
        this.cXE().a(iqo.dmS());
        this.lpL = new ipx(iqo.dmT());
        ipx ipx2 = ipx.d(this.lpL);
        this.cXE().W(ipx2);
        ipx ipx3 = ipx.d(ipx.a(85, 85, this.lpJ));
        this.cXE().W(ipx3);
        this.lpK = new ipx(iqo.dmT());
        ipx ipx4 = ipx.d(this.lpK);
        this.cXE().W(ipx4);
        this.cEk();
    }

    @Override
    protected void cuf() {
        super.cuf();
        if (this.lpP) {
            return;
        }
        this.lpP = true;
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        if (!this.lpP) {
            return;
        }
        if (!this.lpQ.isEmpty()) {
            for (dxq dxq2 : this.lpQ) {
                this.receiveMessage(dxq2);
            }
            this.lpQ.clear();
        }
    }

    @Override
    protected void ku(float f) {
        super.ku(f);
        if (this.lpJ != null) {
            this.lpJ.hz(f);
        }
        if (this.lpL != null) {
            this.lpL.hz(f);
        }
        if (this.lpK != null) {
            this.lpK.hz(f);
        }
    }

    @Override
    protected ipq cGj() {
        return null;
    }

    @Override
    protected ios cGk() {
        return null;
    }

    public void receiveMessage(dxq dxq2) {
        if (!this.lpP) {
            this.lpQ.add(dxq2);
            return;
        }
        int n = dxq2.bEz();
        switch (n) {
            case 16661: {
                this.a((erf)dxq2);
                break;
            }
            case 8195: {
                this.b((gzp)dxq2);
                break;
            }
            case 8196: {
                this.b((gzq)dxq2);
                break;
            }
            case 8197: {
                this.a((gzu)dxq2);
                break;
            }
            case 13059: {
                this.b((glb)dxq2);
                break;
            }
            default: {
                assert (false);
                super.receiveMessage(dxq2);
            }
        }
    }

    private void b(glb glb2) {
        b b2 = this.lpS.remove(glb2.aVk());
        if (b2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "");
            return;
        }
        b2.bbA = glb2.aUa;
    }

    private void a(gzu gzu2) {
        if (gzu2.jvJ != 3) {
            return;
        }
        b b2 = null;
        for (b b3 : this.lpM.values()) {
            if (!b3.bWM.equals(gzu2.aO())) continue;
            b2 = b3;
            this.lpM.remove(b3.GUID);
            break;
        }
        if (b2 == null) {
            for (b b3 : this.lpN.values()) {
                if (!b3.bWM.equals(gzu2.aO())) continue;
                b2 = b3;
                this.lpN.remove(b3.GUID);
                break;
            }
        }
        this.a(b2);
    }

    private void b(gzq gzq2) {
        if (gzq2.DR == null) {
            return;
        }
        b ejArray = null;
        for (b object : this.lpM.values()) {
            if (!object.bWM.equals(gzq2.aO())) continue;
            ejArray = object;
            break;
        }
        if (ejArray == null) {
            for (b b2 : this.lpN.values()) {
                if (!b2.bWM.equals(gzq2.aO())) continue;
                ejArray = b2;
                break;
            }
        }
        if (ejArray == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleAttributeValueMessage there is no team member wiretapped with this GUID");
            return;
        }
        boolean bl = false;
        for (ej ej2 : gzq2.DR) {
            bl = this.a(ejArray, ej2);
        }
        if (bl) {
            this.pi(false);
        }
    }

    private boolean a(b b2, ej ej2) {
        switch (ej2.getType()) {
            case 352: {
                b2.aGr = ((Float)ej2.getValue()).floatValue();
                return true;
            }
            case 354: {
                b2.bWk = ((Float)ej2.getValue()).floatValue();
                return true;
            }
            case 11536: {
                b2.lqa = ((ff)ej2).getStringValue();
                b2.cGn();
                return true;
            }
            case 11552: {
                b2.lpZ = ((ff)ej2).getStringValue();
                b2.cGn();
                return true;
            }
            case 1328: {
                b2.YL = ((ff)ej2).getStringValue();
                return true;
            }
        }
        return false;
    }

    private void b(gzp gzp2) {
        if (gzp2.bhp == null) {
            return;
        }
        b b2 = null;
        for (b b3 : this.lpM.values()) {
            if (!b3.bWM.equals(gzp2.aO())) continue;
            b2 = b3;
            break;
        }
        if (b2 == null) {
            for (b b3 : this.lpN.values()) {
                if (!b3.bWM.equals(gzp2.aO())) continue;
                b2 = b3;
                break;
            }
        }
        if (b2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleAttributeValueMessage there is no team member wiretapped with this GUID");
            return;
        }
        if (this.a(b2, gzp2.bhp)) {
            this.pi(false);
        }
    }

    private void a(erf erf2) {
        switch (erf2.ilu) {
            case 0: {
                this.d(erf2);
                break;
            }
            case 1: {
                this.c(erf2);
                break;
            }
            case 2: {
                this.b(erf2);
            }
        }
    }

    private void b(erf erf2) {
        for (b b2 : this.lpM.values()) {
            this.b(b2);
            this.c(b2);
        }
        this.lpM.clear();
        for (b b2 : this.lpN.values()) {
            this.b(b2);
            this.c(b2);
        }
        this.lpN.clear();
        this.setVisible(false);
        this.closeWindow();
    }

    private void c(erf erf2) {
        b b2 = null;
        if (this.lpM.containsKey(erf2.YN)) {
            b2 = this.lpM.remove(erf2.YN);
        } else if (this.lpN.containsKey(erf2.YN)) {
            b2 = this.lpN.remove(erf2.YN);
        } else {
            return;
        }
        this.a(b2);
    }

    private void a(b b2) {
        if (b2 == null) {
            return;
        }
        this.b(b2);
        this.c(b2);
        if (this.lpM.size() < 1 && this.lpN.size() < 1) {
            this.setVisible(false);
            this.closeWindow();
        } else {
            this.pi(true);
        }
    }

    private void b(b b2) {
        gzr gzr2 = (gzr)this.MessageDelegator.h(8194, this.GUID, b2.GUID);
        gzr2.bWM = b2.bWM;
        this.MessageDelegator.F(gzr2);
        b2.bWM = null;
    }

    private void d(erf erf2) {
        assert (erf2.ilu == 0);
        b b2 = new b(this);
        b2.YL = erf2.YL;
        b2.GUID = erf2.YN;
        if (erf2.ixP == 0) {
            this.lpM.put(erf2.YN, b2);
            this.lpN.remove(erf2.YN);
        } else {
            this.lpN.put(erf2.YN, b2);
            this.lpM.remove(erf2.YN);
        }
        if (this.lpM.size() > 0 || this.lpN.size() > 0) {
            this.setVisible(true);
        }
        this.a(b2, erf2.ixP);
        this.d(b2);
        this.pi(true);
    }

    private void a(b b2, int n) {
        ldv ldv2 = lcr.O((int)-1, (ldv)b2.GUID);
        int n2 = n == 0 ? del.glq : del.glr;
        gla gla2 = (gla)this.MessageDelegator.h(13065, this.GUID, ldv2);
        gla2.SpecialEffectType = n2;
        gla2.jkQ = true;
        gla2.aqs = this.lpR;
        gla2.jkP = true;
        this.lpS.put(this.lpR++, b2);
        this.MessageDelegator.F(gla2);
    }

    private void c(b b2) {
        if (b2.bbA == null) {
            return;
        }
        ldv ldv2 = lcr.O((int)-1, (ldv)b2.GUID);
        gla gla2 = (gla)this.MessageDelegator.h(13065, this.GUID, ldv2);
        gla2.jkP = false;
        this.MessageDelegator.F(gla2);
    }

    private void pi(boolean bl) {
        if (bl) {
            this.lpL.removeAllChildren();
            for (b b2 : this.lpM.values()) {
                this.lpL.W(new a(this, b2, 0));
            }
            this.lpK.removeAllChildren();
            for (b b2 : this.lpN.values()) {
                this.lpK.W(new a(this, b2, 1));
            }
            this.pack();
        } else {
            if (this.lpL != null) {
                for (ipf ipf2 : this.lpL.getChildren()) {
                    if (!(ipf2 instanceof a)) continue;
                    ((a)ipf2).cGm();
                }
            }
            if (this.lpK != null) {
                for (ipf ipf2 : this.lpK.getChildren()) {
                    if (!(ipf2 instanceof a)) continue;
                    ((a)ipf2).cGm();
                }
            }
        }
    }

    private void d(b b2) {
        b2.bWM = this.MessageDelegator.bzv();
        dqi dqi2 = new dqi();
        dqi2.setGUID(b2.bWM);
        dqi2.nC(this.GUID);
        dqi2.M(this.lpO);
        gzo gzo2 = (gzo)this.MessageDelegator.h(8193, this.GUID, b2.GUID);
        gzo2.jvG = dqi2;
        this.MessageDelegator.F(gzo2);
    }

    @Override
    protected void cEq() {
        super.cEq();
        this.pack();
    }

    @Override
    protected iox cGl() {
        return null;
    }
}

