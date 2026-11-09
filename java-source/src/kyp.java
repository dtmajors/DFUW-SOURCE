/*
 * Decompiled with CFR.
 */
import java.util.Map;

public class kyp {
    private kyr qkM = null;
    private Map<Integer, kyo> qmi = lcn.emw();

    public kyp(kyr kyr2) {
        this.qkM = kyr2;
    }

    public boolean a(kyt kyt2) {
        assert (kyt2 != null);
        return this.qmi.containsKey(new Integer(kyt2.getPortNumber()));
    }

    public void b(kyt kyt2) {
        assert (kyt2 != null);
        Integer n = new Integer(kyt2.getPortNumber());
        if (this.qmi.containsKey(n)) {
            this.Y(5, "createSocket() A socket is already bound to port " + kyt2.getPortNumber());
            return;
        }
        kyo kyo2 = new kyo(kyt2, kyt2.getPortNumber());
        kyo2.start();
        this.qmi.put(n, kyo2);
    }

    public void eiW() {
        if (this.qmi.isEmpty()) {
            return;
        }
        for (kyo kyo2 : this.qmi.values()) {
            kyo2.stopListening();
        }
    }

    public void abk(int n) {
        Integer n2 = new Integer(n);
        kyo kyo2 = this.qmi.get(n2);
        if (kyo2 == null) {
            this.Y(5, "removeSocket() No socket was bound to port " + n);
            return;
        }
        this.qmi.remove(n2);
        kyo2.stopListening();
    }

    private void Y(int n, String string) {
        System.out.println("SFLogViewSocketManager: " + string);
    }
}

