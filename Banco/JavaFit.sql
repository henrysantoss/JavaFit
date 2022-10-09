--
-- PostgreSQL database dump
--

-- Dumped from database version 14.5
-- Dumped by pg_dump version 14.5

-- Started on 2022-10-09 20:19:43

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 2 (class 3079 OID 16384)
-- Name: adminpack; Type: EXTENSION; Schema: -; Owner: -
--

CREATE EXTENSION IF NOT EXISTS adminpack WITH SCHEMA pg_catalog;


--
-- TOC entry 3352 (class 0 OID 0)
-- Dependencies: 2
-- Name: EXTENSION adminpack; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION adminpack IS 'administrative functions for PostgreSQL';


SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 215 (class 1259 OID 16451)
-- Name: aluno; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.aluno (
    id_aluno character varying(9999) NOT NULL,
    ds_aluno character varying(9999),
    ds_sexo character varying(9999),
    ds_data character varying(9999),
    ds_cel character varying(9999),
    ds_fone character varying(9999),
    ds_email character varying(9999),
    ds_logradouro character varying(9999),
    ds_localidade character varying(9999)
);


ALTER TABLE public.aluno OWNER TO postgres;

--
-- TOC entry 217 (class 1259 OID 16465)
-- Name: fatura; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.fatura (
    id_fatura character varying(9999) NOT NULL,
    ds_aluno character varying(9999),
    ds_data character varying(9999),
    ds_valor character varying(9999),
    ds_fatura character varying(9999)
);


ALTER TABLE public.fatura OWNER TO postgres;

--
-- TOC entry 211 (class 1259 OID 16423)
-- Name: localidade; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.localidade (
    id_localidade character varying(1000) NOT NULL,
    ds_bairro character varying(100),
    ds_cidade character varying(100),
    ds_estado character varying(100),
    ds_uf character varying(100),
    ds_pais character varying(100)
);


ALTER TABLE public.localidade OWNER TO postgres;

--
-- TOC entry 214 (class 1259 OID 16444)
-- Name: matricula; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.matricula (
    id_matricula character varying(9999) NOT NULL,
    ds_matricula character varying(9999),
    ds_aluno character varying(9999),
    ds_turma character varying(9999),
    ds_modalidade character varying(9999)
);


ALTER TABLE public.matricula OWNER TO postgres;

--
-- TOC entry 213 (class 1259 OID 16437)
-- Name: modalidade; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.modalidade (
    ds_modalidade character varying(100),
    id_modalidade character varying(100) NOT NULL,
    vl_pagamento character varying(9999),
    vl_desconto character varying(9999),
    vl_final character varying(9999),
    nr_dias character varying(9999)
);


ALTER TABLE public.modalidade OWNER TO postgres;

--
-- TOC entry 216 (class 1259 OID 16458)
-- Name: planos; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.planos (
    id_plano character varying(9999) NOT NULL,
    ds_plano character varying(9999),
    ds_aluno character varying(9999),
    ds_modalidade character varying(9999),
    ds_valor character varying(9999)
);


ALTER TABLE public.planos OWNER TO postgres;

--
-- TOC entry 212 (class 1259 OID 16430)
-- Name: treino; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.treino (
    id_treino character varying(100) NOT NULL,
    ds_treino character varying(99999)
);


ALTER TABLE public.treino OWNER TO postgres;

--
-- TOC entry 210 (class 1259 OID 16416)
-- Name: usuario; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.usuario (
    id_usuario character varying(999999) NOT NULL,
    ds_usuario character varying(999999),
    ds_login character varying(999999),
    ds_senha character varying(999999)
);


ALTER TABLE public.usuario OWNER TO postgres;

--
-- TOC entry 3203 (class 2606 OID 16457)
-- Name: aluno aluno_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.aluno
    ADD CONSTRAINT aluno_pkey PRIMARY KEY (id_aluno);


--
-- TOC entry 3207 (class 2606 OID 16471)
-- Name: fatura fatura_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.fatura
    ADD CONSTRAINT fatura_pkey PRIMARY KEY (id_fatura);


--
-- TOC entry 3195 (class 2606 OID 16429)
-- Name: localidade localidade_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.localidade
    ADD CONSTRAINT localidade_pkey PRIMARY KEY (id_localidade);


--
-- TOC entry 3201 (class 2606 OID 16450)
-- Name: matricula matricula_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.matricula
    ADD CONSTRAINT matricula_pkey PRIMARY KEY (id_matricula);


--
-- TOC entry 3199 (class 2606 OID 16441)
-- Name: modalidade modalidade_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.modalidade
    ADD CONSTRAINT modalidade_pkey PRIMARY KEY (id_modalidade);


--
-- TOC entry 3205 (class 2606 OID 16464)
-- Name: planos planos_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.planos
    ADD CONSTRAINT planos_pkey PRIMARY KEY (id_plano);


--
-- TOC entry 3197 (class 2606 OID 16436)
-- Name: treino treino_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.treino
    ADD CONSTRAINT treino_pkey PRIMARY KEY (id_treino);


--
-- TOC entry 3193 (class 2606 OID 16422)
-- Name: usuario usuario_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.usuario
    ADD CONSTRAINT usuario_pkey PRIMARY KEY (id_usuario);


-- Completed on 2022-10-09 20:19:44

--
-- PostgreSQL database dump complete
--

