package kadai08_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import kadai08_03.shape.Circle;
import kadai08_03.shape.Figure;
import kadai08_03.shape.Square;


public class Kadai07_04 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double width,height,radius;
		// 四角形の辺と円の半径を直接指定
		width=5.0;
		height=4.0;
		radius = 5.0;

		// (1)クラスの型はSquareとCircleとする
		/*Square shape1;
		shape1 = new Square(width,height);

		Circle shape2;
		shape2 = new Circle(radius);

		// 四角形の外周と面積を計算して表示
		shape1.around();
		shape1.area();

		// 円の外周と面積を計算して表示
		shape2.around();
		shape2.area();
		*/

		// (2)クラスの型はFigure型とする
		Figure[] shape = new Figure[2];
		shape[0] = new Square(width,height);
		shape[1] = new Circle(radius);

		for(int i=0; i<2; i++) {
			shape[i].measure();
		}
		
	}

}
