/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import spenefett.util.jni.SFJNIUtils;

public abstract class w
extends t {
    private boolean dh = true;
    private final ag dm = new ag(this){
        final /* synthetic */ w dt;
        {
            this.dt = w2;
        }

        public void V() {
            w.a(this.dt);
        }
    };

    protected void initialize() {
        String string = SFJNIUtils.getBasePath();
        if (!string.endsWith("\\")) {
            string = string + "/";
        }
        lcw.qLa = string + "dfdata" + "/";
        lcw.qLb = string + "dfdata" + "/";
    }

    @Override
    public boolean a(ldz ldz2) {
        this.d(ldz2);
        return this.isRunning();
    }

    @Override
    public void O() {
        this.d(null);
    }

    @Override
    public boolean b(ldz ldz2) {
        return super.b(ldz2);
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

    static /* synthetic */ void a(w w2) {
        w2.U();
    }
}

