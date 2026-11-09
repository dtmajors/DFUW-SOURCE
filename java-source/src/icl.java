/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class icl
extends isq {
    public icl() {
        this.sq(true);
    }

    @Override
    public void dA(int n, int n2) {
        super.dA(n, n2);
        this.djE().b("setupChannelCommandInput", new Object[]{this.getId(), icl.cNQ()});
    }

    @Override
    public boolean a(int n, int n2, hzk hzk2, ifg ifg2) {
        hwm hwm2;
        return ifg2 instanceof ifh && ((hwm2 = ((ifh)ifg2).cQm()) instanceof hwo || hwm2 instanceof hwv);
    }

    @Override
    public boolean b(int n, int n2, hzk hzk2, ifg ifg2) {
        String string = null;
        if (ifg2 instanceof ifh) {
            hwm hwm2 = ((ifh)ifg2).cQm();
            if (hwm2 instanceof hwo) {
                string = ibi.a(hzk2, (hwo)hwm2);
            } else if (hwm2 instanceof hwv) {
                string = ibi.a((hyn)hzk2, (hwv)hwm2);
            }
        }
        if (string != null) {
            this.rq(string);
            return true;
        }
        return false;
    }

    @Override
    public hyn pk(String string) {
        return ibi.oW(string);
    }

    public static String cNQ() {
        StringBuilder stringBuilder = new StringBuilder();
        int n = 0;
        for (ibu ibu2 : ibv.cNA()) {
            if (!ibu2.cNv() || ibu2.cNw() == null || !ibu2.cNz()) continue;
            if (n > 0) {
                stringBuilder.append("-");
            }
            stringBuilder.append(ibu2.cNw());
            ++n;
        }
        String string = stringBuilder.toString();
        return string;
    }
}

