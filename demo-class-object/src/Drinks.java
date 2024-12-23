public class Drinks { 
    // attirbutes
  
    
  private String drinks;
  private String ingredients;
  private String netWeight;

  public Drinks ( String drinks, String ingredients , String netWeight){
    this.drinks = drinks;
    this.ingredients = ingredients;
    this.netWeight = netWeight;
  }
  // instance Method
  public String getDrinks(){
    return this.drinks;
  }
  public String getIngredients(){
    return this.ingredients;
  }
  public String getNetWeight(){
    return this.netWeight;
  }

  public static void main(String[] args) {


  String drinks1 = "oolongtea";
  String ingredients1 = "tea";
  String netWeight1 = "700ml";

  String drinks2 = "milk";
  String ingredients2 = "milk";
  String netWeight2 = "900ml";

  String drinks3 = "applejuice";
  String ingredients3 = "apple";
  String netWeight3 = "500ml";
  
  String[] drinks = new String[]{"oolongtea" , "milk","applejuice"};
  String[] ingredients = new String[]{"tea" , "milk","apple"};
  String[] netWeight = new String[]{"700ml" , "900ml","500ml"};


  Drinks d1 = new Drinks("oolongtea","tea","700ml");
  System.out.println(d1.getDrinks());
  System.out.println(d1.getIngredients());
  System.out.println(d1.getNetWeight());

  Drinks d2 = new Drinks("milk","milk","900ml");
  System.out.println(d2.getDrinks());
  System.out.println(d2.getIngredients());
  System.out.println(d2.getNetWeight());

  Drinks d3 = new Drinks("applejuice","apple","500ml");
  System.out.println(d3.getDrinks());
  System.out.println(d3.getIngredients());
  System.out.println(d3.getNetWeight());

System.out.println(d1.getDrinks() + "," + d1.getIngredients() + "," + d1.getNetWeight());
System.out.println(d2.getDrinks() + "," + d2.getIngredients() + "," + d2.getNetWeight());
System.out.println(d3.getDrinks() + "," + d3.getIngredients() + "," + d3.getNetWeight());


}


  }

  

