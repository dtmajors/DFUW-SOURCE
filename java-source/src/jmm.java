/*
 * Decompiled with CFR.
 */
public final class jmm
implements Comparable<jmm> {
    private final String Name;
    private final jmp nyJ;
    private final jml iMf;

    public jmm(String string, jmp jmp2, jml jml2) {
        this.Name = string;
        this.nyJ = jmp2;
        this.iMf = jml2;
    }

    public final String getIdentifier() {
        return this.Name;
    }

    public final jmp dME() {
        return this.nyJ;
    }

    public final String getName() {
        return this.Name;
    }

    public final jml dMF() {
        return this.iMf;
    }

    public final boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (!(object instanceof jmm)) {
            return false;
        }
        return this.a((jmm)object) == 0;
    }

    public final int a(jmm jmm2) {
        if (jmm2 == null) {
            return 1;
        }
        return this.getIdentifier().compareTo(jmm2.getIdentifier());
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.a((jmm)object);
    }
}

