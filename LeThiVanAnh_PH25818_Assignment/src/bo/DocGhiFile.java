/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.NhanVien;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 *
 * @author Van Anh
 */
public class DocGhiFile {

    public String ghiFile(String path, List<NhanVien> lists) {
        String result = "";
        try {
            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
            }

            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            for (NhanVien nhanVien : lists) {
                oos.writeObject(nhanVien);
            }

            oos.close();
            fos.close();
            result = "Ghi file thanh cong";
        } catch (Exception e) {
            result = "Ghi file that bai";
        }
        return result;
    }

    public String docFile(String path, List<NhanVien> lists) {
        try {
            File file = new File(path);
            if (!file.exists()) {
                return "File khong ton tai";
            }

            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);

            NhanVien nhanVien = new NhanVien();
            while (fis.available() > 0) {
                nhanVien = (NhanVien) ois.readObject();
                lists.add(nhanVien);
            }

            ois.close();
            fis.close();
            return "Doc file thanh cong";
        } catch (Exception e) {
            return "Doc file that bai";
        }
    }
}
