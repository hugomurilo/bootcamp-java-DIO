package map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

	private Map<LocalDate, Evento> agendaMap;

	public AgendaEventos() {
		this.agendaMap = new HashMap<>();
	}
	
	public void adicionarEvento(LocalDate data, String nomeEvento, String nomeAtracao) {
		agendaMap.put(data, new Evento(nomeEvento, nomeAtracao));
	}
	
	public void exibirAgenda() {
		Map<LocalDate, Evento> eventosOrdenados = new TreeMap<>(agendaMap);
		System.out.println(eventosOrdenados);
	}
	
	public void obterProximoEvento() {
		LocalDate dataAtual = LocalDate.now();
		Map<LocalDate, Evento> eventosOrdenados = new TreeMap<>(agendaMap);
		for(Map.Entry<LocalDate, Evento> entry: eventosOrdenados.entrySet()) {
			if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
				System.out.println("O próximo evento " + entry.getValue() + " será na data " + entry.getKey());
				break;
			}
		}
	}
	
	//teste
	public static void main(String[] args) {
		AgendaEventos agendaEventos = new AgendaEventos();
		
		// Adiciona eventos à agenda
	    agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Conferência de Tecnologia", "Palestrante renomado");
	    agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Workshop de Programação", "Aula prática de desenvolvimento");
	    agendaEventos.adicionarEvento(LocalDate.of(2000, 1, 10), "Lançamento de Software", "Demonstração da nova versão");
	    agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 28), "Hackathon de Inovação", "Competição de soluções criativas");
	    agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 20), "Seminário de Inteligência Artificial", "Discussão sobre IA avançada");
	    
	    // Exibidir agenda
	    agendaEventos.exibirAgenda();
	    
	    // Próximo Evento
	    System.out.println("----------------------------");
	    agendaEventos.obterProximoEvento();
	}
}
