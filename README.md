# infnet_javainrio

Projeto do m�dulo de Arquitetura Java do Bloco Arquitetura de Plataformas.

-> Release 1.0 - 03/04/2015
Caracter�sticas para o escopo do trabalho:
- Utilizar EJB e JSF.
- Como n�o ser� utilizada nenhuma ferramenta de build e depend�ncia (tipo Maven) e ser� feito
no Eclipse por todos do grupo, os arquivos de configura��o do projeto na IDE tamb�m foram
versionados. Isso ser� evoluido posteriormente.
- Caminho do script de cria��o de banco: database_scripts\create_database.sql
- Datasource: java:/jboss/jdbc/JavaInRio


Roadmap:
- Log (SLF4J)
- Melhorar o uso dos escopos dos ManagedBeans e tipos de EJB.
- Testes automatizados.
- Melhorar Exce��es e tratamentos de erros.
- Subistituir por Maven.
- Nas entidades, ver solu��o com heran�a, por exemplo, para reduzir duplicidade de atributos em classes, por mais que as responsabilidades sejam distintas.
- Converter JPA para LocalDate.
- Melhorar Controle de Acesso.
- JMS para envio de e-mmail de confirma��o.
- Melhorar front-end.
- Dinamizar mais a informa��es do site.
- CDI.
- API Rest.
- Web Services (Gateway de Pagamento)
- NoSQL.
- Vers�o Mobile.
- Vers�o Angular (responsiva utilizando Bootstrap).
- Cache.
- Teste de carga.