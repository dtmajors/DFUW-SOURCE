/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class bcb
implements Set<bca> {
    private EnumSet<bca> cTh = EnumSet.noneOf(bca.class);
    private int[] cVk = new int[0];

    @Override
    public int size() {
        if (this.cTh.isEmpty() && this.cVk.length > 0) {
            this.akY();
        }
        return this.cTh.size();
    }

    @Override
    public boolean isEmpty() {
        if (this.cTh.isEmpty() && this.cVk.length > 0) {
            this.akY();
        }
        return this.cTh.isEmpty();
    }

    public bcb() {
    }

    public bcb(Collection<? extends bca> collection) {
        this.addAll(collection);
    }

    public boolean e(bca bca2) {
        if (bca2 != null && this.cTh.add(bca2)) {
            this.akX();
            return true;
        }
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends bca> collection) {
        if (collection != null && !collection.isEmpty() && this.cTh.addAll(collection)) {
            this.akX();
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(Object object) {
        if (!(object instanceof bca)) {
            return false;
        }
        return this.d((bca)((Object)object));
    }

    public boolean d(bca bca2) {
        if (this.cTh.isEmpty() && this.cVk.length > 0) {
            this.akY();
        }
        return bca2 == null ? false : this.cTh.contains((Object)bca2);
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        if (this.cTh.isEmpty() && this.cVk.length > 0) {
            this.akY();
        }
        return collection == null || this.cTh == null || this.cTh.isEmpty() ? false : this.cTh.containsAll(collection);
    }

    @Override
    public boolean remove(Object object) {
        if (!(object instanceof bca)) {
            return false;
        }
        return this.f((bca)((Object)object));
    }

    public boolean f(bca bca2) {
        if (bca2 != null && this.cTh.remove((Object)bca2)) {
            this.akX();
            return true;
        }
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        if (collection != null && !collection.isEmpty() && this.cTh.removeAll(collection)) {
            this.akX();
            return true;
        }
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        if (collection != null && this.cTh.retainAll(collection)) {
            this.akX();
            return true;
        }
        return false;
    }

    @Override
    public void clear() {
        this.cTh.clear();
        this.akX();
    }

    @Override
    public Object[] toArray() {
        if (this.cTh.isEmpty() && this.cVk.length > 0) {
            this.akY();
        }
        return this.cTh.toArray();
    }

    @Override
    public <T> T[] toArray(T[] TArray) {
        if (this.cTh.isEmpty() && this.cVk.length > 0) {
            this.akY();
        }
        return this.cTh.toArray(TArray);
    }

    public List<Integer> akU() {
        if (this.cTh.isEmpty() && this.cVk.length > 0) {
            this.akY();
        }
        ArrayList<Integer> arrayList = lcn.emv();
        for (bca bca2 : this.cTh) {
            arrayList.add(bca2.getID());
        }
        return arrayList;
    }

    public int[] akV() {
        if (this.cTh.isEmpty() && this.cVk.length > 0) {
            this.akY();
        }
        int[] nArray = new int[this.cTh.size()];
        int n = 0;
        for (bca bca2 : this.cTh) {
            nArray[n] = bca2.getID();
            ++n;
        }
        return nArray;
    }

    public bcb akW() {
        return new bcb(this);
    }

    public void p(int[] nArray) {
        this.cTh.clear();
        for (int i = 0; i < nArray.length; ++i) {
            bca bca2 = bca.getPermissionByID(nArray[i]);
            if (bca2 == null) continue;
            this.cTh.add(bca2);
        }
    }

    private void akX() {
        if (this.cVk.length != this.cTh.size()) {
            this.cVk = new int[this.cTh.size()];
        }
        int n = 0;
        for (bca bca2 : this.cTh) {
            this.cVk[n++] = bca2.getID();
        }
    }

    private void akY() {
        this.cTh.clear();
        for (int i = 0; i < this.cVk.length; ++i) {
            this.cTh.add(bca.getPermissionByID(this.cVk[i]));
        }
    }

    public String toString() {
        String string = "";
        for (bca bca2 : this.cTh) {
            string = string + (string.isEmpty() ? "" : ",") + Integer.toString(bca2.getID());
        }
        return string;
    }

    public aye aku() {
        if (this.d(bca.cTz)) {
            return aye.cxm;
        }
        if (this.d(bca.cTy)) {
            return aye.cxl;
        }
        return aye.cxk;
    }

    @Override
    public Iterator<bca> iterator() {
        return new a(this, this.cTh.toArray(new bca[this.size()]));
    }

    public static bcb fo(String string) {
        if (string == null) {
            return null;
        }
        try {
            String[] stringArray = string.split(",");
            int[] nArray = new int[stringArray.length];
            for (int i = 0; i < stringArray.length; ++i) {
                nArray[i] = Integer.parseInt(stringArray[i]);
            }
            EnumSet<bca> enumSet = EnumSet.noneOf(bca.class);
            for (int i = 0; i < nArray.length; ++i) {
                bca bca2 = bca.getPermissionByID(nArray[i]);
                if (bca2 == null) {
                    lfn.b(5, bcb.class.getSimpleName(), "parse() : Failed to Retrieve Permission for ID!!!... ID = " + nArray[i]);
                    assert (false);
                    continue;
                }
                enumSet.add(bca2);
            }
            return new bcb(enumSet);
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
    }

    public static bcb akZ() {
        bcb bcb2 = new bcb();
        for (bca bca2 : bca.values()) {
            if (!bca2.akM() || !bca2.isVisible() || !lgp.erA().cS(lgp.erA().nextFloat())) continue;
            bcb2.e(bca2);
        }
        return bcb2;
    }

    @Override
    public /* synthetic */ boolean add(Object object) {
        return this.e((bca)((Object)object));
    }
}

