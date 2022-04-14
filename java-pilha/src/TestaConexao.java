
public class TestaConexao {

	public static void main(String[] args) {
		
		//finally é tipicamente utilizado para fechar um recurso 
		      //como conexão ou transação.
		
		
		//entrou no java 1.7 ("recente")
		try(Conexao conexao = new Conexao() ){//cria o objeto assim q rodar,  
			conexao.leDados();		// ja fecha pq a classe tem AutoClosable e precisa implementar o close() na classe
		}catch(IllegalStateException ex) {  //  é uma juncao do try com finally
			System.out.println("Deu erro na conexao");
		}
		
		//---------------------
//	    Conexao con = null;
//	    try {
//	        con = new Conexao();
//	        con.leDados();
//	    } catch(IllegalStateException ex) {
//	        System.out.println("Deu erro na conexao");
//	    } finally {//bloco opcional e serpa executado mesmo se houver sucesso ou erro
//	        if(conn != null) {
//	        	con.close();
//	    	}
//	    }
	}

}
