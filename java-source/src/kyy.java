/*
 * Decompiled with CFR.
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;
import java.util.StringTokenizer;
import javax.swing.text.BadLocationException;

public abstract class kyy {
    protected kyr qkM = null;
    protected kyx qnl = null;
    private kyh qnm = null;
    private StringBuilder qlR = new StringBuilder();
    private int qiU = 1;
    protected boolean qnn = false;
    private kyy qno = null;
    private boolean qnp = false;

    public kyy(kyr kyr2) {
        this.qkM = kyr2;
        this.init();
    }

    public final kyr ejN() {
        return this.qkM;
    }

    public final kyx ejO() {
        return this.qnl;
    }

    public final int getLineNumber() {
        return this.qiU;
    }

    public final boolean ejP() {
        return this.qnp;
    }

    public final void xW(boolean bl) {
        this.qnp = bl;
    }

    public final int eiD() {
        return this.qkM.eja().qjt;
    }

    public abstract String cgO();

    public final boolean ejQ() {
        return this.qkM.eja().qjp;
    }

    public final boolean ejR() {
        return this.qkM.eja().qjs;
    }

    public final boolean ejS() {
        return this.qkM.eja().qjq;
    }

    public final boolean ejT() {
        return this.qkM.eja().qjr;
    }

    private void init() {
        this.qnl = new kyx(this);
        this.qnm = new kyh();
    }

    protected final void an(String string, String string2) {
        assert (string != null);
        assert (string2 != null);
        BufferedWriter bufferedWriter = null;
        try {
            jrw jrw2 = new jrw(string);
            bufferedWriter = new BufferedWriter(new FileWriter(jrw2));
            bufferedWriter.write(string2);
            bufferedWriter.close();
        }
        catch (Exception exception) {
            System.out.println("SFViewSession: saveContent() Exception caught: " + exception);
            exception.printStackTrace();
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            }
            catch (Exception exception2) {
                exception2.printStackTrace();
            }
        }
    }

    public final void h(int n, String string, String string2) {
        this.b("", "", n, string, string2 + "\n");
    }

    public final void a(String string, String string2, int n, String string3, String string4) {
        if (this.a(this.qkM.eja().qjx, string, n, string3, string4)) {
            return;
        }
        this.b(string, string2, n, string3, string4);
    }

    public final void ejU() {
        this.qnm.clear();
        this.qnl.ejK();
        this.qiU = 1;
        if (this.qno != null) {
            this.qno.ejU();
        }
    }

    protected final boolean a(kyk[] kykArray, String string, int n, String string2, String string3) {
        assert (kykArray != null);
        block5: for (int i2 = 0; i2 < kykArray.length; ++i2) {
            if (!kykArray[i2].isEnabled()) continue;
            switch (kykArray[i2].eiJ()) {
                case qkI: {
                    if (!this.a(kykArray[i2].eiK(), string2, kykArray[i2].getExpression()) || kykArray[i2].eiL() <= n) continue block5;
                    return true;
                }
                case qkJ: {
                    if (!this.a(kykArray[i2].eiK(), string3, kykArray[i2].getExpression()) || kykArray[i2].eiL() <= n) continue block5;
                    return true;
                }
                case qkK: {
                    lfn.b(5, "SFLogfileViewSession", "filterLogItem() TimeFilter not implemented.");
                    return false;
                }
                default: {
                    lfn.b(5, "SFLogfileViewSession", "filterLogItem() Invalid FilterType provided: '" + kykArray[i2].eiJ().name() + "'");
                    return false;
                }
            }
        }
        return false;
    }

    protected final String xP(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        StringTokenizer stringTokenizer = new StringTokenizer(string, "\n", false);
        while (stringTokenizer.hasMoreTokens()) {
            String string2 = stringTokenizer.nextToken();
            int[] nArray = this.xQ(string2);
            if (nArray == null) {
                stringBuilder.append(string2);
                stringBuilder.append("\n");
                continue;
            }
            String string3 = string2.substring(0, nArray[0]).trim();
            String string4 = string2.substring(nArray[1]);
            int n = string4.indexOf(": ");
            String string5 = string4.substring(0, n);
            string4 = string4.substring(n + 1);
            if (!string3.startsWith("[")) {
                stringBuilder.append("[");
            }
            stringBuilder.append(string3.trim());
            if (!string3.endsWith("]")) {
                stringBuilder.append("]");
            }
            stringBuilder.append(" (");
            stringBuilder.append(lfn.rkl[nArray[2]]);
            stringBuilder.append(") [");
            stringBuilder.append(string5.trim());
            stringBuilder.append("] ");
            stringBuilder.append(string4.trim());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    protected final void ejV() {
        try {
            List list = this.qnm.eiI();
            for (int i2 = 0; i2 < list.size(); ++i2) {
                this.qnl.b((kyg)list.get(i2));
            }
            this.qnl.ejL();
            this.qnn = false;
        }
        catch (BadLocationException badLocationException) {
            System.out.println("SFViewSession: flushLogViewCache() Exception caught: " + badLocationException);
            badLocationException.printStackTrace();
        }
        if (this.qno != null) {
            this.qno.ejV();
        }
    }

    private void a(kyg kyg2, boolean bl) {
        this.qnm.a(kyg2);
        this.qnn = true;
    }

    private boolean a(kyk.a a2, String string, String string2) {
        switch (a2) {
            case qkF: {
                return string.contains(string2);
            }
            case qkG: {
                return string.startsWith(string2);
            }
        }
        lfn.b(5, "SFLogfileViewSession", "checkText() Invalid CheckType provided: '" + a2.name() + "'");
        return false;
    }

    private int[] xQ(String string) {
        assert (string != null);
        int n = (string = string.toLowerCase()).indexOf("(debug)");
        if (n >= 0) {
            return new int[]{n, n + 7, 0};
        }
        n = string.indexOf("(verbose)");
        if (n >= 0) {
            return new int[]{n, n + 9, 1};
        }
        n = string.indexOf("(info)");
        if (n >= 0) {
            return new int[]{n, n + 6, 2};
        }
        n = string.indexOf("(notice)");
        if (n >= 0) {
            return new int[]{n, n + 8, 3};
        }
        n = string.indexOf("(warning)");
        if (n >= 0) {
            return new int[]{n, n + 9, 4};
        }
        n = string.indexOf("(error)");
        if (n >= 0) {
            return new int[]{n, n + 7, 5};
        }
        n = string.indexOf("(fatal)");
        if (n >= 0) {
            return new int[]{n, n + 7, 6};
        }
        this.h(5, "SFLogfileViewSession", "getLogLevelNameIndexes() Line does not contain loglevel: '" + string + "'");
        return null;
    }

    private void b(String string, String string2, int n, String string3, String string4) {
        this.qlR.append(string3);
        this.qlR.append(": ");
        this.qlR.append(string4);
        kyg kyg2 = new kyg(this.qiU, string, string2, (byte)n, this.qlR.toString());
        this.a(kyg2, true);
        ++this.qiU;
        this.qlR.delete(0, this.qlR.length());
        if (this.qno != null) {
            this.qno.b(string, string2, n, string3, string4);
        }
    }

    public void ejW() {
        if (this.qno != null) {
            this.h(5, "SFViewSession", "removeLinkedViewSession() A linked viewsession already exists.");
            return;
        }
        this.qno = this.ejz();
        if (this.qno instanceof kyt) {
            this.ejV();
        }
        this.qno.qiU = this.qiU;
        if (this instanceof kys) {
            ((kys)this).ejx();
        }
    }

    public final kyy ejX() {
        return this.qno;
    }

    public void ejY() {
        if (this.qno == null) {
            this.h(5, "SFViewSession", "removeLinkedViewSession() LinkedViewSession is null.");
            return;
        }
        this.qno = null;
    }

    protected abstract kyy ejz();
}

