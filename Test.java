import java.util.Random;

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
    }
}