package com.gthresh.patterns.factory.lol;

/**
 * ClassName: FactoryPatternDemo
 * Description: TODO
 * @author G-thresh
 * Date: 2019/7/10 22:53
 * Version: v1.0
 */
public class FactoryPatternDemo {
    public static void main(String[] args){
        HeroFactory heroFactory = new HeroFactory();
        Hero thresh = heroFactory.summonHero("thresh");
        thresh.summon();
        Hero yasuo = heroFactory.summonHero("yasuo");
        yasuo.summon();
        Hero gnar = heroFactory.summonHero("gnar");
        gnar.summon();
        Hero ashe = heroFactory.summonHero("ashe");
        ashe.summon();
    }
}
