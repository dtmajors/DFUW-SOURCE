/*
 * Decompiled with CFR.
 */
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class it {
    final aht ahf;
    public final ik Rc;
    public long ahg;
    private int[] ahh = null;
    private int[] ahi = null;
    public int[] ahj = null;
    public boolean ahk = false;
    private boolean ahl = false;
    private static Set<Integer> ahm = lcn.emH();

    private void nt() {
        gm gm2 = this.Rc.nk();
    }

    it(aht aht2, ik ik2, boolean bl, Collection<Integer> collection, Collection<Integer> collection2, long l) {
        this.ahf = aht2;
        this.Rc = ik2;
        if (collection != null && !collection.isEmpty()) {
            this.ahh = it.a(this.ahh, collection);
        }
        if (collection2 != null && !collection2.isEmpty()) {
            this.ahi = it.a(this.ahi, collection2);
        }
        this.ahl = bl;
        this.ahg = l;
    }

    it(aht aht2, ik ik2) {
        this.ahf = aht2;
        this.Rc = ik2;
        this.ahg = 0L;
    }

    private static int[] a(int[] nArray, int n) {
        if (nArray == null) {
            return null;
        }
        int n2 = Arrays.binarySearch(nArray, n);
        if (n2 < 0) {
            return nArray;
        }
        if (nArray.length == 1) {
            return null;
        }
        int[] nArray2 = new int[nArray.length - 1];
        int n3 = 0;
        for (int i = 0; i < nArray.length; ++i) {
            if (i == n2) continue;
            nArray2[n3++] = nArray[i];
        }
        return nArray2;
    }

    private static int[] a(int[] nArray, int[] nArray2) {
        if (nArray == null) {
            nArray = (int[])nArray2.clone();
        } else {
            int n;
            ahm.clear();
            int n2 = nArray2.length;
            for (n = 0; n < n2; ++n) {
                ahm.add(nArray2[n]);
            }
            n2 = nArray.length;
            for (n = 0; n < n2; ++n) {
                ahm.add(nArray[n]);
            }
            nArray = new int[ahm.size()];
            n = 0;
            for (Integer n3 : ahm) {
                nArray[n++] = n3;
            }
        }
        return nArray;
    }

    private static int[] a(int[] nArray, Collection<Integer> collection) {
        int n;
        if (collection.isEmpty()) {
            return nArray;
        }
        ahm.clear();
        ahm.addAll(collection);
        if (nArray != null) {
            int n2 = nArray.length;
            for (n = 0; n < n2; ++n) {
                ahm.add(nArray[n]);
            }
        }
        nArray = new int[ahm.size()];
        n = 0;
        for (Integer n3 : ahm) {
            nArray[n++] = n3;
        }
        return nArray;
    }

    public void b(int[] nArray) {
        this.ahi = it.a(this.ahi, nArray);
    }

    public void cq(int n) {
        this.b(new int[]{n});
    }

    public void a(Collection<Integer> collection) {
        this.ahi = it.a(this.ahi, collection);
    }

    public void c(int[] nArray) {
        this.ahh = it.a(this.ahh, nArray);
    }

    public void cr(int n) {
        this.c(new int[]{n});
    }

    public void b(Collection<Integer> collection) {
        this.ahh = it.a(this.ahh, collection);
    }

    public boolean cs(int n) {
        if (!this.nu()) {
            return false;
        }
        int n2 = this.ahj.length;
        for (int i = 0; i < n2; ++i) {
            if (this.ahj[i] != n) continue;
            return true;
        }
        return false;
    }

    public void ct(int n) {
        this.ahj = it.a(this.ahj, new int[]{n});
    }

    public void c(Collection<uk> collection) {
        if (!this.nu() || collection.isEmpty()) {
            return;
        }
        Iterator<uk> iterator = collection.iterator();
        while (iterator.hasNext()) {
            uk uk2 = iterator.next();
            if (Arrays.binarySearch(this.ahj, uk2.Uo) < 0) continue;
            iterator.remove();
        }
    }

    public boolean nu() {
        return this.ahj != null && this.ahj.length > 0;
    }

    public void cu(int n) {
        this.ahj = it.a(this.ahj, n);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[StateObject=");
        stringBuilder.append(this.ahf.getGUID());
        stringBuilder.append("(");
        stringBuilder.append(amh.gL(this.ahf.getObjectType()));
        stringBuilder.append(")");
        stringBuilder.append(", Subscriber=");
        stringBuilder.append(this.Rc.GUID);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public boolean nv() {
        return this.ahl;
    }

    public void V(boolean bl) {
        this.ahl = bl;
    }

    private int[] a(Set<Integer> set) {
        int[] nArray = new int[set.size()];
        int n = 0;
        for (Integer n2 : set) {
            nArray[n++] = n2;
        }
        return nArray;
    }

    public int[] nw() {
        return this.ahh;
    }

    public int[] nx() {
        return this.ahi;
    }
}

