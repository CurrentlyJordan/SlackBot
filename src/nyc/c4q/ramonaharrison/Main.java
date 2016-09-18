package nyc.c4q.ramonaharrison;

import nyc.c4q.ramonaharrison.network.Slack;

import java.net.MalformedURLException;

public class Main {

    //API TOKEN : xoxb-78454023700-IM0RlQ7BzkRhsWSzGTw3mrMM

    public static void main(String[] args) {

        Bot myBot = new Bot();

        //myBot.testApi();

        //myBot.listChannels();

        //myBot.listMessages(Slack.BOTS_CHANNEL_ID);

        // Post "Hello, world!" to the #bots channel
        //myBot.sendMessageToBotsChannel("How about a 1 step?");

        // Post a pineapple photo to the #bots channel
//        myBot.sendMessageToBotsChannel("http://weknowyourdreams.com/images/pineapple/pineapple-07.jpg");
//        try {
//            myBot.sendLinkToBotsChannel("https://developer.android.com/training/basics/activity-lifecycle/starting.html");
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }
            myBot.trollbot();
    }
}