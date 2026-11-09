/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dtc
 */
import java.util.Map;
import java.util.StringTokenizer;

public class kzy
extends ley {
    public static final String qqh = "PD";
    public static final String qqi = ";";
    public static final String qqj = "#";
    public static final int qqk = 1;
    private int qql = 0;
    private dtc agw = null;

    public kzy(int n, int n2) {
        super(n, n2);
    }

    public kzy(int n, int n2, dtc dtc2) {
        super(n);
        this.qql = n2;
        this.agw = dtc2;
        assert (this.qql > 0);
        assert (this.agw != null);
    }

    public final void ekR() {
        if (this.rjZ.isEmpty()) {
            return;
        }
        String string = null;
        String string2 = null;
        for (int i2 = 0; i2 < this.rjZ.size(); ++i2) {
            string = ((String)this.rjZ.get(i2)).trim();
            string2 = this.yt(string);
            if (string2.equals(qqh)) {
                this.yu(string.substring(qqh.length(), string.length()));
                continue;
            }
            this.Y(5, "checkReceivedMessages() Message has invalid messagetype: '" + string2 + "'");
        }
        this.rjZ.clear();
    }

    private String yt(String string) {
        int n = string.indexOf(qqj);
        if (n < 0) {
            return string;
        }
        return string.substring(0, n);
    }

    public final void aa(int n, String string) {
        StringBuilder stringBuilder = new StringBuilder(qqh);
        stringBuilder.append(qqj);
        stringBuilder.append(n);
        stringBuilder.append(qqj);
        stringBuilder.append(string);
        String string2 = stringBuilder.toString();
        this.debug("sendPaperdollMessage() Sending: " + string2);
        this.sendMessage(string2);
    }

    private void yu(String string) {
        StringTokenizer stringTokenizer = new StringTokenizer(string, qqj, false);
        int n = Integer.parseInt(stringTokenizer.nextToken());
        String string2 = stringTokenizer.nextToken();
        if (n <= 0) {
            this.Y(5, "handlePaperdollMessage() ResourceType is invalid.");
            return;
        }
        if (string2 == null || string2.trim().equals("")) {
            this.Y(5, "handlePaperdollMessage() FileName is null.");
            return;
        }
        Map<can, cam> map = lea.ack(n);
        if (map == null) {
            this.Y(5, "handlePaperdollMessage() No PaperdollItemMap is mapped to resourcetype '" + lea.enW().getName(n) + "'");
            return;
        }
        map.clear();
        this.debug("handlePaperdollMessage() Reloading file '" + string2 + "' for resource '" + lea.enW().getName(n) + "'");
        try {
            String string3 = "xml-files/common/paperdoll/" + string2;
            kae kae2 = new kae();
            kae2.f(string3, map);
        }
        catch (bg bg2) {
            // empty catch block
        }
    }
}

