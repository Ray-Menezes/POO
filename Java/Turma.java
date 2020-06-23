public class Turma 
{ 
   String nome;
   
   Estudante estudantes [] = new Estudante[10];
   private int numEstudantes;

   public Turma()
   {
      this.nome = "";
      numEstudantes = 0;
   }

   public Turma(String nome)
   {
      this.nome = nome;
      numEstudantes = 0;
   }

   public int getNumEstudantes()
   {
      return numEstudantes;
   }

   public void matricular( Estudante e )
   {
      estudantes[numEstudantes] = e;
      numEstudantes++;
   } 

   public Estudante pesquisar( int matricula ) throws MatriculaNaoEncontradaException
   { boolean achou = false;
      for (int i = 0; i < estudantes.length; i++)
      {
         // varre o array procurando pelo estudante que tem a matricula passada
         // como argumento
         if ( (estudantes[i]!= null) && (estudantes[i].getMatricula() == matricula) )
         {
            // para retornar
        	achou = true;
            return estudantes[i];
         }
         
      }
      if(!achou){
    	  throw new MatriculaNaoEncontradaException(matricula);
      }
      System.out.println ("matricula inexistente -> " + matricula );
      return null;
   } 

   public void trancar( int matricula )
   {
      boolean achou = false;
      for (int i = 0; i < estudantes.length; i++)
      {
         // varre o array procurando pelo estudante que tem a matricula passada
         // como argumento
         if ( (estudantes[i]!= null) && (estudantes[i].getMatricula() == matricula) )
         {
            // para excluir, basta tira-lo do array, apontando para nulo
            estudantes[i] = null;
            achou = true;
         }
      }
      // se nao achou o estudante, emite mensagem
      if (!achou)
      {
         System.out.println ("matricula inexistente -> " + matricula );
      }
   } 

   public void trancar( Estudante e )
   {
      boolean achou = false;
      for (int i = 0; i < estudantes.length; i++)
      {
         // varre o array procurando pelo estudante que tem a matricula passada
         // como argumento
         if ( estudantes[i] == e) 
         {
            // para excluir, basta tira-lo do array, apontando para nulo
            estudantes[i] = null;
            achou = true;
         }
      }
      // se nao achou o estudante, emite mensagem
      if (!achou)
      {
         System.out.println ("matricula inexistente -> " + e.getMatricula() );
      }
   } 

   public void listar()
   {
      // varre o array 
      for (int i = 0; i < estudantes.length; i++)
      {
         if ( estudantes[i]!= null )
         {
            // para cada estudante, chama o metodo exibir dele
            estudantes[i].exibir();
         }
      }
   }
   public void imprimirClasses()
   {
	   for (Estudante e : estudantes)
		   if (e != null)
			   System.out.println(e.getClass() );
   }
}
