/*
 * Decompiled with CFR.
 */
import java.util.Map;

public class igg
extends ige {
    private cut lSq;

    public igg(ljq ljq2, int n) {
        super(ljq2);
        Map<cut, cus> map = lea.yq(false);
        for (Map.Entry<cut, cus> entry : map.entrySet()) {
            if (entry.getKey().fyj != n) continue;
            this.lSq = entry.getKey();
            break;
        }
    }

    public cut cTe() {
        return this.lSq;
    }
}

