/*
 * Decompiled with CFR.
 */
import java.util.List;

public class hvn
implements hvr {
    private List<hvr> lfY = lcn.emv();
    private List<hvr> lfZ;
    private boolean lga = false;

    @Override
    public void az(ldz ldz2) {
        for (hvr hvr2 : this.lfY) {
            hvr2.az(ldz2);
        }
    }

    @Override
    public void aA(ldz ldz2) {
        for (hvr hvr2 : this.lfY) {
            hvr2.aA(ldz2);
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        this.lga = true;
        for (hvr hvr2 : this.lfY) {
            hvr2.doTick(ldz2);
        }
        if (this.lfZ != null) {
            for (hvr hvr2 : this.lfZ) {
                this.lfY.remove(hvr2);
            }
            this.lfZ = null;
        }
        this.lga = false;
    }

    public void a(hvr hvr2) {
        this.lfY.add(hvr2);
    }

    public void b(hvr hvr2) {
        if (!this.lga) {
            this.lfY.remove(hvr2);
        } else {
            if (this.lfZ == null) {
                this.lfZ = lcn.emv();
            }
            this.lfZ.add(hvr2);
        }
    }
}

