public class MegaBytesConverter {
    //challenge no.2
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(1023);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
      int mb = kiloBytes / 1024;
      int remainKb = kiloBytes % 1024;
      if((kiloBytes >= 1024 || kiloBytes == 0) && (kiloBytes < 1024)){
          System.out.println(kiloBytes + " KB = " + mb + " MB and " + remainKb + " KB");
      }else{
          System.out.println("Invalid Value");
      }
    }
}
