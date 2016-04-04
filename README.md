# infnet_javainrio

Projeto do módulo de Arquitetura Java do Bloco Arquitetura de Plataformas.

-> Release 1.0 - 03/04/2015
Características para o escopo do trabalho:
- Utilizar EJB e JSF.
- Como não será utilizada nenhuma ferramenta de build e dependência (tipo Maven) e será feito
no Eclipse por todos do grupo, os arquivos de configuração do projeto na IDE também foram
versionados. Isso será evoluido posteriormente.
- Caminho do script de criação de banco: database_scripts\create_database.sql
- Datasource: java:/jboss/jdbc/JavaInRio


Roadmap:
- Log (SLF4J)
- Melhorar o uso dos escopos dos ManagedBeans e tipos de EJB.
- Testes automatizados.
- Melhorar Exceções e tratamentos de erros.
- Subistituir por Maven.
- Nas entidades, ver solução com herança, por exemplo, para reduzir duplicidade de atributos em classes, por mais que as responsabilidades sejam distintas.
- Converter JPA para LocalDate.
- Melhorar Controle de Acesso.
- JMS para envio de e-mmail de confirmação.
- Melhorar front-end.
- Dinamizar mais a informações do site.
- CDI.
- API Rest.
- Web Services (Gateway de Pagamento)
- NoSQL.
- Versão Mobile.
- Versão Angular (responsiva utilizando Bootstrap).
- Cache.
- Teste de carga.