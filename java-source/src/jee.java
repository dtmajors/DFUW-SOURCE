/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Map;

public class jee
extends ipx {
    private jci mSI;
    private izm mSZ;
    private ipb mTf;
    private Map<jch, jed> mTE = lcn.emw();
    private List<jed> mTF = lcn.emv();

    public jee(jci jci2) {
        this.mSI = jci2;
        this.a(iqo.dmT());
        this.W(new jeb(jci2));
        this.W(ipx.a(1, 2, new ipf[0]));
        this.W(this.cGX());
        this.W(ipx.i(this.cPR()));
        this.W(this.cGX());
        this.W(ipx.a(1, 8, new ipf[0]));
        if (this.mSI.dxd() != jbz.mQl) {
            ipf[] ipfArray = new ipf[1];
            this.mTf = new ipb("/dfdata/texture/gui/j2f/quests/quest_log_footer.png");
            ipfArray[0] = this.mTf;
            this.W(ipx.d(ipfArray));
        } else {
            ipf[] ipfArray = new ipf[1];
            this.mTf = new ipb("/dfdata/texture/gui/j2f/quests/quest_log_footer_completed.png");
            ipfArray[0] = this.mTf;
            this.W(ipx.d(ipfArray));
        }
        this.W(ipx.a(1, 16, new ipf[0]));
        lie lie2 = new lie(this, 0.1, false){
            final /* synthetic */ jee mTG;
            {
                this.mTG = jee2;
                super(d2, bl);
            }

            public void dh(double d2) {
                jee.a(this.mTG).pack();
            }
        };
        lie2.e(hso.cxK().cxP().cyJ().getMessageDelegator());
        jcc.dwT().mQC.a((jlg<jcm, jcf>)new jls<jee, jcm, jcf>(this, this){
            final /* synthetic */ jee mTG;
            {
                this.mTG = jee2;
                super(jee3);
            }

            public void b(jee jee2, jcm jcm2, jcf jcf2) {
                jee.a(jee2, jcm2, jcf2);
            }

            public /* synthetic */ void a(Object object, Object object2, Object object3) {
                this.b((jee)object, (jcm)object2, (jcf)object3);
            }
        });
        jcc.dwT().mQx.c((jlf<jci>)new jlr<jee, jci>(this, this){
            final /* synthetic */ jee mTG;
            {
                this.mTG = jee2;
                super(jee3);
            }

            public void b(jee jee2, jci jci2) {
                jee.a(jee2, jci2);
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.b((jee)object, (jci)object2);
            }
        });
    }

    private ipf cGX() {
        return ipx.l(ipx.a(4, 1, new ipf[0]), new ipk(0x2F2F2F, 484, 1), ipx.a(8, 1, new ipf[0]));
    }

    private ipf cPR() {
        this.mSZ = new izm();
        this.mSZ.dtS();
        this.mSZ.Td(8);
        List<jch> list = this.mSI.wr();
        for (jch jch2 : list) {
            jed jed2 = new jed();
            this.mTE.put(jch2, jed2);
            this.mTF.add(jed2);
            this.mSZ.c(new iuh((ipf)jed2));
            List<jcf> list2 = jch2.wi();
            if (list2 == null) continue;
            boolean bl = true;
            for (jcf jcf2 : list2) {
                jed2.a(new jec(this.mSI, jcf2, bl));
                bl = false;
            }
        }
        this.dzp();
        return this.mSZ;
    }

    private void a(jcm jcm2, jcf jcf2) {
        jed jed2;
        if (jcf2 == null || jcm2.dxK().dxk() != this.mSI) {
            return;
        }
        jed2.a(new jec(this.mSI, jcf2, (jed2 = this.mTE.get(jcm2.dxK())).dzo() == 0));
        this.dzp();
        this.pack();
    }

    private void dzp() {
        jed jed2 = null;
        for (jed jed3 : this.mTF) {
            if (jed3.dzo() > 0) {
                jed3.setVisible(true);
                if (jed2 != null) {
                    jed2.tb(true);
                }
                jed2 = jed3;
                continue;
            }
            jed3.setVisible(false);
        }
    }

    private void b(jci jci2) {
        if (jci2 == this.mSI && this.mSI.dxd() == jbz.mQl) {
            this.mTf.qP("/dfdata/texture/gui/j2f/quests/quest_log_footer_completed.png");
        }
    }

    static /* synthetic */ izm a(jee jee2) {
        return jee2.mSZ;
    }

    static /* synthetic */ void a(jee jee2, jcm jcm2, jcf jcf2) {
        jee2.a(jcm2, jcf2);
    }

    static /* synthetic */ void a(jee jee2, jci jci2) {
        jee2.b(jci2);
    }
}

