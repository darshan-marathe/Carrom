package com.game.rule;

import com.game.CarromGame;
import com.game.Striker;

public class Strike extends CarromRule {


    public int action(Striker strike) {
       strike.setBalckCoin(strike.getBalckCoin()-1);
       return 1;
    }
}
