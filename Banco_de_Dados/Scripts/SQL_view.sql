create view matricula_sigilo as (
    select
        id_matricula,
        id_aluno,
        validade
    from
        matricula
)