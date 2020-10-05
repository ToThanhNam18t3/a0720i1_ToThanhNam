package Bai4_LopVaDoiTuong.Bai_tap.B2_xay_dung_lop_StopWatch;

public class StopWatch {
    double startTime;
    double endTime;

    public StopWatch(){
    }

    public StopWatch(double startTime, double endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public void startTime(){
        startTime = System.currentTimeMillis();
    }

    public void endTime(){
        endTime= System.currentTimeMillis();
    }

    public  long  getElapsedTime(){
        return (long) (endTime - startTime);
    }
}
