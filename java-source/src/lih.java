/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class lih<BRANCH extends lii<BRANCH>> {
    private BRANCH roq;

    public final void clear() {
        this.roq = null;
    }

    public final int a(BRANCH BRANCH) {
        assert (BRANCH != null);
        int n = 1;
        while (BRANCH != null) {
            ++n;
            if (((lii)BRANCH).ros != null) {
                n += this.a(((lii)BRANCH).ros);
            }
            BRANCH = ((lii)BRANCH).rot;
        }
        return n;
    }

    public final BRANCH esr() {
        return this.roq;
    }

    public final void a(BRANCH BRANCH, BRANCH BRANCH2, BRANCH BRANCH3) {
        assert (((lii)BRANCH).ror == null);
        assert (BRANCH3 == null || ((lii)BRANCH3).ror == BRANCH2);
        ((lii)BRANCH).ror = BRANCH2;
        BRANCH BRANCH4 = this.a(BRANCH2, BRANCH3);
        if (BRANCH3 == null ? !$assertionsDisabled && BRANCH4 != null && ((lii)BRANCH4).rot != null : (BRANCH4 == null ? !$assertionsDisabled && BRANCH2 != null && BRANCH3 != ((lii)BRANCH2).ros : !$assertionsDisabled && ((lii)BRANCH4).rot != BRANCH3)) {
            throw new AssertionError();
        }
        if (BRANCH4 == null) {
            if (BRANCH2 == null) {
                ((lii)BRANCH).rot = this.roq;
                this.roq = BRANCH;
            } else {
                ((lii)BRANCH).rot = ((lii)BRANCH2).ros;
                ((lii)BRANCH2).ros = BRANCH;
            }
        } else {
            ((lii)BRANCH).rot = ((lii)BRANCH4).rot;
            ((lii)BRANCH4).rot = BRANCH;
        }
    }

    public final void b(BRANCH BRANCH) {
        Object BRANCH2 = ((lii)BRANCH).ror;
        Object BRANCH3 = this.a(BRANCH2, BRANCH);
        if (BRANCH3 == null) {
            if (BRANCH2 == null) {
                this.roq = ((lii)BRANCH).rot;
            } else {
                ((lii)BRANCH2).ros = ((lii)BRANCH).rot;
            }
        } else {
            ((lii)BRANCH3).rot = ((lii)BRANCH).rot;
        }
        ((lii)BRANCH).rot = null;
        ((lii)BRANCH).ror = null;
    }

    public final BRANCH a(BRANCH BRANCH, BRANCH BRANCH2) {
        BRANCH BRANCH3;
        assert (BRANCH2 == null || ((lii)BRANCH2).ror == BRANCH);
        BRANCH BRANCH4 = null;
        BRANCH BRANCH5 = BRANCH3 = BRANCH == null ? this.roq : ((lii)BRANCH).ros;
        while (BRANCH3 != BRANCH2 && BRANCH3 != null) {
            BRANCH4 = BRANCH3;
            BRANCH3 = ((lii)BRANCH3).rot;
        }
        if (BRANCH4 == null) {
            assert (BRANCH == null || ((lii)BRANCH).ros == BRANCH2);
        } else {
            assert (((lii)BRANCH4).rot == BRANCH2);
            assert (BRANCH2 == null || ((lii)BRANCH4).ror == ((lii)BRANCH2).ror);
        }
        return BRANCH4;
    }

    public final void a(BRANCH BRANCH, Comparator<BRANCH> comparator, boolean bl) {
        int n;
        ArrayList<BRANCH> arrayList = this.c(BRANCH);
        if (arrayList.size() == 0) {
            return;
        }
        ArrayList<lii> arrayList2 = lcn.emv();
        Iterator<BRANCH> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            lii lii2 = (lii)iterator.next();
            if (lii2 == null || lii2.ros != null) continue;
            arrayList2.add(lii2);
            iterator.remove();
        }
        Collections.sort(arrayList2, comparator);
        Collections.sort(arrayList, comparator);
        arrayList.addAll(arrayList2);
        if (BRANCH == null) {
            this.roq = (lii)arrayList.get(0);
        } else {
            ((lii)BRANCH).ros = (lii)arrayList.get(0);
        }
        for (n = 1; n < arrayList.size(); ++n) {
            ((lii)arrayList.get((int)(n - 1))).rot = (lii)arrayList.get(n);
        }
        ((lii)arrayList.get((int)(arrayList.size() - 1))).rot = null;
        if (bl) {
            for (n = 0; n < arrayList.size(); ++n) {
                this.a((BRANCH)((lii)arrayList.get(n)), comparator, bl);
            }
        }
    }

    public final ArrayList<BRANCH> c(BRANCH BRANCH) {
        BRANCH BRANCH2;
        ArrayList<BRANCH> arrayList = new ArrayList<BRANCH>();
        BRANCH BRANCH3 = BRANCH2 = BRANCH == null ? this.roq : ((lii)BRANCH).ros;
        while (BRANCH2 != null) {
            arrayList.add(BRANCH2);
            BRANCH2 = ((lii)BRANCH2).rot;
        }
        return arrayList;
    }

    public final int d(BRANCH BRANCH) {
        BRANCH BRANCH2;
        int n = 0;
        BRANCH BRANCH3 = BRANCH2 = BRANCH == null ? this.roq : ((lii)BRANCH).ros;
        while (BRANCH2 != null) {
            ++n;
            BRANCH2 = ((lii)BRANCH2).rot;
        }
        return n;
    }
}

