public class PhraseOMatic   {
    public static void main (String[] args){
    // Crie três conjuntos de palavras onde será feita. Adicione o que quiser
    String[] wordListOne =  {
        "24/7", "várias camadas", "30.000 pés", "B-to-B", "Todos ganham", "front-end", "Baseado na Web", "difundido", "inteligente", "seis sigma", "caminho critico", "dinamico"};
    String[] wordListTwo = {
        "habilitado", "adesivo", "valor agregado", "orientado", "central", "distribuido", "posicionado", "em rede", "dedicado", "alavancado", "alinhado", "destinado", "compartilhado", "cooperativo", "acelerado"};
    String[] wordlistThree = {
        "processo", "ponto", "maximo", "solução", "arquitetura", "habilitação no nucleo", "estratégia", "mindshare", "portal", "espaço", "visão", "paradgma", "missão"};

        // Descubra quantas palavras existem em cada lista

    String[] wordListOne2 = wordListOne;
	int oneLength = wordListOne2.length;
    int twoLength = wordListTwo.length;
    int trheeLength = wordlistThree.length;

        // gere três números aleatorios

    int rand1 = (int) (Math.random() * oneLength);
    int rand2 = (int) (Math.random() * twoLength);
    int rand3 = (int) (Math.random() * trheeLength);

        // Agora construa uma frase

  	String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordlistThree[rand3];

        // Exiba a frase

    String phrase2 = phrase;

	System.out.println(" Precisamos de " + phrase2);
    }
}