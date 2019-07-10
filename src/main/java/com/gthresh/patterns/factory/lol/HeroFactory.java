package com.gthresh.patterns.factory.lol;

import com.gthresh.patterns.factory.lol.constants.HeroConstant;
import com.gthresh.patterns.factory.lol.heros.Ashe;
import com.gthresh.patterns.factory.lol.heros.Gnar;
import com.gthresh.patterns.factory.lol.heros.Thresh;
import com.gthresh.patterns.factory.lol.heros.Yasuo;

/**
 * ClassName: HeroFactory
 * Description: TODO 英雄工厂
 * @author G-thresh
 * Date: 2019/7/10 22:37
 * Version: v1.0
 */
public class HeroFactory {
    /**
     * Author: G-thresh
     * Description: //TODO 召唤英雄
     * Date: 22:41 2019/7/10
     * Param: [heroName]
     * return: com.gthresh.patterns.factory.lol.Hero
     **/
    public Hero summonHero( String heroName){
        if(heroName==null){
            return null;
        }
        if(HeroConstant.HERO_THRESH.equalsIgnoreCase(heroName)){
            return new Thresh();
        }
        if(HeroConstant.HERO_YASUO.equalsIgnoreCase(heroName)){
            return new Yasuo();
        }
        if(HeroConstant.HERO_GNAR.equalsIgnoreCase(heroName)){
            return new Gnar();
        }
        if(HeroConstant.HERO_ASHE.equalsIgnoreCase(heroName)){
            return new Ashe();
        }
        return null;
    }
}
