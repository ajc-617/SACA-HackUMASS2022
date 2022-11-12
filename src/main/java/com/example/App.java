package com.example;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.type.PhoneNumber;

import java.net.URI;

public class App {
    // Find your Account SID and Auth Token at twilio.com/console
    // and set the environment variables. See http://twil.io/secure
    public static final String ACCOUNT_SID = "AC2affd164a4dc5a191183d7a9012d74a9";
    public static final String AUTH_TOKEN = "f9bb1c8551ade0d4f359eab8e935b735";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Call call = Call.creator(
                new com.twilio.type.PhoneNumber("+12404212212"),
                new com.twilio.type.PhoneNumber("+19703553721"),
                URI.create("http://demo.twilio.com/docs/voice.xml"))
            .create();

        System.out.println(call.getSid());
    }
}