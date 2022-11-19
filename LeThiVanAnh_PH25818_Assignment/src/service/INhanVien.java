/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import entity.NhanVien;
import java.util.List;

/**
 *
 * @author Van Anh
 */
public interface INhanVien {

    List<NhanVien> findNhanVien(List<NhanVien> lists, String maNV);

    NhanVien findIDRemove(List<NhanVien> listNV, String maNV);
}
