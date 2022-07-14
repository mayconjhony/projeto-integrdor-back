package com.example.Projeto.Integrador.service;

import com.example.Projeto.Integrador.models.Agendamento;
import com.example.Projeto.Integrador.models.Curso;
import com.example.Projeto.Integrador.repositories.AgendamentoRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AgendamentoServiceImpl implements AgendamentoService{

    final AgendamentoRepository agendamentoRepository;

       public AgendamentoServiceImpl(AgendamentoRepository agendamentoRepository) {
        this.agendamentoRepository = agendamentoRepository;
    }

    @Override
    public Agendamento salvar(Agendamento agendamento) throws Exception {

           String[] horaInicio = agendamento.getHorarioInicio().split(":");
           String[] horaFim = agendamento.getHorarioFim().split(":");

           Integer horarioInicio = Integer.parseInt(horaInicio[0]);
           Integer horarioFim = Integer.parseInt(horaFim[0]);

           if(agendamento.getDataFim().isBefore(agendamento.getDataInicio())){
               throw new Exception("Não é possivel realizar um agedamento com a data final menor que a data de inicio");
           }
           if(horarioFim< horarioInicio) {
               throw new Exception("Não é possivel realizar um agedamento com a horario final menor que o horario de inicio");
           }
           if(agendamento.getHorarioInicio().equals(agendamento.getHorarioFim())) {
               throw new Exception("Não é possivel realizar um agedamento com a hora de inicio igual a hora final");
           }





            // List<Agendamento> Data = agendamentoRepository.findAgendamentoByDataInicio(agendamento.getDataInicio());
       // List<Agendamento> HorarioInicio = agendamentoRepository.findAgendamentoByHorarioInicio(agendamento.getHorarioInicio());
       // List<Agendamento> HorarioFim  = agendamentoRepository.findAgendamentoByHorarioFim(agendamento.getHorarioFim());
       // List<Agendamento> Numlaboratorio = agendamentoRepository.findAgendamentoByHorarioFim(agendamento.getHorarioFim());


        //if  (Data != null && Data.size() > 0){
        //        throw new Exception("O agendamento " + agendamento.getDataInicio() + " já foi resgistrado");}
        //else if (HorarioInicio != null && HorarioInicio.size() > 0){
        //        throw new Exception("O agendamento " + agendamento.getHorarioInicio() + " já foi resgistrado");}
       // else if (agendamento.getDataFim().isBefore(agendamento.getDataInicio())){
        //    throw new Exception("Nao é possivel agendar com data de termino anterior a de inicio");        }
        //Feito Pelo Professor
        //if(agendamento.getHorarioInicio().equals(agendamento.getHorarioFim())) {
         //   throw new Exception("Nao é possivel salvar um agendamento com a hora de inicio igual a hora de termino.");}
        //   else if (agendamento.getHorarioInicio() < agendamento.getHorarioFim()){}





        return agendamentoRepository.save(agendamento);
    }

    @Override
    public Agendamento editar(Agendamento agendamento) {
        return agendamentoRepository.save(agendamento);
    }

    @Override
    public List<Agendamento> listar() {
        return agendamentoRepository.findAll();
    }

    @Override
    public void deletar(Long id) {
           agendamentoRepository.deleteById(id);
    }


}
