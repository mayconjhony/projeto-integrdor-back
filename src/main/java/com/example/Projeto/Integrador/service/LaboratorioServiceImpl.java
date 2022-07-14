package com.example.Projeto.Integrador.service;

import com.example.Projeto.Integrador.models.Curso;
import com.example.Projeto.Integrador.models.Laboratorio;
import com.example.Projeto.Integrador.repositories.LaboratorioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaboratorioServiceImpl implements LaboratorioService{

    final LaboratorioRepository laboratorioRepository;

    public LaboratorioServiceImpl(LaboratorioRepository laboratorioRepository) {
        this.laboratorioRepository = laboratorioRepository;
    }
    @Override
    public Laboratorio salvar(Laboratorio laboratorio) throws Exception{
        List<Laboratorio> ListaDeLaboratorio = laboratorioRepository.findLaboratorioByNome(laboratorio.getNome());
        if(ListaDeLaboratorio != null && ListaDeLaboratorio.size() > 0){
            throw new Exception("O Laboratorio " + laboratorio.getNome() + " já foi registrado");
        }
        return laboratorioRepository.save(laboratorio);
    }
    @Override
    public Laboratorio editar(Laboratorio laboratorio) {
        return laboratorioRepository.save(laboratorio);
    }
    @Override
    public List<Laboratorio> listar() {
        return laboratorioRepository.findAll();
    }

    @Override
    public void deletar(Long id) {
        laboratorioRepository.deleteById(id);
    }

}
