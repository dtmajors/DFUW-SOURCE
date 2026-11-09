/*
 * Decompiled with CFR.
 */
import java.util.Map;

public class irc
extends iqz {
    private Map<ipf, ioc> muh = lcn.emw();

    public void a(ipf ipf2, ioc ioc2) {
        this.muh.put(ipf2, ioc2);
    }

    public void X(ipf ipf2) {
        this.muh.remove(ipf2);
    }

    @Override
    public void e(ipf ipf2) {
        int n = Integer.MAX_VALUE;
        int n2 = Integer.MAX_VALUE;
        int n3 = Integer.MIN_VALUE;
        int n4 = Integer.MIN_VALUE;
        iph iph2 = (iph)ipf2;
        for (ipf ipf3 : iph2.getChildren()) {
            ioc ioc2 = this.muh.get(ipf3);
            if (!ipf3.djL() && ipf3.djP() || ioc2 == null) continue;
            int n5 = ioc2.cf - ipf3.getWidth() / 2;
            int n6 = ioc2.cg - ipf3.getHeight() / 2;
            n = Math.min(n, n5);
            n2 = Math.min(n2, n6);
            n3 = Math.max(n3, n5 + ipf3.getWidth() - 1);
            n4 = Math.max(n4, n6 + ipf3.getHeight() - 1);
        }
        if (n != Integer.MAX_VALUE) {
            ipf2.setSize(n3 - n + 1, n4 - n2 + 1);
        } else {
            ipf2.setSize(0, 0);
        }
    }

    @Override
    public void i(ipf ipf2) {
        iph iph2 = (iph)ipf2;
        int n = ipf2.getWidth() / 2;
        int n2 = ipf2.getHeight() / 2;
        for (ipf ipf3 : iph2.getChildren()) {
            ioc ioc2 = this.muh.get(ipf3);
            if (!ipf3.djL() && ipf3.djP() || ioc2 == null) continue;
            ipf3.ek(n + ioc2.cf - ipf3.getWidth() / 2, n2 + ioc2.cg - ipf3.getHeight() / 2);
        }
    }
}

