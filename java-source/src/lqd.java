/*
 * Decompiled with CFR.
 */
public class lqd
extends lpa {
    private static final lqd rWY = new lqd();
    @lok(value="Player '$(PlayerName)' not found near you.")
    @lpl(value="Shown to the gm when he types a gm_duel_team_add_player and the player is not found")
    public static final lox rWZ = rWY.a("DuelTeamPlayerNoFound", lqd.Bk("PlayerName"));
    @lok(value="Duel Team must be 0 or 1")
    @lpl(value="Shown to the gm when he types a gm_duel_team_add_player entering wrong team number")
    public static final lox rXa = rWY.BC("DuelTeamInvalidTeam");
    @lok(value="$(PlayerName)'s inventory has '$(ItemCount)' items.")
    @lpl(value="Shown to the user when he types a gm_player_list_item command")
    public static final lox rXb = rWY.a("InventoryItemCount", lqd.Bk("PlayerName"), lqd.Bh("ItemCount"));
    @lok(value="'$(Resource.IDResourceName)' , '$(Quantity)'")
    @lpl(value="Shown to the user when he types a gm_player_list_item command")
    public static final lox rXc = rWY.a("InventoryItem", lqd.Bl("Resource"), lqd.Bh("Quantity"));
    @lok(value="Command '$(Command)' not found.")
    @lpl(value="Shown to the user when he types an invalid command in the console")
    public static final lox rXd = rWY.a("CommandNotFound", lqd.Bk("Command"));
    @lok(value="$(Command) could not be executed")
    @lpl(value="Shown to the user when a valid console command failed for an unknown reason")
    public static final lox rXe = rWY.a("CommandHandlerFailed", lqd.Bk("Command"));
    @lok(value="You do not have access to execute $(Command)")
    @lpl(value="Shown to the user when he attempts to execute a console command that he requires a higher access level")
    public static final lox rXf = rWY.a("NoAccessToCommand", lqd.Bk("Command"));
    @lok(value="Incorrect number of arguments given to $(Command)")
    @lpl(value="Shown to the user when he passes too many or few arguments to a console command")
    public static final lox rXg = rWY.a("IncorrectNumberOfArguments", lqd.Bk("Command"));
    @lok(value="$(Command) arguments has unbalanced quotes")
    @lpl(value="Shown to the user when he passes console command arguments with unbalanced \" or ' in the arguments")
    public static final lox rXh = rWY.a("IncorrectArgumentQuotes", lqd.Bk("Command"));
    @lok(value="The $(Command) argument '$(ArgumentValue)' is not of the expected type '$(ExpectedType)'")
    @lpl(value="Shown to the user when the passed argument to a console command cannot be interpreted as the expected type, such as e.g. passing text where a number is expected")
    public static final lox rXi = rWY.a("InvalidArgumentType", lqd.Bk("Command"), lqd.Bk("ArgumentValue"), lqd.b("ExpectedType", mhs.class));
    @lok(value="The $(Command) argument '$(ArgumentValue)' is not valid")
    @lpl(value="Shown to the user when a passed argument to a console command is invalid for the command")
    public static final lox rXj = rWY.a("InvalidArgumentValue", lqd.Bk("Command"), lqd.Bk("ArgumentValue"));
    @lok(value="$(Command) is not yet implemented")
    @lpl(value="Shown to the user when he attempts to execute a console command that is defined but not yet supported")
    public static final lox rXk = rWY.a("CommandNotImplemented", lqd.Bk("Command"));
    @lok(value="$(Command) can only be executed by logged in players")
    @lpl(value="Shown to the GM/Admin when he attempts to execute a console command via an administrative interface, but the command requires the GM/Admin to be logged in with the game client.")
    public static final lox rXl = rWY.a("PlayerNotOnline", lqd.Bk("Command"));
    @lok(value="$(Command) can only be executed by players which are members is a clan")
    @lpl(value="Shown to the GM/Admin when he attempts to execute a console command via an administrative interface, but the command requires the GM/Admin to be in a clan.")
    public static final lox rXm = rWY.a("NotInClan", lqd.Bk("Command"));
    @lok(value="$(Command) completed.")
    @lpl(value="Shown to the user when a console command has completed executing, and no more results will be received")
    public static final lox rXn = rWY.a("CommandCompleted", lqd.Bk("Command"));
    @lok(value="Name $(ResourceName) is not a valid resource name.")
    @lpl(value="Shown to the user when the resource name passed to a console command doesn't exist")
    public static final lox rXo = rWY.a("InvalidResourceName", lqd.Bk("ResourceName"));
    @lok(value="Failed to load file '$(Filename)'.")
    @lpl(value="Shown to the user when he attempts to execute a non-existing console command script")
    public static final lox rXp = rWY.a("FailedToLoadScriptFile", lqd.Bk("Filename"));
    @lok(value="Command failed: $(Error)")
    @lpl(value="Shown to the user when a command failed with an error code")
    public static final lox rXq = rWY.a("CommandFailedWithError", lqd.Bk("Command"), lqd.Bh("Error"));
    @lok(value="$(Command) value is already set to $(ArgumentValue)")
    @lol(value="Response from developer command")
    public static final lox rXr = rWY.a("CommandValueAlreadySet", lqd.Bk("Command"), lqd.Bk("ArgumentValue"));
    @lok(value="$(Command) value has been set to $(ArgumentValue)")
    @lol(value="Response from developer command")
    public static final lox rXs = rWY.a("CommandValueSet", lqd.Bk("Command"), lqd.Bk("ArgumentValue"));
    @lok(value="Village timer distribution already in progress!")
    @lol(value="Response from developer command")
    public static final lox rXt = rWY.BC("CommandVillageTimersDistributionInProgress");
    @lok(value="Incorrect password for village timer distribution command!")
    @lol(value="Response from developer command")
    public static final lox rXu = rWY.BC("CommandVillageTimersDistributionIncorrectPassword");
    @lok(value="Village $(Village) timer distribution report - Success: $(Success) - Alteration Applied: $(Alteration)")
    @lol(value="Response from developer command")
    public static final lox rXv = rWY.a("CommandVillageTimersDistributionInVillageResponse", lqd.Bq("Village"), lqd.Bj("Success"), lqd.Bi("Alteration"));
    @lok(value="Village timer distribution command completed!")
    @lol(value="Response from developer command")
    public static final lox rXw = rWY.BC("CommandVillageTimersDistributionCompleted");
    @lok(value="No Villages Found!")
    @lol(value="Response from developer command")
    public static final lox rXx = rWY.BC("CommandVillageTimersDistributionNoVillages");
    @lok(value="Error: $(x)")
    @lol(value="Response from developer command")
    public static final lox rXy = rWY.a("GenericError", lqd.Bk("x"));

    private lqd() {
        super("Console");
    }

    protected lqd(String string) {
        super("Console." + string);
    }
}

