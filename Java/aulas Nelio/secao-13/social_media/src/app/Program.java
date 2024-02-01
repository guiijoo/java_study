package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice Trip!");
		Comment c2 = new Comment("Wow that's Awesome!");
		Post p1 = new Post(sdf.parse("21/06/2024 13:05:44"), "Traveling to New Zeland", "I'm going to visit this wonderfull country!", 12);
		p1.addComments(c1);
		p1.addComments(c2);
		
		System.out.println(p1);
		
		Comment c3 = new Comment("Good Night!");
		Comment c4 = new Comment("May the Force be with you!");
		Post p2 = new Post(sdf.parse("28/03/2024 17:55:53"), "Quero lamber bolaaaaas", "Estou correndo lamber bolas!", 342423);
		p2.addComments(c3);
		p2.addComments(c4);
		
		System.out.println(p2);
	}

}
