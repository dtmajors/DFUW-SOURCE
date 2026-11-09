/*
 * Decompiled with CFR.
 */
import java.util.List;

public class dna {
    private String gJx;
    private ldv gJy;
    private String gJz;
    private dne gJA = dne.gJZ;
    private List<dmz> gJB = lcn.emv();

    public dmz bqP() {
        for (dmz dmz2 : this.gJB) {
            if (!dmz2.isStartElement()) continue;
            return dmz2;
        }
        return null;
    }

    public dmz bqQ() {
        for (dmz dmz2 : this.gJB) {
            if (!dmz2.isEndElement()) continue;
            return dmz2;
        }
        return null;
    }

    public boolean bqR() {
        return this.bqP() != null;
    }

    public boolean bqS() {
        return this.bqQ() != null;
    }

    public final dne bqT() {
        return this.gJA;
    }

    public final void a(dne dne2) {
        this.gJA = dne2;
    }

    public final List<dmz> bqU() {
        return this.gJB;
    }

    public final void aH(List<dmz> list) {
        this.gJB = list;
    }

    public final void a(dmz dmz2) {
        this.gJB.add(dmz2);
    }

    public final String bqV() {
        return this.gJx;
    }

    public final void iP(String string) {
        this.gJx = string;
    }

    public final ldv bqW() {
        return this.gJy;
    }

    public final void nu(ldv ldv2) {
        this.gJy = ldv2;
    }

    public final String bqX() {
        return this.gJz;
    }

    public final void iQ(String string) {
        this.gJz = string;
    }
}

