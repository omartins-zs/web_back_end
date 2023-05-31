CREATE TABLE livro(
    id_livro integer,
    autor varchar(50),
    nome_livro varchar(30),
    sinopse text,
    id_materia integer,
    primary key (id_livro),
    foreign key (id_materia) references materias(id_materia)
)