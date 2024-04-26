package com.example.qnc;

/**
 * Created by Ardi on 26/10/2016.
 */

public class DetailCucianArr {
    private String id_detail;

    private String id_layanan,nama_layanan,qty,satuan,harga,subtotal,id_plg,id_kasir,id_transaksi;

    // buat constructor untuk memudahkan input data
    public DetailCucianArr(String id_detail, String id_layanan, String nama_layanan, String qty, String satuan, String harga, String subtotal, String id_plg, String id_kasir, String id_transaksi){
        this.id_detail = id_detail;
        this.id_layanan = id_layanan;
        this.nama_layanan = nama_layanan;
        this.qty = qty;
        this.satuan = satuan;
        this.harga = harga;
        this.subtotal = subtotal;
        this.id_plg = id_plg;
        this.id_kasir = id_kasir;
        this.id_transaksi = id_transaksi;
    }

    public String getid_detail() {
        return id_detail;
    }

    public void setid_detail(String id_detail) {
        this.id_detail = id_detail;
    }

    public String getid_layanan() {
        return id_layanan;
    }

    public void setid_layanan(String id_layanan) {
        this.id_layanan = id_layanan;
    }

    public String getnama_layanan() {
        return nama_layanan;
    }

    public void setnama_layanan(String nama_layanan) {
        this.nama_layanan = nama_layanan;
    }

    public String getqty() {
        return qty;
    }

    public void setqty(String qty) {
        this.qty = qty;
    }

    public String getsatuan() {
        return satuan;
    }

    public void setsatuan(String satuan) {
        this.satuan = satuan;
    }

    public String getharga() {
        return harga;
    }

    public void setharga(String harga) {
        this.harga = harga;
    }

    public String getsubtotal() {
        return subtotal;
    }

    public void setsubtotal(String subtotal) {
        this.subtotal = subtotal;
    }

    public String getid_plg() {
        return id_plg;
    }

    public void setid_plg(String id_plg) {
        this.id_plg = id_plg;
    }

    public String getid_kasir() {
        return id_kasir;
    }

    public void setid_kasir(String id_kasir) {
        this.id_kasir = id_kasir;
    }

    public String getid_transaksi() {
        return id_transaksi;
    }

    public void setid_transaksi(String id_transaksi) {
        this.id_transaksi = id_transaksi;
    }

}
