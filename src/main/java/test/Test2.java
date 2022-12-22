package test;

import org.carboncock.metagram.annotations.Command;
import org.carboncock.metagram.annotations.EventHandler;
import org.carboncock.metagram.annotations.HelpIdentifier;
import org.carboncock.metagram.listeners.Listener;
import org.carboncock.metagram.telegram.data.CommandData;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

@EventHandler
public class Test2 implements Listener {
    @Command(value = "test", prefix = '$')
    @HelpIdentifier("testhelp")
    public void onca(CommandData cmd){
        System.out.println("test");
    }
    @HelpIdentifier("testhelp")
    public void help(TelegramLongPollingBot bot, Update update){
        System.out.println("test help");
    }
}