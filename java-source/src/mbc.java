/*
 * Decompiled with CFR.
 */
public class mbc
extends may {
    private static final mbc uhL = new mbc();
    @lok(value="An error occurred while processing the structure modification request!!!")
    @lpl(value="Displayed when an unhandled, non-specific, error occurrs while processing a holding structure modification request")
    public static final lox rXy = uhL.BC("GenericError");
    @lok(value="You cannot modify the clan's holding structures as you are not a clan member")
    @lpl(value="Displayed when a request to modify a clan's holding structure fails because the requesting player is not, or is no longer, a member of the clan")
    public static final lox ubl = uhL.BC("RequestingPlayerNotClanMember");
    @lok(value="You do not have the required permission to modify the clan's holding structures")
    @lpl(value="Displayed when a request to modify a clan's holding structure fails because the requesting player does not have the required permission")
    public static final lox ubr = uhL.BC("PermissionDenied");
    @lok(value="Your clan does not own the holding containing the structure")
    @lpl(value="Displayed when a request to modify a clan's holding structure fails because the clan is not, or is no longer, the owners of the holding")
    public static final lox uaB = uhL.BC("ClanDoesNotOwnHolding");
    @lok(value="The structure is currently being modified by another player")
    @lpl(value="Displayed when a request to modify a clan's holding structure fails because the structure is currently in the process of being modified")
    public static final lox uhM = uhL.BC("StructureAlreadyBeingModified");
    @lok(value="Another structure in the holding is currently being modified by another player")
    @lpl(value="Displayed when a request to modify a clan's holding structure fails because another structure in the holding is currently in the process of being modified")
    public static final lox uhN = uhL.BC("HoldingAlreadyBeingModified");
    @lok(value="You do not have enough $(BuildingResource.NamePlural), you need $(MissingResourceCount) more $(BuildingResource.Name$(MissingResourceCount.Plurality))")
    @lpl(value="Displayed when a request to modify a clan's holding structure fails because the requesting player/clan does not have the appropriate resources to perform the operation")
    public static final lox uhE = uhL.a("NotEnoughResources", mbc.Bl("BuildingResource"), mbc.Bh("MissingResourceCount"));
    @lok(value="You cannot modify structures in a holding that is in an active conquest challenge")
    @lpl(value="Displayed when a request to modify a clan's holding structure fails because the holding containing the structure is currently vulnerable, due to an active conquest challenge, and modification of structures is not allowed")
    public static final lox uhO = uhL.BC("CannotModifyStructuresInVulnerableHolding");
    @lok(value="Indicated structure cannot be located in the holding")
    @lpl(value="Displayed when a request to modify a clan's holding structure fails because the indicated structure cannot be located in the holding")
    public static final lox uhP = uhL.BC("InvalidStructureIdentifier");
    @lok(value="You cannot modify this structure again yet, please wait $(WaitTime) before trying again")
    @lpl(value="Displayed when a request to modify a clan's holding structure fails because the structure has already been modified too recently to modify it again")
    public static final lox uhQ = uhL.a("TooSoonToModifyStructure", mbc.Bi("WaitTime"));
    @lok(value="This structure has already been built")
    @lpl(value="Displayed when a request to modify a clan's holding structure fails because a build request was received for a structure that is already built")
    public static final lox uhR = uhL.BC("StructureAlreadyBuilt");
    @lok(value="You must build '$(MissingStructureResource.NameSingular)' before you can build this structure")
    @lpl(value="Displayed when a request to modify a clan's holding structure fails because a build request was received for a structure whose prerequisite structures have not been built")
    public static final lox uhS = uhL.a("StructureCannotBeBuiltBeforePrerequisite", mbc.Bl("MissingStructureResource"));
    @lok(value="You must build '$(MissingStructureResource.NameSingular)' before you can upgrade this structure")
    @lpl(value="Displayed when a request to modify a clan's holding structure fails because an upgrade request was received for a structure whose prerequisite strucutures have not been built")
    public static final lox uhT = uhL.a("StructureCannotBeUpgradedBeforePrerequisite", mbc.Bl("MissingStructureResource"));
    @lok(value="This structure is already at its maximum upgrade level")
    @lpl(value="Displayed when a request to modify a clan's holding structure fails because an upgrade request was received for a structure that is already at its maximum upgrade level")
    public static final lox uhU = uhL.BC("StructureCannotBeUpgradedFurther");
    @lok(value="You cannot upgrade a structure while it is disabled")
    @lpl(value="Displayed when a request to modify a clan's holding structure fails because an upgrade request was received for a structure that is currently disabled")
    public static final lox uhV = uhL.BC("StructureCannotBeUpgradedWhileDisabled");
    @lok(value="You cannot upgrade a structure while it is damaged, repair it first!")
    @lpl(value="Displayed when a request to modify a clan's holding structure fails because the structure to upgrade is not a maximum health")
    public static final lox uhW = uhL.BC("StructureCannotBeUpgradedWhileDamaged");
    @lok(value="You cannot downgrade this structure further")
    @lpl(value="Displayed when a request to modify a clan's holding structure fails because a downgrade request was received for a structure that is already at its lowest upgrade level")
    public static final lox uhX = uhL.BC("StructureCannotBeDowngradedFurther");
    @lok(value="The structure is already destroyed")
    @lpl(value="Displayed when a request to modify a clan's holding structure fails because a destroy request was received for a strucutre that is not built")
    public static final lox uhY = uhL.BC("StructureAlreadyDestroyed");
    @lok(value="The structure cannot currently be built")
    @lpl(value="Displayed when a request to modify a clan's holding structure fails because the request is to build a strucuture that cannot be built")
    public static final lox uhZ = uhL.BC("CannotBuildStructureThatIsNotBuildable");
    @lok(value="Cannot upgrade a structure that is not yet built")
    @lpl(value="Displayed when a request to modify a clan's holding structure fails because the request is to upgrade a structure that has not been built")
    public static final lox uia = uhL.BC("CannotUpgradeStructureThatIsNotBuilt");
    @lok(value="Cannot downgrade a structure that is not yet built")
    @lpl(value="Displayed when a request to modify a clan's holding structure fails because the request is to downgrade a structure that has not been built")
    public static final lox uib = uhL.BC("CannotDowngradeStructureThatIsNotBuilt");
    @lok(value="Cannot destroy a structure that is not yet built")
    @lpl(value="Displayed when a request to modify a clan's holding structure fails because the request is to destroy a structure that has not been built")
    public static final lox uic = uhL.BC("CannotDestroyStructureThatIsNotBuilt");
    @lok(value="Structure modification request completed successfully")
    @lpl(value="Displayed when a request to modify a clan's holding structure is completed successfully")
    public static final lox uid = uhL.BC("StructureSuccessfullyModified");
    @lok(value="Cannot build the while holding is in an active conquest challenge")
    @lpl(value="Displayed when a request to modify a clan's holding structure fails because the holding is currently being challenged")
    public static final lox uie = uhL.BC("CannotBuildWhileHoldingIsInConquest");
    @lok(value="Cannot build while the holding is protected from damage")
    @lpl(value="Displayed when a request to modify a clan's holding structure fails because the holding is currently protected from damage")
    public static final lox uif = uhL.BC("CannotBuildWhileHoldingIsProtectedFromDamage");

    protected mbc(String string) {
        super("ModificationOperationResults." + string);
    }

    private mbc() {
        super("ModificationOperationResults");
    }
}

