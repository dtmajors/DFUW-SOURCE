/*
 * Decompiled with CFR.
 */
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ibx
extends ibs {
    private jns lGH;
    private List<ibs> lGI;
    private static int lGJ = 7709745;
    private static int lGK = 0xC72C2C;

    public ibx(jns jns2, ics ics2, int n) {
        super(jns2.dNZ().wp(), ics2, ibx.a(jns2, n));
        this.lGH = jns2;
        jns[] jnsArray = this.lGH.dOf();
        if (jnsArray != null && jnsArray.length > 0) {
            this.lGI = lcn.emv();
            for (jns jns3 : jnsArray) {
                ibx ibx2 = new ibx(jns3, ics2, n);
                ibx2.b(this);
                this.lGI.add(ibx2);
            }
            Collections.sort(this.lGI, new Comparator<ibs>(this){
                final /* synthetic */ ibx lGL;
                {
                    this.lGL = ibx2;
                }

                public int a(ibs ibs2, ibs ibs3) {
                    return ibs2.cNq().getIdentifier().compareTo(ibs3.cNq().getIdentifier());
                }

                public /* synthetic */ int compare(Object object, Object object2) {
                    return this.a((ibs)object, (ibs)object2);
                }
            });
        }
    }

    @Override
    public String getId() {
        return this.lGH.toString();
    }

    public jns cNB() {
        return this.lGH;
    }

    @Override
    public List<ibs> getChildren() {
        return this.lGI != null ? Collections.unmodifiableList(this.lGI) : null;
    }

    @Override
    public boolean hasChildren() {
        return this.lGI != null && !this.lGI.isEmpty();
    }

    public boolean d(auk auk2) {
        return false;
    }

    @Override
    public boolean d(jmz jmz2) {
        if (jmz2 instanceof jnb) {
            return this.lGH == ((jnb)jmz2).dMV();
        }
        return false;
    }

    @Override
    public boolean cNv() {
        return this.lGH.isVisible();
    }

    public boolean cNz() {
        return false;
    }

    public String toString() {
        return "SFNotificationChatChannel [" + this.lGH.toString() + "]";
    }

    private static int a(jns jns2, int n) {
        if (jns2 == jns.a(jnt.nEA, jnt.nFa, jnt.nFc)) {
            return lGJ;
        }
        if (jns2 == jns.a(jnt.nEA, jnt.nFa, jnt.nFd)) {
            return lGJ;
        }
        if (jns2 == jns.a(jnt.nEA, jnt.nEP, jnt.nFe)) {
            return lGJ;
        }
        if (jns2 == jns.a(jnt.nEA, jnt.nEP, jnt.nFf)) {
            return lGK;
        }
        if (jns2 == jns.a(jnt.nEA, jnt.nEZ, jnt.nFc)) {
            return lGJ;
        }
        if (jns2 == jns.a(jnt.nEA, jnt.nEZ, jnt.nFd)) {
            return lGK;
        }
        if (jns2 == jns.a(jnt.nEA, jnt.nFb, jnt.nFc)) {
            return lGJ;
        }
        if (jns2 == jns.a(jnt.nEA, jnt.nFb, jnt.nFd)) {
            return lGK;
        }
        if (jns2 == jns.a(jnt.nEA, jnt.nEY, jnt.nFe)) {
            return lGJ;
        }
        if (jns2 == jns.a(jnt.nEA, jnt.nEY, jnt.nFf)) {
            return lGK;
        }
        return n;
    }
}

