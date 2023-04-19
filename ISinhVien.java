/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

//import javaviet.SinhVien;//
import java.util.ArrayList;
//import javaviet.SinhVien;//
public interface ISinhVien {
    public void Add(SinhVien sv);
    public void Delete(int xoa);
    public void Update(int xoa,SinhVien sv);
    public ArrayList<SinhVien> xuatDs();
}
