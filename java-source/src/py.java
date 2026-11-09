/*
 * Decompiled with CFR.
 */
import java.util.IdentityHashMap;
import java.util.LinkedList;

public class py<WorkerClass extends qe>
extends btk
implements bto {
    private final int aKJ;
    private final qc<WorkerClass> aKK;
    private LinkedList<fze> aKL = lcn.emA();
    private LinkedList<WorkerClass> aKM = lcn.emA();
    private IdentityHashMap<WorkerClass, fze> aKN = new IdentityHashMap();

    public py(qc<WorkerClass> qc2, int n) {
        this.aKJ = n;
        this.aKK = qc2;
    }

    public void u(fze fze2) {
        this.aKL.add(fze2);
    }

    @Override
    public void initialize() {
        super.initialize();
        this.Active = true;
    }

    @Override
    public void cleanUp() {
        if (!this.aKM.isEmpty()) {
            lfn.b(5, "SFPersistenceWorkerRequestQueue", "cleanUp: Active workers");
            assert (false);
        }
        while (!this.aKM.isEmpty()) {
            this.aKK.e((qe)this.aKM.pollFirst());
        }
        super.cleanUp();
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.aKL.isEmpty()) {
            return;
        }
        if (this.aKN.size() >= this.aKJ) {
            return;
        }
        fze fze2 = this.aKL.pollFirst();
        qe qe2 = (qe)this.aKM.pollFirst();
        if (qe2 == null) {
            qe2 = this.aKK.sl();
        }
        this.aKK.a(qe2, fze2);
        this.aKN.put(qe2, fze2);
        qe2.start();
    }

    public void i(WorkerClass WorkerClass) {
        fze fze2 = this.aKN.remove(WorkerClass);
        if (fze2 == null) {
            lfn.b(5, "SFPersistenceWorkerRequestQueue", "notifyWorkerCompleted: No request found for " + WorkerClass);
            assert (false);
            return;
        }
        fzf fzf2 = (fzf)this.MessageDelegator.h(7198, fze2.amk(), fze2.aO());
        this.MessageDelegator.b(fze2, fzf2);
        fzf2.a(fze2.uk());
        fzf2.kP(fze2.bSR());
        fzf2.aMH = ((qe)WorkerClass).getErrorMessage();
        this.aKM.add(WorkerClass);
        this.MessageDelegator.E(fzf2);
    }
}

