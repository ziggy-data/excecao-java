
public class FluxoComError {

	    public static void main(String[] args) {
	    	System.out.println("Ini do main");
	        try { // o try e catch é uma alternativa do qu colocar "throws MinhaExcecao2"
	        metodo1();     // na assinatura do metodo
	        }catch(Exception ex){// qualquer excecao - generalizacao
	    	String msg = ex.getMessage();			
	    	System.out.println("Exception " + msg);
	    	ex.printStackTrace();   
	    }
	        System.out.println("Fim do main");
	    }
	 
	    private static void metodo1() throws MinhaExcecao2{
	        System.out.println("Ini do metodo1");
	        metodo2();
	        System.out.println("Fim do metodo1");
	    }

	    private static void metodo2() throws MinhaExcecao2{//note o throw com S
	    	System.out.println("ini do metodo2");		// sem o S ele ia "jogar na pilha"
	        metodo2();//serve para dar erro de memoria			mas tinha q estar no bloco d codigo
	        System.out.println("fim do metodo2");
	        }
	    
	        //System.out.println("Fim do metodo2");        
	    }


