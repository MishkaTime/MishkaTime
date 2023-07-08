public class SongGenerator {

    public static void main(String[] args) {
        int bottle = 100;

        while (bottle>0){
            System.out.println(bottle +  (define(bottle, " бутылка", " бутылки", " бутылок") + " молока на борту \n беру одну, пускаю ко дну"));
            bottle = bottle-1;
        }

    }
    public static String define(int bottle, String suf1, String suf2, String suf3) {
        int suf = bottle % 100;
        if (suf > 9 && suf < 20) {
            return suf3;
        } else {
            suf = suf % 10;
        }
        if (suf == 1) {
            return suf1;
        } else if (suf > 1 && suf < 5) {
            return suf2;
        } else {
            return suf3;
        }
    }
}

















