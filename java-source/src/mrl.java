/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  lcw
 */
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;

public class mrl
extends JToolBar {
    private aux DYN;

    public mrl(aux aux2) {
        this.DYN = aux2;
        this.setFloatable(false);
        String string = lcw.qLb + "worldbuilder/icons/";
        String string2 = string + "silk" + "/";
        this.f(string + "open.gif", "Open File Explorer", "Load SFFile..", "Load");
        this.f(string + "save.gif", "Save Worlddata", "Save World data", "Save");
        this.f(string2 + "brick.gif", "Load Tile", "<HTML>Load Palette</HTML>", "Load Tile");
        this.f(string2 + "folder_star.gif", "Quick Load", "Quick-loads the last Worlddata save", "QuickLoad");
        this.f(string2 + "lightning.gif", "Full Preprocessing", "Preprocess Files", "Preprocess");
        this.f(string2 + "page_go.gif", "FILE DUMP", "Makes a file-dump for selected files.", "File Dump");
        JToggleButton jToggleButton = new JToggleButton("GroupMode", true);
        jToggleButton.setMargin(new Insets(2, 2, 2, 2));
        jToggleButton.addActionListener((ActionListener)aux2);
        this.add(jToggleButton);
        JToggleButton jToggleButton2 = new JToggleButton("Link", false);
        jToggleButton2.setMargin(new Insets(2, 2, 2, 2));
        jToggleButton2.addActionListener((ActionListener)aux2);
        this.add(jToggleButton2);
        this.f(string2 + "brick.gif", "Load Object Palette", "<HTML>Load Palette</HTML>", "Load Palette");
        this.f(string2 + "brick_add.gif", "New Object Palette", "New Palette", "new Palette");
        this.f(string2 + "page_edit.gif", "Maintenance Dialog", "Show Maintainance dialog.", null);
        this.f(string2 + "user_edit.gif", "Setup VendorTest", "Sets up Standalone for testing vendors and Quests.", null);
        this.f(string2 + "world_go.gif", "PreProcess Level(s)", "Makes Levels from tiles.", "Make Levels");
        this.f(string2 + "bricks.gif", "PreProcess Dungeon(s)", "Makes Dungeon levels from dungeons.", "Convert Dungeons");
        this.f(string2 + "palette.gif", "Convert Animation", "<HTML>Convert Animation.</HTML>", null);
        this.f(string2 + "ruby.gif", "AttachPoint Dialog", "Edit AttachPoints", null);
        this.f(string + "save.gif", "SaveAll", "Saves both terrain and objectspaces.", "Save All");
        this.addSeparator(new Dimension(32, 16));
        this.f(string + "worldb_mode.gif", "World Overview Dialog", "Show World overview", null);
        this.f(string2 + "chart_pie.gif", "Reload SFX", "Reload SFX", null);
        this.f(string2 + "computer_edit.gif", "Configuration", "Edit preferences", null);
        this.f(string2 + "computer_edit.gif", "Reload Shaders", "Reload Shaders", "Reload Shaders");
        this.f(string2 + "computer_edit.gif", "Reload Textures", "Reload Textures", null);
        this.f(string2 + "computer_edit.gif", "Reload Meshes", "Reload Meshes", null);
        this.addSeparator(new Dimension(32, 16));
        JCheckBox jCheckBox = new JCheckBox("Use Audio Cache");
        jCheckBox.setSelected(true);
        jCheckBox.addActionListener((ActionListener)aux2);
        this.add(jCheckBox);
        JCheckBox jCheckBox2 = new JCheckBox("Wireframe");
        jCheckBox2.addActionListener((ActionListener)aux2);
        this.add(jCheckBox2);
        JCheckBox jCheckBox3 = new JCheckBox("AO");
        jCheckBox3.setSelected(false);
        jCheckBox3.addActionListener((ActionListener)aux2);
        this.add(jCheckBox3);
        JCheckBox jCheckBox4 = new JCheckBox("PP");
        jCheckBox4.setSelected(false);
        jCheckBox4.addActionListener((ActionListener)aux2);
        this.add(jCheckBox4);
        JCheckBox jCheckBox5 = new JCheckBox("Deferred");
        jCheckBox5.setSelected(true);
        jCheckBox5.addActionListener((ActionListener)aux2);
        this.add(jCheckBox5);
        JCheckBox jCheckBox6 = new JCheckBox("Reflection");
        jCheckBox6.setSelected(true);
        jCheckBox6.addActionListener((ActionListener)aux2);
        this.add(jCheckBox6);
        JCheckBox jCheckBox7 = new JCheckBox("AA");
        jCheckBox7.setSelected(true);
        jCheckBox7.addActionListener((ActionListener)aux2);
        this.add(jCheckBox7);
        JCheckBox jCheckBox8 = new JCheckBox("GodRays");
        jCheckBox8.setSelected(false);
        jCheckBox8.addActionListener((ActionListener)aux2);
        this.add(jCheckBox8);
        JCheckBox jCheckBox9 = new JCheckBox("LowShaders");
        jCheckBox9.setSelected(false);
        jCheckBox9.addActionListener((ActionListener)aux2);
        this.add(jCheckBox9);
        JCheckBox jCheckBox10 = new JCheckBox("DOF");
        jCheckBox10.setSelected(false);
        jCheckBox10.addActionListener((ActionListener)aux2);
        this.add(jCheckBox10);
    }

    private void f(String string, String string2, String string3, String string4) {
        JButton jButton = new JButton(new ImageIcon(string));
        jButton.setActionCommand(string2);
        jButton.setToolTipText(string3);
        jButton.addActionListener((ActionListener)this.DYN);
        jButton.setText(string4);
        jButton.setOpaque(false);
        this.add(jButton);
    }
}

