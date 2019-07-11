package com.gthresh.patterns.factory.factory_method.JOJO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName: JosephJoestar
 * Description: TODO JosephJoestar
 *
 * @author G-thresh
 * Date: 2019/7/11 20:35
 * Version: v1.0
 */
public class JosephJoestar extends AbstractJoJo {
    private String realName = "Joseph•Joestar";
    private String cnName = "乔瑟夫·乔斯达";
    private String jpName = "ジョセフ・ジョースター";
    private List<String> joName = new ArrayList<String>(){{
        add("二乔");
        add("龙舌兰姑娘");
    }};
    private boolean sex = true;
    private Map<String,String> relation = new HashMap<String, String>(){{
        put("grandfather","乔纳森·乔斯达");
    }};

    @Override
    public void description() {
        System.out.println("姓名：--------" + this.realName + "--------");
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getCnName() {
        return cnName;
    }

    public void setCnName(String cnName) {
        this.cnName = cnName;
    }

    public String getJpName() {
        return jpName;
    }

    public void setJpName(String jpName) {
        this.jpName = jpName;
    }

    public List<String> getJoName() {
        return joName;
    }

    public void setJoName(List<String> joName) {
        this.joName = joName;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public Map<String, String> getRelation() {
        return relation;
    }

    public void setRelation(Map<String, String> relation) {
        this.relation = relation;
    }
}
