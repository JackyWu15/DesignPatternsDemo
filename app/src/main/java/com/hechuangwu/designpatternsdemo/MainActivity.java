package com.hechuangwu.designpatternsdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        designTest();
    }

    private void designTest() {
        //单例模式
        //        LazySingleton instance = LazySingleton.getInstance();

        //建造者模式
        //        Computer computer = new MacBookBuilder()
        //                .buildBoard( "intel" )
        //                .buildDisplay( "retain" )
        //                .buildOS()
        //                .create();
        //        Log.i( TAG, "Computer Info :>>>>>"+computer.toString() );

        //原型模式1
        //        WordDocument wordDocument = new WordDocument();
        //        wordDocument.setText( "原型文档" );
        //        wordDocument.addImages( "图1" );
        //        wordDocument.showDocument();
        //
        //        WordDocument clone = wordDocument.clone();
        //        clone.setText( "拷贝的文档" );
        //        clone.addImages( "图2" );
        //        clone.showDocument();
        //
        //        wordDocument.showDocument();

        //原型模式2
//        LoginImpl login = new LoginImpl();
//        login.login();//登录获取用户信息，同时保存用户会话信息
//
//        //     User loginSessionUser = LoginSession.getInstance().getLoginSessionUser(); //修改了用户会话信息，违背设计目的
//        User loginSessionUser = LoginSession.getInstance().getCloneLoginSessionUser();//采用原型模式拷贝一份
//        loginSessionUser.address = new Address( "北京市", "朝阳区", "大望路" );
//
//        Log.i( TAG, "designTest: " + loginSessionUser );//User{age=22, name='JackyWu', phoneNum='null', address=Address{city='北京市', district='朝阳区', street='大望路'}}
//
//        Log.i( TAG, "designTest: " + LoginSession.getInstance().getLoginSessionUser() );//User{age=22, name='JackyWu', phoneNum='null', address=Address{city='深圳市', district='南山区', street='学府路'}}


        //简单工厂模式
//        AudiQ3 audiCarQ3 = AudiCarFactory.createAudiCar( AudiQ3.class );
//        audiCarQ3.drive();
//        audiCarQ3.selfNavigation();
//        AudiQ5 audiCarQ5 = AudiCarFactory.createAudiCar( AudiQ5.class );
//        audiCarQ5.drive();
//        audiCarQ5.selfNavigation();

//        抽象工厂模式
//        CarFactory factoryQ3 = new Q3Factory();
//        factoryQ3.createIEngine().engine();
//        factoryQ3.createITire().tire();
//
//        CarFactory factoryQ7 = new Q7Factory();
//        factoryQ7.createIEngine().engine();
//        factoryQ7.createITire().tire();

        //策略模式
//        TransCalculator transCalculator = new TransCalculator();
//        transCalculator.setStrategy( BusStrategy.class );
//        int busPrice = transCalculator.calculatePrice( 5 );//15
//
//        transCalculator.setStrategy( SubwayStrategy.class);
//        int subPrice = transCalculator.calculatePrice( 5 );//25


        //状态模式1
//        TvController tvController = new TvController();
//        tvController.powerOn();
//        tvController.nextChannel();
//        tvController.prevChannel();
//        tvController.turnUp();
//
//        tvController.powerOff();
//        tvController.turnDown();

        //状态模式2
//        LoginContext instance = LoginContext.getInstance();
//        instance.forward( this );

        //责任链模式
//        Manager manager = new Manager();
//        Boss boss = new Boss();
//        manager.nextHandler = boss;
//        manager.handleRequest( 30000 );

        //命令模式
//        startActivity( new Intent( this, DrawActivity.class ) );


        //观察者模式
//        DevTechFrontier devTechFrontier = new DevTechFrontier();
//        Coder jacky = new Coder( "jacky" );
//        Coder jacky_wu = new Coder( "jacky_wu" );
//        devTechFrontier.addObserver( jacky );
//        devTechFrontier.addObserver( jacky_wu );
//        devTechFrontier.postNewPublication( "新的周刊发布了。。。" );

        //备忘录模式
//        CallOfDuty callOfDuty = new CallOfDuty();
//        callOfDuty.play();
//
//        Caretaker caretaker = new Caretaker();
//        caretaker.archive( callOfDuty.createMemoto() );
//        callOfDuty.quit();
//
//        CallOfDuty callOfDuty1 = new CallOfDuty();
//        callOfDuty1.restore( caretaker.getMemo() );


        //迭代器模式
//        check( new CompanyMin() );
//        check( new CompanyHui() );

        //模板模式
//        AbstractComputer coderComputer = new CoderComputer();
//        coderComputer.startUp();
//
//        coderComputer = new MilitaryComputer();
//        coderComputer.startUp();
    }




//    private void check(Company companyMin) {
//        Iterator iterator = companyMin.iterator();
//        while (iterator.hasNext()){
//            Log.i( TAG, "designTest:>>>"+iterator.next().toString() );
//        }
//    }

}
