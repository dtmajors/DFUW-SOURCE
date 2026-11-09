/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  mnl
 */
public class mno
implements Runnable {
    private static final long DQg = 10L;
    private mnl DQh = null;
    private Thread DQi = null;
    private long DQj = 0L;
    private long DQk = 0L;
    private volatile boolean DQl = false;
    private volatile long DQm = 0L;
    private volatile long DQn = 0L;
    private volatile boolean DQo = false;

    mno(mnl mnl2, long l, long l2) {
        this.DQh = mnl2;
        this.DQj = l;
        this.DQk = l2;
    }

    public void zB(boolean bl) {
        this.DQl = bl;
        if (this.DQl) {
            this.DQn = this.DQk;
        } else {
            this.DQm = this.DQj;
        }
    }

    public void start() {
        if (this.DQh != null && this.DQi == null) {
            this.DQi = new Thread(this);
            this.DQi.setName(this.getClass().getSimpleName() + "::TimerThread");
            this.DQi.start();
            this.DQn = this.DQk;
            this.DQm = this.DQj;
        }
    }

    public void stop() {
        if (this.DQi != null) {
            this.DQo = true;
            while (this.DQo) {
                try {
                    Thread.sleep(10L);
                }
                catch (InterruptedException interruptedException) {}
            }
            this.DQi = null;
        }
    }

    @Override
    public void run() {
        long l = System.currentTimeMillis();
        while (!this.DQo) {
            long l2 = System.currentTimeMillis();
            long l3 = l2 - l;
            l = l2;
            if (this.DQl) {
                this.DQn -= l3;
                if (this.DQn <= 0L) {
                    this.DQh.eGr();
                }
            } else {
                this.DQm -= l3;
                if (this.DQm <= 0L) {
                    this.DQh.eGq();
                }
            }
            try {
                Thread.sleep(10L);
            }
            catch (InterruptedException interruptedException) {}
        }
        this.DQo = false;
    }
}

