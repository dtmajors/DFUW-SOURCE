/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class lfj {
    protected Map jFG = lcn.emw();
    protected lfn ga = lfn.eqw();

    protected void initialize() {
    }

    public void a(Integer n, Object object) {
        if (object != null) {
            if (this.jFG.containsKey(n)) {
                List list = (List)this.jFG.get(n);
                list.add(object);
            } else {
                ArrayList<Object> arrayList = lcn.emv();
                arrayList.add(object);
                this.jFG.put(n, arrayList);
            }
        }
    }

    public Object q(Integer n) {
        Object var2_2 = null;
        List list = (List)this.jFG.get(n);
        if (list != null && list.size() > 0) {
            var2_2 = list.get(0);
        }
        return var2_2;
    }

    protected void zy(String string) {
    }
}

