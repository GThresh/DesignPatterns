package com.gthresh.patterns.factory.factory_method.Adventure;

import com.gthresh.patterns.factory.factory_method.JOJO.AbstractJoJo;
import com.gthresh.patterns.factory.factory_method.JOJO.JonathanJoestar;

/**
 * ClassName: PhantomBlood
 * Description: TODO ファントムブラッド 幻影之血 乔纳森·乔斯达——他的青春
 * @author G-thresh
 * Date: 2019/7/11 20:47
 * Version: v1.0
 */
public class PhantomBlood extends AbstractAdventure {
    @Override
    public AbstractJoJo JoJo() {
        return new JonathanJoestar();
    }
}
