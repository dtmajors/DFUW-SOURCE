/*
 * Decompiled with CFR.
 */
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class jhm
extends jhi {
    public static final String nep = "Quest";
    private jch mSc;
    private Map<jcm, jhn> nfc = lcn.emw();
    private ipx lvG;
    private ipb nfd;
    private ipb nfe;
    private ipb nff;

    public jhm(jch jch2) {
        this.mSc = jch2;
    }

    @Override
    public void a(ioa ioa2) {
        super.a(ioa2);
        this.dFU();
        this.dGe().W(ipx.a(316, 0, new ipf[0]));
        Collection<jcm> collection = this.mSc.dxl().values();
        for (jcm jcm2 : collection) {
            this.f(jcm2);
        }
        this.mSc.mRc.a((jlg<jch, jcm>)new jls<jhm, jch, jcm>(this, this){
            final /* synthetic */ jhm nfg;
            {
                this.nfg = jhm2;
                super(jhm3);
            }

            public void a(jhm jhm2, jch jch2, jcm jcm2) {
                jhm.a(jhm2, jcm2);
            }
        });
        this.mSc.mRd.a((jlg<jch, jcm>)new jls<jhm, jch, jcm>(this, this){
            final /* synthetic */ jhm nfg;
            {
                this.nfg = jhm2;
                super(jhm3);
            }

            public void a(jhm jhm2, jch jch2, jcm jcm2) {
                jhm.b(jhm2, jcm2);
            }
        });
        this.tv(false);
    }

    @Override
    public boolean dFM() {
        return true;
    }

    @Override
    public int dFz() {
        return this.mSc.wF().getID();
    }

    public ipx dGj() {
        return this.lvG;
    }

    @Override
    public void tv(boolean bl) {
        if (this.lvG == null) {
            return;
        }
        super.tv(bl);
        Collection<jcm> collection = this.mSc.dxl().values();
        if (collection != null) {
            boolean bl2 = true;
            if (collection.size() == 1) {
                jcm jcm2 = collection.iterator().next();
                boolean bl3 = bl2 = jcm2.dxI() || jcm2.dxG() || jcm2.dxE() == null || jcm2.dxE().isEmpty();
            }
            if (bl2) {
                this.lvG.setVisible(true);
                this.dGa().setVisible(false);
                boolean bl4 = false;
                boolean bl5 = false;
                boolean bl6 = false;
                for (jcm jcm3 : collection) {
                    if (jcm3.dxI()) {
                        bl4 = true;
                        continue;
                    }
                    if (jcm3.dxG()) {
                        bl5 = true;
                        continue;
                    }
                    bl6 = true;
                }
                this.nfd.setVisible(bl4);
                this.nfe.setVisible(bl5);
                this.nff.setVisible(bl6);
            } else {
                this.lvG.setVisible(false);
                this.dGa().setVisible(true);
            }
        }
    }

    @Override
    public boolean du(int n, int n2) {
        if (super.du(n, n2)) {
            return true;
        }
        this.djE();
        ioa.cyJ().cIV().d(this.mSc);
        return true;
    }

    @Override
    public void g(iph iph2) {
        String string = "";
        String string2 = "";
        switch (this.mSc.dxb()) {
            case bal: {
                string = "/dfdata/texture/gui/j2f/quests/category_tracker/chronicles/category_icon_tracker_chronicles_bg.png";
                string2 = "/dfdata/texture/gui/j2f/quests/category_tracker/chronicles/category_icon_tracker_chronicles.png";
                break;
            }
            case baj: {
                string = "/dfdata/texture/gui/j2f/quests/category_tracker/ventures/category_icon_tracker_ventures_bg.png";
                string2 = "/dfdata/texture/gui/j2f/quests/category_tracker/ventures/category_icon_tracker_ventures.png";
                break;
            }
            case bak: {
                string = "/dfdata/texture/gui/j2f/quests/category_tracker/rumors/category_icon_tracker_rumors_bg.png";
                string2 = "/dfdata/texture/gui/j2f/quests/category_tracker/rumors/category_icon_tracker_rumors.png";
                break;
            }
            case bai: 
            case bam: {
                string = "/dfdata/texture/gui/j2f/quests/category_tracker/novitiate/category_icon_tracker_novitiate_bg.png";
                string2 = "/dfdata/texture/gui/j2f/quests/category_tracker/novitiate/category_icon_tracker_novitiate.png";
            }
        }
        iph2.W(ipx.h(ipx.d(new ipb(string)), ipx.d(new ipb(string2))));
    }

    @Override
    public loz dFC() {
        return this.mSc.aND();
    }

    @Override
    public int dFD() {
        Collection<jcm> collection = this.mSc.dxl().values();
        if (collection.size() != 1) {
            return 0;
        }
        jcm jcm2 = collection.iterator().next();
        if (jcm2.dxG()) {
            return 0;
        }
        return jcm2.dxL();
    }

    @Override
    public int dFE() {
        Collection<jcm> collection = this.mSc.dxl().values();
        if (collection.size() != 1) {
            return 0;
        }
        jcm jcm2 = collection.iterator().next();
        if (jcm2.dxG()) {
            return 0;
        }
        return jcm2.dxM();
    }

    @Override
    public ipf dGb() {
        return null;
    }

    @Override
    public ipf UF(int n) {
        return null;
    }

    @Override
    public String dFF() {
        return null;
    }

    @Override
    public ipf UG(int n) {
        return null;
    }

    @Override
    public ipf dFG() {
        return null;
    }

    @Override
    public String dFA() {
        return nep;
    }

    @Override
    public void cGR() {
        this.mSc.sX(false);
    }

    @Override
    public void b(ipx ipx2) {
        super.b(ipx2);
        this.lvG = ipx.l(new ipf[0]);
        this.lvG.setVisible(false);
        ipx2.W(ipx.d(this.lvG));
        this.nfd = new ipb("/dfdata/texture/gui/j2f/quests/panels/quest_section_rewards.png", 16, 16);
        this.lvG.W(this.nfd);
        this.nfe = new ipb("/dfdata/texture/gui/j2f/quests/panels/quest_section_dialog.png", 16, 16);
        this.lvG.W(this.nfe);
        this.nff = new ipb("/dfdata/texture/gui/j2f/quests/panels/quest_section_tasks.png", 16, 16);
        this.lvG.W(this.nff);
    }

    private void f(jcm jcm2) {
        jhn jhn2 = null;
        if (jcm2.dxI()) {
            jhn2 = this.g(jcm2);
        } else if (jcm2.dxG()) {
            jhn2 = this.h(jcm2);
        } else {
            List<jcn> list = jcm2.dxE();
            jhn2 = this.i(jcm2);
        }
        if (jhn2 != null) {
            this.dGe().W(jhn2);
            this.nfc.put(jcm2, jhn2);
        }
    }

    private jhn g(jcm jcm2) {
        return new jhn(jcm2, this.nfc.size() > 0);
    }

    private jhn h(jcm jcm2) {
        return new jhn(jcm2, this.nfc.size() > 0);
    }

    private jhn i(jcm jcm2) {
        return new jhp(jcm2, this.nfc.size() > 0);
    }

    private void j(jcm jcm2) {
        this.f(jcm2);
        this.tv(false);
        if (this.djE() != null) {
            this.djE().pack();
        }
    }

    private void k(jcm jcm2) {
        jhn jhn2 = this.nfc.remove(jcm2);
        if (jhn2 != null) {
            jhn2.removeFromParent();
            this.tv(false);
            if (this.djE() != null) {
                this.djE().pack();
            }
        }
    }

    static /* synthetic */ void a(jhm jhm2, jcm jcm2) {
        jhm2.j(jcm2);
    }

    static /* synthetic */ void b(jhm jhm2, jcm jcm2) {
        jhm2.k(jcm2);
    }
}

