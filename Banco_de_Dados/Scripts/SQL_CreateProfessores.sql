CREATE TABLE professores(
    id_professor integer,
    celular varchar(14),
    nome varchar(50),
    id_materia integer,
    primary key (id_professor),
    foreign key (id_materia) references materias(id_materia)
)