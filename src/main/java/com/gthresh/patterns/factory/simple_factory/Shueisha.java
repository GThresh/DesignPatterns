package com.gthresh.patterns.factory.simple_factory;

import com.gthresh.patterns.factory.simple_factory.Adventure.AbstractAdventure;
import com.gthresh.patterns.factory.simple_factory.JOJO.AbstractJoJo;
import com.gthresh.patterns.factory.simple_factory.JOJO.JonathanJoestar;


/**
 * ClassName: Shueisha
 * Description: TODO 集英社 少年漫画杂志少年JUMP(1987年1·2号刊-2004年47号刊)  青年漫画杂志UltraJump(2005年-至今)
 * @author G-thresh
 * Date: 2019/7/11 21:03
 * Version: v1.0
 */
public class Shueisha {
    public static void main(String[] args){
        AbstractAdventure adventure = new AbstractAdventure();
        AbstractJoJo jonathanJoestar = adventure.JoJo(JonathanJoestar.class);
        jonathanJoestar.description();
        AbstractJoJo josephJoestar = adventure.JoJo(JonathanJoestar.class);
        josephJoestar.description();
    }
}
