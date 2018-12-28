package com.cg.tennis.kata.play;

import java.util.Random;

public class GamePlay {
public static Integer randomPointWinner() {
return new Random().nextInt(2) + 1;
}
}