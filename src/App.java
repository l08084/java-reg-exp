import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {
        // (1) 正規表現のパターンを生成
        Pattern pattern = Pattern.compile("[0-9]+");

        // (2) 正規表現のパターンに適合するかをチェックする文字列
        String sentence1 = "12";

        // (3) 正規表現処理をおこなうためのクラスを取得
        Matcher matcher1 = pattern.matcher(sentence1);

        // (4) 正規表現のパターンに適合するかチェック
        System.out.println(matcher1.matches());

        // (2) 正規表現のパターンに適合するかをチェックする文字列
        String sentence2 = "1a2";

        // (3) 正規表現処理をおこなうためのクラスを取得
        Matcher matcher2 = pattern.matcher(sentence2);

        // (4) 正規表現のパターンに適合するかチェック
        System.out.println(matcher2.matches());

        // (2) 正規表現のパターンに適合するかをチェックする文字列
        String sentence3 = "1.0";

        // (3) 正規表現処理をおこなうためのクラスを取得
        Matcher matcher3 = pattern.matcher(sentence3);

        // (4) 正規表現のパターンに適合するかチェック
        System.out.println(matcher3.matches());

        // (2) 正規表現のパターンに適合するかをチェックする文字列
        String sentence4 = "-1";

        // (3) 正規表現処理をおこなうためのクラスを取得
        Matcher matcher4 = pattern.matcher(sentence4);

        // (4) 正規表現のパターンに適合するかチェック
        System.out.println(matcher4.matches());

        // (2) 正規表現のパターンに適合するかをチェックする文字列
        String sentence5 = "485617";

        // (3) 正規表現処理をおこなうためのクラスを取得
        Matcher matcher5 = pattern.matcher(sentence5);

        // (4) 正規表現のパターンに適合するかチェック
        System.out.println(matcher5.matches());
    }
}