package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Postagem {
	
	private Date momento;
	private String titulo;
	private String conteudo;
	private int likes;
	
	private List<Comentario> comentario = new ArrayList<>();
	
	SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
	Scanner sc = new Scanner(System.in);

	public Postagem(Date momento, String titulo, String conteudo, int likes, List<Comentario> comentario) {
		this.momento = momento;
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.likes = likes;
		this.comentario = comentario;
	}
	public Postagem(Date momento, String titulo, String conteudo, int likes) {
		this.momento = momento;
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.likes = likes;
	}


	public Date getMomento() {
		return momento;
	}
	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}

	public List<Comentario> getComentario() {
		return comentario;
	}
	public void setComentario(List<Comentario> comentario) {
		this.comentario = comentario;
	}
	
	public void darLike() {
		likes++;
	}
	
	public void comentar(Postagem post) {
		
		System.out.println("\nComente: ");
		String co = sc.nextLine();
		Date mome = new Date();
		Comentario comenta = new Comentario(co,mome);
		post.addComentario(comenta);
	}

	
	public void addComentario(Comentario coment) {
		comentario.add(coment);
	}
	public void remComentario(Comentario coment) {
		comentario.remove(coment);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nTitulo: " + titulo);
		sb.append("\nConteudo: " + conteudo);
		sb.append("      -Postado as: " + sdf2.format(momento));
		sb.append("\nLikes: " + likes);
		sb.append(" Comentarios: " + comentario.size() +"\n");
		sb.append("Comentarios:\n");
		for (Comentario c : comentario) {
			sb.append(c.getTexto()+"      -postado as "+sdf2.format(c.getMomentoComent())+"\n");			
		}
		return sb.toString();
	}
}
