/*
 * Decompiled with CFR.
 */
import java.util.Random;

public class fl {
    private int RB = 1024;
    private lgq RC = new lgq();
    private Random RD = new Random();

    public String hd() {
        int n = this.RD.nextInt(6) + 1;
        int n2 = this.RD.nextInt(1) + 1;
        String string = this.RC.aC(cg.n(n), cg.u(n2));
        String string2 = "<CharacterSheet><FirstName>" + string + "</FirstName>" + "<LastName>QuickStart</LastName>" + "<Race>" + n + "</Race>" + "<Gender>" + n2 + "</Gender>" + "<Features>" + " <Feature>" + "  <Name>r_hair_01</Name>" + "</Feature>" + "</Features>" + "<BindstoneName>DFLauncherBindstone</BindstoneName>" + "<SkinToneValue>0.0</SkinToneValue>" + "<HairColorValue>0.0</HairColorValue>" + "</CharacterSheet>";
        return string2;
    }

    public int he() {
        ++this.RB;
        return this.RB;
    }

    public fp l(int n, int n2) {
        fp fp2 = new fp(hc.aaz);
        fp2.di = n2;
        fp2.hB = 18;
        fp2.SN = n;
        fp2.hE = "Ricki";
        fp2.hD = "Ricki";
        return fp2;
    }
}

