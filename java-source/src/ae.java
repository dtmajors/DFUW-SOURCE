/*
 * Decompiled with CFR.
 */
import java.awt.Color;
import java.awt.FlowLayout;
import java.net.ServerSocket;
import javax.swing.JFrame;

public class ae
extends JFrame {
    private t dH = null;
    public static String dI = null;
    private static ServerSocket dJ;

    void initialize() {
        mjb mjb2 = new mjb();
        this.getContentPane().setLayout(new FlowLayout(0, 5, 5));
        mjb2.setBounds(0, 0, 0, 0);
        this.getContentPane().add(mjb2);
        this.setBackground(Color.black);
        this.setBounds(0, 0, 800, 600);
        this.setVisible(true);
        y y2 = new y();
        this.dH = y2;
        y2.initialize();
    }

    void run() {
        this.dH.O();
    }

    void cleanup() {
        this.dH.b((ldz)null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void main(String[] stringArray) {
        if (stringArray != null && stringArray.length == 1 && stringArray[0].startsWith("DFDataDir=")) {
            dI = stringArray[0].trim().substring(10, stringArray[0].length());
        }
        int n = 9999;
        try {
            dJ = new ServerSocket(n);
        }
        catch (Exception exception) {
            System.out.println("Instance already running, aborting!");
            System.exit(-1);
        }
        assert (dJ != null);
        ae ae2 = new ae();
        try {
            ae2.initialize();
            try {
                ae2.run();
            }
            finally {
                ae2.cleanup();
            }
        }
        catch (Throwable throwable) {
            lfn.log("SFMainStandalone", throwable);
        }
        System.exit(0);
    }
}

