/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  hyn
 *  lcr
 */
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class ieo
extends hzk
implements jml {
    private ka lct;
    private String[] lOi = new String[0];
    private int lOj = -1;
    private boolean lOk = false;
    private List<String> kgT = lcn.emA();
    private static Map<jmr, String> lOl = lcn.emw();

    public ieo() {
        super("CommandLineWindow", "CommandLine.swf");
        this.a("History", hsu.ldg, "");
        this.a(hya.lmp, true);
        this.OQ(jnz.nGj);
        this.a(hya.lmu, true);
        this.a(hxy.llJ);
        this.a(hyb.lmE);
        this.pe(false);
    }

    public void initialize() {
        super.initialize();
        this.lct = hso.cxK().cxS();
        jmn jmn2 = hso.cxK().cxR().dMa();
        jmn2.a(jmq.nzG, this);
        this.pQ("startup");
    }

    protected void cBa() {
        super.cBa();
        this.cQg();
        this.cQi();
    }

    @Override
    protected void cDZ() {
        super.cDZ();
        this.kgT.clear();
        String string = this.nj("History");
        StringTokenizer stringTokenizer = new StringTokenizer(string, "\u0001");
        while (stringTokenizer.hasMoreTokens()) {
            String string2 = stringTokenizer.nextToken();
            if (string2.isEmpty()) continue;
            this.kgT.add(string2);
        }
    }

    protected void oa(String string) {
        if (string != null && !string.isEmpty()) {
            this.historyAdd(string);
            this.pS(string);
        }
    }

    protected void ob(String string) {
        this.cQi();
    }

    @llk
    public void textEntered(String string) {
        this.pS(string);
        this.pU("]");
    }

    @llk
    public void historyAdd(String string) {
        if (!this.kgT.contains(string)) {
            this.kgT.add(string);
            this.cQh();
        }
    }

    @llk
    public void historyTrim(int n) {
        while (this.kgT.size() > n) {
            this.kgT.remove(0);
        }
        this.cQh();
    }

    @llk
    public void keyPressed(String string) {
        this.pU(string);
    }

    @llk
    public void tabPressed(String string) {
        this.pV(string);
    }

    @llk
    public void updateHelp(String string) {
        this.pT(string);
    }

    public boolean pQ(String string) {
        int n = string.lastIndexOf(File.pathSeparatorChar);
        if (n == -1) {
            n = 0;
        }
        if ((n = string.indexOf(46, n)) == -1) {
            string = string + ".dfscript";
        }
        String string2 = "";
        try {
            string2 = jry.ti("gamelogic_scripts_new//" + string);
        }
        catch (Exception exception) {
            return false;
        }
        String[] stringArray = string2.split("\n");
        for (int j = 0; j < stringArray.length; ++j) {
            String string3 = stringArray[j].trim();
            if (string3.length() <= 0) continue;
            this.pS(string3);
        }
        return true;
    }

    public void pR(String string) {
        this.a("setEditorText", new Object[]{string});
    }

    private void pS(String string) {
        jn jn2 = this.lct.bm(string);
        if (jn2.akV == null) {
            return;
        }
        if (jn2.alm != null) {
            this.y(jn2.alm);
            return;
        }
        ewq ewq2 = (ewq)this.MessageDelegator.h(29699, this.getGUID(), this.lct.getGUID());
        bun bun2 = (bun)this.MessageDelegator.bzx().bzt().d(lcr.qBP);
        assert (bun2 != null);
        if (bun2 != null) {
            if (jn2.aln == jn.a.alo.ordinal()) {
                ewq2.akX = bun2.ayp();
            } else if (jn2.aln == jn.a.alp.ordinal()) {
                ewq2.akX = bun2.axO();
                if (ewq2.akX == null) {
                    return;
                }
            } else if (jn2.aln == jn.a.alq.ordinal()) {
                jpy jpy2 = (jpy)this.MessageDelegator.bzx().bzt().d(lcr.qBQ);
                assert (jpy2 != null);
                ewq2.akX = jpy2.dQH();
                if (ewq2.akX == null) {
                    return;
                }
            }
            ewq2.akX = lcr.O((int)0, (ldv)ewq2.akX);
        }
        ewq2.akV = jn2.akV;
        ewq2.akW = jn2.ob();
        this.MessageDelegator.F(ewq2);
    }

    private void pT(String string) {
        int n = string.indexOf(" ");
        jm jm2 = null;
        String string2 = string;
        if (n != -1) {
            string2 = string.substring(0, n);
        }
        jm2 = this.lct.bd(string2);
        StringBuilder stringBuilder = new StringBuilder();
        if (jm2 != null) {
            stringBuilder.append(jm2.akV);
            stringBuilder.append("(");
            for (int j = 0; j < jm2.alf.length; ++j) {
                mhs mhs2 = jm2.alf[j];
                if (j != 0) {
                    stringBuilder.append(",");
                }
                if (j == jm2.alf.length - 1 && jm2.alg) {
                    stringBuilder.append("[");
                    stringBuilder.append(mhs2.toString());
                    stringBuilder.append("]");
                    continue;
                }
                stringBuilder.append(mhs2.toString());
            }
            stringBuilder.append("): ");
            stringBuilder.append(jm2.alh.bD(new Object[0]).exA());
        }
        this.a("showHelp", new Object[]{stringBuilder.toString().toLowerCase()});
    }

    private void pU(String string) {
        String string2;
        ArrayList<String> arrayList;
        List<ler> list;
        les les2;
        String string3;
        boolean bl;
        if (string == null || string.trim().isEmpty()) {
            return;
        }
        boolean bl2 = bl = (string = string.toLowerCase()).lastIndexOf(42) != -1;
        if (bl) {
            string = string.replace("*", "");
        }
        String[] stringArray = new String[]{};
        int n = string.lastIndexOf(" r_");
        if (n == -1) {
            n = string.lastIndexOf("'r_");
        }
        if (n == -1) {
            n = string.lastIndexOf("\"r_");
        }
        if (n != -1) {
            ++n;
        }
        this.lOj = n;
        if (n != -1) {
            string3 = string.substring(n);
            les2 = lea.enW();
            list = les2.a(les2.eqq(), true, true);
            arrayList = lcn.emv();
            for (ler ler2 : list) {
                if (!lea.enW().isDescendant(ler2.getType(), cug.fkd) && !lea.enW().isDescendant(ler2.getType(), cug.fgG) || !(string2 = ler2.getName()).toLowerCase().startsWith(string3) && (!bl || !string2.toLowerCase().contains(string3))) continue;
                arrayList.add(string2);
            }
            Collections.sort(arrayList);
            stringArray = arrayList.toArray(stringArray);
        } else {
            n = string.lastIndexOf(" s_");
            if (n == -1) {
                n = string.lastIndexOf("'s_");
            }
            if (n == -1) {
                n = string.lastIndexOf("\"s_");
            }
            if (n != -1) {
                ++n;
            }
            this.lOj = n;
            if (n != -1) {
                string3 = string.substring(n);
                les2 = lea.enZ();
                list = les2.a(les2.eqq(), true, true);
                arrayList = lcn.emv();
                for (ler ler2 : list) {
                    string2 = ler2.getName();
                    if (!string2.toLowerCase().startsWith(string3) && (!bl || !string2.toLowerCase().contains(string3)) || !lea.eob().contains(ler2.getType())) continue;
                    arrayList.add(string2);
                }
                Collections.sort(arrayList);
                stringArray = arrayList.toArray(stringArray);
            } else {
                stringArray = this.lct.e(string, bl);
            }
        }
        this.lOi = stringArray;
        string3 = "";
        for (int j = 0; j < stringArray.length && j <= 15; ++j) {
            if (j != 0) {
                string3 = string3 + ";";
            }
            string3 = string3 + stringArray[j];
        }
        this.a("showCompletions", new Object[]{string3});
    }

    private void pV(String string) {
        String[] stringArray;
        if (this.lOj != -1) {
            string = string.toLowerCase().substring(this.lOj);
        }
        if ((stringArray = this.lOi).length == 0) {
            return;
        }
        int n = 0;
        for (n = 0; n < stringArray.length && !stringArray[n].toLowerCase().equals(string.toLowerCase()); ++n) {
        }
        if (n == stringArray.length) {
            n = -1;
        }
        int n2 = (n + 1) % stringArray.length;
        String string2 = stringArray[n2];
        this.a("completeText", new Object[]{string2, this.lOj});
    }

    private void y(loz loz2) {
        this.a("addError", new Object[]{loz2.exA()});
    }

    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 29700: {
                this.a((ews)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    protected void b(jnz jnz2, jnz jnz3) {
        if (jnz3 == jnz.nFJ) {
            this.cFc();
            this.cEi();
        }
    }

    private void a(ews ews2) {
        loz loz2 = ews2.iEy;
        if (ews2.iEz) {
            this.a("addError", new Object[]{loz2 != null ? loz2.exA() : null});
        } else {
            this.a("addMessage", new Object[]{loz2 != null ? loz2.exA() : null});
        }
    }

    protected boolean d(int n, int n2, String string) {
        return true;
    }

    protected void g(int n, int n2, String string) {
        this.lOk = true;
        this.a("showCaret", this.lOk);
    }

    protected void cEi() {
        this.lOk = true;
        this.a("showCaret", this.lOk);
    }

    protected void cEj() {
        this.lOk = false;
        this.a("showCaret", this.lOk);
    }

    private void cQg() {
        this.a("showCaret", this.lOk);
    }

    private void cQh() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : this.kgT) {
            stringBuilder.append(string);
            stringBuilder.append('\u0001');
        }
        this.B("History", stringBuilder.toString());
    }

    private void cQi() {
        if (this.cDj()) {
            this.a("clearHistory", new Object[0]);
            for (String string : this.kgT) {
                this.a("addHistory", new Object[]{string});
            }
        }
    }

    @Override
    public void a(jmq jmq2) {
        switch (jmq2) {
            case nzG: {
                this.cQj();
                break;
            }
            default: {
                lfn.b(5, "SFRadialMenu", "handleStateActionTriggered(): Unhandled action " + (Object)((Object)jmq2));
                assert (false);
                break;
            }
        }
    }

    private void cQj() {
        jmr jmr2 = hyn.cFj().cxR().dMc().dMJ();
        String string = lOl.get(jmr2);
        if (string == null) {
            assert (false);
            return;
        }
        this.pS(string);
    }

    @Override
    public void a(jmq jmq2, int n) {
    }

    @Override
    public void a(jmq jmq2, double d2) {
    }

    public static void a(jmr jmr2, String string) {
        lOl.put(jmr2, string);
    }

    protected boolean cFU() {
        return false;
    }
}

