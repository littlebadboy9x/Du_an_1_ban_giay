
package model;

import java.util.Date;


public class ThuongHieu {
    private int id;
    private String name;
    private String status;
    private int nguoiTao;
    private int nguoiSua;
    private Date ngayTao;
    private Date ngaySua;

    public ThuongHieu() {
    }

    public ThuongHieu(int id, String name, String status, int nguoiTao, int nguoiSua, Date ngayTao, Date ngaySua) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.nguoiTao = nguoiTao;
        this.nguoiSua = nguoiSua;
        this.ngayTao = ngayTao;
        this.ngaySua = ngaySua;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNguoiTao() {
        return nguoiTao;
    }

    public void setNguoiTao(int nguoiTao) {
        this.nguoiTao = nguoiTao;
    }

    public int getNguoiSua() {
        return nguoiSua;
    }

    public void setNguoiSua(int nguoiSua) {
        this.nguoiSua = nguoiSua;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Date getNgaySua() {
        return ngaySua;
    }

    public void setNgaySua(Date ngaySua) {
        this.ngaySua = ngaySua;
    }
    
    public Object[] toDataRow(){
        return new Object[]{this.id,this.name, this.ngaySua, this.ngayTao, this.nguoiSua,
                            this.nguoiTao, this.status};
    }
}
