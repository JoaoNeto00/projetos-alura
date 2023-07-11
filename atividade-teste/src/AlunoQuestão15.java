public class AlunoQuestão15 {

    private float media;

    public float calculaMedia(float notaAv1,float notaAv2, float notaAv3){
         media = (notaAv1+notaAv2+notaAv3) / 3;
         System.out.println("media do aluno: "+media);
         statusAluno(media);
         return media;
    }
    public void statusAluno(float media){
        if (media > 6){
            System.out.println(" aprovado !!");
        } else if (media >= 4 && media <=6) {
            System.out.println("verificação suplementar");
        }else {
            System.out.println("reprovado !! ");
        }
    }
}
