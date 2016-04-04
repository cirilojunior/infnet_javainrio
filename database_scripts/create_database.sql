-- TABELA DE INSCRICOES
CREATE TABLE `inscricao` (
  `codigoIngresso` varchar(50) NOT NULL,
  `anoEdicao` int(10) unsigned NOT NULL,
  `data` datetime NOT NULL,
  `valorPago` decimal(10,0) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `cpf` varchar(11) NOT NULL,
  `senha` varchar(8) NOT NULL,
  `logradouro` varchar(200) NOT NULL,
  `numero` varchar(10) NOT NULL,
  `complemento` varchar(200) DEFAULT NULL,
  `bairro` varchar(100) NOT NULL,
  `cidade` varchar(100) NOT NULL,
  `estado` char(2) NOT NULL,
  `cep` varchar(9) NOT NULL,
  `telefone` varchar(13) NOT NULL,
  `email` varchar(100) NOT NULL,
  PRIMARY KEY (`codigoIngresso`),
  UNIQUE KEY `cpf_UNIQUE` (`cpf`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- USUARIO ADMIN
insert into `inscricao`(anoEdicao, data, email, telefone, cpf, bairro, cep, cidade, complemento, estado, logradouro, numero, nome, senha, valorPago, codigoIngresso) 
values(0,sysdate(), 'admin@javainrio.com', 'tel', 'admin', 'bairro', 'cep', 'cidade', null, 'RJ', 'rua', '0', 'admin', 'admin', 0, '0');

