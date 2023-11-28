**Tecnologias: Java e MySql.**

**Para utilizar o MySql local, basta rodar o script:**

```
CREATE DATABASE DBGRS;

USE DBGRS;

CREATE TABLE QUESTOES
(
    ID VARCHAR(10) NOT NULL PRIMARY KEY,
    NAME VARCHAR(150) NULL,
    OPT1 VARCHAR(70) NULL,
    OPT2 VARCHAR(70) NULL,
    OPT3 VARCHAR(70) NULL,
    OPT4 VARCHAR(70) NULL,
    RESPOSTA VARCHAR(70) NULL
);

```
**OBS:** alterar classe **DBConnection** com os parâmetros necessários para conexão local do seu próprio servidor.<br>
<br>**Integrantes:**<br>
Gustavo Grassini Calabrez<br>
Gabriel Cabreira Quirino<br>
Bruno da Silva<br>
Cauã Barchi F. F.
