package com.hechuangwu.designpatternsdemo.mediator;
/**
 *  中介者模式：
 *  当对象之间的交互都依赖彼此，为防止一个对象的行为修改到另一个对象时，可采用中介者模式来解耦；
 *  设计理念是各处理的对象都持有中介者，而中介者同时持有每个处理对象，当某个对象处理完成后通知中介者，让中介者进行下一步操作
 *
 */


/**
 * Created by cwh on 2019/8/16 0016.
 * 功能: 主板
 */
public class MainBoard extends Mediator {
    private CDDevice mCDDevice;
    private CPU mCPU;
    private SoundCard mSoundCard;
    private GraphicsCard mGraphicsCard;

    public void setCDDevice(CDDevice CDDevice) {
        mCDDevice = CDDevice;
    }

    public void setCPU(CPU CPU) {
        mCPU = CPU;
    }

    public void setSoundCard(SoundCard soundCard) {
        mSoundCard = soundCard;
    }

    public void setGraphicsCard(GraphicsCard graphicsCard) {
        mGraphicsCard = graphicsCard;
    }

    @Override
    public void changed(Colleague colleague) {
        if(colleague==mCDDevice){
            handleCD( (CDDevice) colleague );
        }else if(colleague==mCPU){
            handleCPU( (CPU) colleague );
        }
    }

    private void handleCD(CDDevice cdDevice){
        mCPU.decodeData( cdDevice.read() );
    }

    private void handleCPU(CPU cpu){
        mSoundCard.soundPlay( cpu.getDataSound() );
        mGraphicsCard.videoPlay( cpu.getDataVideo() );
    }


}
