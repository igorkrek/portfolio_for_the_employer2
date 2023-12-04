package commands;

public class BotCommonCommands {


    @AppBotCommand(name = "/hello", description = "when request hello", showInHelp = true)
    String hello() {

        return "hello! User!";
    }

    @AppBotCommand(name = "/buy", description = "when request buy", showInHelp = true)
    public String buy() {

        return "buy! User!";
    }

    @AppBotCommand(name = "/help", description = "when request help", showInKeyboard = true)
    public String help() {

        return "heeeeelp!";
    }

}
