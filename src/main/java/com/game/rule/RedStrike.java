package com.game.rule;

import com.game.Striker;

public class RedStrike extends CarromRule {
    @Override
    public int action(Striker striker) {
        if(striker.isRedPresent()){
            striker.setRedPresent(false);
            return 3;
        }
        return 0;
    }
}
