/*
 * Decompiled with CFR.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class mjm {
    public static boolean DDy = false;

    public static void a(JSlider jSlider, JTextField jTextField, float f) {
        ActionListener actionListener = new ActionListener(jTextField, f, jSlider){
            final /* synthetic */ JTextField DDz;
            final /* synthetic */ float DDA;
            final /* synthetic */ JSlider DDB;
            {
                this.DDz = jTextField;
                this.DDA = f;
                this.DDB = jSlider;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                float f = Float.parseFloat(this.DDz.getText());
                int n = (int)(f * this.DDA);
                if (n < this.DDB.getMinimum()) {
                    n = this.DDB.getMinimum();
                }
                if (n > this.DDB.getMaximum()) {
                    n = this.DDB.getMaximum();
                }
                DDy = true;
                this.DDB.setValue(n);
                DDy = false;
            }
        };
        jTextField.addActionListener(actionListener);
        jSlider.addChangeListener(new ChangeListener(jTextField, jSlider, f, actionListener){
            final /* synthetic */ JTextField DDz;
            final /* synthetic */ JSlider DDB;
            final /* synthetic */ float DDA;
            final /* synthetic */ ActionListener DDC;
            {
                this.DDz = jTextField;
                this.DDB = jSlider;
                this.DDA = f;
                this.DDC = actionListener;
            }

            public void stateChanged(ChangeEvent changeEvent) {
                if (!DDy) {
                    this.DDz.setText(String.valueOf((float)this.DDB.getValue() / this.DDA));
                    for (ActionListener actionListener : this.DDz.getActionListeners()) {
                        if (actionListener == this.DDC) continue;
                        actionListener.actionPerformed(null);
                    }
                }
            }
        });
        actionListener.actionPerformed(null);
    }
}

