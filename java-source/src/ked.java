/*
 * Decompiled with CFR.
 */
import java.util.List;

public class ked
extends kee {
    protected List<Object> fu = lcn.emA();

    @Override
    public int dVG() {
        return 2;
    }

    public void p(Object object) {
        if (!this.bdP) {
            this.fu.add(object);
        }
    }

    public Object getObject() {
        if (this.fu.isEmpty()) {
            return null;
        }
        return this.fu.remove(0);
    }

    @Override
    public boolean isEmpty() {
        return this.fu.isEmpty();
    }
}

