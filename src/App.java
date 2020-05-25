public class App {
    public static void main(String[] args) throws Exception {
        // (1) 正規表現の文字列を定義
        String regex = "[0-9]+";

        // (2) 正規表現のパターンに適合するかをチェックする文字列を定義
        String sentence1 = "12";

        // (3) 正規表現のパターンに適合するかチェック
        System.out.println(sentence1.matches(regex));

        // (2) 正規表現のパターンに適合するかをチェックする文字列を定義
        String sentence2 = "1a2";

        // (3) 正規表現のパターンに適合するかチェック
        System.out.println(sentence2.matches(regex));

        // (2) 正規表現のパターンに適合するかをチェックする文字列を定義
        String sentence3 = "1.0";

        // (3) 正規表現のパターンに適合するかチェック
        System.out.println(sentence3.matches(regex));

        // (2) 正規表現のパターンに適合するかをチェックする文字列を定義
        String sentence4 = "-1";

        // (3) 正規表現のパターンに適合するかチェック
        System.out.println(sentence4.matches(regex));

        // (2) 正規表現のパターンに適合するかをチェックする文字列を定義
        String sentence5 = "485617";

        // (3) 正規表現のパターンに適合するかチェック
        System.out.println(sentence5.matches(regex));
    }
}