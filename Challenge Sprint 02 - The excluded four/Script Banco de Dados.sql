CREATE TABLE eye_transport (
    id_app    NUMBER NOT NULL,
    categoria VARCHAR2(20) NOT NULL,
    nm_app    VARCHAR2(20) NOT NULL,
    versao    VARCHAR2(20) NOT NULL,
    valor     NUMBER NOT NULL,
    CONSTRAINT eye_transport_pk PRIMARY KEY ( id_app )
);

CREATE TABLE THE_EXCLUDED_FOUR(
    id_empresa NUMBER NOT NULL,
    id_app NUMBER NOT NULL,
    nm_empresa VARCHAR2(20),
    cnpj VARCHAR2(20) NOT NULL,
    telefone NUMBER ,
    CONSTRAINT THE_EXCLUDED_FOUR_PK PRIMARY KEY ( id_empresa )
);

CREATE TABLE usuario (
    id_app                  NUMBER NOT NULL,
    id_usuario              NUMBER NOT NULL,
    nm_usuario              VARCHAR2(15) NOT NULL,
    nr_celular              NUMBER NOT NULL,
    cpf                     VARCHAR2(20) NOT NULL,
    sexo                    VARCHAR2(20),
    grau_deficiencia_visual NUMBER NOT NULL,
    CONSTRAINT usuário_pk PRIMARY KEY ( id_usuario )
);

--Executar apenas após a criação da tabela EYE_TRANSPORT
ALTER TABLE the_excluded_four ADD CONSTRAINT the_exc_four_eye_transp_fk FOREIGN KEY ( id_app ) REFERENCES eye_transport ( id_app );

ALTER TABLE usuario ADD CONSTRAINT usuário_eye_transport_fk FOREIGN KEY ( id_app ) REFERENCES eye_transport ( id_app );

