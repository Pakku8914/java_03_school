package kadai13_02;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
 
// コンポーネントを配置
public class kadai13_02 implements ActionListener{

	private JFrame mainFrame;
	private Container contentPane;
//	private JLabel label;
	private JPanel buttonPane;
	private PaintPanel paintPanel;
	private JButton clearButton;
	private JButton button1;
	private JButton button2;
	
	public kadai13_02() {
		// JFrameクラスのインスタンスを生成  
        mainFrame = new JFrame("Kadai12 サンプル");
        // 閉じるボタン押下時のアプリケーションの振る舞いを決定
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // ウィンドウの初期サイズ（幅、高さ）をピクセル単位で設定
        mainFrame.setSize(700,640);
        // ウィンドウの表示場所を規定
        mainFrame.setLocationRelativeTo(null);        
        // ContentPaneの取得
        contentPane = mainFrame.getContentPane();
        
        
//      JLabel label = new JLabel(new ImageIcon("D:/Home/ohnittan/My Pictures/EU/DSC02146.jpg"));
//        JLabel label = new JLabel("                Label1");
//        label.setBackground(Color.WHITE);
        paintPanel = new PaintPanel();
        
//		ボタンの作成        
//      JButton button = new JButton("Clear");
        clearButton = new JButton("Clear!");
        clearButton.addActionListener(this);
        button1 = new JButton("button1");
        button2 = new JButton("button2");
        
        // ボタンの配置
        buttonPane = new JPanel();
        buttonPane.add(clearButton);
        buttonPane.add(button1);
        buttonPane.add(button2);
        
        contentPane.add(paintPanel, BorderLayout.CENTER);
//      contentPane.add(label, BorderLayout.CENTER);
//      contentPane.add(button, BorderLayout.SOUTH);
        contentPane.add(buttonPane, BorderLayout.SOUTH);
        
        mainFrame.setVisible(true);
	}
	
	public static void main(String[] args) {
        // ウィンドウを表示
        new kadai13_02();
	}
	
	// アクションが起こった時に呼び出し
	public void actionPerformed(ActionEvent event){
		// イベントがどのコンポーネントで起こったのかを検出
		if(event.getSource() == clearButton)
		{
			// paintPanelをクリアする
			paintPanel.clearComponent();
		}
		
	}
}
