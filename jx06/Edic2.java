import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

class Edic2 extends JFrame implements ActionListener {
    private Container c;
    private JButton b1, b2, b3;
    private JTextField tf1;
    private JLabel label;
    private Map<String, String> translate = new HashMap<>();

    public Edic2() {
        String readData;

        try (BufferedReader br = new BufferedReader(new FileReader("dic.txt"))) {

            while ((readData = br.readLine()) != null) {

                String en = readData.trim();
                readData = br.readLine();
                String jp = readData.trim();

                translate.put(en, jp);

            }
        } catch (IOException e1) {
            System.out.println("Read Error");
        }

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150); // フレームのサイズを修正
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

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            String str = tf1.getText();

           
            if (translate.containsKey(str)) {
                String rstr = translate.get(str);
                label.setText(rstr);
            } else {
                label.setText("Not found");
            }

        } else if (e.getSource() == b2) {
            tf1.setText("");
            label.setText("");
        } else if (e.getSource() == b3) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Edic2 ed2 = new Edic2();
                ed2.setVisible(true);
            }
        });
    }
}
