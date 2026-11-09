/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcw
 *  nul
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.UIManager;
import spenefett.util.jni.SFJNIUtils;

public class z
extends t {
    private final ag dm = new ag(this){
        final /* synthetic */ z dC;
        {
            this.dC = z2;
        }

        public void V() {
            z.a(this.dC);
        }
    };
    private final lbn du = new lbn(this){
        final /* synthetic */ z dC;
        {
            this.dC = z2;
        }

        public final void W() {
            boolean bl = z.b(this.dC).C();
            this.dC.h(!bl);
        }
    };
    private final lbn dv = new lbn(this){
        final /* synthetic */ z dC;
        {
            this.dC = z2;
        }

        public final void W() {
            z.a(this.dC);
        }
    };
    private boolean dh = true;
    private boolean dw = true;
    private static final String dx = "worldata.xml";
    protected jsa dl;
    private lcu dy;
    ldz dz;
    double dA;
    private s dB;

    public z() {
        lcw.qHF = 3;
        lcw.qGJ = false;
        lcw.qHh = false;
        dd = true;
        UIManager.put("FileChooser.readOnly", Boolean.TRUE);
    }

    @Override
    public void a(int n, int n2, int n3, String string, ldz ldz2) {
        hbc hbc2;
        lpa.exC();
        mje.DAv = this.dB = new s();
        String string2 = SFJNIUtils.getBasePath();
        if (!string2.endsWith("\\")) {
            string2 = string2 + "\\";
        }
        lcw.qLa = string2 + "dfdata" + File.separator;
        lcw.qLb = string2 + "dfdata" + File.separator;
        lcw.qHg = false;
        this.i(true);
        int n4 = n;
        if (mje.DBw) {
            this.dB.A();
            mzx mzx2 = new mzx();
            mzx2.eTB();
        }
        kea.piz = ca.class.getName();
        nul.m(null);
        int n5 = 3;
        lcr.qww = n4 = (n2 = 3);
        ldx.enG().bN(n4);
        lcr.fQ((int)n5, (int)n2);
        lcr.rg = new ldv(n2, 1, 10);
        this.r("xml-files/config/configuration_wb.xml");
        mzv mzv2 = new mzv();
        boolean bl = mzv2.v();
        if (!bl) {
            lfn.b(4, this.getClass().getName(), "PROBLEM PARSING Worldbuilder CONFIG FILE. Saved new version.");
        }
        if (mje.PositionRenderWindow != null) {
            this.dB.setLocation(mje.PositionRenderWindow);
        }
        if (lcw.qGY) {
            lcw.yj((boolean)true);
        }
        this.c(ldz2);
        this.P();
        this.Q();
        this.N();
        lfn.b(0, "SFCentralControlUnitWorldbuilder", "initialize()");
        this.dy = new lcu(lcu.a.qEX);
        this.dB.a(this.dy);
        myo.EUr = new myn();
        myo.EUr.a(this.dB, this.dg);
        hbd.jAL = hbc2 = new hbc("xml-files/client/gui/language_mapping.xml");
        hbc2.LA(1);
        System.gc();
    }

    @Override
    public boolean a(ldz ldz2) {
        assert (ldz2 != null);
        if (this.dz == null) {
            this.dz = ldz2;
            this.dA = ldz2.rgz;
        }
        if (this.dA <= ldz2.rgz - 1.0) {
            int n = ldz2.lpr - this.dz.lpr;
            this.dz = ldz2;
            this.dA = ldz2.rgz;
            this.dB.q("Render Window |FPS[ " + n + "] " + mje.ezB());
        }
        this.d(ldz2);
        if (!mje.DBA) {
            return false;
        }
        long l = mje.DBe;
        if (l != 0L) {
            try {
                Thread.sleep(l);
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
        }
        return this.isRunning();
    }

    @Override
    protected void N() {
        lcw.qHG = "xml-files/worlddata/worldata.xml";
    }

    @Override
    public void O() {
        try {
            this.a((ldz)null);
        }
        catch (Exception exception) {
            this.a(exception);
        }
        catch (Error error) {
            this.a(error);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(Throwable throwable) {
        System.out.println("\n################################################\n");
        long l = System.currentTimeMillis();
        throwable.printStackTrace();
        String string = lcw.qLb + "CrashLog" + l + ".log";
        jrw jrw2 = new jrw(string);
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(new FileWriter(jrw2));
            throwable.printStackTrace(printWriter);
        }
        catch (IOException iOException) {
            System.out.println("Error saving to SFFile: " + jrw2.getName() + " , Exception: " + iOException);
        }
        finally {
            if (printWriter != null) {
                printWriter.close();
            }
        }
        System.out.println("\n Crashlog [" + string + "] saved. Contact your local representive. \n");
        System.out.println("################################################");
        System.exit(2);
    }

    @Override
    public boolean b(ldz ldz2) {
        if (!super.b(ldz2)) {
            return false;
        }
        this.i(false);
        myo.EUr.cleanup();
        myo.EUr = null;
        return true;
    }

    protected final boolean isRunning() {
        return this.dh;
    }

    public final ag S() {
        return this.dm;
    }

    private void U() {
        this.dh = false;
    }

    protected final void h(boolean bl) {
        this.dw = bl;
    }

    @Override
    public void c(ldz ldz2) {
        this.df = new ca();
        this.df.setStartTime(ldz2);
        new mjf();
        this.dl = new jsa();
        if (lcw.qGT) {
            new bd();
        }
        if (lcw.qOQ && !lcw.qOR) {
            new jog();
        }
    }

    @Override
    protected void d(ldz ldz2) {
        this.de.a(kea.piA, ldz2);
        this.dB.a(mje.ri ? this.dy : null);
        this.de.a(kea.piz, ldz2);
        this.de.a(kea.piF, ldz2);
        if (lcw.qGT) {
            this.de.a(kea.piD, ldz2);
        }
        if (lcw.qOQ && !lcw.qOR) {
            this.de.a(kea.piE, ldz2);
        }
    }

    private void i(boolean bl) {
        this.dB.I().a(bl, this.du);
        this.dB.K().a(bl, this.dv);
    }

    static /* synthetic */ void a(z z2) {
        z2.U();
    }

    static /* synthetic */ s b(z z2) {
        return z2.dB;
    }
}

