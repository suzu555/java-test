import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Kwkwkw {
    public static void main( String[] args) throws IOException{
        SwingTest test2 = new SwingTest("SwingTest");
        test2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test2.setVisible(true);
        Graphics g = test2.getGraphics();
        // 描画のサンプル
        g.setColor(Color.BLACK);
        /*
        while(false){
            for (int i = 1; i <= 1000; i++){
                //y=ax^2+bx+c
                //画面端だから、1000あるとして最大を1000にするから
                //(x-1000)(x-500)(x-10)=
                //double i2 = ;
                g.fillOval(10*i, 1*(i*i+2*i+1), 100, 100);
                g.fillOval(1*(i*i+2*i+1),10*i, 100, 100);
            }
        }
        */
            // FileWriterクラスのオブジェクトを生成する
            File file = new File("abc\\java.txt");
            FileWriter file2 = new FileWriter(file, true);
            // PrintWriterクラスのオブジェクトを生成する
            BufferedWriter buff = new BufferedWriter(file2);
            PrintWriter pw = new PrintWriter(buff);
            //ファイルに追記する
            pw.println("pineapple");
            pw.println("banana");
            //ファイルパスを取得する
            String str = file.getAbsolutePath();
            System.out.println("pass : " + str);
            //ファイルを閉じる
            pw.close();
            buff.close();
            file2.close();


    }
}
//ウインドウの登録など
class SwingTest extends JFrame {

    public SwingTest(String title) {
        setTitle(title);
        setBounds( 10, 10, 300, 200);
        //setResizable(false);
        //setAlwaysOnTop(true);
       addWindowListener(new myListener());
    }
}
//ウィンドウを閉じる
class myListener extends WindowAdapter{
    public void windowClosing(WindowEvent e) {
      System.out.println("Window closing");
    }
    public void windowActivated(WindowEvent e){
        Graphics g = e.getComponent().getGraphics();
        // 描画のサンプル
        g.setColor(Color.RED);
        g.fillOval(50, 50, 100, 100);
    }
    public void windowOpened(WindowEvent e){
    }
    public void windowStateChanged(WindowEvent e){
    }
}
