import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


class Edic extends JFrame implements ActionListener { // ActionListenerを実装
    private Container c;
    private JButton b1, b2, b3;
    private JTextField tf1;
    private JLabel label;
    private String[][] dic;

    public Edic(){

        dic = new String[1024][2];

          String readData;
            int i=0;

            try(BufferedReader br = new BufferedReader(new FileReader("dic.txt"));){
               
                while( (readData = br.readLine()) != null){
                    
                    String en = readData.trim();
                    readData = br.readLine();
                    String jp = readData.trim();

                    dic[i][0] = en;
                    dic[i][1] = jp;
                    i++;
                }
            }
            catch(IOException e1){
                System.out.println("Read Error");
            }

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(180, 100);
        setTitle("Edic");

        
        c = getContentPane();

        tf1 = new JTextField("", 16);
        b1 = new JButton("Translate");
        b2 = new JButton("Clear");
        b3 = new JButton("Quit");
        label = new JLabel("");
       
        c.setLayout(new FlowLayout());
        c.add(tf1);
        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(label);


        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){ // ActionListenerの場合，イベントが発生するとこのメソッドが呼ばれる
        if(e.getSource() == b1){ // イベント発生時に行う処理を書く
            String str = tf1.getText();
            String rstr = new String();

            int j=0;

            while (dic[j][0] != null){

                if (str.equals(dic[j][0])){
                    rstr = dic[j][1];
                }

                j++; 
            }

            label.setText(rstr);

        }else if(e.getSource() == b2){
            tf1.setText("");
        }else if(e.getSource() == b3){
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Edic ed = new Edic();

        ed.setVisible(true);
    }
}