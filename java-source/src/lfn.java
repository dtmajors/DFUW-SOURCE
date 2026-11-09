/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcw
 */
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;

public class lfn {
    public static final int rkj = 0;
    public static final int VERBOSE = 1;
    public static final int INFO = 2;
    public static final int rkk = 3;
    public static final int WARNING = 4;
    public static final int ERROR = 5;
    public static final int FATAL = 6;
    public static final String[] rkl = new String[]{"Debug", "Verbose", "Info", "Notice", "Warning", "Error", "Fatal"};
    private kff phT = null;
    public static int rkm = 0;
    private static final lfn rkn = new lfn();
    private StringBuilder qlR = new StringBuilder();
    private loi eF = null;
    private lfp rko = null;
    private static final String rkp = "\r\n";

    private lfn() {
    }

    public final void a(loi loi2) {
        this.eF = loi2;
    }

    public final void equ() {
        if (this.rko == null) {
            this.rko = new lfp(20000, 10000);
            this.rko.bind();
            this.rko.h(0, "Modules::Application", "Instance ID");
        }
    }

    public final void a(lfp.a a2) {
        if (this.rko == null) {
            this.rko = new lfp(a2);
            this.rko.bind();
            this.rko.h(0, "Modules::Application", "Instance ID");
        }
    }

    public final void eqv() {
        if (this.rko != null) {
            this.rko.close();
            this.rko = null;
        }
    }

    public static final lfn eqw() {
        return rkn;
    }

    public static final int eqx() {
        return rkm;
    }

    public static final void acA(int n) {
        System.out.println("\n\n\n SFOut: Warning Level set to [" + rkl[n] + "]\n\n");
        rkm = n;
    }

    public static final void b(int n, String string, String string2) {
        if (rkm <= n) {
            rkn.i(n, string, string2);
        }
    }

    public static final void a(boolean bl, int n, String string, String string2) {
        if (bl) {
            lfn.b(n, string, string2);
        }
    }

    public static final void print(String string) {
        lfn.b(0, "", string);
    }

    private final void i(int n, String string, String string2) {
        if (!lcw.qHj) {
            return;
        }
        if (string2.length() > 2048) {
            System.out.println(string2);
        }
        if (this.rko != null) {
            this.rko.h(n, string, string2);
            return;
        }
        if (this.eF != null) {
            if (rkm <= n) {
                this.eF.k(n, string, string2);
            }
            if (this.phT != null && n > 3) {
                gqn gqn2 = new gqn();
                gqn2.on(lcr.qzh);
                gqn2.f(lcr.qzh);
                String string3 = lda.aca(2);
                gqn2.lf(string3);
                switch (n) {
                    case 5: {
                        string2 = "# ERROR : " + string + ": " + string2;
                        break;
                    }
                    case 4: {
                        string2 = "#WARNING: " + string + ": " + string2;
                        break;
                    }
                    case 3: {
                        string2 = "#NOTICE : " + string + ": " + string2;
                        break;
                    }
                    case 2: {
                        string2 = "#INFO   : " + string + ": " + string2;
                        break;
                    }
                    case 1: {
                        string2 = "#VERBOSE: " + string + ": " + string2;
                        break;
                    }
                    default: {
                        string2 = "#DEBUG  : " + string + ": " + string2;
                    }
                }
                gqn2.lg(string2);
                this.phT.a(gqn2);
            }
            return;
        }
        if (rkm <= n) {
            switch (n) {
                case 5: {
                    this.qlR.append("# ERROR : ");
                    break;
                }
                case 4: {
                    this.qlR.append("#WARNING: ");
                    break;
                }
                case 3: {
                    this.qlR.append("#NOTICE : ");
                    break;
                }
                case 2: {
                    this.qlR.append("#INFO   : ");
                    break;
                }
                case 1: {
                    this.qlR.append("#VERBOSE: ");
                    break;
                }
                default: {
                    this.qlR.append("#DEBUG  : ");
                }
            }
            this.qlR.append(string).append(": ").append(string2);
            if (n == 5) {
                System.err.println(this.qlR.toString());
                System.err.flush();
            } else {
                System.out.println(this.qlR.toString());
                System.out.flush();
            }
            this.qlR.setLength(0);
        }
    }

    public static final void log(String string, Throwable throwable) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        throwable.printStackTrace(printWriter);
        String string2 = stringWriter.toString();
        int n = 0;
        while (n < string2.length()) {
            int n2 = string2.indexOf(rkp, n);
            if (n2 == -1) {
                n2 = string2.length();
            }
            String string3 = string2.substring(n, n2);
            lfn.b(5, string, string3);
            n = n2 + rkp.length();
        }
    }

    public static final String b(String string, Throwable throwable) {
        Appendable appendable = new StringWriter();
        PrintWriter printWriter = new PrintWriter((Writer)appendable);
        throwable.printStackTrace(printWriter);
        String string2 = ((StringWriter)appendable).toString();
        appendable = new StringBuilder();
        int n = 0;
        while (n < string2.length()) {
            int n2 = string2.indexOf(10, n);
            if (n2 == -1) {
                n2 = string2.length();
            }
            ((StringBuilder)appendable).append(string2.substring(n, n2));
            ((StringBuilder)appendable).append("\n");
            n = n2 + 1;
        }
        return ((StringBuilder)appendable).toString();
    }

    public static final String b(Throwable throwable) {
        StackTraceElement[] stackTraceElementArray = throwable.getStackTrace();
        return stackTraceElementArray[0].getClassName() + ": " + stackTraceElementArray[0].getMethodName() + "() " + throwable.getCause();
    }

    public static final void ac(int n, String string) {
        List<String> list = lda.acb(2);
        for (String string2 : list) {
            lfn.b(n, string, string2);
        }
    }

    public static final void acB(int n) {
        List<String> list = lda.acb(2);
        String string = "don't do this.";
        for (String string2 : list) {
            lfn.b(n, string, string2);
        }
    }
}

