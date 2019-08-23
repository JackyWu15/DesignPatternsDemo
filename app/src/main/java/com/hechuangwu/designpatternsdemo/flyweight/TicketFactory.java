package com.hechuangwu.designpatternsdemo.flyweight;

import android.util.Log;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *  享元模式：
 *  对象池的一种实现，用来减少内存使用量，通过缓存共享对象，达到复用内存，避免重复创建来提高性能
 *
 *  android源码中的享元模式：查看Handler处理Message时，Message的回收复用过程，Message的复用使用的是链表结构
 */


/**
 * Created by cwh on 2019/8/23 0023.
 * 功能: 工厂类
 */
public class TicketFactory {
    private static final String TAG = "TicketFactory";
    static Map<String,Ticket> ticketMap = new ConcurrentHashMap<>(  );
    public static Ticket getTicket(String from,String to){
        String key = from+"-"+to;
        if(ticketMap.containsKey( key )){
            Log.i( TAG, "getTicket:使用缓存>>>"+key );
            return ticketMap.get( key );
        }else {
            Log.i( TAG, "getTicket:创建对象>>>"+key );
            TrainTicket trainTicket = new TrainTicket( from, to );
            ticketMap.put( key, trainTicket);
            return trainTicket;
        }
    }
}
