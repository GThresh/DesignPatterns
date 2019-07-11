package com.gthresh.patterns.factory.simple_factory.Adventure;


import com.gthresh.patterns.factory.simple_factory.JOJO.AbstractJoJo;

/**
 * ClassName: AbstractAdventure
 * Description: TODO 抽象的奇妙冒险
 * @author G-thresh
 * Date: 2019/7/11 20:46
 * Version: v1.0
 */
public class AbstractAdventure {
    public <T extends AbstractJoJo> T JoJo(Class<T> c){
        AbstractJoJo jojo = null;
        try{
            jojo = (AbstractJoJo) Class.forName(c.getName()).newInstance();
        }catch (Exception e){
            System.out.println("The man is not JOJO!!!");
        }
        return (T)jojo;
    };

}
