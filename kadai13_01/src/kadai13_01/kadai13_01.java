package kadai13_01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// implements MouseMotionListener, MouseListenerは、2つのマウスのインターフェースを実装
public class PaintPanel extends JPanel implements MouseMotionListener, MouseListener {
	private Graphics2D g2d;
	private Point startPoint = new Point(-1,-1);
	private Point endPoint = new Point(-1,-1);
	private Dimension size;
	
	public PaintPanel() {
		super();
		this.setBackground(Color.WHITE);
		addMouseMotionListener(this);
		addMouseListener(this);
		size = getSize();
	}
}

public class kadai13_01 {

	public static void main(String[] args) {
		// JFrameクラスのインスタンスを作成
		JFrame mainFrame = new JFrame("Kadai13_01");
		// 閉じるボタンクリック時のアプリケーションの動作
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ウィンドウの初期サイズ（幅、高さ）をピクセル単位で接敵
		mainFrame.setSize(500, 500);
		// ウィンドウの表示場所を指定
		mainFrame.setLocationRelativeTo(null);
		
		// ContentPaneの取得
		Container contentPane = mainFrame.getContentPane();
		
		
		// ボタンを作成
		JButton Button = new JButton("Button 1");
		
		// ラベルの作成
		JPanel panel = new JPanel();
		panel.setSize(500, 100);
		
		
		// 表示
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.add(Button, BorderLayout.CENTER);
		
		
		// ウィンドウを表示
		mainFrame.setVisible(true);
	}

}
