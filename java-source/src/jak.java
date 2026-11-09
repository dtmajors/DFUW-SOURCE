/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cew
 *  cug
 *  lcr
 */
import java.util.ArrayList;
import java.util.List;

public class jak
extends hzk
implements hyy.c {
    private String Title = "";
    private ldv mHe = null;
    private String mHf = "";
    private int iTX = -1;
    private int mHg = -1;

    public jak() {
        super("Market", "Market.swf");
        this.OQ(jnz.nGf | jnz.nGi);
        this.a(hya.lmu, true);
        this.a(hyb.lmC);
    }

    public void setTitle(String string) {
        this.Title = string;
    }

    public void initialize() {
        super.initialize();
        jak.cyJ().cHx().a(hyy.a.lrS, this);
    }

    public void cleanUp() {
        jak.cyJ().cHx().b(hyy.a.lrS);
        super.cleanUp();
    }

    protected void cBa() {
        super.cBa();
        this.cQg();
    }

    private void cQg() {
        les les2 = lea.enX();
        ler ler2 = les2.acv(cug.fkd);
        ArrayList<lfs<String, Integer>> arrayList = lcn.emv();
        arrayList.add(new lfs<String, Integer>("Items", cug.fkd));
        this.a(ler2, arrayList, "  ");
        this.a("setResourceTreeItemCount", new Object[]{arrayList.size()});
        for (int i = 0; i < arrayList.size(); ++i) {
            this.a("setResourceTreeItem", new Object[]{i, ((lfs)arrayList.get(i)).getFirst(), ((lfs)arrayList.get(i)).eqz()});
        }
        this.a("setMarketTitle", new Object[]{this.Title});
    }

    private void a(ler ler2, List<lfs<String, Integer>> list, String string) {
        les les2 = lea.enX();
        ler ler3 = les2.g(ler2);
        while (ler3 != null) {
            if (les2.g(ler3) != null) {
                String string2 = string + ler3.awO().esy();
                list.add(new lfs<String, Integer>(string2, ler3.getType()));
                this.a(ler3, list, string + "  ");
            }
            ler3 = les2.h(ler3);
        }
    }

    protected void a(String string, mhk[] mhkArray) {
        if (string.equals("searchEntered")) {
            if (mhkArray.length == 2 && mhkArray[0].eyY() == mhs.STRING && mhkArray[1].eyY() == mhs.INTEGER) {
                this.mHf = ((mhr)mhkArray[0]).Value;
                this.iTX = ((mho)mhkArray[1]).PC;
                this.Tp(0);
            }
        } else if (string.equals("loadPage")) {
            if (mhkArray.length == 1 && mhkArray[0].eyY() == mhs.INTEGER) {
                int n = ((mho)mhkArray[0]).PC;
                this.Tp(n);
            }
        } else if (!string.equals("getItemCount")) {
            if (string.equals("buyButtonClicked")) {
                if (mhkArray.length == 1 && mhkArray[0].eyY() == mhs.INTEGER) {
                    int n = ((mho)mhkArray[0]).PC;
                    fqa fqa2 = (fqa)this.MessageDelegator.h(29954, this.GUID, this.mHe);
                    fqa2.Hr(n);
                    this.MessageDelegator.F(fqa2);
                }
            } else if (string.equals("sellButtonClicked")) {
                if (mhkArray.length == 2 && mhkArray[0].eyY() == mhs.STRING && mhkArray[1].eyY() == mhs.STRING) {
                    int n = 0;
                    try {
                        n = Integer.valueOf(((mhr)mhkArray[1]).Value);
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    String string2 = ((mhr)mhkArray[0]).Value;
                    int n2 = lea.enW().getType(string2);
                    if (n2 == -1) {
                        return;
                    }
                    cwa cwa2 = (cwa)this.MessageDelegator.bzx().bzt().d(this.mHe);
                    cew cew2 = (cew)cwa2.bdt().aFh();
                    if (cew2 != null) {
                        for (brp brp2 : cew2.aJC().asf().aun().avX()) {
                            if (brp2.ResourceType != n2) continue;
                            fqj fqj2 = (fqj)this.MessageDelegator.h(29953, this.GUID, this.mHe);
                            fqj2.pJ(lcr.O((int)cew2.getServerGUID().ib(), (ldv)brp2.GUID));
                            fqj2.Hq(n);
                            cwa2.receiveMessage(fqj2);
                            break;
                        }
                    }
                }
            } else {
                super.a(string, mhkArray);
            }
        }
    }

    protected void nX(String string) {
        super.nX(string);
    }

    public ldv duZ() {
        return this.mHe;
    }

    public void rG(ldv ldv2) {
        this.mHe = ldv2;
    }

    private void Tp(int n) {
        if (this.mHg != -1) {
            return;
        }
        this.mHg = n;
        fqh fqh2 = (fqh)this.MessageDelegator.h(29955, this.GUID, this.mHe);
        fqh2.kH(this.mHf);
        fqh2.Hw(this.iTX);
        fqh2.Hu(n);
        this.MessageDelegator.F(fqh2);
    }

    public void a(fqi fqi2) {
        if (fqi2.bRf() == 29955) {
            if (fqi2.getResult() == 0) {
                this.a("setMarketItemCount", new Object[]{this.mHg, fqi2.getRowCount(), fqi2.bRg().length});
                for (int i = 0; i < fqi2.bRg().length; ++i) {
                    cvy cvy2 = fqi2.bRg()[i];
                    ler ler2 = lea.enW().acv(cvy2.ResourceType);
                    String string = ler2.awO().esy();
                    int n = 24 - string.length();
                    for (int k = 0; k < n; ++k) {
                        string = string + " ";
                    }
                    String string2 = cvz.wV(cvy2.fBm);
                    assert (string2 != null);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String string3 = string + cvy2.asi + "\t" + cvy2.fBn + "\t" + cvy2.fBp + "\t" + cvy2.mB + "\t" + cvy2.fBq + "\t" + cvy2.fBo + "\t" + string2;
                    this.a("setMarketItem", new Object[]{this.mHg, i, cvy2.bbL, string3});
                }
            }
            this.mHg = -1;
        } else if (fqi2.bRf() == 29954) {
            if (fqi2.getResult() == 0) {
                this.a("refreshGrid", new Object[0]);
            }
        } else if (fqi2.bRf() == 29953) {
            boolean bl = false;
        }
    }

    protected void cEi() {
        this.a("showCaret", true);
    }

    protected void cEj() {
        this.a("showCaret", false);
    }

    @Override
    protected boolean a(hzk hzk2, ifg ifg2, String string) {
        if (string == null) {
            return false;
        }
        return string.startsWith("sell");
    }

    @Override
    public boolean b(hzk hzk2, ifg ifg2, String string) {
        if (!string.startsWith("sell")) {
            return false;
        }
        if (!(ifg2 instanceof ifh)) {
            return false;
        }
        ifh ifh2 = (ifh)ifg2;
        hwm hwm2 = ifh2.cQm();
        if (!(hwm2 instanceof hwo)) {
            return false;
        }
        hwo hwo2 = (hwo)hwm2;
        if (hwo2.cBu() == null) {
            return false;
        }
        String[] stringArray = string.split(";");
        if (stringArray.length < 2) {
            return false;
        }
        int n = 20;
        try {
            n = Integer.valueOf(stringArray[1]);
        }
        catch (Exception exception) {
            return false;
        }
        cwa cwa2 = (cwa)this.MessageDelegator.bzx().bzt().d(this.mHe);
        cew cew2 = (cew)cwa2.bdt().aFh();
        fqj fqj2 = (fqj)this.MessageDelegator.h(29953, this.GUID, this.mHe);
        fqj2.pJ(lcr.O((int)cew2.getServerGUID().ib(), (ldv)hwo2.cBu().getGUID()));
        fqj2.Hq(n);
        this.MessageDelegator.F(fqj2);
        cwa2.receiveMessage(fqj2);
        return true;
    }

    public void dva() {
        gbc gbc2 = (gbc)this.MessageDelegator.h(4879, this.getGUID(), this.mHe);
        this.MessageDelegator.F(gbc2);
    }

    @Override
    public void b(hyy.b b2, int n) {
        if (b2.equals((Object)hyy.b.lvs)) {
            this.dva();
        }
    }

    @Override
    public boolean cGG() {
        return true;
    }

    @Override
    public boolean cGH() {
        return true;
    }
}

