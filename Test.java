import java.util.Random;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Dimension;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Test {
    public static void main( String[] args) {
        System.out.println("Hello-JAVA-HOME-とかを自動でして貰ったよ！！後はファイルを.javaで保存してからに気付いて動いたよ！！！「Visual Studio Code Installer for Java」ソフト使ったよ！！！楽だった、絶望だった環境変数を今だに操作・・・");
        int result;
        result = 1 + 3;
        System.out.println(result);
        System.out.println(2 * 5);
        System.out.println(125655/4);
        System.out.println(3/4);
        String name;
        name = "我々は宇宙人だ";
        //メッセージの送入！！！
        System.out.println(name); 
        System.out.println(97);
        System.out.println("こんにちは¥nお元気ですか");
        System.out.println(0x5F);
        System.out.println(2.4e-3);
        int num;
        num = ((10 + 8) / 2) * 4;
        System.out.print("((10 + 8) / 2) * 4 = ");
        System.out.println(num);
        System.out.println("目覚まし" + "時計");
        int sum = 0;

        for (int i = 1; i <= 10; i++){
            sum += i;
        }
        System.out.println("合計は" + sum + "です");

        Random random = new Random();
        int randomValue = random.nextInt(5);
        int num2 = 2;
        num2 = randomValue + 1;
        switch (num2){
            case 1:
                System.out.println("元気いっぱい");
                break;
            case 5:
                System.out.println("元気はつらつ");
                break;
            default:
                System.out.println("ジェットゴー");
        }
        test();
        MyFrame f = new MyFrame();
        f.setVisible(true);
        SwingTest test2 = new SwingTest("SwingTest");
        test2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test2.setVisible(true);
    }
    private static void test(){
        //y=x^3-2;
        double num3=0.002,x=1,x1=1,num4=0.2;
        int bool1=0,bool2=0;
        Random random = new Random();
        int randomValue = random.nextInt(999999999);
        x = randomValue;
        while((bool1 == 0) || (bool2 == 0)){
            //ax^3+bx^2+cx+d;
            num4 = x*x*x+x*x+x-91;
            x1 = x / 2;
            num3 = x1*x1*x1+x1*x1+x1-91;
            if(Math.abs(x - x1)<0.001){
                bool1 = 1;
                break;
            }
            if(Math.abs(num3)<0.001){
                bool2 = 1;
            }
            if(x < 0.0000001){
                x = random.nextInt(999999999);
            }else{
                x = x1;
            }

        }
        System.out.println("X=");
        System.out.println(x);
        System.out.println("Y=この値で打ち止め");
        System.out.println(num3);
    }
}
//ウインドウの登録など
class MyFrame extends Frame {
    public MyFrame() {
       setSize(300, 200);
       setTitle("awttest");
       addWindowListener(new MyWindowAdapter());
    }
}
//ウィンドウを閉じる
class MyWindowAdapter extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
       System.exit(0);
    }
}
//ウインドウの登録など
class SwingTest extends JFrame {
    public SwingTest(String title) {
        setTitle(title);
        setBounds( 10, 10, 300, 200);
       addWindowListener(new myListener());
    }
}
class myListener extends WindowAdapter{
    public void windowClosing(WindowEvent e) {
      System.out.println("Window closing");
    }
  }
