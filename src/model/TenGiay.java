
package model;

import java.util.Date;


public class TenGiay {
    private int id; //1
    private String Name; //2
    private String Status; //3
    private int nguoiTao; //4
    private int nguoiSua;//5
    private Date ngayTao;//6
    private Date ngaySua;//7

    public TenGiay() {
    }

    public TenGiay(int id, String Name, String Status, int nguoiTao, int nguoiSua, Date ngayTao, Date ngaySua) {
        this.id = id;
        this.Name = Name;
        this.Status = Status;
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
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
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
        return new Object[]{this.id,this.Name, this.Status,this.nguoiTao, this.nguoiSua, this.ngayTao, this.ngaySua};
    }
}
