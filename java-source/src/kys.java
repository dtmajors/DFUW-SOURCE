/*
 * Decompiled with CFR.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;

public class kys
extends kyy {
    private String qmM = null;
    private String qmN = null;

    public kys(kyr kyr2) {
        super(kyr2);
    }

    public String ejs() {
        return this.qmM;
    }

    public void xN(String string) {
        this.qmM = string;
    }

    public String ejt() {
        return this.qmN;
    }

    public void xO(String string) {
        this.qmN = string;
    }

    @Override
    public String cgO() {
        return this.qmM + "/" + this.qmN;
    }

    public void eju() {
        this.ejx();
    }

    public void ejv() {
        Object[] objectArray = this.qkM.eja().qjw;
        if (objectArray == null || objectArray.length == 0) {
            return;
        }
        String string = (String)JOptionPane.showInputDialog(this.qkM, "Select Directory", "", -1, null, objectArray, this.qmM);
        if (string == null) {
            return;
        }
        this.am(string, this.qmN);
    }

    public void ejw() {
        this.am(this.qmM, this.qmN);
    }

    public void ejx() {
        if (this.qmM == null || this.qmN == null) {
            this.h(5, "SFLogfileViewSession", "refreshLogfile() A logfile has not yet been selected.");
            return;
        }
        String string = this.qmM + "/" + this.qmN;
        this.d(new jrw(string));
    }

    public void ejy() {
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setFileSelectionMode(0);
        jFileChooser.setFileFilter(new kyf());
        jFileChooser.setApproveButtonText("Save");
        jFileChooser.setDialogTitle("Save Logfile");
        if (this.qmM != null) {
            jFileChooser.setCurrentDirectory(new jrw(this.qmM));
            if (this.qmN != null) {
                jFileChooser.setSelectedFile(new jrw(this.qmN));
            } else {
                jFileChooser.setSelectedFile(new jrw(kyj.qjD));
            }
        } else {
            jFileChooser.setCurrentDirectory(new jrw(System.getProperty("user.dir")));
            jFileChooser.setSelectedFile(new jrw(kyj.qjD));
        }
        int n = jFileChooser.showOpenDialog(this.qnl);
        if (n == 0) {
            String string = jFileChooser.getSelectedFile().getParentFile().getAbsolutePath();
            String string2 = jFileChooser.getSelectedFile().getName();
            try {
                String string3 = this.qnl.ejJ().getText(0, this.qnl.ejJ().getLength());
                string3 = this.xP(string3);
                this.an(string + "/" + string2, string3);
            }
            catch (BadLocationException badLocationException) {
                badLocationException.printStackTrace();
            }
        }
    }

    @Override
    protected kyy ejz() {
        kys kys2 = new kys(this.qkM);
        kys2.xN(this.qmM);
        kys2.xO(this.qmN);
        return kys2;
    }

    private void d(File file) {
        BufferedReader bufferedReader = null;
        try {
            this.ejU();
            bufferedReader = new BufferedReader(new FileReader(file));
            String string = bufferedReader.readLine();
            while (string != null && string != "" && !string.startsWith("#")) {
                if (string.trim().equals("")) {
                    string = bufferedReader.readLine();
                    continue;
                }
                this.parseLine(string);
                string = bufferedReader.readLine();
            }
            this.ejV();
            bufferedReader.close();
        }
        catch (FileNotFoundException fileNotFoundException) {
            System.out.println("SFLogfileViewSession: openLogfile() Could not find file: '" + file.getAbsolutePath() + "'");
        }
        catch (Exception exception) {
            System.out.println("SFLogfileViewSession: openLogfile() Exception caught: " + exception);
            exception.printStackTrace();
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            }
            catch (Exception exception2) {
                exception2.printStackTrace();
            }
        }
        this.qkM.b(this);
    }

    private void parseLine(String string) {
        assert (string != null);
        StringTokenizer stringTokenizer = new StringTokenizer(string, "[] ", true);
        assert (stringTokenizer.hasMoreTokens());
        a a2 = a.qmP;
        String string2 = null;
        String string3 = null;
        int n = 0;
        String string4 = null;
        String string5 = null;
        while (stringTokenizer.hasMoreTokens()) {
            String string6 = stringTokenizer.nextToken().trim();
            if (string6.equals("")) continue;
            switch (a2) {
                case qmP: {
                    if (string6.equals("[")) {
                        a2 = a.qmT;
                        break;
                    }
                    this.h(0, "", string);
                    return;
                }
                case qmQ: {
                    if (string6.startsWith("(") && string6.endsWith(")")) {
                        if (string6.equalsIgnoreCase("(debug)")) {
                            n = 0;
                        } else if (string6.equalsIgnoreCase("(verbose)")) {
                            n = 1;
                        } else if (string6.equalsIgnoreCase("(info)")) {
                            n = 2;
                        } else if (string6.equalsIgnoreCase("(notice)")) {
                            n = 3;
                        } else if (string6.equalsIgnoreCase("(warning)")) {
                            n = 4;
                        } else if (string6.equalsIgnoreCase("(error)")) {
                            n = 5;
                        } else if (string6.equalsIgnoreCase("(fatal)")) {
                            n = 6;
                        } else {
                            this.h(5, "SFLogfileViewSession", "parseLine() Failed to parse loglevel: '" + string + "'");
                            return;
                        }
                        a2 = a.qmR;
                        break;
                    }
                    this.h(5, "SFLogfileViewSession", "parseLine() Failed to parse loglevel: '" + string + "'");
                    return;
                }
                case qmR: {
                    if (string6.equals("[")) break;
                    if (string6.equals("]")) {
                        a2 = a.qmS;
                        break;
                    }
                    if (string4 == null) {
                        string4 = string6;
                        break;
                    }
                    string4 = string4 + string6;
                    break;
                }
                case qmS: {
                    string5 = string6;
                    while (stringTokenizer.hasMoreTokens()) {
                        string5 = string5 + stringTokenizer.nextToken();
                    }
                    break;
                }
                case qmT: {
                    if (string6.equals("]")) {
                        a2 = a.qmQ;
                        break;
                    }
                    if (string2 == null) {
                        string2 = string6;
                        string3 = "";
                        break;
                    }
                    string3 = string3 + " " + string6;
                }
            }
        }
        if (a2 != a.qmS) {
            this.h(0, "", string);
            return;
        }
        this.a(string2, string3, n, string4, string5);
    }

    private void am(String string, String string2) {
        int n;
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setFileSelectionMode(0);
        jFileChooser.setFileFilter(new kyf());
        if (string != null) {
            jFileChooser.setCurrentDirectory(new jrw(string));
            if (string2 != null) {
                jFileChooser.setSelectedFile(new jrw(string2));
            }
        }
        if ((n = jFileChooser.showOpenDialog(this.qnl)) == 0) {
            this.qmM = jFileChooser.getSelectedFile().getParentFile().getAbsolutePath();
            this.qmN = jFileChooser.getSelectedFile().getName();
            this.d(jFileChooser.getSelectedFile());
        }
    }
}

