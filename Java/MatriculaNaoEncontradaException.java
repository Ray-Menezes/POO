
public class MatriculaNaoEncontradaException extends Exception{
	private int  MatriculaNaoEncontrada;
	public double getMatriculaNaoEncontrada(){
		return MatriculaNaoEncontrada;
	}
	public MatriculaNaoEncontradaException (int MatriculaNaoEncontrada){
		super("--------Matricula Nao Encontrada-----------");
		this.MatriculaNaoEncontrada = MatriculaNaoEncontrada;
	}
	
	
}