package be.howest.ti.sd.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BowlingGameTests {
    @Test
    void RollingZerosResultInZeroGetScore(){
        Game game = new Game();
        game.roll(0);
        assertEquals(0,game.getScore());
    }

    @Test
    void RollingNonZerosTest(){
        Game game = new Game();
        game.roll(1);
        assertEquals(1,game.getScore());
    }

    @Test
    void cantRollNegativePins(){
        Game game = new Game();
        assertThrows(IllegalArgumentException.class, () -> game.roll(-1));
    }

    @Test
    void cantRollMoreThanTenPins(){
        Game game = new Game();
        assertThrows(IllegalArgumentException.class, () -> game.roll(11));
    }

    @Test
    void cantRollMoreThanTwentyTimesWithoutStrike(){
        Game game = new Game();
        rollMany(game,20,1);
        assertThrows(OutOfRollException.class, () -> game.roll(1));
    }

    private void rollMany(Game game, int amount, int pins){
        for (int i = 0; i < amount; i++) {
            game.roll(pins);
        }
    }

    @Test
    void RollingASpareGivesYouBonusPoints(){
        Game game = new Game();
        game.roll(5);
        game.roll(5);
        game.roll(3);
        assertEquals(16,game.getScore());
    }

    @Test
    void RollingStrikeGiveYouBonusPoints(){
        Game game = new Game();
        game.roll(10);
        game.roll(3);
        game.roll(4);
        rollMany(game,17,0);
        assertEquals(24,game.getScore());
    }

    @Test
    void RollingSpareGivesYouBonusRoll(){
        Game game = new Game();
        rollMany(game,18,0);
        game.roll(5);
        game.roll(5);
        assertDoesNotThrow(() -> game.roll(3));
        assertEquals(13,game.getScore());
    }

    @Test
    void RollingStrikeGivesYouBonusRoll(){
        Game game = new Game();
        rollMany(game,18,0);
        game.roll(10);
        game.roll(3);
        assertDoesNotThrow(() -> game.roll(3));
    }

    @Test
    void RollingPerfectGameTest(){
        Game game = new Game();
        rollMany(game,20,10);
        assertEquals(300,game.getScore());
    }
}
