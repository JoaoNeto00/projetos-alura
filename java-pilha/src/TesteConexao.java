public class TesteConexao {

    public static void main(String[] args) {

        try(Conexao conexao = new Conexao()){
            conexao.leDados();
        }catch (IllegalStateException ex){
            System.out.println("deu errado !");
        }


        //---------------------------------
//        Conexao con = null;
//        try{
//            con = new Conexao();
//            con.leDados();
//        }catch (IllegalStateException ex){
//            System.out.println("deu erro ");
//        }finally {
//            System.out.println("finnaly");
//            if(con != null){
//                con.close();
//            }
//        }
    }
}
