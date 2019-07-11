package com.gthresh.patterns.factory.factory_method;

import com.gthresh.patterns.factory.factory_method.JOJO.AbstractJoJo;
import com.gthresh.patterns.factory.factory_method.Adventure.AbstractAdventure;
import com.gthresh.patterns.factory.factory_method.Adventure.BattleTendency;
import com.gthresh.patterns.factory.factory_method.Adventure.PhantomBlood;

/**
 * ClassName: Shueisha
 * Description: TODO 集英社 少年漫画杂志少年JUMP(1987年1·2号刊-2004年47号刊)  青年漫画杂志UltraJump(2005年-至今)
 * @author G-thresh
 * Date: 2019/7/11 21:03
 * Version: v1.0
 */
public class Shueisha {
    public static void main(String[] args){
        AbstractAdventure phantomBlood = new PhantomBlood();
        AbstractJoJo jonathanJoestar = phantomBlood.JoJo();
        jonathanJoestar.description();
        AbstractAdventure battleTendency = new BattleTendency();
        AbstractJoJo josephJoestar = battleTendency.JoJo();
        josephJoestar.description();
    }
}
