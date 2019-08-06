package com.hechuangwu.designpatternsdemo.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * 单例模式：
 * 优点-1，存在一个实例，避免频繁创建，减少系统开销；
 *      2，避免对资源的多重占用，如避免同时写同一个文件；
 *      3，设置全局访问，能实现全局共享一个功能；
 *
 * 缺点-1，一般没有接口，扩展困难，只能改动源码；
 *      2，持有Context时，注意避免内存泄漏问题，传Application Context。
 *
 *  客户端存在高并发的情况比较少，实际开发中推荐使用第二和第三种
 *
 *  android源码中的单例模式：可查看LayoutInflater.from(Context context).inflate(int resource, ViewGroup root)调用过程
 */

/**
 * Created by cwh on 2019/8/6 0006.
 * 功能:懒汉模式
 */
public class LazySingleton {
    private static LazySingleton mLazySingleton ;
    private LazySingleton(){}

    //第一种：普通懒汉模式
    // synchronized第一次实例化后，往后的每次都要再进行一次同步，总体会影响调用时间
    //-----------------------------------------------------------------------------------------//

//    public static synchronized LazySingleton getInstance(){
//        if(mLazySingleton==null){
//             mLazySingleton = new LazySingleton();
//        }
//        return  mLazySingleton;
//    }



    //第二种： double check lock模式
    //因为Java内存模型的原因，在new LazySingleton()时，实际上执行了三步操作：
    //    1，给LazySingleton示例分配内存空间
    //    2，调用LazySingleton构造函数，初始化成员字段
    //    3，将mLazySingleton对象指向分配的内存空间
    //2和3步骤调用顺序是不确定的，当a线程执行了3而未执行2,此时线程b将直接使用mLazySingleton，会产生报错
    //解决JDK1.5后加volatile:
    //  private volatile static LazySingleton mLazySingleton ;每次都从主存中获取，但会牺牲点性能
    //-----------------------------------------------------------------------------------------//
//    public  static LazySingleton getInstance(){
//        if(mLazySingleton==null){
//            synchronized (LazySingleton.class){
//                if(mLazySingleton==null){
//                    mLazySingleton = new LazySingleton();
//                }
//            }
//        }
//        return mLazySingleton;
//
//    }



    //第三种：静态内部类模式
    //这种方式能保证单例，同时也延迟单例实例化，解决第二种出现的问题
    //-----------------------------------------------------------------------------------------//

    public static LazySingleton getInstance(){
        return SingletonHolder.sLazySingleton;
    }

    private static class SingletonHolder{
        private static final LazySingleton sLazySingleton = new LazySingleton();
    }


    //第四种：容器模式
    //这种方式能够管理多个单例，并且在用户使用时隐藏了具体实现，降低了耦合性
    //通过LayoutInflater.from(context)的源码流程知道，系统在static{}中注册各种服务，当某个单例第一次调用时，会创建实例并放入SYSTEM_SERVICE_MAP的缓存中，采用的便是此种容器模式
    //-----------------------------------------------------------------------------------------//

    private static Map<String,Object> objectMap = new HashMap<>(  );

    public static void registerService(String key ,Object instance){
        if(!objectMap.containsKey( key )){
            objectMap.put( key,instance );
        }
    }

    public static Object getService(String key){
        return  objectMap.get( key );

    }



}
