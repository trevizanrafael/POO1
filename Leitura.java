import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Leitura{
//o static serve pra poder chamar sem objeto,que nem parseInt
	public static String entDados(String rotulo){
		System.out.println(rotulo);
		InputStreamReader teclado;
		teclado = new InputStreamReader(System.in);
		BufferedReader buffTec;
		buffTec = new BufferedReader(teclado);
		String ret = "";
		try{
			ret = buffTec.readLine();
		}
		catch(IOException ioe){
			System.out.println("ERRO DE JVM OU RAM");
		}

		return ret;

	}

}
