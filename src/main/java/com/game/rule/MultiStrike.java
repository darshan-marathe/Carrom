package com.game.rule;

import com.game.Striker;

public class MultiStrike extends CarromRule {
    @Override
    public int action(Striker striker) {
        return 2;
    }
}
