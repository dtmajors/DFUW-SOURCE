/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bz
 *  lcw
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class t {
    public static boolean dd = true;
    protected kea de = kea.dVE();
    protected static final lfo ct = new lfo("MB");
    protected bz df = null;
    protected kfk dg = null;

    public t() {
        lfn.eqw().a(loi.exd());
    }

    public void a(dxq dxq2) {
        if (this.df != null) {
            this.df.b(dxq2);
        }
    }

    public dxq d(int n) {
        if (this.df != null) {
            return this.df.d(n);
        }
        return null;
    }

    public void a(int n, int n2, int n3, String string, ldz ldz2) {
        lfn.b(5, this.getClass().getSimpleName(), "initialize() : DO NOT CALL HERE.");
        assert (false);
    }

    public abstract boolean a(ldz var1);

    public boolean b(ldz ldz2) {
        return this.de.dVF();
    }

    protected void r(String string) {
        boolean bl = false;
        jth jth2 = new jth();
        if (string == null) {
            lfn.b(0, this.getClass().getName(), "parseConfigValues() : Config Filename == null. Parsing default config file");
            bl = jth2.v();
        } else {
            bl = jth2.b(string);
        }
        if (!bl) {
            lfn.b(5, this.getClass().getName(), "Config SFFile [<install-dir>" + string + "] could not be parsed.");
            assert (false);
        }
    }

    protected void a(List<kdw> list, String string, int n) {
        List<kdw> list2 = this.de.W(string, n);
        if (list != null && list2 != null) {
            list.addAll(list2);
        } else {
            lfn.b(0, this.getClass().getName(), "requestModule() : ModuleList is null for: " + kea.piz);
        }
    }

    protected void N() {
    }

    public void O() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void P() {
        ArrayList<kdw> arrayList;
        block10: {
            if (lcw.qHF == 3) {
                kea.piz = ca.class.getName();
            }
            arrayList = lcn.emv();
            try {
                this.a(arrayList, kea.piz, 1);
                if (!lcw.enf()) {
                    if (lcw.qGT) {
                        this.a(arrayList, kea.piD, 1);
                    }
                    if (lcw.qOQ && !lcw.qOR) {
                        this.a(arrayList, kea.piB, 1);
                    }
                    if (lcw.qHF == 3) {
                        this.a(arrayList, kea.piF, 1);
                    }
                    break block10;
                }
                if (lcw.emZ()) {
                    // empty if block
                }
            }
            catch (Exception exception) {
                throw new bs(exception);
            }
        }
        lfn.print("\n-###################### Requested Modules returned START #################-");
        Iterator iterator = arrayList.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                lfn.print("\n-###################### Requested Modules returned END ##################-\n");
                return;
            }
            kdw kdw2 = (kdw)iterator.next();
            lfn.print(kdw2.dVu().getName());
        }
    }

    protected abstract void c(ldz var1);

    protected void Q() {
        kee kee2;
        this.de.d(kea.piA, kea.piz, 7, 2);
        key key2 = (key)this.de.d("", kea.piz, 216, 2);
        if (key2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "setupPipes() : Native2Java ResponsePipe is null.");
            throw new bs("Pipe is null!");
        }
        keo keo2 = (keo)this.de.d(kea.piz, "", 116, 2);
        if (keo2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "setupPipes() : Java2Native RequestPipe is null.");
            throw new bs("Pipe is null!");
        }
        this.de.d("", kea.piz, 218, 2);
        this.de.d(kea.piz, "", 123, 2);
        this.de.d(kea.piA, kea.piz, 27, 2);
        this.de.d(kea.piz, kea.piA, 30, 2);
        this.de.d(kea.piA, kea.piz, 12, 2);
        if (lcw.qHF != 3) {
            kee2 = (kel)this.de.d(kea.piz, "", 117, 2);
            assert (kee2 != null);
            this.de.d(kea.piz, "", 118, 2);
            this.de.d("", kea.piz, 217, 2);
            this.de.d("", kea.piz, 219, 2);
            this.de.d("", kea.piz, 225, 2);
        }
        if (!lcw.enf()) {
            kee kee3;
            if (lcw.qOQ && !lcw.qOR) {
                this.de.d(kea.piE, kea.piz, 22, 2);
                this.de.d(kea.piz, kea.piE, 22, 2);
            }
            if (lcw.qOQ && !lcw.qOR && !lcw.enf()) {
                kee2 = (kfl)this.de.d(kea.piz, kea.piB, 12, 2);
                assert (kee2 != null);
                kee3 = (kfl)this.de.d(kea.piB, kea.piz, 12, 2);
                assert (kee3 != null);
                kee kee4 = this.de.d(kea.piB, kea.piz, 21, 2);
                assert (kee4 != null);
                kee kee5 = this.de.d(kea.piz, kea.piB, 34, 2);
                assert (kee5 != null);
                this.de.d(kea.piA, kea.piB, 30, 2);
                this.de.d(kea.piB, kea.piA, 30, 2);
            }
            if (!lcw.qOR && (kee2 = (kek)this.de.d("", kea.piE, 126, 2)) == null) {
                lfn.b(5, this.getClass().getSimpleName(), "setupPipes() : IRP or J2N_IRP is null!");
                assert (false);
                throw new bs("Pipe is null!");
            }
            if (lcw.qOR && (kee2 = (kek)this.de.d(kea.piz, "", 126, 2)) == null) {
                lfn.b(5, this.getClass().getSimpleName(), "setupPipes() : IRP or J2N_IRP is null!");
                assert (false);
                throw new bs("Pipe is null!");
            }
            if (!lcw.qOR && (kee2 = (keu)this.de.d("", kea.piE, 221, 2)) == null) {
                lfn.b(5, this.getClass().getSimpleName(), "setupPipes() : IRP or N2J_IRP is null!");
                assert (false);
                throw new bs("Pipe is null!");
            }
            if (lcw.qOR && (kee2 = (keu)this.de.d("", kea.piz, 221, 2)) == null) {
                lfn.b(5, this.getClass().getSimpleName(), "setupPipes() : IRP or N2J_IRP is null!");
                assert (false);
                throw new bs("Pipe is null!");
            }
            if (lcw.qOQ && !lcw.qOR && lcw.qHF != 3 && (kee2 = (kep)this.de.d("", kea.piB, 127, 2)) == null) {
                lfn.b(5, this.getClass().getSimpleName(), "setupPipes() : IRP or J2N_IRP is null!");
                assert (false);
                throw new bs("Pipe is null!");
            }
            if (lcw.qOQ && lcw.qOR && (kee2 = (kep)this.de.d(kea.piz, "", 127, 2)) == null) {
                lfn.b(5, this.getClass().getSimpleName(), "setupPipes() : IRP or J2N_IRP is null!");
                assert (false);
                throw new bs("Pipe is null!");
            }
            if (lcw.qOQ && !lcw.qOR && lcw.qHF != 3 && (kee2 = (kez)this.de.d("", kea.piB, 222, 2)) == null) {
                lfn.b(5, this.getClass().getSimpleName(), "setupPipes() : IRP or N2J_IRP is null!");
                assert (false);
                throw new bs("Pipe is null!");
            }
            if (lcw.qOQ && lcw.qOR && (kee2 = (kez)this.de.d("", kea.piz, 222, 2)) == null) {
                lfn.b(5, this.getClass().getSimpleName(), "setupPipes() : IRP or N2J_IRP is null!");
                assert (false);
                throw new bs("Pipe is null!");
            }
            kee2 = (ken)this.de.d(kea.piz, "", 125, 2);
            if (kee2 == null) {
                lfn.b(5, this.getClass().getName(), "JavaToNative RenderRequestPipe is null!!");
            }
            if ((kee2 = (kex)this.de.d("", kea.piz, 220, 2)) == null) {
                lfn.b(5, this.getClass().getName(), "RenderResponsePipe RenderModule <-- Native Render Module is null!");
                assert (false);
                throw new bs("Pipe is null!");
            }
            if (lcw.qOQ && !lcw.qOR) {
                kee2 = this.de.d(kea.piB, kea.piz, 38, 2);
                assert (kee2 != null) : "*MB* see spam above";
                kee3 = this.de.d(kea.piz, kea.piB, 39, 2);
                assert (kee3 != null) : "*MB* see spam above";
            }
            if (lcw.qGU && lcw.enb()) {
                if (lcw.qGW) {
                    this.de.d("", kea.piz, 50, 2);
                    this.de.d(kea.piz, "", 50, 2);
                }
                if (lcw.qGV) {
                    this.de.d("", kea.piz, 51, 2);
                    this.de.d(kea.piz, "", 51, 2);
                }
            }
            if (lcw.qHF == 3) {
                this.de.d(kea.piF, kea.piz, 12, 2);
                this.de.d(kea.piF, kea.piz, 301, 2);
                this.de.d(kea.piz, kea.piF, 301, 2);
                this.de.d(kea.piz, kea.piF, 28, 2);
                this.dg = (kfk)this.de.d("", kea.piz, 22, 2);
            }
        }
        if (!lcw.enf() || !lcw.emZ()) {
            // empty if block
        }
        if ((kee2 = (kej)this.de.d(kea.piz, "", 129, 2)) == null) {
            lfn.b(5, this.getClass().getSimpleName(), "setupPipes() : AIReqPipe or J2N_AIReqPipe is null!");
            assert (false);
            throw new bs("Pipe is null!");
        }
        kee2 = (kes)this.de.d("", kea.piz, 224, 2);
        if (kee2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "setupPipes() : AIResPipe or N2J_AIResPipe is null!");
            assert (false);
            throw new bs("Pipe is null!");
        }
    }

    protected abstract void d(ldz var1);

    public bz R() {
        return this.df;
    }

    public boolean a(kdw.a a2) {
        return this.de.e(a2);
    }

    public void b(kdw.a a2) {
        this.de.d(a2);
    }
}

