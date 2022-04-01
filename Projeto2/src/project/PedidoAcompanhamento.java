package project;

import java.util.ArrayList;
import java.util.Collections;

public class PedidoAcompanhamento {
	{
	ArrayList<String> acompanhamento = new ArrayList<String>();
	{
		acompanhamento.add("Salada de alface");
		acompanhamento.add("Batata frita");
		acompanhamento.add("Salada de cebola");
		acompanhamento.add("Purê de batata");
		acompanhamento.add("Salada de maionese");
		acompanhamento.add("Farofa");
		acompanhamento.add("Xuxu com abóbora");
		acompanhamento.add("Rodelas de tomate");
		acompanhamento.add("Ovos cozidos");
		acompanhamento.add("Cenoura ralada com repolho");
	}
	int i=1;
	Collections.sort(acompanhamento);
	for (String aux:acompanhamento)
	{
		System.out.println(i + "-" + aux);
		i++;
	}
}
}