/*
Продолжая работу над ботом из предыдущих уроков реализованы  фильтры
для обработки изображения - красный, синий, зеленый, серый, сепия
при помощи которых отправленное  изображение пользователя telegram,
при соответствующей команде с его стороны,
перекрашевается в нужный цвет (накладывается фильтр)
 */
package org.example;

import org.example.services.Bot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.generics.BotSession;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;


public class Main {
    public static void main(String[] args) throws TelegramApiException {

        TelegramBotsApi api = new TelegramBotsApi(DefaultBotSession.class);
        BotSession botSession = api.registerBot(new Bot());


    }
}