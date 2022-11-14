package edu.pitt.cs;

import static org.junit.Assert.*;

import org.junit.*;
import org.mockito.*;

public class RockPaperScissorsTest {
	RockPaperScissors rps;
	PaperPlayer p1;
	RockPlayer p2;
	ScoreBoard sb;

	@Before
	public void setUp() {
		p1 = new PaperPlayer();
		p2 = new RockPlayer();
		sb = new ScoreBoard();

		rps = new RockPaperScissors(p1, p2, sb);
	}

	/**
 	* Preconditions: Create a PaperPlayer p1.
 	*                Create a RockPlayer p2.
 	*                Create a ScoreBoard sb.
 	*                Create a RockPaperScissors game rps using p1, p2, sb.
 	* Execution steps: Call rps.play(5).
 	* Postconditions: 5 p1 wins, 0 p2 wins, and 0 draws are posted on ScoreBoard sb.
 	*/
	@Test
	public void testPapervsRock5() {
		rps.play(5);
		assertEquals("(5:0:0)", sb.toString());
	}
}