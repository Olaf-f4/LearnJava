package Section5;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int remainder = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainder + " KB");
        }
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(-2500);
    }
}


//calculate (megaBytes and REMAINING kilobytes)) FROM the kilobytes parameter
// print results in the format " XX KB (<- original value KB) = YY MB and ZZ KB
//1 MB = 1024 KB