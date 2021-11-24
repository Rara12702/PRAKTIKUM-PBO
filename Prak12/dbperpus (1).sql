-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 24, 2021 at 05:51 AM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 8.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbperpus`
--

-- --------------------------------------------------------

--
-- Table structure for table `anggota`
--

CREATE TABLE `anggota` (
  `idanggota` int(11) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `alamat` varchar(255) NOT NULL,
  `telepon` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `anggota`
--

INSERT INTO `anggota` (`idanggota`, `nama`, `alamat`, `telepon`) VALUES
(1, 'Rara', 'Semanggi timur', '1234567890'),
(2, 'Aini', 'Graha dewata', '0987654321'),
(3, 'Auzan', 'Jember', '6543217890'),
(4, 'Navis', 'Sudimoro', '09876123456'),
(6, 'Sabrina', 'Buring', '0912873456');

-- --------------------------------------------------------

--
-- Table structure for table `buku`
--

CREATE TABLE `buku` (
  `idbuku` int(11) NOT NULL,
  `idkategori` int(11) NOT NULL,
  `judul` varchar(255) NOT NULL,
  `penerbit` varchar(255) NOT NULL,
  `penulis` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `buku`
--

INSERT INTO `buku` (`idbuku`, `idkategori`, `judul`, `penerbit`, `penulis`) VALUES
(1, 1, 'Dikta dan Hukum', 'Asoka aksara', 'Dhia Farah'),
(2, 1, 'Teluk Alaska', 'Bumi Semesta', 'Eka ariani'),
(3, 6, 'Bj Habibie', 'irc isod', 'Joner t.h situmorang'),
(4, 5, 'Naruto', 'Eleks media', 'Mashasi kaishimoto'),
(23, 1, 'Timun Mas', 'Elex Media', 'Bang Supit'),
(24, 17, 'Aljabar Linier', 'Springer', 'Alex Baldwin'),
(25, 1, 'Timun Mas', 'Elex Media', 'Bang Supit'),
(26, 17, 'Aljabar Linier', 'Springer', 'Alex Baldwin');

-- --------------------------------------------------------

--
-- Table structure for table `kategori`
--

CREATE TABLE `kategori` (
  `idkategori` int(11) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `keterangan` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `kategori`
--

INSERT INTO `kategori` (`idkategori`, `nama`, `keterangan`) VALUES
(1, 'Novel', 'Koleksi buku novel'),
(5, 'Komik', 'Kumpulan komik'),
(6, 'Biografi', 'Kumpulan biografi'),
(17, 'Referensi', 'Koleksi buku refrensi ilmiah');

-- --------------------------------------------------------

--
-- Table structure for table `peminjaman`
--

CREATE TABLE `peminjaman` (
  `idpeminjaman` int(11) NOT NULL,
  `idanggota` int(11) NOT NULL,
  `idbuku` int(11) NOT NULL,
  `tanggalpinjam` date NOT NULL,
  `tanggalkembali` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `peminjaman`
--

INSERT INTO `peminjaman` (`idpeminjaman`, `idanggota`, `idbuku`, `tanggalpinjam`, `tanggalkembali`) VALUES
(1, 1, 1, '2021-11-23', '2021-11-25'),
(2, 2, 3, '2021-11-21', '2021-11-23'),
(3, 3, 2, '2021-11-22', '2021-11-23'),
(4, 4, 4, '2021-11-18', '2021-11-20');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `anggota`
--
ALTER TABLE `anggota`
  ADD PRIMARY KEY (`idanggota`);

--
-- Indexes for table `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`idbuku`),
  ADD KEY `id_kategori` (`idkategori`);

--
-- Indexes for table `kategori`
--
ALTER TABLE `kategori`
  ADD PRIMARY KEY (`idkategori`);

--
-- Indexes for table `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD PRIMARY KEY (`idpeminjaman`),
  ADD KEY `id_anggota` (`idanggota`),
  ADD KEY `id_buku` (`idbuku`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `anggota`
--
ALTER TABLE `anggota`
  MODIFY `idanggota` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `buku`
--
ALTER TABLE `buku`
  MODIFY `idbuku` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;

--
-- AUTO_INCREMENT for table `kategori`
--
ALTER TABLE `kategori`
  MODIFY `idkategori` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT for table `peminjaman`
--
ALTER TABLE `peminjaman`
  MODIFY `idpeminjaman` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `buku`
--
ALTER TABLE `buku`
  ADD CONSTRAINT `id_kategori` FOREIGN KEY (`idkategori`) REFERENCES `kategori` (`idkategori`);

--
-- Constraints for table `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD CONSTRAINT `id_anggota` FOREIGN KEY (`idanggota`) REFERENCES `anggota` (`idanggota`),
  ADD CONSTRAINT `id_buku` FOREIGN KEY (`idbuku`) REFERENCES `buku` (`idbuku`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
