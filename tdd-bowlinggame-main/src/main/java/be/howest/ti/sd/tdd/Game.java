package be.howest.ti.sd.tdd;


public class Game {

    private int score = 0;
    private final int[] rolls = new int[21];
    private int currentRoll = 0;


    public void roll(int pins) {
        if(pins < 0 || pins > 10) throw new IllegalArgumentException("pins must be between 0 and 10");
        rolls[currentRoll++] = pins;
        if(currentRoll == 21 && !isSpare(currentRoll - 3) && !isStrike(currentRoll - 3)) throw new OutOfRollException();


    }

    public int getScore() {
        int frameIndex = 0;
        int frame = 0;
        calculateScore(frame, frameIndex);
        return score;
    }

    private void calculateScore(int frame, int frameIndex) {
        while (frame < 10) {
            if (isStrike(frameIndex)) {
                scoreStrike(frameIndex);
                frameIndex++;
            } else if (isSpare(frameIndex)) {
                scoreSpare(frameIndex);
                frameIndex += 2;
            } else {
                scoreRegular(frameIndex);
                frameIndex += 2;
            }
            frame++;
        }
    }

    private void scoreStrike(int frameIndex) {
        score += 10 + rolls[frameIndex + 1] + rolls[frameIndex + 2];
    }

    private void scoreSpare(int frameIndex) {
        score += 10 + rolls[frameIndex + 2];
    }

    private void scoreRegular(int frameIndex) {
        score += rolls[frameIndex] + rolls[frameIndex + 1];
    }

    private boolean isStrike(int frameIndex) {
        return rolls[frameIndex] == 10;
    }

    public boolean isSpare(int index) {
        return rolls[index] + rolls[index + 1] == 10;
    }
}
