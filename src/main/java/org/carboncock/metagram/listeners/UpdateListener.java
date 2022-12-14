package org.carboncock.metagram.listeners;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

@FunctionalInterface
public interface UpdateListener extends Listener {
    void onUpdate(TelegramLongPollingBot bot, Update update);
}
