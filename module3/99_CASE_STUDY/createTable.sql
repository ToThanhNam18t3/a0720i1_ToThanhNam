use case_Study;

create table ViTri(
	IDViTri int(10) PRIMARY KEY NOT NULL,
    TenViTri Nvarchar(45) NOT NULL
);

create table TrinhDo(
	IDTrinhDo int(10) PRIMARY KEY NOT NULL, 
    TrinhDo Nvarchar(45) NOT NULL
);

create table BoPhan( 
	IDBoPhan int(10) PRIMARY KEY NOT NULL,
    TenBoPhan varchar(45) NOT NULL
);

create table NhanVien(
	IDNhanVien int(10) PRIMARY KEY NOT NULL,
    HoVaTen Nvarchar(30),
    IDViTri int(10),
    FOREIGN KEY (IDViTri) REFERENCES ViTri(IDViTri),
    IDTrinhDo int(10),
    FOREIGN KEY (IDTrinhDo) REFERENCES TrinhDo(IDTrinhDo),
    IDBoPhan int(10),
    FOREIGN KEY (IDBoPhan) REFERENCES BoPhan(IDBoPhan),
    NgaySinh Date NOT NULL, 
    SoCMTND varchar(45) NOT NULL,
    Luong varchar(45) NOT NULL,
    SDT varchar(45) NOT NULL,
    Email varchar(45) NOT NULL,
    DiaChi varchar(45) NOT NULL
);

create table DichVuDiKem(
	IDDichVuDiKem int PRIMARY KEY NOT NULL,
    TenDichVuDiKem Nvarchar(45),
    Gia int NOT NULL,
    DonVi int NOT NULL,
    TrangThaiKhaDung NvarChar(45) NOT NULL
);

create table HopDong(
	IDHopDong int(10) PRIMARY KEY NOT NULL,
    IDNhanVien int(10),
    FOREIGN KEY (IDNhanVien) REFERENCES Nhanvien(IDNhanVien),
    IDKhachHang int(10),
    FOREIGN KEY (IDKhachHang) REFERENCES KhachHang(IDKhachHang),
    IDDichVu int(10),
    FOREIGN KEY (IDDichVu) REFERENCES DichVu(IDDichVu),
    NgayLamHopDong Date NOT NULL,
    NgayKetThuc Date NOT NULL,
    TienDatCoc Date NOT NULL,
    TongTien int NOT NULL
);


create table HopDongChiTiet(
	IDHopDongChiTiet int PRIMARY KEY NOT NULL,
    IDHopDong int(10) NOT NULL,
    FOREIGN KEY (IDHopDong) REFERENCES HopDong(IDHopDong),
    IDDichVuDiKem int NOT NULL,
    FOREIGN KEY (IDDichVuDiKem) REFERENCES DichVuDiKem(IDDichVuDiKem),
    SoLuong int NOT NULL
);

create table KhachHang(
	IDKhachHang int PRIMARY KEY NOT NULL,
    IDLoaiKhach int(10),
    FOREIGN KEY (IDLoaiKhach) REFERENCES LoaiKhach(IDLoaiKhach),
    HoTen Nvarchar(45),
    NgaySinh Date NOT NULL,
    SoCMTND Nvarchar(45) NOT NULL,
    SDT varchar(45) NOT NULL,
    email varchar(45) NOT NULL,
    Diachi Nvarchar(45) NOT NULL
);

create table LoaiKhach(
	IDLoaiKhach int(10) PRIMARY KEY NOT NULL,
    TenLoaiKhach VARCHAR(45) NOT NULL
);

create table KieuThue(
	IDKieuThue int PRIMARY KEY NOT NULL,
    TenKieuThue Nvarchar(45),
    Gia int NOT NULL
);

create table LoaiDichVu(
	IDLoaiDichVu int PRIMARY KEY NOT NULL,
    TenLoaiDichVu Nvarchar(45)
);

create table DichVu(
	IDDichVu int PRIMARY KEY NOT NULL,
    TenDichVu Nvarchar(45) NOT NULL,
    DienTich int NOT NULL,
    SoTang int NOT NULL,
    SoNguoiToiDa NVarChar(45) NOT NULL,
    ChiPhiThue Nvarchar(45) NOT NULL,
    IDKieuThue int NOT NULL,
    FOREIGN KEY (IDKieuThue) REFERENCES KieuThue(IDKieuThue),
    IDLoaiDichVu int NOT NULL,
    FOREIGN KEY (IdLoaiDichVu) REFERENCES LoaiDichVu(IdLoaiDichVu),
    TrangThai Varchar(45) NOT NULL
)




