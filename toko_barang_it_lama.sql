-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 02, 2021 at 06:56 AM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 7.4.23

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `toko_barang_it_lama`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_akun`
--

CREATE TABLE `tb_akun` (
  `username` varchar(15) NOT NULL,
  `password` varchar(16) NOT NULL,
  `nama_jenispengguna` char(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_akun`
--

INSERT INTO `tb_akun` (`username`, `password`, `nama_jenispengguna`) VALUES
('Yanto', '123', 'owner'),
('admin', 'admin', 'owner'),
('Sanusi', '123', 'Karyawan'),
('Nanang', '445', 'Karyawan');

-- --------------------------------------------------------

--
-- Table structure for table `tb_barang`
--

CREATE TABLE `tb_barang` (
  `id_barang` int(11) NOT NULL,
  `nama` varchar(20) NOT NULL,
  `jenis` varchar(20) NOT NULL,
  `tipe_model` varchar(10) NOT NULL,
  `Brand_barang` longtext NOT NULL,
  `supplier` varchar(10) NOT NULL,
  `harga` int(11) NOT NULL,
  `Tgl_masuk` date NOT NULL,
  `jumlah` char(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_barang`
--

INSERT INTO `tb_barang` (`id_barang`, `nama`, `jenis`, `tipe_model`, `Brand_barang`, `supplier`, `harga`, `Tgl_masuk`, `jumlah`) VALUES
(123, 'Asus tuf', 'Laptop', '12', 'Asus', '420', 50000, '2021-11-09', '3'),
(147, 'Acer Predator', 'PC', 'X442U', 'Acer', '420', 90000, '2021-11-08', '6'),
(156, 'Acer R', 'Laptop', 'A442U', 'Acer', '420', 250000, '2021-12-16', '3'),
(239, 'Rexus Joystick GX7', 'Aksessoris PC', 'GX7', 'Rexus', '666', 24500000, '2021-12-23', '4'),
(887, 'Logitech Legion', 'Aksessoris PC', '8990', 'Logitech', '345', 90000, '2021-12-23', '7');

-- --------------------------------------------------------

--
-- Table structure for table `tb_karyawan`
--

CREATE TABLE `tb_karyawan` (
  `id_karyawan` int(11) NOT NULL,
  `nama` varchar(20) NOT NULL,
  `alamat` longtext NOT NULL,
  `jenis_kelamin` longtext NOT NULL,
  `tanggal_lahir` date NOT NULL,
  `tanggal_masuk` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_karyawan`
--

INSERT INTO `tb_karyawan` (`id_karyawan`, `nama`, `alamat`, `jenis_kelamin`, `tanggal_lahir`, `tanggal_masuk`) VALUES
(123, 'Dayus', 'Sibonz', 'Pria', '2021-11-17', '2021-11-10'),
(445, 'Irfan', 'Sidoarjo', 'Pria', '1995-05-24', '2021-08-19'),
(446, 'Sanusi', 'Jember', 'Pria', '2021-12-15', '2021-12-16');

-- --------------------------------------------------------

--
-- Table structure for table `tb_owner`
--

CREATE TABLE `tb_owner` (
  `id_owner` int(11) NOT NULL,
  `nama` varchar(20) NOT NULL,
  `jenis_kelamin` varchar(11) NOT NULL,
  `alamat` varchar(20) NOT NULL,
  `no_ponsel` char(13) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `tb_supplier`
--

CREATE TABLE `tb_supplier` (
  `id_supplier` varchar(11) NOT NULL,
  `nama` varchar(15) NOT NULL,
  `alamat` varchar(20) NOT NULL,
  `no_telp` char(13) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_supplier`
--

INSERT INTO `tb_supplier` (`id_supplier`, `nama`, `alamat`, `no_telp`) VALUES
('345', 'PT Putera Jaya', 'JL. Sukrawetan', '081833452'),
('420', 'PT Sinar Jaya', 'JL. Salak No.9', '08673817219'),
('664', 'PT Sumber Teran', 'Surabaya', '0897542321'),
('666', 'PT SINAR TERANG', 'JMBER', '089696969');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `no_transaksi` varchar(10) NOT NULL,
  `id_barang` int(11) NOT NULL,
  `nama` varchar(20) NOT NULL,
  `tipe_barang` varchar(20) NOT NULL,
  `merek_barang` char(15) NOT NULL,
  `harga` varchar(15) NOT NULL,
  `jumlah` char(3) NOT NULL,
  `total` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`no_transaksi`, `id_barang`, `nama`, `tipe_barang`, `merek_barang`, `harga`, `jumlah`, `total`) VALUES
('1224', 147, 'Hasbro', 'Laptop', 'Aus', '6666', '2', '2'),
('13223', 147, 'sadsad', 'dwdad', 'dwdwa', '321321', '3', '32'),
('23231', 147, 'Acer Predator', 'X7', 'Acer', '9000000', '4', '423'),
('334231', 239, 'dsdsw', 'laptop', 'Asrock', '3231', '3', '5'),
('4331', 147, 'sadsad', 'dwdad', 'dwdwa', '321321', '3', '32'),
('43434', 147, 'sadsad', 'dwdad', 'dwdwa', '321321', '3', '32'),
('567893725', 239, 'Asus TUF GL552VS', 'Laptop', 'Asus', '236889000', '1', '23');

--
-- Triggers `transaksi`
--
DELIMITER $$
CREATE TRIGGER `tb_barang` AFTER INSERT ON `transaksi` FOR EACH ROW BEGIN
UPDATE tb_barang
SET jumlah = jumlah-NEW.jumlah
WHERE
id_barang =NEW.id_barang;
END
$$
DELIMITER ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_barang`
--
ALTER TABLE `tb_barang`
  ADD PRIMARY KEY (`id_barang`),
  ADD KEY `supplier` (`supplier`);

--
-- Indexes for table `tb_karyawan`
--
ALTER TABLE `tb_karyawan`
  ADD PRIMARY KEY (`id_karyawan`);

--
-- Indexes for table `tb_owner`
--
ALTER TABLE `tb_owner`
  ADD PRIMARY KEY (`id_owner`);

--
-- Indexes for table `tb_supplier`
--
ALTER TABLE `tb_supplier`
  ADD PRIMARY KEY (`id_supplier`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`no_transaksi`),
  ADD KEY `id_barang` (`id_barang`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tb_barang`
--
ALTER TABLE `tb_barang`
  ADD CONSTRAINT `tb_barang_ibfk_1` FOREIGN KEY (`supplier`) REFERENCES `tb_supplier` (`id_supplier`);

--
-- Constraints for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `transaksi_ibfk_1` FOREIGN KEY (`id_barang`) REFERENCES `tb_barang` (`id_barang`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
