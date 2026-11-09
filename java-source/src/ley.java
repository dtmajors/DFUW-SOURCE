/*
 * Decompiled with CFR.
 */
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.List;

public class ley
extends Thread {
    public static final int rjS = 0x400000;
    public static final int rjT = 0x400000;
    private DatagramSocket rjU = null;
    private boolean rjV = false;
    private String ejK = this.getClassName();
    private int rjW = 0;
    private int qog = 0;
    private boolean rjX = true;
    private int rjY = 0;
    protected List rjZ = null;

    public ley(int n, int n2) {
        this.rjV = true;
        this.rjW = n;
        this.qog = n2;
    }

    public ley(int n) {
        this.rjV = false;
        this.rjY = n;
        this.rjZ = lcn.emv();
    }

    protected final void debug(String string) {
        this.Y(0, string);
    }

    protected final void Y(int n, String string) {
        lfn.b(n, this.ejK, string);
    }

    private String getClassName() {
        String string = this.getClass().getName();
        string = string.substring(string.lastIndexOf(46) + 1, string.length());
        return string;
    }

    public final void bind() {
        assert (this.rjV);
        try {
            this.rjU = new DatagramSocket(this.rjW);
            this.rjU.setSendBufferSize(0x400000);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public final void close() {
        try {
            this.rjU.close();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public final void sendMessage(String string) {
        assert (this.rjV);
        byte[] byArray = string.getBytes();
        this.f(byArray);
    }

    protected final void f(byte[] byArray) {
        assert (this.rjV);
        try {
            DatagramPacket datagramPacket = new DatagramPacket(byArray, byArray.length, InetAddress.getLocalHost(), this.qog);
            this.rjU.send(datagramPacket);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public final void run() {
        assert (!this.rjV);
        this.acx(this.rjY);
    }

    private void acx(int n) {
        assert (!this.rjV);
        try {
            DatagramSocket datagramSocket = new DatagramSocket(n);
            datagramSocket.setSoTimeout(100);
            datagramSocket.setReceiveBufferSize(0x400000);
            DatagramPacket datagramPacket = new DatagramPacket(new byte[2000], 2000);
            while (this.rjX) {
                try {
                    datagramSocket.receive(datagramPacket);
                    this.a(datagramPacket);
                }
                catch (Exception exception) {}
            }
            datagramSocket.close();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public final void stopListening() {
        assert (!this.rjV);
        this.rjX = false;
    }

    private void a(DatagramPacket datagramPacket) {
        byte[] byArray = datagramPacket.getData();
        if (byArray == null || byArray.length == 0) {
            return;
        }
        String string = new String(byArray, 0, byArray.length);
        this.xM(string);
    }

    protected void xM(String string) {
        this.rjZ.add(string);
    }
}

