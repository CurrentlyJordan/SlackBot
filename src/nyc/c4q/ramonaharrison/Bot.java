package nyc.c4q.ramonaharrison;

import nyc.c4q.ramonaharrison.model.Channel;
import nyc.c4q.ramonaharrison.model.Message;
import nyc.c4q.ramonaharrison.network.*;
import nyc.c4q.ramonaharrison.network.response.*;

import java.net.MalformedURLException;
import java.util.List;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Ramona Harrison
 * on 8/26/16
 *
 */

public class Bot {
    // TODO: implement your bot logic!

    public void trollbot() {
        Timer timer = new Timer();

        while (true) {
            Bot bot = new Bot();
            ListMessagesResponse listMessagesResponse = Slack.listMessages(Slack.BOTS_CHANNEL_ID);
            List<Message> messages = listMessagesResponse.getMessages();
            String originalMessage = messages.get(0).getText();

            if (originalMessage.contains("game")) {

                bot.sendMessageToBotsChannel("Do you wanna play a g@me?");
                TimerTask task = new TimerTask() {
                    @Override
                    public void run() {
                        sendMessageToBotsChannel("https://media.makeameme.org/created/sike-boy-got.jpg");
                    }
                };
                timer.schedule(task,3500);

            }
        }

    }
//    static void question() {
//
//        Bot bot = new Bot();
//        ListMessagesResponse listMessagesResponse = Slack.listMessages(Slack.BOTS_CHANNEL_ID);
//        List<Message> messages = listMessagesResponse.getMessages();
//        //String initialMessage = messages.get(0).getText();
//        (initialMessage.toLowerCase().contains("game")) {
//            bot.sendMessageToBotsChannel("Do you want to play a game?");
//            //String answer1 = messages.get(0).getText();
////                if (answer1.toLowerCase().contains("yes") || answer1.toLowerCase().contains("yes")) {
////                    bot.sendMessageToBotsChannel("Go get a game then son!!" + "\nwww.hasbro.com");
//        }
//    }

//    Timer timer = new Timer();
//    TimerTask task = new TimerTask() {
//        @Override
//        public void run() {
//            System.out.println("Test Timer");
//        }
//    };
//            timer.schedule(task,2000);
//
//            timer.cancel();





//            System.out.print("Do you want to play a game?" + "\n> ");
//            //Scanner input = new Scanner (System.in);
//            //String questionAnswer = input.next();
//
//            while ((questionAnswer != "yes") || (questionAnswer != "y") || (questionAnswer != "no") || (questionAnswer != "n")) {
//
//                if (questionAnswer.equalsIgnoreCase("yes") || questionAnswer.equalsIgnoreCase("y")) {
//
//                    System.out.println("Go get a game then son!!" + "\nwww.hasbro.com");
//                    break;
//
//                } else if (questionAnswer.equalsIgnoreCase("no") || questionAnswer.equalsIgnoreCase("n")) {
//                    System.out.println("Fine! Stop wasting my time then fool!");
//                    break;
//
//                } else {
//                    System.out.println("HEY!!! C'mon! You know better");
//                    Scanner secondInput = new Scanner(System.in);
//                    questionAnswer = secondInput.next();
//                }
//            }
//        }
//    }

    public Bot() {

    }

    /**
     * Sample method: tests the Slack API. Prints a message indicating success or failure.
     */
    public void testApi() {
        Response apiTest = Slack.testApi();
        System.out.println("API OK: " +apiTest.isOk() + "\n");
    }

    /**
     * Sample method: prints all public AccessCode3-3 channel names and ids. Prints an error message on failure.
     */
    public void listChannels() {
        ListChannelsResponse listChannelsResponse = Slack.listChannels();

        if (listChannelsResponse.isOk()) {
            List<Channel> channels = listChannelsResponse.getChannels();

            System.out.println("\nChannels: ");
            for (Channel channel : channels) {
                System.out.println("name: " + channel.getName() + ", id:" + channel.getId());
            }
        } else {
            System.err.print("Error listing channels: " + listChannelsResponse.getError());
        }
    }

    /**
     * Sample method: prints up to the last 100 messages from a given channel. Prints an error message on failure.
     * or failure.
     *
     * @param channelId id of the given channel.
     */
    public void listMessages(String channelId) {
        ListMessagesResponse listMessagesResponse = Slack.listMessages(channelId);

        if (listMessagesResponse.isOk()) {
            List<Message> messages = listMessagesResponse.getMessages();

            System.out.println("\nMessages: ");
            for (Message message : messages) {
                System.out.println();
                System.out.println("Timestamp: " + message.getTs());
                System.out.println("Message: " + message.getText());
            }
        } else {
            System.err.print("Error listing messages: " + listMessagesResponse.getError());
        }
    }

    /**
     * Sample method: sends a plain text message to the #bots channel. Prints a message indicating success or failure.
     *
     * @param text message text.
     */
    public void sendMessageToBotsChannel(String text) {
        SendMessageResponse sendMessageResponse = Slack.sendMessage(text);

        if (sendMessageResponse.isOk()) {
            System.out.println("Message sent successfully!");
        } else {
            System.err.print("Error sending message: " + sendMessageResponse.getError());
        }
    }

    /**
     * Sample method: deletes a message from the #bots channel. Prints a message indicating success or failure.
     *
     * @param messageTs unique timestamp of the message to be deleted.
     */
    public void deleteMessageInBotsChannel(String messageTs) {
        DeleteMessageResponse deleteMessageResponse = Slack.deleteMessage(messageTs);

        if (deleteMessageResponse.isOk()) {
            System.out.println("Message deleted successfully!");
        } else {
            System.err.print("Error sending message: " + deleteMessageResponse.getError());
        }
    }

    public void sendLinkToBotsChannel(String text) throws MalformedURLException {
        SendMessageResponse sendMessageResponse = Slack.sendLink(text);

        if (sendMessageResponse.isOk()) {
            System.out.println("Message sent successfully!");
        } else {
            System.err.print("Error sending message: " + sendMessageResponse.getError());
        }
    }
}
