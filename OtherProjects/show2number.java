import javax.swing.JOptionPane;
public class show2number {
    public static void main (String[]args){
        String strnum1, strnum2;
        String strNotification ="You've just enter :";

        strnum1 = JOptionPane.showInputDialog(null,"Please input the first number :","Input the first number",JOptionPane.INFORMATION_MESSAGE);
        strNotification += strnum1 + "and";
        strnum2 = JOptionPane.showInputDialog(null,"Please input the second number :","Input the second number",JOptionPane.INFORMATION_MESSAGE);
        strNotification += strnum2 ;
        JOptionPane.showMessageDialog(null,strNotification,"Show two number",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}