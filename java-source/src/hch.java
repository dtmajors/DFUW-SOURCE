/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;

public class hch
implements lbr {
    private final int jsn;
    private int bHh;
    private final List<a> euM = new ArrayList<a>();

    public hch(int n) {
        this.jsn = n;
        this.bHh = 0;
        this.euM.add(new a(this, ""));
    }

    public void clear() {
        this.euM.clear();
        this.bHh = 0;
        this.euM.add(new a(this, ""));
    }

    @Override
    public boolean a(lfu lfu2) {
        if (lfu2.eqA()) {
            this.bHh = 0;
            this.euM.clear();
            this.euM.add(new a(this, ""));
            int n = lfu2.ad("Length", 0);
            for (int i = 0; i < n; ++i) {
                String string = lfu2.aA("Item" + i, "");
                if (string.isEmpty()) continue;
                this.euM.add(new a(this, string));
            }
            return true;
        }
        lfu2.ad("Length", this.euM.size() - 1);
        for (int i = 1; i < this.euM.size(); ++i) {
            lfu2.aA("Item" + (i - 1), this.euM.get((int)i).jFI);
        }
        return false;
    }

    public void me(String string) {
        this.euM.get(this.bHh).mf(string);
    }

    public void cbW() {
        String string = this.euM.get(this.bHh).cbX();
        if (!string.equals(this.euM.get((int)this.bHh).jFI) || this.bHh != this.euM.size() - 1) {
            this.euM.add(new a(this, string));
        }
        while (this.euM.size() > this.jsn) {
            this.euM.remove(1);
        }
        this.bHh = 0;
    }

    public String LJ(int n) {
        this.bHh += n;
        while (this.bHh < 0) {
            this.bHh += this.euM.size();
        }
        while (this.bHh >= this.euM.size()) {
            this.bHh -= this.euM.size();
        }
        return this.euM.get((int)this.bHh).jFJ;
    }
}

