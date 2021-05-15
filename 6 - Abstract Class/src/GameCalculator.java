public abstract class GameCalculator {

    // Abstract classlar ASLA NEW ile oluşturulamaz !!!
    // Bir sınıfın abstract olabilmesi için abstract keywordu kullanılmalıdır
    // Bir metodun/operasyonun abstract olabilmesi için abstract keywordu kullanılmalıdır


    // ABSTRACT keyword
    // Bu classı kullanan classlar Calculate fonksiyonunu override etmek zorundadırlar
    public abstract void Calculate();

    // FINAL keyword
    // Bu classı kullanan classlar GameOver metodunu değiştiremezler
    // Bu hali kullanacaklardır
    // Override edilemez
    public final void GameOver(){
        System.out.println("GAME OVER");
    }
}
