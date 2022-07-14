package modelos;

import com.example.Projeto.Integrador.models.Agendamento;

import java.time.LocalDate;

public class AgendamentoModelo {
    public  static  Agendamento construirCenario() {
        Agendamento  agendamento;

        agendamento = Agendamento.builder()
                .id(1l)
                .dataInicio(LocalDate.ofEpochDay(14/07/2022))
                .dataFim(LocalDate.ofEpochDay(14/07/2022))
                .horarioInicio()

    }
}
