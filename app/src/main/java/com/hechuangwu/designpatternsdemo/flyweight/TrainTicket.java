package com.hechuangwu.designpatternsdemo.flyweight;

import android.util.Log;

import java.util.Random;

/**
 * Created by cwh on 2019/8/23 0023.
 * 功能:
 */
public class TrainTicket implements Ticket {
    private static final String TAG = "TrainTicket";
    private  String from;
    private  String to;
    private  int price;
    public TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void showTicketInfo(String bunk) {
        price = new Random().nextInt( 300 );
        Log.i( TAG, "showTicketInfo:>>>"+"购买"+from+"到"+to+"的"+bunk+"火车票"+",价格"+price);
    }
}

