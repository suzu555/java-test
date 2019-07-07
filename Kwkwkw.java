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
import java.util.ResourceBundle;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.InputStream;



public class Kwkwkw {
    public static void main( String[] args) throws IOException {

        Properties properties = new Properties();
        //プロパティファイルのパスを指定する
        InputStream istream = new FileInputStream("Kwkwkw.properties");
        properties.load(istream);
        System.out.println(properties.getProperty("id"));
        System.out.println(properties.getProperty("pass"));

        SwingTest test2 = new SwingTest("SwingTest");
        test2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test2.setVisible(true);
            // FileWriterクラスのオブジェクトを生成する
            File file = new File("Kwkwkw.ini");
            FileWriter file2 = new FileWriter(file, true);
            // PrintWriterクラスのオブジェクトを生成する
            BufferedWriter buff = new BufferedWriter(file2);
            PrintWriter pw = new PrintWriter(buff);
            //ファイルに追記する
            String str2 = file.getAbsolutePath();
            pw.println("path="+str2);
            pw.println("abc=");
            //ファイルパスを取得する
            String str = file.getAbsolutePath();
            System.out.println("pass : " + str);
            //ファイルを閉じる
            pw.close();



    }
}
//ウインドウの登録など
class SwingTest extends JFrame {

    public SwingTest(String title) {
        setTitle(title);
        setBounds( 100, 100, 600, 450);
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
