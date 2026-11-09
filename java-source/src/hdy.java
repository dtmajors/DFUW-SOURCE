/*
 * Decompiled with CFR.
 */
import java.util.List;

public class hdy
extends hdz {
    public hdy(hdw hdw2, alc.a a2) {
        super(null, ldv.rfe, hdw2);
        this.brQ = a2;
        this.kba = false;
    }

    public boolean a(hdy hdy2) {
        return this.kaW.c(hdy2.kaW) && this.brQ == hdy2.brQ;
    }

    @Override
    protected lip cee() {
        return this.kaW.cdY();
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof hdy) {
            return this.a((hdy)object);
        }
        assert (false);
        return super.equals(object);
    }

    @Override
    protected void aU(List<heh> list) {
        assert (lda.by(list));
    }
}

