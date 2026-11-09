/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ldm<OBSERVER extends lbo>
implements lbl<OBSERVER> {
    private Collection<OBSERVER> reU;
    private Collection<OBSERVER> reV;

    public final boolean isEmpty() {
        if (this.reU == null) {
            return true;
        }
        return this.reU.size() == 0;
    }

    @Override
    public void a(boolean bl, OBSERVER OBSERVER) {
        assert (OBSERVER != null);
        assert (this.a(OBSERVER) != bl);
        if (bl) {
            if (this.reU == null) {
                this.reU = new ArrayList<OBSERVER>();
                this.reV = Collections.unmodifiableCollection(this.reU);
            }
            this.reU.add(OBSERVER);
        } else {
            this.reU.remove(OBSERVER);
        }
        assert (this.a(OBSERVER) == bl);
    }

    @Override
    public boolean a(OBSERVER OBSERVER) {
        if (this.reU == null) {
            return false;
        }
        return this.reU.contains(OBSERVER);
    }

    public final Collection<OBSERVER> enq() {
        if (this.reU == null) {
            return Collections.emptyList();
        }
        return this.reV;
    }

    public final Collection<OBSERVER> enr() {
        if (this.reU == null) {
            return Collections.emptyList();
        }
        return new ArrayList<OBSERVER>(this.reU);
    }

    public final void clear() {
        if (this.reU == null) {
            return;
        }
        this.reU.clear();
    }

    public String toString() {
        return null;
    }
}

