package sda.code.intermediate.part1.exercises.patterns;

import java.math.BigDecimal;

/**
 * Ta klasa abstrakcyjna stanowi podstawę pozostałych Builderów. Ma dwa
 * parametry szablonu: T - typ buildera-dziecka, potrzebne, by dało się łatwo
 * stworzyć fluent API; R - typ obiektu zwracanego przez builder-dziecko, typ
 * zwracany przez metodę "build".
 */
@SuppressWarnings("unchecked")
public abstract class ProductBuilder<T, R> {
    protected String name;
    protected BigDecimal price;
    private String maybePrice;

    public T withName(String name) {
        this.name = name;
        return (T) this;
    }

    public T withPrice(String price) {
        maybePrice = price;
        return (T) this;
    }

    /**
     * Metoda wywołuje preprocessing dla danych znajdujących sie w
     * Builderze-rodzicu (ProductBuilder)
     */
    protected void prepare() {
       try{
           price=new BigDecimal(maybePrice);
      }catch(NullPointerException e){
           throw new InvalidBuilderState("Price cannot be null");
       }catch(NumberFormatException e){
          throw new BuilderPreparationFailed("Price must be a number");
       }
    }

    /**
     * Metoda sprawdza warunki, jakie muszą spełniać dane przeznaczone dla
     * obiektu wyjściowego
     */
    protected void validate() {
        if (name == null) {
            throw new InvalidBuilderState("Name cannot be null");
        }
        if(name.isEmpty()){
            throw new InvalidBuilderState("Name must be set");
        }
        if(price.doubleValue()<0.0){
            throw new InvalidBuilderState("Price cannot be less than zero");
        }
        if(price == null) {
            throw new InvalidBuilderState("Price must be set");
        }

    }

    public abstract R build();
}
