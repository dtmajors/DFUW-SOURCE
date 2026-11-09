/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.ArrayList;
import java.util.Set;
import javax.swing.UIManager;

public class af
extends ab {
    public static void main(String[] stringArray) {
        System.loadLibrary("SFMiddleware");
        af.a(stringArray);
        af.d();
        new mkb(lcw.qLb, false);
        loi.exd().adQ(3);
        lfn.b(0, "SFMainWorldbuilder", "main() : ..::Exiting::..");
        System.exit(0);
    }

    private static void a(String[] stringArray) {
        for (int i = 0; i < stringArray.length; ++i) {
            if (stringArray[i].equals("-debug")) {
                if (stringArray[i + 1].equals("VERBOSE")) {
                    lfn.rkm = 1;
                    System.out.print("Verbose level set!");
                    continue;
                }
                if (stringArray[i + 1].equals("INFO")) {
                    lfn.rkm = 2;
                    System.out.print("Info level set!");
                    continue;
                }
                if (stringArray[i + 1].equals("NOTICE")) {
                    lfn.rkm = 3;
                    System.out.print("NOTICE level set!");
                    continue;
                }
                if (stringArray[i + 1].equals("WARNING")) {
                    lfn.rkm = 4;
                    System.out.print("Verbose WARNING set!");
                    continue;
                }
                if (stringArray[i + 1].equals("ERROR")) {
                    lfn.rkm = 5;
                    System.out.print("Verbose ERROR set!");
                    continue;
                }
                System.out.println("Usage: wb.bat -debug <VERBOSE|INFO|NOTICE|WARNING|ERROR>");
                System.exit(0);
                continue;
            }
            if (stringArray[i].equals("-cv")) {
                if (stringArray[i + 1].equals("on")) {
                    mje.DBw = true;
                    System.out.print("Version checking is on.");
                    continue;
                }
                if (!stringArray[i + 1].equals("off")) continue;
                mje.DBw = false;
                System.out.print("Version checking is off!");
                continue;
            }
            if (stringArray[i].equals("-stitchnormals")) {
                mje.DCd = true;
                continue;
            }
            if (stringArray[i].equals("-makelevels")) {
                mje.DBP = true;
                int n = stringArray.length - i;
                ++i;
                while (i < n) {
                    if (stringArray[i].equals("-testingonly")) {
                        mje.DBR = true;
                    } else if (stringArray[i].equals("-bordersonly")) {
                        mje.DBS = true;
                    } else if (stringArray[i].equals("-editzone")) {
                        mje.DBT = true;
                    } else if (stringArray[i].equals("-createempty")) {
                        mje.DBU = true;
                        mje.DBT = true;
                    }
                    ++i;
                }
                continue;
            }
            if (stringArray[i].equals("-makecities")) {
                mje.DBO = true;
                continue;
            }
            if (stringArray[i].equals("-makestrips")) {
                mje.DBV = true;
                continue;
            }
            if (stringArray[i].equals("-maketilenavmesh")) {
                mje.DCc = true;
                continue;
            }
            if (stringArray[i].equals("-makeallnavmeshes")) {
                mje.DBW = true;
                continue;
            }
            if (stringArray[i].equals("-makenavmeshes")) {
                mje.DBX = true;
                if (i + 1 >= stringArray.length) {
                    System.out.println("To make Spawnpoints' navmeshes you need to specify at least one tile name");
                    System.exit(1);
                    return;
                }
                ArrayList<String> arrayList = lcn.emv();
                while (i + 1 < stringArray.length && !stringArray[i + 1].startsWith("-")) {
                    arrayList.add(stringArray[++i]);
                }
                if (arrayList.size() <= 0) {
                    System.out.println("To make Spawnpoints' navmeshes you need to specify at least one tile name");
                    System.exit(1);
                    return;
                }
                mje.DCa = arrayList;
                continue;
            }
            if (stringArray[i].equals("-makevoxels")) {
                mje.DBY = true;
                ArrayList<String> arrayList = lcn.emv();
                while (i + 1 < stringArray.length && !stringArray[i + 1].startsWith("-")) {
                    arrayList.add(stringArray[++i]);
                }
                if (arrayList.size() <= 0) {
                    System.out.println("To make voxels you need to specify at least one level");
                    System.exit(1);
                    return;
                }
                mje.DBZ = arrayList;
                continue;
            }
            if (stringArray[i].equals("-makelevel")) {
                mje.DBQ = true;
                if (i + 1 >= stringArray.length) {
                    System.out.println("To make levels you need to specify a tile name");
                    System.exit(1);
                    return;
                }
                Set<String> set = lcn.emx();
                ++i;
                while (i < stringArray.length) {
                    if (stringArray[i].startsWith("-")) {
                        if (stringArray[i].equals("-editzone")) {
                            mje.DBT = true;
                        } else if (stringArray[i].equals("-createempty")) {
                            mje.DBU = true;
                            mje.DBT = true;
                        }
                    } else {
                        set.add(stringArray[i]);
                    }
                    ++i;
                }
                mje.DCb = set;
                return;
            }
            if (!stringArray[i].equals("-makemonsterstatesoundsindex")) continue;
            mje.DCe = true;
        }
    }

    private static void d() {
        new UIManager();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception exception) {
            // empty catch block
        }
    }
}

