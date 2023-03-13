-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Apr 28, 2022 at 03:32 AM
-- Server version: 5.7.26
-- PHP Version: 7.3.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tourist`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
CREATE TABLE IF NOT EXISTS `admin` (
  `name` varchar(100) NOT NULL,
  `phone` varchar(10) NOT NULL,
  `password` varchar(9) NOT NULL,
  UNIQUE KEY `name` (`name`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tourist`
--

DROP TABLE IF EXISTS `tourist`;
CREATE TABLE IF NOT EXISTS `tourist` (
  `name` varchar(100) NOT NULL,
  `district` varchar(100) NOT NULL,
  `description` varchar(2000) NOT NULL,
  `history` varchar(3000) NOT NULL,
  `hotels` varchar(100) NOT NULL,
  `map` varchar(200) NOT NULL,
  `pic1` varchar(200) NOT NULL,
  `pic2` varchar(200) NOT NULL,
  `pic3` varchar(200) NOT NULL,
  `traffic` varchar(200) NOT NULL,
  `rating` int(2) NOT NULL,
  UNIQUE KEY `name` (`name`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tourist`
--

INSERT INTO `tourist` (`name`, `district`, `description`, `history`, `hotels`, `map`, `pic1`, `pic2`, `pic3`, `traffic`, `rating`) VALUES
('Charminar', 'Hyderabad', 'The Charminar (\'four minarets\') constructed in 1591, is a monument located in Hyderabad, Telangana, India. The landmark has become known globally as a symbol of Hyderabad and is listed among the most recognized structures in India. It has also been officially incorporated as the Emblem of Telangana name Symbol \"Kakatiya arch, Charminar in Telangana state logo\". The Deccan Chronicle. 30 May 2014. Retrieved 1 July 2015. The Charminar\'s long history includes the existence of a mosque on its top floor for more than 425 years. While both historically and religiously significant, it is also known for its popular and busy local markets surrounding the structure, and has become one of the most frequented tourist attractions in Hyderabad. \r\n\r\n\r\n\r\n', 'The fifth ruler of the Qutub Shahi dynasty, Muhammad Qutub Shah, built the Charminar in 1591 after shifting his capital from Golkonda to the newly formed city of Hyderabad.\r\n\r\nThe Archaeological Survey of India (ASI), the current caretaker of the structure, mentions in its records, \"There are various theories regarding the purpose for which Charminar was constructed. However, it is widely accepted that Charminar was built at the center of the city, to commemorate the eradication of plague\", a deadly disease which was wide spread at that time. According to Jean de , a French traveler of the 17th century whose narration was complemented with the available Persian texts, the Charminar was constructed in the year 1591 CE, to commemorate the beginning of the second Islamic millennium year (1000 AH).\r\nThe event was celebrated far and wide in the Islamic world, thus Qutub Shah founded the city of Hyderabad to celebrate the event and commemorate it with the construction of this building.\r\n\r\nThe Charminar was constructed at the intersection of the historical trade route that connects the city to international markets through the port city of Machilipatnam. The Old City of Hyderabad was designed with Charminar as its centerpiece. The city was spread around the Charminar in four different quadrants and chambers, segregated according to the established settlements. Towards the north of Charminar is the Char Kaman, or four gateways, constructed in the cardinal direction. Additional eminent architects from Persia were also invited to develop the city plan. The structure itself was intended to serve as a mosque and madrasa. It is of Indo-Islamic architecture style, incorporating Persian architectural elements.', 'Taj faluknuma hotel ,SPOT on hotel ,Fab hotel Begum bazar', 'https://www.google.com/maps/d/embed?mid=13qxyaFoYAcmZhghhKMIn7DZF1Aw&ehbc=2E312F', 'https://upload.wikimedia.org/wikipedia/commons/thumb/5/5e/Charminar_in_Night.jpg/451px-Charminar_in_Night.jpg', 'https://upload.wikimedia.org/wikipedia/commons/thumb/b/b2/Panoramic_morning_view.jpg/684px-Panoramic_morning_view.jpg', 'https://upload.wikimedia.org/wikipedia/commons/thumb/d/d3/Gulza_Houz.jpg/330px-Gulza_Houz.jpg', '4000', 4);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `username` varchar(100) NOT NULL,
  `email` varchar(60) NOT NULL,
  `phone` varchar(10) NOT NULL,
  `pass` varchar(10) NOT NULL,
  `eligible` int(1) NOT NULL,
  UNIQUE KEY `phone` (`phone`),
  UNIQUE KEY `username` (`username`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`username`, `email`, `phone`, `pass`, `eligible`) VALUES
('pranay', 'pranay@gmail.com', '9553213888', '12345678', 0),
('sankeerth', 'sankeerthreddy2201@gmail.com', '9553213706', '12345678', 1);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
