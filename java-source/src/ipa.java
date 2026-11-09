/*
 * Decompiled with CFR.
 */
import spenefett.hid.gui.serialization.dto.SFGUIElementDTO;

public class ipa
extends ipz {
    private hwm mqd;
    private boolean mqe;

    public ipa(hwm hwm2) {
        this.f(hwm2);
    }

    public ipa() {
        this((hwm)null);
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.mqe = false;
    }

    public hwm cQm() {
        return this.mqd;
    }

    public void f(hwm hwm2) {
        if (hwm2 == this.mqd) {
            return;
        }
        this.mqd = hwm2;
        this.djl();
    }

    public void djl() {
        if (this.mqe) {
            return;
        }
        this.mqe = true;
        this.dkg();
    }

    @Override
    public void ei(int n, int n2) {
        super.ei(n, n2);
        if (this.mqe) {
            this.mqe = false;
            if (this.mqd != null) {
                this.mqd.update();
            }
            this.djE().b("GUIElement_update", new Object[]{this.getId(), this.djp()});
        }
    }

    @Override
    public void djm() {
        super.djm();
        this.mqe = false;
    }

    @Override
    public void dA(int n, int n2) {
        this.djE().b("GUIElement_create", new Object[]{this.getId(), n, n2, this.getX() + this.djU(), this.getY() + this.djV(), this.getWidth(), this.getHeight(), Float.valueOf(this.getAlpha() * this.djX()), this.djR() && this.djY(), this.dlu(), this.djp()});
    }

    @Override
    public void djn() {
        this.djE().b("GUIElement_setGeometry", new Object[]{this.getId(), this.getX() + this.djU(), this.getY() + this.djV(), this.getWidth(), this.getHeight()});
    }

    @Override
    public void djo() {
        this.djE().b("GUIElement_setSize", new Object[]{this.getId(), this.getWidth(), this.getHeight()});
    }

    @Override
    public void cPj() {
        int n = 64;
        int n2 = 64;
        this.setSize(n, n2);
    }

    private String djp() {
        SFGUIElementDTO sFGUIElementDTO;
        SFGUIElementDTO sFGUIElementDTO2 = sFGUIElementDTO = this.mqd != null ? this.mqd.cBj() : null;
        if (sFGUIElementDTO != null) {
            sFGUIElementDTO.quickItem = false;
            return hxt.a(sFGUIElementDTO);
        }
        return "";
    }
}

