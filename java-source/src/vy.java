/*
 * Decompiled with CFR.
 */
public class vy
extends bzy {
    public boolean aYp = false;
    public short aYq = 0;
    public int aYr = 0;

    @Override
    public final bzx vI() {
        assert (false);
        return null;
    }

    public static vy a(bzs bzs2) {
        vy vy2 = new vy();
        vy2.GUID = bzs2.GUID;
        vy2.ResourceType = bzs2.ResourceType;
        vy2.aYp = bzs2.aYp;
        vy2.aYq = lbc.mV(bzs2.edX);
        vy2.aYr = bzs2.aYr;
        return vy2;
    }

    public static bzs a(vy vy2) {
        bzs bzs2 = new bzs();
        bzs2.GUID = vy2.GUID;
        bzs2.ResourceType = vy2.ResourceType;
        bzs2.aYp = vy2.aYp;
        bzs2.edX = lbc.j(vy2.aYq);
        bzs2.aYr = vy2.aYr;
        return bzs2;
    }

    public boolean b(bzs bzs2) {
        if (!bzs2.GUID.equals(this.GUID)) {
            return false;
        }
        if (bzs2.ResourceType != this.ResourceType) {
            return false;
        }
        if (bzs2.aYp != this.aYp) {
            return false;
        }
        float f2 = lbc.j(this.aYq);
        if (Math.abs(f2 - bzs2.edX) > 0.001f) {
            return false;
        }
        return bzs2.aYr == this.aYr;
    }

    public final vy vJ() {
        assert (this.GUID != null);
        vy vy2 = new vy();
        vy2.GUID = this.GUID;
        vy2.ResourceType = this.ResourceType;
        vy2.aYp = this.aYp;
        vy2.aYq = this.aYq;
        vy2.aYr = this.aYr;
        return vy2;
    }
}

