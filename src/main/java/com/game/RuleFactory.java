package com.game;

import com.game.rule.CarromRule;
import com.game.rule.DefunctCoin;
import com.game.rule.MultiStrike;
import com.game.rule.None;
import com.game.rule.RedStrike;
import com.game.rule.Strike;
import com.game.rule.StrikerStrike;

import java.util.HashMap;
import java.util.Map;

public class RuleFactory {
    public static Map<Integer, CarromRule> map = new HashMap<Integer, CarromRule>();

    private static void setCarromRule(){
        map.put(1,new Strike());
        map.put(2,new MultiStrike());
        map.put(3,new RedStrike());
        map.put(4,new StrikerStrike());
        map.put(5,new DefunctCoin());
        map.put(6,new None());
    }
    public static CarromRule  getCarromRule(int ruleNo){
        if (map.isEmpty())
            setCarromRule();
        return map.get(ruleNo);
    }

}
