public class BeerSong{
    public static void main (String[] args) {
        int beerNum = 99;
        String word1 = "bottles";
        String word = "bottle";

        while   (beerNum > 0)   {
            
            if  (beerNum == 1)  {
                word =  " bottle ";   // No singular, como em UMA garrafa.                
            }
            System.out.println(beerNum + " " + word + " of beer on the wall ");
            System.out.println(beerNum + " " + word + " of beer. ");
            System.out.println("Take one down. ");
            System.out.println("Pass it around. ");
            beerNum = beerNum - 1;
            
            if  (beerNum > 0)   {
                beerNum = beerNum - 1;
                System.out.println(beerNum + " " + word + " of beer on the wall ");
            }   else    {
                System.out.println(" No more bottles of beer on the wall ");
            }   // Fim do else
        }       // Fim do loop while
    }           // Fim do método main
}               // Fim da classe
