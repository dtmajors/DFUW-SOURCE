/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Map;

public class dei
extends btk {
    private List gfk = null;
    private List gfl = null;
    private static final ljq gfm = new ljq(0.0f, 0.0f, -1.0f);

    @Override
    public void initialize() {
        super.initialize();
        this.bkG();
    }

    public eh a(ljq ljq2, lgl lgl2, ljq ljq3, ldv ldv2) {
        eh eh2;
        if (ldv2 == null) {
            return null;
        }
        bvd bvd2 = (bvd)this.MessageDelegator.bzx().bzt().d(ldv2);
        if (bvd2 == null) {
            return null;
        }
        Map<String, eh> map = ei.ao(bvd2.getFileName());
        if (map == null) {
            return null;
        }
        String string = this.a(ljq2, lgl2, ljq3);
        if (string == null) {
            // empty if block
        }
        if ((eh2 = map.get(string)) == null) {
            return null;
        }
        return eh2;
    }

    private String a(ljq ljq2, lgl lgl2, ljq ljq3) {
        ljq ljq4 = lgl2.eq(gfm);
        ljq ljq5 = new ljq(ljq2);
        ljq5.et(ljq3);
        ljq5.y = 0.0f;
        ljq5.normalize();
        float f2 = ljq.u(ljq4, ljq5);
        if (f2 < 0.0f) {
            int n2 = (int)(Math.random() * (double)this.gfk.size());
            if (n2 >= this.gfk.size()) {
                n2 = this.gfk.size() - 1;
            }
            return (String)this.gfk.get(n2);
        }
        int n3 = (int)(Math.random() * (double)this.gfl.size());
        if (n3 >= this.gfl.size()) {
            n3 = this.gfl.size() - 1;
        }
        return (String)this.gfl.get(n3);
    }

    private void bkG() {
        int n2;
        this.gfk = lcn.emv();
        this.gfl = lcn.emv();
        String[] stringArray = new String[]{"AttachPoint_Target Front 01", "AttachPoint_Target Front 02", "AttachPoint_Target Front 03", "AttachPoint_Target Front 04", "AttachPoint_Target Front 05", "AttachPoint_Target Front 06", "AttachPoint_Target Front 07", "AttachPoint_Target Front 08", "AttachPoint_Target Front 09", "AttachPoint_Target Front 10"};
        String[] stringArray2 = new String[]{"AttachPoint_Target Back 01", "AttachPoint_Target Back 02", "AttachPoint_Target Back 03", "AttachPoint_Target Back 04", "AttachPoint_Target Back 05", "AttachPoint_Target Back 06", "AttachPoint_Target Back 07", "AttachPoint_Target Back 08", "AttachPoint_Target Back 09", "AttachPoint_Target Back 10"};
        for (n2 = 0; n2 < stringArray.length; ++n2) {
            this.gfk.add(stringArray[n2]);
        }
        for (n2 = 0; n2 < stringArray2.length; ++n2) {
            this.gfl.add(stringArray2[n2]);
        }
    }
}

