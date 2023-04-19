/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.ArrayList;
import model.ISinhVien;
import model.SinhVien;

/**
 *
 * @author Admin
 */
public class QLSV implements ISinhVien{
private ArrayList<SinhVien> list = new ArrayList<>();
    private SinhVien sv;
    private Object txtTen;
    @Override
    public void Add(SinhVien sv) {
        list.add(sv);
        
    }

    @Override
    public void Delete(int xoa) {
        list.remove(xoa);
    }

    @Override
    public void Update(int xoa, SinhVien av) {
        list.remove(xoa);
    
        list.add(sv);
    }

    @Override
    public ArrayList<SinhVien> xuatDs() {
        return this.list;
    }
    
    public void clear(){
        list.clear();
    }

}