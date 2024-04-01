public class MonetaryCoin extends Coin {
int value;
public MonetaryCoin(){
   super();
}

public MonetaryCoin(int val){
   value = val;
}

public int getValue() {
   return value;
}

public void setValue(int value) {
   this.value = value;
}

public String toString(){
   return "Value : "+getValue();
}

}