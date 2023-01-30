
public class Triangle {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        int a = 5;
        int b = 6;
        int c = 5;

        if(a == b && b ==c && c == a) {
            System.out.println("正三角形です");
        }
        else if(a==b){
            System.out.println("二等辺三角形です");
        }
        else if(a==c){
            System.out.println("二等辺三角形です");
        }
        else if(c==b){
            System.out.println("二等辺三角形です");
        }
        else {
            System.out.println("不等辺三角形です");
        }
    }

}
