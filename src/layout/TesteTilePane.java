package layout;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.layout.TilePane;

public class TesteTilePane extends TilePane{

	public TesteTilePane() {
		
		List<Quadrado> quadrados = new ArrayList<Quadrado>();

		for (int i = 0; i < 10; i++) {
			quadrados.add(new Quadrado(i * 10));
		}
		
		getChildren().addAll(quadrados);
	}
}
