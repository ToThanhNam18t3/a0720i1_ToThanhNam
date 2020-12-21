-- 2. Hiển thị thông tin của tất cả nhân viên có trong hệ thống có 
-- tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 ký tự.
use case_study;

SELECT HoVaTen,substring_index(HoVaTen," ", -1) as TenNV
FROM nhanvien
having (tenNV LIKE 'H%' or 
	   tenNV LIKE 'K%' or 
       tenNV LIKE 'T%') AND length(tenNV) < 15;
       

-- 3.Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”
-- Check tuoi
SELECT *, (year(curdate()) - year(ngaysinh)) - (right(curdate(), 5) < right(ngaysinh, 5)) as tuoiKH
from khachhang;

-- Cau 3
SELECT *, (year(curdate()) - year(ngaysinh)) - (right(curdate(), 5) < right(ngaysinh, 5)) as tuoiKH
from khachhang
having (tuoiKH > 18 AND 
	   tuoiKH < 50) AND
       (DiaChi LIKE 'Đà%' or
       DiaChi LIKE 'Quảng T%');
	
-- 4.Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần.
-- Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng. Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”

Select HopDong.IDKhachHang,khachhang.HoTen, COUNT(HopDong.IDKhachHang) as SoLanDatPhong
FROM khachhang
INNER JOIN HopDong on khachhang.IDKhachHang = HopDong.IDKhachhang
INNER JOIN LoaiKhach on LoaiKhach.idLoaiKhach = khachhang.idLoaiKhach
where Loaikhach.tenloaikhach LIKE "Di%"
GROUP BY HopDong.IDKhachhang;

-- Test lấy Diamond
Select *
FROM khachhang
INNER JOIN HopDong on khachhang.IDKhachHang = HopDong.IDKhachhang
INNER JOIN LoaiKhach on LoaiKhach.idLoaiKhach = khachhang.idLoaiKhach
where Loaikhach.tenloaikhach LIKE "Di%";	

-- 5.Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong, NgayKetThuc, TongTien 
-- (Với TongTien được tính theo công thức như sau: ChiPhiThue + SoLuong*Gia, với SoLuong và Giá là từ bảng DichVuDiKem)
-- cho tất cả các Khách hàng đã từng đặt phỏng. (Những Khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).

Select khachhang.IDKhachHang, khachhang.HoTen, LoaiKhach.TenLoaiKhach,HopDong.IDHopDong,DichVu.TenDichVu,
		HopDong.NgayLamHopDong,HopDong.NgayKetThuc, HopDong.TongTien , 
	DichVu.ChiPhiThue + DichVuDiKem.DonVi * DichVuDiKem.Gia as tongtien
FROM khachhang
LEFT JOIN LoaiKhach on khachhang.IDLoaiKhach = LoaiKhach.IDLoaiKhach
LEFT JOIN HopDong on khachhang.IDKhachHang = HopDong.IDKhachHang
LEFT JOIN DichVu on HopDong.IDDichVu = DichVu.IDDichVu
LEFT JOIN HopDongChiTiet on HopDong.IDHopDong = HopDongChiTiet.IDHopDong
LEFT JOIN DichVuDiKem on HopDongChiTiet.IDDichVuDiKem = DichVuDiKem.IDDichVuDiKem;

-- 6. Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu 
-- của tất cả các loại Dịch vụ chưa từng được Khách hàng thực hiện đặt từ quý 1 của năm 2019 (Quý 1 là tháng 1, 2, 3).

SELECT DichVu.IDDichVu, DichVu.TenDichVu, DichVu.DienTich, DichVu.ChiPhiThue
FROM DichVu
WHERE 
	NOT DichVu.IDDichVu in( 
		SELECT HopDong.IDDichVu
        FROM Hopdong
    );
    
-- 7. Hiển thị thông tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu 
-- của tất cả các loại dịch vụ đã từng được Khách hàng đặt phòng trong năm 2018 nhưng chưa từng được Khách hàng đặt phòng  trong năm 2019.
    
