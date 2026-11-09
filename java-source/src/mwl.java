/*
 * Decompiled with CFR.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.StringTokenizer;

public class mwl {
    private static final String TC = "SFQuestDatabaseConnector";
    public static final String qnM = "styx.office.aventurine.gr";
    public static final String qnN = "darkfall_unholy_quests";
    public static final String qnO = "root";
    public static final String qnP = "ss4567";
    public static final String qnQ = "com.mysql.jdbc.Driver";
    private static boolean Wv = false;
    private static Connection qnR;
    private static Statement qnS;

    public boolean ekc() {
        return this.ao(qnO, qnP);
    }

    private boolean ao(String string, String string2) {
        try {
            if (Wv) {
                return true;
            }
            Class.forName(qnQ);
            Properties properties = new Properties();
            properties.put("user", string);
            properties.put("password", string2);
            String string3 = "jdbc:mysql://styx.office.aventurine.gr/darkfall_unholy_quests";
            qnR = DriverManager.getConnection(string3, properties);
            qnS = qnR.createStatement();
            Wv = true;
            return true;
        }
        catch (ClassNotFoundException classNotFoundException) {
            return false;
        }
        catch (SQLException sQLException) {
            return false;
        }
    }

    public List<dtz> dTv() {
        ArrayList<dtz> arrayList = lcn.emv();
        if (!Wv) {
            return arrayList;
        }
        arrayList.addAll(this.eRA());
        arrayList.addAll(this.eRB());
        return arrayList;
    }

    public List<dty> eRA() {
        ArrayList<dty> arrayList = lcn.emv();
        if (!Wv) {
            return arrayList;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("select * from Quests, ComplexQuests where ID=QuestID");
        try {
            ResultSet resultSet = qnS.executeQuery(stringBuilder.toString());
            dud[] dudArray = dud.values();
            while (resultSet.next()) {
                int n;
                dty dty2 = new dty();
                dty2.Name = resultSet.getString("Name");
                dty2.Type = dudArray[resultSet.getInt("Type")];
                dty2.FactionAvatar = resultSet.getString("FactionAvatar");
                dty2.QuestEndClientSpecialEffect = resultSet.getString("QuestEndClientSpecialEffect");
                dty2.QuestEndSourceSpecialEffect = resultSet.getString("QuestEndSourceSpecialEffect");
                dty2.QuestEndTargetSpecialEffect = resultSet.getString("QuestEndTargetSpecialEffect");
                dty2.QuestEndText = resultSet.getString("QuestEndText");
                dty2.QuestStartClientSpecialEffect = resultSet.getString("QuestStartClientSpecialEffect");
                dty2.QuestStartSourceSpecialEffect = resultSet.getString("QuestStartSourceSpecialEffect");
                dty2.QuestStartTargetSpecialEffect = resultSet.getString("QuestStartTargetSpecialEffect");
                dty2.QuestStartText = resultSet.getString("QuestStartText");
                dty2.HighScoreRecording = resultSet.getBoolean("HighScoreRecording");
                dty2.ID = resultSet.getInt("ID");
                dty2.OneTimeOnly = resultSet.getBoolean("OneTimeOnly");
                dty2.AvailabilityTimeWindow = resultSet.getLong("AvailabilityTimeWindow");
                dty2.RestartIfCancelled = resultSet.getBoolean("RestartIfCancelled");
                dty2.RestartIfFailed = resultSet.getBoolean("RestartIfFailed");
                dty2.ShortDescription = resultSet.getString("ShortDescription");
                dty2.TileLocation = resultSet.getString("TileLocation");
                dty2.Filename = resultSet.getString("Filename");
                String string = resultSet.getString("SolvedQuestsRequirement");
                String string2 = resultSet.getString("SubQuestIDs");
                StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
                int[] nArray = new int[stringTokenizer.countTokens()];
                int n2 = 0;
                while (stringTokenizer.hasMoreTokens()) {
                    nArray[n2] = n = Integer.parseInt(stringTokenizer.nextToken());
                    ++n2;
                }
                dty2.SolvedQuestsRequirement = nArray;
                stringTokenizer = new StringTokenizer(string2, ",");
                nArray = new int[stringTokenizer.countTokens()];
                n2 = 0;
                while (stringTokenizer.hasMoreTokens()) {
                    nArray[n2] = n = Integer.parseInt(stringTokenizer.nextToken());
                    ++n2;
                }
                dty2.SubQuestIDs = nArray;
                arrayList.add(dty2);
            }
        }
        catch (SQLException sQLException) {
            // empty catch block
        }
        return arrayList;
    }

    public List<due> eRB() {
        ArrayList<due> arrayList = lcn.emv();
        if (!Wv) {
            return arrayList;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("select * from Quests, SimpleQuests where ID=QuestID");
        try {
            ResultSet resultSet = qnS.executeQuery(stringBuilder.toString());
            dud[] dudArray = dud.values();
            while (resultSet.next()) {
                due due2 = new due();
                due2.ID = resultSet.getInt("ID");
                due2.Filename = resultSet.getString("Filename");
                due2.Name = resultSet.getString("Name");
                due2.Type = dudArray[resultSet.getInt("Type")];
                due2.QuestStartText = resultSet.getString("QuestStartText");
                due2.QuestEndClientSpecialEffect = resultSet.getString("QuestEndClientSpecialEffect");
                due2.QuestEndSourceSpecialEffect = resultSet.getString("QuestEndSourceSpecialEffect");
                due2.QuestEndTargetSpecialEffect = resultSet.getString("QuestEndTargetSpecialEffect");
                due2.QuestEndText = resultSet.getString("QuestEndText");
                due2.QuestStartClientSpecialEffect = resultSet.getString("QuestStartClientSpecialEffect");
                due2.QuestStartSourceSpecialEffect = resultSet.getString("QuestStartSourceSpecialEffect");
                due2.QuestStartTargetSpecialEffect = resultSet.getString("QuestStartTargetSpecialEffect");
                due2.ShortDescription = resultSet.getString("ShortDescription");
                due2.TileLocation = resultSet.getString("TileLocation");
                due2.SurvivalMode = resultSet.getBoolean("SurvivalMode");
                due2.QuestFinishedText = resultSet.getString("QuestFinishedText");
                due2.UseSkillMessage = resultSet.getString("UseSkillMessage");
                due2.QuestEndNpcName = resultSet.getString("QuestEndNpcName");
                due2.ShowMarkerOnTarget = resultSet.getBoolean("ShowMarkerOnTarget");
                due2.NonAliveTarget = resultSet.getBoolean("NonAliveTarget");
                due2.QuestEndTargetMarkerCaption = resultSet.getString("QuestEndTargetMarkerCaption");
                due2.SkillName = resultSet.getString("SkillName");
                due2.QuestDiaryText = resultSet.getString("QuestDiaryText");
                due2.LinkedSpawnpoints = resultSet.getBoolean("LinkedSpawnpoints");
                due2.OverrideTextProgression = resultSet.getBoolean("OverrideTextProgression");
                due2.dB(resultSet.getBoolean("ChainQuest"));
                due2.jx(resultSet.getString("TimeLimit"));
                String string = resultSet.getString("Rewards");
                List<dtz.b> list = this.a(string, due2);
                due2.Rewards = list.toArray(new dtz.b[list.size()]);
                String string2 = resultSet.getString("TargetedResources");
                List<dtz.a> list2 = this.b(string2, due2);
                due2.TargetedResources = list2.toArray(new dtz.a[list2.size()]);
                String string3 = resultSet.getString("Markers");
                if (string3 != null) {
                    ArrayList<duc> arrayList2 = lcn.emv();
                    StringTokenizer stringTokenizer = new StringTokenizer(string3, "|");
                    if (stringTokenizer != null) {
                        while (stringTokenizer.hasMoreTokens()) {
                            String[] stringArray;
                            String string4 = stringTokenizer.nextToken();
                            if (string4 == null || (stringArray = string4.split(":")) == null || stringArray.length < 5) continue;
                            duc duc2 = new duc();
                            duc2.Caption = stringArray[0];
                            duc2.setFileName(stringArray[1]);
                            duc2.MarkerIconType = stringArray[2];
                            duc2.jw(stringArray[3]);
                            if (ljq.At(stringArray[4])) {
                                duc2.c(ljq.Au(stringArray[4]));
                            }
                            if (stringArray.length == 6) {
                                try {
                                    duc2.setVisible(Integer.parseInt(stringArray[5]) == 1);
                                }
                                catch (NumberFormatException numberFormatException) {
                                    duc2.setVisible(true);
                                }
                            } else {
                                duc2.setVisible(true);
                            }
                            arrayList2.add(duc2);
                        }
                        due2.Markers = arrayList2.toArray(new duc[arrayList2.size()]);
                    }
                }
                arrayList.add(due2);
            }
        }
        catch (SQLException sQLException) {
            // empty catch block
        }
        return arrayList;
    }

    private List<dtz.b> a(String string, dtz dtz2) {
        ArrayList<dtz.b> arrayList = lcn.emv();
        if (string == null) {
            return arrayList;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
        while (stringTokenizer.hasMoreTokens()) {
            String string2 = stringTokenizer.nextToken();
            StringTokenizer stringTokenizer2 = new StringTokenizer(string2, ":");
            while (stringTokenizer2.hasMoreTokens()) {
                String string3 = stringTokenizer2.nextToken();
                String string4 = stringTokenizer2.nextToken();
                if (string4.contains(".")) {
                    string4 = string4.substring(0, string4.indexOf("."));
                }
                int n = Integer.parseInt(string4);
                dtz.b b2 = new dtz.b(dtz2);
                b2.ResourceName = string3;
                b2.Amount = n;
                try {
                    float f2;
                    b2.Probability = f2 = Float.parseFloat(stringTokenizer2.nextToken());
                }
                catch (NoSuchElementException noSuchElementException) {
                    b2.Probability = 1.0f;
                }
                arrayList.add(b2);
            }
        }
        return arrayList;
    }

    private List<dtz.a> b(String string, dtz dtz2) {
        ArrayList<dtz.a> arrayList = lcn.emv();
        if (string == null) {
            return arrayList;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
        while (stringTokenizer.hasMoreTokens()) {
            String string2 = stringTokenizer.nextToken();
            StringTokenizer stringTokenizer2 = new StringTokenizer(string2, ":");
            while (stringTokenizer2.hasMoreTokens()) {
                String string3 = stringTokenizer2.nextToken();
                String string4 = stringTokenizer2.nextToken();
                if (string4.contains(".")) {
                    string4 = string4.substring(0, string4.indexOf("."));
                }
                int n = Integer.parseInt(string4);
                dtz.a a2 = new dtz.a(dtz2);
                a2.ResourceName = string3;
                a2.Amount = n;
                try {
                    int n2;
                    a2.LeastTargets = n2 = Integer.parseInt(stringTokenizer2.nextToken());
                }
                catch (NoSuchElementException noSuchElementException) {
                    a2.LeastTargets = -1;
                }
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    public void b(dtz dtz2) {
        boolean bl = true;
        if (dtz2.ID == 0) {
            bl = false;
        }
        if (dtz2.Type == dud.hdM) {
            this.a((dty)dtz2, bl);
        } else {
            this.a((due)dtz2, bl);
        }
    }

    private void a(dty dty2, boolean bl) {
        int n;
        int n2;
        this.a((dtz)dty2, bl);
        if (!bl) {
            dty2.ID = this.c(dty2);
        }
        assert (dty2.ID > 0);
        String string = "";
        String string2 = "";
        int[] nArray = dty2.SubQuestIDs;
        for (int i = 0; i < nArray.length; ++i) {
            if (string2.length() != 0) {
                string2 = string2 + ",";
            }
            n2 = nArray[i];
            string2 = string2 + Integer.toString(n2);
        }
        int[] nArray2 = dty2.SolvedQuestsRequirement;
        for (n2 = 0; n2 < nArray2.length; ++n2) {
            if (string.length() != 0) {
                string = string + ",";
            }
            n = nArray2[n2];
            string = string + Integer.toString(n);
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (bl) {
            stringBuilder.append("REPLACE ");
        } else {
            stringBuilder.append("INSERT ");
        }
        stringBuilder.append("into ComplexQuests (QuestID,ProwessPointsReward,FactionAvatar,OneTimeOnly,AvailabilityTimeWindow,RestartIfFailed,RestartIfCancelled,HighScoreRecording,SolvedQuestsRequirement,SubQuestIDs");
        stringBuilder.append(") VALUES (");
        stringBuilder.append("\"");
        stringBuilder.append(dty2.ID);
        stringBuilder.append("\",\"");
        stringBuilder.append(dty2.FactionAvatar);
        stringBuilder.append("\",");
        stringBuilder.append(dty2.OneTimeOnly);
        stringBuilder.append(",");
        stringBuilder.append(dty2.AvailabilityTimeWindow);
        stringBuilder.append(",");
        stringBuilder.append(dty2.RestartIfFailed);
        stringBuilder.append(",");
        stringBuilder.append(dty2.RestartIfCancelled);
        stringBuilder.append(",");
        stringBuilder.append(dty2.HighScoreRecording);
        stringBuilder.append(",\"");
        stringBuilder.append(string);
        stringBuilder.append("\",\"");
        stringBuilder.append(string2);
        stringBuilder.append("\"");
        stringBuilder.append(");");
        n = qnS.executeUpdate(stringBuilder.toString());
    }

    private void a(due due2, boolean bl) {
        Object object;
        this.a((dtz)due2, bl);
        if (!bl) {
            due2.ID = this.c(due2);
        }
        assert (due2.ID > 0);
        String string = "";
        String string2 = "";
        dtz.b[] bArray = due2.Rewards;
        for (int i = 0; i < bArray.length; ++i) {
            if (string.length() != 0) {
                string = string + ",";
            }
            dtz.b b2 = bArray[i];
            string = string + b2.ResourceName + ":" + Integer.toString(b2.Amount) + ":" + Float.toString(b2.Probability);
        }
        dtz.a[] aArray = due2.TargetedResources;
        for (int i = 0; i < aArray.length; ++i) {
            if (string2.length() != 0) {
                string2 = string2 + ",";
            }
            object = aArray[i];
            string2 = string2 + object.ResourceName + ":" + Integer.toString(object.Amount) + ":" + Integer.toString(object.LeastTargets);
        }
        String string3 = "";
        object = due2.Markers;
        if (object != null) {
            for (int i = 0; i < ((duc[])object).length; ++i) {
                duc duc2 = object[i];
                string3 = string3 + duc2.Caption + ":" + duc2.getFileName() + ":" + duc2.MarkerIconType + ":" + duc2.bAM() + ":" + duc2.av() + ":" + (duc2.isVisible() ? 1 : 0) + "|";
            }
        }
        if (string3.endsWith("|")) {
            string3 = string3.substring(0, string3.length() - 1);
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (bl) {
            stringBuilder.append("REPLACE ");
        } else {
            stringBuilder.append("INSERT ");
        }
        stringBuilder.append("into SimpleQuests (QuestID,TargetedResources,SkillName,TimeLimit,QuestEndNpcName,QuestEndTargetMarkerCaption,ShowMarkerOnTarget,NonAliveTarget,Rewards,QuestDiaryText,QuestFinishedText,UseSkillMessage,OverrideTextProgression,ChainQuest,SurvivalMode,Markers,LinkedSpawnpoints");
        stringBuilder.append(") VALUES (");
        stringBuilder.append("\"");
        stringBuilder.append(due2.ID);
        stringBuilder.append("\",");
        stringBuilder.append("\"");
        stringBuilder.append(string2);
        stringBuilder.append("\",");
        stringBuilder.append("\"");
        stringBuilder.append(due2.SkillName);
        stringBuilder.append("\",");
        stringBuilder.append("\"");
        stringBuilder.append(due2.bAO());
        stringBuilder.append("\",");
        stringBuilder.append("\"");
        stringBuilder.append(due2.QuestEndNpcName);
        stringBuilder.append("\",");
        stringBuilder.append("\"");
        stringBuilder.append(due2.QuestEndTargetMarkerCaption);
        stringBuilder.append("\",");
        stringBuilder.append(due2.ShowMarkerOnTarget);
        stringBuilder.append(",");
        stringBuilder.append(due2.NonAliveTarget);
        stringBuilder.append(",");
        stringBuilder.append("\"");
        stringBuilder.append(string);
        stringBuilder.append("\",");
        stringBuilder.append("\"");
        stringBuilder.append(due2.QuestDiaryText);
        stringBuilder.append("\",");
        stringBuilder.append("\"");
        stringBuilder.append(due2.QuestFinishedText);
        stringBuilder.append("\",");
        stringBuilder.append("\"");
        stringBuilder.append(due2.UseSkillMessage);
        stringBuilder.append("\",");
        stringBuilder.append(due2.OverrideTextProgression);
        stringBuilder.append(",");
        stringBuilder.append(due2.asP());
        stringBuilder.append(",");
        stringBuilder.append(due2.SurvivalMode);
        stringBuilder.append(",");
        stringBuilder.append("\"");
        stringBuilder.append(string3);
        stringBuilder.append("\",");
        stringBuilder.append(due2.LinkedSpawnpoints);
        stringBuilder.append(");");
        int n = qnS.executeUpdate(stringBuilder.toString());
    }

    private int c(dtz dtz2) {
        int n = -1;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("select ID from Quests where Name=\"");
        stringBuilder.append(dtz2.Name);
        stringBuilder.append("\";");
        try {
            ResultSet resultSet = qnS.executeQuery(stringBuilder.toString());
            while (resultSet.next()) {
                n = resultSet.getInt("ID");
            }
        }
        catch (SQLException sQLException) {
            // empty catch block
        }
        return n;
    }

    private void a(dtz dtz2, boolean bl) {
        StringBuilder stringBuilder = new StringBuilder();
        if (bl) {
            stringBuilder.append("REPLACE ");
        } else {
            stringBuilder.append("INSERT ");
        }
        stringBuilder.append("into Quests (Name,Type,QuestStartText,QuestStartSourceSpecialEffect,QuestStartTargetSpecialEffect,QuestStartClientSpecialEffect,QuestEndText,QuestEndSourceSpecialEffect,QuestEndTargetSpecialEffect,QuestEndClientSpecialEffect,Comment,ShortDescription,TileLocation,Filename");
        if (bl) {
            stringBuilder.append(",ID");
        }
        stringBuilder.append(") VALUES (");
        stringBuilder.append("\"");
        stringBuilder.append(dtz2.Name);
        stringBuilder.append("\",\"");
        stringBuilder.append(dtz2.Type.ordinal());
        stringBuilder.append("\",\"");
        stringBuilder.append(dtz2.QuestStartText);
        stringBuilder.append("\",\"");
        stringBuilder.append(dtz2.QuestStartSourceSpecialEffect);
        stringBuilder.append("\",\"");
        stringBuilder.append(dtz2.QuestStartTargetSpecialEffect);
        stringBuilder.append("\",\"");
        stringBuilder.append(dtz2.QuestStartClientSpecialEffect);
        stringBuilder.append("\",\"");
        stringBuilder.append(dtz2.QuestEndText);
        stringBuilder.append("\",\"");
        stringBuilder.append(dtz2.QuestEndSourceSpecialEffect);
        stringBuilder.append("\",\"");
        stringBuilder.append(dtz2.QuestEndTargetSpecialEffect);
        stringBuilder.append("\",\"");
        stringBuilder.append(dtz2.QuestEndClientSpecialEffect);
        stringBuilder.append("\",\"");
        stringBuilder.append("no comment");
        stringBuilder.append("\",\"");
        stringBuilder.append(dtz2.ShortDescription);
        stringBuilder.append("\",\"");
        stringBuilder.append(dtz2.TileLocation);
        stringBuilder.append("\",\"");
        stringBuilder.append(dtz2.Filename);
        if (bl) {
            stringBuilder.append("\",\"");
            stringBuilder.append(dtz2.ID);
        }
        stringBuilder.append("\");");
        int n = qnS.executeUpdate(stringBuilder.toString());
    }

    public int afR(int n) {
        StringBuilder stringBuilder;
        int n2 = 0;
        if (!Wv) {
            return -1;
        }
        try {
            stringBuilder = new StringBuilder();
            stringBuilder.append("DELETE from Quests WHERE ID=" + Integer.toString(n));
            n2 += qnS.executeUpdate(stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("DELETE from ComplexQuests WHERE QuestID=" + Integer.toString(n));
            n2 += qnS.executeUpdate(stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("DELETE from SimpleQuests WHERE QuestID=" + Integer.toString(n));
        }
        catch (SQLException sQLException) {
            sQLException.printStackTrace();
            return -1;
        }
        return n2 += qnS.executeUpdate(stringBuilder.toString());
    }

    public lfs<Map<dty, List<due>>, String> eRC() {
        lfs<Map<dty, List<due>>, String> lfs2 = new lfs<Map<dty, List<due>>, String>();
        lfs2.reX = lcn.emw();
        lfs2.reY = "";
        if (!Wv) {
            return lfs2;
        }
        ArrayList arrayList = lcn.emv();
        Map<Integer, due> map = this.eRD();
        List<dty> list = this.eRA();
        for (dty dty2 : list) {
            if (dty2.Filename == null || dty2.Filename.trim().isEmpty()) {
                lfn.b(5, this.getClass().getSimpleName(), "getQuests() Complex Quest : " + dty2.Name + " does not have a valid filename.");
                lfs2.reY = lfs2.reY + dty2.Name + " does not have a valid filename.\n";
                continue;
            }
            if (arrayList.contains(dty2.Filename)) {
                lfn.b(5, this.getClass().getSimpleName(), "getQuests() Complex Quest filename : " + dty2.Name + " is already in use from another quest.");
                lfs2.reY = lfs2.reY + dty2.Filename + " filename is already in use from another quest.\n";
                continue;
            }
            int[] nArray = dty2.SubQuestIDs;
            if (nArray == null || nArray.length == 0) {
                lfn.b(5, this.getClass().getSimpleName(), "getQuests() Complex Quest : " + dty2.Filename + " does not have subquests and it will not be exported to quest index file.");
                lfs2.reY = lfs2.reY + dty2.Name + " does not have subquests and it will not be exported to quest index file.\n";
                continue;
            }
            ArrayList<due> arrayList2 = lcn.emv();
            for (int n : nArray) {
                due due2 = map.get(n);
                if (due2 == null) {
                    lfn.b(5, this.getClass().getSimpleName(), "getQuests() Complex Quest : " + dty2.Filename + " has a simple quest with index : " + n + " which does not have a valid definition object.");
                    lfs2.reY = lfs2.reY + dty2.Name + " has a simple quest with index : " + n + " which does not have a valid definition object.\n";
                    break;
                }
                if (due2.Filename == null || due2.Filename.trim().isEmpty()) {
                    lfn.b(5, this.getClass().getSimpleName(), "getQuests() Complex Quest : " + dty2.Name + " has a simple quest with name : " + due2.Name + " which does not have a valid filename.");
                    lfs2.reY = lfs2.reY + dty2.Name + " has a simple quest with name : " + due2.Name + " which does not have a valid filename.\n";
                    break;
                }
                if (arrayList.contains(due2.Filename)) {
                    lfn.b(5, this.getClass().getSimpleName(), "getQuests() Complex Quest filename : " + due2.Name + " is already in use from another quest.");
                    lfs2.reY = lfs2.reY + due2.Filename + " filename is already in use from another quest.\n";
                    break;
                }
                arrayList2.add(due2);
            }
            if (arrayList2.size() != nArray.length) continue;
            ((Map)lfs2.reX).put(dty2, arrayList2);
        }
        return lfs2;
    }

    public Map<Integer, due> eRD() {
        Map<Integer, due> map = lcn.emw();
        if (!Wv) {
            return map;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("select * from Quests, SimpleQuests where ID=QuestID");
        try {
            ResultSet resultSet = qnS.executeQuery(stringBuilder.toString());
            dud[] dudArray = dud.values();
            while (resultSet.next()) {
                due due2 = new due();
                due2.ID = resultSet.getInt("ID");
                due2.Filename = resultSet.getString("Filename");
                due2.Name = resultSet.getString("Name");
                due2.Type = dudArray[resultSet.getInt("Type")];
                due2.QuestStartText = resultSet.getString("QuestStartText");
                due2.QuestEndClientSpecialEffect = resultSet.getString("QuestEndClientSpecialEffect");
                due2.QuestEndSourceSpecialEffect = resultSet.getString("QuestEndSourceSpecialEffect");
                due2.QuestEndTargetSpecialEffect = resultSet.getString("QuestEndTargetSpecialEffect");
                due2.QuestEndText = resultSet.getString("QuestEndText");
                due2.QuestStartClientSpecialEffect = resultSet.getString("QuestStartClientSpecialEffect");
                due2.QuestStartSourceSpecialEffect = resultSet.getString("QuestStartSourceSpecialEffect");
                due2.QuestStartTargetSpecialEffect = resultSet.getString("QuestStartTargetSpecialEffect");
                due2.ShortDescription = resultSet.getString("ShortDescription");
                due2.TileLocation = resultSet.getString("TileLocation");
                due2.SurvivalMode = resultSet.getBoolean("SurvivalMode");
                due2.QuestFinishedText = resultSet.getString("QuestFinishedText");
                due2.UseSkillMessage = resultSet.getString("UseSkillMessage");
                due2.QuestEndNpcName = resultSet.getString("QuestEndNpcName");
                due2.ShowMarkerOnTarget = resultSet.getBoolean("ShowMarkerOnTarget");
                due2.NonAliveTarget = resultSet.getBoolean("NonAliveTarget");
                due2.QuestEndTargetMarkerCaption = resultSet.getString("QuestEndTargetMarkerCaption");
                due2.SkillName = resultSet.getString("SkillName");
                due2.QuestDiaryText = resultSet.getString("QuestDiaryText");
                due2.LinkedSpawnpoints = resultSet.getBoolean("LinkedSpawnpoints");
                due2.OverrideTextProgression = resultSet.getBoolean("OverrideTextProgression");
                due2.dB(resultSet.getBoolean("ChainQuest"));
                due2.jx(resultSet.getString("TimeLimit"));
                String string = resultSet.getString("Rewards");
                List<dtz.b> list = this.a(string, due2);
                due2.Rewards = list.toArray(new dtz.b[list.size()]);
                String string2 = resultSet.getString("TargetedResources");
                List<dtz.a> list2 = this.b(string2, due2);
                due2.TargetedResources = list2.toArray(new dtz.a[list2.size()]);
                String string3 = due2.getDisplayName();
                String string4 = resultSet.getString("Markers");
                if (string4 != null) {
                    ArrayList<duc> arrayList = lcn.emv();
                    StringTokenizer stringTokenizer = new StringTokenizer(string4, "|");
                    if (stringTokenizer != null) {
                        while (stringTokenizer.hasMoreTokens()) {
                            String[] stringArray;
                            String string5 = stringTokenizer.nextToken();
                            if (string5 == null || (stringArray = string5.split(":")) == null || stringArray.length < 5) continue;
                            duc duc2 = new duc();
                            duc2.Caption = stringArray[0];
                            duc2.setFileName(stringArray[1]);
                            duc2.MarkerIconType = stringArray[2];
                            duc2.jw(stringArray[3]);
                            if (ljq.At(stringArray[4])) {
                                duc2.c(ljq.Au(stringArray[4]));
                            }
                            if (stringArray.length == 6) {
                                try {
                                    duc2.setVisible(Integer.parseInt(stringArray[5]) == 1);
                                }
                                catch (NumberFormatException numberFormatException) {
                                    duc2.setVisible(true);
                                }
                            } else {
                                duc2.setVisible(true);
                            }
                            arrayList.add(duc2);
                        }
                        due2.Markers = arrayList.toArray(new duc[arrayList.size()]);
                    }
                }
                map.put(due2.ID, due2);
            }
        }
        catch (SQLException sQLException) {
            // empty catch block
        }
        return map;
    }
}

