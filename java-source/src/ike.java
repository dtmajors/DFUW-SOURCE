/*
 * Decompiled with CFR.
 */
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ike
extends ihs {
    public static jlk mfI = new jlk();
    public static jlk mfJ = new jlk();
    private static ike mfK;
    private iqa mfL = null;
    private Map<ikc, List<ije>> mfM = lcn.emw();
    private Map<ikd, ije> mfN = lcn.emw();
    private ikd mfO = ikd.mft;
    private boolean mcr;
    private iou<ikc> mfP;
    private izm mfQ;
    private ist mfR;

    public static void a(boolean bl, ikd ikd2) {
        if (mfK != null) {
            mfK.b(ikd2);
        } else {
            mfK = new ike(bl, ikd2);
            mfK.setGUID(hso.cxK().cxP().cyJ().getMessageDelegator().bzv());
            hso.cxK().cxP().cyJ().getMessageDelegator().a((amf)((Object)mfK));
        }
        mfK.cqF();
        mfK.cFc();
        mfJ.dLF();
    }

    public static void qF(boolean bl) {
        ike.a(bl, null);
    }

    public static void dbZ() {
        if (mfK != null) {
            mfK.getMessageDelegator().hd(mfK.getGUID());
            mfK = null;
            mfI.dLF();
        }
    }

    public static void dca() {
        if (mfK != null) {
            mfK.cqF();
        }
    }

    public static ike dcb() {
        return mfK;
    }

    @Override
    public boolean cZt() {
        return this.mcr;
    }

    @Override
    public void cCu() {
        super.cCu();
        this.dcl();
        this.Rz(36);
        this.RA(this.isResizable() ? 100 : 62);
        this.cKJ();
        this.cXE().a(this.isResizable() ? iqv.dnf() : irl.dnr());
        this.cXE().W(this.isResizable() ? ipx.c(this.cGT()) : this.cGT());
        this.cXE().W(this.isResizable() ? ipx.c(this.cGU()) : this.cGU());
        this.cXE().updateLayout();
        this.b(this.mfO);
        if (this.isResizable()) {
            this.g(100.0f, 100.0f, 420.0f, 565.0f);
        }
    }

    @Override
    protected iox cGl() {
        return null;
    }

    @Override
    protected ipq cGj() {
        return this.isResizable() ? super.cGj() : null;
    }

    @Override
    protected void cGR() {
        ike.dbZ();
    }

    private ike(boolean bl, ikd ikd2) {
        super("HudOptionsWindow", "HudNew.swf");
        this.OQ(jnz.nGy | jnz.nGi);
        this.a(hya.lmp, true);
        if (this.isResizable()) {
            this.a(ire.mul);
            this.U(420.0f, 500.0f);
        }
        this.mfO = ikd2 != null ? ikd2 : ikd.mft;
        this.mcr = bl;
    }

    private void cKJ() {
        this.a(new ipb("title_icon_hud_options"), 4, 0, 18, lwx.sXP.bD(new Object[0]));
    }

    private ipf cGT() {
        this.mfL = new iqa("window_edit_mode_options_bg", 5, 1, 5, 100);
        return ipx.a(0, 0, 30, 62, this.mfL);
    }

    private ipf cGU() {
        ipx ipx2 = ipx.j(new ipf[0]);
        ipx2.W(ipx.a(1, 4, new ipf[0]));
        ipx2.W(this.isResizable() ? ipx.c(new ipf[]{ipx.l(ipx.a(8, 1, new ipf[0]), this.dcc())}) : ipx.l(ipx.a(8, 1, new ipf[0]), this.dcc()));
        ipx2.W(ipx.a(1, 4, new ipf[0]));
        return this.isResizable() ? ipx.c(new ipf[]{ipx2}) : ipx2;
    }

    private ipf dcc() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(16, 1, new ipf[0]));
        ipx2.W(this.dcd());
        ipx2.W(this.dcf());
        ipx2.W(ipx.a(6, 1, new ipf[0]));
        ipx2.W(this.isResizable() ? ipx.c(this.cWt()) : this.cWt());
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        return this.isResizable() ? ipx.c(new ipf[]{ipx2}) : ipx2;
    }

    private ipf cWt() {
        ipx ipx2 = ipx.j(new ipf[0]);
        ipx2.W(this.isResizable() ? ipx.c(this.dcg()) : ipx.a(288, 350, this.dcg()));
        ipx2.W(ipx.a(1, 8, new ipf[0]));
        ipx2.W(this.dch());
        return this.isResizable() ? ipx.c(new ipf[]{ipx2}) : ipx2;
    }

    private ipf dcd() {
        ipx ipx2 = ipx.j(new ipf[0]);
        ipx2.W(ipx.a(1, 8, new ipf[0]));
        this.mfP = new iou<ikc>(this){
            final /* synthetic */ ike mfS;
            {
                this.mfS = ike2;
            }

            public void b(ikc ikc2) {
                ike.a(this.mfS, ikc2);
            }

            public /* synthetic */ void S(Object object) {
                this.b((ikc)((Object)object));
            }
        };
        boolean bl = true;
        int n = 0;
        for (ikc ikc2 : ikc.values()) {
            if (!ika.dbX().containsKey((Object)ikc2)) continue;
            if (n > 0) {
                ipx2.W(ipx.a(1, 10, new ipf[0]));
            }
            ipx2.W(new ikb(this.mfP, ikc2, bl));
            bl = !bl;
            ++n;
        }
        return ipx2;
    }

    private ipf dce() {
        return new ipk(0x313131, 1, 1);
    }

    private ipf dcf() {
        return new ipk(0x313131, 1, 1);
    }

    private ipf dcg() {
        this.mfQ = new izm();
        this.mfQ.W("list_gradient_top", "list_gradient_bottom");
        this.mfQ.dtR().W(ipx.l(new ipk(0x313131, 288, 1)));
        return this.mfQ;
    }

    private ipf dch() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.c(new ipf[0]));
        ipx2.W(ipx.d(this.dci()));
        ipx2.W(ipx.a(6, 1, new ipf[0]));
        ipx2.W(ipx.d(this.dcj()));
        ipx2.W(ipx.a(6, 1, new ipf[0]));
        return ipx2;
    }

    private ipf dci() {
        this.mfR = new ist(isf.mwO, 14, 0xABABAB, "");
        this.dck();
        return this.mfR;
    }

    private ipf dcj() {
        ivt ivt2 = new ivt(this){
            final /* synthetic */ ike mfS;
            {
                this.mfS = ike2;
            }

            public void pn(boolean bl) {
                ike.a(this.mfS, bl);
                ike.a(this.mfS);
            }
        };
        ivt2.hX(this.mcr);
        return ivt2;
    }

    @Override
    protected void ku(float f) {
        super.ku(f);
        if (this.mfL != null) {
            this.mfL.hz(f);
        }
    }

    private void dck() {
        if (this.mcr) {
            this.mfR.o(lwx.tkI.bD(new Object[0]));
        } else {
            joa joa2 = hso.cxK().cyc();
            this.mfR.o(lwx.tkJ.bD((int)joa2.W, (int)joa2.H));
        }
        if (this.mfR.djJ() != null) {
            this.mfR.djJ().djJ().pack();
        }
        for (ije ije2 : this.mfN.values()) {
            ije2.qv(this.mcr);
        }
    }

    private void a(ikc ikc2) {
        List<ije> list = this.mfM.get((Object)ikc2);
        if (list != null) {
            this.mfQ.removeAllItems();
            for (ije ije2 : list) {
                this.mfQ.c(ije2);
            }
        }
    }

    private void dcl() {
        Set<ija> set = ike.cyJ().cIP().cZq();
        for (ija object : set) {
            ije ije2;
            ijc ijc2 = object.daw();
            if (ijc2 == null || (ije2 = ijc2.dae()) == null) continue;
            ikd ikd2 = ije2.daf();
            this.mfN.put(ikd2, ije2);
            ikc ikc2 = ika.dbW().get((Object)ikd2);
            List<ije> list = this.mfM.get((Object)ikc2);
            if (list == null) {
                list = lcn.emv();
                this.mfM.put(ikc2, list);
            }
            list.add(ije2);
        }
        for (List list : this.mfM.values()) {
            Collections.sort(list, new Comparator<ije>(this){
                final /* synthetic */ ike mfS;
                {
                    this.mfS = ike2;
                }

                public int a(ije ije2, ije ije3) {
                    return ije2.daS().getText().compareToIgnoreCase(ije3.daS().getText());
                }

                public /* synthetic */ int compare(Object object, Object object2) {
                    return this.a((ije)object, (ije)object2);
                }
            });
        }
    }

    private void b(ikd ikd2) {
        ije ije2 = this.mfN.get((Object)ikd2);
        if (ije2 == null) {
            return;
        }
        ikc ikc2 = ikc.mfj;
        ikc ikc3 = ika.dbW().get((Object)ikd2);
        if (ikc3 != null && this.mfM.containsKey((Object)ikc3)) {
            ikc2 = ikc3;
        }
        this.mfP.setValue(ikc2);
        this.mfQ.e(ije2);
    }

    static /* synthetic */ void a(ike ike2, ikc ikc2) {
        ike2.a(ikc2);
    }

    static /* synthetic */ boolean a(ike ike2, boolean bl) {
        ike2.mcr = bl;
        return ike2.mcr;
    }

    static /* synthetic */ void a(ike ike2) {
        ike2.dck();
    }
}

