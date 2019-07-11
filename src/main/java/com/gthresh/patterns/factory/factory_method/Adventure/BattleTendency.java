package com.gthresh.patterns.factory.factory_method.Adventure;

import com.gthresh.patterns.factory.factory_method.JOJO.AbstractJoJo;
import com.gthresh.patterns.factory.factory_method.JOJO.JosephJoestar;

/**
 * ClassName: BattleTendency
 * Description: TODO 戦闘潮流 战斗潮流 乔瑟夫·乔斯达——他的高贵血统
 * @author G-thresh
 * Date: 2019/7/11 21:01
 * Version: v1.0
 */
public class BattleTendency extends AbstractAdventure {
    @Override
    public AbstractJoJo JoJo() {
        return new JosephJoestar();
    }
}