SELECT DichVu.IDDichVu, DichVu.TenDichVu, DichVu.DienTich, DichVu.ChiPhiThue, year(HopDong.NgayLamHopDong) as namDKHD
FROM DichVu
JOIN LoaiDichVu ON DichVu.IDLoaiDichVu = LoaiDichVu.IDLoaiDichVu
JOIN HopDong ON DichVu.IDDichVu = HopDong.IDDichVu
having namDKHD like '2018';

-- 8.Hiển thị thông tin HoTenKhachHang có trong hệ thống, với yêu cầu HoThenKhachHang không trùng nhau.
-- Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên

-- Cach 1
SELECT distinct HoTen
from Khachhang;

-- Cach 2
SELECT HoTen
from KhachHang
GROUP BY HoTen;

-- Cach 3
SELECT HoTen from KhachHang
union
SELECT HoTen from KhachHang

-- 9.Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng 
-- với mỗi tháng trong năm 2019 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.

SELECT count(HopDong.IDHopDong) as SoLanDatPhong, month(HopDong.NgayLamHopDong) as ThangDKHD , year(HopDong.NgayLamHopDong) as NamDKHD, sum(HopDong.tongtien) as DoanhThu
from Hopdong
JOIN KhachHang ON HopDong.IDKhachHang = KhachHang.IDKhachHang
WHERE year(HopDong.NgayLamHopDong) = 2019
GROUP BY ThangDKHD;

-- 10. Hiển thị thông tin tương ứng với từng Hợp đồng thì đã sử dụng bao nhiêu Dịch vụ đi kèm. 
-- Kết quả hiển thị bao gồm IDHopDong, NgayLamHopDong, NgayKetthuc, TienDatCoc, SoLuongDichVuDiKem (được tính dựa trên việc count các IDHopDongChiTiet)

SELECT HopDong.IDHopDong, HopDong.NgayLamHopDong, HopDong.NgayKetThuc, HopDong.TienDatCoc
, COUNT(HopDongChiTiet.IDHopDong) as SoLuongDichVuDiKem
FROM HopDong
LEFT JOIN HopDongChiTiet ON HopDongChiTiet.IDHopDong = HopDong.IDHopDong
LEFT JOIN DichVuDiKem ON DichVuDiKem.IDDichVuDiKem = HopDongChiTiet.IDDichVuDiKem
GROUP BY HopDongChiTiet.IDHopDong;

-- ------------------------- HOI LAI TUTOR CAU NAY ---- DE KHONG RO! ----------------------


-- 11. 	Hiển thị thông tin các Dịch vụ đi kèm đã được sử dụng bởi những Khách hàng có TenLoaiKhachHang là “Diamond” và có địa chỉ là “Vinh” hoặc “Quảng Ngãi”.

SELECT KhachHang.HoTen,LoaiKhach.TenLoaiKhach, DichVuDiKem.IDDichVuDiKem, DichVuDiKem.TenDichVuDiKem
FROM DichVuDiKem
	JOIN HopDongChiTiet on DichVuDiKem.IDDichVuDiKem = HopDongChiTiet.IDDichVuDiKem
	JOIN HopDong on HopDongChiTiet.IDHopDong = HopDong.IDHopDong
	JOIN KhachHang on HopDong.IDKhachHang = KhachHang.IDKhachHang
	JOIN LoaiKhach on LoaiKhach.IDLoaiKhach = KhachHang.IDLoaiKhach
WHERE (LoaiKhach.IDLoaiKhach = 501 ) AND 
	   (KhachHang.DiaChi like "Vinh" OR 
        KhachHang.DiaChi like "Quảng Ngãi");
        
-- 12.	Hiển thị thông tin IDHopDong, TenNhanVien, TenKhachHang, SoDienThoaiKhachHang, TenDichVu, SoLuongDichVuDikem 
-- (được tính dựa trên tổng Hợp đồng chi tiết), TienDatCoc
-- của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 2019 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2019.
SELECT DichVu.TenDichVu, CuoiNam.IDHopDong, NhanVien.HoVaTen as HoVaTenNhanVien, KhachHang.HoTen,
	   KhachHang.SDT, DichVu.TenDichVu, CuoiNam.NgayLamHopDong, COUNT(HopDongChiTiet.IDHopDongChiTiet) as SoLuongDichVuDiKem
