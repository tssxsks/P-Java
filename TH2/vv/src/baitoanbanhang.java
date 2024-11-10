import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Lớp KhachHang
class KhachHang {
    private static int counter = 1;
    private String maKH, tenKH, gioiTinh, ngaySinh, diaChi;

    public KhachHang(String tenKH, String gioiTinh, String ngaySinh, String diaChi) {
        this.maKH = String.format("KH%03d", counter++);
        this.tenKH = tenKH;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getMaKH() {
        return maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public String getDiaChi() {
        return diaChi;
    }
}

// Lớp MatHang
class MatHang {
    private static int counter = 1;
    private String maMH, tenMH, donViTinh;
    private int giaMua, giaBan;

    public MatHang(String tenMH, String donViTinh, int giaMua, int giaBan) {
        this.maMH = String.format("MH%03d", counter++);
        this.tenMH = tenMH;
        this.donViTinh = donViTinh;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public String getMaMH() {
        return maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public int getGiaMua() {
        return giaMua;
    }

    public int getGiaBan() {
        return giaBan;
    }
}

class HoaDon {
    private static int counter = 1;
    private String maHD;
    private KhachHang khachHang;
    private MatHang matHang;
    private int soLuong;

    public HoaDon(KhachHang khachHang, MatHang matHang, int soLuong) {
        this.maHD = String.format("HD%03d", counter++);
        this.khachHang = khachHang;
        this.matHang = matHang;
        this.soLuong = soLuong;
    }

    public String getMaHD() {
        return maHD;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public MatHang getMatHang() {
        return matHang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public int tinhThanhTien() {
        return matHang.getGiaBan() * soLuong;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s %d %d %d %d", maHD, khachHang.getTenKH(), khachHang.getDiaChi(),
                matHang.getTenMH(), matHang.getDonViTinh(), matHang.getGiaMua(), matHang.getGiaBan(), soLuong, tinhThanhTien());
    }
}

public class baitoanbanhang {
    public static void main(String[] args) throws IOException {
        List<KhachHang> khachHangList = new ArrayList<>();
        List<MatHang> matHangList = new ArrayList<>();
        List<HoaDon> hoaDonList = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader("KH.in"));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String tenKH = br.readLine();
            String gioiTinh = br.readLine();
            String ngaySinh = br.readLine();
            String diaChi = br.readLine();
            khachHangList.add(new KhachHang(tenKH, gioiTinh, ngaySinh, diaChi));
        }
        br.close();

        br = new BufferedReader(new FileReader("MH.in"));
        int m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            String tenMH = br.readLine();
            String donViTinh = br.readLine();
            int giaMua = Integer.parseInt(br.readLine());
            int giaBan = Integer.parseInt(br.readLine());
            matHangList.add(new MatHang(tenMH, donViTinh, giaMua, giaBan));
        }
        br.close();

        br = new BufferedReader(new FileReader("HD.in"));
        int k = Integer.parseInt(br.readLine());
        for (int i = 0; i < k; i++) {
            String[] parts = br.readLine().split("\\s+");
            String maKH = parts[0];
            String maMH = parts[1];
            int soLuong = Integer.parseInt(parts[2]);

            KhachHang khachHang = khachHangList.stream()
                    .filter(kh -> kh.getMaKH().equals(maKH))
                    .findFirst()
                    .orElse(null);

            MatHang matHang = matHangList.stream()
                    .filter(mh -> mh.getMaMH().equals(maMH))
                    .findFirst()
                    .orElse(null);

            if (khachHang != null && matHang != null) {
                hoaDonList.add(new HoaDon(khachHang, matHang, soLuong));
            }
        }
        br.close();

        for (HoaDon hoaDon : hoaDonList) {
            System.out.println(hoaDon);
        }
    }
}
