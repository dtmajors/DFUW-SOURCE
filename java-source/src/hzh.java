/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cxd
 *  hvy
 *  hyn
 */
import java.util.List;
import spenefett.hid.gui.serialization.dto.SFGUIElementDTO;

public class hzh
extends hzk
implements bto,
jml {
    protected int lvP = 0;
    protected int aDw = 0;
    protected int lvQ = 0;
    protected int lvR = 0;
    protected cxc gcr = null;
    protected jbh lvS = null;
    protected boolean lvT = false;

    public hzh() {
        super("SkillUpWindow", "skillupwindow.swf");
        this.OQ(jnz.nGi);
        this.a(hyb.lmC);
        this.a(hya.lmp, true);
    }

    public void initialize() {
        super.initialize();
        hso.cxK().cxR().dMa().a(jmq.nBc, this);
    }

    public void cleanUp() {
        super.cleanUp();
        hso.cxK().cxR().dMa().j(jmq.nBc);
    }

    public void cBa() {
    }

    public void a(jbh jbh2) {
        cfj.a(cfv.UI_LEVELUP_ATTRIBUTE, this.MessageDelegator, this.GUID);
        this.setVisible(true);
        hzh.cyJ().updateLayout();
        hvy hvy2 = hso.cxK().cxP().cyZ();
        jbf jbf2 = jbg.b(jbh2);
        this.aDw = this.lvP = Math.round(jbf2.mNc);
        this.lvR = this.lvQ = hvy2.akj();
        SFGUIElementDTO sFGUIElementDTO = new SFGUIElementDTO();
        int n = cxd.fHN;
        if (jbh2 == jbh.mNh) {
            n = cxd.fJK;
        } else if (jbh2 == jbh.mNi) {
            n = cxd.fJL;
        } else if (jbh2 == jbh.mNj) {
            n = cxd.fJM;
        } else if (jbh2 == jbh.mNk) {
            n = cxd.fJN;
        }
        lhg lhg2 = (lhg)lea.enZ().acv(n);
        sFGUIElementDTO.iconName = "texture/dds/" + lhg2.atw().Name;
        sFGUIElementDTO.progress = (float)this.aDw / 100.0f;
        this.a("setGUIElement", new Object[]{sFGUIElementDTO});
        String string = "";
        if (jbh2 == jbh.mNh) {
            string = lxr.txi.bD(new Object[0]).exA();
        } else if (jbh2 == jbh.mNi) {
            string = lxr.txj.bD(new Object[0]).exA();
        } else if (jbh2 == jbh.mNk) {
            string = lxr.txl.bD(new Object[0]).exA();
        } else if (jbh2 == jbh.mNj) {
            string = lxr.txk.bD(new Object[0]).exA();
        }
        String string2 = "";
        if (jbh2 == jbh.mNh) {
            string2 = lxr.twD.bD(new Object[0]).exA();
        } else if (jbh2 == jbh.mNi) {
            string2 = lxr.twE.bD(new Object[0]).exA();
        } else if (jbh2 == jbh.mNk) {
            string2 = lxr.twG.bD(new Object[0]).exA();
        } else if (jbh2 == jbh.mNj) {
            string2 = lxr.twF.bD(new Object[0]).exA();
        }
        this.a("setSkillTexts", new Object[]{string2, string, ""});
        this.gcr = null;
        this.lvS = jbh2;
        String[] stringArray = new String[]{"", "", "", "", "", ""};
        this.a("setImprovesTexts", new Object[]{stringArray[0], stringArray[1], stringArray[2], stringArray[3], stringArray[4], stringArray[5]});
        this.cHd();
    }

    public void Pa(int n) {
        cfj.a(cfv.UI_LEVELUP_SKILL, this.MessageDelegator, this.GUID);
        this.setVisible(true);
        hzh.cyJ().updateLayout();
        hvy hvy2 = hso.cxK().cxP().cyZ();
        cxc cxc2 = hvy2.ht(n);
        hwv hwv2 = new hwv(cxc2);
        SFGUIElementDTO sFGUIElementDTO = hwv2.cBj();
        sFGUIElementDTO.state = 0;
        this.a("setGUIElement", new Object[]{sFGUIElementDTO});
        this.gcr = cxc2;
        this.lvS = null;
        this.aDw = this.lvP = Math.round(cxc2.Bt());
        this.lvR = this.lvQ = hvy2.akj();
        ldy ldy2 = (ldy)lea.eob().acv(n);
        String string = "";
        if (ldy2 != null) {
            List<ldy.b> list = ldy2.enM();
            String[] stringArray = new String[]{"", "", "", "", "", ""};
            for (int j = 0; j < list.size(); ++j) {
                if (j >= stringArray.length) continue;
                stringArray[j] = list.get((int)j).DisplayName.bD(new Object[0]).exA();
            }
            this.a("setImprovesTexts", new Object[]{stringArray[0], stringArray[1], stringArray[2], stringArray[3], stringArray[4], stringArray[5]});
            if (ldy2.enN()) {
                string = lya.tCL.bD(new Object[0]).exA();
            }
        }
        this.a("setSkillTexts", new Object[]{lya.tCp.bD(this.gcr.Bu()).exA(), lya.tCq.bD(this.gcr.Bu()).exA(), string});
        this.cHd();
    }

    protected void cHd() {
        hso.cxK().cxP().i((hyn)this);
        hso.cxK().cxR().ul(true);
        this.a("setStaticTexts", new Object[]{lya.tCt.bD(new Object[0]).exA(), lya.tCu.bD(new Object[0]).exA(), lya.tCv.bD(new Object[0]).exA(), lya.tCw.bD(new Object[0]).exA(), lya.tCx.bD(new Object[0]).exA(), lya.tCy.bD(new Object[0]).exA()});
        this.cHe();
    }

    protected void hide() {
        this.lvT = true;
        this.setVisible(false);
    }

    @llk
    public void closeButtonClicked() {
        hso.cxK().cxP().czx().czM();
        this.hide();
    }

    @llk
    public void acceptButtonClicked() {
        hso.cxK().cxP().czx().czM();
        if (this.aDw > this.lvP) {
            if (this.gcr != null) {
                gji gji2 = (gji)this.MessageDelegator.h(4638, this.GUID, hso.cxK().bAn().gYX);
                gji2.SkillType = this.gcr.zg();
                gji2.iky = this.aDw - this.lvP;
                this.MessageDelegator.E(gji2);
            } else if (this.lvS != null) {
                eaj eaj2 = (eaj)this.MessageDelegator.h(10761, this.GUID, hso.cxK().bAn().gYX);
                if (this.lvS.ordinal() == jbh.mNh.ordinal()) {
                    eaj2.bnM = 208;
                } else if (this.lvS.ordinal() == jbh.mNi.ordinal()) {
                    eaj2.bnM = 160;
                } else if (this.lvS.ordinal() == jbh.mNk.ordinal()) {
                    eaj2.bnM = 240;
                } else if (this.lvS.ordinal() == jbh.mNj.ordinal()) {
                    eaj2.bnM = 176;
                }
                eaj2.iky = this.aDw - this.lvP;
                this.MessageDelegator.E(eaj2);
            }
        }
        this.hide();
    }

    protected int Pb(int n) {
        if (this.gcr != null) {
            hvy hvy2 = hso.cxK().cxP().cyZ();
            return hvy2.yU(n);
        }
        if (this.lvS != null) {
            return el.j(n, jbg.TI(n));
        }
        return 0;
    }

    @llk
    public void plusButtonClicked() {
        if (this.aDw == 100) {
            return;
        }
        int n = this.Pb(this.aDw + 1);
        if (n > this.lvR) {
            return;
        }
        ++this.aDw;
        this.lvR -= n;
        this.cHe();
        this.a(hxz.lmj);
    }

    @llk
    public void maxButtonClicked() {
        int n;
        if (this.aDw == 100) {
            return;
        }
        while (this.aDw < 100 && (n = this.Pb(this.aDw + 1)) <= this.lvR) {
            ++this.aDw;
            this.lvR -= n;
        }
        this.cHe();
        this.a(hxz.lmj);
    }

    @llk
    public void minusButtonClicked() {
        if (this.aDw == this.lvP) {
            return;
        }
        hvy hvy2 = hso.cxK().cxP().cyZ();
        int n = this.Pb(this.aDw);
        this.lvR += n;
        --this.aDw;
        this.cHe();
        this.a(hxz.lmj);
    }

    protected void cHe() {
        hvy hvy2 = hso.cxK().cxP().cyZ();
        int n = this.Pb(this.aDw + 1);
        this.a("setNumbers", new Object[]{this.aDw, this.lvQ - this.lvR, this.lvR, this.aDw - this.lvP, n});
    }

    protected void g(int n, int n2, String string) {
        int n3 = 560;
        int n4 = 240;
        joa joa2 = hso.cxK().cxX();
        int n5 = ((int)joa2.W - n3) / 2;
        int n6 = ((int)joa2.W + n3) / 2;
        int n7 = ((int)joa2.H - n4) / 2;
        int n8 = ((int)joa2.H + n4) / 2;
        if (n <= n5 || n >= n6 || n2 <= n7 || n2 >= n8) {
            this.hide();
        }
    }

    @Override
    public void a(jmq jmq2) {
        if (jmq2 == jmq.nBc) {
            this.hide();
        }
    }

    @Override
    public void a(jmq jmq2, int n) {
    }

    @Override
    public void a(jmq jmq2, double d2) {
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.lvT) {
            hso.cxK().cxR().ul(false);
            this.lvT = false;
        }
    }
}

