package main;

import shapes.Hinhchunhat;
import shapes.Hinhtron;
import shapes.Hinhtru;
import shapes.Hinhvuong;

public class App54 {
    public static void main(String[] args) throws Exception {
        Hinhtron htron = new Hinhtron();
        htron.xuatTen();
        htron.nhapBanKinh();
        htron.tinhChuVi();
        htron.tinhDienTich();
        htron.inChuVi();
        htron.inDienTich();

        System.out.println();

        Hinhchunhat hcn = new Hinhchunhat();
        hcn.xuatTen();
        hcn.nhapChieuDai();
        hcn.nhapChieuRong();
        hcn.tinhChuVi();
        hcn.tinhDienTich();
        hcn.inChuVi();
        hcn.inDienTich();

        System.out.println();

        Hinhtru htru = new Hinhtru();
        htru.xuatTen();
        htru.nhapChieuCao();
        htru.tinhTheTich();
        htru.inTheTich();

        System.out.println();


        Hinhvuong hv = new Hinhvuong();
        hv.xuatTen();
        hv.nhapCanh();
        hv.tinhChuVi();
        hv.tinhDienTich();
        hv.inChuVi();
        hv.inDienTich();
    }
}