/*
 * Decompiled with CFR.
 */
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JColorChooser;
import javax.swing.colorchooser.ColorSelectionModel;

public class mjp
extends mkx {
    private JColorChooser DDL;
    private Color DDM = null;
    private Dimension DDN = new Dimension(450, 400);

    public mjp(Color color, String string) {
        super(false);
        this.setClosable(true);
        this.setTitle(string);
        this.setResizable(false);
        this.setMaximizable(false);
        this.DDM = color;
        this.DDL = new JColorChooser(this.DDM);
        this.setPreferredSize(this.DDN);
        this.DGa.add(this.DDL);
        this.pack();
    }

    public ColorSelectionModel getColorSelectionModel() {
        return this.DDL.getSelectionModel();
    }

    public Color getColor() {
        return this.DDL.getColor();
    }
}

