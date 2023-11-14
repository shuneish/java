import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyForm3 extends JFrame implements ActionListener { // ActionListenerを実装
    private Container c;
    private JButton b1, b2;
    private JTextField tf1;

    public MyForm3(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(180, 100);
        setTitle("MyForm3");

        
        c = getContentPane();

        tf1 = new JTextField("", 16);
        b1 = new JButton("Print");
        b2 = new JButton("Clear");
       
        c.setLayout(new FlowLayout());
        c.add(tf1);
        c.add(b1);
        c.add(b2);
        

        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){ // ActionListenerの場合，イベントが発生するとこのメソッドが呼ばれる
        if(e.getSource() == b1){ // イベント発生時に行う処理を書く
            String str = tf1.getText();
            System.out.println(str);
        }else if(e.getSource() == b2){
         tf1.setText("");
        }
    }

    public static void main(String[] args) {
        MyForm3 mf = new MyForm3();

        mf.setVisible(true);
    }
}