import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
//import java.io.BufferedOutputStream;
//import java.io.FileOutputStream;
//import java.io.FileReader;
import java.io.File;
//import java.io.OutputStreamWriter;
//import java.nio.charset.Charset;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.nio.file.StandardOpenOption;
//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//import java.util.ResourceBundle;
//import java.util.Properties;
import java.io.FileInputStream;
//import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.net.Socket;
//import java.net.InetAddress;
import java.net.ServerSocket;


class Globalaa{
    static JTextArea area3;
    public Globalaa(){
    }
    public void test(){
    }
}
public class Kwkwkw {
    public static void main( String[] args) throws IOException,InterruptedException  {
        SwingTest test2 = new SwingTest("SwingTest");
        test2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test2.setVisible(true);
        //サーバー
        ServerSocket serverSocket = null;
        Socket socket2 = null;
        serverSocket = new ServerSocket(8800);
        System.out.println("EchoServerが起動しました(port="+ serverSocket.getLocalPort() + ")");


        //クライアント
        Socket socket = null;
        //socket = new Socket("localhost", 8800);
        socket = new Socket("192.168.6.50", 80);
        System.out.println("接続しました"+ socket.getRemoteSocketAddress());
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader keyIn = new BufferedReader(new InputStreamReader(System.in));
        String input;
        
        //サーバー
        /*
        socket2 = serverSocket.accept();
        System.out.println("接続されました "+ socket2.getRemoteSocketAddress() );
        BufferedReader in2 = new BufferedReader(new InputStreamReader(socket2.getInputStream()));
        PrintWriter out2 = new PrintWriter(socket2.getOutputStream(), true);
        String line2;
        */
        //input = keyIn.readLine();
        out.println("GET /");
/*
        line2 = in2.readLine();
        System.out.println("受信: " + line2);
        out2.println(line2);
        System.out.println("送信: " + line2);
*/ 
        char[] aaa = new char[65535];
        while(in.ready()){
                Thread.sleep(5000);
        }
            System.out.println("一回目からtrue");
            in.read(aaa);
            System.out.println(aaa);

        socket.close();
        serverSocket.close();
    }
}

//ウインドウの登録など
class SwingTest extends JFrame {
    static JTextArea area2;
    static final long serialVersionUID = 0L;
    public SwingTest(String title)  throws IOException {
//ウインドウの設定
        setTitle(title);
        setBounds( 100, 100, 600, 450);
        JPanel p = new JPanel();
        p.setLayout(null);
        Container contentPane = getContentPane();
        contentPane.add(p);

        JButton button2 = new JButton("確認");
        button2.addActionListener(new myListener2());
        button2.setBounds(0, 0, 60, 30);
        JButton button3 = new JButton("キャンセル");
        button3.addActionListener(new myListener3());
        button3.setBounds(50, 0, 100, 30);
        p.add(button2);
        p.add(button3);
        //setResizable(false);
        //setAlwaysOnTop(true);
        JTextArea area1 = new JTextArea("設定の書き込みを見る物\n");
        Globalaa test1 = new Globalaa();
        test1.area3 = area1;
        area1.setBackground(Color.WHITE);
        JScrollPane scrollpane1 = new JScrollPane(area1);
        scrollpane1.setBounds(0, 30, 582, 380);
        p.add(scrollpane1);
//気分で設置
       addWindowListener(new myListener());
    }
}

class Settei{
    public Settei(JTextArea area1) throws IOException{
//制御
        // FileWriterクラスのオブジェクトを生成する
        File file = new File("Kwkwkw.ini");
        if(file.exists()){
            if(file.isFile()){
                BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "Shift_JIS"));
                String str;
                while((str = br.readLine()) != null){
                  System.out.println(str);
                  String[] fruits = str.split("=");
                  switch(fruits[0]){
                  case "abc":
                    System.out.println(fruits[1]);
                  break;
                  case "cba":
                  System.out.println(fruits[1]);
                  break;
                  default:
                  }
                }
              
                br.close();
            }else{
                System.out.println("設定ファイルがディレクトリなんで、終了するよ！");
                System.exit(0);
            }
        }else{
//ファイルが存在しないんで、設定ファイルを作成
        FileWriter file2 = new FileWriter(file, true);
        // PrintWriterクラスのオブジェクトを生成する
        BufferedWriter buff = new BufferedWriter(file2);
        PrintWriter pw = new PrintWriter(buff);
        //ファイルパスを取得する
        String str = file.getAbsolutePath();
        String str2 = str.replace("Kwkwkw.ini", "");
        System.out.println("pass : " + str2 + str );
        area1.append("abc=" + str2 + "abc" + "\n");
        area1.append("cba=" + str2 + "cba" + "\n");
        //ファイルに追記する
        pw.println("abc="+str2 + "abc");
        pw.println("cba="+str2 + "cba");

//ディレクトリの作成
        File file3 = new File("abc");
        file3.mkdir();
        File file4 = new File("cba");
        file4.mkdir();
        //ファイルを閉じる
        pw.close();
        }
    }
    public void test() {        
    }
}
//ウィンドウを閉じる
class myListener extends WindowAdapter{
    public void windowActivated(WindowEvent e){
        Graphics g = e.getComponent().getGraphics();
        // 描画のサンプル
        g.setColor(Color.RED);
        g.fillOval(50, 50, 100, 100);
    }
    public void windowClosed(WindowEvent e) {
    }
    public void windowClosing(WindowEvent e) {
        System.out.println("Window closing");
    }
    public void windowDeactivated(WindowEvent e) {
    }
    public void windowDeiconified(WindowEvent e) {
    }
    public void windowGainedFocus(WindowEvent e) {
    }
    public void windowIconified(WindowEvent e) {
    }
    public void windowLostFocus(WindowEvent e) {
    }
    public void windowOpened(WindowEvent e) {
    }
    public void windowStateChanged(WindowEvent e) {
    }
}
class myListener2 implements ActionListener{
    public void actionPerformed(ActionEvent e) {
      /* ボタン1の処理したい内容をここに記述する */
      System.out.println("ボタンスタート");
      Globalaa test3 = new Globalaa();
      try {
        Settei setteistr = new Settei(test3.area3);
        setteistr.test();
      } catch ( IOException c) {
        System.out.println("アクションリスナーが止められないのなんで？" + c);
      }
    }
}
class myListener3 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        /* ボタン2の処理したい内容をここに記述する */
        System.out.println("終了するよ！");
        System.exit(0);
    }
}
