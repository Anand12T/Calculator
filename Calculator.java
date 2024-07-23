import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculator {

    private JFrame frame;
    private JTextField textField;

    double first;
    double second;
    double result;
    String operation;
    String answer;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Calculator window = new Calculator();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Create the application.
     */
    public Calculator() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 342, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        textField = new JTextField();
        textField.setBackground(new Color(202, 255, 202));
        textField.setFont(new Font("Tahoma", Font.BOLD, 25));
        textField.setBounds(16, 26, 298, 69);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        JButton btnBackspace = new JButton("\uF0E7");
        btnBackspace.setFont(new Font("Wingdings", Font.BOLD, 25));
        btnBackspace.addActionListener(e -> {
            String backSpace = null;
            if (textField.getText().length() > 0) {
                StringBuilder str = new StringBuilder(textField.getText());
                str.deleteCharAt(textField.getText().length() - 1);
                backSpace = str.toString();
                textField.setText(backSpace);
            }
        });
        btnBackspace.setBounds(17, 106, 72, 55);
        frame.getContentPane().add(btnBackspace);

        JButton btn7 = new JButton("7");
        btn7.setBackground(new Color(192, 192, 192));
        btn7.setFont(new Font("Tahoma", Font.BOLD, 25));
        btn7.addActionListener(e -> {
            String number = textField.getText() + btn7.getText();
            textField.setText(number);
        });
        btn7.setBounds(17, 163, 72, 55);
        frame.getContentPane().add(btn7);

        JButton btn4 = new JButton("4");
        btn4.setBackground(new Color(192, 192, 192));
        btn4.addActionListener(e -> {
            String number = textField.getText() + btn4.getText();
            textField.setText(number);
        });
        btn4.setFont(new Font("Tahoma", Font.BOLD, 25));
        btn4.setBounds(17, 221, 72, 55);
        frame.getContentPane().add(btn4);

        JButton btn1 = new JButton("1");
        btn1.setBackground(new Color(192, 192, 192));
        btn1.addActionListener(e -> {
            String number = textField.getText() + btn1.getText();
            textField.setText(number);
        });
        btn1.setFont(new Font("Tahoma", Font.BOLD, 25));
        btn1.setBounds(17, 280, 72, 55);
        frame.getContentPane().add(btn1);

        JButton btn0 = new JButton("0");
        btn0.setBackground(new Color(192, 192, 192));
        btn0.addActionListener(e -> {
            String number = textField.getText() + btn0.getText();
            textField.setText(number);
        });
        btn0.setFont(new Font("Tahoma", Font.BOLD, 25));
        btn0.setBounds(17, 338, 72, 55);
        frame.getContentPane().add(btn0);

        JButton btnClear = new JButton("C");
        btnClear.setBackground(new Color(255, 119, 119));
        btnClear.addActionListener(e -> textField.setText(null));
        btnClear.setFont(new Font("Tahoma", Font.BOLD, 25));
        btnClear.setBounds(92, 106, 72, 55);
        frame.getContentPane().add(btnClear);

        JButton btn8 = new JButton("8");
        btn8.setBackground(new Color(192, 192, 192));
        btn8.setFont(new Font("Tahoma", Font.BOLD, 25));
        btn8.addActionListener(e -> {
            String number = textField.getText() + btn8.getText();
            textField.setText(number);
        });
        btn8.setBounds(92, 163, 72, 55);
        frame.getContentPane().add(btn8);

        JButton btn5 = new JButton("5");
        btn5.setBackground(new Color(192, 192, 192));
        btn5.addActionListener(e -> {
            String number = textField.getText() + btn5.getText();
            textField.setText(number);
        });
        btn5.setFont(new Font("Tahoma", Font.BOLD, 25));
        btn5.setBounds(92, 221, 72, 55);
        frame.getContentPane().add(btn5);

        JButton btn2 = new JButton("2");
        btn2.setBackground(new Color(192, 192, 192));
        btn2.addActionListener(e -> {
            String number = textField.getText() + btn2.getText();
            textField.setText(number);
        });
        btn2.setFont(new Font("Tahoma", Font.BOLD, 25));
        btn2.setBounds(92, 280, 72, 55);
        frame.getContentPane().add(btn2);

        JButton btnDot = new JButton(".");
        btnDot.addActionListener(e -> {
            String number = textField.getText() + btnDot.getText();
            textField.setText(number);
        });
        btnDot.setFont(new Font("Tahoma", Font.BOLD, 25));
        btnDot.setBounds(92, 338, 72, 55);
        frame.getContentPane().add(btnDot);

        JButton btn00 = new JButton("00");
        btn00.setBackground(new Color(192, 192, 192));
        btn00.addActionListener(e -> {
            String number = textField.getText() + btn00.getText();
            textField.setText(number);
        });
        btn00.setFont(new Font("Tahoma", Font.BOLD, 25));
        btn00.setBounds(167, 106, 72, 55);
        frame.getContentPane().add(btn00);

        JButton btn9 = new JButton("9");
        btn9.setBackground(new Color(192, 192, 192));
        btn9.addActionListener(e -> {
            String number = textField.getText() + btn9.getText();
            textField.setText(number);
        });
        btn9.setFont(new Font("Tahoma", Font.BOLD, 25));
        btn9.setBounds(167, 163, 72, 55);
        frame.getContentPane().add(btn9);

        JButton btn6 = new JButton("6");
        btn6.setBackground(new Color(192, 192, 192));
        btn6.addActionListener(e -> {
            String number = textField.getText() + btn6.getText();
            textField.setText(number);
        });
        btn6.setFont(new Font("Tahoma", Font.BOLD, 25));
        btn6.setBounds(167, 221, 72, 55);
        frame.getContentPane().add(btn6);

        JButton btn3 = new JButton("3");
        btn3.setBackground(new Color(192, 192, 192));
        btn3.addActionListener(e -> {
            String number = textField.getText() + btn3.getText();
            textField.setText(number);
        });
        btn3.setFont(new Font("Tahoma", Font.BOLD, 25));
        btn3.setBounds(167, 280, 72, 55);
        frame.getContentPane().add(btn3);

        JButton btnEqual = new JButton("=");
        btnEqual.setBackground(new Color(128, 255, 128));
        btnEqual.addActionListener(e -> {
            second = Double.parseDouble(textField.getText());
            switch (operation) {
                case "+":
                    result = first + second;
                    break;
                case "-":
                    result = first - second;
                    break;
                case "*":
                    result = first * second;
                    break;
                case "/":
                    result = first / second;
                    break;
                case "%":
                    result = first % second;
                    break;
            }
            answer = String.format("%.2f", result);
            textField.setText(answer);
        });
        btnEqual.setFont(new Font("Tahoma", Font.BOLD, 25));
        btnEqual.setBounds(167, 338, 72, 55);
        frame.getContentPane().add(btnEqual);

        JButton btnPlus = new JButton("+");
        btnPlus.setBackground(new Color(213, 241, 255));
        btnPlus.addActionListener(e -> {
            first = Double.parseDouble(textField.getText());
            textField.setText("");
            operation = "+";
        });
        btnPlus.setFont(new Font("Tahoma", Font.BOLD, 25));
        btnPlus.setBounds(242, 106, 72, 55);
        frame.getContentPane().add(btnPlus);

        JButton btnSub = new JButton("-");
        btnSub.setBackground(new Color(213, 241, 255));
        btnSub.addActionListener(e -> {
            first = Double.parseDouble(textField.getText());
            textField.setText("");
            operation = "-";
        });
        btnSub.setFont(new Font("Tahoma", Font.BOLD, 25));
        btnSub.setBounds(242, 163, 72, 55);
        frame.getContentPane().add(btnSub);

        JButton btnMul = new JButton("*");
        btnMul.setBackground(new Color(213, 241, 255));
        btnMul.addActionListener(e -> {
            first = Double.parseDouble(textField.getText());
            textField.setText("");
            operation = "*";
        });
        btnMul.setFont(new Font("Tahoma", Font.BOLD, 25));
        btnMul.setBounds(242, 221, 72, 55);
        frame.getContentPane().add(btnMul);

        JButton btnDivd = new JButton("/");
        btnDivd.setBackground(new Color(213, 241, 255));
        btnDivd.addActionListener(e -> {
            first = Double.parseDouble(textField.getText());
            textField.setText("");
            operation = "/";
        });
        btnDivd.setFont(new Font("Tahoma", Font.BOLD, 25));
        btnDivd.setBounds(242, 280, 72, 55);
        frame.getContentPane().add(btnDivd);

        JButton btnPercent = new JButton("%");
        btnPercent.setBackground(new Color(213, 241, 255));
        btnPercent.addActionListener(e -> {
            first = Double.parseDouble(textField.getText());
            textField.setText("");
            operation = "%";
        });
        btnPercent.setFont(new Font("Tahoma", Font.BOLD, 25));
        btnPercent.setBounds(242, 338, 72, 55);
        frame.getContentPane().add(btnPercent);

        JLabel lblNewLabel = new JLabel("Anand Tripathi");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel.setBounds(112, 11, 115, 14);
        frame.getContentPane().add(lblNewLabel);
    }
}
