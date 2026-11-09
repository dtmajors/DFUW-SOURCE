/*
 * Decompiled with CFR.
 */
import java.util.List;

public class lfo {
    private final String iTF;

    public lfo(String string) {
        this.iTF = string;
    }

    public final void ad(int n, String string) {
        this.b(n, string, 1);
    }

    public void b(int n, String string, int n2) {
        lfn.b(n, this.iTF, string + "        " + lda.aca(n2 + 2));
        if (n == 5) assert (lda.acc(n));
    }

    public final void debug(String string) {
        this.b(0, string, 1);
    }

    public final void error(String string) {
        this.b(5, string, 1);
    }

    public final void info(String string) {
        this.b(2, string, 1);
    }

    public final void c(Throwable throwable) {
        lfn.log(this.iTF, throwable);
    }

    public final void acC(int n) {
        List<String> list = lda.acb(2);
        for (String string : list) {
            lfn.b(n, this.iTF, "    " + string);
        }
    }

    public final void zA(String string) {
        this.b(3, string, 1);
    }

    public final void verbose(String string) {
        this.b(1, string, 1);
    }

    public final void warning(String string) {
        this.b(4, string, 1);
    }

    public final void ac(String string, int n) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < n; ++i) {
            stringBuffer.append(lda.aca(i + 2));
            if (i >= n - 1) continue;
            stringBuffer.append("\n\t");
        }
        this.ad(1, string + "   " + stringBuffer.toString());
    }

    public void zB(String string) {
        this.ac(string, 5);
    }
}

