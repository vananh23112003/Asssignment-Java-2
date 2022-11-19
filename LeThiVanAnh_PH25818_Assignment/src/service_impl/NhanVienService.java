/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service_impl;

import entity.NhanVien;
import java.util.ArrayList;
import java.util.List;
import service.ICommon;
import service.INhanVien;

/**
 *
 * @author Van Anh
 */
public class NhanVienService implements ICommon<NhanVien>, INhanVien {

    //loadData
    @Override
    public List<NhanVien> loadData() {
        List<NhanVien> list = new ArrayList<>();
        list.add(new NhanVien("NV1", "Nguyen Thi A", 16, "a@gmaill.com", 8500000));
        list.add(new NhanVien("NV2", "Nguyen Van B", 17, "b@gmaill.com", 6500000));
        list.add(new NhanVien("NV3", "Nguyen Thi C", 18, "c@gmaill.com", 7400000));
        list.add(new NhanVien("NV4", "Nguyen Van D", 19, "d@gmaill.com", 3300000));
        return list;
    }

    //Ham find
    @Override
    public List<NhanVien> findNhanVien(List<NhanVien> lists, String maNV) {
        List<NhanVien> listFind = new ArrayList<>();
        for (NhanVien nhanVien : lists) {
            if (nhanVien.getMaNV().contains(maNV)) {
                listFind.add(nhanVien);
            }
        }
        return listFind;
    }

    //Ham findIDremove
    @Override
    public NhanVien findIDRemove(List<NhanVien> listNV, String maNV) {
        for (NhanVien nv : listNV) {
            if (nv.getMaNV().equalsIgnoreCase(maNV)) {
                return nv;
            }
        }
        return null;
    }
}
