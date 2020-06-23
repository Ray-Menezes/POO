public class TesteTurma
{
    public static void main (String args[]) 
    {
      Estudante e = new Estudante("Maria", 'F', 111);
      
      Turma topicos = new Turma ("Topicos de Linguagens");

      System.out.println ();
      System.out.println ("matriculando estudante...");
      topicos.matricular ( e );

      System.out.println();
      System.out.println("matriculando estudante monitor...");
      e = new EstudanteMonitor("Joana", 'F', 222, 350.00, "POO");
      e.atribuirNota(1, 2);
      e.atribuirNota(2, 9);
      e.atribuirNota(3, 7);
      e.atribuirNota(4, 9);
      topicos.matricular( e );

      //System.out.println("--------------------------");
      System.out.println ();
      System.out.println ("matriculando estudante estagiario...");
      e = new EstudanteEstagiario ("Carlos", 'M', 333,800.00, "Uni7");
      System.out.println ("Estamos aqui");
      e.atribuirNota (1, 6);
      e.atribuirNota (2, 9);
      e.atribuirNota (3, 9);
      e.atribuirNota (4, 5);
      topicos.matricular ( e );
      
      System.out.println ();
      System.out.println ("listando relação de estudantes...");
      topicos.listar ();
      try{
      topicos.pesquisar ( 444 );
      Estudante e2 = topicos.pesquisar ( 222 );
      }
      catch (MatriculaNaoEncontradaException ex){
    		System.out.println(ex.getMessage());
    		System.out.println("A matricula invalida é: "+ex.getMatriculaNaoEncontrada());
    	  }
      
      System.out.println ();
      System.out.println ("exibindo estudante pesquisado...");
      e.exibir ();
      
    
      
      System.out.println ();
      System.out.println ("estudantes matriculados -> " + topicos.getNumEstudantes() );
      topicos.imprimirClasses ();
   }
}