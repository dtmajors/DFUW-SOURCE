/*
 * Decompiled with CFR.
 */
import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class kym {
    private static final String qkW = "DebugColor";
    private static final String qkX = "VerboseColor";
    private static final String qkY = "InfoColor";
    private static final String qkZ = "NoticeColor";
    private static final String qla = "WarningColor";
    private static final String qlb = "ErrorColor";
    private static final String qlc = "FatalColor";
    private static final String qld = "BackgroundColor";
    private static final String qle = "LineNumberColor";
    private static final String qlf = "TextPaneBackgroundColor";
    private static final String qlg = "LogLevel";
    private static final String qlh = "AutoScroll";
    private static final String qli = "ShowLineNumbers";
    private static final String qlj = "ShowTime";
    private static final String qlk = "ShowExtraTime";
    private static final String qll = "SleepLength";
    private static final String qlm = "MaxSleepCount";
    private static final String qln = "Directory_Begin";
    private static final String qlo = "Directory_End";
    private static final String qlp = "Filter_Begin";
    private static final String qlq = "FilterType";
    private static final String qlr = "CheckType";
    private static final String qls = "Min_LogLevel";
    private static final String qlt = "Expression";
    private static final String qlu = "Enabled";
    private static final String qlv = "Filter_End";
    private static final String qlw = "ViewSession_Begin";
    private static final String qlx = "Logfile";
    private static final String qly = "PortNumber";
    private static final String qlz = "Directory";
    private static final String qlA = "FileName";
    private static final String qlB = "ContainsLinkedViewSession";
    private static final String qlC = "SplitViewPaneA";
    private static final String qlD = "ViewSession_End";
    private static final String qlE = "WindowInfo_Begin";
    private static final String qlF = "TabView";
    private static final String qlG = "WindowX";
    private static final String qlH = "WindowY";
    private static final String qlI = "WindowHeight";
    private static final String qlJ = "WindowWidth";
    private static final String qlK = "WindowInfo_End";
    private static final int qlL = 1;
    private static final int qlM = 2;
    private static final int qlN = 3;
    private static final int qlO = 4;
    private static final int qlP = 5;
    private int qlQ = 0;
    private StringBuilder qlR = null;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void ak(String string, String string2) {
        assert (string != null);
        assert (string2 != null);
        jrw jrw2 = new jrw(string);
        if (jrw2.exists()) {
            FileChannel fileChannel = null;
            AbstractInterruptibleChannel abstractInterruptibleChannel = null;
            try {
                fileChannel = new FileInputStream(string).getChannel();
                abstractInterruptibleChannel = new FileOutputStream(string2).getChannel();
                ((FileChannel)abstractInterruptibleChannel).transferFrom(fileChannel, 0L, fileChannel.size());
            }
            catch (IOException iOException) {
                lfn.b(5, "SFLogViewPersistenceHandler", "createBackupFile() Creating backupfile failed: " + iOException);
            }
            finally {
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    }
                    catch (IOException iOException) {
                        iOException.printStackTrace();
                    }
                }
                if (abstractInterruptibleChannel != null) {
                    try {
                        abstractInterruptibleChannel.close();
                    }
                    catch (IOException iOException) {
                        iOException.printStackTrace();
                    }
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public kyi xJ(String string) {
        assert (string != null);
        kyi kyi2 = new kyi();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(new jrw(string)));
            String string2 = bufferedReader.readLine();
            ArrayList<String> arrayList = lcn.abH(2);
            ArrayList<kyk> arrayList2 = lcn.abH(2);
            ArrayList<kyz> arrayList3 = lcn.abH(2);
            this.qlQ = 3;
            kyk kyk2 = null;
            kyz kyz2 = null;
            kza kza2 = null;
            while (string2 != null && string2 != "") {
                if ((string2 = string2.trim()).equals("") || string2.startsWith("#")) {
                    string2 = bufferedReader.readLine();
                    continue;
                }
                switch (this.qlQ) {
                    case 1: {
                        if (string2.equals(qlo)) {
                            this.qlQ = 3;
                            break;
                        }
                        if (arrayList.contains(string2)) break;
                        arrayList.add(string2);
                        break;
                    }
                    case 2: {
                        assert (kyk2 != null);
                        if (string2.equals(qlv)) {
                            this.qlQ = 3;
                            if (kyk2.validate()) {
                                arrayList2.add(kyk2);
                                break;
                            }
                            System.out.println("SFLogViewPersistenceHandler: loadLogViewConfig() Filter is invalid.");
                            break;
                        }
                        this.a(kyk2, string2);
                        break;
                    }
                    case 3: {
                        if (string2.equals(qln)) {
                            this.qlQ = 1;
                            break;
                        }
                        if (string2.equals(qlp)) {
                            this.qlQ = 2;
                            kyk2 = new kyk();
                            break;
                        }
                        if (string2.equals(qlw)) {
                            this.qlQ = 4;
                            kyz2 = new kyz();
                            break;
                        }
                        if (string2.equals(qlE)) {
                            this.qlQ = 5;
                            kza2 = new kza();
                            break;
                        }
                        this.a(kyi2, string2);
                        break;
                    }
                    case 4: {
                        assert (kyz2 != null);
                        if (string2.equals(qlD)) {
                            this.qlQ = 3;
                            if (kyz2.validate()) {
                                arrayList3.add(kyz2);
                                break;
                            }
                            System.out.println("SFLogViewPersistenceHandler: loadLogViewConfig() ViewSessionInfo is invalid.");
                            break;
                        }
                        this.a(kyz2, string2);
                        break;
                    }
                    case 5: {
                        assert (kza2 != null);
                        if (string2.equals(qlK)) {
                            this.qlQ = 3;
                            if (kza2.qnu) {
                                kyi2.qjd = kza2;
                                break;
                            }
                            kyi2.qje = kza2;
                            break;
                        }
                        this.a(kza2, string2);
                        break;
                    }
                    default: {
                        System.out.println("SFLogViewPersistenceHandler: loadLogViewConfig() Invalid LoadState provided: " + this.qlQ);
                        assert (false);
                        break;
                    }
                }
                if (arrayList.size() > 0) {
                    Collections.sort(arrayList);
                    kyi2.qjw = arrayList.toArray(new String[arrayList.size()]);
                }
                if (arrayList2.size() > 0) {
                    kyi2.qjx = arrayList2.toArray(new kyk[arrayList2.size()]);
                }
                if (arrayList3.size() > 0) {
                    kyi2.qjy = arrayList3.toArray(new kyz[arrayList3.size()]);
                }
                string2 = bufferedReader.readLine();
            }
        }
        catch (Exception exception) {
            System.out.println("SFLogViewPersistenceHandler: loadLogViewConfig() Exception caught: " + exception);
            exception.printStackTrace();
        }
        finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                }
            }
        }
        return kyi2;
    }

    public void a(String string, kyi kyi2) {
        assert (string != null);
        assert (kyi2 != null);
        try {
            int n;
            jrw jrw2 = new jrw(string);
            this.qlR = new StringBuilder();
            this.xK("### Configuration of SFLogViewer version 2 ###");
            this.qlR.append("\n");
            this.xK(qlE);
            this.S(qlF, true);
            this.X(qlG, kyi2.qjd.lnR);
            this.X(qlH, kyi2.qjd.lnS);
            this.X(qlI, kyi2.qjd.pgs);
            this.X(qlJ, kyi2.qjd.pgr);
            this.xK(qlK);
            this.qlR.append("\n");
            this.xK(qlE);
            this.S(qlF, false);
            this.X(qlG, kyi2.qje.lnR);
            this.X(qlH, kyi2.qje.lnS);
            this.X(qlI, kyi2.qje.pgs);
            this.X(qlJ, kyi2.qje.pgr);
            this.xK(qlK);
            this.qlR.append("\n");
            this.a(qkW, kyi2.qjf);
            this.a(qkX, kyi2.qjg);
            this.a(qkY, kyi2.qjh);
            this.a(qkZ, kyi2.qji);
            this.a(qla, kyi2.qjj);
            this.a(qlb, kyi2.qjk);
            this.a(qlc, kyi2.qjl);
            this.a(qld, kyi2.qjm);
            this.a(qle, kyi2.qjn);
            this.a(qlf, kyi2.qjo);
            this.qlR.append("\n");
            this.X(qlg, kyi2.qjt);
            this.S(qlh, kyi2.qjp);
            this.S(qli, kyi2.qjq);
            this.S(qlj, kyi2.qjr);
            this.S(qlk, kyi2.qjs);
            this.a(qll, kyi2.qju);
            this.X(qlm, kyi2.qjv);
            if (kyi2.qjw != null) {
                this.qlR.append("\n");
                this.xK(qln);
                for (int i2 = 0; i2 < kyi2.qjw.length; ++i2) {
                    this.xK(kyi2.qjw[i2]);
                }
                this.xK(qlo);
            }
            if (kyi2.qjx != null) {
                this.qlR.append("\n");
                kyk kyk2 = null;
                for (n = 0; n < kyi2.qjx.length; ++n) {
                    kyk2 = kyi2.qjx[n];
                    if (n > 0) {
                        this.qlR.append("\n");
                    }
                    this.xK(qlp);
                    this.al(qlq, kyk2.eiJ().name());
                    this.al(qlr, kyk2.eiK().name());
                    this.al(qls, lfn.rkl[kyk2.eiL()]);
                    this.al(qlt, kyk2.getExpression());
                    this.S(qlu, kyk2.isEnabled());
                    this.xK(qlv);
                }
            }
            if (kyi2.qjy != null) {
                this.qlR.append("\n");
                kyz kyz2 = null;
                for (n = 0; n < kyi2.qjy.length; ++n) {
                    kyz2 = kyi2.qjy[n];
                    if (n > 0) {
                        this.qlR.append("\n");
                    }
                    this.xK(qlw);
                    this.S(qlx, kyz2.qns);
                    if (kyz2.qns) {
                        this.al(qlz, kyz2.pnB);
                        this.al(qlA, kyz2.FileName);
                    } else {
                        this.X(qly, kyz2.qmV);
                    }
                    if (kyz2.qnt) {
                        this.S(qlB, kyz2.qnt);
                        this.S(qlC, kyz2.qnp);
                    }
                    this.xK(qlD);
                }
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(jrw2));
            bufferedWriter.write(this.qlR.toString());
            bufferedWriter.close();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void a(kyk kyk2, String string) {
        assert (kyk2 != null);
        assert (string != null);
        int n = string.indexOf(61);
        if (n <= 0) {
            System.out.println("SFLogViewPersistenceHandler: checkFilterToken() Invalid token: '" + string + "'");
            return;
        }
        String string2 = string.substring(0, n);
        String string3 = string.substring(n + 1, string.length());
        if (string2.equals(qlq)) {
            kyk2.a(kyk.xH(string3));
            if (kyk2.eiJ() == null) {
                System.out.println("SFLogViewPersistenceHandler: checkFilterToken() FilterType is invalid.");
                assert (false);
            }
        } else if (string2.equals(qlr)) {
            kyk2.a(kyk.xG(string3));
            if (kyk2.eiK() == null) {
                System.out.println("SFLogViewPersistenceHandler: checkFilterToken() CheckType is invalid.");
                assert (false);
            }
        } else if (string2.equals(qls)) {
            kyk2.abj(kyk.xI(string3));
            if (kyk2.eiL() < 0) {
                System.out.println("SFLogViewPersistenceHandler: checkFilterToken() MinLogLevel is invalid.");
                assert (false);
            }
        } else if (string2.equals(qlt)) {
            kyk2.setExpression(string3);
        } else if (string2.equals(qlu)) {
            kyk2.setEnabled(Boolean.parseBoolean(string3));
        }
    }

    private void a(kyi kyi2, String string) {
        assert (kyi2 != null);
        assert (string != null);
        int n = string.indexOf(61);
        if (n <= 0) {
            System.out.println("SFLogViewPersistenceHandler: checkToken() Invalid token: '" + string + "'");
            return;
        }
        String string2 = string.substring(0, n);
        String string3 = string.substring(n + 1, string.length());
        if (string2.equals(qkW)) {
            Color color = this.xL(string3);
            if (color != null) {
                kyi2.qjf = color;
            } else {
                System.out.println("SFLogViewPersistenceHandler: checkToken() DebugColor is invalid.");
            }
        } else if (string2.equals(qkX)) {
            Color color = this.xL(string3);
            if (color != null) {
                kyi2.qjg = color;
            } else {
                System.out.println("SFLogViewPersistenceHandler: checkToken() VerboseColor is invalid.");
            }
        } else if (string2.equals(qkY)) {
            Color color = this.xL(string3);
            if (color != null) {
                kyi2.qjh = color;
            } else {
                System.out.println("SFLogViewPersistenceHandler: checkToken() InfoColor is invalid.");
            }
        } else if (string2.equals(qkZ)) {
            Color color = this.xL(string3);
            if (color != null) {
                kyi2.qji = color;
            } else {
                System.out.println("SFLogViewPersistenceHandler: checkToken() NoticeColor is invalid.");
            }
        } else if (string2.equals(qla)) {
            Color color = this.xL(string3);
            if (color != null) {
                kyi2.qjj = color;
            } else {
                System.out.println("SFLogViewPersistenceHandler: checkToken() WarningColor is invalid.");
            }
        } else if (string2.equals(qlb)) {
            Color color = this.xL(string3);
            if (color != null) {
                kyi2.qjk = color;
            } else {
                System.out.println("SFLogViewPersistenceHandler: checkToken() ErrorColor is invalid.");
            }
        } else if (string2.equals(qlc)) {
            Color color = this.xL(string3);
            if (color != null) {
                kyi2.qjl = color;
            } else {
                System.out.println("SFLogViewPersistenceHandler: checkToken() FatalColor is invalid.");
            }
        } else if (string2.equals(qld)) {
            Color color = this.xL(string3);
            if (color != null) {
                kyi2.qjm = color;
            } else {
                System.out.println("SFLogViewPersistenceHandler: checkToken() BackgroundColor is invalid.");
            }
        } else if (string2.equals(qle)) {
            Color color = this.xL(string3);
            if (color != null) {
                kyi2.qjn = color;
            } else {
                System.out.println("SFLogViewPersistenceHandler: checkToken() LineNumberColor is invalid.");
            }
        } else if (string2.equals(qlf)) {
            Color color = this.xL(string3);
            if (color != null) {
                kyi2.qjo = color;
            } else {
                System.out.println("SFLogViewPersistenceHandler: checkToken() TextPaneBackgroundColor is invalid.");
            }
        } else if (string2.equals(qlg)) {
            int n2 = Integer.parseInt(string3);
            if (n2 < 0 || n2 > 6) {
                n2 = 0;
            }
            kyi2.qjt = n2;
        } else if (string2.equals(qlh)) {
            kyi2.qjp = Boolean.parseBoolean(string3);
        } else if (string2.equals(qli)) {
            kyi2.qjq = Boolean.parseBoolean(string3);
        } else if (string2.equals(qlj)) {
            kyi2.qjr = Boolean.parseBoolean(string3);
        } else if (string2.equals(qlk)) {
            kyi2.qjs = Boolean.parseBoolean(string3);
        } else if (string2.equals(qll)) {
            kyi2.qju = Long.parseLong(string3);
        } else if (string2.equals(qlm)) {
            kyi2.qjv = Integer.parseInt(string3);
        } else {
            System.out.println("SFLogViewPersistenceHandler: checkToken() Invalid name provided: '" + string2 + ". Token='" + string + "'");
        }
    }

    private void a(kyz kyz2, String string) {
        assert (kyz2 != null);
        assert (string != null);
        int n = string.indexOf(61);
        if (n <= 0) {
            System.out.println("SFLogViewPersistenceHandler: checkViewSessionToken() Invalid token: '" + string + "'");
            return;
        }
        String string2 = string.substring(0, n);
        String string3 = string.substring(n + 1, string.length());
        if (string2.equals(qlx)) {
            kyz2.qns = Boolean.parseBoolean(string3);
        } else if (string2.equals(qly)) {
            kyz2.qmV = Integer.parseInt(string3);
        } else if (string2.equals(qlz)) {
            kyz2.pnB = string3;
        } else if (string2.equals(qlA)) {
            kyz2.FileName = string3;
        } else if (string2.equals(qlB)) {
            kyz2.qnt = Boolean.parseBoolean(string3);
        } else if (string2.equals(qlC)) {
            kyz2.qnp = Boolean.parseBoolean(string3);
        }
    }

    private void a(kza kza2, String string) {
        assert (kza2 != null);
        assert (string != null);
        int n = string.indexOf(61);
        if (n <= 0) {
            System.out.println("SFLogViewPersistenceHandler: checkWindowInfoToken() Invalid token: '" + string + "'");
            return;
        }
        String string2 = string.substring(0, n);
        String string3 = string.substring(n + 1, string.length());
        if (string2.equals(qlF)) {
            kza2.qnu = Boolean.parseBoolean(string3);
        } else if (string2.equals(qlG)) {
            kza2.lnR = Integer.parseInt(string3);
        } else if (string2.equals(qlH)) {
            kza2.lnS = Integer.parseInt(string3);
        } else if (string2.equals(qlI)) {
            kza2.pgs = Integer.parseInt(string3);
        } else if (string2.equals(qlJ)) {
            kza2.pgr = Integer.parseInt(string3);
        }
    }

    private String a(Color color) {
        return "[" + color.getRed() + "," + color.getGreen() + "," + color.getBlue() + "]";
    }

    private void xK(String string) {
        assert (string != null);
        this.qlR.append(string);
        this.qlR.append("\n");
    }

    private void S(String string, boolean bl) {
        this.al(string, "" + bl);
    }

    private void a(String string, Color color) {
        assert (color != null);
        this.al(string, this.a(color));
    }

    private void X(String string, int n) {
        this.al(string, "" + n);
    }

    private void a(String string, long l2) {
        this.al(string, "" + l2);
    }

    private void al(String string, String string2) {
        assert (string != null);
        assert (string2 != null);
        this.qlR.append(string);
        this.qlR.append("=");
        this.qlR.append(string2);
        this.qlR.append("\n");
    }

    private Color xL(String string) {
        StringTokenizer stringTokenizer = new StringTokenizer(string, "[,]", false);
        if (stringTokenizer.countTokens() != 3) {
            return null;
        }
        String string2 = null;
        int[] nArray = new int[3];
        int n = 0;
        while (stringTokenizer.hasMoreTokens()) {
            string2 = stringTokenizer.nextToken();
            nArray[n] = new Integer(string2);
            ++n;
        }
        return new Color(nArray[0], nArray[1], nArray[2]);
    }
}

