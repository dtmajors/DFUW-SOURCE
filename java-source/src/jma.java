/*
 * Decompiled with CFR.
 */
import java.util.Collection;
import java.util.Set;

public class jma {
    public final String nuF;
    public final jmd nuG;
    private final Set<String> nuH;
    private final Set<String> nuI;

    public jma(String string, jmd jmd2, Collection<String> collection, Collection<String> collection2) {
        this.nuF = string;
        this.nuG = jmd2;
        if (collection == null || collection.isEmpty()) {
            this.nuH = null;
        } else {
            this.nuH = lcn.emx();
            this.nuH.addAll(collection);
        }
        if (collection2 == null || collection2.isEmpty()) {
            this.nuI = null;
        } else {
            this.nuI = lcn.emx();
            this.nuI.addAll(collection);
        }
    }
}

