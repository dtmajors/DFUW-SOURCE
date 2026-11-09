/*
 * Decompiled with CFR.
 */
public class lza
extends lvn {
    private static final lza tNb = new lza();
    @lok(value="Village Requisition")
    @lpl(value="Displayed as the title of the village requisitioning window")
    public static final lox sXP = tNb.BC("WindowTitle");
    @lok(value="$(Resource.NameSingular)")
    @lpl(value="Displayed as the title of the levy collector requisitioning window")
    public static final lox tNc = tNb.a("WindowTitleLevyCollector", lza.Bl("Resource"));
    @lok(value="Clan")
    @lpl(value="Displayed as the title of the owner clan name display in the village requisitioning window")
    public static final lox tNd = tNb.BC("ClanTitle");
    @lok(value="Village")
    @lpl(value="Displayed as the title of the village name display in the village requisitioning window")
    public static final lox tNe = tNb.BC("VillageTitle");
    @lok(value="Holding")
    @lpl(value="Displayed as the title of the holding name display in the requisitioning window")
    public static final lox tNf = tNb.BC("HoldingTitle");

    private lza() {
        super("VillageRequisitioning");
    }

    protected lza(String string) {
        super("VillageRequisitioning." + string);
    }
}

