package kadai13_01;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
 
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
