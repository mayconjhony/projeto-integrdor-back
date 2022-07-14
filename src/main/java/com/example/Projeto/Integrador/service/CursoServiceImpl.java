package com.example.Projeto.Integrador.service;

import com.example.Projeto.Integrador.models.Curso;
import com.example.Projeto.Integrador.repositories.CursoRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class CursoServiceImpl implements CursoService{
    final CursoRepository cursoRepository;

    public CursoServiceImpl(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    @Override
    public Curso salvar(Curso curso) throws Exception {
        List<Curso> ListaDeCursos = cursoRepository.findCursoByNome(curso.getNome());
        if(ListaDeCursos != null && ListaDeCursos.size() > 0){
            throw new Exception("O curso " + curso.getNome() + " já foi registrado");
        }
        return cursoRepository.save(curso);
    }

    @Override
    public Curso editar(Curso curso) {
        return cursoRepository.save(curso);
    }

    @Override
    public List <Curso> listar(){
        return cursoRepository.findAll();
    }

    @Override
    public void deletar(long id) {
        cursoRepository.deleteById(id);
    }

}
