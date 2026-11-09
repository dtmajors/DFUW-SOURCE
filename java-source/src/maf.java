/*
 * Decompiled with CFR.
 */
public class maf
extends lzh {
    private static final maf Instance = new maf();
    @lok(value="No player found with the name $(PlayerName)")
    @lpl(value="Displayed to a player when they try to send a private message to another player, but the other player cannot be found")
    public static final lox PlayerNotFound = Instance.a("PlayerNotFound", maf.Bk("PlayerName"));
    @lok(value="You are not a member of a party")
    @lpl(value="Displayed when a player tries to forward a chat message to the party chat, but is not a member of a party")
    public static final lox NotPartyMember = Instance.BC("NotPartyMember");
    @lok(value="You are not a member of a clan")
    @lpl(value="Displayed when a player tries to forward a chat message to the clan chat, but is not a member of a clan")
    public static final lox NotClanMember = Instance.BC("NotClanMember");
    @lok(value="Emote Command: $(Command)")
    @lpl(value="Displayed for each available emote command in a list of available emote commands")
    public static final lox EmoteCommandListEntry = Instance.a("EmoteCommandListEntry", maf.Bk("Command"));
    @lok(value="Help: No command starts with $(Parameter)")
    @lpl(value="Displayed when the chat help system cannot find a the command that the player requested help with")
    public static final lox HelpCommandNotFound = Instance.a("HelpCommandNotFound", maf.Bk("Parameter"));
    @lok(value="$(CommandName): $(Description)")
    @lol(value="What is there to translate!!!... The ':'???")
    public static final lox HelpCommandDescription = Instance.a("HelpCommandDescription", maf.Bk("CommandName"), maf.Bk("Description"));
    @lok(value="\tNo Parameters")
    @lpl(value="Displayed when the chat command that the player requested help for has no parameters to describe")
    public static final lox HelpCommandNoParameters = Instance.BC("HelpCommandNoParameters");
    @lok(value="\tParameters:")
    @lpl(value="Displayed before the list of descriptions of parameters for the command that the player requested help for")
    public static final lox HelpCommandParametersHeader = Instance.BC("HelpCommandParametersHeader");
    @lok(value="\t\t$(ParameterName) ($(ParameterType)): $(ParameterDescription)")
    @lol(value="Try to if you want ;oP")
    public static final lox HelpCommandParameter = Instance.a("HelpCommandParameter", maf.Bk("ParameterName"), maf.Bk("ParameterType"), maf.Bk("ParameterDescription"));
    @lok(value="\t\t$(ParameterName) [Optional] ($(ParameterType)): $(ParameterDescription)")
    @lpl(value="Displayed as the description of an optional parameter in the list of parameters for a command that the player requested help for")
    public static final lox HelpCommandParameterOptional = Instance.a("HelpCommandParameterOptional", maf.Bk("ParameterName"), maf.Bk("ParameterType"), maf.Bk("ParameterDescription"));
    @lok(value="Help:\t$(TheHelpLine)")
    @lpl(value="Displays the help for a command!")
    public static final lox HelpCommandHelpLine = Instance.a("HelpCommandHelpLine", maf.Bk("TheHelpLine"));
    @lok(value="(error) $(Message)")
    @lpl(value="Dispalayed as error output from the chat command interpreter, when there is no 'context'")
    public static final lox ChatCommandError = Instance.a("ChatCommandError", maf.Bk("Message"));
    @lok(value="(error) $(Message): $(Context)")
    @lpl(value="Dispalayed as error output from the chat command interpreter, when there is 'context'")
    public static final lox ChatCommandErrorWithContext = Instance.a("ChatCommandErrorWithContext", maf.Bk("Message"), maf.Bk("Context"));
    @lok(value="Ignore list is empty")
    @lpl(value="Displayed when the player's chat ingnore list is empty")
    public static final lox IgnoreListEmpty = Instance.BC("IgnoreListEmpty");
    @lok(value="You have $(Count) ignores")
    @lpl(value="Displayed as the header for the list of a player's chat ignores")
    public static final lox IgnoreListHeader = Instance.a("IgnoreListHeader", maf.Bh("Count"));
    @lok(value="$(Type) from $(PlayerName) with reason: $(Reason)")
    @lpl(value="Displayed as a single entry in a player's list of chat ignores")
    public static final lox IgnoreListEntry = Instance.a("IgnoreListEntry", maf.Bk("Type"), maf.Bk("PlayerName"), maf.Bk("Reason"));
    @lok(value="Added $(Type) ignore of $(PlayerName) with reason: $(Reason)")
    @lpl(value="Displayed when a new entry is added to a player's chat ignores")
    public static final lox IgnoreListEntryAdded = Instance.a("IgnoreListEntryAdded", maf.Bk("Type"), maf.Bk("PlayerName"), maf.Bk("Reason"));
    @lok(value="Removed ignore of $(PlayerName)")
    @lpl(value="Displayed when a new entry is removed from a player's chat ignores")
    public static final lox IgnoreListEntryRemoved = Instance.a("IgnoreListEntryRemoved", maf.Bk("PlayerName"));
    @lok(value="Updated  $(Type) ignore of $(PlayerName) with reason: $(Reason)")
    @lpl(value="Displayed when a new entry is updated in a player's chat ignores")
    public static final lox IgnoreListEntryUpdated = Instance.a("IgnoreListEntryUpdated", maf.Bk("Type"), maf.Bk("PlayerName"), maf.Bk("Reason"));
    @lok(value="Ignore list is full")
    @lpl(value="Displayed when a player's list of chat ignores is full")
    public static final lox IgnoreListFull = Instance.BC("IgnoreListFull");
    @lok(value="Could not find ignore for $(PlayerName)")
    @lpl(value="Displayed when an ignore entry cannot be found")
    public static final lox IgnoreListEntryNotFound = Instance.a("IgnoreListEntryNotFound", maf.Bk("PlayerName"));
    @lok(value="Could not find player with name '$(PlayerName)'")
    @lpl(value="Displayed when a player cannot be found")
    public static final lox IgnoreListNameNotFound = Instance.a("IgnoreListNameNotFound", maf.Bk("PlayerName"));
    @lok(value="Invalid ignore type $(Type) - Supported types are 'public' and 'private'")
    @lpl(value="Displayed when an ignore request contains an invalid type")
    public static final lox IgnoreListInvalidType = Instance.a("IgnoreListInvalidType", maf.Bk("Type"));
    @lok(value="Unknown command $(CommandName)!")
    @lpl(value="Displayed when an entered chat command is not recognised")
    public static final lox ChatCommandUnknown = Instance.a("ChatCommandUnknown", maf.Bk("CommandName"));
    @lok(value="Expected parameter $(ParameterName) not found!")
    @lpl(value="Displayed when an entered chat command is missing a required parameter")
    public static final lox ChatCommandMissingParameter = Instance.a("ChatCommandMissingParameter", maf.Bk("ParameterName"));
    @lok(value="the value $(ParameterValue) cannot be assigned to $(ParameterType) parameter $(ParameterName) of command $(CommandName)")
    @lpl(value="Displayed when an entered chat command supplied an invalid value for a parameter")
    public static final lox ChatCommandInvalidParameter = Instance.a("ChatCommandInvalidParameter", maf.Bk("ParameterValue"), maf.Bk("ParameterName"), maf.Bk("ParameterType"), maf.Bk("CommandName"));
    @lok(value="Superfluous parameter $(ParameterValue)")
    @lpl(value="Displayed when an entered chat command contains additional parameter values that are not required")
    public static final lox ChatCommandAdditionalParameter = Instance.a("ChatCommandAdditionalParameter", maf.Bk("ParameterValue"));
    @lok(value="Failed to set property")
    @lpl(value="Displayed when an attempt to set a property value fails")
    public static final lox FailedToSetProperty = Instance.BC("FailedToSetProperty");
    @lok(value="The value $(Value) is below the minimum allowed value $(MinimumValue)")
    @lpl(value="Displayed when an attempt to set a property value fails because the entered value is below the minimum allowed value")
    public static final lox FailedToSetPropertyValueBelowMinimum = Instance.a("FailedToSetPropertyValueBelowMinimum", maf.Bk("Value"), maf.Bk("MinimumValue"));
    @lok(value="The value $(Value) is above the maximum allowed value $(MaximumValue)")
    @lpl(value="Displayed when an attempt to set a property value fails because the entered value is above the maximum allowed value")
    public static final lox FailedToSetPropertyValueAboveMaximum = Instance.a("FailedToSetProperatyValueAboveMaximum", maf.Bk("Value"), maf.Bk("MaximumValue"));
    @lok(value="Could not execute file: file $(FileName) not found!")
    @lpl(value="Displayed when an execute file command fails because the indicated file cannot be found")
    public static final lox ExecuteFileFailedFileNotFound = Instance.a("ExecuteFileFailedFileNotFound", maf.Bk("FileName"));
    @lok(value="Could not exectue file: error reading from file $(FileName)")
    @lpl(value="Displayed when an execute file command fails because an error occured while reading the indicated file")
    public static final lox ExecuteFileFailedErrorReadingFile = Instance.a("ExecuteFileFailedErrorReadingFile", maf.Bk("FileName"));
    @lok(value="Key was not bound to an action")
    @lpl(value="Displayed when an input bind is entered but is not bound to an action")
    public static final lox InputBindNotBound = Instance.BC("InputBindNotBound");
    @lok(value="Unparsable Binding")
    @lpl(value="Displayed when an input bind is entered but is not fails to parse")
    public static final lox InputBindInvalidBinding = Instance.BC("InputBindInvalidBinding");
    @lok(value="This action can only be bound to an axis (not a key or a button)")
    @lpl(value="Displayed when an input bind is entered but is not of the expected type")
    public static final lox InputBindExpectedLinear = Instance.BC("InputBindExpectedLinear");
    @lok(value="This action can only be bound to a key or a button (not an axis)")
    @lpl(value="Displayed when an input bind is entered but is not of the expected type")
    public static final lox InputBindExpectedSwitch = Instance.BC("InputBindExpectedSwitch");
    @lok(value="Invalid parameter, must be of the form 'Dx', where 'x' is any whole number between 2 and 100, inclusive!")
    @lpl(value="Displayed when a roll command contains invalid parameters")
    public static final lox RollCommandInvalidParameters = Instance.BC("RollCommandInvalidParameters");
    @lok(value="You rolled a $(Result), out of $(DNumber)")
    @lpl(value="Displayed to a player when they issue a personal dice-roll command")
    public static final lox RollResultPersonal = Instance.a("RollResultPersonal", maf.Bh("DNumber"), maf.Bh("Result"));
    @lok(value="Clan Member $(PlayerName) rolled a $(Result), out of $(DNumber)")
    @lpl(value="Displayed to all clan members when a member issues a clan dice-roll command")
    public static final lox RollResultClan = Instance.a("RollResultClan", maf.Bk("PlayerName"), maf.Bh("DNumber"), maf.Bh("Result"));
    @lok(value="Party Member $(PlayerName) rolled a $(Result), out of $(DNumber)")
    @lpl(value="Displayed to all party members when a member issues a party dice-roll command")
    public static final lox RollResultParty = Instance.a("RollResultParty", maf.Bk("PlayerName"), maf.Bh("DNumber"), maf.Bh("Result"));
    @lok(value="You have issued roll commands too frequently, please wait a while before issuing another!")
    @lpl(value="Displayed to a player when they issue too many roll commands too frequently")
    public static final lox RollCommandSpam = Instance.BC("RollCommandSpam");
    @lok(value="Your message was not delivered... you are sending too many messages too fast... please wait a moment before sending consecutive messages")
    @lpl(value="Displayed to a player when they send chat messages too fast")
    public static final lox ChatSpam = Instance.BC("ChatSpam");
    @lok(value="You are not allowed to send messages to the Japanese global channel if your nationality is Korean.")
    @lpl(value="Displayed to a player when he tries to send a message to the japanese global channel and his nationality is korean")
    public static final lox KoreanSendToJapanese = Instance.BC("KoreanSendToJapanese");
    @lok(value="You are not allowed to send messages to the Korean global channel if your nationality is Japanese.")
    @lpl(value="Displayed to a player when he tries to send a message to the Korean global channel and his nationality is Japanese")
    public static final lox JapaneseSendToKorean = Instance.BC("JapaneseSendToKorean");
    @lok(value="You can only send one message every $(Secs) seconds to the global channel.")
    @lpl(value="Displayed to a player when he tries to send a message to fast ")
    public static final lox GlobalTooFast = Instance.a("GlobalTooFast", maf.Bh("Secs"));
    @lok(value="You can not activate emote yet.")
    @lpl(value="Displayed to a player when he tries to play and emote too soon.")
    public static final lox EmoteTooSoon = Instance.BC("EmoteTooSoon");
    @lok(value="You have been muted from the global channel for $(x) minutes.")
    @lpl(value="Displayed to a player when he has been muted by a gm.")
    public static final lox MuteGlobal = Instance.a("MuteGlobal", maf.Bh("x"));

    protected maf(String string) {
        super("Chat." + string);
    }

    private maf() {
        super("Chat");
    }
}

