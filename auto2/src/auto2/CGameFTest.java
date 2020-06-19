package auto2;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.event.ActionEvent;

import org.junit.jupiter.api.Test;

class CGameFTest {

	@Test
	void test() {
		CGameF g = new CGameF();
		ActionEvent e = null ;
		e.setSource(g.btnBottlewater);
		g.ListGame.actionPerformed(e);
	}

}
