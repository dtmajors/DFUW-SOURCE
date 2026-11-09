/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.Iterator;

public class mso {
    private ArrayList<msp> Eus = new ArrayList();

    public void b(msp msp2) {
        if (this.Eus.size() < 2) {
            this.Eus.add(msp2);
            System.out.println("Originator: Saving to Memento." + this.Eus.size());
        } else {
            this.Eus.remove(0);
            this.Eus.add(msp2);
            System.out.println("Originator: Saving to Memento." + this.Eus.size());
        }
    }

    public void c(msp msp2) {
        this.Eus.remove(msp2);
    }

    public msp afv(int n) {
        return this.Eus.get(n);
    }

    public msp eNY() {
        if (this.Eus.size() > 0) {
            return this.Eus.get(this.Eus.size() - 1);
        }
        return null;
    }

    public boolean d(msp msp2) {
        boolean bl = false;
        Iterator<msp> iterator = this.Eus.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().eNZ().adk != msp2.eNZ().adk) continue;
            bl = true;
        }
        return bl;
    }
}

