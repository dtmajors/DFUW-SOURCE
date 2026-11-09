/*
 * Decompiled with CFR.
 */
import javax.swing.SwingUtilities;

public abstract class mjg {
    private Object value;
    private Thread thread;
    private a DCx;

    protected synchronized Object getValue() {
        return this.value;
    }

    private synchronized void setValue(Object object) {
        this.value = object;
    }

    public abstract Object Hv();

    public void finished() {
    }

    public void interrupt() {
        Thread thread = this.DCx.ezE();
        if (thread != null) {
            thread.interrupt();
        }
        this.DCx.clear();
    }

    public Object get() {
        Thread thread;
        while ((thread = this.DCx.ezE()) != null) {
            try {
                thread.join();
            }
            catch (InterruptedException interruptedException) {
                Thread.currentThread().interrupt();
                return null;
            }
        }
        return this.getValue();
    }

    public mjg() {
        Runnable runnable = new Runnable(this){
            final /* synthetic */ mjg DCy;
            {
                this.DCy = mjg2;
            }

            public void run() {
                this.DCy.finished();
            }
        };
        Runnable runnable2 = new Runnable(this, runnable){
            final /* synthetic */ Runnable DCz;
            final /* synthetic */ mjg DCy;
            {
                this.DCy = mjg2;
                this.DCz = runnable;
            }

            /*
             * WARNING - Removed try catching itself - possible behaviour change.
             */
            public void run() {
                try {
                    mjg.a(this.DCy, this.DCy.Hv());
                }
                finally {
                    mjg.a(this.DCy).clear();
                }
                SwingUtilities.invokeLater(this.DCz);
            }
        };
        Thread thread = new Thread(runnable2);
        this.DCx = new a(thread);
    }

    public void start() {
        Thread thread = this.DCx.ezE();
        if (thread != null) {
            thread.start();
        }
    }

    static /* synthetic */ void a(mjg mjg2, Object object) {
        mjg2.setValue(object);
    }

    static /* synthetic */ a a(mjg mjg2) {
        return mjg2.DCx;
    }
}