FROM 
(SELECT * FROM HopDong where NgayLamHopDong between '2019-10-01' AND '2019-12-31') as CuoiNam
LEFT JOIN (SELECT * FROM HopDong where NgayLamHopDong between '2019-01-01' AND '2019-06-30') as DauNam on CuoiNam.IDDichVu = DauNam.IDDichVu
LEFT JOIN HopDongChiTiet on CuoiNam.IDHopDong = HopDongChiTiet.IDHopDong
LEFT JOIN KhachHang on CuoiNam.IDKhachHang = KhachHang.IDKhachHang
LEFT JOIN NhanVien on CuoiNam.IDNhanVien = NhanVien.IDNhanVien
LEFT JOIN DichVu on CuoiNam.IDDichVu = DichVu.IDDichVu
WHERE DauNam.IDDichVu IS NULL
GROUP BY CuoiNam.IDHopDong;

-- 13.	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng. 
-- (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).

SELECT *, count(HopDongChiTiet.IDDichVuDiKem) as SoLuongTungDichVuDiKem 
FROM HopDongChiTiet 
GROUP BY IDDichVuDiKem
having SoLuongTungDichVuDiKem = (SELECT max(tonghop.SoLuongTungDichVuDiKem) FROM (SELECT  count(HopDongChiTiet.IDDichVuDiKem) as SoLuongTungDichVuDiKem 
FROM HopDongChiTiet GROUP BY IDDichVuDiKem) as tonghop);

-- 14.	Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất. 
-- Thông tin hiển thị bao gồm IDHopDong, TenLoaiDichVu, TenDichVuDiKem, SoLanSuDung.

SELECT * 
FROM HopDongChiTiet;

Select IDDichVuDiKEM
from dichvudikem;

SELECT * , COUNT(HopDongChiTiet.IDDichVuDiKem) as SoLuong
FROM HopDongChiTiet
JOIN DichVuDiKem on HopDongChiTiet.IDDichVuDiKem = DichVuDiKem.IDDichVuDiKem
GROUP BY HopDongChiTiet.IDDichVuDiKem
having SoLuong = 1;

-- 15.	Hiển thi thông tin của tất cả nhân viên bao gồm IDNhanVien, HoTen, TrinhDo, TenBoPhan, SoDienThoai, DiaChi 
-- mới chỉ lập được tối đa 3 hợp đồng từ năm 2018 đến 2019.

Select NhanVien.IDNhanVien, NhanVien.HoVaTen, NhanVien.IDTrinhDo, NhanVien.IDBoPhan, NhanVien.SDT, NhanVien.DiaChi, COUNT(HopDong.IDNhanVien) as SlhdCuaNV
FROM NhanVien
LEFT JOIN HopDong ON HopDong.IDNhanVien = NhanVien.IDNhanVien
where HopDong.NgayLamHopDong BETWEEN '2018-01-01' AND '2019-12-31' 
GROUP BY HopDong.IDNhanVien
having SlhdCuaNV <= 3;

-- 16.	Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2017 đến năm 2019.


-- 20.	Hiển thị thông tin của tất cả các Nhân viên và Khách hàng có trong hệ thống, thông tin hiển thị bao gồm
-- ID (IDNhanVien, IDKhachHang), HoTen, Email, SoDienThoai, NgaySinh, DiaChi.
 
 SELECT DISTINCT HoTen
 FROM KhachHang,NhanVien;
 
SELECT CONCAT('NV-',NhanVien.IDNhanVien) as ID , NhanVien.HoVaTen, NhanVien.Email, NhanVien.SDT, NhanVien.NgaySinh, NhanVien.DiaChi 
FROM NhanVien 
	UNION ALL
SELECT CONCAT('KH-',KhachHang.IDKhachHang), KhachHang.HoTen, KhachHang.Email, KhachHang.SDT, KhachHang.NgaySinh, KhachHang.DiaChi   
FROM KhachHang;


 































    
    












       

       

       






