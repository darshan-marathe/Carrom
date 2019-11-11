package com.game;

import com.game.rule.CarromRule;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CarromGame {

    List<Player> players;
    Striker striker;

    public CarromGame(List<Player> players, Striker striker) {
        this.players = players;
        this.striker = striker;
    }

    public void updatePoint(int point, Player player){
        player.setPoint(player.getPoint()+point);
    }

    public void getScore(Player player,int choice){
        CarromRule carromRule = RuleFactory.getCarromRule(choice);
        int point = carromRule.action(this.striker);
        if (point < 0) {
            player.setFouls(player.fouls + 1);
            if ((player.getFouls() % 3) == 0) {
                point = point - 1;
            }
        }
            if(player.getNoneCount() == 3){
                point = point-1;
                player.setNoneCount(0);
            }
        updatePoint(point,player);
        System.out.println("striker : "+striker.getBalckCoin());
        System.out.println(players.get(0).getPoint()+"-"+players.get(1).getPoint());
    }
    public String findFinalResult(){

        List<Player> sortedList = new ArrayList<Player>();
        sortedList.addAll(players);
        Collections.sort(sortedList, new Comparator<Player>() {
            public int compare(Player o1, Player o2) {
                return o2.getPoint()-o1.getPoint();
            }
        });
        if(sortedList.get(0).getPoint() >= 5){
            int point1 = sortedList.get(0).getPoint();
            int point2 = sortedList.get(1).getPoint();
            if((point1-point2)>=3){
                return  "Player"+ sortedList.get(0).getNo()+" won the game. Final Score: "+point1+"-"+point2;
            }
        }
        if(striker.getBalckCoin() == 0){
            return "match drow";
        }
        return null;
    }
}
