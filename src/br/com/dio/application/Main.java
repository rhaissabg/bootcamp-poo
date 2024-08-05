package br.com.dio.application;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setTitulo("Curso - Java");
		curso1.setDescricao("Descrição do curso de Java");
		curso1.setCargaHoraria(8);
//		System.out.println(curso1);

		Curso curso2 = new Curso();
		curso2.setTitulo("Curso - JavaScript");
		curso2.setDescricao("Descrição do curso de JavaScript");
		curso2.setCargaHoraria(12);
//		System.out.println(curso2);

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Descrição da mentoria de Java");
		mentoria.setData(LocalDate.now());
//		System.out.println(mentoria);

		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);

		Dev dev1 = new Dev();
		dev1.setNome("Rhaíssa");
		dev1.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos: " + dev1.getConteudosInscritos());
		dev1.progredir();
		System.out.println("Conteúdos inscritos: " + dev1.getConteudosInscritos());
		System.out.println("Conteúdos concluídos: " + dev1.getConteudosConcluidos());
		System.out.println("XP Total: " + dev1.calcularTotalXp());

		Dev dev2 = new Dev();
		dev2.setNome("João");
		dev2.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos: " + dev2.getConteudosInscritos());
		dev2.progredir();
		dev2.progredir();
		System.out.println("Conteúdos inscritos: " + dev2.getConteudosInscritos());
		System.out.println("Conteúdos concluídos: " + dev2.getConteudosConcluidos());
		System.out.println("XP Total: " + dev2.calcularTotalXp());

	}

}
