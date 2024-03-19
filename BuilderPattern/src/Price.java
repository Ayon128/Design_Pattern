//// code smells -> comments, inappropriate name, long method, long parameter list
//// Redemis -->  Rename, Extract method, replace temp with query



public class price{
    public double calculatePrice(){
    
    
        double finalPrice = calculateDiscount();
    }
    
    public int getBasePrice(){
        return quantity * itemPrice;
    }
    
    public int discountLevel(){
        if(quantity > 30) return 2;
        else
        return 1;
    }
    
    public double CalculateVat()
    {
        if(quantity < 10){
            return 0;
        }
        else{
            return getBasePrice() * 0.01;
        }
    }
    
    private double calculateDiscount(){
        if(discountLevel() == 2){
            return getBasePrice()* 0.2 + CalculateVat();
        }
        else{
            return getBasePrice() * 0.05 + CalculateVat();
        }
    }
    
    }