/*
 * Decompiled with CFR.
 */
public class lvz
extends lvx {
    private static final lvz tck = new lvz();
    @lok(value="$(Holding) Build Map")
    @lpl(value="String to retrieve the title of a build map for a clan holding")
    public static final lox tcl = tck.a("HoldingBuildMapTitle", lvz.Bp("Holding"));
    @lok(value="$(StructureResource.NameSingular)")
    @lpl(value="String to retrieve the display name of a clan holding structure resource")
    public static final lox tcm = tck.a("StructureDisplayName", lvz.Bl("StructureResource"));
    @lok(value="$(StructureResource.Description)")
    @lpl(value="String to retrieve the description of a clan holding structure resource")
    public static final lox tcn = tck.a("StructureDescription", lvz.Bl("StructureResource"));
    @lok(value="Cost: $(CostAmount) $(CostResource.Name$(CostAmount.Plurality))")
    @lpl(value="String to retrieve the cost of building/upgrading the clan holding structure")
    public static final lox tco = tck.a("StructureCost", lvz.Bh("CostAmount"), lvz.Bl("CostResource"));
    @lok(value="Build $(StructureResource.NameSingular)")
    @lpl(value="String to retrieve the build action for a clan holding structure resource")
    public static final lox tcp = tck.a("BuildAction", lvz.Bl("StructureResource"));
    @lok(value="Upgrade $(StructureResource.NameSingular)")
    @lpl(value="String to retrieve the upgrade action for a clan holding structure resource")
    public static final lox tcq = tck.a("UpgradeAction", lvz.Bl("StructureResource"));
    @lok(value="Status:")
    @lpl(value="String to display above the status values of a selected built resource")
    public static final lox tcr = tck.BC("BuiltValuesTitle");
    @lok(value="You must first build:")
    @lpl(value="Displayed for a selected unbuilt structed above the list of structures that must be built first, before the selected structure can be built")
    public static final lox tcs = tck.BC("PrerequisitesTitle");
    @lok(value="Health:")
    @lpl(value="String to prefix the health values in the description of selected built structures")
    public static final lox tct = tck.BC("HealthString");
    @lok(value="Enabled")
    @lpl(value="String to display for enabled structures in the description of selected built structures")
    public static final lox tcu = tck.BC("StateStringEnabled");
    @lok(value="Disabled")
    @lpl(value="String to display for disabled structures in the description of selected built structures")
    public static final lox tcv = tck.BC("StateStringDisabled");
    @lok(value="Level:")
    @lpl(value="String to prefix the upgrade level for upgradable structures in the description of selected built structures")
    public static final lox tcw = tck.BC("UpgradeLevelString");

    protected lvz(String string) {
        super("CityBuilding." + string);
    }

    private lvz() {
        super("CityBuilding");
    }
}

