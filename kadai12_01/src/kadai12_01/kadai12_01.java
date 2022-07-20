package kadai12_01;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class kadai12_01 {

	public static void main(String[] args) {
		// JFrameクラスのインスタンスを作成
		JFrame mainFrame = new JFrame("Kadai12_01 サンプル");
		// 閉じるボタン押下時のアプリケーションの振舞いを決定
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ウィンドウの初期サイズ（幅、高さ）をピクセル単位で設定
		mainFrame.setSize(320, 160);
		// ウィンドウの表示場所を規定
		mainFrame.setLocationRelativeTo(null);
		
		// ContentPaneの取得
		Container contentPane = mainFrame.getContentPane();
		
		// ラベルとボタンのインスタンスを作成
		JLabel label = new JLabel("Swing Label");
		JButton Button = new JButton("Swing Button");
		// テキストフィールドのインスタンスを作成
		final JTextField textField = new JTextField();
		
		// テキストエリアのインスタンスを作成
		// 引数は行列の数（５，０）なら
		final JTextArea textArea = new JTextArea(5, 0);
		
		// スクロールペインにテキストエリアを追加
		JScrollPane scrollPane = new JScrollPane(textArea);
		
		// ボタンのインスタンスを作成
		JButton button = new JButton("追加");
		
		
		// コントロール（ラベルとボタン）の配置
		contentPane.add(label, BorderLayout.CENTER);
		contentPane.add(Button,BorderLayout.SOUTH);
		// テキストフィールドのインスタンスを作成
		contentPane.add(textField, BorderLayout.NORTH);
		contentPane.add(scrollPane, BorderLayout.CENTER);
		contentPane.add(button, BorderLayout.SOUTH);
		
		// アクションの定義の追加
		// 参考: ここではAbstractActionクラスのインスタンスのコンストラクタの定義を引数の指定と同時に行う
		// {}内
		button.addActionListener(new AbstractAction() {
			public void actionPerformed(ActionEvent arg) {
				textArea.append(textField.getText() + "\n");
			}
		});
		
		
		// ウィンドウを表示
		mainFrame.setVisible(true);
	}

}
