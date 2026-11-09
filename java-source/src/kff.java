/*
 * Decompiled with CFR.
 */
import java.util.Vector;

public class kff
extends kee {
    protected Vector<gqn> pjQ = new Vector();

    @Override
    public int dVG() {
        return 14;
    }

    public void a(gqn gqn2) {
        this.pjQ.add(gqn2);
    }

    public gqn dVW() {
        if (!this.pjQ.isEmpty()) {
            return this.pjQ.remove(0);
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return this.pjQ.isEmpty();
    }
}

