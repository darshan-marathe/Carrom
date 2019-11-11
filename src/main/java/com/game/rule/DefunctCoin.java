package com.game.rule;

import com.game.Striker;

public class DefunctCoin extends CarromRule {
    @Override
    public int action(Striker striker) {
        striker.setBalckCoin(striker.getBalckCoin()-1);
        return -2;
    }
}
