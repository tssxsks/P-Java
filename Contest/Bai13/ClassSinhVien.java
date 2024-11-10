
class ClassSinhVien{
    private String ma, name, lop, gmail, sdt;
    public ClassSinhVien(String ma, String name, String lop, String gmail, String sdt){
        this.ma = ma;
        this.name = name;
        this.lop = lop;
        this.gmail = gmail;
        this.sdt = "0" + sdt;
    }
    public String getLop(){
        return lop;
    }
    public String getMa(){
        return ma;
    }
    public String toString(){
        return ma + " " + name + " " + lop + " " + gmail + " " + sdt;
    }
}