/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 *  hzo
 *  lcw
 */
import java.awt.Desktop;
import java.net.URI;
import java.util.ArrayList;
import java.util.Set;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class jah
extends hzk
implements hzq {
    private hzo lPw;
    protected boolean mGD = false;
    private String mGE = "http://www.aventurine.gr";
    private Set<hyc> mGF = lcn.emx();
    private boolean mGG = false;
    hyc[][] mGH = new hyc[][]{{hyc.lmN, hyc.lmO, hyc.lmR, hyc.lmP, hyc.lmS, hyc.lmU}};
    hzr mGI = null;
    hyn mGJ;
    protected int gFx;
    protected int gFy;

    public jah() {
        super("MainMenu", "MainMenu.swf");
        this.OQ(jnz.nGi | jnz.nGk | jnz.nGm | jnz.nGo);
        this.a(hyb.lmF);
        this.a(hxy.llG);
        this.a(hya.lmt, false);
    }

    public void initialize() {
        super.initialize();
        this.lPw = (hzo)jah.cxO();
    }

    public void cleanUp() {
        super.cleanUp();
    }

    public boolean a(hyc hyc2) {
        switch (hyc2) {
            case lmI: {
                return (this.lPw.cHO().cEX() & jnz.nGi) != 0;
            }
            case lmJ: {
                return this.mGD;
            }
            case lmK: {
                return false;
            }
            case lmW: {
                return this.lPw.cIt().isOpen();
            }
            case lmL: {
                return this.lPw.cIC();
            }
            case lmS: {
                return this.lPw.cHK().isVisible();
            }
            case lmM: {
                return (this.lPw.cHE().cEX() & jnz.nGi) != 0;
            }
            case lmN: {
                return (this.lPw.cHH().cEX() & jnz.nGi) != 0;
            }
            case lmO: {
                if (lea.epx().aQH()) {
                    return this.lPw.cIO().isOpen();
                }
                return (this.lPw.cHI().cEX() & jnz.nGi) != 0;
            }
            case lmP: {
                return this.lPw.cIj();
            }
            case lmQ: {
                return this.lPw.cHR() != null ? (this.lPw.cHR().cEX() & jnz.nGi) != 0 : this.lPw.cIJ().isOpen();
            }
            case lmX: {
                return this.lPw.cIM().isOpen();
            }
            case lmR: {
                return (this.lPw.cHP().cEX() & jnz.nGi) != 0;
            }
            case lmU: {
                return this.lPw.cHL().isVisible();
            }
            case lmY: {
                return this.lPw.cIa() != null && this.lPw.cIa().isVisible();
            }
            case lmT: {
                return false;
            }
            case lmV: {
                return this.lPw.cJm().isOpen();
            }
            case lmZ: {
                return false;
            }
            case lna: {
                jie jie2 = this.lPw.cJc();
                return jie2 != null && jie2.isOpen();
            }
            case lnb: {
                jcs jcs2 = this.lPw.cIV();
                return jcs2 != null && jcs2.isOpen();
            }
            case lnc: {
                jgz jgz2 = this.lPw.cIY();
                return jgz2 != null && jgz2.isOpen();
            }
            case lnd: {
                jab jab2 = this.lPw.cJs();
                return jab2 != null && jab2.isOpen();
            }
        }
        assert (false);
        return false;
    }

    public void a(hyc hyc2, boolean bl) {
        int n;
        int n2 = jnz.nGi;
        hso.cxK().cxP().czi();
        hso.cxK().cxP().czh();
        switch (hyc2) {
            case lmI: {
                if (jah.cxP().czq()) {
                    return;
                }
                if (bl) {
                    cfj.a(cfv.UI_OPEN_BACKPACK, this.MessageDelegator, this.GUID);
                }
                if (bl) {
                    this.lPw.cHO().cQx();
                }
                int n3 = this.lPw.cHO().cEX();
                this.lPw.cHO().OQ(bl ? n3 | n2 : n3 & ~n2);
                this.lPw.cHO().cQu().OQ(this.lPw.cHO().cEX());
                if (bl) {
                    jah.cxP().j(cja.eDq.ordinal(), -1, -1, -1);
                    this.lPw.cHO().cqF();
                    this.lPw.cHO().cFc();
                    if (!this.lPw.cHO().cQu().cEU()) break;
                    this.lPw.cHO().cQu().cqF();
                    break;
                }
                this.lPw.cHO().cQA();
                break;
            }
            case lmJ: {
                if (jah.cxP().czt()) {
                    return;
                }
                this.lPw.cHB().ua(bl);
                this.mGD = bl;
                if (!bl) break;
                cfj.a(cfv.UI_OPEN_MAP, this.MessageDelegator, this.GUID);
                if (this.a(hyc.lmW)) {
                    this.a(hyc.lmW, false);
                }
                jah.cxP().j(cja.eDs.ordinal(), -1, -1, -1);
                break;
            }
            case lmK: {
                break;
            }
            case lmW: {
                if (jah.cxP().czt()) {
                    return;
                }
                if (jah.cxP().cyJ().cIw() != null) {
                    this.b(hyc2, false);
                    if (bl) {
                        jah.cxP().v(mdb.uEI.bD(new Object[0]));
                    }
                    return;
                }
                if (bl) {
                    this.lPw.cIt().dvk();
                    cfj.a(cfv.UI_OPEN_MARKET, this.MessageDelegator, this.GUID);
                } else {
                    this.lPw.cIt().dva();
                }
                this.b(hyc.lmW, bl);
                break;
            }
            case lmL: {
                this.lPw.pr(bl);
                break;
            }
            case lmS: {
                if (jah.cxP().czt()) {
                    return;
                }
                this.lPw.cHK().setVisible(bl);
                if (!bl) break;
                this.lPw.cHK().cqF();
                this.lPw.cHK().cFc();
                break;
            }
            case lmM: {
                int n4 = this.lPw.cHE().cEX();
                this.lPw.cHE().OQ(bl ? n4 | n2 : n4 & ~n2);
                if (!bl) break;
                cfj.a(cfv.UI_OPEN_SKILLS, this.MessageDelegator, this.GUID);
                hso.cxK().cxP().j(cja.eDw.ordinal(), -1, -1, -1);
                this.lPw.cHE().cqF();
                this.lPw.cHE().cFc();
                break;
            }
            case lmN: {
                int n5 = this.lPw.cHH().cEX();
                this.lPw.cHH().OQ(bl ? n5 | n2 : n5 & ~n2);
                if (!bl) break;
                this.lPw.cHH().cqF();
                this.lPw.cHH().cFc();
                break;
            }
            case lmO: {
                if (bl) {
                    cfj.a(cfv.UI_OPEN_ROLES, this.MessageDelegator, this.GUID);
                }
                if (lea.epx().aQH()) {
                    this.lPw.cIO().setOpen(bl);
                    this.b(hyc2, bl);
                    return;
                }
                if (jah.cxP().czt()) {
                    return;
                }
                int n6 = this.lPw.cHI().cEX();
                this.lPw.cHI().OQ(bl ? n6 | n2 : n6 & ~n2);
                if (!bl) break;
                this.lPw.cHI().cqF();
                this.lPw.cHI().cFc();
                break;
            }
            case lmP: {
                if (jah.cxP().czt()) {
                    return;
                }
                this.lPw.pq(bl);
                break;
            }
            case lmQ: {
                if (jah.cxP().czt()) {
                    return;
                }
                if (bl) {
                    cfj.a(cfv.UI_OPEN_FEATS, this.MessageDelegator, this.GUID);
                }
                this.d(hyc.lmQ, false);
                ifr ifr2 = this.lPw.cHR();
                if (ifr2 != null) {
                    n = ifr2.cEX();
                    ifr2.OQ(bl ? n | n2 : n & ~n2);
                    if (!bl) break;
                    ifr2.cqF();
                    ifr2.cFc();
                    ifr2.cSP();
                    break;
                }
                this.lPw.cIJ().setOpen(bl);
                this.b(hyc.lmQ, bl);
                return;
            }
            case lmX: {
                if (jah.cxP().czt()) {
                    return;
                }
                jah.cyJ().cIM().setOpen(bl);
                this.b(hyc.lmX, bl);
                if (bl) {
                    this.c(hyc.lmX, true);
                }
                return;
            }
            case lmR: {
                if (jah.cxP().czr()) {
                    return;
                }
                int n7 = this.lPw.cHP().cEX();
                this.lPw.cHP().OQ(bl ? n7 | n2 : n7 & ~n2);
                if (!bl) break;
                cfj.a(cfv.UI_OPEN_PAPERDOLL, this.MessageDelegator, this.GUID);
                this.lPw.cHP().cqF();
                this.lPw.cHP().cFc();
                jah.cxP().j(cja.eDr.ordinal(), -1, -1, -1);
                break;
            }
            case lmU: {
                if (jah.cxP().czt()) {
                    return;
                }
                this.lPw.cHL().setVisible(bl);
                if (!bl) break;
                this.lPw.cHL().cqF();
                this.lPw.cHL().cFc();
                break;
            }
            case lmY: {
                if (jah.cyJ().cIa() == null) break;
                jah.cyJ().cIa().setVisible(bl);
                jah.cyJ().cIa().cqF();
                if (!bl) break;
                cfj.a(cfv.UI_OPEN_SELENTINE, this.MessageDelegator, this.GUID);
                break;
            }
            case lmT: {
                break;
            }
            case lmV: {
                this.lPw.cJm().setOpen(bl);
                this.b(hyc2, bl);
                return;
            }
            case lmZ: {
                break;
            }
            case lna: {
                jie jie2 = this.lPw.cJc();
                jie2.setOpen(bl);
                this.b(hyc2, bl);
                if (bl) {
                    cfj.a(cfv.UI_OPEN_GEAR_GUISE, this.MessageDelegator, this.GUID);
                }
                return;
            }
            case lnb: {
                return;
            }
            case lnc: {
                jgz jgz2 = this.lPw.cIY();
                jgz2.setOpen(bl);
                this.b(hyc2, bl);
                this.d(hyc.lnc, false);
                return;
            }
            case lnd: {
                jab jab2 = this.lPw.cJs();
                jab2.setOpen(bl);
                this.b(hyc2, bl);
                return;
            }
            default: {
                assert (false);
                return;
            }
        }
        if (bl) {
            hyc[][] hycArray = this.mGH;
            n = hycArray.length;
            block24: for (int i = 0; i < n; ++i) {
                hyc[] object;
                for (hyc hyc3 : object = hycArray[i]) {
                    if (!hyc3.equals((Object)hyc2)) continue;
                    if (!(!this.lPw.cHQ().isVisible() || lcw.emX() && this.lPw.cHQ().cRB())) {
                        this.lPw.cHQ().close();
                    }
                    if (!(!this.lPw.cIr().isVisible() || lcw.emX() && this.lPw.cIr().cRQ())) {
                        this.lPw.cIr().close();
                    }
                    for (hyc hyc4 : object) {
                        if (hyc4 == hyc.lmO || hyc4.equals((Object)hyc3)) continue;
                        this.a(hyc4, false);
                    }
                    continue block24;
                }
            }
        } else {
            this.lPw.updateLayout();
        }
        this.a("setButtonToggle", new Object[]{hyc2.cck, bl});
        hzo hzo2 = (hzo)jah.cxO();
        n = 1;
        for (hyc hyc5 : hyc.Values) {
            if (hyc5 == hyc.lmL || hyc5 == hyc.lmQ || hyc5 == hyc.lmX || lea.epx().aQH() && hyc5 == hyc.lmO || this.mGG && this.mGF.contains((Object)hyc5) || !this.a(hyc5)) continue;
            n = 0;
            break;
        }
        if (n != 0 && jah.cyJ().cIl() && (hyc2 != hyc.lmL || !this.a(hyc.lmL))) {
            hso.cxK().a(jnz.nFE);
        } else {
            hzo2.updateLayout();
        }
    }

    public void b(hyc hyc2, boolean bl) {
        this.a("setButtonSelectedState", new Object[]{hyc2.cck, bl});
    }

    public void c(hyc hyc2, boolean bl) {
        this.a("setButtonState", new Object[]{hyc2.cck, bl});
    }

    public void b(hyc hyc2) {
        this.a(hyc2, !this.a(hyc2));
    }

    protected void cBa() {
        super.cBa();
        this.duC();
        this.c(hyc.lmU, true);
        if (lcw.emW() || !lcw.emX()) {
            this.a("setSelentineShopButtonVisible", new Object[]{false});
        }
        this.a("setButtonVisible", new Object[]{hyc.lnb.cck, false});
        this.a("setButtonVisible", new Object[]{hyc.lna.cck, hzo.lxK});
        this.a("setButtonVisible", new Object[]{hyc.lnc.cck, aev.isEnabled()});
        this.a("formatButtons", new Object[0]);
        if (lcw.qGm) {
            this.a("setButtonVisible", new Object[]{hyc.lmI.cck, false});
            this.a("setButtonVisible", new Object[]{hyc.lmJ.cck, false});
            this.a("setButtonVisible", new Object[]{hyc.lmK.cck, false});
            this.a("setButtonVisible", new Object[]{hyc.lmL.cck, false});
            this.a("setButtonVisible", new Object[]{hyc.lmM.cck, false});
            this.a("setButtonVisible", new Object[]{hyc.lmO.cck, false});
            this.a("setButtonVisible", new Object[]{hyc.lmP.cck, false});
            this.a("setButtonVisible", new Object[]{hyc.lmQ.cck, false});
            this.a("setButtonVisible", new Object[]{hyc.lmR.cck, false});
            this.a("setButtonVisible", new Object[]{hyc.lmS.cck, false});
            this.a("setButtonVisible", new Object[]{hyc.lmU.cck, false});
            this.a("setButtonVisible", new Object[]{hyc.lmW.cck, false});
            this.a("setButtonVisible", new Object[]{hyc.lmX.cck, false});
            this.a("setButtonVisible", new Object[]{hyc.lmZ.cck, false});
            this.a("setButtonVisible", new Object[]{hyc.lnb.cck, false});
        }
    }

    protected void cEa() {
        super.cEa();
    }

    public void duC() {
        for (hyc hyc2 : hyc.Values) {
            this.a(hyc2, this.a(hyc2));
        }
    }

    public void duD() {
        if (this.mGI != null && !this.mGI.isCleanedUp()) {
            return;
        }
        hzr hzr2 = new hzr();
        hzr2.setVisible(true);
        hzr2.setGUID(this.MessageDelegator.bzv());
        hzr2.G(lyi.tEF.bD(new Object[0]).exA(), lyi.tEG.bD(new Object[0]).exA());
        hzr2.a(this);
        this.MessageDelegator.a((amf)((Object)hzr2));
        this.mGI = hzr2;
    }

    @llk
    private void buttonClicked(int n, String string) {
        if (n == hyc.lmT.cck) {
            this.duD();
        } else {
            if (n == hyc.lmV.cck) {
                this.a(hyc.lmV, !this.a(hyc.lmV));
                return;
            }
            if (n == hyc.lmZ.cck) {
                jah.cyJ().cIP().cZr();
            } else if (hyc.isValidId(n)) {
                this.b(hyc.getValueById(n));
            }
        }
    }

    public void kr(float f2) {
        this.a("setHeight", new Object[]{Float.valueOf(f2)});
    }

    public hyn s(int n, int n2, String string) {
        if (string == null) {
            return null;
        }
        String[] stringArray = string.split(";");
        if (stringArray.length < 5) {
            return null;
        }
        int n3 = -1;
        try {
            n3 = Integer.valueOf(stringArray[0]);
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (n3 < 0 || n3 >= hyc.values().length) {
            return null;
        }
        hyc hyc2 = hyc.values()[n3];
        if (hyc2.lne == null) {
            return null;
        }
        String string2 = "<FONT size = \"12\" COLOR = \"#FFFFFFFF\">" + hyc2.lne.bD(new Object[0]).exA().toUpperCase() + hyc2.cDL() + "</FONT>";
        float f2 = Float.valueOf(stringArray[1]).floatValue();
        float f3 = Float.valueOf(stringArray[2]).floatValue();
        float f4 = Float.valueOf(stringArray[3]).floatValue();
        float f5 = Float.valueOf(stringArray[4]).floatValue();
        return new hzz((int)(this.cEE() + f2) + 3, (int)(this.cEF() + f3), 0, (int)f5, false, string2);
    }

    protected void g(int n, int n2, String string) {
        this.gFx = n;
        this.gFy = n2;
    }

    @Override
    public void oH(boolean bl) {
        this.mGI = null;
        if (bl) {
            hso.cxK().cxQ().cye();
            loi.exd().shutdown();
        }
    }

    @Override
    public void O(float f2, float f3) {
        hzs hzs2 = jah.cyJ().cHy();
        hzs2.setVisible(true);
        hzs2.cqF();
    }

    public void d(hyc hyc2, boolean bl) {
        if (hyc2 == null) {
            return;
        }
        this.a("setButtonOverlayVisibility", new Object[]{hyc2.cck, bl});
    }

    public void duE() {
        hyc[][] hycArray = this.mGH;
        int n = hycArray.length;
        for (int i = 0; i < n; ++i) {
            hyc[] hycArray2;
            for (hyc hyc2 : hycArray2 = hycArray[i]) {
                if (hyc2 == hyc.lmO && lea.epx().aQH() || !this.a(hyc2)) continue;
                this.a(hyc2, false);
            }
        }
    }

    private void duF() {
        Document document = null;
        String string = "xml-files/client/help.xml";
        try {
            document = jsy.tJ(string);
        }
        catch (bo bo2) {
            return;
        }
        document.getDocumentElement().normalize();
        String string2 = lpd.rHs.exL().substring(0, 2);
        ArrayList<Element> arrayList = mie.BX("help").BX(string2).BX("url").v(document);
        if (arrayList == null) {
            return;
        }
        this.mGE = arrayList.get(0).getTextContent();
    }

    private void duG() {
        this.duF();
        Desktop desktop = Desktop.getDesktop();
        if (!desktop.isSupported(Desktop.Action.BROWSE)) {
            return;
        }
        try {
            desktop.browse(new URI(this.mGE));
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void c(hyc hyc2) {
        this.mGF.add(hyc2);
    }

    public void duH() {
        this.mGG = true;
    }

    protected void b(jnz jnz2, jnz jnz3) {
        if (jnz3 == jnz.nFI) {
            this.mGG = false;
        }
    }

    static /* synthetic */ void a(jah jah2) {
        jah2.duG();
    }
}

