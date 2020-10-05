package Bai4_LopVaDoiTuong.Bai_tap.B2_xay_dung_lop_StopWatch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StopWatch myClock = new StopWatch();

        long myarr[];
        myarr = new long[100000000];
        for(int i = 0; i < myarr[1000000]; i++){
            myarr[i] = (long)Math.random() * 1000;
        }

        myClock.startTime();
        Arrays.sort(myarr);
        myClock.endTime();
        System.out.println( myClock.getElapsedTime());
    }
}
