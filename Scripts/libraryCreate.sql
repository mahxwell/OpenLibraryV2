
CREATE SCHEMA librarydb;

ALTER SCHEMA librarydb OWNER TO postgres;

SET search_path TO pg_catalog,public,librarydb;

CREATE TABLE librarydb.library (
	library_id serial NOT NULL,
	name varchar NOT NULL,
	post_code varchar NOT NULL,
	CONSTRAINT library_pk PRIMARY KEY (library_id)

);

ALTER TABLE librarydb.library OWNER TO postgres;

CREATE TABLE librarydb.user (
	user_id serial NOT NULL,
	name varchar NOT NULL,
	surname varchar NOT NULL,
	pseudo varchar NOT NULL,
	mail varchar NOT NULL,
	password varchar NOT NULL,
	phone varchar NOT NULL,
	CONSTRAINT user_pk PRIMARY KEY (user_id)

);

ALTER TABLE librarydb.user OWNER TO postgres;

CREATE TABLE librarydb.book (
	book_id serial NOT NULL,
	title varchar NOT NULL,
	year smallint NOT NULL,
	library_id_library integer,
	editor_id_editor integer,
	author_id_author integer,
	genre_id_genre integer,
	CONSTRAINT new_table_pk PRIMARY KEY (book_id)

);

ALTER TABLE librarydb.book OWNER TO postgres;

CREATE TABLE librarydb.editor (
	editor_id serial NOT NULL,
	name varchar NOT NULL,
	nationality varchar NOT NULL,
	CONSTRAINT editor_pk PRIMARY KEY (editor_id)

);

ALTER TABLE librarydb.editor OWNER TO postgres;

CREATE TABLE librarydb.author (
	author_id serial NOT NULL,
	name varchar NOT NULL,
	surname varchar NOT NULL,
	nationality varchar NOT NULL,
	birthdate date NOT NULL,
	CONSTRAINT author_pk PRIMARY KEY (author_id)

);
ALTER TABLE librarydb.author OWNER TO postgres;


CREATE TABLE librarydb.genre (
	genre_id serial NOT NULL,
	name varchar NOT NULL,
	CONSTRAINT genre_pk PRIMARY KEY (genre_id)

);

ALTER TABLE librarydb.genre OWNER TO postgres;

CREATE TABLE librarydb.copy (
	copy_id serial NOT NULL,
	book_id_book integer,
	CONSTRAINT copy_pk PRIMARY KEY (copy_id)

);
ALTER TABLE librarydb.copy OWNER TO postgres;

CREATE TABLE librarydb.bookloaning (
	bookloaning_id serial NOT NULL,
	is_extended boolean NOT NULL,
	begin_date date NOT NULL,
	endind_date date NOT NULL,
	get_book_id integer NOT NULL,
	user_id_user integer,
	copy_id_copy integer,
	CONSTRAINT bookloaning_pk PRIMARY KEY (bookloaning_id)

);

ALTER TABLE librarydb.bookloaning OWNER TO postgres;

ALTER TABLE librarydb.book ADD CONSTRAINT library_fk FOREIGN KEY (library_id_library)
REFERENCES librarydb.library (library_id) MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE;

ALTER TABLE librarydb.book ADD CONSTRAINT editor_fk FOREIGN KEY (editor_id_editor)
REFERENCES librarydb.editor (editor_id) MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE;

ALTER TABLE librarydb.book ADD CONSTRAINT author_fk FOREIGN KEY (author_id_author)
REFERENCES librarydb.author (author_id) MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE;

ALTER TABLE librarydb.book ADD CONSTRAINT genre_fk FOREIGN KEY (genre_id_genre)
REFERENCES librarydb.genre (genre_id) MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE;

ALTER TABLE librarydb.copy ADD CONSTRAINT book_fk FOREIGN KEY (book_id_book)
REFERENCES librarydb.book (book_id) MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE;

ALTER TABLE librarydb.bookloaning ADD CONSTRAINT user_fk FOREIGN KEY (user_id_user)
REFERENCES librarydb.user (user_id) MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE;

ALTER TABLE librarydb.bookloaning ADD CONSTRAINT copy_fk FOREIGN KEY (copy_id_copy)
REFERENCES librarydb.copy (copy_id) MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE;

ALTER TABLE librarydb.bookloaning ADD CONSTRAINT bookloaning_uq UNIQUE (copy_id_copy);


