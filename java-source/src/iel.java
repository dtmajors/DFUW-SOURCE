/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 *  ibp
 *  lcw
 */
import java.util.Set;

public class iel
extends hyn {
    private static final String lNY = "Windows";
    private Set<hyn> lNZ = lcn.emx();

    public iel() {
        super("ConfigWindow", "WindowConfig.swf");
        this.a(lNY, hsu.ldg, "");
        imq.a(this, new imm());
    }

    public void initialize() {
        String[] stringArray;
        super.initialize();
        String string = this.nj(lNY);
        if (string != null && (stringArray = string.split("\u2028")) != null && stringArray.length > 1) {
            for (int j = 0; j < stringArray.length; j += 2) {
                String string2 = stringArray[j + 1];
                if (iel.cyJ().oj(string2)) continue;
                String string3 = stringArray[j];
                ibp ibp2 = null;
                if (string3.equals("spenefett.hid.gui.window.chat.SFChatWindow")) {
                    ibp2 = new ibp(string2);
                }
                if (ibp2 == null) continue;
                ibp2.setGUID(this.MessageDelegator.bzv());
                this.MessageDelegator.a((amf)ibp2);
            }
        }
        if (lcw.qOS && iel.cyJ().cIE().isEmpty()) {
            ibp.cMV();
        }
    }

    public void B(hyn hyn2) {
        if (this.lNZ.contains(hyn2)) {
            return;
        }
        this.lNZ.add(hyn2);
        this.cQa();
    }

    public void C(hyn hyn2) {
        if (!this.lNZ.remove(hyn2)) {
            return;
        }
        this.cQa();
    }

    public String a(String string, Class clazz) {
        int n = 1;
        for (hyn hyn2 : this.lNZ) {
            if (!clazz.isAssignableFrom(hyn2.getClass())) continue;
            ++n;
        }
        return string + n;
    }

    public imm cPZ() {
        imm imm2 = new imm();
        imq.b(this, imm2);
        return imm2;
    }

    public void a(imm imm2) {
        imq.c(this, imm2);
    }

    private void cQa() {
        StringBuilder stringBuilder = new StringBuilder();
        int n = 0;
        for (hyn hyn2 : this.lNZ) {
            if (n > 0) {
                stringBuilder.append('\u2028');
            }
            stringBuilder.append(this.D(hyn2));
            stringBuilder.append('\u2028');
            stringBuilder.append(hyn2.aDa);
            ++n;
        }
        this.B(lNY, stringBuilder.toString());
    }

    private String D(hyn hyn2) {
        if (hyn2 instanceof ibp) {
            return "spenefett.hid.gui.window.chat.SFChatWindow";
        }
        lfn.b(5, ((Object)((Object)this)).getClass().getSimpleName(), "_getClassName: unknown window class: " + hyn2.getClass());
        assert (false);
        return null;
    }
}

