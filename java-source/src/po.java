/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  mt
 */
import java.util.IdentityHashMap;
import java.util.LinkedList;
import java.util.List;

public class po {
    private final mt aGX;
    private IdentityHashMap<qe, Object> aHG = new IdentityHashMap();
    private IdentityHashMap<qe, Object> aHH = new IdentityHashMap();
    private LinkedList<qe> aHI = lcn.emA();

    public po(mt mt2) {
        this.aGX = mt2;
    }

    public void g(qe qe2) {
        this.aHG.put(qe2, null);
        this.aHI.add(qe2);
    }

    public boolean sE() {
        return !this.aHI.isEmpty();
    }

    public List<qe> sF() {
        LinkedList<qe> linkedList = new LinkedList<qe>();
        linkedList.addAll(this.aHG.keySet());
        this.aHG.clear();
        this.aHH.clear();
        this.aHI.clear();
        return linkedList;
    }

    public qe sG() {
        if (this.aHI.isEmpty()) {
            return null;
        }
        qe qe2 = this.aHI.pollFirst();
        this.aHH.put(qe2, null);
        return qe2;
    }

    public void h(qe qe2) {
        assert (this.aHG.containsKey(qe2));
        assert (this.aHH.containsKey(qe2));
        qe2.reset();
        this.aHI.add(qe2);
        this.aHH.remove(qe2);
    }
}

