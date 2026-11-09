/*
 * Decompiled with CFR.
 */
import java.util.List;

public class iqw
extends iqz {
    private static iqw mua = new iqw();

    @Override
    public void e(ipf ipf2) {
        iph iph2 = (iph)ipf2;
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        List<ipf> list = iph2.getChildren();
        for (ipf ipf3 : list) {
            if (!ipf3.djO()) continue;
            if (n + ipf3.getWidth() > iph2.getWidth()) {
                n2 += n3;
                n = 0;
                n3 = 0;
            }
            n += ipf3.getWidth();
            n3 = Math.max(n3, ipf3.getHeight());
        }
        iph2.setSize(iph2.getWidth(), n2 += n3);
    }

    @Override
    public void i(ipf ipf2) {
        iph iph2 = (iph)ipf2;
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        List<ipf> list = iph2.getChildren();
        for (ipf ipf3 : list) {
            if (!ipf3.djO()) continue;
            if (n + ipf3.getWidth() > iph2.getWidth()) {
                n2 += n3;
                n = 0;
                n3 = 0;
            }
            ipf3.ek(n, n2);
            n += ipf3.getWidth();
            n3 = Math.max(n3, ipf3.getHeight());
        }
    }

    public static iqw dng() {
        return mua;
    }
}

