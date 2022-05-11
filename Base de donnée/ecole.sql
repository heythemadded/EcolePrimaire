-- Database: `ecole`

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";
-- 
-- Table Enseignant
--

CREATE or replace TABLE `ENSEIGNANT` (
  `id` int(255) NOT NULL ,
  `nom` varchar(255) NOT NULL,
  `matiere` int NOT NULL,
  classe int not null,
  primary key(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
-- --------------------------------------


--
-- Table `eleve`
-- 

-- -------------------------------------


CREATE or replace TABLE `eleve` (
  `id` int(255) NOT NULL ,
  `nom` varchar(255) NOT NULL,
   classe int NOT NULL,
  `addresse` varchar(255) NOT NULL,
   primary key(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
-- -------------------------------------

--
-- Table de`matiere`
--
CREATE or replace TABLE `Matiere`(
	id int not null,
	nom varchar(255) NOT NULL ,
	nomF int not null,
	coef double(2,1) not null,
	primary key(id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- -------------------------------------


--
-- Table structure for table `Notes`
--

CREATE or replace TABLE `Notes` (
  `id`   int(255) NOT NULL ,
  `nomM` int NOT NULL ,
  `Note` double(4,2) NOT NULL

) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ------------------------------------


--
-- Table structure for table `user_login`
--

CREATE or replace TABLE `user_login` (
  `id` int(200) NOT NULL ,
  `username` varchar(200) NOT NULL,
  `password` varchar(200) NOT NULL,
  primary key(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
-- ----------------------------------------
-- 
-- Table Classe
--

Create or replace table classe(
	id int primary key,
	nom varchar(20)
);
Create or replace table filiere(
	id int primary key,
	nom varchar(255)
);




alter table enseignant add CONSTRAINT pk foreign key (matiere) REFERENCES matiere(id) ON DELETE CASCADE;

alter table notes add CONSTRAINT pk1 foreign key (id) REFERENCES eleve(id) ON DELETE CASCADE;
alter table notes add CONSTRAINT pk2 foreign key (nomM) REFERENCES matiere(id) ON DELETE CASCADE;
alter table notes add constraint pk3 primary key (id,nomM);

alter table eleve add CONSTRAINT pk4 foreign key (classe) REFERENCES classe(id) ON DELETE CASCADE;

alter table enseignant add CONSTRAINT pk5 foreign key (classe) REFERENCES classe(id) ON DELETE CASCADE;

alter table matiere add CONSTRAINT pk6 foreign key (nomF) REFERENCES filiere(id) ON DELETE CASCADE;



INSERT INTO `user_login` (`id`, `username`, `password`) VALUES
(1, 'admin', 'admin');
COMMIT;



