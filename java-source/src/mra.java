/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  org.jdesktop.layout.GroupLayout
 *  org.jdesktop.layout.GroupLayout$Group
 */
import java.awt.Component;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import org.jdesktop.layout.GroupLayout;

public class mra
extends JInternalFrame {
    private JTextField EhB;
    private JButton G;
    private JLabel I;
    private JLabel P;
    private aux DEC;

    public mra() {
        this.b();
        this.c();
    }

    private void b() {
        this.G = new JButton();
        this.I = new JLabel();
        this.EhB = new JTextField();
        this.P = new JLabel();
        this.setClosable(true);
        this.setTitle("Set Camera Position");
        this.G.setText("Set Position");
        this.G.addActionListener(new ActionListener(this){
            final /* synthetic */ mra EhC;
            {
                this.EhC = mra2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mra.a(this.EhC, actionEvent);
            }
        });
        this.I.setText("Position text:");
        this.P.setText("The Position text is in the format (rotation is optional): Position: [0,0,0] Rotation: [0,0,0]");
        GroupLayout groupLayout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout((LayoutManager)groupLayout);
        groupLayout.setHorizontalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout.createParallelGroup(1).add((Component)this.G).add((GroupLayout.Group)groupLayout.createSequentialGroup().add((Component)this.I).addPreferredGap(0).add((Component)this.EhB, -1, 469, Short.MAX_VALUE)).add((Component)this.P)).addContainerGap()));
        groupLayout.setVerticalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add(2, (GroupLayout.Group)groupLayout.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout.createParallelGroup(3).add((Component)this.I).add((Component)this.EhB, -2, -1, -2)).addPreferredGap(0).add((Component)this.P).addPreferredGap(0, 18, Short.MAX_VALUE).add((Component)this.G).addContainerGap()));
        this.pack();
    }

    private void x(ActionEvent actionEvent) {
        this.eAy();
    }

    private void c() {
    }

    private void eAy() {
        StringTokenizer stringTokenizer;
        Object object;
        ljq ljq2 = new ljq();
        ljq ljq3 = new ljq();
        if (this.EhB.getText().equals("")) {
            return;
        }
        String string = this.EhB.getText();
        StringTokenizer stringTokenizer2 = new StringTokenizer(string, " ");
        try {
            object = stringTokenizer2.nextToken();
            object = stringTokenizer2.nextToken();
            object = ((String)object).substring(1, ((String)object).length() - 1);
            stringTokenizer = new StringTokenizer((String)object, ",");
            ljq2.x = Float.parseFloat(stringTokenizer.nextToken());
            ljq2.y = Float.parseFloat(stringTokenizer.nextToken());
            ljq2.rlV = Float.parseFloat(stringTokenizer.nextToken());
        }
        catch (NoSuchElementException noSuchElementException) {
            return;
        }
        catch (NumberFormatException numberFormatException) {
            return;
        }
        try {
            object = stringTokenizer2.nextToken();
            object = stringTokenizer2.nextToken();
            object = ((String)object).substring(1, ((String)object).length() - 1);
            stringTokenizer = new StringTokenizer((String)object, ",");
            ljq3.x = Float.parseFloat(stringTokenizer.nextToken());
            ljq3.y = Float.parseFloat(stringTokenizer.nextToken());
            ljq3.rlV = Float.parseFloat(stringTokenizer.nextToken());
        }
        catch (NoSuchElementException noSuchElementException) {
        }
        catch (NumberFormatException numberFormatException) {
            return;
        }
        object = (hac)this.DEC.d(4097);
        ((hac)object).Lb(116);
        ((hac)object).c(ljq2);
        ((hac)object).setRotation(ljq3);
        this.DEC.a((dxq)object);
    }

    public void p(aux aux2) {
        this.DEC = aux2;
    }

    static /* synthetic */ void a(mra mra2, ActionEvent actionEvent) {
        mra2.x(actionEvent);
    }
}

