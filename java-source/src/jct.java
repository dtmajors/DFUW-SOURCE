/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;

public class jct
extends jba {
    private jch mSc;
    private jbx mSd;
    private iph mSe;
    private int mSf;
    private a mSg;
    private List<jck> mSh;
    private Boolean mSi;

    public jct(jch jch2, jbx jbx2) {
        super("QuestsNotificationWindow", "QuestsWindow.swf");
        assert (jch2 != null);
        this.mSc = jch2;
        this.mSd = jbx2;
    }

    public jct(jch jch2, List<jck> list, Boolean bl) {
        super("QuestsNotificationWindow", "QuestsWindow.swf");
        assert (jch2 != null);
        this.mSc = jch2;
        this.mSh = list;
        this.mSi = bl;
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.cVL();
    }

    @Override
    public void a(jbc jbc2) {
        super.a(jbc2);
        switch (jbc2) {
            case mMF: {
                if (this.mSe == null) break;
                this.mSe.setVisible(true);
                this.cVK();
            }
        }
    }

    protected jch dxK() {
        return this.mSc;
    }

    @Override
    protected void cCu() {
        super.cCu();
        this.d("/dfdata/texture/gui/j2f/common/notifications/backgrounds/nbg_feats.png", 1, 14, 112, 14);
        switch (this.mSc.dxb()) {
            case bam: 
            case bai: {
                this.rP("/dfdata/texture/gui/j2f/common/notifications/bars/quests/quest_notification_bar_novitiate.png");
                this.rQ("/dfdata/texture/gui/j2f/quests/category_icons/category_icons_main_novitiate/category_icons_main_novitiate_on_hover.png");
                break;
            }
            case baj: {
                this.rP("/dfdata/texture/gui/j2f/common/notifications/bars/quests/quest_notification_bar_ventures.png");
                this.rQ("/dfdata/texture/gui/j2f/quests/category_icons/category_icons_main_ventures/category_icons_main_ventures_on_hover.png");
                break;
            }
            case bak: {
                this.rP("/dfdata/texture/gui/j2f/common/notifications/bars/quests/quest_notification_bar_rumors.png");
                this.rQ("/dfdata/texture/gui/j2f/quests/category_icons/category_icons_main_rumors/category_icons_main_rumors_on_hover.png");
                break;
            }
            case bal: {
                this.rP("/dfdata/texture/gui/j2f/common/notifications/bars/quests/quest_notification_bar_chronicles.png");
                this.rQ("/dfdata/texture/gui/j2f/quests/category_icons/category_icons_main_chronicles/category_icons_main_chronicles_on_hover.png");
            }
        }
        this.rR("/dfdata/texture/gui/j2f/common/notifications/icons/ni_quests.png");
        if (this.mSd != null) {
            List<jcl> list;
            switch (this.mSd) {
                case mPY: {
                    this.D(lxu.tyd.bD(new Object[0]));
                    break;
                }
                case mPZ: {
                    this.D(lxu.tyf.bD(new Object[0]));
                    break;
                }
                case mQc: {
                    this.D(lxu.tyj.bD(new Object[0]));
                    break;
                }
                case mQb: {
                    this.D(lxu.tyh.bD(new Object[0]));
                    break;
                }
                case mQd: {
                    this.D(lxu.tyl.bD(new Object[0]));
                }
            }
            if (this.mSd == jbx.mPY && (list = jcc.dwW().ea(this.mSc.wF().getID())) != null && !list.isEmpty()) {
                ArrayList<jck> arrayList = lcn.emv();
                for (jcl jcl2 : list) {
                    List<jck> list2 = jcl2.Al();
                    if (list == null || list.isEmpty()) continue;
                    for (jck jck2 : list2) {
                        arrayList.add(jck2);
                    }
                }
                this.dwa().W(ipx.d(this.bC(arrayList)));
            }
        } else {
            this.D(lxu.tyn.bD(new Object[0]));
            this.dwa().W(ipx.d(this.bC(this.mSh)));
        }
    }

    @Override
    protected void cVH() {
        super.cVH();
        if (this.mSe != null) {
            this.mSe.setVisible(true);
            this.mSe.a(new iqu(1, 64));
        }
    }

    @Override
    protected void cVJ() {
        if (this.mSd != null) {
            switch (this.mSd) {
                case mPY: {
                    this.D(lxu.tye.bD(new Object[0]));
                    break;
                }
                case mPZ: {
                    this.D(lxu.tyg.bD(new Object[0]));
                    break;
                }
                case mQc: {
                    this.D(lxu.tyk.bD(new Object[0]));
                    break;
                }
                case mQb: {
                    this.D(lxu.tyi.bD(new Object[0]));
                    break;
                }
                case mQd: {
                    this.D(lxu.tym.bD(new Object[0]));
                }
            }
        } else {
            this.D(lxu.tyo.bD(new Object[0]));
        }
    }

    @Override
    protected isw cVG() {
        isw isw2 = super.cVG();
        if (this.mSc != null) {
            isw2.o(this.mSc.aND());
        }
        return isw2;
    }

    private void cVK() {
        if (this.mSg != null) {
            return;
        }
        this.mSg = new a(this);
        jct.czy().a(this.mSg);
    }

    private void cVL() {
        if (this.mSg == null) {
            return;
        }
        jct.czy().b(this.mSg);
        this.mSg = null;
    }

    private ipf bC(List<jck> list) {
        ipz ipz2 = new ipz(new iqu(1, 1));
        ipz2.sa(true);
        this.mSe = ipz2;
        ipx ipx2 = ipx.l(new ipf[0]);
        this.mSe.W(ipx2);
        ipx ipx3 = ipx.j(new ipf[0]);
        ipx2.W(ipx.d(ipx3));
        this.mSf = 0;
        int n = 0;
        while (n < Math.min(list.size(), 6)) {
            ipx ipx4 = ipx.l(new ipf[0]);
            if (ipx3.bfn() > 0) {
                ipx3.W(ipx.a(1, 1, new ipf[0]));
            }
            ipx3.W(ipx4);
            int n2 = 0;
            int n3 = n + 3;
            while (n < Math.min(list.size(), n3)) {
                if (ipx4.bfn() > 0) {
                    ipx4.W(ipx.a(1, 1, new ipf[0]));
                    ++n2;
                }
                jck jck2 = list.get(n);
                ipx4.W(new jdv(jck2, 30, false));
                n2 += 30;
                ++n;
            }
            this.mSf = Math.max(this.mSf, n2);
        }
        if (n < list.size()) {
            int n4 = list.size() - n;
            ipx3 = ipx.j(new ipf[0]);
            ipx2.W(ipx.a(24, 64, ipx3));
            ipx3.W(ipx.c(new ipf[0]));
            ipx3.W(ipx.d(new ist(isf.mwM, 11, 0xBCBCBC, "+")));
            ipx3.W(ipx.d(new ist(isf.mwM, 10, 0xBCBCBC, "" + n4)));
            ipx3.W(ipx.c(new ipf[0]));
            this.mSf += 24;
        }
        return this.mSe;
    }

    static /* synthetic */ iph a(jct jct2) {
        return jct2.mSe;
    }

    static /* synthetic */ int b(jct jct2) {
        return jct2.mSf;
    }

    static /* synthetic */ iqa c(jct jct2) {
        return jct2.dwb();
    }

    static /* synthetic */ iqa d(jct jct2) {
        return jct2.dwb();
    }

    static /* synthetic */ iqa e(jct jct2) {
        return jct2.dwb();
    }

    static /* synthetic */ iqa f(jct jct2) {
        return jct2.dwb();
    }

    static /* synthetic */ iqa g(jct jct2) {
        return jct2.dwb();
    }
}

