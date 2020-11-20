package Bai15_XuLyNgoaiLeVaDebug.Bai_Tap._01_Su_Dung_Lop_IllegalTriangleException;

public class IllegalTriangleException extends Exception {
    private String message;


    public IllegalTriangleException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
