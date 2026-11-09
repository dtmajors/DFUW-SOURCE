/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Map;
import java.util.TreeMap;

public class bhr
extends bgk {
    public static final String dmf = "persistence_set";
    public static final String dmg = "persistence_get";

    private Integer a(Map<String, String> map, String string) {
        String string2 = map.get(string.toLowerCase());
        if (string2 == null) {
            return null;
        }
        try {
            return Integer.parseInt(string2);
        }
        catch (NumberFormatException numberFormatException) {
            throw new bg(string + " is not a valid integer");
        }
    }

    private Double b(Map<String, String> map, String string) {
        String string2 = map.get(string.toLowerCase());
        if (string2 == null) {
            return null;
        }
        try {
            return Double.parseDouble(string2);
        }
        catch (NumberFormatException numberFormatException) {
            throw new bg(string + " is not a valid float");
        }
    }

    private Boolean c(Map<String, String> map, String string) {
        String string2 = map.get(string.toLowerCase());
        if (string2 == null) {
            return null;
        }
        if (string2.equalsIgnoreCase("true")) {
            return Boolean.TRUE;
        }
        if (string2.equalsIgnoreCase("false")) {
            return Boolean.FALSE;
        }
        throw new bg(string + " is not a valid boolean");
    }

    @Override
    public void initialize() {
        super.initialize();
        if (this.akV.equals(dmf)) {
            this.apn();
        } else if (this.akV.equals(dmg)) {
            this.apo();
        } else {
            this.fw("Invalid command");
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 7194: 
            case 7196: {
                this.b((fzg)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void apn() {
        fzt fzt2 = (fzt)this.MessageDelegator.h(7193, this.getGUID(), lcr.qAV);
        fzt2.kV = 0;
        Map<String, String> map = lcn.emw();
        for (Object object : this.dlm.keySet()) {
            map.put(((String)object).toLowerCase(), (String)this.dlm.get(object));
        }
        try {
            Double d2;
            Object object;
            Object object2 = this.c(map, "SchedulerEnabled");
            if (object2 != null) {
                fzt2.kV |= 1;
                fzt2.jbz = (Boolean)object2;
            }
            if ((object2 = this.c(map, "PeriodicSavingEnabled")) != null) {
                fzt2.kV |= 0x8000;
                fzt2.aHU = (Boolean)object2;
            }
            if ((d2 = this.b(map, "PeriodicSavingInterval")) != null) {
                fzt2.kV |= 0x10000;
                fzt2.aHT = d2;
            }
            if ((object2 = this.c(map, "ScheduledExportEnabled")) != null) {
                fzt2.kV |= 2;
                fzt2.jbA = (Boolean)object2;
            }
            if ((d2 = this.b(map, "ExportScanInterval")) != null) {
                fzt2.kV |= 4;
                fzt2.jbB = d2;
            }
            if ((object = this.a(map, "MaxExportPerScan")) != null) {
                fzt2.kV |= 8;
                fzt2.jbC = (Integer)object;
            }
            if ((object2 = this.c(map, "ScheduledImportEnabled")) != null) {
                fzt2.kV |= 0x10;
                fzt2.jbD = (Boolean)object2;
            }
            if ((d2 = this.b(map, "ImportScanInterval")) != null) {
                fzt2.kV |= 0x20;
                fzt2.jbE = d2;
            }
            if ((object = this.a(map, "MaxImportPerScan")) != null) {
                fzt2.kV |= 0x40;
                fzt2.jbF = (Integer)object;
            }
            if ((object2 = this.c(map, "ScheduledRestoreEnabled")) != null) {
                fzt2.kV |= 0x1000;
                fzt2.jbL = (Boolean)object2;
            }
            if ((d2 = this.b(map, "RestoreScanInterval")) != null) {
                fzt2.kV |= 0x2000;
                fzt2.jbM = d2;
            }
            if ((object = this.a(map, "MaxRestorePerScan")) != null) {
                fzt2.kV |= 0x4000;
                fzt2.jbN = (Integer)object;
            }
            if ((object2 = this.c(map, "ScheduledExpiryEnabled")) != null) {
                fzt2.kV |= 0x80;
                fzt2.jbG = (Boolean)object2;
            }
            if ((d2 = this.b(map, "ExpiryScanInterval")) != null) {
                fzt2.kV |= 0x100;
                fzt2.jbH = d2;
            }
            if ((object = this.a(map, "MaxExpiryPerScan")) != null) {
                fzt2.kV |= 0x800;
                fzt2.jbK = (Integer)object;
            }
            if ((object = this.a(map, "DeletedCharactersExpiryThreshold")) != null) {
                fzt2.kV |= 0x200;
                fzt2.jbI = (Integer)object;
            }
            if ((object = this.a(map, "DisabledAccountsExpiryThreshold")) != null) {
                fzt2.kV |= 0x400;
                fzt2.jbJ = (Integer)object;
            }
            if ((object2 = this.c(map, "ScheduledMeditationScanEnabled")) != null) {
                fzt2.kV |= 0x20000;
                fzt2.jbO = (Boolean)object2;
            }
            if ((d2 = this.b(map, "MeditationScanInterval")) != null) {
                fzt2.kV |= 0x40000;
                fzt2.jbP = d2;
            }
        }
        catch (bg bg2) {
            this.fw(bg2.getMessage());
            return;
        }
        if (fzt2.kV == 0) {
            this.fw("Expected at least one property");
            return;
        }
        this.MessageDelegator.E(fzt2);
    }

    private void apo() {
        fyr fyr2 = (fyr)this.MessageDelegator.h(7195, this.getGUID(), lcr.qAV);
        fyr2.kV = -1;
        this.MessageDelegator.E(fyr2);
    }

    private void b(fzg fzg2) {
        TreeMap<String, String> treeMap = lcn.emG();
        if ((fzg2.kV & 1) != 0) {
            treeMap.put("SchedulerEnabled", "" + fzg2.jbz);
        }
        if ((fzg2.kV & 0x8000) != 0) {
            treeMap.put("PeriodicSavingEnabled", "" + fzg2.aHU);
        }
        if ((fzg2.kV & 0x10000) != 0) {
            treeMap.put("PeriodicSavingInterval", "" + fzg2.aHT);
        }
        if ((fzg2.kV & 2) != 0) {
            treeMap.put("ScheduledExportEnabled", "" + fzg2.jbA);
        }
        if ((fzg2.kV & 4) != 0) {
            treeMap.put("ExportScanInterval", "" + fzg2.jbB);
        }
        if ((fzg2.kV & 8) != 0) {
            treeMap.put("MaxExportPerScan", "" + fzg2.jbC);
        }
        if ((fzg2.kV & 0x10) != 0) {
            treeMap.put("ScheduledImportEnabled", "" + fzg2.jbD);
        }
        if ((fzg2.kV & 0x20) != 0) {
            treeMap.put("ImportScanInterval", "" + fzg2.jbE);
        }
        if ((fzg2.kV & 0x40) != 0) {
            treeMap.put("MaxImportPerScan", "" + fzg2.jbF);
        }
        if ((fzg2.kV & 0x1000) != 0) {
            treeMap.put("ScheduledRestoreEnabled", "" + fzg2.jbL);
        }
        if ((fzg2.kV & 0x2000) != 0) {
            treeMap.put("RestoreScanInterval", "" + fzg2.jbM);
        }
        if ((fzg2.kV & 0x4000) != 0) {
            treeMap.put("MaxRestorePerScan", "" + fzg2.jbN);
        }
        if ((fzg2.kV & 0x80) != 0) {
            treeMap.put("ScheduledExpiryEnabled", "" + fzg2.jbG);
        }
        if ((fzg2.kV & 0x100) != 0) {
            treeMap.put("ExpiryScanInterval", "" + fzg2.jbH);
        }
        if ((fzg2.kV & 0x800) != 0) {
            treeMap.put("MaxExpiryPerScan", "" + fzg2.jbK);
        }
        if ((fzg2.kV & 0x200) != 0) {
            treeMap.put("DeletedCharactersExpiryThreshold", "" + fzg2.jbI);
        }
        if ((fzg2.kV & 0x400) != 0) {
            treeMap.put("DisabledAccountsExpiryThreshold", "" + fzg2.jbJ);
        }
        if ((fzg2.kV & 0x20000) != 0) {
            treeMap.put("ScheduledMeditationScanEnabled", "" + fzg2.jbO);
        }
        if ((fzg2.kV & 0x40000) != 0) {
            treeMap.put("MeditationScanInterval", "" + fzg2.jbP);
        }
        this.t(treeMap);
        this.aoV();
    }
}

