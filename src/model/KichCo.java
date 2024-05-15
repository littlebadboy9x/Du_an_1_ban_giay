
package model;

import java.util.Date;


public class KichCo {
    private int id;
    private int name;
    private String status;
    private int nguoiTao;
    private int nguoiSua;
    private Date ngayTao;
    private Date ngaySua;
    private int deleted;

    public KichCo() {
    }

    public KichCo(int id, int name, String status, int nguoiTao, int nguoiSua, Date ngayTao, Date ngaySua, int deleted) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.nguoiTao = nguoiTao;
        this.nguoiSua = nguoiSua;
        this.ngayTao = ngayTao;
        this.ngaySua = ngaySua;
        this.deleted = deleted;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
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

    public int getDeleted() {
        return deleted;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }
    
    public Object[] toDataRow(){
        return new Object[]{this.id,this.name, this.ngaySua, this.ngayTao, this.nguoiSua,
                            this.nguoiTao, this.status, this.deleted};
    }
}
