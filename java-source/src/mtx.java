/*
 * Decompiled with CFR.
 */
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.text.AttributeSet;
import javax.swing.text.JTextComponent;
import javax.swing.text.PlainDocument;

class mtx
extends PlainDocument {
    private JComboBox comboBox;
    private ComboBoxModel EEN;
    private JTextComponent EEO;

    mtx() {
    }

    public void a(JComboBox jComboBox) {
        this.comboBox = jComboBox;
        this.comboBox.setEditable(true);
        this.EEN = this.comboBox.getModel();
        this.EEO = (JTextComponent)this.comboBox.getEditor().getEditorComponent();
        this.EEO.setDocument(this);
        this.EEO.addFocusListener(new FocusAdapter(this){
            final /* synthetic */ mtx EEP;
            {
                this.EEP = mtx2;
            }

            public void focusLost(FocusEvent focusEvent) {
                mtx.a(this.EEP, 0);
            }
        });
        this.EEO.addKeyListener(new KeyAdapter(this){
            final /* synthetic */ mtx EEP;
            {
                this.EEP = mtx2;
            }

            public void keyPressed(KeyEvent keyEvent) {
                if (keyEvent.getKeyCode() == 10) {
                    mtx.a(this.EEP, 0);
                } else if (keyEvent.getKeyCode() == 27) {
                    mtx.a(this.EEP).setSelectedIndex(0);
                    mtx.b(this.EEP).setText(mtx.a(this.EEP).getSelectedItem().toString());
                    mtx.a(this.EEP, 0);
                }
            }
        });
        Object object = this.comboBox.getSelectedItem();
        if (object != null) {
            this.EEO.setText(object.toString());
        }
    }

    @Override
    public void insertString(int n, String string, AttributeSet attributeSet) {
        String string2 = this.getText(0, this.getLength());
        String string3 = string2.substring(0, n);
        String string4 = string2.substring(n, string2.length());
        String string5 = string3 + string + string4;
        Object object = this.Dn(string5);
        if (object != null) {
            this.comboBox.setSelectedItem(object);
        } else {
            object = this.comboBox.getSelectedItem();
            n -= string.length();
            this.comboBox.getToolkit().beep();
        }
        super.remove(0, this.getLength());
        super.insertString(0, object.toString(), attributeSet);
        if (object.toString().equals(string) && n == 0) {
            this.afD(0);
        } else {
            this.afD(n + string.length());
            this.comboBox.setPopupVisible(true);
        }
    }

    private void afD(int n) {
        this.EEO.setCaretPosition(this.getLength());
        this.EEO.moveCaretPosition(n);
    }

    private Object Dn(String string) {
        Object object = this.EEN.getSelectedItem();
        if (object != null && this.aR(object.toString(), string)) {
            return object;
        }
        int n = this.EEN.getSize();
        for (int i = 0; i < n; ++i) {
            Object e2 = this.EEN.getElementAt(i);
            if (!this.aR(e2.toString(), string)) continue;
            return e2;
        }
        return null;
    }

    private boolean aR(String string, String string2) {
        return string.toUpperCase().startsWith(string2.toUpperCase());
    }

    static /* synthetic */ void a(mtx mtx2, int n) {
        mtx2.afD(n);
    }

    static /* synthetic */ JComboBox a(mtx mtx2) {
        return mtx2.comboBox;
    }

    static /* synthetic */ JTextComponent b(mtx mtx2) {
        return mtx2.EEO;
    }
}

