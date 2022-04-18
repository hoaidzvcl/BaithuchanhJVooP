package app71;

public class Htron {
    private float pi = 3.14f;
    private float bk;
    
    public void setBanKinh(float bk){
        this.bk = bk;
    }

    public float tinhChuVi(){
        return 2 * pi * bk;
    }

    public float tinhDienTich(){
        return pi * bk * bk;
    }
}
