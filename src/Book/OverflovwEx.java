package Book;

public class OverflovwEx {
    public static void main(String[] args) {
        // 정수형- byte, short, int ,long
        short sMin = -32768;
        short sMax = 32767;
        char cMin = 0;
        char cMax = 65535;

        System.out.println("sMin = " + sMin);
        System.out.println("sMin-1= " +(short)(sMin-1)); // short -32768 최소값 -1 => 최대값 32768
        System.out.println("sMax = " + sMax);
        System.out.println("cMax+1= " + (short)(sMax+1)); // short 32767 최대값 +1 => 최소값 -32768
        System.out.println("cMin = " + (int)cMin);
        System.out.println("cMin-1 = " + (int)--cMin); // char 0 최소값 -1 => 최대값 65535
        System.out.println("cMax = " + (int) cMax);
        System.out.println("cMax+1 = " + (int)++cMax); // char 65535 최대값 +1 => 최소값 0
    }
}
