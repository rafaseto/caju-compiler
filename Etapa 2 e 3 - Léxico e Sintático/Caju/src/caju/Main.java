package caju;
import caju.parser.*;
import caju.lexer.*;
import caju.node.*;
import java.io.*;

public class Main
{
 public static void main(String[] args)
 {try
	{
		String arquivo = "teste/teste.cj";

		Lexer lexer =
				new Lexer(
						new PushbackReader(  
								new FileReader(arquivo), 1024)); 
		Token token;
		while(!((token = lexer.next()) instanceof EOF)) {
			System.out.println(token.getClass());
			System.out.println(" ( "+token.toString()+")");
		}
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
  try
  {
   String arquivo = "teste/teste.cj";
  
   Parser p =
		    new Parser(
		    new Lexer(
		    new PushbackReader(  
		    new FileReader(arquivo), 1024))); 
   
   Start tree = p.parse();
   //Imprime árvore na saída padrão
   tree.apply(new ASTPrinter());
   //Imprime árvore em interface gráfica
   tree.apply(new ASTDisplay());
  }
  catch(Exception e)
  {
   System.out.println(e.getMessage());
  }
 }
}