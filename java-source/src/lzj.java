/*
 * Decompiled with CFR.
 */
public class lzj
extends lzh {
    private static final lzj tWh = new lzj();
    @lok(value="$(AccessLevel) $(PlayerName) has connected")
    @lpl(value="Displayed to an admin/GM when a client of lower or equal access-level connects to the game")
    public static final lox tWi = tWh.a("ClientConnect", lzj.b("AccessLevel", hc.class), lzj.Bk("PlayerName"));
    @lok(value="$(AccessLevel) $(PlayerName) has disconnected")
    @lpl(value="Displayed to an admin/GM when a client of lower or equal access-level disconnects from the game")
    public static final lox tWj = tWh.a("ClientDisconnect", lzj.b("AccessLevel", hc.class), lzj.Bk("PlayerName"));
    @lok(value="$(AccessLevel) $(PlayerName) is online")
    @lpl(value="Displayed to an admin/GM when they connect to the game, to list all currently online admins/GMs with lower or equal access level")
    public static final lox tWk = tWh.a("OnlineGMsListEntry", lzj.b("AccessLevel", hc.class), lzj.Bk("PlayerName"));
    @lok(value="Access Denied!... Your access level is too low to perform this function")
    @lpl(value="Displayed to an admin/GM who attempts to perform an admin/GM function that requires a higher access level than the one the admin/GM has been granted")
    public static final lox tWl = tWh.BC("AccessDenied");
    @lok(value="The message $(MessageClassName) returned a general error")
    @lpl(value="Displayed to administrators when an executed command returns a general message error")
    public static final lox tWm = tWh.a("MessageInputError", lzj.Bk("MessageClassName"));
    @lok(value="The message $(MessageClassName) returned an unknown result")
    @lpl(value="Displayed to administrators when an executed command returns an unknown result")
    public static final lox tWn = tWh.a("MessageUnknownResult", lzj.Bk("MessageClassName"));
    @lok(value="You cannot player as a monster while you are a member of a party")
    @lpl(value="Displayed to administrators when they attempt to switch to playing as a monster, but they are a member of a party")
    public static final lox tWo = tWh.BC("CannotPlayerAsMonsterDueToParty");
    @lok(value="2D rendering engine response result: $(Result)")
    @lpl(value="Displayed to show the result of a 2D rendering request to the rendering engine")
    public static final lox tWp = tWh.a("RenderingEngine2DResponseResult", lzj.Bk("Result"));
    @lok(value="Attribute Harvester Started")
    @lpl(value="Displayed when the attribute harvester tool has been started")
    public static final lox tWq = tWh.BC("AttributeHarvesterToolStarted");
    @lok(value="Resource files verified!")
    @lpl(value="Displayed when the resource file verification succeeds")
    public static final lox tWr = tWh.BC("VerifyResourceFilesSuccess");
    @lok(value="One or more resource files failed to verify!")
    @lpl(value="Displayed when the resource file verification fails")
    public static final lox tWs = tWh.BC("VerifyResourceFilesFailed");
    @lok(value="Camera Position: $(Position) - Camera Rotation: $(Rotation)")
    @lpl(value="Displayed to show the current camera position and rotation")
    public static final lox tWt = tWh.a("CameraPositionDisplay", lzj.Bk("Position"), lzj.Bk("Rotation"));
    @lok(value="The danger-level at your current position is $(DangerLevel)")
    @lpl(value="Displayed to an admin/GM when they request the danger-level value of their current position")
    public static final lox tWu = tWh.a("DangerLevelPrint", lzj.b("DangerLevel", lmf.class));
    @lok(value="Admin Message: $(MessageText)")
    @lpl(value="Displayed to all players in the area around an admin/GM when they send an area message")
    public static final lox tWv = tWh.a("AreaMessage", lzj.Bk("MessageText"));
    @lok(value="GM Message from $(GMName): $(MessageText)")
    @lpl(value="Displayed to a player when an admin/GM sends them a direct message")
    public static final lox tWw = tWh.a("GMMessage", lzj.Bk("GMName"), lzj.Bk("MessageText"));
    @lok(value="Admin Message: $(MessageText)")
    @lpl(value="Displayed to all online players when an admin issues a global message to the server")
    public static final lox tWx = tWh.a("AdminMessage", lzj.Bk("MessageText"));
    @lok(value="Invalid Game Master Operation Type: $(OperationType)")
    @lpl(value="Displayed to an admin/GM when an invalid game master operation type is received")
    public static final lox tWy = tWh.a("InvalidGameMasterOperationType", lzj.Bh("OperationType"));
    @lok(value="Nothing Targeted")
    @lpl(value="Displayed when a target-specific command/action is attempted, but no target object can be found")
    public static final lox tWz = tWh.BC("NoTargetFound");
    @lok(value="Invalid Coordinates: $(CoordinateString)")
    @lpl(value="Displayed when an coordinate-specific command/action is attempted, but the entered coordinates are invalid")
    public static final lox tWA = tWh.a("InvalidCoordinates", lzj.Bk("CoordinateString"));
    @lok(value="Invalid TileID: $(TileID)")
    @lpl(value="Displayed when a tile-specific command/action is attempted, but the entered tile ID is invalid")
    public static final lox tWB = tWh.a("InvalidTileID", lzj.Bk("TileID"));
    @lok(value="Invalid Special Effect Name: $(SFXName)")
    @lpl(value="Displayed when a SFX-specific command/action is attempted, but the entered sepcial effect name is invalid")
    public static final lox tWC = tWh.a("InvalidSFXName", lzj.Bk("SFXName"));
    @lok(value="No request found for received response")
    @lpl(value="Displayed to an admin/GM when a response is received for a command, but the command request cannot be found")
    public static final lox tWD = tWh.BC("NoRequestFoundForReceivedResponse");
    @lok(value="The servers will shut down in $(CountDown) minute(s), for maintenance. Estimated downtime: $(DownTimeLength) hour(s)")
    @lpl(value="Displayed to all online players to announce that the servers will shutdown for maintenance")
    public static final lox tWE = tWh.a("ServerDownTimeMessageMaintenance", lzj.Bh("CountDown"), lzj.Bh("DownTimeLength"));
    @lok(value="The servers will shut down in $(CountDown) minute(s), for patching. Estimated downtime: $(DownTimeLength) hour(s)")
    @lpl(value="Displayed to all online players to announce that the servers will shutdown to apply a patch")
    public static final lox tWF = tWh.a("ServerDownTimeMessagePatch", lzj.Bh("CountDown"), lzj.Bh("DownTimeLength"));
    @lok(value="Your help request has been received. If your request requires a response or further information, a game master will contact you. Please note that during periods of high request volume, it may take some time before a game master is able to process your request.")
    @lpl(value="Displayed to a player when they submit a request for GM assistance")
    public static final lox tWG = tWh.BC("HelpRequestReceived");
    @lok(value="Your report has been received, and will be investigated by a game master. Please note that game masters can not inform you of the status or result of player investigations, and will only contact you if further information is required. Thank you for your assistance.")
    @lpl(value="Displayed to a player when they submit a GM report")
    public static final lox tWH = tWh.BC("ReportReceived");
    @lok(value="$(PlayerName) : $(Message).")
    @lpl(value="Displayed to all gms when a player submits a message with offensive language")
    public static final lox tWI = tWh.a("MessageFiltered", lzj.Bk("PlayerName"), lzj.Bk("Message"));

    protected lzj(String string) {
        super("Admin." + string);
    }

    private lzj() {
        super("Admin");
    }
}

