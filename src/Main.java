public class Main {

    public static void main(String[] args) {
    towerOfHanoi('A', 'B','C',4);
    }

    public static void towerOfHanoi(char a, char b, char c, int brikkenr){
        if (brikkenr==0){
            return;
        }

        towerOfHanoi(a,c,b,brikkenr-1);

        System.out.println("Flytter brikke "+brikkenr+" fra "+a+" til "+c);

        towerOfHanoi(b,a,c,brikkenr-1);
    }
}
