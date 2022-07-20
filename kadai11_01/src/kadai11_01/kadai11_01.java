package kadai11_01;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class kadai11_01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// JFrameクラスのインスタンスを生成
		JFrame mainFrame = new JFrame("Kadai11_01 サンプル");
		// 閉じるボタン押下時のアプリケーションの振る舞いを決定
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ウィンドウの初期サイズ（幅、高さ）をピクセル単位で設定
		mainFrame.setSize(320, 160);
		// ウィンドウの表示場所を規定
		mainFrame.setLocationRelativeTo(null);
		
		// ContentPaneの取得 
		Container contentPane = mainFrame.getContentPane();
		
		JLabel label = new JLabel("Swing Label");
		JButton Button = new JButton("Swing Button");
		
		// コントロール(ラベルとボタン)の配置
		contentPane.add(label, BorderLayout.CENTER);
		contentPane.add(Button, BorderLayout.SOUTH);
		
		// ウィンドウの表示
		mainFrame.setVisible(true);
	}

}
