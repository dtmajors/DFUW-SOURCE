/*
 * Decompiled with CFR.
 */
import java.util.List;

public class hvs
extends btk
implements bto {
    private List<hvr> lfY = lcn.emv();
    private List<hvr> lgk = lcn.emv();
    private List<hvr> lgl = lcn.emv();
    private boolean lga = false;

    @Override
    public void initialize() {
        super.initialize();
        for (hvr hvr2 : this.lfY) {
            hvr2.az(this.MessageDelegator.arc());
        }
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        for (hvr hvr2 : this.lfY) {
            hvr2.aA(this.MessageDelegator.arc());
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        this.lga = true;
        for (hvr hvr2 : this.lfY) {
            hvr2.doTick(ldz2);
        }
        this.lga = false;
        if (!this.lgk.isEmpty()) {
            this.lfY.addAll(this.lgk);
            this.lgk.clear();
        }
        if (!this.lgl.isEmpty()) {
            this.lfY.removeAll(this.lgl);
            this.lgl.clear();
        }
    }

    public void a(hvr hvr2) {
        if (!this.lga) {
            this.lfY.add(hvr2);
        } else {
            if (this.lgk == null) {
                this.lgk = lcn.emv();
            }
            this.lgk.add(hvr2);
        }
        if (this.isInitialized()) {
            hvr2.az(this.MessageDelegator.arc());
        }
    }

    public void b(hvr hvr2) {
        if (!this.lga) {
            this.lfY.remove(hvr2);
        } else {
            if (this.lgl == null) {
                this.lgl = lcn.emv();
            }
            this.lgl.add(hvr2);
        }
        if (this.isInitialized()) {
            hvr2.aA(this.MessageDelegator.arc());
        }
    }
}

