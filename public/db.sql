CREATE DATABASE Requiem;
SHOW DATABASES;
USE Requiem;

-- Create tables for the Requiem game database
CREATE TABLE IF NOT EXISTS `users` (
  `id` INT AUTO_INCREMENT PRIMARY KEY,
  `username` VARCHAR(50) NOT NULL UNIQUE,
  `password` VARCHAR(255) NOT NULL,
  `email` VARCHAR(100) NOT NULL UNIQUE,
  `created_at` TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO `users` (`username`, `password`, `email`) VALUES
('admin', 'pradaospina', 'juanpana10ospina@gmail.com'),
('user1', 'password123', 'juanes10ospina@gmail.com'),
('user2', 'mypassword', 'juanestebanpradaospina@gmail.com'),

CREATE TABLE IF NOT EXISTS `characters` (
  `id` INT AUTO_INCREMENT PRIMARY KEY,
  `user_id` INT NOT NULL,
  `name` VARCHAR(50) NOT NULL,
  `level` INT DEFAULT 1,
  `class` VARCHAR(50) NOT NULL,
  `created_at` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  FOREIGN KEY (`user_id`) REFERENCES `users`(`id`) ON DELETE CASCADE
);

INSERT INTO `characters` (`user_id`, `name`, `level`, `class`) VALUES
(1, 'Hero', 10, 'Warrior'),
(2, 'Mage', 5, 'Sorcerer'),
(3, 'Rogue', 7, 'Assassin');

CREATE TABLE IF NOT EXISTS `items` (
  `id` INT AUTO_INCREMENT PRIMARY KEY,
  `name` VARCHAR(100) NOT NULL,
  `description` TEXT,
  `type` VARCHAR(50) NOT NULL,
  `value` INT DEFAULT 0,
  `created_at` TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO `items` (`name`, `description`, `type`, `value`) VALUES
('Iron Sword', 'A sturdy iron sword.', 'Weapon', 100),
('Health Potion', 'Restores 50 health points.', 'Potion', 20),
('Leather Armor', 'Basic armor made of leather.', 'Armor', 150);

SELECT * FROM `users`;
SELECT * FROM `characters`;
SELECT * FROM `items`;
SELECT COUNT(*) FROM `users`;
SELECT COUNT(*) FROM `characters`;
SELECT COUNT(*) FROM `items`;
SELECT * FROM `users` WHERE `username` = 'admin';
SELECT * FROM `characters` WHERE `user_id` = 1;